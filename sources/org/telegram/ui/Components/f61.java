package org.telegram.ui.Components;

import android.view.View;
public final class f61 implements View.OnClickListener {
    public final int f24140a;
    public final UndoView f24141b;

    public f61(UndoView undoView, int i10) {
        this.f24140a = i10;
        this.f24141b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24140a;
        UndoView undoView = this.f24141b;
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
