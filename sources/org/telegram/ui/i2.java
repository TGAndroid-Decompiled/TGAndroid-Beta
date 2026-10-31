package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class i2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 f38097a;
    public final f4 f38098b;
    public z2 f38099c;
    public final int d;
    public int e;
    public TL_iv.pageBlockRelatedArticles f38100f;

    public i2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.d = org.telegram.messenger.i0.L(18.0f);
        this.f38097a = m60Var;
        this.f38098b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f38099c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43990s;
        this.f38097a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f38099c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43990s;
        this.f38097a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f38099c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43990s;
        this.f38097a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f38099c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f38099c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f38099c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38100f != null && this.f38099c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(this.f38097a, canvas, this, 0);
            this.f38099c.d(canvas, this);
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
        z2 z2Var = this.f38099c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754857, h4.h(this.f38097a, this.f38098b, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        i2 i2Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockRelatedArticles pageblockrelatedarticles = this.f38100f;
        if (pageblockrelatedarticles != null) {
            TL_iv.pageBlockRelatedArticles pageblockrelatedarticles2 = this.f38100f;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            f4 f4Var = this.f38098b;
            i2Var = this;
            z2 n10 = h4.n(this.f38097a, i2Var, null, pageblockrelatedarticles.title, size - org.telegram.messenger.i0.L(52.0f), 0, pageblockrelatedarticles2, alignment, 1, f4Var);
            i2Var.f38099c = n10;
            if (n10 != null) {
                i2Var.e = ((org.telegram.messenger.i0.L(32.0f) - i2Var.f38099c.d.getHeight()) / 2) + org.telegram.messenger.i0.L(6.0f);
            }
        } else {
            i2Var = this;
        }
        if (i2Var.f38099c != null) {
            setMeasuredDimension(size, org.telegram.messenger.i0.L(38.0f));
            z2 z2Var = i2Var.f38099c;
            z2Var.f43990s = i2Var.d;
            z2Var.f43991w = i2Var.e;
            return;
        }
        setMeasuredDimension(size, 1);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f38097a, this.f38098b, motionEvent, this, this.f38099c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockRelatedArticles pageblockrelatedarticles) {
        this.f38100f = pageblockrelatedarticles;
        requestLayout();
    }
}
