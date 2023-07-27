package org.telegram.ui.Stories.recorder;

import android.graphics.Matrix;
public abstract class IStoryPart {
    public int height;
    public int id;
    public final Matrix matrix = new Matrix();
    public int width;
}
