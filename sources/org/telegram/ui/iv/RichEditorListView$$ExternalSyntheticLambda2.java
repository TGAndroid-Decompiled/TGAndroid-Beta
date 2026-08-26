package org.telegram.ui.iv;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.TextSelectionHelper;

public final class RichEditorListView$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final RichEditorListView f$0;
    public final BlockRow f$1;

    public RichEditorListView$$ExternalSyntheticLambda2(RichEditorListView richEditorListView, BlockRow blockRow, int i) {
        this.$r8$classId = i;
        this.f$0 = richEditorListView;
        this.f$1 = blockRow;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.focusRow(this.f$1);
                break;
            case 1:
                this.f$0.focusRow(this.f$1);
                break;
            case 2:
                View viewFindViewByItemObject = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject instanceof RichTextCell) {
                    RichTextCell richTextCell = (RichTextCell) viewFindViewByItemObject;
                    richTextCell.editText.requestEditFocus();
                    richTextCell.getEditText().setSelection(0);
                }
                break;
            case 3:
                this.f$0.focusRow(this.f$1);
                break;
            case 4:
                this.f$0.focusNavRow(this.f$1, true);
                break;
            case 5:
                this.f$0.focusNavRow(this.f$1, false);
                break;
            case 6:
                this.f$0.focusNavRow(this.f$1, true);
                break;
            case 7:
                this.f$0.focusRow(this.f$1);
                break;
            case 8:
                this.f$0.focusItemRow(this.f$1, false);
                break;
            case 9:
                this.f$0.focusItemRow(this.f$1, true);
                break;
            case 10:
                this.f$0.focusItemRow(this.f$1, true);
                break;
            case 11:
                this.f$0.focusRow(this.f$1);
                break;
            case 12:
                this.f$0.focusNavRow(this.f$1, false);
                break;
            case 13:
                this.f$0.focusItemRow(this.f$1, true);
                break;
            case 14:
                RichEditorListView richEditorListView = this.f$0;
                KeyEvent.Callback callbackFindViewByItemObject = richEditorListView.findViewByItemObject(this.f$1);
                if (callbackFindViewByItemObject instanceof TextSelectionHelper.ArticleSelectableView) {
                    richEditorListView.textSelectionHelper.extendSelectionTo(0, 0, (TextSelectionHelper.ArticleSelectableView) callbackFindViewByItemObject);
                }
                break;
            case 15:
                RichEditorListView richEditorListView2 = this.f$0;
                KeyEvent.Callback callbackFindViewByItemObject2 = richEditorListView2.findViewByItemObject(this.f$1);
                if (callbackFindViewByItemObject2 instanceof TextSelectionHelper.ArticleSelectableView) {
                    richEditorListView2.textSelectionHelper.extendSelectionTo(0, callbackFindViewByItemObject2 instanceof RichTextCell ? ((RichTextCell) callbackFindViewByItemObject2).getEditText().length() : 0, (TextSelectionHelper.ArticleSelectableView) callbackFindViewByItemObject2);
                }
                break;
            case 16:
                View viewFindViewByItemObject2 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject2 instanceof RichTextCell) {
                    RichTextCell richTextCell2 = (RichTextCell) viewFindViewByItemObject2;
                    richTextCell2.editText.requestEditFocus();
                    richTextCell2.getEditText().setSelection(0);
                } else if (viewFindViewByItemObject2 instanceof RichDetailsCell) {
                    RichDetailsCell richDetailsCell = (RichDetailsCell) viewFindViewByItemObject2;
                    richDetailsCell.editText.requestEditFocus();
                    richDetailsCell.getEditText().setSelection(0);
                }
                break;
            case 17:
                View viewFindViewByItemObject3 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject3 instanceof RichTextCell) {
                    RichTextCell richTextCell3 = (RichTextCell) viewFindViewByItemObject3;
                    richTextCell3.editText.requestEditFocus();
                    richTextCell3.getEditText().setSelection(0);
                }
                break;
            case 18:
                View viewFindViewByItemObject4 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject4 instanceof RichTextCell) {
                    RichTextCell richTextCell4 = (RichTextCell) viewFindViewByItemObject4;
                    richTextCell4.editText.requestEditFocus();
                    richTextCell4.getEditText().setSelection(richTextCell4.getEditText().length());
                } else if (viewFindViewByItemObject4 instanceof RichTableCell) {
                    RichTableCell richTableCell = (RichTableCell) viewFindViewByItemObject4;
                    if (richTableCell.getGrid().getChildCount() > 0) {
                        View childAt = richTableCell.getGrid().getChildAt(0);
                        if (childAt instanceof RichTableCellHost) {
                            ((RichTableCellHost) childAt).editText.requestEditFocus();
                        }
                    }
                }
                break;
            case 19:
                this.f$0.focusRowAtEnd(this.f$1);
                break;
            case 20:
                View viewFindViewByItemObject5 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject5 instanceof RichDetailsCell) {
                    ((RichDetailsCell) viewFindViewByItemObject5).editText.requestEditFocus();
                }
                break;
            case 21:
                this.f$0.focusRowAtEnd(this.f$1);
                break;
            case 22:
                this.f$0.focusRowAtEnd(this.f$1);
                break;
            case 23:
                View viewFindViewByItemObject6 = this.f$0.findViewByItemObject(this.f$1);
                if (viewFindViewByItemObject6 instanceof RichTextCell) {
                    RichTextCell richTextCell5 = (RichTextCell) viewFindViewByItemObject6;
                    richTextCell5.editText.requestEditFocus();
                    richTextCell5.getEditText().setSelection(0);
                }
                break;
            case 24:
                this.f$0.focusRow(this.f$1);
                break;
            case 25:
                this.f$0.updateLanguageOf(this.f$1, "");
                break;
            case 26:
                this.f$0.focusRow(this.f$1);
                break;
            case 27:
                this.f$0.focusRow(this.f$1);
                break;
            case 28:
                this.f$0.focusRow(this.f$1);
                break;
            default:
                this.f$0.focusRow(this.f$1);
                break;
        }
    }
}
