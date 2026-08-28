package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class e31 extends k41 {
    static {
        k41.setup(new k41());
    }

    public static l41 a(int i9, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        l41 J = l41.J(e31.class);
        J.d = i9;
        J.f30339l = charSequence;
        J.f30340m = charSequence2;
        J.f30341n = charSequence3;
        J.D = onClickListener;
        J.f30333e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static l41 b(int i9, String str, String str2, String str3, b31 b31Var) {
        return a(i9, str, str2, str3, b31Var, false, null, null);
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        View.OnClickListener onClickListener;
        int i9;
        boolean z11;
        int i10;
        f31 f31Var = (f31) view;
        CharSequence charSequence = l41Var.f30339l;
        CharSequence charSequence2 = l41Var.f30340m;
        CharSequence charSequence3 = l41Var.f30341n;
        View.OnClickListener onClickListener2 = l41Var.D;
        boolean z12 = l41Var.f30333e;
        View.OnClickListener onClickListener3 = l41Var.E;
        Object obj = l41Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = f31Var.f28262r;
        LinearLayout linearLayout2 = f31Var.h;
        LinearLayout linearLayout3 = f31Var.f28257b;
        f31Var.f28258c.setText(charSequence);
        f31Var.d.setText(charSequence2);
        f31Var.f28259e.setText(charSequence3);
        ImageView imageView = f31Var.f28260f;
        int i11 = 8;
        if (onClickListener2 != null) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        linearLayout3.setClickable(z11);
        f31Var.f28261n.a(z12, false);
        if (onClickListener3 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        linearLayout2.setOnClickListener(onClickListener3);
        if (onClickListener != null) {
            i11 = 0;
        }
        linearLayout.setVisibility(i11);
        linearLayout.setOnClickListener(new vh0(6, f31Var, onClickListener));
        f31Var.d();
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (TextUtils.equals(l41Var.f30339l, l41Var2.f30339l) && TextUtils.equals(l41Var.f30340m, l41Var2.f30340m) && TextUtils.equals(l41Var.f30341n, l41Var2.f30341n) && l41Var.E == l41Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new f31(context, b6Var);
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
