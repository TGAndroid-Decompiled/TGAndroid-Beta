package org.telegram.ui.Components.blur3.capture;

import android.os.Build;
import android.view.View;

public interface IBlur3Hash {
    void add(long j);

    void add(View view);

    void add(boolean z);

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
    }
}
