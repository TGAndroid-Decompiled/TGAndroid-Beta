package org.telegram.ui.Components;

import android.view.View;
public final class c71 implements View.OnClickListener {
    public final int f24841a;
    public final UndoView f24842b;

    public c71(UndoView undoView, int i10) {
        this.f24841a = i10;
        this.f24842b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24841a;
        UndoView undoView = this.f24842b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24148e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24148e0;
                undoView.e(1, false);
                return;
        }
    }
}
