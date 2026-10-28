package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mg1 extends org.telegram.ui.Components.t61 {
    public static final int f41440a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.k71 k71Var, org.telegram.ui.Components.s71 s71Var) {
        float f7;
        ng1 ng1Var = (ng1) view;
        int i10 = u61Var.f33248k;
        CharSequence charSequence = u61Var.f33249l;
        CharSequence charSequence2 = u61Var.f33250m;
        boolean z11 = u61Var.f33254q;
        boolean z12 = u61Var.f33255r;
        int i11 = u61Var.f33262z;
        TextView textView = ng1Var.e;
        ImageView imageView = ng1Var.f41802f;
        ng1Var.h = z11;
        ng1Var.f41803n = z12;
        ng1Var.f41800b.setImageResource(i10);
        int i12 = 8;
        if (i11 != 0) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        ng1Var.d.setText(charSequence);
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
        ng1Var.f41801c.setPadding(0, dp, 0, dp);
        ng1Var.updateColors();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new ng1(context, u6Var);
    }
}
