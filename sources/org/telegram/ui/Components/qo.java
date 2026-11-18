package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class qo extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f38847a;
    public final ImageView f38848b;
    public final org.telegram.ui.ActionBar.n5 f38849c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final org.telegram.ui.ActionBar.n5 f38850e;
    public final org.telegram.ui.qk f38851f;
    public boolean h;
    public boolean f38852n;

    public qo(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f38847a = i6Var;
        ImageView imageView = new ImageView(context);
        this.f38848b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.e(52, 46, 51));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f38849c = n5Var;
        n5Var.setTextSize(14);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        addView(n5Var, c8.ma.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var2;
        n5Var2.setTextSize(14);
        org.telegram.messenger.ks.i(n5Var2);
        addView(n5Var2, c8.ma.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(context);
        this.f38850e = n5Var3;
        n5Var3.setTextSize(14);
        n5Var3.l(org.telegram.messenger.gd.M0(2131744037, null), false);
        n5Var3.setAlpha(0.0f);
        addView(n5Var3, c8.ma.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.qk qkVar = new org.telegram.ui.qk(this, context, new xh.f());
        this.f38851f = qkVar;
        qkVar.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(qkVar, c8.ma.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29551lf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29586nf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ol));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f38852n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.f29551lf;
        org.telegram.ui.ActionBar.i6 i6Var = this.f38847a;
        this.f38848b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), PorterDuff.Mode.MULTIPLY));
        this.f38849c.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29586nf, i6Var));
        int i10 = org.telegram.ui.ActionBar.n6.Ol;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setTextColor(w02);
        n5Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xc, i6Var));
        this.f38850e.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
    }
}
