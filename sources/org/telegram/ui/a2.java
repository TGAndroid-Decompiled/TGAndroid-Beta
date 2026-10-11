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
public final class a2 extends ViewGroup implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f35841a;
    public final f4 f35842b;
    public a3 f35843c;
    public org.telegram.ui.Components.cm0 d;
    public int f35844e;
    public int f35845f;
    public int h;
    public int f35846n;
    public int f35847r;
    public int f35848s;
    public boolean v;
    public z3 f35849w;
    public CheckBoxBase f35850x;

    public a2(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f35841a = t70Var;
        this.f35842b = f4Var;
        setWillNotDraw(false);
    }

    public final int a() {
        a3 a3Var;
        z3 z3Var = this.f35849w;
        if (z3Var != null) {
            a3Var = z3Var.f44572i;
        } else {
            a3Var = null;
        }
        if (a3Var == null) {
            return 0;
        }
        t70 t70Var = this.f35841a;
        f4 f4Var = this.f35842b;
        if (f4Var != null && f4Var.G) {
            int measuredWidth = getMeasuredWidth();
            t70Var.getClass();
            int dp = measuredWidth - AndroidUtilities.dp(18);
            a4 a4Var = this.f35849w.f44569c;
            return org.telegram.messenger.ai.B(20.0f, a4Var.f35874e, dp - a4Var.f35872b);
        }
        t70Var.getClass();
        return org.telegram.messenger.q.D(20.0f, this.f35849w.f44569c.f35874e, (AndroidUtilities.dp(18) + this.f35849w.f44569c.f35872b) - ((int) Math.ceil(a3Var.d.getLineWidth(0))));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            View view = cm0Var.f47748a;
            if (view instanceof org.telegram.ui.Cells.n9) {
                ((org.telegram.ui.Cells.n9) view).fillTextLayoutBlocks(arrayList);
            }
        }
        a3 a3Var = this.f35843c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        int i10;
        int boundLeft;
        this.f35841a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f35849w;
        if (z3Var != null && z3Var.f44572i != null) {
            i10 = Math.min(Integer.MAX_VALUE, (this.f35849w.f44572i.a() + a()) - dp);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        a3 a3Var = this.f35843c;
        if (a3Var != null) {
            i10 = Math.min(i10, (a3Var.a() + a3Var.f35862s) - dp);
        }
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            View view = cm0Var.f47748a;
            if ((view instanceof d3) && (boundLeft = ((d3) view).getBoundLeft()) != -1) {
                i10 = Math.min(i10, this.f35846n + boundLeft);
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
        this.f35841a.getClass();
        int dp = AndroidUtilities.dp(18);
        z3 z3Var = this.f35849w;
        if (z3Var != null && z3Var.f44572i != null) {
            i10 = Math.max(Integer.MIN_VALUE, this.f35849w.f44572i.b() + a() + dp);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        a3 a3Var = this.f35843c;
        if (a3Var != null) {
            i10 = Math.max(i10, a3Var.b() + a3Var.f35862s + dp);
        }
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            View view = cm0Var.f47748a;
            if ((view instanceof d3) && (boundRight = ((d3) view).getBoundRight()) != -1) {
                i10 = Math.max(i10, this.f35846n + boundRight);
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
        a3 a3Var = this.f35843c;
        if (a3Var != null) {
            lastLineBoundRight = a3Var.c() + a3Var.f35862s;
            this.f35841a.getClass();
            i10 = AndroidUtilities.dp(18);
        } else {
            org.telegram.ui.Components.cm0 cm0Var = this.d;
            if (cm0Var != null) {
                View view = cm0Var.f47748a;
                if ((view instanceof d3) && (lastLineBoundRight = ((d3) view).getLastLineBoundRight()) != -1) {
                    i10 = this.f35846n;
                }
            }
            return -1;
        }
        return i10 + lastLineBoundRight;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            cm0Var.f47748a.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f35843c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f35843c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35849w != null) {
            int measuredWidth = getMeasuredWidth();
            a3 a3Var = this.f35849w.f44572i;
            t70 t70Var = this.f35841a;
            if (a3Var != null) {
                canvas.save();
                f4 f4Var = this.f35842b;
                if (f4Var != null && f4Var.G) {
                    t70Var.getClass();
                    int dp = measuredWidth - AndroidUtilities.dp(18);
                    a4 a4Var = this.f35849w.f44569c;
                    canvas.translate(org.telegram.messenger.ai.B(20.0f, a4Var.f35874e, dp - a4Var.f35872b), this.f35845f + this.h);
                } else {
                    t70Var.getClass();
                    int dp2 = AndroidUtilities.dp(18);
                    z3 z3Var = this.f35849w;
                    canvas.translate(org.telegram.messenger.q.D(20.0f, this.f35849w.f44569c.f35874e, (dp2 + z3Var.f44569c.f35872b) - ((int) Math.ceil(z3Var.f44572i.d.getLineWidth(0)))), this.f35845f + this.h);
                }
                this.f35849w.f44572i.draw(canvas, this);
                canvas.restore();
            }
            CheckBoxBase checkBoxBase = this.f35850x;
            if (checkBoxBase != null) {
                checkBoxBase.e(this.f35844e - AndroidUtilities.dp(26.0f), this.f35845f, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
                this.f35850x.a(canvas);
            }
            if (this.f35843c != null) {
                canvas.save();
                canvas.translate(this.f35844e, this.f35845f);
                h4.v(t70Var, canvas, this, 0);
                this.f35843c.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f35843c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f35841a, this.f35842b, a3Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.cm0 cm0Var = this.d;
        if (cm0Var != null) {
            View view = cm0Var.f47748a;
            int i14 = this.f35846n;
            view.layout(i14, this.f35847r, view.getMeasuredWidth() + i14, this.d.f47748a.getMeasuredHeight() + this.f35847r);
        }
    }

    @Override
    public final void onMeasure(int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (h4.l(this.f35841a, this.f35842b, motionEvent, this, this.f35843c, this.f35844e, this.f35845f)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlock(z3 z3Var) {
        z3 z3Var2 = this.f35849w;
        f4 f4Var = this.f35842b;
        if (z3Var2 != z3Var) {
            this.f35849w = z3Var;
            org.telegram.ui.Components.cm0 cm0Var = this.d;
            if (cm0Var != null) {
                removeView(cm0Var.f47748a);
                this.d = null;
            }
            TL_iv.PageBlock pageBlock = this.f35849w.d;
            if (pageBlock != null && f4Var != null) {
                int I = f4.I(pageBlock);
                this.f35848s = I;
                s4.d1 x10 = f4Var.x(this, I);
                this.d = (org.telegram.ui.Components.cm0) x10;
                addView(x10.f47748a);
            }
        }
        TL_iv.PageBlock pageBlock2 = this.f35849w.d;
        if (pageBlock2 != null && f4Var != null) {
            f4Var.H(this.f35848s, this.d, pageBlock2, 0, 0, false);
        }
        requestLayout();
    }
}
