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
public final class gx0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final rh0[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public cp0 L;
    public int f35682a;
    public final Paint f35683b;
    public final Paint f35684c;
    public final Paint d;
    public final Paint f35685e;
    public final RectF f35686f;
    public final fx0 h;
    public final String[] f35687n;
    public final int[] f35688r;
    public final oh0[] f35689s;
    public final oh0[] f35690w;
    public final int[] f35691x;
    public final int[] f35692y;

    public gx0(Context context, int i7) {
        super(context);
        int i10;
        Paint paint = new Paint(1);
        this.f35683b = paint;
        this.f35684c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f35685e = paint3;
        this.f35686f = new RectF();
        this.f35687n = r7;
        this.f35688r = r8;
        this.f35689s = new oh0[6];
        this.f35690w = new oh0[6];
        this.f35691x = new int[6];
        this.f35692y = new int[6];
        this.F = new rh0[2];
        this.H = 1.0f;
        String[] strArr = {org.telegram.messenger.gd.N0(2131744074, null), org.telegram.messenger.gd.N0(2131744073, null), org.telegram.messenger.gd.N0(2131744078, null), org.telegram.messenger.gd.N0(2131744075, null), org.telegram.messenger.gd.N0(2131744077, null), org.telegram.messenger.gd.N0(2131744076, null)};
        int i11 = org.telegram.ui.ActionBar.m6.f29363c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.m6.Y5, org.telegram.ui.ActionBar.m6.f29381d9};
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
        fx0 fx0Var = new fx0(this, context);
        this.h = fx0Var;
        this.f35682a = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29486j5, false);
        fx0Var.setMinValue(0);
        fx0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.mp.u1(i7).Q0.isEmpty();
        fx0Var.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i10 = 6;
        } else {
            i10 = 5;
        }
        fx0Var.setAllItemsCount(i10);
        fx0Var.setWrapSelectorWheel(true);
        fx0Var.setFormatter(new ex0(this));
        fx0Var.setOnValueChangedListener(new ex0(this));
        fx0Var.setImportantForAccessibility(2);
        fx0Var.setValue(org.telegram.messenger.bz.m(i7));
        addView(fx0Var, c8.ma.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.F[i12] = new ImageView(context);
            addView(this.F[i12], c8.ma.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        oh0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.F[0].setImageDrawable(a10);
            a10.M(a10.f38217e[0] - 1);
        }
        org.telegram.messenger.g0.X3(this.F[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.X3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final oh0 a(int i7) {
        int i10;
        oh0[] oh0VarArr = this.f35689s;
        if (oh0VarArr[i7] == null) {
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
            oh0VarArr[i7] = new oh0(i10, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i7);
        }
        return oh0VarArr[i7];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i7 = (this.E + 1) % 2;
            oh0 a10 = a(value);
            rh0[] rh0VarArr = this.F;
            if (a10 != null) {
                if (rh0VarArr[i7].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                rh0VarArr[i7].setAnimation(a10);
                rh0VarArr[i7].d();
            } else {
                rh0VarArr[i7].a();
            }
            org.telegram.messenger.g0.X3(rh0VarArr[this.E], false, 0.5f, true, true);
            org.telegram.messenger.g0.X3(rh0VarArr[i7], true, 0.5f, true, true);
            this.E = i7;
            cp0 cp0Var = new cp0(this, 13);
            this.L = cp0Var;
            org.telegram.messenger.g0.h3(cp0Var, 150L);
        }
    }

    public final void c(int i7) {
        oh0[] oh0VarArr = this.f35689s;
        if (oh0VarArr[i7] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29363c9, false));
            int i10 = org.telegram.ui.ActionBar.m6.f29400e9;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
            oh0 oh0Var = oh0VarArr[i7];
            oh0[] oh0VarArr2 = this.f35690w;
            oh0 oh0Var2 = oh0VarArr2[i7];
            int[] iArr = this.f35692y;
            int[] iArr2 = this.f35691x;
            if (oh0Var != oh0Var2 || x02 != iArr2[i7] || f10 != iArr[i7]) {
                oh0VarArr2[i7] = oh0Var;
                iArr2[i7] = x02;
                iArr[i7] = f10;
                if (i7 == 2) {
                    oh0VarArr[i7].Q(f10, "Arrow");
                    oh0VarArr[i7].Q(x02, "Box2");
                    oh0VarArr[i7].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.t6.x(this, oh0VarArr[i7], i10, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gx0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            fx0 fx0Var = this.h;
            int value = fx0Var.getValue() + 1;
            setContentDescription(this.f35687n[(value > fx0Var.getMaxValue() || value < 0) ? 0 : 0]);
            fx0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f35687n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29486j5, false);
        this.f35682a = x02;
        fx0 fx0Var = this.h;
        fx0Var.setTextColor(x02);
        fx0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i7 = 0; i7 < this.f35689s.length; i7++) {
            c(i7);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
