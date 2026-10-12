package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class c51 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        l61 J = l61.J(c51.class);
        J.d = i10;
        J.f26954l = charSequence;
        J.f26955m = charSequence2;
        J.f26956n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static l61 b(int i10, String str, String str2, String str3, z41 z41Var) {
        return a(i10, str, str2, str3, z41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        d51 d51Var = (d51) view;
        CharSequence charSequence = l61Var.f26954l;
        CharSequence charSequence2 = l61Var.f26955m;
        CharSequence charSequence3 = l61Var.f26956n;
        View.OnClickListener onClickListener2 = l61Var.D;
        boolean z12 = l61Var.e;
        View.OnClickListener onClickListener3 = l61Var.E;
        Object obj = l61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = d51Var.f24300r;
        LinearLayout linearLayout2 = d51Var.h;
        LinearLayout linearLayout3 = d51Var.f24296b;
        d51Var.f24297c.setText(charSequence);
        d51Var.d.setText(charSequence2);
        d51Var.e.setText(charSequence3);
        ImageView imageView = d51Var.f24298f;
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
        d51Var.f24299n.a(z12, false);
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
        linearLayout.setOnClickListener(new rt(19, d51Var, onClickListener));
        d51Var.d();
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (TextUtils.equals(l61Var.f26954l, l61Var2.f26954l) && TextUtils.equals(l61Var.f26955m, l61Var2.f26955m) && TextUtils.equals(l61Var.f26956n, l61Var2.f26956n) && l61Var.E == l61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new d51(context, c6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
