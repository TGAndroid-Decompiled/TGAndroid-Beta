package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class o41 extends ColorDrawable {
    public final int f37847a;
    public final org.telegram.ui.ActionBar.e6 f37848b;

    public o41(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.f37847a = i7;
        this.f37848b = e6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(this.f37847a, this.f37848b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
