package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class z41 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        h61 K = h61.K(z41.class);
        K.d = i10;
        K.f27093l = charSequence;
        K.f27094m = charSequence2;
        K.f27095n = charSequence3;
        K.D = onClickListener;
        K.f27087e = z10;
        K.E = onClickListener2;
        K.G = nVar;
        return K;
    }

    public static h61 b(int i10, String str, String str2, String str3, w41 w41Var) {
        return a(i10, str, str2, str3, w41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        a51 a51Var = (a51) view;
        CharSequence charSequence = h61Var.f27093l;
        CharSequence charSequence2 = h61Var.f27094m;
        CharSequence charSequence3 = h61Var.f27095n;
        View.OnClickListener onClickListener2 = h61Var.D;
        boolean z12 = h61Var.f27087e;
        View.OnClickListener onClickListener3 = h61Var.E;
        Object obj = h61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = a51Var.f24498r;
        LinearLayout linearLayout2 = a51Var.h;
        LinearLayout linearLayout3 = a51Var.f24493b;
        a51Var.f24494c.setText(charSequence);
        a51Var.d.setText(charSequence2);
        a51Var.f24495e.setText(charSequence3);
        ImageView imageView = a51Var.f24496f;
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
        a51Var.f24497n.a(z12, false);
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
        linearLayout.setOnClickListener(new gt(19, a51Var, onClickListener));
        a51Var.e();
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (TextUtils.equals(h61Var.f27093l, h61Var2.f27093l) && TextUtils.equals(h61Var.f27094m, h61Var2.f27094m) && TextUtils.equals(h61Var.f27095n, h61Var2.f27095n) && h61Var.E == h61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new a51(context, d6Var);
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
