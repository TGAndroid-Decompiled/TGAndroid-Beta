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
public final class n80 extends View {
    public final Bitmap f29067a;
    public final Paint f29068b;
    public Bitmap f29069c;
    public final Paint d;
    public final float f29070e;
    public final float f29071f;
    public final int h;
    public final Path f29072n;
    public final RectF f29073r;
    public float f29074s;
    public float v;
    public float f29075w;
    public final p80 f29076x;

    public n80(p80 p80Var, Context context) {
        super(context);
        float f7;
        this.f29076x = p80Var;
        this.f29072n = new Path();
        this.f29073r = new RectF();
        View view = p80Var.f29766f;
        Rect rect = p80Var.f29795z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f29070e = view.getY() + ((View) view.getParent()).getY();
            if (p80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f29071f = f7;
        } else {
            this.f29070e = 0.0f;
            this.f29071f = 0.0f;
        }
        this.h = i0.a.k(0, p80Var.f29789s);
        if (p80Var.f29790t && (view instanceof org.telegram.ui.Cells.xa) && (p80Var.f29761c instanceof ProfileActivity)) {
            this.f29068b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f29067a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f29068b = null;
            this.f29067a = null;
        }
        if (!p80Var.f29791u && !p80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = p80Var.f29759b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            gn0.d(dVar);
            return;
        }
        int i10 = gn0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.pc(27, viewGroup, dVar), 15.0f);
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
        p80 p80Var = this.f29076x;
        float[] fArr = p80Var.f29782o;
        View view = p80Var.f29766f;
        Rect rect = p80Var.f29795z;
        super.onDraw(canvas);
        if (this.f29069c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f29069c.getWidth(), getHeight() / this.f29069c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f29075w * 255.0f));
            canvas2.drawBitmap(this.f29069c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.i6.m1(this.f29075w, this.h));
        }
        if (p80Var.f29790t) {
            float f14 = this.f29070e;
            Bitmap bitmap = this.f29067a;
            Path path = this.f29072n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (p80Var.f29791u) {
                        f13 = 1.0f - this.f29075w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (p80Var.L) {
                    p80.A(view, p80Var.f29759b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f29074s, this.f29075w), AndroidUtilities.lerp(fArr[1], this.v, this.f29075w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = p80Var.f29768g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && p80Var.f29768g.getIntrinsicHeight() > 0) {
                        p80Var.f29768g.setBounds((((view.getWidth() + rect.right) - p80Var.f29768g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - p80Var.f29768g.getIntrinsicHeight()) / 2) + (-rect.top), ((p80Var.f29768g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((p80Var.f29768g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        p80Var.f29768g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    p80Var.f29768g.draw(canvas2);
                }
                if (p80Var.f29775k > 0 || p80Var.f29777l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = p80Var.f29775k;
                    rectF.set((this.f29075w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * p80Var.f29775k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * p80Var.f29775k));
                    float f18 = p80Var.f29777l * this.f29075w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f29068b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f29071f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (p80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (p80Var.f29791u) {
                        f11 = 1.0f - this.f29075w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f29075w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f29075w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (p80Var.f29791u) {
                        f10 = 1.0f - this.f29075w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f29075w;
                if (p80Var.L) {
                    p80.A(view, p80Var.f29759b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f29074s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (p80Var.N != 0 && p80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), p80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), p80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = p80Var.f29768g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && p80Var.f29768g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        p80Var.f29768g.setBounds((((view.getWidth() + rect.right) - p80Var.f29768g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - p80Var.f29768g.getIntrinsicHeight()) / 2) + (-rect.top), ((p80Var.f29768g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((p80Var.f29768g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        p80Var.f29768g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    p80Var.f29768g.setAlpha((int) (this.f29075w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = p80Var.f29768g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.i6.m1(this.f29075w, p80Var.h));
                        }
                    }
                    p80Var.f29768g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (p80Var.f29775k > 0 || p80Var.f29777l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof o80;
                    RectF rectF2 = this.f29073r;
                    if (z10) {
                        ((o80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = p80Var.f29775k * this.f29075w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = p80Var.f29777l * this.f29075w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f29075w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f29075w * f7), 31);
                        float lerp = AndroidUtilities.lerp(f12, 0.9f, this.f29075w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f29075w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.j1) && p80Var.N != 0 && p80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.j1) view).a(this, canvas2, width, f25, this.f29075w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f29075w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f29075w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.j1) view).a(this, canvas, width, f25, this.f29075w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (p80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f29075w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof o80) {
                            ((o80) view).b(canvas2, this.f29075w);
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
        p80 p80Var = this.f29076x;
        gh.d.c(p80Var.f29780n, this);
        ViewGroup viewGroup = p80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f29075w == f7) {
            return;
        }
        this.f29075w = f7;
        invalidate();
    }
}
