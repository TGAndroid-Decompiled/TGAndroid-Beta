package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Build;

public abstract class BatchParticlesDrawHelper {
    public static boolean isAvailable() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static void draw(Canvas canvas, BatchParticlesBuffer batchParticlesBuffer, int i, Paint paint) {
        draw(canvas, batchParticlesBuffer, i, 0, paint);
    }

    public static void draw(Canvas canvas, BatchParticlesBuffer batchParticlesBuffer, int i, int i2, Paint paint) {
        int i3 = i2 * 8;
        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i * 8, batchParticlesBuffer.batchCordVertex, i3, batchParticlesBuffer.batchCordTexture, i3, batchParticlesBuffer.batchColors, i2 * 4, batchParticlesBuffer.batchIdx, i2 * 6, i * 6, paint);
    }

    public static Paint createBatchParticlesPaint(Bitmap bitmap) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        Paint paint = new Paint(1);
        paint.setShader(bitmapShader);
        paint.setFilterBitmap(true);
        return paint;
    }

    public static class BatchParticlesBuffer {
        protected final int[] batchColors;
        protected final float[] batchCordTexture;
        protected final float[] batchCordVertex;
        protected final short[] batchIdx;
        public final int vertexCount;

        public BatchParticlesBuffer(int i) {
            this.vertexCount = i;
            int i2 = i * 8;
            this.batchCordVertex = new float[i2];
            this.batchCordTexture = new float[i2];
            this.batchIdx = new short[i * 6];
            this.batchColors = new int[i * 4];
            for (short s = 0; s < i; s = (short) (s + 1)) {
                int i3 = s * 6;
                int i4 = s * 4;
                short[] sArr = this.batchIdx;
                short s2 = (short) i4;
                sArr[i3] = s2;
                sArr[i3 + 1] = (short) (i4 + 1);
                short s3 = (short) (i4 + 2);
                sArr[i3 + 2] = s3;
                sArr[i3 + 3] = s3;
                sArr[i3 + 4] = (short) (i4 + 3);
                sArr[i3 + 5] = s2;
            }
        }

        public void setParticleColor(int i, int i2) {
            int[] iArr = this.batchColors;
            int i3 = i * 4;
            iArr[i3] = i2;
            iArr[i3 + 1] = i2;
            iArr[i3 + 2] = i2;
            iArr[i3 + 3] = i2;
        }

        public void setParticleVertexCords(int i, float f, float f2, float f3, float f4) {
            bufferVertexSet(this.batchCordVertex, i, f, f2, f3, f4);
        }

        public void setParticleTextureCords(int i, float f, float f2, float f3, float f4) {
            bufferVertexSet(this.batchCordTexture, i, f, f2, f3, f4);
        }

        public void fillParticleTextureCords(float f, float f2, float f3, float f4) {
            for (int i = 0; i < this.vertexCount; i++) {
                setParticleTextureCords(i, f, f2, f3, f4);
            }
        }

        private static void bufferVertexSet(float[] fArr, int i, float f, float f2, float f3, float f4) {
            int i2 = i * 8;
            fArr[i2] = f;
            fArr[i2 + 1] = f2;
            fArr[i2 + 2] = f3;
            fArr[i2 + 3] = f2;
            fArr[i2 + 4] = f3;
            fArr[i2 + 5] = f4;
            fArr[i2 + 6] = f;
            fArr[i2 + 7] = f4;
        }
    }
}
