package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class p41 extends w51 {
    static {
        w51.setup(new w51());
    }

    public static x51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        x51 J = x51.J(p41.class);
        J.d = i10;
        J.f30292l = charSequence;
        J.f30293m = charSequence2;
        J.f30294n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static x51 b(int i10, String str, String str2, String str3, m41 m41Var) {
        return a(i10, str, str2, str3, m41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        q41 q41Var = (q41) view;
        CharSequence charSequence = x51Var.f30292l;
        CharSequence charSequence2 = x51Var.f30293m;
        CharSequence charSequence3 = x51Var.f30294n;
        View.OnClickListener onClickListener2 = x51Var.D;
        boolean z12 = x51Var.e;
        View.OnClickListener onClickListener3 = x51Var.E;
        Object obj = x51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = q41Var.f27537r;
        LinearLayout linearLayout2 = q41Var.h;
        LinearLayout linearLayout3 = q41Var.f27533b;
        q41Var.f27534c.setText(charSequence);
        q41Var.d.setText(charSequence2);
        q41Var.e.setText(charSequence3);
        ImageView imageView = q41Var.f27535f;
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
        q41Var.f27536n.a(z12, false);
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
        linearLayout.setOnClickListener(new ft(19, q41Var, onClickListener));
        q41Var.e();
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (TextUtils.equals(x51Var.f30292l, x51Var2.f30292l) && TextUtils.equals(x51Var.f30293m, x51Var2.f30293m) && TextUtils.equals(x51Var.f30294n, x51Var2.f30294n) && x51Var.E == x51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new q41(context, d6Var);
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.d == x51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
