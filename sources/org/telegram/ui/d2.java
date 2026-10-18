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
    public final d70 f36055a;
    public final j4 f36056b;
    public d3 f36057c;
    public org.telegram.ui.Components.sl0 d;
    public int e;
    public int f36058f;
    public int h;
    public int f36059n;
    public int f36060r;
    public int f36061s;
    public boolean v;
    public c4 f36062w;
    public CheckBoxBase f36063x;

    public d2(Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.f36055a = d70Var;
        this.f36056b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        c4 c4Var = this.f36062w;
        if (c4Var != null) {
            d3Var = c4Var.f35823i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        d70 d70Var = this.f36055a;
        j4 j4Var = this.f36056b;
        if (j4Var != null && j4Var.G) {
            int measuredWidth = getMeasuredWidth();
            d70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            d4 d4Var = this.f36062w.f35821c;
            return org.telegram.messenger.kk.B(20.0f, d4Var.e, dp - d4Var.f36082b);
        }
        d70Var.getClass();
        return org.telegram.messenger.g0.D(20.0f, this.f36062w.f35821c.e, (AndroidUtilities.dp(18) + this.f36062w.f35821c.f36082b) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45958a;
            if (view instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f36057c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36055a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f36062w;
        if (c4Var != null && c4Var.f35823i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36062w.f35823i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var = this.f36057c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f36074s) - dp);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45958a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f36059n + boundLeft);
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
        this.f36055a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f36062w;
        if (c4Var != null && c4Var.f35823i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36062w.f35823i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f36057c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f36074s + dp);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45958a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f36059n + boundRight);
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
        d3 d3Var = this.f36057c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f36074s;
            this.f36055a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (sl0Var != null) {
                View view = sl0Var.f45958a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36059n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            sl0Var.f45958a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f36057c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f36057c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36062w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f36062w.f35823i;
            d70 d70Var = this.f36055a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f36056b;
                if (j4Var != null && j4Var.G) {
                    d70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    d4 d4Var = this.f36062w.f35821c;
                    canvas.translate(org.telegram.messenger.kk.B(20.0f, d4Var.e, dp - d4Var.f36082b), this.f36058f + this.h);
                } else {
                    d70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    c4 c4Var = this.f36062w;
                    canvas.translate(org.telegram.messenger.g0.D(20.0f, this.f36062w.f35821c.e, (dp2 + c4Var.f35821c.f36082b) - ((int) Math.ceil(c4Var.f35823i.d.getLineWidth(0)))), this.f36058f + this.h);
                }
                this.f36062w.f35823i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36063x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f36058f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36063x.a(canvas);
            }
            if (this.f36057c != null) {
                canvas.save();
                canvas.translate(this.e, this.f36058f);
                l4.v(d70Var, canvas, this, 0);
                this.f36057c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f36057c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f36055a, this.f36056b, d3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45958a;
            int i14 = this.f36059n;
            view.layout(i14, this.f36060r, view.getMeasuredWidth() + i14, this.d.f45958a.getMeasuredHeight() + this.f36060r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f36055a, this.f36056b, motionEvent, this, this.f36057c, this.e, this.f36058f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(c4 c4Var) {
        c4 c4Var2 = this.f36062w;
        j4 j4Var = this.f36056b;
        if (c4Var2 != c4Var) {
            this.f36062w = c4Var;
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (sl0Var != null) {
                removeView(sl0Var.f45958a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36062w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.f36061s = I;
                s4.b1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.sl0) x10;
                addView(x10.f45958a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36062w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.f36061s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
