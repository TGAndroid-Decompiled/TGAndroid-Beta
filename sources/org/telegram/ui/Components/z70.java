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
public final class z70 extends View {
    public final Bitmap f33401a;
    public final Paint f33402b;
    public Bitmap f33403c;
    public final Paint d;
    public final float f33404e;
    public final float f33405f;
    public final int h;
    public final Path f33406n;
    public final RectF f33407r;
    public float f33408s;
    public float v;
    public float f33409w;
    public final b80 f33410x;

    public z70(b80 b80Var, Context context) {
        super(context);
        float f7;
        this.f33410x = b80Var;
        this.f33406n = new Path();
        this.f33407r = new RectF();
        View view = b80Var.f24826f;
        Rect rect = b80Var.f24855z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f33404e = view.getY() + ((View) view.getParent()).getY();
            if (b80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f33405f = f7;
        } else {
            this.f33404e = 0.0f;
            this.f33405f = 0.0f;
        }
        this.h = i0.a.k(0, b80Var.f24849s);
        if (b80Var.f24850t && (view instanceof org.telegram.ui.Cells.za) && (b80Var.f24821c instanceof ProfileActivity)) {
            this.f33402b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f33401a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f33402b = null;
            this.f33401a = null;
        }
        if (!b80Var.f24851u && !b80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = b80Var.f24819b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            sm0.d(dVar);
            return;
        }
        int i10 = sm0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.qc(27, viewGroup, dVar), 15.0f);
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
        b80 b80Var = this.f33410x;
        float[] fArr = b80Var.f24842o;
        View view = b80Var.f24826f;
        Rect rect = b80Var.f24855z;
        super.onDraw(canvas);
        if (this.f33403c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f33403c.getWidth(), getHeight() / this.f33403c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f33409w * 255.0f));
            canvas2.drawBitmap(this.f33403c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.i6.l1(this.f33409w, this.h));
        }
        if (b80Var.f24850t) {
            float f14 = this.f33404e;
            Bitmap bitmap = this.f33401a;
            Path path = this.f33406n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (b80Var.f24851u) {
                        f13 = 1.0f - this.f33409w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (b80Var.L) {
                    b80.A(view, b80Var.f24819b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f33408s, this.f33409w), AndroidUtilities.lerp(fArr[1], this.v, this.f33409w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = b80Var.f24828g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && b80Var.f24828g.getIntrinsicHeight() > 0) {
                        b80Var.f24828g.setBounds((((view.getWidth() + rect.right) - b80Var.f24828g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - b80Var.f24828g.getIntrinsicHeight()) / 2) + (-rect.top), ((b80Var.f24828g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((b80Var.f24828g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        b80Var.f24828g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    b80Var.f24828g.draw(canvas2);
                }
                if (b80Var.f24835k > 0 || b80Var.f24837l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = b80Var.f24835k;
                    rectF.set((this.f33409w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * b80Var.f24835k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * b80Var.f24835k));
                    float f18 = b80Var.f24837l * this.f33409w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f33402b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f33405f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (b80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (b80Var.f24851u) {
                        f11 = 1.0f - this.f33409w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f33409w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f33409w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (b80Var.f24851u) {
                        f10 = 1.0f - this.f33409w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f33409w;
                if (b80Var.L) {
                    b80.A(view, b80Var.f24819b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f33408s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (b80Var.N != 0 && b80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), b80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), b80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = b80Var.f24828g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && b80Var.f24828g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        b80Var.f24828g.setBounds((((view.getWidth() + rect.right) - b80Var.f24828g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - b80Var.f24828g.getIntrinsicHeight()) / 2) + (-rect.top), ((b80Var.f24828g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((b80Var.f24828g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        b80Var.f24828g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    b80Var.f24828g.setAlpha((int) (this.f33409w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = b80Var.f24828g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.i6.l1(this.f33409w, b80Var.h));
                        }
                    }
                    b80Var.f24828g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (b80Var.f24835k > 0 || b80Var.f24837l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof a80;
                    RectF rectF2 = this.f33407r;
                    if (z10) {
                        ((a80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = b80Var.f24835k * this.f33409w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = b80Var.f24837l * this.f33409w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f33409w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f33409w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f33409w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f33409w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.i1) && b80Var.N != 0 && b80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.i1) view).a(this, canvas2, width, f25, this.f33409w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f33409w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f33409w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.i1) view).a(this, canvas, width, f25, this.f33409w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (b80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f33409w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof a80) {
                            ((a80) view).b(canvas2, this.f33409w);
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
        b80 b80Var = this.f33410x;
        gh.d.c(b80Var.f24840n, this);
        ViewGroup viewGroup = b80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f33409w == f7) {
            return;
        }
        this.f33409w = f7;
        invalidate();
    }
}
