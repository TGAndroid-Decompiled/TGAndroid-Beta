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
    public final f70 f36449a;
    public final i4 f36450b;
    public c3 f36451c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f36452f;

    public d2(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f36449a = f70Var;
        this.f36450b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f36451c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f36451c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f36208s;
        this.f36449a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f36451c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f36208s;
        this.f36449a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f36451c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f36208s;
        this.f36449a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.tl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f36451c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f36451c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36452f == null) {
            return;
        }
        c3 c3Var = this.f36451c;
        f70 f70Var = this.f36449a;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(f70Var, canvas, this, 0);
            this.f36451c.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, f70Var, this.f36452f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f36451c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f36449a, this.f36450b, c3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f36452f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            f70 f70Var = this.f36449a;
            i12 = 0;
            if (i13 == 0) {
                f70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                f70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                f70Var.getClass();
                this.d = AndroidUtilities.dp((this.f36452f.level * 14) + 18);
            }
            if (this.f36452f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                i4 i4Var = this.f36450b;
                if (i4Var != null && i4Var.G) {
                    alignment = org.telegram.ui.Components.hx0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f36452f.text;
            f70 f70Var2 = this.f36449a;
            f70Var2.getClass();
            c3 p5 = k4.p(f70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f36452f, alignment2, 0, this.f36450b);
            this.f36451c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f36452f.level > 0) {
                    f70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    f70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                c3 c3Var = this.f36451c;
                c3Var.f36208s = this.d;
                c3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f36449a, this.f36450b, motionEvent, this, this.f36451c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f36452f = pageblockparagraph;
        requestLayout();
    }
}
