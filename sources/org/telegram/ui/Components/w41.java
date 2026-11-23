package org.telegram.ui.Components;

import android.view.View;
public final class w41 implements View.OnClickListener {
    public final int f41619a;
    public final UndoView f41620b;

    public w41(UndoView undoView, int i7) {
        this.f41619a = i7;
        this.f41620b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f41619a;
        UndoView undoView = this.f41620b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f33173j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f33173j0;
                undoView.d(1, false);
                return;
        }
    }
}
