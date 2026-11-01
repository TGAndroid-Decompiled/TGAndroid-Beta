package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class q2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final l60 f40658a;
    public final f4 f40659b;
    public z2 f40660c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubtitle f40661f;

    public q2(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f40658a = l60Var;
        this.f40659b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f40660c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43793s;
        this.f40658a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f40660c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43793s;
        this.f40658a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f40660c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43793s;
        this.f40658a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.a30.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f40660c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f40660c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f40660c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40661f != null && this.f40660c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(this.f40658a, canvas, this, 0);
            this.f40660c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f40660c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754863, h4.h(this.f40658a, this.f40659b, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        l60 l60Var = this.f40658a;
        l60Var.getClass();
        this.d = org.telegram.messenger.i0.L(18);
        l60Var.getClass();
        this.e = org.telegram.messenger.i0.L(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f40661f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            l60 l60Var2 = this.f40658a;
            l60Var2.getClass();
            int L = size - org.telegram.messenger.i0.L(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f40661f;
            f4 f4Var = this.f40659b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.pv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(l60Var2, this, null, richText, L, 0, pageblocksubtitle2, alignment, 0, this.f40659b);
            this.f40660c = n10;
            if (n10 != null) {
                l60Var.getClass();
                i12 = this.f40660c.d.getHeight() + org.telegram.messenger.i0.L(16);
                z2 z2Var = this.f40660c;
                z2Var.f43793s = this.d;
                z2Var.f43794w = this.e;
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
        if (!h4.j(this.f40658a, this.f40659b, motionEvent, this, this.f40660c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f40661f = pageblocksubtitle;
        requestLayout();
    }
}
