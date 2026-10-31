package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 f35521a;
    public final f4 f35522b;
    public z2 f35523c;
    public int d;
    public int e;
    public TL_iv.pageBlockParagraph f35524f;

    public a2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.f35521a = m60Var;
        this.f35522b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f35523c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43990s;
        this.f35521a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f35523c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43990s;
        this.f35521a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f35523c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43990s;
        this.f35521a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f35523c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f35523c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f35523c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35524f == null) {
            return;
        }
        z2 z2Var = this.f35523c;
        m60 m60Var = this.f35521a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(m60Var, canvas, this, 0);
            this.f35523c.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, m60Var, this.f35524f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f35523c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.h(this.f35521a, this.f35522b, z2Var));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f35524f;
        if (pageblockparagraph != null) {
            int i13 = pageblockparagraph.level;
            m60 m60Var = this.f35521a;
            i12 = 0;
            if (i13 == 0) {
                m60Var.getClass();
                this.e = org.telegram.messenger.i0.L(8);
                m60Var.getClass();
                this.d = org.telegram.messenger.i0.L(18);
            } else {
                this.e = 0;
                m60Var.getClass();
                this.d = org.telegram.messenger.i0.L((this.f35524f.level * 14) + 18);
            }
            if (this.f35524f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                f4 f4Var = this.f35522b;
                if (f4Var != null && f4Var.G) {
                    alignment = org.telegram.ui.Components.ov0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f35524f.text;
            m60 m60Var2 = this.f35521a;
            m60Var2.getClass();
            z2 n10 = h4.n(m60Var2, this, null, richText, (size - org.telegram.messenger.i0.L(18)) - this.d, this.e, this.f35524f, alignment2, 0, this.f35522b);
            this.f35523c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight();
                if (this.f35524f.level > 0) {
                    m60Var.getClass();
                    L = org.telegram.messenger.i0.L(8);
                } else {
                    m60Var.getClass();
                    L = org.telegram.messenger.i0.L(16);
                }
                i12 = L + height;
                z2 z2Var = this.f35523c;
                z2Var.f43990s = this.d;
                z2Var.f43991w = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f35521a, this.f35522b, motionEvent, this, this.f35523c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f35524f = pageblockparagraph;
        requestLayout();
    }
}
