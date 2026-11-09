package org.telegram.ui.Components;

import android.view.View;
public final class g41 implements View.OnClickListener {
    public final int f33860a;
    public final UndoView f33861b;

    public g41(UndoView undoView, int i7) {
        this.f33860a = i7;
        this.f33861b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33860a;
        UndoView undoView = this.f33861b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f31601i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f31601i0;
                undoView.d(1, false);
                return;
        }
    }
}
