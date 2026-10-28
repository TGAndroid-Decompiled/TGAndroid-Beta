package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class pr0 extends FrameLayout {
    public final LinearLayout f31705a;
    public final ImageView f31706b;
    public final org.telegram.ui.ActionBar.b6 f31707c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final org.telegram.ui.ActionBar.b6 e;
    public final FrameLayout f31708f;
    public final y9[] h;
    public final y9 f31709n;
    public final ImageView f31710r;
    public final rr0 f31711s;

    public pr0(rr0 rr0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f31711s = rr0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31705a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.y6.b0(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, u6Var), 20, 20, 6, 6));
        kb1.c(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, kb1.h(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.f31706b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23662te, u6Var, PorterDuff.Mode.MULTIPLY);
        linearLayout.addView(imageView, kb1.u(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31708f = frameLayout;
        linearLayout.addView(frameLayout, kb1.x(-2, -1, 115, 6, 0, 0, 0));
        this.h = new y9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            this.h[i10] = new y9(context);
            this.h[i10].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            this.f31708f.addView(this.h[i10], kb1.h(i11, i11, 19, i10 * 12, 0.0f, 0.0f, 0.0f));
        }
        y9 y9Var = new y9(context);
        this.f31709n = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        y9Var.setVisibility(8);
        this.f31705a.addView(y9Var, kb1.x(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f31705a.addView(frameLayout2, kb1.s(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f31707c = b6Var;
        b6Var.setTextSize(14);
        b6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23700ve, u6Var);
        frameLayout2.addView(b6Var, kb1.h(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.d = b6Var2;
        b6Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.y6.Xk;
        org.telegram.ui.ActionBar.f7.Y(b6Var2, i12, u6Var);
        frameLayout2.addView(b6Var2, kb1.h(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var3 = new org.telegram.ui.ActionBar.b6(context);
        this.e = b6Var3;
        b6Var3.setTextSize(14);
        org.telegram.ui.ActionBar.f7.Y(b6Var3, i12, u6Var);
        b6Var3.setAlpha(0.0f);
        frameLayout2.addView(b6Var3, kb1.h(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f31710r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.Wk, u6Var, PorterDuff.Mode.MULTIPLY);
        imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, u6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new x80(this, 13));
        this.f31705a.addView(imageView2, kb1.x(36, 36, 21, 0, 0, 4, 0));
    }
}
