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
    public final h70 f37613a;
    public final h4 f37614b;
    public a3 f37615c;
    public org.telegram.ui.Components.vl0 d;
    public int e;
    public int f37616f;
    public int h;
    public int f37617n;
    public int f37618r;
    public int f37619s;
    public boolean v;
    public a4 f37620w;
    public CheckBoxBase f37621x;

    public a2(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f37613a = h70Var;
        this.f37614b = h4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        a4 a4Var = this.f37620w;
        if (a4Var != null) {
            a3Var = a4Var.f37641i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        h70 h70Var = this.f37613a;
        h4 h4Var = this.f37614b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth();
            h70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f37620w.f37639c;
            return org.telegram.messenger.vh.C(20.0f, b4Var.e, dp - b4Var.f37969b);
        }
        h70Var.getClass();
        return org.telegram.messenger.vh.b(20.0f, this.f37620w.f37639c.e, (AndroidUtilities.dp(18) + this.f37620w.f37639c.f37969b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f47735a;
            if (view instanceof org.telegram.ui.Cells.r9) {
                ((org.telegram.ui.Cells.r9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f37615c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f37613a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f37620w;
        if (a4Var != null && a4Var.f37641i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f37620w.f37641i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f37615c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f37631s) - dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f47735a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f37617n + boundLeft);
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
        this.f37613a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f37620w;
        if (a4Var != null && a4Var.f37641i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f37620w.f37641i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f37615c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f37631s + dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f47735a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f37617n + boundRight);
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
        a3 a3Var = this.f37615c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f37631s;
            this.f37613a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                View view = vl0Var.f47735a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f37617n;
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
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            vl0Var.f47735a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37615c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f37615c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37620w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f37620w.f37641i;
            h70 h70Var = this.f37613a;
            if (a3Var != null) {
                canvas.save();
                h4 h4Var = this.f37614b;
                if (h4Var != null && h4Var.G) {
                    h70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f37620w.f37639c;
                    canvas.translate(org.telegram.messenger.vh.C(20.0f, b4Var.e, dp - b4Var.f37969b), this.f37616f + this.h);
                } else {
                    h70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f37620w;
                    canvas.translate(org.telegram.messenger.vh.b(20.0f, this.f37620w.f37639c.e, (dp2 + a4Var.f37639c.f37969b) - ((int) Math.ceil(a4Var.f37641i.d.getLineWidth(0)))), this.f37616f + this.h);
                }
                this.f37620w.f37641i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f37621x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f37616f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f37621x.a(canvas);
            }
            if (this.f37615c != null) {
                canvas.save();
                canvas.translate(this.e, this.f37616f);
                j4.v(h70Var, canvas, this, 0);
                this.f37615c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f37615c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f37613a, this.f37614b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f47735a;
            int i14 = this.f37617n;
            view.layout(i14, this.f37618r, view.getMeasuredWidth() + i14, this.d.f47735a.getMeasuredHeight() + this.f37618r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.f37613a, this.f37614b, motionEvent, this, this.f37615c, this.e, this.f37616f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f37620w;
        h4 h4Var = this.f37614b;
        if (a4Var2 != a4Var) {
            this.f37620w = a4Var;
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                removeView(vl0Var.f47735a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f37620w.d;
            if (pageBlock != null && h4Var != null) {
                int I = h4.I(pageBlock);
                this.f37619s = I;
                s4.e1 x9 = h4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vl0) x9;
                addView(x9.f47735a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f37620w.d;
        if (pageBlock2 != null && h4Var != null) {
            h4Var.H(this.f37619s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
