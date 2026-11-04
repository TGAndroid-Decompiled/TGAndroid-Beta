package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class a10 extends org.telegram.ui.ActionBar.t2 {
    public static final int f31704j1 = 0;

    public a10(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context, true);
        int i3;
        this.f28621w0 = false;
        this.f28619v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.O = f10;
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624322, 120, 120, null);
        imageView.d();
        f10.addView((View) imageView, b8.mf.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.f27988j5, null, null, 2131749562);
        f10.addView(textView, b8.mf.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f10.addView(linearLayout, b8.mf.t(-2, -2, 1, 0, 12, 0, 0));
        int i10 = 0;
        while (true) {
            if (i10 < 3) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
                if (org.telegram.messenger.bd.f21784a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                linearLayout.addView(f11, b8.mf.t(-2, -2, i3, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(context);
                int i11 = org.telegram.ui.ActionBar.k6.r5;
                org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(2131231623);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
                textView2.setGravity((org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 16);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            textView2.setText(org.telegram.messenger.bd.M0(2131749564, null));
                        }
                    } else {
                        textView2.setText(org.telegram.messenger.bd.M0(2131749565, null));
                    }
                } else {
                    textView2.setText(org.telegram.messenger.bd.M0(2131749566, null));
                }
                if (org.telegram.messenger.bd.f21784a0) {
                    f11.addView(textView2, b8.mf.o(-2, -2));
                    f11.addView(imageView2, b8.mf.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f11.addView(imageView2, b8.mf.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    f11.addView(textView2, b8.mf.o(-2, -2));
                }
                i10++;
            } else {
                ?? frameLayout = new FrameLayout(context);
                View view = new View(context);
                frameLayout.f40885a = view;
                view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                frameLayout.addView(view, b8.mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(context);
                frameLayout.f40886b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
                frameLayout.addView(textView3, b8.mf.e(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(org.telegram.messenger.bd.M0(2131749563, null));
                view.setOnClickListener(new ct(this, context, d2Var, 1));
                f10.addView((View) frameLayout, b8.mf.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 14.0f);
                org.telegram.messenger.camera.q.o(textView4, org.telegram.ui.ActionBar.k6.f28061n5, null, null, 2131749568);
                textView4.setGravity(17);
                f10.addView(textView4, b8.mf.t(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new f0(this, 19));
                return;
            }
        }
    }

    public abstract void I0();

    public abstract void J0();
}
