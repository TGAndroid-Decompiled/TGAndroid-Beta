package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class o21 extends v31 {
    static {
        v31.h(new v31());
    }

    public static w31 i(int i7, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z9, View.OnClickListener onClickListener2, p pVar) {
        w31 K = w31.K(o21.class);
        K.d = i7;
        K.f39830l = charSequence;
        K.f39831m = charSequence2;
        K.f39832n = charSequence3;
        K.D = onClickListener;
        K.f39824e = z9;
        K.E = onClickListener2;
        K.G = pVar;
        return K;
    }

    public static w31 j(int i7, String str, String str2, String str3, l21 l21Var) {
        return i(i7, str, str2, str3, l21Var, false, null, null);
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        View.OnClickListener onClickListener;
        int i7;
        boolean z10;
        int i10;
        p21 p21Var = (p21) view;
        CharSequence charSequence = w31Var.f39830l;
        CharSequence charSequence2 = w31Var.f39831m;
        CharSequence charSequence3 = w31Var.f39832n;
        View.OnClickListener onClickListener2 = w31Var.D;
        boolean z11 = w31Var.f39824e;
        View.OnClickListener onClickListener3 = w31Var.E;
        Object obj = w31Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = p21Var.f36762r;
        LinearLayout linearLayout2 = p21Var.h;
        LinearLayout linearLayout3 = p21Var.f36757b;
        p21Var.f36758c.setText(charSequence);
        p21Var.d.setText(charSequence2);
        p21Var.f36759e.setText(charSequence3);
        ImageView imageView = p21Var.f36760f;
        int i11 = 8;
        if (onClickListener2 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        imageView.setVisibility(i7);
        linearLayout3.setOnClickListener(onClickListener2);
        if (onClickListener2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        linearLayout3.setClickable(z10);
        p21Var.f36761n.a(z11, false);
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
        linearLayout.setOnClickListener(new lk(27, p21Var, onClickListener));
        p21Var.updateColors();
    }

    @Override
    public final boolean c(w31 w31Var, w31 w31Var2) {
        if (TextUtils.equals(w31Var.f39830l, w31Var2.f39830l) && TextUtils.equals(w31Var.f39831m, w31Var2.f39831m) && TextUtils.equals(w31Var.f39832n, w31Var2.f39832n) && w31Var.E == w31Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new p21(context, f6Var);
    }

    @Override
    public final boolean e(w31 w31Var, w31 w31Var2) {
        if (w31Var.d == w31Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
