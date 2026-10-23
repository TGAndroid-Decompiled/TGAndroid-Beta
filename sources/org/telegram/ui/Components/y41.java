package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class y41 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        h61 J = h61.J(y41.class);
        J.d = i10;
        J.f26786l = charSequence;
        J.f26787m = charSequence2;
        J.f26788n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static h61 b(int i10, String str, String str2, String str3, v41 v41Var) {
        return a(i10, str, str2, str3, v41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        z41 z41Var = (z41) view;
        CharSequence charSequence = h61Var.f26786l;
        CharSequence charSequence2 = h61Var.f26787m;
        CharSequence charSequence3 = h61Var.f26788n;
        View.OnClickListener onClickListener2 = h61Var.D;
        boolean z12 = h61Var.e;
        View.OnClickListener onClickListener3 = h61Var.E;
        Object obj = h61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = z41Var.f32842r;
        LinearLayout linearLayout2 = z41Var.h;
        LinearLayout linearLayout3 = z41Var.f32838b;
        z41Var.f32839c.setText(charSequence);
        z41Var.d.setText(charSequence2);
        z41Var.e.setText(charSequence3);
        ImageView imageView = z41Var.f32840f;
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
        z41Var.f32841n.a(z12, false);
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
        linearLayout.setOnClickListener(new ca(29, z41Var, onClickListener));
        z41Var.d();
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (TextUtils.equals(h61Var.f26786l, h61Var2.f26786l) && TextUtils.equals(h61Var.f26787m, h61Var2.f26787m) && TextUtils.equals(h61Var.f26788n, h61Var2.f26788n) && h61Var.E == h61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new z41(context, d6Var);
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
