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
    public boolean f28913a;
    public boolean f28914b;
    public int d;
    public int e;
    public int f28916f;
    public int f28917g;
    public Shader f28918i;
    public boolean f28922m;
    public final Paint f28915c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f28919j = new Matrix();
    public Bitmap f28920k = null;
    public final int[] f28921l = new int[4];

    public final int a() {
        int i10 = this.d;
        int i11 = this.e;
        if (i11 != 0) {
            i10 = i0.a.d(0.5f, i10, i11);
        }
        int i12 = this.f28916f;
        if (i12 != 0) {
            i10 = i0.a.d(0.5f, i10, i12);
        }
        int i13 = this.f28917g;
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
        if (this.f28918i != null && this.d == i10 && this.e == i11 && this.f28916f == i12 && this.f28917g == i13) {
            return;
        }
        this.d = i10;
        int[] iArr = this.f28921l;
        iArr[0] = i10;
        this.e = i11;
        iArr[1] = i11;
        this.f28916f = i12;
        iArr[2] = i12;
        this.f28917g = i13;
        iArr[3] = i13;
        Paint paint = this.f28915c;
        if (i11 == 0) {
            this.f28918i = null;
            paint.setShader(null);
            paint.setColor(i10);
        } else if (i12 == 0) {
            if (this.f28913a && this.f28914b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f28918i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f28913a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f28918i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f28922m) {
            if (this.f28913a && this.f28914b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f28918i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f28913a) {
                    f7 = 80.0f;
                } else {
                    f7 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f7, 0.0f, 0.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f28918i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f28920k == null) {
                this.f28920k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f28920k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f28920k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f28918i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f28918i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f28919j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f28918i.setLocalMatrix(matrix);
    }
}
