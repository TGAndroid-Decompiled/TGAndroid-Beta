package org.telegram.ui.Components;

import android.view.View;
public final class o61 implements View.OnClickListener {
    public final int f28910a;
    public final UndoView f28911b;

    public o61(UndoView undoView, int i10) {
        this.f28910a = i10;
        this.f28911b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28910a;
        UndoView undoView = this.f28911b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24403e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24403e0;
                undoView.e(1, false);
                return;
        }
    }
}
