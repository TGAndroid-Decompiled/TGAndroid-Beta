package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class hb1 extends org.telegram.ui.Components.n41 {
    public static final int f48313b = 0;

    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        float f10;
        ib1 ib1Var = (ib1) view;
        int i7 = o41Var.f38089k;
        CharSequence charSequence = o41Var.f38091m;
        CharSequence charSequence2 = o41Var.f38092n;
        boolean z11 = o41Var.f38096r;
        boolean z12 = o41Var.f38097s;
        int i10 = o41Var.A;
        TextView textView = ib1Var.f48724e;
        ImageView imageView = ib1Var.f48725f;
        ib1Var.h = z11;
        ib1Var.f48726n = z12;
        ib1Var.f48722b.setImageResource(i7);
        int i11 = 8;
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        ib1Var.d.setText(charSequence);
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
        ib1Var.f48723c.setPadding(0, L, 0, L);
        ib1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new ib1(context, h6Var);
    }
}
