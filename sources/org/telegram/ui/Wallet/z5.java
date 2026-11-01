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
import org.telegram.messenger.dd;
import org.telegram.messenger.tc;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ms0;
public final class z5 extends FrameLayout {
    public final TextView f35466a;
    public final FrameLayout f35467b;
    public final FrameLayout f35468c;
    public final FrameLayout d;
    public q0 e;
    public boolean f35469f;
    public boolean h;
    public ValueAnimator f35470n;

    public z5(Context context, String str) {
        super(context);
        float f7;
        char c10;
        ActivityManager activityManager;
        addView(new q5(context, str), w7.b6.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35467b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(20.0f), -1));
        frameLayout.setCameraDistance(org.telegram.messenger.i0.L(8000.0f));
        addView(frameLayout, w7.b6.d(212, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f35468c = frameLayout2;
        frameLayout.addView(frameLayout2, w7.b6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, w7.b6.d(164, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        qh.f c11 = qh.g.c("ton://transfer/".concat(str), 768, ac.d.H, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new ih.c(context, c11), w7.b6.c(-1.0f, -1));
        if (c11 == null) {
            f7 = 0.0f;
        } else {
            f7 = c11.f45620l / c11.f45613b;
        }
        if (f7 > 0.0f) {
            if (uz.o() != 0 && !tc.f() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                int round = Math.round(f7 * 164.0f * 1.35f);
                frameLayout3.addView(new u8(context), w7.b6.e(round, round, 17));
            } else {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(2131231956);
                int round2 = Math.round(f7 * 164.0f);
                frameLayout3.addView(imageView, w7.b6.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.f35466a = textView;
        textView.setText(dd.L0(2131743178, null));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        int L = org.telegram.messenger.i0.L(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, -984578, -1903620, -1903620));
        Drawable f10 = i0.a.f(context, 2131232811);
        f10.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        f10.setBounds(0, 0, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
        textView.setCompoundDrawables(f10, null, null, null);
        w7.e6.a(textView);
        frameLayout2.addView(textView, w7.b6.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, w7.b6.c(-1.0f, -1));
        TextView textView2 = new TextView(context);
        String replace = str.replace(" ", "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        int i11 = 0;
        while (i10 < replace.length()) {
            if (i11 > 0) {
                if (i11 % 3 == 0) {
                    c10 = '\n';
                } else {
                    c10 = ' ';
                }
                spannableStringBuilder.append(c10);
            }
            int length = spannableStringBuilder.length();
            int i12 = i10 + 4;
            spannableStringBuilder.append((CharSequence) replace, i10, Math.min(i12, replace.length()));
            if ((i11 & 1) != 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(-7434605), length, spannableStringBuilder.length(), 33);
            }
            i11++;
            i10 = i12;
        }
        textView2.setText(spannableStringBuilder);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(1, 18.0f);
        textView2.setTypeface(b6.r0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView l4 = org.telegram.ui.Cells.f1.l(this.d, textView2, w7.b6.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        l4.setText(dd.L0(2131743226, null));
        l4.setTextColor(-15556886);
        l4.setTextSize(1, 14.0f);
        l4.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        l4.setGravity(17);
        l4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(3.0f));
        Drawable mutate = context.getResources().getDrawable(2131232397).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        l4.setCompoundDrawables(mutate, null, null, null);
        TextView l10 = org.telegram.ui.Cells.f1.l(this.d, l4, w7.b6.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        l10.setText(dd.L0(2131743039, null));
        l10.setTextColor(-15556886);
        l10.setTextSize(1, 14.0f);
        l10.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        l10.setGravity(17);
        l10.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        int L2 = org.telegram.messenger.i0.L(18.0f);
        l10.setBackground(org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, -984578, -1903620, -1903620));
        w7.e6.a(l10);
        this.d.addView(l10, w7.b6.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final z5 f35417b;

            {
                this.f35417b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z5 z5Var = this.f35417b;
                        if (!z5Var.f35469f && !z5Var.h) {
                            q0 q0Var = z5Var.e;
                            if (q0Var != null) {
                                q0Var.run();
                            }
                            z5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f35417b.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.f35466a.setOnClickListener(onClickListener);
        l10.setOnClickListener(new View.OnClickListener(this) {
            public final z5 f35417b;

            {
                this.f35417b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z5 z5Var = this.f35417b;
                        if (!z5Var.f35469f && !z5Var.h) {
                            q0 q0Var = z5Var.e;
                            if (q0Var != null) {
                                q0Var.run();
                            }
                            z5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f35417b.a(false);
                        return;
                }
            }
        });
    }

    public final void a(boolean z10) {
        float f7;
        if (this.f35469f != z10 && !this.h) {
            this.h = true;
            this.f35469f = z10;
            FrameLayout frameLayout = this.f35467b;
            frameLayout.setLayerType(2, null);
            float rotationY = frameLayout.getRotationY();
            if (z10) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotationY, f7);
            this.f35470n = ofFloat;
            ofFloat.setDuration(420L);
            this.f35470n.setInterpolator(gr.h);
            this.f35470n.addUpdateListener(new r3(this, 2));
            this.f35470n.addListener(new ms0(this, 18));
            this.f35470n.start();
        }
    }
}
