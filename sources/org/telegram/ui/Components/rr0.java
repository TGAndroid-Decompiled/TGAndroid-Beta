package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class rr0 extends FrameLayout {
    public final LinearLayout f30529a;
    public final ImageView f30530b;
    public final org.telegram.ui.ActionBar.h5 f30531c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 f30532e;
    public final FrameLayout f30533f;
    public final y9[] h;
    public final y9 f30534n;
    public final ImageView f30535r;
    public final tr0 f30536s;

    public rr0(tr0 tr0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f30536s = tr0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30529a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.b0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, d6Var), 20, 20, 6, 6));
        w7.z5.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, w7.x5.a(-1.0f, 4.0f, 4.0f, 4.0f, 4.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.f30530b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21089te, d6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, w7.x5.q(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30533f = frameLayout;
        linearLayout.addView(frameLayout, w7.x5.t(-2, -1, 115, 6, 0, 0, 0));
        this.h = new y9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            this.h[i10] = new y9(context);
            this.h[i10].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            this.f30533f.addView(this.h[i10], w7.x5.a(i11, i10 * 12, 0.0f, 0.0f, 0.0f, i11, 19));
        }
        y9 y9Var = new y9(context);
        this.f30534n = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        y9Var.setVisibility(8);
        this.f30529a.addView(y9Var, w7.x5.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30529a.addView(frameLayout2, w7.x5.o(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f30531c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21125ve, d6Var));
        frameLayout2.addView(h5Var, w7.x5.a(18.0f, 8.0f, 2.0f, 8.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.h6.Xk;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        frameLayout2.addView(h5Var2, w7.x5.a(18.0f, 8.0f, 20.0f, 8.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.f30532e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        h5Var3.setAlpha(0.0f);
        frameLayout2.addView(h5Var3, w7.x5.a(18.0f, 8.0f, 20.0f, 8.0f, 0.0f, -1, 51));
        ImageView imageView2 = new ImageView(context);
        this.f30535r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wk, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, d6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new c90(this, 14));
        this.f30529a.addView(imageView2, w7.x5.t(36, 36, 21, 0, 0, 4, 0));
    }
}
