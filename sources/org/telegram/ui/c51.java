package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
public final class c51 extends org.telegram.ui.Components.vs {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public float M = 1.0f;
    public final boolean N = LiteMode.isEnabled(8200);
    public final OvershootInterpolator O = new OvershootInterpolator(3.0f);
    public final d51 P;

    public c51(d51 d51Var) {
        this.P = d51Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c51.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 < arrayList.size()) {
                k51 k51Var = (k51) arrayList.get(i9);
                if (!k51Var.f39711b) {
                    if (k51Var.f39710a) {
                        k51Var.A.setBounds(k51Var.B);
                        k51Var.A.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = k51Var.f39716r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, k51Var.f39714f[this.G]);
                        }
                    }
                }
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        float f11;
        boolean z10;
        Drawable drawable;
        int i9;
        b61 b61Var = this.P.a3;
        if (this.K != null) {
            canvas.save();
            float f12 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f13 = f10;
            int i10 = 0;
            while (i10 < this.K.size()) {
                k51 k51Var = (k51) this.K.get(i10);
                if (!k51Var.f39711b) {
                    float scaleX = k51Var.getScaleX();
                    int i11 = b61Var.S;
                    if (i11 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f14 = k51Var.J;
                    if (f14 != f12 || (k51Var.O > f12 && i11 != 3 && i11 != 4)) {
                        if (i11 != 3 && i11 != 4) {
                            f11 = k51Var.O * 0.7f;
                        } else {
                            f11 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f11, f14)) * 0.2f) + 0.8f;
                    }
                    if (b61Var.L1 > 0 && SystemClock.elapsedRealtime() - b61Var.L1 < b61Var.g()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && b61Var.J1 >= 0 && b61Var.K1 >= 0 && b61Var.L1 > 0) {
                        int R = RecyclerView.R(k51Var);
                        int i12 = b61Var.J1;
                        int i13 = R - i12;
                        int i14 = b61Var.K1 - i12;
                        if (i13 >= 0 && i13 < i14) {
                            float a2 = g7.n.a(((float) (SystemClock.elapsedRealtime() - b61Var.L1)) / ((float) b61Var.f()), 0.0f, 1.0f);
                            float f15 = i13;
                            float f16 = i14;
                            float f17 = f16 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f15, f16, f17);
                            scaleX *= (this.O.getInterpolation(AndroidUtilities.cascade(a2, f15, f16, f17)) * 0.5f) + 0.5f;
                            f13 = cascade;
                        }
                    } else {
                        f13 *= k51Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(k51Var.getPaddingLeft() + ((int) k51Var.getX()), k51Var.getPaddingTop(), (k51Var.getWidth() + ((int) k51Var.getX())) - k51Var.getPaddingRight(), k51Var.getHeight() - k51Var.getPaddingBottom());
                    if (!b61Var.f36703s1 && !z10) {
                        rect.offset(0, (int) k51Var.getTranslationY());
                    }
                    if (k51Var.f39710a) {
                        drawable = b61Var.getPremiumStar();
                        int i15 = b61Var.S;
                        if (i15 == 5 || i15 == 10 || i15 == 9 || i15 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!k51Var.f39717s && !k51Var.M) {
                        if ((k51Var.f39713e != null || b61Var.S == 13) && !k51Var.f39711b && (drawable = k51Var.A) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = k51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = b61Var.f36678g1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = k51Var.A;
                        if (drawable2 instanceof org.telegram.ui.Components.k5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f18 = this.M;
                    k51Var.K = f18;
                    k51Var.L = i10;
                    if (scaleX == 1.0f && f18 >= 1.0f) {
                        m(canvas, drawable, k51Var, f13);
                    } else {
                        canvas.save();
                        float f19 = k51Var.O;
                        if (f19 > 1.0f && (i9 = b61Var.S) != 3 && i9 != 4 && i9 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f19);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i16 = b61Var.S;
                        if (i16 != 6 && i16 != 13 && i16 != 14) {
                            k51Var.getHeight();
                            float f20 = this.M;
                            if (f20 < 1.0f) {
                                canvas.scale(1.0f, f20, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.M) * (1.0f - ((i10 * 2.0f) / this.K.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, k51Var, f13);
                        canvas.restore();
                    }
                }
                i10++;
                f12 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i9 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((k51) arrayList.get(i9)).f39714f[this.G];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i9++;
            } else {
                this.P.a3.f36669d0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c51.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, k51 k51Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.P.a3.f36678g1);
        } else if ((k51Var.f39717s || k51Var.M) && k51Var.h != null) {
            canvas.save();
            canvas.clipRect(k51Var.h.getImageX(), k51Var.h.getImageY(), k51Var.h.getImageX2(), k51Var.h.getImageY2());
            k51Var.h.setAlpha(f10);
            k51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
