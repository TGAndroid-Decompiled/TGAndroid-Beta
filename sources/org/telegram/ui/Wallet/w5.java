package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.er;
import org.telegram.ui.g71;
public final class w5 extends FrameLayout {
    public final TextView f44625a;
    public final TextView f44626b;
    public final FrameLayout f44627c;
    public final FrameLayout d;
    public final FrameLayout f44628e;
    public q0 f44629f;
    public boolean h;
    public boolean f44630n;
    public ValueAnimator f44631r;

    public w5(Context context, String str) {
        super(context);
        float f10;
        char c10;
        ActivityManager activityManager;
        addView(new o5(context, str), c8.ja.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44627c = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(20.0f), -1));
        frameLayout.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        addView(frameLayout, c8.ja.d(212, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, c8.ja.d(164, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        ci.e c11 = ci.f.c("ton://transfer/".concat(str), 768, gc.c.H, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new fi.w2(context, c11), c8.ja.c(-1.0f, -1));
        if (c11 == null) {
            f10 = 0.0f;
        } else {
            f10 = c11.f5349l / c11.f5341b;
        }
        if (f10 > 0.0f) {
            if (gz.o() != 0 && !qc.f() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                int round = Math.round(f10 * 164.0f * 1.35f);
                frameLayout3.addView(new q8(context), c8.ja.e(round, round, 17));
            } else {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(2131231957);
                int round2 = Math.round(f10 * 164.0f);
                frameLayout3.addView(imageView, c8.ja.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.f44625a = textView;
        textView.setText(hd.M0(2131743152, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.j6.k0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable g10 = i5.c.g(context, 2131232814);
        g10.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        g10.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView.setCompoundDrawables(g10, null, null, null);
        c8.na.a(textView);
        frameLayout2.addView(textView, c8.ja.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f44628e = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, c8.ja.c(-1.0f, -1));
        TextView textView2 = new TextView(context);
        String replace = str.replace(" ", "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = 0;
        int i10 = 0;
        while (i7 < replace.length()) {
            if (i10 > 0) {
                if (i10 % 3 == 0) {
                    c10 = '\n';
                } else {
                    c10 = ' ';
                }
                spannableStringBuilder.append(c10);
            }
            int length = spannableStringBuilder.length();
            int i11 = i7 + 4;
            spannableStringBuilder.append((CharSequence) replace, i7, Math.min(i11, replace.length()));
            if ((i10 & 1) != 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-7434605), length, spannableStringBuilder.length(), 33);
            }
            i10++;
            i7 = i11;
        }
        textView2.setText(spannableStringBuilder);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(1, 18.0f);
        textView2.setTypeface(y5.r0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView k10 = org.telegram.ui.Cells.y0.k(this.f44628e, textView2, c8.ja.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        k10.setText(hd.M0(2131743200, null));
        k10.setTextColor(-15556886);
        k10.setTextSize(1, 14.0f);
        k10.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        k10.setGravity(17);
        k10.setCompoundDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(2131232399).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        k10.setCompoundDrawables(mutate, null, null, null);
        TextView k11 = org.telegram.ui.Cells.y0.k(this.f44628e, k10, c8.ja.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        this.f44626b = k11;
        k11.setText(hd.M0(2131743013, null));
        k11.setTextColor(-15556886);
        k11.setTextSize(1, 14.0f);
        k11.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        k11.setGravity(17);
        k11.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        k11.setBackground(org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        c8.na.a(k11);
        this.f44628e.addView(k11, c8.ja.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final w5 f44606b;

            {
                this.f44606b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f44606b;
                        if (!w5Var.h && !w5Var.f44630n) {
                            q0 q0Var = w5Var.f44629f;
                            if (q0Var != null) {
                                q0Var.run();
                            }
                            w5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f44606b.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.f44625a.setOnClickListener(onClickListener);
        k11.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f44606b;

            {
                this.f44606b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f44606b;
                        if (!w5Var.h && !w5Var.f44630n) {
                            q0 q0Var = w5Var.f44629f;
                            if (q0Var != null) {
                                q0Var.run();
                            }
                            w5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f44606b.a(false);
                        return;
                }
            }
        });
    }

    public final void a(boolean z10) {
        float f10;
        if (this.h != z10 && !this.f44630n) {
            this.f44630n = true;
            this.h = z10;
            FrameLayout frameLayout = this.f44627c;
            frameLayout.setLayerType(2, null);
            float rotationY = frameLayout.getRotationY();
            if (z10) {
                f10 = 180.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotationY, f10);
            this.f44631r = ofFloat;
            ofFloat.setDuration(420L);
            this.f44631r.setInterpolator(er.h);
            this.f44631r.addUpdateListener(new q3(this, 2));
            this.f44631r.addListener(new g71(this, 8));
            this.f44631r.start();
        }
    }
}
