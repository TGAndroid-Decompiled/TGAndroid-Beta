package org.telegram.ui.ActionBar;

import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class q5 extends h7.w5 {

    public final boolean f23745a;

    public final View f23746b;

    public q5(View view, boolean z10) {
        this.f23745a = z10;
        this.f23746b = view;
    }

    @Override
    public final void b(int i10, int i11) {
        boolean z10 = this.f23745a;
        View view = this.f23746b;
        if (z10) {
            view.invalidate();
            return;
        }
        Point point = AndroidUtilities.displaySize;
        if ((point.x <= point.y) == (i10 <= i11)) {
            view.invalidate();
        }
    }
}
