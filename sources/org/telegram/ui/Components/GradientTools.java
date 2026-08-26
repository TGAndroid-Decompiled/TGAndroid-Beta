package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

public class GradientTools {
    public int color1;
    public int color2;
    public int color3;
    public int color4;
    public boolean isDiagonal;
    public boolean isLinear;
    public boolean isRotate;
    public Shader shader;
    public final Paint paint = new Paint(1);
    public final RectF bounds = new RectF();
    public final Matrix matrix = new Matrix();
    public Bitmap gradientBitmap = null;
    public final int[] colors = new int[4];

    public final void setBounds(RectF rectF) {
        RectF rectF2 = this.bounds;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        updateBounds();
    }

    public final void setColors(int i, int i2, int i3, int i4) {
        if (this.shader != null && this.color1 == i && this.color2 == i2 && this.color3 == i3 && this.color4 == i4) {
            return;
        }
        this.color1 = i;
        int[] iArr = this.colors;
        iArr[0] = i;
        this.color2 = i2;
        iArr[1] = i2;
        this.color3 = i3;
        iArr[2] = i3;
        this.color4 = i4;
        iArr[3] = i4;
        Paint paint = this.paint;
        if (i2 == 0) {
            this.shader = null;
            paint.setShader(null);
            paint.setColor(i);
        } else if (i3 == 0) {
            if (this.isDiagonal && this.isRotate) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i, i2}, (float[]) null, Shader.TileMode.CLAMP);
                this.shader = linearGradient;
                paint.setShader(linearGradient);
            } else {
                LinearGradient linearGradient2 = new LinearGradient(this.isDiagonal ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i, i2}, (float[]) null, Shader.TileMode.CLAMP);
                this.shader = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (!this.isLinear) {
            if (this.gradientBitmap == null) {
                this.gradientBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.gradientBitmap, 0, 0.0f, iArr);
            Bitmap bitmap = this.gradientBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.shader = bitmapShader;
            paint.setShader(bitmapShader);
        } else if (this.isDiagonal && this.isRotate) {
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i, i2, i3}, (float[]) null, Shader.TileMode.CLAMP);
            this.shader = linearGradient3;
            paint.setShader(linearGradient3);
        } else {
            LinearGradient linearGradient4 = new LinearGradient(this.isDiagonal ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i, i2, i3}, (float[]) null, Shader.TileMode.CLAMP);
            this.shader = linearGradient4;
            paint.setShader(linearGradient4);
        }
        updateBounds();
    }

    public void updateBounds() {
        if (this.shader == null) {
            return;
        }
        RectF rectF = this.bounds;
        float fWidth = rectF.width() / 60.0f;
        float fHeight = rectF.height() / 80.0f;
        Matrix matrix = this.matrix;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(fWidth, fHeight);
        this.shader.setLocalMatrix(matrix);
    }
}
