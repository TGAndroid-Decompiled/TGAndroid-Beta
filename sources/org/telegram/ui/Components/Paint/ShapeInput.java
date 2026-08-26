package org.telegram.ui.Components.Paint;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.Components.Size;

public final class ShapeInput {
    public final ArrayList allPoints;
    public AnonymousClass1 center;
    public final Paint centerPointPaint;
    public final Paint centerPointStrokePaint;
    public final Paint controlPointPaint;
    public final Paint controlPointStrokePaint;
    public final RenderView$$ExternalSyntheticLambda0 invalidate;
    public Matrix invertMatrix;
    public final Paint linePaint;
    public Point movingPoint;
    public final ArrayList movingPoints;
    public final RenderView renderView;
    public Shape shape;
    public final float[] tempPoint;
    public float touchOffsetX;
    public float touchOffsetY;

    public final class AnonymousClass1 extends Point {
        public final int $r8$classId;
        public final ShapeInput this$0;

        public AnonymousClass1(ShapeInput shapeInput, int i) {
            this.$r8$classId = i;
            this.this$0 = shapeInput;
        }

        @Override
        public final void set() {
            switch (this.$r8$classId) {
                case 0:
                    ShapeInput shapeInput = this.this$0;
                    Shape shape = shapeInput.shape;
                    double dAtan2 = Math.atan2(shape.centerY - shape.middleY, shape.centerX - shape.middleX) + 3.141592653589793d;
                    Shape shape2 = shapeInput.shape;
                    double d = shape2.arrowTriangleLength / 5.5f;
                    float fCos = shape2.centerX + ((float) (Math.cos(dAtan2) * d));
                    float fSin = shapeInput.shape.centerY + ((float) (Math.sin(dAtan2) * d));
                    this.x = fCos;
                    this.y = fSin;
                    break;
                case 1:
                    Shape shape3 = this.this$0.shape;
                    float f = shape3.centerX + shape3.radiusX;
                    float f2 = shape3.centerY;
                    this.x = f;
                    this.y = f2;
                    break;
                case 2:
                    ShapeInput shapeInput2 = this.this$0;
                    Shape shape4 = shapeInput2.shape;
                    float fMin = Math.min(shape4.radiusX, shape4.radiusY);
                    float fCos2 = (((float) Math.cos(-0.3141592653589793d)) * fMin) + shapeInput2.shape.centerX;
                    float fSin2 = (((float) Math.sin(-0.3141592653589793d)) * fMin) + shapeInput2.shape.centerY;
                    this.x = fCos2;
                    this.y = fSin2;
                    break;
                case 3:
                    Shape shape5 = this.this$0.shape;
                    float f3 = shape5.centerX;
                    float fAbs = shape5.centerY - Math.abs(shape5.radiusY);
                    this.x = f3;
                    this.y = fAbs;
                    break;
                case 4:
                    Shape shape6 = this.this$0.shape;
                    float f4 = shape6.middleX;
                    float f5 = shape6.middleY;
                    shape6.middleX = f4;
                    shape6.middleY = f5;
                    this.x = f4;
                    this.y = f5;
                    break;
                default:
                    Shape shape7 = this.this$0.shape;
                    this.x = shape7.centerX;
                    this.y = shape7.centerY;
                    break;
            }
        }

        @Override
        public final void update(float f, float f2) {
            float f3;
            switch (this.$r8$classId) {
                case 0:
                    ShapeInput shapeInput = this.this$0;
                    Shape shape = shapeInput.shape;
                    double dAtan2 = Math.atan2(shape.centerY - shape.middleY, shape.centerX - shape.middleX) + 1.5707963267948966d;
                    Shape shape2 = shapeInput.shape;
                    float fDistance = (MathUtils.distance(shape2.centerX, shape2.centerY, shape2.middleX, shape2.middleY) * 5.5f) / 2.0f;
                    Shape shape3 = shapeInput.shape;
                    shape3.arrowTriangleLength = Math.min(fDistance, Math.max(100.0f, (-((float) ((Math.cos(dAtan2) * ((double) (shape3.centerY - f2))) - (Math.sin(dAtan2) * ((double) (shape3.centerX - f)))))) * 5.5f));
                    set();
                    break;
                case 1:
                    this.x = f;
                    this.y = f2;
                    Shape shape4 = this.this$0.shape;
                    float fDistance2 = MathUtils.distance(shape4.centerX, shape4.centerY, f, f2);
                    shape4.radiusY = fDistance2;
                    shape4.radiusX = fDistance2;
                    break;
                case 2:
                    ShapeInput shapeInput2 = this.this$0;
                    Shape shape5 = shapeInput2.shape;
                    float fDistance3 = MathUtils.distance(shape5.centerX, shape5.centerY, f, f2);
                    shape5.radiusY = fDistance3;
                    shape5.radiusX = fDistance3;
                    Shape shape6 = shapeInput2.shape;
                    shape6.rotation = (float) ((((double) ((float) Math.atan2(shape6.centerY - f2, f - shape6.centerX))) - 0.3141592653589793d) + ((double) shape6.rotation));
                    set();
                    break;
                case 3:
                    ShapeInput shapeInput3 = this.this$0;
                    Shape shape7 = shapeInput3.shape;
                    shape7.rotation = (float) ((((double) ((float) Math.atan2(shape7.centerY - f2, f - shape7.centerX))) - 1.5707963267948966d) + ((double) shape7.rotation));
                    for (int i = 0; i < shapeInput3.allPoints.size(); i++) {
                        Point point = (Point) shapeInput3.allPoints.get(i);
                        if (point instanceof CornerPoint) {
                            point.set();
                        }
                    }
                    break;
                case 4:
                    Shape shape8 = this.this$0.shape;
                    shape8.middleX = f;
                    shape8.middleY = f2;
                    this.x = f;
                    this.y = f2;
                    float f4 = shape8.centerY;
                    float f5 = shape8.radiusY;
                    float f6 = f4 - f5;
                    if (f2 > f6 && f2 < f4 + f5) {
                        float f7 = shape8.centerX;
                        if (f <= f7) {
                            float f8 = f7 - shape8.radiusX;
                            if (f > f8) {
                                this.x = f8;
                            } else if (f > f4) {
                                f3 = f7 + shape8.radiusX;
                                if (f < f3) {
                                    this.x = f3;
                                }
                            }
                        } else if (f > f4) {
                            f3 = f7 + shape8.radiusX;
                            if (f < f3) {
                                this.x = f3;
                            }
                        }
                    }
                    float f9 = this.x;
                    float f10 = shape8.centerX;
                    float f11 = shape8.radiusX;
                    if (f9 > f10 - f11 && f9 < f10 + f11) {
                        if (f2 <= f4 && f2 > f6) {
                            this.y = f6;
                        } else if (f2 > f4) {
                            float f12 = f4 + f5;
                            if (f2 < f12) {
                                this.y = f12;
                            }
                        }
                    }
                    shape8.middleX = f9;
                    shape8.middleY = this.y;
                    break;
                default:
                    int i2 = 0;
                    while (true) {
                        ShapeInput shapeInput4 = this.this$0;
                        if (i2 >= shapeInput4.allPoints.size()) {
                            Shape shape9 = shapeInput4.shape;
                            shape9.centerX = f;
                            shape9.centerY = f2;
                            this.x = f;
                            this.y = f2;
                        } else {
                            Point point2 = (Point) shapeInput4.allPoints.get(i2);
                            if (point2 != this) {
                                point2.set();
                            }
                            i2++;
                        }
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass1(ShapeInput shapeInput, int i, boolean z) {
            super(0);
            this.$r8$classId = i;
            this.this$0 = shapeInput;
        }
    }

    public final class CornerPoint extends Point {
        public final float rx;
        public final float ry;
        public final Shape shape;

        public CornerPoint(Shape shape, boolean z, boolean z2) {
            this.rotate = false;
            this.shape = shape;
            this.rx = z ? -1.0f : 1.0f;
            this.ry = z2 ? -1.0f : 1.0f;
            set();
        }

        @Override
        public final void set() {
            Shape shape = this.shape;
            if (shape != null) {
                float f = (this.rx * shape.radiusX) + shape.centerX;
                float f2 = (this.ry * shape.radiusY) + shape.centerY;
                ShapeInput shapeInput = ShapeInput.this;
                shapeInput.rotate(f, f2, true);
                float[] fArr = shapeInput.tempPoint;
                float f3 = fArr[0];
                float f4 = fArr[1];
                this.x = f3;
                this.y = f4;
            }
        }

        @Override
        public final void update(float f, float f2) {
            this.x = f;
            this.y = f2;
            Shape shape = this.shape;
            float f3 = ((-this.rx) * shape.radiusX) + shape.centerX;
            float f4 = ((-this.ry) * shape.radiusY) + shape.centerY;
            ShapeInput shapeInput = ShapeInput.this;
            shapeInput.rotate(f, f2, false);
            shapeInput.rotate(f3, f4, true);
            float[] fArr = shapeInput.tempPoint;
            float f5 = fArr[0];
            float f6 = fArr[1];
            double dAtan2 = (3.141592653589793d - Math.atan2(f2 - f6, f - f5)) - ((double) shape.rotation);
            double dCos = Math.cos(dAtan2) * ((double) MathUtils.distance(f, f2, f5, f6));
            double dSin = Math.sin(dAtan2) * ((double) MathUtils.distance(f, f2, f5, f6));
            shape.radiusX = ((float) Math.abs(dCos)) / 2.0f;
            shape.radiusY = ((float) Math.abs(dSin)) / 2.0f;
            shape.centerX = (f + f5) / 2.0f;
            shape.centerY = (f2 + f6) / 2.0f;
            for (int i = 0; i < shapeInput.allPoints.size(); i++) {
                ((Point) shapeInput.allPoints.get(i)).set();
            }
        }
    }

    public ShapeInput(RenderView renderView, RenderView$$ExternalSyntheticLambda0 renderView$$ExternalSyntheticLambda0) {
        Paint paint = new Paint(1);
        this.linePaint = paint;
        Paint paint2 = new Paint(1);
        this.centerPointPaint = paint2;
        Paint paint3 = new Paint(1);
        this.centerPointStrokePaint = paint3;
        Paint paint4 = new Paint(1);
        this.controlPointPaint = paint4;
        Paint paint5 = new Paint(1);
        this.controlPointStrokePaint = paint5;
        this.allPoints = new ArrayList();
        this.movingPoints = new ArrayList();
        this.tempPoint = new float[2];
        this.renderView = renderView;
        this.invalidate = renderView$$ExternalSyntheticLambda0;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
    }

    public static float distToLine(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float fMax = Math.max(Math.min((((f2 - f4) * f8) + ((f - f3) * f7)) / ((f8 * f8) + (f7 * f7)), 1.0f), 0.0f);
        float f9 = ((f7 * fMax) + f3) - f;
        float f10 = ((fMax * f8) + f4) - f2;
        return (float) Math.sqrt((f10 * f10) + (f9 * f9));
    }

    public final void drawPoint(Canvas canvas, Size size, Point point) {
        float width = (point.x / size.width) * canvas.getWidth();
        float height = (point.y / size.height) * canvas.getHeight();
        float fDp = AndroidUtilities.dp(5.0f);
        boolean z = point.green;
        canvas.drawCircle(width, height, fDp, z ? this.centerPointPaint : this.controlPointPaint);
        canvas.drawCircle((point.x / size.width) * canvas.getWidth(), (point.y / size.height) * canvas.getHeight(), AndroidUtilities.dp(5.0f), z ? this.centerPointStrokePaint : this.controlPointStrokePaint);
    }

    public final void rotate(float f, float f2, boolean z) {
        float[] fArr = this.tempPoint;
        fArr[0] = f;
        fArr[1] = f2;
        rotate(z);
    }

    public final void stop() {
        Shape shape;
        RenderView renderView = this.renderView;
        if (renderView == null || renderView.getPainting() == null || (shape = this.shape) == null) {
            return;
        }
        shape.thickness = renderView.getCurrentWeight();
        Painting painting = renderView.getPainting();
        Shape shape2 = this.shape;
        int currentColor = renderView.getCurrentColor();
        if (shape2 == null) {
            painting.getClass();
        } else if (painting.shaders != null) {
            painting.renderView.performInContext(new ChatActivity$$ExternalSyntheticLambda17(painting, shape2, currentColor, 25));
        }
        this.allPoints.clear();
        this.movingPoints.clear();
        this.shape = null;
        RenderView.RenderViewDelegate renderViewDelegate = renderView.delegate;
        if (renderViewDelegate != null) {
            renderViewDelegate.resetBrush();
        }
        renderView.input.ignore = true;
    }

    public abstract class Point {
        public boolean draw;
        public final boolean green;
        public boolean rotate;
        public float x;
        public float y;

        public Point() {
            this.rotate = true;
            this.draw = true;
            set();
        }

        public abstract void set();

        public abstract void update(float f, float f2);

        public Point(int i) {
            this.rotate = true;
            this.draw = true;
            this.green = true;
            set();
        }
    }

    public final void rotate(boolean z) {
        Shape shape = this.shape;
        if (shape != null) {
            float f = shape.rotation;
            if (f != 0.0f) {
                float[] fArr = this.tempPoint;
                float f2 = fArr[0] - shape.centerX;
                fArr[0] = f2;
                fArr[1] = fArr[1] - shape.centerY;
                double d = f * (z ? -1 : 1);
                float fCos = (float) ((Math.cos(d) * ((double) f2)) - (Math.sin(d) * ((double) fArr[1])));
                float fM = (float) AndroidUtilities$$ExternalSyntheticOutline1.m(d, fArr[1], Math.sin(d) * ((double) fArr[0]));
                Shape shape2 = this.shape;
                fArr[0] = fCos + shape2.centerX;
                fArr[1] = fM + shape2.centerY;
            }
        }
    }
}
