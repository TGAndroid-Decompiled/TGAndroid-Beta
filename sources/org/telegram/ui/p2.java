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
    public final p50 f50660a;
    public final e4 f50661b;
    public z2 f50662c;
    public int d;
    public int f50663e;
    public TL_iv.pageBlockSubheader f50664f;

    public p2(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f50660a = p50Var;
        this.f50661b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f50662c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f54332s;
        this.f50660a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f50662c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f54332s;
        this.f50660a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f50662c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f54332s;
        this.f50660a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.n10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50662c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50662c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50662c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50664f != null && this.f50662c != null) {
            canvas.save();
            canvas.translate(this.d, this.f50663e);
            g4.t(this.f50660a, canvas, this, 0);
            this.f50662c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50662c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f50660a, this.f50661b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        p50 p50Var = this.f50660a;
        p50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        p50Var.getClass();
        this.f50663e = org.telegram.messenger.g0.L(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f50664f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            p50 p50Var2 = this.f50660a;
            p50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f50664f;
            e4 e4Var = this.f50661b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.wu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(p50Var2, this, null, richText, L, 0, pageblocksubheader2, alignment, 0, this.f50661b);
            this.f50662c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight() + this.f50663e;
                int i12 = this.f50663e;
                i11 = height + i12;
                z2 z2Var = this.f50662c;
                z2Var.f54332s = this.d;
                z2Var.f54333w = i12;
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
        if (!g4.j(this.f50660a, this.f50661b, motionEvent, this, this.f50662c, this.d, this.f50663e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f50664f = pageblocksubheader;
        requestLayout();
    }
}
