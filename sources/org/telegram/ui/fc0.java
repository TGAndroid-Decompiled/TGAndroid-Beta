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
public final class fc0 extends FrameLayout {
    public final org.telegram.ui.Components.y9 f33625a;
    public final SpannableStringBuilder f33626b;
    public final org.telegram.ui.Cells.x1 f33627c;
    public final TextView d;
    public final org.telegram.ui.Cells.x1 e;
    public final TextView f33628f;
    public final org.telegram.ui.Components.so0 h;
    public final dc0 f33629n;
    public boolean f33630r;
    public float f33631s;
    public ValueAnimator v;
    public float f33632w;
    public ValueAnimator f33633x;
    public final hc0 f33634y;

    public fc0(hc0 hc0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f33634y = hc0Var;
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
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, w7.y5.q(-2, -2, 16));
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(context, true, false, false);
        x1Var.v = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, org.telegram.ui.ActionBar.h6.w0(null, i12, false)));
        this.f33627c = x1Var;
        x1Var.setTypeface(AndroidUtilities.bold());
        x1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        x1Var.setTextSize(AndroidUtilities.dp(12.0f));
        x1Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        linearLayout.addView(x1Var, w7.y5.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, w7.y5.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.so0 so0Var = new org.telegram.ui.Components.so0(context, null, true);
        this.h = so0Var;
        so0Var.setReportChanges(true);
        so0Var.setDelegate(new g(this, 23));
        so0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        so0Var.setImportantForAccessibility(2);
        addView(so0Var, w7.y5.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.h6.f19443y6;
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, w7.y5.e(-2, -2, 19));
        org.telegram.ui.Cells.x1 x1Var2 = new org.telegram.ui.Cells.x1(this, context);
        this.e = x1Var2;
        x1Var2.b(0.45f, 240L, org.telegram.ui.Components.rr.h);
        x1Var2.setGravity(1);
        x1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        x1Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19244n6, false));
        frameLayout.addView(x1Var2, w7.y5.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f33626b = spannableStringBuilder;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9();
        this.f33625a = y9Var;
        y9Var.f30569a = x1Var2.getPaint();
        y9Var.f30572f = AndroidUtilities.dp(1.5f);
        y9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(y9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f33628f = textView3;
        textView3.setTextSize(1, 13.0f);
        com.google.android.gms.internal.vision.e2.p(i13, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, w7.y5.e(-2, -2, 21));
        addView(frameLayout, w7.y5.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f33629n = new dc0(this);
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
            this.f33625a.a(f11 / 100.0f, true);
            x1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f11))), this.f33626b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i10 = R.string.LiteBatteryEnabled;
        } else {
            i10 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i10).toUpperCase();
        org.telegram.ui.Cells.x1 x1Var2 = this.f33627c;
        x1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 0.0f;
        if (z10 != this.f33630r) {
            this.f33630r = z10;
            x1Var2.clearAnimation();
            ViewPropertyAnimator animate = x1Var2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.ok.s(animate.alpha(f10), org.telegram.ui.Components.rr.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f33631s != f7) {
            this.f33631s = f7;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f33631s, f7);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final fc0 f32651b;

                {
                    this.f32651b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            fc0 fc0Var = this.f32651b;
                            TextView textView = fc0Var.f33628f;
                            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19443y6, false);
                            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19244n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            fc0Var.f33631s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            fc0 fc0Var2 = this.f32651b;
                            TextView textView2 = fc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19443y6, false);
                            int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19244n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            fc0Var2.f33632w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.v.addListener(new ec0(this, f7, 0));
            this.v.setInterpolator(org.telegram.ui.Components.rr.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f12 = 1.0f;
        }
        if (this.f33632w != f12) {
            this.f33632w = f12;
            ValueAnimator valueAnimator2 = this.f33633x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f33633x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f33632w, f12);
            this.f33633x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final fc0 f32651b;

                {
                    this.f32651b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            fc0 fc0Var = this.f32651b;
                            TextView textView = fc0Var.f33628f;
                            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19443y6, false);
                            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19244n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            fc0Var.f33631s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            return;
                        default:
                            fc0 fc0Var2 = this.f32651b;
                            TextView textView2 = fc0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19443y6, false);
                            int w05 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19244n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            fc0Var2.f33632w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            return;
                    }
                }
            });
            this.f33633x.addListener(new ec0(this, f12, 1));
            this.f33633x.setInterpolator(org.telegram.ui.Components.rr.h);
            this.f33633x.setDuration(320L);
            this.f33633x.start();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f33629n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f33629n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f33629n.performAccessibilityAction(this, i10, bundle);
    }
}
