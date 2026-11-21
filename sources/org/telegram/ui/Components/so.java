package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class so extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f39643a;
    public final ImageView f39644b;
    public final org.telegram.ui.ActionBar.m5 f39645c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final org.telegram.ui.ActionBar.m5 f39646e;
    public final org.telegram.ui.qk f39647f;
    public boolean h;
    public boolean f39648n;

    public so(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f39643a = h6Var;
        ImageView imageView = new ImageView(context);
        this.f39644b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.e(52, 46, 51));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f39645c = m5Var;
        m5Var.setTextSize(14);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(m5Var, c8.ma.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var2;
        m5Var2.setTextSize(14);
        org.telegram.messenger.ks.i(m5Var2);
        addView(m5Var2, c8.ma.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
        this.f39646e = m5Var3;
        m5Var3.setTextSize(14);
        m5Var3.l(org.telegram.messenger.gd.N0(2131744031, null), false);
        m5Var3.setAlpha(0.0f);
        addView(m5Var3, c8.ma.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.qk qkVar = new org.telegram.ui.qk(this, context, new xh.f());
        this.f39647f = qkVar;
        qkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(qkVar, c8.ma.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29533lf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29568nf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ol));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Xc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f39648n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.f29533lf;
        org.telegram.ui.ActionBar.h6 h6Var = this.f39643a;
        this.f39644b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), PorterDuff.Mode.MULTIPLY));
        this.f39645c.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29568nf, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.Ol;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        m5Var.setTextColor(w02);
        m5Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xc, h6Var));
        this.f39646e.setTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
    }
}
