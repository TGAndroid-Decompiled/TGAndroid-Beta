package org.telegram.ui.Components.Paint;

public final class Swatch {
    public float brushWeight;
    public int color;

    public Swatch(float f, int i) {
        this.color = i;
        this.brushWeight = f;
    }

    public final Object clone() {
        return new Swatch(this.brushWeight, this.color);
    }
}
