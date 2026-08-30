package org.telegram.ui.Components;

import android.view.View;
public final class q51 implements View.OnClickListener {
    public final int f28061a;
    public final UndoView f28062b;

    public q51(UndoView undoView, int i10) {
        this.f28061a = i10;
        this.f28062b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28061a;
        UndoView undoView = this.f28062b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f23212b0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f23212b0;
                undoView.e(1, false);
                return;
        }
    }
}
