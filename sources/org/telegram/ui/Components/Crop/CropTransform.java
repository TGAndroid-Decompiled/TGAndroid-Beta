package org.telegram.ui.Components.Crop;

public class CropTransform {
    private float cropAreaX;
    private float cropAreaY;
    private int cropOrientation;
    private float cropPh;
    private float cropPw;
    private float cropPx;
    private float cropPy;
    private float cropRotation;
    private float cropScale;
    private boolean hasTransform;
    private boolean isMirrored;
    private float minScale;
    private float trueCropScale;

    public void setViewTransform(boolean z) {
        this.hasTransform = z;
    }

    public void setViewTransform(boolean z, float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z2) {
        this.hasTransform = z;
        this.cropPx = f;
        this.cropPy = f2;
        this.cropScale = f4;
        this.cropRotation = f3;
        this.cropOrientation = i;
        while (true) {
            int i2 = this.cropOrientation;
            if (i2 < 0) {
                this.cropOrientation = i2 + 360;
            }
        }
        while (true) {
            int i3 = this.cropOrientation;
            if (i3 >= 360) {
                this.cropOrientation = i3 - 360;
            } else {
                this.cropPw = f7;
                this.cropPh = f8;
                this.cropAreaX = f9;
                this.cropAreaY = f10;
                this.trueCropScale = f5;
                this.minScale = f6;
                this.isMirrored = z2;
                return;
            }
        }
    }

    public boolean hasViewTransform() {
        return this.hasTransform;
    }

    public float getCropAreaX() {
        return this.cropAreaX;
    }

    public float getCropAreaY() {
        return this.cropAreaY;
    }

    public float getCropPx() {
        return this.cropPx;
    }

    public float getCropPy() {
        return this.cropPy;
    }

    public float getScale() {
        return this.cropScale;
    }

    public float getRotation() {
        return this.cropRotation;
    }

    public int getOrientation() {
        return this.cropOrientation;
    }

    public float getTrueCropScale() {
        return this.trueCropScale;
    }

    public float getMinScale() {
        return this.minScale;
    }

    public float getCropPw() {
        return this.cropPw;
    }

    public float getCropPh() {
        return this.cropPh;
    }

    public boolean isMirrored() {
        return this.isMirrored;
    }

    public CropTransform clone() {
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
