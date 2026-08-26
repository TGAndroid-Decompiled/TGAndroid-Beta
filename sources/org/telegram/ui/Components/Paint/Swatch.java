package org.telegram.ui.Components.Paint;

public final class Swatch {
    public float brushWeight;
    public int color;

    public Swatch(int i, float f) {
        this.color = i;
        this.brushWeight = f;
    }

    public final Object clone() {
        return new Swatch(this.color, this.brushWeight);
    }
}
