package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.Switch;
public final class ab0 extends FrameLayout {
    public final bb0 D;
    public final ImageView f35605a;
    public final LinearLayout f35606b;
    public final ag.j3 f35607c;
    public final org.telegram.ui.Components.f6 d;
    public final ImageView e;
    public final Switch f35608f;
    public final org.telegram.ui.Components.ep h;
    public boolean f35609n;
    public boolean f35610r;
    public boolean f35611s;
    public boolean f35612w;
    public int f35613x;
    public int f35614y;

    public ab0(bb0 bb0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        float f10;
        this.D = bb0Var;
        setImportantForAccessibility(1);
        ImageView imageView = new ImageView(context);
        this.f35605a = imageView;
        int i16 = org.telegram.ui.ActionBar.t6.f21095m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i16, null, mode);
        imageView.setVisibility(8);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.b6.d(24, 24.0f, i10 | 16, 20.0f, 0.0f, 20.0f, 0.0f));
        ag.j3 j3Var = new ag.j3(context, 26);
        this.f35607c = j3Var;
        j3Var.setLines(1);
        j3Var.setSingleLine(true);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        j3Var.setTextSize(1, 16.0f);
        int i17 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(j3Var, i17, null);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j3Var.setGravity(i11);
        j3Var.setImportantForAccessibility(2);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
        this.d = f6Var;
        f6Var.b(0.35f, 200L, org.telegram.ui.Components.gr.h);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var, i17, null);
        f6Var.setImportantForAccessibility(2);
        ImageView imageView2 = new ImageView(context);
        this.e = imageView2;
        imageView2.setVisibility(8);
        org.telegram.ui.ActionBar.a7.t(imageView2, i17, null, mode);
        imageView2.setImageResource(2131230871);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35606b = linearLayout;
        linearLayout.setOrientation(0);
        if (org.telegram.messenger.cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        linearLayout.setGravity(i12);
        if (org.telegram.messenger.cd.X) {
            linearLayout.addView(imageView2, w7.b6.q(16, 16, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(f6Var, w7.b6.q(-2, -2, 0.0f, 16, 0, 0, 6, 0));
            linearLayout.addView(j3Var, w7.b6.p(-2, -2, 1.0f, 16));
        } else {
            linearLayout.addView(j3Var, w7.b6.p(-2, -2, 1.0f, 16));
            linearLayout.addView(f6Var, w7.b6.q(-2, -2, 0.0f, 16, 6, 0, 0, 0));
            linearLayout.addView(imageView2, w7.b6.q(16, 16, 0.0f, 16, 2, 0, 0, 0));
        }
        if (org.telegram.messenger.cd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(linearLayout, w7.b6.d(-1, -2.0f, i13 | 16, 64.0f, 0.0f, 8.0f, 0.0f));
        Switch r32 = new Switch(context, null);
        this.f35608f = r32;
        r32.setVisibility(8);
        int i18 = org.telegram.ui.ActionBar.t6.M6;
        int i19 = org.telegram.ui.ActionBar.t6.N6;
        int i20 = org.telegram.ui.ActionBar.t6.f20929d6;
        r32.d(i18, i19, i20, i20);
        r32.setImportantForAccessibility(2);
        if (org.telegram.messenger.cd.X) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        addView(r32, w7.b6.d(37, 50.0f, i14 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(21, context, null);
        this.h = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.f21003h7, org.telegram.ui.ActionBar.t6.f21039j7, org.telegram.ui.ActionBar.t6.f21059k7);
        epVar.setDrawUnchecked(true);
        epVar.a(true, false);
        epVar.setDrawBackgroundAsArc(10);
        epVar.setVisibility(8);
        epVar.setImportantForAccessibility(2);
        boolean z10 = org.telegram.messenger.cd.X;
        if (z10) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 16;
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
        addView(epVar, w7.b6.d(21, 21.0f, i21, f7, 0.0f, f10, 0.0f));
        setFocusable(true);
    }

    public final int a(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ab0.a(int):int");
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f35611s != z10) {
            this.f35611s = z10;
            org.telegram.ui.Components.ep epVar = this.h;
            Switch r12 = this.f35608f;
            LinearLayout linearLayout = this.f35606b;
            ImageView imageView = this.f35605a;
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
                ViewPropertyAnimator animate4 = epVar.animate();
                if (z10) {
                    f15 = 0.5f;
                }
                org.telegram.messenger.z20.l(animate4, f15, 220L);
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
                epVar.setAlpha(f15);
            }
            setEnabled(!z10);
        }
    }

    public final void c(wa0 wa0Var, boolean z10) {
        int d = org.telegram.messenger.sc.d(true);
        int i10 = wa0Var.e;
        this.f35613x = a(d & i10);
        this.f35614y = a(i10);
        boolean z11 = false;
        String format = String.format("%d/%d", Integer.valueOf(this.f35613x), Integer.valueOf(this.f35614y));
        if (z10 && !org.telegram.messenger.cd.X) {
            z11 = true;
        }
        this.d.c(format, z11, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        boolean z10 = org.telegram.messenger.cd.X;
        ag.j3 j3Var = this.f35607c;
        if (z10) {
            if (this.f35610r) {
                float L = org.telegram.messenger.i0.L(75.0f);
                canvas.drawRect(L - org.telegram.messenger.i0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.i0.L(20.0f)) / 2.0f, L, (org.telegram.messenger.i0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.t6.f21052k0);
            }
            if (this.f35609n) {
                int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(64.0f);
                if (j3Var.getTranslationX() < 0.0f) {
                    i10 = org.telegram.messenger.i0.L(-32.0f);
                } else {
                    i10 = 0;
                }
                canvas.drawLine(measuredWidth + i10, getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
                return;
            }
            return;
        }
        if (this.f35610r) {
            float measuredWidth2 = getMeasuredWidth() - org.telegram.messenger.i0.L(75.0f);
            canvas.drawRect(measuredWidth2 - org.telegram.messenger.i0.L(0.66f), (getMeasuredHeight() - org.telegram.messenger.i0.L(20.0f)) / 2.0f, measuredWidth2, (org.telegram.messenger.i0.L(20.0f) + getMeasuredHeight()) / 2.0f, org.telegram.ui.ActionBar.t6.f21052k0);
        }
        if (this.f35609n) {
            canvas.drawLine(j3Var.getTranslationX() + org.telegram.messenger.i0.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        org.telegram.ui.Components.ep epVar = this.h;
        if (epVar.getVisibility() == 0) {
            charSequence = "android.widget.CheckBox";
        } else {
            charSequence = "android.widget.Switch";
        }
        accessibilityNodeInfo.setClassName(charSequence);
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setEnabled(true);
        if (epVar.getVisibility() == 0) {
            accessibilityNodeInfo.setChecked(epVar.f25836a.f23919q);
        } else {
            accessibilityNodeInfo.setChecked(this.f35608f.h);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35607c.getText());
        if (this.f35612w) {
            sb2.append('\n');
            sb2.append(org.telegram.messenger.cd.a0("Of", null, 2131747845, Integer.valueOf(this.f35613x), Integer.valueOf(this.f35614y)));
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }
}
