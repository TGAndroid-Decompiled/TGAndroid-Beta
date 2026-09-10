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
public final class u70 extends View {
    public final Bitmap f27595a;
    public final Paint f27596b;
    public Bitmap f27597c;
    public final Paint d;
    public final float e;
    public final float f27598f;
    public final int h;
    public final Path f27599n;
    public final RectF f27600r;
    public float f27601s;
    public float v;
    public float f27602w;
    public final w70 f27603x;

    public u70(w70 w70Var, Context context) {
        super(context);
        float f7;
        this.f27603x = w70Var;
        this.f27599n = new Path();
        this.f27600r = new RectF();
        View view = w70Var.f28678f;
        Rect rect = w70Var.f28707z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (w70Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f27598f = f7;
        } else {
            this.e = 0.0f;
            this.f27598f = 0.0f;
        }
        this.h = i0.a.k(0, w70Var.f28701s);
        if (w70Var.f28702t && (view instanceof org.telegram.ui.Cells.bb) && (w70Var.f28674c instanceof ProfileActivity)) {
            this.f27596b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f27595a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f27596b = null;
            this.f27595a = null;
        }
        if (!w70Var.f28703u && !w70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = w70Var.f28672b;
        e eVar = new e(this, 17);
        if (viewGroup == null) {
            km0.d(eVar);
            return;
        }
        int i10 = km0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.pf(20, viewGroup, eVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        char c10;
        float f10;
        float f11;
        float width;
        int height;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        w70 w70Var = this.f27603x;
        float[] fArr = w70Var.f28694o;
        View view = w70Var.f28678f;
        Rect rect = w70Var.f28707z;
        super.onDraw(canvas);
        if (this.f27597c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f27597c.getWidth(), getHeight() / this.f27597c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f27602w * 255.0f));
            canvas2.drawBitmap(this.f27597c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(this.f27602w, this.h));
        }
        if (w70Var.f28702t) {
            float f14 = this.e;
            Bitmap bitmap = this.f27595a;
            Path path = this.f27599n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (w70Var.f28703u) {
                        f13 = 1.0f - this.f27602w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (w70Var.L) {
                    w70.A(view, w70Var.f28672b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f27601s, this.f27602w), AndroidUtilities.lerp(fArr[1], this.v, this.f27602w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = w70Var.f28680g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && w70Var.f28680g.getIntrinsicHeight() > 0) {
                        w70Var.f28680g.setBounds((((view.getWidth() + rect.right) - w70Var.f28680g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - w70Var.f28680g.getIntrinsicHeight()) / 2) + (-rect.top), ((w70Var.f28680g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((w70Var.f28680g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        w70Var.f28680g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    w70Var.f28680g.draw(canvas2);
                }
                if (w70Var.f28687k > 0 || w70Var.f28689l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = w70Var.f28687k;
                    rectF.set((this.f27602w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * w70Var.f28687k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * w70Var.f28687k));
                    float f18 = w70Var.f28689l * this.f27602w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f27596b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f27598f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (w70Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (w70Var.f28703u) {
                        f11 = 1.0f - this.f27602w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f27602w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.a(1.0f, this.f27602w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (w70Var.f28703u) {
                        f10 = 1.0f - this.f27602w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f27602w;
                if (w70Var.L) {
                    w70.A(view, w70Var.f28672b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f27601s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (w70Var.N != 0 && w70Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), w70Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), w70Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = w70Var.f28680g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && w70Var.f28680g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        w70Var.f28680g.setBounds((((view.getWidth() + rect.right) - w70Var.f28680g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - w70Var.f28680g.getIntrinsicHeight()) / 2) + (-rect.top), ((w70Var.f28680g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((w70Var.f28680g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        w70Var.f28680g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    w70Var.f28680g.setAlpha((int) (this.f27602w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = w70Var.f28680g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.j6.l1(this.f27602w, w70Var.h));
                        }
                    }
                    w70Var.f28680g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (w70Var.f28687k > 0 || w70Var.f28689l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof v70;
                    RectF rectF2 = this.f27600r;
                    if (z10) {
                        ((v70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = w70Var.f28687k * this.f27602w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = w70Var.f28689l * this.f27602w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.u7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.u7) view).a(canvas2, width, f25, this.f27602w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f27602w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f27602w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.u7) view).a(canvas2, f30, f25, this.f27602w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof wh.h1) && w70Var.N != 0 && w70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((wh.h1) view).a(this, canvas2, width, f25, this.f27602w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f27602w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f27602w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((wh.h1) view).a(this, canvas, width, f25, this.f27602w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (w70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f27602w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof v70) {
                            ((v70) view).c(canvas2, this.f27602w);
                        } else {
                            canvas2.translate(-view.getScrollX(), -view.getScrollY());
                            view.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                    canvas2.restore();
                }
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        w70 w70Var = this.f27603x;
        fh.d.c(w70Var.f28692n, this);
        ViewGroup viewGroup = w70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f27602w == f7) {
            return;
        }
        this.f27602w = f7;
        invalidate();
    }
}
