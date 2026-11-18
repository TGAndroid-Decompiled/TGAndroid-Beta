package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class e31 extends k41 {
    static {
        k41.h(new k41());
    }

    public static l41 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, s sVar) {
        l41 K = l41.K(e31.class);
        K.d = i7;
        K.f37018m = charSequence;
        K.f37019n = charSequence2;
        K.f37020o = charSequence3;
        K.E = onClickListener;
        K.f37011e = z10;
        K.F = onClickListener2;
        K.H = sVar;
        return K;
    }

    public static l41 j(int i7, String str, String str2, String str3, a31 a31Var) {
        return i(i7, str, str2, str3, a31Var, false, null, null);
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        View.OnClickListener onClickListener;
        int i7;
        boolean z11;
        int i10;
        f31 f31Var = (f31) view;
        CharSequence charSequence = l41Var.f37018m;
        CharSequence charSequence2 = l41Var.f37019n;
        CharSequence charSequence3 = l41Var.f37020o;
        View.OnClickListener onClickListener2 = l41Var.E;
        boolean z12 = l41Var.f37011e;
        View.OnClickListener onClickListener3 = l41Var.F;
        Object obj = l41Var.H;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = f31Var.f34933r;
        LinearLayout linearLayout2 = f31Var.h;
        LinearLayout linearLayout3 = f31Var.f34928b;
        f31Var.f34929c.setText(charSequence);
        f31Var.d.setText(charSequence2);
        f31Var.f34930e.setText(charSequence3);
        ImageView imageView = f31Var.f34931f;
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
        f31Var.f34932n.a(z12, false);
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
        linearLayout.setOnClickListener(new c31(1, f31Var, onClickListener));
        f31Var.updateColors();
    }

    @Override
    public final boolean c(l41 l41Var, l41 l41Var2) {
        if (TextUtils.equals(l41Var.f37018m, l41Var2.f37018m) && TextUtils.equals(l41Var.f37019n, l41Var2.f37019n) && TextUtils.equals(l41Var.f37020o, l41Var2.f37020o) && l41Var.F == l41Var2.F) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new f31(context, i6Var);
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
