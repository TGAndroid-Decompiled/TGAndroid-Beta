package org.telegram.ui.Components;

import android.view.View;
public final class d61 implements View.OnClickListener {
    public final int f23508a;
    public final UndoView f23509b;

    public d61(UndoView undoView, int i10) {
        this.f23508a = i10;
        this.f23509b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f23508a;
        UndoView undoView = this.f23509b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22450e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22450e0;
                undoView.e(1, false);
                return;
        }
    }
}
