package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public interface t3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z10);

    float z(Canvas canvas, RectF rectF, float f9, RectF rectF2, float f10);
}
