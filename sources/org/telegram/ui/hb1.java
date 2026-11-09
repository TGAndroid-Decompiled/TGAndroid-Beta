package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class hb1 extends org.telegram.ui.Components.x31 {
    public static final int f46276b = 0;

    static {
        org.telegram.ui.Components.x31.h(new org.telegram.ui.Components.x31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.y31 y31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        float f10;
        ib1 ib1Var = (ib1) view;
        int i7 = y31Var.f40567k;
        CharSequence charSequence = y31Var.f40568l;
        CharSequence charSequence2 = y31Var.f40569m;
        boolean z10 = y31Var.f40573q;
        boolean z11 = y31Var.f40574r;
        int i10 = y31Var.f40581z;
        TextView textView = ib1Var.f46561e;
        ImageView imageView = ib1Var.f46562f;
        ib1Var.h = z10;
        ib1Var.f46563n = z11;
        ib1Var.f46559b.setImageResource(i7);
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
        ib1Var.f46560c.setPadding(0, L, 0, L);
        ib1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new ib1(context, g6Var);
    }
}
