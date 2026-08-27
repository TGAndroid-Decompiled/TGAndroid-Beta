package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.ui.tg1;

public final class l1 extends FrameLayout {

    public final i1 f33699a;

    public final FrameLayout f33700b;

    public final k1[] f33701c;
    public tg1 d;

    public l1(Activity activity, n1 n1Var) {
        super(activity);
        this.f33701c = new k1[5];
        setWillNotDraw(false);
        i1 i1Var = new i1(activity, n1Var);
        this.f33699a = i1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f33700b = frameLayout;
        i1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f33701c[i10] = new k1(activity);
            this.f33701c[i10].setAllStarsProvider(new lh.p(this, 13));
            k1 k1Var = this.f33701c[i10];
            k1Var.d = new org.telegram.ui.Components.g1(28, this, activity);
            k1Var.f33686f = i10;
            this.f33700b.addView(k1Var, z5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f33699a, z5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f33700b, z5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
