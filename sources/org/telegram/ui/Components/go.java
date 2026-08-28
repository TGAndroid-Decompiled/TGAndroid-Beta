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
public final class go extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 f28821a;
    public final ImageView f28822b;
    public final org.telegram.ui.ActionBar.h5 f28823c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f28824e;
    public final org.telegram.ui.al f28825f;
    public boolean h;
    public boolean f28826n;

    public go(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f28821a = b6Var;
        ImageView imageView = new ImageView(context);
        this.f28822b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, g7.e6.e(52, 46, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f28823c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        addView(h5Var, g7.e6.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2, g7.e6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.f28824e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        h5Var3.setAlpha(0.0f);
        addView(h5Var3, g7.e6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.al alVar = new org.telegram.ui.al(this, context, new dh.l());
        this.f28825f = alVar;
        alVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(alVar, g7.e6.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.f23293te;
        org.telegram.ui.ActionBar.b6 b6Var = this.f28821a;
        this.f28822b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), PorterDuff.Mode.MULTIPLY));
        this.f28823c.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23324ve, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.Xk;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.setTextColor(v02);
        h5Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        this.f28824e.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f28826n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int[] getColorKeys() {
        return null;
    }
}
