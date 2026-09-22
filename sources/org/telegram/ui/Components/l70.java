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
    public final Bitmap f25850a;
    public final Paint f25851b;
    public Bitmap f25852c;
    public final Paint d;
    public final float e;
    public final float f25853f;
    public final int h;
    public final Path f25854n;
    public final RectF f25855r;
    public float f25856s;
    public float v;
    public float f25857w;
    public final n70 f25858x;

    public l70(n70 n70Var, Context context) {
        super(context);
        float f7;
        this.f25858x = n70Var;
        this.f25854n = new Path();
        this.f25855r = new RectF();
        View view = n70Var.f26344f;
        Rect rect = n70Var.f26373z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (n70Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f25853f = f7;
        } else {
            this.e = 0.0f;
            this.f25853f = 0.0f;
        }
        this.h = i0.a.k(0, n70Var.f26367s);
        if (n70Var.f26368t && (view instanceof org.telegram.ui.Cells.ab) && (n70Var.f26340c instanceof ProfileActivity)) {
            this.f25851b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f25850a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f25851b = null;
            this.f25850a = null;
        }
        if (!n70Var.f26369u && !n70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = n70Var.f26338b;
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
        n70 n70Var = this.f25858x;
        float[] fArr = n70Var.f26360o;
        View view = n70Var.f26344f;
        Rect rect = n70Var.f26373z;
        super.onDraw(canvas);
        if (this.f25852c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f25852c.getWidth(), getHeight() / this.f25852c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f25857w * 255.0f));
            canvas2.drawBitmap(this.f25852c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.i6.l1(this.f25857w, this.h));
        }
        if (n70Var.f26368t) {
            float f14 = this.e;
            Bitmap bitmap = this.f25850a;
            Path path = this.f25854n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (n70Var.f26369u) {
                        f13 = 1.0f - this.f25857w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (n70Var.L) {
                    n70.A(view, n70Var.f26338b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f25856s, this.f25857w), AndroidUtilities.lerp(fArr[1], this.v, this.f25857w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = n70Var.f26346g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && n70Var.f26346g.getIntrinsicHeight() > 0) {
                        n70Var.f26346g.setBounds((((view.getWidth() + rect.right) - n70Var.f26346g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - n70Var.f26346g.getIntrinsicHeight()) / 2) + (-rect.top), ((n70Var.f26346g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((n70Var.f26346g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        n70Var.f26346g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    n70Var.f26346g.draw(canvas2);
                }
                if (n70Var.f26353k > 0 || n70Var.f26355l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = n70Var.f26353k;
                    rectF.set((this.f25857w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * n70Var.f26353k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * n70Var.f26353k));
                    float f18 = n70Var.f26355l * this.f25857w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f25851b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f25853f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (n70Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (n70Var.f26369u) {
                        f11 = 1.0f - this.f25857w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f25857w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f25857w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (n70Var.f26369u) {
                        f10 = 1.0f - this.f25857w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f25857w;
                if (n70Var.L) {
                    n70.A(view, n70Var.f26338b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f25856s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
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
                Drawable drawable2 = n70Var.f26346g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && n70Var.f26346g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        n70Var.f26346g.setBounds((((view.getWidth() + rect.right) - n70Var.f26346g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - n70Var.f26346g.getIntrinsicHeight()) / 2) + (-rect.top), ((n70Var.f26346g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((n70Var.f26346g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        n70Var.f26346g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    n70Var.f26346g.setAlpha((int) (this.f25857w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = n70Var.f26346g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.i6.l1(this.f25857w, n70Var.h));
                        }
                    }
                    n70Var.f26346g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (n70Var.f26353k > 0 || n70Var.f26355l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof m70;
                    RectF rectF2 = this.f25855r;
                    if (z10) {
                        ((m70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = n70Var.f26353k * this.f25857w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = n70Var.f26355l * this.f25857w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f25857w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f25857w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f25857w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f25857w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.i1) && n70Var.N != 0 && n70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.i1) view).a(this, canvas2, width, f25, this.f25857w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f25857w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f25857w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.i1) view).a(this, canvas, width, f25, this.f25857w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (n70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f25857w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof m70) {
                            ((m70) view).b(canvas2, this.f25857w);
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
        n70 n70Var = this.f25858x;
        gh.d.c(n70Var.f26358n, this);
        ViewGroup viewGroup = n70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f25857w == f7) {
            return;
        }
        this.f25857w = f7;
        invalidate();
    }
}
