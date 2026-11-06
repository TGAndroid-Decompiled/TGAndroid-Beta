package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class zn extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f41030a;
    public final ImageView f41031b;
    public final org.telegram.ui.ActionBar.k5 f41032c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final org.telegram.ui.ActionBar.k5 f41033e;
    public final org.telegram.ui.pk f41034f;
    public boolean h;
    public boolean f41035n;

    public zn(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f41030a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f41031b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.e(52, 46, 51));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f41032c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(k5Var, c8.ha.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var2;
        k5Var2.setTextSize(14);
        org.telegram.messenger.qs.i(k5Var2);
        addView(k5Var2, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.f41033e = k5Var3;
        k5Var3.setTextSize(14);
        k5Var3.l(org.telegram.messenger.hd.M0(2131744273, null), false);
        k5Var3.setAlpha(0.0f);
        addView(k5Var3, c8.ha.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, new xh.f());
        this.f41034f = pkVar;
        pkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(pkVar, c8.ha.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27930hf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27985kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f41035n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.f27930hf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f41030a;
        this.f41031b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), PorterDuff.Mode.MULTIPLY));
        this.f41032c.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27985kf, f6Var));
        int i10 = org.telegram.ui.ActionBar.k6.Ll;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setTextColor(w02);
        k5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, f6Var));
        this.f41033e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
    }
}
