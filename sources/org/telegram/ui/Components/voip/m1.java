package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.rg1;
import w7.z5;
public final class m1 extends FrameLayout {
    public final j1 f31606a;
    public final FrameLayout f31607b;
    public final l1[] f31608c;
    public rg1 d;

    public m1(Activity activity, o1 o1Var) {
        super(activity);
        this.f31608c = new l1[5];
        setWillNotDraw(false);
        j1 j1Var = new j1(activity, o1Var);
        this.f31606a = j1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f31607b = frameLayout;
        j1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f31608c[i10] = new l1(activity);
            this.f31608c[i10].setAllStarsProvider(new j5.b(this, 26));
            l1 l1Var = this.f31608c[i10];
            l1Var.d = new org.telegram.ui.Components.q2(24, this, activity);
            l1Var.f31597f = i10;
            this.f31607b.addView(l1Var, z5.a(-2.0f, i10 * 41, 0.0f, 0.0f, 0.0f, -2, 51));
        }
        addView(this.f31606a, z5.a(152.0f, 0.0f, 0.0f, 0.0f, 0.0f, 300, 49));
        addView(this.f31607b, z5.a(100.0f, 0.0f, 90.0f, 0.0f, 0.0f, 201, 49));
    }
}
