package org.telegram.ui.Components.Crop;

public final class CropTransform {
    public float cropAreaX;
    public float cropAreaY;
    public int cropOrientation;
    public float cropPh;
    public float cropPw;
    public float cropPx;
    public float cropPy;
    public float cropRotation;
    public float cropScale;
    public boolean hasTransform;
    public boolean isMirrored;
    public float minScale;
    public float trueCropScale;

    public final int getOrientation() {
        return this.cropOrientation;
    }

    public final boolean hasViewTransform() {
        return this.hasTransform;
    }

    public final boolean isMirrored() {
        return this.isMirrored;
    }

    public final void setViewTransform(boolean z, float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z2) {
        this.hasTransform = z;
        this.cropPx = f;
        this.cropPy = f2;
        this.cropScale = f4;
        this.cropRotation = f3;
        this.cropOrientation = i;
        while (true) {
            int i2 = this.cropOrientation;
            if (i2 >= 0) {
                break;
            } else {
                this.cropOrientation = i2 + 360;
            }
        }
        while (true) {
            int i3 = this.cropOrientation;
            if (i3 < 360) {
                this.cropPw = f7;
                this.cropPh = f8;
                this.cropAreaX = f9;
                this.cropAreaY = f10;
                this.trueCropScale = f5;
                this.minScale = f6;
                this.isMirrored = z2;
                return;
            }
            this.cropOrientation = i3 - 360;
        }
    }

    public final CropTransform clone() {
        CropTransform cropTransform = new CropTransform();
        cropTransform.hasTransform = this.hasTransform;
        cropTransform.cropPx = this.cropPx;
        cropTransform.cropPy = this.cropPy;
        cropTransform.cropAreaX = this.cropAreaX;
        cropTransform.cropAreaY = this.cropAreaY;
        cropTransform.cropScale = this.cropScale;
        cropTransform.cropRotation = this.cropRotation;
        cropTransform.isMirrored = this.isMirrored;
        cropTransform.cropOrientation = this.cropOrientation;
        cropTransform.cropPw = this.cropPw;
        cropTransform.cropPh = this.cropPh;
        cropTransform.trueCropScale = this.trueCropScale;
        cropTransform.minScale = this.minScale;
        return cropTransform;
    }
}
