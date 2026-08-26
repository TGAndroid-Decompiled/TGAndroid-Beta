package org.telegram.ui.iv;

public final class RichEditText$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final RichEditText f$0;

    public RichEditText$$ExternalSyntheticLambda2(RichEditText richEditText, int i) {
        this.$r8$classId = i;
        this.f$0 = richEditText;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RichEditText richEditText = this.f$0;
                RichInlineButtonSpan richInlineButtonSpan = richEditText.pressedInlineButton;
                if (richInlineButtonSpan != null && richEditText.inlineButtonClickListener != null) {
                    richEditText.inlineButtonLongPressed = true;
                    richInlineButtonSpan.ensureRenderer().setPressed(false);
                    try {
                        richEditText.performHapticFeedback(0);
                        break;
                    } catch (Exception unused) {
                    }
                    ((RichEditorListView$$ExternalSyntheticLambda37) richEditText.inlineButtonClickListener).onInlineButtonClick(richEditText, richEditText.pressedInlineButton, true);
                    break;
                }
                break;
            case 1:
                this.f$0.finishActionMode();
                break;
            default:
                this.f$0.requestEditFocusRebuild();
                break;
        }
    }
}
