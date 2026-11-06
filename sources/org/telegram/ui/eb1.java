package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public final class eb1 extends org.telegram.ui.Components.v31 {
    public static final int f45258b = 0;

    static {
        org.telegram.ui.Components.v31.h(new org.telegram.ui.Components.v31());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.w31 w31Var, boolean z9, org.telegram.ui.Components.k41 k41Var, org.telegram.ui.Components.p41 p41Var) {
        float f10;
        fb1 fb1Var = (fb1) view;
        int i7 = w31Var.f39829k;
        CharSequence charSequence = w31Var.f39830l;
        CharSequence charSequence2 = w31Var.f39831m;
        boolean z10 = w31Var.f39835q;
        boolean z11 = w31Var.f39836r;
        int i10 = w31Var.f39843z;
        TextView textView = fb1Var.f45591e;
        ImageView imageView = fb1Var.f45592f;
        fb1Var.h = z10;
        fb1Var.f45593n = z11;
        fb1Var.f45589b.setImageResource(i7);
        int i11 = 8;
        if (i10 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        } else {
            imageView.setVisibility(8);
        }
        fb1Var.d.setText(charSequence);
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
        fb1Var.f45590c.setPadding(0, L, 0, L);
        fb1Var.updateColors();
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new fb1(context, f6Var);
    }
}
