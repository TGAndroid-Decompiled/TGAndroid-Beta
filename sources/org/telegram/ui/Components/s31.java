package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class s31 extends a51 {
    static {
        a51.h(new a51());
    }

    public static b51 i(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        b51 K = b51.K(s31.class);
        K.d = i10;
        K.f24643l = charSequence;
        K.f24644m = charSequence2;
        K.f24645n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = oVar;
        return K;
    }

    public static b51 j(int i10, String str, String str2, String str3, p31 p31Var) {
        return i(i10, str, str2, str3, p31Var, false, null, null);
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        t31 t31Var = (t31) view;
        CharSequence charSequence = b51Var.f24643l;
        CharSequence charSequence2 = b51Var.f24644m;
        CharSequence charSequence3 = b51Var.f24645n;
        View.OnClickListener onClickListener2 = b51Var.D;
        boolean z12 = b51Var.e;
        View.OnClickListener onClickListener3 = b51Var.E;
        Object obj = b51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = t31Var.f30520r;
        LinearLayout linearLayout2 = t31Var.h;
        LinearLayout linearLayout3 = t31Var.f30516b;
        t31Var.f30517c.setText(charSequence);
        t31Var.d.setText(charSequence2);
        t31Var.e.setText(charSequence3);
        ImageView imageView = t31Var.f30518f;
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
        t31Var.f30519n.a(z12, false);
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
        linearLayout.setOnClickListener(new sr(20, t31Var, onClickListener));
        t31Var.updateColors();
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (TextUtils.equals(b51Var.f24643l, b51Var2.f24643l) && TextUtils.equals(b51Var.f24644m, b51Var2.f24644m) && TextUtils.equals(b51Var.f24645n, b51Var2.f24645n) && b51Var.E == b51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new t31(context, p6Var);
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
