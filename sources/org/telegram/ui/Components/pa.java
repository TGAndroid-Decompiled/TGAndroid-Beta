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
public final class pa {
    public final la f31476a;
    public final View f31477b;
    public final ColorMatrix f31478c;
    public final boolean d;
    public boolean e;
    public float f31479f;
    public Paint f31480g;
    public Paint h;
    public final int f31481i;
    public final Integer f31482j;
    public final Path f31483k;
    public int f31484l;
    public int f31485m;
    public Bitmap f31486n;
    public BitmapShader f31487o;
    public final Matrix f31488p;
    public final RectF f31489q;
    public boolean f31490r;
    public Paint[] f31491s;
    public ValueAnimator f31492t;
    public final int[] f31493u;
    public final int[] v;

    public pa(la laVar, View view) {
        this(laVar, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        la laVar = this.f31476a;
        if (laVar.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.f31482j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i13 = num.intValue();
                } else {
                    i13 = laVar.f30142i;
                }
                canvas.drawColor(i13);
                return;
            }
            RenderNode renderNode = (RenderNode) laVar.f30145l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) laVar.f30144k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = laVar.f30142i;
                }
                beginRecording.drawColor(i12);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = laVar.f30142i;
                }
                canvas.drawColor(i11);
                return;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = laVar.f30142i;
            }
            canvas.drawColor(i10);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.f31488p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z10) {
                    int i14 = this.f31484l;
                    int width = renderNode.getWidth();
                    Path path = this.f31483k;
                    if (i14 != width || this.f31485m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        int width2 = renderNode.getWidth();
                        this.f31484l = width2;
                        int height = renderNode.getHeight();
                        this.f31485m = height;
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
        la laVar = this.f31476a;
        if (laVar == null || (b10 = laVar.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f31487o;
        if (bitmapShader == null || this.f31486n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.f31486n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f31480g;
                this.f31480g = paint;
                this.e = true;
                ValueAnimator valueAnimator = this.f31492t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f31492t = null;
                }
                this.f31479f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f31492t = ofFloat;
                ofFloat.addUpdateListener(new n6(this, 6));
                this.f31492t.start();
            }
            this.f31486n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.f31487o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.f31488p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f31487o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f7 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c10 = c(1.0f);
        boolean z10 = this.e;
        if (z10) {
            paint = this.f31480g;
        } else {
            paint = null;
        }
        if (c10 != null && z10) {
            c10.setAlpha((int) org.telegram.messenger.t.A(1.0f, this.f31479f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f31491s == null) {
            this.f31491s = new Paint[2];
        }
        Paint[] paintArr = this.f31491s;
        paintArr[0] = paint;
        paintArr[1] = c10;
        return paintArr;
    }

    public final void e(float f7, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, f10, f11, f12);
        RectF rectF2 = this.f31489q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b10 = this.f31476a.b();
            if (b10 == null) {
                return;
            }
            if (this.f31487o == null || this.f31486n != b10) {
                this.f31486n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                this.f31487o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.f31486n.getWidth();
            float height = rectF2.height() / this.f31486n.getHeight();
            Matrix matrix = this.f31488p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.f31487o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i10, int i11, boolean z10) {
        View view;
        View view2;
        Matrix matrix = this.f31488p;
        matrix.reset();
        la laVar = this.f31476a;
        if (laVar != null) {
            if (z10) {
                view = laVar.f30143j;
            } else {
                view = laVar.f30138b;
            }
        } else {
            view = null;
        }
        if (laVar != null) {
            ArrayList arrayList = laVar.f30139c;
            View view3 = this.f31477b;
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
                    int[] iArr = this.f31493u;
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

    public pa(la laVar, View view, int i10, boolean z10) {
        this.f31480g = new Paint(3);
        this.h = new Paint(3);
        this.f31483k = new Path();
        this.f31488p = new Matrix();
        this.f31489q = new RectF();
        this.f31490r = false;
        this.f31493u = new int[2];
        this.v = new int[2];
        this.f31476a = laVar;
        this.f31477b = view;
        this.f31481i = i10;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f31478c = colorMatrix;
        if (i10 == 0) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f31480g.setXfermode(new PorterDuffXfermode(mode));
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f31480g.setXfermode(new PorterDuffXfermode(mode2));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 1) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.7f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 1.5f);
        } else if (i10 == 3) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.5f);
        } else if (i10 == 4) {
            this.f31482j = -10329502;
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
            this.f31480g.setXfermode(new PorterDuffXfermode(mode3));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 10) {
            colorMatrix.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.f31490r ? 0.97f : 0.92f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.f31490r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f31480g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && laVar != null) {
            laVar.d.add(this);
        }
        view.addOnAttachStateChangeListener(new na(0, this, laVar));
    }
}
