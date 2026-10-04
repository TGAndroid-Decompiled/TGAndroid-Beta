package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class y41 extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        g61 J = g61.J(y41.class);
        J.d = i10;
        J.f26674l = charSequence;
        J.f26675m = charSequence2;
        J.f26676n = charSequence3;
        J.D = onClickListener;
        J.f26668e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static g61 b(int i10, String str, String str2, String str3, v41 v41Var) {
        return a(i10, str, str2, str3, v41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        z41 z41Var = (z41) view;
        CharSequence charSequence = g61Var.f26674l;
        CharSequence charSequence2 = g61Var.f26675m;
        CharSequence charSequence3 = g61Var.f26676n;
        View.OnClickListener onClickListener2 = g61Var.D;
        boolean z12 = g61Var.f26668e;
        View.OnClickListener onClickListener3 = g61Var.E;
        Object obj = g61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = z41Var.f33392r;
        LinearLayout linearLayout2 = z41Var.h;
        LinearLayout linearLayout3 = z41Var.f33387b;
        z41Var.f33388c.setText(charSequence);
        z41Var.d.setText(charSequence2);
        z41Var.f33389e.setText(charSequence3);
        ImageView imageView = z41Var.f33390f;
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
        z41Var.f33391n.a(z12, false);
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
        linearLayout.setOnClickListener(new gt(19, z41Var, onClickListener));
        z41Var.e();
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (TextUtils.equals(g61Var.f26674l, g61Var2.f26674l) && TextUtils.equals(g61Var.f26675m, g61Var2.f26675m) && TextUtils.equals(g61Var.f26676n, g61Var2.f26676n) && g61Var.E == g61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new z41(context, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
