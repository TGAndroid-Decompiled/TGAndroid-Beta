package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import ji.m5;
import org.telegram.ui.ki1;
import w7.z5;
public final class m1 extends FrameLayout {
    public final j1 f29996a;
    public final FrameLayout f29997b;
    public final l1[] f29998c;
    public ki1 d;

    public m1(Activity activity, o1 o1Var) {
        super(activity);
        this.f29998c = new l1[5];
        setWillNotDraw(false);
        j1 j1Var = new j1(activity, o1Var);
        this.f29996a = j1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f29997b = frameLayout;
        j1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f29998c[i10] = new l1(activity);
            this.f29998c[i10].setAllStarsProvider(new m5(this, 17));
            l1 l1Var = this.f29998c[i10];
            l1Var.d = new org.telegram.ui.Components.u2(22, this, activity);
            l1Var.f29986f = i10;
            this.f29997b.addView(l1Var, z5.a(-2.0f, i10 * 41, 0.0f, 0.0f, 0.0f, -2, 51));
        }
        addView(this.f29996a, z5.a(152.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        addView(this.f29997b, z5.a(100.0f, 0.0f, 90.0f, 0.0f, 0.0f, 201, 49));
    }
}
