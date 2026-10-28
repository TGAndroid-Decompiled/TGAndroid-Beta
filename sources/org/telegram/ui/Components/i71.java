package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class i71 extends ColorDrawable {
    public final int f29233a;
    public final org.telegram.ui.ActionBar.u6 f29234b;

    public i71(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.f29233a = i10;
        this.f29234b = u6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(this.f29233a, this.f29234b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
