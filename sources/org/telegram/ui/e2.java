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
public final class e2 extends ViewGroup implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f37672a;
    public final k4 f37673b;
    public f3 f37674c;
    public org.telegram.ui.Components.vk0 d;
    public int f37675e;
    public int f37676f;
    public int h;
    public int f37677n;
    public int f37678r;
    public int f37679s;
    public boolean v;
    public e4 f37680w;
    public CheckBoxBase f37681x;

    public e2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37672a = d70Var;
        this.f37673b = k4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        f3 f3Var;
        e4 e4Var = this.f37680w;
        if (e4Var != null) {
            f3Var = e4Var.f37695i;
        } else {
            f3Var = null;
        }
        if (f3Var == null) {
            return 0;
        }
        d70 d70Var = this.f37672a;
        k4 k4Var = this.f37673b;
        if (k4Var != null && k4Var.C) {
            int measuredWidth = getMeasuredWidth();
            d70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            f4 f4Var = this.f37680w.f37692c;
            return b.z(20.0f, f4Var.f37984e, dp - f4Var.f37982b);
        }
        d70Var.getClass();
        return org.telegram.messenger.x3.D(20.0f, this.f37680w.f37692c.f37984e, (AndroidUtilities.dp(18) + this.f37680w.f37692c.f37982b) - ((int) Math.ceil(f3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            if (view instanceof org.telegram.ui.Cells.j9) {
                ((org.telegram.ui.Cells.j9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        f3 f3Var = this.f37674c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f37672a.getClass();
        int dp = AndroidUtilities.dp(18);
        e4 e4Var = this.f37680w;
        if (e4Var != null && e4Var.f37695i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f37680w.f37695i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        f3 f3Var = this.f37674c;
        if (f3Var != null) {
            i10 = Math.min(i10, (f3Var.a() + f3Var.f37974s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            if ((view instanceof i3) && (boundLeft = ((i3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f37677n + boundLeft);
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
        this.f37672a.getClass();
        int dp = AndroidUtilities.dp(18);
        e4 e4Var = this.f37680w;
        if (e4Var != null && e4Var.f37695i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f37680w.f37695i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        f3 f3Var = this.f37674c;
        if (f3Var != null) {
            i10 = Math.max(i10, f3Var.b() + f3Var.f37974s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            if ((view instanceof i3) && (boundRight = ((i3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f37677n + boundRight);
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
        f3 f3Var = this.f37674c;
        if (f3Var != null) {
            lastLineBoundRight = f3Var.c() + f3Var.f37974s;
            this.f37672a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f6432a;
                if ((view instanceof i3) && (lastLineBoundRight = ((i3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f37677n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.f6432a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f37674c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f37674c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37680w != null) {
            int measuredWidth = getMeasuredWidth();
            f3 f3Var = this.f37680w.f37695i;
            d70 d70Var = this.f37672a;
            if (f3Var != null) {
                canvas.save();
                k4 k4Var = this.f37673b;
                if (k4Var != null && k4Var.C) {
                    d70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    f4 f4Var = this.f37680w.f37692c;
                    canvas.translate(b.z(20.0f, f4Var.f37984e, dp - f4Var.f37982b), this.f37676f + this.h);
                } else {
                    d70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    e4 e4Var = this.f37680w;
                    canvas.translate(org.telegram.messenger.x3.D(20.0f, this.f37680w.f37692c.f37984e, (dp2 + e4Var.f37692c.f37982b) - ((int) Math.ceil(e4Var.f37695i.d.getLineWidth(0)))), this.f37676f + this.h);
                }
                this.f37680w.f37695i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f37681x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f37675e - AndroidUtilities.dp(26.0f), this.f37676f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f37681x.a(canvas);
            }
            if (this.f37674c != null) {
                canvas.save();
                canvas.translate(this.f37675e, this.f37676f);
                m4.v(d70Var, canvas, this, 0);
                this.f37674c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f37674c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.f37672a, this.f37673b, f3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f6432a;
            int i14 = this.f37677n;
            view.layout(i14, this.f37678r, view.getMeasuredWidth() + i14, this.d.f6432a.getMeasuredHeight() + this.f37678r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m4.l(this.f37672a, this.f37673b, motionEvent, this, this.f37674c, this.f37675e, this.f37676f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(e4 e4Var) {
        e4 e4Var2 = this.f37680w;
        k4 k4Var = this.f37673b;
        if (e4Var2 != e4Var) {
            this.f37680w = e4Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f6432a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f37680w.d;
            if (pageBlock != null && k4Var != null) {
                int I = k4.I(pageBlock);
                this.f37679s = I;
                f2.n1 x4 = k4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x4;
                addView(x4.f6432a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f37680w.d;
        if (pageBlock2 != null && k4Var != null) {
            k4Var.H(this.f37679s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
