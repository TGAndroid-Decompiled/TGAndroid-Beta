package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pw extends FrameLayout {
    public final boolean f30218a;
    public final mz f30219b;

    public pw(mz mzVar, Context context, boolean z4) {
        super(context);
        this.f30219b = mzVar;
        this.f30218a = z4;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mz mzVar = this.f30219b;
        vw vwVar = mzVar.f29343y0;
        rw rwVar = mzVar.A0;
        uw uwVar = mzVar.D0;
        if (!this.f30218a && (view == rwVar || view == uwVar)) {
            canvas.save();
            float y10 = vwVar.getY() + vwVar.getMeasuredHeight() + 1.0f;
            if (view == rwVar) {
                y10 = Math.max(y10, uwVar.getY() + uwVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * mzVar.f29263a.f50504e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mz mzVar = this.f30219b;
        mzVar.H0 = true;
        mzVar.a0();
        bx bxVar = mzVar.Q0;
        if (bxVar != null) {
            bxVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mz mzVar = this.f30219b;
        mzVar.H0 = false;
        mzVar.a0();
        bx bxVar = mzVar.Q0;
        if (bxVar != null) {
            bxVar.a();
        }
    }
}
