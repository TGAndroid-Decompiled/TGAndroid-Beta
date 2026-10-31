package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class o51 extends ColorDrawable {
    public final int f28976a;
    public final org.telegram.ui.ActionBar.p6 f28977b;

    public o51(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.f28976a = i10;
        this.f28977b = p6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(this.f28976a, this.f28977b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
