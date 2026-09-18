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
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.p9, d3 {
    public final u70 f31904a;
    public final f4 f31905b;
    public a3 f31906c;
    public org.telegram.ui.Components.gl0 d;
    public int e;
    public int f31907f;
    public int h;
    public int f31908n;
    public int f31909r;
    public int f31910s;
    public boolean v;
    public z3 f31911w;
    public CheckBoxBase f31912x;

    public a2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f31904a = u70Var;
        this.f31905b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        z3 z3Var = this.f31911w;
        if (z3Var != null) {
            a3Var = z3Var.f39961i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        u70 u70Var = this.f31904a;
        f4 f4Var = this.f31905b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            u70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            a4 a4Var = this.f31911w.f39959c;
            return org.telegram.messenger.wh.B(20.0f, a4Var.e, dp - a4Var.f31943b);
        }
        u70Var.getClass();
        return org.telegram.messenger.wh.c(20.0f, this.f31911w.f39959c.e, (AndroidUtilities.dp(18) + this.f31911w.f39959c.f31943b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42929a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f31906c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f31904a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f31911w;
        if (z3Var != null && z3Var.f39961i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f31911w.f39961i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f31906c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f31935s) - dp);
        }
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42929a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f31908n + boundLeft);
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
        this.f31904a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f31911w;
        if (z3Var != null && z3Var.f39961i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f31911w.f39961i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f31906c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f31935s + dp);
        }
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42929a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f31908n + boundRight);
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
        a3 a3Var = this.f31906c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f31935s;
            this.f31904a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.gl0 gl0Var = this.d;
            if (gl0Var != null) {
                View view = gl0Var.f42929a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f31908n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wh.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            gl0Var.f42929a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f31906c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f31906c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31911w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f31911w.f39961i;
            u70 u70Var = this.f31904a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f31905b;
                if (f4Var != null && f4Var.G) {
                    u70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    a4 a4Var = this.f31911w.f39959c;
                    canvas.translate(org.telegram.messenger.wh.B(20.0f, a4Var.e, dp - a4Var.f31943b), this.f31907f + this.h);
                } else {
                    u70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    z3 z3Var = this.f31911w;
                    canvas.translate(org.telegram.messenger.wh.c(20.0f, this.f31911w.f39959c.e, (dp2 + z3Var.f39959c.f31943b) - ((int) Math.ceil(z3Var.f39961i.d.getLineWidth(0)))), this.f31907f + this.h);
                }
                this.f31911w.f39961i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f31912x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f31907f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f31912x.a(canvas);
            }
            if (this.f31906c != null) {
                canvas.save();
                canvas.translate(this.e, this.f31907f);
                h4.v(u70Var, canvas, this, 0);
                this.f31906c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f31906c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f31904a, this.f31905b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42929a;
            int i14 = this.f31908n;
            view.layout(i14, this.f31909r, view.getMeasuredWidth() + i14, this.d.f42929a.getMeasuredHeight() + this.f31909r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f31904a, this.f31905b, motionEvent, this, this.f31906c, this.e, this.f31907f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f31911w;
        f4 f4Var = this.f31905b;
        if (z3Var2 != z3Var) {
            this.f31911w = z3Var;
            org.telegram.ui.Components.gl0 gl0Var = this.d;
            if (gl0Var != null) {
                removeView(gl0Var.f42929a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f31911w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f31910s = I;
                s4.c1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.gl0) x10;
                addView(x10.f42929a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f31911w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f31910s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
