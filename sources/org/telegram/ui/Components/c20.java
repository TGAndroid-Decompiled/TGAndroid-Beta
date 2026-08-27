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

public class c20 {

    public boolean f27290a;

    public boolean f27291b;
    public int d;

    public int f27293e;

    public int f27294f;

    public int f27295g;

    public Shader f27296i;

    public boolean f27300m;

    public final Paint f27292c = new Paint(1);
    public final RectF h = new RectF();

    public final Matrix f27297j = new Matrix();

    public Bitmap f27298k = null;

    public final int[] f27299l = new int[4];

    public final int a() {
        int iD = this.d;
        int i10 = this.f27293e;
        if (i10 != 0) {
            iD = i0.b.d(0.5f, iD, i10);
        }
        int i11 = this.f27294f;
        if (i11 != 0) {
            iD = i0.b.d(0.5f, iD, i11);
        }
        int i12 = this.f27295g;
        return i12 != 0 ? i0.b.d(0.5f, iD, i12) : iD;
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

    public final void d(int i10, int i11, int i12, int i13) {
        if (this.f27296i != null && this.d == i10 && this.f27293e == i11 && this.f27294f == i12 && this.f27295g == i13) {
            return;
        }
        this.d = i10;
        int[] iArr = this.f27299l;
        iArr[0] = i10;
        this.f27293e = i11;
        iArr[1] = i11;
        this.f27294f = i12;
        iArr[2] = i12;
        this.f27295g = i13;
        iArr[3] = i13;
        Paint paint = this.f27292c;
        if (i11 == 0) {
            this.f27296i = null;
            paint.setShader(null);
            paint.setColor(i10);
        } else if (i12 == 0) {
            if (this.f27290a && this.f27291b) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f27296i = linearGradient;
                paint.setShader(linearGradient);
            } else {
                LinearGradient linearGradient2 = new LinearGradient(this.f27290a ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i10, i11}, (float[]) null, Shader.TileMode.CLAMP);
                this.f27296i = linearGradient2;
                paint.setShader(linearGradient2);
            }
        } else if (!this.f27300m) {
            if (this.f27298k == null) {
                this.f27298k = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
            }
            Utilities.generateGradient(this.f27298k, 0, 0.0f, iArr);
            Bitmap bitmap = this.f27298k;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f27296i = bitmapShader;
            paint.setShader(bitmapShader);
        } else if (this.f27290a && this.f27291b) {
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, 80.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
            this.f27296i = linearGradient3;
            paint.setShader(linearGradient3);
        } else {
            LinearGradient linearGradient4 = new LinearGradient(this.f27290a ? 80.0f : 0.0f, 0.0f, 0.0f, 80.0f, new int[]{i10, i11, i12}, (float[]) null, Shader.TileMode.CLAMP);
            this.f27296i = linearGradient4;
            paint.setShader(linearGradient4);
        }
        e();
    }

    public void e() {
        if (this.f27296i == null) {
            return;
        }
        RectF rectF = this.h;
        float fWidth = rectF.width() / 60.0f;
        float fHeight = rectF.height() / 80.0f;
        Matrix matrix = this.f27297j;
        matrix.reset();
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.preScale(fWidth, fHeight);
        this.f27296i.setLocalMatrix(matrix);
    }
}
