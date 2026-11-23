package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class p10 extends org.telegram.ui.ActionBar.w2 {
    public static final int f38364m1 = 0;

    public p10(Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, true);
        int i7;
        this.f30264w0 = false;
        this.f30262v0 = false;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        this.O = g10;
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624323, 120, 120, null);
        imageView.d();
        g10.addView((View) imageView, c8.na.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.m10.p(textView, 1, 24.0f);
        org.telegram.messenger.m10.r(textView, org.telegram.ui.ActionBar.n6.f29559j5, null, null, 2131749378);
        g10.addView(textView, c8.na.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        g10.addView(linearLayout, c8.na.t(-2, -2, 1, 0, 12, 0, 0));
        int i10 = 0;
        while (true) {
            if (i10 < 3) {
                LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
                if (org.telegram.messenger.gd.f24314a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                linearLayout.addView(g11, c8.na.t(-2, -2, i7, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(context);
                int i11 = org.telegram.ui.ActionBar.n6.f29709r5;
                org.telegram.ui.ActionBar.u6.s(imageView2, i11, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(2131231627);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.u6.U(textView2, i11, null);
                textView2.setGravity((org.telegram.messenger.gd.f24314a0 ? 5 : 3) | 16);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            textView2.setText(org.telegram.messenger.gd.N0(2131749380, null));
                        }
                    } else {
                        textView2.setText(org.telegram.messenger.gd.N0(2131749381, null));
                    }
                } else {
                    textView2.setText(org.telegram.messenger.gd.N0(2131749382, null));
                }
                if (org.telegram.messenger.gd.f24314a0) {
                    g11.addView(textView2, c8.na.o(-2, -2));
                    g11.addView(imageView2, c8.na.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    g11.addView(imageView2, c8.na.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    g11.addView(textView2, c8.na.o(-2, -2));
                }
                i10++;
            } else {
                ?? frameLayout = new FrameLayout(context);
                View view = new View(context);
                frameLayout.f37983a = view;
                view.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 4.0f));
                frameLayout.addView(view, c8.na.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(context);
                frameLayout.f37984b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                org.telegram.messenger.f3.l(textView3, org.telegram.ui.ActionBar.n6.Ji, null, 1, 14.0f);
                frameLayout.addView(textView3, c8.na.e(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(org.telegram.messenger.gd.N0(2131749379, null));
                view.setOnClickListener(new qt(this, context, g2Var, 1));
                g10.addView((View) frameLayout, c8.na.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 14.0f);
                org.telegram.messenger.m10.r(textView4, org.telegram.ui.ActionBar.n6.f29632n5, null, null, 2131749384);
                textView4.setGravity(17);
                g10.addView(textView4, c8.na.t(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new n0(this, 21));
                return;
            }
        }
    }

    public abstract void J0();

    public abstract void K0();
}
