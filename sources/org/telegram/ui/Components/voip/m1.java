package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import k7.c6;
import mh.m5;
import org.telegram.ui.qh1;
public final class m1 extends FrameLayout {
    public final j1 f32194a;
    public final FrameLayout f32195b;
    public final l1[] f32196c;
    public qh1 d;

    public m1(Activity activity, o1 o1Var) {
        super(activity);
        this.f32196c = new l1[5];
        setWillNotDraw(false);
        j1 j1Var = new j1(activity, o1Var);
        this.f32194a = j1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f32195b = frameLayout;
        j1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f32196c[i10] = new l1(activity);
            this.f32196c[i10].setAllStarsProvider(new m5(this, 19));
            l1 l1Var = this.f32196c[i10];
            l1Var.d = new org.telegram.ui.Components.o1(27, this, activity);
            l1Var.f32183f = i10;
            this.f32195b.addView(l1Var, c6.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f32194a, c6.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f32195b, c6.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
