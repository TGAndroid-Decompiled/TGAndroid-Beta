package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class k21 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(int i3, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        r31 K = r31.K(k21.class);
        K.d = i3;
        K.f37627l = charSequence;
        K.f37628m = charSequence2;
        K.f37629n = charSequence3;
        K.D = onClickListener;
        K.f37621e = z10;
        K.E = onClickListener2;
        K.G = oVar;
        return K;
    }

    public static r31 j(int i3, String str, String str2, String str3, h21 h21Var) {
        return i(i3, str, str2, str3, h21Var, false, null, null);
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        View.OnClickListener onClickListener;
        int i3;
        boolean z11;
        int i10;
        l21 l21Var = (l21) view;
        CharSequence charSequence = r31Var.f37627l;
        CharSequence charSequence2 = r31Var.f37628m;
        CharSequence charSequence3 = r31Var.f37629n;
        View.OnClickListener onClickListener2 = r31Var.D;
        boolean z12 = r31Var.f37621e;
        View.OnClickListener onClickListener3 = r31Var.E;
        Object obj = r31Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = l21Var.f35578r;
        LinearLayout linearLayout2 = l21Var.h;
        LinearLayout linearLayout3 = l21Var.f35573b;
        l21Var.f35574c.setText(charSequence);
        l21Var.d.setText(charSequence2);
        l21Var.f35575e.setText(charSequence3);
        ImageView imageView = l21Var.f35576f;
        int i11 = 8;
        if (onClickListener2 != null) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        linearLayout3.setClickable(z11);
        l21Var.f35577n.a(z12, false);
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
        linearLayout.setOnClickListener(new ux0(3, (Object) l21Var, (Object) onClickListener));
        l21Var.updateColors();
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        if (TextUtils.equals(r31Var.f37627l, r31Var2.f37627l) && TextUtils.equals(r31Var.f37628m, r31Var2.f37628m) && TextUtils.equals(r31Var.f37629n, r31Var2.f37629n) && r31Var.E == r31Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l21(context, e6Var);
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        if (r31Var.d == r31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
