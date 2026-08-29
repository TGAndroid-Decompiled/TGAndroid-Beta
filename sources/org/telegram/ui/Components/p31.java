package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class p31 extends v41 {
    static {
        v41.setup(new v41());
    }

    public static w41 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, p pVar) {
        w41 J = w41.J(p31.class);
        J.d = i10;
        J.f34300l = charSequence;
        J.f34301m = charSequence2;
        J.f34302n = charSequence3;
        J.D = onClickListener;
        J.f34294e = z10;
        J.E = onClickListener2;
        J.G = pVar;
        return J;
    }

    public static w41 b(int i10, String str, String str2, String str3, m31 m31Var) {
        return a(i10, str, str2, str3, m31Var, false, null, null);
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        q31 q31Var = (q31) view;
        CharSequence charSequence = w41Var.f34300l;
        CharSequence charSequence2 = w41Var.f34301m;
        CharSequence charSequence3 = w41Var.f34302n;
        View.OnClickListener onClickListener2 = w41Var.D;
        boolean z12 = w41Var.f34294e;
        View.OnClickListener onClickListener3 = w41Var.E;
        Object obj = w41Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = q31Var.f31850r;
        LinearLayout linearLayout2 = q31Var.h;
        LinearLayout linearLayout3 = q31Var.f31845b;
        q31Var.f31846c.setText(charSequence);
        q31Var.d.setText(charSequence2);
        q31Var.f31847e.setText(charSequence3);
        ImageView imageView = q31Var.f31848f;
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
        q31Var.f31849n.a(z12, false);
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
        linearLayout.setOnClickListener(new fi0(7, q31Var, onClickListener));
        q31Var.e();
    }

    @Override
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        if (TextUtils.equals(w41Var.f34300l, w41Var2.f34300l) && TextUtils.equals(w41Var.f34301m, w41Var2.f34301m) && TextUtils.equals(w41Var.f34302n, w41Var2.f34302n) && w41Var.E == w41Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new q31(context, c6Var);
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
