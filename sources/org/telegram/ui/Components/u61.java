package org.telegram.ui.Components;

import android.view.View;
public final class u61 implements View.OnClickListener {
    public final int f29261a;
    public final UndoView f29262b;

    public u61(UndoView undoView, int i10) {
        this.f29261a = i10;
        this.f29262b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29261a;
        UndoView undoView = this.f29262b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f23047e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f23047e0;
                undoView.e(1, false);
                return;
        }
    }
}
