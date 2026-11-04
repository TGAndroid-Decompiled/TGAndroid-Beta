package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class qc extends Drawable {
    public static final oc H = new oc(0);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f37425i;
    public float f37426j;
    public float f37427k;
    public float f37428l;
    public float f37429m;
    public float f37430n;
    public float f37431o;
    public float f37432p;
    public final pc f37433q;
    public final pc f37434r;
    public float f37435s;
    public long f37436t;
    public boolean f37437u;
    public float v;
    public float f37438w;
    public float f37439x;
    public final float f37419a = org.telegram.messenger.g0.L(18.0f);
    public final float f37420b = org.telegram.messenger.g0.L(22.0f);
    public final float f37421c = 2.4f;
    public final float d = org.telegram.messenger.g0.L(12.0f);
    public final float f37422e = org.telegram.messenger.g0.L(1.5f);
    public final float f37423f = 3600.0f;
    public final float f37424g = 0.25f;
    public final Path f37440y = new Path();
    public final float[] f37441z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final vf F = new vf(this, 16);
    public int G = 255;

    public qc() {
        pc pcVar = new pc();
        this.f37433q = pcVar;
        pcVar.f37114a = 1.0f;
        pcVar.f37115b = 0.0f;
        pcVar.f37116c = org.telegram.messenger.g0.L(0.5f);
        pcVar.d = org.telegram.messenger.g0.L(8.5f);
        pcVar.f37117e = 1.0f;
        pcVar.f37118f = 1.0f;
        pcVar.f37119g = 61;
        pc pcVar2 = new pc();
        this.f37434r = pcVar2;
        pcVar2.f37114a = 0.82f;
        pcVar2.f37115b = 0.6f;
        pcVar2.f37116c = org.telegram.messenger.g0.L(0.0f);
        pcVar2.d = org.telegram.messenger.g0.L(4.25f);
        pcVar2.f37117e = 0.55f;
        pcVar2.f37118f = 0.55f;
        pcVar2.f37119g = 128;
        g(0, false);
    }

    public static int e(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 3) {
                    return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ph, false);
                }
                return i0.a.f(0.5f, i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xh, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false));
            }
            return i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Nh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false));
        }
        return i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Mh, false));
    }

    public final void a(int i3) {
        this.B = i3;
        pc pcVar = this.f37433q;
        pcVar.h = i3;
        pc pcVar2 = this.f37434r;
        pcVar2.h = i3;
        pcVar.a();
        pcVar2.a();
    }

    public final void b(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = this.f37426j;
        fArr[0] = (f13 * cos) + f10;
        fArr[1] = (f13 * sin) + f11;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, pc pcVar, float f10, float f11, float f12) {
        int i3;
        int i10;
        char c2;
        int i11;
        int i12 = pcVar.f37134x;
        if (i12 == 0) {
            return;
        }
        float f13 = pcVar.f37116c;
        float f14 = this.v;
        float f15 = ((pcVar.d - f13) * f14) + f13;
        float f16 = 1.0f;
        float f17 = 0.0f;
        float A = com.google.android.recaptcha.internal.a.A(f14, 1.0f, 0.0f, this.d * pcVar.f37117e);
        float[] fArr = pcVar.f37132u;
        float[] fArr2 = pcVar.v;
        float[] fArr3 = pcVar.f37133w;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            float interpolation = H.getInterpolation(pcVar.f37126o[i14]);
            float f18 = 1.0f - interpolation;
            fArr[i14] = (pcVar.f37123l[i14] * interpolation) + (pcVar.f37122k[i14] * f18);
            fArr3[i14] = (pcVar.f37125n[i14] * interpolation) + (pcVar.f37124m[i14] * f18);
        }
        float f19 = this.f37424g;
        char c10 = 2;
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
                    fArr2[i16] = com.google.android.recaptcha.internal.a.y((fArr[i17] + fArr[i11]) * 0.5f, f22, f19, f22);
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
            float floor = (f26 - ((float) Math.floor(f26))) * this.f37432p;
            float f27 = this.f37429m;
            int i20 = (floor > f27 ? 1 : (floor == f27 ? 0 : -1));
            float[] fArr5 = this.f37441z;
            if (i20 < 0) {
                fArr5[i13] = (-this.f37427k) + floor;
                fArr5[1] = -this.f37425i;
                fArr5[c10] = f24;
                fArr5[3] = f25;
                i10 = i13;
                c2 = c10;
            } else {
                float f28 = floor - f27;
                float f29 = this.f37431o;
                int i21 = (f28 > f29 ? 1 : (f28 == f29 ? 0 : -1));
                i10 = i13;
                float f30 = this.f37421c;
                if (i21 < 0) {
                    c2 = c10;
                    b(this.f37427k, -this.f37428l, (f28 / (f30 * this.f37426j)) - 1.5707964f, fArr5);
                } else {
                    c2 = c10;
                    float f31 = f28 - f29;
                    float f32 = this.f37430n;
                    if (f31 < f32) {
                        fArr5[i10] = this.h;
                        fArr5[1] = (-this.f37428l) + f31;
                        fArr5[c2] = f25;
                        fArr5[3] = f24;
                    } else {
                        float f33 = f31 - f32;
                        if (f33 < f29) {
                            b(this.f37427k, this.f37428l, f33 / (f30 * this.f37426j), fArr5);
                        } else {
                            float f34 = f33 - f29;
                            if (f34 < f27) {
                                fArr5[i10] = this.f37427k - f34;
                                fArr5[1] = this.f37425i;
                                fArr5[c2] = -1.0f;
                                fArr5[3] = f25;
                            } else {
                                float f35 = f34 - f27;
                                if (f35 < f29) {
                                    b(-this.f37427k, this.f37428l, (f35 / (f30 * this.f37426j)) + 1.5707964f, fArr5);
                                } else {
                                    float f36 = f35 - f29;
                                    if (f36 < f32) {
                                        fArr5[i10] = -this.h;
                                        fArr5[1] = this.f37428l - f36;
                                        fArr5[c2] = f25;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.f37427k, -this.f37428l, ((f36 - f32) / (f30 * this.f37426j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f37 = fArr5[3];
            float f38 = (fArr[i19] * A) + f15 + f12;
            pcVar.f37128q[i19] = (f37 * f38) + f10 + fArr5[i10];
            pcVar.f37129r[i19] = ((-fArr5[c2]) * f38) + f11 + fArr5[1];
            pcVar.f37130s[i19] = fArr5[c2];
            pcVar.f37131t[i19] = fArr5[3];
            i19++;
            c10 = c2;
            i13 = i10;
        }
        int i22 = i13;
        Path path = this.f37440y;
        path.rewind();
        path.moveTo(pcVar.f37128q[i22], pcVar.f37129r[i22]);
        int i23 = i22;
        while (i23 < i12) {
            int i24 = i23 + 1;
            if (i24 < i12) {
                i3 = i24;
            } else {
                i3 = i22;
            }
            float[] fArr6 = pcVar.f37128q;
            float f39 = fArr6[i3] - fArr6[i23];
            float[] fArr7 = pcVar.f37129r;
            float f40 = fArr7[i3] - fArr7[i23];
            float sqrt = ((float) Math.sqrt((f40 * f40) + (f39 * f39))) / 3.0f;
            float[] fArr8 = pcVar.f37128q;
            float f41 = fArr8[i23];
            float[] fArr9 = pcVar.f37130s;
            float f42 = (fArr9[i23] * sqrt) + f41;
            float[] fArr10 = pcVar.f37129r;
            float f43 = fArr10[i23];
            float[] fArr11 = pcVar.f37131t;
            float f44 = fArr8[i3];
            float f45 = fArr10[i3];
            path.cubicTo(f42, (fArr11[i23] * sqrt) + f43, f44 - (fArr9[i3] * sqrt), f45 - (fArr11[i3] * sqrt), f44, f45);
            i23 = i24;
        }
        path.close();
        canvas.drawPath(path, pcVar.f37120i);
    }

    public final float d() {
        pc pcVar = this.f37433q;
        float f10 = pcVar.d;
        float f11 = pcVar.f37118f;
        float f12 = this.f37422e;
        float f13 = (f11 * f12) + f10;
        float f14 = pcVar.f37117e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        pc pcVar2 = this.f37434r;
        float f17 = pcVar2.d;
        return Math.max(f16, (f15 * pcVar2.f37117e) + (f12 * pcVar2.f37118f) + f17);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f37437u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f37436t));
            }
            this.f37436t = elapsedRealtime;
            boolean e10 = org.telegram.messenger.lc.e(512);
            pc pcVar = this.f37434r;
            pc pcVar2 = this.f37433q;
            if (e10 && min > 0) {
                float f10 = this.f37438w;
                float f11 = this.v;
                if (f10 != f11) {
                    float f12 = this.f37439x;
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
                this.f37435s = a1.g.A((float) min, this.f37423f, 6.2831855f, this.f37435s);
                pcVar2.d(this.v);
                pcVar.d(this.v);
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
            float f17 = pcVar2.f37118f;
            float f18 = this.f37422e;
            float A = com.google.android.recaptcha.internal.a.A((float) Math.sin(this.f37435s), 0.5f, 0.5f, f17 * f18 * f16);
            float A2 = com.google.android.recaptcha.internal.a.A((float) Math.sin(this.f37435s + pcVar.f37115b), 0.5f, 0.5f, f18 * pcVar.f37118f * f16);
            c(canvas, this.f37433q, exactCenterX, exactCenterY, A);
            c(canvas, this.f37434r, exactCenterX, exactCenterY, A2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void f(float f10) {
        float f11;
        this.f37438w = f10;
        if (!org.telegram.messenger.lc.e(512)) {
            return;
        }
        float f12 = this.f37438w - this.v;
        if (f12 > 0.0f) {
            f11 = 400.0f;
        } else {
            f11 = 500.0f;
        }
        this.f37439x = f12 / ((f11 * 0.55f) + 100.0f);
    }

    public final void g(int i3, boolean z10) {
        if (i3 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i3;
        int e10 = e(i3);
        if (z10 && this.B != 0 && org.telegram.messenger.lc.e(512)) {
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
        org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
        if (r3Var != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.t3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f25049b.rtmp_stream) {
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
            float d = d() + org.telegram.messenger.g0.L(1.0f);
            float min = (Math.min(bounds.width(), bounds.height()) / 2.0f) - org.telegram.messenger.g0.L(2.0f);
            if (d > min) {
                d = Math.max(0.0f, min);
            }
            this.h = (bounds.width() / 2.0f) - d;
            float height = (bounds.height() / 2.0f) - d;
            this.f37425i = height;
            float f10 = this.h;
            if (f10 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f37419a, Math.min(f10, height));
                this.f37426j = min2;
                float f11 = this.h - min2;
                this.f37427k = f11;
                float f12 = this.f37425i - min2;
                this.f37428l = f12;
                float f13 = f11 * 2.0f;
                this.f37429m = f13;
                float f14 = f12 * 2.0f;
                this.f37430n = f14;
                float f15 = this.f37421c * 1.5707964f * min2;
                this.f37431o = f15;
                float f16 = (f14 * 2.0f) + (f13 * 2.0f);
                this.f37432p = (f15 * 4.0f) + f16;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f16) / this.f37420b)));
                pc pcVar = this.f37433q;
                if (max != pcVar.f37134x) {
                    pcVar.c(max);
                    this.f37434r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i3) {
        if (this.G != i3) {
            this.G = i3;
            pc pcVar = this.f37433q;
            pcVar.f37135y = i3;
            pcVar.a();
            pc pcVar2 = this.f37434r;
            pcVar2.f37135y = i3;
            pcVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37433q.f37120i.setColorFilter(colorFilter);
        this.f37434r.f37120i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
