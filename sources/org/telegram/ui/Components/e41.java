package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class e41 extends ColorDrawable {
    public final int f33280a;
    public final org.telegram.ui.ActionBar.e6 f33281b;

    public e41(int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        this.f33280a = i3;
        this.f33281b = e6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.f33280a, this.f33281b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
