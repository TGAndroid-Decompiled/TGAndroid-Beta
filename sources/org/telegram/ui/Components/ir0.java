package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class ir0 extends FrameLayout {
    public final LinearLayout f27327a;
    public final ImageView f27328b;
    public final org.telegram.ui.ActionBar.j5 f27329c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final FrameLayout f27330f;
    public final w9[] h;
    public final w9 f27331n;
    public final ImageView f27332r;
    public final kr0 f27333s;

    public ir0(kr0 kr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f27333s = kr0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f27327a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21079i6, d6Var), 20, 20, 6, 6));
        w7.b6.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, w7.z5.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f27328b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21294te, d6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, w7.z5.q(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27330f = frameLayout;
        linearLayout.addView(frameLayout, w7.z5.t(-2, -1, 115, 6, 0, 0, 0));
        this.h = new w9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            this.h[i10] = new w9(context);
            this.h[i10].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            this.f27330f.addView(this.h[i10], w7.z5.d(i11, i11, 19, i10 * 12, 0.0f, 0.0f, 0.0f));
        }
        w9 w9Var = new w9(context);
        this.f27331n = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        this.f27327a.addView(w9Var, w7.z5.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f27327a.addView(frameLayout2, w7.z5.o(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f27329c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21331ve, d6Var));
        frameLayout2.addView(j5Var, w7.z5.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var2;
        j5Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.h6.Xk;
        j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        frameLayout2.addView(j5Var2, w7.z5.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var3;
        j5Var3.setTextSize(14);
        j5Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        j5Var3.setAlpha(0.0f);
        frameLayout2.addView(j5Var3, w7.z5.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f27332r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21079i6, d6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new u80(this, 14));
        this.f27327a.addView(imageView2, w7.z5.t(36, 36, 21, 0, 0, 4, 0));
    }
}
