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
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.q9, d3 {
    public final u70 f31944a;
    public final f4 f31945b;
    public a3 f31946c;
    public org.telegram.ui.Components.fl0 d;
    public int e;
    public int f31947f;
    public int h;
    public int f31948n;
    public int f31949r;
    public int f31950s;
    public boolean v;
    public z3 f31951w;
    public CheckBoxBase f31952x;

    public a2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f31944a = u70Var;
        this.f31945b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        z3 z3Var = this.f31951w;
        if (z3Var != null) {
            a3Var = z3Var.f40085i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        u70 u70Var = this.f31944a;
        f4 f4Var = this.f31945b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            u70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            a4 a4Var = this.f31951w.f40083c;
            return org.telegram.messenger.rk.B(20.0f, a4Var.e, dp - a4Var.f31985b);
        }
        u70Var.getClass();
        return org.telegram.messenger.l0.D(20.0f, this.f31951w.f40083c.e, (AndroidUtilities.dp(18) + this.f31951w.f40083c.f31985b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f42974a;
            if (view instanceof org.telegram.ui.Cells.q9) {
                ((org.telegram.ui.Cells.q9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f31946c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f31944a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f31951w;
        if (z3Var != null && z3Var.f40085i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f31951w.f40085i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f31946c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f31975s) - dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f42974a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f31948n + boundLeft);
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
        this.f31944a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f31951w;
        if (z3Var != null && z3Var.f40085i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f31951w.f40085i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f31946c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f31975s + dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f42974a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f31948n + boundRight);
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
        a3 a3Var = this.f31946c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f31975s;
            this.f31944a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                View view = fl0Var.f42974a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f31948n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            fl0Var.f42974a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f31946c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f31946c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31951w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f31951w.f40085i;
            u70 u70Var = this.f31944a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f31945b;
                if (f4Var != null && f4Var.G) {
                    u70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    a4 a4Var = this.f31951w.f40083c;
                    canvas.translate(org.telegram.messenger.rk.B(20.0f, a4Var.e, dp - a4Var.f31985b), this.f31947f + this.h);
                } else {
                    u70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    z3 z3Var = this.f31951w;
                    canvas.translate(org.telegram.messenger.l0.D(20.0f, this.f31951w.f40083c.e, (dp2 + z3Var.f40083c.f31985b) - ((int) Math.ceil(z3Var.f40085i.d.getLineWidth(0)))), this.f31947f + this.h);
                }
                this.f31951w.f40085i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f31952x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f31947f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f31952x.a(canvas);
            }
            if (this.f31946c != null) {
                canvas.save();
                canvas.translate(this.e, this.f31947f);
                h4.v(u70Var, canvas, this, 0);
                this.f31946c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f31946c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f31944a, this.f31945b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f42974a;
            int i14 = this.f31948n;
            view.layout(i14, this.f31949r, view.getMeasuredWidth() + i14, this.d.f42974a.getMeasuredHeight() + this.f31949r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f31944a, this.f31945b, motionEvent, this, this.f31946c, this.e, this.f31947f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f31951w;
        f4 f4Var = this.f31945b;
        if (z3Var2 != z3Var) {
            this.f31951w = z3Var;
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                removeView(fl0Var.f42974a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f31951w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f31950s = I;
                s4.c1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.fl0) x10;
                addView(x10.f42974a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f31951w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f31950s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
