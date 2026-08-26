package org.telegram.ui.Components.blur3.utils;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

public final class BitmapChangeTracker {
    public long generationId;
    public boolean invalidated = true;
    public WeakReference ref;

    public final boolean isInvalidated(Bitmap bitmap) {
        if (this.invalidated) {
            return true;
        }
        WeakReference weakReference = this.ref;
        if ((weakReference != null ? (Bitmap) weakReference.get() : null) != bitmap) {
            return true;
        }
        return ((bitmap == null || bitmap.isRecycled()) ? 0L : (long) bitmap.getGenerationId()) != this.generationId;
    }

    public final void set(Bitmap bitmap) {
        this.ref = bitmap != null ? new WeakReference(bitmap) : null;
        this.generationId = (bitmap == null || bitmap.isRecycled()) ? 0L : bitmap.getGenerationId();
        this.invalidated = false;
    }
}
