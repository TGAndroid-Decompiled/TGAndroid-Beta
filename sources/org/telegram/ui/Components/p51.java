package org.telegram.ui.Components;

import android.view.View;
public final class p51 implements View.OnClickListener {
    public final int f29309a;
    public final UndoView f29310b;

    public p51(UndoView undoView, int i10) {
        this.f29309a = i10;
        this.f29310b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29309a;
        UndoView undoView = this.f29310b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24208e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24208e0;
                undoView.e(1, false);
                return;
        }
    }
}
