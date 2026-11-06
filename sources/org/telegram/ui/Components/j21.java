package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class j21 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z9, View.OnClickListener onClickListener2, p pVar) {
        r31 K = r31.K(j21.class);
        K.d = i7;
        K.f37598l = charSequence;
        K.f37599m = charSequence2;
        K.f37600n = charSequence3;
        K.D = onClickListener;
        K.f37592e = z9;
        K.E = onClickListener2;
        K.G = pVar;
        return K;
    }

    public static r31 j(int i7, String str, String str2, String str3, g21 g21Var) {
        return i(i7, str, str2, str3, g21Var, false, null, null);
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        View.OnClickListener onClickListener;
        int i7;
        boolean z10;
        int i10;
        k21 k21Var = (k21) view;
        CharSequence charSequence = r31Var.f37598l;
        CharSequence charSequence2 = r31Var.f37599m;
        CharSequence charSequence3 = r31Var.f37600n;
        View.OnClickListener onClickListener2 = r31Var.D;
        boolean z11 = r31Var.f37592e;
        View.OnClickListener onClickListener3 = r31Var.E;
        Object obj = r31Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = k21Var.f35154r;
        LinearLayout linearLayout2 = k21Var.h;
        LinearLayout linearLayout3 = k21Var.f35149b;
        k21Var.f35150c.setText(charSequence);
        k21Var.d.setText(charSequence2);
        k21Var.f35151e.setText(charSequence3);
        ImageView imageView = k21Var.f35152f;
        int i11 = 8;
        if (onClickListener2 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        linearLayout3.setClickable(z10);
        k21Var.f35153n.a(z11, false);
        if (onClickListener3 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        linearLayout2.setOnClickListener(onClickListener3);
        if (onClickListener != null) {
            i11 = 0;
        }
        linearLayout.setVisibility(i11);
        linearLayout.setOnClickListener(new lk(27, k21Var, onClickListener));
        k21Var.updateColors();
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (TextUtils.equals(r31Var.f37598l, r31Var2.f37598l) && TextUtils.equals(r31Var.f37599m, r31Var2.f37599m) && TextUtils.equals(r31Var.f37600n, r31Var2.f37600n) && r31Var.E == r31Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new k21(context, f6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
