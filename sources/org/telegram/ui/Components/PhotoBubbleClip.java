package org.telegram.ui.Components;

import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

public class PhotoBubbleClip extends Path {
    private int lastCx;
    private int lastCy;
    private int lastR;

    public void setBounds(int i, int i2, int i3) {
        if (this.lastCx == i && this.lastCy == i2 && this.lastR == i3) {
            return;
        }
        rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        float f = i - i3;
        float f2 = i2 + i3;
        rectF.set(f, i2 - i3, i + i3, f2);
        arcTo(rectF, -180.0f, 270.0f, false);
        float f3 = i3 / 81.0f;
        float f4 = i;
        float f5 = f2 - (3.0f * f3);
        cubicTo(f4 - (13.0f * f3), f2, f4 - (25.0f * f3), f5, f4 - (36.0f * f3), f2 - (8.42f * f3));
        float f6 = f2 - f3;
        cubicTo(f4 - (52.0f * f3), f6, f4 - (56.5f * f3), f6, f4 - (78.02f * f3), f6);
        cubicTo(f4 - (80.0f * f3), f6, f4 - (81.0f * f3), f5, f4 - (79.52f * f3), f2 - (4.5f * f3));
        float f7 = f4 - (63.73f * f3);
        cubicTo(f4 - (78.0f * f3), f2 - (6.0f * f3), f7, f2 - (15.0f * f3), f7, f2 - (31.0f * f3));
        float f8 = i2;
        cubicTo(f4 - (74.5f * f3), f2 - (44.75f * f3), f, (f3 * 18.87f) + f8, f, f8);
        close();
        this.lastCx = i;
        this.lastCy = i2;
        this.lastR = i3;
    }
}
