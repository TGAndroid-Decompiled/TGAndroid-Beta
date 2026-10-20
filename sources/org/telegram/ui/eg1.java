package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class eg1 extends org.telegram.ui.Components.g61 {
    public static final int f36655a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        fg1 fg1Var = (fg1) view;
        int i14 = h61Var.f26781k;
        CharSequence charSequence = h61Var.f26782l;
        CharSequence charSequence2 = h61Var.f26783m;
        boolean z11 = h61Var.f26787q;
        boolean z12 = h61Var.f26788r;
        int i15 = h61Var.f26795z;
        TextView textView = fg1Var.d;
        TextView textView2 = fg1Var.e;
        ImageView imageView = fg1Var.f37001f;
        fg1Var.h = z11;
        fg1Var.f37002n = z12;
        ImageView imageView2 = fg1Var.f36999b;
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
            f7 = 15.0f;
        } else {
            f7 = 10.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        fg1Var.f37000c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = fg1Var.f36998a;
        if (fg1Var.f37002n) {
            i10 = org.telegram.ui.ActionBar.h6.f21228q7;
        } else if (fg1Var.h) {
            i10 = org.telegram.ui.ActionBar.h6.f21173n6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (fg1Var.f37002n) {
            i11 = org.telegram.ui.ActionBar.h6.f21228q7;
        } else if (fg1Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f21173n6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), mode));
        if (fg1Var.f37002n) {
            i12 = org.telegram.ui.ActionBar.h6.f21211p7;
        } else if (fg1Var.h) {
            i12 = org.telegram.ui.ActionBar.h6.f21173n6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        if (fg1Var.f37002n) {
            i13 = org.telegram.ui.ActionBar.h6.f21211p7;
        } else if (fg1Var.h) {
            i13 = org.telegram.ui.ActionBar.h6.f21173n6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f21378y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new fg1(context, d6Var);
    }
}
