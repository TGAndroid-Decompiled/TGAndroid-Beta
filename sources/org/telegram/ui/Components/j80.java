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
public final class j80 extends View {
    public final Bitmap f29537a;
    public final Paint f29538b;
    public Bitmap f29539c;
    public final Paint d;
    public final float e;
    public final float f29540f;
    public final int h;
    public final Path f29541n;
    public final RectF f29542r;
    public float f29543s;
    public float v;
    public float f29544w;
    public final l80 f29545x;

    public j80(l80 l80Var, Context context) {
        super(context);
        float f7;
        this.f29545x = l80Var;
        this.f29541n = new Path();
        this.f29542r = new RectF();
        View view = l80Var.f30145f;
        Rect rect = l80Var.f30174z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (l80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f29540f = f7;
        } else {
            this.e = 0.0f;
            this.f29540f = 0.0f;
        }
        this.h = i0.a.o(0, l80Var.f30168s);
        if (l80Var.f30169t && (view instanceof org.telegram.ui.Cells.ab) && (l80Var.f30141c instanceof ProfileActivity)) {
            this.f29538b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f29537a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f29538b = null;
            this.f29537a = null;
        }
        if (!l80Var.f30170u && !l80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = l80Var.f30139b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            in0.d(dVar);
            return;
        }
        int i10 = in0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new oy(5, viewGroup, dVar), 15.0f);
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
        l80 l80Var = this.f29545x;
        float[] fArr = l80Var.f30161o;
        View view = l80Var.f30145f;
        Rect rect = l80Var.f30174z;
        super.onDraw(canvas);
        if (this.f29539c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f29539c.getWidth(), getHeight() / this.f29539c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f29544w * 255.0f));
            canvas2.drawBitmap(this.f29539c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(this.f29544w, this.h));
        }
        if (l80Var.f30169t) {
            float f14 = this.e;
            Bitmap bitmap = this.f29537a;
            Path path = this.f29541n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (l80Var.f30170u) {
                        f13 = 1.0f - this.f29544w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (l80Var.L) {
                    l80.A(view, l80Var.f30139b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f29543s, this.f29544w), AndroidUtilities.lerp(fArr[1], this.v, this.f29544w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = l80Var.f30147g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && l80Var.f30147g.getIntrinsicHeight() > 0) {
                        l80Var.f30147g.setBounds((((view.getWidth() + rect.right) - l80Var.f30147g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - l80Var.f30147g.getIntrinsicHeight()) / 2) + (-rect.top), ((l80Var.f30147g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((l80Var.f30147g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        l80Var.f30147g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    l80Var.f30147g.draw(canvas2);
                }
                if (l80Var.f30154k > 0 || l80Var.f30156l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = l80Var.f30154k;
                    rectF.set((this.f29544w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * l80Var.f30154k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * l80Var.f30154k));
                    float f18 = l80Var.f30156l * this.f29544w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f29538b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f29540f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (l80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (l80Var.f30170u) {
                        f11 = 1.0f - this.f29544w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f29544w), getMeasuredWidth() + rect.right, ic.a.d(1.0f, this.f29544w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (l80Var.f30170u) {
                        f10 = 1.0f - this.f29544w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f29544w;
                if (l80Var.L) {
                    l80.A(view, l80Var.f30139b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f29543s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (l80Var.N != 0 && l80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), l80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), l80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = l80Var.f30147g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && l80Var.f30147g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        l80Var.f30147g.setBounds((((view.getWidth() + rect.right) - l80Var.f30147g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - l80Var.f30147g.getIntrinsicHeight()) / 2) + (-rect.top), ((l80Var.f30147g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((l80Var.f30147g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        l80Var.f30147g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    l80Var.f30147g.setAlpha((int) (this.f29544w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = l80Var.f30147g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.y6.o1(this.f29544w, l80Var.h));
                        }
                    }
                    l80Var.f30147g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (l80Var.f30154k > 0 || l80Var.f30156l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof k80;
                    RectF rectF2 = this.f29542r;
                    if (z10) {
                        ((k80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = l80Var.f30154k * this.f29544w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = l80Var.f30156l * this.f29544w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.w7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.w7) view).a(canvas2, width, f25, this.f29544w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f29544w * f7), 31);
                        float lerp = AndroidUtilities.lerp(f12, 0.9f, this.f29544w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.w7) view).a(canvas2, f30, f25, this.f29544w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof zh.g1) && l80Var.N != 0 && l80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((zh.g1) view).b(this, canvas2, width, f25, this.f29544w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f29544w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f29544w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((zh.g1) view).b(this, canvas, width, f25, this.f29544w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (l80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f29544w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof k80) {
                            ((k80) view).b(canvas2, this.f29544w);
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
        l80 l80Var = this.f29545x;
        ih.d.c(l80Var.f30159n, this);
        ViewGroup viewGroup = l80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f29544w == f7) {
            return;
        }
        this.f29544w = f7;
        invalidate();
    }
}
