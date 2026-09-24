package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kx extends FrameLayout {
    public final lz f25896a;

    public kx(lz lzVar, Context context) {
        super(context);
        this.f25896a = lzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.f25896a;
        px pxVar = lzVar.I;
        lw lwVar = lzVar.V;
        xx xxVar = lzVar.P;
        if (view != xxVar && view != lwVar) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float y3 = pxVar.getY() + pxVar.getMeasuredHeight() + 1.0f;
        if (view == xxVar && lwVar != null) {
            y3 = Math.max(y3, lwVar.getY() + lwVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y3 - (AndroidUtilities.dp(16.0f) * lzVar.f26223b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }
}
