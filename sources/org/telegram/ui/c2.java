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
    public final n70 f33070a;
    public final j4 f33071b;
    public d3 f33072c;
    public org.telegram.ui.Components.el0 d;
    public int e;
    public int f33073f;
    public int h;
    public int f33074n;
    public int f33075r;
    public int f33076s;
    public boolean v;
    public d4 f33077w;
    public CheckBoxBase f33078x;

    public c2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f33070a = n70Var;
        this.f33071b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        d4 d4Var = this.f33077w;
        if (d4Var != null) {
            d3Var = d4Var.f33511i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        n70 n70Var = this.f33070a;
        j4 j4Var = this.f33071b;
        if (j4Var != null && j4Var.D) {
            int measuredWidth = getMeasuredWidth();
            n70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            e4 e4Var = this.f33077w.f33509c;
            return b.z(20.0f, e4Var.e, dp - e4Var.f33882b);
        }
        n70Var.getClass();
        return org.telegram.messenger.y3.D(20.0f, this.f33077w.f33509c.e, (AndroidUtilities.dp(18) + this.f33077w.f33509c.f33882b) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5785a;
            if (view instanceof org.telegram.ui.Cells.l9) {
                ((org.telegram.ui.Cells.l9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f33072c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f33070a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f33077w;
        if (d4Var != null && d4Var.f33511i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f33077w.f33511i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var = this.f33072c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f33499s) - dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5785a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f33074n + boundLeft);
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
        this.f33070a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f33077w;
        if (d4Var != null && d4Var.f33511i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f33077w.f33511i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f33072c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f33499s + dp);
        }
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5785a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f33074n + boundRight);
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
        d3 d3Var = this.f33072c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f33499s;
            this.f33070a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                View view = el0Var.f5785a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f33074n;
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
            el0Var.f5785a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f33072c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f33072c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33077w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f33077w.f33511i;
            n70 n70Var = this.f33070a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f33071b;
                if (j4Var != null && j4Var.D) {
                    n70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    e4 e4Var = this.f33077w.f33509c;
                    canvas.translate(b.z(20.0f, e4Var.e, dp - e4Var.f33882b), this.f33073f + this.h);
                } else {
                    n70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    d4 d4Var = this.f33077w;
                    canvas.translate(org.telegram.messenger.y3.D(20.0f, this.f33077w.f33509c.e, (dp2 + d4Var.f33509c.f33882b) - ((int) Math.ceil(d4Var.f33511i.d.getLineWidth(0)))), this.f33073f + this.h);
                }
                this.f33077w.f33511i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f33078x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f33073f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f33078x.a(canvas);
            }
            if (this.f33072c != null) {
                canvas.save();
                canvas.translate(this.e, this.f33073f);
                l4.v(n70Var, canvas, this, 0);
                this.f33072c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f33072c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f33070a, this.f33071b, d3Var));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.el0 el0Var = this.d;
        if (el0Var != null) {
            View view = el0Var.f5785a;
            int i14 = this.f33074n;
            view.layout(i14, this.f33075r, view.getMeasuredWidth() + i14, this.d.f5785a.getMeasuredHeight() + this.f33075r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f33070a, this.f33071b, motionEvent, this, this.f33072c, this.e, this.f33073f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(d4 d4Var) {
        d4 d4Var2 = this.f33077w;
        j4 j4Var = this.f33071b;
        if (d4Var2 != d4Var) {
            this.f33077w = d4Var;
            org.telegram.ui.Components.el0 el0Var = this.d;
            if (el0Var != null) {
                removeView(el0Var.f5785a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f33077w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.f33076s = I;
                f2.l1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.el0) x10;
                addView(x10.f5785a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f33077w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.f33076s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
