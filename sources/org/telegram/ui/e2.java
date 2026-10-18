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
    public final d70 f36375a;
    public final j4 f36376b;
    public d3 f36377c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f36378f;

    public e2(Context context, d70 d70Var, j4 j4Var) {
        super(context);
        this.f36375a = d70Var;
        this.f36376b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f36377c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f36377c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f36074s;
        this.f36375a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f36377c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f36074s;
        this.f36375a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f36377c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f36074s;
        this.f36375a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f36377c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f36377c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36378f == null) {
            return;
        }
        d3 d3Var = this.f36377c;
        d70 d70Var = this.f36375a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(d70Var, canvas, this, 0);
            this.f36377c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, d70Var, this.f36378f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f36377c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f36375a, this.f36376b, d3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f36378f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            d70 d70Var = this.f36375a;
            i12 = 0;
            if (i13 == 0) {
                d70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                d70Var.getClass();
                this.d = AndroidUtilities.dp((this.f36378f.level * 14) + 18);
            }
            if (this.f36378f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                j4 j4Var = this.f36376b;
                if (j4Var != null && j4Var.G) {
                    alignment = org.telegram.ui.Components.dx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f36378f.text;
            d70 d70Var2 = this.f36375a;
            d70Var2.getClass();
            d3 p5 = l4.p(d70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f36378f, alignment2, 0, this.f36376b);
            this.f36377c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f36378f.level > 0) {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                d3 d3Var = this.f36377c;
                d3Var.f36074s = this.d;
                d3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f36375a, this.f36376b, motionEvent, this, this.f36377c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f36378f = pageblockparagraph;
        requestLayout();
    }
}
