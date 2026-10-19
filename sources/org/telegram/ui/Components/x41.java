package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class x41 extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        g61 J = g61.J(x41.class);
        J.d = i10;
        J.f26499l = charSequence;
        J.f26500m = charSequence2;
        J.f26501n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static g61 b(int i10, String str, String str2, String str3, u41 u41Var) {
        return a(i10, str, str2, str3, u41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        y41 y41Var = (y41) view;
        CharSequence charSequence = g61Var.f26499l;
        CharSequence charSequence2 = g61Var.f26500m;
        CharSequence charSequence3 = g61Var.f26501n;
        View.OnClickListener onClickListener2 = g61Var.D;
        boolean z12 = g61Var.e;
        View.OnClickListener onClickListener3 = g61Var.E;
        Object obj = g61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = y41Var.f32552r;
        LinearLayout linearLayout2 = y41Var.h;
        LinearLayout linearLayout3 = y41Var.f32548b;
        y41Var.f32549c.setText(charSequence);
        y41Var.d.setText(charSequence2);
        y41Var.e.setText(charSequence3);
        ImageView imageView = y41Var.f32550f;
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
        y41Var.f32551n.a(z12, false);
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
        linearLayout.setOnClickListener(new ca(29, y41Var, onClickListener));
        y41Var.d();
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (TextUtils.equals(g61Var.f26499l, g61Var2.f26499l) && TextUtils.equals(g61Var.f26500m, g61Var2.f26500m) && TextUtils.equals(g61Var.f26501n, g61Var2.f26501n) && g61Var.E == g61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y41(context, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
