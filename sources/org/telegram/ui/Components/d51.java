package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class d51 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        l61 J = l61.J(d51.class);
        J.d = i10;
        J.f28227l = charSequence;
        J.f28228m = charSequence2;
        J.f28229n = charSequence3;
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
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        e51 e51Var = (e51) view;
        CharSequence charSequence = l61Var.f28227l;
        CharSequence charSequence2 = l61Var.f28228m;
        CharSequence charSequence3 = l61Var.f28229n;
        View.OnClickListener onClickListener2 = l61Var.D;
        boolean z12 = l61Var.e;
        View.OnClickListener onClickListener3 = l61Var.E;
        Object obj = l61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = e51Var.f25969r;
        LinearLayout linearLayout2 = e51Var.h;
        LinearLayout linearLayout3 = e51Var.f25965b;
        e51Var.f25966c.setText(charSequence);
        e51Var.d.setText(charSequence2);
        e51Var.e.setText(charSequence3);
        ImageView imageView = e51Var.f25967f;
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
        e51Var.f25968n.a(z12, false);
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
        linearLayout.setOnClickListener(new c51(0, e51Var, onClickListener));
        e51Var.updateColors();
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (TextUtils.equals(l61Var.f28227l, l61Var2.f28227l) && TextUtils.equals(l61Var.f28228m, l61Var2.f28228m) && TextUtils.equals(l61Var.f28229n, l61Var2.f28229n) && l61Var.E == l61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new e51(context, g6Var);
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
