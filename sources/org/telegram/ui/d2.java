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
public final class d2 extends View implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f36481a;
    public final i4 f36482b;
    public c3 f36483c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f36484f;

    public d2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f36481a = f70Var;
        this.f36482b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f36483c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f36483c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f36233s;
        this.f36481a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f36483c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f36233s;
        this.f36481a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f36483c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f36233s;
        this.f36481a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f36483c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f36483c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36484f == null) {
            return;
        }
        c3 c3Var = this.f36483c;
        f70 f70Var = this.f36481a;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(f70Var, canvas, this, 0);
            this.f36483c.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, f70Var, this.f36484f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f36483c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f36481a, this.f36482b, c3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f36484f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            f70 f70Var = this.f36481a;
            i12 = 0;
            if (i13 == 0) {
                f70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                f70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                f70Var.getClass();
                this.d = AndroidUtilities.dp((this.f36484f.level * 14) + 18);
            }
            if (this.f36484f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                i4 i4Var = this.f36482b;
                if (i4Var != null && i4Var.G) {
                    alignment = org.telegram.ui.Components.ix0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f36484f.text;
            f70 f70Var2 = this.f36481a;
            f70Var2.getClass();
            c3 p5 = k4.p(f70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f36484f, alignment2, 0, this.f36482b);
            this.f36483c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f36484f.level > 0) {
                    f70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    f70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                c3 c3Var = this.f36483c;
                c3Var.f36233s = this.d;
                c3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f36481a, this.f36482b, motionEvent, this, this.f36483c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f36484f = pageblockparagraph;
        requestLayout();
    }
}
