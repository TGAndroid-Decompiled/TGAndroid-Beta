package org.telegram.ui.Components;

import android.view.View;

public final class UndoView$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final UndoView f$0;

    public UndoView$$ExternalSyntheticLambda0(UndoView undoView, int i) {
        this.$r8$classId = i;
        this.f$0 = undoView;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                UndoView undoView = this.f$0;
                if (undoView.canUndo()) {
                    undoView.hide(1, false);
                    break;
                }
                break;
            default:
                this.f$0.hide(1, false);
                break;
        }
    }
}
