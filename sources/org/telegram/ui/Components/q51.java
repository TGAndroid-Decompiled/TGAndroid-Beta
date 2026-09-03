package org.telegram.ui.Components;

import android.view.View;
public final class q51 implements View.OnClickListener {
    public final int f28082a;
    public final UndoView f28083b;

    public q51(UndoView undoView, int i10) {
        this.f28082a = i10;
        this.f28083b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28082a;
        UndoView undoView = this.f28083b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f23185b0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f23185b0;
                undoView.e(1, false);
                return;
        }
    }
}
