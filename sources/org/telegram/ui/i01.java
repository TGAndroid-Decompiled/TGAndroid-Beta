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
public final class i01 extends org.telegram.ui.Components.is {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = org.telegram.messenger.lc.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final j01 U;

    public i01(j01 j01Var) {
        this.U = j01Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i01.a(android.graphics.Canvas, long, int, int, float):void");
    }

    @Override
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override
    public final void c(Canvas canvas) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 < arrayList.size()) {
                q01 q01Var = (q01) arrayList.get(i3);
                if (!q01Var.f48718b) {
                    if (q01Var.f48717a) {
                        q01Var.F.setBounds(q01Var.G);
                        q01Var.F.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = q01Var.f48723r;
                        if (imageReceiver != null) {
                            imageReceiver.h(canvas, q01Var.f48721f[this.L]);
                        }
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void d(Canvas canvas, float f10) {
        float f11;
        int i3;
        Drawable drawable;
        int i10;
        g11 g11Var = this.U.f46479m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i11 = 0;
            float f12 = f10;
            int i12 = 0;
            while (i12 < this.P.size()) {
                q01 q01Var = (q01) this.P.get(i12);
                if (!q01Var.f48718b) {
                    float scaleX = q01Var.getScaleX();
                    int i13 = g11Var.f45435a0;
                    if (i13 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f13 = q01Var.O;
                    if (f13 != 0.0f || (q01Var.T > 0.0f && i13 != 3 && i13 != 4)) {
                        if (i13 != 3 && i13 != 4) {
                            f11 = q01Var.T * 0.7f;
                        } else {
                            f11 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f11, f13)) * 0.2f) + 0.8f;
                    }
                    if (g11Var.R1 > 0 && SystemClock.elapsedRealtime() - g11Var.R1 < g11Var.g()) {
                        i3 = 1;
                    } else {
                        i3 = i11;
                    }
                    if (i3 != 0 && g11Var.P1 >= 0 && g11Var.Q1 >= 0 && g11Var.R1 > 0) {
                        int R = RecyclerView.R(q01Var);
                        int i14 = g11Var.P1;
                        int i15 = R - i14;
                        int i16 = g11Var.Q1 - i14;
                        if (i15 >= 0 && i15 < i16) {
                            float a10 = b8.be.a(((float) (SystemClock.elapsedRealtime() - g11Var.R1)) / ((float) g11Var.f()), 0.0f, 1.0f);
                            float f14 = i15;
                            float f15 = i16;
                            float f16 = f15 / 4.0f;
                            float s6 = org.telegram.messenger.g0.s(a10, f14, f15, f16);
                            scaleX *= (this.T.getInterpolation(org.telegram.messenger.g0.s(a10, f14, f15, f16)) * 0.5f) + 0.5f;
                            f12 = s6;
                        }
                    } else {
                        f12 *= q01Var.getAlpha();
                    }
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(q01Var.getPaddingLeft() + ((int) q01Var.getX()), q01Var.getPaddingTop(), (q01Var.getWidth() + ((int) q01Var.getX())) - q01Var.getPaddingRight(), q01Var.getHeight() - q01Var.getPaddingBottom());
                    if (!g11Var.f45492y1 && i3 == 0) {
                        rect.offset(i11, (int) q01Var.getTranslationY());
                    }
                    if (q01Var.f48717a) {
                        drawable = g11Var.getPremiumStar();
                        int i17 = g11Var.f45435a0;
                        if (i17 == 5 || i17 == 10 || i17 == 9 || i17 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!q01Var.f48724s && !q01Var.R) {
                        if ((q01Var.f48720e != null || g11Var.f45435a0 == 13) && !q01Var.f48718b && (drawable = q01Var.F) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = q01Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = g11Var.f45462l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = q01Var.F;
                        if (drawable2 instanceof org.telegram.ui.Components.g5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f17 = this.R;
                    q01Var.P = f17;
                    q01Var.Q = i12;
                    if (scaleX == 1.0f && f17 >= 1.0f) {
                        m(canvas, drawable, q01Var, f12);
                    } else {
                        canvas.save();
                        float f18 = q01Var.T;
                        if (f18 > 1.0f && (i10 = g11Var.f45435a0) != 3 && i10 != 4 && i10 != 6) {
                            float T1 = org.telegram.messenger.g0.T1(1.0f, 0.85f, f18);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i18 = g11Var.f45435a0;
                        if (i18 != 6 && i18 != 13 && i18 != 14) {
                            q01Var.getHeight();
                            float f19 = this.R;
                            if (f19 < 1.0f) {
                                canvas.scale(1.0f, f19, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i12 * 2.0f) / this.P.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, q01Var, f12);
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 < arrayList.size()) {
                org.telegram.messenger.bc bcVar = ((q01) arrayList.get(i3)).f48721f[this.L];
                if (bcVar != null) {
                    bcVar.a();
                }
                i3++;
            } else {
                this.U.f46479m3.f45456i0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i01.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, q01 q01Var, float f10) {
        if (drawable != null) {
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.f46479m3.f45462l1);
        } else if ((q01Var.f48724s || q01Var.R) && q01Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = q01Var.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), q01Var.h.A());
            q01Var.h.setAlpha(f10);
            q01Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
