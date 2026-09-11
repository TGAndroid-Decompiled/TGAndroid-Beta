package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class z31 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        h51 J = h51.J(z31.class);
        J.d = i10;
        J.f26594l = charSequence;
        J.f26595m = charSequence2;
        J.f26596n = charSequence3;
        J.D = onClickListener;
        J.f26588e = z10;
        J.E = onClickListener2;
        J.G = oVar;
        return J;
    }

    public static h51 b(int i10, String str, String str2, String str3, w31 w31Var) {
        return a(i10, str, str2, str3, w31Var, false, null, null);
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        a41 a41Var = (a41) view;
        CharSequence charSequence = h51Var.f26594l;
        CharSequence charSequence2 = h51Var.f26595m;
        CharSequence charSequence3 = h51Var.f26596n;
        View.OnClickListener onClickListener2 = h51Var.D;
        boolean z12 = h51Var.f26588e;
        View.OnClickListener onClickListener3 = h51Var.E;
        Object obj = h51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = a41Var.f24275r;
        LinearLayout linearLayout2 = a41Var.h;
        LinearLayout linearLayout3 = a41Var.f24270b;
        a41Var.f24271c.setText(charSequence);
        a41Var.d.setText(charSequence2);
        a41Var.f24272e.setText(charSequence3);
        ImageView imageView = a41Var.f24273f;
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
        a41Var.f24274n.a(z12, false);
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
        linearLayout.setOnClickListener(new ct(19, a41Var, onClickListener));
        a41Var.d();
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (TextUtils.equals(h51Var.f26594l, h51Var2.f26594l) && TextUtils.equals(h51Var.f26595m, h51Var2.f26595m) && TextUtils.equals(h51Var.f26596n, h51Var2.f26596n) && h51Var.E == h51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new a41(context, f6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
