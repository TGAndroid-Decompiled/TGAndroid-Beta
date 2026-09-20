package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class o41 extends v51 {
    static {
        v51.setup(new v51());
    }

    public static w51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        w51 J = w51.J(o41.class);
        J.d = i10;
        J.f29948l = charSequence;
        J.f29949m = charSequence2;
        J.f29950n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static w51 b(int i10, String str, String str2, String str3, l41 l41Var) {
        return a(i10, str, str2, str3, l41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        p41 p41Var = (p41) view;
        CharSequence charSequence = w51Var.f29948l;
        CharSequence charSequence2 = w51Var.f29949m;
        CharSequence charSequence3 = w51Var.f29950n;
        View.OnClickListener onClickListener2 = w51Var.D;
        boolean z12 = w51Var.e;
        View.OnClickListener onClickListener3 = w51Var.E;
        Object obj = w51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = p41Var.f27147r;
        LinearLayout linearLayout2 = p41Var.h;
        LinearLayout linearLayout3 = p41Var.f27143b;
        p41Var.f27144c.setText(charSequence);
        p41Var.d.setText(charSequence2);
        p41Var.e.setText(charSequence3);
        ImageView imageView = p41Var.f27145f;
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
        p41Var.f27146n.a(z12, false);
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
        linearLayout.setOnClickListener(new dt(19, p41Var, onClickListener));
        p41Var.e();
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (TextUtils.equals(w51Var.f29948l, w51Var2.f29948l) && TextUtils.equals(w51Var.f29949m, w51Var2.f29949m) && TextUtils.equals(w51Var.f29950n, w51Var2.f29950n) && w51Var.E == w51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new p41(context, f6Var);
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
