package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
public class jm0 extends LinearLayout {
    public jm0(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (getParent() instanceof km0) {
            ((km0) getParent()).invalidate();
        }
    }
}
