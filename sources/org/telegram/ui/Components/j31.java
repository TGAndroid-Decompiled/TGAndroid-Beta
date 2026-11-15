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
public class j31 extends org.telegram.ui.ActionBar.u2 {
    public final int f35849m1;
    public final GradientDrawable n1;
    public final x31 f35850o1;
    public int f35851p1;

    public j31(Context context, org.telegram.ui.ActionBar.e2 e2Var, x31 x31Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        this.f35849m1 = org.telegram.messenger.g0.L(12.0f);
        this.n1 = new GradientDrawable();
        i31 i31Var = new i31(this, context);
        i31Var.addView(x31Var, c8.ja.c(-1.0f, -1));
        this.f29682b = i31Var;
        this.f35850o1 = x31Var;
        x31Var.setParentFragment(e2Var);
        x31Var.setOnScrollListener(new g31(this));
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.zj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28922h5));
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        x31 x31Var = this.f35850o1;
        Objects.requireNonNull(x31Var);
        q6 q6Var = new q6(x31Var, 7);
        m31 m31Var = x31Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.s6(m31Var.f36037a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.s6(m31Var.f36038b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Q5));
        w31 w31Var = x31Var.f41551s;
        n31 n31Var = x31Var.f41549n;
        w31Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, q6Var);
        arrayList.add(new org.telegram.ui.ActionBar.s6(n31Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ii));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.Ei));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.Hi));
        jg.c2 c2Var = x31Var.f41552w;
        n31 n31Var2 = x31Var.f41549n;
        c2Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, q6Var);
        int i7 = org.telegram.ui.ActionBar.j6.Lf;
        arrayList.add(new org.telegram.ui.ActionBar.s6(n31Var2, 4, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(n31Var2, 4, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(n31Var2, 8, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.j6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i7));
        ImageView imageView = c2Var.M;
        int i10 = org.telegram.ui.ActionBar.j6.Df;
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c2Var.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(x31Var.f41548f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.s6(x31Var.f41553x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28922h5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        x31 x31Var = this.f35850o1;
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(x31Var.f41544a);
        f10.n(x31Var, org.telegram.messenger.ns.f25600x0);
        f10.n(x31Var, org.telegram.messenger.ns.f25614z0);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25522k1, 2);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25517j1, 2);
    }

    @Override
    public final void u0(boolean z10) {
        this.f29713r0 = true;
    }
}
