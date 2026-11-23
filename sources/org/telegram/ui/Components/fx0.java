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
public final class fx0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int E;
    public final qh0[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public bp0 L;
    public int f35219a;
    public final Paint f35220b;
    public final Paint f35221c;
    public final Paint d;
    public final Paint f35222e;
    public final RectF f35223f;
    public final ex0 h;
    public final String[] f35224n;
    public final int[] f35225r;
    public final nh0[] f35226s;
    public final nh0[] f35227w;
    public final int[] f35228x;
    public final int[] f35229y;

    public fx0(Context context, int i7) {
        super(context);
        int i10;
        Paint paint = new Paint(1);
        this.f35220b = paint;
        this.f35221c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f35222e = paint3;
        this.f35223f = new RectF();
        this.f35224n = r7;
        this.f35225r = r8;
        this.f35226s = new nh0[6];
        this.f35227w = new nh0[6];
        this.f35228x = new int[6];
        this.f35229y = new int[6];
        this.F = new qh0[2];
        this.H = 1.0f;
        String[] strArr = {org.telegram.messenger.gd.N0(2131744070, null), org.telegram.messenger.gd.N0(2131744069, null), org.telegram.messenger.gd.N0(2131744074, null), org.telegram.messenger.gd.N0(2131744071, null), org.telegram.messenger.gd.N0(2131744073, null), org.telegram.messenger.gd.N0(2131744072, null)};
        int i11 = org.telegram.ui.ActionBar.n6.f29436c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.n6.Y5, org.telegram.ui.ActionBar.n6.f29454d9};
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
        ex0 ex0Var = new ex0(this, context);
        this.h = ex0Var;
        this.f35219a = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false);
        ex0Var.setMinValue(0);
        ex0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.mp.u1(i7).Q0.isEmpty();
        ex0Var.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i10 = 6;
        } else {
            i10 = 5;
        }
        ex0Var.setAllItemsCount(i10);
        ex0Var.setWrapSelectorWheel(true);
        ex0Var.setFormatter(new dx0(this));
        ex0Var.setOnValueChangedListener(new dx0(this));
        ex0Var.setImportantForAccessibility(2);
        ex0Var.setValue(org.telegram.messenger.bz.m(i7));
        addView(ex0Var, c8.na.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.F[i12] = new ImageView(context);
            addView(this.F[i12], c8.na.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        nh0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.F[0].setImageDrawable(a10);
            a10.M(a10.f37805e[0] - 1);
        }
        org.telegram.messenger.g0.X3(this.F[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.X3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final nh0 a(int i7) {
        int i10;
        nh0[] nh0VarArr = this.f35226s;
        if (nh0VarArr[i7] == null) {
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
            nh0VarArr[i7] = new nh0(i10, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i7);
        }
        return nh0VarArr[i7];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i7 = (this.E + 1) % 2;
            nh0 a10 = a(value);
            qh0[] qh0VarArr = this.F;
            if (a10 != null) {
                if (qh0VarArr[i7].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                qh0VarArr[i7].setAnimation(a10);
                qh0VarArr[i7].d();
            } else {
                qh0VarArr[i7].a();
            }
            org.telegram.messenger.g0.X3(qh0VarArr[this.E], false, 0.5f, true, true);
            org.telegram.messenger.g0.X3(qh0VarArr[i7], true, 0.5f, true, true);
            this.E = i7;
            bp0 bp0Var = new bp0(this, 13);
            this.L = bp0Var;
            org.telegram.messenger.g0.h3(bp0Var, 150L);
        }
    }

    public final void c(int i7) {
        nh0[] nh0VarArr = this.f35226s;
        if (nh0VarArr[i7] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29436c9, false));
            int i10 = org.telegram.ui.ActionBar.n6.f29473e9;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            nh0 nh0Var = nh0VarArr[i7];
            nh0[] nh0VarArr2 = this.f35227w;
            nh0 nh0Var2 = nh0VarArr2[i7];
            int[] iArr = this.f35229y;
            int[] iArr2 = this.f35228x;
            if (nh0Var != nh0Var2 || x02 != iArr2[i7] || f10 != iArr[i7]) {
                nh0VarArr2[i7] = nh0Var;
                iArr2[i7] = x02;
                iArr[i7] = f10;
                if (i7 == 2) {
                    nh0VarArr[i7].Q(f10, "Arrow");
                    nh0VarArr[i7].Q(x02, "Box2");
                    nh0VarArr[i7].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.u6.x(this, nh0VarArr[i7], i10, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            ex0 ex0Var = this.h;
            int value = ex0Var.getValue() + 1;
            setContentDescription(this.f35224n[(value > ex0Var.getMaxValue() || value < 0) ? 0 : 0]);
            ex0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f35224n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false);
        this.f35219a = x02;
        ex0 ex0Var = this.h;
        ex0Var.setTextColor(x02);
        ex0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i7 = 0; i7 < this.f35226s.length; i7++) {
            c(i7);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
