package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class l41 extends ColorDrawable {
    public final int f35577a;
    public final org.telegram.ui.ActionBar.g6 f35578b;

    public l41(int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        this.f35577a = i7;
        this.f35578b = g6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.l6.w0(this.f35577a, this.f35578b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
