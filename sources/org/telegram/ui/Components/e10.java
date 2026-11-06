package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public class e10 {
    public boolean f33084a;
    public boolean f33085b;
    public int d;
    public int f33087e;
    public int f33088f;
    public int f33089g;
    public Shader f33090i;
    public boolean f33094m;
    public final Paint f33086c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f33091j = new Matrix();
    public Bitmap f33092k = null;
    public final int[] f33093l = new int[4];

    public final int a() {
        int i7 = this.d;
        int i10 = this.f33087e;
        if (i10 != 0) {
            i7 = i0.a.f(0.5f, i7, i10);
        }
        int i11 = this.f33088f;
        if (i11 != 0) {
            i7 = i0.a.f(0.5f, i7, i11);
        }
        int i12 = this.f33089g;
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
        if (this.f33090i != null && this.d == i7 && this.f33087e == i10 && this.f33088f == i11 && this.f33089g == i12) {
            return;
        }
        this.d = i7;
        int[] iArr = this.f33093l;
        iArr[0] = i7;
        this.f33087e = i10;
        iArr[1] = i10;
        this.f33088f = i11;
        iArr[2] = i11;
        this.f33089g = i12;
        iArr[3] = i12;
        Paint paint = this.f33086c;
        if (i10 == 0) {
            this.f33090i = null;
            paint.setShader(null);
            paint.setColor(i7);
        } else if (i11 == 0) {
            if (this.f33084a && this.f33085b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i7, i10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f33090i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f33084a) {
                    f11 = 80.0f;
                } else {
                    f11 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f11, 0.0f, 0.0f, 80.0f, new int[]{i7, i10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f33090i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f33094m) {
            if (this.f33084a && this.f33085b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i7, i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f33090i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f33084a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i7, i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f33090i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f33092k == null) {
                this.f33092k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f33092k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f33092k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f33090i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f33090i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f33091j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f33090i.setLocalMatrix(matrix);
    }
}
