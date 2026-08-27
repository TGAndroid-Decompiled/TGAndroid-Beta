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

public final class da {

    public final z9 f27683a;

    public final View f27684b;

    public final ColorMatrix f27685c;
    public final boolean d;

    public boolean f27686e;

    public float f27687f;

    public Paint f27688g;
    public Paint h;

    public final int f27689i;

    public final Integer f27690j;

    public final Path f27691k;

    public int f27692l;

    public int f27693m;

    public Bitmap f27694n;

    public BitmapShader f27695o;

    public final Matrix f27696p;

    public final RectF f27697q;

    public boolean f27698r;

    public Paint[] f27699s;

    public ValueAnimator f27700t;

    public final int[] f27701u;
    public final int[] v;

    public da(z9 z9Var, View view) {
        this(z9Var, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z10) {
        z9 z9Var = this.f27683a;
        if (!z9Var.c() || Build.VERSION.SDK_INT < 31) {
            Paint paintC = c(1.0f);
            if (paintC != null) {
                canvas.drawPaint(paintC);
                return;
            }
            return;
        }
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        Integer num = this.f27690j;
        if (!zIsHardwareAccelerated) {
            canvas.drawColor(num != null ? num.intValue() : z9Var.f35208i);
            return;
        }
        RenderNode renderNode = (RenderNode) z9Var.f35211l;
        if (!renderNode.hasDisplayList()) {
            RenderNode renderNode2 = (RenderNode) z9Var.f35210k;
            renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
            RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
            recordingCanvasBeginRecording.drawColor(num != null ? num.intValue() : z9Var.f35208i);
            recordingCanvasBeginRecording.drawRenderNode(renderNode2);
            renderNode.endRecording();
        }
        if (!renderNode.hasDisplayList()) {
            canvas.drawColor(num != null ? num.intValue() : z9Var.f35208i);
            return;
        }
        canvas.drawColor(num != null ? num.intValue() : z9Var.f35208i);
        f(renderNode.getWidth(), renderNode.getHeight(), true);
        if (renderNode.hasDisplayList()) {
            Matrix matrix = this.f27696p;
            matrix.postTranslate(-0.0f, -0.0f);
            this.h.setAlpha((int) 255.0f);
            canvas.saveLayer(null, this.h);
            canvas.concat(matrix);
            if (z10) {
                int i10 = this.f27692l;
                int width = renderNode.getWidth();
                Path path = this.f27691k;
                if (i10 != width || this.f27693m != renderNode.getHeight()) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    int width2 = renderNode.getWidth();
                    this.f27692l = width2;
                    int height = renderNode.getHeight();
                    this.f27693m = height;
                    rectF.set(0.0f, 0.0f, width2, height);
                    path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                }
                canvas.clipPath(path);
            }
            canvas.drawRenderNode(renderNode);
            canvas.restore();
        }
    }

    public final Paint c(float f10) {
        Bitmap bitmapB;
        Bitmap bitmap;
        z9 z9Var = this.f27683a;
        if (z9Var == null || (bitmapB = z9Var.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f27695o;
        if (bitmapShader == null || this.f27694n != bitmapB) {
            if (this.d && bitmapShader != null && (bitmap = this.f27694n) != null && !bitmap.isRecycled() && !bitmapB.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f27688g;
                this.f27688g = paint;
                this.f27686e = true;
                ValueAnimator valueAnimator = this.f27700t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f27700t = null;
                }
                this.f27687f = 1.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f27700t = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new e6(this, 6));
                this.f27700t.start();
            }
            this.f27694n = bitmapB;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(bitmapB, tileMode, tileMode);
            this.f27695o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(bitmapB.getWidth(), bitmapB.getHeight(), false);
        Matrix matrix = this.f27696p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f27695o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f10 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paintC = c(1.0f);
        boolean z10 = this.f27686e;
        Paint paint = z10 ? this.f27688g : null;
        if (paintC != null && z10) {
            paintC.setAlpha((int) org.telegram.messenger.y1.z(1.0f, this.f27687f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f27699s == null) {
            this.f27699s = new Paint[2];
        }
        Paint[] paintArr = this.f27699s;
        paintArr[0] = paint;
        paintArr[1] = paintC;
        return paintArr;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = this.f27697q;
        if (rectF2.top == rectF.top && rectF2.bottom == rectF.bottom && rectF2.left == rectF.left && rectF2.right == rectF.right) {
            return;
        }
        rectF2.set(rectF);
        Bitmap bitmapB = this.f27683a.b();
        if (bitmapB == null) {
            return;
        }
        if (this.f27695o == null || this.f27694n != bitmapB) {
            this.f27694n = bitmapB;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmapB, tileMode, tileMode);
            this.f27695o = bitmapShader;
            this.h.setShader(bitmapShader);
        }
        float fWidth = rectF2.width() / this.f27694n.getWidth();
        float fHeight = rectF2.height() / this.f27694n.getHeight();
        Matrix matrix = this.f27696p;
        matrix.reset();
        matrix.postTranslate(rectF2.left, rectF2.top);
        matrix.preScale(fWidth, fHeight);
        this.f27695o.setLocalMatrix(matrix);
    }

    public final void f(int i10, int i11, boolean z10) {
        View view;
        View view2;
        Matrix matrix = this.f27696p;
        matrix.reset();
        z9 z9Var = this.f27683a;
        if (z9Var != null) {
            view = z10 ? z9Var.f35209j : z9Var.f35203b;
        } else {
            view = null;
        }
        if (z9Var != null) {
            ArrayList arrayList = z9Var.f35204c;
            View view3 = this.f27684b;
            do {
                matrix.preScale(1.0f / view3.getScaleX(), 1.0f / view3.getScaleY(), view3.getPivotX(), view3.getPivotY());
                matrix.preRotate(-view3.getRotation(), view3.getPivotX(), view3.getPivotY());
                matrix.preTranslate(-view3.getX(), -view3.getY());
                if (!(view3.getParent() instanceof View) || (view3 = (View) view3.getParent()) == null) {
                    break;
                }
            } while (!arrayList.contains(view3));
            if (view != view3) {
                int iIndexOf = arrayList.indexOf(view3) + 1;
                if (iIndexOf == 0 && (view2 = (View) arrayList.get(iIndexOf)) != null) {
                    int[] iArr = this.f27701u;
                    view3.getLocationOnScreen(iArr);
                    int[] iArr2 = this.v;
                    view2.getLocationOnScreen(iArr2);
                    matrix.preTranslate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
                }
                while (iIndexOf >= 0 && iIndexOf < arrayList.size()) {
                    View view4 = (View) arrayList.get(iIndexOf);
                    if (view4 != null) {
                        matrix.preScale(view4.getScaleX(), view4.getScaleY(), view4.getPivotX(), view4.getPivotY());
                        matrix.preRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
                        matrix.preTranslate(view4.getX(), view4.getY());
                        iIndexOf++;
                    }
                }
            }
        }
        if (view != null) {
            matrix.preScale(view.getWidth() / i10, view.getHeight() / i11);
        }
    }

    public da(z9 z9Var, View view, int i10, boolean z10) {
        this.f27688g = new Paint(3);
        this.h = new Paint(3);
        this.f27691k = new Path();
        this.f27696p = new Matrix();
        this.f27697q = new RectF();
        this.f27698r = false;
        this.f27701u = new int[2];
        this.v = new int[2];
        this.f27683a = z9Var;
        this.f27684b = view;
        this.f27689i = i10;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f27685c = colorMatrix;
        if (i10 == 0) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f27688g.setXfermode(new PorterDuffXfermode(mode));
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f27688g.setXfermode(new PorterDuffXfermode(mode2));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.3f);
        } else if (i10 == 1) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.7f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 1.5f);
        } else if (i10 == 3) {
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.5f);
        } else if (i10 == 4) {
            this.f27690j = -10329502;
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
            this.f27688g.setXfermode(new PorterDuffXfermode(mode3));
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.4f);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.45f);
        } else if (i10 == 10) {
            colorMatrix.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.f27698r ? 0.97f : 0.92f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.f27698r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f27688g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && z9Var != null) {
            z9Var.d.add(this);
        }
        view.addOnAttachStateChangeListener(new ba(0, this, z9Var));
    }
}
