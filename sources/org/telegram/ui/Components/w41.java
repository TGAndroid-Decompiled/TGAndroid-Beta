package org.telegram.ui.Components;

import android.view.View;
public final class w41 implements View.OnClickListener {
    public final int f41646a;
    public final UndoView f41647b;

    public w41(UndoView undoView, int i7) {
        this.f41646a = i7;
        this.f41647b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f41646a;
        UndoView undoView = this.f41647b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f33207j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f33207j0;
                undoView.d(1, false);
                return;
        }
    }
}
