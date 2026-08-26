package org.telegram.ui.Stories.recorder;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;

public abstract class DominantColors {
    public static float[] tempHsv;

    public static int adapt(int i, boolean z) {
        if (tempHsv == null) {
            tempHsv = new float[3];
        }
        Color.colorToHSV(i, tempHsv);
        float[] fArr = tempHsv;
        fArr[2] = Utilities.clamp(fArr[2] + (z ? -0.05f : 0.07f), 0.85f, 0.15f);
        float[] fArr2 = tempHsv;
        float f = fArr2[1];
        if (f > 0.1f && f <= 0.95f) {
            if (f <= 0.5f) {
                fArr2[1] = Utilities.clamp(f + 0.2f, 1.0f, 0.0f);
            } else if (f > 0.8f) {
                fArr2[1] = Utilities.clamp(f - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(tempHsv);
    }

    public static int[] getColorsSync(Bitmap bitmap, boolean z) {
        return new int[]{adapt(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z), adapt(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z)};
    }
}
