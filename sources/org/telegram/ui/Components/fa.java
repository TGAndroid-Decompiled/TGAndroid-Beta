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
public final class fa {
    public final ba f24827a;
    public final View f24828b;
    public final ColorMatrix f24829c;
    public final boolean d;
    public boolean e;
    public float f24830f;
    public Paint f24831g;
    public Paint h;
    public final int f24832i;
    public final Integer f24833j;
    public final Path f24834k;
    public int f24835l;
    public int f24836m;
    public Bitmap f24837n;
    public BitmapShader f24838o;
    public final Matrix f24839p;
    public final RectF f24840q;
    public boolean f24841r;
    public Paint[] f24842s;
    public ValueAnimator f24843t;
    public final int[] f24844u;
    public final int[] v;

    public fa(ba baVar, View view) {
        this(baVar, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        ba baVar = this.f24827a;
        if (baVar.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.f24833j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i13 = num.intValue();
                } else {
                    i13 = baVar.f23612i;
                }
                canvas.drawColor(i13);
                return;
            }
            RenderNode renderNode = (RenderNode) baVar.f23615l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) baVar.f23614k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = baVar.f23612i;
                }
                beginRecording.drawColor(i12);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = baVar.f23612i;
                }
                canvas.drawColor(i11);
                return;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = baVar.f23612i;
            }
            canvas.drawColor(i10);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.f24839p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z4) {
                    int i14 = this.f24835l;
                    int width = renderNode.getWidth();
                    Path path = this.f24834k;
                    if (i14 != width || this.f24836m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = AndroidUtilities.rectTmp;
                        int width2 = renderNode.getWidth();
                        this.f24835l = width2;
                        int height = renderNode.getHeight();
                        this.f24836m = height;
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

    public final Paint c(float f10) {
        Bitmap b10;
        Bitmap bitmap;
        ba baVar = this.f24827a;
        if (baVar == null || (b10 = baVar.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f24838o;
        if (bitmapShader == null || this.f24837n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.f24837n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f24831g;
                this.f24831g = paint;
                this.e = true;
                ValueAnimator valueAnimator = this.f24843t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f24843t = null;
                }
                this.f24830f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f24843t = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 6));
                this.f24843t.start();
            }
            this.f24837n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.f24838o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.f24839p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f24838o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f10 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c3 = c(1.0f);
        boolean z4 = this.e;
        if (z4) {
            paint = this.f24831g;
        } else {
            paint = null;
        }
        if (c3 != null && z4) {
            c3.setAlpha((int) org.telegram.messenger.y3.y(1.0f, this.f24830f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f24842s == null) {
            this.f24842s = new Paint[2];
        }
        Paint[] paintArr = this.f24842s;
        paintArr[0] = paint;
        paintArr[1] = c3;
        return paintArr;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = this.f24840q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b10 = this.f24827a.b();
            if (b10 == null) {
                return;
            }
            if (this.f24838o == null || this.f24837n != b10) {
                this.f24837n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                this.f24838o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.f24837n.getWidth();
            float height = rectF2.height() / this.f24837n.getHeight();
            Matrix matrix = this.f24839p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.f24838o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i10, int i11, boolean z4) {
        View view;
        View view2;
        Matrix matrix = this.f24839p;
        matrix.reset();
        ba baVar = this.f24827a;
        if (baVar != null) {
            if (z4) {
                view = baVar.f23613j;
            } else {
                view = baVar.f23608b;
            }
        } else {
            view = null;
        }
        if (baVar != null) {
            ArrayList arrayList = baVar.f23609c;
            View view3 = this.f24828b;
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
                    int[] iArr = this.f24844u;
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

    public fa(ba baVar, View view, int i10, boolean z4) {
        this.f24831g = new Paint(3);
        this.h = new Paint(3);
        this.f24834k = new Path();
        this.f24839p = new Matrix();
        this.f24840q = new RectF();
        this.f24841r = false;
        this.f24844u = new int[2];
        this.v = new int[2];
        this.f24827a = baVar;
        this.f24828b = view;
        this.f24832i = i10;
        this.d = z4;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f24829c = colorMatrix;
        if (i10 == 0) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f24831g.setXfermode(new PorterDuffXfermode(mode));
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f24831g.setXfermode(new PorterDuffXfermode(mode2));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 1) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.7f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 1.5f);
        } else if (i10 == 3) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.5f);
        } else if (i10 == 4) {
            this.f24833j = -10329502;
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
            this.f24831g.setXfermode(new PorterDuffXfermode(mode3));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 10) {
            colorMatrix.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.f24841r ? 0.97f : 0.92f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.f24841r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f24831g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && baVar != null) {
            baVar.d.add(this);
        }
        view.addOnAttachStateChangeListener(new da(0, this, baVar));
    }
}
