package org.telegram.ui.Components.Paint;

public class Swatch {
    public float brushWeight;
    public int color;
    public float colorLocation;

    public Swatch(int i, float f, float f2) {
        this.color = i;
        this.colorLocation = f;
        this.brushWeight = f2;
    }

    public Swatch clone() {
        return new Swatch(this.color, this.colorLocation, this.brushWeight);
    }
}
