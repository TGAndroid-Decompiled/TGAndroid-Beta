package org.telegram.ui.Components;

import android.view.View;
public final class p51 implements View.OnClickListener {
    public final int f29283a;
    public final UndoView f29284b;

    public p51(UndoView undoView, int i10) {
        this.f29283a = i10;
        this.f29284b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29283a;
        UndoView undoView = this.f29284b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24182e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24182e0;
                undoView.e(1, false);
                return;
        }
    }
}
