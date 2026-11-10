package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class l41 extends ColorDrawable {
    public final int f35534a;
    public final org.telegram.ui.ActionBar.h6 f35535b;

    public l41(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.f35534a = i7;
        this.f35535b = h6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(this.f35534a, this.f35535b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
