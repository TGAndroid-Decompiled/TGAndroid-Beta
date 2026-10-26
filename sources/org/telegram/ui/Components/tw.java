package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
public final class tw extends FrameLayout {
    public final sz f33168a;

    public tw(sz szVar, Context context) {
        super(context);
        this.f33168a = szVar;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        sz szVar = this.f33168a;
        ww wwVar = szVar.f32754o0;
        if (view == szVar.f32734h0) {
            canvas.save();
            canvas.clipRect(0.0f, wwVar.getY() + wwVar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }
}
