package org.telegram.ui.Components;

import android.view.View;
public final class e41 implements View.OnClickListener {
    public final int f33137a;
    public final UndoView f33138b;

    public e41(UndoView undoView, int i7) {
        this.f33137a = i7;
        this.f33138b = undoView;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f33137a;
        UndoView undoView = this.f33138b;
        switch (i7) {
            case 0:
                int i10 = UndoView.f31591i0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    return;
                }
                return;
            default:
                int i11 = UndoView.f31591i0;
                undoView.d(1, false);
                return;
        }
    }
}
