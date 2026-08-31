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
    public final o70 f35647a;
    public final j4 f35648b;
    public d3 f35649c;
    public org.telegram.ui.Components.fl0 d;
    public int f35650e;
    public int f35651f;
    public int h;
    public int f35652n;
    public int f35653r;
    public int f35654s;
    public boolean v;
    public d4 f35655w;
    public CheckBoxBase f35656x;

    public c2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f35647a = o70Var;
        this.f35648b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        d4 d4Var = this.f35655w;
        if (d4Var != null) {
            d3Var = d4Var.f35999i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        o70 o70Var = this.f35647a;
        j4 j4Var = this.f35648b;
        if (j4Var != null && j4Var.D) {
            int measuredWidth = getMeasuredWidth();
            o70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            e4 e4Var = this.f35655w.f35996c;
            return b.z(20.0f, e4Var.f36393e, dp - e4Var.f36391b);
        }
        o70Var.getClass();
        return org.telegram.messenger.y3.D(20.0f, this.f35655w.f35996c.f36393e, (AndroidUtilities.dp(18) + this.f35655w.f35996c.f36391b) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f5875a;
            if (view instanceof org.telegram.ui.Cells.l9) {
                ((org.telegram.ui.Cells.l9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f35649c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f35647a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f35655w;
        if (d4Var != null && d4Var.f35999i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f35655w.f35999i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var = this.f35649c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f35986s) - dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f5875a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f35652n + boundLeft);
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
        this.f35647a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f35655w;
        if (d4Var != null && d4Var.f35999i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f35655w.f35999i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f35649c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f35986s + dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f5875a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f35652n + boundRight);
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
        d3 d3Var = this.f35649c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f35986s;
            this.f35647a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                View view = fl0Var.f5875a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f35652n;
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
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            fl0Var.f5875a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35649c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35649c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35655w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f35655w.f35999i;
            o70 o70Var = this.f35647a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f35648b;
                if (j4Var != null && j4Var.D) {
                    o70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    e4 e4Var = this.f35655w.f35996c;
                    canvas.translate(b.z(20.0f, e4Var.f36393e, dp - e4Var.f36391b), this.f35651f + this.h);
                } else {
                    o70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    d4 d4Var = this.f35655w;
                    canvas.translate(org.telegram.messenger.y3.D(20.0f, this.f35655w.f35996c.f36393e, (dp2 + d4Var.f35996c.f36391b) - ((int) Math.ceil(d4Var.f35999i.d.getLineWidth(0)))), this.f35651f + this.h);
                }
                this.f35655w.f35999i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f35656x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f35650e - AndroidUtilities.dp(26.0f), this.f35651f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f35656x.a(canvas);
            }
            if (this.f35649c != null) {
                canvas.save();
                canvas.translate(this.f35650e, this.f35651f);
                l4.v(o70Var, canvas, this, 0);
                this.f35649c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f35649c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f35647a, this.f35648b, d3Var));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f5875a;
            int i14 = this.f35652n;
            view.layout(i14, this.f35653r, view.getMeasuredWidth() + i14, this.d.f5875a.getMeasuredHeight() + this.f35653r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f35647a, this.f35648b, motionEvent, this, this.f35649c, this.f35650e, this.f35651f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(d4 d4Var) {
        d4 d4Var2 = this.f35655w;
        j4 j4Var = this.f35648b;
        if (d4Var2 != d4Var) {
            this.f35655w = d4Var;
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                removeView(fl0Var.f5875a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f35655w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.f35654s = I;
                f2.m1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.fl0) x10;
                addView(x10.f5875a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f35655w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.f35654s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
