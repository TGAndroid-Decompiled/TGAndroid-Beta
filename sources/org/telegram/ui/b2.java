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
public final class b2 extends ViewGroup implements org.telegram.ui.Cells.q9, e3 {
    public final r70 f31930a;
    public final g4 f31931b;
    public b3 f31932c;
    public org.telegram.ui.Components.wk0 d;
    public int e;
    public int f31933f;
    public int h;
    public int f31934n;
    public int f31935r;
    public int f31936s;
    public boolean v;
    public a4 f31937w;
    public CheckBoxBase f31938x;

    public b2(Context context, r70 r70Var, g4 g4Var) {
        super(context);
        this.f31930a = r70Var;
        this.f31931b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f31937w;
        if (a4Var != null) {
            b3Var = a4Var.f31655i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        r70 r70Var = this.f31930a;
        g4 g4Var = this.f31931b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            r70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f31937w.f31653c;
            return org.telegram.messenger.ul.A(20.0f, b4Var.e, dp - b4Var.f31957b);
        }
        r70Var.getClass();
        return org.telegram.messenger.z0.D(20.0f, this.f31937w.f31653c.e, (AndroidUtilities.dp(18) + this.f31937w.f31653c.f31957b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42627a;
            if (view instanceof org.telegram.ui.Cells.q9) {
                ((org.telegram.ui.Cells.q9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f31932c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f31930a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f31937w;
        if (a4Var != null && a4Var.f31655i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f31937w.f31655i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f31932c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f31947s) - dp);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42627a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f31934n + boundLeft);
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
        this.f31930a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f31937w;
        if (a4Var != null && a4Var.f31655i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f31937w.f31655i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f31932c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f31947s + dp);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42627a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f31934n + boundRight);
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
        b3 b3Var = this.f31932c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f31947s;
            this.f31930a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wk0 wk0Var = this.d;
            if (wk0Var != null) {
                View view = wk0Var.f42627a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f31934n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ul.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            wk0Var.f42627a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f31932c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f31932c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31937w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f31937w.f31655i;
            r70 r70Var = this.f31930a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f31931b;
                if (g4Var != null && g4Var.G) {
                    r70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f31937w.f31653c;
                    canvas.translate(org.telegram.messenger.ul.A(20.0f, b4Var.e, dp - b4Var.f31957b), this.f31933f + this.h);
                } else {
                    r70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f31937w;
                    canvas.translate(org.telegram.messenger.z0.D(20.0f, this.f31937w.f31653c.e, (dp2 + a4Var.f31653c.f31957b) - ((int) Math.ceil(a4Var.f31655i.d.getLineWidth(0)))), this.f31933f + this.h);
                }
                this.f31937w.f31655i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f31938x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f31933f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f31938x.a(canvas);
            }
            if (this.f31932c != null) {
                canvas.save();
                canvas.translate(this.e, this.f31933f);
                i4.v(r70Var, canvas, this, 0);
                this.f31932c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f31932c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f31930a, this.f31931b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42627a;
            int i14 = this.f31934n;
            view.layout(i14, this.f31935r, view.getMeasuredWidth() + i14, this.d.f42627a.getMeasuredHeight() + this.f31935r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f31930a, this.f31931b, motionEvent, this, this.f31932c, this.e, this.f31933f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f31937w;
        g4 g4Var = this.f31931b;
        if (a4Var2 != a4Var) {
            this.f31937w = a4Var;
            org.telegram.ui.Components.wk0 wk0Var = this.d;
            if (wk0Var != null) {
                removeView(wk0Var.f42627a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f31937w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f31936s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wk0) x10;
                addView(x10.f42627a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f31937w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f31936s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
