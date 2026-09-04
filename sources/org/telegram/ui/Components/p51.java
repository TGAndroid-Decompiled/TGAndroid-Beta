package org.telegram.ui.Components;

import android.view.View;
public final class p51 implements View.OnClickListener {
    public final int f29282a;
    public final UndoView f29283b;

    public p51(UndoView undoView, int i10) {
        this.f29282a = i10;
        this.f29283b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29282a;
        UndoView undoView = this.f29283b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24181e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24181e0;
                undoView.e(1, false);
                return;
        }
    }
}
