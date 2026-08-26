package org.telegram.ui.Components.blur3.utils;

import android.graphics.Bitmap;

public final class BitmapMemoizedMetadata {
    public final BitmapChangeTracker lastBitmap = new BitmapChangeTracker();
    public Object memoized;
    public final Provider provider;

    public interface Provider {
        Object get(Bitmap bitmap);
    }

    public BitmapMemoizedMetadata(Provider provider) {
        this.provider = provider;
    }

    public final Object get(Bitmap bitmap) {
        BitmapChangeTracker bitmapChangeTracker = this.lastBitmap;
        if (bitmapChangeTracker.isInvalidated(bitmap)) {
            this.memoized = this.provider.get(bitmap);
            bitmapChangeTracker.set(bitmap);
        }
        return this.memoized;
    }
}
