package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a2 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f43563a;
    public final g4 f43564b;
    public a3 f43565c;
    public int d;
    public int f43566e;
    public TL_iv.pageBlockParagraph f43567f;

    public a2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f43563a = i50Var;
        this.f43564b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f43565c;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + a3Var.f43579s;
        this.f43563a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f43565c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.f43579s;
        this.f43563a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f43565c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.f43579s;
        this.f43563a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f43565c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f43565c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f43565c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43567f == null) {
            return;
        }
        a3 a3Var = this.f43565c;
        i50 i50Var = this.f43563a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f43566e);
            i4.t(i50Var, canvas, this, 0);
            this.f43565c.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.f43567f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f43565c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.h(this.f43563a, this.f43564b, a3Var));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f43567f;
        if (pageblockparagraph != null) {
            int i12 = pageblockparagraph.level;
            i50 i50Var = this.f43563a;
            i11 = 0;
            if (i12 == 0) {
                i50Var.getClass();
                this.f43566e = org.telegram.messenger.g0.L(8);
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L(18);
            } else {
                this.f43566e = 0;
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L((this.f43567f.level * 14) + 18);
            }
            if (this.f43567f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                g4 g4Var = this.f43564b;
                if (g4Var != null && g4Var.H) {
                    alignment = org.telegram.ui.Components.lu0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f43567f.text;
            i50 i50Var2 = this.f43563a;
            i50Var2.getClass();
            a3 n4 = i4.n(i50Var2, this, null, richText, (size - org.telegram.messenger.g0.L(18)) - this.d, this.f43566e, this.f43567f, alignment2, 0, this.f43564b);
            this.f43565c = n4;
            if (n4 != null) {
                int height = n4.d.getHeight();
                if (this.f43567f.level > 0) {
                    i50Var.getClass();
                    L = org.telegram.messenger.g0.L(8);
                } else {
                    i50Var.getClass();
                    L = org.telegram.messenger.g0.L(16);
                }
                i11 = L + height;
                a3 a3Var = this.f43565c;
                a3Var.f43579s = this.d;
                a3Var.f43580w = this.f43566e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f43563a, this.f43564b, motionEvent, this, this.f43565c, this.d, this.f43566e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f43567f = pageblockparagraph;
        requestLayout();
    }
}
