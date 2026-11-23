package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class q2 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final p50 f51286a;
    public final e4 f51287b;
    public z2 f51288c;
    public int d;
    public int f51289e;
    public TL_iv.pageBlockSubtitle f51290f;

    public q2(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f51286a = p50Var;
        this.f51287b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f51288c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f54496s;
        this.f51286a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f51288c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f54496s;
        this.f51286a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f51288c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f54496s;
        this.f51286a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.m10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f51288c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f51288c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f51288c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f51290f != null && this.f51288c != null) {
            canvas.save();
            canvas.translate(this.d, this.f51289e);
            g4.t(this.f51286a, canvas, this, 0);
            this.f51288c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f51288c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754862, g4.h(this.f51286a, this.f51287b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        p50 p50Var = this.f51286a;
        p50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        p50Var.getClass();
        this.f51289e = org.telegram.messenger.g0.L(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f51290f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            p50 p50Var2 = this.f51286a;
            p50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f51290f;
            e4 e4Var = this.f51287b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.yu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(p50Var2, this, null, richText, L, 0, pageblocksubtitle2, alignment, 0, this.f51287b);
            this.f51288c = n10;
            if (n10 != null) {
                p50Var.getClass();
                i11 = this.f51288c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f51288c;
                z2Var.f54496s = this.d;
                z2Var.f54497w = this.f51289e;
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
        if (!g4.j(this.f51286a, this.f51287b, motionEvent, this, this.f51288c, this.d, this.f51289e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f51290f = pageblocksubtitle;
        requestLayout();
    }
}
