package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class e41 extends ColorDrawable {
    public final int f33135a;
    public final org.telegram.ui.ActionBar.f6 f33136b;

    public e41(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.f33135a = i7;
        this.f33136b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.f33135a, this.f33136b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
