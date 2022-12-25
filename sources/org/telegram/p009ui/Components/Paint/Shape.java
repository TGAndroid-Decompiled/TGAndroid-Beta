package org.telegram.p009ui.Components.Paint;

import android.graphics.RectF;
import org.telegram.p009ui.Components.Paint.Brush;

public class Shape {
    public float arrowTriangleLength;
    public final Brush.Shape brush;
    public float centerX;
    public float centerY;
    public boolean fill;
    public float middleX;
    public float middleY;
    public float radiusX;
    public float radiusY;
    public float rotation;
    public float rounding;
    public float thickness;

    public Shape(Brush.Shape shape) {
        this.brush = shape;
    }

    public int getType() {
        return this.brush.getShapeShaderType();
    }

    public void getBounds(RectF rectF) {
        if (getType() == 4) {
            float f = this.centerX;
            float f2 = this.arrowTriangleLength;
            float f3 = this.centerY;
            rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
            rectF.union(this.radiusX, this.radiusY);
            rectF.union(this.middleX, this.middleY);
        } else {
            float max = Math.max(Math.abs(this.radiusX), Math.abs(this.radiusY));
            float f4 = this.centerX;
            float f5 = max * 1.42f;
            float f6 = this.centerY;
            rectF.set(f4 - f5, f6 - f5, f4 + f5, f6 + f5);
            if (getType() == 3) {
                rectF.union(this.middleX, this.middleY);
            }
        }
        float f7 = this.thickness;
        rectF.inset((-f7) - 3.0f, (-f7) - 3.0f);
    }
}
