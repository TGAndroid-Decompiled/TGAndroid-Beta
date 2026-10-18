package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class w41 extends e61 {
    static {
        e61.setup(new e61());
    }

    public static f61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        f61 J = f61.J(w41.class);
        J.d = i10;
        J.f26147l = charSequence;
        J.f26148m = charSequence2;
        J.f26149n = charSequence3;
        J.D = onClickListener;
        J.e = z10;
        J.E = onClickListener2;
        J.G = nVar;
        return J;
    }

    public static f61 b(int i10, String str, String str2, String str3, t41 t41Var) {
        return a(i10, str, str2, str3, t41Var, false, null, null);
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        x41 x41Var = (x41) view;
        CharSequence charSequence = f61Var.f26147l;
        CharSequence charSequence2 = f61Var.f26148m;
        CharSequence charSequence3 = f61Var.f26149n;
        View.OnClickListener onClickListener2 = f61Var.D;
        boolean z12 = f61Var.e;
        View.OnClickListener onClickListener3 = f61Var.E;
        Object obj = f61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = x41Var.f32320r;
        LinearLayout linearLayout2 = x41Var.h;
        LinearLayout linearLayout3 = x41Var.f32316b;
        x41Var.f32317c.setText(charSequence);
        x41Var.d.setText(charSequence2);
        x41Var.e.setText(charSequence3);
        ImageView imageView = x41Var.f32318f;
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
        x41Var.f32319n.a(z12, false);
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
        linearLayout.setOnClickListener(new ca(29, x41Var, onClickListener));
        x41Var.d();
    }

    @Override
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        if (TextUtils.equals(f61Var.f26147l, f61Var2.f26147l) && TextUtils.equals(f61Var.f26148m, f61Var2.f26148m) && TextUtils.equals(f61Var.f26149n, f61Var2.f26149n) && f61Var.E == f61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new x41(context, d6Var);
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.d == f61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
