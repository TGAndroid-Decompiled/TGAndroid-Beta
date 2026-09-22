package org.telegram.ui.Components;

import android.view.View;
public final class q51 implements View.OnClickListener {
    public final int f27254a;
    public final UndoView f27255b;

    public q51(UndoView undoView, int i10) {
        this.f27254a = i10;
        this.f27255b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f27254a;
        UndoView undoView = this.f27255b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22225e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22225e0;
                undoView.e(1, false);
                return;
        }
    }
}
