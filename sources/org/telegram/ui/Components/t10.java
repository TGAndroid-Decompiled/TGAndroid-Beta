package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class t10 extends org.telegram.ui.ActionBar.z2 {
    public static final int f30408i1 = 0;

    public t10(Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, true);
        int i10;
        int i11 = 0;
        this.f21617v0 = false;
        this.f21616u0 = false;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        this.N = f7;
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624320, 120, 120, null);
        imageView.d();
        f7.addView((View) imageView, w7.b6.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.z20.n(textView, 1, 24.0f);
        org.telegram.messenger.z20.p(textView, org.telegram.ui.ActionBar.t6.f21037j5, null, null, 2131749563);
        f7.addView(textView, w7.b6.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, w7.b6.t(-2, -2, 1, 0, 12, 0, 0));
        int i12 = 0;
        while (true) {
            if (i12 < 3) {
                LinearLayout f10 = org.telegram.messenger.m5.f(context, i11);
                if (org.telegram.messenger.cd.X) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                linearLayout.addView(f10, w7.b6.t(-2, -2, i10, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(context);
                int i13 = org.telegram.ui.ActionBar.t6.f21185r5;
                org.telegram.ui.ActionBar.a7.t(imageView2, i13, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(2131231624);
                TextView textView2 = new TextView(context);
                int i14 = i11;
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
                textView2.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
                textView2.setMaxWidth(org.telegram.messenger.i0.L(260.0f));
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            textView2.setText(org.telegram.messenger.cd.L0(2131749565, null));
                        }
                    } else {
                        textView2.setText(org.telegram.messenger.cd.L0(2131749566, null));
                    }
                } else {
                    textView2.setText(org.telegram.messenger.cd.L0(2131749567, null));
                }
                if (org.telegram.messenger.cd.X) {
                    f10.addView(textView2, w7.b6.o(-2, -2));
                    f10.addView(imageView2, w7.b6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f10.addView(imageView2, w7.b6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    f10.addView(textView2, w7.b6.o(-2, -2));
                }
                i12++;
                i11 = i14;
            } else {
                int i15 = i11;
                ?? frameLayout = new FrameLayout(context);
                View view = new View(context);
                frameLayout.f30084a = view;
                int i16 = org.telegram.ui.ActionBar.t6.Ci;
                float[] fArr = new float[1];
                fArr[i15] = 4.0f;
                view.setBackground(org.telegram.ui.ActionBar.j6.f(i16, fArr));
                frameLayout.addView(view, w7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(context);
                frameLayout.f30085b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                org.telegram.messenger.m5.m(textView3, org.telegram.ui.ActionBar.t6.Gi, null, 1, 14.0f);
                frameLayout.addView(textView3, w7.b6.e(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(org.telegram.messenger.cd.L0(2131749564, null));
                view.setOnClickListener(new ag.i(this, context, k2Var, 16));
                f7.addView((View) frameLayout, w7.b6.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 14.0f);
                org.telegram.messenger.z20.p(textView4, org.telegram.ui.ActionBar.t6.f21114n5, null, null, 2131749569);
                textView4.setGravity(17);
                f7.addView(textView4, w7.b6.t(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new h0(this, 18));
                return;
            }
        }
    }

    public abstract void I0();

    public abstract void J0();
}
