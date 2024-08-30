package org.telegram.ui.Components.Paint;

import org.telegram.ui.Components.Paint.Brush;

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

    public void getBounds(android.graphics.RectF r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Paint.Shape.getBounds(android.graphics.RectF):void");
    }

    public int getType() {
        return this.brush.getShapeShaderType();
    }
}
