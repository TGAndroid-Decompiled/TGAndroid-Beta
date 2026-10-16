package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Switch;
public final class pc0 extends FrameLayout {
    public final ImageView f38871a;
    public final LinearLayout f38872b;
    public final bi.f4 f38873c;
    public final org.telegram.ui.Components.s6 d;
    public final ImageView e;
    public final Switch f38874f;
    public final org.telegram.ui.Components.aq h;
    public boolean f38875n;
    public boolean f38876r;
    public boolean f38877s;
    public boolean v;
    public int f38878w;
    public int f38879x;
    public final qc0 f38880y;

    public pc0(qc0 qc0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        float f10;
        this.f38880y = qc0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f38871a = imageView;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19764m6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setVisibility(8);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.z5.a(24.0f, 20.0f, 0.0f, 20.0f, 0.0f, 24, i10 | 16));
        bi.f4 f4Var = new bi.f4(context, 27);
        this.f38873c = f4Var;
        f4Var.setLines(1);
        f4Var.setSingleLine(true);
        f4Var.setEllipsize(TextUtils.TruncateAt.END);
        f4Var.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.g6.G6;
        f4Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        f4Var.setGravity(i11);
        f4Var.setImportantForAccessibility(2);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true);
        this.d = s6Var;
        s6Var.b(0.35f, 200L, org.telegram.ui.Components.es.h);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i16, false));
        s6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i16, false), mode));
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38872b = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        linearLayout.setGravity(i12);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, w7.z5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(s6Var, w7.z5.p(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(f4Var, w7.z5.o(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(f4Var, w7.z5.o(-2, -2, 1.0f, 16));
            linearLayout.addView(s6Var, w7.z5.p(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, w7.z5.p(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(linearLayout, w7.z5.a(-2.0f, 64.0f, 0.0f, 8.0f, 0.0f, -1, i13 | 16));
        Switch r32 = new Switch(context, null);
        this.f38874f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.g6.M6;
        int i18 = org.telegram.ui.ActionBar.g6.N6;
        int i19 = org.telegram.ui.ActionBar.g6.f19601d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(r32, w7.z5.a(50.0f, 19.0f, 0.0f, 19.0f, 0.0f, 37, i14 | 16));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.h = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.g6.f19674h7, org.telegram.ui.ActionBar.g6.f19709j7, org.telegram.ui.ActionBar.g6.f19729k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(true, false);
        aqVar.setDrawBackgroundAsArc(10);
        aqVar.setVisibility(8);
        aqVar.setImportantForAccessibility(2);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i20 = i15 | 16;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 0.0f;
        }
        addView(aqVar, w7.z5.a(21.0f, f7, 0.0f, f10, 0.0f, 21, i20));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pc0.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f38877s != z10) {
            this.f38877s = z10;
            org.telegram.ui.Components.aq aqVar = this.h;
            Switch r12 = this.f38874f;
            LinearLayout linearLayout = this.f38872b;
            ImageView imageView = this.f38871a;
            float f15 = 1.0f;
            if (z11) {
                ViewPropertyAnimator animate = imageView.animate();
                if (z10) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                animate.alpha(f12).setDuration(220L).start();
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (z10) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                animate2.alpha(f13).setDuration(220L).start();
                ViewPropertyAnimator animate3 = r12.animate();
                if (z10) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                animate3.alpha(f14).setDuration(220L).start();
                ViewPropertyAnimator animate4 = aqVar.animate();
                if (z10) {
                    f15 = 0.5f;
                }
                org.telegram.messenger.sk.s(animate4, f15, 220L);
            } else {
                if (z10) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                imageView.setAlpha(f7);
                if (z10) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                linearLayout.setAlpha(f10);
                if (z10) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                r12.setAlpha(f11);
                if (z10) {
                    f15 = 0.5f;
                }
                aqVar.setAlpha(f15);
            }
            setEnabled(!z10);
        }
    }

    public final void c(kc0 kc0Var, boolean z10) {
        int value = LiteMode.getValue(true);
        int i10 = kc0Var.e;
        this.f38878w = a(value & i10);
        this.f38879x = a(i10);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f38878w), Integer.valueOf(this.f38879x));
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        boolean z10 = LocaleController.isRTL;
        bi.f4 f4Var = this.f38873c;
        if (z10) {
            if (this.f38876r) {
                float dp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.g6.f19722k0);
            }
            if (this.f38875n) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                if (f4Var.getTranslationX() < 0.0f) {
                    i10 = AndroidUtilities.dp(-32.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(measuredWidth + i10, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f19722k0);
                return;
            }
            return;
        }
        if (this.f38876r) {
            float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth2 - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth2, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.g6.f19722k0);
        }
        if (this.f38875n) {
            canvas.drawLine(f4Var.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.aq aqVar = this.h;
        if (aqVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (aqVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(aqVar.f23281a.f22792q);
        } else {
            accessibilityNodeInfo.setChecked(this.f38874f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38873c.getText());
        if (this.v) {
            sb2.append('\n');
            sb2.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.f38878w), Integer.valueOf(this.f38879x)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
