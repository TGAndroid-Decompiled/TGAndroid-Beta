package org.telegram.ui.Components;

import android.view.View;
public final class i51 implements View.OnClickListener {
    public final int f26885a;
    public final UndoView f26886b;

    public i51(UndoView undoView, int i10) {
        this.f26885a = i10;
        this.f26886b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26885a;
        UndoView undoView = this.f26886b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24237i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24237i0;
                undoView.d(1, false);
                return;
        }
    }
}
