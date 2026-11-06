package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
public final class k41 extends ColorDrawable {
    public final int f35162a;
    public final org.telegram.ui.ActionBar.f6 f35163b;

    public k41(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.f35162a = i7;
        this.f35163b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.f35162a, this.f35163b);
        if (getColor() != w02) {
            setColor(w02);
        }
        super.draw(canvas);
    }
}
