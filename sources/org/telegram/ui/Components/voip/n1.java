package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.Components.km;
import org.telegram.ui.hi1;
import w7.a6;
public final class n1 extends FrameLayout {
    public final k1 f28287a;
    public final FrameLayout f28288b;
    public final m1[] f28289c;
    public hi1 d;

    public n1(Activity activity, p1 p1Var) {
        super(activity);
        this.f28289c = new m1[5];
        setWillNotDraw(false);
        k1 k1Var = new k1(activity, p1Var);
        this.f28287a = k1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f28288b = frameLayout;
        k1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f28289c[i10] = new m1(activity);
            this.f28289c[i10].setAllStarsProvider(new org.telegram.tgnet.j(this, 4));
            m1 m1Var = this.f28289c[i10];
            m1Var.d = new km(14, this, activity);
            m1Var.f28277f = i10;
            this.f28288b.addView(m1Var, a6.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f28287a, a6.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f28288b, a6.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
