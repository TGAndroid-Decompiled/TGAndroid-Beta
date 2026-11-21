package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class b51 extends ColorDrawable {
    public final int f33776a;
    public final org.telegram.ui.ActionBar.h6 f33777b;

    public b51(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.f33776a = i7;
        this.f33777b = h6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(this.f33776a, this.f33777b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
