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
public final class d2 extends ViewGroup implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f37379a;
    public final j4 f37380b;
    public e3 f37381c;
    public org.telegram.ui.Components.ik0 d;
    public int f37382e;
    public int f37383f;
    public int h;
    public int f37384n;
    public int f37385r;
    public int f37386s;
    public boolean v;
    public d4 f37387w;
    public CheckBoxBase f37388x;

    public d2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f37379a = a70Var;
        this.f37380b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        e3 e3Var;
        d4 d4Var = this.f37387w;
        if (d4Var != null) {
            e3Var = d4Var.f37400i;
        } else {
            e3Var = null;
        }
        if (e3Var == null) {
            return 0;
        }
        a70 a70Var = this.f37379a;
        j4 j4Var = this.f37380b;
        if (j4Var != null && j4Var.C) {
            int measuredWidth = getMeasuredWidth();
            a70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            e4 e4Var = this.f37387w.f37397c;
            return org.telegram.messenger.ll.A(20.0f, e4Var.f37815e, dp - e4Var.f37813b);
        }
        a70Var.getClass();
        return org.telegram.messenger.l0.D(20.0f, this.f37387w.f37397c.f37815e, (AndroidUtilities.dp(18) + this.f37387w.f37397c.f37813b) - ((int) Math.ceil(e3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            if (view instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        e3 e3Var = this.f37381c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i9;
        int boundLeft;
        this.f37379a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f37387w;
        if (d4Var != null && d4Var.f37400i != null) {
            i9 = Math.min(Integer.MAX_VALUE, (this.f37387w.f37400i.a() + a()) - dp);
        } else {
            i9 = Integer.MAX_VALUE;
        }
        e3 e3Var = this.f37381c;
        if (e3Var != null) {
            i9 = Math.min(i9, (e3Var.a() + e3Var.f37805s) - dp);
        }
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            if ((view instanceof h3) && (boundLeft = ((h3) view).getBoundLeft()) != -1) {
                i9 = Math.min(i9, this.f37384n + boundLeft);
            }
        }
        if (i9 == Integer.MAX_VALUE) {
            return -1;
        }
        return i9;
    }

    @Override
    public int getBoundRight() {
        int i9;
        int boundRight;
        this.f37379a.getClass();
        int dp = AndroidUtilities.dp(18);
        d4 d4Var = this.f37387w;
        if (d4Var != null && d4Var.f37400i != null) {
            i9 = Math.max(Integer.MIN_VALUE, this.f37387w.f37400i.b() + a() + dp);
        } else {
            i9 = Integer.MIN_VALUE;
        }
        e3 e3Var = this.f37381c;
        if (e3Var != null) {
            i9 = Math.max(i9, e3Var.b() + e3Var.f37805s + dp);
        }
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            if ((view instanceof h3) && (boundRight = ((h3) view).getBoundRight()) != -1) {
                i9 = Math.max(i9, this.f37384n + boundRight);
            }
        }
        if (i9 == Integer.MIN_VALUE) {
            return -1;
        }
        return i9;
    }

    @Override
    public int getLastLineBoundRight() {
        int lastLineBoundRight;
        int i9;
        e3 e3Var = this.f37381c;
        if (e3Var != null) {
            lastLineBoundRight = e3Var.c() + e3Var.f37805s;
            this.f37379a.getClass();
            i9 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.ik0 ik0Var = this.d;
            if (ik0Var != null) {
                View view = ik0Var.f5501a;
                if ((view instanceof h3) && (lastLineBoundRight = ((h3) view).getLastLineBoundRight()) != -1) {
                    i9 = this.f37384n;
                }
            }
            return -1;
        }
        return i9 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            ik0Var.f5501a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f37381c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f37381c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37387w != null) {
            int measuredWidth = getMeasuredWidth();
            e3 e3Var = this.f37387w.f37400i;
            a70 a70Var = this.f37379a;
            if (e3Var != null) {
                canvas.save();
                j4 j4Var = this.f37380b;
                if (j4Var != null && j4Var.C) {
                    a70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    e4 e4Var = this.f37387w.f37397c;
                    canvas.translate(org.telegram.messenger.ll.A(20.0f, e4Var.f37815e, dp - e4Var.f37813b), this.f37383f + this.h);
                } else {
                    a70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    d4 d4Var = this.f37387w;
                    canvas.translate(org.telegram.messenger.l0.D(20.0f, this.f37387w.f37397c.f37815e, (dp2 + d4Var.f37397c.f37813b) - ((int) Math.ceil(d4Var.f37400i.d.getLineWidth(0)))), this.f37383f + this.h);
                }
                this.f37387w.f37400i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f37388x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f37382e - AndroidUtilities.dp(26.0f), this.f37383f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f37388x.a(canvas);
            }
            if (this.f37381c != null) {
                canvas.save();
                canvas.translate(this.f37382e, this.f37383f);
                l4.v(a70Var, canvas, this, 0);
                this.f37381c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.f37381c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f37379a, this.f37380b, e3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.Components.ik0 ik0Var = this.d;
        if (ik0Var != null) {
            View view = ik0Var.f5501a;
            int i13 = this.f37384n;
            view.layout(i13, this.f37385r, view.getMeasuredWidth() + i13, this.d.f5501a.getMeasuredHeight() + this.f37385r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f37379a, this.f37380b, motionEvent, this, this.f37381c, this.f37382e, this.f37383f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(d4 d4Var) {
        d4 d4Var2 = this.f37387w;
        j4 j4Var = this.f37380b;
        if (d4Var2 != d4Var) {
            this.f37387w = d4Var;
            org.telegram.ui.Components.ik0 ik0Var = this.d;
            if (ik0Var != null) {
                removeView(ik0Var.f5501a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f37387w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.f37386s = I;
                f2.q1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.ik0) x10;
                addView(x10.f5501a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f37387w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.f37386s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
