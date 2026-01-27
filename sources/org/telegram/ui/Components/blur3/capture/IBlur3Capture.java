package org.telegram.ui.Components.blur3.capture;

import android.graphics.Canvas;
import android.graphics.RectF;

public interface IBlur3Capture {

    public abstract class CC {
        public static long $default$captureCalculateHash(IBlur3Capture iBlur3Capture, RectF rectF) {
            return -1L;
        }
    }

    void capture(Canvas canvas, RectF rectF);

    long captureCalculateHash(RectF rectF);
}
