package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class sc extends Drawable {
    public static final qc H = new qc(0);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f37982i;
    public float f37983j;
    public float f37984k;
    public float f37985l;
    public float f37986m;
    public float f37987n;
    public float f37988o;
    public float f37989p;
    public final rc f37990q;
    public final rc f37991r;
    public float f37992s;
    public long f37993t;
    public boolean f37994u;
    public float v;
    public float f37995w;
    public float f37996x;
    public final float f37976a = org.telegram.messenger.g0.L(18.0f);
    public final float f37977b = org.telegram.messenger.g0.L(22.0f);
    public final float f37978c = 2.4f;
    public final float d = org.telegram.messenger.g0.L(12.0f);
    public final float f37979e = org.telegram.messenger.g0.L(1.5f);
    public final float f37980f = 3600.0f;
    public final float f37981g = 0.25f;
    public final Path f37997y = new Path();
    public final float[] f37998z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final xf F = new xf(this, 16);
    public int G = 255;

    public sc() {
        rc rcVar = new rc();
        this.f37990q = rcVar;
        rcVar.f37599a = 1.0f;
        rcVar.f37600b = 0.0f;
        rcVar.f37601c = org.telegram.messenger.g0.L(0.5f);
        rcVar.d = org.telegram.messenger.g0.L(8.5f);
        rcVar.f37602e = 1.0f;
        rcVar.f37603f = 1.0f;
        rcVar.f37604g = 61;
        rc rcVar2 = new rc();
        this.f37991r = rcVar2;
        rcVar2.f37599a = 0.82f;
        rcVar2.f37600b = 0.6f;
        rcVar2.f37601c = org.telegram.messenger.g0.L(0.0f);
        rcVar2.d = org.telegram.messenger.g0.L(4.25f);
        rcVar2.f37602e = 0.55f;
        rcVar2.f37603f = 0.55f;
        rcVar2.f37604g = 128;
        g(0, false);
    }

    public static int e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ph, false);
                }
                return i0.a.f(0.5f, i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false));
            }
            return i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Nh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        }
        return i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Mh, false));
    }

    public final void a(int i7) {
        this.B = i7;
        rc rcVar = this.f37990q;
        rcVar.h = i7;
        rc rcVar2 = this.f37991r;
        rcVar2.h = i7;
        rcVar.a();
        rcVar2.a();
    }

    public final void b(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = this.f37983j;
        fArr[0] = (f13 * cos) + f10;
        fArr[1] = (f13 * sin) + f11;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, rc rcVar, float f10, float f11, float f12) {
        int i7;
        int i10;
        char c10;
        int i11;
        int i12 = rcVar.f37619x;
        if (i12 == 0) {
            return;
        }
        float f13 = rcVar.f37601c;
        float f14 = this.v;
        float f15 = ((rcVar.d - f13) * f14) + f13;
        float f16 = 1.0f;
        float f17 = 0.0f;
        float B = com.google.android.recaptcha.internal.a.B(f14, 1.0f, 0.0f, this.d * rcVar.f37602e);
        float[] fArr = rcVar.f37617u;
        float[] fArr2 = rcVar.v;
        float[] fArr3 = rcVar.f37618w;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            float interpolation = H.getInterpolation(rcVar.f37611o[i14]);
            float f18 = 1.0f - interpolation;
            fArr[i14] = (rcVar.f37608l[i14] * interpolation) + (rcVar.f37607k[i14] * f18);
            fArr3[i14] = (rcVar.f37610n[i14] * interpolation) + (rcVar.f37609m[i14] * f18);
        }
        float f19 = this.f37981g;
        char c11 = 2;
        if (f19 > 0.0f) {
            int i15 = 0;
            while (i15 < 2) {
                int i16 = 0;
                while (i16 < i12) {
                    int i17 = i16 == 0 ? i12 - 1 : i16 - 1;
                    float f20 = f16;
                    int i18 = i16 + 1;
                    if (i18 == i12) {
                        i11 = 0;
                    } else {
                        i11 = i18;
                    }
                    float f21 = f17;
                    float f22 = fArr[i16];
                    fArr2[i16] = com.google.android.recaptcha.internal.a.z((fArr[i17] + fArr[i11]) * 0.5f, f22, f19, f22);
                    i16 = i18;
                    f16 = f20;
                    f17 = f21;
                }
                float f23 = f16;
                i15++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
                f16 = f23;
            }
        }
        float f24 = f16;
        float f25 = f17;
        int i19 = 0;
        while (i19 < i12) {
            float f26 = (i19 / i12) + fArr3[i19];
            float floor = (f26 - ((float) Math.floor(f26))) * this.f37989p;
            float f27 = this.f37986m;
            int i20 = (floor > f27 ? 1 : (floor == f27 ? 0 : -1));
            float[] fArr5 = this.f37998z;
            if (i20 < 0) {
                fArr5[i13] = (-this.f37984k) + floor;
                fArr5[1] = -this.f37982i;
                fArr5[c11] = f24;
                fArr5[3] = f25;
                i10 = i13;
                c10 = c11;
            } else {
                float f28 = floor - f27;
                float f29 = this.f37988o;
                int i21 = (f28 > f29 ? 1 : (f28 == f29 ? 0 : -1));
                i10 = i13;
                float f30 = this.f37978c;
                if (i21 < 0) {
                    c10 = c11;
                    b(this.f37984k, -this.f37985l, (f28 / (f30 * this.f37983j)) - 1.5707964f, fArr5);
                } else {
                    c10 = c11;
                    float f31 = f28 - f29;
                    float f32 = this.f37987n;
                    if (f31 < f32) {
                        fArr5[i10] = this.h;
                        fArr5[1] = (-this.f37985l) + f31;
                        fArr5[c10] = f25;
                        fArr5[3] = f24;
                    } else {
                        float f33 = f31 - f32;
                        if (f33 < f29) {
                            b(this.f37984k, this.f37985l, f33 / (f30 * this.f37983j), fArr5);
                        } else {
                            float f34 = f33 - f29;
                            if (f34 < f27) {
                                fArr5[i10] = this.f37984k - f34;
                                fArr5[1] = this.f37982i;
                                fArr5[c10] = -1.0f;
                                fArr5[3] = f25;
                            } else {
                                float f35 = f34 - f27;
                                if (f35 < f29) {
                                    b(-this.f37984k, this.f37985l, (f35 / (f30 * this.f37983j)) + 1.5707964f, fArr5);
                                } else {
                                    float f36 = f35 - f29;
                                    if (f36 < f32) {
                                        fArr5[i10] = -this.h;
                                        fArr5[1] = this.f37985l - f36;
                                        fArr5[c10] = f25;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.f37984k, -this.f37985l, ((f36 - f32) / (f30 * this.f37983j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f37 = fArr5[3];
            float f38 = (fArr[i19] * B) + f15 + f12;
            rcVar.f37613q[i19] = (f37 * f38) + f10 + fArr5[i10];
            rcVar.f37614r[i19] = ((-fArr5[c10]) * f38) + f11 + fArr5[1];
            rcVar.f37615s[i19] = fArr5[c10];
            rcVar.f37616t[i19] = fArr5[3];
            i19++;
            c11 = c10;
            i13 = i10;
        }
        int i22 = i13;
        Path path = this.f37997y;
        path.rewind();
        path.moveTo(rcVar.f37613q[i22], rcVar.f37614r[i22]);
        int i23 = i22;
        while (i23 < i12) {
            int i24 = i23 + 1;
            if (i24 < i12) {
                i7 = i24;
            } else {
                i7 = i22;
            }
            float[] fArr6 = rcVar.f37613q;
            float f39 = fArr6[i7] - fArr6[i23];
            float[] fArr7 = rcVar.f37614r;
            float f40 = fArr7[i7] - fArr7[i23];
            float sqrt = ((float) Math.sqrt((f40 * f40) + (f39 * f39))) / 3.0f;
            float[] fArr8 = rcVar.f37613q;
            float f41 = fArr8[i23];
            float[] fArr9 = rcVar.f37615s;
            float f42 = (fArr9[i23] * sqrt) + f41;
            float[] fArr10 = rcVar.f37614r;
            float f43 = fArr10[i23];
            float[] fArr11 = rcVar.f37616t;
            float f44 = fArr8[i7];
            float f45 = fArr10[i7];
            path.cubicTo(f42, (fArr11[i23] * sqrt) + f43, f44 - (fArr9[i7] * sqrt), f45 - (fArr11[i7] * sqrt), f44, f45);
            i23 = i24;
        }
        path.close();
        canvas.drawPath(path, rcVar.f37605i);
    }

    public final float d() {
        rc rcVar = this.f37990q;
        float f10 = rcVar.d;
        float f11 = rcVar.f37603f;
        float f12 = this.f37979e;
        float f13 = (f11 * f12) + f10;
        float f14 = rcVar.f37602e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        rc rcVar2 = this.f37991r;
        float f17 = rcVar2.d;
        return Math.max(f16, (f15 * rcVar2.f37602e) + (f12 * rcVar2.f37603f) + f17);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f37994u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f37993t));
            }
            this.f37993t = elapsedRealtime;
            boolean e10 = org.telegram.messenger.sc.e(512);
            rc rcVar = this.f37991r;
            rc rcVar2 = this.f37990q;
            if (e10 && min > 0) {
                float f10 = this.f37995w;
                float f11 = this.v;
                if (f10 != f11) {
                    float f12 = this.f37996x;
                    float f13 = (((float) min) * f12) + f11;
                    this.v = f13;
                    if (f12 > 0.0f) {
                        if (f13 > f10) {
                            this.v = f10;
                        }
                    } else if (f13 < f10) {
                        this.v = f10;
                    }
                }
                this.f37992s = com.google.android.recaptcha.internal.a.c((float) min, this.f37980f, 6.2831855f, this.f37992s);
                rcVar2.d(this.v);
                rcVar.d(this.v);
            }
            float f14 = this.E;
            if (f14 < 1.0f && min > 0) {
                float f15 = (((float) min) / 250.0f) + f14;
                this.E = f15;
                if (f15 > 1.0f) {
                    this.E = 1.0f;
                }
                a(i0.a.f(this.E, this.C, this.D));
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f16 = 1.0f - (this.v * 0.7f);
            float f17 = rcVar2.f37603f;
            float f18 = this.f37979e;
            float B = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.f37992s), 0.5f, 0.5f, f17 * f18 * f16);
            float B2 = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.f37992s + rcVar.f37600b), 0.5f, 0.5f, f18 * rcVar.f37603f * f16);
            c(canvas, this.f37990q, exactCenterX, exactCenterY, B);
            c(canvas, this.f37991r, exactCenterX, exactCenterY, B2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void f(float f10) {
        float f11;
        this.f37995w = f10;
        if (!org.telegram.messenger.sc.e(512)) {
            return;
        }
        float f12 = this.f37995w - this.v;
        if (f12 > 0.0f) {
            f11 = 400.0f;
        } else {
            f11 = 500.0f;
        }
        this.f37996x = f12 / ((f11 * 0.55f) + 100.0f);
    }

    public final void g(int i7, boolean z9) {
        if (i7 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i7;
        int e10 = e(i7);
        if (z9 && this.B != 0 && org.telegram.messenger.sc.e(512)) {
            this.C = this.B;
            this.D = e10;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            a(e10);
        }
        invalidateSelf();
    }

    @Override
    public final int getAlpha() {
        return this.G;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    public final void h(boolean z9) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            g(2, z9);
            return;
        }
        org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
        if (r3Var != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f25222b.rtmp_stream) {
                sharedInstance.setMicMute(true, false, false);
                g(3, z9);
                return;
            }
            g(sharedInstance.isMicMute() ? 1 : 0, z9);
            return;
        }
        g(sharedInstance.isMicMute() ? 1 : 0, z9);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float d = d() + org.telegram.messenger.g0.L(1.0f);
            float min = (Math.min(bounds.width(), bounds.height()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
            if (d > min) {
                d = Math.max(0.0f, min);
            }
            this.h = (bounds.width() / 2.0f) - d;
            float height = (bounds.height() / 2.0f) - d;
            this.f37982i = height;
            float f10 = this.h;
            if (f10 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f37976a, Math.min(f10, height));
                this.f37983j = min2;
                float f11 = this.h - min2;
                this.f37984k = f11;
                float f12 = this.f37982i - min2;
                this.f37985l = f12;
                float f13 = f11 * 2.0f;
                this.f37986m = f13;
                float f14 = f12 * 2.0f;
                this.f37987n = f14;
                float f15 = this.f37978c * 1.5707964f * min2;
                this.f37988o = f15;
                float f16 = (f14 * 2.0f) + (f13 * 2.0f);
                this.f37989p = (f15 * 4.0f) + f16;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f16) / this.f37977b)));
                rc rcVar = this.f37990q;
                if (max != rcVar.f37619x) {
                    rcVar.c(max);
                    this.f37991r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.G != i7) {
            this.G = i7;
            rc rcVar = this.f37990q;
            rcVar.f37620y = i7;
            rcVar.a();
            rc rcVar2 = this.f37991r;
            rcVar2.f37620y = i7;
            rcVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37990q.f37605i.setColorFilter(colorFilter);
        this.f37991r.f37605i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
