package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
public interface v3 {
    Context getContext();

    RectF getRect();

    void setDrawingFromOverlay(boolean z4);

    float z(Canvas canvas, RectF rectF, float f10, RectF rectF2, float f11);
}
