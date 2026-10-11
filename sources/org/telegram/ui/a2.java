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
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f35875a;
    public final f4 f35876b;
    public a3 f35877c;
    public org.telegram.ui.Components.bm0 d;
    public int f35878e;
    public int f35879f;
    public int h;
    public int f35880n;
    public int f35881r;
    public int f35882s;
    public boolean v;
    public z3 f35883w;
    public CheckBoxBase f35884x;

    public a2(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f35875a = t70Var;
        this.f35876b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        z3 z3Var = this.f35883w;
        if (z3Var != null) {
            a3Var = z3Var.f44606i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        t70 t70Var = this.f35875a;
        f4 f4Var = this.f35876b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            a4 a4Var = this.f35883w.f44603c;
            return org.telegram.messenger.ai.B(20.0f, a4Var.f35908e, dp - a4Var.f35906b);
        }
        t70Var.getClass();
        return org.telegram.messenger.q.D(20.0f, this.f35883w.f44603c.f35908e, (AndroidUtilities.dp(18) + this.f35883w.f44603c.f35906b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            View view = bm0Var.f47782a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f35877c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f35875a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f35883w;
        if (z3Var != null && z3Var.f44606i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f35883w.f44606i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f35877c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f35896s) - dp);
        }
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            View view = bm0Var.f47782a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f35880n + boundLeft);
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
        this.f35875a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f35883w;
        if (z3Var != null && z3Var.f44606i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f35883w.f44606i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f35877c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f35896s + dp);
        }
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            View view = bm0Var.f47782a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f35880n + boundRight);
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
        a3 a3Var = this.f35877c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f35896s;
            this.f35875a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.bm0 bm0Var = this.d;
            if (bm0Var != null) {
                View view = bm0Var.f47782a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f35880n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            bm0Var.f47782a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f35877c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f35877c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35883w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f35883w.f44606i;
            t70 t70Var = this.f35875a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f35876b;
                if (f4Var != null && f4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    a4 a4Var = this.f35883w.f44603c;
                    canvas.translate(org.telegram.messenger.ai.B(20.0f, a4Var.f35908e, dp - a4Var.f35906b), this.f35879f + this.h);
                } else {
                    t70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    z3 z3Var = this.f35883w;
                    canvas.translate(org.telegram.messenger.q.D(20.0f, this.f35883w.f44603c.f35908e, (dp2 + z3Var.f44603c.f35906b) - ((int) Math.ceil(z3Var.f44606i.d.getLineWidth(0)))), this.f35879f + this.h);
                }
                this.f35883w.f44606i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f35884x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f35878e - AndroidUtilities.dp(26.0f), this.f35879f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f35884x.a(canvas);
            }
            if (this.f35877c != null) {
                canvas.save();
                canvas.translate(this.f35878e, this.f35879f);
                h4.v(t70Var, canvas, this, 0);
                this.f35877c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f35877c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f35875a, this.f35876b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.bm0 bm0Var = this.d;
        if (bm0Var != null) {
            View view = bm0Var.f47782a;
            int i14 = this.f35880n;
            view.layout(i14, this.f35881r, view.getMeasuredWidth() + i14, this.d.f47782a.getMeasuredHeight() + this.f35881r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f35875a, this.f35876b, motionEvent, this, this.f35877c, this.f35878e, this.f35879f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f35883w;
        f4 f4Var = this.f35876b;
        if (z3Var2 != z3Var) {
            this.f35883w = z3Var;
            org.telegram.ui.Components.bm0 bm0Var = this.d;
            if (bm0Var != null) {
                removeView(bm0Var.f47782a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f35883w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f35882s = I;
                s4.d1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.bm0) x10;
                addView(x10.f47782a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f35883w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f35882s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
