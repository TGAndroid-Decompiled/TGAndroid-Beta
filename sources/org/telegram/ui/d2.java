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
    public final d70 f36027a;
    public final j4 f36028b;
    public d3 f36029c;
    public org.telegram.ui.Components.sl0 d;
    public int e;
    public int f36030f;
    public int h;
    public int f36031n;
    public int f36032r;
    public int f36033s;
    public boolean v;
    public c4 f36034w;
    public CheckBoxBase f36035x;

    public d2(Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.f36027a = d70Var;
        this.f36028b = j4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        d3 d3Var;
        c4 c4Var = this.f36034w;
        if (c4Var != null) {
            d3Var = c4Var.f35777i;
        } else {
            d3Var = null;
        }
        if (d3Var == null) {
            return 0;
        }
        d70 d70Var = this.f36027a;
        j4 j4Var = this.f36028b;
        if (j4Var != null && j4Var.G) {
            int measuredWidth = getMeasuredWidth();
            d70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            d4 d4Var = this.f36034w.f35775c;
            return org.telegram.messenger.lk.B(20.0f, d4Var.e, dp - d4Var.f36054b);
        }
        d70Var.getClass();
        return org.telegram.messenger.g0.D(20.0f, this.f36034w.f35775c.e, (AndroidUtilities.dp(18) + this.f36034w.f35775c.f36054b) - ((int) Math.ceil(d3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45910a;
            if (view instanceof org.telegram.ui.Cells.m9) {
                ((org.telegram.ui.Cells.m9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        d3 d3Var = this.f36029c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36027a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f36034w;
        if (c4Var != null && c4Var.f35777i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36034w.f35777i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        d3 d3Var = this.f36029c;
        if (d3Var != null) {
            i10 = Math.min(i10, (d3Var.a() + d3Var.f36046s) - dp);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45910a;
            if ((view instanceof g3) && (boundLeft = ((g3) view).getBoundLeft()) != -1) {
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
        this.f36027a.getClass();
        int dp = AndroidUtilities.dp(18);
        c4 c4Var = this.f36034w;
        if (c4Var != null && c4Var.f35777i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36034w.f35777i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        d3 d3Var = this.f36029c;
        if (d3Var != null) {
            i10 = Math.max(i10, d3Var.b() + d3Var.f36046s + dp);
        }
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45910a;
            if ((view instanceof g3) && (boundRight = ((g3) view).getBoundRight()) != -1) {
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
        d3 d3Var = this.f36029c;
        if (d3Var != null) {
            lastLineBoundRight = d3Var.c() + d3Var.f36046s;
            this.f36027a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (sl0Var != null) {
                View view = sl0Var.f45910a;
                if ((view instanceof g3) && (lastLineBoundRight = ((g3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36031n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.lk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            sl0Var.f45910a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f36029c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f36029c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36034w != null) {
            int measuredWidth = getMeasuredWidth();
            d3 d3Var = this.f36034w.f35777i;
            d70 d70Var = this.f36027a;
            if (d3Var != null) {
                canvas.save();
                j4 j4Var = this.f36028b;
                if (j4Var != null && j4Var.G) {
                    d70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    d4 d4Var = this.f36034w.f35775c;
                    canvas.translate(org.telegram.messenger.lk.B(20.0f, d4Var.e, dp - d4Var.f36054b), this.f36030f + this.h);
                } else {
                    d70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    c4 c4Var = this.f36034w;
                    canvas.translate(org.telegram.messenger.g0.D(20.0f, this.f36034w.f35775c.e, (dp2 + c4Var.f35775c.f36054b) - ((int) Math.ceil(c4Var.f35777i.d.getLineWidth(0)))), this.f36030f + this.h);
                }
                this.f36034w.f35777i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36035x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f36030f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36035x.a(canvas);
            }
            if (this.f36029c != null) {
                canvas.save();
                canvas.translate(this.e, this.f36030f);
                l4.v(d70Var, canvas, this, 0);
                this.f36029c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f36029c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f36027a, this.f36028b, d3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        if (sl0Var != null) {
            View view = sl0Var.f45910a;
            int i14 = this.f36031n;
            view.layout(i14, this.f36032r, view.getMeasuredWidth() + i14, this.d.f45910a.getMeasuredHeight() + this.f36032r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (l4.l(this.f36027a, this.f36028b, motionEvent, this, this.f36029c, this.e, this.f36030f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(c4 c4Var) {
        c4 c4Var2 = this.f36034w;
        j4 j4Var = this.f36028b;
        if (c4Var2 != c4Var) {
            this.f36034w = c4Var;
            org.telegram.ui.Components.sl0 sl0Var = this.d;
            if (sl0Var != null) {
                removeView(sl0Var.f45910a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36034w.d;
            if (pageBlock != null && j4Var != null) {
                int I = j4.I(pageBlock);
                this.f36033s = I;
                s4.b1 x10 = j4Var.x(this, I);
                this.d = (org.telegram.ui.Components.sl0) x10;
                addView(x10.f45910a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36034w.d;
        if (pageBlock2 != null && j4Var != null) {
            j4Var.H(this.f36033s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
