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
public final class gc0 extends FrameLayout {
    public final ImageView f33888a;
    public final LinearLayout f33889b;
    public final ai.p4 f33890c;
    public final org.telegram.ui.Components.p6 d;
    public final ImageView e;
    public final Switch f33891f;
    public final org.telegram.ui.Components.pp h;
    public boolean f33892n;
    public boolean f33893r;
    public boolean f33894s;
    public boolean v;
    public int f33895w;
    public int f33896x;
    public final hc0 f33897y;

    public gc0(hc0 hc0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        float f10;
        this.f33897y = hc0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f33888a = imageView;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19223m6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setVisibility(8);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.y5.d(24, 24.0f, i10 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        ai.p4 p4Var = new ai.p4(context, 27);
        this.f33890c = p4Var;
        p4Var.setLines(1);
        p4Var.setSingleLine(true);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        p4Var.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.h6.G6;
        p4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        p4Var.setGravity(i11);
        p4Var.setImportantForAccessibility(2);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.d = p6Var;
        p6Var.b(0.35f, 200L, org.telegram.ui.Components.sr.h);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextSize(AndroidUtilities.dp(14.0f));
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i16, false));
        p6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i16, false), mode));
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33889b = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        linearLayout.setGravity(i12);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, w7.y5.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(p6Var, w7.y5.p(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(p4Var, w7.y5.o(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(p4Var, w7.y5.o(-2, -2, 1.0f, 16));
            linearLayout.addView(p6Var, w7.y5.p(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, w7.y5.p(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(linearLayout, w7.y5.d(-1, -2.0f, i13 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f33891f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.h6.M6;
        int i18 = org.telegram.ui.ActionBar.h6.N6;
        int i19 = org.telegram.ui.ActionBar.h6.f19059d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(r32, w7.y5.d(37, 50.0f, i14 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.pp ppVar = new org.telegram.ui.Components.pp(context, 21, null);
        this.h = ppVar;
        ppVar.b(org.telegram.ui.ActionBar.h6.f19131h7, org.telegram.ui.ActionBar.h6.f19167j7, org.telegram.ui.ActionBar.h6.f19187k7);
        ppVar.setDrawUnchecked(true);
        ppVar.a(true, false);
        ppVar.setDrawBackgroundAsArc(10);
        ppVar.setVisibility(8);
        ppVar.setImportantForAccessibility(2);
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
        addView(ppVar, w7.y5.d(21, 21.0f, i20, f7, 0.0f, f10, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gc0.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f33894s != z10) {
            this.f33894s = z10;
            org.telegram.ui.Components.pp ppVar = this.h;
            Switch r12 = this.f33891f;
            LinearLayout linearLayout = this.f33889b;
            ImageView imageView = this.f33888a;
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
                ViewPropertyAnimator animate4 = ppVar.animate();
                if (z10) {
                    f15 = 0.5f;
                }
                org.telegram.messenger.ok.r(animate4, f15, 220L);
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
                ppVar.setAlpha(f15);
            }
            setEnabled(!z10);
        }
    }

    public final void c(bc0 bc0Var, boolean z10) {
        int value = LiteMode.getValue(true);
        int i10 = bc0Var.e;
        this.f33895w = a(value & i10);
        this.f33896x = a(i10);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f33895w), Integer.valueOf(this.f33896x));
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
        ai.p4 p4Var = this.f33890c;
        if (z10) {
            if (this.f33893r) {
                float dp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.h6.f19180k0);
            }
            if (this.f33892n) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                if (p4Var.getTranslationX() < 0.0f) {
                    i10 = AndroidUtilities.dp(-32.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(measuredWidth + i10, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19180k0);
                return;
            }
            return;
        }
        if (this.f33893r) {
            float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth2 - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth2, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.h6.f19180k0);
        }
        if (this.f33892n) {
            canvas.drawLine(p4Var.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19180k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.pp ppVar = this.h;
        if (ppVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (ppVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(ppVar.f27472a.f22194q);
        } else {
            accessibilityNodeInfo.setChecked(this.f33891f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f33890c.getText());
        if (this.v) {
            sb2.append('\n');
            sb2.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.f33895w), Integer.valueOf(this.f33896x)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
