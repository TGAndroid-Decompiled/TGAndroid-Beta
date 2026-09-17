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
    public final v70 f35003a;
    public final g4 f35004b;
    public b3 f35005c;
    public int d;
    public int f35006e;
    public TL_iv.pageBlockParagraph f35007f;

    public c2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f35003a = v70Var;
        this.f35004b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f35005c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f35005c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f34645s;
        this.f35003a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f35005c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f34645s;
        this.f35003a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f35005c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f34645s;
        this.f35003a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f35005c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f35005c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35007f == null) {
            return;
        }
        b3 b3Var = this.f35005c;
        v70 v70Var = this.f35003a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f35006e);
            i4.v(v70Var, canvas, this, 0);
            this.f35005c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.f35007f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f35005c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f35003a, this.f35004b, b3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f35007f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            v70 v70Var = this.f35003a;
            i12 = 0;
            if (i13 == 0) {
                v70Var.getClass();
                this.f35006e = AndroidUtilities.dp(8);
                v70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f35006e = 0;
                v70Var.getClass();
                this.d = AndroidUtilities.dp((this.f35007f.level * 14) + 18);
            }
            if (this.f35007f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                g4 g4Var = this.f35004b;
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.iw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f35007f.text;
            v70 v70Var2 = this.f35003a;
            v70Var2.getClass();
            b3 p5 = i4.p(v70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f35006e, this.f35007f, alignment2, 0, this.f35004b);
            this.f35005c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f35007f.level > 0) {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f35005c;
                b3Var.f34645s = this.d;
                b3Var.v = this.f35006e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f35003a, this.f35004b, motionEvent, this, this.f35005c, this.d, this.f35006e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f35007f = pageblockparagraph;
        requestLayout();
    }
}
