package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class q21 extends x31 {
    static {
        x31.h(new x31());
    }

    public static y31 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z9, View.OnClickListener onClickListener2, p pVar) {
        y31 K = y31.K(q21.class);
        K.d = i7;
        K.f40568l = charSequence;
        K.f40569m = charSequence2;
        K.f40570n = charSequence3;
        K.D = onClickListener;
        K.f40562e = z9;
        K.E = onClickListener2;
        K.G = pVar;
        return K;
    }

    public static y31 j(int i7, String str, String str2, String str3, n21 n21Var) {
        return i(i7, str, str2, str3, n21Var, false, null, null);
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        View.OnClickListener onClickListener;
        int i7;
        boolean z10;
        int i10;
        r21 r21Var = (r21) view;
        CharSequence charSequence = y31Var.f40568l;
        CharSequence charSequence2 = y31Var.f40569m;
        CharSequence charSequence3 = y31Var.f40570n;
        View.OnClickListener onClickListener2 = y31Var.D;
        boolean z11 = y31Var.f40562e;
        View.OnClickListener onClickListener3 = y31Var.E;
        Object obj = y31Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = r21Var.f37545r;
        LinearLayout linearLayout2 = r21Var.h;
        LinearLayout linearLayout3 = r21Var.f37540b;
        r21Var.f37541c.setText(charSequence);
        r21Var.d.setText(charSequence2);
        r21Var.f37542e.setText(charSequence3);
        ImageView imageView = r21Var.f37543f;
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
        r21Var.f37544n.a(z11, false);
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
        linearLayout.setOnClickListener(new lk(27, r21Var, onClickListener));
        r21Var.updateColors();
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (TextUtils.equals(y31Var.f40568l, y31Var2.f40568l) && TextUtils.equals(y31Var.f40569m, y31Var2.f40569m) && TextUtils.equals(y31Var.f40570n, y31Var2.f40570n) && y31Var.E == y31Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new r21(context, g6Var);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
