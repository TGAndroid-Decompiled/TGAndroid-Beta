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
public class g30 {
    public boolean f26589a;
    public boolean f26590b;
    public int d;
    public int f26592e;
    public int f26593f;
    public int f26594g;
    public Shader f26595i;
    public boolean f26599m;
    public final Paint f26591c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f26596j = new Matrix();
    public Bitmap f26597k = null;
    public final int[] f26598l = new int[4];

    public final int a() {
        int i10 = this.d;
        int i11 = this.f26592e;
        if (i11 != 0) {
            i10 = i0.a.d(0.5f, i10, i11);
        }
        int i12 = this.f26593f;
        if (i12 != 0) {
            i10 = i0.a.d(0.5f, i10, i12);
        }
        int i13 = this.f26594g;
        if (i13 != 0) {
            return i0.a.d(0.5f, i10, i13);
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
        if (this.f26595i != null && this.d == i10 && this.f26592e == i11 && this.f26593f == i12 && this.f26594g == i13) {
            return;
        }
        this.d = i10;
        int[] iArr = this.f26598l;
        iArr[0] = i10;
        this.f26592e = i11;
        iArr[1] = i11;
        this.f26593f = i12;
        iArr[2] = i12;
        this.f26594g = i13;
        iArr[3] = i13;
        Paint paint = this.f26591c;
        if (i11 == 0) {
            this.f26595i = null;
            paint.setShader(null);
            paint.setColor(i10);
        } else if (i12 == 0) {
            if (this.f26589a && this.f26590b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f26595i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f26589a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f26595i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f26599m) {
            if (this.f26589a && this.f26590b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f26595i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f26589a) {
                    f7 = 80.0f;
                } else {
                    f7 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f7, 0.0f, 0.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f26595i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f26597k == null) {
                this.f26597k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f26597k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f26597k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f26595i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f26595i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f26596j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f26595i.setLocalMatrix(matrix);
    }
}
