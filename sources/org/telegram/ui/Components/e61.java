package org.telegram.ui.Components;

import android.view.View;
public final class e61 implements View.OnClickListener {
    public final int f23750a;
    public final UndoView f23751b;

    public e61(UndoView undoView, int i10) {
        this.f23750a = i10;
        this.f23751b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f23750a;
        UndoView undoView = this.f23751b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22449e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22449e0;
                undoView.e(1, false);
                return;
        }
    }
}
