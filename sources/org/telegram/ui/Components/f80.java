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
public final class f80 extends View {
    public final Bitmap f26221a;
    public final Paint f26222b;
    public Bitmap f26223c;
    public final Paint d;
    public final float e;
    public final float f26224f;
    public final int h;
    public final Path f26225n;
    public final RectF f26226r;
    public float f26227s;
    public float v;
    public float f26228w;
    public final h80 f26229x;

    public f80(h80 h80Var, Context context) {
        super(context);
        float f7;
        this.f26229x = h80Var;
        this.f26225n = new Path();
        this.f26226r = new RectF();
        View view = h80Var.f26906f;
        Rect rect = h80Var.f26935z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (h80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f26224f = f7;
        } else {
            this.e = 0.0f;
            this.f26224f = 0.0f;
        }
        this.h = i0.a.o(0, h80Var.f26929s);
        if (h80Var.f26930t && (view instanceof org.telegram.ui.Cells.wa) && (h80Var.f26902c instanceof ProfileActivity)) {
            this.f26222b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f26221a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f26222b = null;
            this.f26221a = null;
        }
        if (!h80Var.f26931u && !h80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = h80Var.f26900b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            bn0.d(dVar);
            return;
        }
        int i10 = bn0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new oy(3, viewGroup, dVar), 15.0f);
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
        h80 h80Var = this.f26229x;
        float[] fArr = h80Var.f26922o;
        View view = h80Var.f26906f;
        Rect rect = h80Var.f26935z;
        super.onDraw(canvas);
        if (this.f26223c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f26223c.getWidth(), getHeight() / this.f26223c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f26228w * 255.0f));
            canvas2.drawBitmap(this.f26223c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.k6.o1(this.f26228w, this.h));
        }
        if (h80Var.f26930t) {
            float f14 = this.e;
            Bitmap bitmap = this.f26221a;
            Path path = this.f26225n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (h80Var.f26931u) {
                        f13 = 1.0f - this.f26228w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (h80Var.L) {
                    h80.A(view, h80Var.f26900b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f26227s, this.f26228w), AndroidUtilities.lerp(fArr[1], this.v, this.f26228w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = h80Var.f26908g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && h80Var.f26908g.getIntrinsicHeight() > 0) {
                        h80Var.f26908g.setBounds((((view.getWidth() + rect.right) - h80Var.f26908g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - h80Var.f26908g.getIntrinsicHeight()) / 2) + (-rect.top), ((h80Var.f26908g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((h80Var.f26908g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        h80Var.f26908g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    h80Var.f26908g.draw(canvas2);
                }
                if (h80Var.f26915k > 0 || h80Var.f26917l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = h80Var.f26915k;
                    rectF.set((this.f26228w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * h80Var.f26915k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * h80Var.f26915k));
                    float f18 = h80Var.f26917l * this.f26228w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f26222b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f26224f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (h80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (h80Var.f26931u) {
                        f11 = 1.0f - this.f26228w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f26228w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.play_billing.k3.D(1.0f, this.f26228w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (h80Var.f26931u) {
                        f10 = 1.0f - this.f26228w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f26228w;
                if (h80Var.L) {
                    h80.A(view, h80Var.f26900b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f26227s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (h80Var.N != 0 && h80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), h80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), h80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = h80Var.f26908g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && h80Var.f26908g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        h80Var.f26908g.setBounds((((view.getWidth() + rect.right) - h80Var.f26908g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - h80Var.f26908g.getIntrinsicHeight()) / 2) + (-rect.top), ((h80Var.f26908g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((h80Var.f26908g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        h80Var.f26908g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    h80Var.f26908g.setAlpha((int) (this.f26228w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = h80Var.f26908g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.k6.o1(this.f26228w, h80Var.h));
                        }
                    }
                    h80Var.f26908g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (h80Var.f26915k > 0 || h80Var.f26917l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof g80;
                    RectF rectF2 = this.f26226r;
                    if (z10) {
                        ((g80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = h80Var.f26915k * this.f26228w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = h80Var.f26917l * this.f26228w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.s7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.s7) view).a(canvas2, width, f25, this.f26228w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f26228w * f7), 31);
                        float lerp = AndroidUtilities.lerp(f12, 0.9f, this.f26228w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.s7) view).a(canvas2, f30, f25, this.f26228w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof yh.g1) && h80Var.N != 0 && h80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((yh.g1) view).b(this, canvas2, width, f25, this.f26228w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f26228w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f26228w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((yh.g1) view).b(this, canvas, width, f25, this.f26228w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (h80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f26228w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof g80) {
                            ((g80) view).c(canvas2, this.f26228w);
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
        h80 h80Var = this.f26229x;
        hh.d.c(h80Var.f26920n, this);
        ViewGroup viewGroup = h80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f26228w == f7) {
            return;
        }
        this.f26228w = f7;
        invalidate();
    }
}
