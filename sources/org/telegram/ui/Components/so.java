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
public final class so extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f28323a;
    public final ImageView f28324b;
    public final org.telegram.ui.ActionBar.h5 f28325c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final org.telegram.ui.il f28326f;
    public boolean h;
    public boolean f28327n;

    public so(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28323a = d6Var;
        ImageView imageView = new ImageView(context);
        this.f28324b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.e(52, 46, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f28325c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        addView(h5Var, w7.y5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2, w7.y5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        h5Var3.setAlpha(0.0f);
        addView(h5Var3, w7.y5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, context, new vh.g());
        this.f28326f = ilVar;
        ilVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(ilVar, w7.y5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f28327n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.f19361te;
        org.telegram.ui.ActionBar.d6 d6Var = this.f28323a;
        this.f28324b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        this.f28325c.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19397ve, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.Xk;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.setTextColor(v02);
        h5Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
