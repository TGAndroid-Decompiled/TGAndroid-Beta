package org.telegram.ui.Components;

import android.view.View;
public final class c71 implements View.OnClickListener {
    public final int f27087a;
    public final UndoView f27088b;

    public c71(UndoView undoView, int i10) {
        this.f27087a = i10;
        this.f27088b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f27087a;
        UndoView undoView = this.f27088b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f26349i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f26349i0;
                undoView.d(1, false);
                return;
        }
    }
}
