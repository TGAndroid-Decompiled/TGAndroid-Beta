package org.telegram.ui.Components;

import android.view.View;
public final class j41 implements View.OnClickListener {
    public final int f35875a;
    public final UndoView f35876b;

    public j41(UndoView undoView, int i7) {
        this.f35875a = i7;
        this.f35876b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f35875a;
        UndoView undoView = this.f35876b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f32774j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f32774j0;
                undoView.d(1, false);
                return;
        }
    }
}
