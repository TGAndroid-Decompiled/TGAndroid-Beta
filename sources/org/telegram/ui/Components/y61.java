package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class y61 extends ColorDrawable {
    public final int f32829a;
    public final org.telegram.ui.ActionBar.g6 f32830b;

    public y61(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.f32829a = i10;
        this.f32830b = g6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.f32829a, this.f32830b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
