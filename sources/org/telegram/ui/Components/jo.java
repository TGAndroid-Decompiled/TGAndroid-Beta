package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class jo extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f36122a;
    public final ImageView f36123b;
    public final org.telegram.ui.ActionBar.j5 f36124c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 f36125e;
    public final org.telegram.ui.pk f36126f;
    public boolean h;
    public boolean f36127n;

    public jo(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f36122a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f36123b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.e(52, 46, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f36124c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(j5Var, c8.ja.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var2;
        j5Var2.setTextSize(14);
        org.telegram.messenger.ns.i(j5Var2);
        addView(j5Var2, c8.ja.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.f36125e = j5Var3;
        j5Var3.setTextSize(14);
        j5Var3.l(org.telegram.messenger.hd.M0(2131744272, null), false);
        j5Var3.setAlpha(0.0f);
        addView(j5Var3, c8.ja.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, context, new xh.f());
        this.f36126f = pkVar;
        pkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(pkVar, c8.ja.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29004lf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29039nf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ol));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Xc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f36127n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.f29004lf;
        org.telegram.ui.ActionBar.e6 e6Var = this.f36122a;
        this.f36123b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i7, e6Var), PorterDuff.Mode.MULTIPLY));
        this.f36124c.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29039nf, e6Var));
        int i10 = org.telegram.ui.ActionBar.j6.Ol;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setTextColor(w02);
        j5Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xc, e6Var));
        this.f36125e.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
    }
}
