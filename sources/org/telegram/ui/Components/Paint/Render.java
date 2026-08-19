package org.telegram.ui.Components.Paint;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public abstract class Render {
    public static RectF RenderPath(Path path, RenderState renderState, boolean z) {
        renderState.baseWeight = path.getBaseWeight();
        renderState.spacing = path.getBrush().getSpacing();
        renderState.alpha = z ? 1.0f : path.getBrush().getAlpha();
        renderState.angle = path.getBrush().getAngle();
        renderState.scale = path.getBrush().getScale();
        int length = path.getLength();
        if (length == 0) {
            return null;
        }
        int i = 0;
        if (length == 1) {
            PaintStamp(path.getPoints()[0], renderState);
        } else {
            Point[] points = path.getPoints();
            renderState.prepare();
            while (i < points.length - 1) {
                Point point = points[i];
                i++;
                PaintSegment(point, points[i], renderState);
            }
        }
        path.remainder = renderState.remainder;
        return Draw(renderState);
    }

    private static void PaintSegment(Point point, Point point2, RenderState renderState) {
        float f;
        RenderState renderState2 = renderState;
        double distanceTo = point.getDistanceTo(point2);
        Point pointSubstract = point2.substract(point);
        Point point3 = new Point(1.0d, 1.0d, 0.0d);
        float fAtan2 = Math.abs(renderState2.angle) > 0.0f ? renderState2.angle : (float) Math.atan2(pointSubstract.y, pointSubstract.x);
        float f2 = (float) ((((((double) renderState2.baseWeight) * point2.z) * ((double) renderState2.scale)) * 1.0d) / ((double) renderState2.viewportScale));
        double dMax = Math.max(1.0f, renderState2.spacing * f2);
        if (distanceTo > 0.0d) {
            point3 = pointSubstract.multiplyByScalar(1.0d / distanceTo);
        }
        float fMin = Math.min(1.0f, renderState2.alpha * 1.15f);
        boolean z = point.edge;
        boolean z2 = point2.edge;
        int iCeil = (int) Math.ceil((distanceTo - renderState2.remainder) / dMax);
        int count = renderState2.getCount();
        renderState2.appendValuesCount(iCeil);
        renderState2.setPosition(count);
        Point pointAdd = point.add(point3.multiplyByScalar(renderState2.remainder));
        double d = renderState2.remainder;
        boolean zAddPoint = true;
        while (true) {
            if (d > distanceTo) {
                f = fAtan2;
                break;
            }
            zAddPoint = renderState2.addPoint(pointAdd.toPointF(), f2, fAtan2, z ? fMin : renderState2.alpha, -1);
            f = fAtan2;
            if (!zAddPoint) {
                break;
            }
            pointAdd = pointAdd.add(point3.multiplyByScalar(dMax));
            d += dMax;
            fAtan2 = f;
            z = false;
        }
        if (zAddPoint && z2) {
            renderState2.appendValuesCount(1);
            renderState2.addPoint(point2.toPointF(), f2, f, fMin, -1);
            renderState2 = renderState2;
        }
        renderState2.remainder = d - distanceTo;
    }

    private static void PaintStamp(Point point, RenderState renderState) {
        float f = ((renderState.baseWeight * renderState.scale) * 1.0f) / renderState.viewportScale;
        PointF pointF = point.toPointF();
        float f2 = Math.abs(renderState.angle) > 0.0f ? renderState.angle : 0.0f;
        float f3 = renderState.alpha;
        renderState.prepare();
        renderState.appendValuesCount(1);
        renderState.addPoint(pointF, f, f2, f3, 0);
    }

    private static RectF Draw(RenderState renderState) {
        float f;
        RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        int count = renderState.getCount();
        if (count <= 0) {
            return rectF;
        }
        int i = count - 1;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((count * 4) + (i * 2)) * 20);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.position(0);
        renderState.setPosition(0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < count) {
            float f2 = renderState.read();
            float f3 = renderState.read();
            float f4 = renderState.read();
            float f5 = renderState.read();
            float f6 = renderState.read();
            RectF rectF2 = new RectF(f2 - f4, f3 - f4, f2 + f4, f3 + f4);
            float f7 = rectF2.left;
            float f8 = rectF2.top;
            float f9 = rectF2.right;
            float f10 = rectF2.bottom;
            float[] fArr = {f7, f8, f9, f8, f7, f10, f9, f10};
            float fCenterX = rectF2.centerX();
            float fCenterY = rectF2.centerY();
            Matrix matrix = new Matrix();
            int i4 = count;
            matrix.setRotate((float) Math.toDegrees(f5), fCenterX, fCenterY);
            matrix.mapPoints(fArr);
            matrix.mapRect(rectF2);
            Utils.RectFIntegral(rectF2);
            rectF.union(rectF2);
            if (i3 != 0) {
                floatBufferAsFloatBuffer.put(fArr[0]);
                floatBufferAsFloatBuffer.put(fArr[1]);
                f = 0.0f;
                floatBufferAsFloatBuffer.put(0.0f);
                floatBufferAsFloatBuffer.put(0.0f);
                floatBufferAsFloatBuffer.put(f6);
                i3++;
            } else {
                f = 0.0f;
            }
            floatBufferAsFloatBuffer.put(fArr[0]);
            floatBufferAsFloatBuffer.put(fArr[1]);
            floatBufferAsFloatBuffer.put(f);
            floatBufferAsFloatBuffer.put(f);
            floatBufferAsFloatBuffer.put(f6);
            floatBufferAsFloatBuffer.put(fArr[2]);
            floatBufferAsFloatBuffer.put(fArr[3]);
            floatBufferAsFloatBuffer.put(1.0f);
            floatBufferAsFloatBuffer.put(f);
            floatBufferAsFloatBuffer.put(f6);
            floatBufferAsFloatBuffer.put(fArr[4]);
            floatBufferAsFloatBuffer.put(fArr[5]);
            floatBufferAsFloatBuffer.put(f);
            floatBufferAsFloatBuffer.put(1.0f);
            floatBufferAsFloatBuffer.put(f6);
            floatBufferAsFloatBuffer.put(fArr[6]);
            floatBufferAsFloatBuffer.put(fArr[7]);
            floatBufferAsFloatBuffer.put(1.0f);
            floatBufferAsFloatBuffer.put(1.0f);
            floatBufferAsFloatBuffer.put(f6);
            int i5 = i3 + 4;
            if (i2 != i) {
                floatBufferAsFloatBuffer.put(fArr[6]);
                floatBufferAsFloatBuffer.put(fArr[7]);
                floatBufferAsFloatBuffer.put(1.0f);
                floatBufferAsFloatBuffer.put(1.0f);
                floatBufferAsFloatBuffer.put(f6);
                i3 += 5;
            } else {
                i3 = i5;
            }
            i2++;
            count = i4;
        }
        floatBufferAsFloatBuffer.position(0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) floatBufferAsFloatBuffer.slice());
        GLES20.glEnableVertexAttribArray(0);
        floatBufferAsFloatBuffer.position(2);
        GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) floatBufferAsFloatBuffer.slice());
        GLES20.glEnableVertexAttribArray(1);
        floatBufferAsFloatBuffer.position(4);
        GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) floatBufferAsFloatBuffer.slice());
        GLES20.glEnableVertexAttribArray(2);
        GLES20.glDrawArrays(5, 0, i3);
        return rectF;
    }
}
