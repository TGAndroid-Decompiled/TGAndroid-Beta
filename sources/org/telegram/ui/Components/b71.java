package org.telegram.ui.Components;

import android.view.View;
public final class b71 implements View.OnClickListener {
    public final int f26772a;
    public final UndoView f26773b;

    public b71(UndoView undoView, int i10) {
        this.f26772a = i10;
        this.f26773b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26772a;
        UndoView undoView = this.f26773b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f26347i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f26347i0;
                undoView.d(1, false);
                return;
        }
    }
}
