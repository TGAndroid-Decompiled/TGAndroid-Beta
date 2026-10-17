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
public final class g80 extends View {
    public final Bitmap f26498a;
    public final Paint f26499b;
    public Bitmap f26500c;
    public final Paint d;
    public final float e;
    public final float f26501f;
    public final int h;
    public final Path f26502n;
    public final RectF f26503r;
    public float f26504s;
    public float v;
    public float f26505w;
    public final i80 f26506x;

    public g80(i80 i80Var, Context context) {
        super(context);
        float f7;
        this.f26506x = i80Var;
        this.f26502n = new Path();
        this.f26503r = new RectF();
        View view = i80Var.f27111f;
        Rect rect = i80Var.f27140z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (i80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f26501f = f7;
        } else {
            this.e = 0.0f;
            this.f26501f = 0.0f;
        }
        this.h = i0.b.o(0, i80Var.f27134s);
        if (i80Var.f27135t && (view instanceof org.telegram.ui.Cells.va) && (i80Var.f27107c instanceof ProfileActivity)) {
            this.f26499b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f26498a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f26499b = null;
            this.f26498a = null;
        }
        if (!i80Var.f27136u && !i80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = i80Var.f27105b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            ym0.d(dVar);
            return;
        }
        int i10 = ym0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new qy(3, viewGroup, dVar), 15.0f);
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
        i80 i80Var = this.f26506x;
        float[] fArr = i80Var.f27127o;
        View view = i80Var.f27111f;
        Rect rect = i80Var.f27140z;
        super.onDraw(canvas);
        if (this.f26500c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f26500c.getWidth(), getHeight() / this.f26500c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f26505w * 255.0f));
            canvas2.drawBitmap(this.f26500c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.h6.m1(this.f26505w, this.h));
        }
        if (i80Var.f27135t) {
            float f14 = this.e;
            Bitmap bitmap = this.f26498a;
            Path path = this.f26502n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (i80Var.f27136u) {
                        f13 = 1.0f - this.f26505w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (i80Var.L) {
                    i80.A(view, i80Var.f27105b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f26504s, this.f26505w), AndroidUtilities.lerp(fArr[1], this.v, this.f26505w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = i80Var.f27113g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && i80Var.f27113g.getIntrinsicHeight() > 0) {
                        i80Var.f27113g.setBounds((((view.getWidth() + rect.right) - i80Var.f27113g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - i80Var.f27113g.getIntrinsicHeight()) / 2) + (-rect.top), ((i80Var.f27113g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((i80Var.f27113g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        i80Var.f27113g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    i80Var.f27113g.draw(canvas2);
                }
                if (i80Var.f27120k > 0 || i80Var.f27122l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = i80Var.f27120k;
                    rectF.set((this.f26505w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * i80Var.f27120k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * i80Var.f27120k));
                    float f18 = i80Var.f27122l * this.f26505w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f26499b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f26501f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (i80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (i80Var.f27136u) {
                        f11 = 1.0f - this.f26505w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f26505w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.cast.a6.D(1.0f, this.f26505w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (i80Var.f27136u) {
                        f10 = 1.0f - this.f26505w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f26505w;
                if (i80Var.L) {
                    i80.A(view, i80Var.f27105b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f26504s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (i80Var.N != 0 && i80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), i80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), i80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = i80Var.f27113g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && i80Var.f27113g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        i80Var.f27113g.setBounds((((view.getWidth() + rect.right) - i80Var.f27113g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - i80Var.f27113g.getIntrinsicHeight()) / 2) + (-rect.top), ((i80Var.f27113g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((i80Var.f27113g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        i80Var.f27113g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    i80Var.f27113g.setAlpha((int) (this.f26505w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = i80Var.f27113g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.h6.m1(this.f26505w, i80Var.h));
                        }
                    }
                    i80Var.f27113g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (i80Var.f27120k > 0 || i80Var.f27122l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof h80;
                    RectF rectF2 = this.f26503r;
                    if (z10) {
                        ((h80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = i80Var.f27120k * this.f26505w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = i80Var.f27122l * this.f26505w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.s7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.s7) view).a(canvas2, width, f25, this.f26505w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f26505w * f7), 31);
                        float lerp = AndroidUtilities.lerp(f12, 0.9f, this.f26505w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.s7) view).a(canvas2, f30, f25, this.f26505w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof yh.h1) && i80Var.N != 0 && i80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((yh.h1) view).a(this, canvas2, width, f25, this.f26505w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f26505w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f26505w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((yh.h1) view).a(this, canvas, width, f25, this.f26505w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (i80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f26505w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof h80) {
                            ((h80) view).c(canvas2, this.f26505w);
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
        i80 i80Var = this.f26506x;
        hh.d.c(i80Var.f27125n, this);
        ViewGroup viewGroup = i80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f26505w == f7) {
            return;
        }
        this.f26505w = f7;
        invalidate();
    }
}
