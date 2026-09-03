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
public final class n70 extends View {
    public final Bitmap f27206a;
    public final Paint f27207b;
    public Bitmap f27208c;
    public final Paint d;
    public final float e;
    public final float f27209f;
    public final int h;
    public final Path f27210n;
    public final RectF f27211r;
    public float f27212s;
    public float v;
    public float f27213w;
    public final p70 f27214x;

    public n70(p70 p70Var, Context context) {
        super(context);
        float f10;
        this.f27214x = p70Var;
        this.f27210n = new Path();
        this.f27211r = new RectF();
        View view = p70Var.f27754f;
        Rect rect = p70Var.f27783z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (p70Var.L) {
                f10 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f10 = 0.0f;
            }
            this.f27209f = f10;
        } else {
            this.e = 0.0f;
            this.f27209f = 0.0f;
        }
        this.h = i0.a.k(0, p70Var.f27777s);
        if (p70Var.f27778t && (view instanceof org.telegram.ui.Cells.ua) && (p70Var.f27750c instanceof ProfileActivity)) {
            this.f27207b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f27206a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f27207b = null;
            this.f27206a = null;
        }
        if (!p70Var.f27779u && !p70Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = p70Var.f27748b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            hm0.d(dVar);
            return;
        }
        int i10 = hm0.L;
        AndroidUtilities.makeGlobalBlurBitmap(new vk(7, viewGroup, dVar), 15.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        char c3;
        float f11;
        float f12;
        float width;
        int height;
        float f13;
        float f14;
        Canvas canvas2 = canvas;
        p70 p70Var = this.f27214x;
        float[] fArr = p70Var.f27770o;
        View view = p70Var.f27754f;
        Rect rect = p70Var.f27783z;
        super.onDraw(canvas);
        if (this.f27208c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f27208c.getWidth(), getHeight() / this.f27208c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f27213w * 255.0f));
            canvas2.drawBitmap(this.f27208c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.j6.l1(this.f27213w, this.h));
        }
        if (p70Var.f27778t) {
            float f15 = this.e;
            Bitmap bitmap = this.f27206a;
            Path path = this.f27210n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f15 < 1.0f) {
                    float f16 = -rect.left;
                    float f17 = (-rect.top) + fArr[1];
                    if (p70Var.f27779u) {
                        f14 = 1.0f - this.f27213w;
                    } else {
                        f14 = 1.0f;
                    }
                    canvas2.clipRect(f16, (f17 - (f15 * f14)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (p70Var.L) {
                    p70.A(view, p70Var.f27748b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f27212s, this.f27213w), AndroidUtilities.lerp(fArr[1], this.v, this.f27213w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = p70Var.f27756g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && p70Var.f27756g.getIntrinsicHeight() > 0) {
                        p70Var.f27756g.setBounds((((view.getWidth() + rect.right) - p70Var.f27756g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - p70Var.f27756g.getIntrinsicHeight()) / 2) + (-rect.top), ((p70Var.f27756g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((p70Var.f27756g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        p70Var.f27756g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    p70Var.f27756g.draw(canvas2);
                }
                if (p70Var.f27763k > 0 || p70Var.f27765l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f18 = p70Var.f27763k;
                    rectF.set((this.f27213w * f18) + (-rect.left), (getAlpha() * f18) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * p70Var.f27763k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * p70Var.f27763k));
                    float f19 = p70Var.f27765l * this.f27213w;
                    path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f27207b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f20 = this.f27209f;
                if (f15 >= 1.0f && f20 == 0.0f) {
                    f10 = 255.0f;
                    c3 = 0;
                } else if (p70Var.L) {
                    float f21 = -rect.left;
                    float f22 = (-rect.top) + fArr[1];
                    f10 = 255.0f;
                    if (p70Var.f27779u) {
                        f12 = 1.0f - this.f27213w;
                    } else {
                        f12 = 1.0f;
                    }
                    c3 = 0;
                    canvas2.clipRect(f21, AndroidUtilities.lerp((f22 - (f15 * f12)) + 1.0f, 0.0f, this.f27213w), getMeasuredWidth() + rect.right, org.telegram.ui.ai.c(1.0f, this.f27213w, f20, getMeasuredHeight() + rect.bottom));
                } else {
                    f10 = 255.0f;
                    c3 = 0;
                    float f23 = -rect.left;
                    float f24 = (-rect.top) + fArr[1];
                    if (p70Var.f27779u) {
                        f11 = 1.0f - this.f27213w;
                    } else {
                        f11 = 1.0f;
                    }
                    canvas2.clipRect(f23, (f24 - (f15 * f11)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f25 = this.f27213w;
                if (p70Var.L) {
                    p70.A(view, p70Var.f27748b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c3], this.f27212s, f25), AndroidUtilities.lerp(fArr[1], this.v, f25));
                } else {
                    canvas2.translate(fArr[c3], fArr[1]);
                }
                if (p70Var.N != 0 && p70Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), p70Var.N, f25);
                    height = AndroidUtilities.lerp(view.getHeight(), p70Var.O, f25);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f26 = height;
                Drawable drawable2 = p70Var.f27756g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && p70Var.f27756g.getIntrinsicHeight() > 0) {
                        f13 = 1.0f;
                        p70Var.f27756g.setBounds((((view.getWidth() + rect.right) - p70Var.f27756g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - p70Var.f27756g.getIntrinsicHeight()) / 2) + (-rect.top), ((p70Var.f27756g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((p70Var.f27756g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f13 = 1.0f;
                        p70Var.f27756g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    p70Var.f27756g.setAlpha((int) (this.f27213w * f10));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = p70Var.f27756g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.j6.l1(this.f27213w, p70Var.h));
                        }
                    }
                    p70Var.f27756g.draw(canvas2);
                } else {
                    f13 = 1.0f;
                }
                if (p70Var.f27763k > 0 || p70Var.f27765l > 0) {
                    path.rewind();
                    boolean z4 = view instanceof o70;
                    RectF rectF2 = this.f27211r;
                    if (z4) {
                        ((o70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f27 = -rect.left;
                    float f28 = p70Var.f27763k * this.f27213w;
                    float f29 = -rect.top;
                    rectF3.set(rectF2.left + f27 + f28, rectF2.top + f29 + f28, (f27 + rectF2.right) - f28, (f29 + rectF2.bottom) - f28);
                    float f30 = p70Var.f27765l * this.f27213w;
                    path.addRoundRect(rectF3, f30, f30, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.q7) {
                    if (view.getAlpha() >= f13) {
                        ((org.telegram.ui.Cells.q7) view).a(canvas2, width, f26, this.f27213w);
                    } else {
                        float f31 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f31, f26, (int) (this.f27213w * f10), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f27213w);
                        canvas2.scale(lerp, lerp, f31 / 2.0f, f26 / 2.0f);
                        ((org.telegram.ui.Cells.q7) view).a(canvas2, f31, f26, this.f27213w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof kh.x1) && p70Var.N != 0 && p70Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((kh.x1) view).a(this, canvas2, width, f26, this.f27213w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f26, (int) (this.f27213w * f10), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f27213w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f26 / 2.0f);
                            ((kh.x1) view).a(this, canvas, width, f26, this.f27213w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (p70Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f27213w * f10), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof o70) {
                            ((o70) view).b(canvas2, this.f27213w);
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
        p70 p70Var = this.f27214x;
        tg.c.c(p70Var.f27768n, this);
        ViewGroup viewGroup = p70Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.f27213w == f10) {
            return;
        }
        this.f27213w = f10;
        invalidate();
    }
}
