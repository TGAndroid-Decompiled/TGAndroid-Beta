package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class n41 extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        v51 J = v51.J(n41.class);
        J.d = i10;
        J.f27829l = charSequence;
        J.f27830m = charSequence2;
        J.f27831n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = oVar;
        return J;
    }

    public static v51 b(int i10, String str, String str2, String str3, k41 k41Var) {
        return a(i10, str, str2, str3, k41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        o41 o41Var = (o41) view;
        CharSequence charSequence = v51Var.f27829l;
        CharSequence charSequence2 = v51Var.f27830m;
        CharSequence charSequence3 = v51Var.f27831n;
        View.OnClickListener onClickListener2 = v51Var.D;
        boolean z12 = v51Var.e;
        View.OnClickListener onClickListener3 = v51Var.E;
        Object obj = v51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = o41Var.f25670r;
        LinearLayout linearLayout2 = o41Var.h;
        LinearLayout linearLayout3 = o41Var.f25666b;
        o41Var.f25667c.setText(charSequence);
        o41Var.d.setText(charSequence2);
        o41Var.e.setText(charSequence3);
        ImageView imageView = o41Var.f25668f;
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
        o41Var.f25669n.a(z12, false);
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
        linearLayout.setOnClickListener(new u10(16, o41Var, onClickListener));
        o41Var.e();
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (TextUtils.equals(v51Var.f27829l, v51Var2.f27829l) && TextUtils.equals(v51Var.f27830m, v51Var2.f27830m) && TextUtils.equals(v51Var.f27831n, v51Var2.f27831n) && v51Var.E == v51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new o41(context, f6Var);
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
