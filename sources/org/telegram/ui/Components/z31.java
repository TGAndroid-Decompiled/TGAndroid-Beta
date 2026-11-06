package org.telegram.ui.Components;

import android.view.View;
public final class z31 implements View.OnClickListener {
    public final int f40829a;
    public final UndoView f40830b;

    public z31(UndoView undoView, int i7) {
        this.f40829a = i7;
        this.f40830b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f40829a;
        UndoView undoView = this.f40830b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f31591i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f31591i0;
                undoView.d(1, false);
                return;
        }
    }
}
