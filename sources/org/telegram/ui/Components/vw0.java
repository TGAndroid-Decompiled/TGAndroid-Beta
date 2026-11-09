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
public final class vw0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int D;
    public final dh0[] E;
    public float F;
    public float G;
    public int H;
    public int I;
    public int J;
    public kr0 K;
    public int f39820a;
    public final Paint f39821b;
    public final Paint f39822c;
    public final Paint d;
    public final Paint f39823e;
    public final RectF f39824f;
    public final uw0 h;
    public final String[] f39825n;
    public final int[] f39826r;
    public final ah0[] f39827s;
    public final ah0[] f39828w;
    public final int[] f39829x;
    public final int[] f39830y;

    public vw0(Context context, int i7) {
        super(context);
        int i10;
        Paint paint = new Paint(1);
        this.f39821b = paint;
        this.f39822c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f39823e = paint3;
        this.f39824f = new RectF();
        this.f39825n = r7;
        this.f39826r = r8;
        this.f39827s = new ah0[6];
        this.f39828w = new ah0[6];
        this.f39829x = new int[6];
        this.f39830y = new int[6];
        this.E = new dh0[2];
        this.G = 1.0f;
        String[] strArr = {org.telegram.messenger.id.M0(2131744315, null), org.telegram.messenger.id.M0(2131744314, null), org.telegram.messenger.id.M0(2131744319, null), org.telegram.messenger.id.M0(2131744316, null), org.telegram.messenger.id.M0(2131744318, null), org.telegram.messenger.id.M0(2131744317, null)};
        int i11 = org.telegram.ui.ActionBar.l6.f27850c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.l6.Y5, org.telegram.ui.ActionBar.l6.f27868d9};
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
        uw0 uw0Var = new uw0(this, context);
        this.h = uw0Var;
        this.f39820a = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false);
        uw0Var.setMinValue(0);
        uw0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.qp.s1(i7).P0.isEmpty();
        uw0Var.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i10 = 6;
        } else {
            i10 = 5;
        }
        uw0Var.setAllItemsCount(i10);
        uw0Var.setWrapSelectorWheel(true);
        uw0Var.setFormatter(new tw0(this));
        uw0Var.setOnValueChangedListener(new tw0(this));
        uw0Var.setImportantForAccessibility(2);
        uw0Var.setValue(org.telegram.messenger.iz.m(i7));
        addView(uw0Var, c8.ha.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.D = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.E[i12] = new ImageView(context);
            addView(this.E[i12], c8.ha.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        ah0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.E[0].setImageDrawable(a10);
            a10.M(a10.f31826e[0] - 1);
        }
        org.telegram.messenger.g0.Z3(this.E[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.Z3(this.E[1], false, 0.5f, true, false);
        this.F = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.J = this.h.getValue();
    }

    public final ah0 a(int i7) {
        int i10;
        ah0[] ah0VarArr = this.f39827s;
        if (ah0VarArr[i7] == null) {
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
            ah0VarArr[i7] = new ah0(i10, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i7);
        }
        return ah0VarArr[i7];
    }

    public final void b() {
        int value;
        if (this.K == null && this.J != (value = this.h.getValue())) {
            this.J = value;
            int i7 = (this.D + 1) % 2;
            ah0 a10 = a(value);
            dh0[] dh0VarArr = this.E;
            if (a10 != null) {
                if (dh0VarArr[i7].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                dh0VarArr[i7].setAnimation(a10);
                dh0VarArr[i7].d();
            } else {
                dh0VarArr[i7].a();
            }
            org.telegram.messenger.g0.Z3(dh0VarArr[this.D], false, 0.5f, true, true);
            org.telegram.messenger.g0.Z3(dh0VarArr[i7], true, 0.5f, true, true);
            this.D = i7;
            kr0 kr0Var = new kr0(this, 10);
            this.K = kr0Var;
            org.telegram.messenger.g0.i3(kr0Var, 150L);
        }
    }

    public final void c(int i7) {
        ah0[] ah0VarArr = this.f39827s;
        if (ah0VarArr[i7] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27850c9, false));
            int i10 = org.telegram.ui.ActionBar.l6.f27887e9;
            int x02 = org.telegram.ui.ActionBar.l6.x0(null, i10, false);
            ah0 ah0Var = ah0VarArr[i7];
            ah0[] ah0VarArr2 = this.f39828w;
            ah0 ah0Var2 = ah0VarArr2[i7];
            int[] iArr = this.f39830y;
            int[] iArr2 = this.f39829x;
            if (ah0Var != ah0Var2 || x02 != iArr2[i7] || f10 != iArr[i7]) {
                ah0VarArr2[i7] = ah0Var;
                iArr2[i7] = x02;
                iArr[i7] = f10;
                if (i7 == 2) {
                    ah0VarArr[i7].Q(f10, "Arrow");
                    ah0VarArr[i7].Q(x02, "Box2");
                    ah0VarArr[i7].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.s6.x(this, ah0VarArr[i7], i10, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vw0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            uw0 uw0Var = this.h;
            int value = uw0Var.getValue() + 1;
            setContentDescription(this.f39825n[(value > uw0Var.getMaxValue() || value < 0) ? 0 : 0]);
            uw0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f39825n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false);
        this.f39820a = x02;
        uw0 uw0Var = this.h;
        uw0Var.setTextColor(x02);
        uw0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i7 = 0; i7 < this.f39827s.length; i7++) {
            c(i7);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
