package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.utils.Choreographer60FpsContent;

public abstract class StatusDrawable extends Drawable {
    public abstract void setColor(int i);

    public abstract void setIsChat(boolean z);

    public abstract void start();

    public abstract void stop();

    public void invalidateLimited() {
        Choreographer60FpsContent.getInstance().postInvalidateDrawable30fps(this);
    }
}
