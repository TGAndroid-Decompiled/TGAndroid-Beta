package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class q2 extends z {
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public TLRPC.RecentMeUrl f24810f;
    public ImageReceiver h;
    public org.telegram.ui.Components.j9 f24811n;
    public int f24812r;
    public StaticLayout f24813s;
    public int v;
    public int f24814w;
    public int f24815x;
    public StaticLayout f24816y;

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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.y6.f23665u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f24813s != null) {
            canvas2.save();
            canvas2.translate(this.f24812r, AndroidUtilities.dp(13.0f));
            this.f24813s.draw(canvas2);
            canvas2.restore();
        }
        if (this.f24816y != null) {
            canvas2.save();
            canvas2.translate(this.f24815x, this.f24814w);
            try {
                this.f24816y.draw(canvas2);
            } catch (Exception e) {
                FileLog.e(e);
            }
            canvas2.restore();
        }
        if (this.E) {
            z.n(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.y6.f23386f1);
            z.n(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.y6.f23441i1);
            org.telegram.ui.ActionBar.y6.f23386f1.draw(canvas2);
            org.telegram.ui.ActionBar.y6.f23441i1.draw(canvas2);
        }
        this.h.draw(canvas2);
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.q2.onLayout(boolean, int, int, int, int):void");
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
        this.f24810f = recentMeUrl;
        requestLayout();
    }
}
