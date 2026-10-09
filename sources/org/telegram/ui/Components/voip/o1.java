package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.di1;
import w7.x5;
public final class o1 extends FrameLayout {
    public final l1 f32117a;
    public final FrameLayout f32118b;
    public final n1[] f32119c;
    public di1 d;

    public o1(Activity activity, q1 q1Var) {
        super(activity);
        this.f32119c = new n1[5];
        setWillNotDraw(false);
        l1 l1Var = new l1(activity, q1Var);
        this.f32117a = l1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f32118b = frameLayout;
        l1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f32119c[i10] = new n1(activity);
            this.f32119c[i10].setAllStarsProvider(new m4.w(this, 13));
            n1 n1Var = this.f32119c[i10];
            n1Var.d = new org.telegram.ui.Components.y2(20, this, activity);
            n1Var.f32110f = i10;
            this.f32118b.addView(n1Var, x5.a(-2.0f, i10 * 41, 0.0f, 0.0f, 0.0f, -2, 51));
        }
        addView(this.f32117a, x5.a(152.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        addView(this.f32118b, x5.a(100.0f, 0.0f, 90.0f, 0.0f, 0.0f, 201, 49));
    }
}
