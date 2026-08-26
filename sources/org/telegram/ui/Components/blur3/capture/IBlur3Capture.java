package org.telegram.ui.Components.blur3.capture;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.blur3.Blur3HashImpl;

public interface IBlur3Capture {
    void capture(Canvas canvas, RectF rectF);

    void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF);
}
