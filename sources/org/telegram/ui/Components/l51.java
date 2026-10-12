package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class l51 extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        u61 J = u61.J(l51.class);
        J.d = i10;
        J.f31076l = charSequence;
        J.f31077m = charSequence2;
        J.f31078n = charSequence3;
        J.D = onClickListener;
        J.f31070e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static u61 b(int i10, String str, String str2, String str3, i51 i51Var) {
        return a(i10, str, str2, str3, i51Var, false, null, null);
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        m51 m51Var = (m51) view;
        CharSequence charSequence = u61Var.f31076l;
        CharSequence charSequence2 = u61Var.f31077m;
        CharSequence charSequence3 = u61Var.f31078n;
        View.OnClickListener onClickListener2 = u61Var.D;
        boolean z12 = u61Var.f31070e;
        View.OnClickListener onClickListener3 = u61Var.E;
        Object obj = u61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = m51Var.f28408r;
        LinearLayout linearLayout2 = m51Var.h;
        LinearLayout linearLayout3 = m51Var.f28403b;
        m51Var.f28404c.setText(charSequence);
        m51Var.d.setText(charSequence2);
        m51Var.f28405e.setText(charSequence3);
        ImageView imageView = m51Var.f28406f;
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
        m51Var.f28407n.a(z12, false);
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
        linearLayout.setOnClickListener(new wt(19, m51Var, onClickListener));
        m51Var.e();
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (TextUtils.equals(u61Var.f31076l, u61Var2.f31076l) && TextUtils.equals(u61Var.f31077m, u61Var2.f31077m) && TextUtils.equals(u61Var.f31078n, u61Var2.f31078n) && u61Var.E == u61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new m51(context, c6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
