package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.ui.wg1;
public final class m1 extends FrameLayout {
    public final j1 f33851a;
    public final FrameLayout f33852b;
    public final l1[] f33853c;
    public wg1 d;

    public m1(Activity activity, o1 o1Var) {
        super(activity);
        this.f33853c = new l1[5];
        setWillNotDraw(false);
        j1 j1Var = new j1(activity, o1Var);
        this.f33851a = j1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f33852b = frameLayout;
        j1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f33853c[i10] = new l1(activity);
            this.f33853c[i10].setAllStarsProvider(new l4.s0(this, 22));
            l1 l1Var = this.f33853c[i10];
            l1Var.d = new org.telegram.ui.Components.j1(28, this, activity);
            l1Var.f33834f = i10;
            this.f33852b.addView(l1Var, f6.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f33851a, f6.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f33852b, f6.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
