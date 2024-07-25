package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public interface AttachableDrawable {
    void onAttachedToWindow(ImageReceiver imageReceiver);

    void onDetachedFromWindow(ImageReceiver imageReceiver);
}
