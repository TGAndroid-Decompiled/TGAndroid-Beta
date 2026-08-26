package org.telegram.ui.Components.blur3;

import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

public final class Blur3HashImpl implements IBlur3Hash {
    public long hash;
    public boolean unsupported;

    public final void add(boolean z) {
        this.hash = MediaDataController.calcHash(this.hash, z ? 1L : 0L);
    }

    public final void addF(float f) {
        this.hash = MediaDataController.calcHash(this.hash, Float.floatToIntBits(f));
    }
}
