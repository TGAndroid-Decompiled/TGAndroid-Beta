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
    public TLRPC.RecentMeUrl f30631f;
    public ImageReceiver h;
    public org.telegram.ui.Components.u8 f30632n;
    public int f30633r;
    public StaticLayout f30634s;
    public int f30635w;
    public int f30636x;
    public int f30637y;

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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28190u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f30634s != null) {
            canvas2.save();
            canvas2.translate(this.f30633r, org.telegram.messenger.g0.L(13.0f));
            this.f30634s.draw(canvas2);
            canvas2.restore();
        }
        if (this.E != null) {
            canvas2.save();
            canvas2.translate(this.f30637y, this.f30636x);
            try {
                this.E.draw(canvas2);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            canvas2.restore();
        }
        if (this.F) {
            z.s(this.f30635w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.k6.f27912f1);
            z.s(this.f30635w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.k6.f27968i1);
            org.telegram.ui.ActionBar.k6.f27912f1.draw(canvas2);
            org.telegram.ui.ActionBar.k6.f27968i1.draw(canvas2);
        }
        this.h.h(canvas2, null);
    }

    @Override
    public final void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(72.0f));
    }

    public void setDialogSelected(boolean z10) {
        if (this.H != z10) {
            invalidate();
        }
        this.H = z10;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f30631f = recentMeUrl;
        requestLayout();
    }
}
