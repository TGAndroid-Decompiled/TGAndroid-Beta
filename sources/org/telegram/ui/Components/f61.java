package org.telegram.ui.Components;

import android.view.View;
public final class f61 implements View.OnClickListener {
    public final int f24139a;
    public final UndoView f24140b;

    public f61(UndoView undoView, int i10) {
        this.f24139a = i10;
        this.f24140b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24139a;
        UndoView undoView = this.f24140b;
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
