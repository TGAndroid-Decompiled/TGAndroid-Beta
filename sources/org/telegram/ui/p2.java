package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class p2 extends View implements org.telegram.ui.Cells.i9, c3 {
    public final p50 f50703a;
    public final e4 f50704b;
    public z2 f50705c;
    public int d;
    public int f50706e;
    public TL_iv.pageBlockSubheader f50707f;

    public p2(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f50703a = p50Var;
        this.f50704b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f50705c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f54378s;
        this.f50703a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f50705c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f54378s;
        this.f50703a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f50705c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f54378s;
        this.f50703a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.o10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50705c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50705c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50705c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50707f != null && this.f50705c != null) {
            canvas.save();
            canvas.translate(this.d, this.f50706e);
            g4.t(this.f50703a, canvas, this, 0);
            this.f50705c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50705c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754862, g4.h(this.f50703a, this.f50704b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        p50 p50Var = this.f50703a;
        p50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        p50Var.getClass();
        this.f50706e = org.telegram.messenger.g0.L(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f50707f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            p50 p50Var2 = this.f50703a;
            p50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f50707f;
            e4 e4Var = this.f50704b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.zu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(p50Var2, this, null, richText, L, 0, pageblocksubheader2, alignment, 0, this.f50704b);
            this.f50705c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight() + this.f50706e;
                int i12 = this.f50706e;
                i11 = height + i12;
                z2 z2Var = this.f50705c;
                z2Var.f54378s = this.d;
                z2Var.f54379w = i12;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f50703a, this.f50704b, motionEvent, this, this.f50705c, this.d, this.f50706e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f50707f = pageblocksubheader;
        requestLayout();
    }
}
