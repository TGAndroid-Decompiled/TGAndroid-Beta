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
public final class f2 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f33921a;
    public final l4 f33922b;
    public f3 f33923c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f33924f;

    public f2(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f33921a = p70Var;
        this.f33922b = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f33923c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f33923c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f33933s;
        this.f33921a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f33923c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f33933s;
        this.f33921a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f33923c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f33933s;
        this.f33921a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f33923c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f33923c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f33924f == null) {
            return;
        }
        f3 f3Var = this.f33923c;
        p70 p70Var = this.f33921a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            n4.v(p70Var, canvas, this, 0);
            this.f33923c.draw(canvas, this);
            canvas.restore();
        }
        n4.u(canvas, p70Var, this.f33924f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f33923c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.j(this.f33921a, this.f33922b, f3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f33924f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            p70 p70Var = this.f33921a;
            i12 = 0;
            if (i13 == 0) {
                p70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                p70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                p70Var.getClass();
                this.d = AndroidUtilities.dp((this.f33924f.level * 14) + 18);
            }
            if (this.f33924f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                l4 l4Var = this.f33922b;
                if (l4Var != null && l4Var.D) {
                    alignment = org.telegram.ui.Components.kw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f33924f.text;
            p70 p70Var2 = this.f33921a;
            p70Var2.getClass();
            f3 p10 = n4.p(p70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f33924f, alignment2, 0, this.f33922b);
            this.f33923c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f33924f.level > 0) {
                    p70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    p70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                f3 f3Var = this.f33923c;
                f3Var.f33933s = this.d;
                f3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.f33921a, this.f33922b, motionEvent, this, this.f33923c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f33924f = pageblockparagraph;
        requestLayout();
    }
}
