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
public final class i21 extends org.telegram.ui.Components.ts {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public float Q = 1.0f;
    public final boolean R = org.telegram.messenger.tc.e(8200);
    public final OvershootInterpolator S = new OvershootInterpolator(3.0f);
    public final j21 T;

    public i21(j21 j21Var) {
        this.T = j21Var;
    }

    @Override
    public final void a(android.graphics.Canvas r12, long r13, int r15, int r16, float r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i21.a(android.graphics.Canvas, long, int, int, float):void");
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
                q21 q21Var = (q21) arrayList.get(i10);
                if (!q21Var.f40663b) {
                    if (q21Var.f40662a) {
                        q21Var.E.setBounds(q21Var.F);
                        q21Var.E.draw(canvas);
                    } else {
                        ImageReceiver imageReceiver = q21Var.f40667r;
                        if (imageReceiver != null) {
                            imageReceiver.h(canvas, q21Var.f40665f[this.K]);
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
        g31 g31Var = this.T.f38264l3;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            int i12 = 0;
            float f11 = f7;
            int i13 = 0;
            while (i13 < this.O.size()) {
                q21 q21Var = (q21) this.O.get(i13);
                if (!q21Var.f40663b) {
                    float scaleX = q21Var.getScaleX();
                    int i14 = g31Var.W;
                    if (i14 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f12 = q21Var.N;
                    if (f12 != 0.0f || (q21Var.S > 0.0f && i14 != 3 && i14 != 4)) {
                        if (i14 != 3 && i14 != 4) {
                            f10 = q21Var.S * 0.7f;
                        } else {
                            f10 = 1.0f;
                        }
                        scaleX *= ((1.0f - Math.max(f10, f12)) * 0.2f) + 0.8f;
                    }
                    if (g31Var.Q1 > 0 && SystemClock.elapsedRealtime() - g31Var.Q1 < g31Var.g()) {
                        i10 = 1;
                    } else {
                        i10 = i12;
                    }
                    if (i10 != 0 && g31Var.O1 >= 0 && g31Var.P1 >= 0 && g31Var.Q1 > 0) {
                        int R = RecyclerView.R(q21Var);
                        int i15 = g31Var.O1;
                        int i16 = R - i15;
                        int i17 = g31Var.P1 - i15;
                        if (i16 >= 0 && i16 < i17) {
                            float a2 = w7.u.a(((float) (SystemClock.elapsedRealtime() - g31Var.Q1)) / ((float) g31Var.f()), 0.0f, 1.0f);
                            float f13 = i16;
                            float f14 = i17;
                            float f15 = f14 / 4.0f;
                            float s10 = org.telegram.messenger.i0.s(a2, f13, f14, f15);
                            scaleX *= (this.S.getInterpolation(org.telegram.messenger.i0.s(a2, f13, f14, f15)) * 0.5f) + 0.5f;
                            f11 = s10;
                        }
                    } else {
                        f11 *= q21Var.getAlpha();
                    }
                    Rect rect = org.telegram.messenger.i0.Q;
                    rect.set(q21Var.getPaddingLeft() + ((int) q21Var.getX()), q21Var.getPaddingTop(), (q21Var.getWidth() + ((int) q21Var.getX())) - q21Var.getPaddingRight(), q21Var.getHeight() - q21Var.getPaddingBottom());
                    if (!g31Var.f37341x1 && i10 == 0) {
                        rect.offset(i12, (int) q21Var.getTranslationY());
                    }
                    if (q21Var.f40662a) {
                        drawable = g31Var.getPremiumStar();
                        int i18 = g31Var.W;
                        if (i18 == 5 || i18 == 10 || i18 == 9 || i18 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(255);
                    } else if (!q21Var.f40668s && !q21Var.Q) {
                        if ((q21Var.e != null || g31Var.W == 13) && !q21Var.f40663b && (drawable = q21Var.E) != null) {
                            drawable.setAlpha(255);
                            drawable.setBounds(rect);
                        }
                    } else {
                        ImageReceiver imageReceiver = q21Var.h;
                        if (imageReceiver != null) {
                            imageReceiver.z0(rect);
                        }
                        drawable = null;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = g31Var.f37312k1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = q21Var.E;
                        if (drawable2 instanceof org.telegram.ui.Components.f5) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f16 = this.Q;
                    q21Var.O = f16;
                    q21Var.P = i13;
                    if (scaleX == 1.0f && f16 >= 1.0f) {
                        m(canvas, drawable, q21Var, f11);
                    } else {
                        canvas.save();
                        float f17 = q21Var.S;
                        if (f17 > 1.0f && (i11 = g31Var.W) != 3 && i11 != 4 && i11 != 6) {
                            float T1 = org.telegram.messenger.i0.T1(1.0f, 0.85f, f17);
                            canvas.scale(T1, T1, rect.centerX(), rect.centerY());
                        }
                        int i19 = g31Var.W;
                        if (i19 != 6 && i19 != 13 && i19 != 14) {
                            q21Var.getHeight();
                            float f18 = this.Q;
                            if (f18 < 1.0f) {
                                canvas.scale(1.0f, f18, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.Q) * (1.0f - ((i13 * 2.0f) / this.O.size())), 0.0f);
                            }
                        } else {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        }
                        m(canvas, drawable, q21Var, f11);
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
                org.telegram.messenger.kc kcVar = ((q21) arrayList.get(i10)).f40665f[this.K];
                if (kcVar != null) {
                    kcVar.a();
                }
                i10++;
            } else {
                this.T.f38264l3.f37305h0.invalidate();
                return;
            }
        }
    }

    @Override
    public final void i(long r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i21.i(long):void");
    }

    public final void m(Canvas canvas, Drawable drawable, q21 q21Var, float f7) {
        if (drawable != null) {
            drawable.setAlpha((int) (f7 * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.T.f38264l3.f37312k1);
        } else if ((q21Var.f40668s || q21Var.Q) && q21Var.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = q21Var.h;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), q21Var.h.A());
            q21Var.h.setAlpha(f7);
            q21Var.h.h(canvas, null);
            canvas.restore();
        }
    }
}
