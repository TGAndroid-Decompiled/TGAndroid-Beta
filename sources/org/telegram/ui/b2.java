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
    public final v70 f34624a;
    public final g4 f34625b;
    public b3 f34626c;
    public org.telegram.ui.Components.vk0 d;
    public int f34627e;
    public int f34628f;
    public int h;
    public int f34629n;
    public int f34630r;
    public int f34631s;
    public boolean v;
    public a4 f34632w;
    public CheckBoxBase f34633x;

    public b2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f34624a = v70Var;
        this.f34625b = g4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        b3 b3Var;
        a4 a4Var = this.f34632w;
        if (a4Var != null) {
            b3Var = a4Var.f34357i;
        } else {
            b3Var = null;
        }
        if (b3Var == null) {
            return 0;
        }
        v70 v70Var = this.f34624a;
        g4 g4Var = this.f34625b;
        if (g4Var != null && g4Var.G) {
            int measuredWidth = getMeasuredWidth();
            v70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            b4 b4Var = this.f34632w.f34354c;
            return org.telegram.messenger.wl.A(20.0f, b4Var.f34656e, dp - b4Var.f34654b);
        }
        v70Var.getClass();
        return org.telegram.messenger.w1.D(20.0f, this.f34632w.f34354c.f34656e, (AndroidUtilities.dp(18) + this.f34632w.f34354c.f34654b) - ((int) Math.ceil(b3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45766a;
            if (view instanceof org.telegram.ui.Cells.p9) {
                ((org.telegram.ui.Cells.p9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        b3 b3Var = this.f34626c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f34624a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34632w;
        if (a4Var != null && a4Var.f34357i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f34632w.f34357i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        b3 b3Var = this.f34626c;
        if (b3Var != null) {
            i10 = Math.min(i10, (b3Var.a() + b3Var.f34644s) - dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45766a;
            if ((view instanceof e3) && (boundLeft = ((e3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f34629n + boundLeft);
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
        this.f34624a.getClass();
        int dp = AndroidUtilities.dp(18);
        a4 a4Var = this.f34632w;
        if (a4Var != null && a4Var.f34357i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f34632w.f34357i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        b3 b3Var = this.f34626c;
        if (b3Var != null) {
            i10 = Math.max(i10, b3Var.b() + b3Var.f34644s + dp);
        }
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45766a;
            if ((view instanceof e3) && (boundRight = ((e3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f34629n + boundRight);
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
        b3 b3Var = this.f34626c;
        if (b3Var != null) {
            lastLineBoundRight = b3Var.c() + b3Var.f34644s;
            this.f34624a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                View view = vk0Var.f45766a;
                if ((view instanceof e3) && (lastLineBoundRight = ((e3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f34629n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            vk0Var.f45766a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f34626c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f34626c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34632w != null) {
            int measuredWidth = getMeasuredWidth();
            b3 b3Var = this.f34632w.f34357i;
            v70 v70Var = this.f34624a;
            if (b3Var != null) {
                canvas.save();
                g4 g4Var = this.f34625b;
                if (g4Var != null && g4Var.G) {
                    v70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    b4 b4Var = this.f34632w.f34354c;
                    canvas.translate(org.telegram.messenger.wl.A(20.0f, b4Var.f34656e, dp - b4Var.f34654b), this.f34628f + this.h);
                } else {
                    v70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    a4 a4Var = this.f34632w;
                    canvas.translate(org.telegram.messenger.w1.D(20.0f, this.f34632w.f34354c.f34656e, (dp2 + a4Var.f34354c.f34654b) - ((int) Math.ceil(a4Var.f34357i.d.getLineWidth(0)))), this.f34628f + this.h);
                }
                this.f34632w.f34357i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f34633x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f34627e - AndroidUtilities.dp(26.0f), this.f34628f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f34633x.a(canvas);
            }
            if (this.f34626c != null) {
                canvas.save();
                canvas.translate(this.f34627e, this.f34628f);
                i4.v(v70Var, canvas, this, 0);
                this.f34626c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f34626c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f34624a, this.f34625b, b3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vk0 vk0Var = this.d;
        if (vk0Var != null) {
            View view = vk0Var.f45766a;
            int i14 = this.f34629n;
            view.layout(i14, this.f34630r, view.getMeasuredWidth() + i14, this.d.f45766a.getMeasuredHeight() + this.f34630r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (i4.l(this.f34624a, this.f34625b, motionEvent, this, this.f34626c, this.f34627e, this.f34628f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(a4 a4Var) {
        a4 a4Var2 = this.f34632w;
        g4 g4Var = this.f34625b;
        if (a4Var2 != a4Var) {
            this.f34632w = a4Var;
            org.telegram.ui.Components.vk0 vk0Var = this.d;
            if (vk0Var != null) {
                removeView(vk0Var.f45766a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f34632w.d;
            if (pageBlock != null && g4Var != null) {
                int I = g4.I(pageBlock);
                this.f34631s = I;
                s4.c1 x10 = g4Var.x(this, I);
                this.d = (org.telegram.ui.Components.vk0) x10;
                addView(x10.f45766a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f34632w.d;
        if (pageBlock2 != null && g4Var != null) {
            g4Var.H(this.f34631s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
