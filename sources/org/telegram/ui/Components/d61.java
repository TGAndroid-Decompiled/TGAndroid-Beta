package org.telegram.ui.Components;

import android.view.View;
public final class d61 implements View.OnClickListener {
    public final int f23500a;
    public final UndoView f23501b;

    public d61(UndoView undoView, int i10) {
        this.f23500a = i10;
        this.f23501b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f23500a;
        UndoView undoView = this.f23501b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22436e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22436e0;
                undoView.e(1, false);
                return;
        }
    }
}
