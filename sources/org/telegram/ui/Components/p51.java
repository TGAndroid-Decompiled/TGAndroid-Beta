package org.telegram.ui.Components;

import android.view.View;
public final class p51 implements View.OnClickListener {
    public final int f29989a;
    public final UndoView f29990b;

    public p51(UndoView undoView, int i10) {
        this.f29989a = i10;
        this.f29990b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29989a;
        UndoView undoView = this.f29990b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f25076b0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f25076b0;
                undoView.e(1, false);
                return;
        }
    }
}
