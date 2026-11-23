package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class wc extends Drawable {
    public static final uc H = new uc(0);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f41580i;
    public float f41581j;
    public float f41582k;
    public float f41583l;
    public float f41584m;
    public float f41585n;
    public float f41586o;
    public float f41587p;
    public final vc f41588q;
    public final vc f41589r;
    public float f41590s;
    public long f41591t;
    public boolean f41592u;
    public float v;
    public float f41593w;
    public float f41594x;
    public final float f41574a = org.telegram.messenger.g0.L(18.0f);
    public final float f41575b = org.telegram.messenger.g0.L(22.0f);
    public final float f41576c = 2.4f;
    public final float d = org.telegram.messenger.g0.L(12.0f);
    public final float f41577e = org.telegram.messenger.g0.L(1.5f);
    public final float f41578f = 3600.0f;
    public final float f41579g = 0.25f;
    public final Path f41595y = new Path();
    public final float[] f41596z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final ng F = new ng(this, 16);
    public int G = 255;

    public wc() {
        vc vcVar = new vc();
        this.f41588q = vcVar;
        vcVar.f40633a = 1.0f;
        vcVar.f40634b = 0.0f;
        vcVar.f40635c = org.telegram.messenger.g0.L(0.5f);
        vcVar.d = org.telegram.messenger.g0.L(8.5f);
        vcVar.f40636e = 1.0f;
        vcVar.f40637f = 1.0f;
        vcVar.f40638g = 61;
        vc vcVar2 = new vc();
        this.f41589r = vcVar2;
        vcVar2.f40633a = 0.82f;
        vcVar2.f40634b = 0.6f;
        vcVar2.f40635c = org.telegram.messenger.g0.L(0.0f);
        vcVar2.d = org.telegram.messenger.g0.L(4.25f);
        vcVar2.f40636e = 0.55f;
        vcVar2.f40637f = 0.55f;
        vcVar2.f40638g = 128;
        g(0, false);
    }

    public static int e(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 3) {
                    return org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Sh, false);
                }
                return i0.a.f(0.5f, i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29405ai, false)), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29425bi, false));
            }
            return i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Qh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Rh, false));
        }
        return i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Oh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ph, false));
    }

    public final void a(int i7) {
        this.B = i7;
        vc vcVar = this.f41588q;
        vcVar.h = i7;
        vc vcVar2 = this.f41589r;
        vcVar2.h = i7;
        vcVar.a();
        vcVar2.a();
    }

    public final void b(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = this.f41581j;
        fArr[0] = (f13 * cos) + f10;
        fArr[1] = (f13 * sin) + f11;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, vc vcVar, float f10, float f11, float f12) {
        int i7;
        int i10;
        char c10;
        int i11;
        int i12 = vcVar.f40653x;
        if (i12 == 0) {
            return;
        }
        float f13 = vcVar.f40635c;
        float f14 = this.v;
        float f15 = ((vcVar.d - f13) * f14) + f13;
        float f16 = 1.0f;
        float f17 = 0.0f;
        float B = com.google.android.gms.internal.vision.e2.B(f14, 1.0f, 0.0f, this.d * vcVar.f40636e);
        float[] fArr = vcVar.f40651u;
        float[] fArr2 = vcVar.v;
        float[] fArr3 = vcVar.f40652w;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            float interpolation = H.getInterpolation(vcVar.f40645o[i14]);
            float f18 = 1.0f - interpolation;
            fArr[i14] = (vcVar.f40642l[i14] * interpolation) + (vcVar.f40641k[i14] * f18);
            fArr3[i14] = (vcVar.f40644n[i14] * interpolation) + (vcVar.f40643m[i14] * f18);
        }
        float f19 = this.f41579g;
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
                    fArr2[i16] = com.google.android.gms.internal.vision.e2.z((fArr[i17] + fArr[i11]) * 0.5f, f22, f19, f22);
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
            float floor = (f26 - ((float) Math.floor(f26))) * this.f41587p;
            float f27 = this.f41584m;
            int i20 = (floor > f27 ? 1 : (floor == f27 ? 0 : -1));
            float[] fArr5 = this.f41596z;
            if (i20 < 0) {
                fArr5[i13] = (-this.f41582k) + floor;
                fArr5[1] = -this.f41580i;
                fArr5[c11] = f24;
                fArr5[3] = f25;
                i10 = i13;
                c10 = c11;
            } else {
                float f28 = floor - f27;
                float f29 = this.f41586o;
                int i21 = (f28 > f29 ? 1 : (f28 == f29 ? 0 : -1));
                i10 = i13;
                float f30 = this.f41576c;
                if (i21 < 0) {
                    c10 = c11;
                    b(this.f41582k, -this.f41583l, (f28 / (f30 * this.f41581j)) - 1.5707964f, fArr5);
                } else {
                    c10 = c11;
                    float f31 = f28 - f29;
                    float f32 = this.f41585n;
                    if (f31 < f32) {
                        fArr5[i10] = this.h;
                        fArr5[1] = (-this.f41583l) + f31;
                        fArr5[c10] = f25;
                        fArr5[3] = f24;
                    } else {
                        float f33 = f31 - f32;
                        if (f33 < f29) {
                            b(this.f41582k, this.f41583l, f33 / (f30 * this.f41581j), fArr5);
                        } else {
                            float f34 = f33 - f29;
                            if (f34 < f27) {
                                fArr5[i10] = this.f41582k - f34;
                                fArr5[1] = this.f41580i;
                                fArr5[c10] = -1.0f;
                                fArr5[3] = f25;
                            } else {
                                float f35 = f34 - f27;
                                if (f35 < f29) {
                                    b(-this.f41582k, this.f41583l, (f35 / (f30 * this.f41581j)) + 1.5707964f, fArr5);
                                } else {
                                    float f36 = f35 - f29;
                                    if (f36 < f32) {
                                        fArr5[i10] = -this.h;
                                        fArr5[1] = this.f41583l - f36;
                                        fArr5[c10] = f25;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.f41582k, -this.f41583l, ((f36 - f32) / (f30 * this.f41581j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f37 = fArr5[3];
            float f38 = (fArr[i19] * B) + f15 + f12;
            vcVar.f40647q[i19] = (f37 * f38) + f10 + fArr5[i10];
            vcVar.f40648r[i19] = ((-fArr5[c10]) * f38) + f11 + fArr5[1];
            vcVar.f40649s[i19] = fArr5[c10];
            vcVar.f40650t[i19] = fArr5[3];
            i19++;
            c11 = c10;
            i13 = i10;
        }
        int i22 = i13;
        Path path = this.f41595y;
        path.rewind();
        path.moveTo(vcVar.f40647q[i22], vcVar.f40648r[i22]);
        int i23 = i22;
        while (i23 < i12) {
            int i24 = i23 + 1;
            if (i24 < i12) {
                i7 = i24;
            } else {
                i7 = i22;
            }
            float[] fArr6 = vcVar.f40647q;
            float f39 = fArr6[i7] - fArr6[i23];
            float[] fArr7 = vcVar.f40648r;
            float f40 = fArr7[i7] - fArr7[i23];
            float sqrt = ((float) Math.sqrt((f40 * f40) + (f39 * f39))) / 3.0f;
            float[] fArr8 = vcVar.f40647q;
            float f41 = fArr8[i23];
            float[] fArr9 = vcVar.f40649s;
            float f42 = (fArr9[i23] * sqrt) + f41;
            float[] fArr10 = vcVar.f40648r;
            float f43 = fArr10[i23];
            float[] fArr11 = vcVar.f40650t;
            float f44 = fArr8[i7];
            float f45 = fArr10[i7];
            path.cubicTo(f42, (fArr11[i23] * sqrt) + f43, f44 - (fArr9[i7] * sqrt), f45 - (fArr11[i7] * sqrt), f44, f45);
            i23 = i24;
        }
        path.close();
        canvas.drawPath(path, vcVar.f40639i);
    }

    public final float d() {
        vc vcVar = this.f41588q;
        float f10 = vcVar.d;
        float f11 = vcVar.f40637f;
        float f12 = this.f41577e;
        float f13 = (f11 * f12) + f10;
        float f14 = vcVar.f40636e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        vc vcVar2 = this.f41589r;
        float f17 = vcVar2.d;
        return Math.max(f16, (f15 * vcVar2.f40636e) + (f12 * vcVar2.f40637f) + f17);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f41592u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f41591t));
            }
            this.f41591t = elapsedRealtime;
            boolean e10 = org.telegram.messenger.pc.e(512);
            vc vcVar = this.f41589r;
            vc vcVar2 = this.f41588q;
            if (e10 && min > 0) {
                float f10 = this.f41593w;
                float f11 = this.v;
                if (f10 != f11) {
                    float f12 = this.f41594x;
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
                this.f41590s = com.google.android.gms.internal.vision.e2.c((float) min, this.f41578f, 6.2831855f, this.f41590s);
                vcVar2.d(this.v);
                vcVar.d(this.v);
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
            float f17 = vcVar2.f40637f;
            float f18 = this.f41577e;
            float B = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.f41590s), 0.5f, 0.5f, f17 * f18 * f16);
            float B2 = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.f41590s + vcVar.f40634b), 0.5f, 0.5f, f18 * vcVar.f40637f * f16);
            c(canvas, this.f41588q, exactCenterX, exactCenterY, B);
            c(canvas, this.f41589r, exactCenterX, exactCenterY, B2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void f(float f10) {
        float f11;
        this.f41593w = f10;
        if (!org.telegram.messenger.pc.e(512)) {
            return;
        }
        float f12 = this.f41593w - this.v;
        if (f12 > 0.0f) {
            f11 = 400.0f;
        } else {
            f11 = 500.0f;
        }
        this.f41594x = f12 / ((f11 * 0.55f) + 100.0f);
    }

    public final void g(int i7, boolean z10) {
        if (i7 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i7;
        int e10 = e(i7);
        if (z10 && this.B != 0 && org.telegram.messenger.pc.e(512)) {
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
        org.telegram.messenger.t3 t3Var = sharedInstance.groupCall;
        if (t3Var != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) t3Var.d.f(sharedInstance.getSelfId());
            if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !org.telegram.messenger.v3.w(14, sharedInstance.getChat())) || sharedInstance.groupCall.f27034b.rtmp_stream) {
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
            this.f41580i = height;
            float f10 = this.h;
            if (f10 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f41574a, Math.min(f10, height));
                this.f41581j = min2;
                float f11 = this.h - min2;
                this.f41582k = f11;
                float f12 = this.f41580i - min2;
                this.f41583l = f12;
                float f13 = f11 * 2.0f;
                this.f41584m = f13;
                float f14 = f12 * 2.0f;
                this.f41585n = f14;
                float f15 = this.f41576c * 1.5707964f * min2;
                this.f41586o = f15;
                float f16 = (f14 * 2.0f) + (f13 * 2.0f);
                this.f41587p = (f15 * 4.0f) + f16;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f16) / this.f41575b)));
                vc vcVar = this.f41588q;
                if (max != vcVar.f40653x) {
                    vcVar.c(max);
                    this.f41589r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        if (this.G != i7) {
            this.G = i7;
            vc vcVar = this.f41588q;
            vcVar.f40654y = i7;
            vcVar.a();
            vc vcVar2 = this.f41589r;
            vcVar2.f40654y = i7;
            vcVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f41588q.f40639i.setColorFilter(colorFilter);
        this.f41589r.f40639i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
