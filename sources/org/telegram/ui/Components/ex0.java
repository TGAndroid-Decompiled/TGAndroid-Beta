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
public final class ex0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int E;
    public final ph0[] F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public ap0 L;
    public int f34824a;
    public final Paint f34825b;
    public final Paint f34826c;
    public final Paint d;
    public final Paint f34827e;
    public final RectF f34828f;
    public final dx0 h;
    public final String[] f34829n;
    public final int[] f34830r;
    public final mh0[] f34831s;
    public final mh0[] f34832w;
    public final int[] f34833x;
    public final int[] f34834y;

    public ex0(Context context, int i7) {
        super(context);
        int i10;
        Paint paint = new Paint(1);
        this.f34825b = paint;
        this.f34826c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.f34827e = paint3;
        this.f34828f = new RectF();
        this.f34829n = r7;
        this.f34830r = r8;
        this.f34831s = new mh0[6];
        this.f34832w = new mh0[6];
        this.f34833x = new int[6];
        this.f34834y = new int[6];
        this.F = new ph0[2];
        this.H = 1.0f;
        String[] strArr = {org.telegram.messenger.gd.M0(2131744080, null), org.telegram.messenger.gd.M0(2131744079, null), org.telegram.messenger.gd.M0(2131744084, null), org.telegram.messenger.gd.M0(2131744081, null), org.telegram.messenger.gd.M0(2131744083, null), org.telegram.messenger.gd.M0(2131744082, null)};
        int i11 = org.telegram.ui.ActionBar.n6.f29379c9;
        int[] iArr = {i11, i11, i11, i11, org.telegram.ui.ActionBar.n6.Y5, org.telegram.ui.ActionBar.n6.f29397d9};
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
        dx0 dx0Var = new dx0(this, context);
        this.h = dx0Var;
        this.f34824a = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29502j5, false);
        dx0Var.setMinValue(0);
        dx0Var.setDrawDividers(false);
        boolean isEmpty = org.telegram.messenger.mp.u1(i7).Q0.isEmpty();
        dx0Var.setMaxValue(isEmpty ? 4 : 5);
        if (!isEmpty) {
            i10 = 6;
        } else {
            i10 = 5;
        }
        dx0Var.setAllItemsCount(i10);
        dx0Var.setWrapSelectorWheel(true);
        dx0Var.setFormatter(new cx0(this));
        dx0Var.setOnValueChangedListener(new cx0(this));
        dx0Var.setImportantForAccessibility(2);
        dx0Var.setValue(org.telegram.messenger.bz.m(i7));
        addView(dx0Var, c8.ma.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
        setWillNotDraw(false);
        this.E = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            this.F[i12] = new ImageView(context);
            addView(this.F[i12], c8.ma.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
        }
        mh0 a10 = a(this.h.getValue());
        if (a10 != null) {
            this.F[0].setImageDrawable(a10);
            a10.M(a10.f37486e[0] - 1);
        }
        org.telegram.messenger.g0.X3(this.F[0], true, 0.5f, true, false);
        org.telegram.messenger.g0.X3(this.F[1], false, 0.5f, true, false);
        this.G = this.h.getValue() != 5 ? 0.0f : 1.0f;
        this.K = this.h.getValue();
    }

    public final mh0 a(int i7) {
        int i10;
        mh0[] mh0VarArr = this.f34831s;
        if (mh0VarArr[i7] == null) {
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
            mh0VarArr[i7] = new mh0(i10, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            c(i7);
        }
        return mh0VarArr[i7];
    }

    public final void b() {
        int value;
        if (this.L == null && this.K != (value = this.h.getValue())) {
            this.K = value;
            int i7 = (this.E + 1) % 2;
            mh0 a10 = a(value);
            ph0[] ph0VarArr = this.F;
            if (a10 != null) {
                if (ph0VarArr[i7].getVisibility() != 0) {
                    a10.N(0, false, false);
                }
                ph0VarArr[i7].setAnimation(a10);
                ph0VarArr[i7].d();
            } else {
                ph0VarArr[i7].a();
            }
            org.telegram.messenger.g0.X3(ph0VarArr[this.E], false, 0.5f, true, true);
            org.telegram.messenger.g0.X3(ph0VarArr[i7], true, 0.5f, true, true);
            this.E = i7;
            ap0 ap0Var = new ap0(this, 13);
            this.L = ap0Var;
            org.telegram.messenger.g0.h3(ap0Var, 150L);
        }
    }

    public final void c(int i7) {
        mh0[] mh0VarArr = this.f34831s;
        if (mh0VarArr[i7] != null) {
            int f10 = i0.a.f(0.9f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29379c9, false));
            int i10 = org.telegram.ui.ActionBar.n6.f29416e9;
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            mh0 mh0Var = mh0VarArr[i7];
            mh0[] mh0VarArr2 = this.f34832w;
            mh0 mh0Var2 = mh0VarArr2[i7];
            int[] iArr = this.f34834y;
            int[] iArr2 = this.f34833x;
            if (mh0Var != mh0Var2 || x02 != iArr2[i7] || f10 != iArr[i7]) {
                mh0VarArr2[i7] = mh0Var;
                iArr2[i7] = x02;
                iArr[i7] = f10;
                if (i7 == 2) {
                    mh0VarArr[i7].Q(f10, "Arrow");
                    mh0VarArr[i7].Q(x02, "Box2");
                    mh0VarArr[i7].Q(x02, "Box1");
                    return;
                }
                org.telegram.ui.ActionBar.u6.x(this, mh0VarArr[i7], i10, null, PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ex0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            dx0 dx0Var = this.h;
            int value = dx0Var.getValue() + 1;
            setContentDescription(this.f34829n[(value > dx0Var.getMaxValue() || value < 0) ? 0 : 0]);
            dx0Var.a(true);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setContentDescription(this.f34829n[this.h.getValue()]);
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
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29502j5, false);
        this.f34824a = x02;
        dx0 dx0Var = this.h;
        dx0Var.setTextColor(x02);
        dx0Var.invalidate();
    }

    @Override
    public final void updateColors() {
        for (int i7 = 0; i7 < this.f34831s.length; i7++) {
            c(i7);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
