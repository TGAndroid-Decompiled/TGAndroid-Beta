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
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.TopicsFragment;

public abstract class ForumUtilities {
    static SparseArray dialogForumDrawables = new SparseArray();
    static Drawable dialogGeneralIcon;

    public static String getMonoForumTitle(int i, long j, boolean z) {
        return getMonoForumTitle(i, MessagesController.getInstance(i).getChat(Long.valueOf(-j)), z);
    }

    public static String getMonoForumTitle(int i, TLRPC.Chat chat) {
        return getMonoForumTitle(i, chat, false);
    }

    public static String getMonoForumTitle(int i, TLRPC.Chat chat, boolean z) {
        if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                return z ? chat2.title : LocaleController.formatString(R.string.MonoforumTitle, chat2.title);
            }
        } else if (chat != null && chat.linked_monoforum_id != 0) {
            return z ? chat.title : LocaleController.formatString(R.string.MonoforumTitle, chat.title);
        }
        if (chat != null) {
            return chat.title;
        }
        return null;
    }

    public static void setMonoForumAvatar(int i, TLRPC.Chat chat, AvatarDrawable avatarDrawable, BackupImageView backupImageView) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        avatarDrawable.setInfo(i, chat);
        backupImageView.setForUserOrChat(chat2, avatarDrawable);
    }

    public static void setMonoForumAvatar(int i, TLRPC.Chat chat, AvatarDrawable avatarDrawable, ImageReceiver imageReceiver) {
        TLRPC.Chat chat2 = ChatObject.isMonoForum(chat) ? MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id)) : null;
        if (chat2 != null) {
            chat = chat2;
        }
        avatarDrawable.setInfo(i, chat);
        imageReceiver.setForUserOrChat(chat2, avatarDrawable);
    }

    public static void setTopicIcon(BackupImageView backupImageView, TLRPC.TL_forumTopic tL_forumTopic) {
        setTopicIcon(backupImageView, tL_forumTopic, false, false, null);
    }

    public static void setTopicIcon(BackupImageView backupImageView, TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        if (tL_forumTopic == null || backupImageView == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            backupImageView.setAnimatedEmojiDrawable(null);
            backupImageView.setImageDrawable(createGeneralTopicDrawable(backupImageView.getContext(), 0.75f, Theme.getColor(Theme.key_actionBarDefaultIcon, resourcesProvider), false, z2));
            return;
        }
        if (tL_forumTopic.icon_emoji_id != 0) {
            backupImageView.setImageDrawable(null);
            AnimatedEmojiDrawable animatedEmojiDrawable = backupImageView.animatedEmojiDrawable;
            if (animatedEmojiDrawable == null || tL_forumTopic.icon_emoji_id != animatedEmojiDrawable.getDocumentId()) {
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(z2 ? 11 : 10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
                animatedEmojiDrawable2.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultTitle), PorterDuff.Mode.SRC_IN) : Theme.getAnimatedEmojiColorFilter(resourcesProvider));
                backupImageView.setAnimatedEmojiDrawable(animatedEmojiDrawable2);
                return;
            }
            return;
        }
        backupImageView.setAnimatedEmojiDrawable(null);
        backupImageView.setImageDrawable(createTopicDrawable(tL_forumTopic, false));
    }

    public static GeneralTopicDrawable createGeneralTopicDrawable(Context context, float f, int i, boolean z) {
        return createGeneralTopicDrawable(context, f, i, z, false);
    }

    public static GeneralTopicDrawable createGeneralTopicDrawable(Context context, float f, int i, boolean z, boolean z2) {
        if (context == null) {
            return null;
        }
        return new GeneralTopicDrawable(context, f, i, z, z2);
    }

    public static void filterMessagesByTopic(long j, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (j != MessageObject.getTopicId(((MessageObject) arrayList.get(i)).currentAccount, ((MessageObject) arrayList.get(i)).messageOwner, true)) {
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

        public GeneralTopicDrawable(Context context, float f, int i, boolean z, boolean z2) {
            if (z) {
                if (ForumUtilities.dialogGeneralIcon == null) {
                    ForumUtilities.dialogGeneralIcon = context.getResources().getDrawable(z2 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
                }
                this.icon = ForumUtilities.dialogGeneralIcon;
            } else {
                this.icon = context.getResources().getDrawable(z2 ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
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

    public static Drawable createTopicDrawable(TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (tL_forumTopic == null) {
            return null;
        }
        return createTopicDrawable(tL_forumTopic.title, tL_forumTopic.icon_color, z);
    }

    public static Drawable createTopicDrawable(String str, int i, boolean z) {
        Drawable forumBubbleDrawable;
        if (z) {
            forumBubbleDrawable = (Drawable) dialogForumDrawables.get(i);
            if (forumBubbleDrawable == null) {
                forumBubbleDrawable = new ForumBubbleDrawable(i);
                dialogForumDrawables.put(i, forumBubbleDrawable);
            }
        } else {
            forumBubbleDrawable = new ForumBubbleDrawable(i);
        }
        LetterDrawable letterDrawable = new LetterDrawable(null, 1);
        String strTrim = str.trim();
        letterDrawable.setTitle(strTrim.length() >= 1 ? strTrim.substring(0, 1).toUpperCase() : "");
        CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
        combinedDrawable.setFullsize(true);
        return combinedDrawable;
    }

    public static void openTopic(BaseFragment baseFragment, long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        ChatActivity chatActivityForTopic = getChatActivityForTopic(baseFragment, j, tL_forumTopic, i, new Bundle());
        if (chatActivityForTopic != null) {
            baseFragment.presentFragment(chatActivityForTopic);
        }
    }

    public static ChatActivity getChatActivityForTopic(BaseFragment baseFragment, long j, TLRPC.TL_forumTopic tL_forumTopic, int i, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (baseFragment == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat chat = baseFragment.getMessagesController().getChat(Long.valueOf(j));
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putLong("chat_id", j);
        if (i != 0) {
            bundle.putInt("message_id", i);
        } else if (tL_forumTopic.read_inbox_max_id == 0) {
            bundle.putInt("message_id", tL_forumTopic.id);
        }
        bundle.putInt("unread_count", tL_forumTopic.unread_count);
        bundle.putBoolean("historyPreloaded", false);
        ChatActivity chatActivity = new ChatActivity(bundle);
        TLRPC.Message message = tL_forumTopic.topicStartMessage;
        if (message != null || (tL_forumTopicFindTopic = baseFragment.getMessagesController().getTopicsController().findTopic(j, tL_forumTopic.id)) == null) {
            tL_forumTopic2 = tL_forumTopic;
        } else {
            message = tL_forumTopicFindTopic.topicStartMessage;
            tL_forumTopic2 = tL_forumTopicFindTopic;
        }
        if (message == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MessageObject(baseFragment.getCurrentAccount(), message, false, false));
        chatActivity.setThreadMessages(arrayList, chat, tL_forumTopic2.id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i != 0) {
            chatActivity.highlightMessageId = i;
        }
        return chatActivity;
    }

    public static CharSequence getTopicSpannedName(TLRPC.ForumTopic forumTopic, Paint paint, boolean z) {
        return getTopicSpannedName(forumTopic, paint, null, z);
    }

    public static CharSequence getTopicSpannedName(TLRPC.ForumTopic forumTopic, Paint paint, Drawable[] drawableArr, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (forumTopic instanceof TLRPC.TL_forumTopic) {
            TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
            if (tL_forumTopic.id == 1) {
                try {
                    GeneralTopicDrawable generalTopicDrawableCreateGeneralTopicDrawable = createGeneralTopicDrawable(ApplicationLoader.applicationContext, 1.0f, paint == null ? Theme.getColor(Theme.key_chat_inMenu) : paint.getColor(), z);
                    generalTopicDrawableCreateGeneralTopicDrawable.setBounds(0, 0, paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize(), paint == null ? AndroidUtilities.dp(14.0f) : (int) paint.getTextSize());
                    spannableStringBuilder.append((CharSequence) " ");
                    if (drawableArr != null) {
                        drawableArr[0] = generalTopicDrawableCreateGeneralTopicDrawable;
                    }
                    spannableStringBuilder.setSpan(new ImageSpan(generalTopicDrawableCreateGeneralTopicDrawable, 2), 0, 1, 33);
                } catch (Exception unused) {
                }
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) " ");
                AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(tL_forumTopic.icon_emoji_id, 0.95f, paint == null ? null : paint.getFontMetricsInt());
                spannableStringBuilder.setSpan(animatedEmojiSpan, 0, 1, 33);
                animatedEmojiSpan.top = true;
                animatedEmojiSpan.cacheType = 13;
            } else {
                spannableStringBuilder.append((CharSequence) " ");
                Drawable drawableCreateTopicDrawable = createTopicDrawable(tL_forumTopic, z);
                if (drawableArr != null) {
                    drawableArr[0] = ((CombinedDrawable) drawableCreateTopicDrawable).getBackgroundDrawable();
                }
                drawableCreateTopicDrawable.setBounds(0, 0, (int) (drawableCreateTopicDrawable.getIntrinsicWidth() * 0.65f), (int) (drawableCreateTopicDrawable.getIntrinsicHeight() * 0.65f));
                if (drawableCreateTopicDrawable instanceof CombinedDrawable) {
                    CombinedDrawable combinedDrawable = (CombinedDrawable) drawableCreateTopicDrawable;
                    if (combinedDrawable.getIcon() instanceof LetterDrawable) {
                        ((LetterDrawable) combinedDrawable.getIcon()).scale = 0.7f;
                    }
                }
                if (paint != null) {
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(drawableCreateTopicDrawable);
                    coloredImageSpan.setSize((int) (Math.abs(paint.getFontMetrics().descent) + Math.abs(paint.getFontMetrics().ascent)));
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                } else {
                    spannableStringBuilder.setSpan(new ImageSpan(drawableCreateTopicDrawable), 0, 1, 33);
                }
            }
            if (!TextUtils.isEmpty(tL_forumTopic.title)) {
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
            }
            return spannableStringBuilder;
        }
        return "DELETED";
    }

    public static void applyTopic(ChatActivity chatActivity, MessagesStorage.TopicKey topicKey) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (topicKey.topicId == 0 || (tL_forumTopicFindTopic = chatActivity.getMessagesController().getTopicsController().findTopic(-topicKey.dialogId, topicKey.topicId)) == null) {
            return;
        }
        if (topicKey.dialogId > 0) {
            if (UserObject.isBotForum(chatActivity.getMessagesController().getUser(Long.valueOf(topicKey.dialogId)))) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MessageObject(chatActivity.getCurrentAccount(), tL_forumTopicFindTopic.topicStartMessage, false, false));
                chatActivity.setThreadMessages(arrayList, null, tL_forumTopicFindTopic.id, tL_forumTopicFindTopic.read_inbox_max_id, tL_forumTopicFindTopic.read_outbox_max_id, tL_forumTopicFindTopic);
                chatActivity.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
                return;
            }
            return;
        }
        TLRPC.Chat chat = chatActivity.getMessagesController().getChat(Long.valueOf(-topicKey.dialogId));
        if (chat == null) {
            return;
        }
        if (ChatObject.isMonoForum(chat)) {
            if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
                chatActivity.setMonoForumThreadMessages(tL_forumTopicFindTopic.read_inbox_max_id, tL_forumTopicFindTopic.read_outbox_max_id, tL_forumTopicFindTopic);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MessageObject(chatActivity.getCurrentAccount(), tL_forumTopicFindTopic.topicStartMessage, false, false));
            chatActivity.setThreadMessages(arrayList2, chat, tL_forumTopicFindTopic.id, tL_forumTopicFindTopic.read_inbox_max_id, tL_forumTopicFindTopic.read_outbox_max_id, tL_forumTopicFindTopic);
        }
        chatActivity.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
    }

    public static CharSequence createActionTextWithTopic(TLRPC.TL_forumTopic tL_forumTopic, MessageObject messageObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        String name;
        if (tL_forumTopic == null) {
            return null;
        }
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
            return AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), getTopicSpannedName(tL_forumTopic, null, false));
        }
        if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
            long fromChatId = messageObject.getFromChatId();
            if (DialogObject.isUserDialog(fromChatId)) {
                user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                chat = null;
            } else {
                chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                user = null;
            }
            if (user != null) {
                name = ContactsController.formatName(user.first_name, user.last_name);
            } else {
                name = chat != null ? chat.title : null;
            }
            int i = tL_messageActionTopicEdit.flags;
            if ((i & 8) != 0) {
                return AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(tL_messageActionTopicEdit.hidden ? R.string.TopicHidden2 : R.string.TopicShown2), name);
            }
            if ((i & 4) != 0) {
                return AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), getTopicSpannedName(tL_forumTopic, null, false)), name);
            }
            int i2 = i & 1;
            if (i2 != 0 && (i & 2) != 0) {
                TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                return AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), getTopicSpannedName(tL_forumTopic2, null, false)), name);
            }
            if (i2 != 0) {
                return AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tL_messageActionTopicEdit.title), name);
            }
            if ((i & 2) != 0) {
                TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                tL_forumTopic3.title = "";
                return AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), getTopicSpannedName(tL_forumTopic3, null, false)), name);
            }
        }
        return null;
    }

    public static boolean isTopicCreateMessage(MessageObject messageObject) {
        return messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate);
    }

    public static void applyTopicToMessage(MessageObject messageObject) {
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (messageObject.getDialogId() <= 0 && (tL_forumTopicFindTopic = MessagesController.getInstance(messageObject.currentAccount).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(messageObject.currentAccount, messageObject.messageOwner, true))) != null) {
            Drawable drawable = messageObject.topicIconDrawable[0];
            if (drawable instanceof ForumBubbleDrawable) {
                ((ForumBubbleDrawable) drawable).setColor(tL_forumTopicFindTopic.icon_color);
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
                            ForumUtilities.m2361$r8$lambda$UvVVsxZYltUoPSD6n9UdoutH7g(chatActivity);
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
                        ForumUtilities.m2360$r8$lambda$4eqg6ncDIbyd5NC7XptnRU1QEc(topicsFragment);
                    }
                }, 500L);
            } else {
                topicsFragment.switchToChat(true);
            }
        }
    }

    public static void m2361$r8$lambda$UvVVsxZYltUoPSD6n9UdoutH7g(ChatActivity chatActivity) {
        if (chatActivity.getParentLayout() != null) {
            TopicsFragment.prepareToSwitchAnimation(chatActivity);
        }
    }

    public static void m2360$r8$lambda$4eqg6ncDIbyd5NC7XptnRU1QEc(TopicsFragment topicsFragment) {
        if (topicsFragment.getParentLayout() != null) {
            topicsFragment.switchToChat(true);
        }
    }

    public static int monoForumTopicIdToTopicId(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    public static ArrayList monoForumTopicToTopic(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.savedDialog saveddialog = (TLRPC.savedDialog) obj;
            if (saveddialog instanceof TLRPC.TL_monoForumDialog) {
                arrayList2.add(monoForumTopicToTopic((TLRPC.TL_monoForumDialog) saveddialog));
            }
        }
        return arrayList2;
    }

    public static TLRPC.TL_forumTopic monoForumTopicToTopic(TLRPC.TL_monoForumDialog tL_monoForumDialog) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_monoForumDialog.peer);
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.id = monoForumTopicIdToTopicId(peerDialogId);
        tL_forumTopic.title = Long.toString(peerDialogId);
        tL_forumTopic.top_message = tL_monoForumDialog.top_message;
        tL_forumTopic.read_inbox_max_id = tL_monoForumDialog.read_inbox_max_id;
        tL_forumTopic.read_outbox_max_id = tL_monoForumDialog.read_outbox_max_id;
        tL_forumTopic.unread_reactions_count = tL_monoForumDialog.unread_reactions_count;
        tL_forumTopic.unread_count = tL_monoForumDialog.unread_count;
        tL_forumTopic.draft = tL_monoForumDialog.draft;
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.from_id = tL_monoForumDialog.peer;
        tL_forumTopic.nopaid_messages_exception = tL_monoForumDialog.nopaid_messages_exception;
        return tL_forumTopic;
    }
}
