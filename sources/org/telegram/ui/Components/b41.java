package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class b41 extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        j51 J = j51.J(b41.class);
        J.d = i10;
        J.f25127l = charSequence;
        J.f25128m = charSequence2;
        J.f25129n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static j51 b(int i10, String str, String str2, String str3, y31 y31Var) {
        return a(i10, str, str2, str3, y31Var, false, null, null);
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        c41 c41Var = (c41) view;
        CharSequence charSequence = j51Var.f25127l;
        CharSequence charSequence2 = j51Var.f25128m;
        CharSequence charSequence3 = j51Var.f25129n;
        View.OnClickListener onClickListener2 = j51Var.D;
        boolean z12 = j51Var.e;
        View.OnClickListener onClickListener3 = j51Var.E;
        Object obj = j51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = c41Var.f22932r;
        LinearLayout linearLayout2 = c41Var.h;
        LinearLayout linearLayout3 = c41Var.f22928b;
        c41Var.f22929c.setText(charSequence);
        c41Var.d.setText(charSequence2);
        c41Var.e.setText(charSequence3);
        ImageView imageView = c41Var.f22930f;
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
        c41Var.f22931n.a(z12, false);
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
        linearLayout.setOnClickListener(new dt(19, c41Var, onClickListener));
        c41Var.e();
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (TextUtils.equals(j51Var.f25127l, j51Var2.f25127l) && TextUtils.equals(j51Var.f25128m, j51Var2.f25128m) && TextUtils.equals(j51Var.f25129n, j51Var2.f25129n) && j51Var.E == j51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new c41(context, f6Var);
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
