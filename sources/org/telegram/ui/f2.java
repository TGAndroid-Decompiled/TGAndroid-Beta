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

public final class f2 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f37907a;

    public final k4 f37908b;

    public f3 f37909c;
    public int d;

    public int f37910e;

    public TL_iv.pageBlockParagraph f37911f;

    public f2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f37907a = d70Var;
        this.f37908b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f37909c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f37909c;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + f3Var.f37923s;
        this.f37907a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f37909c;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + f3Var.f37923s;
        this.f37907a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f37909c;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + f3Var.f37923s;
        this.f37907a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f37909c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f37909c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f37911f == null) {
            return;
        }
        f3 f3Var = this.f37909c;
        d70 d70Var = this.f37907a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f37910e);
            m4.v(d70Var, canvas, this, 0);
            this.f37909c.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f37911f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f37909c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.j(this.f37907a, this.f37908b, f3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignmentA;
        int iDp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f37911f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            d70 d70Var = this.f37907a;
            i12 = 0;
            if (i13 == 0) {
                d70Var.getClass();
                this.f37910e = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f37910e = 0;
                d70Var.getClass();
                this.d = AndroidUtilities.dp((this.f37911f.level * 14) + 18);
            }
            if (this.f37911f.text instanceof TL_iv.textMath) {
                alignmentA = Layout.Alignment.ALIGN_CENTER;
            } else {
                k4 k4Var = this.f37908b;
                alignmentA = (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a();
            }
            Layout.Alignment alignment = alignmentA;
            TL_iv.RichText richText = this.f37911f.text;
            d70 d70Var2 = this.f37907a;
            d70Var2.getClass();
            f3 f3VarP = m4.p(d70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f37910e, this.f37911f, alignment, 0, this.f37908b);
            this.f37909c = f3VarP;
            if (f3VarP != null) {
                int height = f3VarP.d.getHeight();
                if (this.f37911f.level > 0) {
                    d70Var.getClass();
                    iDp = AndroidUtilities.dp(8);
                } else {
                    d70Var.getClass();
                    iDp = AndroidUtilities.dp(16);
                }
                i12 = iDp + height;
                f3 f3Var = this.f37909c;
                f3Var.f37923s = this.d;
                f3Var.v = this.f37910e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.f37907a, this.f37908b, motionEvent, this, this.f37909c, this.d, this.f37910e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f37911f = pageblockparagraph;
        requestLayout();
    }
}
