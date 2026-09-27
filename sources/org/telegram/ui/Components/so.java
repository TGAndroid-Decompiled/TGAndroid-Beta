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
public final class so extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f28343a;
    public final ImageView f28344b;
    public final org.telegram.ui.ActionBar.j5 f28345c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final org.telegram.ui.jl f28346f;
    public boolean h;
    public boolean f28347n;

    public so(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f28343a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f28344b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.e(52, 46, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f28345c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        addView(j5Var, w7.y5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var2;
        j5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(j5Var2);
        addView(j5Var2, w7.y5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var3;
        j5Var3.setTextSize(14);
        j5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        j5Var3.setAlpha(0.0f);
        addView(j5Var3, w7.y5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, context, new vh.g());
        this.f28346f = jlVar;
        jlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(jlVar, w7.y5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f28347n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.f19361te;
        org.telegram.ui.ActionBar.e6 e6Var = this.f28343a;
        this.f28344b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        this.f28345c.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19397ve, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.Xk;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setTextColor(v02);
        j5Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
