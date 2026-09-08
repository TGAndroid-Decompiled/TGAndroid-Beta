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
    public final Bitmap f28101a;
    public final Paint f28102b;
    public Bitmap f28103c;
    public final Paint d;
    public final float f28104e;
    public final float f28105f;
    public final int h;
    public final Path f28106n;
    public final RectF f28107r;
    public float f28108s;
    public float v;
    public float f28109w;
    public final n70 f28110x;

    public l70(n70 n70Var, Context context) {
        super(context);
        float f7;
        this.f28110x = n70Var;
        this.f28106n = new Path();
        this.f28107r = new RectF();
        View view = n70Var.f28664f;
        Rect rect = n70Var.f28693z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f28104e = view.getY() + ((View) view.getParent()).getY();
            if (n70Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f28105f = f7;
        } else {
            this.f28104e = 0.0f;
            this.f28105f = 0.0f;
        }
        this.h = i0.a.k(0, n70Var.f28687s);
        if (n70Var.f28688t && (view instanceof org.telegram.ui.Cells.za) && (n70Var.f28659c instanceof ProfileActivity)) {
            this.f28102b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f28101a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f28102b = null;
            this.f28101a = null;
        }
        if (!n70Var.f28689u && !n70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = n70Var.f28657b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            am0.d(dVar);
            return;
        }
        int i10 = am0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.nf(20, viewGroup, dVar), 15.0f);
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
        n70 n70Var = this.f28110x;
        float[] fArr = n70Var.f28680o;
        View view = n70Var.f28664f;
        Rect rect = n70Var.f28693z;
        super.onDraw(canvas);
        if (this.f28103c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f28103c.getWidth(), getHeight() / this.f28103c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f28109w * 255.0f));
            canvas2.drawBitmap(this.f28103c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(this.f28109w, this.h));
        }
        if (n70Var.f28688t) {
            float f14 = this.f28104e;
            Bitmap bitmap = this.f28101a;
            Path path = this.f28106n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (n70Var.f28689u) {
                        f13 = 1.0f - this.f28109w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (n70Var.L) {
                    n70.A(view, n70Var.f28657b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f28108s, this.f28109w), AndroidUtilities.lerp(fArr[1], this.v, this.f28109w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = n70Var.f28666g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && n70Var.f28666g.getIntrinsicHeight() > 0) {
                        n70Var.f28666g.setBounds((((view.getWidth() + rect.right) - n70Var.f28666g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - n70Var.f28666g.getIntrinsicHeight()) / 2) + (-rect.top), ((n70Var.f28666g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((n70Var.f28666g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        n70Var.f28666g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    n70Var.f28666g.draw(canvas2);
                }
                if (n70Var.f28673k > 0 || n70Var.f28675l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = n70Var.f28673k;
                    rectF.set((this.f28109w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * n70Var.f28673k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * n70Var.f28673k));
                    float f18 = n70Var.f28675l * this.f28109w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f28102b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f28105f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (n70Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (n70Var.f28689u) {
                        f11 = 1.0f - this.f28109w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f28109w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f28109w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (n70Var.f28689u) {
                        f10 = 1.0f - this.f28109w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f28109w;
                if (n70Var.L) {
                    n70.A(view, n70Var.f28657b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f28108s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
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
                Drawable drawable2 = n70Var.f28666g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && n70Var.f28666g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        n70Var.f28666g.setBounds((((view.getWidth() + rect.right) - n70Var.f28666g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - n70Var.f28666g.getIntrinsicHeight()) / 2) + (-rect.top), ((n70Var.f28666g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((n70Var.f28666g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        n70Var.f28666g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    n70Var.f28666g.setAlpha((int) (this.f28109w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = n70Var.f28666g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.j6.l1(this.f28109w, n70Var.h));
                        }
                    }
                    n70Var.f28666g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (n70Var.f28673k > 0 || n70Var.f28675l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof m70;
                    RectF rectF2 = this.f28107r;
                    if (z10) {
                        ((m70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = n70Var.f28673k * this.f28109w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = n70Var.f28675l * this.f28109w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f28109w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f28109w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f28109w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f28109w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof yh.h1) && n70Var.N != 0 && n70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((yh.h1) view).a(this, canvas2, width, f25, this.f28109w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f28109w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f28109w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((yh.h1) view).a(this, canvas, width, f25, this.f28109w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (n70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f28109w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof m70) {
                            ((m70) view).c(canvas2, this.f28109w);
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
        n70 n70Var = this.f28110x;
        hh.d.c(n70Var.f28678n, this);
        ViewGroup viewGroup = n70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f28109w == f7) {
            return;
        }
        this.f28109w = f7;
        invalidate();
    }
}
