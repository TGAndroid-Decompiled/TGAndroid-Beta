package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class q2 extends View implements org.telegram.ui.Cells.i9, c3 {
    public final p50 f50985a;
    public final e4 f50986b;
    public z2 f50987c;
    public int d;
    public int f50988e;
    public TL_iv.pageBlockSubtitle f50989f;

    public q2(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f50985a = p50Var;
        this.f50986b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f50987c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f54332s;
        this.f50985a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f50987c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f54332s;
        this.f50985a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f50987c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f54332s;
        this.f50985a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.n10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50987c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50987c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50987c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50989f != null && this.f50987c != null) {
            canvas.save();
            canvas.translate(this.d, this.f50988e);
            g4.t(this.f50985a, canvas, this, 0);
            this.f50987c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50987c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f50985a, this.f50986b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        p50 p50Var = this.f50985a;
        p50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        p50Var.getClass();
        this.f50988e = org.telegram.messenger.g0.L(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f50989f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            p50 p50Var2 = this.f50985a;
            p50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f50989f;
            e4 e4Var = this.f50986b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.wu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(p50Var2, this, null, richText, L, 0, pageblocksubtitle2, alignment, 0, this.f50986b);
            this.f50987c = n10;
            if (n10 != null) {
                p50Var.getClass();
                i11 = this.f50987c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f50987c;
                z2Var.f54332s = this.d;
                z2Var.f54333w = this.f50988e;
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
        if (!g4.j(this.f50985a, this.f50986b, motionEvent, this, this.f50987c, this.d, this.f50988e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f50989f = pageblocksubtitle;
        requestLayout();
    }
}
