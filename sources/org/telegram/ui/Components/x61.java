package org.telegram.ui.Components;

import android.view.View;
public final class x61 implements View.OnClickListener {
    public final int f32760a;
    public final UndoView f32761b;

    public x61(UndoView undoView, int i10) {
        this.f32760a = i10;
        this.f32761b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f32760a;
        UndoView undoView = this.f32761b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24370e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24370e0;
                undoView.e(1, false);
                return;
        }
    }
}
