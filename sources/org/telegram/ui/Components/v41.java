package org.telegram.ui.Components;

import android.view.View;

public final class v41 implements View.OnClickListener {

    public final int f33266a;

    public final UndoView f33267b;

    public v41(UndoView undoView, int i10) {
        this.f33266a = i10;
        this.f33267b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f33266a;
        UndoView undoView = this.f33267b;
        switch (i10) {
            case 0:
                int i11 = UndoView.f26571a0;
                if (undoView.a()) {
                    undoView.e(1, false);
                    break;
                }
                break;
            default:
                int i12 = UndoView.f26571a0;
                undoView.e(1, false);
                break;
        }
    }
}
