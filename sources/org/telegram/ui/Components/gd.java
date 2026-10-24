package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
public final class gd extends Drawable {
    public static final ed H = new ed(0);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f26625i;
    public float f26626j;
    public float f26627k;
    public float f26628l;
    public float f26629m;
    public float f26630n;
    public float f26631o;
    public float f26632p;
    public final fd f26633q;
    public final fd f26634r;
    public float f26635s;
    public long f26636t;
    public boolean f26637u;
    public float v;
    public float f26638w;
    public float f26639x;
    public final float f26620a = AndroidUtilities.dp(18.0f);
    public final float f26621b = AndroidUtilities.dp(22.0f);
    public final float f26622c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float e = AndroidUtilities.dp(1.5f);
    public final float f26623f = 3600.0f;
    public final float f26624g = 0.25f;
    public final Path f26640y = new Path();
    public final float[] f26641z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final ng F = new ng(this, 17);
    public int G = 255;

    public gd() {
        fd fdVar = new fd();
        this.f26633q = fdVar;
        fdVar.f26288a = 1.0f;
        fdVar.f26289b = 0.0f;
        fdVar.f26290c = AndroidUtilities.dp(0.5f);
        fdVar.d = AndroidUtilities.dp(8.5f);
        fdVar.e = 1.0f;
        fdVar.f26291f = 1.0f;
        fdVar.f26292g = 61;
        fd fdVar2 = new fd();
        this.f26634r = fdVar2;
        fdVar2.f26288a = 0.82f;
        fdVar2.f26289b = 0.6f;
        fdVar2.f26290c = AndroidUtilities.dp(0.0f);
        fdVar2.d = AndroidUtilities.dp(4.25f);
        fdVar2.e = 0.55f;
        fdVar2.f26291f = 0.55f;
        fdVar2.f26292g = 128;
        g(0, false);
    }

    public static int e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21156bh, false);
                }
                return i0.a.f(0.5f, i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21282ih, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21302jh, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21321kh, false));
            }
            return i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21136ah, false));
        }
        return i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false));
    }

    public final void a(int i10) {
        this.B = i10;
        fd fdVar = this.f26633q;
        fdVar.h = i10;
        fd fdVar2 = this.f26634r;
        fdVar2.h = i10;
        fdVar.a();
        fdVar2.a();
    }

    public final void b(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.f26626j;
        fArr[0] = (f12 * cos) + f7;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void c(Canvas canvas, fd fdVar, float f7, float f10, float f11) {
        int i10;
        int i11;
        char c10;
        int i12;
        int i13 = fdVar.f26307x;
        if (i13 == 0) {
            return;
        }
        float f12 = fdVar.f26290c;
        float f13 = this.v;
        float f14 = ((fdVar.d - f12) * f13) + f12;
        float f15 = 1.0f;
        float f16 = 0.0f;
        float A = com.google.android.gms.internal.play_billing.k3.A(f13, 1.0f, 0.0f, this.d * fdVar.e);
        float[] fArr = fdVar.f26305u;
        float[] fArr2 = fdVar.v;
        float[] fArr3 = fdVar.f26306w;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            float interpolation = H.getInterpolation(fdVar.f26299o[i15]);
            float f17 = 1.0f - interpolation;
            fArr[i15] = (fdVar.f26296l[i15] * interpolation) + (fdVar.f26295k[i15] * f17);
            fArr3[i15] = (fdVar.f26298n[i15] * interpolation) + (fdVar.f26297m[i15] * f17);
        }
        float f18 = this.f26624g;
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
                    fArr2[i17] = com.google.android.gms.internal.play_billing.k3.y((fArr[i18] + fArr[i12]) * 0.5f, f21, f18, f21);
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
            float floor = (f25 - ((float) Math.floor(f25))) * this.f26632p;
            float f26 = this.f26629m;
            int i21 = (floor > f26 ? 1 : (floor == f26 ? 0 : -1));
            float[] fArr5 = this.f26641z;
            if (i21 < 0) {
                fArr5[i14] = (-this.f26627k) + floor;
                fArr5[1] = -this.f26625i;
                fArr5[c11] = f23;
                fArr5[3] = f24;
                i11 = i14;
                c10 = c11;
            } else {
                float f27 = floor - f26;
                float f28 = this.f26631o;
                int i22 = (f27 > f28 ? 1 : (f27 == f28 ? 0 : -1));
                i11 = i14;
                float f29 = this.f26622c;
                if (i22 < 0) {
                    c10 = c11;
                    b(this.f26627k, -this.f26628l, (f27 / (f29 * this.f26626j)) - 1.5707964f, fArr5);
                } else {
                    c10 = c11;
                    float f30 = f27 - f28;
                    float f31 = this.f26630n;
                    if (f30 < f31) {
                        fArr5[i11] = this.h;
                        fArr5[1] = (-this.f26628l) + f30;
                        fArr5[c10] = f24;
                        fArr5[3] = f23;
                    } else {
                        float f32 = f30 - f31;
                        if (f32 < f28) {
                            b(this.f26627k, this.f26628l, f32 / (f29 * this.f26626j), fArr5);
                        } else {
                            float f33 = f32 - f28;
                            if (f33 < f26) {
                                fArr5[i11] = this.f26627k - f33;
                                fArr5[1] = this.f26625i;
                                fArr5[c10] = -1.0f;
                                fArr5[3] = f24;
                            } else {
                                float f34 = f33 - f26;
                                if (f34 < f28) {
                                    b(-this.f26627k, this.f26628l, (f34 / (f29 * this.f26626j)) + 1.5707964f, fArr5);
                                } else {
                                    float f35 = f34 - f28;
                                    if (f35 < f31) {
                                        fArr5[i11] = -this.h;
                                        fArr5[1] = this.f26628l - f35;
                                        fArr5[c10] = f24;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        b(-this.f26627k, -this.f26628l, ((f35 - f31) / (f29 * this.f26626j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f36 = fArr5[3];
            float f37 = (fArr[i20] * A) + f14 + f11;
            fdVar.f26301q[i20] = (f36 * f37) + f7 + fArr5[i11];
            fdVar.f26302r[i20] = ((-fArr5[c10]) * f37) + f10 + fArr5[1];
            fdVar.f26303s[i20] = fArr5[c10];
            fdVar.f26304t[i20] = fArr5[3];
            i20++;
            c11 = c10;
            i14 = i11;
        }
        int i23 = i14;
        Path path = this.f26640y;
        path.rewind();
        path.moveTo(fdVar.f26301q[i23], fdVar.f26302r[i23]);
        int i24 = i23;
        while (i24 < i13) {
            int i25 = i24 + 1;
            if (i25 < i13) {
                i10 = i25;
            } else {
                i10 = i23;
            }
            float[] fArr6 = fdVar.f26301q;
            float f38 = fArr6[i10] - fArr6[i24];
            float[] fArr7 = fdVar.f26302r;
            float f39 = fArr7[i10] - fArr7[i24];
            float sqrt = ((float) Math.sqrt((f39 * f39) + (f38 * f38))) / 3.0f;
            float[] fArr8 = fdVar.f26301q;
            float f40 = fArr8[i24];
            float[] fArr9 = fdVar.f26303s;
            float f41 = (fArr9[i24] * sqrt) + f40;
            float[] fArr10 = fdVar.f26302r;
            float f42 = fArr10[i24];
            float[] fArr11 = fdVar.f26304t;
            float f43 = fArr8[i10];
            float f44 = fArr10[i10];
            path.cubicTo(f41, (fArr11[i24] * sqrt) + f42, f43 - (fArr9[i10] * sqrt), f44 - (fArr11[i10] * sqrt), f43, f44);
            i24 = i25;
        }
        path.close();
        canvas.drawPath(path, fdVar.f26293i);
    }

    public final float d() {
        fd fdVar = this.f26633q;
        float f7 = fdVar.d;
        float f10 = fdVar.f26291f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f7;
        float f13 = fdVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        fd fdVar2 = this.f26634r;
        float f16 = fdVar2.d;
        return Math.max(f15, (f14 * fdVar2.e) + (f11 * fdVar2.f26291f) + f16);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f26637u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f26636t));
            }
            this.f26636t = elapsedRealtime;
            boolean isEnabled = LiteMode.isEnabled(512);
            fd fdVar = this.f26634r;
            fd fdVar2 = this.f26633q;
            if (isEnabled && min > 0) {
                float f7 = this.f26638w;
                float f10 = this.v;
                if (f7 != f10) {
                    float f11 = this.f26639x;
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
                this.f26635s = a1.g.d((float) min, this.f26623f, 6.2831855f, this.f26635s);
                fdVar2.d(this.v);
                fdVar.d(this.v);
            }
            float f13 = this.E;
            if (f13 < 1.0f && min > 0) {
                float f14 = (((float) min) / 250.0f) + f13;
                this.E = f14;
                if (f14 > 1.0f) {
                    this.E = 1.0f;
                }
                a(i0.a.f(this.E, this.C, this.D));
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f15 = 1.0f - (this.v * 0.7f);
            float f16 = fdVar2.f26291f;
            float f17 = this.e;
            float A = com.google.android.gms.internal.play_billing.k3.A((float) Math.sin(this.f26635s), 0.5f, 0.5f, f16 * f17 * f15);
            float A2 = com.google.android.gms.internal.play_billing.k3.A((float) Math.sin(this.f26635s + fdVar.f26289b), 0.5f, 0.5f, f17 * fdVar.f26291f * f15);
            c(canvas, this.f26633q, exactCenterX, exactCenterY, A);
            c(canvas, this.f26634r, exactCenterX, exactCenterY, A2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void f(float f7) {
        float f10;
        this.f26638w = f7;
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        float f11 = this.f26638w - this.v;
        if (f11 > 0.0f) {
            f10 = 400.0f;
        } else {
            f10 = 500.0f;
        }
        this.f26639x = f11 / ((f10 * 0.55f) + 100.0f);
    }

    public final void g(int i10, boolean z10) {
        if (i10 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i10;
        int e = e(i10);
        if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
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
        ChatObject.Call call = sharedInstance.groupCall;
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
            if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) || sharedInstance.groupCall.call.rtmp_stream) {
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
            float d = d() + AndroidUtilities.dp(1.0f);
            float min = (Math.min(bounds.width(), bounds.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
            if (d > min) {
                d = Math.max(0.0f, min);
            }
            this.h = (bounds.width() / 2.0f) - d;
            float height = (bounds.height() / 2.0f) - d;
            this.f26625i = height;
            float f7 = this.h;
            if (f7 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f26620a, Math.min(f7, height));
                this.f26626j = min2;
                float f10 = this.h - min2;
                this.f26627k = f10;
                float f11 = this.f26625i - min2;
                this.f26628l = f11;
                float f12 = f10 * 2.0f;
                this.f26629m = f12;
                float f13 = f11 * 2.0f;
                this.f26630n = f13;
                float f14 = this.f26622c * 1.5707964f * min2;
                this.f26631o = f14;
                float f15 = (f13 * 2.0f) + (f12 * 2.0f);
                this.f26632p = (f14 * 4.0f) + f15;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f15) / this.f26621b)));
                fd fdVar = this.f26633q;
                if (max != fdVar.f26307x) {
                    fdVar.c(max);
                    this.f26634r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            fd fdVar = this.f26633q;
            fdVar.f26308y = i10;
            fdVar.a();
            fd fdVar2 = this.f26634r;
            fdVar2.f26308y = i10;
            fdVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26633q.f26293i.setColorFilter(colorFilter);
        this.f26634r.f26293i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
