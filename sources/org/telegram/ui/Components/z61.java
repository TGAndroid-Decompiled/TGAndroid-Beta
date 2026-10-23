package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class z61 extends ColorDrawable {
    public final int f33152a;
    public final org.telegram.ui.ActionBar.g6 f33153b;

    public z61(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.f33152a = i10;
        this.f33153b = g6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.f33152a, this.f33153b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
