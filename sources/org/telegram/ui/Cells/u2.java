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
    public TLRPC.RecentMeUrl f30559f;
    public ImageReceiver h;
    public org.telegram.ui.Components.w8 f30560n;
    public int f30561r;
    public StaticLayout f30562s;
    public int f30563w;
    public int f30564x;
    public int f30565y;

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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28162u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f30562s != null) {
            canvas2.save();
            canvas2.translate(this.f30561r, org.telegram.messenger.g0.L(13.0f));
            this.f30562s.draw(canvas2);
            canvas2.restore();
        }
        if (this.D != null) {
            canvas2.save();
            canvas2.translate(this.f30565y, this.f30564x);
            try {
                this.D.draw(canvas2);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            canvas2.restore();
        }
        if (this.E) {
            z.s(this.f30563w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.k6.f27885f1);
            z.s(this.f30563w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.k6.f27939i1);
            org.telegram.ui.ActionBar.k6.f27885f1.draw(canvas2);
            org.telegram.ui.ActionBar.k6.f27939i1.draw(canvas2);
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
        this.f30559f = recentMeUrl;
        requestLayout();
    }
}
