package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class r2 extends a0 {
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public TLRPC.RecentMeUrl f21856f;
    public ImageReceiver h;
    public org.telegram.ui.Components.z8 f21857n;
    public int f21858r;
    public StaticLayout f21859s;
    public int v;
    public int f21860w;
    public int f21861x;
    public StaticLayout f21862y;

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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20176u0);
        } else {
            canvas2 = canvas;
        }
        if (this.f21859s != null) {
            canvas2.save();
            canvas2.translate(this.f21858r, AndroidUtilities.dp(13.0f));
            this.f21859s.draw(canvas2);
            canvas2.restore();
        }
        if (this.f21862y != null) {
            canvas2.save();
            canvas2.translate(this.f21861x, this.f21860w);
            try {
                this.f21862y.draw(canvas2);
            } catch (Exception e) {
                FileLog.e(e);
            }
            canvas2.restore();
        }
        if (this.B) {
            a0.o(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.j6.f19912f1);
            a0.o(this.v, AndroidUtilities.dp(16.5f), org.telegram.ui.ActionBar.j6.f19966i1);
            org.telegram.ui.ActionBar.j6.f19912f1.draw(canvas2);
            org.telegram.ui.ActionBar.j6.f19966i1.draw(canvas2);
        }
        this.h.draw(canvas2);
    }

    @Override
    public final void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.r2.onLayout(boolean, int, int, int, int):void");
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
        this.f21856f = recentMeUrl;
        requestLayout();
    }
}
