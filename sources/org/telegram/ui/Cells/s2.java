package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class s2 extends a0 {
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public TLRPC.RecentMeUrl f25250f;
    public ImageReceiver h;
    public org.telegram.ui.Components.z8 f25251n;
    public int f25252r;
    public StaticLayout f25253s;
    public int v;
    public int f25254w;
    public int f25255x;
    public StaticLayout f25256y;

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
        if (this.C) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.f23297u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f25253s != null) {
            canvas2.save();
            canvas2.translate(this.f25252r, AndroidUtilities.dp(13.0f));
            this.f25253s.draw(canvas2);
            canvas2.restore();
        }
        if (this.f25256y != null) {
            canvas2.save();
            canvas2.translate(this.f25255x, this.f25254w);
            try {
                this.f25256y.draw(canvas2);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            canvas2.restore();
        }
        if (this.A) {
            a0.o(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.f6.f23032f1);
            a0.o(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.f6.f23087i1);
            org.telegram.ui.ActionBar.f6.f23032f1.draw(canvas2);
            org.telegram.ui.ActionBar.f6.f23087i1.draw(canvas2);
        }
        this.h.draw(canvas2);
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.s2.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(72.0f));
    }

    public void setDialogSelected(boolean z10) {
        if (this.C != z10) {
            invalidate();
        }
        this.C = z10;
    }

    public void setRecentMeUrl(TLRPC.RecentMeUrl recentMeUrl) {
        this.f25250f = recentMeUrl;
        requestLayout();
    }
}
