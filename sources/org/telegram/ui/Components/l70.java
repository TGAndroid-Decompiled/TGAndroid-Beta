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
public final class l70 extends View {
    public final Bitmap f25842a;
    public final Paint f25843b;
    public Bitmap f25844c;
    public final Paint d;
    public final float e;
    public final float f25845f;
    public final int h;
    public final Path f25846n;
    public final RectF f25847r;
    public float f25848s;
    public float v;
    public float f25849w;
    public final n70 f25850x;

    public l70(n70 n70Var, Context context) {
        super(context);
        float f7;
        this.f25850x = n70Var;
        this.f25846n = new Path();
        this.f25847r = new RectF();
        View view = n70Var.f26364f;
        Rect rect = n70Var.f26393z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (n70Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f25845f = f7;
        } else {
            this.e = 0.0f;
            this.f25845f = 0.0f;
        }
        this.h = i0.a.k(0, n70Var.f26387s);
        if (n70Var.f26388t && (view instanceof org.telegram.ui.Cells.ab) && (n70Var.f26360c instanceof ProfileActivity)) {
            this.f25843b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f25842a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f25843b = null;
            this.f25842a = null;
        }
        if (!n70Var.f26389u && !n70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = n70Var.f26358b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            bm0.d(dVar);
            return;
        }
        int i10 = bm0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.pf(20, viewGroup, dVar), 15.0f);
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
        n70 n70Var = this.f25850x;
        float[] fArr = n70Var.f26380o;
        View view = n70Var.f26364f;
        Rect rect = n70Var.f26393z;
        super.onDraw(canvas);
        if (this.f25844c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f25844c.getWidth(), getHeight() / this.f25844c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f25849w * 255.0f));
            canvas2.drawBitmap(this.f25844c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(this.f25849w, this.h));
        }
        if (n70Var.f26388t) {
            float f14 = this.e;
            Bitmap bitmap = this.f25842a;
            Path path = this.f25846n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (n70Var.f26389u) {
                        f13 = 1.0f - this.f25849w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (n70Var.L) {
                    n70.A(view, n70Var.f26358b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f25848s, this.f25849w), AndroidUtilities.lerp(fArr[1], this.v, this.f25849w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = n70Var.f26366g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && n70Var.f26366g.getIntrinsicHeight() > 0) {
                        n70Var.f26366g.setBounds((((view.getWidth() + rect.right) - n70Var.f26366g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - n70Var.f26366g.getIntrinsicHeight()) / 2) + (-rect.top), ((n70Var.f26366g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((n70Var.f26366g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        n70Var.f26366g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    n70Var.f26366g.draw(canvas2);
                }
                if (n70Var.f26373k > 0 || n70Var.f26375l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = n70Var.f26373k;
                    rectF.set((this.f25849w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * n70Var.f26373k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * n70Var.f26373k));
                    float f18 = n70Var.f26375l * this.f25849w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f25843b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f25845f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (n70Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (n70Var.f26389u) {
                        f11 = 1.0f - this.f25849w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f25849w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f25849w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (n70Var.f26389u) {
                        f10 = 1.0f - this.f25849w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f25849w;
                if (n70Var.L) {
                    n70.A(view, n70Var.f26358b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f25848s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (n70Var.N != 0 && n70Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), n70Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), n70Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = n70Var.f26366g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && n70Var.f26366g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        n70Var.f26366g.setBounds((((view.getWidth() + rect.right) - n70Var.f26366g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - n70Var.f26366g.getIntrinsicHeight()) / 2) + (-rect.top), ((n70Var.f26366g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((n70Var.f26366g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        n70Var.f26366g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    n70Var.f26366g.setAlpha((int) (this.f25849w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = n70Var.f26366g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.j6.l1(this.f25849w, n70Var.h));
                        }
                    }
                    n70Var.f26366g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (n70Var.f26373k > 0 || n70Var.f26375l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof m70;
                    RectF rectF2 = this.f25847r;
                    if (z10) {
                        ((m70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = n70Var.f26373k * this.f25849w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = n70Var.f26375l * this.f25849w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f25849w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f25849w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f25849w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f25849w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.i1) && n70Var.N != 0 && n70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.i1) view).a(this, canvas2, width, f25, this.f25849w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f25849w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f25849w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.i1) view).a(this, canvas, width, f25, this.f25849w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (n70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f25849w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof m70) {
                            ((m70) view).b(canvas2, this.f25849w);
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
        n70 n70Var = this.f25850x;
        gh.d.c(n70Var.f26378n, this);
        ViewGroup viewGroup = n70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f25849w == f7) {
            return;
        }
        this.f25849w = f7;
        invalidate();
    }
}
