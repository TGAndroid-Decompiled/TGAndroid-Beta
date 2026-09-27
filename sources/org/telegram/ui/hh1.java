package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hh1 extends org.telegram.ui.Components.w51 {
    public static final int f34234a = 0;

    static {
        org.telegram.ui.Components.w51.setup(new org.telegram.ui.Components.w51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        ih1 ih1Var = (ih1) view;
        int i14 = x51Var.f30301k;
        CharSequence charSequence = x51Var.f30302l;
        CharSequence charSequence2 = x51Var.f30303m;
        boolean z11 = x51Var.f30307q;
        boolean z12 = x51Var.f30308r;
        int i15 = x51Var.f30315z;
        TextView textView = ih1Var.d;
        TextView textView2 = ih1Var.e;
        ImageView imageView = ih1Var.f34490f;
        ih1Var.h = z11;
        ih1Var.f34491n = z12;
        ImageView imageView2 = ih1Var.f34488b;
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
        ih1Var.f34489c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.e6 e6Var = ih1Var.f34487a;
        if (ih1Var.f34491n) {
            i10 = org.telegram.ui.ActionBar.i6.f19297q7;
        } else if (ih1Var.h) {
            i10 = org.telegram.ui.ActionBar.i6.f19242n6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (ih1Var.f34491n) {
            i11 = org.telegram.ui.ActionBar.i6.f19297q7;
        } else if (ih1Var.h) {
            i11 = org.telegram.ui.ActionBar.i6.f19242n6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var), mode));
        if (ih1Var.f34491n) {
            i12 = org.telegram.ui.ActionBar.i6.f19278p7;
        } else if (ih1Var.h) {
            i12 = org.telegram.ui.ActionBar.i6.f19242n6;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        if (ih1Var.f34491n) {
            i13 = org.telegram.ui.ActionBar.i6.f19278p7;
        } else if (ih1Var.h) {
            i13 = org.telegram.ui.ActionBar.i6.f19242n6;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.f19442y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ih1(context, e6Var);
    }
}
