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
public final class i80 extends View {
    public final Bitmap f29208a;
    public final Paint f29209b;
    public Bitmap f29210c;
    public final Paint d;
    public final float e;
    public final float f29211f;
    public final int h;
    public final Path f29212n;
    public final RectF f29213r;
    public float f29214s;
    public float v;
    public float f29215w;
    public final k80 f29216x;

    public i80(k80 k80Var, Context context) {
        super(context);
        float f7;
        this.f29216x = k80Var;
        this.f29212n = new Path();
        this.f29213r = new RectF();
        View view = k80Var.f29843f;
        Rect rect = k80Var.f29872z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (k80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f29211f = f7;
        } else {
            this.e = 0.0f;
            this.f29211f = 0.0f;
        }
        this.h = i0.a.o(0, k80Var.f29866s);
        if (k80Var.f29867t && (view instanceof org.telegram.ui.Cells.ab) && (k80Var.f29839c instanceof ProfileActivity)) {
            this.f29209b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f29208a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f29209b = null;
            this.f29208a = null;
        }
        if (!k80Var.f29868u && !k80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = k80Var.f29837b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            hn0.d(dVar);
            return;
        }
        int i10 = hn0.O;
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
        k80 k80Var = this.f29216x;
        float[] fArr = k80Var.f29859o;
        View view = k80Var.f29843f;
        Rect rect = k80Var.f29872z;
        super.onDraw(canvas);
        if (this.f29210c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f29210c.getWidth(), getHeight() / this.f29210c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f29215w * 255.0f));
            canvas2.drawBitmap(this.f29210c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(this.f29215w, this.h));
        }
        if (k80Var.f29867t) {
            float f14 = this.e;
            Bitmap bitmap = this.f29208a;
            Path path = this.f29212n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (k80Var.f29868u) {
                        f13 = 1.0f - this.f29215w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (k80Var.L) {
                    k80.A(view, k80Var.f29837b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f29214s, this.f29215w), AndroidUtilities.lerp(fArr[1], this.v, this.f29215w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = k80Var.f29845g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && k80Var.f29845g.getIntrinsicHeight() > 0) {
                        k80Var.f29845g.setBounds((((view.getWidth() + rect.right) - k80Var.f29845g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - k80Var.f29845g.getIntrinsicHeight()) / 2) + (-rect.top), ((k80Var.f29845g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((k80Var.f29845g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        k80Var.f29845g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    k80Var.f29845g.draw(canvas2);
                }
                if (k80Var.f29852k > 0 || k80Var.f29854l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = k80Var.f29852k;
                    rectF.set((this.f29215w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * k80Var.f29852k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * k80Var.f29852k));
                    float f18 = k80Var.f29854l * this.f29215w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f29209b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f29211f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (k80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (k80Var.f29868u) {
                        f11 = 1.0f - this.f29215w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f29215w), getMeasuredWidth() + rect.right, ic.a.d(1.0f, this.f29215w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (k80Var.f29868u) {
                        f10 = 1.0f - this.f29215w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f29215w;
                if (k80Var.L) {
                    k80.A(view, k80Var.f29837b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f29214s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (k80Var.N != 0 && k80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), k80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), k80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = k80Var.f29845g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && k80Var.f29845g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        k80Var.f29845g.setBounds((((view.getWidth() + rect.right) - k80Var.f29845g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - k80Var.f29845g.getIntrinsicHeight()) / 2) + (-rect.top), ((k80Var.f29845g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((k80Var.f29845g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        k80Var.f29845g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    k80Var.f29845g.setAlpha((int) (this.f29215w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = k80Var.f29845g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.y6.o1(this.f29215w, k80Var.h));
                        }
                    }
                    k80Var.f29845g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (k80Var.f29852k > 0 || k80Var.f29854l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof j80;
                    RectF rectF2 = this.f29213r;
                    if (z10) {
                        ((j80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = k80Var.f29852k * this.f29215w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = k80Var.f29854l * this.f29215w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.w7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.w7) view).a(canvas2, width, f25, this.f29215w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f29215w * f7), 31);
                        float lerp = AndroidUtilities.lerp(f12, 0.9f, this.f29215w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.w7) view).a(canvas2, f30, f25, this.f29215w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof zh.g1) && k80Var.N != 0 && k80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((zh.g1) view).b(this, canvas2, width, f25, this.f29215w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f29215w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f29215w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((zh.g1) view).b(this, canvas, width, f25, this.f29215w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (k80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f29215w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof j80) {
                            ((j80) view).b(canvas2, this.f29215w);
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
        k80 k80Var = this.f29216x;
        ih.d.c(k80Var.f29857n, this);
        ViewGroup viewGroup = k80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f29215w == f7) {
            return;
        }
        this.f29215w = f7;
        invalidate();
    }
}
