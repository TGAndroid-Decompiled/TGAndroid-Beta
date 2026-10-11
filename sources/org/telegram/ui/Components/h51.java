package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class h51 extends p61 {
    static {
        p61.setup(new p61());
    }

    public static q61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        q61 J = q61.J(h51.class);
        J.d = i10;
        J.f30167l = charSequence;
        J.f30168m = charSequence2;
        J.f30169n = charSequence3;
        J.D = onClickListener;
        J.f30161e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static q61 b(int i10, String str, String str2, String str3, e51 e51Var) {
        return a(i10, str, str2, str3, e51Var, false, null, null);
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        i51 i51Var = (i51) view;
        CharSequence charSequence = q61Var.f30167l;
        CharSequence charSequence2 = q61Var.f30168m;
        CharSequence charSequence3 = q61Var.f30169n;
        View.OnClickListener onClickListener2 = q61Var.D;
        boolean z12 = q61Var.f30161e;
        View.OnClickListener onClickListener3 = q61Var.E;
        Object obj = q61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = i51Var.f27333r;
        LinearLayout linearLayout2 = i51Var.h;
        LinearLayout linearLayout3 = i51Var.f27328b;
        i51Var.f27329c.setText(charSequence);
        i51Var.d.setText(charSequence2);
        i51Var.f27330e.setText(charSequence3);
        ImageView imageView = i51Var.f27331f;
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
        i51Var.f27332n.a(z12, false);
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
        linearLayout.setOnClickListener(new vt(19, i51Var, onClickListener));
        i51Var.e();
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (TextUtils.equals(q61Var.f30167l, q61Var2.f30167l) && TextUtils.equals(q61Var.f30168m, q61Var2.f30168m) && TextUtils.equals(q61Var.f30169n, q61Var2.f30169n) && q61Var.E == q61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new i51(context, d6Var);
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
