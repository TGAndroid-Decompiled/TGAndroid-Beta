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
public final class dc0 extends FrameLayout {
    public final ImageView f33579a;
    public final LinearLayout f33580b;
    public final gg.q f33581c;
    public final org.telegram.ui.Components.k6 d;
    public final ImageView e;
    public final Switch f33582f;
    public final org.telegram.ui.Components.lp h;
    public boolean f33583n;
    public boolean f33584r;
    public boolean f33585s;
    public boolean v;
    public int f33586w;
    public int f33587x;
    public final ec0 f33588y;

    public dc0(ec0 ec0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        float f11;
        this.f33588y = ec0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f33579a = imageView;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20067m6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setVisibility(8);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, k7.b6.d(24, 24.0f, i10 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        gg.q qVar = new gg.q(context, 26);
        this.f33581c = qVar;
        qVar.setLines(1);
        qVar.setSingleLine(true);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.j6.G6;
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        qVar.setGravity(i11);
        qVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.d = k6Var;
        k6Var.b(0.35f, 200L, org.telegram.ui.Components.nr.h);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
        k6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i16, false), mode));
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33580b = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        linearLayout.setGravity(i12);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, k7.b6.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(k6Var, k7.b6.p(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(qVar, k7.b6.o(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(qVar, k7.b6.o(-2, -2, 1.0f, 16));
            linearLayout.addView(k6Var, k7.b6.p(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, k7.b6.p(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(linearLayout, k7.b6.d(-1, -2.0f, i13 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f33582f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.j6.M6;
        int i18 = org.telegram.ui.ActionBar.j6.N6;
        int i19 = org.telegram.ui.ActionBar.j6.f19906d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(r32, k7.b6.d(37, 50.0f, i14 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(context, 21, null);
        this.h = lpVar;
        lpVar.b(org.telegram.ui.ActionBar.j6.f19979h7, org.telegram.ui.ActionBar.j6.f20014j7, org.telegram.ui.ActionBar.j6.f20032k7);
        lpVar.setDrawUnchecked(true);
        lpVar.a(true, false);
        lpVar.setDrawBackgroundAsArc(10);
        lpVar.setVisibility(8);
        lpVar.setImportantForAccessibility(2);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i20 = i15 | 16;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 64.0f;
        }
        if (z4) {
            f11 = 64.0f;
        } else {
            f11 = 0.0f;
        }
        addView(lpVar, k7.b6.d(21, 21.0f, i20, f10, 0.0f, f11, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dc0.a(int):int");
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f33585s != z4) {
            this.f33585s = z4;
            org.telegram.ui.Components.lp lpVar = this.h;
            Switch r12 = this.f33582f;
            LinearLayout linearLayout = this.f33580b;
            ImageView imageView = this.f33579a;
            float f16 = 1.0f;
            if (z10) {
                ViewPropertyAnimator animate = imageView.animate();
                if (z4) {
                    f13 = 0.5f;
                } else {
                    f13 = 1.0f;
                }
                animate.alpha(f13).setDuration(220L).start();
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (z4) {
                    f14 = 0.5f;
                } else {
                    f14 = 1.0f;
                }
                animate2.alpha(f14).setDuration(220L).start();
                ViewPropertyAnimator animate3 = r12.animate();
                if (z4) {
                    f15 = 0.5f;
                } else {
                    f15 = 1.0f;
                }
                animate3.alpha(f15).setDuration(220L).start();
                ViewPropertyAnimator animate4 = lpVar.animate();
                if (z4) {
                    f16 = 0.5f;
                }
                animate4.alpha(f16).setDuration(220L).start();
            } else {
                if (z4) {
                    f10 = 0.5f;
                } else {
                    f10 = 1.0f;
                }
                imageView.setAlpha(f10);
                if (z4) {
                    f11 = 0.5f;
                } else {
                    f11 = 1.0f;
                }
                linearLayout.setAlpha(f11);
                if (z4) {
                    f12 = 0.5f;
                } else {
                    f12 = 1.0f;
                }
                r12.setAlpha(f12);
                if (z4) {
                    f16 = 0.5f;
                }
                lpVar.setAlpha(f16);
            }
            setEnabled(!z4);
        }
    }

    public final void c(yb0 yb0Var, boolean z4) {
        int value = LiteMode.getValue(true);
        int i10 = yb0Var.e;
        this.f33586w = a(value & i10);
        this.f33587x = a(i10);
        boolean z10 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f33586w), Integer.valueOf(this.f33587x));
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        }
        this.d.c(format, z10, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        boolean z4 = LocaleController.isRTL;
        gg.q qVar = this.f33581c;
        if (z4) {
            if (this.f33584r) {
                float dp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.j6.f20025k0);
            }
            if (this.f33583n) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                if (qVar.getTranslationX() < 0.0f) {
                    i10 = AndroidUtilities.dp(-32.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(measuredWidth + i10, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
                return;
            }
            return;
        }
        if (this.f33584r) {
            float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth2 - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth2, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.j6.f20025k0);
        }
        if (this.f33583n) {
            canvas.drawLine(qVar.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.lp lpVar = this.h;
        if (lpVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (lpVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(lpVar.f26837a.f22965q);
        } else {
            accessibilityNodeInfo.setChecked(this.f33582f.h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33581c.getText());
        if (this.v) {
            sb.append('\n');
            sb.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.f33586w), Integer.valueOf(this.f33587x)));
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
