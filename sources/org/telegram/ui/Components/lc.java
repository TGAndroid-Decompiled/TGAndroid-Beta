package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class lc extends Drawable {
    public static final nh.a H = new nh.a(1);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f28115i;
    public float f28116j;
    public float f28117k;
    public float f28118l;
    public float f28119m;
    public float f28120n;
    public float f28121o;
    public float f28122p;
    public final kc f28123q;
    public final kc f28124r;
    public float f28125s;
    public long f28126t;
    public boolean f28127u;
    public float v;
    public float f28128w;
    public float f28129x;
    public final float f28110a = org.telegram.messenger.i0.L(18.0f);
    public final float f28111b = org.telegram.messenger.i0.L(22.0f);
    public final float f28112c = 2.4f;
    public final float d = org.telegram.messenger.i0.L(12.0f);
    public final float e = org.telegram.messenger.i0.L(1.5f);
    public final float f28113f = 3600.0f;
    public final float f28114g = 0.25f;
    public final Path f28130y = new Path();
    public final float[] f28131z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final tf F = new tf(this, 17);
    public int G = 255;

    public lc() {
        kc kcVar = new kc();
        this.f28123q = kcVar;
        kcVar.f27801a = 1.0f;
        kcVar.f27802b = 0.0f;
        kcVar.f27803c = org.telegram.messenger.i0.L(0.5f);
        kcVar.d = org.telegram.messenger.i0.L(8.5f);
        kcVar.e = 1.0f;
        kcVar.f27804f = 1.0f;
        kcVar.f27805g = 61;
        kc kcVar2 = new kc();
        this.f28124r = kcVar2;
        kcVar2.f27801a = 0.82f;
        kcVar2.f27802b = 0.6f;
        kcVar2.f27803c = org.telegram.messenger.i0.L(0.0f);
        kcVar2.d = org.telegram.messenger.i0.L(4.25f);
        kcVar2.e = 0.55f;
        kcVar2.f27804f = 0.55f;
        kcVar2.f27805g = 128;
        g(0, false);
    }

    public static int e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ph, false);
                }
                return i0.b.f(0.5f, i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xh, false)), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yh, false));
            }
            return i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Nh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Oh, false));
        }
        return i0.b.f(0.5f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Lh, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Mh, false));
    }

    public final void a(int i10) {
        this.B = i10;
        kc kcVar = this.f28123q;
        kcVar.h = i10;
        kc kcVar2 = this.f28124r;
        kcVar2.h = i10;
        kcVar.a();
        kcVar2.a();
    }

    public final void b(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.f28116j;
        fArr[0] = (f12 * cos) + f7;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, kc kcVar, float f7, float f10, float f11) {
        int i10;
        int i11;
        char c10;
        int i12;
        int i13 = kcVar.f27820x;
        if (i13 == 0) {
            return;
        }
        float f12 = kcVar.f27803c;
        float f13 = this.v;
        float f14 = ((kcVar.d - f12) * f13) + f12;
        float f15 = 1.0f;
        float f16 = 0.0f;
        float C = c3.i0.C(f13, 1.0f, 0.0f, this.d * kcVar.e);
        float[] fArr = kcVar.f27818u;
        float[] fArr2 = kcVar.v;
        float[] fArr3 = kcVar.f27819w;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            float interpolation = H.getInterpolation(kcVar.f27812o[i15]);
            float f17 = 1.0f - interpolation;
            fArr[i15] = (kcVar.f27809l[i15] * interpolation) + (kcVar.f27808k[i15] * f17);
            fArr3[i15] = (kcVar.f27811n[i15] * interpolation) + (kcVar.f27810m[i15] * f17);
        }
        float f18 = this.f28114g;
        char c11 = 2;
        if (f18 > 0.0f) {
            int i16 = 0;
            while (i16 < 2) {
                int i17 = 0;
                while (i17 < i13) {
                    int i18 = i17 == 0 ? i13 - 1 : i17 - 1;
                    float f19 = f15;
                    int i19 = i17 + 1;
                    if (i19 == i13) {
                        i12 = 0;
                    } else {
                        i12 = i19;
                    }
                    float f20 = f16;
                    float f21 = fArr[i17];
                    fArr2[i17] = c3.i0.z((fArr[i18] + fArr[i12]) * 0.5f, f21, f18, f21);
                    i17 = i19;
                    f15 = f19;
                    f16 = f20;
                }
                float f22 = f15;
                i16++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
                f15 = f22;
            }
        }
        float f23 = f15;
        float f24 = f16;
        int i20 = 0;
        while (i20 < i13) {
            float f25 = (i20 / i13) + fArr3[i20];
            float floor = (f25 - ((float) Math.floor(f25))) * this.f28122p;
            float f26 = this.f28119m;
            int i21 = (floor > f26 ? 1 : (floor == f26 ? 0 : -1));
            float[] fArr5 = this.f28131z;
            if (i21 < 0) {
                fArr5[i14] = (-this.f28117k) + floor;
                fArr5[1] = -this.f28115i;
                fArr5[c11] = f23;
                fArr5[3] = f24;
                i11 = i14;
                c10 = c11;
            } else {
                float f27 = floor - f26;
                float f28 = this.f28121o;
                int i22 = (f27 > f28 ? 1 : (f27 == f28 ? 0 : -1));
                i11 = i14;
                float f29 = this.f28112c;
                if (i22 < 0) {
                    c10 = c11;
                    b(this.f28117k, -this.f28118l, (f27 / (f29 * this.f28116j)) - 1.5707964f, fArr5);
                } else {
                    c10 = c11;
                    float f30 = f27 - f28;
                    float f31 = this.f28120n;
                    if (f30 < f31) {
                        fArr5[i11] = this.h;
                        fArr5[1] = (-this.f28118l) + f30;
                        fArr5[c10] = f24;
                        fArr5[3] = f23;
                    } else {
                        float f32 = f30 - f31;
                        if (f32 < f28) {
                            b(this.f28117k, this.f28118l, f32 / (f29 * this.f28116j), fArr5);
                        } else {
                            float f33 = f32 - f28;
                            if (f33 < f26) {
                                fArr5[i11] = this.f28117k - f33;
                                fArr5[1] = this.f28115i;
                                fArr5[c10] = -1.0f;
                                fArr5[3] = f24;
                            } else {
                                float f34 = f33 - f26;
                                if (f34 < f28) {
                                    b(-this.f28117k, this.f28118l, (f34 / (f29 * this.f28116j)) + 1.5707964f, fArr5);
                                } else {
                                    float f35 = f34 - f28;
                                    if (f35 < f31) {
                                        fArr5[i11] = -this.h;
                                        fArr5[1] = this.f28118l - f35;
                                        fArr5[c10] = f24;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.f28117k, -this.f28118l, ((f35 - f31) / (f29 * this.f28116j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f36 = fArr5[3];
            float f37 = (fArr[i20] * C) + f14 + f11;
            kcVar.f27814q[i20] = (f36 * f37) + f7 + fArr5[i11];
            kcVar.f27815r[i20] = ((-fArr5[c10]) * f37) + f10 + fArr5[1];
            kcVar.f27816s[i20] = fArr5[c10];
            kcVar.f27817t[i20] = fArr5[3];
            i20++;
            c11 = c10;
            i14 = i11;
        }
        int i23 = i14;
        Path path = this.f28130y;
        path.rewind();
        path.moveTo(kcVar.f27814q[i23], kcVar.f27815r[i23]);
        int i24 = i23;
        while (i24 < i13) {
            int i25 = i24 + 1;
            if (i25 < i13) {
                i10 = i25;
            } else {
                i10 = i23;
            }
            float[] fArr6 = kcVar.f27814q;
            float f38 = fArr6[i10] - fArr6[i24];
            float[] fArr7 = kcVar.f27815r;
            float f39 = fArr7[i10] - fArr7[i24];
            float sqrt = ((float) Math.sqrt((f39 * f39) + (f38 * f38))) / 3.0f;
            float[] fArr8 = kcVar.f27814q;
            float f40 = fArr8[i24];
            float[] fArr9 = kcVar.f27816s;
            float f41 = (fArr9[i24] * sqrt) + f40;
            float[] fArr10 = kcVar.f27815r;
            float f42 = fArr10[i24];
            float[] fArr11 = kcVar.f27817t;
            float f43 = fArr8[i10];
            float f44 = fArr10[i10];
            path.cubicTo(f41, (fArr11[i24] * sqrt) + f42, f43 - (fArr9[i10] * sqrt), f44 - (fArr11[i10] * sqrt), f43, f44);
            i24 = i25;
        }
        path.close();
        canvas.drawPath(path, kcVar.f27806i);
    }

    public final float d() {
        kc kcVar = this.f28123q;
        float f7 = kcVar.d;
        float f10 = kcVar.f27804f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f7;
        float f13 = kcVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        kc kcVar2 = this.f28124r;
        float f16 = kcVar2.d;
        return Math.max(f15, (f14 * kcVar2.e) + (f11 * kcVar2.f27804f) + f16);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f28127u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f28126t));
            }
            this.f28126t = elapsedRealtime;
            boolean e = org.telegram.messenger.tc.e(512);
            kc kcVar = this.f28124r;
            kc kcVar2 = this.f28123q;
            if (e && min > 0) {
                float f7 = this.f28128w;
                float f10 = this.v;
                if (f7 != f10) {
                    float f11 = this.f28129x;
                    float f12 = (((float) min) * f11) + f10;
                    this.v = f12;
                    if (f11 > 0.0f) {
                        if (f12 > f7) {
                            this.v = f7;
                        }
                    } else if (f12 < f7) {
                        this.v = f7;
                    }
                }
                this.f28125s = a1.g.c((float) min, this.f28113f, 6.2831855f, this.f28125s);
                kcVar2.d(this.v);
                kcVar.d(this.v);
            }
            float f13 = this.E;
            if (f13 < 1.0f && min > 0) {
                float f14 = (((float) min) / 250.0f) + f13;
                this.E = f14;
                if (f14 > 1.0f) {
                    this.E = 1.0f;
                }
                a(i0.b.f(this.E, this.C, this.D));
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f15 = 1.0f - (this.v * 0.7f);
            float f16 = kcVar2.f27804f;
            float f17 = this.e;
            float C = c3.i0.C((float) Math.sin(this.f28125s), 0.5f, 0.5f, f16 * f17 * f15);
            float C2 = c3.i0.C((float) Math.sin(this.f28125s + kcVar.f27802b), 0.5f, 0.5f, f17 * kcVar.f27804f * f15);
            c(canvas, this.f28123q, exactCenterX, exactCenterY, C);
            c(canvas, this.f28124r, exactCenterX, exactCenterY, C2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void f(float f7) {
        float f10;
        this.f28128w = f7;
        if (!org.telegram.messenger.tc.e(512)) {
            return;
        }
        float f11 = this.f28128w - this.v;
        if (f11 > 0.0f) {
            f10 = 400.0f;
        } else {
            f10 = 500.0f;
        }
        this.f28129x = f11 / ((f10 * 0.55f) + 100.0f);
    }

    public final void g(int i10, boolean z10) {
        if (i10 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i10;
        int e = e(i10);
        if (z10 && this.B != 0 && org.telegram.messenger.tc.e(512)) {
            this.C = this.B;
            this.D = e;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            a(e);
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

    public final void h(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            g(2, z10);
            return;
        }
        org.telegram.messenger.u3 u3Var = sharedInstance.groupCall;
        if (u3Var != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) u3Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.w3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f18361b.rtmp_stream) {
                sharedInstance.setMicMute(true, false, false);
                g(3, z10);
                return;
            }
            g(sharedInstance.isMicMute() ? 1 : 0, z10);
            return;
        }
        g(sharedInstance.isMicMute() ? 1 : 0, z10);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float d = d() + org.telegram.messenger.i0.L(1.0f);
            float min = (Math.min(bounds.width(), bounds.height()) / 2.0f) - org.telegram.messenger.i0.L(2.0f);
            if (d > min) {
                d = Math.max(0.0f, min);
            }
            this.h = (bounds.width() / 2.0f) - d;
            float height = (bounds.height() / 2.0f) - d;
            this.f28115i = height;
            float f7 = this.h;
            if (f7 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f28110a, Math.min(f7, height));
                this.f28116j = min2;
                float f10 = this.h - min2;
                this.f28117k = f10;
                float f11 = this.f28115i - min2;
                this.f28118l = f11;
                float f12 = f10 * 2.0f;
                this.f28119m = f12;
                float f13 = f11 * 2.0f;
                this.f28120n = f13;
                float f14 = this.f28112c * 1.5707964f * min2;
                this.f28121o = f14;
                float f15 = (f13 * 2.0f) + (f12 * 2.0f);
                this.f28122p = (f14 * 4.0f) + f15;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f15) / this.f28111b)));
                kc kcVar = this.f28123q;
                if (max != kcVar.f27820x) {
                    kcVar.c(max);
                    this.f28124r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            kc kcVar = this.f28123q;
            kcVar.f27821y = i10;
            kcVar.a();
            kc kcVar2 = this.f28124r;
            kcVar2.f27821y = i10;
            kcVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28123q.f27806i.setColorFilter(colorFilter);
        this.f28124r.f27806i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
