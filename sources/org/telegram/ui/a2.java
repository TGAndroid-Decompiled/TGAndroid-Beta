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
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.r9, e3 {
    public final j70 f37650a;
    public final h4 f37651b;
    public a3 f37652c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public int f37653f;
    public int h;
    public int f37654n;
    public int f37655r;
    public int f37656s;
    public boolean v;
    public a4 f37657w;
    public CheckBoxBase f37658x;

    public a2(Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.f37650a = j70Var;
        this.f37651b = h4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        a4 a4Var = this.f37657w;
        if (a4Var != null) {
            a3Var = a4Var.f37682i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        j70 j70Var = this.f37650a;
        h4 h4Var = this.f37651b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth();
            j70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f37657w.f37680c;
            return org.telegram.messenger.wh.C(20.0f, b4Var.e, dp - b4Var.f37879b);
        }
        j70Var.getClass();
        return org.telegram.messenger.wh.b(20.0f, this.f37657w.f37680c.e, (AndroidUtilities.dp(18) + this.f37657w.f37680c.f37879b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f47773a;
            if (view instanceof org.telegram.ui.Cells.r9) {
                ((org.telegram.ui.Cells.r9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f37652c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f37650a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f37657w;
        if (a4Var != null && a4Var.f37682i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f37657w.f37682i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f37652c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f37666s) - dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f47773a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f37654n + boundLeft);
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
        this.f37650a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f37657w;
        if (a4Var != null && a4Var.f37682i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f37657w.f37682i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f37652c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f37666s + dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f47773a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f37654n + boundRight);
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
        a3 a3Var = this.f37652c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f37666s;
            this.f37650a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                View view = wl0Var.f47773a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f37654n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            wl0Var.f47773a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37652c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f37652c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37657w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f37657w.f37682i;
            j70 j70Var = this.f37650a;
            if (a3Var != null) {
                canvas.save();
                h4 h4Var = this.f37651b;
                if (h4Var != null && h4Var.G) {
                    j70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f37657w.f37680c;
                    canvas.translate(org.telegram.messenger.wh.C(20.0f, b4Var.e, dp - b4Var.f37879b), this.f37653f + this.h);
                } else {
                    j70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f37657w;
                    canvas.translate(org.telegram.messenger.wh.b(20.0f, this.f37657w.f37680c.e, (dp2 + a4Var.f37680c.f37879b) - ((int) Math.ceil(a4Var.f37682i.d.getLineWidth(0)))), this.f37653f + this.h);
                }
                this.f37657w.f37682i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f37658x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f37653f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f37658x.a(canvas);
            }
            if (this.f37652c != null) {
                canvas.save();
                canvas.translate(this.e, this.f37653f);
                j4.v(j70Var, canvas, this, 0);
                this.f37652c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f37652c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f37650a, this.f37651b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f47773a;
            int i14 = this.f37654n;
            view.layout(i14, this.f37655r, view.getMeasuredWidth() + i14, this.d.f47773a.getMeasuredHeight() + this.f37655r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.f37650a, this.f37651b, motionEvent, this, this.f37652c, this.e, this.f37653f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f37657w;
        h4 h4Var = this.f37651b;
        if (a4Var2 != a4Var) {
            this.f37657w = a4Var;
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                removeView(wl0Var.f47773a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f37657w.d;
            if (pageBlock != null && h4Var != null) {
                int I = h4.I(pageBlock);
                this.f37656s = I;
                s4.e1 x9 = h4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wl0) x9;
                addView(x9.f47773a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f37657w.d;
        if (pageBlock2 != null && h4Var != null) {
            h4Var.H(this.f37656s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
