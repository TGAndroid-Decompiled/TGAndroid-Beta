package org.telegram.ui.Components;

import android.view.View;
public final class p61 implements View.OnClickListener {
    public final int f29251a;
    public final UndoView f29252b;

    public p61(UndoView undoView, int i10) {
        this.f29251a = i10;
        this.f29252b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29251a;
        UndoView undoView = this.f29252b;
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
