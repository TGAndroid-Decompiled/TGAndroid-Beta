package org.telegram.ui.Components;

import android.view.View;
public final class f41 implements View.OnClickListener {
    public final int f33459a;
    public final UndoView f33460b;

    public f41(UndoView undoView, int i7) {
        this.f33459a = i7;
        this.f33460b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33459a;
        UndoView undoView = this.f33460b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f31596i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f31596i0;
                undoView.d(1, false);
                return;
        }
    }
}
