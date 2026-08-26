package org.telegram.ui.iv;

import android.view.View;

public final class RichEditorListView$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final RichEditorListView f$0;
    public final BlockRow f$1;
    public final int f$2;

    public RichEditorListView$$ExternalSyntheticLambda3(RichEditorListView richEditorListView, BlockRow blockRow, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = richEditorListView;
        this.f$1 = blockRow;
        this.f$2 = i;
    }

    @Override
    public final void run() {
        View viewFindViewByItemObject;
        View viewFindViewByItemObject2;
        switch (this.$r8$classId) {
            case 0:
                View viewFindViewByItemObject3 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject3 instanceof RichTextCell) {
                    RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject3;
                    richTextCell.editText.requestEditFocus();
                    richTextCell.getEditText().setSelection(Math.max(0, Math.min(this.f$2, richTextCell.getEditText().length())));
                }
                break;
            case 1:
                RichEditorListView richEditorListView = this.f$0;
                BlockRow blockRow = this.f$1;
                if (blockRow == null) {
                    richEditorListView.getClass();
                    viewFindViewByItemObject = null;
                } else {
                    viewFindViewByItemObject = richEditorListView.findViewByItemObject(blockRow);
                }
                if (viewFindViewByItemObject instanceof RichTextCell) {
                    RichTextCell richTextCell2 = (RichTextCell) viewFindViewByItemObject;
                    richTextCell2.editText.requestEditFocus();
                    richTextCell2.getEditText().setSelection(Math.min(this.f$2, richTextCell2.getEditText().length()));
                }
                break;
            case 2:
                RichEditorListView richEditorListView2 = this.f$0;
                BlockRow blockRow2 = this.f$1;
                if (blockRow2 == null) {
                    richEditorListView2.getClass();
                    viewFindViewByItemObject2 = null;
                } else {
                    viewFindViewByItemObject2 = richEditorListView2.findViewByItemObject(blockRow2);
                }
                if (viewFindViewByItemObject2 instanceof RichTextCell) {
                    RichTextCell richTextCell3 = (RichTextCell) viewFindViewByItemObject2;
                    richTextCell3.editText.requestEditFocus();
                    richTextCell3.getEditText().setSelection(Math.min(this.f$2, richTextCell3.getEditText().length()));
                }
                break;
            case 3:
                View viewFindViewByItemObject4 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject4 instanceof RichTextCell) {
                    RichTextCell richTextCell4 = (RichTextCell) viewFindViewByItemObject4;
                    richTextCell4.editText.requestEditFocus();
                    richTextCell4.getEditText().setSelection(Math.max(0, Math.min(this.f$2, richTextCell4.getEditText().length())));
                }
                break;
            case 4:
                View viewFindViewByItemObject5 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject5 instanceof RichTextCell) {
                    RichTextCell richTextCell5 = (RichTextCell) viewFindViewByItemObject5;
                    richTextCell5.editText.requestEditFocus();
                    richTextCell5.getEditText().setSelection(Math.max(0, Math.min(this.f$2, richTextCell5.getEditText().length())));
                }
                break;
            default:
                View viewFindViewByItemObject6 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject6 instanceof RichTextCell) {
                    RichTextCell richTextCell6 = (RichTextCell) viewFindViewByItemObject6;
                    richTextCell6.editText.requestEditFocus();
                    richTextCell6.getEditText().setSelection(Math.max(0, Math.min(this.f$2, richTextCell6.getEditText().length())));
                }
                break;
        }
    }
}
