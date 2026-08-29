package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jw extends FrameLayout {
    public final boolean f29833a;
    public final fz f29834b;

    public jw(fz fzVar, Context context, boolean z10) {
        super(context);
        this.f29834b = fzVar;
        this.f29833a = z10;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        fz fzVar = this.f29834b;
        pw pwVar = fzVar.f28650x0;
        lw lwVar = fzVar.f28657z0;
        ow owVar = fzVar.C0;
        if (!this.f29833a && (view == lwVar || view == owVar)) {
            canvas.save();
            float y8 = pwVar.getY() + pwVar.getMeasuredHeight() + 1.0f;
            if (view == lwVar) {
                y8 = Math.max(y8, owVar.getY() + owVar.getMeasuredHeight() + 1.0f);
            }
            canvas.clipRect(0.0f, y8 - (AndroidUtilities.dp(16.0f) * fzVar.f28574a.f49505e), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fz fzVar = this.f29834b;
        fzVar.G0 = true;
        fzVar.a0();
        vw vwVar = fzVar.P0;
        if (vwVar != null) {
            vwVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fz fzVar = this.f29834b;
        fzVar.G0 = false;
        fzVar.a0();
        vw vwVar = fzVar.P0;
        if (vwVar != null) {
            vwVar.a();
        }
    }
}
