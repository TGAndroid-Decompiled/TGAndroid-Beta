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
    public final Bitmap f25919a;
    public final Paint f25920b;
    public Bitmap f25921c;
    public final Paint d;
    public final float e;
    public final float f25922f;
    public final int h;
    public final Path f25923n;
    public final RectF f25924r;
    public float f25925s;
    public float v;
    public float f25926w;
    public final l80 f25927x;

    public j80(l80 l80Var, Context context) {
        super(context);
        float f7;
        this.f25927x = l80Var;
        this.f25923n = new Path();
        this.f25924r = new RectF();
        View view = l80Var.f26645f;
        Rect rect = l80Var.f26674z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (l80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f25922f = f7;
        } else {
            this.e = 0.0f;
            this.f25922f = 0.0f;
        }
        this.h = i0.a.k(0, l80Var.f26668s);
        if (l80Var.f26669t && (view instanceof org.telegram.ui.Cells.xa) && (l80Var.f26641c instanceof ProfileActivity)) {
            this.f25920b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f25919a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f25920b = null;
            this.f25919a = null;
        }
        if (!l80Var.f26670u && !l80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = l80Var.f26639b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            cn0.d(dVar);
            return;
        }
        int i10 = cn0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.uc(27, viewGroup, dVar), 15.0f);
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
        l80 l80Var = this.f25927x;
        float[] fArr = l80Var.f26661o;
        View view = l80Var.f26645f;
        Rect rect = l80Var.f26674z;
        super.onDraw(canvas);
        if (this.f25921c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f25921c.getWidth(), getHeight() / this.f25921c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f25926w * 255.0f));
            canvas2.drawBitmap(this.f25921c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(this.f25926w, this.h));
        }
        if (l80Var.f26669t) {
            float f14 = this.e;
            Bitmap bitmap = this.f25919a;
            Path path = this.f25923n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (l80Var.f26670u) {
                        f13 = 1.0f - this.f25926w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (l80Var.L) {
                    l80.A(view, l80Var.f26639b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f25925s, this.f25926w), AndroidUtilities.lerp(fArr[1], this.v, this.f25926w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = l80Var.f26647g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && l80Var.f26647g.getIntrinsicHeight() > 0) {
                        l80Var.f26647g.setBounds((((view.getWidth() + rect.right) - l80Var.f26647g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - l80Var.f26647g.getIntrinsicHeight()) / 2) + (-rect.top), ((l80Var.f26647g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((l80Var.f26647g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        l80Var.f26647g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    l80Var.f26647g.draw(canvas2);
                }
                if (l80Var.f26654k > 0 || l80Var.f26656l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = l80Var.f26654k;
                    rectF.set((this.f25926w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * l80Var.f26654k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * l80Var.f26654k));
                    float f18 = l80Var.f26656l * this.f25926w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f25920b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f25922f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (l80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (l80Var.f26670u) {
                        f11 = 1.0f - this.f25926w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f25926w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.play_billing.k3.D(1.0f, this.f25926w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (l80Var.f26670u) {
                        f10 = 1.0f - this.f25926w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f25926w;
                if (l80Var.L) {
                    l80.A(view, l80Var.f26639b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f25925s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
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
                Drawable drawable2 = l80Var.f26647g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && l80Var.f26647g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        l80Var.f26647g.setBounds((((view.getWidth() + rect.right) - l80Var.f26647g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - l80Var.f26647g.getIntrinsicHeight()) / 2) + (-rect.top), ((l80Var.f26647g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((l80Var.f26647g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        l80Var.f26647g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    l80Var.f26647g.setAlpha((int) (this.f25926w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = l80Var.f26647g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.g6.m1(this.f25926w, l80Var.h));
                        }
                    }
                    l80Var.f26647g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (l80Var.f26654k > 0 || l80Var.f26656l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof k80;
                    RectF rectF2 = this.f25924r;
                    if (z10) {
                        ((k80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = l80Var.f26654k * this.f25926w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = l80Var.f26656l * this.f25926w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f25926w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f25926w * f7), 31);
                        float lerp = AndroidUtilities.lerp(f12, 0.9f, this.f25926w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f25926w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof yh.h1) && l80Var.N != 0 && l80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((yh.h1) view).a(this, canvas2, width, f25, this.f25926w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f25926w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f25926w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((yh.h1) view).a(this, canvas, width, f25, this.f25926w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (l80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f25926w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof k80) {
                            ((k80) view).c(canvas2, this.f25926w);
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
        l80 l80Var = this.f25927x;
        hh.d.c(l80Var.f26659n, this);
        ViewGroup viewGroup = l80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f25926w == f7) {
            return;
        }
        this.f25926w = f7;
        invalidate();
    }
}
