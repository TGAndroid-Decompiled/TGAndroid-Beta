package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

public final class z60 extends View {

    public final Bitmap f35159a;

    public final Paint f35160b;

    public Bitmap f35161c;
    public final Paint d;

    public final float f35162e;

    public final float f35163f;
    public final int h;

    public final Path f35164n;

    public final RectF f35165r;

    public float f35166s;
    public float v;

    public float f35167w;

    public final b70 f35168x;

    public z60(b70 b70Var, Context context) {
        float fMin;
        super(context);
        this.f35168x = b70Var;
        this.f35164n = new Path();
        this.f35165r = new RectF();
        View view = b70Var.f26969f;
        Rect rect = b70Var.f26998z;
        if (view == null || !(view.getParent() instanceof View)) {
            this.f35162e = 0.0f;
            this.f35163f = 0.0f;
        } else {
            this.f35162e = view.getY() + ((View) view.getParent()).getY();
            if (b70Var.L) {
                fMin = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                fMin = 0.0f;
            }
            this.f35163f = fMin;
        }
        this.h = i0.b.k(0, b70Var.f26992s);
        if (b70Var.f26993t && (view instanceof org.telegram.ui.Cells.sa) && (b70Var.f26964c instanceof ProfileActivity)) {
            this.f35160b = new Paint(3);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f35159a = bitmapCreateBitmap;
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f35160b = null;
            this.f35159a = null;
        }
        if (b70Var.f26994u || b70Var.v) {
            this.d = new Paint(3);
            view.setAlpha(0.0f);
            ViewGroup viewGroup = b70Var.f26962b;
            d dVar = new d(this, 17);
            if (viewGroup == null) {
                ol0.d(dVar);
            } else {
                int i10 = ol0.K;
                AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.df(22, viewGroup, dVar), 15.0f);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        char c10;
        float width;
        int height;
        float f11;
        Canvas canvas2 = canvas;
        b70 b70Var = this.f35168x;
        float[] fArr = b70Var.f26985o;
        View view = b70Var.f26969f;
        Rect rect = b70Var.f26998z;
        super.onDraw(canvas);
        if (this.f35161c != null) {
            canvas2.save();
            float fMax = Math.max(getWidth() / this.f35161c.getWidth(), getHeight() / this.f35161c.getHeight());
            canvas2.scale(fMax, fMax);
            int i10 = (int) (this.f35167w * 255.0f);
            Paint paint = this.d;
            paint.setAlpha(i10);
            canvas2.drawBitmap(this.f35161c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(this.f35167w, this.h));
        }
        if (b70Var.f26993t) {
            float f12 = this.f35162e;
            Bitmap bitmap = this.f35159a;
            Path path = this.f35164n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f12 < 1.0f) {
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f12 * (b70Var.f26994u ? 1.0f - this.f35167w : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (b70Var.L) {
                    b70.A(view, b70Var.f26962b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f35166s, this.f35167w), AndroidUtilities.lerp(fArr[1], this.v, this.f35167w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = b70Var.f26971g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() <= 0 || b70Var.f26971g.getIntrinsicHeight() <= 0) {
                        b70Var.f26971g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        b70Var.f26971g.setBounds((((view.getWidth() + rect.right) - b70Var.f26971g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - b70Var.f26971g.getIntrinsicHeight()) / 2) + (-rect.top), ((b70Var.f26971g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((b70Var.f26971g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    b70Var.f26971g.draw(canvas2);
                }
                if (b70Var.f26978k > 0 || b70Var.f26980l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f13 = -rect.left;
                    float f14 = b70Var.f26978k;
                    rectF.set((this.f35167w * f14) + f13, (getAlpha() * f14) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * b70Var.f26978k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * b70Var.f26978k));
                    float f15 = b70Var.f26980l * this.f35167w;
                    path.addRoundRect(rectF, f15, f15, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f35160b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
                return;
            }
            if (view != 0 && (view.getParent() instanceof View)) {
                canvas2.save();
                float f16 = this.f35163f;
                if (f12 >= 1.0f && f16 == 0.0f) {
                    f10 = 255.0f;
                    c10 = 0;
                } else if (b70Var.L) {
                    f10 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, AndroidUtilities.lerp((((-rect.top) + fArr[1]) - (f12 * (b70Var.f26994u ? 1.0f - this.f35167w : 1.0f))) + 1.0f, 0.0f, this.f35167w), getMeasuredWidth() + rect.right, org.telegram.ui.Cells.pa.b(1.0f, this.f35167w, f16, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c10 = 0;
                    canvas2.clipRect(-rect.left, (((-rect.top) + fArr[1]) - (f12 * (b70Var.f26994u ? 1.0f - this.f35167w : 1.0f))) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f17 = this.f35167w;
                if (b70Var.L) {
                    b70.A(view, b70Var.f26962b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f35166s, f17), AndroidUtilities.lerp(fArr[1], this.v, f17));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (b70Var.N == 0 || b70Var.O == 0) {
                    width = view.getWidth();
                    height = view.getHeight();
                } else {
                    width = AndroidUtilities.lerp(view.getWidth(), b70Var.N, f17);
                    height = AndroidUtilities.lerp(view.getHeight(), b70Var.O, f17);
                }
                float f18 = height;
                Drawable drawable2 = b70Var.f26971g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() <= 0 || b70Var.f26971g.getIntrinsicHeight() <= 0) {
                        f11 = 1.0f;
                        b70Var.f26971g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    } else {
                        f11 = 1.0f;
                        b70Var.f26971g.setBounds((((view.getWidth() + rect.right) - b70Var.f26971g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - b70Var.f26971g.getIntrinsicHeight()) / 2) + (-rect.top), ((b70Var.f26971g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((b70Var.f26971g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    }
                    b70Var.f26971g.setAlpha((int) (this.f35167w * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = b70Var.f26971g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.g6.l1(this.f35167w, b70Var.h));
                        }
                    }
                    b70Var.f26971g.draw(canvas2);
                } else {
                    f11 = 1.0f;
                }
                if (b70Var.f26978k > 0 || b70Var.f26980l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof a70;
                    RectF rectF2 = this.f35165r;
                    if (z10) {
                        ((a70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f19 = -rect.left;
                    float f20 = rectF2.left + f19;
                    float f21 = b70Var.f26978k * this.f35167w;
                    float f22 = -rect.top;
                    rectF3.set(f20 + f21, rectF2.top + f22 + f21, (f19 + rectF2.right) - f21, (f22 + rectF2.bottom) - f21);
                    float f23 = b70Var.f26980l * this.f35167w;
                    path.addRoundRect(rectF3, f23, f23, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (!(view instanceof org.telegram.ui.Cells.o7)) {
                    if (!(view instanceof gh.b2) || b70Var.N == 0 || b70Var.O == 0) {
                        if (b70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f35167w * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof a70) {
                            ((a70) view).c(canvas2, this.f35167w);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    } else if (view.getAlpha() >= 1.0f) {
                        ((gh.b2) view).a(this, canvas2, width, f18, this.f35167w);
                        canvas2 = canvas;
                    } else {
                        canvas.saveLayerAlpha(0.0f, 0.0f, width, f18, (int) (this.f35167w * f10), 31);
                        float fLerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f35167w);
                        canvas.scale(fLerp, fLerp, width / 2.0f, f18 / 2.0f);
                        ((gh.b2) view).a(this, canvas, width, f18, this.f35167w);
                        canvas.restore();
                        canvas2 = canvas;
                    }
                    canvas2.restore();
                }
                if (view.getAlpha() >= f11) {
                    ((org.telegram.ui.Cells.o7) view).a(canvas2, width, f18, this.f35167w);
                } else {
                    float f24 = width;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, f24, f18, (int) (this.f35167w * f10), 31);
                    float fLerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f35167w);
                    canvas2.scale(fLerp2, fLerp2, f24 / 2.0f, f18 / 2.0f);
                    ((org.telegram.ui.Cells.o7) view).a(canvas2, f24, f18, this.f35167w);
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b70 b70Var = this.f35168x;
        pg.c.c(b70Var.f26983n, this);
        ViewGroup viewGroup = b70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f35167w == f10) {
            return;
        }
        this.f35167w = f10;
        invalidate();
    }
}
