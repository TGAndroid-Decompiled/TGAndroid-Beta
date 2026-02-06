package org.telegram.ui.Components.blur3;

import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;

public class Blur3HashImpl implements IBlur3Hash {
    private long hash;
    private boolean unsupported;

    @Override
    public void add(View view) {
        IBlur3Hash.CC.$default$add(this, view);
    }

    @Override
    public void add(boolean z) {
        add(z ? 1L : 0L);
    }

    @Override
    public void addF(float f) {
        add(Float.floatToIntBits(f));
    }

    public void start() {
        this.hash = 0L;
        this.unsupported = false;
    }

    public long get() {
        if (this.unsupported) {
            return -1L;
        }
        return this.hash;
    }

    public boolean isUnsupported() {
        return this.unsupported;
    }

    @Override
    public void add(long j) {
        this.hash = MediaDataController.calcHash(this.hash, j);
    }

    @Override
    public void unsupported() {
        this.unsupported = true;
    }
}
