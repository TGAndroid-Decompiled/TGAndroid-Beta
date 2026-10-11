package org.telegram.ui.Components;

import android.view.View;
public final class y61 implements View.OnClickListener {
    public final int f33159a;
    public final UndoView f33160b;

    public y61(UndoView undoView, int i10) {
        this.f33159a = i10;
        this.f33160b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33159a;
        UndoView undoView = this.f33160b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24398e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24398e0;
                undoView.e(1, false);
                return;
        }
    }
}
