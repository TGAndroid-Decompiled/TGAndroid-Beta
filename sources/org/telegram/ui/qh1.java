package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qh1 extends org.telegram.ui.Components.i51 {
    public static final int f36925a = 0;

    static {
        org.telegram.ui.Components.i51.setup(new org.telegram.ui.Components.i51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.j51 j51Var, boolean z10, org.telegram.ui.Components.x51 x51Var, org.telegram.ui.Components.f61 f61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        rh1 rh1Var = (rh1) view;
        int i14 = j51Var.f25123k;
        CharSequence charSequence = j51Var.f25124l;
        CharSequence charSequence2 = j51Var.f25125m;
        boolean z11 = j51Var.f25129q;
        boolean z12 = j51Var.f25130r;
        int i15 = j51Var.f25137z;
        TextView textView = rh1Var.d;
        TextView textView2 = rh1Var.e;
        ImageView imageView = rh1Var.f37243f;
        rh1Var.h = z11;
        rh1Var.f37244n = z12;
        ImageView imageView2 = rh1Var.f37241b;
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
        rh1Var.f37242c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.f6 f6Var = rh1Var.f37240a;
        if (rh1Var.f37244n) {
            i10 = org.telegram.ui.ActionBar.j6.f19100q7;
        } else if (rh1Var.h) {
            i10 = org.telegram.ui.ActionBar.j6.f19047n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (rh1Var.f37244n) {
            i11 = org.telegram.ui.ActionBar.j6.f19100q7;
        } else if (rh1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f19047n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        if (rh1Var.f37244n) {
            i12 = org.telegram.ui.ActionBar.j6.f19082p7;
        } else if (rh1Var.h) {
            i12 = org.telegram.ui.ActionBar.j6.f19047n6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        if (rh1Var.f37244n) {
            i13 = org.telegram.ui.ActionBar.j6.f19082p7;
        } else if (rh1Var.h) {
            i13 = org.telegram.ui.ActionBar.j6.f19047n6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f19244y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new rh1(context, f6Var);
    }
}
