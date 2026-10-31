package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class r31 extends z41 {
    static {
        z41.h(new z41());
    }

    public static a51 i(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, o oVar) {
        a51 K = a51.K(r31.class);
        K.d = i10;
        K.f24292l = charSequence;
        K.f24293m = charSequence2;
        K.f24294n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = oVar;
        return K;
    }

    public static a51 j(int i10, String str, String str2, String str3, o31 o31Var) {
        return i(i10, str, str2, str3, o31Var, false, null, null);
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        s31 s31Var = (s31) view;
        CharSequence charSequence = a51Var.f24292l;
        CharSequence charSequence2 = a51Var.f24293m;
        CharSequence charSequence3 = a51Var.f24294n;
        View.OnClickListener onClickListener2 = a51Var.D;
        boolean z12 = a51Var.e;
        View.OnClickListener onClickListener3 = a51Var.E;
        Object obj = a51Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = s31Var.f30120r;
        LinearLayout linearLayout2 = s31Var.h;
        LinearLayout linearLayout3 = s31Var.f30116b;
        s31Var.f30117c.setText(charSequence);
        s31Var.d.setText(charSequence2);
        s31Var.e.setText(charSequence3);
        ImageView imageView = s31Var.f30118f;
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
        s31Var.f30119n.a(z12, false);
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
        linearLayout.setOnClickListener(new sr(20, s31Var, onClickListener));
        s31Var.updateColors();
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (TextUtils.equals(a51Var.f24292l, a51Var2.f24292l) && TextUtils.equals(a51Var.f24293m, a51Var2.f24293m) && TextUtils.equals(a51Var.f24294n, a51Var2.f24294n) && a51Var.E == a51Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s31(context, p6Var);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
