package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.uh1;
import w7.y5;
public final class p1 extends FrameLayout {
    public final m1 f29549a;
    public final FrameLayout f29550b;
    public final o1[] f29551c;
    public uh1 d;

    public p1(Activity activity, r1 r1Var) {
        super(activity);
        this.f29551c = new o1[5];
        setWillNotDraw(false);
        m1 m1Var = new m1(activity, r1Var);
        this.f29549a = m1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f29550b = frameLayout;
        m1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f29551c[i10] = new o1(activity);
            this.f29551c[i10].setAllStarsProvider(new le.b(this, 13));
            o1 o1Var = this.f29551c[i10];
            o1Var.d = new org.telegram.ui.Components.w2(20, this, activity);
            o1Var.f29522f = i10;
            this.f29550b.addView(o1Var, y5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f29549a, y5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f29550b, y5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
