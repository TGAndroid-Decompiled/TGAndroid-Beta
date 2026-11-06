package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class h2 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final o50 f46176a;
    public final e4 f46177b;
    public z2 f46178c;
    public final int d;
    public int f46179e;
    public TL_iv.pageBlockRelatedArticles f46180f;

    public h2(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.d = org.telegram.messenger.g0.L(18.0f);
        this.f46176a = o50Var;
        this.f46177b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f46178c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f52436s;
        this.f46176a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f46178c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f52436s;
        this.f46176a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f46178c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f52436s;
        this.f46176a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f46178c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f46178c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f46178c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46180f != null && this.f46178c != null) {
            canvas.save();
            canvas.translate(this.d, this.f46179e);
            g4.t(this.f46176a, canvas, this, 0);
            this.f46178c.d(canvas, this);
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
        z2 z2Var = this.f46178c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754857, g4.h(this.f46176a, this.f46177b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        h2 h2Var;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f46180f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f46180f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            e4 e4Var = this.f46177b;
            h2Var = this;
            z2 n10 = g4.n(this.f46176a, h2Var, null, pageblockrelatedarticles.title, size - org.telegram.messenger.g0.L(52.0f), 0, pageblockrelatedarticles2, alignment, 1, e4Var);
            h2Var.f46178c = n10;
            if (n10 != null) {
                h2Var.f46179e = ((org.telegram.messenger.g0.L(32.0f) - h2Var.f46178c.d.getHeight()) / 2) + org.telegram.messenger.g0.L(6.0f);
            }
        } else {
            h2Var = this;
        }
        if (h2Var.f46178c != null) {
            setMeasuredDimension(size, org.telegram.messenger.g0.L(38.0f));
            z2 z2Var = h2Var.f46178c;
            z2Var.f52436s = h2Var.d;
            z2Var.f52437w = h2Var.f46179e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f46176a, this.f46177b, motionEvent, this, this.f46178c, this.d, this.f46179e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f46180f = pageblockrelatedarticles;
        requestLayout();
    }
}
