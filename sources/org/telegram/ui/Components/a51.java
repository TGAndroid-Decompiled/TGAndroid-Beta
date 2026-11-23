package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class a51 extends ColorDrawable {
    public final int f33371a;
    public final org.telegram.ui.ActionBar.i6 f33372b;

    public a51(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.f33371a = i7;
        this.f33372b = i6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.n6.w0(this.f33371a, this.f33372b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
