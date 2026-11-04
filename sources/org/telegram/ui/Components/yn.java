package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class yn extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f40786a;
    public final ImageView f40787b;
    public final org.telegram.ui.ActionBar.k5 f40788c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final org.telegram.ui.ActionBar.k5 f40789e;
    public final org.telegram.ui.lk f40790f;
    public boolean h;
    public boolean f40791n;

    public yn(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f40786a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f40787b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b8.mf.e(52, 46, 51));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f40788c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(k5Var, b8.mf.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var2;
        k5Var2.setTextSize(14);
        org.telegram.messenger.hs.i(k5Var2);
        addView(k5Var2, b8.mf.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.f40789e = k5Var3;
        k5Var3.setTextSize(14);
        k5Var3.l(org.telegram.messenger.bd.M0(2131744282, null), false);
        k5Var3.setAlpha(0.0f);
        addView(k5Var3, b8.mf.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, context, new yh.f());
        this.f40790f = lkVar;
        lkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(lkVar, b8.mf.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27962hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28015kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f40791n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.f27962hf;
        org.telegram.ui.ActionBar.e6 e6Var = this.f40786a;
        this.f40787b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), PorterDuff.Mode.MULTIPLY));
        this.f40788c.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28015kf, e6Var));
        int i10 = org.telegram.ui.ActionBar.k6.Ll;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setTextColor(w02);
        k5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, e6Var));
        this.f40789e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
    }
}
