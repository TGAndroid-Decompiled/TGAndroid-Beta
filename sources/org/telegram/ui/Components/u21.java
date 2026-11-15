package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class u21 extends a41 {
    static {
        a41.h(new a41());
    }

    public static b41 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        b41 K = b41.K(u21.class);
        K.d = i7;
        K.f33181l = charSequence;
        K.f33182m = charSequence2;
        K.f33183n = charSequence3;
        K.D = onClickListener;
        K.f33175e = z10;
        K.E = onClickListener2;
        K.G = nVar;
        return K;
    }

    public static b41 j(int i7, String str, String str2, String str3, r21 r21Var) {
        return i(i7, str, str2, str3, r21Var, false, null, null);
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        View.OnClickListener onClickListener;
        int i7;
        boolean z11;
        int i10;
        v21 v21Var = (v21) view;
        CharSequence charSequence = b41Var.f33181l;
        CharSequence charSequence2 = b41Var.f33182m;
        CharSequence charSequence3 = b41Var.f33183n;
        View.OnClickListener onClickListener2 = b41Var.D;
        boolean z12 = b41Var.f33175e;
        View.OnClickListener onClickListener3 = b41Var.E;
        Object obj = b41Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = v21Var.f40245r;
        LinearLayout linearLayout2 = v21Var.h;
        LinearLayout linearLayout3 = v21Var.f40240b;
        v21Var.f40241c.setText(charSequence);
        v21Var.d.setText(charSequence2);
        v21Var.f40242e.setText(charSequence3);
        ImageView imageView = v21Var.f40243f;
        int i11 = 8;
        if (onClickListener2 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        linearLayout3.setClickable(z11);
        v21Var.f40244n.a(z12, false);
        if (onClickListener3 != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        linearLayout2.setOnClickListener(onClickListener3);
        if (onClickListener != null) {
            i11 = 0;
        }
        linearLayout.setVisibility(i11);
        linearLayout.setOnClickListener(new vv0(5, v21Var, onClickListener));
        v21Var.updateColors();
    }

    @Override
    public final boolean c(b41 b41Var, b41 b41Var2) {
        if (TextUtils.equals(b41Var.f33181l, b41Var2.f33181l) && TextUtils.equals(b41Var.f33182m, b41Var2.f33182m) && TextUtils.equals(b41Var.f33183n, b41Var2.f33183n) && b41Var.E == b41Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new v21(context, e6Var);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.d == b41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
