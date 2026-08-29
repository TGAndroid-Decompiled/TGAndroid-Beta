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
public final class ka {
    public final ga f29976a;
    public final View f29977b;
    public final ColorMatrix f29978c;
    public final boolean d;
    public boolean f29979e;
    public float f29980f;
    public Paint f29981g;
    public Paint h;
    public final int f29982i;
    public final Integer f29983j;
    public final Path f29984k;
    public int f29985l;
    public int f29986m;
    public Bitmap f29987n;
    public BitmapShader f29988o;
    public final Matrix f29989p;
    public final RectF f29990q;
    public boolean f29991r;
    public Paint[] f29992s;
    public ValueAnimator f29993t;
    public final int[] f29994u;
    public final int[] v;

    public ka(ga gaVar, View view) {
        this(gaVar, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        ga gaVar = this.f29976a;
        if (gaVar.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.f29983j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i13 = num.intValue();
                } else {
                    i13 = gaVar.f28854i;
                }
                canvas.drawColor(i13);
                return;
            }
            RenderNode renderNode = (RenderNode) gaVar.f28857l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) gaVar.f28856k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = gaVar.f28854i;
                }
                beginRecording.drawColor(i12);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = gaVar.f28854i;
                }
                canvas.drawColor(i11);
                return;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = gaVar.f28854i;
            }
            canvas.drawColor(i10);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.f29989p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z10) {
                    int i14 = this.f29985l;
                    int width = renderNode.getWidth();
                    Path path = this.f29984k;
                    if (i14 != width || this.f29986m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        int width2 = renderNode.getWidth();
                        this.f29985l = width2;
                        int height = renderNode.getHeight();
                        this.f29986m = height;
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
        Paint c3 = c(1.0f);
        if (c3 != null) {
            canvas.drawPaint(c3);
        }
    }

    public final Paint c(float f9) {
        Bitmap b10;
        Bitmap bitmap;
        ga gaVar = this.f29976a;
        if (gaVar == null || (b10 = gaVar.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f29988o;
        if (bitmapShader == null || this.f29987n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.f29987n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f29981g;
                this.f29981g = paint;
                this.f29979e = true;
                ValueAnimator valueAnimator = this.f29993t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f29993t = null;
                }
                this.f29980f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f29993t = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 6));
                this.f29993t.start();
            }
            this.f29987n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.f29988o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.f29989p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f29988o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f9 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c3 = c(1.0f);
        boolean z10 = this.f29979e;
        if (z10) {
            paint = this.f29981g;
        } else {
            paint = null;
        }
        if (c3 != null && z10) {
            c3.setAlpha((int) org.telegram.messenger.x3.y(1.0f, this.f29980f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f29992s == null) {
            this.f29992s = new Paint[2];
        }
        Paint[] paintArr = this.f29992s;
        paintArr[0] = paint;
        paintArr[1] = c3;
        return paintArr;
    }

    public final void e(float f9, float f10, float f11, float f12) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f9, f10, f11, f12);
        RectF rectF2 = this.f29990q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b10 = this.f29976a.b();
            if (b10 == null) {
                return;
            }
            if (this.f29988o == null || this.f29987n != b10) {
                this.f29987n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                this.f29988o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.f29987n.getWidth();
            float height = rectF2.height() / this.f29987n.getHeight();
            Matrix matrix = this.f29989p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.f29988o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i10, int i11, boolean z10) {
        View view;
        View view2;
        Matrix matrix = this.f29989p;
        matrix.reset();
        ga gaVar = this.f29976a;
        if (gaVar != null) {
            if (z10) {
                view = gaVar.f28855j;
            } else {
                view = gaVar.f28849b;
            }
        } else {
            view = null;
        }
        if (gaVar != null) {
            ArrayList arrayList = gaVar.f28850c;
            View view3 = this.f29977b;
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
                    int[] iArr = this.f29994u;
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

    public ka(ga gaVar, View view, int i10, boolean z10) {
        this.f29981g = new Paint(3);
        this.h = new Paint(3);
        this.f29984k = new Path();
        this.f29989p = new Matrix();
        this.f29990q = new RectF();
        this.f29991r = false;
        this.f29994u = new int[2];
        this.v = new int[2];
        this.f29976a = gaVar;
        this.f29977b = view;
        this.f29982i = i10;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f29978c = colorMatrix;
        if (i10 == 0) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f29981g.setXfermode(new PorterDuffXfermode(mode));
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f29981g.setXfermode(new PorterDuffXfermode(mode2));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 1) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.7f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 1.5f);
        } else if (i10 == 3) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.5f);
        } else if (i10 == 4) {
            this.f29983j = -10329502;
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
            this.f29981g.setXfermode(new PorterDuffXfermode(mode3));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 10) {
            colorMatrix.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.f29991r ? 0.97f : 0.92f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.f29991r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f29981g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && gaVar != null) {
            gaVar.d.add(this);
        }
        view.addOnAttachStateChangeListener(new ia(0, this, gaVar));
    }
}
