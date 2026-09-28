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
public final class y70 extends View {
    public final Bitmap f30592a;
    public final Paint f30593b;
    public Bitmap f30594c;
    public final Paint d;
    public final float e;
    public final float f30595f;
    public final int h;
    public final Path f30596n;
    public final RectF f30597r;
    public float f30598s;
    public float v;
    public float f30599w;
    public final a80 f30600x;

    public y70(a80 a80Var, Context context) {
        super(context);
        float f7;
        this.f30600x = a80Var;
        this.f30596n = new Path();
        this.f30597r = new RectF();
        View view = a80Var.f22580f;
        Rect rect = a80Var.f22609z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (a80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f30595f = f7;
        } else {
            this.e = 0.0f;
            this.f30595f = 0.0f;
        }
        this.h = i0.a.k(0, a80Var.f22603s);
        if (a80Var.f22604t && (view instanceof org.telegram.ui.Cells.za) && (a80Var.f22576c instanceof ProfileActivity)) {
            this.f30593b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f30592a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f30593b = null;
            this.f30592a = null;
        }
        if (!a80Var.f22605u && !a80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = a80Var.f22574b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            om0.d(dVar);
            return;
        }
        int i10 = om0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.oc(27, viewGroup, dVar), 15.0f);
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
        a80 a80Var = this.f30600x;
        float[] fArr = a80Var.f22596o;
        View view = a80Var.f22580f;
        Rect rect = a80Var.f22609z;
        super.onDraw(canvas);
        if (this.f30594c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f30594c.getWidth(), getHeight() / this.f30594c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f30599w * 255.0f));
            canvas2.drawBitmap(this.f30594c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.h6.l1(this.f30599w, this.h));
        }
        if (a80Var.f22604t) {
            float f14 = this.e;
            Bitmap bitmap = this.f30592a;
            Path path = this.f30596n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (a80Var.f22605u) {
                        f13 = 1.0f - this.f30599w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (a80Var.L) {
                    a80.A(view, a80Var.f22574b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f30598s, this.f30599w), AndroidUtilities.lerp(fArr[1], this.v, this.f30599w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = a80Var.f22582g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && a80Var.f22582g.getIntrinsicHeight() > 0) {
                        a80Var.f22582g.setBounds((((view.getWidth() + rect.right) - a80Var.f22582g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - a80Var.f22582g.getIntrinsicHeight()) / 2) + (-rect.top), ((a80Var.f22582g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((a80Var.f22582g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        a80Var.f22582g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    a80Var.f22582g.draw(canvas2);
                }
                if (a80Var.f22589k > 0 || a80Var.f22591l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = a80Var.f22589k;
                    rectF.set((this.f30599w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * a80Var.f22589k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * a80Var.f22589k));
                    float f18 = a80Var.f22591l * this.f30599w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f30593b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f30595f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (a80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (a80Var.f22605u) {
                        f11 = 1.0f - this.f30599w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f30599w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f30599w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (a80Var.f22605u) {
                        f10 = 1.0f - this.f30599w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f30599w;
                if (a80Var.L) {
                    a80.A(view, a80Var.f22574b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f30598s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (a80Var.N != 0 && a80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), a80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), a80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = a80Var.f22582g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && a80Var.f22582g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        a80Var.f22582g.setBounds((((view.getWidth() + rect.right) - a80Var.f22582g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - a80Var.f22582g.getIntrinsicHeight()) / 2) + (-rect.top), ((a80Var.f22582g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((a80Var.f22582g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        a80Var.f22582g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    a80Var.f22582g.setAlpha((int) (this.f30599w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = a80Var.f22582g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.h6.l1(this.f30599w, a80Var.h));
                        }
                    }
                    a80Var.f22582g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (a80Var.f22589k > 0 || a80Var.f22591l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof z70;
                    RectF rectF2 = this.f30597r;
                    if (z10) {
                        ((z70) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = a80Var.f22589k * this.f30599w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = a80Var.f22591l * this.f30599w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f30599w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f30599w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f30599w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f30599w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.j1) && a80Var.N != 0 && a80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.j1) view).a(this, canvas2, width, f25, this.f30599w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f30599w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f30599w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.j1) view).a(this, canvas, width, f25, this.f30599w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (a80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f30599w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof z70) {
                            ((z70) view).b(canvas2, this.f30599w);
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
        a80 a80Var = this.f30600x;
        gh.d.c(a80Var.f22594n, this);
        ViewGroup viewGroup = a80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f30599w == f7) {
            return;
        }
        this.f30599w = f7;
        invalidate();
    }
}
