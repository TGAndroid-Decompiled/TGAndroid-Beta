package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class zx0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public final fi0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public vo0 K;
    public int f33254a;
    public final Paint f33255b;
    public final Paint f33256c;
    public final Paint d;
    public final Paint e;
    public final RectF f33257f;
    public final yx0 h;
    public final String[] f33258n;
    public final int[] f33259r;
    public final ci0[] f33260s;
    public final ci0[] f33261w;
    public final int[] f33262x;
    public final int[] f33263y;

    public zx0(Context context, int i10) {
        super(context);
        int i11;
        Paint paint = new Paint(1);
        this.f33255b = paint;
        this.f33256c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f33257f = new RectF();
        this.f33258n = r7;
        this.f33259r = r8;
        this.f33260s = new ci0[6];
        this.f33261w = new ci0[6];
        this.f33262x = new int[6];
        this.f33263y = new int[6];
        this.E = new fi0[2];
        this.G = 1.0f;
        String[] strArr = {org.telegram.messenger.dd.L0(2131744341, null), org.telegram.messenger.dd.L0(2131744340, null), org.telegram.messenger.dd.L0(2131744345, null), org.telegram.messenger.dd.L0(2131744342, null), org.telegram.messenger.dd.L0(2131744344, null), org.telegram.messenger.dd.L0(2131744343, null)};
        int i12 = org.telegram.ui.ActionBar.t6.f20914c9;
        int[] iArr = {i12, i12, i12, i12, org.telegram.ui.ActionBar.t6.Y5, org.telegram.ui.ActionBar.t6.f20933d9};
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        yx0 yx0Var = new yx0(this, context);
        this.h = yx0Var;
        this.f33254a = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21038j5, false);
        yx0Var.setMinValue(0);
        yx0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.wp.r1(i10).P0.isEmpty();
        yx0Var.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i11 = 6;
        } else {
            i11 = 5;
        }
        yx0Var.setAllItemsCount(i11);
        yx0Var.setWrapSelectorWheel(true);
        yx0Var.setFormatter(new xx0(this));
        yx0Var.setOnValueChangedListener(new xx0(this));
        yx0Var.setImportantForAccessibility(2);
        yx0Var.setValue(org.telegram.messenger.uz.m(i10));
        addView(yx0Var, w7.b6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.D = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            this.E[i13] = new ImageView(context);
            addView(this.E[i13], w7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        ci0 a2 = a(this.h.getValue());
        if (a2 != null) {
            this.E[0].setImageDrawable(a2);
            a2.M(a2.e[0] - 1);
        }
        org.telegram.messenger.i0.Y3(this.E[0], true, 0.5f, true, false);
        org.telegram.messenger.i0.Y3(this.E[1], false, 0.5f, true, false);
        this.F = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.J = this.h.getValue();
    }

    public final ci0 a(int i10) {
        int i11;
        ci0[] ci0VarArr = this.f33260s;
        if (ci0VarArr[i10] == null) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                i11 = 2131624244;
                            } else {
                                i11 = 2131624242;
                            }
                        } else {
                            i11 = 2131624241;
                        }
                    } else {
                        i11 = 2131624243;
                    }
                } else {
                    i11 = 2131623977;
                }
            } else {
                i11 = 2131624245;
            }
            ci0VarArr[i10] = new ci0(i11, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            c(i10);
        }
        return ci0VarArr[i10];
    }

    public final void b() {
        int value;
        if (this.K == null && this.J != (value = this.h.getValue())) {
            this.J = value;
            int i10 = (this.D + 1) % 2;
            ci0 a2 = a(value);
            fi0[] fi0VarArr = this.E;
            if (a2 != null) {
                if (fi0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                fi0VarArr[i10].setAnimation(a2);
                fi0VarArr[i10].d();
            } else {
                fi0VarArr[i10].a();
            }
            org.telegram.messenger.i0.Y3(fi0VarArr[this.D], false, 0.5f, true, true);
            org.telegram.messenger.i0.Y3(fi0VarArr[i10], true, 0.5f, true, true);
            this.D = i10;
            vo0 vo0Var = new vo0(this, 15);
            this.K = vo0Var;
            org.telegram.messenger.i0.h3(vo0Var, 150L);
        }
    }

    public final void c(int i10) {
        ci0[] ci0VarArr = this.f33260s;
        if (ci0VarArr[i10] != null) {
            int f7 = i0.b.f(0.9f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20914c9, false));
            int i11 = org.telegram.ui.ActionBar.t6.f20951e9;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            ci0 ci0Var = ci0VarArr[i10];
            ci0[] ci0VarArr2 = this.f33261w;
            ci0 ci0Var2 = ci0VarArr2[i10];
            int[] iArr = this.f33263y;
            int[] iArr2 = this.f33262x;
            if (ci0Var != ci0Var2 || x02 != iArr2[i10] || f7 != iArr[i10]) {
                ci0VarArr2[i10] = ci0Var;
                iArr2[i10] = x02;
                iArr[i10] = f7;
                if (i10 == 2) {
                    ci0VarArr[i10].Q(f7, "Arrow");
                    ci0VarArr[i10].Q(x02, "Box2");
                    ci0VarArr[i10].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.a7.y(this, ci0VarArr[i10], i11, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            yx0 yx0Var = this.h;
            int value = yx0Var.getValue() + 1;
            setContentDescription(this.f33258n[(value > yx0Var.getMaxValue() || value < 0) ? 0 : 0]);
            yx0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f33258n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        updateColors();
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21038j5, false);
        this.f33254a = x02;
        yx0 yx0Var = this.h;
        yx0Var.setTextColor(x02);
        yx0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i10 = 0; i10 < this.f33260s.length; i10++) {
            c(i10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
