package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class a41 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z4, View.OnClickListener onClickListener2, o oVar) {
        h51 J = h51.J(a41.class);
        J.d = i10;
        J.f27375l = charSequence;
        J.f27376m = charSequence2;
        J.f27377n = charSequence3;
        J.D = onClickListener;
        J.f27369e = z4;
        J.E = onClickListener2;
        J.G = oVar;
        return J;
    }

    public static h51 b(int i10, String str, String str2, String str3, x31 x31Var) {
        return a(i10, str, str2, str3, x31Var, false, null, null);
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z10;
        int i11;
        b41 b41Var = (b41) view;
        CharSequence charSequence = h51Var.f27375l;
        CharSequence charSequence2 = h51Var.f27376m;
        CharSequence charSequence3 = h51Var.f27377n;
        View.OnClickListener onClickListener2 = h51Var.D;
        boolean z11 = h51Var.f27369e;
        View.OnClickListener onClickListener3 = h51Var.E;
        Object obj = h51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = b41Var.f25500r;
        LinearLayout linearLayout2 = b41Var.h;
        LinearLayout linearLayout3 = b41Var.f25495b;
        b41Var.f25496c.setText(charSequence);
        b41Var.d.setText(charSequence2);
        b41Var.f25497e.setText(charSequence3);
        ImageView imageView = b41Var.f25498f;
        int i12 = 8;
        if (onClickListener2 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        linearLayout3.setClickable(z10);
        b41Var.f25499n.a(z11, false);
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
        linearLayout.setOnClickListener(new rx0(4, b41Var, onClickListener));
        b41Var.e();
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (TextUtils.equals(h51Var.f27375l, h51Var2.f27375l) && TextUtils.equals(h51Var.f27376m, h51Var2.f27376m) && TextUtils.equals(h51Var.f27377n, h51Var2.f27377n) && h51Var.E == h51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new b41(context, g6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
