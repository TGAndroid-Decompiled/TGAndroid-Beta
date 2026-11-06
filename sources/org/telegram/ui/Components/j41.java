package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class j41 extends ColorDrawable {
    public final int f34858a;
    public final org.telegram.ui.ActionBar.f6 f34859b;

    public j41(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.f34858a = i7;
        this.f34859b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.f34858a, this.f34859b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
