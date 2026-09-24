package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class nw extends FrameLayout {
    public final lz f26806a;

    public nw(lz lzVar, Context context) {
        super(context);
        this.f26806a = lzVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        lz lzVar = this.f26806a;
        rw rwVar = lzVar.f26264o0;
        if (view == lzVar.f26244h0) {
            canvas.save();
            canvas.clipRect(0.0f, rwVar.getY() + rwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }
}
