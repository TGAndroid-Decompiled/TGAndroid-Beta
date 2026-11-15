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
import org.telegram.messenger.ImageReceiver;
public final class p01 extends org.telegram.ui.Components.os {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = org.telegram.messenger.qc.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final q01 U;

    public p01(q01 q01Var) {
        this.U = q01Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p01.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                x01 x01Var = (x01) arrayList.get(i7);
                if (!x01Var.f53054b) {
                    if (x01Var.f53053a) {
                        x01Var.F.setBounds(x01Var.G);
                        x01Var.F.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = x01Var.f53059r;
                        if (imageReceiver != null) {
                            imageReceiver.h(canvas, x01Var.f53057f[this.L]);
                        }
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        float f11;
        int i7;
        Drawable drawable;
        int i10;
        n11 n11Var = this.U.f50418m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i11 = 0;
            float f12 = f10;
            int i12 = 0;
            while (i12 < this.P.size()) {
                x01 x01Var = (x01) this.P.get(i12);
                if (!x01Var.f53054b) {
                    float scaleX = x01Var.getScaleX();
                    int i13 = n11Var.f49364a0;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = x01Var.O;
                    if (f13 != 0.0f || (x01Var.T > 0.0f && i13 != 3 && i13 != 4)) {
                        if (i13 != 3 && i13 != 4) {
                            f11 = x01Var.T * 0.7f;
                        } else {
                            f11 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f11, f13)) * 0.2f) + 0.8f;
                    }
                    if (n11Var.R1 > 0 && SystemClock.elapsedRealtime() - n11Var.R1 < n11Var.g()) {
                        i7 = 1;
                    } else {
                        i7 = i11;
                    }
                    if (i7 != 0 && n11Var.P1 >= 0 && n11Var.Q1 >= 0 && n11Var.R1 > 0) {
                        int R = RecyclerView.R(x01Var);
                        int i14 = n11Var.P1;
                        int i15 = R - i14;
                        int i16 = n11Var.Q1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = c8.i9.a(((float) (SystemClock.elapsedRealtime() - n11Var.R1)) / ((float) n11Var.f()), 0.0f, 1.0f);
                            float f14 = i15;
                            float f15 = i16;
                            float f16 = f15 / 4.0f;
                            float s5 = org.telegram.messenger.g0.s(a10, f14, f15, f16);
                            scaleX *= (this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = s5;
                        }
                    } else {
                        f12 *= x01Var.getAlpha();
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(x01Var.getPaddingLeft() + ((int) x01Var.getX()), x01Var.getPaddingTop(), (x01Var.getWidth() + ((int) x01Var.getX())) - x01Var.getPaddingRight(), x01Var.getHeight() - x01Var.getPaddingBottom());
                    if (!n11Var.f49421y1 && i7 == 0) {
                        rect.offset(i11, (int) x01Var.getTranslationY());
                    }
                    if (x01Var.f53053a) {
                        drawable = n11Var.getPremiumStar();
                        int i17 = n11Var.f49364a0;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!x01Var.f53060s && !x01Var.R) {
                        if ((x01Var.f53056e != null || n11Var.f49364a0 == 13) && !x01Var.f53054b && (drawable = x01Var.F) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = x01Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = n11Var.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = x01Var.F;
                        if (drawable2 instanceof org.telegram.ui.Components.g5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.R;
                    x01Var.P = f17;
                    x01Var.Q = i12;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, x01Var, f12);
                    } else {
                        canvas.save();
                        float f18 = x01Var.T;
                        if (f18 > 1.0f && (i10 = n11Var.f49364a0) != 3 && i10 != 4 && i10 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f18);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = n11Var.f49364a0;
                        if (i18 != 6 && i18 != 13 && i18 != 14) {
                            x01Var.getHeight();
                            float f19 = this.R;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i12 * 2.0f) / this.P.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, x01Var, f12);
                        canvas.restore();
                    }
                }
                i12++;
                i11 = 0;
            }
            canvas.restore();
        }
    }

    @Override
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.hc hcVar = ((x01) arrayList.get(i7)).f53057f[this.L];
                if (hcVar != null) {
                    hcVar.a();
                }
                i7++;
            } else {
                this.U.f50418m3.f49385i0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p01.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, x01 x01Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.f50418m3.l1);
        } else if ((x01Var.f53060s || x01Var.R) && x01Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = x01Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), x01Var.h.A());
            x01Var.h.setAlpha(f10);
            x01Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
