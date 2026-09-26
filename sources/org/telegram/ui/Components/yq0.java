package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class yq0 extends FrameLayout {
    public final LinearLayout f30688a;
    public final ImageView f30689b;
    public final org.telegram.ui.ActionBar.h5 f30690c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final FrameLayout f30691f;
    public final w9[] h;
    public final w9 f30692n;
    public final ImageView f30693r;
    public final ar0 f30694s;

    public yq0(ar0 ar0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f30694s = ar0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30688a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, d6Var), 20, 20, 6, 6));
        w7.a6.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, w7.y5.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f30689b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19361te, d6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, w7.y5.q(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30691f = frameLayout;
        linearLayout.addView(frameLayout, w7.y5.t(-2, -1, 115, 6, 0, 0, 0));
        this.h = new w9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            this.h[i10] = new w9(context);
            this.h[i10].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            this.f30691f.addView(this.h[i10], w7.y5.d(i11, i11, 19, i10 * 12, 0.0f, 0.0f, 0.0f));
        }
        w9 w9Var = new w9(context);
        this.f30692n = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        this.f30688a.addView(w9Var, w7.y5.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f30688a.addView(frameLayout2, w7.y5.o(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f30690c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19397ve, d6Var));
        frameLayout2.addView(h5Var, w7.y5.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.h6.Xk;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        frameLayout2.addView(h5Var2, w7.y5.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        h5Var3.setAlpha(0.0f);
        frameLayout2.addView(h5Var3, w7.y5.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30693r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, d6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new j80(this, 15));
        this.f30688a.addView(imageView2, w7.y5.t(36, 36, 21, 0, 0, 4, 0));
    }
}
