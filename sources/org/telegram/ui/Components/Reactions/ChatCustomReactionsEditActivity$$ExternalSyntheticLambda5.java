package org.telegram.ui.Components.Reactions;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda26;
import org.telegram.ui.iv.RichTextCell$2$$ExternalSyntheticLambda1;

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
                Boolean bool = (Boolean) obj;
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity2 = this.f$0;
                if (!chatCustomReactionsEditActivity2.deleteSelectedEmojis()) {
                    int editTextSelectionEnd = chatCustomReactionsEditActivity2.editText.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(chatCustomReactionsEditActivity2.editText.getText());
                    for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnimatedEmojiSpan.class)) {
                        if (spannableStringBuilder.getSpanEnd(animatedEmojiSpan) == editTextSelectionEnd) {
                            chatCustomReactionsEditActivity2.selectedEmojisMap.remove(Long.valueOf(animatedEmojiSpan.documentId));
                            chatCustomReactionsEditActivity2.selectedEmojisIds.remove(Long.valueOf(animatedEmojiSpan.documentId));
                            chatCustomReactionsEditActivity2.selectAnimatedEmojiDialog.unselect(Long.valueOf(animatedEmojiSpan.documentId));
                            if (animatedEmojiSpan.documentId == -1 && (textCheckCell = chatCustomReactionsEditActivity2.paidCheckCell) != null) {
                                textCheckCell.setChecked(false);
                                chatCustomReactionsEditActivity2.editText.setMaxLength(chatCustomReactionsEditActivity2.maxReactionsCount);
                            }
                            if (bool.booleanValue()) {
                                chatCustomReactionsEditActivity2.editText.dispatchKeyEvent(new KeyEvent(0, 67));
                                ChatCustomReactionsEditActivity$$ExternalSyntheticLambda3 chatCustomReactionsEditActivity$$ExternalSyntheticLambda3 = chatCustomReactionsEditActivity2.checkAfterFastDeleteRunnable;
                                AndroidUtilities.cancelRunOnUIThread(chatCustomReactionsEditActivity$$ExternalSyntheticLambda3);
                                AndroidUtilities.runOnUIThread(chatCustomReactionsEditActivity$$ExternalSyntheticLambda3, 350L);
                            } else {
                                animatedEmojiSpan.setRemoved(new RichTextCell$2$$ExternalSyntheticLambda1(chatCustomReactionsEditActivity2, animatedEmojiSpan, editTextSelectionEnd, 10));
                                chatCustomReactionsEditActivity2.animateChangesInNextRows(animatedEmojiSpan);
                                chatCustomReactionsEditActivity2.checkMaxCustomReactions(false);
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ChatCustomReactionsEditActivity chatCustomReactionsEditActivity3 = this.f$0;
                if (!chatCustomReactionsEditActivity3.isFinishing()) {
                    chatCustomReactionsEditActivity3.actionButton.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        chatCustomReactionsEditActivity3.finishFragment();
                    } else {
                        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda26(11, chatCustomReactionsEditActivity3, tL_error), chatCustomReactionsEditActivity3.boostsStatus == null ? 200L : 0L);
                    }
                    break;
                }
                break;
        }
    }
}
