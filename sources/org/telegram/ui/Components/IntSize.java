package org.telegram.ui.Components;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;

public class IntSize {
    public int height;
    public int width;

    public IntSize() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IntSize intSize = (IntSize) obj;
            if (this.width == intSize.width && this.height == intSize.height) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public void set(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.width);
        sb.append(", ");
        return Fragment$$ExternalSyntheticOutline0.m(this.height, ")", sb);
    }

    public IntSize(IntSize intSize) {
        this.width = intSize.width;
        this.height = intSize.height;
    }

    public IntSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
