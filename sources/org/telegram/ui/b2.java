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
    public final p70 f32274a;
    public final g4 f32275b;
    public b3 f32276c;
    public org.telegram.ui.Components.gl0 d;
    public int e;
    public int f32277f;
    public int h;
    public int f32278n;
    public int f32279r;
    public int f32280s;
    public boolean v;
    public a4 f32281w;
    public CheckBoxBase f32282x;

    public b2(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f32274a = p70Var;
        this.f32275b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f32281w;
        if (a4Var != null) {
            b3Var = a4Var.f31966i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        p70 p70Var = this.f32274a;
        g4 g4Var = this.f32275b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            p70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f32281w.f31964c;
            return org.telegram.messenger.ok.B(20.0f, b4Var.e, dp - b4Var.f32297b);
        }
        p70Var.getClass();
        return org.telegram.messenger.f0.D(20.0f, this.f32281w.f31964c.e, (AndroidUtilities.dp(18) + this.f32281w.f31964c.f32297b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42946a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f32276c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f32274a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f32281w;
        if (a4Var != null && a4Var.f31966i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f32281w.f31966i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f32276c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f32291s) - dp);
        }
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42946a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f32278n + boundLeft);
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
        this.f32274a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f32281w;
        if (a4Var != null && a4Var.f31966i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f32281w.f31966i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f32276c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f32291s + dp);
        }
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42946a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f32278n + boundRight);
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
        b3 b3Var = this.f32276c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f32291s;
            this.f32274a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.gl0 gl0Var = this.d;
            if (gl0Var != null) {
                View view = gl0Var.f42946a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f32278n;
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
            gl0Var.f42946a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f32276c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f32276c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32281w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f32281w.f31966i;
            p70 p70Var = this.f32274a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f32275b;
                if (g4Var != null && g4Var.G) {
                    p70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f32281w.f31964c;
                    canvas.translate(org.telegram.messenger.ok.B(20.0f, b4Var.e, dp - b4Var.f32297b), this.f32277f + this.h);
                } else {
                    p70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f32281w;
                    canvas.translate(org.telegram.messenger.f0.D(20.0f, this.f32281w.f31964c.e, (dp2 + a4Var.f31964c.f32297b) - ((int) Math.ceil(a4Var.f31966i.d.getLineWidth(0)))), this.f32277f + this.h);
                }
                this.f32281w.f31966i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f32282x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f32277f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f32282x.a(canvas);
            }
            if (this.f32276c != null) {
                canvas.save();
                canvas.translate(this.e, this.f32277f);
                i4.v(p70Var, canvas, this, 0);
                this.f32276c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f32276c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f32274a, this.f32275b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.gl0 gl0Var = this.d;
        if (gl0Var != null) {
            View view = gl0Var.f42946a;
            int i14 = this.f32278n;
            view.layout(i14, this.f32279r, view.getMeasuredWidth() + i14, this.d.f42946a.getMeasuredHeight() + this.f32279r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f32274a, this.f32275b, motionEvent, this, this.f32276c, this.e, this.f32277f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f32281w;
        g4 g4Var = this.f32275b;
        if (a4Var2 != a4Var) {
            this.f32281w = a4Var;
            org.telegram.ui.Components.gl0 gl0Var = this.d;
            if (gl0Var != null) {
                removeView(gl0Var.f42946a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f32281w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f32280s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.gl0) x10;
                addView(x10.f42946a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f32281w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f32280s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
