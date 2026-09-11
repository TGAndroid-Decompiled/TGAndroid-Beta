package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import ji.k5;
import org.telegram.ui.ci1;
import w7.x5;
public final class m1 extends FrameLayout {
    public final j1 f31644a;
    public final FrameLayout f31645b;
    public final l1[] f31646c;
    public ci1 d;

    public m1(Activity activity, o1 o1Var) {
        super(activity);
        this.f31646c = new l1[5];
        setWillNotDraw(false);
        j1 j1Var = new j1(activity, o1Var);
        this.f31644a = j1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f31645b = frameLayout;
        j1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f31646c[i10] = new l1(activity);
            this.f31646c[i10].setAllStarsProvider(new k5(this, 12));
            l1 l1Var = this.f31646c[i10];
            l1Var.d = new org.telegram.ui.Components.b3(19, this, activity);
            l1Var.f31635f = i10;
            this.f31645b.addView(l1Var, x5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f31644a, x5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f31645b, x5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
