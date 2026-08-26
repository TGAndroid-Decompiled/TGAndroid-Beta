package org.telegram.ui.iv;

import android.view.View;

public final class RichEditorListView$$ExternalSyntheticLambda86 implements Runnable {
    public final int $r8$classId;
    public final RichEditorListView f$0;
    public final BlockRow f$1;

    public RichEditorListView$$ExternalSyntheticLambda86(RichEditorListView richEditorListView, BlockRow blockRow, int i) {
        this.$r8$classId = i;
        this.f$0 = richEditorListView;
        this.f$1 = blockRow;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                View viewFindViewByItemObject = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject instanceof RichTextCell) {
                    RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
                    richTextCell.editText.requestEditFocus();
                    richTextCell.getEditText().setSelection(0);
                }
                break;
            case 1:
                this.f$0.focusRow(this.f$1);
                break;
            case 2:
                this.f$0.focusRow(this.f$1);
                break;
            case 3:
                this.f$0.focusRow(this.f$1);
                break;
            case 4:
                this.f$0.focusRowAtEnd(this.f$1);
                break;
            default:
                this.f$0.focusRow(this.f$1);
                break;
        }
    }
}
