package org.telegram.ui.Components;

import android.view.View;
public final class g61 implements View.OnClickListener {
    public final int f24433a;
    public final UndoView f24434b;

    public g61(UndoView undoView, int i10) {
        this.f24433a = i10;
        this.f24434b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24433a;
        UndoView undoView = this.f24434b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22472e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22472e0;
                undoView.e(1, false);
                return;
        }
    }
}
