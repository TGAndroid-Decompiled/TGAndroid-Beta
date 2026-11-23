package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class g31 extends n41 {
    static {
        n41.h(new n41());
    }

    public static o41 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, t tVar) {
        o41 K = o41.K(g31.class);
        K.d = i7;
        K.f38091m = charSequence;
        K.f38092n = charSequence2;
        K.f38093o = charSequence3;
        K.E = onClickListener;
        K.f38084e = z10;
        K.F = onClickListener2;
        K.H = tVar;
        return K;
    }

    public static o41 j(int i7, String str, String str2, String str3, d31 d31Var) {
        return i(i7, str, str2, str3, d31Var, false, null, null);
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        View.OnClickListener onClickListener;
        int i7;
        boolean z11;
        int i10;
        h31 h31Var = (h31) view;
        CharSequence charSequence = o41Var.f38091m;
        CharSequence charSequence2 = o41Var.f38092n;
        CharSequence charSequence3 = o41Var.f38093o;
        View.OnClickListener onClickListener2 = o41Var.E;
        boolean z12 = o41Var.f38084e;
        View.OnClickListener onClickListener3 = o41Var.F;
        Object obj = o41Var.H;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = h31Var.f35777r;
        LinearLayout linearLayout2 = h31Var.h;
        LinearLayout linearLayout3 = h31Var.f35772b;
        h31Var.f35773c.setText(charSequence);
        h31Var.d.setText(charSequence2);
        h31Var.f35774e.setText(charSequence3);
        ImageView imageView = h31Var.f35775f;
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
        h31Var.f35776n.a(z12, false);
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
        linearLayout.setOnClickListener(new m8(29, h31Var, onClickListener));
        h31Var.updateColors();
    }

    @Override
    public final boolean c(o41 o41Var, o41 o41Var2) {
        if (TextUtils.equals(o41Var.f38091m, o41Var2.f38091m) && TextUtils.equals(o41Var.f38092n, o41Var2.f38092n) && TextUtils.equals(o41Var.f38093o, o41Var2.f38093o) && o41Var.F == o41Var2.F) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new h31(context, h6Var);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.d == o41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
