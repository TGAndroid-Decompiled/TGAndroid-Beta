package org.telegram.ui.Components;

import android.view.View;
public final class y61 implements View.OnClickListener {
    public final int f33117a;
    public final UndoView f33118b;

    public y61(UndoView undoView, int i10) {
        this.f33117a = i10;
        this.f33118b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33117a;
        UndoView undoView = this.f33118b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24374e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24374e0;
                undoView.e(1, false);
                return;
        }
    }
}
