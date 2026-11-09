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
public class f31 extends org.telegram.ui.ActionBar.v2 {
    public final int f33572i1;
    public final GradientDrawable f33573j1;
    public final u31 f33574k1;
    public int l1;

    public f31(Context context, org.telegram.ui.ActionBar.f2 f2Var, u31 u31Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, true);
        this.f33572i1 = org.telegram.messenger.g0.L(12.0f);
        this.f33573j1 = new GradientDrawable();
        e31 e31Var = new e31(this, context);
        e31Var.addView(u31Var, c8.ha.c(-1.0f, -1));
        this.f28624b = e31Var;
        this.f33574k1 = u31Var;
        u31Var.setParentFragment(f2Var);
        u31Var.setOnScrollListener(new c31(this));
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27938h5));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        u31 u31Var = this.f33574k1;
        Objects.requireNonNull(u31Var);
        s6 s6Var = new s6(u31Var, 7);
        i31 i31Var = u31Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.u6(i31Var.f33704a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.u6(i31Var.f33705b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Q5));
        t31 t31Var = u31Var.f38585s;
        j31 j31Var = u31Var.f38583n;
        t31Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, s6Var);
        arrayList.add(new org.telegram.ui.ActionBar.u6(j31Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.l6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.l6.Ei));
        jg.d2 d2Var = u31Var.f38586w;
        j31 j31Var2 = u31Var.f38583n;
        d2Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, s6Var);
        int i7 = org.telegram.ui.ActionBar.l6.If;
        arrayList.add(new org.telegram.ui.ActionBar.u6(j31Var2, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(j31Var2, 4, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.u6(j31Var2, 8, new Class[]{org.telegram.ui.Cells.j8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Kf));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, org.telegram.ui.ActionBar.l6.Jf));
        arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i7));
        ImageView imageView = d2Var.L;
        int i10 = org.telegram.ui.ActionBar.l6.Af;
        arrayList.add(new org.telegram.ui.ActionBar.u6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(d2Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.u6(u31Var.f38582f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.u6(u31Var.f38587x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27938h5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        u31 u31Var = this.f33574k1;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(u31Var.f38578a);
        f10.n(u31Var, org.telegram.messenger.qs.f25104x0);
        f10.n(u31Var, org.telegram.messenger.qs.f25118z0);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25026k1, 2);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25021j1, 2);
    }

    @Override
    public final void u0(boolean z9) {
        this.f28649q0 = true;
    }
}
