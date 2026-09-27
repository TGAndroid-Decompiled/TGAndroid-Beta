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
public final class c2 extends ViewGroup implements org.telegram.ui.Cells.p9, f3 {
    public final s70 f32491a;
    public final h4 f32492b;
    public c3 f32493c;
    public org.telegram.ui.Components.il0 d;
    public int e;
    public int f32494f;
    public int h;
    public int f32495n;
    public int f32496r;
    public int f32497s;
    public boolean v;
    public b4 f32498w;
    public CheckBoxBase f32499x;

    public c2(Context context, s70 s70Var, h4 h4Var) {
        super(context);
        this.f32491a = s70Var;
        this.f32492b = h4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c3 c3Var;
        b4 b4Var = this.f32498w;
        if (b4Var != null) {
            c3Var = b4Var.f32232i;
        } else {
            c3Var = null;
        }
        if (c3Var == null) {
            return 0;
        }
        s70 s70Var = this.f32491a;
        h4 h4Var = this.f32492b;
        if (h4Var != null && h4Var.G) {
            int measuredWidth = getMeasuredWidth();
            s70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            c4 c4Var = this.f32498w.f32230c;
            return org.telegram.messenger.qk.B(20.0f, c4Var.e, dp - c4Var.f32517b);
        }
        s70Var.getClass();
        return org.telegram.messenger.l0.D(20.0f, this.f32498w.f32230c.e, (AndroidUtilities.dp(18) + this.f32498w.f32230c.f32517b) - ((int) Math.ceil(c3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f43005a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.f32493c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f32491a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f32498w;
        if (b4Var != null && b4Var.f32232i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f32498w.f32232i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c3 c3Var = this.f32493c;
        if (c3Var != null) {
            i10 = Math.min(i10, (c3Var.a() + c3Var.f32507s) - dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f43005a;
            if ((view instanceof f3) && (boundLeft = ((f3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f32495n + boundLeft);
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
        this.f32491a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f32498w;
        if (b4Var != null && b4Var.f32232i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f32498w.f32232i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var = this.f32493c;
        if (c3Var != null) {
            i10 = Math.max(i10, c3Var.b() + c3Var.f32507s + dp);
        }
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f43005a;
            if ((view instanceof f3) && (boundRight = ((f3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f32495n + boundRight);
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
        c3 c3Var = this.f32493c;
        if (c3Var != null) {
            lastLineBoundRight = c3Var.c() + c3Var.f32507s;
            this.f32491a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                View view = il0Var.f43005a;
                if ((view instanceof f3) && (lastLineBoundRight = ((f3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f32495n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            il0Var.f43005a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f32493c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f32493c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32498w != null) {
            int measuredWidth = getMeasuredWidth();
            c3 c3Var = this.f32498w.f32232i;
            s70 s70Var = this.f32491a;
            if (c3Var != null) {
                canvas.save();
                h4 h4Var = this.f32492b;
                if (h4Var != null && h4Var.G) {
                    s70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    c4 c4Var = this.f32498w.f32230c;
                    canvas.translate(org.telegram.messenger.qk.B(20.0f, c4Var.e, dp - c4Var.f32517b), this.f32494f + this.h);
                } else {
                    s70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    b4 b4Var = this.f32498w;
                    canvas.translate(org.telegram.messenger.l0.D(20.0f, this.f32498w.f32230c.e, (dp2 + b4Var.f32230c.f32517b) - ((int) Math.ceil(b4Var.f32232i.d.getLineWidth(0)))), this.f32494f + this.h);
                }
                this.f32498w.f32232i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f32499x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f32494f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f32499x.a(canvas);
            }
            if (this.f32493c != null) {
                canvas.save();
                canvas.translate(this.e, this.f32494f);
                j4.v(s70Var, canvas, this, 0);
                this.f32493c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f32493c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f32491a, this.f32492b, c3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.il0 il0Var = this.d;
        if (il0Var != null) {
            View view = il0Var.f43005a;
            int i14 = this.f32495n;
            view.layout(i14, this.f32496r, view.getMeasuredWidth() + i14, this.d.f43005a.getMeasuredHeight() + this.f32496r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (j4.l(this.f32491a, this.f32492b, motionEvent, this, this.f32493c, this.e, this.f32494f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.f32498w;
        h4 h4Var = this.f32492b;
        if (b4Var2 != b4Var) {
            this.f32498w = b4Var;
            org.telegram.ui.Components.il0 il0Var = this.d;
            if (il0Var != null) {
                removeView(il0Var.f43005a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f32498w.d;
            if (pageBlock != null && h4Var != null) {
                int I = h4.I(pageBlock);
                this.f32497s = I;
                s4.c1 x10 = h4Var.x(this, I);
                this.d = (org.telegram.ui.Components.il0) x10;
                addView(x10.f43005a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f32498w.d;
        if (pageBlock2 != null && h4Var != null) {
            h4Var.H(this.f32497s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
