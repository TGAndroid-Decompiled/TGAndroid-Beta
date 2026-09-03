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
public final class ec0 extends FrameLayout {
    public final ImageView f36432a;
    public final LinearLayout f36433b;
    public final hg.q f36434c;
    public final org.telegram.ui.Components.k6 d;
    public final ImageView f36435e;
    public final Switch f36436f;
    public final org.telegram.ui.Components.np h;
    public boolean f36437n;
    public boolean f36438r;
    public boolean f36439s;
    public boolean v;
    public int f36440w;
    public int f36441x;
    public final fc0 f36442y;

    public ec0(fc0 fc0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        float f11;
        this.f36442y = fc0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f36432a = imageView;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21823m6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setVisibility(8);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, k7.c6.d(24, 24.0f, i10 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        hg.q qVar = new hg.q(context, 26);
        this.f36434c = qVar;
        qVar.setLines(1);
        qVar.setSingleLine(true);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setTextSize(1, 16.0f);
        int i16 = org.telegram.ui.ActionBar.k6.G6;
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        qVar.setGravity(i11);
        qVar.setImportantForAccessibility(2);
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.d = k6Var;
        k6Var.b(0.35f, 200L, org.telegram.ui.Components.pr.h);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
        k6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.f36435e = imageView2;
        imageView2.setVisibility(8);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i16, false), mode));
        imageView2.setImageResource(R.drawable.arrow_more);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36433b = linearLayout;
        linearLayout.setOrientation(0);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        linearLayout.setGravity(i12);
        if (LocaleController.isRTL) {
            linearLayout.addView(imageView2, k7.c6.p(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(k6Var, k7.c6.p(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(qVar, k7.c6.o(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(qVar, k7.c6.o(-2, -2, 1.0f, 16));
            linearLayout.addView(k6Var, k7.c6.p(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, k7.c6.p(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(linearLayout, k7.c6.d(-1, -2.0f, i13 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f36436f = r32;
        r32.setVisibility(8);
        int i17 = org.telegram.ui.ActionBar.k6.M6;
        int i18 = org.telegram.ui.ActionBar.k6.N6;
        int i19 = org.telegram.ui.ActionBar.k6.f21661d6;
        r32.d(i17, i18, i19, i19);
        r32.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(r32, k7.c6.d(37, 50.0f, i14 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 21, null);
        this.h = npVar;
        npVar.b(org.telegram.ui.ActionBar.k6.f21735h7, org.telegram.ui.ActionBar.k6.f21770j7, org.telegram.ui.ActionBar.k6.f21788k7);
        npVar.setDrawUnchecked(true);
        npVar.a(true, false);
        npVar.setDrawBackgroundAsArc(10);
        npVar.setVisibility(8);
        npVar.setImportantForAccessibility(2);
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
        addView(npVar, k7.c6.d(21, 21.0f, i20, f10, 0.0f, f11, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ec0.a(int):int");
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        if (this.f36439s != z4) {
            this.f36439s = z4;
            org.telegram.ui.Components.np npVar = this.h;
            Switch r12 = this.f36436f;
            LinearLayout linearLayout = this.f36433b;
            ImageView imageView = this.f36432a;
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
                ViewPropertyAnimator animate4 = npVar.animate();
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
                npVar.setAlpha(f16);
            }
            setEnabled(!z4);
        }
    }

    public final void c(zb0 zb0Var, boolean z4) {
        int value = LiteMode.getValue(true);
        int i10 = zb0Var.f43886e;
        this.f36440w = a(value & i10);
        this.f36441x = a(i10);
        boolean z10 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f36440w), Integer.valueOf(this.f36441x));
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
        hg.q qVar = this.f36434c;
        if (z4) {
            if (this.f36438r) {
                float dp = AndroidUtilities.dp(75.0f);
                canvas.drawRect(dp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, dp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.k6.f21781k0);
            }
            if (this.f36437n) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(64.0f);
                if (qVar.getTranslationX() < 0.0f) {
                    i10 = AndroidUtilities.dp(-32.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(measuredWidth + i10, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
                return;
            }
            return;
        }
        if (this.f36438r) {
            float measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
            canvas.drawRect(measuredWidth2 - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth2, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.k6.f21781k0);
        }
        if (this.f36437n) {
            canvas.drawLine(qVar.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.np npVar = this.h;
        if (npVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (npVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(npVar.f29560a.f24811q);
        } else {
            accessibilityNodeInfo.setChecked(this.f36436f.h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36434c.getText());
        if (this.v) {
            sb.append('\n');
            sb.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.f36440w), Integer.valueOf(this.f36441x)));
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
