package org.telegram.ui.Components;

import android.view.View;
public final class v41 implements View.OnClickListener {
    public final int f40559a;
    public final UndoView f40560b;

    public v41(UndoView undoView, int i7) {
        this.f40559a = i7;
        this.f40560b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f40559a;
        UndoView undoView = this.f40560b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f33271j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f33271j0;
                undoView.d(1, false);
                return;
        }
    }
}
