package org.telegram.ui.Components;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;

public final class IntSize {
    public final int height;
    public final int width;

    public IntSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IntSize.class == obj.getClass()) {
            IntSize intSize = (IntSize) obj;
            if (this.width == intSize.width && this.height == intSize.height) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.width * 31) + this.height;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.width);
        sb.append(", ");
        return SurfaceContainer$$ExternalSyntheticOutline0.m(this.height, ")", sb);
    }
}
