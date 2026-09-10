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
public final class lc0 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f34642a;
    public final SpannableStringBuilder f34643b;
    public final org.telegram.ui.Cells.w1 f34644c;
    public final TextView d;
    public final org.telegram.ui.Cells.w1 e;
    public final TextView f34645f;
    public final org.telegram.ui.Components.oo0 h;
    public final jc0 f34646n;
    public boolean f34647r;
    public float f34648s;
    public ValueAnimator v;
    public float f34649w;
    public ValueAnimator f34650x;
    public final nc0 f34651y;

    public lc0(nc0 nc0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f34651y = nc0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.setGravity(i10);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.k(15.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.j6.L6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, w7.a6.q(-2, -2, 16));
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(context, true, false, false);
        w1Var.v = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.f34644c = w1Var;
        w1Var.setTypeface(AndroidUtilities.bold());
        w1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        w1Var.setTextSize(AndroidUtilities.dp(12.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        linearLayout.addView(w1Var, w7.a6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, w7.a6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.oo0 oo0Var = new org.telegram.ui.Components.oo0(context, null, true);
        this.h = oo0Var;
        oo0Var.setReportChanges(true);
        oo0Var.setDelegate(new g(this, 23));
        oo0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        oo0Var.setImportantForAccessibility(2);
        addView(oo0Var, w7.a6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f18306y6;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, w7.a6.e(-2, -2, 19));
        org.telegram.ui.Cells.w1 w1Var2 = new org.telegram.ui.Cells.w1(this, context);
        this.e = w1Var2;
        w1Var2.b(0.45f, 240L, org.telegram.ui.Components.wr.h);
        w1Var2.setGravity(1);
        w1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        w1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18110n6, false));
        frameLayout.addView(w1Var2, w7.a6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f34643b = spannableStringBuilder;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9();
        this.f34642a = y9Var;
        y9Var.f29278a = w1Var2.getPaint();
        y9Var.f29281f = AndroidUtilities.dp(1.5f);
        y9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(y9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f34645f = textView3;
        textView3.setTextSize(1, 13.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, w7.a6.e(-2, -2, 21));
        addView(frameLayout, w7.a6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f34646n = new jc0(this);
        a();
    }

    public final void a() {
        int i10;
        boolean z10;
        float f7;
        float f10;
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.w1 w1Var = this.e;
        w1Var.a();
        if (powerSaverLevel <= 0) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f11 = powerSaverLevel;
            this.f34642a.a(f11 / 100.0f, true);
            w1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f11))), this.f34643b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i10 = R.string.LiteBatteryEnabled;
        } else {
            i10 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i10).toUpperCase();
        org.telegram.ui.Cells.w1 w1Var2 = this.f34644c;
        w1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 0.0f;
        if (z10 != this.f34647r) {
            this.f34647r = z10;
            w1Var2.clearAnimation();
            ViewPropertyAnimator animate = w1Var2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.em.q(animate.alpha(f10), org.telegram.ui.Components.wr.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f34648s != f7) {
            this.f34648s = f7;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34648s, f7);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final lc0 f33612b;

                {
                    this.f33612b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            lc0 lc0Var = this.f33612b;
                            TextView textView = lc0Var.f34645f;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18110n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            lc0Var.f34648s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            lc0 lc0Var2 = this.f33612b;
                            TextView textView2 = lc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false);
                            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18110n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            lc0Var2.f34649w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.v.addListener(new kc0(this, f7, 0));
            this.v.setInterpolator(org.telegram.ui.Components.wr.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f12 = 1.0f;
        }
        if (this.f34649w != f12) {
            this.f34649w = f12;
            ValueAnimator valueAnimator2 = this.f34650x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f34650x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f34649w, f12);
            this.f34650x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final lc0 f33612b;

                {
                    this.f33612b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            lc0 lc0Var = this.f33612b;
                            TextView textView = lc0Var.f34645f;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18110n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            lc0Var.f34648s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            lc0 lc0Var2 = this.f33612b;
                            TextView textView2 = lc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false);
                            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18110n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            lc0Var2.f34649w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.f34650x.addListener(new kc0(this, f12, 1));
            this.f34650x.setInterpolator(org.telegram.ui.Components.wr.h);
            this.f34650x.setDuration(320L);
            this.f34650x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f34646n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f34646n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f34646n.performAccessibilityAction(this, i10, bundle);
    }
}
