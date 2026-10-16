package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class c51 extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        m61 J = m61.J(c51.class);
        J.d = i10;
        J.f26946l = charSequence;
        J.f26947m = charSequence2;
        J.f26948n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static m61 b(int i10, String str, String str2, String str3, z41 z41Var) {
        return a(i10, str, str2, str3, z41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        d51 d51Var = (d51) view;
        CharSequence charSequence = m61Var.f26946l;
        CharSequence charSequence2 = m61Var.f26947m;
        CharSequence charSequence3 = m61Var.f26948n;
        View.OnClickListener onClickListener2 = m61Var.D;
        boolean z12 = m61Var.e;
        View.OnClickListener onClickListener3 = m61Var.E;
        Object obj = m61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = d51Var.f23990r;
        LinearLayout linearLayout2 = d51Var.h;
        LinearLayout linearLayout3 = d51Var.f23986b;
        d51Var.f23987c.setText(charSequence);
        d51Var.d.setText(charSequence2);
        d51Var.e.setText(charSequence3);
        ImageView imageView = d51Var.f23988f;
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
        d51Var.f23989n.a(z12, false);
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
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (TextUtils.equals(m61Var.f26946l, m61Var2.f26946l) && TextUtils.equals(m61Var.f26947m, m61Var2.f26947m) && TextUtils.equals(m61Var.f26948n, m61Var2.f26948n) && m61Var.E == m61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new d51(context, c6Var);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
