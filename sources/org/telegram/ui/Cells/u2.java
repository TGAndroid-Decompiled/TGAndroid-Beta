package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class u2 extends z {
    public StaticLayout D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public TLRPC.RecentMeUrl f30574f;
    public ImageReceiver h;
    public org.telegram.ui.Components.v8 f30575n;
    public int f30576r;
    public StaticLayout f30577s;
    public int f30578w;
    public int f30579x;
    public int f30580y;

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
        if (this.G) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f28200u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f30577s != null) {
            canvas2.save();
            canvas2.translate(this.f30576r, org.telegram.messenger.g0.L(13.0f));
            this.f30577s.draw(canvas2);
            canvas2.restore();
        }
        if (this.D != null) {
            canvas2.save();
            canvas2.translate(this.f30580y, this.f30579x);
            try {
                this.D.draw(canvas2);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            canvas2.restore();
        }
        if (this.E) {
            z.s(this.f30578w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.m6.f27923f1);
            z.s(this.f30578w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.m6.f27977i1);
            org.telegram.ui.ActionBar.m6.f27923f1.draw(canvas2);
            org.telegram.ui.ActionBar.m6.f27977i1.draw(canvas2);
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

    public void setDialogSelected(boolean z9) {
        if (this.G != z9) {
            invalidate();
        }
        this.G = z9;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f30574f = recentMeUrl;
        requestLayout();
    }
}
