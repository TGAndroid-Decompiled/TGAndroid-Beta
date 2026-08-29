package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class gq0 extends FrameLayout {
    public final LinearLayout f28957a;
    public final ImageView f28958b;
    public final org.telegram.ui.ActionBar.h5 f28959c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f28960e;
    public final FrameLayout f28961f;
    public final t9[] h;
    public final t9 f28962n;
    public final ImageView f28963r;
    public final iq0 f28964s;

    public gq0(iq0 iq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28964s = iq0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28957a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.a0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 20, 20, 6, 6));
        i7.h6.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, i7.f6.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f28958b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23354te, c6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, i7.f6.q(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28961f = frameLayout;
        linearLayout.addView(frameLayout, i7.f6.t(-2, -1, 115, 6, 0, 0, 0));
        this.h = new t9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            this.h[i10] = new t9(context);
            this.h[i10].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            this.f28961f.addView(this.h[i10], i7.f6.d(i11, i11, 19, i10 * 12, 0.0f, 0.0f, 0.0f));
        }
        t9 t9Var = new t9(context);
        this.f28962n = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        t9Var.setVisibility(8);
        this.f28957a.addView(t9Var, i7.f6.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f28957a.addView(frameLayout2, i7.f6.o(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f28959c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23391ve, c6Var));
        frameLayout2.addView(h5Var, i7.f6.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.g6.Xk;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        frameLayout2.addView(h5Var2, i7.f6.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.f28960e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        h5Var3.setAlpha(0.0f);
        frameLayout2.addView(h5Var3, i7.f6.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f28963r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wk, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new u70(this, 15));
        this.f28957a.addView(imageView2, i7.f6.t(36, 36, 21, 0, 0, 4, 0));
    }
}
