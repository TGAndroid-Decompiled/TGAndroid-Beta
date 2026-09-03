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
public final class e2 extends ViewGroup implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f33587a;
    public final l4 f33588b;
    public f3 f33589c;
    public org.telegram.ui.Components.dl0 d;
    public int e;
    public int f33590f;
    public int h;
    public int f33591n;
    public int f33592r;
    public int f33593s;
    public boolean v;
    public f4 f33594w;
    public CheckBoxBase f33595x;

    public e2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f33587a = p70Var;
        this.f33588b = l4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        f3 f3Var;
        f4 f4Var = this.f33594w;
        if (f4Var != null) {
            f3Var = f4Var.f33945i;
        } else {
            f3Var = null;
        }
        if (f3Var == null) {
            return 0;
        }
        p70 p70Var = this.f33587a;
        l4 l4Var = this.f33588b;
        if (l4Var != null && l4Var.D) {
            int measuredWidth = getMeasuredWidth();
            p70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            g4 g4Var = this.f33594w.f33943c;
            return b.z(20.0f, g4Var.e, dp - g4Var.f34314b);
        }
        p70Var.getClass();
        return org.telegram.messenger.y3.D(20.0f, this.f33594w.f33943c.e, (AndroidUtilities.dp(18) + this.f33594w.f33943c.f34314b) - ((int) Math.ceil(f3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            if (view instanceof org.telegram.ui.Cells.k9) {
                ((org.telegram.ui.Cells.k9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        f3 f3Var = this.f33589c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f33587a.getClass();
        int dp = AndroidUtilities.dp(18);
        f4 f4Var = this.f33594w;
        if (f4Var != null && f4Var.f33945i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f33594w.f33945i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        f3 f3Var = this.f33589c;
        if (f3Var != null) {
            i10 = Math.min(i10, (f3Var.a() + f3Var.f33933s) - dp);
        }
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            if ((view instanceof i3) && (boundLeft = ((i3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f33591n + boundLeft);
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
        this.f33587a.getClass();
        int dp = AndroidUtilities.dp(18);
        f4 f4Var = this.f33594w;
        if (f4Var != null && f4Var.f33945i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f33594w.f33945i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        f3 f3Var = this.f33589c;
        if (f3Var != null) {
            i10 = Math.max(i10, f3Var.b() + f3Var.f33933s + dp);
        }
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            if ((view instanceof i3) && (boundRight = ((i3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f33591n + boundRight);
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
        f3 f3Var = this.f33589c;
        if (f3Var != null) {
            lastLineBoundRight = f3Var.c() + f3Var.f33933s;
            this.f33587a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.dl0 dl0Var = this.d;
            if (dl0Var != null) {
                View view = dl0Var.f5774a;
                if ((view instanceof i3) && (lastLineBoundRight = ((i3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f33591n;
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
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            dl0Var.f5774a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f33589c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f33589c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33594w != null) {
            int measuredWidth = getMeasuredWidth();
            f3 f3Var = this.f33594w.f33945i;
            p70 p70Var = this.f33587a;
            if (f3Var != null) {
                canvas.save();
                l4 l4Var = this.f33588b;
                if (l4Var != null && l4Var.D) {
                    p70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    g4 g4Var = this.f33594w.f33943c;
                    canvas.translate(b.z(20.0f, g4Var.e, dp - g4Var.f34314b), this.f33590f + this.h);
                } else {
                    p70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    f4 f4Var = this.f33594w;
                    canvas.translate(org.telegram.messenger.y3.D(20.0f, this.f33594w.f33943c.e, (dp2 + f4Var.f33943c.f34314b) - ((int) Math.ceil(f4Var.f33945i.d.getLineWidth(0)))), this.f33590f + this.h);
                }
                this.f33594w.f33945i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f33595x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.e - AndroidUtilities.dp(26.0f), this.f33590f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f33595x.a(canvas);
            }
            if (this.f33589c != null) {
                canvas.save();
                canvas.translate(this.e, this.f33590f);
                n4.v(p70Var, canvas, this, 0);
                this.f33589c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f33589c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.j(this.f33587a, this.f33588b, f3Var));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.dl0 dl0Var = this.d;
        if (dl0Var != null) {
            View view = dl0Var.f5774a;
            int i14 = this.f33591n;
            view.layout(i14, this.f33592r, view.getMeasuredWidth() + i14, this.d.f5774a.getMeasuredHeight() + this.f33592r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (n4.l(this.f33587a, this.f33588b, motionEvent, this, this.f33589c, this.e, this.f33590f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(f4 f4Var) {
        f4 f4Var2 = this.f33594w;
        l4 l4Var = this.f33588b;
        if (f4Var2 != f4Var) {
            this.f33594w = f4Var;
            org.telegram.ui.Components.dl0 dl0Var = this.d;
            if (dl0Var != null) {
                removeView(dl0Var.f5774a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f33594w.d;
            if (pageBlock != null && l4Var != null) {
                int I = l4.I(pageBlock);
                this.f33593s = I;
                f2.l1 x10 = l4Var.x(this, I);
                this.d = (org.telegram.ui.Components.dl0) x10;
                addView(x10.f5774a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f33594w.d;
        if (pageBlock2 != null && l4Var != null) {
            l4Var.H(this.f33593s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
