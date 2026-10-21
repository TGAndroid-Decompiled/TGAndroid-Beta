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
public final class e2 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f36525a;
    public final j4 f36526b;
    public d3 f36527c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f36528f;

    public e2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f36525a = b70Var;
        this.f36526b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f36527c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f36527c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f36242s;
        this.f36525a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f36527c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f36242s;
        this.f36525a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f36527c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f36242s;
        this.f36525a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.mk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f36527c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f36527c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36528f == null) {
            return;
        }
        d3 d3Var = this.f36527c;
        b70 b70Var = this.f36525a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(b70Var, canvas, this, 0);
            this.f36527c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, b70Var, this.f36528f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f36527c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f36525a, this.f36526b, d3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f36528f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            b70 b70Var = this.f36525a;
            i12 = 0;
            if (i13 == 0) {
                b70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                b70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                b70Var.getClass();
                this.d = AndroidUtilities.dp((this.f36528f.level * 14) + 18);
            }
            if (this.f36528f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                j4 j4Var = this.f36526b;
                if (j4Var != null && j4Var.G) {
                    alignment = org.telegram.ui.Components.fx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f36528f.text;
            b70 b70Var2 = this.f36525a;
            b70Var2.getClass();
            d3 p5 = l4.p(b70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f36528f, alignment2, 0, this.f36526b);
            this.f36527c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f36528f.level > 0) {
                    b70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    b70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                d3 d3Var = this.f36527c;
                d3Var.f36242s = this.d;
                d3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f36525a, this.f36526b, motionEvent, this, this.f36527c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f36528f = pageblockparagraph;
        requestLayout();
    }
}
