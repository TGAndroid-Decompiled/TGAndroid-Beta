package org.telegram.ui.Components;

import android.view.View;
public final class d61 implements View.OnClickListener {
    public final int f22302a;
    public final UndoView f22303b;

    public d61(UndoView undoView, int i10) {
        this.f22302a = i10;
        this.f22303b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f22302a;
        UndoView undoView = this.f22303b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f21313e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f21313e0;
                undoView.e(1, false);
                return;
        }
    }
}
