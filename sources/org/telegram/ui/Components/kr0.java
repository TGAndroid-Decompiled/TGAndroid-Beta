package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class kr0 extends FrameLayout {
    public final LinearLayout f28074a;
    public final ImageView f28075b;
    public final org.telegram.ui.ActionBar.n5 f28076c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final FrameLayout f28077f;
    public final u9[] h;
    public final u9 f28078n;
    public final ImageView f28079r;
    public final mr0 f28080s;

    public kr0(mr0 mr0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f28080s = mr0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f28074a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var), 20, 20, 6, 6));
        w7.b6.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, w7.z5.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f28075b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21488te, g6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, w7.z5.q(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f28077f = frameLayout;
        linearLayout.addView(frameLayout, w7.z5.t(-2, -1, 115, 6, 0, 0, 0));
        this.h = new u9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            this.h[i10] = new u9(context);
            this.h[i10].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            this.f28077f.addView(this.h[i10], w7.z5.d(i11, i11, 19, i10 * 12, 0.0f, 0.0f, 0.0f));
        }
        u9 u9Var = new u9(context);
        this.f28078n = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        u9Var.setVisibility(8);
        this.f28074a.addView(u9Var, w7.z5.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f28074a.addView(frameLayout2, w7.z5.o(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f28076c = n5Var;
        n5Var.setTextSize(14);
        n5Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.f21525ve, g6Var);
        frameLayout2.addView(n5Var, w7.z5.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var2;
        n5Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.k6.Xk;
        org.telegram.ui.ActionBar.r6.Z(n5Var2, i12, g6Var);
        frameLayout2.addView(n5Var2, w7.z5.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var3;
        n5Var3.setTextSize(14);
        org.telegram.ui.ActionBar.r6.Z(n5Var3, i12, g6Var);
        n5Var3.setAlpha(0.0f);
        frameLayout2.addView(n5Var3, w7.z5.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f28079r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.Wk, g6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new t80(this, 14));
        this.f28074a.addView(imageView2, w7.z5.t(36, 36, 21, 0, 0, 4, 0));
    }
}
