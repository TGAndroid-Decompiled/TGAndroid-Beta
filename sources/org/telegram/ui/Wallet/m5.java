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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.bs;
import org.telegram.ui.tf1;
public final class m5 extends FrameLayout {
    public final TextView f34510a;
    public final FrameLayout f34511b;
    public final FrameLayout f34512c;
    public final FrameLayout d;
    public r0 e;
    public boolean f34513f;
    public boolean h;
    public ValueAnimator f34514n;

    public m5(Context context, String str) {
        super(context);
        float f7;
        char c10;
        ActivityManager activityManager;
        addView(new d5(context, str), w7.z5.e(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34511b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), -1));
        frameLayout.setCameraDistance(AndroidUtilities.dp(8000.0f));
        addView(frameLayout, w7.z5.d(212, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34512c = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, w7.z5.d(164, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        zh.e c11 = zh.f.c("ton://transfer/".concat(str), 768, ic.c.H, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new ci.i3(context, c11), w7.z5.c(-1.0f, -1));
        if (c11 == null) {
            f7 = 0.0f;
        } else {
            f7 = c11.f51980l / c11.f51973b;
        }
        if (f7 > 0.0f) {
            if (SharedConfig.getDevicePerformanceClass() != 0 && !LiteMode.isPowerSaverApplied() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                int round = Math.round(f7 * 164.0f * 1.35f);
                frameLayout3.addView(new i8(context), w7.z5.e(round, round, 17));
            } else {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(R.drawable.mini_gram_72);
                int round2 = Math.round(f7 * 164.0f);
                frameLayout3.addView(imageView, w7.z5.e(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.f34510a = textView;
        textView.setText(LocaleController.getString(R.string.WalletCopyAddress));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, -984578, -1903620, -1903620));
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView.setCompoundDrawables(mutate, null, null, null);
        w7.b6.a(textView);
        frameLayout2.addView(textView, w7.z5.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, w7.z5.c(-1.0f, -1));
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
        textView2.setTypeface(o5.m0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView j10 = org.telegram.ui.Cells.c1.j(this.d, textView2, w7.z5.d(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        j10.setText(LocaleController.getString(R.string.WalletAddressCopiedShort));
        j10.setTextColor(-15556886);
        j10.setTextSize(1, 14.0f);
        j10.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        j10.setGravity(17);
        j10.setCompoundDrawablePadding(AndroidUtilities.dp(3.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        j10.setCompoundDrawables(mutate2, null, null, null);
        TextView j11 = org.telegram.ui.Cells.c1.j(this.d, j10, w7.z5.d(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        j11.setText(LocaleController.getString(R.string.WalletShowMyQR));
        j11.setTextColor(-15556886);
        j11.setTextSize(1, 14.0f);
        j11.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        j11.setGravity(17);
        j11.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp2 = AndroidUtilities.dp(18.0f);
        j11.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, -984578, -1903620, -1903620));
        w7.b6.a(j11);
        this.d.addView(j11, w7.z5.d(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final m5 f34466b;

            {
                this.f34466b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f34466b;
                        if (!m5Var.f34513f && !m5Var.h) {
                            r0 r0Var = m5Var.e;
                            if (r0Var != null) {
                                r0Var.run();
                            }
                            m5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f34466b.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.f34510a.setOnClickListener(onClickListener);
        j11.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f34466b;

            {
                this.f34466b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f34466b;
                        if (!m5Var.f34513f && !m5Var.h) {
                            r0 r0Var = m5Var.e;
                            if (r0Var != null) {
                                r0Var.run();
                            }
                            m5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f34466b.a(false);
                        return;
                }
            }
        });
    }

    public final void a(boolean z10) {
        float f7;
        if (this.f34513f != z10 && !this.h) {
            this.h = true;
            this.f34513f = z10;
            FrameLayout frameLayout = this.f34511b;
            frameLayout.setLayerType(2, null);
            float rotationY = frameLayout.getRotationY();
            if (z10) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotationY, f7);
            this.f34514n = ofFloat;
            ofFloat.setDuration(420L);
            this.f34514n.setInterpolator(bs.h);
            this.f34514n.addUpdateListener(new b3(this, 2));
            this.f34514n.addListener(new tf1(this, 5));
            this.f34514n.start();
        }
    }
}
