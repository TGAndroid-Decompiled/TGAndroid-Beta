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
public final class k80 extends View {
    public final Bitmap f26604a;
    public final Paint f26605b;
    public Bitmap f26606c;
    public final Paint d;
    public final float e;
    public final float f26607f;
    public final int h;
    public final Path f26608n;
    public final RectF f26609r;
    public float f26610s;
    public float v;
    public float f26611w;
    public final m80 f26612x;

    public k80(m80 m80Var, Context context) {
        super(context);
        float f7;
        this.f26612x = m80Var;
        this.f26608n = new Path();
        this.f26609r = new RectF();
        View view = m80Var.f27275f;
        Rect rect = m80Var.f27304z;
        if (view != null && (view.getParent() instanceof View)) {
            this.e = view.getY() + ((View) view.getParent()).getY();
            if (m80Var.L) {
                f7 = Math.min(AndroidUtilities.dp(68.0f), Math.max(0.0f, view.getY() + ((View) view.getParent()).getY() + view.getHeight()));
            } else {
                f7 = 0.0f;
            }
            this.f26607f = f7;
        } else {
            this.e = 0.0f;
            this.f26607f = 0.0f;
        }
        this.h = i0.a.k(0, m80Var.f27298s);
        if (m80Var.f27299t && (view instanceof org.telegram.ui.Cells.xa) && (m80Var.f27271c instanceof ProfileActivity)) {
            this.f26605b = new Paint(3);
            Bitmap createBitmap = Bitmap.createBitmap(rect.width() + view.getWidth(), rect.height() + view.getHeight(), Bitmap.Config.ARGB_8888);
            this.f26604a = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(rect.left, rect.top);
            view.draw(canvas);
        } else {
            this.f26605b = null;
            this.f26604a = null;
        }
        if (!m80Var.f27300u && !m80Var.v) {
            return;
        }
        this.d = new Paint(3);
        view.setAlpha(0.0f);
        ViewGroup viewGroup = m80Var.f27269b;
        d dVar = new d(this, 17);
        if (viewGroup == null) {
            cn0.d(dVar);
            return;
        }
        int i10 = cn0.O;
        AndroidUtilities.makeGlobalBlurBitmap(new org.telegram.ui.vc(27, viewGroup, dVar), 15.0f);
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
        m80 m80Var = this.f26612x;
        float[] fArr = m80Var.f27291o;
        View view = m80Var.f27275f;
        Rect rect = m80Var.f27304z;
        super.onDraw(canvas);
        if (this.f26606c != null) {
            canvas2.save();
            float max = Math.max(getWidth() / this.f26606c.getWidth(), getHeight() / this.f26606c.getHeight());
            canvas2.scale(max, max);
            Paint paint = this.d;
            paint.setAlpha((int) (this.f26611w * 255.0f));
            canvas2.drawBitmap(this.f26606c, 0.0f, 0.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(this.f26611w, this.h));
        }
        if (m80Var.f27299t) {
            float f14 = this.e;
            Bitmap bitmap = this.f26604a;
            Path path = this.f26608n;
            if (bitmap != null && (view.getParent() instanceof View)) {
                canvas2.save();
                if (f14 < 1.0f) {
                    float f15 = -rect.left;
                    float f16 = (-rect.top) + fArr[1];
                    if (m80Var.f27300u) {
                        f13 = 1.0f - this.f26611w;
                    } else {
                        f13 = 1.0f;
                    }
                    canvas2.clipRect(f15, (f16 - (f14 * f13)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                if (m80Var.L) {
                    m80.A(view, m80Var.f27269b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[0], this.f26610s, this.f26611w), AndroidUtilities.lerp(fArr[1], this.v, this.f26611w));
                } else {
                    canvas2.translate(fArr[0], fArr[1]);
                }
                Drawable drawable = m80Var.f27277g;
                if (drawable != null) {
                    if (drawable.getIntrinsicWidth() > 0 && m80Var.f27277g.getIntrinsicHeight() > 0) {
                        m80Var.f27277g.setBounds((((view.getWidth() + rect.right) - m80Var.f27277g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - m80Var.f27277g.getIntrinsicHeight()) / 2) + (-rect.top), ((m80Var.f27277g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((m80Var.f27277g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        m80Var.f27277g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    m80Var.f27277g.draw(canvas2);
                }
                if (m80Var.f27284k > 0 || m80Var.f27286l > 0) {
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f17 = m80Var.f27284k;
                    rectF.set((this.f26611w * f17) + (-rect.left), (getAlpha() * f17) + (-rect.top), (bitmap.getWidth() + (-rect.left)) - (getAlpha() * m80Var.f27284k), (bitmap.getHeight() + (-rect.top)) - (getAlpha() * m80Var.f27284k));
                    float f18 = m80Var.f27286l * this.f26611w;
                    path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                Paint paint2 = this.f26605b;
                paint2.setAlpha(255);
                canvas2.drawBitmap(bitmap, -rect.left, -rect.top, paint2);
                canvas2.restore();
            } else if (view != null && (view.getParent() instanceof View)) {
                canvas2.save();
                int i10 = (f14 > 1.0f ? 1 : (f14 == 1.0f ? 0 : -1));
                float f19 = this.f26607f;
                if (i10 >= 0 && f19 == 0.0f) {
                    f7 = 255.0f;
                    c10 = 0;
                } else if (m80Var.L) {
                    float f20 = -rect.left;
                    float f21 = (-rect.top) + fArr[1];
                    f7 = 255.0f;
                    if (m80Var.f27300u) {
                        f11 = 1.0f - this.f26611w;
                    } else {
                        f11 = 1.0f;
                    }
                    c10 = 0;
                    canvas2.clipRect(f20, AndroidUtilities.lerp((f21 - (f14 * f11)) + 1.0f, 0.0f, this.f26611w), getMeasuredWidth() + rect.right, com.google.android.gms.internal.play_billing.k3.D(1.0f, this.f26611w, f19, getMeasuredHeight() + rect.bottom));
                } else {
                    f7 = 255.0f;
                    c10 = 0;
                    float f22 = -rect.left;
                    float f23 = (-rect.top) + fArr[1];
                    if (m80Var.f27300u) {
                        f10 = 1.0f - this.f26611w;
                    } else {
                        f10 = 1.0f;
                    }
                    canvas2.clipRect(f22, (f23 - (f14 * f10)) + 1.0f, getMeasuredWidth() + rect.right, getMeasuredHeight() + rect.bottom);
                }
                float f24 = this.f26611w;
                if (m80Var.L) {
                    m80.A(view, m80Var.f27269b, fArr);
                    canvas2.translate(AndroidUtilities.lerp(fArr[c10], this.f26610s, f24), AndroidUtilities.lerp(fArr[1], this.v, f24));
                } else {
                    canvas2.translate(fArr[c10], fArr[1]);
                }
                if (m80Var.N != 0 && m80Var.O != 0) {
                    width = AndroidUtilities.lerp(view.getWidth(), m80Var.N, f24);
                    height = AndroidUtilities.lerp(view.getHeight(), m80Var.O, f24);
                } else {
                    width = view.getWidth();
                    height = view.getHeight();
                }
                float f25 = height;
                Drawable drawable2 = m80Var.f27277g;
                if (drawable2 != null) {
                    if (drawable2.getIntrinsicWidth() > 0 && m80Var.f27277g.getIntrinsicHeight() > 0) {
                        f12 = 1.0f;
                        m80Var.f27277g.setBounds((((view.getWidth() + rect.right) - m80Var.f27277g.getIntrinsicWidth()) / 2) + (-rect.left), (((view.getHeight() + rect.bottom) - m80Var.f27277g.getIntrinsicHeight()) / 2) + (-rect.top), ((m80Var.f27277g.getIntrinsicWidth() + (view.getWidth() + rect.right)) / 2) + (-rect.left), ((m80Var.f27277g.getIntrinsicHeight() + (view.getHeight() + rect.bottom)) / 2) + (-rect.top));
                    } else {
                        f12 = 1.0f;
                        m80Var.f27277g.setBounds(-rect.left, -rect.top, view.getWidth() + rect.right, view.getHeight() + rect.bottom);
                    }
                    m80Var.f27277g.setAlpha((int) (this.f26611w * f7));
                    if (Build.VERSION.SDK_INT >= 29) {
                        Drawable drawable3 = m80Var.f27277g;
                        if (drawable3 instanceof ShapeDrawable) {
                            Paint paint3 = ((ShapeDrawable) drawable3).getPaint();
                            paint3.setShadowLayer(paint3.getShadowLayerRadius(), paint3.getShadowLayerDx(), paint3.getShadowLayerDy(), org.telegram.ui.ActionBar.g6.m1(this.f26611w, m80Var.h));
                        }
                    }
                    m80Var.f27277g.draw(canvas2);
                } else {
                    f12 = 1.0f;
                }
                if (m80Var.f27284k > 0 || m80Var.f27286l > 0) {
                    path.rewind();
                    boolean z10 = view instanceof l80;
                    RectF rectF2 = this.f26609r;
                    if (z10) {
                        ((l80) view).a(rectF2);
                    } else {
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                    }
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f26 = -rect.left;
                    float f27 = m80Var.f27284k * this.f26611w;
                    float f28 = -rect.top;
                    rectF3.set(rectF2.left + f26 + f27, rectF2.top + f28 + f27, (f26 + rectF2.right) - f27, (f28 + rectF2.bottom) - f27);
                    float f29 = m80Var.f27286l * this.f26611w;
                    path.addRoundRect(rectF3, f29, f29, Path.Direction.CW);
                    canvas2.clipPath(path);
                }
                if (view instanceof org.telegram.ui.Cells.t7) {
                    if (view.getAlpha() >= f12) {
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, width, f25, this.f26611w);
                    } else {
                        float f30 = width;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, f30, f25, (int) (this.f26611w * f7), 31);
                        float lerp = AndroidUtilities.lerp(f12, 0.9f, this.f26611w);
                        canvas2.scale(lerp, lerp, f30 / 2.0f, f25 / 2.0f);
                        ((org.telegram.ui.Cells.t7) view).a(canvas2, f30, f25, this.f26611w);
                        canvas2.restore();
                    }
                } else {
                    if ((view instanceof yh.h1) && m80Var.N != 0 && m80Var.O != 0) {
                        if (view.getAlpha() >= 1.0f) {
                            ((yh.h1) view).a(this, canvas2, width, f25, this.f26611w);
                            canvas2 = canvas;
                        } else {
                            canvas.saveLayerAlpha(0.0f, 0.0f, width, f25, (int) (this.f26611w * f7), 31);
                            float lerp2 = AndroidUtilities.lerp(1.0f, 0.9f, this.f26611w);
                            canvas.scale(lerp2, lerp2, width / 2.0f, f25 / 2.0f);
                            ((yh.h1) view).a(this, canvas, width, f25, this.f26611w);
                            canvas.restore();
                            canvas2 = canvas;
                        }
                    } else {
                        if (m80Var.L) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, view.getWidth(), view.getHeight(), (int) (this.f26611w * f7), 31);
                            canvas2 = canvas;
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        if (view instanceof l80) {
                            ((l80) view).c(canvas2, this.f26611w);
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
        m80 m80Var = this.f26612x;
        hh.d.c(m80Var.f27289n, this);
        ViewGroup viewGroup = m80Var.A;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.f26611w == f7) {
            return;
        }
        this.f26611w = f7;
        invalidate();
    }
}
