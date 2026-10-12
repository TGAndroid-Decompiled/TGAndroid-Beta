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
    public final w70 f36024a;
    public final g4 f36025b;
    public b3 f36026c;
    public org.telegram.ui.Components.gm0 d;
    public int f36027e;
    public int f36028f;
    public int h;
    public int f36029n;
    public int f36030r;
    public int f36031s;
    public boolean v;
    public a4 f36032w;
    public CheckBoxBase f36033x;

    public b2(Context context, w70 w70Var, g4 g4Var) {
        super(context);
        this.f36024a = w70Var;
        this.f36025b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f36032w;
        if (a4Var != null) {
            b3Var = a4Var.f35695i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        w70 w70Var = this.f36024a;
        g4 g4Var = this.f36025b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            w70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f36032w.f35692c;
            return org.telegram.messenger.am.B(20.0f, b4Var.f36065e, dp - b4Var.f36063b);
        }
        w70Var.getClass();
        return org.telegram.messenger.v0.D(20.0f, this.f36032w.f35692c.f36065e, (AndroidUtilities.dp(18) + this.f36032w.f35692c.f36063b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47889a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f36026c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36024a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f36032w;
        if (a4Var != null && a4Var.f35695i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36032w.f35695i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f36026c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f36044s) - dp);
        }
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47889a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f36029n + boundLeft);
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
        this.f36024a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f36032w;
        if (a4Var != null && a4Var.f35695i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36032w.f35695i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f36026c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f36044s + dp);
        }
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47889a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f36029n + boundRight);
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
        b3 b3Var = this.f36026c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f36044s;
            this.f36024a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.gm0 gm0Var = this.d;
            if (gm0Var != null) {
                View view = gm0Var.f47889a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36029n;
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
            gm0Var.f47889a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f36026c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f36026c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36032w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f36032w.f35695i;
            w70 w70Var = this.f36024a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f36025b;
                if (g4Var != null && g4Var.G) {
                    w70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f36032w.f35692c;
                    canvas.translate(org.telegram.messenger.am.B(20.0f, b4Var.f36065e, dp - b4Var.f36063b), this.f36028f + this.h);
                } else {
                    w70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f36032w;
                    canvas.translate(org.telegram.messenger.v0.D(20.0f, this.f36032w.f35692c.f36065e, (dp2 + a4Var.f35692c.f36063b) - ((int) Math.ceil(a4Var.f35695i.d.getLineWidth(0)))), this.f36028f + this.h);
                }
                this.f36032w.f35695i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36033x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f36027e - AndroidUtilities.dp(26.0f), this.f36028f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36033x.a(canvas);
            }
            if (this.f36026c != null) {
                canvas.save();
                canvas.translate(this.f36027e, this.f36028f);
                i4.v(w70Var, canvas, this, 0);
                this.f36026c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f36026c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f36024a, this.f36025b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.gm0 gm0Var = this.d;
        if (gm0Var != null) {
            View view = gm0Var.f47889a;
            int i14 = this.f36029n;
            view.layout(i14, this.f36030r, view.getMeasuredWidth() + i14, this.d.f47889a.getMeasuredHeight() + this.f36030r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f36024a, this.f36025b, motionEvent, this, this.f36026c, this.f36027e, this.f36028f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f36032w;
        g4 g4Var = this.f36025b;
        if (a4Var2 != a4Var) {
            this.f36032w = a4Var;
            org.telegram.ui.Components.gm0 gm0Var = this.d;
            if (gm0Var != null) {
                removeView(gm0Var.f47889a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36032w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f36031s = I;
                s4.d1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.gm0) x10;
                addView(x10.f47889a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36032w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f36031s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
