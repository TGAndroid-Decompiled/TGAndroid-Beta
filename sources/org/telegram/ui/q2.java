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
    public final r50 f48915a;
    public final e4 f48916b;
    public z2 f48917c;
    public int d;
    public int f48918e;
    public TL_iv.pageBlockSubtitle f48919f;

    public q2(Context context, r50 r50Var, e4 e4Var) {
        super(context);
        this.f48915a = r50Var;
        this.f48916b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f48917c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f52183s;
        this.f48915a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f48917c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f52183s;
        this.f48915a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f48917c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f52183s;
        this.f48915a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f48917c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f48917c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f48917c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48919f != null && this.f48917c != null) {
            canvas.save();
            canvas.translate(this.d, this.f48918e);
            g4.t(this.f48915a, canvas, this, 0);
            this.f48917c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f48917c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f48915a, this.f48916b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        r50 r50Var = this.f48915a;
        r50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        r50Var.getClass();
        this.f48918e = org.telegram.messenger.g0.L(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f48919f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            r50 r50Var2 = this.f48915a;
            r50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f48919f;
            e4 e4Var = this.f48916b;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.nu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(r50Var2, this, null, richText, L, 0, pageblocksubtitle2, alignment, 0, this.f48916b);
            this.f48917c = n10;
            if (n10 != null) {
                r50Var.getClass();
                i11 = this.f48917c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f48917c;
                z2Var.f52183s = this.d;
                z2Var.f52184w = this.f48918e;
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
        if (!g4.j(this.f48915a, this.f48916b, motionEvent, this, this.f48917c, this.d, this.f48918e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f48919f = pageblocksubtitle;
        requestLayout();
    }
}
