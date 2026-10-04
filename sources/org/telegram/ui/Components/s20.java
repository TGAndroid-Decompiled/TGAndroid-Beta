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
public class s20 {
    public boolean f30594a;
    public boolean f30595b;
    public int d;
    public int f30597e;
    public int f30598f;
    public int f30599g;
    public Shader f30600i;
    public boolean f30604m;
    public final Paint f30596c = new Paint(1);
    public final RectF h = new RectF();
    public final Matrix f30601j = new Matrix();
    public Bitmap f30602k = null;
    public final int[] f30603l = new int[4];

    public final int a() {
        int i10 = this.d;
        int i11 = this.f30597e;
        if (i11 != 0) {
            i10 = i0.a.d(0.5f, i10, i11);
        }
        int i12 = this.f30598f;
        if (i12 != 0) {
            i10 = i0.a.d(0.5f, i10, i12);
        }
        int i13 = this.f30599g;
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
        if (this.f30600i != null && this.d == i10 && this.f30597e == i11 && this.f30598f == i12 && this.f30599g == i13) {
            return;
        }
        this.d = i10;
        int[] iArr = this.f30603l;
        iArr[0] = i10;
        this.f30597e = i11;
        iArr[1] = i11;
        this.f30598f = i12;
        iArr[2] = i12;
        this.f30599g = i13;
        iArr[3] = i13;
        Paint paint = this.f30596c;
        if (i11 == 0) {
            this.f30600i = null;
            paint.setShader(null);
            paint.setColor(i10);
        } else if (i12 == 0) {
            if (this.f30594a && this.f30595b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f30600i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                if (this.f30594a) {
                    f10 = 80.0f;
                } else {
                    f10 = 0.0f;
                }
                LinearGradient linearGradient2 = new LinearGradient(f10, 0.0f, 0.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f30600i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (this.f30604m) {
            if (this.f30594a && this.f30595b) {
                LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f30600i = linearGradient3;
                paint.setShader(linearGradient3);
            } else {
                if (this.f30594a) {
                    f7 = 80.0f;
                } else {
                    f7 = 0.0f;
                }
                LinearGradient linearGradient4 = new LinearGradient(f7, 0.0f, 0.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
                this.f30600i = linearGradient4;
                paint.setShader(linearGradient4);
            }
        } else {
            if (this.f30602k == null) {
                this.f30602k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f30602k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f30602k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f30600i = bitmapShader;
            paint.setShader(bitmapShader);
        }
        e();
    }

    public void e() {
        if (this.f30600i == null) {
            return;
        }
        RectF rectF = this.h;
        Matrix matrix = this.f30601j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(rectF.width() / 60.0f, rectF.height() / 80.0f);
        this.f30600i.setLocalMatrix(matrix);
    }
}
