package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class fh1 extends org.telegram.ui.Components.g51 {
    public static final int f36804a = 0;

    static {
        org.telegram.ui.Components.g51.setup(new org.telegram.ui.Components.g51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h51 h51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.h61 h61Var) {
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        gh1 gh1Var = (gh1) view;
        int i14 = h51Var.f27374k;
        CharSequence charSequence = h51Var.f27375l;
        CharSequence charSequence2 = h51Var.f27376m;
        boolean z10 = h51Var.f27380q;
        boolean z11 = h51Var.f27381r;
        int i15 = h51Var.f27388z;
        TextView textView = gh1Var.d;
        TextView textView2 = gh1Var.f37109e;
        ImageView imageView = gh1Var.f37110f;
        gh1Var.h = z10;
        gh1Var.f37111n = z11;
        ImageView imageView2 = gh1Var.f37107b;
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
        gh1Var.f37108c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.g6 g6Var = gh1Var.f37106a;
        if (gh1Var.f37111n) {
            i10 = org.telegram.ui.ActionBar.k6.f21897q7;
        } else if (gh1Var.h) {
            i10 = org.telegram.ui.ActionBar.k6.f21841n6;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (gh1Var.f37111n) {
            i11 = org.telegram.ui.ActionBar.k6.f21897q7;
        } else if (gh1Var.h) {
            i11 = org.telegram.ui.ActionBar.k6.f21841n6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), mode));
        if (gh1Var.f37111n) {
            i12 = org.telegram.ui.ActionBar.k6.f21878p7;
        } else if (gh1Var.h) {
            i12 = org.telegram.ui.ActionBar.k6.f21841n6;
        } else {
            i12 = org.telegram.ui.ActionBar.k6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        if (gh1Var.f37111n) {
            i13 = org.telegram.ui.ActionBar.k6.f21878p7;
        } else if (gh1Var.h) {
            i13 = org.telegram.ui.ActionBar.k6.f21841n6;
        } else {
            i13 = org.telegram.ui.ActionBar.k6.f22038y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new gh1(context, g6Var);
    }
}
