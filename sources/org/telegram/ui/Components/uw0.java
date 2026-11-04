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
public final class uw0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public final fh0[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public sp0 L;
    public int f38892a;
    public final Paint f38893b;
    public final Paint f38894c;
    public final Paint d;
    public final Paint f38895e;
    public final RectF f38896f;
    public final tw0 h;
    public final String[] f38897n;
    public final int[] f38898r;
    public final ch0[] f38899s;
    public final ch0[] f38900w;
    public final int[] f38901x;
    public final int[] f38902y;

    public uw0(Context context, int i3) {
        super(context);
        int i10;
        Paint paint = new Paint(1);
        this.f38893b = paint;
        this.f38894c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f38895e = paint3;
        this.f38896f = new RectF();
        this.f38897n = r7;
        this.f38898r = r8;
        this.f38899s = new ch0[6];
        this.f38900w = new ch0[6];
        this.f38901x = new int[6];
        this.f38902y = new int[6];
        this.F = new fh0[2];
        this.H = 1.0f;
        String[] strArr = {org.telegram.messenger.bd.M0(2131744325, null), org.telegram.messenger.bd.M0(2131744324, null), org.telegram.messenger.bd.M0(2131744329, null), org.telegram.messenger.bd.M0(2131744326, null), org.telegram.messenger.bd.M0(2131744328, null), org.telegram.messenger.bd.M0(2131744327, null)};
        int i11 = org.telegram.ui.ActionBar.k6.f27864c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.k6.Y5, org.telegram.ui.ActionBar.k6.f27881d9};
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
        this.f38892a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false);
        tw0Var.setMinValue(0);
        tw0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.hp.s1(i3).Q0.isEmpty();
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
        tw0Var.setValue(org.telegram.messenger.az.m(i3));
        addView(tw0Var, b8.mf.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.F[i12] = new ImageView(context);
            addView(this.F[i12], b8.mf.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        ch0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.F[0].setImageDrawable(a10);
            a10.M(a10.f32725e[0] - 1);
        }
        org.telegram.messenger.g0.Z3(this.F[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.Z3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final ch0 a(int i3) {
        int i10;
        ch0[] ch0VarArr = this.f38899s;
        if (ch0VarArr[i3] == null) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
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
            ch0VarArr[i3] = new ch0(i10, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i3);
        }
        return ch0VarArr[i3];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i3 = (this.E + 1) % 2;
            ch0 a10 = a(value);
            fh0[] fh0VarArr = this.F;
            if (a10 != null) {
                if (fh0VarArr[i3].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                fh0VarArr[i3].setAnimation(a10);
                fh0VarArr[i3].d();
            } else {
                fh0VarArr[i3].a();
            }
            org.telegram.messenger.g0.Z3(fh0VarArr[this.E], false, 0.5f, true, true);
            org.telegram.messenger.g0.Z3(fh0VarArr[i3], true, 0.5f, true, true);
            this.E = i3;
            sp0 sp0Var = new sp0(this, 12);
            this.L = sp0Var;
            org.telegram.messenger.g0.i3(sp0Var, 150L);
        }
    }

    public final void c(int i3) {
        ch0[] ch0VarArr = this.f38899s;
        if (ch0VarArr[i3] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27864c9, false));
            int i10 = org.telegram.ui.ActionBar.k6.f27901e9;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            ch0 ch0Var = ch0VarArr[i3];
            ch0[] ch0VarArr2 = this.f38900w;
            ch0 ch0Var2 = ch0VarArr2[i3];
            int[] iArr = this.f38902y;
            int[] iArr2 = this.f38901x;
            if (ch0Var != ch0Var2 || x02 != iArr2[i3] || f10 != iArr[i3]) {
                ch0VarArr2[i3] = ch0Var;
                iArr2[i3] = x02;
                iArr[i3] = f10;
                if (i3 == 2) {
                    ch0VarArr[i3].Q(f10, "Arrow");
                    ch0VarArr[i3].Q(x02, "Box2");
                    ch0VarArr[i3].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.r6.y(this, ch0VarArr[i3], i10, null, PorterDuff.Mode.SRC_IN);
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
            setContentDescription(this.f38897n[(value > tw0Var.getMaxValue() || value < 0) ? 0 : 0]);
            tw0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f38897n[this.h.getValue()]);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, null));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(102.0f), 1073741824));
    }

    @Override
    public void setBackgroundColor(int i3) {
        super.setBackgroundColor(i3);
        updateColors();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false);
        this.f38892a = x02;
        tw0 tw0Var = this.h;
        tw0Var.setTextColor(x02);
        tw0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i3 = 0; i3 < this.f38899s.length; i3++) {
            c(i3);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
