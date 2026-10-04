package org.telegram.ui.Components;

import android.view.View;
public final class o61 implements View.OnClickListener {
    public final int f29266a;
    public final UndoView f29267b;

    public o61(UndoView undoView, int i10) {
        this.f29266a = i10;
        this.f29267b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29266a;
        UndoView undoView = this.f29267b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24367e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24367e0;
                undoView.e(1, false);
                return;
        }
    }
}
