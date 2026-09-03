package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class s2 extends a0 {
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public TLRPC.RecentMeUrl f23723f;
    public ImageReceiver h;
    public org.telegram.ui.Components.z8 f23724n;
    public int f23725r;
    public StaticLayout f23726s;
    public int v;
    public int f23727w;
    public int f23728x;
    public StaticLayout f23729y;

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
        if (this.D) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f21957u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f23726s != null) {
            canvas2.save();
            canvas2.translate(this.f23725r, AndroidUtilities.dp(13.0f));
            this.f23726s.draw(canvas2);
            canvas2.restore();
        }
        if (this.f23729y != null) {
            canvas2.save();
            canvas2.translate(this.f23728x, this.f23727w);
            try {
                this.f23729y.draw(canvas2);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            canvas2.restore();
        }
        if (this.B) {
            a0.o(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.k6.f21693f1);
            a0.o(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.k6.f21747i1);
            org.telegram.ui.ActionBar.k6.f21693f1.draw(canvas2);
            org.telegram.ui.ActionBar.k6.f21747i1.draw(canvas2);
        }
        this.h.draw(canvas2);
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(72.0f));
    }

    public void setDialogSelected(boolean z4) {
        if (this.D != z4) {
            invalidate();
        }
        this.D = z4;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f23723f = recentMeUrl;
        requestLayout();
    }
}
