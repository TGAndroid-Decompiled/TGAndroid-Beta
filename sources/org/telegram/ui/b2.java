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
public final class b2 extends ViewGroup implements org.telegram.ui.Cells.p9, e3 {
    public final v70 f34625a;
    public final g4 f34626b;
    public b3 f34627c;
    public org.telegram.ui.Components.vk0 d;
    public int f34628e;
    public int f34629f;
    public int h;
    public int f34630n;
    public int f34631r;
    public int f34632s;
    public boolean v;
    public a4 f34633w;
    public CheckBoxBase f34634x;

    public b2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f34625a = v70Var;
        this.f34626b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f34633w;
        if (a4Var != null) {
            b3Var = a4Var.f34358i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        v70 v70Var = this.f34625a;
        g4 g4Var = this.f34626b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            v70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f34633w.f34355c;
            return org.telegram.messenger.vl.A(20.0f, b4Var.f34657e, dp - b4Var.f34655b);
        }
        v70Var.getClass();
        return org.telegram.messenger.w1.D(20.0f, this.f34633w.f34355c.f34657e, (AndroidUtilities.dp(18) + this.f34633w.f34355c.f34655b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45767a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f34627c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f34625a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34633w;
        if (a4Var != null && a4Var.f34358i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f34633w.f34358i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f34627c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f34645s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45767a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f34630n + boundLeft);
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
        this.f34625a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34633w;
        if (a4Var != null && a4Var.f34358i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f34633w.f34358i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f34627c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f34645s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45767a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f34630n + boundRight);
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
        b3 b3Var = this.f34627c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f34645s;
            this.f34625a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f45767a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f34630n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.f45767a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f34627c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f34627c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34633w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f34633w.f34358i;
            v70 v70Var = this.f34625a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f34626b;
                if (g4Var != null && g4Var.G) {
                    v70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f34633w.f34355c;
                    canvas.translate(org.telegram.messenger.vl.A(20.0f, b4Var.f34657e, dp - b4Var.f34655b), this.f34629f + this.h);
                } else {
                    v70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f34633w;
                    canvas.translate(org.telegram.messenger.w1.D(20.0f, this.f34633w.f34355c.f34657e, (dp2 + a4Var.f34355c.f34655b) - ((int) Math.ceil(a4Var.f34358i.d.getLineWidth(0)))), this.f34629f + this.h);
                }
                this.f34633w.f34358i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f34634x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f34628e - AndroidUtilities.dp(26.0f), this.f34629f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f34634x.a(canvas);
            }
            if (this.f34627c != null) {
                canvas.save();
                canvas.translate(this.f34628e, this.f34629f);
                i4.v(v70Var, canvas, this, 0);
                this.f34627c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f34627c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f34625a, this.f34626b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45767a;
            int i14 = this.f34630n;
            view.layout(i14, this.f34631r, view.getMeasuredWidth() + i14, this.d.f45767a.getMeasuredHeight() + this.f34631r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f34625a, this.f34626b, motionEvent, this, this.f34627c, this.f34628e, this.f34629f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f34633w;
        g4 g4Var = this.f34626b;
        if (a4Var2 != a4Var) {
            this.f34633w = a4Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f45767a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f34633w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f34632s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.f45767a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f34633w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f34632s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
