package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class g51 extends o61 {
    static {
        o61.setup(new o61());
    }

    public static p61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        p61 J = p61.J(g51.class);
        J.d = i10;
        J.f29734l = charSequence;
        J.f29735m = charSequence2;
        J.f29736n = charSequence3;
        J.D = onClickListener;
        J.f29728e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static p61 b(int i10, String str, String str2, String str3, d51 d51Var) {
        return a(i10, str, str2, str3, d51Var, false, null, null);
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        h51 h51Var = (h51) view;
        CharSequence charSequence = p61Var.f29734l;
        CharSequence charSequence2 = p61Var.f29735m;
        CharSequence charSequence3 = p61Var.f29736n;
        View.OnClickListener onClickListener2 = p61Var.D;
        boolean z12 = p61Var.f29728e;
        View.OnClickListener onClickListener3 = p61Var.E;
        Object obj = p61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = h51Var.f26970r;
        LinearLayout linearLayout2 = h51Var.h;
        LinearLayout linearLayout3 = h51Var.f26965b;
        h51Var.f26966c.setText(charSequence);
        h51Var.d.setText(charSequence2);
        h51Var.f26967e.setText(charSequence3);
        ImageView imageView = h51Var.f26968f;
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
        h51Var.f26969n.a(z12, false);
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
        linearLayout.setOnClickListener(new ut(19, h51Var, onClickListener));
        h51Var.e();
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (TextUtils.equals(p61Var.f29734l, p61Var2.f29734l) && TextUtils.equals(p61Var.f29735m, p61Var2.f29735m) && TextUtils.equals(p61Var.f29736n, p61Var2.f29736n) && p61Var.E == p61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new h51(context, e6Var);
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
