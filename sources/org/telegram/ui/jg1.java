package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class jg1 extends org.telegram.ui.Components.k41 {
    public static final int f39500a = 0;

    static {
        org.telegram.ui.Components.k41.setup(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        float f10;
        int i9;
        int i10;
        int i11;
        int i12;
        kg1 kg1Var = (kg1) view;
        int i13 = l41Var.f30338k;
        CharSequence charSequence = l41Var.f30339l;
        CharSequence charSequence2 = l41Var.f30340m;
        boolean z11 = l41Var.f30344q;
        boolean z12 = l41Var.f30345r;
        int i14 = l41Var.f30352z;
        TextView textView = kg1Var.d;
        TextView textView2 = kg1Var.f39834e;
        ImageView imageView = kg1Var.f39835f;
        kg1Var.h = z11;
        kg1Var.f39836n = z12;
        ImageView imageView2 = kg1Var.f39832b;
        imageView2.setImageResource(i13);
        int i15 = 8;
        if (i14 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i14);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView2.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i15 = 0;
        }
        textView2.setVisibility(i15);
        if (TextUtils.isEmpty(charSequence2)) {
            f10 = 15.0f;
        } else {
            f10 = 10.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        kg1Var.f39833c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.b6 b6Var = kg1Var.f39831a;
        if (kg1Var.f39836n) {
            i9 = org.telegram.ui.ActionBar.f6.f23230q7;
        } else if (kg1Var.h) {
            i9 = org.telegram.ui.ActionBar.f6.f23179n6;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (kg1Var.f39836n) {
            i10 = org.telegram.ui.ActionBar.f6.f23230q7;
        } else if (kg1Var.h) {
            i10 = org.telegram.ui.ActionBar.f6.f23179n6;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), mode));
        if (kg1Var.f39836n) {
            i11 = org.telegram.ui.ActionBar.f6.f23212p7;
        } else if (kg1Var.h) {
            i11 = org.telegram.ui.ActionBar.f6.f23179n6;
        } else {
            i11 = org.telegram.ui.ActionBar.f6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        if (kg1Var.f39836n) {
            i12 = org.telegram.ui.ActionBar.f6.f23212p7;
        } else if (kg1Var.h) {
            i12 = org.telegram.ui.ActionBar.f6.f23179n6;
        } else {
            i12 = org.telegram.ui.ActionBar.f6.f23369y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new kg1(context, b6Var);
    }
}
