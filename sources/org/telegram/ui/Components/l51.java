package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class l51 extends s61 {
    static {
        s61.setup(new s61());
    }

    public static t61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        t61 K = t61.K(l51.class);
        K.d = i10;
        K.f32875l = charSequence;
        K.f32876m = charSequence2;
        K.f32877n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = nVar;
        return K;
    }

    public static t61 b(int i10, String str, String str2, String str3, h51 h51Var) {
        return a(i10, str, str2, str3, h51Var, false, null, null);
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        m51 m51Var = (m51) view;
        CharSequence charSequence = t61Var.f32875l;
        CharSequence charSequence2 = t61Var.f32876m;
        CharSequence charSequence3 = t61Var.f32877n;
        View.OnClickListener onClickListener2 = t61Var.D;
        boolean z12 = t61Var.e;
        View.OnClickListener onClickListener3 = t61Var.E;
        Object obj = t61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = m51Var.f30404r;
        LinearLayout linearLayout2 = m51Var.h;
        LinearLayout linearLayout3 = m51Var.f30400b;
        m51Var.f30401c.setText(charSequence);
        m51Var.d.setText(charSequence2);
        m51Var.e.setText(charSequence3);
        ImageView imageView = m51Var.f30402f;
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
        m51Var.f30403n.a(z12, false);
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
        linearLayout.setOnClickListener(new k51(0, m51Var, onClickListener));
        m51Var.updateColors();
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (TextUtils.equals(t61Var.f32875l, t61Var2.f32875l) && TextUtils.equals(t61Var.f32876m, t61Var2.f32876m) && TextUtils.equals(t61Var.f32877n, t61Var2.f32877n) && t61Var.E == t61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new m51(context, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
