package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.ui.bi1;
import w7.y5;
public final class o1 extends FrameLayout {
    public final l1 f29520a;
    public final FrameLayout f29521b;
    public final n1[] f29522c;
    public bi1 d;

    public o1(Activity activity, q1 q1Var) {
        super(activity);
        this.f29522c = new n1[5];
        setWillNotDraw(false);
        l1 l1Var = new l1(activity, q1Var);
        this.f29520a = l1Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f29521b = frameLayout;
        l1Var.setVisibility(8);
        frameLayout.setVisibility(8);
        for (int i10 = 0; i10 < 5; i10++) {
            this.f29522c[i10] = new n1(activity);
            this.f29522c[i10].setAllStarsProvider(new k2.v(this, 13));
            n1 n1Var = this.f29522c[i10];
            n1Var.d = new org.telegram.ui.Components.a3(19, this, activity);
            n1Var.f29513f = i10;
            this.f29521b.addView(n1Var, y5.d(-2, -2.0f, 51, i10 * 41, 0.0f, 0.0f, 0.0f));
        }
        addView(this.f29520a, y5.d(300, 152.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(this.f29521b, y5.d(201, 100.0f, 49, 0.0f, 90.0f, 0.0f, 0.0f));
    }
}
