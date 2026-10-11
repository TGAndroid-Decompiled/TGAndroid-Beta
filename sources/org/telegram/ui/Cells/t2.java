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
    public TLRPC.RecentMeUrl f23026f;
    public ImageReceiver h;
    public org.telegram.ui.Components.j9 f23027n;
    public int f23028r;
    public StaticLayout f23029s;
    public int v;
    public int f23030w;
    public int f23031x;
    public StaticLayout f23032y;

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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.f21094u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f23029s != null) {
            canvas2.save();
            canvas2.translate(this.f23028r, AndroidUtilities.dp(13.0f));
            this.f23029s.draw(canvas2);
            canvas2.restore();
        }
        if (this.f23032y != null) {
            canvas2.save();
            canvas2.translate(this.f23031x, this.f23030w);
            try {
                this.f23032y.draw(canvas2);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            canvas2.restore();
        }
        if (this.E) {
            a0.p(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.h6.f20818f1);
            a0.p(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.h6.f20872i1);
            org.telegram.ui.ActionBar.h6.f20818f1.draw(canvas2);
            org.telegram.ui.ActionBar.h6.f20872i1.draw(canvas2);
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
        this.f23026f = recentMeUrl;
        requestLayout();
    }
}
