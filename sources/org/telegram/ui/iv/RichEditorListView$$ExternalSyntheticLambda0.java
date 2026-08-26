package org.telegram.ui.iv;

public final class RichEditorListView$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final RichEditorListView f$0;
    public final int f$1;
    public final int f$2;

    public RichEditorListView$$ExternalSyntheticLambda0(RichEditorListView richEditorListView, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = richEditorListView;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.applyInitialSelectionInternal(this.f$1, this.f$2);
                break;
            default:
                this.f$0.persistTableCell(this.f$1, this.f$2);
                break;
        }
    }
}
