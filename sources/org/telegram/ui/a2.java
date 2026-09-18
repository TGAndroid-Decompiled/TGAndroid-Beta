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
    public final w70 f31678a;
    public final f4 f31679b;
    public a3 f31680c;
    public org.telegram.ui.Components.wk0 d;
    public int e;
    public int f31681f;
    public int h;
    public int f31682n;
    public int f31683r;
    public int f31684s;
    public boolean v;
    public z3 f31685w;
    public CheckBoxBase f31686x;

    public a2(Context context, w70 w70Var, f4 f4Var) {
        super(context);
        this.f31678a = w70Var;
        this.f31679b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        z3 z3Var = this.f31685w;
        if (z3Var != null) {
            a3Var = z3Var.f40116i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        w70 w70Var = this.f31678a;
        f4 f4Var = this.f31679b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            w70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            a4 a4Var = this.f31685w.f40114c;
            return org.telegram.messenger.wl.A(20.0f, a4Var.e, dp - a4Var.f31716b);
        }
        w70Var.getClass();
        return org.telegram.messenger.w1.D(20.0f, this.f31685w.f40114c.e, (AndroidUtilities.dp(18) + this.f31685w.f40114c.f31716b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42702a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f31680c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f31678a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f31685w;
        if (z3Var != null && z3Var.f40116i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f31685w.f40116i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f31680c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f31698s) - dp);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42702a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f31682n + boundLeft);
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
        this.f31678a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f31685w;
        if (z3Var != null && z3Var.f40116i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f31685w.f40116i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f31680c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f31698s + dp);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42702a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f31682n + boundRight);
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
        a3 a3Var = this.f31680c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f31698s;
            this.f31678a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wk0 wk0Var = this.d;
            if (wk0Var != null) {
                View view = wk0Var.f42702a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f31682n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            wk0Var.f42702a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f31680c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f31680c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31685w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f31685w.f40116i;
            w70 w70Var = this.f31678a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f31679b;
                if (f4Var != null && f4Var.G) {
                    w70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    a4 a4Var = this.f31685w.f40114c;
                    canvas.translate(org.telegram.messenger.wl.A(20.0f, a4Var.e, dp - a4Var.f31716b), this.f31681f + this.h);
                } else {
                    w70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    z3 z3Var = this.f31685w;
                    canvas.translate(org.telegram.messenger.w1.D(20.0f, this.f31685w.f40114c.e, (dp2 + z3Var.f40114c.f31716b) - ((int) Math.ceil(z3Var.f40116i.d.getLineWidth(0)))), this.f31681f + this.h);
                }
                this.f31685w.f40116i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f31686x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f31681f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f31686x.a(canvas);
            }
            if (this.f31680c != null) {
                canvas.save();
                canvas.translate(this.e, this.f31681f);
                h4.v(w70Var, canvas, this, 0);
                this.f31680c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f31680c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f31678a, this.f31679b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        if (wk0Var != null) {
            View view = wk0Var.f42702a;
            int i14 = this.f31682n;
            view.layout(i14, this.f31683r, view.getMeasuredWidth() + i14, this.d.f42702a.getMeasuredHeight() + this.f31683r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f31678a, this.f31679b, motionEvent, this, this.f31680c, this.e, this.f31681f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f31685w;
        f4 f4Var = this.f31679b;
        if (z3Var2 != z3Var) {
            this.f31685w = z3Var;
            org.telegram.ui.Components.wk0 wk0Var = this.d;
            if (wk0Var != null) {
                removeView(wk0Var.f42702a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f31685w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f31684s = I;
                s4.c1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wk0) x10;
                addView(x10.f42702a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f31685w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f31684s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
