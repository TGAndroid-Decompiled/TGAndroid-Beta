package org.telegram.ui.Components;

import android.view.View;
public final class u61 implements View.OnClickListener {
    public final int f31092a;
    public final UndoView f31093b;

    public u61(UndoView undoView, int i10) {
        this.f31092a = i10;
        this.f31093b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f31092a;
        UndoView undoView = this.f31093b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24554i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24554i0;
                undoView.d(1, false);
                return;
        }
    }
}
