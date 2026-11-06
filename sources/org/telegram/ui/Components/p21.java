package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class p21 extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z9, View.OnClickListener onClickListener2, p pVar) {
        x31 K = x31.K(p21.class);
        K.d = i7;
        K.f40159l = charSequence;
        K.f40160m = charSequence2;
        K.f40161n = charSequence3;
        K.D = onClickListener;
        K.f40153e = z9;
        K.E = onClickListener2;
        K.G = pVar;
        return K;
    }

    public static x31 j(int i7, String str, String str2, String str3, m21 m21Var) {
        return i(i7, str, str2, str3, m21Var, false, null, null);
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        View.OnClickListener onClickListener;
        int i7;
        boolean z10;
        int i10;
        q21 q21Var = (q21) view;
        CharSequence charSequence = x31Var.f40159l;
        CharSequence charSequence2 = x31Var.f40160m;
        CharSequence charSequence3 = x31Var.f40161n;
        View.OnClickListener onClickListener2 = x31Var.D;
        boolean z11 = x31Var.f40153e;
        View.OnClickListener onClickListener3 = x31Var.E;
        Object obj = x31Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = q21Var.f37151r;
        LinearLayout linearLayout2 = q21Var.h;
        LinearLayout linearLayout3 = q21Var.f37146b;
        q21Var.f37147c.setText(charSequence);
        q21Var.d.setText(charSequence2);
        q21Var.f37148e.setText(charSequence3);
        ImageView imageView = q21Var.f37149f;
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
        q21Var.f37150n.a(z11, false);
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
        linearLayout.setOnClickListener(new lk(27, q21Var, onClickListener));
        q21Var.updateColors();
    }

    @Override
    public final boolean c(x31 x31Var, x31 x31Var2) {
        if (TextUtils.equals(x31Var.f40159l, x31Var2.f40159l) && TextUtils.equals(x31Var.f40160m, x31Var2.f40160m) && TextUtils.equals(x31Var.f40161n, x31Var2.f40161n) && x31Var.E == x31Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q21(context, f6Var);
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        if (x31Var.d == x31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
