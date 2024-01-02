package org.telegram.ui.Components.Forum;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ForumTopic;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_messageActionTopicCreate;
import org.telegram.tgnet.TLRPC$TL_messageActionTopicEdit;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.TopicsFragment;
public class ForumUtilities {
    static SparseArray<Drawable> dialogForumDrawables = new SparseArray<>();
    static Drawable dialogGeneralIcon;

    public static void setTopicIcon(BackupImageView backupImageView, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
        setTopicIcon(backupImageView, tLRPC$TL_forumTopic, false, false, null);
    }

    public static void setTopicIcon(BackupImageView backupImageView, TLRPC$TL_forumTopic tLRPC$TL_forumTopic, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        if (tLRPC$TL_forumTopic == null || backupImageView == null) {
            return;
        }
        if (tLRPC$TL_forumTopic.id == 1) {
            backupImageView.setAnimatedEmojiDrawable(null);
            backupImageView.setImageDrawable(createGeneralTopicDrawable(backupImageView.getContext(), 0.75f, Theme.getColor(Theme.key_actionBarDefaultIcon, resourcesProvider), false));
        } else if (tLRPC$TL_forumTopic.icon_emoji_id != 0) {
            backupImageView.setImageDrawable(null);
            AnimatedEmojiDrawable animatedEmojiDrawable = backupImageView.animatedEmojiDrawable;
            if (animatedEmojiDrawable == null || tLRPC$TL_forumTopic.icon_emoji_id != animatedEmojiDrawable.getDocumentId()) {
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(z2 ? 11 : 10, UserConfig.selectedAccount, tLRPC$TL_forumTopic.icon_emoji_id);
                animatedEmojiDrawable2.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultTitle), PorterDuff.Mode.SRC_IN) : Theme.getAnimatedEmojiColorFilter(resourcesProvider));
                backupImageView.setAnimatedEmojiDrawable(animatedEmojiDrawable2);
            }
        } else {
            backupImageView.setAnimatedEmojiDrawable(null);
            backupImageView.setImageDrawable(createTopicDrawable(tLRPC$TL_forumTopic, false));
        }
    }

    public static GeneralTopicDrawable createGeneralTopicDrawable(Context context, float f, int i, boolean z) {
        if (context == null) {
            return null;
        }
        return new GeneralTopicDrawable(context, f, i, z);
    }

    public static void filterMessagesByTopic(long j, ArrayList<MessageObject> arrayList) {
        if (arrayList == null) {
            return;
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (j != MessageObject.getTopicId(arrayList.get(i).currentAccount, arrayList.get(i).messageOwner, true)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public static class GeneralTopicDrawable extends Drawable {
        int color;
        Drawable icon;
        float scale;

        @Override
        public int getOpacity() {
            return -2;
        }

        public GeneralTopicDrawable(Context context, float f, int i, boolean z) {
            if (z) {
                if (ForumUtilities.dialogGeneralIcon == null) {
                    ForumUtilities.dialogGeneralIcon = context.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
                }
                this.icon = ForumUtilities.dialogGeneralIcon;
            } else {
                this.icon = context.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
            }
            this.scale = f;
            setColor(i);
        }

        @Override
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            if (this.scale == 1.0f) {
                this.icon.setBounds(bounds);
            } else {
                this.icon.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * this.scale)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * this.scale)), (int) (bounds.centerX() + ((bounds.width() / 2.0f) * this.scale)), (int) (bounds.centerY() + ((bounds.height() / 2.0f) * this.scale)));
            }
            this.icon.draw(canvas);
        }

        public void setColor(int i) {
            if (this.color != i) {
                this.color = i;
                setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            }
        }

        @Override
        public void setAlpha(int i) {
            this.icon.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.icon.setColorFilter(colorFilter);
        }
    }

    public static Drawable createTopicDrawable(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, boolean z) {
        if (tLRPC$TL_forumTopic == null) {
            return null;
        }
        return createTopicDrawable(tLRPC$TL_forumTopic.title, tLRPC$TL_forumTopic.icon_color, z);
    }

    public static Drawable createTopicDrawable(String str, int i, boolean z) {
        Drawable forumBubbleDrawable;
        if (z) {
            forumBubbleDrawable = dialogForumDrawables.get(i);
            if (forumBubbleDrawable == null) {
                forumBubbleDrawable = new ForumBubbleDrawable(i);
                dialogForumDrawables.put(i, forumBubbleDrawable);
            }
        } else {
            forumBubbleDrawable = new ForumBubbleDrawable(i);
        }
        LetterDrawable letterDrawable = new LetterDrawable(null, 1);
        String trim = str.trim();
        letterDrawable.setTitle(trim.length() >= 1 ? trim.substring(0, 1).toUpperCase() : "");
        CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
        combinedDrawable.setFullsize(true);
        return combinedDrawable;
    }

    public static Drawable createSmallTopicDrawable(String str, int i) {
        ForumBubbleDrawable forumBubbleDrawable = new ForumBubbleDrawable(i);
        LetterDrawable letterDrawable = new LetterDrawable(null, 2);
        String upperCase = str.trim().toUpperCase();
        letterDrawable.setTitle(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
        CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
        combinedDrawable.setFullsize(true);
        return combinedDrawable;
    }

    public static void openTopic(BaseFragment baseFragment, long j, TLRPC$TL_forumTopic tLRPC$TL_forumTopic, int i) {
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic2;
        TLRPC$TL_forumTopic findTopic;
        if (baseFragment == null || tLRPC$TL_forumTopic == null) {
            return;
        }
        TLRPC$Chat chat = baseFragment.getMessagesController().getChat(Long.valueOf(j));
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        if (i != 0) {
            bundle.putInt("message_id", i);
        } else if (tLRPC$TL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tLRPC$TL_forumTopic.id);
        }
        bundle.putInt("unread_count", tLRPC$TL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        ChatActivity chatActivity = new ChatActivity(bundle);
        TLRPC$Message tLRPC$Message = tLRPC$TL_forumTopic.topicStartMessage;
        if (tLRPC$Message != null || (findTopic = baseFragment.getMessagesController().getTopicsController().findTopic(j, tLRPC$TL_forumTopic.id)) == null) {
            tLRPC$TL_forumTopic2 = tLRPC$TL_forumTopic;
        } else {
            tLRPC$Message = findTopic.topicStartMessage;
            tLRPC$TL_forumTopic2 = findTopic;
        }
        if (tLRPC$Message == null) {
            return;
        }
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(new MessageObject(baseFragment.getCurrentAccount(), tLRPC$Message, false, false));
        chatActivity.setThreadMessages(arrayList, chat, tLRPC$TL_forumTopic2.id, tLRPC$TL_forumTopic2.read_inbox_max_id, tLRPC$TL_forumTopic2.read_outbox_max_id, tLRPC$TL_forumTopic2);
        if (i != 0) {
            chatActivity.highlightMessageId = i;
        }
        baseFragment.presentFragment(chatActivity);
    }

    public static CharSequence getTopicSpannedName(TLRPC$ForumTopic tLRPC$ForumTopic, Paint paint, boolean z) {
        return getTopicSpannedName(tLRPC$ForumTopic, paint, null, z);
    }

    public static CharSequence getTopicSpannedName(TLRPC$ForumTopic tLRPC$ForumTopic, Paint paint, Drawable[] drawableArr, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tLRPC$ForumTopic instanceof TLRPC$TL_forumTopic) {
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic = (TLRPC$TL_forumTopic) tLRPC$ForumTopic;
            if (tLRPC$TL_forumTopic.id == 1) {
                try {
                    GeneralTopicDrawable createGeneralTopicDrawable = createGeneralTopicDrawable(ApplicationLoader.applicationContext, 1.0f, paint == null ? Theme.getColor(Theme.key_chat_inMenu) : paint.getColor(), z);
                    createGeneralTopicDrawable.setBounds(0, 0, paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize(), paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize());
                    spannableStringBuilder.append((CharSequence) " ");
                    if (drawableArr != null) {
                        drawableArr[0] = createGeneralTopicDrawable;
                    }
                    spannableStringBuilder.setSpan(new ImageSpan(createGeneralTopicDrawable, 2), 0, 1, 33);
                } catch (Exception unused) {
                }
            } else if (tLRPC$TL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(tLRPC$TL_forumTopic.icon_emoji_id, 0.95f, paint == null ? null : paint.getFontMetricsInt());
                spannableStringBuilder.setSpan(animatedEmojiSpan, 0, 1, 33);
                animatedEmojiSpan.top = true;
                animatedEmojiSpan.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                Drawable createTopicDrawable = createTopicDrawable(tLRPC$TL_forumTopic, z);
                if (drawableArr != null) {
                    drawableArr[0] = ((CombinedDrawable) createTopicDrawable).getBackgroundDrawable();
                }
                createTopicDrawable.setBounds(0, 0, (int) (createTopicDrawable.getIntrinsicWidth() * 0.65f), (int) (createTopicDrawable.getIntrinsicHeight() * 0.65f));
                if (createTopicDrawable instanceof CombinedDrawable) {
                    CombinedDrawable combinedDrawable = (CombinedDrawable) createTopicDrawable;
                    if (combinedDrawable.getIcon() instanceof LetterDrawable) {
                        ((LetterDrawable) combinedDrawable.getIcon()).scale = 0.7f;
                    }
                }
                if (paint != null) {
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(createTopicDrawable);
                    coloredImageSpan.setSize((int) (Math.abs(paint.getFontMetrics().descent) + Math.abs(paint.getFontMetrics().ascent)));
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                } else {
                    spannableStringBuilder.setSpan(new ImageSpan(createTopicDrawable), 0, 1, 33);
                }
            }
            if (!TextUtils.isEmpty(tLRPC$TL_forumTopic.title)) {
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) tLRPC$TL_forumTopic.title);
            }
            return spannableStringBuilder;
        }
        return "DELETED";
    }

    public static void applyTopic(ChatActivity chatActivity, MessagesStorage.TopicKey topicKey) {
        TLRPC$TL_forumTopic findTopic;
        if (topicKey.topicId == 0 || (findTopic = chatActivity.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) == null) {
            return;
        }
        TLRPC$Chat chat = chatActivity.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        arrayList.add(new MessageObject(chatActivity.getCurrentAccount(), findTopic.topicStartMessage, false, false));
        chatActivity.setThreadMessages(arrayList, chat, findTopic.id, findTopic.read_inbox_max_id, findTopic.read_outbox_max_id, findTopic);
    }

    public static CharSequence createActionTextWithTopic(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, MessageObject messageObject) {
        TLRPC$Chat chat;
        TLRPC$User tLRPC$User;
        String str;
        if (tLRPC$TL_forumTopic == null) {
            return null;
        }
        TLRPC$MessageAction tLRPC$MessageAction = messageObject.messageOwner.action;
        if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionTopicCreate) {
            return AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), getTopicSpannedName(tLRPC$TL_forumTopic, null, false));
        }
        if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionTopicEdit) {
            TLRPC$TL_messageActionTopicEdit tLRPC$TL_messageActionTopicEdit = (TLRPC$TL_messageActionTopicEdit) tLRPC$MessageAction;
            long fromChatId = messageObject.getFromChatId();
            if (DialogObject.isUserDialog(fromChatId)) {
                tLRPC$User = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                chat = null;
            } else {
                chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                tLRPC$User = null;
            }
            if (tLRPC$User != null) {
                str = ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name);
            } else {
                str = chat != null ? chat.title : null;
            }
            int i = tLRPC$TL_messageActionTopicEdit.flags;
            if ((i & 8) != 0) {
                return AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(tLRPC$TL_messageActionTopicEdit.hidden ? R.string.TopicHidden2 : R.string.TopicShown2), str);
            } else if ((i & 4) != 0) {
                return AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tLRPC$TL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), getTopicSpannedName(tLRPC$TL_forumTopic, null, false)), str);
            } else if ((i & 1) != 0 && (i & 2) != 0) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = new TLRPC$TL_forumTopic();
                tLRPC$TL_forumTopic2.icon_emoji_id = tLRPC$TL_messageActionTopicEdit.icon_emoji_id;
                tLRPC$TL_forumTopic2.title = tLRPC$TL_messageActionTopicEdit.title;
                return AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), getTopicSpannedName(tLRPC$TL_forumTopic2, null, false)), str);
            } else if ((i & 1) != 0) {
                return AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tLRPC$TL_messageActionTopicEdit.title), str);
            } else {
                if ((i & 2) != 0) {
                    TLRPC$TL_forumTopic tLRPC$TL_forumTopic3 = new TLRPC$TL_forumTopic();
                    tLRPC$TL_forumTopic3.icon_emoji_id = tLRPC$TL_messageActionTopicEdit.icon_emoji_id;
                    tLRPC$TL_forumTopic3.title = "";
                    return AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), getTopicSpannedName(tLRPC$TL_forumTopic3, null, false)), str);
                }
            }
        }
        return null;
    }

    public static boolean isTopicCreateMessage(MessageObject messageObject) {
        return messageObject != null && (messageObject.messageOwner.action instanceof TLRPC$TL_messageActionTopicCreate);
    }

    public static void applyTopicToMessage(MessageObject messageObject) {
        TLRPC$TL_forumTopic findTopic;
        if (messageObject.getDialogId() <= 0 && (findTopic = MessagesController.getInstance(messageObject.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
            Drawable[] drawableArr = messageObject.topicIconDrawable;
            if (drawableArr[0] instanceof ForumBubbleDrawable) {
                ((ForumBubbleDrawable) drawableArr[0]).setColor(findTopic.icon_color);
            }
        }
    }

    public static void switchAllFragmentsInStackToForum(long j, INavigationLayout iNavigationLayout) {
        BaseFragment lastFragment = iNavigationLayout.getLastFragment();
        if (lastFragment instanceof ChatActivity) {
            final ChatActivity chatActivity = (ChatActivity) lastFragment;
            if ((-chatActivity.getDialogId()) == j && chatActivity.getMessagesController().getChat(Long.valueOf(j)).forum && chatActivity.getParentLayout() != null) {
                if (chatActivity.getParentLayout().checkTransitionAnimation()) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ForumUtilities.lambda$switchAllFragmentsInStackToForum$0(ChatActivity.this);
                        }
                    }, 500L);
                } else {
                    TopicsFragment.prepareToSwitchAnimation(chatActivity);
                }
            }
        }
        if (lastFragment instanceof TopicsFragment) {
            final TopicsFragment topicsFragment = (TopicsFragment) lastFragment;
            if ((-topicsFragment.getDialogId()) != j || topicsFragment.getMessagesController().getChat(Long.valueOf(j)).forum) {
                return;
            }
            if (topicsFragment.getParentLayout() != null && topicsFragment.getParentLayout().checkTransitionAnimation()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ForumUtilities.lambda$switchAllFragmentsInStackToForum$1(TopicsFragment.this);
                    }
                }, 500L);
            } else {
                topicsFragment.switchToChat(true);
            }
        }
    }

    public static void lambda$switchAllFragmentsInStackToForum$0(ChatActivity chatActivity) {
        if (chatActivity.getParentLayout() != null) {
            TopicsFragment.prepareToSwitchAnimation(chatActivity);
        }
    }

    public static void lambda$switchAllFragmentsInStackToForum$1(TopicsFragment topicsFragment) {
        if (topicsFragment.getParentLayout() != null) {
            topicsFragment.switchToChat(true);
        }
    }
}
