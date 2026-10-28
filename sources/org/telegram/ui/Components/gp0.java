package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
public class gp0 extends LinearLayout {
    public gp0(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getParent() instanceof hp0) {
            ((hp0) getParent()).invalidate();
        }
    }
}
