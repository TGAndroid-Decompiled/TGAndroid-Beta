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
public final class h70 extends View {
    public final Bitmap f29086a;
    public final Paint f29087b;
    public Bitmap f29088c;
    public final Paint d;
    public final float f29089e;
    public final float f29090f;
    public final int h;
    public final Path f29091n;
    public final RectF f29092r;
    public float f29093s;
    public float v;
    public float f29094w;
    public final j70 f29095x;

    public h70(j70 j70Var, Context context) {
        super(context);
        float f9;
        this.f29095x = j70Var;
        this.f29091n = new Path();
        this.f29092r = new RectF();
        View view = j70Var.f29577f;
        Rect rect = j70Var.f29606z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f29089e = view.getY() + ((View) view.getParent()).getY();
            if (j70Var.L) {
                f9 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f9 = 0.0f;
            }
            this.f29090f = f9;
        } else {
            this.f29089e = 0.0f;
            this.f29090f = 0.0f;
        }
        this.h = i0.a.k(0, j70Var.f29600s);
        if (j70Var.f29601t && (view instanceof org.telegram.ui.Cells.sa) && (j70Var.f29572c instanceof ProfileActivity)) {
            this.f29087b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f29086a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f29087b = null;
            this.f29086a = null;
        }
        if (!j70Var.f29602u && !j70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = j70Var.f29570b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            yl0.d(dVar);
            return;
        }
        int i10 = yl0.K;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.tm(15, viewGroup, dVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        char c3;
        float f10;
        float f11;
        float width;
        int height;
        float f12;
        float f13;
        Canvas canvas2 = canvas;
        j70 j70Var = this.f29095x;
        float[] fArr = j70Var.f29593o;
        View view = j70Var.f29577f;
        Rect rect = j70Var.f29606z;
        super.onDraw(canvas);
        if (this.f29088c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f29088c.getWidth(), getHeight() / this.f29088c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f29094w * 255.0f));
            canvas2.drawBitmap(this.f29088c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(this.f29094w, this.h));
        }
        if (j70Var.f29601t) {
            float f14 = this.f29089e;
            Bitmap bitmap = this.f29086a;
            Path path = this.f29091n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (j70Var.f29602u) {
                        f13 = 1.0f - this.f29094w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (j70Var.L) {
                    j70.A(view, j70Var.f29570b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f29093s, this.f29094w), AndroidUtilities.lerp(fArr[1], this.v, this.f29094w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = j70Var.f29579g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && j70Var.f29579g.getIntrinsicHeight() > 0) {
                        j70Var.f29579g.setBounds((((view.getWidth() + rect.right) - j70Var.f29579g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - j70Var.f29579g.getIntrinsicHeight()) / 2) + (-rect.top), ((j70Var.f29579g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((j70Var.f29579g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        j70Var.f29579g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    j70Var.f29579g.draw(canvas2);
                }
                if (j70Var.f29586k > 0 || j70Var.f29588l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = j70Var.f29586k;
                    rectF.set((this.f29094w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * j70Var.f29586k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * j70Var.f29586k));
                    float f18 = j70Var.f29588l * this.f29094w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f29087b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f29090f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f9 = 255.0f;
                    c3 = 0;
                } else if (j70Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f9 = 255.0f;
                    if (j70Var.f29602u) {
                        f11 = 1.0f - this.f29094w;
                    } else {
                        f11 = 1.0f;
                    }
                    c3 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f29094w), getMeasuredWidth() + rect.right, org.telegram.ui.th.b(1.0f, this.f29094w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f9 = 255.0f;
                    c3 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (j70Var.f29602u) {
                        f10 = 1.0f - this.f29094w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f29094w;
                if (j70Var.L) {
                    j70.A(view, j70Var.f29570b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c3], this.f29093s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c3], fArr[1]);
                }
                if (j70Var.N != 0 && j70Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), j70Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), j70Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = j70Var.f29579g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && j70Var.f29579g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        j70Var.f29579g.setBounds((((view.getWidth() + rect.right) - j70Var.f29579g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - j70Var.f29579g.getIntrinsicHeight()) / 2) + (-rect.top), ((j70Var.f29579g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((j70Var.f29579g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        j70Var.f29579g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    j70Var.f29579g.setAlpha((int) (this.f29094w * f9));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = j70Var.f29579g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.g6.l1(this.f29094w, j70Var.h));
                        }
                    }
                    j70Var.f29579g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (j70Var.f29586k > 0 || j70Var.f29588l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof i70;
                    RectF rectF2 = this.f29092r;
                    if (z10) {
                        ((i70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = j70Var.f29586k * this.f29094w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = j70Var.f29588l * this.f29094w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.p7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.p7) view).a(canvas2, width, f25, this.f29094w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f29094w * f9), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f29094w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.p7) view).a(canvas2, f30, f25, this.f29094w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof ih.y1) && j70Var.N != 0 && j70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((ih.y1) view).a(this, canvas2, width, f25, this.f29094w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f29094w * f9), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f29094w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((ih.y1) view).a(this, canvas, width, f25, this.f29094w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (j70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f29094w * f9), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof i70) {
                            ((i70) view).b(canvas2, this.f29094w);
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
        j70 j70Var = this.f29095x;
        rg.c.c(j70Var.f29591n, this);
        ViewGroup viewGroup = j70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f9) {
        if (this.f29094w == f9) {
            return;
        }
        this.f29094w = f9;
        invalidate();
    }
}
