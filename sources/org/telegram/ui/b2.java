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
public final class b2 extends View implements org.telegram.ui.Cells.p9, d3 {
    public final w70 f32026a;
    public final f4 f32027b;
    public a3 f32028c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f32029f;

    public b2(Context context, w70 w70Var, f4 f4Var) {
        super(context);
        this.f32026a = w70Var;
        this.f32027b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f32028c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f32028c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f31698s;
        this.f32026a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f32028c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f31698s;
        this.f32026a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f32028c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f31698s;
        this.f32026a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f32028c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f32028c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32029f == null) {
            return;
        }
        a3 a3Var = this.f32028c;
        w70 w70Var = this.f32026a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.v(w70Var, canvas, this, 0);
            this.f32028c.draw(canvas, this);
            canvas.restore();
        }
        h4.u(canvas, w70Var, this.f32029f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f32028c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f32026a, this.f32027b, a3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f32029f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            w70 w70Var = this.f32026a;
            i12 = 0;
            if (i13 == 0) {
                w70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                w70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                w70Var.getClass();
                this.d = AndroidUtilities.dp((this.f32029f.level * 14) + 18);
            }
            if (this.f32029f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                f4 f4Var = this.f32027b;
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.kw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f32029f.text;
            w70 w70Var2 = this.f32026a;
            w70Var2.getClass();
            a3 p5 = h4.p(w70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f32029f, alignment2, 0, this.f32027b);
            this.f32028c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f32029f.level > 0) {
                    w70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    w70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                a3 a3Var = this.f32028c;
                a3Var.f31698s = this.d;
                a3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f32026a, this.f32027b, motionEvent, this, this.f32028c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f32029f = pageblockparagraph;
        requestLayout();
    }
}
