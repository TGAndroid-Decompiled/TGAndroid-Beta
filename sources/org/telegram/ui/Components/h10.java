package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class h10 extends org.telegram.ui.ActionBar.u2 {
    public static final int f35147m1 = 0;

    public h10(Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context, true);
        int i7;
        this.f29720w0 = false;
        this.f29718v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.O = f10;
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624323, 120, 120, null);
        imageView.d();
        f10.addView((View) imageView, c8.ja.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 24.0f);
        org.telegram.messenger.i20.q(textView, org.telegram.ui.ActionBar.j6.f28957j5, null, null, 2131749554);
        f10.addView(textView, c8.ja.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f10.addView(linearLayout, c8.ja.t(-2, -2, 1, 0, 12, 0, 0));
        int i10 = 0;
        while (true) {
            if (i10 < 3) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
                if (org.telegram.messenger.hd.f24104a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                linearLayout.addView(f11, c8.ja.t(-2, -2, i7, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(context);
                int i11 = org.telegram.ui.ActionBar.j6.f29107r5;
                org.telegram.ui.ActionBar.q6.s(imageView2, i11, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(2131231623);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.q6.U(textView2, i11, null);
                textView2.setGravity((org.telegram.messenger.hd.f24104a0 ? 5 : 3) | 16);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            textView2.setText(org.telegram.messenger.hd.M0(2131749556, null));
                        }
                    } else {
                        textView2.setText(org.telegram.messenger.hd.M0(2131749557, null));
                    }
                } else {
                    textView2.setText(org.telegram.messenger.hd.M0(2131749558, null));
                }
                if (org.telegram.messenger.hd.f24104a0) {
                    f11.addView(textView2, c8.ja.o(-2, -2));
                    f11.addView(imageView2, c8.ja.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f11.addView(imageView2, c8.ja.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    f11.addView(textView2, c8.ja.o(-2, -2));
                }
                i10++;
            } else {
                ?? frameLayout = new FrameLayout(context);
                View view = new View(context);
                frameLayout.f34777a = view;
                view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
                frameLayout.addView(view, c8.ja.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(context);
                frameLayout.f34778b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                org.telegram.messenger.k5.m(textView3, org.telegram.ui.ActionBar.j6.Ji, null, 1, 14.0f);
                frameLayout.addView(textView3, c8.ja.e(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(org.telegram.messenger.hd.M0(2131749555, null));
                view.setOnClickListener(new lt(this, context, e2Var, 1));
                f10.addView((View) frameLayout, c8.ja.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 14.0f);
                org.telegram.messenger.i20.q(textView4, org.telegram.ui.ActionBar.j6.f29030n5, null, null, 2131749560);
                textView4.setGravity(17);
                f10.addView(textView4, c8.ja.t(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new e0(this, 20));
                return;
            }
        }
    }

    public abstract void I0();

    public abstract void J0();
}
