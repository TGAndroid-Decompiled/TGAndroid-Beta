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
public final class d2 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final n70 f33487a;
    public final j4 f33488b;
    public d3 f33489c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f33490f;

    public d2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f33487a = n70Var;
        this.f33488b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f33489c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f33489c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f33499s;
        this.f33487a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f33489c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f33499s;
        this.f33487a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f33489c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + d3Var.f33499s;
        this.f33487a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f33489c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f33489c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33490f == null) {
            return;
        }
        d3 d3Var = this.f33489c;
        n70 n70Var = this.f33487a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(n70Var, canvas, this, 0);
            this.f33489c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, n70Var, this.f33490f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f33489c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f33487a, this.f33488b, d3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f33490f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            n70 n70Var = this.f33487a;
            i12 = 0;
            if (i13 == 0) {
                n70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                n70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                n70Var.getClass();
                this.d = AndroidUtilities.dp((this.f33490f.level * 14) + 18);
            }
            if (this.f33490f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                j4 j4Var = this.f33488b;
                if (j4Var != null && j4Var.D) {
                    alignment = org.telegram.ui.Components.kw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f33490f.text;
            n70 n70Var2 = this.f33487a;
            n70Var2.getClass();
            d3 p10 = l4.p(n70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f33490f, alignment2, 0, this.f33488b);
            this.f33489c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f33490f.level > 0) {
                    n70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    n70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                d3 d3Var = this.f33489c;
                d3Var.f33499s = this.d;
                d3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f33487a, this.f33488b, motionEvent, this, this.f33489c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f33490f = pageblockparagraph;
        requestLayout();
    }
}
