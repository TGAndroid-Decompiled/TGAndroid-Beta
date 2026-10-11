package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class i51 extends q61 {
    static {
        q61.setup(new q61());
    }

    public static r61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        r61 J = r61.J(i51.class);
        J.d = i10;
        J.f30361l = charSequence;
        J.f30362m = charSequence2;
        J.f30363n = charSequence3;
        J.D = onClickListener;
        J.f30355e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static r61 b(int i10, String str, String str2, String str3, f51 f51Var) {
        return a(i10, str, str2, str3, f51Var, false, null, null);
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        j51 j51Var = (j51) view;
        CharSequence charSequence = r61Var.f30361l;
        CharSequence charSequence2 = r61Var.f30362m;
        CharSequence charSequence3 = r61Var.f30363n;
        View.OnClickListener onClickListener2 = r61Var.D;
        boolean z12 = r61Var.f30355e;
        View.OnClickListener onClickListener3 = r61Var.E;
        Object obj = r61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = j51Var.f27576r;
        LinearLayout linearLayout2 = j51Var.h;
        LinearLayout linearLayout3 = j51Var.f27571b;
        j51Var.f27572c.setText(charSequence);
        j51Var.d.setText(charSequence2);
        j51Var.f27573e.setText(charSequence3);
        ImageView imageView = j51Var.f27574f;
        int i12 = 8;
        if (onClickListener2 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        linearLayout3.setClickable(z11);
        j51Var.f27575n.a(z12, false);
        if (onClickListener3 != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
        linearLayout2.setOnClickListener(onClickListener3);
        if (onClickListener != null) {
            i12 = 0;
        }
        linearLayout.setVisibility(i12);
        linearLayout.setOnClickListener(new vt(19, j51Var, onClickListener));
        j51Var.e();
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (TextUtils.equals(r61Var.f30361l, r61Var2.f30361l) && TextUtils.equals(r61Var.f30362m, r61Var2.f30362m) && TextUtils.equals(r61Var.f30363n, r61Var2.f30363n) && r61Var.E == r61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new j51(context, d6Var);
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.d == r61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
