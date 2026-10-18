package org.telegram.ui.Components;

import android.view.View;
public final class n61 implements View.OnClickListener {
    public final int f28671a;
    public final UndoView f28672b;

    public n61(UndoView undoView, int i10) {
        this.f28671a = i10;
        this.f28672b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28671a;
        UndoView undoView = this.f28672b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24409e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24409e0;
                undoView.e(1, false);
                return;
        }
    }
}
