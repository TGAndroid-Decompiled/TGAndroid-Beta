package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class lg1 extends org.telegram.ui.Components.v41 {
    public static final int f40204a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new org.telegram.ui.Components.v41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        float f9;
        int i10;
        int i11;
        int i12;
        int i13;
        mg1 mg1Var = (mg1) view;
        int i14 = w41Var.f34299k;
        CharSequence charSequence = w41Var.f34300l;
        CharSequence charSequence2 = w41Var.f34301m;
        boolean z11 = w41Var.f34305q;
        boolean z12 = w41Var.f34306r;
        int i15 = w41Var.f34313z;
        TextView textView = mg1Var.d;
        TextView textView2 = mg1Var.f40558e;
        ImageView imageView = mg1Var.f40559f;
        mg1Var.h = z11;
        mg1Var.f40560n = z12;
        ImageView imageView2 = mg1Var.f40556b;
        imageView2.setImageResource(i14);
        int i16 = 8;
        if (i15 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i15);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView2.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i16 = 0;
        }
        textView2.setVisibility(i16);
        if (TextUtils.isEmpty(charSequence2)) {
            f9 = 15.0f;
        } else {
            f9 = 10.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        mg1Var.f40557c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.c6 c6Var = mg1Var.f40555a;
        if (mg1Var.f40560n) {
            i10 = org.telegram.ui.ActionBar.g6.f23295q7;
        } else if (mg1Var.h) {
            i10 = org.telegram.ui.ActionBar.g6.f23241n6;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (mg1Var.f40560n) {
            i11 = org.telegram.ui.ActionBar.g6.f23295q7;
        } else if (mg1Var.h) {
            i11 = org.telegram.ui.ActionBar.g6.f23241n6;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        if (mg1Var.f40560n) {
            i12 = org.telegram.ui.ActionBar.g6.f23279p7;
        } else if (mg1Var.h) {
            i12 = org.telegram.ui.ActionBar.g6.f23241n6;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        if (mg1Var.f40560n) {
            i13 = org.telegram.ui.ActionBar.g6.f23279p7;
        } else if (mg1Var.h) {
            i13 = org.telegram.ui.ActionBar.g6.f23241n6;
        } else {
            i13 = org.telegram.ui.ActionBar.g6.f23433y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new mg1(context, c6Var);
    }
}
