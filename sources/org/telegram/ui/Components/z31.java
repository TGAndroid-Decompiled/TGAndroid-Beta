package org.telegram.ui.Components;

import android.view.View;
public final class z31 implements View.OnClickListener {
    public final int f40906a;
    public final UndoView f40907b;

    public z31(UndoView undoView, int i3) {
        this.f40906a = i3;
        this.f40907b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f40906a;
        UndoView undoView = this.f40907b;
        switch (i3) {
            case 0:
                int i10 = UndoView.f31669j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f31669j0;
                undoView.d(1, false);
                return;
        }
    }
}
