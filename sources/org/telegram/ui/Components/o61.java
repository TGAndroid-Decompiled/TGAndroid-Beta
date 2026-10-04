package org.telegram.ui.Components;

import android.view.View;
public final class o61 implements View.OnClickListener {
    public final int f29267a;
    public final UndoView f29268b;

    public o61(UndoView undoView, int i10) {
        this.f29267a = i10;
        this.f29268b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29267a;
        UndoView undoView = this.f29268b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24368e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24368e0;
                undoView.e(1, false);
                return;
        }
    }
}
