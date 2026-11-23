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
public class w31 extends org.telegram.ui.ActionBar.w2 {
    public final int f41641m1;
    public final GradientDrawable n1;
    public final k41 f41642o1;
    public int f41643p1;

    public w31(Context context, org.telegram.ui.ActionBar.g2 g2Var, k41 k41Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        this.f41641m1 = org.telegram.messenger.g0.L(12.0f);
        this.n1 = new GradientDrawable();
        v31 v31Var = new v31(this, context);
        v31Var.addView(k41Var, c8.ma.c(-1.0f, -1));
        this.f30176b = v31Var;
        this.f41642o1 = k41Var;
        k41Var.setParentFragment(g2Var);
        k41Var.setOnScrollListener(new t31(this));
    }

    @Override
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29454h5));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        k41 k41Var = this.f41642o1;
        Objects.requireNonNull(k41Var);
        x6 x6Var = new x6(k41Var, 7);
        z31 z31Var = k41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.v6(z31Var.f39939a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(z31Var.f39940b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Q5));
        j41 j41Var = k41Var.f36775s;
        a41 a41Var = k41Var.f36773n;
        j41Var.getClass();
        org.telegram.ui.Cells.v3.a(arrayList, x6Var);
        arrayList.add(new org.telegram.ui.ActionBar.v6(a41Var, 4, new Class[]{org.telegram.ui.Cells.s3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.m6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.m6.Hi));
        jg.c2 c2Var = k41Var.f36776w;
        c2Var.getClass();
        org.telegram.ui.Cells.v3.a(arrayList, x6Var);
        int i7 = org.telegram.ui.ActionBar.m6.Lf;
        arrayList.add(new org.telegram.ui.ActionBar.v6(a41Var, 4, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(a41Var, 4, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(a41Var, 8, new Class[]{org.telegram.ui.Cells.k8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, org.telegram.ui.ActionBar.m6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i7));
        ImageView imageView = c2Var.M;
        int i10 = org.telegram.ui.ActionBar.m6.Df;
        arrayList.add(new org.telegram.ui.ActionBar.v6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(c2Var.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(k41Var.f36772f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.v6(k41Var.f36777x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29454h5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        k41 k41Var = this.f41642o1;
        org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(k41Var.f36768a);
        f10.n(k41Var, org.telegram.messenger.ls.f25412x0);
        f10.n(k41Var, org.telegram.messenger.ls.f25426z0);
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25334k1, 2);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25329j1, 2);
    }

    @Override
    public final void u0(boolean z10) {
        this.f30207r0 = true;
    }
}
