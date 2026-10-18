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
public final class a51 extends org.telegram.ui.Components.qt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final b51 T;

    public a51(b51 b51Var) {
        this.T = b51Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a51.a(android.graphics.Canvas, long, int, int, float):void");
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
                i51 i51Var = (i51) arrayList.get(i10);
                if (!i51Var.f37763b) {
                    if (i51Var.f37762a) {
                        i51Var.E.setBounds(i51Var.F);
                        i51Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = i51Var.f37767r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, i51Var.f37765f[this.K]);
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
        z51 z51Var = this.T.f35592c3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                i51 i51Var = (i51) this.O.get(i13);
                if (!i51Var.f37763b) {
                    float scaleX = i51Var.getScaleX();
                    int i14 = z51Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = i51Var.N;
                    if (f12 != 0.0f || (i51Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = i51Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (z51Var.P1 > 0 && SystemClock.elapsedRealtime() - z51Var.P1 < z51Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && z51Var.N1 >= 0 && z51Var.O1 >= 0 && z51Var.P1 > 0) {
                        int R = RecyclerView.R(i51Var);
                        int i15 = z51Var.N1;
                        int i16 = R - i15;
                        int i17 = z51Var.O1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.r.a(((float) (SystemClock.elapsedRealtime() - z51Var.P1)) / ((float) z51Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    } else {
                        f11 *= i51Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(i51Var.getPaddingLeft() + ((int) i51Var.getX()), i51Var.getPaddingTop(), (i51Var.getWidth() + ((int) i51Var.getX())) - i51Var.getPaddingRight(), i51Var.getHeight() - i51Var.getPaddingBottom());
                    if (!z51Var.f43655w1 && i10 == 0) {
                        rect.offset(i12, (int) i51Var.getTranslationY());
                    }
                    if (i51Var.f37762a) {
                        drawable = z51Var.getPremiumStar();
                        int i18 = z51Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!i51Var.f37768s && !i51Var.Q) {
                        if ((i51Var.e != null || z51Var.W == 13) && !i51Var.f37763b && (drawable = i51Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = i51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = z51Var.f43629k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = i51Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.r5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    i51Var.O = f16;
                    i51Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, i51Var, f11);
                    } else {
                        canvas.save();
                        float f17 = i51Var.S;
                        if (f17 > 1.0f && (i11 = z51Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = z51Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            i51Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, i51Var, f11);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((i51) arrayList.get(i10)).f37765f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f35592c3.f43622h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a51.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, i51 i51Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f35592c3.f43629k1);
        } else if ((i51Var.f37768s || i51Var.Q) && i51Var.h != null) {
            canvas.save();
            canvas.clipRect(i51Var.h.getImageX(), i51Var.h.getImageY(), i51Var.h.getImageX2(), i51Var.h.getImageY2());
            i51Var.h.setAlpha(f7);
            i51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
