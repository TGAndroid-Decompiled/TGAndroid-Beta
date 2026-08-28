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
public final class v60 extends View {
    public final Bitmap f33271a;
    public final Paint f33272b;
    public Bitmap f33273c;
    public final Paint d;
    public final float f33274e;
    public final float f33275f;
    public final int h;
    public final Path f33276n;
    public final RectF f33277r;
    public float f33278s;
    public float v;
    public float f33279w;
    public final x60 f33280x;

    public v60(x60 x60Var, Context context) {
        super(context);
        float f10;
        this.f33280x = x60Var;
        this.f33276n = new Path();
        this.f33277r = new RectF();
        View view = x60Var.f34557f;
        Rect rect = x60Var.f34586z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f33274e = view.getY() + ((View) view.getParent()).getY();
            if (x60Var.L) {
                f10 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f33275f = f10;
        } else {
            this.f33274e = 0.0f;
            this.f33275f = 0.0f;
        }
        this.h = i0.a.k(0, x60Var.f34580s);
        if (x60Var.f34581t && (view instanceof org.telegram.ui.Cells.va) && (x60Var.f34552c instanceof ProfileActivity)) {
            this.f33272b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f33271a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f33272b = null;
            this.f33271a = null;
        }
        if (!x60Var.f34582u && !x60Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = x60Var.f34550b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            ll0.d(dVar);
            return;
        }
        int i9 = ll0.K;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.df(22, viewGroup, dVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        char c10;
        float f11;
        float f12;
        float width;
        int height;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        x60 x60Var = this.f33280x;
        float[] fArr = x60Var.f34573o;
        View view = x60Var.f34557f;
        Rect rect = x60Var.f34586z;
        super.onDraw(canvas);
        if (this.f33273c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f33273c.getWidth(), getHeight() / this.f33273c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f33279w * 255.0f));
            canvas2.drawBitmap(this.f33273c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(this.f33279w, this.h));
        }
        if (x60Var.f34581t) {
            float f15 = this.f33274e;
            Bitmap bitmap = this.f33271a;
            Path path = this.f33276n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f15 < 1.0f) {
                    float f16 = -rect.left;
                    float f17 = (-rect.top) + fArr[1];
                    if (x60Var.f34582u) {
                        f14 = 1.0f - this.f33279w;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas2.clipRect(f16, (f17 - (f15 * f14)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (x60Var.L) {
                    x60.A(view, x60Var.f34550b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f33278s, this.f33279w), AndroidUtilities.lerp(fArr[1], this.v, this.f33279w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = x60Var.f34559g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && x60Var.f34559g.getIntrinsicHeight() > 0) {
                        x60Var.f34559g.setBounds((((view.getWidth() + rect.right) - x60Var.f34559g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - x60Var.f34559g.getIntrinsicHeight()) / 2) + (-rect.top), ((x60Var.f34559g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((x60Var.f34559g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        x60Var.f34559g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    x60Var.f34559g.draw(canvas2);
                }
                if (x60Var.f34566k > 0 || x60Var.f34568l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = x60Var.f34566k;
                    rectF.set((this.f33279w * f18) + (-rect.left), (getAlpha() * f18) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * x60Var.f34566k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * x60Var.f34566k));
                    float f19 = x60Var.f34568l * this.f33279w;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f33272b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f20 = this.f33275f;
                if (f15 >= 1.0f && f20 == 0.0f) {
                    f10 = 255.0f;
                    c10 = 0;
                } else if (x60Var.L) {
                    float f21 = -rect.left;
                    float f22 = (-rect.top) + fArr[1];
                    f10 = 255.0f;
                    if (x60Var.f34582u) {
                        f12 = 1.0f - this.f33279w;
                    } else {
                        f12 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f21, AndroidUtilities.lerp((f22 - (f15 * f12)) + 1.0f, 0.0f, this.f33279w), getMeasuredWidth() + rect.right, j3.r0.C(1.0f, this.f33279w, f20, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c10 = 0;
                    float f23 = -rect.left;
                    float f24 = (-rect.top) + fArr[1];
                    if (x60Var.f34582u) {
                        f11 = 1.0f - this.f33279w;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas2.clipRect(f23, (f24 - (f15 * f11)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f25 = this.f33279w;
                if (x60Var.L) {
                    x60.A(view, x60Var.f34550b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f33278s, f25), AndroidUtilities.lerp(fArr[1], this.v, f25));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (x60Var.N != 0 && x60Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), x60Var.N, f25);
                    height = AndroidUtilities.lerp(view.getHeight(), x60Var.O, f25);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f26 = height;
                Drawable drawable2 = x60Var.f34559g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && x60Var.f34559g.getIntrinsicHeight() > 0) {
                        f13 = 1.0f;
                        x60Var.f34559g.setBounds((((view.getWidth() + rect.right) - x60Var.f34559g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - x60Var.f34559g.getIntrinsicHeight()) / 2) + (-rect.top), ((x60Var.f34559g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((x60Var.f34559g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f13 = 1.0f;
                        x60Var.f34559g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    x60Var.f34559g.setAlpha((int) (this.f33279w * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = x60Var.f34559g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.f6.l1(this.f33279w, x60Var.h));
                        }
                    }
                    x60Var.f34559g.draw(canvas2);
                } else {
                    f13 = 1.0f;
                }
                if (x60Var.f34566k > 0 || x60Var.f34568l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof w60;
                    RectF rectF2 = this.f33277r;
                    if (z10) {
                        ((w60) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f27 = -rect.left;
                    float f28 = x60Var.f34566k * this.f33279w;
                    float f29 = -rect.top;
                    rectF3.set(rectF2.left + f27 + f28, rectF2.top + f29 + f28, (f27 + rectF2.right) - f28, (f29 + rectF2.bottom) - f28);
                    float f30 = x60Var.f34568l * this.f33279w;
                    path.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.r7) {
                    if (view.getAlpha() >= f13) {
                        ((org.telegram.ui.Cells.r7) view).a(canvas2, width, f26, this.f33279w);
                    } else {
                        float f31 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f31, f26, (int) (this.f33279w * f10), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f33279w);
                        canvas2.scale(lerp, lerp, f31 / 2.0f, f26 / 2.0f);
                        ((org.telegram.ui.Cells.r7) view).a(canvas2, f31, f26, this.f33279w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof fh.f2) && x60Var.N != 0 && x60Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((fh.f2) view).a(this, canvas2, width, f26, this.f33279w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f26, (int) (this.f33279w * f10), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f33279w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f26 / 2.0f);
                            ((fh.f2) view).a(this, canvas, width, f26, this.f33279w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (x60Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f33279w * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof w60) {
                            ((w60) view).b(canvas2, this.f33279w);
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        x60 x60Var = this.f33280x;
        og.d.c(x60Var.f34571n, this);
        ViewGroup viewGroup = x60Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f33279w == f10) {
            return;
        }
        this.f33279w = f10;
        invalidate();
    }
}
