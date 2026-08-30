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
public final class q51 extends org.telegram.ui.Components.et {
    public int J;
    public int K;
    public ArrayList L;
    public final ArrayList M = new ArrayList();
    public float N = 1.0f;
    public final boolean O = LiteMode.isEnabled(8200);
    public final OvershootInterpolator P = new OvershootInterpolator(3.0f);
    public final r51 Q;

    public q51(r51 r51Var) {
        this.Q = r51Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q51.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                y51 y51Var = (y51) arrayList.get(i10);
                if (!y51Var.f40400b) {
                    if (y51Var.f40399a) {
                        y51Var.B.setBounds(y51Var.C);
                        y51Var.B.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = y51Var.f40404r;
                        if (imageReceiver != null) {
                            imageReceiver.draw(canvas, y51Var.f40402f[this.H]);
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
    public final void d(Canvas canvas, float f10) {
        float f11;
        boolean z4;
        Drawable drawable;
        int i10;
        q61 q61Var = this.Q.f37924b3;
        if (this.L != null) {
            canvas.save();
            float f12 = 0.0f;
            canvas.translate(-this.K, 0.0f);
            float f13 = f10;
            int i11 = 0;
            while (i11 < this.L.size()) {
                y51 y51Var = (y51) this.L.get(i11);
                if (!y51Var.f40400b) {
                    float scaleX = y51Var.getScaleX();
                    int i12 = q61Var.T;
                    if (i12 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f14 = y51Var.K;
                    if (f14 != f12 || (y51Var.P > f12 && i12 != 3 && i12 != 4)) {
                        if (i12 != 3 && i12 != 4) {
                            f11 = y51Var.P * 0.7f;
                        } else {
                            f11 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f11, f14)) * 0.2f) + 0.8f;
                    }
                    if (q61Var.M1 > 0 && SystemClock.elapsedRealtime() - q61Var.M1 < q61Var.g()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && q61Var.K1 >= 0 && q61Var.L1 >= 0 && q61Var.M1 > 0) {
                        int R = RecyclerView.R(y51Var);
                        int i13 = q61Var.K1;
                        int i14 = R - i13;
                        int i15 = q61Var.L1 - i13;
                        if (i14 >= 0 && i14 < i15) {
                            float a2 = k7.n.a(((float) (SystemClock.elapsedRealtime() - q61Var.M1)) / ((float) q61Var.f()), 0.0f, 1.0f);
                            float f15 = i14;
                            float f16 = i15;
                            float f17 = f16 / 4.0f;
                            float cascade = AndroidUtilities.cascade(a2, f15, f16, f17);
                            scaleX *= (this.P.getInterpolation(AndroidUtilities.cascade(a2, f15, f16, f17)) * 0.5f) + 0.5f;
                            f13 = cascade;
                        }
                    } else {
                        f13 *= y51Var.getAlpha();
                    }
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(y51Var.getPaddingLeft() + ((int) y51Var.getX()), y51Var.getPaddingTop(), (y51Var.getWidth() + ((int) y51Var.getX())) - y51Var.getPaddingRight(), y51Var.getHeight() - y51Var.getPaddingBottom());
                    if (!q61Var.f37638t1 && !z4) {
                        rect.offset(0, (int) y51Var.getTranslationY());
                    }
                    if (y51Var.f40399a) {
                        drawable = q61Var.getPremiumStar();
                        int i16 = q61Var.T;
                        if (i16 == 5 || i16 == 10 || i16 == 9 || i16 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!y51Var.f40405s && !y51Var.N) {
                        if ((y51Var.e != null || q61Var.T == 13) && !y51Var.f40400b && (drawable = y51Var.B) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = y51Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = q61Var.f37613h1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = y51Var.B;
                        if (drawable2 instanceof org.telegram.ui.Components.l5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f18 = this.N;
                    y51Var.L = f18;
                    y51Var.M = i11;
                    if (scaleX == 1.0f && f18 >= 1.0f) {
                        m(canvas, drawable, y51Var, f13);
                    } else {
                        canvas.save();
                        float f19 = y51Var.P;
                        if (f19 > 1.0f && (i10 = q61Var.T) != 3 && i10 != 4 && i10 != 6) {
                            float lerp = AndroidUtilities.lerp(1.0f, 0.85f, f19);
                            canvas.scale(lerp, lerp, rect.centerX(), rect.centerY());
                        }
                        int i17 = q61Var.T;
                        if (i17 != 6 && i17 != 13 && i17 != 14) {
                            y51Var.getHeight();
                            float f20 = this.N;
                            if (f20 < 1.0f) {
                                canvas.scale(1.0f, f20, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.N) * (1.0f - ((i11 * 2.0f) / this.L.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, y51Var, f13);
                        canvas.restore();
                    }
                }
                i11++;
                f12 = 0.0f;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.M;
            if (i10 < arrayList.size()) {
                ImageReceiver.BackgroundThreadDrawHolder backgroundThreadDrawHolder = ((y51) arrayList.get(i10)).f40402f[this.H];
                if (backgroundThreadDrawHolder != null) {
                    backgroundThreadDrawHolder.release();
                }
                i10++;
            } else {
                this.Q.f37924b3.f37605e0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q51.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, y51 y51Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.Q.f37924b3.f37613h1);
        } else if ((y51Var.f40405s || y51Var.N) && y51Var.h != null) {
            canvas.save();
            canvas.clipRect(y51Var.h.getImageX(), y51Var.h.getImageY(), y51Var.h.getImageX2(), y51Var.h.getImageY2());
            y51Var.h.setAlpha(f10);
            y51Var.h.draw(canvas);
            canvas.restore();
        }
    }
}
