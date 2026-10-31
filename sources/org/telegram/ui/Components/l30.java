package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class l30 extends FrameLayout {
    public final int f28001a;
    public final org.telegram.ui.ActionBar.p6 f28002b;
    public ArrayList f28003c;
    public final FrameLayout d;
    public final u51 e;
    public final p51 f28004f;
    public org.telegram.messenger.q20 h;

    public l30(int i10, Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.f28001a = i10;
        this.f28002b = p6Var;
        u51 u51Var = new u51(activity, i10, 0, false, new d(this, 15), new k30(this), new k30(this), p6Var);
        this.e = u51Var;
        u51Var.setClipToPadding(false);
        p51 p51Var = (p51) u51Var.getAdapter();
        this.f28004f = p51Var;
        p51Var.f29295r = false;
        addView(u51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.t6.f21095m6;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231608);
        frameLayout.addView(imageView, w7.b6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setText(org.telegram.messenger.cd.L0(2131749362, null));
        textView.setGravity(17);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.b6.e(210, -2, 17));
        u51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.q20 q20Var) {
        this.h = q20Var;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
