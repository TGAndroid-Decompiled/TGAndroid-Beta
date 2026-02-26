package org.telegram.ui.Components.blur3.capture;

import android.graphics.ColorMatrix;
import android.os.Build;
import android.view.View;

public interface IBlur3Hash {
    void add(long j);

    void add(ColorMatrix colorMatrix);

    void add(View view);

    void add(boolean z);

    void add(float[] fArr);

    void addF(float f);

    void unsupported();

    public abstract class CC {
        public static void $default$add(IBlur3Hash iBlur3Hash, View view) {
            if (Build.VERSION.SDK_INT >= 29) {
                iBlur3Hash.add(view.getUniqueDrawingId());
            } else {
                iBlur3Hash.unsupported();
            }
        }

        public static void $default$add(IBlur3Hash iBlur3Hash, float[] fArr) {
            for (float f : fArr) {
                iBlur3Hash.addF(f);
            }
        }
    }
}
