package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class d10 extends org.telegram.ui.ActionBar.v2 {
    public static final int f32751i1 = 0;

    public d10(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, true);
        int i7;
        this.f28648v0 = false;
        this.f28647u0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.N = f10;
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624322, 120, 120, null);
        imageView.d();
        f10.addView((View) imageView, c8.ha.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 24.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.f27957j5, null, null, 2131749553);
        f10.addView(textView, c8.ha.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        f10.addView(linearLayout, c8.ha.t(-2, -2, 1, 0, 12, 0, 0));
        int i10 = 0;
        while (true) {
            if (i10 < 3) {
                LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
                if (org.telegram.messenger.hd.f22878a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                linearLayout.addView(f11, c8.ha.t(-2, -2, i7, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(context);
                int i11 = org.telegram.ui.ActionBar.k6.f28107r5;
                org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(2131231623);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
                textView2.setGravity((org.telegram.messenger.hd.f22878a0 ? 5 : 3) | 16);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            textView2.setText(org.telegram.messenger.hd.M0(2131749555, null));
                        }
                    } else {
                        textView2.setText(org.telegram.messenger.hd.M0(2131749556, null));
                    }
                } else {
                    textView2.setText(org.telegram.messenger.hd.M0(2131749557, null));
                }
                if (org.telegram.messenger.hd.f22878a0) {
                    f11.addView(textView2, c8.ha.o(-2, -2));
                    f11.addView(imageView2, c8.ha.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f11.addView(imageView2, c8.ha.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    f11.addView(textView2, c8.ha.o(-2, -2));
                }
                i10++;
            } else {
                ?? frameLayout = new FrameLayout(context);
                View view = new View(context);
                frameLayout.f32374a = view;
                view.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
                frameLayout.addView(view, c8.ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(context);
                frameLayout.f32375b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                org.telegram.messenger.k5.n(textView3, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
                frameLayout.addView(textView3, c8.ha.e(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(org.telegram.messenger.hd.M0(2131749554, null));
                view.setOnClickListener(new ah.g(this, context, f2Var, 26));
                f10.addView((View) frameLayout, c8.ha.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(context);
                textView4.setTextSize(1, 14.0f);
                org.telegram.messenger.camera.q.o(textView4, org.telegram.ui.ActionBar.k6.f28030n5, null, null, 2131749559);
                textView4.setGravity(17);
                f10.addView(textView4, c8.ha.t(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new h0(this, 19));
                return;
            }
        }
    }

    public abstract void I0();

    public abstract void J0();
}
