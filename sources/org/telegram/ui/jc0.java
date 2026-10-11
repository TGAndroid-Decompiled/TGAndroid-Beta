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
public final class jc0 extends FrameLayout {
    public final org.telegram.ui.Components.aa f38973a;
    public final SpannableStringBuilder f38974b;
    public final org.telegram.ui.Cells.x1 f38975c;
    public final TextView d;
    public final org.telegram.ui.Cells.x1 f38976e;
    public final TextView f38977f;
    public final org.telegram.ui.Components.mp0 h;
    public final hc0 f38978n;
    public boolean f38979r;
    public float f38980s;
    public ValueAnimator v;
    public float f38981w;
    public ValueAnimator f38982x;
    public final lc0 f38983y;

    public jc0(lc0 lc0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f38983y = lc0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.setGravity(i10);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(15.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.h6.L6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, w7.x5.q(-2, -2, 16));
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(context, true, false, false);
        x1Var.v = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.m1(0.15f, org.telegram.ui.ActionBar.h6.x0(null, i12, false)));
        this.f38975c = x1Var;
        x1Var.setTypeface(AndroidUtilities.bold());
        x1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        x1Var.setTextSize(AndroidUtilities.dp(12.0f));
        x1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        linearLayout.addView(x1Var, w7.x5.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, w7.x5.a(-2.0f, 21.0f, 17.0f, 21.0f, 0.0f, -1, 55));
        org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(context, null, true);
        this.h = mp0Var;
        mp0Var.setReportChanges(true);
        mp0Var.setDelegate(new g(this, 23));
        mp0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        mp0Var.setImportantForAccessibility(2);
        addView(mp0Var, w7.x5.a(44.0f, 6.0f, 68.0f, 6.0f, 0.0f, -1, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.h6.f21171y6;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, w7.x5.e(-2, -2, 19));
        org.telegram.ui.Cells.x1 x1Var2 = new org.telegram.ui.Cells.x1(this, context);
        this.f38976e = x1Var2;
        x1Var2.b(0.45f, 240L, org.telegram.ui.Components.is.h);
        x1Var2.setGravity(1);
        x1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        x1Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20971n6, false));
        frameLayout.addView(x1Var2, w7.x5.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f38974b = spannableStringBuilder;
        org.telegram.ui.Components.aa aaVar = new org.telegram.ui.Components.aa();
        this.f38973a = aaVar;
        aaVar.f24475a = x1Var2.getPaint();
        aaVar.f24479f = AndroidUtilities.dp(1.5f);
        aaVar.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(aaVar, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f38977f = textView3;
        textView3.setTextSize(1, 13.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, w7.x5.e(-2, -2, 21));
        addView(frameLayout, w7.x5.a(-2.0f, 21.0f, 52.0f, 21.0f, 0.0f, -1, 55));
        this.f38978n = new hc0(this);
        a();
    }

    public final void a() {
        int i10;
        boolean z10;
        float f7;
        float f10;
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.x1 x1Var = this.f38976e;
        x1Var.a();
        if (powerSaverLevel <= 0) {
            x1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            x1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f11 = powerSaverLevel;
            this.f38973a.a(f11 / 100.0f, true);
            x1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f11))), this.f38974b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i10 = R.string.LiteBatteryEnabled;
        } else {
            i10 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i10).toUpperCase();
        org.telegram.ui.Cells.x1 x1Var2 = this.f38975c;
        x1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 0.0f;
        if (z10 != this.f38979r) {
            this.f38979r = z10;
            x1Var2.clearAnimation();
            ViewPropertyAnimator animate = x1Var2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.ai.t(animate.alpha(f10), org.telegram.ui.Components.is.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f38980s != f7) {
            this.f38980s = f7;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38980s, f7);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final jc0 f38009b;

                {
                    this.f38009b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            jc0 jc0Var = this.f38009b;
                            TextView textView = jc0Var.f38977f;
                            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21171y6, false);
                            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20971n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            jc0Var.f38980s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, x02, x03));
                            return;
                        default:
                            jc0 jc0Var2 = this.f38009b;
                            TextView textView2 = jc0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21171y6, false);
                            int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20971n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            jc0Var2.f38981w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.v.addListener(new ic0(this, f7, 0));
            this.v.setInterpolator(org.telegram.ui.Components.is.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f12 = 1.0f;
        }
        if (this.f38981w != f12) {
            this.f38981w = f12;
            ValueAnimator valueAnimator2 = this.f38982x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f38982x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f38981w, f12);
            this.f38982x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final jc0 f38009b;

                {
                    this.f38009b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            jc0 jc0Var = this.f38009b;
                            TextView textView = jc0Var.f38977f;
                            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21171y6, false);
                            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20971n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            jc0Var.f38980s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, x02, x03));
                            return;
                        default:
                            jc0 jc0Var2 = this.f38009b;
                            TextView textView2 = jc0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21171y6, false);
                            int x05 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20971n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            jc0Var2.f38981w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f38982x.addListener(new ic0(this, f12, 1));
            this.f38982x.setInterpolator(org.telegram.ui.Components.is.h);
            this.f38982x.setDuration(320L);
            this.f38982x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f38978n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f38978n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f38978n.performAccessibilityAction(this, i10, bundle);
    }
}
