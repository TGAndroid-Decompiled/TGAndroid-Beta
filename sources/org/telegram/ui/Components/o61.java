package org.telegram.ui.Components;

import android.view.View;
public final class o61 implements View.OnClickListener {
    public final int f28912a;
    public final UndoView f28913b;

    public o61(UndoView undoView, int i10) {
        this.f28912a = i10;
        this.f28913b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28912a;
        UndoView undoView = this.f28913b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24405e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24405e0;
                undoView.e(1, false);
                return;
        }
    }
}
