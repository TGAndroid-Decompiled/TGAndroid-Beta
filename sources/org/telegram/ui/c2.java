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
    public final v70 f34975a;
    public final g4 f34976b;
    public b3 f34977c;
    public int d;
    public int f34978e;
    public TL_iv.pageBlockParagraph f34979f;

    public c2(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f34975a = v70Var;
        this.f34976b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f34977c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f34977c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f34617s;
        this.f34975a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f34977c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f34617s;
        this.f34975a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f34977c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f34617s;
        this.f34975a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.vl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f34977c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f34977c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f34979f == null) {
            return;
        }
        b3 b3Var = this.f34977c;
        v70 v70Var = this.f34975a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f34978e);
            i4.v(v70Var, canvas, this, 0);
            this.f34977c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.f34979f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f34977c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.j(this.f34975a, this.f34976b, b3Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f34979f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            v70 v70Var = this.f34975a;
            i12 = 0;
            if (i13 == 0) {
                v70Var.getClass();
                this.f34978e = AndroidUtilities.dp(8);
                v70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f34978e = 0;
                v70Var.getClass();
                this.d = AndroidUtilities.dp((this.f34979f.level * 14) + 18);
            }
            if (this.f34979f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                g4 g4Var = this.f34976b;
                if (g4Var != null && g4Var.G) {
                    alignment = org.telegram.ui.Components.iw0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f34979f.text;
            v70 v70Var2 = this.f34975a;
            v70Var2.getClass();
            b3 p5 = i4.p(v70Var2, this, null, richText, (size - AndroidUtilities.dp(18)) - this.d, this.f34978e, this.f34979f, alignment2, 0, this.f34976b);
            this.f34977c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f34979f.level > 0) {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    v70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f34977c;
                b3Var.f34617s = this.d;
                b3Var.v = this.f34978e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f34975a, this.f34976b, motionEvent, this, this.f34977c, this.d, this.f34978e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f34979f = pageblockparagraph;
        requestLayout();
    }
}
