package org.telegram.ui.Components;

import android.view.View;
public final class q51 implements View.OnClickListener {
    public final int f27257a;
    public final UndoView f27258b;

    public q51(UndoView undoView, int i10) {
        this.f27257a = i10;
        this.f27258b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f27257a;
        UndoView undoView = this.f27258b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22228e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22228e0;
                undoView.e(1, false);
                return;
        }
    }
}
