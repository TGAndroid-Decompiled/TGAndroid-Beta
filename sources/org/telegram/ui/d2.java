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
    public final o70 f35941a;
    public final j4 f35942b;
    public d3 f35943c;
    public int d;
    public int f35944e;
    public TL_iv.pageBlockParagraph f35945f;

    public d2(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f35941a = o70Var;
        this.f35942b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35943c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f35943c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f35964s;
        this.f35941a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f35943c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f35964s;
        this.f35941a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f35943c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + d3Var.f35964s;
        this.f35941a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35943c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35943c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35945f == null) {
            return;
        }
        d3 d3Var = this.f35943c;
        o70 o70Var = this.f35941a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f35944e);
            l4.v(o70Var, canvas, this, 0);
            this.f35943c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, o70Var, this.f35945f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f35943c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.j(this.f35941a, this.f35942b, d3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f35945f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            o70 o70Var = this.f35941a;
            i12 = 0;
            if (i13 == 0) {
                o70Var.getClass();
                this.f35944e = AndroidUtilities.dp(8);
                o70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f35944e = 0;
                o70Var.getClass();
                this.d = AndroidUtilities.dp((this.f35945f.level * 14) + 18);
            }
            if (this.f35945f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                j4 j4Var = this.f35942b;
                if (j4Var != null && j4Var.D) {
                    alignment = org.telegram.ui.Components.kw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f35945f.text;
            o70 o70Var2 = this.f35941a;
            o70Var2.getClass();
            d3 p10 = l4.p(o70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f35944e, this.f35945f, alignment2, 0, this.f35942b);
            this.f35943c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f35945f.level > 0) {
                    o70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    o70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                d3 d3Var = this.f35943c;
                d3Var.f35964s = this.d;
                d3Var.v = this.f35944e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f35941a, this.f35942b, motionEvent, this, this.f35943c, this.d, this.f35944e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f35945f = pageblockparagraph;
        requestLayout();
    }
}
