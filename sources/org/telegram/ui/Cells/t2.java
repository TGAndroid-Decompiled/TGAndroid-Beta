package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class t2 extends a0 {
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public TLRPC.RecentMeUrl f23045f;
    public ImageReceiver h;
    public org.telegram.ui.Components.h9 f23046n;
    public int f23047r;
    public StaticLayout f23048s;
    public int v;
    public int f23049w;
    public int f23050x;
    public StaticLayout f23051y;

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.G) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f21133u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f23048s != null) {
            canvas2.save();
            canvas2.translate(this.f23047r, AndroidUtilities.dp(13.0f));
            this.f23048s.draw(canvas2);
            canvas2.restore();
        }
        if (this.f23051y != null) {
            canvas2.save();
            canvas2.translate(this.f23050x, this.f23049w);
            try {
                this.f23051y.draw(canvas2);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            canvas2.restore();
        }
        if (this.E) {
            a0.o(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.i6.f20854f1);
            a0.o(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.i6.f20908i1);
            org.telegram.ui.ActionBar.i6.f20854f1.draw(canvas2);
            org.telegram.ui.ActionBar.i6.f20908i1.draw(canvas2);
        }
        this.h.draw(canvas2);
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(72.0f));
    }

    public void setDialogSelected(boolean z10) {
        if (this.G != z10) {
            invalidate();
        }
        this.G = z10;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f23045f = recentMeUrl;
        requestLayout();
    }
}
