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
public final class qb0 extends FrameLayout {
    public final org.telegram.ui.Components.q9 f41742a;
    public final SpannableStringBuilder f41743b;
    public final org.telegram.ui.Cells.w1 f41744c;
    public final TextView d;
    public final org.telegram.ui.Cells.w1 f41745e;
    public final TextView f41746f;
    public final org.telegram.ui.Components.pn0 h;
    public final ob0 f41747n;
    public boolean f41748r;
    public float f41749s;
    public ValueAnimator v;
    public float f41750w;
    public ValueAnimator f41751x;
    public final sb0 f41752y;

    public qb0(sb0 sb0Var, Context context) {
        super(context);
        int i9;
        int i10;
        this.f41752y = sb0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        linearLayout.setGravity(i9);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        j3.r0.u(15.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.f6.L6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, g7.e6.q(-2, -2, 16));
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(context, true, false, false);
        w1Var.v = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, org.telegram.ui.ActionBar.f6.w0(null, i11, false)));
        this.f41744c = w1Var;
        w1Var.setTypeface(AndroidUtilities.bold());
        w1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        w1Var.setTextSize(AndroidUtilities.dp(12.0f));
        w1Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        linearLayout.addView(w1Var, g7.e6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, g7.e6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(context, null, true);
        this.h = pn0Var;
        pn0Var.setReportChanges(true);
        pn0Var.setDelegate(new g(this, 23));
        pn0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        pn0Var.setImportantForAccessibility(2);
        addView(pn0Var, g7.e6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i12 = org.telegram.ui.ActionBar.f6.f23369y6;
        j3.r0.w(i12, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, g7.e6.e(-2, -2, 19));
        org.telegram.ui.Cells.w1 w1Var2 = new org.telegram.ui.Cells.w1(this, context);
        this.f41745e = w1Var2;
        w1Var2.b(0.45f, 240L, org.telegram.ui.Components.gr.h);
        w1Var2.setGravity(1);
        w1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        w1Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false));
        frameLayout.addView(w1Var2, g7.e6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f41743b = spannableStringBuilder;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9();
        this.f41742a = q9Var;
        q9Var.f31865a = w1Var2.getPaint();
        q9Var.f31869f = AndroidUtilities.dp(1.5f);
        q9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(q9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f41746f = textView3;
        textView3.setTextSize(1, 13.0f);
        j3.r0.w(i12, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, g7.e6.e(-2, -2, 21));
        addView(frameLayout, g7.e6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f41747n = new ob0(this);
        a();
    }

    public final void a() {
        int i9;
        boolean z10;
        float f10;
        float f11;
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.w1 w1Var = this.f41745e;
        w1Var.a();
        if (powerSaverLevel <= 0) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f12 = powerSaverLevel;
            this.f41742a.a(f12 / 100.0f, true);
            w1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f12))), this.f41743b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i9 = R.string.LiteBatteryEnabled;
        } else {
            i9 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i9).toUpperCase();
        org.telegram.ui.Cells.w1 w1Var2 = this.f41744c;
        w1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f13 = 0.0f;
        if (z10 != this.f41748r) {
            this.f41748r = z10;
            w1Var2.clearAnimation();
            ViewPropertyAnimator animate = w1Var2.animate();
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            org.telegram.messenger.ll.r(animate.alpha(f11), org.telegram.ui.Components.gr.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (this.f41749s != f10) {
            this.f41749s = f10;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41749s, f10);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final qb0 f40688b;

                {
                    this.f40688b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            qb0 qb0Var = this.f40688b;
                            TextView textView = qb0Var.f41746f;
                            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false);
                            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            qb0Var.f41749s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            qb0 qb0Var2 = this.f40688b;
                            TextView textView2 = qb0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false);
                            int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            qb0Var2.f41750w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.v.addListener(new pb0(this, f10, 0));
            this.v.setInterpolator(org.telegram.ui.Components.gr.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f13 = 1.0f;
        }
        if (this.f41750w != f13) {
            this.f41750w = f13;
            ValueAnimator valueAnimator2 = this.f41751x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f41751x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f41750w, f13);
            this.f41751x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final qb0 f40688b;

                {
                    this.f40688b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            qb0 qb0Var = this.f40688b;
                            TextView textView = qb0Var.f41746f;
                            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false);
                            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            qb0Var.f41749s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            qb0 qb0Var2 = this.f40688b;
                            TextView textView2 = qb0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false);
                            int w05 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23179n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            qb0Var2.f41750w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.f41751x.addListener(new pb0(this, f13, 1));
            this.f41751x.setInterpolator(org.telegram.ui.Components.gr.h);
            this.f41751x.setDuration(320L);
            this.f41751x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f41747n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f41747n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        return this.f41747n.performAccessibilityAction(this, i9, bundle);
    }
}
