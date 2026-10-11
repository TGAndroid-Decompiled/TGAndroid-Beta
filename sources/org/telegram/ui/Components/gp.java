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
public final class gp extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f26788a;
    public final ImageView f26789b;
    public final org.telegram.ui.ActionBar.h5 f26790c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f26791e;
    public final org.telegram.ui.nl f26792f;
    public boolean h;
    public boolean f26793n;

    public gp(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f26788a = d6Var;
        ImageView imageView = new ImageView(context);
        this.f26789b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(52, 46, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f26790c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        addView(h5Var, w7.x5.a(18.0f, 52.0f, 6.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2, w7.x5.a(18.0f, 52.0f, 24.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.f26791e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        h5Var3.setAlpha(0.0f);
        addView(h5Var3, w7.x5.a(18.0f, 52.0f, 24.0f, 0.0f, 0.0f, -1, 51));
        org.telegram.ui.nl nlVar = new org.telegram.ui.nl(this, context, new vh.g());
        this.f26792f = nlVar;
        nlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(nlVar, w7.x5.a(34.0f, 52.0f, 6.0f, 0.0f, 0.0f, 34, 51));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f26793n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.f21089te;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26788a;
        this.f26789b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        this.f26790c.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21125ve, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.Xk;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.setTextColor(w02);
        h5Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        this.f26791e.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
