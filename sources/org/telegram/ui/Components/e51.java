package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class e51 extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        m61 J = m61.J(e51.class);
        J.d = i10;
        J.f28559l = charSequence;
        J.f28560m = charSequence2;
        J.f28561n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static m61 b(int i10, String str, String str2, String str3, a51 a51Var) {
        return a(i10, str, str2, str3, a51Var, false, null, null);
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        f51 f51Var = (f51) view;
        CharSequence charSequence = m61Var.f28559l;
        CharSequence charSequence2 = m61Var.f28560m;
        CharSequence charSequence3 = m61Var.f28561n;
        View.OnClickListener onClickListener2 = m61Var.D;
        boolean z12 = m61Var.e;
        View.OnClickListener onClickListener3 = m61Var.E;
        Object obj = m61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = f51Var.f26176r;
        LinearLayout linearLayout2 = f51Var.h;
        LinearLayout linearLayout3 = f51Var.f26172b;
        f51Var.f26173c.setText(charSequence);
        f51Var.d.setText(charSequence2);
        f51Var.e.setText(charSequence3);
        ImageView imageView = f51Var.f26174f;
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
        f51Var.f26175n.a(z12, false);
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
        linearLayout.setOnClickListener(new d51(0, f51Var, onClickListener));
        f51Var.updateColors();
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (TextUtils.equals(m61Var.f28559l, m61Var2.f28559l) && TextUtils.equals(m61Var.f28560m, m61Var2.f28560m) && TextUtils.equals(m61Var.f28561n, m61Var2.f28561n) && m61Var.E == m61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new f51(context, g6Var);
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
