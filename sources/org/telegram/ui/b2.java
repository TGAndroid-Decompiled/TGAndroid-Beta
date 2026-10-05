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
    public final t70 f35014a;
    public final g4 f35015b;
    public b3 f35016c;
    public org.telegram.ui.Components.il0 d;
    public int f35017e;
    public int f35018f;
    public int h;
    public int f35019n;
    public int f35020r;
    public int f35021s;
    public boolean v;
    public a4 f35022w;
    public CheckBoxBase f35023x;

    public b2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f35014a = t70Var;
        this.f35015b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f35022w;
        if (a4Var != null) {
            b3Var = a4Var.f34676i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        t70 t70Var = this.f35014a;
        g4 g4Var = this.f35015b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f35022w.f34673c;
            return org.telegram.messenger.bi.A(20.0f, b4Var.f35046e, dp - b4Var.f35044b);
        }
        t70Var.getClass();
        return org.telegram.messenger.q.D(20.0f, this.f35022w.f34673c.f35046e, (AndroidUtilities.dp(18) + this.f35022w.f34673c.f35044b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46538a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f35016c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f35014a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f35022w;
        if (a4Var != null && a4Var.f34676i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f35022w.f34676i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f35016c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f35035s) - dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46538a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f35019n + boundLeft);
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
        this.f35014a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f35022w;
        if (a4Var != null && a4Var.f34676i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f35022w.f34676i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f35016c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f35035s + dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46538a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f35019n + boundRight);
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
        b3 b3Var = this.f35016c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f35035s;
            this.f35014a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                View view = il0Var.f46538a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f35019n;
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
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            il0Var.f46538a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f35016c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f35016c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35022w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f35022w.f34676i;
            t70 t70Var = this.f35014a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f35015b;
                if (g4Var != null && g4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f35022w.f34673c;
                    canvas.translate(org.telegram.messenger.bi.A(20.0f, b4Var.f35046e, dp - b4Var.f35044b), this.f35018f + this.h);
                } else {
                    t70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f35022w;
                    canvas.translate(org.telegram.messenger.q.D(20.0f, this.f35022w.f34673c.f35046e, (dp2 + a4Var.f34673c.f35044b) - ((int) Math.ceil(a4Var.f34676i.d.getLineWidth(0)))), this.f35018f + this.h);
                }
                this.f35022w.f34676i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f35023x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f35017e - AndroidUtilities.dp(26.0f), this.f35018f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f35023x.a(canvas);
            }
            if (this.f35016c != null) {
                canvas.save();
                canvas.translate(this.f35017e, this.f35018f);
                i4.v(t70Var, canvas, this, 0);
                this.f35016c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f35016c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f35014a, this.f35015b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46538a;
            int i14 = this.f35019n;
            view.layout(i14, this.f35020r, view.getMeasuredWidth() + i14, this.d.f46538a.getMeasuredHeight() + this.f35020r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f35014a, this.f35015b, motionEvent, this, this.f35016c, this.f35017e, this.f35018f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f35022w;
        g4 g4Var = this.f35015b;
        if (a4Var2 != a4Var) {
            this.f35022w = a4Var;
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                removeView(il0Var.f46538a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f35022w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f35021s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.il0) x10;
                addView(x10.f46538a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f35022w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f35021s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
