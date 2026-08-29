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
public final class f2 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f37958a;
    public final k4 f37959b;
    public f3 f37960c;
    public int d;
    public int f37961e;
    public TL_iv.pageBlockParagraph f37962f;

    public f2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37958a = d70Var;
        this.f37959b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f37960c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f37960c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f37974s;
        this.f37958a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f37960c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f37974s;
        this.f37958a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f37960c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f37974s;
        this.f37958a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f37960c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f37960c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37962f == null) {
            return;
        }
        f3 f3Var = this.f37960c;
        d70 d70Var = this.f37958a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f37961e);
            m4.v(d70Var, canvas, this, 0);
            this.f37960c.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f37962f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f37960c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.f37958a, this.f37959b, f3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f37962f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            d70 d70Var = this.f37958a;
            i12 = 0;
            if (i13 == 0) {
                d70Var.getClass();
                this.f37961e = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f37961e = 0;
                d70Var.getClass();
                this.d = AndroidUtilities.dp((this.f37962f.level * 14) + 18);
            }
            if (this.f37962f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                k4 k4Var = this.f37959b;
                if (k4Var != null && k4Var.C) {
                    alignment = org.telegram.ui.Components.bw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f37962f.text;
            d70 d70Var2 = this.f37958a;
            d70Var2.getClass();
            f3 p10 = m4.p(d70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f37961e, this.f37962f, alignment2, 0, this.f37959b);
            this.f37960c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f37962f.level > 0) {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                f3 f3Var = this.f37960c;
                f3Var.f37974s = this.d;
                f3Var.v = this.f37961e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f37958a, this.f37959b, motionEvent, this, this.f37960c, this.d, this.f37961e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f37962f = pageblockparagraph;
        requestLayout();
    }
}
