package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class GradientTools {
    int color1;
    int color2;
    int color3;
    int color4;
    public boolean isDiagonal;
    public boolean isLinear;
    public boolean isRotate;
    Shader shader;
    public Paint paint = new Paint(1);
    RectF bounds = new RectF();
    Matrix matrix = new Matrix();
    Bitmap gradientBitmap = null;
    int[] colors = new int[4];

    public int getAverageColor() {
        int i = this.color1;
        int i2 = this.color2;
        if (i2 != 0) {
            i = ColorUtils.blendARGB(i, i2, 0.5f);
        }
        int i3 = this.color3;
        if (i3 != 0) {
            i = ColorUtils.blendARGB(i, i3, 0.5f);
        }
        int i4 = this.color4;
        return i4 != 0 ? ColorUtils.blendARGB(i, i4, 0.5f) : i;
    }

    public void setBounds(float f, float f2, float f3, float f4) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f, f2, f3, f4);
        setBounds(rectF);
    }

    public void setBounds(RectF rectF) {
        RectF rectF2 = this.bounds;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        updateBounds();
    }

    public void setColors(int i, int i2) {
        setColors(i, i2, 0, 0);
    }

    public void setColors(int i, int i2, int i3, int i4) {
        if (this.shader != null && this.color1 == i && this.color2 == i2 && this.color3 == i3 && this.color4 == i4) {
            return;
        }
        int[] iArr = this.colors;
        this.color1 = i;
        iArr[0] = i;
        this.color2 = i2;
        iArr[1] = i2;
        this.color3 = i3;
        iArr[2] = i3;
        this.color4 = i4;
        iArr[3] = i4;
        if (i2 == 0) {
            Paint paint = this.paint;
            this.shader = null;
            paint.setShader(null);
            this.paint.setColor(i);
        } else if (i3 == 0) {
            if (this.isDiagonal && this.isRotate) {
                Paint paint2 = this.paint;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i, i2}, (float[]) null, Shader.TileMode.CLAMP);
                this.shader = linearGradient;
                paint2.setShader(linearGradient);
            } else {
                Paint paint3 = this.paint;
                LinearGradient linearGradient2 = new LinearGradient(this.isDiagonal ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i, i2}, (float[]) null, Shader.TileMode.CLAMP);
                this.shader = linearGradient2;
                paint3.setShader(linearGradient2);
            }
        } else if (!this.isLinear) {
            if (this.gradientBitmap == null) {
                this.gradientBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap = this.gradientBitmap;
            Utilities.generateGradient(bitmap, true, 0, 0.0f, bitmap.getWidth(), this.gradientBitmap.getHeight(), this.gradientBitmap.getRowBytes(), this.colors);
            Paint paint4 = this.paint;
            Bitmap bitmap2 = this.gradientBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            this.shader = bitmapShader;
            paint4.setShader(bitmapShader);
        } else if (this.isDiagonal && this.isRotate) {
            Paint paint5 = this.paint;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i, i2, i3}, (float[]) null, Shader.TileMode.CLAMP);
            this.shader = linearGradient3;
            paint5.setShader(linearGradient3);
        } else {
            Paint paint6 = this.paint;
            LinearGradient linearGradient4 = new LinearGradient(this.isDiagonal ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i, i2, i3}, (float[]) null, Shader.TileMode.CLAMP);
            this.shader = linearGradient4;
            paint6.setShader(linearGradient4);
        }
        updateBounds();
    }

    public void updateBounds() {
        if (this.shader == null) {
            return;
        }
        float width = this.bounds.width() / 60.0f;
        float height = this.bounds.height() / 80.0f;
        this.matrix.reset();
        Matrix matrix = this.matrix;
        RectF rectF = this.bounds;
        matrix.postTranslate(rectF.left, rectF.top);
        this.matrix.preScale(width, height);
        this.shader.setLocalMatrix(this.matrix);
    }
}
