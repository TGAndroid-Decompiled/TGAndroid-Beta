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
public final class e2 extends View implements org.telegram.ui.Cells.n9, g3 {
    public final z70 f35435a;
    public final i4 f35436b;
    public d3 f35437c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f35438f;

    public e2(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f35435a = z70Var;
        this.f35436b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f35437c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f35437c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f35132s;
        this.f35435a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f35437c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f35132s;
        this.f35435a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f35437c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f35132s;
        this.f35435a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.yh.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f35437c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f35437c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35438f == null) {
            return;
        }
        d3 d3Var = this.f35437c;
        z70 z70Var = this.f35435a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(z70Var, canvas, this, 0);
            this.f35437c.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, z70Var, this.f35438f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f35437c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.j(this.f35435a, this.f35436b, d3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f35438f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            z70 z70Var = this.f35435a;
            i12 = 0;
            if (i13 == 0) {
                z70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                z70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                z70Var.getClass();
                this.d = AndroidUtilities.dp((this.f35438f.level * 14) + 18);
            }
            if (this.f35438f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                i4 i4Var = this.f35436b;
                if (i4Var != null && i4Var.G) {
                    alignment = org.telegram.ui.Components.ix0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f35438f.text;
            z70 z70Var2 = this.f35435a;
            z70Var2.getClass();
            d3 p5 = k4.p(z70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.e, this.f35438f, alignment2, 0, this.f35436b);
            this.f35437c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f35438f.level > 0) {
                    z70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    z70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                d3 d3Var = this.f35437c;
                d3Var.f35132s = this.d;
                d3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f35435a, this.f35436b, motionEvent, this, this.f35437c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f35438f = pageblockparagraph;
        requestLayout();
    }
}
