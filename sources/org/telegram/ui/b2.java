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
public final class b2 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f37951a;
    public final h4 f37952b;
    public a3 f37953c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f37954f;

    public b2(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f37951a = h70Var;
        this.f37952b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37953c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f37953c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f37634s;
        this.f37951a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f37953c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f37634s;
        this.f37951a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f37953c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f37634s;
        this.f37951a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37953c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f37953c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37954f == null) {
            return;
        }
        a3 a3Var = this.f37953c;
        h70 h70Var = this.f37951a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(h70Var, canvas, this, 0);
            this.f37953c.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, h70Var, this.f37954f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f37953c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f37951a, this.f37952b, a3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f37954f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            h70 h70Var = this.f37951a;
            i12 = 0;
            if (i13 == 0) {
                h70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                h70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                h70Var.getClass();
                this.d = AndroidUtilities.dp((this.f37954f.level * 14) + 18);
            }
            if (this.f37954f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                h4 h4Var = this.f37952b;
                if (h4Var != null && h4Var.G) {
                    alignment = org.telegram.ui.Components.px0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f37954f.text;
            h70 h70Var2 = this.f37951a;
            h70Var2.getClass();
            a3 p10 = j4.p(h70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f37954f, alignment2, 0, this.f37952b);
            this.f37953c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f37954f.level > 0) {
                    h70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    h70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                a3 a3Var = this.f37953c;
                a3Var.f37634s = this.d;
                a3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f37951a, this.f37952b, motionEvent, this, this.f37953c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f37954f = pageblockparagraph;
        requestLayout();
    }
}
