package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class fh1 extends org.telegram.ui.Components.h51 {
    public static final int f34084a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        gh1 gh1Var = (gh1) view;
        int i14 = i51Var.f25584k;
        CharSequence charSequence = i51Var.f25585l;
        CharSequence charSequence2 = i51Var.f25586m;
        boolean z10 = i51Var.f25590q;
        boolean z11 = i51Var.f25591r;
        int i15 = i51Var.f25598z;
        TextView textView = gh1Var.d;
        TextView textView2 = gh1Var.e;
        ImageView imageView = gh1Var.f34456f;
        gh1Var.h = z10;
        gh1Var.f34457n = z11;
        ImageView imageView2 = gh1Var.f34454b;
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
            f10 = 15.0f;
        } else {
            f10 = 10.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        gh1Var.f34455c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = gh1Var.f34453a;
        if (gh1Var.f34457n) {
            i10 = org.telegram.ui.ActionBar.j6.f20116q7;
        } else if (gh1Var.h) {
            i10 = org.telegram.ui.ActionBar.j6.f20060n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (gh1Var.f34457n) {
            i11 = org.telegram.ui.ActionBar.j6.f20116q7;
        } else if (gh1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f20060n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        if (gh1Var.f34457n) {
            i12 = org.telegram.ui.ActionBar.j6.f20097p7;
        } else if (gh1Var.h) {
            i12 = org.telegram.ui.ActionBar.j6.f20060n6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (gh1Var.f34457n) {
            i13 = org.telegram.ui.ActionBar.j6.f20097p7;
        } else if (gh1Var.h) {
            i13 = org.telegram.ui.ActionBar.j6.f20060n6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f20256y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new gh1(context, f6Var);
    }
}
