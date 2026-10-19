package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.pg1;
import w7.z5;
public final class m1 extends FrameLayout {
    public final j1 f31610a;
    public final FrameLayout f31611b;
    public final l1[] f31612c;
    public pg1 d;

    public m1(Activity activity, o1 o1Var) {
        super(activity);
        this.f31612c = new l1[5];
        setWillNotDraw(false);
        j1 j1Var = new j1(activity, o1Var);
        this.f31610a = j1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f31611b = frameLayout;
        j1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f31612c[i10] = new l1(activity);
            this.f31612c[i10].setAllStarsProvider(new j5.b(this, 26));
            l1 l1Var = this.f31612c[i10];
            l1Var.d = new org.telegram.ui.Components.q2(24, this, activity);
            l1Var.f31601f = i10;
            this.f31611b.addView(l1Var, z5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f31610a, z5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f31611b, z5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
