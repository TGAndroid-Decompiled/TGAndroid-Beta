package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class io extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f27043a;
    public final ImageView f27044b;
    public final org.telegram.ui.ActionBar.u5 f27045c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final org.telegram.ui.ActionBar.u5 e;
    public final org.telegram.ui.ll f27046f;
    public boolean h;
    public boolean f27047n;

    public io(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f27043a = p6Var;
        ImageView imageView = new ImageView(context);
        this.f27044b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.e(52, 46, 51));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f27045c = u5Var;
        u5Var.setTextSize(14);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        addView(u5Var, w7.b6.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var2;
        u5Var2.setTextSize(14);
        org.telegram.messenger.zs.i(u5Var2);
        addView(u5Var2, w7.b6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var3 = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var3;
        u5Var3.setTextSize(14);
        u5Var3.l(org.telegram.messenger.cd.L0(2131744298, null), false);
        u5Var3.setAlpha(0.0f);
        addView(u5Var3, w7.b6.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ll llVar = new org.telegram.ui.ll(this, context, new nh.i());
        this.f27046f = llVar;
        llVar.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
        addView(llVar, w7.b6.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21009hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21067kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Uc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f27047n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.f21009hf;
        org.telegram.ui.ActionBar.p6 p6Var = this.f27043a;
        this.f27044b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), PorterDuff.Mode.MULTIPLY));
        this.f27045c.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21067kf, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.Ll;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.setTextColor(w02);
        u5Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, p6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
    }
}
