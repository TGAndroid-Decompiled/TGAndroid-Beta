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
public class z10 {
    public boolean f35153a;
    public boolean f35154b;
    public int d;
    public int f35156e;
    public int f35157f;
    public int f35158g;
    public Shader f35159i;
    public boolean f35163m;
    public final Paint f35155c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f35160j = new Matrix();
    public Bitmap f35161k = null;
    public final int[] f35162l = new int[4];

    public final int a() {
        int i9 = this.d;
        int i10 = this.f35156e;
        if (i10 != 0) {
            i9 = i0.a.d(0.5f, i9, i10);
        }
        int i11 = this.f35157f;
        if (i11 != 0) {
            i9 = i0.a.d(0.5f, i9, i11);
        }
        int i12 = this.f35158g;
        if (i12 != 0) {
            return i0.a.d(0.5f, i9, i12);
        }
        return i9;
    }

    public final void b(float f10, float f11, float f12, float f13) {
        RectF rectF = AndroidUtilities.rectTmp;
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

    public final void d(int i9, int i10, int i11, int i12) {
        float f10;
        float f11;
        if (this.f35159i != null && this.d == i9 && this.f35156e == i10 && this.f35157f == i11 && this.f35158g == i12) {
            return;
        }
        this.d = i9;
        int[] iArr = this.f35162l;
        iArr[0] = i9;
        this.f35156e = i10;
        iArr[1] = i10;
        this.f35157f = i11;
        iArr[2] = i11;
        this.f35158g = i12;
        iArr[3] = i12;
        Paint paint = this.f35155c;
        if (i10 == 0) {
            this.f35159i = null;
            paint.setShader(null);
            paint.setColor(i9);
        } else if (i11 == 0) {
            if (this.f35153a && this.f35154b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i9, i10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f35159i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f35153a) {
                    f11 = 80.0f;
                } else {
                    f11 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f11, 0.0f, 0.0f, 80.0f, new int[]{i9, i10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f35159i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f35163m) {
            if (this.f35153a && this.f35154b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i9, i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f35159i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f35153a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i9, i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f35159i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f35161k == null) {
                this.f35161k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f35161k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f35161k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f35159i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f35159i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f35160j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f35159i.setLocalMatrix(matrix);
    }
}
