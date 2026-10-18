package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class gg1 extends org.telegram.ui.Components.e61 {
    public static final int f37210a = 0;

    static {
        org.telegram.ui.Components.e61.setup(new org.telegram.ui.Components.e61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        float f7;
        int i10;
        int i11;
        int i12;
        int i13;
        hg1 hg1Var = (hg1) view;
        int i14 = f61Var.f26146k;
        CharSequence charSequence = f61Var.f26147l;
        CharSequence charSequence2 = f61Var.f26148m;
        boolean z11 = f61Var.f26152q;
        boolean z12 = f61Var.f26153r;
        int i15 = f61Var.f26160z;
        TextView textView = hg1Var.d;
        TextView textView2 = hg1Var.e;
        ImageView imageView = hg1Var.f37566f;
        hg1Var.h = z11;
        hg1Var.f37567n = z12;
        ImageView imageView2 = hg1Var.f37564b;
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
        hg1Var.f37565c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.d6 d6Var = hg1Var.f37563a;
        if (hg1Var.f37567n) {
            i10 = org.telegram.ui.ActionBar.h6.f21231q7;
        } else if (hg1Var.h) {
            i10 = org.telegram.ui.ActionBar.h6.f21176n6;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.G6;
        }
        int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
        if (hg1Var.f37567n) {
            i11 = org.telegram.ui.ActionBar.h6.f21231q7;
        } else if (hg1Var.h) {
            i11 = org.telegram.ui.ActionBar.h6.f21176n6;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), mode));
        if (hg1Var.f37567n) {
            i12 = org.telegram.ui.ActionBar.h6.f21214p7;
        } else if (hg1Var.h) {
            i12 = org.telegram.ui.ActionBar.h6.f21176n6;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        if (hg1Var.f37567n) {
            i13 = org.telegram.ui.ActionBar.h6.f21214p7;
        } else if (hg1Var.h) {
            i13 = org.telegram.ui.ActionBar.h6.f21176n6;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.f21381y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new hg1(context, d6Var);
    }
}
