package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
public final class r5 extends FrameLayout {
    public final Matrix f34779a;
    public boolean f34780b;
    public final Path f34781c;
    public final float[] d;
    public final s5 e;

    public r5(s5 s5Var, Context context) {
        super(context);
        this.e = s5Var;
        this.f34779a = new Matrix();
        this.f34781c = new Path();
        this.d = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        s5 s5Var = this.e;
        o5 o5Var = s5Var.f34818b;
        if (o5Var != null) {
            float[] fArr = (float[]) s5Var.f34824f.f9070b;
            float[] fArr2 = o5Var.f34669k;
            float[] fArr3 = o5Var.f34670l;
            Paint paint = o5Var.f34655b;
            Paint paint2 = o5Var.d;
            Path path = o5Var.f34674p;
            if (o5Var.f34675q != 0.0f) {
                int a2 = h7.a(fArr, -16216082);
                int a10 = h7.a(fArr, -15291399);
                paint.setShader(null);
                paint.setAlpha(255);
                paint.setColor(o5.d(0.55f, 0.0f, 0.0f, a2, a10));
                path.rewind();
                boolean z10 = true;
                path.moveTo(fArr3[0], fArr3[1]);
                int i10 = 1;
                while (i10 < 76) {
                    int i11 = i10 * 2;
                    path.lineTo(fArr3[i11], fArr3[i11 + 1]);
                    i10++;
                    z10 = z10;
                }
                path.close();
                canvas.drawPath(path, paint);
                paint2.setShader(null);
                paint2.setAlpha(255);
                float f11 = 0.6f;
                paint2.setStrokeWidth(o5Var.f34675q * 0.6f);
                int[] iArr = o5Var.f34673o;
                int length = iArr.length;
                int i12 = 0;
                while (i12 < length) {
                    int i13 = iArr[i12];
                    int i14 = i13 * 2;
                    int i15 = ((i13 + 1) % 76) * 2;
                    float[] fArr4 = o5Var.f34668j;
                    float f12 = (fArr4[i14] + fArr4[i15]) * 0.5f;
                    int i16 = i14 + 1;
                    int i17 = i15 + 1;
                    float f13 = (fArr4[i16] + fArr4[i17]) * 0.5f;
                    float f14 = f11;
                    int[] iArr2 = iArr;
                    int i18 = length;
                    float sqrt = 1.0f / ((float) Math.sqrt(r4.c.c(f13, f13, f12 * f12, 0.0144f)));
                    float f15 = f12 * sqrt;
                    float f16 = f13 * sqrt;
                    if (o5Var.f34676r) {
                        f7 = -0.12f;
                    } else {
                        f7 = 0.12f;
                    }
                    float c10 = o5.c((o5Var.Y * f7 * sqrt) + (o5Var.X * f16) + (o5Var.W * f15));
                    float f17 = f15 * o5Var.Z;
                    int d = o5.d((0.38f * c10) + 0.36f, 0.06f, ((float) Math.pow(o5.c((f10 * o5Var.f34656b0) + (f16 * o5Var.f34654a0) + f17), 24.0d)) * 0.1f, a2, a10);
                    paint.setColor(d);
                    paint2.setColor(d);
                    path.rewind();
                    path.moveTo(fArr2[i14], fArr2[i16]);
                    path.lineTo(fArr2[i15], fArr2[i17]);
                    path.lineTo(fArr3[i15], fArr3[i17]);
                    path.lineTo(fArr3[i14], fArr3[i16]);
                    path.close();
                    paint2.setStrokeWidth(o5Var.f34675q * f14);
                    canvas.drawPath(path, paint);
                    canvas.drawPath(path, paint2);
                    paint2.setColor(o5.d(0.75f, 0.0f, 0.0f, d, d));
                    paint2.setStrokeWidth(o5Var.f34675q * 0.7f);
                    canvas.drawLine(fArr3[i14], fArr3[i16], fArr3[i15], fArr3[i17], paint2);
                    i12++;
                    iArr = iArr2;
                    f11 = f14;
                    length = i18;
                }
            }
        }
        if (!this.f34780b) {
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f34779a);
        float width = getWidth();
        float height = getHeight();
        Path path2 = this.f34781c;
        path2.rewind();
        path2.addRoundRect(0.0f, 0.0f, width, height, (width * 0.15f) / 2.0f, (0.15f * height) / 1.212122f, Path.Direction.CW);
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        s5 s5Var = this.e;
        s5Var.f34825f0 = -1;
        s5Var.b(s5Var.W, s5Var.f34821c0);
    }
}
