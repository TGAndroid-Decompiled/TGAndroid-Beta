package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qh1 extends org.telegram.ui.Components.x51 {
    public static final int f36941a = 0;

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
        rh1 rh1Var = (rh1) view;
        int i14 = y51Var.f30517k;
        CharSequence charSequence = y51Var.f30518l;
        CharSequence charSequence2 = y51Var.f30519m;
        boolean z11 = y51Var.f30523q;
        boolean z12 = y51Var.f30524r;
        int i15 = y51Var.f30531z;
        TextView textView = rh1Var.d;
        TextView textView2 = rh1Var.e;
        ImageView imageView = rh1Var.f37194f;
        rh1Var.h = z11;
        rh1Var.f37195n = z12;
        ImageView imageView2 = rh1Var.f37192b;
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
        rh1Var.f37193c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = rh1Var.f37191a;
        if (rh1Var.f37195n) {
            i10 = org.telegram.ui.ActionBar.j6.f19348q7;
        } else if (rh1Var.h) {
            i10 = org.telegram.ui.ActionBar.j6.f19294n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (rh1Var.f37195n) {
            i11 = org.telegram.ui.ActionBar.j6.f19348q7;
        } else if (rh1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f19294n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        if (rh1Var.f37195n) {
            i12 = org.telegram.ui.ActionBar.j6.f19330p7;
        } else if (rh1Var.h) {
            i12 = org.telegram.ui.ActionBar.j6.f19294n6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (rh1Var.f37195n) {
            i13 = org.telegram.ui.ActionBar.j6.f19330p7;
        } else if (rh1Var.h) {
            i13 = org.telegram.ui.ActionBar.j6.f19294n6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f19492y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new rh1(context, f6Var);
    }
}
