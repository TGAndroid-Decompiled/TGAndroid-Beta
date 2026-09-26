package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class mw extends FrameLayout {
    public final lz f26585a;

    public mw(lz lzVar, Context context) {
        super(context);
        this.f26585a = lzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.f26585a;
        qw qwVar = lzVar.f26271o0;
        if (view == lzVar.f26251h0) {
            canvas.save();
            canvas.clipRect(0.0f, qwVar.getY() + qwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
