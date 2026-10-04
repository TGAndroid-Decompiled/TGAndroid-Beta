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
    public final t70 f34958a;
    public final g4 f34959b;
    public b3 f34960c;
    public org.telegram.ui.Components.il0 d;
    public int f34961e;
    public int f34962f;
    public int h;
    public int f34963n;
    public int f34964r;
    public int f34965s;
    public boolean v;
    public a4 f34966w;
    public CheckBoxBase f34967x;

    public b2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f34958a = t70Var;
        this.f34959b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f34966w;
        if (a4Var != null) {
            b3Var = a4Var.f34660i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        t70 t70Var = this.f34958a;
        g4 g4Var = this.f34959b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f34966w.f34657c;
            return org.telegram.messenger.ok.A(20.0f, b4Var.f34990e, dp - b4Var.f34988b);
        }
        t70Var.getClass();
        return org.telegram.messenger.f0.D(20.0f, this.f34966w.f34657c.f34990e, (AndroidUtilities.dp(18) + this.f34966w.f34657c.f34988b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46524a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f34960c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f34958a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34966w;
        if (a4Var != null && a4Var.f34660i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f34966w.f34660i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f34960c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f34979s) - dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46524a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f34963n + boundLeft);
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
        this.f34958a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34966w;
        if (a4Var != null && a4Var.f34660i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f34966w.f34660i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f34960c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f34979s + dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46524a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f34963n + boundRight);
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
        b3 b3Var = this.f34960c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f34979s;
            this.f34958a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                View view = il0Var.f46524a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f34963n;
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
            il0Var.f46524a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f34960c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f34960c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34966w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f34966w.f34660i;
            t70 t70Var = this.f34958a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f34959b;
                if (g4Var != null && g4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f34966w.f34657c;
                    canvas.translate(org.telegram.messenger.ok.A(20.0f, b4Var.f34990e, dp - b4Var.f34988b), this.f34962f + this.h);
                } else {
                    t70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f34966w;
                    canvas.translate(org.telegram.messenger.f0.D(20.0f, this.f34966w.f34657c.f34990e, (dp2 + a4Var.f34657c.f34988b) - ((int) Math.ceil(a4Var.f34660i.d.getLineWidth(0)))), this.f34962f + this.h);
                }
                this.f34966w.f34660i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f34967x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f34961e - AndroidUtilities.dp(26.0f), this.f34962f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f34967x.a(canvas);
            }
            if (this.f34960c != null) {
                canvas.save();
                canvas.translate(this.f34961e, this.f34962f);
                i4.v(t70Var, canvas, this, 0);
                this.f34960c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f34960c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f34958a, this.f34959b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f46524a;
            int i14 = this.f34963n;
            view.layout(i14, this.f34964r, view.getMeasuredWidth() + i14, this.d.f46524a.getMeasuredHeight() + this.f34964r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f34958a, this.f34959b, motionEvent, this, this.f34960c, this.f34961e, this.f34962f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f34966w;
        g4 g4Var = this.f34959b;
        if (a4Var2 != a4Var) {
            this.f34966w = a4Var;
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                removeView(il0Var.f46524a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f34966w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f34965s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.il0) x10;
                addView(x10.f46524a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f34966w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f34965s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
