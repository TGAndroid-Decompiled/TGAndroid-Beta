package org.telegram.ui.Components;

import android.view.View;
public final class f61 implements View.OnClickListener {
    public final int f24030a;
    public final UndoView f24031b;

    public f61(UndoView undoView, int i10) {
        this.f24030a = i10;
        this.f24031b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24030a;
        UndoView undoView = this.f24031b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22414e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22414e0;
                undoView.e(1, false);
                return;
        }
    }
}
