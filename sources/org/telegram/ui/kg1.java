package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class kg1 extends org.telegram.ui.Components.s61 {
    public static final int f40943a = 0;

    static {
        org.telegram.ui.Components.s61.setup(new org.telegram.ui.Components.s61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.t61 t61Var, boolean z10, org.telegram.ui.Components.j71 j71Var, org.telegram.ui.Components.r71 r71Var) {
        float f7;
        lg1 lg1Var = (lg1) view;
        int i10 = t61Var.f32874k;
        CharSequence charSequence = t61Var.f32875l;
        CharSequence charSequence2 = t61Var.f32876m;
        boolean z11 = t61Var.f32880q;
        boolean z12 = t61Var.f32881r;
        int i11 = t61Var.f32888z;
        TextView textView = lg1Var.e;
        ImageView imageView = lg1Var.f41275f;
        lg1Var.h = z11;
        lg1Var.f41276n = z12;
        lg1Var.f41273b.setImageResource(i10);
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
        lg1Var.f41274c.setPadding(0, dp, 0, dp);
        lg1Var.updateColors();
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new lg1(context, u6Var);
    }
}
