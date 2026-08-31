package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class oo extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f29829a;
    public final ImageView f29830b;
    public final org.telegram.ui.ActionBar.l5 f29831c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final org.telegram.ui.ActionBar.l5 f29832e;
    public final org.telegram.ui.jl f29833f;
    public boolean h;
    public boolean f29834n;

    public oo(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29829a = g6Var;
        ImageView imageView = new ImageView(context);
        this.f29830b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.e(52, 46, 51));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f29831c = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTypeface(AndroidUtilities.bold());
        addView(l5Var, k7.c6.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var2;
        l5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(l5Var2);
        addView(l5Var2, k7.c6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var3 = new org.telegram.ui.ActionBar.l5(context);
        this.f29832e = l5Var3;
        l5Var3.setTextSize(14);
        l5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        l5Var3.setAlpha(0.0f);
        addView(l5Var3, k7.c6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, context, new jh.k());
        this.f29833f = jlVar;
        jlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(jlVar, k7.c6.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f29834n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.te;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29829a;
        this.f29830b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        this.f29831c.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21987ve, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Xk;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.setTextColor(v02);
        l5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21720gc, g6Var));
        this.f29832e.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
