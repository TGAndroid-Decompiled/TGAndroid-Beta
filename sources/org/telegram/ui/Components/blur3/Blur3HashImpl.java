package org.telegram.ui.Components.blur3;

import org.telegram.messenger.MediaDataController;

public final class Blur3HashImpl {
    public long hash;
    public boolean unsupported;

    public void add(boolean z) {
        this.hash = MediaDataController.calcHash(this.hash, z ? 1L : 0L);
    }

    public void addF(float f) {
        this.hash = MediaDataController.calcHash(this.hash, Float.floatToIntBits(f));
    }
}
