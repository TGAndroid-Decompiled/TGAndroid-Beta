package org.telegram.ui.Components;

import android.view.View;
public final class e61 implements View.OnClickListener {
    public final int f23856a;
    public final UndoView f23857b;

    public e61(UndoView undoView, int i10) {
        this.f23856a = i10;
        this.f23857b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f23856a;
        UndoView undoView = this.f23857b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f22450e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f22450e0;
                undoView.e(1, false);
                return;
        }
    }
}
