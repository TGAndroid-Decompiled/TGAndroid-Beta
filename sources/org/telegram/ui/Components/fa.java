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
public final class fa {
    public final ba f35064a;
    public final View f35065b;
    public final ColorMatrix f35066c;
    public final boolean d;
    public boolean f35067e;
    public float f35068f;
    public Paint f35069g;
    public Paint h;
    public final int f35070i;
    public final Integer f35071j;
    public final Path f35072k;
    public int f35073l;
    public int f35074m;
    public Bitmap f35075n;
    public BitmapShader f35076o;
    public final Matrix f35077p;
    public final RectF f35078q;
    public boolean f35079r;
    public Paint[] f35080s;
    public ValueAnimator f35081t;
    public final int[] f35082u;
    public final int[] v;

    public fa(ba baVar, View view) {
        this(baVar, view, 6, false);
    }

    public final void a(Canvas canvas) {
        b(canvas, true);
    }

    public final void b(Canvas canvas, boolean z10) {
        int i7;
        int i10;
        int i11;
        int i12;
        ba baVar = this.f35064a;
        if (baVar.c() && Build.VERSION.SDK_INT >= 31) {
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Integer num = this.f35071j;
            if (!isHardwareAccelerated) {
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = baVar.f33713i;
                }
                canvas.drawColor(i12);
                return;
            }
            RenderNode renderNode = (RenderNode) baVar.f33716l;
            if (!renderNode.hasDisplayList()) {
                RenderNode renderNode2 = (RenderNode) baVar.f33715k;
                renderNode.setPosition(0, 0, renderNode2.getWidth(), renderNode2.getHeight());
                RecordingCanvas beginRecording = renderNode.beginRecording();
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = baVar.f33713i;
                }
                beginRecording.drawColor(i11);
                beginRecording.drawRenderNode(renderNode2);
                renderNode.endRecording();
            }
            if (!renderNode.hasDisplayList()) {
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = baVar.f33713i;
                }
                canvas.drawColor(i10);
                return;
            }
            if (num != null) {
                i7 = num.intValue();
            } else {
                i7 = baVar.f33713i;
            }
            canvas.drawColor(i7);
            f(renderNode.getWidth(), renderNode.getHeight(), true);
            if (renderNode.hasDisplayList()) {
                Matrix matrix = this.f35077p;
                matrix.postTranslate(-0.0f, -0.0f);
                this.h.setAlpha((int) 255.0f);
                canvas.saveLayer(null, this.h);
                canvas.concat(matrix);
                if (z10) {
                    int i13 = this.f35073l;
                    int width = renderNode.getWidth();
                    Path path = this.f35072k;
                    if (i13 != width || this.f35074m != renderNode.getHeight()) {
                        path.rewind();
                        RectF rectF = org.telegram.messenger.g0.P;
                        int width2 = renderNode.getWidth();
                        this.f35073l = width2;
                        int height = renderNode.getHeight();
                        this.f35074m = height;
                        rectF.set(0.0f, 0.0f, width2, height);
                        path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
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

    public final Paint c(float f10) {
        Bitmap b10;
        Bitmap bitmap;
        ba baVar = this.f35064a;
        if (baVar == null || (b10 = baVar.b()) == null) {
            return null;
        }
        BitmapShader bitmapShader = this.f35076o;
        if (bitmapShader == null || this.f35075n != b10) {
            if (this.d && bitmapShader != null && (bitmap = this.f35075n) != null && !bitmap.isRecycled() && !b10.isRecycled()) {
                Paint paint = this.h;
                this.h = this.f35069g;
                this.f35069g = paint;
                this.f35067e = true;
                ValueAnimator valueAnimator = this.f35081t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f35081t = null;
                }
                this.f35068f = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                this.f35081t = ofFloat;
                ofFloat.addUpdateListener(new w(this, 7));
                this.f35081t.start();
            }
            this.f35075n = b10;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(b10, tileMode, tileMode);
            this.f35076o = bitmapShader2;
            this.h.setShader(bitmapShader2);
        }
        f(b10.getWidth(), b10.getHeight(), false);
        Matrix matrix = this.f35077p;
        matrix.postTranslate(-0.0f, -0.0f);
        this.f35076o.setLocalMatrix(matrix);
        this.h.setAlpha((int) (f10 * 255.0f));
        return this.h;
    }

    public final Paint[] d() {
        Paint paint;
        Paint c10 = c(1.0f);
        boolean z10 = this.f35067e;
        if (z10) {
            paint = this.f35069g;
        } else {
            paint = null;
        }
        if (c10 != null && z10) {
            c10.setAlpha((int) org.telegram.messenger.f3.A(1.0f, this.f35068f, 255.0f, 1.0f));
        }
        if (paint != null) {
            paint.setAlpha((int) 255.0f);
        }
        if (this.f35080s == null) {
            this.f35080s = new Paint[2];
        }
        Paint[] paintArr = this.f35080s;
        paintArr[0] = paint;
        paintArr[1] = c10;
        return paintArr;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f10, f11, f12, f13);
        RectF rectF2 = this.f35078q;
        if (rectF2.top != rectF.top || rectF2.bottom != rectF.bottom || rectF2.left != rectF.left || rectF2.right != rectF.right) {
            rectF2.set(rectF);
            Bitmap b10 = this.f35064a.b();
            if (b10 == null) {
                return;
            }
            if (this.f35076o == null || this.f35075n != b10) {
                this.f35075n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                this.f35076o = bitmapShader;
                this.h.setShader(bitmapShader);
            }
            float width = rectF2.width() / this.f35075n.getWidth();
            float height = rectF2.height() / this.f35075n.getHeight();
            Matrix matrix = this.f35077p;
            matrix.reset();
            matrix.postTranslate(rectF2.left, rectF2.top);
            matrix.preScale(width, height);
            this.f35076o.setLocalMatrix(matrix);
        }
    }

    public final void f(int i7, int i10, boolean z10) {
        View view;
        View view2;
        Matrix matrix = this.f35077p;
        matrix.reset();
        ba baVar = this.f35064a;
        if (baVar != null) {
            if (z10) {
                view = baVar.f33714j;
            } else {
                view = baVar.f33708b;
            }
        } else {
            view = null;
        }
        if (baVar != null) {
            ArrayList arrayList = baVar.f33709c;
            View view3 = this.f35065b;
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
                    int[] iArr = this.f35082u;
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
            matrix.preScale(view.getWidth() / i7, view.getHeight() / i10);
        }
    }

    public fa(ba baVar, View view, int i7, boolean z10) {
        this.f35069g = new Paint(3);
        this.h = new Paint(3);
        this.f35072k = new Path();
        this.f35077p = new Matrix();
        this.f35078q = new RectF();
        this.f35079r = false;
        this.f35082u = new int[2];
        this.v = new int[2];
        this.f35064a = baVar;
        this.f35065b = view;
        this.f35070i = i7;
        this.d = z10;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f35066c = colorMatrix;
        if (i7 == 0) {
            org.telegram.messenger.g0.i(colorMatrix, 0.45f);
        } else if (i7 == 5) {
            Paint paint = this.h;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f35069g.setXfermode(new PorterDuffXfermode(mode));
            org.telegram.messenger.g0.i(colorMatrix, 0.3f);
        } else if (i7 == 2) {
            Paint paint2 = this.h;
            PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
            paint2.setXfermode(new PorterDuffXfermode(mode2));
            this.f35069g.setXfermode(new PorterDuffXfermode(mode2));
            org.telegram.messenger.g0.h(colorMatrix, 0.4f);
            org.telegram.messenger.g0.i(colorMatrix, 0.3f);
        } else if (i7 == 1) {
            org.telegram.messenger.g0.i(colorMatrix, 0.35f);
            org.telegram.messenger.g0.h(colorMatrix, 0.7f);
            org.telegram.messenger.g0.n2(colorMatrix, 1.5f);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.i(colorMatrix, 0.5f);
        } else if (i7 == 4) {
            this.f35071j = -10329502;
            org.telegram.messenger.g0.i(colorMatrix, 0.6f);
            org.telegram.messenger.g0.h(colorMatrix, 0.3f);
            org.telegram.messenger.g0.n2(colorMatrix, 1.2f);
        } else if (i7 == 6) {
            org.telegram.messenger.g0.i(colorMatrix, 0.4f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.35f);
        } else if (i7 == 7) {
            org.telegram.messenger.g0.i(colorMatrix, 0.5f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.95f);
        } else if (i7 == 8) {
            org.telegram.messenger.g0.h(colorMatrix, -0.15f);
            org.telegram.messenger.g0.i(colorMatrix, 0.47f);
        } else if (i7 == 9) {
            Paint paint3 = this.h;
            PorterDuff.Mode mode3 = PorterDuff.Mode.SRC_IN;
            paint3.setXfermode(new PorterDuffXfermode(mode3));
            this.f35069g.setXfermode(new PorterDuffXfermode(mode3));
            org.telegram.messenger.g0.h(colorMatrix, 0.4f);
            org.telegram.messenger.g0.i(colorMatrix, 0.45f);
        } else if (i7 == 10) {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.g0.n2(colorMatrix, this.f35079r ? 0.97f : 0.92f);
            org.telegram.messenger.g0.h(colorMatrix, this.f35079r ? 0.12f : -0.06f);
        }
        this.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f35069g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        if (view.isAttachedToWindow() && baVar != null) {
            baVar.d.add(this);
        }
        view.addOnAttachStateChangeListener(new da(0, this, baVar));
    }
}
