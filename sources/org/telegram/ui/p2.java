package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class p2 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final o50 f48592a;
    public final e4 f48593b;
    public z2 f48594c;
    public int d;
    public int f48595e;
    public TL_iv.pageBlockSubheader f48596f;

    public p2(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f48592a = o50Var;
        this.f48593b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f48594c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f52436s;
        this.f48592a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f48594c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f52436s;
        this.f48592a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f48594c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f52436s;
        this.f48592a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f48594c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f48594c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f48594c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48596f != null && this.f48594c != null) {
            canvas.save();
            canvas.translate(this.d, this.f48595e);
            g4.t(this.f48592a, canvas, this, 0);
            this.f48594c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f48594c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f48592a, this.f48593b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        o50 o50Var = this.f48592a;
        o50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        o50Var.getClass();
        this.f48595e = org.telegram.messenger.g0.L(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f48596f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            o50 o50Var2 = this.f48592a;
            o50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f48596f;
            e4 e4Var = this.f48593b;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.mu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(o50Var2, this, null, richText, L, 0, pageblocksubheader2, alignment, 0, this.f48593b);
            this.f48594c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight() + this.f48595e;
                int i12 = this.f48595e;
                i11 = height + i12;
                z2 z2Var = this.f48594c;
                z2Var.f52436s = this.d;
                z2Var.f52437w = i12;
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
        if (!g4.j(this.f48592a, this.f48593b, motionEvent, this, this.f48594c, this.d, this.f48595e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f48596f = pageblocksubheader;
        requestLayout();
    }
}
