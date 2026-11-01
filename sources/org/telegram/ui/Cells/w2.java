package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class w2 extends z {
    public StaticLayout D;
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public TLRPC.RecentMeUrl f23375f;
    public ImageReceiver h;
    public org.telegram.ui.Components.r8 f23376n;
    public int f23377r;
    public StaticLayout f23378s;
    public int f23379w;
    public int f23380x;
    public int f23381y;

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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21237u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f23378s != null) {
            canvas2.save();
            canvas2.translate(this.f23377r, org.telegram.messenger.i0.L(13.0f));
            this.f23378s.draw(canvas2);
            canvas2.restore();
        }
        if (this.D != null) {
            canvas2.save();
            canvas2.translate(this.f23381y, this.f23380x);
            try {
                this.D.draw(canvas2);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            canvas2.restore();
        }
        if (this.E) {
            z.t(this.f23379w, org.telegram.messenger.i0.L(16.5f), org.telegram.ui.ActionBar.t6.f20962f1);
            z.t(this.f23379w, org.telegram.messenger.i0.L(16.5f), org.telegram.ui.ActionBar.t6.f21016i1);
            org.telegram.ui.ActionBar.t6.f20962f1.draw(canvas2);
            org.telegram.ui.ActionBar.t6.f21016i1.draw(canvas2);
        }
        this.h.h(canvas2, null);
    }

    @Override
    public final void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(72.0f));
    }

    public void setDialogSelected(boolean z10) {
        if (this.G != z10) {
            invalidate();
        }
        this.G = z10;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f23375f = recentMeUrl;
        requestLayout();
    }
}
