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
    public TLRPC.RecentMeUrl f32180f;
    public ImageReceiver h;
    public org.telegram.ui.Components.b9 f32181n;
    public int f32182r;
    public StaticLayout f32183s;
    public int f32184w;
    public int f32185x;
    public int f32186y;

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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29691u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f32183s != null) {
            canvas2.save();
            canvas2.translate(this.f32182r, org.telegram.messenger.g0.L(13.0f));
            this.f32183s.draw(canvas2);
            canvas2.restore();
        }
        if (this.E != null) {
            canvas2.save();
            canvas2.translate(this.f32186y, this.f32185x);
            try {
                this.E.draw(canvas2);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            canvas2.restore();
        }
        if (this.F) {
            z.s(this.f32184w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.m6.f29414f1);
            z.s(this.f32184w, org.telegram.messenger.g0.L(16.5f), org.telegram.ui.ActionBar.m6.f29468i1);
            org.telegram.ui.ActionBar.m6.f29414f1.draw(canvas2);
            org.telegram.ui.ActionBar.m6.f29468i1.draw(canvas2);
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
        this.f32180f = recentMeUrl;
        requestLayout();
    }
}
