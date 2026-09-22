package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.Components.mf;
import org.telegram.ui.ci1;
import w7.x5;
public final class o1 extends FrameLayout {
    public final l1 f29114a;
    public final FrameLayout f29115b;
    public final n1[] f29116c;
    public ci1 d;

    public o1(Activity activity, q1 q1Var) {
        super(activity);
        this.f29116c = new n1[5];
        setWillNotDraw(false);
        l1 l1Var = new l1(activity, q1Var);
        this.f29114a = l1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f29115b = frameLayout;
        l1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f29116c[i10] = new n1(activity);
            this.f29116c[i10].setAllStarsProvider(new k2.v(this, 12));
            n1 n1Var = this.f29116c[i10];
            n1Var.d = new mf(18, this, activity);
            n1Var.f29107f = i10;
            this.f29115b.addView(n1Var, x5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f29114a, x5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f29115b, x5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
