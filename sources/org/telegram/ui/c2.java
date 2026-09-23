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
public final class c2 extends View implements org.telegram.ui.Cells.q9, e3 {
    public final r70 f32237a;
    public final g4 f32238b;
    public b3 f32239c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f32240f;

    public c2(Context context, r70 r70Var, g4 g4Var) {
        super(context);
        this.f32237a = r70Var;
        this.f32238b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f32239c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f32239c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f31947s;
        this.f32237a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f32239c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f31947s;
        this.f32237a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f32239c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f31947s;
        this.f32237a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ul.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f32239c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f32239c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32240f == null) {
            return;
        }
        b3 b3Var = this.f32239c;
        r70 r70Var = this.f32237a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            i4.v(r70Var, canvas, this, 0);
            this.f32239c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, r70Var, this.f32240f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f32239c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f32237a, this.f32238b, b3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f32240f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            r70 r70Var = this.f32237a;
            i12 = 0;
            if (i13 == 0) {
                r70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                r70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                r70Var.getClass();
                this.d = AndroidUtilities.dp((this.f32240f.level * 14) + 18);
            }
            if (this.f32240f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                g4 g4Var = this.f32238b;
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.jw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f32240f.text;
            r70 r70Var2 = this.f32237a;
            r70Var2.getClass();
            b3 p5 = i4.p(r70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f32240f, alignment2, 0, this.f32238b);
            this.f32239c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f32240f.level > 0) {
                    r70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    r70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f32239c;
                b3Var.f31947s = this.d;
                b3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f32237a, this.f32238b, motionEvent, this, this.f32239c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f32240f = pageblockparagraph;
        requestLayout();
    }
}
