package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class y41 extends ColorDrawable {
    public final int f42327a;
    public final org.telegram.ui.ActionBar.i6 f42328b;

    public y41(int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        this.f42327a = i7;
        this.f42328b = i6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.n6.w0(this.f42327a, this.f42328b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
