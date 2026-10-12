package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.fi1;
import w7.w5;
public final class p1 extends FrameLayout {
    public final m1 f31886a;
    public final FrameLayout f31887b;
    public final o1[] f31888c;
    public fi1 d;

    public p1(Activity activity, r1 r1Var) {
        super(activity);
        this.f31888c = new o1[5];
        setWillNotDraw(false);
        m1 m1Var = new m1(activity, r1Var);
        this.f31886a = m1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f31887b = frameLayout;
        m1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f31888c[i10] = new o1(activity);
            this.f31888c[i10].setAllStarsProvider(new m4.x(this, 13));
            o1 o1Var = this.f31888c[i10];
            o1Var.d = new org.telegram.ui.Components.y2(20, this, activity);
            o1Var.f31869f = i10;
            this.f31887b.addView(o1Var, w5.a(-2.0f, i10 * 41, 0.0f, 0.0f, 0.0f, -2, 51));
        }
        addView(this.f31886a, w5.a(152.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        addView(this.f31887b, w5.a(100.0f, 0.0f, 90.0f, 0.0f, 0.0f, 201, 49));
    }
}
