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

public final class eo extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final org.telegram.ui.ActionBar.c6 f28101a;

    public final ImageView f28102b;

    public final org.telegram.ui.ActionBar.h5 f28103c;
    public final org.telegram.ui.ActionBar.h5 d;

    public final org.telegram.ui.ActionBar.h5 f28104e;

    public final org.telegram.ui.cl f28105f;
    public boolean h;

    public boolean f28106n;

    public eo(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28101a = c6Var;
        ImageView imageView = new ImageView(context);
        this.f28102b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, h7.z5.e(52, 46, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f28103c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        addView(h5Var, h7.z5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2, h7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.f28104e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        h5Var3.setAlpha(0.0f);
        addView(h5Var3, h7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.cl clVar = new org.telegram.ui.cl(this, context, new eh.k());
        this.f28105f = clVar;
        clVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(clVar, h7.z5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.f23347te;
        org.telegram.ui.ActionBar.c6 c6Var = this.f28101a;
        this.f28102b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        this.f28103c.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23381ve, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.Xk;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.setTextColor(iV0);
        h5Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        this.f28104e.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f28106n) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public int[] getColorKeys() {
        return null;
    }
}
