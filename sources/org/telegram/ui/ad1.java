package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class ad1 extends org.telegram.ui.Components.z41 {
    public static final int f35631b = 0;

    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        float f7;
        bd1 bd1Var = (bd1) view;
        int i10 = a51Var.f24291k;
        CharSequence charSequence = a51Var.f24292l;
        CharSequence charSequence2 = a51Var.f24293m;
        boolean z11 = a51Var.f24297q;
        boolean z12 = a51Var.f24298r;
        int i11 = a51Var.f24305z;
        TextView textView = bd1Var.e;
        ImageView imageView = bd1Var.f36189f;
        bd1Var.h = z11;
        bd1Var.f36190n = z12;
        bd1Var.f36187b.setImageResource(i10);
        int i12 = 8;
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        bd1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i12 = 0;
        }
        textView.setVisibility(i12);
        if (TextUtils.isEmpty(charSequence2)) {
            f7 = 15.0f;
        } else {
            f7 = 10.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        bd1Var.f36188c.setPadding(0, L, 0, L);
        bd1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new bd1(context, p6Var);
    }
}
