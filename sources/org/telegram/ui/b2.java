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
public final class b2 extends View implements org.telegram.ui.Cells.q9, d3 {
    public final u70 f32238a;
    public final f4 f32239b;
    public a3 f32240c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f32241f;

    public b2(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f32238a = u70Var;
        this.f32239b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f32240c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f32240c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f31975s;
        this.f32238a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f32240c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f31975s;
        this.f32238a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f32240c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f31975s;
        this.f32238a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f32240c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f32240c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f32241f == null) {
            return;
        }
        a3 a3Var = this.f32240c;
        u70 u70Var = this.f32238a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.v(u70Var, canvas, this, 0);
            this.f32240c.draw(canvas, this);
            canvas.restore();
        }
        h4.u(canvas, u70Var, this.f32241f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f32240c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.j(this.f32238a, this.f32239b, a3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f32241f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            u70 u70Var = this.f32238a;
            i12 = 0;
            if (i13 == 0) {
                u70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                u70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                u70Var.getClass();
                this.d = AndroidUtilities.dp((this.f32241f.level * 14) + 18);
            }
            if (this.f32241f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                f4 f4Var = this.f32239b;
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.uw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f32241f.text;
            u70 u70Var2 = this.f32238a;
            u70Var2.getClass();
            a3 p5 = h4.p(u70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f32241f, alignment2, 0, this.f32239b);
            this.f32240c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f32241f.level > 0) {
                    u70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    u70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                a3 a3Var = this.f32240c;
                a3Var.f31975s = this.d;
                a3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f32238a, this.f32239b, motionEvent, this, this.f32240c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f32241f = pageblockparagraph;
        requestLayout();
    }
}
