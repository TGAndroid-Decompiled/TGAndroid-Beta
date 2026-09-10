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
public final class c2 extends ViewGroup implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f31488a;
    public final h4 f31489b;
    public c3 f31490c;
    public org.telegram.ui.Components.fl0 d;
    public int e;
    public int f31491f;
    public int h;
    public int f31492n;
    public int f31493r;
    public int f31494s;
    public boolean v;
    public b4 f31495w;
    public CheckBoxBase f31496x;

    public c2(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f31488a = t70Var;
        this.f31489b = h4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c3 c3Var;
        b4 b4Var = this.f31495w;
        if (b4Var != null) {
            c3Var = b4Var.f31154i;
        } else {
            c3Var = null;
        }
        if (c3Var == null) {
            return 0;
        }
        t70 t70Var = this.f31488a;
        h4 h4Var = this.f31489b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            c4 c4Var = this.f31495w.f31152c;
            return org.telegram.messenger.em.A(20.0f, c4Var.e, dp - c4Var.f31526b);
        }
        t70Var.getClass();
        return org.telegram.messenger.a2.D(20.0f, this.f31495w.f31152c.e, (AndroidUtilities.dp(18) + this.f31495w.f31152c.f31526b) - ((int) Math.ceil(c3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f41610a;
            if (view instanceof org.telegram.ui.Cells.r9) {
                ((org.telegram.ui.Cells.r9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.f31490c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f31488a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f31495w;
        if (b4Var != null && b4Var.f31154i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f31495w.f31154i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c3 c3Var = this.f31490c;
        if (c3Var != null) {
            i10 = Math.min(i10, (c3Var.a() + c3Var.f31515s) - dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f41610a;
            if ((view instanceof f3) && (boundLeft = ((f3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f31492n + boundLeft);
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
        this.f31488a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f31495w;
        if (b4Var != null && b4Var.f31154i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f31495w.f31154i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var = this.f31490c;
        if (c3Var != null) {
            i10 = Math.max(i10, c3Var.b() + c3Var.f31515s + dp);
        }
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f41610a;
            if ((view instanceof f3) && (boundRight = ((f3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f31492n + boundRight);
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
        c3 c3Var = this.f31490c;
        if (c3Var != null) {
            lastLineBoundRight = c3Var.c() + c3Var.f31515s;
            this.f31488a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                View view = fl0Var.f41610a;
                if ((view instanceof f3) && (lastLineBoundRight = ((f3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f31492n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            fl0Var.f41610a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f31490c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f31490c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31495w != null) {
            int measuredWidth = getMeasuredWidth();
            c3 c3Var = this.f31495w.f31154i;
            t70 t70Var = this.f31488a;
            if (c3Var != null) {
                canvas.save();
                h4 h4Var = this.f31489b;
                if (h4Var != null && h4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    c4 c4Var = this.f31495w.f31152c;
                    canvas.translate(org.telegram.messenger.em.A(20.0f, c4Var.e, dp - c4Var.f31526b), this.f31491f + this.h);
                } else {
                    t70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    b4 b4Var = this.f31495w;
                    canvas.translate(org.telegram.messenger.a2.D(20.0f, this.f31495w.f31152c.e, (dp2 + b4Var.f31152c.f31526b) - ((int) Math.ceil(b4Var.f31154i.d.getLineWidth(0)))), this.f31491f + this.h);
                }
                this.f31495w.f31154i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f31496x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f31491f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f31496x.a(canvas);
            }
            if (this.f31490c != null) {
                canvas.save();
                canvas.translate(this.e, this.f31491f);
                j4.v(t70Var, canvas, this, 0);
                this.f31490c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f31490c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f31488a, this.f31489b, c3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.fl0 fl0Var = this.d;
        if (fl0Var != null) {
            View view = fl0Var.f41610a;
            int i14 = this.f31492n;
            view.layout(i14, this.f31493r, view.getMeasuredWidth() + i14, this.d.f41610a.getMeasuredHeight() + this.f31493r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.f31488a, this.f31489b, motionEvent, this, this.f31490c, this.e, this.f31491f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.f31495w;
        h4 h4Var = this.f31489b;
        if (b4Var2 != b4Var) {
            this.f31495w = b4Var;
            org.telegram.ui.Components.fl0 fl0Var = this.d;
            if (fl0Var != null) {
                removeView(fl0Var.f41610a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f31495w.d;
            if (pageBlock != null && h4Var != null) {
                int I = h4.I(pageBlock);
                this.f31494s = I;
                s4.c1 x10 = h4Var.x(this, I);
                this.d = (org.telegram.ui.Components.fl0) x10;
                addView(x10.f41610a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f31495w.d;
        if (pageBlock2 != null && h4Var != null) {
            h4Var.H(this.f31494s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
