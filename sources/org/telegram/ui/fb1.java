package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class fb1 extends org.telegram.ui.Components.w31 {
    public static final int f45531b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.l41 l41Var, org.telegram.ui.Components.q41 q41Var) {
        float f10;
        gb1 gb1Var = (gb1) view;
        int i7 = x31Var.f40179k;
        CharSequence charSequence = x31Var.f40180l;
        CharSequence charSequence2 = x31Var.f40181m;
        boolean z10 = x31Var.f40185q;
        boolean z11 = x31Var.f40186r;
        int i10 = x31Var.f40193z;
        TextView textView = gb1Var.f45935e;
        ImageView imageView = gb1Var.f45936f;
        gb1Var.h = z10;
        gb1Var.f45937n = z11;
        gb1Var.f45933b.setImageResource(i7);
        int i11 = 8;
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        gb1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i11 = 0;
        }
        textView.setVisibility(i11);
        if (TextUtils.isEmpty(charSequence2)) {
            f10 = 15.0f;
        } else {
            f10 = 10.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        gb1Var.f45934c.setPadding(0, L, 0, L);
        gb1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new gb1(context, f6Var);
    }
}
