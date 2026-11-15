package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class db1 extends org.telegram.ui.Components.a41 {
    public static final int f46324b = 0;

    static {
        org.telegram.ui.Components.a41.h(new org.telegram.ui.Components.a41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b41 b41Var, boolean z10, org.telegram.ui.Components.p41 p41Var, org.telegram.ui.Components.u41 u41Var) {
        float f10;
        eb1 eb1Var = (eb1) view;
        int i7 = b41Var.f33183k;
        CharSequence charSequence = b41Var.f33184l;
        CharSequence charSequence2 = b41Var.f33185m;
        boolean z11 = b41Var.f33189q;
        boolean z12 = b41Var.f33190r;
        int i10 = b41Var.f33197z;
        TextView textView = eb1Var.f46659e;
        ImageView imageView = eb1Var.f46660f;
        eb1Var.h = z11;
        eb1Var.f46661n = z12;
        eb1Var.f46657b.setImageResource(i7);
        int i11 = 8;
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        eb1Var.d.setText(charSequence);
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
        eb1Var.f46658c.setPadding(0, L, 0, L);
        eb1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new eb1(context, e6Var);
    }
}
