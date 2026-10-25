package org.telegram.ui.Components;

import android.view.View;
public final class b71 implements View.OnClickListener {
    public final int f26770a;
    public final UndoView f26771b;

    public b71(UndoView undoView, int i10) {
        this.f26770a = i10;
        this.f26771b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26770a;
        UndoView undoView = this.f26771b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f26345i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f26345i0;
                undoView.d(1, false);
                return;
        }
    }
}
