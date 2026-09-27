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
public final class d2 extends View implements org.telegram.ui.Cells.p9, f3 {
    public final s70 f32845a;
    public final h4 f32846b;
    public c3 f32847c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f32848f;

    public d2(Context context, s70 s70Var, h4 h4Var) {
        super(context);
        this.f32845a = s70Var;
        this.f32846b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f32847c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f32847c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f32507s;
        this.f32845a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f32847c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f32507s;
        this.f32845a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f32847c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f32507s;
        this.f32845a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f32847c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f32847c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32848f == null) {
            return;
        }
        c3 c3Var = this.f32847c;
        s70 s70Var = this.f32845a;
        if (c3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(s70Var, canvas, this, 0);
            this.f32847c.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, s70Var, this.f32848f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f32847c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.j(this.f32845a, this.f32846b, c3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f32848f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            s70 s70Var = this.f32845a;
            i12 = 0;
            if (i13 == 0) {
                s70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                s70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                s70Var.getClass();
                this.d = AndroidUtilities.dp((this.f32848f.level * 14) + 18);
            }
            if (this.f32848f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                h4 h4Var = this.f32846b;
                if (h4Var != null && h4Var.G) {
                    alignment = org.telegram.ui.Components.ww0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f32848f.text;
            s70 s70Var2 = this.f32845a;
            s70Var2.getClass();
            c3 p5 = j4.p(s70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f32848f, alignment2, 0, this.f32846b);
            this.f32847c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f32848f.level > 0) {
                    s70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    s70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                c3 c3Var = this.f32847c;
                c3Var.f32507s = this.d;
                c3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f32845a, this.f32846b, motionEvent, this, this.f32847c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f32848f = pageblockparagraph;
        requestLayout();
    }
}
