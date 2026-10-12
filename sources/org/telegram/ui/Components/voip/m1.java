package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import ji.m5;
import org.telegram.ui.ki1;
import w7.a6;
public final class m1 extends FrameLayout {
    public final j1 f30327a;
    public final FrameLayout f30328b;
    public final l1[] f30329c;
    public ki1 d;

    public m1(Activity activity, o1 o1Var) {
        super(activity);
        this.f30329c = new l1[5];
        setWillNotDraw(false);
        j1 j1Var = new j1(activity, o1Var);
        this.f30327a = j1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f30328b = frameLayout;
        j1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f30329c[i10] = new l1(activity);
            this.f30329c[i10].setAllStarsProvider(new m5(this, 17));
            l1 l1Var = this.f30329c[i10];
            l1Var.d = new org.telegram.ui.Components.t2(23, this, activity);
            l1Var.f30317f = i10;
            this.f30328b.addView(l1Var, a6.a(-2.0f, i10 * 41, 0.0f, 0.0f, 0.0f, -2, 51));
        }
        addView(this.f30327a, a6.a(152.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        addView(this.f30328b, a6.a(100.0f, 0.0f, 90.0f, 0.0f, 0.0f, 201, 49));
    }
}
