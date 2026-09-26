package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class jh1 extends org.telegram.ui.Components.u51 {
    public static final int f34814a = 0;

    static {
        org.telegram.ui.Components.u51.setup(new org.telegram.ui.Components.u51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        kh1 kh1Var = (kh1) view;
        int i14 = v51Var.f29047k;
        CharSequence charSequence = v51Var.f29048l;
        CharSequence charSequence2 = v51Var.f29049m;
        boolean z11 = v51Var.f29053q;
        boolean z12 = v51Var.f29054r;
        int i15 = v51Var.f29061z;
        TextView textView = kh1Var.d;
        TextView textView2 = kh1Var.e;
        ImageView imageView = kh1Var.f35068f;
        kh1Var.h = z11;
        kh1Var.f35069n = z12;
        ImageView imageView2 = kh1Var.f35066b;
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
        kh1Var.f35067c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = kh1Var.f35065a;
        if (kh1Var.f35069n) {
            i10 = org.telegram.ui.ActionBar.h6.f19298q7;
        } else if (kh1Var.h) {
            i10 = org.telegram.ui.ActionBar.h6.f19243n6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (kh1Var.f35069n) {
            i11 = org.telegram.ui.ActionBar.h6.f19298q7;
        } else if (kh1Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f19243n6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), mode));
        if (kh1Var.f35069n) {
            i12 = org.telegram.ui.ActionBar.h6.f19279p7;
        } else if (kh1Var.h) {
            i12 = org.telegram.ui.ActionBar.h6.f19243n6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        if (kh1Var.f35069n) {
            i13 = org.telegram.ui.ActionBar.h6.f19279p7;
        } else if (kh1Var.h) {
            i13 = org.telegram.ui.ActionBar.h6.f19243n6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f19442y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new kh1(context, d6Var);
    }
}
