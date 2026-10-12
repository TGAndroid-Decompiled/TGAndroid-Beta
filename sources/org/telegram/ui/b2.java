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
    public final w70 f36026a;
    public final g4 f36027b;
    public b3 f36028c;
    public org.telegram.ui.Components.gm0 d;
    public int f36029e;
    public int f36030f;
    public int h;
    public int f36031n;
    public int f36032r;
    public int f36033s;
    public boolean v;
    public a4 f36034w;
    public CheckBoxBase f36035x;

    public b2(Context context, w70 w70Var, g4 g4Var) {
        super(context);
        this.f36026a = w70Var;
        this.f36027b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f36034w;
        if (a4Var != null) {
            b3Var = a4Var.f35697i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        w70 w70Var = this.f36026a;
        g4 g4Var = this.f36027b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            w70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f36034w.f35694c;
            return org.telegram.messenger.am.B(20.0f, b4Var.f36067e, dp - b4Var.f36065b);
        }
        w70Var.getClass();
        return org.telegram.messenger.v0.D(20.0f, this.f36034w.f35694c.f36067e, (AndroidUtilities.dp(18) + this.f36034w.f35694c.f36065b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47897a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f36028c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36026a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f36034w;
        if (a4Var != null && a4Var.f35697i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36034w.f35697i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f36028c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f36046s) - dp);
        }
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47897a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f36031n + boundLeft);
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
        this.f36026a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f36034w;
        if (a4Var != null && a4Var.f35697i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36034w.f35697i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f36028c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f36046s + dp);
        }
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47897a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f36031n + boundRight);
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
        b3 b3Var = this.f36028c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f36046s;
            this.f36026a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.gm0 gm0Var = this.d;
            if (gm0Var != null) {
                View view = gm0Var.f47897a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36031n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.am.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            gm0Var.f47897a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f36028c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f36028c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36034w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f36034w.f35697i;
            w70 w70Var = this.f36026a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f36027b;
                if (g4Var != null && g4Var.G) {
                    w70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f36034w.f35694c;
                    canvas.translate(org.telegram.messenger.am.B(20.0f, b4Var.f36067e, dp - b4Var.f36065b), this.f36030f + this.h);
                } else {
                    w70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f36034w;
                    canvas.translate(org.telegram.messenger.v0.D(20.0f, this.f36034w.f35694c.f36067e, (dp2 + a4Var.f35694c.f36065b) - ((int) Math.ceil(a4Var.f35697i.d.getLineWidth(0)))), this.f36030f + this.h);
                }
                this.f36034w.f35697i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36035x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f36029e - AndroidUtilities.dp(26.0f), this.f36030f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36035x.a(canvas);
            }
            if (this.f36028c != null) {
                canvas.save();
                canvas.translate(this.f36029e, this.f36030f);
                i4.v(w70Var, canvas, this, 0);
                this.f36028c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f36028c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f36026a, this.f36027b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47897a;
            int i14 = this.f36031n;
            view.layout(i14, this.f36032r, view.getMeasuredWidth() + i14, this.d.f47897a.getMeasuredHeight() + this.f36032r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f36026a, this.f36027b, motionEvent, this, this.f36028c, this.f36029e, this.f36030f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f36034w;
        g4 g4Var = this.f36027b;
        if (a4Var2 != a4Var) {
            this.f36034w = a4Var;
            org.telegram.ui.Components.gm0 gm0Var = this.d;
            if (gm0Var != null) {
                removeView(gm0Var.f47897a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36034w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f36033s = I;
                s4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.gm0) x10;
                addView(x10.f47897a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36034w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f36033s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
