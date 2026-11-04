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
public class z21 extends org.telegram.ui.ActionBar.t2 {
    public final int f40900j1;
    public final GradientDrawable k1;
    public final n31 f40901l1;
    public int m1;

    public z21(Context context, org.telegram.ui.ActionBar.d2 d2Var, n31 n31Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, true);
        this.f40900j1 = org.telegram.messenger.g0.L(12.0f);
        this.k1 = new GradientDrawable();
        y21 y21Var = new y21(this, context);
        y21Var.addView(n31Var, b8.mf.c(-1.0f, -1));
        this.f28586b = y21Var;
        this.f40901l1 = n31Var;
        n31Var.setParentFragment(d2Var);
        n31Var.setOnScrollListener(new w21(this));
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27954h5));
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        n31 n31Var = this.f40901l1;
        Objects.requireNonNull(n31Var);
        q6 q6Var = new q6(n31Var, 7);
        c31 c31Var = n31Var.h;
        arrayList.add(new org.telegram.ui.ActionBar.t6(c31Var.f34738a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.O5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(c31Var.f34739b, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Q5));
        m31 m31Var = n31Var.f36361s;
        d31 d31Var = n31Var.f36359n;
        m31Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, q6Var);
        arrayList.add(new org.telegram.ui.ActionBar.t6(d31Var, 4, new Class[]{org.telegram.ui.Cells.r3.class}, new String[]{"delButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.Bi));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.Ei));
        kg.y1 y1Var = n31Var.f36362w;
        y1Var.getClass();
        org.telegram.ui.Cells.u3.a(arrayList, q6Var);
        int i3 = org.telegram.ui.ActionBar.k6.If;
        arrayList.add(new org.telegram.ui.ActionBar.t6(d31Var, 4, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(d31Var, 4, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"urlTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(d31Var, 8, new Class[]{org.telegram.ui.Cells.i8.class}, new String[]{"buttonView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, org.telegram.ui.ActionBar.k6.Jf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i3));
        ImageView imageView = y1Var.M;
        int i10 = org.telegram.ui.ActionBar.k6.Af;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(y1Var.N, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(n31Var.f36358f, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(n31Var.f36363x, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27954h5));
        return arrayList;
    }

    @Override
    public void dismiss() {
        super.dismiss();
        n31 n31Var = this.f40901l1;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(n31Var.f36354a);
        f10.n(n31Var, org.telegram.messenger.hs.f23333x0);
        f10.n(n31Var, org.telegram.messenger.hs.f23347z0);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 2);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 2);
    }

    @Override
    public final void u0(boolean z10) {
        this.f28614r0 = true;
    }
}
