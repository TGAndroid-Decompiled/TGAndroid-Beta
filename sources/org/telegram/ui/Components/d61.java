package org.telegram.ui.Components;

import android.view.View;
public final class d61 implements View.OnClickListener {
    public final int f23509a;
    public final UndoView f23510b;

    public d61(UndoView undoView, int i10) {
        this.f23509a = i10;
        this.f23510b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f23509a;
        UndoView undoView = this.f23510b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22451e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22451e0;
                undoView.e(1, false);
                return;
        }
    }
}
