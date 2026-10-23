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
public final class c51 extends org.telegram.ui.Components.qt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final d51 T;

    public c51(d51 d51Var) {
        this.T = d51Var;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                k51 k51Var = (k51) arrayList.get(i10);
                if (!k51Var.f38823b) {
                    if (k51Var.f38822a) {
                        k51Var.E.setBounds(k51Var.F);
                        k51Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = k51Var.f38827r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, k51Var.f38825f[this.K]);
                        }
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f7) {
        float f10;
        int i10;
        Drawable drawable;
        int i11;
        b61 b61Var = this.T.f36516f3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                k51 k51Var = (k51) this.O.get(i13);
                if (!k51Var.f38823b) {
                    float scaleX = k51Var.getScaleX();
                    int i14 = b61Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = k51Var.N;
                    if (f12 != 0.0f || (k51Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = k51Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (b61Var.Q1 > 0 && SystemClock.elapsedRealtime() - b61Var.Q1 < b61Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && b61Var.O1 >= 0 && b61Var.P1 >= 0 && b61Var.Q1 > 0) {
                        int R = RecyclerView.R(k51Var);
                        int i15 = b61Var.O1;
                        int i16 = R - i15;
                        int i17 = b61Var.P1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.r.a(((float) (SystemClock.elapsedRealtime() - b61Var.Q1)) / ((float) b61Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    } else {
                        f11 *= k51Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(k51Var.getPaddingLeft() + ((int) k51Var.getX()), k51Var.getPaddingTop(), (k51Var.getWidth() + ((int) k51Var.getX())) - k51Var.getPaddingRight(), k51Var.getHeight() - k51Var.getPaddingBottom());
                    if (!b61Var.f35941x1 && i10 == 0) {
                        rect.offset(i12, (int) k51Var.getTranslationY());
                    }
                    if (k51Var.f38822a) {
                        drawable = b61Var.getPremiumStar();
                        int i18 = b61Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!k51Var.f38828s && !k51Var.Q) {
                        if ((k51Var.e != null || b61Var.W == 13) && !k51Var.f38823b && (drawable = k51Var.E) != null) {
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
                    PorterDuffColorFilter porterDuffColorFilter = b61Var.f35912k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = k51Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.r5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    k51Var.O = f16;
                    k51Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, k51Var, f11);
                    } else {
                        canvas.save();
                        float f17 = k51Var.S;
                        if (f17 > 1.0f && (i11 = b61Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = b61Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            k51Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, k51Var, f11);
                        canvas.restore();
                    }
                }
                i13++;
                i12 = 0;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((k51) arrayList.get(i10)).f38825f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f36516f3.f35905h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c51.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, k51 k51Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f36516f3.f35912k1);
        } else if ((k51Var.f38828s || k51Var.Q) && k51Var.h != null) {
            canvas.save();
            canvas.clipRect(k51Var.h.getImageX(), k51Var.h.getImageY(), k51Var.h.getImageX2(), k51Var.h.getImageY2());
            k51Var.h.setAlpha(f7);
            k51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
