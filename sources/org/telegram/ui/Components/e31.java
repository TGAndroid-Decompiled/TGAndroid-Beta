package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
public class e31 extends org.telegram.ui.ActionBar.v2 {
    public final int f33190i1;
    public final GradientDrawable f33191j1;
    public final t31 f33192k1;
    public int l1;

    public e31(Context context, org.telegram.ui.ActionBar.f2 f2Var, t31 t31Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, true);
        this.f33190i1 = org.telegram.messenger.g0.L(12.0f);
        this.f33191j1 = new GradientDrawable();
        d31 d31Var = new d31(this, context);
        d31Var.addView(t31Var, c8.ha.c(-1.0f, -1));
        this.f28619b = d31Var;
        this.f33192k1 = t31Var;
        t31Var.setParentFragment(f2Var);
        t31Var.setOnScrollListener(new b31(this));
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27925h5));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        t31 t31Var = this.f33192k1;
        Objects.requireNonNull(t31Var);
        s6 s6Var = new s6(t31Var, 7);
        h31 h31Var = t31Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.t6(h31Var.f33327a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(h31Var.f33328b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q5));
        s31 s31Var = t31Var.f38231s;
        i31 i31Var = t31Var.f38229n;
        s31Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, s6Var);
        arrayList.add(new org.telegram.ui.ActionBar.t6(i31Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Ei));
        jg.d2 d2Var = t31Var.f38232w;
        d2Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, s6Var);
        int i7 = org.telegram.ui.ActionBar.k6.If;
        arrayList.add(new org.telegram.ui.ActionBar.t6(i31Var, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(i31Var, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(i31Var, 8, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.k6.Jf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i7));
        ImageView imageView = d2Var.L;
        int i10 = org.telegram.ui.ActionBar.k6.Af;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(d2Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t31Var.f38228f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(t31Var.f38233x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27925h5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        t31 t31Var = this.f33192k1;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(t31Var.f38224a);
        f10.n(t31Var, org.telegram.messenger.qs.f25104x0);
        f10.n(t31Var, org.telegram.messenger.qs.f25118z0);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25026k1, 2);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25021j1, 2);
    }

    @Override
    public final void u0(boolean z9) {
        this.f28644q0 = true;
    }
}
