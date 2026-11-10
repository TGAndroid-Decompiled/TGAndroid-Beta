package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class t20 extends FrameLayout {
    public final int f38143a;
    public final org.telegram.ui.ActionBar.h6 f38144b;
    public ArrayList f38145c;
    public final FrameLayout d;
    public final r41 f38146e;
    public final m41 f38147f;
    public org.telegram.messenger.c20 h;

    public t20(int i7, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f38143a = i7;
        this.f38144b = h6Var;
        r41 r41Var = new r41(activity, i7, 0, false, new d(this, 15), new s20(this), new s20(this), h6Var);
        this.f38146e = r41Var;
        r41Var.setClipToPadding(false);
        m41 m41Var = (m41) r41Var.getAdapter();
        this.f38147f = m41Var;
        m41Var.f35845r = false;
        addView(r41Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.m6.f28055m6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231607);
        frameLayout.addView(imageView, c8.ha.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setText(org.telegram.messenger.id.M0(2131749353, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ha.e(210, -2, 17));
        r41Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.c20 c20Var) {
        this.h = c20Var;
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.f38146e.j(s0Var);
    }
}
