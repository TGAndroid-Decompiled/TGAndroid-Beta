package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class oh1 extends org.telegram.ui.Components.w51 {
    public static final int f36201a = 0;

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
        ph1 ph1Var = (ph1) view;
        int i14 = x51Var.f30247k;
        CharSequence charSequence = x51Var.f30248l;
        CharSequence charSequence2 = x51Var.f30249m;
        boolean z11 = x51Var.f30253q;
        boolean z12 = x51Var.f30254r;
        int i15 = x51Var.f30261z;
        TextView textView = ph1Var.d;
        TextView textView2 = ph1Var.e;
        ImageView imageView = ph1Var.f36490f;
        ph1Var.h = z11;
        ph1Var.f36491n = z12;
        ImageView imageView2 = ph1Var.f36488b;
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
        ph1Var.f36489c.setPadding(0, dp, 0, dp);
        org.telegram.ui.ActionBar.e6 e6Var = ph1Var.f36487a;
        if (ph1Var.f36491n) {
            i10 = org.telegram.ui.ActionBar.j6.f19301q7;
        } else if (ph1Var.h) {
            i10 = org.telegram.ui.ActionBar.j6.f19247n6;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.G6;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode));
        if (ph1Var.f36491n) {
            i11 = org.telegram.ui.ActionBar.j6.f19301q7;
        } else if (ph1Var.h) {
            i11 = org.telegram.ui.ActionBar.j6.f19247n6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.G6;
        }
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, e6Var), mode));
        if (ph1Var.f36491n) {
            i12 = org.telegram.ui.ActionBar.j6.f19283p7;
        } else if (ph1Var.h) {
            i12 = org.telegram.ui.ActionBar.j6.f19247n6;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.G6;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
        if (ph1Var.f36491n) {
            i13 = org.telegram.ui.ActionBar.j6.f19283p7;
        } else if (ph1Var.h) {
            i13 = org.telegram.ui.ActionBar.j6.f19247n6;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.f19445y6;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ph1(context, e6Var);
    }
}
