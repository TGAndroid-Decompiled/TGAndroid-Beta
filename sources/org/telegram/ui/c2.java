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
    public final f70 f36214a;
    public final i4 f36215b;
    public c3 f36216c;
    public org.telegram.ui.Components.wl0 d;
    public int e;
    public int f36217f;
    public int h;
    public int f36218n;
    public int f36219r;
    public int f36220s;
    public boolean v;
    public b4 f36221w;
    public CheckBoxBase f36222x;

    public c2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f36214a = f70Var;
        this.f36215b = i4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        c3 c3Var;
        b4 b4Var = this.f36221w;
        if (b4Var != null) {
            c3Var = b4Var.f35851i;
        } else {
            c3Var = null;
        }
        if (c3Var == null) {
            return 0;
        }
        f70 f70Var = this.f36214a;
        i4 i4Var = this.f36215b;
        if (i4Var != null && i4Var.G) {
            int measuredWidth = getMeasuredWidth();
            f70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            c4 c4Var = this.f36221w.f35849c;
            return org.telegram.messenger.sl.B(20.0f, c4Var.e, dp - c4Var.f36241b);
        }
        f70Var.getClass();
        return org.telegram.messenger.v0.D(20.0f, this.f36221w.f35849c.e, (AndroidUtilities.dp(18) + this.f36221w.f35849c.f36241b) - ((int) Math.ceil(c3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        c3 c3Var = this.f36216c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f36214a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f36221w;
        if (b4Var != null && b4Var.f35851i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f36221w.f35851i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        c3 c3Var = this.f36216c;
        if (c3Var != null) {
            i10 = Math.min(i10, (c3Var.a() + c3Var.f36233s) - dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            if ((view instanceof f3) && (boundLeft = ((f3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f36218n + boundLeft);
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
        this.f36214a.getClass();
        int dp = AndroidUtilities.dp(18);
        b4 b4Var = this.f36221w;
        if (b4Var != null && b4Var.f35851i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f36221w.f35851i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        c3 c3Var = this.f36216c;
        if (c3Var != null) {
            i10 = Math.max(i10, c3Var.b() + c3Var.f36233s + dp);
        }
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            if ((view instanceof f3) && (boundRight = ((f3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f36218n + boundRight);
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
        c3 c3Var = this.f36216c;
        if (c3Var != null) {
            lastLineBoundRight = c3Var.c() + c3Var.f36233s;
            this.f36214a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                View view = wl0Var.f46343a;
                if ((view instanceof f3) && (lastLineBoundRight = ((f3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f36218n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            wl0Var.f46343a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f36216c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f36216c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36221w != null) {
            int measuredWidth = getMeasuredWidth();
            c3 c3Var = this.f36221w.f35851i;
            f70 f70Var = this.f36214a;
            if (c3Var != null) {
                canvas.save();
                i4 i4Var = this.f36215b;
                if (i4Var != null && i4Var.G) {
                    f70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    c4 c4Var = this.f36221w.f35849c;
                    canvas.translate(org.telegram.messenger.sl.B(20.0f, c4Var.e, dp - c4Var.f36241b), this.f36217f + this.h);
                } else {
                    f70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    b4 b4Var = this.f36221w;
                    canvas.translate(org.telegram.messenger.v0.D(20.0f, this.f36221w.f35849c.e, (dp2 + b4Var.f35849c.f36241b) - ((int) Math.ceil(b4Var.f35851i.d.getLineWidth(0)))), this.f36217f + this.h);
                }
                this.f36221w.f35851i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f36222x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f36217f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f36222x.a(canvas);
            }
            if (this.f36216c != null) {
                canvas.save();
                canvas.translate(this.e, this.f36217f);
                k4.v(f70Var, canvas, this, 0);
                this.f36216c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f36216c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f36214a, this.f36215b, c3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wl0 wl0Var = this.d;
        if (wl0Var != null) {
            View view = wl0Var.f46343a;
            int i14 = this.f36218n;
            view.layout(i14, this.f36219r, view.getMeasuredWidth() + i14, this.d.f46343a.getMeasuredHeight() + this.f36219r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (k4.l(this.f36214a, this.f36215b, motionEvent, this, this.f36216c, this.e, this.f36217f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(b4 b4Var) {
        b4 b4Var2 = this.f36221w;
        i4 i4Var = this.f36215b;
        if (b4Var2 != b4Var) {
            this.f36221w = b4Var;
            org.telegram.ui.Components.wl0 wl0Var = this.d;
            if (wl0Var != null) {
                removeView(wl0Var.f46343a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f36221w.d;
            if (pageBlock != null && i4Var != null) {
                int I = i4.I(pageBlock);
                this.f36220s = I;
                s4.b1 x10 = i4Var.x(this, I);
                this.d = (org.telegram.ui.Components.wl0) x10;
                addView(x10.f46343a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f36221w.d;
        if (pageBlock2 != null && i4Var != null) {
            i4Var.H(this.f36220s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
