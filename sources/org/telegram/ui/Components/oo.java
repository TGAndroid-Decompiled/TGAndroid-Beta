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
    public final org.telegram.ui.ActionBar.g6 f29835a;
    public final ImageView f29836b;
    public final org.telegram.ui.ActionBar.l5 f29837c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final org.telegram.ui.ActionBar.l5 f29838e;
    public final org.telegram.ui.jl f29839f;
    public boolean h;
    public boolean f29840n;

    public oo(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29835a = g6Var;
        ImageView imageView = new ImageView(context);
        this.f29836b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.e(52, 46, 51));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f29837c = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTypeface(AndroidUtilities.bold());
        addView(l5Var, k7.c6.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var2;
        l5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(l5Var2);
        addView(l5Var2, k7.c6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var3 = new org.telegram.ui.ActionBar.l5(context);
        this.f29838e = l5Var3;
        l5Var3.setTextSize(14);
        l5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        l5Var3.setAlpha(0.0f);
        addView(l5Var3, k7.c6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, context, new jh.k());
        this.f29839f = jlVar;
        jlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(jlVar, k7.c6.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f29840n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.te;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29835a;
        this.f29836b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        this.f29837c.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21989ve, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Xk;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.setTextColor(v02);
        l5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, g6Var));
        this.f29838e.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
