package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class fb1 extends org.telegram.ui.Components.m41 {
    public static final int f47745b = 0;

    static {
        org.telegram.ui.Components.m41.h(new org.telegram.ui.Components.m41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.g51 g51Var) {
        float f10;
        gb1 gb1Var = (gb1) view;
        int i7 = n41Var.f37653k;
        CharSequence charSequence = n41Var.f37655m;
        CharSequence charSequence2 = n41Var.f37656n;
        boolean z11 = n41Var.f37660r;
        boolean z12 = n41Var.f37661s;
        int i10 = n41Var.A;
        TextView textView = gb1Var.f48209e;
        ImageView imageView = gb1Var.f48210f;
        gb1Var.h = z11;
        gb1Var.f48211n = z12;
        gb1Var.f48207b.setImageResource(i7);
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
        gb1Var.f48208c.setPadding(0, L, 0, L);
        gb1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new gb1(context, i6Var);
    }
}
