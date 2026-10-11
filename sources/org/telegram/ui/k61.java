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
public final class k61 extends org.telegram.ui.Components.zt {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = LiteMode.isEnabled(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final l61 T;

    public k61(l61 l61Var) {
        this.T = l61Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k61.a(android.graphics.Canvas, long, int, int, float):void");
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
                s61 s61Var = (s61) arrayList.get(i10);
                if (!s61Var.f41635b) {
                    if (s61Var.f41634a) {
                        s61Var.E.setBounds(s61Var.F);
                        s61Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = s61Var.f41640r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, s61Var.f41638f[this.K]);
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
        j71 j71Var = this.T.f39562c3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                s61 s61Var = (s61) this.O.get(i13);
                if (!s61Var.f41635b) {
                    float scaleX = s61Var.getScaleX();
                    int i14 = j71Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = s61Var.N;
                    if (f12 != 0.0f || (s61Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = s61Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (j71Var.P1 > 0 && SystemClock.elapsedRealtime() - j71Var.P1 < j71Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && j71Var.N1 >= 0 && j71Var.O1 >= 0 && j71Var.P1 > 0) {
                        int R = RecyclerView.R(s61Var);
                        int i15 = j71Var.N1;
                        int i16 = R - i15;
                        int i17 = j71Var.O1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.o.a(((float) (SystemClock.elapsedRealtime() - j71Var.P1)) / ((float) j71Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(AndroidUtilities.cascade(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = cascade;
                        }
                    } else {
                        f11 *= s61Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(s61Var.getPaddingLeft() + ((int) s61Var.getX()), s61Var.getPaddingTop(), (s61Var.getWidth() + ((int) s61Var.getX())) - s61Var.getPaddingRight(), s61Var.getHeight() - s61Var.getPaddingBottom());
                    if (!j71Var.f38961w1 && i10 == 0) {
                        rect.offset(i12, (int) s61Var.getTranslationY());
                    }
                    if (s61Var.f41634a) {
                        drawable = j71Var.getPremiumStar();
                        int i18 = j71Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!s61Var.f41641s && !s61Var.Q) {
                        if ((s61Var.f41637e != null || j71Var.W == 13) && !s61Var.f41635b && (drawable = s61Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = s61Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = j71Var.f38935k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = s61Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.s5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    s61Var.O = f16;
                    s61Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, s61Var, f11);
                    } else {
                        canvas.save();
                        float f17 = s61Var.S;
                        if (f17 > 1.0f && (i11 = j71Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f17);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i19 = j71Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            s61Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, s61Var, f11);
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
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((s61) arrayList.get(i10)).f41638f[this.K];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.T.f39562c3.f38928h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k61.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, s61 s61Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f39562c3.f38935k1);
        } else if ((s61Var.f41641s || s61Var.Q) && s61Var.h != null) {
            canvas.save();
            canvas.clipRect(s61Var.h.getImageX(), s61Var.h.getImageY(), s61Var.h.getImageX2(), s61Var.h.getImageY2());
            s61Var.h.setAlpha(f7);
            s61Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
