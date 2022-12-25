package org.telegram.p009ui.Components;

import android.graphics.drawable.Drawable;

public abstract class StatusDrawable extends Drawable {
    public abstract void setColor(int i);

    public abstract void setIsChat(boolean z);

    public abstract void start();

    public abstract void stop();
}
