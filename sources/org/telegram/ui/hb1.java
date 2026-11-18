package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class hb1 extends org.telegram.ui.Components.k41 {
    public static final int f48324b = 0;

    static {
        org.telegram.ui.Components.k41.h(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        float f10;
        ib1 ib1Var = (ib1) view;
        int i7 = l41Var.f37016k;
        CharSequence charSequence = l41Var.f37018m;
        CharSequence charSequence2 = l41Var.f37019n;
        boolean z11 = l41Var.f37023r;
        boolean z12 = l41Var.f37024s;
        int i10 = l41Var.A;
        TextView textView = ib1Var.f48695e;
        ImageView imageView = ib1Var.f48696f;
        ib1Var.h = z11;
        ib1Var.f48697n = z12;
        ib1Var.f48693b.setImageResource(i7);
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
        ib1Var.f48694c.setPadding(0, L, 0, L);
        ib1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new ib1(context, i6Var);
    }
}
