package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public class s10 {
    public boolean f39452a;
    public boolean f39453b;
    public int d;
    public int f39455e;
    public int f39456f;
    public int f39457g;
    public Shader f39458i;
    public boolean f39462m;
    public final Paint f39454c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f39459j = new Matrix();
    public Bitmap f39460k = null;
    public final int[] f39461l = new int[4];

    public final int a() {
        int i7 = this.d;
        int i10 = this.f39455e;
        if (i10 != 0) {
            i7 = i0.a.f(0.5f, i7, i10);
        }
        int i11 = this.f39456f;
        if (i11 != 0) {
            i7 = i0.a.f(0.5f, i7, i11);
        }
        int i12 = this.f39457g;
        if (i12 != 0) {
            return i0.a.f(0.5f, i7, i12);
        }
        return i7;
    }

    public final void b(float f10, float f11, float f12, float f13) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10, f11, f12, f13);
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

    public final void d(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        if (this.f39458i != null && this.d == i7 && this.f39455e == i10 && this.f39456f == i11 && this.f39457g == i12) {
            return;
        }
        this.d = i7;
        int[] iArr = this.f39461l;
        iArr[0] = i7;
        this.f39455e = i10;
        iArr[1] = i10;
        this.f39456f = i11;
        iArr[2] = i11;
        this.f39457g = i12;
        iArr[3] = i12;
        Paint paint = this.f39454c;
        if (i10 == 0) {
            this.f39458i = null;
            paint.setShader(null);
            paint.setColor(i7);
        } else if (i11 == 0) {
            if (this.f39452a && this.f39453b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i7, i10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f39458i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f39452a) {
                    f11 = 80.0f;
                } else {
                    f11 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f11, 0.0f, 0.0f, 80.0f, new int[]{i7, i10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f39458i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f39462m) {
            if (this.f39452a && this.f39453b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i7, i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f39458i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f39452a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i7, i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f39458i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f39460k == null) {
                this.f39460k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f39460k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f39460k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f39458i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f39458i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f39459j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f39458i.setLocalMatrix(matrix);
    }
}
