package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
public final class h30 extends FrameLayout {
    public final int f35773a;
    public final org.telegram.ui.ActionBar.h6 f35774b;
    public ArrayList f35775c;
    public final FrameLayout d;
    public final h51 f35776e;
    public final c51 f35777f;
    public org.telegram.messenger.x10 h;

    public h30(int i7, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f35773a = i7;
        this.f35774b = h6Var;
        h51 h51Var = new h51(activity, i7, 0, false, new d(this, 16), new g30(this), new g30(this), h6Var);
        this.f35776e = h51Var;
        h51Var.setClipToPadding(false);
        c51 c51Var = (c51) h51Var.getAdapter();
        this.f35777f = c51Var;
        c51Var.f34068r = false;
        addView(h51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.m6.f29543m6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231608);
        frameLayout.addView(imageView, c8.ma.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setText(org.telegram.messenger.gd.N0(2131749160, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ma.e(210, -2, 17));
        h51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.x10 x10Var) {
        this.h = x10Var;
    }

    public void setOnScrollListener(v4.u0 u0Var) {
        this.f35776e.j(u0Var);
    }
}
