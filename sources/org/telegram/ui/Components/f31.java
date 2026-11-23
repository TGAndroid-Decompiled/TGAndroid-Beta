package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class f31 extends m41 {
    static {
        m41.h(new m41());
    }

    public static n41 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, s sVar) {
        n41 K = n41.K(f31.class);
        K.d = i7;
        K.f37655m = charSequence;
        K.f37656n = charSequence2;
        K.f37657o = charSequence3;
        K.E = onClickListener;
        K.f37648e = z10;
        K.F = onClickListener2;
        K.H = sVar;
        return K;
    }

    public static n41 j(int i7, String str, String str2, String str3, c31 c31Var) {
        return i(i7, str, str2, str3, c31Var, false, null, null);
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        View.OnClickListener onClickListener;
        int i7;
        boolean z11;
        int i10;
        g31 g31Var = (g31) view;
        CharSequence charSequence = n41Var.f37655m;
        CharSequence charSequence2 = n41Var.f37656n;
        CharSequence charSequence3 = n41Var.f37657o;
        View.OnClickListener onClickListener2 = n41Var.E;
        boolean z12 = n41Var.f37648e;
        View.OnClickListener onClickListener3 = n41Var.F;
        Object obj = n41Var.H;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = g31Var.f35307r;
        LinearLayout linearLayout2 = g31Var.h;
        LinearLayout linearLayout3 = g31Var.f35302b;
        g31Var.f35303c.setText(charSequence);
        g31Var.d.setText(charSequence2);
        g31Var.f35304e.setText(charSequence3);
        ImageView imageView = g31Var.f35305f;
        int i11 = 8;
        if (onClickListener2 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        linearLayout3.setClickable(z11);
        g31Var.f35306n.a(z12, false);
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
        linearLayout.setOnClickListener(new l8(29, g31Var, onClickListener));
        g31Var.updateColors();
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (TextUtils.equals(n41Var.f37655m, n41Var2.f37655m) && TextUtils.equals(n41Var.f37656n, n41Var2.f37656n) && TextUtils.equals(n41Var.f37657o, n41Var2.f37657o) && n41Var.F == n41Var2.F) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new g31(context, i6Var);
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
