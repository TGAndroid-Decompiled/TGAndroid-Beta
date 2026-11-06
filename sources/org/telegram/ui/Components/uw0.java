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
public final class uw0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public final ch0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public ir0 K;
    public int f38735a;
    public final Paint f38736b;
    public final Paint f38737c;
    public final Paint d;
    public final Paint f38738e;
    public final RectF f38739f;
    public final tw0 h;
    public final String[] f38740n;
    public final int[] f38741r;
    public final zg0[] f38742s;
    public final zg0[] f38743w;
    public final int[] f38744x;
    public final int[] f38745y;

    public uw0(Context context, int i7) {
        super(context);
        int i10;
        Paint paint = new Paint(1);
        this.f38736b = paint;
        this.f38737c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f38738e = paint3;
        this.f38739f = new RectF();
        this.f38740n = r7;
        this.f38741r = r8;
        this.f38742s = new zg0[6];
        this.f38743w = new zg0[6];
        this.f38744x = new int[6];
        this.f38745y = new int[6];
        this.E = new ch0[2];
        this.G = 1.0f;
        String[] strArr = {org.telegram.messenger.hd.M0(2131744316, null), org.telegram.messenger.hd.M0(2131744315, null), org.telegram.messenger.hd.M0(2131744320, null), org.telegram.messenger.hd.M0(2131744317, null), org.telegram.messenger.hd.M0(2131744319, null), org.telegram.messenger.hd.M0(2131744318, null)};
        int i11 = org.telegram.ui.ActionBar.k6.f27834c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.k6.Y5, org.telegram.ui.ActionBar.k6.f27852d9};
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint2.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(5.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        tw0 tw0Var = new tw0(this, context);
        this.h = tw0Var;
        this.f38735a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27957j5, false);
        tw0Var.setMinValue(0);
        tw0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.qp.s1(i7).P0.isEmpty();
        tw0Var.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i10 = 6;
        } else {
            i10 = 5;
        }
        tw0Var.setAllItemsCount(i10);
        tw0Var.setWrapSelectorWheel(true);
        tw0Var.setFormatter(new sw0(this));
        tw0Var.setOnValueChangedListener(new sw0(this));
        tw0Var.setImportantForAccessibility(2);
        tw0Var.setValue(org.telegram.messenger.iz.m(i7));
        addView(tw0Var, c8.ha.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.D = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.E[i12] = new ImageView(context);
            addView(this.E[i12], c8.ha.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        zg0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.E[0].setImageDrawable(a10);
            a10.M(a10.f40976e[0] - 1);
        }
        org.telegram.messenger.g0.Z3(this.E[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.Z3(this.E[1], false, 0.5f, true, false);
        this.F = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.J = this.h.getValue();
    }

    public final zg0 a(int i7) {
        int i10;
        zg0[] zg0VarArr = this.f38742s;
        if (zg0VarArr[i7] == null) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                i10 = 2131624246;
                            } else {
                                i10 = 2131624244;
                            }
                        } else {
                            i10 = 2131624243;
                        }
                    } else {
                        i10 = 2131624245;
                    }
                } else {
                    i10 = 2131623977;
                }
            } else {
                i10 = 2131624247;
            }
            zg0VarArr[i7] = new zg0(i10, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i7);
        }
        return zg0VarArr[i7];
    }

    public final void b() {
        int value;
        if (this.K == null && this.J != (value = this.h.getValue())) {
            this.J = value;
            int i7 = (this.D + 1) % 2;
            zg0 a10 = a(value);
            ch0[] ch0VarArr = this.E;
            if (a10 != null) {
                if (ch0VarArr[i7].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                ch0VarArr[i7].setAnimation(a10);
                ch0VarArr[i7].d();
            } else {
                ch0VarArr[i7].a();
            }
            org.telegram.messenger.g0.Z3(ch0VarArr[this.D], false, 0.5f, true, true);
            org.telegram.messenger.g0.Z3(ch0VarArr[i7], true, 0.5f, true, true);
            this.D = i7;
            ir0 ir0Var = new ir0(this, 10);
            this.K = ir0Var;
            org.telegram.messenger.g0.i3(ir0Var, 150L);
        }
    }

    public final void c(int i7) {
        zg0[] zg0VarArr = this.f38742s;
        if (zg0VarArr[i7] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27834c9, false));
            int i10 = org.telegram.ui.ActionBar.k6.f27871e9;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            zg0 zg0Var = zg0VarArr[i7];
            zg0[] zg0VarArr2 = this.f38743w;
            zg0 zg0Var2 = zg0VarArr2[i7];
            int[] iArr = this.f38745y;
            int[] iArr2 = this.f38744x;
            if (zg0Var != zg0Var2 || x02 != iArr2[i7] || f10 != iArr[i7]) {
                zg0VarArr2[i7] = zg0Var;
                iArr2[i7] = x02;
                iArr[i7] = f10;
                if (i7 == 2) {
                    zg0VarArr[i7].Q(f10, "Arrow");
                    zg0VarArr[i7].Q(x02, "Box2");
                    zg0VarArr[i7].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.r6.y(this, zg0VarArr[i7], i10, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uw0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            tw0 tw0Var = this.h;
            int value = tw0Var.getValue() + 1;
            setContentDescription(this.f38740n[(value > tw0Var.getMaxValue() || value < 0) ? 0 : 0]);
            tw0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f38740n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        updateColors();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27957j5, false);
        this.f38735a = x02;
        tw0 tw0Var = this.h;
        tw0Var.setTextColor(x02);
        tw0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i7 = 0; i7 < this.f38742s.length; i7++) {
            c(i7);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
