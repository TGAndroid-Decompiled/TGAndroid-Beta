package org.telegram.ui.Components;

import android.view.View;
public final class p51 implements View.OnClickListener {
    public final int f26936a;
    public final UndoView f26937b;

    public p51(UndoView undoView, int i10) {
        this.f26936a = i10;
        this.f26937b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f26936a;
        UndoView undoView = this.f26937b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22199e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22199e0;
                undoView.e(1, false);
                return;
        }
    }
}
