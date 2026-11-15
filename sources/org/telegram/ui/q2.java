package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class q2 extends View implements org.telegram.ui.Cells.g9, c3 {
    public final n50 f50432a;
    public final e4 f50433b;
    public z2 f50434c;
    public int d;
    public int f50435e;
    public TL_iv.pageBlockSubtitle f50436f;

    public q2(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f50432a = n50Var;
        this.f50433b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f50434c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f53777s;
        this.f50432a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f50434c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f53777s;
        this.f50432a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f50434c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f53777s;
        this.f50432a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.i20.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50434c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50434c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50434c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50436f != null && this.f50434c != null) {
            canvas.save();
            canvas.translate(this.d, this.f50435e);
            g4.t(this.f50432a, canvas, this, 0);
            this.f50434c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50434c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f50432a, this.f50433b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        n50 n50Var = this.f50432a;
        n50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        n50Var.getClass();
        this.f50435e = org.telegram.messenger.g0.L(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f50436f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            n50 n50Var2 = this.f50432a;
            n50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f50436f;
            e4 e4Var = this.f50433b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.ou0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(n50Var2, this, null, richText, L, 0, pageblocksubtitle2, alignment, 0, this.f50433b);
            this.f50434c = n10;
            if (n10 != null) {
                n50Var.getClass();
                i11 = this.f50434c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f50434c;
                z2Var.f53777s = this.d;
                z2Var.f53778w = this.f50435e;
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
        if (!g4.j(this.f50432a, this.f50433b, motionEvent, this, this.f50434c, this.d, this.f50435e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f50436f = pageblocksubtitle;
        requestLayout();
    }
}
