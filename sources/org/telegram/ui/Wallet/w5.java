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
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r81;
public final class w5 extends FrameLayout {
    public final TextView f43280a;
    public final FrameLayout f43281b;
    public final FrameLayout f43282c;
    public final FrameLayout d;
    public s0 f43283e;
    public boolean f43284f;
    public boolean h;
    public ValueAnimator f43285n;

    public w5(Context context, String str) {
        super(context);
        float f10;
        char c10;
        ActivityManager activityManager;
        addView(new o5(context, str), c8.ha.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43281b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(20.0f), -1));
        frameLayout.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        addView(frameLayout, c8.ha.d(212, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f43282c = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, c8.ha.d(164, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        ai.g c11 = ai.h.c("ton://transfer/".concat(str), 768, gc.b.H, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new di.b3(context, c11), c8.ha.c(-1.0f, -1));
        if (c11 == null) {
            f10 = 0.0f;
        } else {
            f10 = c11.f1191l / c11.f1183b;
        }
        if (f10 > 0.0f) {
            if (iz.o() != 0 && !rc.f() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                int round = Math.round(f10 * 164.0f * 1.35f);
                frameLayout3.addView(new p8(context), c8.ha.e(round, round, 17));
            } else {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(2131231957);
                int round2 = Math.round(f10 * 164.0f);
                frameLayout3.addView(imageView, c8.ha.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.f43280a = textView;
        textView.setText(hd.M0(2131743153, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable h = jg.g.h(context, 2131232813);
        h.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        h.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        textView.setCompoundDrawables(h, null, null, null);
        c8.ka.a(textView);
        frameLayout2.addView(textView, c8.ha.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, c8.ha.c(-1.0f, -1));
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
        TextView i12 = org.telegram.ui.Cells.f1.i(this.d, textView2, c8.ha.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        i12.setText(hd.M0(2131743201, null));
        i12.setTextColor(-15556886);
        i12.setTextSize(1, 14.0f);
        i12.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        i12.setGravity(17);
        i12.setCompoundDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(2131232398).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        i12.setCompoundDrawables(mutate, null, null, null);
        TextView i13 = org.telegram.ui.Cells.f1.i(this.d, i12, c8.ha.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        i13.setText(hd.M0(2131743014, null));
        i13.setTextColor(-15556886);
        i13.setTextSize(1, 14.0f);
        i13.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        i13.setGravity(17);
        i13.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        int L2 = org.telegram.messenger.g0.L(18.0f);
        i13.setBackground(org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        c8.ka.a(i13);
        this.d.addView(i13, c8.ha.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final w5 f43237b;

            {
                this.f43237b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f43237b;
                        if (!w5Var.f43284f && !w5Var.h) {
                            s0 s0Var = w5Var.f43283e;
                            if (s0Var != null) {
                                s0Var.run();
                            }
                            w5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f43237b.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.f43280a.setOnClickListener(onClickListener);
        i13.setOnClickListener(new View.OnClickListener(this) {
            public final w5 f43237b;

            {
                this.f43237b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w5 w5Var = this.f43237b;
                        if (!w5Var.f43284f && !w5Var.h) {
                            s0 s0Var = w5Var.f43283e;
                            if (s0Var != null) {
                                s0Var.run();
                            }
                            w5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f43237b.a(false);
                        return;
                }
            }
        });
    }

    public final void a(boolean z9) {
        float f10;
        if (this.f43284f != z9 && !this.h) {
            this.h = true;
            this.f43284f = z9;
            FrameLayout frameLayout = this.f43281b;
            frameLayout.setLayerType(2, null);
            float rotationY = frameLayout.getRotationY();
            if (z9) {
                f10 = 180.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotationY, f10);
            this.f43285n = ofFloat;
            ofFloat.setDuration(420L);
            this.f43285n.setInterpolator(xq.h);
            this.f43285n.addUpdateListener(new r3(this, 2));
            this.f43285n.addListener(new r81(this, 7));
            this.f43285n.start();
        }
    }
}
