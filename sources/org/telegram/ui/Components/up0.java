package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class up0 extends FrameLayout {
    public final LinearLayout f33106a;
    public final ImageView f33107b;
    public final org.telegram.ui.ActionBar.h5 f33108c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f33109e;
    public final FrameLayout f33110f;
    public final o9[] h;
    public final o9 f33111n;
    public final ImageView f33112r;
    public final wp0 f33113s;

    public up0(wp0 wp0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f33113s = wp0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33106a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.a0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 20, 20, 6, 6));
        g7.g6.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, g7.e6.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f33107b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23293te, b6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, g7.e6.q(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33110f = frameLayout;
        linearLayout.addView(frameLayout, g7.e6.t(-2, -1, 115, 6, 0, 0, 0));
        this.h = new o9[3];
        for (int i9 = 2; i9 >= 0; i9--) {
            this.h[i9] = new o9(context);
            this.h[i9].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i9].setVisibility(8);
            int i10 = 32 - (i9 * 4);
            this.f33110f.addView(this.h[i9], g7.e6.d(i10, i10, 19, i9 * 12, 0.0f, 0.0f, 0.0f));
        }
        o9 o9Var = new o9(context);
        this.f33111n = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        o9Var.setVisibility(8);
        this.f33106a.addView(o9Var, g7.e6.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33106a.addView(frameLayout2, g7.e6.o(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f33108c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23324ve, b6Var));
        frameLayout2.addView(h5Var, g7.e6.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        int i11 = org.telegram.ui.ActionBar.f6.Xk;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        frameLayout2.addView(h5Var2, g7.e6.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.f33109e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        h5Var3.setAlpha(0.0f);
        frameLayout2.addView(h5Var3, g7.e6.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f33112r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wk, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new h70(this, 15));
        this.f33106a.addView(imageView2, g7.e6.t(36, 36, 21, 0, 0, 4, 0));
    }
}
