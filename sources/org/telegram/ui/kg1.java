package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class kg1 extends org.telegram.ui.Components.l61 {
    public static final int f38947a = 0;

    static {
        org.telegram.ui.Components.l61.setup(new org.telegram.ui.Components.l61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.m61 m61Var, boolean z10, org.telegram.ui.Components.b71 b71Var, org.telegram.ui.Components.j71 j71Var) {
        float f7;
        lg1 lg1Var = (lg1) view;
        int i10 = m61Var.f28558k;
        CharSequence charSequence = m61Var.f28559l;
        CharSequence charSequence2 = m61Var.f28560m;
        boolean z11 = m61Var.f28564q;
        boolean z12 = m61Var.f28565r;
        int i11 = m61Var.f28572z;
        TextView textView = lg1Var.e;
        ImageView imageView = lg1Var.f39250f;
        lg1Var.h = z11;
        lg1Var.f39251n = z12;
        lg1Var.f39248b.setImageResource(i10);
        int i12 = 8;
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        lg1Var.d.setText(charSequence);
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
        lg1Var.f39249c.setPadding(0, dp, 0, dp);
        lg1Var.updateColors();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new lg1(context, g6Var);
    }
}
