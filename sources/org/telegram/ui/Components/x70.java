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
public final class x70 extends View {
    public final Bitmap f30283a;
    public final Paint f30284b;
    public Bitmap f30285c;
    public final Paint d;
    public final float e;
    public final float f30286f;
    public final int h;
    public final Path f30287n;
    public final RectF f30288r;
    public float f30289s;
    public float v;
    public float f30290w;
    public final z70 f30291x;

    public x70(z70 z70Var, Context context) {
        super(context);
        float f7;
        this.f30291x = z70Var;
        this.f30287n = new Path();
        this.f30288r = new RectF();
        View view = z70Var.f30816f;
        Rect rect = z70Var.f30845z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (z70Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f30286f = f7;
        } else {
            this.e = 0.0f;
            this.f30286f = 0.0f;
        }
        this.h = i0.a.k(0, z70Var.f30839s);
        if (z70Var.f30840t && (view instanceof org.telegram.ui.Cells.za) && (z70Var.f30812c instanceof ProfileActivity)) {
            this.f30284b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f30283a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f30284b = null;
            this.f30283a = null;
        }
        if (!z70Var.f30841u && !z70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = z70Var.f30810b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            nm0.d(dVar);
            return;
        }
        int i10 = nm0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.oc(27, viewGroup, dVar), 15.0f);
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
        z70 z70Var = this.f30291x;
        float[] fArr = z70Var.f30832o;
        View view = z70Var.f30816f;
        Rect rect = z70Var.f30845z;
        super.onDraw(canvas);
        if (this.f30285c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f30285c.getWidth(), getHeight() / this.f30285c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f30290w * 255.0f));
            canvas2.drawBitmap(this.f30285c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.h6.l1(this.f30290w, this.h));
        }
        if (z70Var.f30840t) {
            float f14 = this.e;
            Bitmap bitmap = this.f30283a;
            Path path = this.f30287n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (z70Var.f30841u) {
                        f13 = 1.0f - this.f30290w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (z70Var.L) {
                    z70.A(view, z70Var.f30810b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f30289s, this.f30290w), AndroidUtilities.lerp(fArr[1], this.v, this.f30290w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = z70Var.f30818g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && z70Var.f30818g.getIntrinsicHeight() > 0) {
                        z70Var.f30818g.setBounds((((view.getWidth() + rect.right) - z70Var.f30818g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - z70Var.f30818g.getIntrinsicHeight()) / 2) + (-rect.top), ((z70Var.f30818g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((z70Var.f30818g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        z70Var.f30818g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    z70Var.f30818g.draw(canvas2);
                }
                if (z70Var.f30825k > 0 || z70Var.f30827l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = z70Var.f30825k;
                    rectF.set((this.f30290w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * z70Var.f30825k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * z70Var.f30825k));
                    float f18 = z70Var.f30827l * this.f30290w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f30284b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f30286f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (z70Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (z70Var.f30841u) {
                        f11 = 1.0f - this.f30290w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f30290w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f30290w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (z70Var.f30841u) {
                        f10 = 1.0f - this.f30290w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f30290w;
                if (z70Var.L) {
                    z70.A(view, z70Var.f30810b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f30289s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (z70Var.N != 0 && z70Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), z70Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), z70Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = z70Var.f30818g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && z70Var.f30818g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        z70Var.f30818g.setBounds((((view.getWidth() + rect.right) - z70Var.f30818g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - z70Var.f30818g.getIntrinsicHeight()) / 2) + (-rect.top), ((z70Var.f30818g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((z70Var.f30818g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        z70Var.f30818g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    z70Var.f30818g.setAlpha((int) (this.f30290w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = z70Var.f30818g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.h6.l1(this.f30290w, z70Var.h));
                        }
                    }
                    z70Var.f30818g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (z70Var.f30825k > 0 || z70Var.f30827l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof y70;
                    RectF rectF2 = this.f30288r;
                    if (z10) {
                        ((y70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = z70Var.f30825k * this.f30290w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = z70Var.f30827l * this.f30290w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f30290w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f30290w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f30290w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f30290w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.j1) && z70Var.N != 0 && z70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.j1) view).a(this, canvas2, width, f25, this.f30290w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f30290w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f30290w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.j1) view).a(this, canvas, width, f25, this.f30290w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (z70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f30290w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof y70) {
                            ((y70) view).b(canvas2, this.f30290w);
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
        z70 z70Var = this.f30291x;
        gh.d.c(z70Var.f30830n, this);
        ViewGroup viewGroup = z70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f30290w == f7) {
            return;
        }
        this.f30290w = f7;
        invalidate();
    }
}
