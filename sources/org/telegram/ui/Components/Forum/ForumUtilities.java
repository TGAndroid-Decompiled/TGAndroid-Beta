package org.telegram.ui.Components.Forum;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$26$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda8;

public abstract class ForumUtilities {
    public static final int $r8$clinit = 0;

    public final class GeneralTopicDrawable extends Drawable {
        public int color;
        public final Drawable icon;
        public final float scale;

        public GeneralTopicDrawable(Context context, float f, int i, boolean z) {
            this.icon = context.getResources().getDrawable(z ? R.drawable.msg_filled_general_large : R.drawable.msg_filled_general).mutate();
            this.scale = f;
            setColor(i);
        }

        @Override
        public final void draw(Canvas canvas) {
            Rect bounds = getBounds();
            Drawable drawable = this.icon;
            float f = this.scale;
            if (f == 1.0f) {
                drawable.setBounds(bounds);
            } else {
                drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f)), (int) (((bounds.width() / 2.0f) * f) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f) + bounds.centerY()));
            }
            drawable.draw(canvas);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            this.icon.setAlpha(i);
        }

        public final void setColor(int i) {
            if (this.color != i) {
                this.color = i;
                this.icon.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.icon.setColorFilter(colorFilter);
        }
    }

    static {
        new SparseArray();
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
        if (!ChatObject.isMonoForum(chat)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MessageObject(chatActivity.getCurrentAccount(), tL_forumTopicFindTopic.topicStartMessage, false, false));
            chatActivity.setThreadMessages(arrayList2, chat, tL_forumTopicFindTopic.id, tL_forumTopicFindTopic.read_inbox_max_id, tL_forumTopicFindTopic.read_outbox_max_id, tL_forumTopicFindTopic);
        } else if (ChatObject.canManageMonoForum(UserConfig.selectedAccount, chat)) {
            int i = tL_forumTopicFindTopic.read_inbox_max_id;
            int i2 = tL_forumTopicFindTopic.read_outbox_max_id;
            chatActivity.threadMaxInboxReadId = i;
            chatActivity.threadMaxOutboxReadId = i2;
            chatActivity.replyMaxReadId = Math.max(1, i);
            chatActivity.threadMessageId = DialogObject.getPeerDialogId(tL_forumTopicFindTopic.from_id);
            chatActivity.updatePinnedTopicStarterMessage();
            chatActivity.updateTopPanel(false);
            chatActivity.updateBottomOverlay(false);
        }
        chatActivity.getMessagesController().setForumLastTopicId(-topicKey.dialogId, topicKey.topicId);
    }

    public static GeneralTopicDrawable createGeneralTopicDrawable(Context context, float f, int i, boolean z) {
        if (context == null) {
            return null;
        }
        return new GeneralTopicDrawable(context, f, i, z);
    }

    public static CombinedDrawable createTopicDrawable(TLRPC.TL_forumTopic tL_forumTopic) {
        if (tL_forumTopic == null) {
            return null;
        }
        return createTopicDrawable(tL_forumTopic.icon_color, tL_forumTopic.title);
    }

    public static ChatActivity getChatActivityForTopic(BaseFragment baseFragment, long j, TLRPC.TL_forumTopic tL_forumTopic, int i, Bundle bundle) {
        TLRPC.TL_forumTopic tL_forumTopic2;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (baseFragment == null || tL_forumTopic == null) {
            return null;
        }
        TLRPC.Chat chat = baseFragment.getMessagesController().getChat(Long.valueOf(j));
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

    public static String getMonoForumTitle(int i, long j) {
        return getMonoForumTitle(MessagesController.getInstance(i).getChat(Long.valueOf(-j)), i, true);
    }

    public static CharSequence getTopicSpannedName(TLRPC.ForumTopic forumTopic, TextPaint textPaint, Drawable[] drawableArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!(forumTopic instanceof TLRPC.TL_forumTopic)) {
            return "DELETED";
        }
        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) forumTopic;
        if (tL_forumTopic.id == 1) {
            try {
                GeneralTopicDrawable generalTopicDrawableCreateGeneralTopicDrawable = createGeneralTopicDrawable(ApplicationLoader.applicationContext, 1.0f, textPaint == null ? Theme.getColor(null, Theme.key_chat_inMenu, false) : textPaint.getColor(), false);
                generalTopicDrawableCreateGeneralTopicDrawable.setBounds(0, 0, textPaint == null ? AndroidUtilities.dp(14.0f) : (int) textPaint.getTextSize(), textPaint == null ? AndroidUtilities.dp(14.0f) : (int) textPaint.getTextSize());
                spannableStringBuilder.append((CharSequence) " ");
                if (drawableArr != null) {
                    drawableArr[0] = generalTopicDrawableCreateGeneralTopicDrawable;
                }
                spannableStringBuilder.setSpan(new ImageSpan(generalTopicDrawableCreateGeneralTopicDrawable, 2), 0, 1, 33);
            } catch (Exception unused) {
            }
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(tL_forumTopic.icon_emoji_id, 0.95f, textPaint != null ? textPaint.getFontMetricsInt() : null);
            spannableStringBuilder.setSpan(animatedEmojiSpan, 0, 1, 33);
            animatedEmojiSpan.top = true;
            animatedEmojiSpan.cacheType = 13;
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            CombinedDrawable combinedDrawableCreateTopicDrawable = createTopicDrawable(tL_forumTopic);
            if (drawableArr != null) {
                drawableArr[0] = combinedDrawableCreateTopicDrawable.background;
            }
            combinedDrawableCreateTopicDrawable.setBounds(0, 0, (int) (combinedDrawableCreateTopicDrawable.getIntrinsicWidth() * 0.65f), (int) (combinedDrawableCreateTopicDrawable.getIntrinsicHeight() * 0.65f));
            Drawable drawable = combinedDrawableCreateTopicDrawable.icon;
            if (drawable instanceof LetterDrawable) {
                ((LetterDrawable) drawable).scale = 0.7f;
            }
            if (textPaint != null) {
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(0, combinedDrawableCreateTopicDrawable);
                coloredImageSpan.setSize((int) (Math.abs(textPaint.getFontMetrics().ascent) + Math.abs(textPaint.getFontMetrics().descent)));
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
            } else {
                spannableStringBuilder.setSpan(new ImageSpan(combinedDrawableCreateTopicDrawable), 0, 1, 33);
            }
        }
        if (!TextUtils.isEmpty(tL_forumTopic.title)) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        return spannableStringBuilder;
    }

    public static boolean isTopicCreateMessage(MessageObject messageObject) {
        return messageObject != null && (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionTopicCreate);
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
                TLRPC.TL_monoForumDialog tL_monoForumDialog = (TLRPC.TL_monoForumDialog) saveddialog;
                long peerDialogId = DialogObject.getPeerDialogId(tL_monoForumDialog.peer);
                TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                tL_forumTopic.id = (int) ((peerDialogId >>> 32) ^ peerDialogId);
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
                arrayList2.add(tL_forumTopic);
            }
        }
        return arrayList2;
    }

    public static void openTopic(BaseFragment baseFragment, long j, TLRPC.TL_forumTopic tL_forumTopic, int i) {
        ChatActivity chatActivityForTopic = getChatActivityForTopic(baseFragment, j, tL_forumTopic, i, new Bundle());
        if (chatActivityForTopic != null) {
            baseFragment.presentFragment(chatActivityForTopic);
        }
    }

    public static void setTopicIcon(BackupImageView backupImageView, TLRPC.TL_forumTopic tL_forumTopic, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        ColorFilter animatedEmojiColorFilter;
        if (tL_forumTopic == null || backupImageView == null) {
            return;
        }
        if (tL_forumTopic.id == 1) {
            backupImageView.setAnimatedEmojiDrawable(null);
            backupImageView.setImageDrawable(createGeneralTopicDrawable(backupImageView.getContext(), 0.75f, Theme.getColor(Theme.key_actionBarDefaultIcon, resourcesProvider), z2));
            return;
        }
        if (tL_forumTopic.icon_emoji_id == 0) {
            backupImageView.setAnimatedEmojiDrawable(null);
            backupImageView.setImageDrawable(createTopicDrawable(tL_forumTopic));
            return;
        }
        backupImageView.setImageDrawable(null);
        AnimatedEmojiDrawable animatedEmojiDrawable = backupImageView.animatedEmojiDrawable;
        if (animatedEmojiDrawable == null || tL_forumTopic.icon_emoji_id != animatedEmojiDrawable.getDocumentId()) {
            AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(z2 ? 11 : 10, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id);
            if (z) {
                animatedEmojiColorFilter = new PorterDuffColorFilter(Theme.getColor(null, Theme.key_actionBarDefaultTitle, false), PorterDuff.Mode.SRC_IN);
            } else if (resourcesProvider != null) {
                int i = Theme.default_shadow_color;
                animatedEmojiColorFilter = resourcesProvider.getAnimatedEmojiColorFilter();
            } else {
                animatedEmojiColorFilter = Theme.chat_animatedEmojiTextColorFilter;
            }
            animatedEmojiDrawable2.setColorFilter(animatedEmojiColorFilter);
            backupImageView.setAnimatedEmojiDrawable(animatedEmojiDrawable2);
        }
    }

    public static void switchAllFragmentsInStackToForum(long j, ActionBarLayout actionBarLayout) {
        BaseFragment lastFragment = actionBarLayout.getLastFragment();
        if (lastFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) lastFragment;
            if ((-chatActivity.getDialogId()) == j && chatActivity.getMessagesController().getChat(Long.valueOf(j)).forum && chatActivity.getParentLayout() != null) {
                if (((ActionBarLayout) chatActivity.getParentLayout()).checkTransitionAnimation()) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$26$$ExternalSyntheticLambda2(chatActivity, 10), 500L);
                } else {
                    TopicsFragment.prepareToSwitchAnimation(chatActivity);
                }
            }
        }
        if (lastFragment instanceof TopicsFragment) {
            TopicsFragment topicsFragment = (TopicsFragment) lastFragment;
            if ((-(-topicsFragment.chatId)) != j || topicsFragment.getMessagesController().getChat(Long.valueOf(j)).forum) {
                return;
            }
            if (topicsFragment.getParentLayout() != null && ((ActionBarLayout) topicsFragment.getParentLayout()).checkTransitionAnimation()) {
                AndroidUtilities.runOnUIThread(new TopicsFragment$$ExternalSyntheticLambda8(topicsFragment, 1), 500L);
                return;
            }
            topicsFragment.removeFragmentOnTransitionEnd = true;
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", topicsFragment.chatId);
            ChatActivity chatActivity2 = new ChatActivity(bundle);
            chatActivity2.switchFromTopics = true;
            topicsFragment.presentFragment(chatActivity2);
        }
    }

    public static CombinedDrawable createTopicDrawable(int i, String str) {
        ForumBubbleDrawable forumBubbleDrawable = new ForumBubbleDrawable(i);
        LetterDrawable letterDrawable = new LetterDrawable(1, null);
        String strTrim = str.trim();
        letterDrawable.setTitle(strTrim.length() >= 1 ? strTrim.substring(0, 1).toUpperCase() : "");
        CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
        combinedDrawable.fullSize = true;
        return combinedDrawable;
    }

    public static String getMonoForumTitle(TLRPC.Chat chat, int i, boolean z) {
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
}
