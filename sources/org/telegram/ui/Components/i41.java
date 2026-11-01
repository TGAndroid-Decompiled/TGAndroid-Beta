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
public class i41 extends org.telegram.ui.ActionBar.z2 {
    public final int f27000i1;
    public final GradientDrawable f27001j1;
    public final x41 f27002k1;
    public int l1;

    public i41(Context context, org.telegram.ui.ActionBar.k2 k2Var, x41 x41Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, true);
        this.f27000i1 = org.telegram.messenger.i0.L(12.0f);
        this.f27001j1 = new GradientDrawable();
        h41 h41Var = new h41(this, context);
        h41Var.addView(x41Var, w7.b6.c(-1.0f, -1));
        this.f21587b = h41Var;
        this.f27002k1 = x41Var;
        x41Var.setParentFragment(k2Var);
        x41Var.setOnScrollListener(new f41(this));
    }

    @Override
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21002h5));
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        x41 x41Var = this.f27002k1;
        Objects.requireNonNull(x41Var);
        o6 o6Var = new o6(x41Var, 7);
        l41 l41Var = x41Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.c7(l41Var.f27126a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(l41Var.f27127b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Q5));
        w41 w41Var = x41Var.f32417s;
        m41 m41Var = x41Var.f32415n;
        w41Var.getClass();
        org.telegram.ui.Cells.w3.a(arrayList, o6Var);
        arrayList.add(new org.telegram.ui.ActionBar.c7(m41Var, 4, new Class[]{org.telegram.ui.Cells.t3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.Ei));
        zf.o1 o1Var = x41Var.f32418w;
        o1Var.getClass();
        org.telegram.ui.Cells.w3.a(arrayList, o6Var);
        int i10 = org.telegram.ui.ActionBar.t6.If;
        arrayList.add(new org.telegram.ui.ActionBar.c7(m41Var, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(m41Var, 4, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(m41Var, 8, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kf));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, org.telegram.ui.ActionBar.t6.Jf));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, o6Var, i10));
        ImageView imageView = o1Var.L;
        int i11 = org.telegram.ui.ActionBar.t6.Af;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(o1Var.M, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(x41Var.f32414f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.c7(x41Var.f32419x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        x41 x41Var = this.f27002k1;
        org.telegram.messenger.at f7 = org.telegram.messenger.at.f(x41Var.f32411a);
        f7.n(x41Var, org.telegram.messenger.at.f14814x0);
        f7.n(x41Var, org.telegram.messenger.at.f14827z0);
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14735k1, 2);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14729j1, 2);
    }

    @Override
    public final void u0(boolean z10) {
        this.f21611q0 = true;
    }
}
