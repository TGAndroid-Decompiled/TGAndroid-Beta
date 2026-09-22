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
    public final u70 f31650a;
    public final f4 f31651b;
    public a3 f31652c;
    public org.telegram.ui.Components.vk0 d;
    public int e;
    public int f31653f;
    public int h;
    public int f31654n;
    public int f31655r;
    public int f31656s;
    public boolean v;
    public z3 f31657w;
    public CheckBoxBase f31658x;

    public a2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f31650a = u70Var;
        this.f31651b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        z3 z3Var = this.f31657w;
        if (z3Var != null) {
            a3Var = z3Var.f40038i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        u70 u70Var = this.f31650a;
        f4 f4Var = this.f31651b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            u70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            a4 a4Var = this.f31657w.f40036c;
            return org.telegram.messenger.vl.A(20.0f, a4Var.e, dp - a4Var.f31678b);
        }
        u70Var.getClass();
        return org.telegram.messenger.y0.D(20.0f, this.f31657w.f40036c.e, (AndroidUtilities.dp(18) + this.f31657w.f40036c.f31678b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42671a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f31652c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f31650a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f31657w;
        if (z3Var != null && z3Var.f40038i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f31657w.f40038i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f31652c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f31668s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42671a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f31654n + boundLeft);
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
        this.f31650a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f31657w;
        if (z3Var != null && z3Var.f40038i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f31657w.f40038i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f31652c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f31668s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42671a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f31654n + boundRight);
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
        a3 a3Var = this.f31652c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f31668s;
            this.f31650a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f42671a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f31654n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.f42671a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f31652c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f31652c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f31657w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f31657w.f40038i;
            u70 u70Var = this.f31650a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f31651b;
                if (f4Var != null && f4Var.G) {
                    u70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    a4 a4Var = this.f31657w.f40036c;
                    canvas.translate(org.telegram.messenger.vl.A(20.0f, a4Var.e, dp - a4Var.f31678b), this.f31653f + this.h);
                } else {
                    u70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    z3 z3Var = this.f31657w;
                    canvas.translate(org.telegram.messenger.y0.D(20.0f, this.f31657w.f40036c.e, (dp2 + z3Var.f40036c.f31678b) - ((int) Math.ceil(z3Var.f40038i.d.getLineWidth(0)))), this.f31653f + this.h);
                }
                this.f31657w.f40038i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f31658x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f31653f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f31658x.a(canvas);
            }
            if (this.f31652c != null) {
                canvas.save();
                canvas.translate(this.e, this.f31653f);
                h4.v(u70Var, canvas, this, 0);
                this.f31652c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f31652c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f31650a, this.f31651b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f42671a;
            int i14 = this.f31654n;
            view.layout(i14, this.f31655r, view.getMeasuredWidth() + i14, this.d.f42671a.getMeasuredHeight() + this.f31655r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f31650a, this.f31651b, motionEvent, this, this.f31652c, this.e, this.f31653f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f31657w;
        f4 f4Var = this.f31651b;
        if (z3Var2 != z3Var) {
            this.f31657w = z3Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f42671a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f31657w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f31656s = I;
                s4.c1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.f42671a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f31657w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f31656s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
