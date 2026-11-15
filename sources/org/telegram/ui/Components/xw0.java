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
public final class xw0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public final fh0[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public ro0 L;
    public int f41771a;
    public final Paint f41772b;
    public final Paint f41773c;
    public final Paint d;
    public final Paint f41774e;
    public final RectF f41775f;
    public final ww0 h;
    public final String[] f41776n;
    public final int[] f41777r;
    public final ch0[] f41778s;
    public final ch0[] f41779w;
    public final int[] f41780x;
    public final int[] f41781y;

    public xw0(Context context, int i7) {
        super(context);
        int i10;
        Paint paint = new Paint(1);
        this.f41772b = paint;
        this.f41773c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f41774e = paint3;
        this.f41775f = new RectF();
        this.f41776n = r7;
        this.f41777r = r8;
        this.f41778s = new ch0[6];
        this.f41779w = new ch0[6];
        this.f41780x = new int[6];
        this.f41781y = new int[6];
        this.F = new fh0[2];
        this.H = 1.0f;
        String[] strArr = {org.telegram.messenger.hd.M0(2131744315, null), org.telegram.messenger.hd.M0(2131744314, null), org.telegram.messenger.hd.M0(2131744319, null), org.telegram.messenger.hd.M0(2131744316, null), org.telegram.messenger.hd.M0(2131744318, null), org.telegram.messenger.hd.M0(2131744317, null)};
        int i11 = org.telegram.ui.ActionBar.j6.f28834c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.j6.Y5, org.telegram.ui.ActionBar.j6.f28852d9};
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
        ww0 ww0Var = new ww0(this, context);
        this.h = ww0Var;
        this.f41771a = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false);
        ww0Var.setMinValue(0);
        ww0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.np.s1(i7).Q0.isEmpty();
        ww0Var.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i10 = 6;
        } else {
            i10 = 5;
        }
        ww0Var.setAllItemsCount(i10);
        ww0Var.setWrapSelectorWheel(true);
        ww0Var.setFormatter(new vw0(this));
        ww0Var.setOnValueChangedListener(new vw0(this));
        ww0Var.setImportantForAccessibility(2);
        ww0Var.setValue(org.telegram.messenger.gz.m(i7));
        addView(ww0Var, c8.ja.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.F[i12] = new ImageView(context);
            addView(this.F[i12], c8.ja.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        ch0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.F[0].setImageDrawable(a10);
            a10.M(a10.f33579e[0] - 1);
        }
        org.telegram.messenger.g0.Y3(this.F[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.Y3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final ch0 a(int i7) {
        int i10;
        ch0[] ch0VarArr = this.f41778s;
        if (ch0VarArr[i7] == null) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                i10 = 2131624247;
                            } else {
                                i10 = 2131624245;
                            }
                        } else {
                            i10 = 2131624244;
                        }
                    } else {
                        i10 = 2131624246;
                    }
                } else {
                    i10 = 2131623978;
                }
            } else {
                i10 = 2131624248;
            }
            ch0VarArr[i7] = new ch0(i10, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i7);
        }
        return ch0VarArr[i7];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i7 = (this.E + 1) % 2;
            ch0 a10 = a(value);
            fh0[] fh0VarArr = this.F;
            if (a10 != null) {
                if (fh0VarArr[i7].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                fh0VarArr[i7].setAnimation(a10);
                fh0VarArr[i7].d();
            } else {
                fh0VarArr[i7].a();
            }
            org.telegram.messenger.g0.Y3(fh0VarArr[this.E], false, 0.5f, true, true);
            org.telegram.messenger.g0.Y3(fh0VarArr[i7], true, 0.5f, true, true);
            this.E = i7;
            ro0 ro0Var = new ro0(this, 13);
            this.L = ro0Var;
            org.telegram.messenger.g0.i3(ro0Var, 150L);
        }
    }

    public final void c(int i7) {
        ch0[] ch0VarArr = this.f41778s;
        if (ch0VarArr[i7] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28834c9, false));
            int i10 = org.telegram.ui.ActionBar.j6.f28871e9;
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
            ch0 ch0Var = ch0VarArr[i7];
            ch0[] ch0VarArr2 = this.f41779w;
            ch0 ch0Var2 = ch0VarArr2[i7];
            int[] iArr = this.f41781y;
            int[] iArr2 = this.f41780x;
            if (ch0Var != ch0Var2 || x02 != iArr2[i7] || f10 != iArr[i7]) {
                ch0VarArr2[i7] = ch0Var;
                iArr2[i7] = x02;
                iArr[i7] = f10;
                if (i7 == 2) {
                    ch0VarArr[i7].Q(f10, "Arrow");
                    ch0VarArr[i7].Q(x02, "Box2");
                    ch0VarArr[i7].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.q6.x(this, ch0VarArr[i7], i10, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xw0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            ww0 ww0Var = this.h;
            int value = ww0Var.getValue() + 1;
            setContentDescription(this.f41776n[(value > ww0Var.getMaxValue() || value < 0) ? 0 : 0]);
            ww0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f41776n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false);
        this.f41771a = x02;
        ww0 ww0Var = this.h;
        ww0Var.setTextColor(x02);
        ww0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i7 = 0; i7 < this.f41778s.length; i7++) {
            c(i7);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
