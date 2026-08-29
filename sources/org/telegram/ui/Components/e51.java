package org.telegram.ui.Components;

import android.view.View;
public final class e51 implements View.OnClickListener {
    public final int f27930a;
    public final UndoView f27931b;

    public e51(UndoView undoView, int i10) {
        this.f27930a = i10;
        this.f27931b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f27930a;
        UndoView undoView = this.f27931b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f26586a0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f26586a0;
                undoView.e(1, false);
                return;
        }
    }
}
