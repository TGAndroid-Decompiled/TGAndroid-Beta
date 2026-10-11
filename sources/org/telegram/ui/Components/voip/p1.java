package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.ci1;
import w7.x5;
public final class p1 extends FrameLayout {
    public final m1 f32240a;
    public final FrameLayout f32241b;
    public final o1[] f32242c;
    public ci1 d;

    public p1(Activity activity, r1 r1Var) {
        super(activity);
        this.f32242c = new o1[5];
        setWillNotDraw(false);
        m1 m1Var = new m1(activity, r1Var);
        this.f32240a = m1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f32241b = frameLayout;
        m1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f32242c[i10] = new o1(activity);
            this.f32242c[i10].setAllStarsProvider(new m4.w(this, 12));
            o1 o1Var = this.f32242c[i10];
            o1Var.d = new org.telegram.ui.Components.y2(21, this, activity);
            o1Var.f32233f = i10;
            this.f32241b.addView(o1Var, x5.a(-2.0f, i10 * 41, 0.0f, 0.0f, 0.0f, -2, 51));
        }
        addView(this.f32240a, x5.a(152.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        addView(this.f32241b, x5.a(100.0f, 0.0f, 90.0f, 0.0f, 0.0f, 201, 49));
    }
}
