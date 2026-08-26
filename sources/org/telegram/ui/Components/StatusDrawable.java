package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.utils.Choreographer60FpsContent;

public abstract class StatusDrawable extends Drawable {
    public final void invalidateLimited() {
        Choreographer60FpsContent choreographer60FpsContent = Choreographer60FpsContent.getInstance();
        choreographer60FpsContent.getClass();
        Choreographer60FpsContent.checkMainThread();
        choreographer60FpsContent.mDrawablesToInvalidate30fps.add(this);
    }

    public abstract void setColor(int i);

    public abstract void setIsChat(boolean z);

    public abstract void start();

    public abstract void stop();
}
