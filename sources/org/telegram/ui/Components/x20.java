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
    public boolean f32316a;
    public boolean f32317b;
    public int d;
    public int e;
    public int f32319f;
    public int f32320g;
    public Shader f32321i;
    public boolean f32325m;
    public final Paint f32318c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f32322j = new Matrix();
    public Bitmap f32323k = null;
    public final int[] f32324l = new int[4];

    public final int a() {
        int i10 = this.d;
        int i11 = this.e;
        if (i11 != 0) {
            i10 = i0.a.f(0.5f, i10, i11);
        }
        int i12 = this.f32319f;
        if (i12 != 0) {
            i10 = i0.a.f(0.5f, i10, i12);
        }
        int i13 = this.f32320g;
        if (i13 != 0) {
            return i0.a.f(0.5f, i10, i13);
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
        if (this.f32321i != null && this.d == i10 && this.e == i11 && this.f32319f == i12 && this.f32320g == i13) {
            return;
        }
        this.d = i10;
        int[] iArr = this.f32324l;
        iArr[0] = i10;
        this.e = i11;
        iArr[1] = i11;
        this.f32319f = i12;
        iArr[2] = i12;
        this.f32320g = i13;
        iArr[3] = i13;
        Paint paint = this.f32318c;
        if (i11 == 0) {
            this.f32321i = null;
            paint.setShader(null);
            paint.setColor(i10);
        } else if (i12 == 0) {
            if (this.f32316a && this.f32317b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32321i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f32316a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32321i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f32325m) {
            if (this.f32316a && this.f32317b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32321i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f32316a) {
                    f7 = 80.0f;
                } else {
                    f7 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f7, 0.0f, 0.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32321i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f32323k == null) {
                this.f32323k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f32323k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f32323k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f32321i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f32321i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f32322j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f32321i.setLocalMatrix(matrix);
    }
}
