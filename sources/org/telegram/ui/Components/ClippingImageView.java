package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
public class ClippingImageView extends View {
    public static final float[] Q = new float[8];
    public BitmapShader E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Matrix I;
    public final Path J;
    public boolean K;
    public float L;
    public boolean M;
    public float[][] N;
    public float O;
    public float P;
    public int f23953a;
    public int f23954b;
    public int f23955c;
    public int d;
    public int f23956e;
    public int f23957f;
    public int h;
    public int f23958n;
    public final RectF f23959r;
    public final Paint f23960s;
    public ImageReceiver.BitmapHolder v;
    public final Matrix f23961w;
    public boolean f23962x;
    public final int[] f23963y;

    public ClippingImageView(Context context) {
        super(context);
        this.f23963y = new int[4];
        this.J = new Path();
        Paint paint = new Paint(2);
        this.f23960s = paint;
        paint.setFilterBitmap(true);
        this.f23961w = new Matrix();
        this.f23959r = new RectF();
        this.H = new RectF();
        this.F = new Paint(3);
        this.G = new RectF();
        this.I = new Matrix();
    }

    public float getAnimationProgress() {
        return this.L;
    }

    public Bitmap getBitmap() {
        ImageReceiver.BitmapHolder bitmapHolder = this.v;
        if (bitmapHolder != null) {
            return bitmapHolder.bitmap;
        }
        return null;
    }

    public ImageReceiver.BitmapHolder getBitmapHolder() {
        return this.v;
    }

    public float getCenterX() {
        float scaleY = getScaleY();
        float translationX = getTranslationX();
        float width = getWidth() - (this.f23955c / scaleY);
        return (getScaleX() * ((width + (this.f23954b / scaleY)) / 2.0f)) + translationX;
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        float translationY = getTranslationY();
        float height = getHeight() - (this.f23953a / scaleY);
        return (getScaleY() * ((height + (this.d / scaleY)) / 2.0f)) + translationY;
    }

    public int getClipBottom() {
        return this.f23953a;
    }

    public int getClipHorizontal() {
        return this.f23955c;
    }

    public int getClipLeft() {
        return this.f23954b;
    }

    public int getClipRight() {
        return this.f23955c;
    }

    public int getClipTop() {
        return this.d;
    }

    public int getOrientation() {
        return this.f23956e;
    }

    public int[] getRadius() {
        return this.f23963y;
    }

    @Override
    public float getTranslationY() {
        return super.getTranslationY() - this.O;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver.BitmapHolder bitmapHolder;
        float[] fArr;
        if (getVisibility() == 0 && (bitmapHolder = this.v) != null && !bitmapHolder.isRecycled()) {
            float scaleY = getScaleY();
            canvas.save();
            boolean z10 = this.f23962x;
            RectF rectF = this.H;
            if (z10) {
                Matrix matrix = this.I;
                matrix.reset();
                RectF rectF2 = this.G;
                rectF2.set(this.f23958n / scaleY, this.h / scaleY, getWidth() - (this.f23958n / scaleY), getHeight() - (this.h / scaleY));
                rectF.set(0.0f, 0.0f, this.v.getWidth(), this.v.getHeight());
                AndroidUtilities.setRectToRect(matrix, rectF, rectF2, this.f23956e, this.f23957f, false);
                this.E.setLocalMatrix(matrix);
                canvas.clipRect(this.f23954b / scaleY, this.d / scaleY, getWidth() - (this.f23955c / scaleY), getHeight() - (this.f23953a / scaleY));
                int i10 = 0;
                while (true) {
                    int[] iArr = this.f23963y;
                    int length = iArr.length;
                    fArr = Q;
                    if (i10 >= length) {
                        break;
                    }
                    int i11 = i10 * 2;
                    float f7 = iArr[i10];
                    fArr[i11] = f7;
                    fArr[i11 + 1] = f7;
                    i10++;
                }
                Path path = this.J;
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                path.close();
                canvas.drawPath(path, this.F);
            } else {
                int i12 = this.f23956e;
                RectF rectF3 = this.f23959r;
                Matrix matrix2 = this.f23961w;
                if (i12 != 90 && i12 != 270) {
                    if (i12 == 180) {
                        rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                        int i13 = this.f23957f;
                        if (i13 == 1) {
                            matrix2.postScale(-1.0f, 1.0f);
                        } else if (i13 == 2) {
                            matrix2.postScale(1.0f, -1.0f);
                        }
                        matrix2.postRotate(this.f23956e, 0.0f, 0.0f);
                        matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                    } else {
                        rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                        int i14 = this.f23957f;
                        if (i14 == 1) {
                            matrix2.postScale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
                        } else if (i14 == 2) {
                            matrix2.postScale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
                        }
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                    }
                } else {
                    rectF3.set((-getHeight()) / 2, (-getWidth()) / 2, getHeight() / 2, getWidth() / 2);
                    matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                    int i15 = this.f23957f;
                    if (i15 == 1) {
                        matrix2.postScale(-1.0f, 1.0f);
                    } else if (i15 == 2) {
                        matrix2.postScale(1.0f, -1.0f);
                    }
                    matrix2.postRotate(this.f23956e, 0.0f, 0.0f);
                    matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                }
                canvas.clipRect(this.f23954b / scaleY, this.d / scaleY, getWidth() - (this.f23955c / scaleY), getHeight() - (this.f23953a / scaleY));
                try {
                    canvas.drawBitmap(this.v.bitmap, matrix2, this.f23960s);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
            canvas.restore();
        }
    }

    public void setAdditionalTranslationX(float f7) {
        this.P = f7;
    }

    public void setAdditionalTranslationY(float f7) {
        this.O = f7;
    }

    public void setAnimationProgress(float f7) {
        this.L = f7;
        float[][] fArr = this.N;
        float f10 = fArr[0][0];
        setScaleX(((fArr[1][0] - f10) * f7) + f10);
        float[][] fArr2 = this.N;
        float f11 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f11) * this.L) + f11);
        float[][] fArr3 = this.N;
        float f12 = fArr3[0][2];
        float f13 = this.P;
        setTranslationX(((((fArr3[1][2] + f13) - f12) - f13) * this.L) + f12 + f13);
        float[][] fArr4 = this.N;
        float f14 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f14) * this.L) + f14);
        float[][] fArr5 = this.N;
        float f15 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f15) * this.L) + f15));
        float[][] fArr6 = this.N;
        float f16 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f16) * this.L) + f16));
        float[][] fArr7 = this.N;
        float f17 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f17) * this.L) + f17));
        int i10 = 0;
        while (true) {
            int[] iArr = this.f23963y;
            if (i10 >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.N;
            int i11 = i10 + 7;
            float f18 = fArr8[0][i11];
            iArr[i10] = (int) (((fArr8[1][i11] - f18) * this.L) + f18);
            setRadius(iArr);
            i10++;
        }
        float[][] fArr9 = this.N;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f19 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f19) * this.L) + f19));
            float[][] fArr11 = this.N;
            float f20 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f20) * this.L) + f20));
        }
        if (this.M) {
            if (!this.K) {
                f7 = 1.0f - f7;
            }
            setAlpha(f7);
        }
        invalidate();
    }

    public void setClipBottom(int i10) {
        this.f23953a = i10;
        invalidate();
    }

    public void setClipHorizontal(int i10) {
        this.f23955c = i10;
        this.f23954b = i10;
        invalidate();
    }

    public void setClipLeft(int i10) {
        this.f23954b = i10;
        invalidate();
    }

    public void setClipRight(int i10) {
        this.f23955c = i10;
        invalidate();
    }

    public void setClipTop(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setClipVertical(int i10) {
        this.f23953a = i10;
        this.d = i10;
        invalidate();
    }

    public void setImageBitmap(ImageReceiver.BitmapHolder bitmapHolder) {
        ImageReceiver.BitmapHolder bitmapHolder2 = this.v;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.E = null;
        }
        if (bitmapHolder != null && bitmapHolder.isRecycled()) {
            bitmapHolder = null;
        }
        this.v = bitmapHolder;
        if (bitmapHolder != null && bitmapHolder.bitmap != null) {
            this.H.set(0.0f, 0.0f, bitmapHolder.getWidth(), bitmapHolder.getHeight());
            Bitmap bitmap = this.v.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.E = bitmapShader;
            this.F.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i10) {
        this.f23958n = i10;
    }

    public void setImageY(int i10) {
        this.h = i10;
    }

    public void setOrientation(int i10) {
        this.f23956e = i10;
        this.f23957f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.f23963y;
        if (iArr == null) {
            this.f23962x = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f23962x = false;
        for (int i10 : iArr) {
            if (i10 != 0) {
                this.f23962x = true;
                return;
            }
        }
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7 + this.O);
    }
}
