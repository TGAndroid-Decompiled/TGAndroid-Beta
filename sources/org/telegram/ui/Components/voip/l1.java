package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.ui.ug1;
public final class l1 extends FrameLayout {
    public final i1 f33649a;
    public final FrameLayout f33650b;
    public final k1[] f33651c;
    public ug1 d;

    public l1(Activity activity, n1 n1Var) {
        super(activity);
        this.f33651c = new k1[5];
        setWillNotDraw(false);
        i1 i1Var = new i1(activity, n1Var);
        this.f33649a = i1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f33650b = frameLayout;
        i1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i9 = 0; i9 < 5; i9++) {
            this.f33651c[i9] = new k1(activity);
            this.f33651c[i9].setAllStarsProvider(new kh.p(this, 13));
            k1 k1Var = this.f33651c[i9];
            k1Var.d = new org.telegram.ui.Components.g1(28, this, activity);
            k1Var.f33636f = i9;
            this.f33650b.addView(k1Var, e6.d(-2, -2.0f, 51, i9 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f33649a, e6.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f33650b, e6.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
