package org.telegram.ui.Components.Reactions;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;

public final class ChatCustomReactionsEditActivity$$ExternalSyntheticLambda5 implements Utilities.Callback {
    public final int $r8$classId;
    public final ChatCustomReactionsEditActivity f$0;

    public ChatCustomReactionsEditActivity$$ExternalSyntheticLambda5(ChatCustomReactionsEditActivity chatCustomReactionsEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatCustomReactionsEditActivity;
    }

    @Override
    public final void run(Object obj) {
        TextCheckCell textCheckCell;
        switch (this.$r8$classId) {
            case 0:
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity = this.f$0;
                chatCustomReactionsEditActivity.getClass();
                chatCustomReactionsEditActivity.reactionsCount = ((Integer) obj).intValue();
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity2 = this.f$0;
                if (!chatCustomReactionsEditActivity2.isFinishing()) {
                    chatCustomReactionsEditActivity2.actionButton.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        chatCustomReactionsEditActivity2.finishFragment();
                    } else {
                        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(7, chatCustomReactionsEditActivity2, tL_error), chatCustomReactionsEditActivity2.boostsStatus == null ? 200L : 0L);
                    }
                    break;
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity3 = this.f$0;
                if (!chatCustomReactionsEditActivity3.deleteSelectedEmojis()) {
                    int editTextSelectionEnd = chatCustomReactionsEditActivity3.editText.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(chatCustomReactionsEditActivity3.editText.getText());
                    for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)) {
                        if (spannableStringBuilder.getSpanEnd(animatedEmojiSpan) == editTextSelectionEnd) {
                            chatCustomReactionsEditActivity3.selectedEmojisMap.remove(Long.valueOf(animatedEmojiSpan.documentId));
                            chatCustomReactionsEditActivity3.selectedEmojisIds.remove(Long.valueOf(animatedEmojiSpan.documentId));
                            chatCustomReactionsEditActivity3.selectAnimatedEmojiDialog.unselect(Long.valueOf(animatedEmojiSpan.documentId));
                            if (animatedEmojiSpan.documentId == -1 && (textCheckCell = chatCustomReactionsEditActivity3.paidCheckCell) != null) {
                                textCheckCell.setChecked(false);
                                chatCustomReactionsEditActivity3.editText.setMaxLength(chatCustomReactionsEditActivity3.maxReactionsCount);
                            }
                            if (bool.booleanValue()) {
                                chatCustomReactionsEditActivity3.editText.dispatchKeyEvent(new KeyEvent(0, 67));
                                ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3 chatCustomReactionsEditActivity$$ExternalSyntheticLambda3 = chatCustomReactionsEditActivity3.checkAfterFastDeleteRunnable;
                                AndroidUtilities.cancelRunOnUIThread(chatCustomReactionsEditActivity$$ExternalSyntheticLambda3);
                                AndroidUtilities.runOnUIThread(chatCustomReactionsEditActivity$$ExternalSyntheticLambda3, 350L);
                            } else {
                                animatedEmojiSpan.setRemoved(new ChatActivity$$ExternalSyntheticLambda17(chatCustomReactionsEditActivity3, animatedEmojiSpan, editTextSelectionEnd, 28));
                                chatCustomReactionsEditActivity3.animateChangesInNextRows(animatedEmojiSpan);
                                chatCustomReactionsEditActivity3.checkMaxCustomReactions(false);
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
        }
    }
}
