package org.telegram.ui.Components;

import android.view.View;
public final class r51 implements View.OnClickListener {
    public final int f30606a;
    public final UndoView f30607b;

    public r51(UndoView undoView, int i10) {
        this.f30606a = i10;
        this.f30607b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f30606a;
        UndoView undoView = this.f30607b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f25074b0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f25074b0;
                undoView.e(1, false);
                return;
        }
    }
}
