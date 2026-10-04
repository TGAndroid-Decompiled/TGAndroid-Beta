package org.telegram.ui.Components;

import android.view.View;
public final class o61 implements View.OnClickListener {
    public final int f29272a;
    public final UndoView f29273b;

    public o61(UndoView undoView, int i10) {
        this.f29272a = i10;
        this.f29273b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29272a;
        UndoView undoView = this.f29273b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24372e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24372e0;
                undoView.e(1, false);
                return;
        }
    }
}
