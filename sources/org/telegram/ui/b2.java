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
public final class b2 extends View implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f36274a;
    public final f4 f36275b;
    public a3 f36276c;
    public int d;
    public int f36277e;
    public TL_iv.pageBlockParagraph f36278f;

    public b2(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f36274a = t70Var;
        this.f36275b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f36276c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f36276c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f35896s;
        this.f36274a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f36276c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f35896s;
        this.f36274a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f36276c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f35896s;
        this.f36274a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f36276c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f36276c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36278f == null) {
            return;
        }
        a3 a3Var = this.f36276c;
        t70 t70Var = this.f36274a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f36277e);
            h4.v(t70Var, canvas, this, 0);
            this.f36276c.draw(canvas, this);
            canvas.restore();
        }
        h4.u(canvas, t70Var, this.f36278f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f36276c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f36274a, this.f36275b, a3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f36278f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            t70 t70Var = this.f36274a;
            i12 = 0;
            if (i13 == 0) {
                t70Var.getClass();
                this.f36277e = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f36277e = 0;
                t70Var.getClass();
                this.d = AndroidUtilities.dp((this.f36278f.level * 14) + 18);
            }
            if (this.f36278f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                f4 f4Var = this.f36275b;
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.nx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f36278f.text;
            t70 t70Var2 = this.f36274a;
            t70Var2.getClass();
            a3 p5 = h4.p(t70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f36277e, this.f36278f, alignment2, 0, this.f36275b);
            this.f36276c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f36278f.level > 0) {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                a3 a3Var = this.f36276c;
                a3Var.f35896s = this.d;
                a3Var.v = this.f36277e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f36274a, this.f36275b, motionEvent, this, this.f36276c, this.d, this.f36277e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f36278f = pageblockparagraph;
        requestLayout();
    }
}
