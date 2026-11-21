package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class v2 extends z {
    public StaticLayout E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public TLRPC.RecentMeUrl f32177f;
    public ImageReceiver h;
    public org.telegram.ui.Components.b9 f32178n;
    public int f32179r;
    public StaticLayout f32180s;
    public int f32181w;
    public int f32182x;
    public int f32183y;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.H) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29688u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f32180s != null) {
            canvas2.save();
            canvas2.translate(this.f32179r, org.telegram.messenger.g0.L(13.0f));
            this.f32180s.draw(canvas2);
            canvas2.restore();
        }
        if (this.E != null) {
            canvas2.save();
            canvas2.translate(this.f32183y, this.f32182x);
            try {
                this.E.draw(canvas2);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            canvas2.restore();
        }
        if (this.F) {
            z.s(this.f32181w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.m6.f29411f1);
            z.s(this.f32181w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.m6.f29465i1);
            org.telegram.ui.ActionBar.m6.f29411f1.draw(canvas2);
            org.telegram.ui.ActionBar.m6.f29465i1.draw(canvas2);
        }
        this.h.h(canvas2, null);
    }

    @Override
    public final void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(72.0f));
    }

    public void setDialogSelected(boolean z10) {
        if (this.H != z10) {
            invalidate();
        }
        this.H = z10;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f32177f = recentMeUrl;
        requestLayout();
    }
}
