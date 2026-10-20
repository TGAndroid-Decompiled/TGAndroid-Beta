package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ob0 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f39817a;
    public final SpannableStringBuilder f39818b;
    public final org.telegram.ui.Cells.x1 f39819c;
    public final TextView d;
    public final org.telegram.ui.Cells.x1 e;
    public final TextView f39820f;
    public final org.telegram.ui.Components.dp0 h;
    public final mb0 f39821n;
    public boolean f39822r;
    public float f39823s;
    public ValueAnimator v;
    public float f39824w;
    public ValueAnimator f39825x;
    public final qb0 f39826y;

    public ob0(qb0 qb0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f39826y = qb0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.setGravity(i10);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(15.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.h6.L6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(context, true, false, false);
        x1Var.v = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.m1(0.15f, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        this.f39819c = x1Var;
        x1Var.setTypeface(AndroidUtilities.bold());
        x1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        x1Var.setTextSize(AndroidUtilities.dp(12.0f));
        x1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        linearLayout.addView(x1Var, w7.z5.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, w7.z5.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.dp0 dp0Var = new org.telegram.ui.Components.dp0(context, null, true);
        this.h = dp0Var;
        dp0Var.setReportChanges(true);
        dp0Var.setDelegate(new g(this, 23));
        dp0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        dp0Var.setImportantForAccessibility(2);
        addView(dp0Var, w7.z5.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.h6.f21378y6;
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, w7.z5.e(-2, -2, 19));
        org.telegram.ui.Cells.x1 x1Var2 = new org.telegram.ui.Cells.x1(this, context);
        this.e = x1Var2;
        x1Var2.b(0.45f, 240L, org.telegram.ui.Components.bs.h);
        x1Var2.setGravity(1);
        x1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        x1Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21173n6, false));
        frameLayout.addView(x1Var2, w7.z5.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f39818b = spannableStringBuilder;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9();
        this.f39817a = y9Var;
        y9Var.f32589a = x1Var2.getPaint();
        y9Var.f32592f = AndroidUtilities.dp(1.5f);
        y9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(y9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f39820f = textView3;
        textView3.setTextSize(1, 13.0f);
        com.google.android.gms.internal.play_billing.k3.o(i13, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, w7.z5.e(-2, -2, 21));
        addView(frameLayout, w7.z5.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f39821n = new mb0(this);
        a();
    }

    public final void a() {
        int i10;
        boolean z10;
        float f7;
        float f10;
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.x1 x1Var = this.e;
        x1Var.a();
        if (powerSaverLevel <= 0) {
            x1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            x1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f11 = powerSaverLevel;
            this.f39817a.a(f11 / 100.0f, true);
            x1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f11))), this.f39818b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i10 = R.string.LiteBatteryEnabled;
        } else {
            i10 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i10).toUpperCase();
        org.telegram.ui.Cells.x1 x1Var2 = this.f39819c;
        x1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 0.0f;
        if (z10 != this.f39822r) {
            this.f39822r = z10;
            x1Var2.clearAnimation();
            ViewPropertyAnimator animate = x1Var2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.mk.t(animate.alpha(f10), org.telegram.ui.Components.bs.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f39823s != f7) {
            this.f39823s = f7;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39823s, f7);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final ob0 f38879b;

                {
                    this.f38879b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            ob0 ob0Var = this.f38879b;
                            TextView textView = ob0Var.f39820f;
                            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21378y6, false);
                            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21173n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            ob0Var.f39823s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            ob0 ob0Var2 = this.f38879b;
                            TextView textView2 = ob0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21378y6, false);
                            int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21173n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            ob0Var2.f39824w = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.v.addListener(new nb0(this, f7, 0));
            this.v.setInterpolator(org.telegram.ui.Components.bs.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f12 = 1.0f;
        }
        if (this.f39824w != f12) {
            this.f39824w = f12;
            ValueAnimator valueAnimator2 = this.f39825x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f39825x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f39824w, f12);
            this.f39825x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final ob0 f38879b;

                {
                    this.f38879b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            ob0 ob0Var = this.f38879b;
                            TextView textView = ob0Var.f39820f;
                            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21378y6, false);
                            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21173n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            ob0Var.f39823s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            ob0 ob0Var2 = this.f38879b;
                            TextView textView2 = ob0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21378y6, false);
                            int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21173n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            ob0Var2.f39824w = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f39825x.addListener(new nb0(this, f12, 1));
            this.f39825x.setInterpolator(org.telegram.ui.Components.bs.h);
            this.f39825x.setDuration(320L);
            this.f39825x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f39821n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f39821n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f39821n.performAccessibilityAction(this, i10, bundle);
    }
}
