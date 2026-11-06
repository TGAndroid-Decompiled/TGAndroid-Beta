package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class t20 extends FrameLayout {
    public final int f38195a;
    public final org.telegram.ui.ActionBar.f6 f38196b;
    public ArrayList f38197c;
    public final FrameLayout d;
    public final p41 f38198e;
    public final k41 f38199f;
    public org.telegram.messenger.c20 h;

    public t20(int i7, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f38195a = i7;
        this.f38196b = f6Var;
        p41 p41Var = new p41(activity, i7, 0, false, new d(this, 15), new s20(this), new s20(this), f6Var);
        this.f38198e = p41Var;
        p41Var.setClipToPadding(false);
        k41 k41Var = (k41) p41Var.getAdapter();
        this.f38199f = k41Var;
        k41Var.f35132r = false;
        addView(p41Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.k6.f28013m6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231607);
        frameLayout.addView(imageView, c8.ha.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setText(org.telegram.messenger.hd.M0(2131749352, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ha.e(210, -2, 17));
        p41Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.c20 c20Var) {
        this.h = c20Var;
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.f38198e.j(s0Var);
    }
}
