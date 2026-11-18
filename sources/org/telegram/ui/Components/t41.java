package org.telegram.ui.Components;

import android.view.View;
public final class t41 implements View.OnClickListener {
    public final int f39904a;
    public final UndoView f39905b;

    public t41(UndoView undoView, int i7) {
        this.f39904a = i7;
        this.f39905b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f39904a;
        UndoView undoView = this.f39905b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f33171j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f33171j0;
                undoView.d(1, false);
                return;
        }
    }
}
