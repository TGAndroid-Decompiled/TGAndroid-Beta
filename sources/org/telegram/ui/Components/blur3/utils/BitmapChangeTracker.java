package org.telegram.ui.Components.blur3.utils;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

public class BitmapChangeTracker {
    private long generationId;
    private boolean invalidated = true;
    private WeakReference ref;

    public void set(Bitmap bitmap) {
        this.ref = bitmap != null ? new WeakReference(bitmap) : null;
        this.generationId = generationOf(bitmap);
        this.invalidated = false;
    }

    public boolean isInvalidated(Bitmap bitmap) {
        if (this.invalidated) {
            return true;
        }
        WeakReference weakReference = this.ref;
        return ((weakReference != null ? (Bitmap) weakReference.get() : null) == bitmap && generationOf(bitmap) == this.generationId) ? false : true;
    }

    private static long generationOf(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0L;
        }
        return bitmap.getGenerationId();
    }
}
