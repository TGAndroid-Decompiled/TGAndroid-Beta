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
    public final j70 f37865a;
    public final h4 f37866b;
    public a3 f37867c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f37868f;

    public b2(Context context, j70 j70Var, h4 h4Var) {
        super(context);
        this.f37865a = j70Var;
        this.f37866b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37867c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f37867c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f37666s;
        this.f37865a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f37867c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f37666s;
        this.f37865a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f37867c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f37666s;
        this.f37865a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37867c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f37867c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37868f == null) {
            return;
        }
        a3 a3Var = this.f37867c;
        j70 j70Var = this.f37865a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(j70Var, canvas, this, 0);
            this.f37867c.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, j70Var, this.f37868f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f37867c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f37865a, this.f37866b, a3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f37868f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            j70 j70Var = this.f37865a;
            i12 = 0;
            if (i13 == 0) {
                j70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                j70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                j70Var.getClass();
                this.d = AndroidUtilities.dp((this.f37868f.level * 14) + 18);
            }
            if (this.f37868f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                h4 h4Var = this.f37866b;
                if (h4Var != null && h4Var.G) {
                    alignment = org.telegram.ui.Components.qx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f37868f.text;
            j70 j70Var2 = this.f37865a;
            j70Var2.getClass();
            a3 p10 = j4.p(j70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f37868f, alignment2, 0, this.f37866b);
            this.f37867c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f37868f.level > 0) {
                    j70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    j70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                a3 a3Var = this.f37867c;
                a3Var.f37666s = this.d;
                a3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f37865a, this.f37866b, motionEvent, this, this.f37867c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f37868f = pageblockparagraph;
        requestLayout();
    }
}
