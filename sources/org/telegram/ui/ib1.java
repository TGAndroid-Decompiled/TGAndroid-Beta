package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class ib1 extends org.telegram.ui.Components.w31 {
    public static final int f46608b = 0;

    static {
        org.telegram.ui.Components.w31.h(new org.telegram.ui.Components.w31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.x31 x31Var, boolean z9, org.telegram.ui.Components.m41 m41Var, org.telegram.ui.Components.r41 r41Var) {
        float f10;
        jb1 jb1Var = (jb1) view;
        int i7 = x31Var.f40155k;
        CharSequence charSequence = x31Var.f40156l;
        CharSequence charSequence2 = x31Var.f40157m;
        boolean z10 = x31Var.f40161q;
        boolean z11 = x31Var.f40162r;
        int i10 = x31Var.f40169z;
        TextView textView = jb1Var.f46901e;
        ImageView imageView = jb1Var.f46902f;
        jb1Var.h = z10;
        jb1Var.f46903n = z11;
        jb1Var.f46899b.setImageResource(i7);
        int i11 = 8;
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        jb1Var.d.setText(charSequence);
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
        jb1Var.f46900c.setPadding(0, L, 0, L);
        jb1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new jb1(context, h6Var);
    }
}
