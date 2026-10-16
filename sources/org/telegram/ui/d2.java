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
public final class d2 extends ViewGroup implements org.telegram.ui.Cells.n9, g3 {
    public final z70 f34840a;
    public final i4 f34841b;
    public d3 f34842c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public int f34843f;
    public int h;
    public int f34844n;
    public int f34845r;
    public int f34846s;
    public boolean v;
    public c4 f34847w;
    public CheckBoxBase f34848x;

    public d2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f34840a = z70Var;
        this.f34841b = i4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        c4 c4Var = this.f34847w;
        if (c4Var != null) {
            d3Var = c4Var.f34450i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        z70 z70Var = this.f34840a;
        i4 i4Var = this.f34841b;
        if (i4Var != null && i4Var.G) {
            int measuredWidth = getMeasuredWidth();
            z70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            d4 d4Var = this.f34847w.f34448c;
            return org.telegram.messenger.sk.B(20.0f, d4Var.e, dp - d4Var.f34870b);
        }
        z70Var.getClass();
        return org.telegram.messenger.g0.D(20.0f, this.f34847w.f34448c.e, (AndroidUtilities.dp(18) + this.f34847w.f34448c.f34870b) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f34842c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f34840a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f34847w;
        if (c4Var != null && c4Var.f34450i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f34847w.f34450i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var = this.f34842c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f34861s) - dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f34844n + boundLeft);
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
        this.f34840a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f34847w;
        if (c4Var != null && c4Var.f34450i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f34847w.f34450i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f34842c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f34861s + dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f34844n + boundRight);
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
        d3 d3Var = this.f34842c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f34861s;
            this.f34840a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                View view = wl0Var.f44838a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f34844n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            wl0Var.f44838a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f34842c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f34842c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34847w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f34847w.f34450i;
            z70 z70Var = this.f34840a;
            if (d3Var != null) {
                canvas.save();
                i4 i4Var = this.f34841b;
                if (i4Var != null && i4Var.G) {
                    z70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    d4 d4Var = this.f34847w.f34448c;
                    canvas.translate(org.telegram.messenger.sk.B(20.0f, d4Var.e, dp - d4Var.f34870b), this.f34843f + this.h);
                } else {
                    z70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    c4 c4Var = this.f34847w;
                    canvas.translate(org.telegram.messenger.g0.D(20.0f, this.f34847w.f34448c.e, (dp2 + c4Var.f34448c.f34870b) - ((int) Math.ceil(c4Var.f34450i.d.getLineWidth(0)))), this.f34843f + this.h);
                }
                this.f34847w.f34450i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f34848x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f34843f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f34848x.a(canvas);
            }
            if (this.f34842c != null) {
                canvas.save();
                canvas.translate(this.e, this.f34843f);
                k4.v(z70Var, canvas, this, 0);
                this.f34842c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f34842c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f34840a, this.f34841b, d3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f44838a;
            int i14 = this.f34844n;
            view.layout(i14, this.f34845r, view.getMeasuredWidth() + i14, this.d.f44838a.getMeasuredHeight() + this.f34845r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (k4.l(this.f34840a, this.f34841b, motionEvent, this, this.f34842c, this.e, this.f34843f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(c4 c4Var) {
        c4 c4Var2 = this.f34847w;
        i4 i4Var = this.f34841b;
        if (c4Var2 != c4Var) {
            this.f34847w = c4Var;
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                removeView(wl0Var.f44838a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f34847w.d;
            if (pageBlock != null && i4Var != null) {
                int I = i4.I(pageBlock);
                this.f34846s = I;
                s4.b1 x10 = i4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wl0) x10;
                addView(x10.f44838a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f34847w.d;
        if (pageBlock2 != null && i4Var != null) {
            i4Var.H(this.f34846s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
