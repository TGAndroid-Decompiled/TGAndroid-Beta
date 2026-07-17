package org.telegram.ui.Components.blur3.utils;

import android.graphics.Bitmap;

public class BitmapMemoizedMetadata {
    private final BitmapChangeTracker lastBitmap = new BitmapChangeTracker();
    private Object memoized;
    private final Provider provider;

    public interface Provider {
        Object get(Bitmap bitmap);
    }

    public BitmapMemoizedMetadata(Provider provider) {
        this.provider = provider;
    }

    public Object get(Bitmap bitmap) {
        if (this.lastBitmap.isInvalidated(bitmap)) {
            this.memoized = this.provider.get(bitmap);
            this.lastBitmap.set(bitmap);
        }
        return this.memoized;
    }
}
