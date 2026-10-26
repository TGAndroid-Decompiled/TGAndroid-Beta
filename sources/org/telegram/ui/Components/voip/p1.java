package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.vg1;
public final class p1 extends FrameLayout {
    public final m1 f34001a;
    public final FrameLayout f34002b;
    public final o1[] f34003c;
    public vg1 d;

    public p1(Activity activity, r1 r1Var) {
        super(activity);
        this.f34003c = new o1[5];
        setWillNotDraw(false);
        m1 m1Var = new m1(activity, r1Var);
        this.f34001a = m1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f34002b = frameLayout;
        m1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f34003c[i10] = new o1(activity);
            this.f34003c[i10].setAllStarsProvider(new j1(this, 0));
            o1 o1Var = this.f34003c[i10];
            o1Var.d = new k1(0, this, activity);
            o1Var.f33993f = i10;
            this.f34002b.addView(o1Var, gb1.h(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f34001a, gb1.h(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f34002b, gb1.h(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
