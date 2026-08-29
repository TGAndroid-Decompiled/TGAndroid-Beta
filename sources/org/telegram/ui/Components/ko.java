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
public final class ko extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f30112a;
    public final ImageView f30113b;
    public final org.telegram.ui.ActionBar.h5 f30114c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f30115e;
    public final org.telegram.ui.dl f30116f;
    public boolean h;
    public boolean f30117n;

    public ko(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30112a = c6Var;
        ImageView imageView = new ImageView(context);
        this.f30113b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, i7.f6.e(52, 46, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f30114c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        addView(h5Var, i7.f6.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2, i7.f6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.f30115e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        h5Var3.setAlpha(0.0f);
        addView(h5Var3, i7.f6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.dl dlVar = new org.telegram.ui.dl(this, context, new gh.k());
        this.f30116f = dlVar;
        dlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(dlVar, i7.f6.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f30117n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.f23354te;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30112a;
        this.f30113b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        this.f30114c.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23391ve, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Xk;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.setTextColor(v02);
        h5Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        this.f30115e.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
