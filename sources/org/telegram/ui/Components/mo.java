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
public final class mo extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f27078a;
    public final ImageView f27079b;
    public final org.telegram.ui.ActionBar.k5 f27080c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final org.telegram.ui.jl f27081f;
    public boolean h;
    public boolean f27082n;

    public mo(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27078a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f27079b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.e(52, 46, 51));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f27080c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTypeface(AndroidUtilities.bold());
        addView(k5Var, k7.b6.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var2;
        k5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(k5Var2);
        addView(k5Var2, k7.b6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var3;
        k5Var3.setTextSize(14);
        k5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        k5Var3.setAlpha(0.0f);
        addView(k5Var3, k7.b6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, context, new ih.k());
        this.f27081f = jlVar;
        jlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(jlVar, k7.b6.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f27082n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.te;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27078a;
        this.f27079b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        this.f27080c.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20233ve, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Xk;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setTextColor(v02);
        k5Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, f6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
    }

    public int[] getColorKeys() {
        return null;
    }
}
