package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class u2 extends z {
    public StaticLayout E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public TLRPC.RecentMeUrl f31707f;
    public ImageReceiver h;
    public org.telegram.ui.Components.t8 f31708n;
    public int f31709r;
    public StaticLayout f31710s;
    public int f31711w;
    public int f31712x;
    public int f31713y;

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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f29159u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f31710s != null) {
            canvas2.save();
            canvas2.translate(this.f31709r, org.telegram.messenger.g0.L(13.0f));
            this.f31710s.draw(canvas2);
            canvas2.restore();
        }
        if (this.E != null) {
            canvas2.save();
            canvas2.translate(this.f31713y, this.f31712x);
            try {
                this.E.draw(canvas2);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            canvas2.restore();
        }
        if (this.F) {
            z.s(this.f31711w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.j6.f28882f1);
            z.s(this.f31711w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.j6.f28936i1);
            org.telegram.ui.ActionBar.j6.f28882f1.draw(canvas2);
            org.telegram.ui.ActionBar.j6.f28936i1.draw(canvas2);
        }
        this.h.h(canvas2, null);
    }

    @Override
    public final void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.onLayout(boolean, int, int, int, int):void");
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
        this.f31707f = recentMeUrl;
        requestLayout();
    }
}
