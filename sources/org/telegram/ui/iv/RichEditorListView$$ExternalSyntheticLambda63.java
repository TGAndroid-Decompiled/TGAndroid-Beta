package org.telegram.ui.iv;

public final class RichEditorListView$$ExternalSyntheticLambda63 implements Runnable {
    public final int $r8$classId;
    public final RichEditText f$0;
    public final int f$1;

    public RichEditorListView$$ExternalSyntheticLambda63(RichEditText richEditText, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = richEditText;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RichEditText richEditText = this.f$0;
                richEditText.requestEditFocus();
                richEditText.setSelection(Math.max(0, Math.min(this.f$1, richEditText.length())));
                break;
            case 1:
                RichEditText richEditText2 = this.f$0;
                richEditText2.requestEditFocus();
                richEditText2.setSelection(Math.max(0, Math.min(this.f$1, richEditText2.length())));
                break;
            case 2:
                RichEditText richEditText3 = this.f$0;
                richEditText3.requestEditFocus();
                richEditText3.setSelection(Math.max(0, Math.min(this.f$1, richEditText3.length())));
                break;
            case 3:
                RichEditText richEditText4 = this.f$0;
                richEditText4.requestEditFocus();
                richEditText4.setSelection(Math.min(this.f$1, richEditText4.length()));
                break;
            default:
                RichEditText richEditText5 = this.f$0;
                richEditText5.requestEditFocus();
                richEditText5.setSelection(Math.max(0, Math.min(this.f$1, richEditText5.length())));
                break;
        }
    }
}
