package org.telegram.ui.Components;

import android.view.View;
public final class c71 implements View.OnClickListener {
    public final int f24846a;
    public final UndoView f24847b;

    public c71(UndoView undoView, int i10) {
        this.f24846a = i10;
        this.f24847b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f24846a;
        UndoView undoView = this.f24847b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24147e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24147e0;
                undoView.e(1, false);
                return;
        }
    }
}
