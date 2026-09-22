package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class a41 extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        i51 J = i51.J(a41.class);
        J.d = i10;
        J.f24900l = charSequence;
        J.f24901m = charSequence2;
        J.f24902n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static i51 b(int i10, String str, String str2, String str3, x31 x31Var) {
        return a(i10, str, str2, str3, x31Var, false, null, null);
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        b41 b41Var = (b41) view;
        CharSequence charSequence = i51Var.f24900l;
        CharSequence charSequence2 = i51Var.f24901m;
        CharSequence charSequence3 = i51Var.f24902n;
        View.OnClickListener onClickListener2 = i51Var.D;
        boolean z12 = i51Var.e;
        View.OnClickListener onClickListener3 = i51Var.E;
        Object obj = i51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = b41Var.f22614r;
        LinearLayout linearLayout2 = b41Var.h;
        LinearLayout linearLayout3 = b41Var.f22610b;
        b41Var.f22611c.setText(charSequence);
        b41Var.d.setText(charSequence2);
        b41Var.e.setText(charSequence3);
        ImageView imageView = b41Var.f22612f;
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
        b41Var.f22613n.a(z12, false);
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
        linearLayout.setOnClickListener(new dt(19, b41Var, onClickListener));
        b41Var.e();
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (TextUtils.equals(i51Var.f24900l, i51Var2.f24900l) && TextUtils.equals(i51Var.f24901m, i51Var2.f24901m) && TextUtils.equals(i51Var.f24902n, i51Var2.f24902n) && i51Var.E == i51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new b41(context, e6Var);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
