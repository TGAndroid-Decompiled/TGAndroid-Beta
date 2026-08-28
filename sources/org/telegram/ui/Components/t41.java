package org.telegram.ui.Components;

import android.view.View;
public final class t41 implements View.OnClickListener {
    public final int f32626a;
    public final UndoView f32627b;

    public t41(UndoView undoView, int i9) {
        this.f32626a = i9;
        this.f32627b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i9 = this.f32626a;
        UndoView undoView = this.f32627b;
        switch (i9) {
            case 0:
                int i10 = UndoView.f26575a0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f26575a0;
                undoView.e(1, false);
                return;
        }
    }
}
