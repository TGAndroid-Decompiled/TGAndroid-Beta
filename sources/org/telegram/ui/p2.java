package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class p2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 f40428a;
    public final f4 f40429b;
    public z2 f40430c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubheader f40431f;

    public p2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.f40428a = m60Var;
        this.f40429b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f40430c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43990s;
        this.f40428a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f40430c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43990s;
        this.f40428a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f40430c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43990s;
        this.f40428a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f40430c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f40430c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f40430c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40431f != null && this.f40430c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(this.f40428a, canvas, this, 0);
            this.f40430c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f40430c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754863, h4.h(this.f40428a, this.f40429b, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        m60 m60Var = this.f40428a;
        m60Var.getClass();
        this.d = org.telegram.messenger.i0.L(18);
        m60Var.getClass();
        this.e = org.telegram.messenger.i0.L(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f40431f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            m60 m60Var2 = this.f40428a;
            m60Var2.getClass();
            int L = size - org.telegram.messenger.i0.L(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f40431f;
            f4 f4Var = this.f40429b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.ov0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(m60Var2, this, null, richText, L, 0, pageblocksubheader2, alignment, 0, this.f40429b);
            this.f40430c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight() + this.e;
                int i13 = this.e;
                i12 = height + i13;
                z2 z2Var = this.f40430c;
                z2Var.f43990s = this.d;
                z2Var.f43991w = i13;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f40428a, this.f40429b, motionEvent, this, this.f40430c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f40431f = pageblocksubheader;
        requestLayout();
    }
}
