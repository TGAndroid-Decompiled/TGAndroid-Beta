package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class i2 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f46035a;
    public final g4 f46036b;
    public a3 f46037c;
    public final int d;
    public int f46038e;
    public TL_iv.pageBlockRelatedArticles f46039f;

    public i2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.d = org.telegram.messenger.g0.L(18.0f);
        this.f46035a = i50Var;
        this.f46036b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f46037c;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + a3Var.f43579s;
        this.f46035a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f46037c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.f43579s;
        this.f46035a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f46037c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.f43579s;
        this.f46035a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f46037c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f46037c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f46037c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46039f != null && this.f46037c != null) {
            canvas.save();
            canvas.translate(this.d, this.f46038e);
            i4.t(this.f46035a, canvas, this, 0);
            this.f46037c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.f46037c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754857, i4.h(this.f46035a, this.f46036b, a3Var)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        i2 i2Var;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f46039f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f46039f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            g4 g4Var = this.f46036b;
            i2Var = this;
            a3 n4 = i4.n(this.f46035a, i2Var, null, pageblockrelatedarticles.title, size - org.telegram.messenger.g0.L(52.0f), 0, pageblockrelatedarticles2, alignment, 1, g4Var);
            i2Var.f46037c = n4;
            if (n4 != null) {
                i2Var.f46038e = ((org.telegram.messenger.g0.L(32.0f) - i2Var.f46037c.d.getHeight()) / 2) + org.telegram.messenger.g0.L(6.0f);
            }
        } else {
            i2Var = this;
        }
        if (i2Var.f46037c != null) {
            setMeasuredDimension(size, org.telegram.messenger.g0.L(38.0f));
            a3 a3Var = i2Var.f46037c;
            a3Var.f43579s = i2Var.d;
            a3Var.f43580w = i2Var.f46038e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f46035a, this.f46036b, motionEvent, this, this.f46037c, this.d, this.f46038e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f46039f = pageblockrelatedarticles;
        requestLayout();
    }
}
