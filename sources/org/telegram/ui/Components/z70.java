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
    public final Bitmap f33394a;
    public final Paint f33395b;
    public Bitmap f33396c;
    public final Paint d;
    public final float f33397e;
    public final float f33398f;
    public final int h;
    public final Path f33399n;
    public final RectF f33400r;
    public float f33401s;
    public float v;
    public float f33402w;
    public final b80 f33403x;

    public z70(b80 b80Var, Context context) {
        super(context);
        float f7;
        this.f33403x = b80Var;
        this.f33399n = new Path();
        this.f33400r = new RectF();
        View view = b80Var.f24821f;
        Rect rect = b80Var.f24850z;
        if (view != null && (view.getParent() instanceof View)) {
            this.f33397e = view.getY() + ((View) view.getParent()).getY();
            if (b80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f33398f = f7;
        } else {
            this.f33397e = 0.0f;
            this.f33398f = 0.0f;
        }
        this.h = i0.a.k(0, b80Var.f24844s);
        if (b80Var.f24845t && (view instanceof org.telegram.ui.Cells.za) && (b80Var.f24816c instanceof ProfileActivity)) {
            this.f33395b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f33394a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f33395b = null;
            this.f33394a = null;
        }
        if (!b80Var.f24846u && !b80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = b80Var.f24814b;
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
        b80 b80Var = this.f33403x;
        float[] fArr = b80Var.f24837o;
        View view = b80Var.f24821f;
        Rect rect = b80Var.f24850z;
        super.onDraw(canvas);
        if (this.f33396c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f33396c.getWidth(), getHeight() / this.f33396c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f33402w * 255.0f));
            canvas2.drawBitmap(this.f33396c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.i6.l1(this.f33402w, this.h));
        }
        if (b80Var.f24845t) {
            float f14 = this.f33397e;
            Bitmap bitmap = this.f33394a;
            Path path = this.f33399n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (b80Var.f24846u) {
                        f13 = 1.0f - this.f33402w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (b80Var.L) {
                    b80.A(view, b80Var.f24814b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f33401s, this.f33402w), AndroidUtilities.lerp(fArr[1], this.v, this.f33402w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = b80Var.f24823g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && b80Var.f24823g.getIntrinsicHeight() > 0) {
                        b80Var.f24823g.setBounds((((view.getWidth() + rect.right) - b80Var.f24823g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - b80Var.f24823g.getIntrinsicHeight()) / 2) + (-rect.top), ((b80Var.f24823g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((b80Var.f24823g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        b80Var.f24823g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    b80Var.f24823g.draw(canvas2);
                }
                if (b80Var.f24830k > 0 || b80Var.f24832l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = b80Var.f24830k;
                    rectF.set((this.f33402w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * b80Var.f24830k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * b80Var.f24830k));
                    float f18 = b80Var.f24832l * this.f33402w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f33395b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                float f19 = this.f33398f;
                if (f14 >= 1.0f && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (b80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (b80Var.f24846u) {
                        f11 = 1.0f - this.f33402w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f33402w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.vision.e2.b(1.0f, this.f33402w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (b80Var.f24846u) {
                        f10 = 1.0f - this.f33402w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f33402w;
                if (b80Var.L) {
                    b80.A(view, b80Var.f24814b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f33401s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
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
                Drawable drawable2 = b80Var.f24823g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && b80Var.f24823g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        b80Var.f24823g.setBounds((((view.getWidth() + rect.right) - b80Var.f24823g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - b80Var.f24823g.getIntrinsicHeight()) / 2) + (-rect.top), ((b80Var.f24823g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((b80Var.f24823g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        b80Var.f24823g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    b80Var.f24823g.setAlpha((int) (this.f33402w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = b80Var.f24823g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.i6.l1(this.f33402w, b80Var.h));
                        }
                    }
                    b80Var.f24823g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (b80Var.f24830k > 0 || b80Var.f24832l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof a80;
                    RectF rectF2 = this.f33400r;
                    if (z10) {
                        ((a80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = b80Var.f24830k * this.f33402w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = b80Var.f24832l * this.f33402w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f33402w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f33402w * f7), 31);
                        float lerp = AndroidUtilities.lerp(1.0f, 0.9f, this.f33402w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f33402w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof xh.i1) && b80Var.N != 0 && b80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((xh.i1) view).a(this, canvas2, width, f25, this.f33402w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f33402w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f33402w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((xh.i1) view).a(this, canvas, width, f25, this.f33402w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (b80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f33402w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof a80) {
                            ((a80) view).b(canvas2, this.f33402w);
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
        b80 b80Var = this.f33403x;
        gh.d.c(b80Var.f24835n, this);
        ViewGroup viewGroup = b80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f33402w == f7) {
            return;
        }
        this.f33402w = f7;
        invalidate();
    }
}
