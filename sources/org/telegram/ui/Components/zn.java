package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class zn extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f41023a;
    public final ImageView f41024b;
    public final org.telegram.ui.ActionBar.l5 f41025c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final org.telegram.ui.ActionBar.l5 f41026e;
    public final org.telegram.ui.rk f41027f;
    public boolean h;
    public boolean f41028n;

    public zn(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f41023a = g6Var;
        ImageView imageView = new ImageView(context);
        this.f41024b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.e(52, 46, 51));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f41025c = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(l5Var, c8.ha.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var2;
        l5Var2.setTextSize(14);
        org.telegram.messenger.qs.i(l5Var2);
        addView(l5Var2, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var3 = new org.telegram.ui.ActionBar.l5(context);
        this.f41026e = l5Var3;
        l5Var3.setTextSize(14);
        l5Var3.l(org.telegram.messenger.id.M0(2131744272, null), false);
        l5Var3.setAlpha(0.0f);
        addView(l5Var3, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, context, new xh.f());
        this.f41027f = rkVar;
        rkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(rkVar, c8.ha.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27947hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28002kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Uc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f41028n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.f27947hf;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41023a;
        this.f41024b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.l6.w0(i7, g6Var), PorterDuff.Mode.MULTIPLY));
        this.f41025c.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28002kf, g6Var));
        int i10 = org.telegram.ui.ActionBar.l6.Ll;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        org.telegram.ui.ActionBar.l5 l5Var = this.d;
        l5Var.setTextColor(w02);
        l5Var.setLinkTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Uc, g6Var));
        this.f41026e.setTextColor(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
    }
}
