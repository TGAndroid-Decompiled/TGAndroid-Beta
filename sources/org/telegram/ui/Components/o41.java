package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class o41 extends ColorDrawable {
    public final int f37836a;
    public final org.telegram.ui.ActionBar.e6 f37837b;

    public o41(int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        this.f37836a = i7;
        this.f37837b = e6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(this.f37836a, this.f37837b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
