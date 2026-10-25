package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class h71 extends ColorDrawable {
    public final int f28854a;
    public final org.telegram.ui.ActionBar.u6 f28855b;

    public h71(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.f28854a = i10;
        this.f28855b = u6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.y6.w0(this.f28854a, this.f28855b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
