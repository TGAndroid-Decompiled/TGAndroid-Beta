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
public final class b2 extends ViewGroup implements org.telegram.ui.Cells.n9, e3 {
    public final t70 f36094a;
    public final g4 f36095b;
    public b3 f36096c;
    public org.telegram.ui.Components.am0 d;
    public int f36097e;
    public int f36098f;
    public int h;
    public int f36099n;
    public int f36100r;
    public int f36101s;
    public boolean v;
    public a4 f36102w;
    public CheckBoxBase f36103x;

    public b2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f36094a = t70Var;
        this.f36095b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f36102w;
        if (a4Var != null) {
            b3Var = a4Var.f35826i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        t70 t70Var = this.f36094a;
        g4 g4Var = this.f36095b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f36102w.f35823c;
            return org.telegram.messenger.bi.B(20.0f, b4Var.f36125e, dp - b4Var.f36123b);
        }
        t70Var.getClass();
        return org.telegram.messenger.q.D(20.0f, this.f36102w.f35823c.f36125e, (AndroidUtilities.dp(18) + this.f36102w.f35823c.f36123b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            View view = am0Var.f47656a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f36096c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36094a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f36102w;
        if (a4Var != null && a4Var.f35826i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36102w.f35826i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f36096c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f36115s) - dp);
        }
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            View view = am0Var.f47656a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f36099n + boundLeft);
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
        this.f36094a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f36102w;
        if (a4Var != null && a4Var.f35826i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36102w.f35826i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f36096c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f36115s + dp);
        }
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            View view = am0Var.f47656a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f36099n + boundRight);
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
        b3 b3Var = this.f36096c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f36115s;
            this.f36094a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.am0 am0Var = this.d;
            if (am0Var != null) {
                View view = am0Var.f47656a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36099n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            am0Var.f47656a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f36096c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f36096c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36102w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f36102w.f35826i;
            t70 t70Var = this.f36094a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f36095b;
                if (g4Var != null && g4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f36102w.f35823c;
                    canvas.translate(org.telegram.messenger.bi.B(20.0f, b4Var.f36125e, dp - b4Var.f36123b), this.f36098f + this.h);
                } else {
                    t70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f36102w;
                    canvas.translate(org.telegram.messenger.q.D(20.0f, this.f36102w.f35823c.f36125e, (dp2 + a4Var.f35823c.f36123b) - ((int) Math.ceil(a4Var.f35826i.d.getLineWidth(0)))), this.f36098f + this.h);
                }
                this.f36102w.f35826i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36103x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f36097e - AndroidUtilities.dp(26.0f), this.f36098f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36103x.a(canvas);
            }
            if (this.f36096c != null) {
                canvas.save();
                canvas.translate(this.f36097e, this.f36098f);
                i4.v(t70Var, canvas, this, 0);
                this.f36096c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f36096c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f36094a, this.f36095b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.am0 am0Var = this.d;
        if (am0Var != null) {
            View view = am0Var.f47656a;
            int i14 = this.f36099n;
            view.layout(i14, this.f36100r, view.getMeasuredWidth() + i14, this.d.f47656a.getMeasuredHeight() + this.f36100r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f36094a, this.f36095b, motionEvent, this, this.f36096c, this.f36097e, this.f36098f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f36102w;
        g4 g4Var = this.f36095b;
        if (a4Var2 != a4Var) {
            this.f36102w = a4Var;
            org.telegram.ui.Components.am0 am0Var = this.d;
            if (am0Var != null) {
                removeView(am0Var.f47656a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36102w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f36101s = I;
                s4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.am0) x10;
                addView(x10.f47656a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36102w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f36101s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
