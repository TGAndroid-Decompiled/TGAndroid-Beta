package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class q41 extends x51 {
    static {
        x51.setup(new x51());
    }

    public static y51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        y51 J = y51.J(q41.class);
        J.d = i10;
        J.f30518l = charSequence;
        J.f30519m = charSequence2;
        J.f30520n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static y51 b(int i10, String str, String str2, String str3, n41 n41Var) {
        return a(i10, str, str2, str3, n41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        r41 r41Var = (r41) view;
        CharSequence charSequence = y51Var.f30518l;
        CharSequence charSequence2 = y51Var.f30519m;
        CharSequence charSequence3 = y51Var.f30520n;
        View.OnClickListener onClickListener2 = y51Var.D;
        boolean z12 = y51Var.e;
        View.OnClickListener onClickListener3 = y51Var.E;
        Object obj = y51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = r41Var.f27817r;
        LinearLayout linearLayout2 = r41Var.h;
        LinearLayout linearLayout3 = r41Var.f27813b;
        r41Var.f27814c.setText(charSequence);
        r41Var.d.setText(charSequence2);
        r41Var.e.setText(charSequence3);
        ImageView imageView = r41Var.f27815f;
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
        r41Var.f27816n.a(z12, false);
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
        linearLayout.setOnClickListener(new dt(19, r41Var, onClickListener));
        r41Var.e();
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (TextUtils.equals(y51Var.f30518l, y51Var2.f30518l) && TextUtils.equals(y51Var.f30519m, y51Var2.f30519m) && TextUtils.equals(y51Var.f30520n, y51Var2.f30520n) && y51Var.E == y51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new r41(context, f6Var);
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
