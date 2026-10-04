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
    public final t70 f34957a;
    public final g4 f34958b;
    public b3 f34959c;
    public org.telegram.ui.Components.il0 d;
    public int f34960e;
    public int f34961f;
    public int h;
    public int f34962n;
    public int f34963r;
    public int f34964s;
    public boolean v;
    public a4 f34965w;
    public CheckBoxBase f34966x;

    public b2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f34957a = t70Var;
        this.f34958b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f34965w;
        if (a4Var != null) {
            b3Var = a4Var.f34659i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        t70 t70Var = this.f34957a;
        g4 g4Var = this.f34958b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f34965w.f34656c;
            return org.telegram.messenger.ok.A(20.0f, b4Var.f34989e, dp - b4Var.f34987b);
        }
        t70Var.getClass();
        return org.telegram.messenger.f0.D(20.0f, this.f34965w.f34656c.f34989e, (AndroidUtilities.dp(18) + this.f34965w.f34656c.f34987b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46523a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f34959c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f34957a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34965w;
        if (a4Var != null && a4Var.f34659i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f34965w.f34659i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f34959c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f34978s) - dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46523a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f34962n + boundLeft);
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
        this.f34957a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34965w;
        if (a4Var != null && a4Var.f34659i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f34965w.f34659i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f34959c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f34978s + dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46523a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f34962n + boundRight);
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
        b3 b3Var = this.f34959c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f34978s;
            this.f34957a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                View view = il0Var.f46523a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f34962n;
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
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            il0Var.f46523a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f34959c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f34959c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34965w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f34965w.f34659i;
            t70 t70Var = this.f34957a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f34958b;
                if (g4Var != null && g4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f34965w.f34656c;
                    canvas.translate(org.telegram.messenger.ok.A(20.0f, b4Var.f34989e, dp - b4Var.f34987b), this.f34961f + this.h);
                } else {
                    t70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f34965w;
                    canvas.translate(org.telegram.messenger.f0.D(20.0f, this.f34965w.f34656c.f34989e, (dp2 + a4Var.f34656c.f34987b) - ((int) Math.ceil(a4Var.f34659i.d.getLineWidth(0)))), this.f34961f + this.h);
                }
                this.f34965w.f34659i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f34966x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f34960e - AndroidUtilities.dp(26.0f), this.f34961f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f34966x.a(canvas);
            }
            if (this.f34959c != null) {
                canvas.save();
                canvas.translate(this.f34960e, this.f34961f);
                i4.v(t70Var, canvas, this, 0);
                this.f34959c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f34959c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f34957a, this.f34958b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46523a;
            int i14 = this.f34962n;
            view.layout(i14, this.f34963r, view.getMeasuredWidth() + i14, this.d.f46523a.getMeasuredHeight() + this.f34963r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f34957a, this.f34958b, motionEvent, this, this.f34959c, this.f34960e, this.f34961f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f34965w;
        g4 g4Var = this.f34958b;
        if (a4Var2 != a4Var) {
            this.f34965w = a4Var;
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                removeView(il0Var.f46523a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f34965w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f34964s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.il0) x10;
                addView(x10.f46523a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f34965w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f34964s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
