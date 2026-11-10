package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class yn extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f40619a;
    public final ImageView f40620b;
    public final org.telegram.ui.ActionBar.m5 f40621c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final org.telegram.ui.ActionBar.m5 f40622e;
    public final org.telegram.ui.rk f40623f;
    public boolean h;
    public boolean f40624n;

    public yn(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f40619a = h6Var;
        ImageView imageView = new ImageView(context);
        this.f40620b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.e(52, 46, 51));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f40621c = m5Var;
        m5Var.setTextSize(14);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(m5Var, c8.ha.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var2;
        m5Var2.setTextSize(14);
        org.telegram.messenger.qs.i(m5Var2);
        addView(m5Var2, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
        this.f40622e = m5Var3;
        m5Var3.setTextSize(14);
        m5Var3.l(org.telegram.messenger.id.M0(2131744272, null), false);
        m5Var3.setAlpha(0.0f);
        addView(m5Var3, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, context, new xh.f());
        this.f40623f = rkVar;
        rkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(rkVar, c8.ha.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27972hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28027kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f40624n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.f27972hf;
        org.telegram.ui.ActionBar.h6 h6Var = this.f40619a;
        this.f40620b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), PorterDuff.Mode.MULTIPLY));
        this.f40621c.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28027kf, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.Ll;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        m5Var.setTextColor(w02);
        m5Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Uc, h6Var));
        this.f40622e.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
    }
}
