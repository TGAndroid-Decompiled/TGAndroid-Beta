package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
public final class m51 extends t61 {
    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z10, View.OnClickListener onClickListener2, n nVar) {
        u61 K = u61.K(m51.class);
        K.d = i10;
        K.f33249l = charSequence;
        K.f33250m = charSequence2;
        K.f33251n = charSequence3;
        K.D = onClickListener;
        K.e = z10;
        K.E = onClickListener2;
        K.G = nVar;
        return K;
    }

    public static u61 b(int i10, String str, String str2, String str3, i51 i51Var) {
        return a(i10, str, str2, str3, i51Var, false, null, null);
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        View.OnClickListener onClickListener;
        int i10;
        boolean z11;
        int i11;
        n51 n51Var = (n51) view;
        CharSequence charSequence = u61Var.f33249l;
        CharSequence charSequence2 = u61Var.f33250m;
        CharSequence charSequence3 = u61Var.f33251n;
        View.OnClickListener onClickListener2 = u61Var.D;
        boolean z12 = u61Var.e;
        View.OnClickListener onClickListener3 = u61Var.E;
        Object obj = u61Var.G;
        if (obj instanceof View.OnClickListener) {
            onClickListener = (View.OnClickListener) obj;
        } else {
            onClickListener = null;
        }
        LinearLayout linearLayout = n51Var.f30751r;
        LinearLayout linearLayout2 = n51Var.h;
        LinearLayout linearLayout3 = n51Var.f30747b;
        n51Var.f30748c.setText(charSequence);
        n51Var.d.setText(charSequence2);
        n51Var.e.setText(charSequence3);
        ImageView imageView = n51Var.f30749f;
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
        n51Var.f30750n.a(z12, false);
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
        linearLayout.setOnClickListener(new l51(0, n51Var, onClickListener));
        n51Var.updateColors();
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (TextUtils.equals(u61Var.f33249l, u61Var2.f33249l) && TextUtils.equals(u61Var.f33250m, u61Var2.f33250m) && TextUtils.equals(u61Var.f33251n, u61Var2.f33251n) && u61Var.E == u61Var2.E) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new n51(context, u6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
