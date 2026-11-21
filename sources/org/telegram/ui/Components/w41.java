package org.telegram.ui.Components;

import android.view.View;
public final class w41 implements View.OnClickListener {
    public final int f41652a;
    public final UndoView f41653b;

    public w41(UndoView undoView, int i7) {
        this.f41652a = i7;
        this.f41653b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f41652a;
        UndoView undoView = this.f41653b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f33204j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f33204j0;
                undoView.d(1, false);
                return;
        }
    }
}
