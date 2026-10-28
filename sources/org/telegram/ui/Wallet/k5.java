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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.hc1;
public final class k5 extends FrameLayout {
    public final TextView f36811a;
    public final FrameLayout f36812b;
    public final FrameLayout f36813c;
    public final FrameLayout d;
    public q0 e;
    public boolean f36814f;
    public boolean h;
    public ValueAnimator f36815n;

    public k5(Context context, String str) {
        super(context);
        float f7;
        char c10;
        ActivityManager activityManager;
        addView(new a5(context, str), kb1.i(-1, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36812b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(20.0f), -1));
        frameLayout.setCameraDistance(AndroidUtilities.dp(8000.0f));
        addView(frameLayout, kb1.h(212, 244.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36813c = frameLayout2;
        frameLayout.addView(frameLayout2, kb1.g(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout2.addView(frameLayout3, kb1.h(164, 164.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        ai.g c11 = ai.h.c("ton://transfer/".concat(str), 768, jc.c.H, 1.0f, new ColorDrawable(0));
        frameLayout3.addView(new di.h3(context, c11), kb1.g(-1.0f, -1));
        if (c11 == null) {
            f7 = 0.0f;
        } else {
            f7 = c11.f1505l / c11.f1498b;
        }
        if (f7 > 0.0f) {
            if (SharedConfig.getDevicePerformanceClass() != 0 && !LiteMode.isPowerSaverApplied() && (activityManager = (ActivityManager) context.getSystemService("activity")) != null && activityManager.getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                int round = Math.round(f7 * 164.0f * 1.35f);
                frameLayout3.addView(new i8(context), kb1.i(round, round, 17));
            } else {
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(R.drawable.mini_gram_72);
                int round2 = Math.round(f7 * 164.0f);
                frameLayout3.addView(imageView, kb1.i(round2, round2, 17));
            }
        }
        TextView textView = new TextView(context);
        this.f36811a = textView;
        textView.setText(LocaleController.getString(R.string.WalletCopyAddress));
        textView.setTextColor(-15556886);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, -984578, -1903620, -1903620));
        Drawable mutate = context.getResources().getDrawable(R.drawable.wallet_copy).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        textView.setCompoundDrawables(mutate, null, null, null);
        kb1.b(textView);
        frameLayout2.addView(textView, kb1.h(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout4.setRotationY(180.0f);
        frameLayout.addView(frameLayout4, kb1.g(-1.0f, -1));
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
        textView2.setTypeface(m5.n0(context));
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setMaxLines(4);
        textView2.setLineSpacing(0.0f, 1.0f);
        TextView k10 = org.telegram.ui.d3.k(this.d, textView2, kb1.h(-1, 112.0f, 55, 8.0f, 32.0f, 8.0f, 0.0f), context);
        k10.setText(LocaleController.getString(R.string.WalletAddressCopiedShort));
        k10.setTextColor(-15556886);
        k10.setTextSize(1, 14.0f);
        k10.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        k10.setGravity(17);
        k10.setCompoundDrawablePadding(AndroidUtilities.dp(3.0f));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_text_check).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-15556886, PorterDuff.Mode.SRC_IN));
        mutate2.setBounds(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        k10.setCompoundDrawables(mutate2, null, null, null);
        TextView k11 = org.telegram.ui.d3.k(this.d, k10, kb1.h(-2, 28.0f, 49, 0.0f, 149.0f, 0.0f, 0.0f), context);
        k11.setText(LocaleController.getString(R.string.WalletShowMyQR));
        k11.setTextColor(-15556886);
        k11.setTextSize(1, 14.0f);
        k11.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        k11.setGravity(17);
        k11.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp2 = AndroidUtilities.dp(18.0f);
        k11.setBackground(org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, -984578, -1903620, -1903620));
        kb1.b(k11);
        this.d.addView(k11, kb1.h(-2, 28.0f, 49, 0.0f, 202.0f, 0.0f, 0.0f));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final k5 f36761b;

            {
                this.f36761b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var = this.f36761b;
                        if (!k5Var.f36814f && !k5Var.h) {
                            q0 q0Var = k5Var.e;
                            if (q0Var != null) {
                                q0Var.run();
                            }
                            k5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f36761b.a(false);
                        return;
                }
            }
        };
        frameLayout3.setOnClickListener(onClickListener);
        this.f36811a.setOnClickListener(onClickListener);
        k11.setOnClickListener(new View.OnClickListener(this) {
            public final k5 f36761b;

            {
                this.f36761b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k5 k5Var = this.f36761b;
                        if (!k5Var.f36814f && !k5Var.h) {
                            q0 q0Var = k5Var.e;
                            if (q0Var != null) {
                                q0Var.run();
                            }
                            k5Var.a(true);
                            return;
                        }
                        return;
                    default:
                        this.f36761b.a(false);
                        return;
                }
            }
        });
    }

    public final void a(boolean z10) {
        float f7;
        if (this.f36814f != z10 && !this.h) {
            this.h = true;
            this.f36814f = z10;
            FrameLayout frameLayout = this.f36812b;
            frameLayout.setLayerType(2, null);
            float rotationY = frameLayout.getRotationY();
            if (z10) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(rotationY, f7);
            this.f36815n = ofFloat;
            ofFloat.setDuration(420L);
            this.f36815n.setInterpolator(ds.h);
            this.f36815n.addUpdateListener(new a3(this, 2));
            this.f36815n.addListener(new hc1(this, 8));
            this.f36815n.start();
        }
    }
}
