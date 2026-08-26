package org.telegram.ui.iv;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

public final class RichEditor$$ExternalSyntheticLambda14 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int $r8$classId;
    public final Object f$0;

    public RichEditor$$ExternalSyntheticLambda14(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.$r8$classId) {
            case 0:
                ((RichEditor) this.f$0).updateBlockButtons();
                break;
            case 1:
                ((ChatAttachAlertRichLayout) this.f$0).updateToolbarBlockType();
                break;
            case 2:
                RichEditorListView richEditorListView = (RichEditorListView) this.f$0;
                richEditorListView.doNotDetachViews((view2 == null || richEditorListView.findContainingItemView(view2) == null) ? false : true);
                if (view2 instanceof RichEditText) {
                    richEditorListView.focusedEditText = (RichEditText) view2;
                }
                break;
            default:
                RichTableCell richTableCell = (RichTableCell) this.f$0;
                boolean zIsEmpty = richTableCell.selectedCells.isEmpty();
                RichTableCellGrid richTableCellGrid = richTableCell.grid;
                richTableCell.setTranslationZ((!zIsEmpty || richTableCellGrid.hasFocus()) ? AndroidUtilities.dp(1.0f) : 0.0f);
                richTableCell.invalidate();
                richTableCell.scrollView.invalidate();
                Object parent = richTableCell.getParent();
                if (parent instanceof View) {
                    ((View) parent).invalidate();
                }
                if (richTableCellGrid != null) {
                    richTableCellGrid.invalidate();
                }
                break;
        }
    }
}
