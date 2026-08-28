package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class e2 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f37790a;
    public final j4 f37791b;
    public e3 f37792c;
    public int d;
    public int f37793e;
    public TL_iv.pageBlockParagraph f37794f;

    public e2(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f37790a = a70Var;
        this.f37791b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f37792c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        e3 e3Var = this.f37792c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.f37805s;
        this.f37790a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        e3 e3Var = this.f37792c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.f37805s;
        this.f37790a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        e3 e3Var = this.f37792c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.f37805s;
        this.f37790a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f37792c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f37792c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37794f == null) {
            return;
        }
        e3 e3Var = this.f37792c;
        a70 a70Var = this.f37790a;
        if (e3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f37793e);
            l4.v(a70Var, canvas, this, 0);
            this.f37792c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, a70Var, this.f37794f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.f37792c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f37790a, this.f37791b, e3Var));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f37794f;
        if (pageblockparagraph != null) {
            int i12 = pageblockparagraph.level;
            a70 a70Var = this.f37790a;
            i11 = 0;
            if (i12 == 0) {
                a70Var.getClass();
                this.f37793e = AndroidUtilities.dp(8);
                a70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f37793e = 0;
                a70Var.getClass();
                this.d = AndroidUtilities.dp((this.f37794f.level * 14) + 18);
            }
            if (this.f37794f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                j4 j4Var = this.f37791b;
                if (j4Var != null && j4Var.C) {
                    alignment = org.telegram.ui.Components.rv0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f37794f.text;
            a70 a70Var2 = this.f37790a;
            a70Var2.getClass();
            e3 p6 = l4.p(a70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f37793e, this.f37794f, alignment2, 0, this.f37791b);
            this.f37792c = p6;
            if (p6 != null) {
                int height = p6.d.getHeight();
                if (this.f37794f.level > 0) {
                    a70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    a70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i11 = dp + height;
                e3 e3Var = this.f37792c;
                e3Var.f37805s = this.d;
                e3Var.v = this.f37793e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f37790a, this.f37791b, motionEvent, this, this.f37792c, this.d, this.f37793e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f37794f = pageblockparagraph;
        requestLayout();
    }
}
