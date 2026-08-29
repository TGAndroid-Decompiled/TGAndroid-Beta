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
public final class e51 extends org.telegram.ui.Components.at {
    public int I;
    public int J;
    public ArrayList K;
    public final ArrayList L = new ArrayList();
    public float M = 1.0f;
    public final boolean N = LiteMode.isEnabled(8200);
    public final OvershootInterpolator O = new OvershootInterpolator(3.0f);
    public final f51 P;

    public e51(f51 f51Var) {
        this.P = f51Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e51.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                m51 m51Var = (m51) arrayList.get(i10);
                if (!m51Var.f40427b) {
                    if (m51Var.f40426a) {
                        m51Var.A.setBounds(m51Var.B);
                        m51Var.A.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = m51Var.f40432r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, m51Var.f40430f[this.G]);
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
    public final void d(Canvas canvas, float f9) {
        float f10;
        boolean z10;
        Drawable drawable;
        int i10;
        d61 d61Var = this.P.f38001a3;
        if (this.K != null) {
            canvas.save();
            float f11 = 0.0f;
            canvas.translate(-this.J, 0.0f);
            float f12 = f9;
            int i11 = 0;
            while (i11 < this.K.size()) {
                m51 m51Var = (m51) this.K.get(i11);
                if (!m51Var.f40427b) {
                    float scaleX = m51Var.getScaleX();
                    int i12 = d61Var.S;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = m51Var.J;
                    if (f13 != f11 || (m51Var.O > f11 && i12 != 3 && i12 != 4)) {
                        if (i12 != 3 && i12 != 4) {
                            f10 = m51Var.O * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f13)) * 0.2f) + 0.8f;
                    }
                    if (d61Var.L1 > 0 && SystemClock.elapsedRealtime() - d61Var.L1 < d61Var.g()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && d61Var.J1 >= 0 && d61Var.K1 >= 0 && d61Var.L1 > 0) {
                        int R = RecyclerView.R(m51Var);
                        int i13 = d61Var.J1;
                        int i14 = R - i13;
                        int i15 = d61Var.K1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = i7.w.a(((float) (SystemClock.elapsedRealtime() - d61Var.L1)) / ((float) d61Var.f()), 0.0f, 1.0f);
                            float f14 = i14;
                            float f15 = i15;
                            float f16 = f15 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f14, f15, f16);
                            scaleX *= (this.O.getInterpolation(AndroidUtilities.cascade(a2, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = cascade;
                        }
                    } else {
                        f12 *= m51Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(m51Var.getPaddingLeft() + ((int) m51Var.getX()), m51Var.getPaddingTop(), (m51Var.getWidth() + ((int) m51Var.getX())) - m51Var.getPaddingRight(), m51Var.getHeight() - m51Var.getPaddingBottom());
                    if (!d61Var.f37360s1 && !z10) {
                        rect.offset(0, (int) m51Var.getTranslationY());
                    }
                    if (m51Var.f40426a) {
                        drawable = d61Var.getPremiumStar();
                        int i16 = d61Var.S;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!m51Var.f40433s && !m51Var.M) {
                        if ((m51Var.f40429e != null || d61Var.S == 13) && !m51Var.f40427b && (drawable = m51Var.A) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = m51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = d61Var.f37335g1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = m51Var.A;
                        if (drawable2 instanceof org.telegram.ui.Components.p5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.M;
                    m51Var.K = f17;
                    m51Var.L = i11;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, m51Var, f12);
                    } else {
                        canvas.save();
                        float f18 = m51Var.O;
                        if (f18 > 1.0f && (i10 = d61Var.S) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f18);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = d61Var.S;
                        if (i17 != 6 && i17 != 13 && i17 != 14) {
                            m51Var.getHeight();
                            float f19 = this.M;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.M) * (1.0f - ((i11 * 2.0f) / this.K.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, m51Var, f12);
                        canvas.restore();
                    }
                }
                i11++;
                f11 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.L;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((m51) arrayList.get(i10)).f40430f[this.G];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.P.f38001a3.f37326d0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e51.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, m51 m51Var, float f9) {
        if (drawable != null) {
            drawable.setAlpha((int) (f9 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.P.f38001a3.f37335g1);
        } else if ((m51Var.f40433s || m51Var.M) && m51Var.h != null) {
            canvas.save();
            canvas.clipRect(m51Var.h.getImageX(), m51Var.h.getImageY(), m51Var.h.getImageX2(), m51Var.h.getImageY2());
            m51Var.h.setAlpha(f9);
            m51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
