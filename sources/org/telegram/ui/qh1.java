package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qh1 extends org.telegram.ui.Components.v51 {
    public static final int f36918a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        rh1 rh1Var = (rh1) view;
        int i14 = w51Var.f29947k;
        CharSequence charSequence = w51Var.f29948l;
        CharSequence charSequence2 = w51Var.f29949m;
        boolean z11 = w51Var.f29953q;
        boolean z12 = w51Var.f29954r;
        int i15 = w51Var.f29961z;
        TextView textView = rh1Var.d;
        TextView textView2 = rh1Var.e;
        ImageView imageView = rh1Var.f37171f;
        rh1Var.h = z11;
        rh1Var.f37172n = z12;
        ImageView imageView2 = rh1Var.f37169b;
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
        rh1Var.f37170c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = rh1Var.f37168a;
        if (rh1Var.f37172n) {
            i10 = org.telegram.ui.ActionBar.j6.f19333q7;
        } else if (rh1Var.h) {
            i10 = org.telegram.ui.ActionBar.j6.f19279n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (rh1Var.f37172n) {
            i11 = org.telegram.ui.ActionBar.j6.f19333q7;
        } else if (rh1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f19279n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        if (rh1Var.f37172n) {
            i12 = org.telegram.ui.ActionBar.j6.f19315p7;
        } else if (rh1Var.h) {
            i12 = org.telegram.ui.ActionBar.j6.f19279n6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (rh1Var.f37172n) {
            i13 = org.telegram.ui.ActionBar.j6.f19315p7;
        } else if (rh1Var.h) {
            i13 = org.telegram.ui.ActionBar.j6.f19279n6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f19477y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new rh1(context, f6Var);
    }
}
