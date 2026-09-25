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
public final class b2 extends ViewGroup implements org.telegram.ui.Cells.p9, e3 {
    public final p70 f32288a;
    public final g4 f32289b;
    public b3 f32290c;
    public org.telegram.ui.Components.gl0 d;
    public int e;
    public int f32291f;
    public int h;
    public int f32292n;
    public int f32293r;
    public int f32294s;
    public boolean v;
    public a4 f32295w;
    public CheckBoxBase f32296x;

    public b2(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f32288a = p70Var;
        this.f32289b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f32295w;
        if (a4Var != null) {
            b3Var = a4Var.f31981i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        p70 p70Var = this.f32288a;
        g4 g4Var = this.f32289b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            p70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f32295w.f31979c;
            return org.telegram.messenger.ok.B(20.0f, b4Var.e, dp - b4Var.f32311b);
        }
        p70Var.getClass();
        return org.telegram.messenger.f0.D(20.0f, this.f32295w.f31979c.e, (AndroidUtilities.dp(18) + this.f32295w.f31979c.f32311b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42961a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f32290c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f32288a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f32295w;
        if (a4Var != null && a4Var.f31981i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f32295w.f31981i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f32290c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f32305s) - dp);
        }
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42961a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f32292n + boundLeft);
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
        this.f32288a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f32295w;
        if (a4Var != null && a4Var.f31981i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f32295w.f31981i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f32290c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f32305s + dp);
        }
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42961a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f32292n + boundRight);
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
        b3 b3Var = this.f32290c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f32305s;
            this.f32288a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.gl0 gl0Var = this.d;
            if (gl0Var != null) {
                View view = gl0Var.f42961a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f32292n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            gl0Var.f42961a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f32290c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f32290c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32295w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f32295w.f31981i;
            p70 p70Var = this.f32288a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f32289b;
                if (g4Var != null && g4Var.G) {
                    p70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f32295w.f31979c;
                    canvas.translate(org.telegram.messenger.ok.B(20.0f, b4Var.e, dp - b4Var.f32311b), this.f32291f + this.h);
                } else {
                    p70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f32295w;
                    canvas.translate(org.telegram.messenger.f0.D(20.0f, this.f32295w.f31979c.e, (dp2 + a4Var.f31979c.f32311b) - ((int) Math.ceil(a4Var.f31981i.d.getLineWidth(0)))), this.f32291f + this.h);
                }
                this.f32295w.f31981i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f32296x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f32291f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f32296x.a(canvas);
            }
            if (this.f32290c != null) {
                canvas.save();
                canvas.translate(this.e, this.f32291f);
                i4.v(p70Var, canvas, this, 0);
                this.f32290c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f32290c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f32288a, this.f32289b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42961a;
            int i14 = this.f32292n;
            view.layout(i14, this.f32293r, view.getMeasuredWidth() + i14, this.d.f42961a.getMeasuredHeight() + this.f32293r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f32288a, this.f32289b, motionEvent, this, this.f32290c, this.e, this.f32291f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f32295w;
        g4 g4Var = this.f32289b;
        if (a4Var2 != a4Var) {
            this.f32295w = a4Var;
            org.telegram.ui.Components.gl0 gl0Var = this.d;
            if (gl0Var != null) {
                removeView(gl0Var.f42961a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f32295w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f32294s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.gl0) x10;
                addView(x10.f42961a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f32295w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f32294s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
