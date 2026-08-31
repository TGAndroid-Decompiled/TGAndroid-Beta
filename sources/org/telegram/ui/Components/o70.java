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
public final class o70 extends View {
    public final Bitmap f29683a;
    public final Paint f29684b;
    public Bitmap f29685c;
    public final Paint d;
    public final float f29686e;
    public final float f29687f;
    public final int h;
    public final Path f29688n;
    public final RectF f29689r;
    public float f29690s;
    public float v;
    public float f29691w;
    public final q70 f29692x;

    public o70(q70 q70Var, Context context) {
        super(context);
        float f10;
        this.f29692x = q70Var;
        this.f29688n = new Path();
        this.f29689r = new RectF();
        View view = q70Var.f30306f;
        Rect rect = q70Var.f30335z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f29686e = view.getY() + ((View) view.getParent()).getY();
            if (q70Var.L) {
                f10 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f29687f = f10;
        } else {
            this.f29686e = 0.0f;
            this.f29687f = 0.0f;
        }
        this.h = i0.a.k(0, q70Var.f30329s);
        if (q70Var.f30330t && (view instanceof org.telegram.ui.Cells.va) && (q70Var.f30301c instanceof ProfileActivity)) {
            this.f29684b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f29683a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f29684b = null;
            this.f29683a = null;
        }
        if (!q70Var.f30331u && !q70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = q70Var.f30299b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            jm0.d(dVar);
            return;
        }
        int i10 = jm0.L;
        AndroidUtilities.makeGlobalBlurBitmap(new xk(7, viewGroup, dVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        char c3;
        float f11;
        float f12;
        float width;
        int height;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        q70 q70Var = this.f29692x;
        float[] fArr = q70Var.f30322o;
        View view = q70Var.f30306f;
        Rect rect = q70Var.f30335z;
        super.onDraw(canvas);
        if (this.f29685c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f29685c.getWidth(), getHeight() / this.f29685c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f29691w * 255.0f));
            canvas2.drawBitmap(this.f29685c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(this.f29691w, this.h));
        }
        if (q70Var.f30330t) {
            float f15 = this.f29686e;
            Bitmap bitmap = this.f29683a;
            Path path = this.f29688n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f15 < 1.0f) {
                    float f16 = -rect.left;
                    float f17 = (-rect.top) + fArr[1];
                    if (q70Var.f30331u) {
                        f14 = 1.0f - this.f29691w;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas2.clipRect(f16, (f17 - (f15 * f14)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (q70Var.L) {
                    q70.A(view, q70Var.f30299b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f29690s, this.f29691w), AndroidUtilities.lerp(fArr[1], this.v, this.f29691w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = q70Var.f30308g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && q70Var.f30308g.getIntrinsicHeight() > 0) {
                        q70Var.f30308g.setBounds((((view.getWidth() + rect.right) - q70Var.f30308g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - q70Var.f30308g.getIntrinsicHeight()) / 2) + (-rect.top), ((q70Var.f30308g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((q70Var.f30308g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        q70Var.f30308g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    q70Var.f30308g.draw(canvas2);
                }
                if (q70Var.f30315k > 0 || q70Var.f30317l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = q70Var.f30315k;
                    rectF.set((this.f29691w * f18) + (-rect.left), (getAlpha() * f18) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * q70Var.f30315k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * q70Var.f30315k));
                    float f19 = q70Var.f30317l * this.f29691w;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f29684b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f20 = this.f29687f;
                if (f15 >= 1.0f && f20 == 0.0f) {
                    f10 = 255.0f;
                    c3 = 0;
                } else if (q70Var.L) {
                    float f21 = -rect.left;
                    float f22 = (-rect.top) + fArr[1];
                    f10 = 255.0f;
                    if (q70Var.f30331u) {
                        f12 = 1.0f - this.f29691w;
                    } else {
                        f12 = 1.0f;
                    }
                    c3 = 0;
                    canvas2.clipRect(f21, AndroidUtilities.lerp((f22 - (f15 * f12)) + 1.0f, 0.0f, this.f29691w), getMeasuredWidth() + rect.right, org.telegram.ui.yh.c(1.0f, this.f29691w, f20, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c3 = 0;
                    float f23 = -rect.left;
                    float f24 = (-rect.top) + fArr[1];
                    if (q70Var.f30331u) {
                        f11 = 1.0f - this.f29691w;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas2.clipRect(f23, (f24 - (f15 * f11)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f25 = this.f29691w;
                if (q70Var.L) {
                    q70.A(view, q70Var.f30299b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c3], this.f29690s, f25), AndroidUtilities.lerp(fArr[1], this.v, f25));
                } else {
                    canvas2.translate(fArr[c3], fArr[1]);
                }
                if (q70Var.N != 0 && q70Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), q70Var.N, f25);
                    height = AndroidUtilities.lerp(view.getHeight(), q70Var.O, f25);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f26 = height;
                Drawable drawable2 = q70Var.f30308g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && q70Var.f30308g.getIntrinsicHeight() > 0) {
                        f13 = 1.0f;
                        q70Var.f30308g.setBounds((((view.getWidth() + rect.right) - q70Var.f30308g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - q70Var.f30308g.getIntrinsicHeight()) / 2) + (-rect.top), ((q70Var.f30308g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((q70Var.f30308g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f13 = 1.0f;
                        q70Var.f30308g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    q70Var.f30308g.setAlpha((int) (this.f29691w * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = q70Var.f30308g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.k6.l1(this.f29691w, q70Var.h));
                        }
                    }
                    q70Var.f30308g.draw(canvas2);
                } else {
                    f13 = 1.0f;
                }
                if (q70Var.f30315k > 0 || q70Var.f30317l > 0) {
                    path.rewind();
                    boolean z4 = view instanceof p70;
                    RectF rectF2 = this.f29689r;
                    if (z4) {
                        ((p70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f27 = -rect.left;
                    float f28 = q70Var.f30315k * this.f29691w;
                    float f29 = -rect.top;
                    rectF3.set(rectF2.left + f27 + f28, rectF2.top + f29 + f28, (f27 + rectF2.right) - f28, (f29 + rectF2.bottom) - f28);
                    float f30 = q70Var.f30317l * this.f29691w;
                    path.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.r7) {
                    if (view.getAlpha() >= f13) {
                        ((org.telegram.ui.Cells.r7) view).a(canvas2, width, f26, this.f29691w);
                    } else {
                        float f31 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f31, f26, (int) (this.f29691w * f10), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f29691w);
                        canvas2.scale(lerp, lerp, f31 / 2.0f, f26 / 2.0f);
                        ((org.telegram.ui.Cells.r7) view).a(canvas2, f31, f26, this.f29691w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof lh.x1) && q70Var.N != 0 && q70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((lh.x1) view).a(this, canvas2, width, f26, this.f29691w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f26, (int) (this.f29691w * f10), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f29691w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f26 / 2.0f);
                            ((lh.x1) view).a(this, canvas, width, f26, this.f29691w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (q70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f29691w * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof p70) {
                            ((p70) view).b(canvas2, this.f29691w);
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
        q70 q70Var = this.f29692x;
        ug.c.c(q70Var.f30320n, this);
        ViewGroup viewGroup = q70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f29691w == f10) {
            return;
        }
        this.f29691w = f10;
        invalidate();
    }
}
