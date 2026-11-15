package org.telegram.ui.Components;

import android.view.View;
public final class j41 implements View.OnClickListener {
    public final int f35888a;
    public final UndoView f35889b;

    public j41(UndoView undoView, int i7) {
        this.f35888a = i7;
        this.f35889b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f35888a;
        UndoView undoView = this.f35889b;
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
