package org.telegram.ui.Components;

import android.view.View;
public final class n61 implements View.OnClickListener {
    public final int f28664a;
    public final UndoView f28665b;

    public n61(UndoView undoView, int i10) {
        this.f28664a = i10;
        this.f28665b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f28664a;
        UndoView undoView = this.f28665b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f24402e0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    return;
                }
                return;
            default:
                int i12 = UndoView.f24402e0;
                undoView.e(1, false);
                return;
        }
    }
}
