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
public final class t70 extends View {
    public final Bitmap f28306a;
    public final Paint f28307b;
    public Bitmap f28308c;
    public final Paint d;
    public final float e;
    public final float f28309f;
    public final int h;
    public final Path f28310n;
    public final RectF f28311r;
    public float f28312s;
    public float v;
    public float f28313w;
    public final v70 f28314x;

    public t70(v70 v70Var, Context context) {
        super(context);
        float f7;
        this.f28314x = v70Var;
        this.f28310n = new Path();
        this.f28311r = new RectF();
        View view = v70Var.f28971f;
        Rect rect = v70Var.f29000z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (v70Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f28309f = f7;
        } else {
            this.e = 0.0f;
            this.f28309f = 0.0f;
        }
        this.h = i0.a.k(0, v70Var.f28994s);
        if (v70Var.f28995t && (view instanceof org.telegram.ui.Cells.ab) && (v70Var.f28967c instanceof ProfileActivity)) {
            this.f28307b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f28306a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f28307b = null;
            this.f28306a = null;
        }
        if (!v70Var.f28996u && !v70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = v70Var.f28965b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            mm0.d(dVar);
            return;
        }
        int i10 = mm0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.of(20, viewGroup, dVar), 15.0f);
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
        v70 v70Var = this.f28314x;
        float[] fArr = v70Var.f28987o;
        View view = v70Var.f28971f;
        Rect rect = v70Var.f29000z;
        super.onDraw(canvas);
        if (this.f28308c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f28308c.getWidth(), getHeight() / this.f28308c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f28313w * 255.0f));
            canvas2.drawBitmap(this.f28308c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(this.f28313w, this.h));
        }
        if (v70Var.f28995t) {
            float f14 = this.e;
            Bitmap bitmap = this.f28306a;
            Path path = this.f28310n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (v70Var.f28996u) {
                        f13 = 1.0f - this.f28313w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (v70Var.L) {
                    v70.A(view, v70Var.f28965b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f28312s, this.f28313w), AndroidUtilities.lerp(fArr[1], this.v, this.f28313w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = v70Var.f28973g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && v70Var.f28973g.getIntrinsicHeight() > 0) {
                        v70Var.f28973g.setBounds((((view.getWidth() + rect.right) - v70Var.f28973g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - v70Var.f28973g.getIntrinsicHeight()) / 2) + (-rect.top), ((v70Var.f28973g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((v70Var.f28973g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        v70Var.f28973g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    v70Var.f28973g.draw(canvas2);
                }
                if (v70Var.f28980k > 0 || v70Var.f28982l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = v70Var.f28980k;
                    rectF.set((this.f28313w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * v70Var.f28980k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * v70Var.f28980k));
                    float f18 = v70Var.f28982l * this.f28313w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f28307b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f28309f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (v70Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (v70Var.f28996u) {
                        f11 = 1.0f - this.f28313w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f28313w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f28313w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (v70Var.f28996u) {
                        f10 = 1.0f - this.f28313w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f28313w;
                if (v70Var.L) {
                    v70.A(view, v70Var.f28965b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f28312s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (v70Var.N != 0 && v70Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), v70Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), v70Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = v70Var.f28973g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && v70Var.f28973g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        v70Var.f28973g.setBounds((((view.getWidth() + rect.right) - v70Var.f28973g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - v70Var.f28973g.getIntrinsicHeight()) / 2) + (-rect.top), ((v70Var.f28973g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((v70Var.f28973g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        v70Var.f28973g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    v70Var.f28973g.setAlpha((int) (this.f28313w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = v70Var.f28973g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.j6.l1(this.f28313w, v70Var.h));
                        }
                    }
                    v70Var.f28973g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (v70Var.f28980k > 0 || v70Var.f28982l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof u70;
                    RectF rectF2 = this.f28311r;
                    if (z10) {
                        ((u70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = v70Var.f28980k * this.f28313w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = v70Var.f28982l * this.f28313w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.u7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.u7) view).a(canvas2, width, f25, this.f28313w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f28313w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f28313w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.u7) view).a(canvas2, f30, f25, this.f28313w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.j1) && v70Var.N != 0 && v70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.j1) view).a(this, canvas2, width, f25, this.f28313w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f28313w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f28313w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.j1) view).a(this, canvas, width, f25, this.f28313w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (v70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f28313w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof u70) {
                            ((u70) view).b(canvas2, this.f28313w);
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
        v70 v70Var = this.f28314x;
        gh.d.c(v70Var.f28985n, this);
        ViewGroup viewGroup = v70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f28313w == f7) {
            return;
        }
        this.f28313w = f7;
        invalidate();
    }
}
