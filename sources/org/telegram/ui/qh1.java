package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qh1 extends org.telegram.ui.Components.h51 {
    public static final int f36885a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        rh1 rh1Var = (rh1) view;
        int i14 = i51Var.f24893k;
        CharSequence charSequence = i51Var.f24894l;
        CharSequence charSequence2 = i51Var.f24895m;
        boolean z11 = i51Var.f24899q;
        boolean z12 = i51Var.f24900r;
        int i15 = i51Var.f24907z;
        TextView textView = rh1Var.d;
        TextView textView2 = rh1Var.e;
        ImageView imageView = rh1Var.f37117f;
        rh1Var.h = z11;
        rh1Var.f37118n = z12;
        ImageView imageView2 = rh1Var.f37115b;
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
        rh1Var.f37116c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.e6 e6Var = rh1Var.f37114a;
        if (rh1Var.f37118n) {
            i10 = org.telegram.ui.ActionBar.i6.f19074q7;
        } else if (rh1Var.h) {
            i10 = org.telegram.ui.ActionBar.i6.f19021n6;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (rh1Var.f37118n) {
            i11 = org.telegram.ui.ActionBar.i6.f19074q7;
        } else if (rh1Var.h) {
            i11 = org.telegram.ui.ActionBar.i6.f19021n6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var), mode));
        if (rh1Var.f37118n) {
            i12 = org.telegram.ui.ActionBar.i6.f19056p7;
        } else if (rh1Var.h) {
            i12 = org.telegram.ui.ActionBar.i6.f19021n6;
        } else {
            i12 = org.telegram.ui.ActionBar.i6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var));
        if (rh1Var.f37118n) {
            i13 = org.telegram.ui.ActionBar.i6.f19056p7;
        } else if (rh1Var.h) {
            i13 = org.telegram.ui.ActionBar.i6.f19021n6;
        } else {
            i13 = org.telegram.ui.ActionBar.i6.f19218y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new rh1(context, e6Var);
    }
}
