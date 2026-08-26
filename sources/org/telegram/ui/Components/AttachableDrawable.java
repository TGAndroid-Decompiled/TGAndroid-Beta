package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;

public interface AttachableDrawable {
    void onAttachedToWindow(ImageReceiver imageReceiver);

    void onDetachedFromWindow(ImageReceiver imageReceiver);

    void setParent(View view);

    public abstract class CC {
        public static void $default$setParent(AttachableDrawable attachableDrawable, View view) {
        }
    }
}
