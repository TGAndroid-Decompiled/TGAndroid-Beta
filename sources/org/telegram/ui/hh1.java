package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hh1 extends org.telegram.ui.Components.g61 {
    public static final int f37096a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        ih1 ih1Var = (ih1) view;
        int i14 = h61Var.f27092k;
        CharSequence charSequence = h61Var.f27093l;
        CharSequence charSequence2 = h61Var.f27094m;
        boolean z11 = h61Var.f27098q;
        boolean z12 = h61Var.f27099r;
        int i15 = h61Var.f27106z;
        TextView textView = ih1Var.d;
        TextView textView2 = ih1Var.f37431e;
        ImageView imageView = ih1Var.f37432f;
        ih1Var.h = z11;
        ih1Var.f37433n = z12;
        ImageView imageView2 = ih1Var.f37429b;
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
        ih1Var.f37430c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = ih1Var.f37428a;
        if (ih1Var.f37433n) {
            i10 = org.telegram.ui.ActionBar.i6.f21068q7;
        } else if (ih1Var.h) {
            i10 = org.telegram.ui.ActionBar.i6.f21013n6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (ih1Var.f37433n) {
            i11 = org.telegram.ui.ActionBar.i6.f21068q7;
        } else if (ih1Var.h) {
            i11 = org.telegram.ui.ActionBar.i6.f21013n6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, d6Var), mode));
        if (ih1Var.f37433n) {
            i12 = org.telegram.ui.ActionBar.i6.f21049p7;
        } else if (ih1Var.h) {
            i12 = org.telegram.ui.ActionBar.i6.f21013n6;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
        if (ih1Var.f37433n) {
            i13 = org.telegram.ui.ActionBar.i6.f21049p7;
        } else if (ih1Var.h) {
            i13 = org.telegram.ui.ActionBar.i6.f21013n6;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.f21214y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, d6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ih1(context, d6Var);
    }
}
