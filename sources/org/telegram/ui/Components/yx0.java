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
public final class yx0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public int D;
    public final ei0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public uo0 K;
    public int f32822a;
    public final Paint f32823b;
    public final Paint f32824c;
    public final Paint d;
    public final Paint e;
    public final RectF f32825f;
    public final xx0 h;
    public final String[] f32826n;
    public final int[] f32827r;
    public final bi0[] f32828s;
    public final bi0[] f32829w;
    public final int[] f32830x;
    public final int[] f32831y;

    public yx0(Context context, int i10) {
        super(context);
        int i11;
        Paint paint = new Paint(1);
        this.f32823b = paint;
        this.f32824c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f32825f = new RectF();
        this.f32826n = r7;
        this.f32827r = r8;
        this.f32828s = new bi0[6];
        this.f32829w = new bi0[6];
        this.f32830x = new int[6];
        this.f32831y = new int[6];
        this.E = new ei0[2];
        this.G = 1.0f;
        String[] strArr = {org.telegram.messenger.cd.L0(2131744341, null), org.telegram.messenger.cd.L0(2131744340, null), org.telegram.messenger.cd.L0(2131744345, null), org.telegram.messenger.cd.L0(2131744342, null), org.telegram.messenger.cd.L0(2131744344, null), org.telegram.messenger.cd.L0(2131744343, null)};
        int i12 = org.telegram.ui.ActionBar.t6.f20913c9;
        int[] iArr = {i12, i12, i12, i12, org.telegram.ui.ActionBar.t6.Y5, org.telegram.ui.ActionBar.t6.f20932d9};
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
        xx0 xx0Var = new xx0(this, context);
        this.h = xx0Var;
        this.f32822a = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false);
        xx0Var.setMinValue(0);
        xx0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.vp.r1(i10).P0.isEmpty();
        xx0Var.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i11 = 6;
        } else {
            i11 = 5;
        }
        xx0Var.setAllItemsCount(i11);
        xx0Var.setWrapSelectorWheel(true);
        xx0Var.setFormatter(new wx0(this));
        xx0Var.setOnValueChangedListener(new wx0(this));
        xx0Var.setImportantForAccessibility(2);
        xx0Var.setValue(org.telegram.messenger.tz.m(i10));
        addView(xx0Var, w7.b6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.D = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            this.E[i13] = new ImageView(context);
            addView(this.E[i13], w7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        bi0 a2 = a(this.h.getValue());
        if (a2 != null) {
            this.E[0].setImageDrawable(a2);
            a2.M(a2.e[0] - 1);
        }
        org.telegram.messenger.i0.Y3(this.E[0], true, 0.5f, true, false);
        org.telegram.messenger.i0.Y3(this.E[1], false, 0.5f, true, false);
        this.F = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.J = this.h.getValue();
    }

    public final bi0 a(int i10) {
        int i11;
        bi0[] bi0VarArr = this.f32828s;
        if (bi0VarArr[i10] == null) {
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
            bi0VarArr[i10] = new bi0(i11, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            c(i10);
        }
        return bi0VarArr[i10];
    }

    public final void b() {
        int value;
        if (this.K == null && this.J != (value = this.h.getValue())) {
            this.J = value;
            int i10 = (this.D + 1) % 2;
            bi0 a2 = a(value);
            ei0[] ei0VarArr = this.E;
            if (a2 != null) {
                if (ei0VarArr[i10].getVisibility() != 0) {
                    a2.N(0, false, false);
                }
                ei0VarArr[i10].setAnimation(a2);
                ei0VarArr[i10].d();
            } else {
                ei0VarArr[i10].a();
            }
            org.telegram.messenger.i0.Y3(ei0VarArr[this.D], false, 0.5f, true, true);
            org.telegram.messenger.i0.Y3(ei0VarArr[i10], true, 0.5f, true, true);
            this.D = i10;
            uo0 uo0Var = new uo0(this, 15);
            this.K = uo0Var;
            org.telegram.messenger.i0.h3(uo0Var, 150L);
        }
    }

    public final void c(int i10) {
        bi0[] bi0VarArr = this.f32828s;
        if (bi0VarArr[i10] != null) {
            int f7 = i0.b.f(0.9f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20913c9, false));
            int i11 = org.telegram.ui.ActionBar.t6.f20950e9;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            bi0 bi0Var = bi0VarArr[i10];
            bi0[] bi0VarArr2 = this.f32829w;
            bi0 bi0Var2 = bi0VarArr2[i10];
            int[] iArr = this.f32831y;
            int[] iArr2 = this.f32830x;
            if (bi0Var != bi0Var2 || x02 != iArr2[i10] || f7 != iArr[i10]) {
                bi0VarArr2[i10] = bi0Var;
                iArr2[i10] = x02;
                iArr[i10] = f7;
                if (i10 == 2) {
                    bi0VarArr[i10].Q(f7, "Arrow");
                    bi0VarArr[i10].Q(x02, "Box2");
                    bi0VarArr[i10].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.a7.y(this, bi0VarArr[i10], i11, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            xx0 xx0Var = this.h;
            int value = xx0Var.getValue() + 1;
            setContentDescription(this.f32826n[(value > xx0Var.getMaxValue() || value < 0) ? 0 : 0]);
            xx0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f32826n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false);
        this.f32822a = x02;
        xx0 xx0Var = this.h;
        xx0Var.setTextColor(x02);
        xx0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i10 = 0; i10 < this.f32828s.length; i10++) {
            c(i10);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
