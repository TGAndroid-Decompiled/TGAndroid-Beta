package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;
public class b10 {
    public boolean f32036a;
    public boolean f32037b;
    public int d;
    public int f32039e;
    public int f32040f;
    public int f32041g;
    public Shader f32042i;
    public boolean f32046m;
    public final Paint f32038c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f32043j = new Matrix();
    public Bitmap f32044k = null;
    public final int[] f32045l = new int[4];

    public final int a() {
        int i3 = this.d;
        int i10 = this.f32039e;
        if (i10 != 0) {
            i3 = i0.a.f(0.5f, i3, i10);
        }
        int i11 = this.f32040f;
        if (i11 != 0) {
            i3 = i0.a.f(0.5f, i3, i11);
        }
        int i12 = this.f32041g;
        if (i12 != 0) {
            return i0.a.f(0.5f, i3, i12);
        }
        return i3;
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

    public final void d(int i3, int i10, int i11, int i12) {
        float f10;
        float f11;
        if (this.f32042i != null && this.d == i3 && this.f32039e == i10 && this.f32040f == i11 && this.f32041g == i12) {
            return;
        }
        this.d = i3;
        int[] iArr = this.f32045l;
        iArr[0] = i3;
        this.f32039e = i10;
        iArr[1] = i10;
        this.f32040f = i11;
        iArr[2] = i11;
        this.f32041g = i12;
        iArr[3] = i12;
        Paint paint = this.f32038c;
        if (i10 == 0) {
            this.f32042i = null;
            paint.setShader(null);
            paint.setColor(i3);
        } else if (i11 == 0) {
            if (this.f32036a && this.f32037b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i3, i10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32042i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f32036a) {
                    f11 = 80.0f;
                } else {
                    f11 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f11, 0.0f, 0.0f, 80.0f, new int[]{i3, i10}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32042i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f32046m) {
            if (this.f32036a && this.f32037b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i3, i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32042i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f32036a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i3, i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f32042i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f32044k == null) {
                this.f32044k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f32044k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f32044k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f32042i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f32042i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f32043j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f32042i.setLocalMatrix(matrix);
    }
}
