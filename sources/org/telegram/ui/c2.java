package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
public final class c2 extends ViewGroup implements org.telegram.ui.Cells.l9, g3 {
    public final o70 f35658a;
    public final j4 f35659b;
    public d3 f35660c;
    public org.telegram.ui.Components.el0 d;
    public int f35661e;
    public int f35662f;
    public int h;
    public int f35663n;
    public int f35664r;
    public int f35665s;
    public boolean v;
    public d4 f35666w;
    public CheckBoxBase f35667x;

    public c2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f35658a = o70Var;
        this.f35659b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        d4 d4Var = this.f35666w;
        if (d4Var != null) {
            d3Var = d4Var.f35976i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        o70 o70Var = this.f35658a;
        j4 j4Var = this.f35659b;
        if (j4Var != null && j4Var.D) {
            int measuredWidth = getMeasuredWidth();
            o70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            e4 e4Var = this.f35666w.f35973c;
            return b.z(20.0f, e4Var.f36358e, dp - e4Var.f36356b);
        }
        o70Var.getClass();
        return org.telegram.messenger.y3.D(20.0f, this.f35666w.f35973c.f36358e, (AndroidUtilities.dp(18) + this.f35666w.f35973c.f36356b) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.l9) {
                ((org.telegram.ui.Cells.l9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f35660c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f35658a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f35666w;
        if (d4Var != null && d4Var.f35976i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f35666w.f35976i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var = this.f35660c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f35964s) - dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5875a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f35663n + boundLeft);
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10;
    }

    @Override
    public int getBoundRight() {
        int i10;
        int boundRight;
        this.f35658a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f35666w;
        if (d4Var != null && d4Var.f35976i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f35666w.f35976i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f35660c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f35964s + dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5875a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f35663n + boundRight);
            }
        }
        if (i10 == Integer.MIN_VALUE) {
            return -1;
        }
        return i10;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i10;
        d3 d3Var = this.f35660c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f35964s;
            this.f35658a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                View view = el0Var.f5875a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f35663n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            el0Var.f5875a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35660c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35660c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35666w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f35666w.f35976i;
            o70 o70Var = this.f35658a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f35659b;
                if (j4Var != null && j4Var.D) {
                    o70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    e4 e4Var = this.f35666w.f35973c;
                    canvas.translate(b.z(20.0f, e4Var.f36358e, dp - e4Var.f36356b), this.f35662f + this.h);
                } else {
                    o70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    d4 d4Var = this.f35666w;
                    canvas.translate(org.telegram.messenger.y3.D(20.0f, this.f35666w.f35973c.f36358e, (dp2 + d4Var.f35973c.f36356b) - ((int) Math.ceil(d4Var.f35976i.d.getLineWidth(0)))), this.f35662f + this.h);
                }
                this.f35666w.f35976i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f35667x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f35661e - AndroidUtilities.dp(26.0f), this.f35662f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f35667x.a(canvas);
            }
            if (this.f35660c != null) {
                canvas.save();
                canvas.translate(this.f35661e, this.f35662f);
                l4.v(o70Var, canvas, this, 0);
                this.f35660c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f35660c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f35658a, this.f35659b, d3Var));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5875a;
            int i14 = this.f35663n;
            view.layout(i14, this.f35664r, view.getMeasuredWidth() + i14, this.d.f5875a.getMeasuredHeight() + this.f35664r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f35658a, this.f35659b, motionEvent, this, this.f35660c, this.f35661e, this.f35662f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(d4 d4Var) {
        d4 d4Var2 = this.f35666w;
        j4 j4Var = this.f35659b;
        if (d4Var2 != d4Var) {
            this.f35666w = d4Var;
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                removeView(el0Var.f5875a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f35666w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.f35665s = I;
                f2.m1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.el0) x10;
                addView(x10.f5875a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f35666w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.f35665s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
