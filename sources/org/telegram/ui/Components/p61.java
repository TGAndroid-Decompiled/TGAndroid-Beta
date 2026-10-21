package org.telegram.ui.Components;

import android.view.View;
public final class p61 implements View.OnClickListener {
    public final int f29248a;
    public final UndoView f29249b;

    public p61(UndoView undoView, int i10) {
        this.f29248a = i10;
        this.f29249b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f29248a;
        UndoView undoView = this.f29249b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24406e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24406e0;
                undoView.e(1, false);
                return;
        }
    }
}
