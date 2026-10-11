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
    public final t70 f36240a;
    public final f4 f36241b;
    public a3 f36242c;
    public int d;
    public int f36243e;
    public TL_iv.pageBlockParagraph f36244f;

    public b2(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f36240a = t70Var;
        this.f36241b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f36242c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f36242c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f35862s;
        this.f36240a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f36242c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f35862s;
        this.f36240a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f36242c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f35862s;
        this.f36240a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f36242c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f36242c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36244f == null) {
            return;
        }
        a3 a3Var = this.f36242c;
        t70 t70Var = this.f36240a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f36243e);
            h4.v(t70Var, canvas, this, 0);
            this.f36242c.draw(canvas, this);
            canvas.restore();
        }
        h4.u(canvas, t70Var, this.f36244f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f36242c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f36240a, this.f36241b, a3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f36244f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            t70 t70Var = this.f36240a;
            i12 = 0;
            if (i13 == 0) {
                t70Var.getClass();
                this.f36243e = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f36243e = 0;
                t70Var.getClass();
                this.d = AndroidUtilities.dp((this.f36244f.level * 14) + 18);
            }
            if (this.f36244f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                f4 f4Var = this.f36241b;
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.ox0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f36244f.text;
            t70 t70Var2 = this.f36240a;
            t70Var2.getClass();
            a3 p5 = h4.p(t70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f36243e, this.f36244f, alignment2, 0, this.f36241b);
            this.f36242c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f36244f.level > 0) {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                a3 a3Var = this.f36242c;
                a3Var.f35862s = this.d;
                a3Var.v = this.f36243e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f36240a, this.f36241b, motionEvent, this, this.f36242c, this.d, this.f36243e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f36244f = pageblockparagraph;
        requestLayout();
    }
}
