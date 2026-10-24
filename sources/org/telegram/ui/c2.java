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
public final class c2 extends ViewGroup implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f36186a;
    public final i4 f36187b;
    public c3 f36188c;
    public org.telegram.ui.Components.vl0 d;
    public int e;
    public int f36189f;
    public int h;
    public int f36190n;
    public int f36191r;
    public int f36192s;
    public boolean v;
    public b4 f36193w;
    public CheckBoxBase f36194x;

    public c2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f36186a = f70Var;
        this.f36187b = i4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c3 c3Var;
        b4 b4Var = this.f36193w;
        if (b4Var != null) {
            c3Var = b4Var.f35913i;
        } else {
            c3Var = null;
        }
        if (c3Var == null) {
            return 0;
        }
        f70 f70Var = this.f36186a;
        i4 i4Var = this.f36187b;
        if (i4Var != null && i4Var.G) {
            int measuredWidth = getMeasuredWidth();
            f70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            c4 c4Var = this.f36193w.f35911c;
            return org.telegram.messenger.tl.B(20.0f, c4Var.e, dp - c4Var.f36215b);
        }
        f70Var.getClass();
        return org.telegram.messenger.v0.D(20.0f, this.f36193w.f35911c.e, (AndroidUtilities.dp(18) + this.f36193w.f35911c.f36215b) - ((int) Math.ceil(c3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f46342a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.f36188c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36186a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f36193w;
        if (b4Var != null && b4Var.f35913i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36193w.f35913i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c3 c3Var = this.f36188c;
        if (c3Var != null) {
            i10 = Math.min(i10, (c3Var.a() + c3Var.f36208s) - dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f46342a;
            if ((view instanceof f3) && (boundLeft = ((f3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f36190n + boundLeft);
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
        this.f36186a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f36193w;
        if (b4Var != null && b4Var.f35913i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36193w.f35913i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var = this.f36188c;
        if (c3Var != null) {
            i10 = Math.max(i10, c3Var.b() + c3Var.f36208s + dp);
        }
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f46342a;
            if ((view instanceof f3) && (boundRight = ((f3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f36190n + boundRight);
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
        c3 c3Var = this.f36188c;
        if (c3Var != null) {
            lastLineBoundRight = c3Var.c() + c3Var.f36208s;
            this.f36186a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                View view = vl0Var.f46342a;
                if ((view instanceof f3) && (lastLineBoundRight = ((f3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36190n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.tl.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            vl0Var.f46342a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f36188c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f36188c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36193w != null) {
            int measuredWidth = getMeasuredWidth();
            c3 c3Var = this.f36193w.f35913i;
            f70 f70Var = this.f36186a;
            if (c3Var != null) {
                canvas.save();
                i4 i4Var = this.f36187b;
                if (i4Var != null && i4Var.G) {
                    f70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    c4 c4Var = this.f36193w.f35911c;
                    canvas.translate(org.telegram.messenger.tl.B(20.0f, c4Var.e, dp - c4Var.f36215b), this.f36189f + this.h);
                } else {
                    f70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    b4 b4Var = this.f36193w;
                    canvas.translate(org.telegram.messenger.v0.D(20.0f, this.f36193w.f35911c.e, (dp2 + b4Var.f35911c.f36215b) - ((int) Math.ceil(b4Var.f35913i.d.getLineWidth(0)))), this.f36189f + this.h);
                }
                this.f36193w.f35913i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36194x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f36189f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36194x.a(canvas);
            }
            if (this.f36188c != null) {
                canvas.save();
                canvas.translate(this.e, this.f36189f);
                k4.v(f70Var, canvas, this, 0);
                this.f36188c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f36188c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f36186a, this.f36187b, c3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vl0 vl0Var = this.d;
        if (vl0Var != null) {
            View view = vl0Var.f46342a;
            int i14 = this.f36190n;
            view.layout(i14, this.f36191r, view.getMeasuredWidth() + i14, this.d.f46342a.getMeasuredHeight() + this.f36191r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (k4.l(this.f36186a, this.f36187b, motionEvent, this, this.f36188c, this.e, this.f36189f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.f36193w;
        i4 i4Var = this.f36187b;
        if (b4Var2 != b4Var) {
            this.f36193w = b4Var;
            org.telegram.ui.Components.vl0 vl0Var = this.d;
            if (vl0Var != null) {
                removeView(vl0Var.f46342a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36193w.d;
            if (pageBlock != null && i4Var != null) {
                int I = i4.I(pageBlock);
                this.f36192s = I;
                s4.b1 x10 = i4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vl0) x10;
                addView(x10.f46342a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36193w.d;
        if (pageBlock2 != null && i4Var != null) {
            i4Var.H(this.f36192s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
