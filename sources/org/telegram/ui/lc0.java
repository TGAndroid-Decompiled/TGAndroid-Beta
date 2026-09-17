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
    public final org.telegram.ui.Components.z9 f38291a;
    public final SpannableStringBuilder f38292b;
    public final org.telegram.ui.Cells.w1 f38293c;
    public final TextView d;
    public final org.telegram.ui.Cells.w1 f38294e;
    public final TextView f38295f;
    public final org.telegram.ui.Components.fo0 h;
    public final jc0 f38296n;
    public boolean f38297r;
    public float f38298s;
    public ValueAnimator v;
    public float f38299w;
    public ValueAnimator f38300x;
    public final nc0 f38301y;

    public lc0(nc0 nc0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f38301y = nc0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.setGravity(i10);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.m(15.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.j6.L6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(context, true, false, false);
        w1Var.v = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, org.telegram.ui.ActionBar.j6.w0(null, i12, false)));
        this.f38293c = w1Var;
        w1Var.setTypeface(AndroidUtilities.bold());
        w1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        w1Var.setTextSize(AndroidUtilities.dp(12.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        linearLayout.addView(w1Var, w7.x5.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, w7.x5.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(context, null, true);
        this.h = fo0Var;
        fo0Var.setReportChanges(true);
        fo0Var.setDelegate(new g(this, 23));
        fo0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        fo0Var.setImportantForAccessibility(2);
        addView(fo0Var, w7.x5.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.j6.f21043y6;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, w7.x5.e(-2, -2, 19));
        org.telegram.ui.Cells.w1 w1Var2 = new org.telegram.ui.Cells.w1(this, context);
        this.f38294e = w1Var2;
        w1Var2.b(0.45f, 240L, org.telegram.ui.Components.pr.h);
        w1Var2.setGravity(1);
        w1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        w1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20847n6, false));
        frameLayout.addView(w1Var2, w7.x5.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f38292b = spannableStringBuilder;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9();
        this.f38291a = z9Var;
        z9Var.f33102a = w1Var2.getPaint();
        z9Var.f33106f = AndroidUtilities.dp(1.5f);
        z9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(z9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f38295f = textView3;
        textView3.setTextSize(1, 13.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, w7.x5.e(-2, -2, 21));
        addView(frameLayout, w7.x5.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f38296n = new jc0(this);
        a();
    }

    public final void a() {
        int i10;
        boolean z10;
        float f7;
        float f10;
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.w1 w1Var = this.f38294e;
        w1Var.a();
        if (powerSaverLevel <= 0) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f11 = powerSaverLevel;
            this.f38291a.a(f11 / 100.0f, true);
            w1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f11))), this.f38292b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i10 = R.string.LiteBatteryEnabled;
        } else {
            i10 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i10).toUpperCase();
        org.telegram.ui.Cells.w1 w1Var2 = this.f38293c;
        w1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 0.0f;
        if (z10 != this.f38297r) {
            this.f38297r = z10;
            w1Var2.clearAnimation();
            ViewPropertyAnimator animate = w1Var2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.vl.q(animate.alpha(f10), org.telegram.ui.Components.pr.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f38298s != f7) {
            this.f38298s = f7;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38298s, f7);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final lc0 f37297b;

                {
                    this.f37297b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            lc0 lc0Var = this.f37297b;
                            TextView textView = lc0Var.f38295f;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21043y6, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20847n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            lc0Var.f38298s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            lc0 lc0Var2 = this.f37297b;
                            TextView textView2 = lc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21043y6, false);
                            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20847n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            lc0Var2.f38299w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.v.addListener(new kc0(this, f7, 0));
            this.v.setInterpolator(org.telegram.ui.Components.pr.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f12 = 1.0f;
        }
        if (this.f38299w != f12) {
            this.f38299w = f12;
            ValueAnimator valueAnimator2 = this.f38300x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f38300x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f38299w, f12);
            this.f38300x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final lc0 f37297b;

                {
                    this.f37297b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            lc0 lc0Var = this.f37297b;
                            TextView textView = lc0Var.f38295f;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21043y6, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20847n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            lc0Var.f38298s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            lc0 lc0Var2 = this.f37297b;
                            TextView textView2 = lc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21043y6, false);
                            int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20847n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            lc0Var2.f38299w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.f38300x.addListener(new kc0(this, f12, 1));
            this.f38300x.setInterpolator(org.telegram.ui.Components.pr.h);
            this.f38300x.setDuration(320L);
            this.f38300x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38296n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f38296n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f38296n.performAccessibilityAction(this, i10, bundle);
    }
}
