package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class p51 extends ColorDrawable {
    public final int f29362a;
    public final org.telegram.ui.ActionBar.p6 f29363b;

    public p51(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f29362a = i10;
        this.f29363b = p6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(this.f29362a, this.f29363b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
