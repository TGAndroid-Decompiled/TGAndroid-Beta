package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class na {
    public final ja f28737a;
    public final View f28738b;
    public final ColorMatrix f28739c;
    public final boolean d;
    public boolean e;
    public float f28740f;
    public Paint f28741g;
    public Paint h;
    public final int f28742i;
    public final Integer f28743j;
    public final Path f28744k;
    public int f28745l;
    public int f28746m;
    public Bitmap f28747n;
    public BitmapShader f28748o;
    public final Matrix f28749p;
    public final RectF f28750q;
    public boolean f28751r;
    public Paint[] f28752s;
    public ValueAnimator f28753t;
    public final int[] f28754u;
    public final int[] v;

    public na(ja jaVar, View view) {
        this(jaVar, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        ja jaVar = this.f28737a;
        if (jaVar.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.f28743j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i13 = num.intValue();
                } else {
                    i13 = jaVar.f27482i;
                }
                canvas.drawColor(i13);
                return;
            }
            RenderNode renderNode = (RenderNode) jaVar.f27485l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) jaVar.f27484k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = jaVar.f27482i;
                }
                beginRecording.drawColor(i12);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = jaVar.f27482i;
                }
                canvas.drawColor(i11);
                return;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = jaVar.f27482i;
            }
            canvas.drawColor(i10);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.f28749p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z10) {
                    int i14 = this.f28745l;
                    int width = renderNode.getWidth();
                    Path path = this.f28744k;
                    if (i14 != width || this.f28746m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        int width2 = renderNode.getWidth();
                        this.f28745l = width2;
                        int height = renderNode.getHeight();
                        this.f28746m = height;
                        rectF.set(0.0f, 0.0f, width2, height);
                        path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                    }
                    canvas.clipPath(path);
                }
                canvas.drawRenderNode(renderNode);
                canvas.restore();
                return;
            }
            return;
        }
        Paint c10 = c(1.0f);
        if (c10 != null) {
            canvas.drawPaint(c10);
        }
    }

    public final Paint c(float f7) {
        Bitmap b10;
        Bitmap bitmap;
        ja jaVar = this.f28737a;
        if (jaVar == null || (b10 = jaVar.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f28748o;
        if (bitmapShader == null || this.f28747n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.f28747n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f28741g;
                this.f28741g = paint;
                this.e = true;
                ValueAnimator valueAnimator = this.f28753t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f28753t = null;
                }
                this.f28740f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f28753t = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 6));
                this.f28753t.start();
            }
            this.f28747n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.f28748o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.f28749p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f28748o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f7 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c10 = c(1.0f);
        boolean z10 = this.e;
        if (z10) {
            paint = this.f28741g;
        } else {
            paint = null;
        }
        if (c10 != null && z10) {
            c10.setAlpha((int) org.telegram.messenger.g0.z(1.0f, this.f28740f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f28752s == null) {
            this.f28752s = new Paint[2];
        }
        Paint[] paintArr = this.f28752s;
        paintArr[0] = paint;
        paintArr[1] = c10;
        return paintArr;
    }

    public final void e(float f7, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = this.f28750q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b10 = this.f28737a.b();
            if (b10 == null) {
                return;
            }
            if (this.f28748o == null || this.f28747n != b10) {
                this.f28747n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                this.f28748o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.f28747n.getWidth();
            float height = rectF2.height() / this.f28747n.getHeight();
            Matrix matrix = this.f28749p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.f28748o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i10, int i11, boolean z10) {
        View view;
        View view2;
        Matrix matrix = this.f28749p;
        matrix.reset();
        ja jaVar = this.f28737a;
        if (jaVar != null) {
            if (z10) {
                view = jaVar.f27483j;
            } else {
                view = jaVar.f27478b;
            }
        } else {
            view = null;
        }
        if (jaVar != null) {
            ArrayList arrayList = jaVar.f27479c;
            View view3 = this.f28738b;
            do {
                matrix.preScale(1.0f / view3.getScaleX(), 1.0f / view3.getScaleY(), view3.getPivotX(), view3.getPivotY());
                matrix.preRotate(-view3.getRotation(), view3.getPivotX(), view3.getPivotY());
                matrix.preTranslate(-view3.getX(), -view3.getY());
                if (!(view3.getParent() instanceof View) || (view3 = (View) view3.getParent()) == null) {
                    break;
                }
            } while (!arrayList.contains(view3));
            if (view != view3) {
                int indexOf = arrayList.indexOf(view3) + 1;
                if (indexOf == 0 && (view2 = (View) arrayList.get(indexOf)) != null) {
                    int[] iArr = this.f28754u;
                    view3.getLocationOnScreen(iArr);
                    int[] iArr2 = this.v;
                    view2.getLocationOnScreen(iArr2);
                    matrix.preTranslate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                }
                while (indexOf >= 0 && indexOf < arrayList.size()) {
                    View view4 = (View) arrayList.get(indexOf);
                    if (view4 != null) {
                        matrix.preScale(view4.getScaleX(), view4.getScaleY(), view4.getPivotX(), view4.getPivotY());
                        matrix.preRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
                        matrix.preTranslate(view4.getX(), view4.getY());
                        indexOf++;
                    }
                }
            }
        }
        if (view != null) {
            matrix.preScale(view.getWidth() / i10, view.getHeight() / i11);
        }
    }

    public na(ja jaVar, View view, int i10, boolean z10) {
        this.f28741g = new Paint(3);
        this.h = new Paint(3);
        this.f28744k = new Path();
        this.f28749p = new Matrix();
        this.f28750q = new RectF();
        this.f28751r = false;
        this.f28754u = new int[2];
        this.v = new int[2];
        this.f28737a = jaVar;
        this.f28738b = view;
        this.f28742i = i10;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f28739c = colorMatrix;
        if (i10 == 0) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f28741g.setXfermode(new PorterDuffXfermode(mode));
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f28741g.setXfermode(new PorterDuffXfermode(mode2));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 1) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.7f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 1.5f);
        } else if (i10 == 3) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.5f);
        } else if (i10 == 4) {
            this.f28743j = -10329502;
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.3f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 1.2f);
        } else if (i10 == 6) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.35f);
        } else if (i10 == 7) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.95f);
        } else if (i10 == 8) {
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.15f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.47f);
        } else if (i10 == 9) {
            Paint paint3 = this.h;
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            paint3.setXfermode(new PorterDuffXfermode(mode3));
            this.f28741g.setXfermode(new PorterDuffXfermode(mode3));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 10) {
            colorMatrix.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.f28751r ? 0.97f : 0.92f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.f28751r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f28741g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && jaVar != null) {
            jaVar.d.add(this);
        }
        view.addOnAttachStateChangeListener(new la(0, this, jaVar));
    }
}
