package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kx extends FrameLayout {
    public final lz f25903a;

    public kx(lz lzVar, Context context) {
        super(context);
        this.f25903a = lzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.f25903a;
        px pxVar = lzVar.I;
        kw kwVar = lzVar.V;
        xx xxVar = lzVar.P;
        if (view != xxVar && view != kwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = pxVar.getY() + pxVar.getMeasuredHeight() + 1.0f;
        if (view == xxVar && kwVar != null) {
            y3 = Math.max(y3, kwVar.getY() + kwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * lzVar.f26230b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
