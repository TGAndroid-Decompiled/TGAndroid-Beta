package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

public final class g31 extends m41 {
    static {
        m41.setup(new g31());
    }

    public static n41 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        n41 n41VarJ = n41.J(g31.class);
        n41VarJ.d = i10;
        n41VarJ.f30844l = charSequence;
        n41VarJ.f30845m = charSequence2;
        n41VarJ.f30846n = charSequence3;
        n41VarJ.D = onClickListener;
        n41VarJ.f30838e = z10;
        n41VarJ.E = onClickListener2;
        n41VarJ.G = nVar;
        return n41VarJ;
    }

    public static n41 b(int i10, String str, String str2, String str3, d31 d31Var) {
        return a(i10, str, str2, str3, d31Var, false, null, null);
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        h31 h31Var = (h31) view;
        CharSequence charSequence = n41Var.f30844l;
        CharSequence charSequence2 = n41Var.f30845m;
        CharSequence charSequence3 = n41Var.f30846n;
        View.OnClickListener onClickListener = n41Var.D;
        boolean z11 = n41Var.f30838e;
        View.OnClickListener onClickListener2 = n41Var.E;
        Object obj = n41Var.G;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = h31Var.f28921r;
        LinearLayout linearLayout2 = h31Var.h;
        LinearLayout linearLayout3 = h31Var.f28916b;
        h31Var.f28917c.setText(charSequence);
        h31Var.d.setText(charSequence2);
        h31Var.f28918e.setText(charSequence3);
        h31Var.f28919f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        h31Var.f28920n.a(z11, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new xh0(7, h31Var, onClickListener3));
        h31Var.d();
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return TextUtils.equals(n41Var.f30844l, n41Var2.f30844l) && TextUtils.equals(n41Var.f30845m, n41Var2.f30845m) && TextUtils.equals(n41Var.f30846n, n41Var2.f30846n) && n41Var.E == n41Var2.E;
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new h31(context, c6Var);
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.d == n41Var2.d;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
