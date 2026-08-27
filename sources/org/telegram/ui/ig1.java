package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class ig1 extends org.telegram.ui.Components.m41 {

    public static final int f39104a = 0;

    static {
        org.telegram.ui.Components.m41.setup(new ig1());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        jg1 jg1Var = (jg1) view;
        int i14 = n41Var.f30843k;
        CharSequence charSequence = n41Var.f30844l;
        CharSequence charSequence2 = n41Var.f30845m;
        boolean z11 = n41Var.f30849q;
        boolean z12 = n41Var.f30850r;
        int i15 = n41Var.f30857z;
        TextView textView = jg1Var.d;
        TextView textView2 = jg1Var.f39371e;
        ImageView imageView = jg1Var.f39372f;
        jg1Var.h = z11;
        jg1Var.f39373n = z12;
        ImageView imageView2 = jg1Var.f39369b;
        imageView2.setImageResource(i14);
        if (i15 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i15);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView2.setText(charSequence2);
        textView2.setVisibility(TextUtils.isEmpty(charSequence2) ? 8 : 0);
        int iDp = AndroidUtilities.dp(TextUtils.isEmpty(charSequence2) ? 15.0f : 10.0f);
        jg1Var.f39370c.setPadding(0, iDp, 0, iDp);
        org.telegram.ui.ActionBar.c6 c6Var = jg1Var.f39368a;
        if (jg1Var.f39373n) {
            i10 = org.telegram.ui.ActionBar.g6.f23284q7;
        } else {
            i10 = jg1Var.h ? org.telegram.ui.ActionBar.g6.f23234n6 : org.telegram.ui.ActionBar.g6.G6;
        }
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        if (jg1Var.f39373n) {
            i11 = org.telegram.ui.ActionBar.g6.f23284q7;
        } else {
            i11 = jg1Var.h ? org.telegram.ui.ActionBar.g6.f23234n6 : org.telegram.ui.ActionBar.g6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        if (jg1Var.f39373n) {
            i12 = org.telegram.ui.ActionBar.g6.f23269p7;
        } else {
            i12 = jg1Var.h ? org.telegram.ui.ActionBar.g6.f23234n6 : org.telegram.ui.ActionBar.g6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        if (jg1Var.f39373n) {
            i13 = org.telegram.ui.ActionBar.g6.f23269p7;
        } else {
            i13 = jg1Var.h ? org.telegram.ui.ActionBar.g6.f23234n6 : org.telegram.ui.ActionBar.g6.f23423y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new jg1(context, c6Var);
    }
}
