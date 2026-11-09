package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class u20 extends FrameLayout {
    public final int f38571a;
    public final org.telegram.ui.ActionBar.g6 f38572b;
    public ArrayList f38573c;
    public final FrameLayout d;
    public final r41 f38574e;
    public final m41 f38575f;
    public org.telegram.messenger.c20 h;

    public u20(int i7, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f38571a = i7;
        this.f38572b = g6Var;
        r41 r41Var = new r41(activity, i7, 0, false, new d(this, 15), new t20(this), new t20(this), g6Var);
        this.f38574e = r41Var;
        r41Var.setClipToPadding(false);
        m41 m41Var = (m41) r41Var.getAdapter();
        this.f38575f = m41Var;
        m41Var.f35945r = false;
        addView(r41Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.l6.f28030m6;
        org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231607);
        frameLayout.addView(imageView, c8.ha.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
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
        this.f38574e.j(s0Var);
    }
}
