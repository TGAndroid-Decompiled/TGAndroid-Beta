package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class jg1 extends org.telegram.ui.Components.k61 {
    public static final int f38559a = 0;

    static {
        org.telegram.ui.Components.k61.setup(new org.telegram.ui.Components.k61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.l61 l61Var, boolean z10, org.telegram.ui.Components.a71 a71Var, org.telegram.ui.Components.i71 i71Var) {
        float f7;
        kg1 kg1Var = (kg1) view;
        int i10 = l61Var.f28226k;
        CharSequence charSequence = l61Var.f28227l;
        CharSequence charSequence2 = l61Var.f28228m;
        boolean z11 = l61Var.f28232q;
        boolean z12 = l61Var.f28233r;
        int i11 = l61Var.f28240z;
        TextView textView = kg1Var.e;
        ImageView imageView = kg1Var.f38921f;
        kg1Var.h = z11;
        kg1Var.f38922n = z12;
        kg1Var.f38919b.setImageResource(i10);
        int i12 = 8;
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        kg1Var.d.setText(charSequence);
        textView.setText(charSequence2);
        if (!TextUtils.isEmpty(charSequence2)) {
            i12 = 0;
        }
        textView.setVisibility(i12);
        if (TextUtils.isEmpty(charSequence2)) {
            f7 = 15.0f;
        } else {
            f7 = 10.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        kg1Var.f38920c.setPadding(0, dp, 0, dp);
        kg1Var.updateColors();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new kg1(context, g6Var);
    }
}
