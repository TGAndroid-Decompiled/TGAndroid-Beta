package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class x20 {
    public boolean f32283a;
    public boolean f32284b;
    public int d;
    public int e;
    public int f32286f;
    public int f32287g;
    public Shader f32288i;
    public boolean f32292m;
    public final Paint f32285c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f32289j = new Matrix();
    public Bitmap f32290k = null;
    public final int[] f32291l = new int[4];

    public final int a() {
        int i10 = this.d;
        int i11 = this.e;
        if (i11 != 0) {
            i10 = i0.b.f(0.5f, i10, i11);
        }
        int i12 = this.f32286f;
        if (i12 != 0) {
            i10 = i0.b.f(0.5f, i10, i12);
        }
        int i13 = this.f32287g;
        if (i13 != 0) {
            return i0.b.f(0.5f, i10, i13);
        }
        return i10;
    }

    public final void b(float f7, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, f10, f11, f12);
        c(rectF);
    }

    public final void c(RectF rectF) {
        RectF rectF2 = this.h;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        e();
    }

    public final void d(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        if (this.f32288i != null && this.d == i10 && this.e == i11 && this.f32286f == i12 && this.f32287g == i13) {
            return;
        }
        this.d = i10;
        int[] iArr = this.f32291l;
        iArr[0] = i10;
        this.e = i11;
        iArr[1] = i11;
        this.f32286f = i12;
        iArr[2] = i12;
        this.f32287g = i13;
        iArr[3] = i13;
        Paint paint = this.f32285c;
        if (i11 == 0) {
            this.f32288i = null;
            paint.setShader(null);
            paint.setColor(i10);
        } else if (i12 == 0) {
            if (this.f32283a && this.f32284b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32288i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f32283a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32288i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f32292m) {
            if (this.f32283a && this.f32284b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32288i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f32283a) {
                    f7 = 80.0f;
                } else {
                    f7 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f7, 0.0f, 0.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32288i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f32290k == null) {
                this.f32290k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f32290k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f32290k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f32288i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f32288i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f32289j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f32288i.setLocalMatrix(matrix);
    }
}
