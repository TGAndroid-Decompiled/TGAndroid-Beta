package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class jh1 extends org.telegram.ui.Components.x51 {
    public static final int f34907a = 0;

    static {
        org.telegram.ui.Components.x51.setup(new org.telegram.ui.Components.x51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.y51 y51Var, boolean z10, org.telegram.ui.Components.m61 m61Var, org.telegram.ui.Components.u61 u61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        kh1 kh1Var = (kh1) view;
        int i14 = y51Var.f30636k;
        CharSequence charSequence = y51Var.f30637l;
        CharSequence charSequence2 = y51Var.f30638m;
        boolean z11 = y51Var.f30642q;
        boolean z12 = y51Var.f30643r;
        int i15 = y51Var.f30650z;
        TextView textView = kh1Var.d;
        TextView textView2 = kh1Var.e;
        ImageView imageView = kh1Var.f35158f;
        kh1Var.h = z11;
        kh1Var.f35159n = z12;
        ImageView imageView2 = kh1Var.f35156b;
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
        kh1Var.f35157c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = kh1Var.f35155a;
        if (kh1Var.f35159n) {
            i10 = org.telegram.ui.ActionBar.h6.f19315q7;
        } else if (kh1Var.h) {
            i10 = org.telegram.ui.ActionBar.h6.f19260n6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (kh1Var.f35159n) {
            i11 = org.telegram.ui.ActionBar.h6.f19315q7;
        } else if (kh1Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f19260n6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), mode));
        if (kh1Var.f35159n) {
            i12 = org.telegram.ui.ActionBar.h6.f19296p7;
        } else if (kh1Var.h) {
            i12 = org.telegram.ui.ActionBar.h6.f19260n6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        if (kh1Var.f35159n) {
            i13 = org.telegram.ui.ActionBar.h6.f19296p7;
        } else if (kh1Var.h) {
            i13 = org.telegram.ui.ActionBar.h6.f19260n6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f19459y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i13, d6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new kh1(context, d6Var);
    }
}
