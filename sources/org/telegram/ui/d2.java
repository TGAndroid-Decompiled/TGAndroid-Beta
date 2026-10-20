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
public final class d2 extends ViewGroup implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f36221a;
    public final j4 f36222b;
    public d3 f36223c;
    public org.telegram.ui.Components.tl0 d;
    public int e;
    public int f36224f;
    public int h;
    public int f36225n;
    public int f36226r;
    public int f36227s;
    public boolean v;
    public c4 f36228w;
    public CheckBoxBase f36229x;

    public d2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f36221a = b70Var;
        this.f36222b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        c4 c4Var = this.f36228w;
        if (c4Var != null) {
            d3Var = c4Var.f35805i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        b70 b70Var = this.f36221a;
        j4 j4Var = this.f36222b;
        if (j4Var != null && j4Var.G) {
            int measuredWidth = getMeasuredWidth();
            b70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            d4 d4Var = this.f36228w.f35803c;
            return org.telegram.messenger.mk.B(20.0f, d4Var.e, dp - d4Var.f36249b);
        }
        b70Var.getClass();
        return org.telegram.messenger.g0.D(20.0f, this.f36228w.f35803c.e, (AndroidUtilities.dp(18) + this.f36228w.f35803c.f36249b) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            View view = tl0Var.f45917a;
            if (view instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f36223c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36221a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f36228w;
        if (c4Var != null && c4Var.f35805i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36228w.f35805i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var = this.f36223c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f36241s) - dp);
        }
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            View view = tl0Var.f45917a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f36225n + boundLeft);
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
        this.f36221a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f36228w;
        if (c4Var != null && c4Var.f35805i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36228w.f35805i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f36223c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f36241s + dp);
        }
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            View view = tl0Var.f45917a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f36225n + boundRight);
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
        d3 d3Var = this.f36223c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f36241s;
            this.f36221a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.tl0 tl0Var = this.d;
            if (tl0Var != null) {
                View view = tl0Var.f45917a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36225n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.mk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            tl0Var.f45917a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f36223c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f36223c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36228w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f36228w.f35805i;
            b70 b70Var = this.f36221a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f36222b;
                if (j4Var != null && j4Var.G) {
                    b70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    d4 d4Var = this.f36228w.f35803c;
                    canvas.translate(org.telegram.messenger.mk.B(20.0f, d4Var.e, dp - d4Var.f36249b), this.f36224f + this.h);
                } else {
                    b70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    c4 c4Var = this.f36228w;
                    canvas.translate(org.telegram.messenger.g0.D(20.0f, this.f36228w.f35803c.e, (dp2 + c4Var.f35803c.f36249b) - ((int) Math.ceil(c4Var.f35805i.d.getLineWidth(0)))), this.f36224f + this.h);
                }
                this.f36228w.f35805i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36229x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f36224f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36229x.a(canvas);
            }
            if (this.f36223c != null) {
                canvas.save();
                canvas.translate(this.e, this.f36224f);
                l4.v(b70Var, canvas, this, 0);
                this.f36223c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f36223c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f36221a, this.f36222b, d3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.tl0 tl0Var = this.d;
        if (tl0Var != null) {
            View view = tl0Var.f45917a;
            int i14 = this.f36225n;
            view.layout(i14, this.f36226r, view.getMeasuredWidth() + i14, this.d.f45917a.getMeasuredHeight() + this.f36226r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f36221a, this.f36222b, motionEvent, this, this.f36223c, this.e, this.f36224f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(c4 c4Var) {
        c4 c4Var2 = this.f36228w;
        j4 j4Var = this.f36222b;
        if (c4Var2 != c4Var) {
            this.f36228w = c4Var;
            org.telegram.ui.Components.tl0 tl0Var = this.d;
            if (tl0Var != null) {
                removeView(tl0Var.f45917a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36228w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.f36227s = I;
                s4.b1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.tl0) x10;
                addView(x10.f45917a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36228w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.f36227s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
