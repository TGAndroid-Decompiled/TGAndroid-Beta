package org.telegram.ui.Components;

import android.view.View;
public final class g61 implements View.OnClickListener {
    public final int f24427a;
    public final UndoView f24428b;

    public g61(UndoView undoView, int i10) {
        this.f24427a = i10;
        this.f24428b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24427a;
        UndoView undoView = this.f24428b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22465e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22465e0;
                undoView.e(1, false);
                return;
        }
    }
}
