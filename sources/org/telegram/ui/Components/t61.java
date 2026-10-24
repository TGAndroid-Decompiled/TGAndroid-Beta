package org.telegram.ui.Components;

import android.view.View;
public final class t61 implements View.OnClickListener {
    public final int f30742a;
    public final UndoView f30743b;

    public t61(UndoView undoView, int i10) {
        this.f30742a = i10;
        this.f30743b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f30742a;
        UndoView undoView = this.f30743b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24555i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24555i0;
                undoView.d(1, false);
                return;
        }
    }
}
