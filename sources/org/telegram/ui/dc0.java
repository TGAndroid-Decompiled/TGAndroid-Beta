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
public final class dc0 extends FrameLayout {
    public final org.telegram.ui.Components.r9 f36177a;
    public final SpannableStringBuilder f36178b;
    public final org.telegram.ui.Cells.w1 f36179c;
    public final TextView d;
    public final org.telegram.ui.Cells.w1 f36180e;
    public final TextView f36181f;
    public final org.telegram.ui.Components.lo0 h;
    public final bc0 f36182n;
    public boolean f36183r;
    public float f36184s;
    public ValueAnimator v;
    public float f36185w;
    public ValueAnimator f36186x;
    public final fc0 f36187y;

    public dc0(fc0 fc0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f36187y = fc0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.setGravity(i10);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        yh.p(15.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.k6.L6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, k7.c6.q(-2, -2, 16));
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(context, true, false, false);
        w1Var.v = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, org.telegram.ui.ActionBar.k6.w0(null, i12, false)));
        this.f36179c = w1Var;
        w1Var.setTypeface(AndroidUtilities.bold());
        w1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        w1Var.setTextSize(AndroidUtilities.dp(12.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        linearLayout.addView(w1Var, k7.c6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, k7.c6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.lo0 lo0Var = new org.telegram.ui.Components.lo0(context, null, true);
        this.h = lo0Var;
        lo0Var.setReportChanges(true);
        lo0Var.setDelegate(new h(this, 23));
        lo0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        lo0Var.setImportantForAccessibility(2);
        addView(lo0Var, k7.c6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.k6.f22036y6;
        yh.t(i13, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, k7.c6.e(-2, -2, 19));
        org.telegram.ui.Cells.w1 w1Var2 = new org.telegram.ui.Cells.w1(this, context);
        this.f36180e = w1Var2;
        w1Var2.b(0.45f, 240L, org.telegram.ui.Components.pr.h);
        w1Var2.setGravity(1);
        w1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        w1Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21839n6, false));
        frameLayout.addView(w1Var2, k7.c6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f36178b = spannableStringBuilder;
        org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9();
        this.f36177a = r9Var;
        r9Var.f30646a = w1Var2.getPaint();
        r9Var.f30650f = AndroidUtilities.dp(1.5f);
        r9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(r9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f36181f = textView3;
        textView3.setTextSize(1, 13.0f);
        yh.t(i13, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, k7.c6.e(-2, -2, 21));
        addView(frameLayout, k7.c6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f36182n = new bc0(this);
        a();
    }

    public final void a() {
        int i10;
        boolean z4;
        float f10;
        float f11;
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.w1 w1Var = this.f36180e;
        w1Var.a();
        if (powerSaverLevel <= 0) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f12 = powerSaverLevel;
            this.f36177a.a(f12 / 100.0f, true);
            w1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f36178b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i10 = R.string.LiteBatteryEnabled;
        } else {
            i10 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i10).toUpperCase();
        org.telegram.ui.Cells.w1 w1Var2 = this.f36179c;
        w1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        float f13 = 0.0f;
        if (z4 != this.f36183r) {
            this.f36183r = z4;
            w1Var2.clearAnimation();
            ViewPropertyAnimator animate = w1Var2.animate();
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            b.p(animate.alpha(f11), org.telegram.ui.Components.pr.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f36184s != f10) {
            this.f36184s = f10;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36184s, f10);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final dc0 f35130b;

                {
                    this.f35130b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            dc0 dc0Var = this.f35130b;
                            TextView textView = dc0Var.f36181f;
                            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22036y6, false);
                            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21839n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            dc0Var.f36184s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            dc0 dc0Var2 = this.f35130b;
                            TextView textView2 = dc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22036y6, false);
                            int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21839n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            dc0Var2.f36185w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.v.addListener(new cc0(this, f10, 0));
            this.v.setInterpolator(org.telegram.ui.Components.pr.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f13 = 1.0f;
        }
        if (this.f36185w != f13) {
            this.f36185w = f13;
            ValueAnimator valueAnimator2 = this.f36186x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f36186x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f36185w, f13);
            this.f36186x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final dc0 f35130b;

                {
                    this.f35130b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            dc0 dc0Var = this.f35130b;
                            TextView textView = dc0Var.f36181f;
                            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22036y6, false);
                            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21839n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            dc0Var.f36184s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            dc0 dc0Var2 = this.f35130b;
                            TextView textView2 = dc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22036y6, false);
                            int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21839n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            dc0Var2.f36185w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.f36186x.addListener(new cc0(this, f13, 1));
            this.f36186x.setInterpolator(org.telegram.ui.Components.pr.h);
            this.f36186x.setDuration(320L);
            this.f36186x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f36182n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f36182n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f36182n.performAccessibilityAction(this, i10, bundle);
    }
}
