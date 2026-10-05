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
public final class c2 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final t70 f35284a;
    public final g4 f35285b;
    public b3 f35286c;
    public int d;
    public int f35287e;
    public TL_iv.pageBlockParagraph f35288f;

    public c2(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f35284a = t70Var;
        this.f35285b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f35286c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f35286c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f35035s;
        this.f35284a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f35286c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f35035s;
        this.f35284a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f35286c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f35035s;
        this.f35284a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f35286c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f35286c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35288f == null) {
            return;
        }
        b3 b3Var = this.f35286c;
        t70 t70Var = this.f35284a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f35287e);
            i4.v(t70Var, canvas, this, 0);
            this.f35286c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, t70Var, this.f35288f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f35286c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f35284a, this.f35285b, b3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f35288f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            t70 t70Var = this.f35284a;
            i12 = 0;
            if (i13 == 0) {
                t70Var.getClass();
                this.f35287e = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f35287e = 0;
                t70Var.getClass();
                this.d = AndroidUtilities.dp((this.f35288f.level * 14) + 18);
            }
            if (this.f35288f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                g4 g4Var = this.f35285b;
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.gx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f35288f.text;
            t70 t70Var2 = this.f35284a;
            t70Var2.getClass();
            b3 p5 = i4.p(t70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f35287e, this.f35288f, alignment2, 0, this.f35285b);
            this.f35286c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f35288f.level > 0) {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f35286c;
                b3Var.f35035s = this.d;
                b3Var.v = this.f35287e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f35284a, this.f35285b, motionEvent, this, this.f35286c, this.d, this.f35287e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f35288f = pageblockparagraph;
        requestLayout();
    }
}
