package org.telegram.ui.Components;

import android.view.View;
public final class f41 implements View.OnClickListener {
    public final int f33458a;
    public final UndoView f33459b;

    public f41(UndoView undoView, int i7) {
        this.f33458a = i7;
        this.f33459b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33458a;
        UndoView undoView = this.f33459b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f31609i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f31609i0;
                undoView.d(1, false);
                return;
        }
    }
}
