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
public final class o80 extends View {
    public final Bitmap f29305a;
    public final Paint f29306b;
    public Bitmap f29307c;
    public final Paint d;
    public final float f29308e;
    public final float f29309f;
    public final int h;
    public final Path f29310n;
    public final RectF f29311r;
    public float f29312s;
    public float v;
    public float f29313w;
    public final q80 f29314x;

    public o80(q80 q80Var, Context context) {
        super(context);
        float f7;
        this.f29314x = q80Var;
        this.f29310n = new Path();
        this.f29311r = new RectF();
        View view = q80Var.f30060f;
        Rect rect = q80Var.f30089z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f29308e = view.getY() + ((View) view.getParent()).getY();
            if (q80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f29309f = f7;
        } else {
            this.f29308e = 0.0f;
            this.f29309f = 0.0f;
        }
        this.h = i0.a.k(0, q80Var.f30083s);
        if (q80Var.f30084t && (view instanceof org.telegram.ui.Cells.xa) && (q80Var.f30055c instanceof ProfileActivity)) {
            this.f29306b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f29305a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f29306b = null;
            this.f29305a = null;
        }
        if (!q80Var.f30085u && !q80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = q80Var.f30053b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            in0.d(dVar);
            return;
        }
        int i10 = in0.O;
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
        q80 q80Var = this.f29314x;
        float[] fArr = q80Var.f30076o;
        View view = q80Var.f30060f;
        Rect rect = q80Var.f30089z;
        super.onDraw(canvas);
        if (this.f29307c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f29307c.getWidth(), getHeight() / this.f29307c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f29313w * 255.0f));
            canvas2.drawBitmap(this.f29307c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(this.f29313w, this.h));
        }
        if (q80Var.f30084t) {
            float f14 = this.f29308e;
            Bitmap bitmap = this.f29305a;
            Path path = this.f29310n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (q80Var.f30085u) {
                        f13 = 1.0f - this.f29313w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (q80Var.L) {
                    q80.A(view, q80Var.f30053b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f29312s, this.f29313w), AndroidUtilities.lerp(fArr[1], this.v, this.f29313w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = q80Var.f30062g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && q80Var.f30062g.getIntrinsicHeight() > 0) {
                        q80Var.f30062g.setBounds((((view.getWidth() + rect.right) - q80Var.f30062g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - q80Var.f30062g.getIntrinsicHeight()) / 2) + (-rect.top), ((q80Var.f30062g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((q80Var.f30062g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        q80Var.f30062g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    q80Var.f30062g.draw(canvas2);
                }
                if (q80Var.f30069k > 0 || q80Var.f30071l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = q80Var.f30069k;
                    rectF.set((this.f29313w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * q80Var.f30069k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * q80Var.f30069k));
                    float f18 = q80Var.f30071l * this.f29313w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f29306b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f29309f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (q80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (q80Var.f30085u) {
                        f11 = 1.0f - this.f29313w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f29313w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f29313w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (q80Var.f30085u) {
                        f10 = 1.0f - this.f29313w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f29313w;
                if (q80Var.L) {
                    q80.A(view, q80Var.f30053b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f29312s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (q80Var.N != 0 && q80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), q80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), q80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = q80Var.f30062g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && q80Var.f30062g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        q80Var.f30062g.setBounds((((view.getWidth() + rect.right) - q80Var.f30062g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - q80Var.f30062g.getIntrinsicHeight()) / 2) + (-rect.top), ((q80Var.f30062g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((q80Var.f30062g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        q80Var.f30062g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    q80Var.f30062g.setAlpha((int) (this.f29313w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = q80Var.f30062g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.h6.m1(this.f29313w, q80Var.h));
                        }
                    }
                    q80Var.f30062g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (q80Var.f30069k > 0 || q80Var.f30071l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof p80;
                    RectF rectF2 = this.f29311r;
                    if (z10) {
                        ((p80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = q80Var.f30069k * this.f29313w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = q80Var.f30071l * this.f29313w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f29313w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f29313w * f7), 31);
                        float lerp = AndroidUtilities.lerp(f12, 0.9f, this.f29313w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f29313w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.j1) && q80Var.N != 0 && q80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.j1) view).a(this, canvas2, width, f25, this.f29313w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f29313w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f29313w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.j1) view).a(this, canvas, width, f25, this.f29313w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (q80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f29313w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof p80) {
                            ((p80) view).b(canvas2, this.f29313w);
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
        q80 q80Var = this.f29314x;
        gh.d.c(q80Var.f30074n, this);
        ViewGroup viewGroup = q80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f29313w == f7) {
            return;
        }
        this.f29313w = f7;
        invalidate();
    }
}
