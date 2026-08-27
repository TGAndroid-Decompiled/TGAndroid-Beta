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

public final class vc extends Drawable {
    public static final eh.a H = new eh.a(1);
    public int B;
    public int C;
    public int D;
    public float h;

    public float f33354i;

    public float f33355j;

    public float f33356k;

    public float f33357l;

    public float f33358m;

    public float f33359n;

    public float f33360o;

    public float f33361p;

    public final uc f33362q;

    public final uc f33363r;

    public float f33364s;

    public long f33365t;

    public boolean f33366u;
    public float v;

    public float f33367w;

    public float f33368x;

    public final float f33348a = AndroidUtilities.dp(18.0f);

    public final float f33349b = AndroidUtilities.dp(22.0f);

    public final float f33350c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);

    public final float f33351e = AndroidUtilities.dp(1.5f);

    public final float f33352f = 3600.0f;

    public final float f33353g = 0.25f;

    public final Path f33369y = new Path();

    public final float[] f33370z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final bg F = new bg(this, 16);
    public int G = 255;

    public vc() {
        uc ucVar = new uc();
        this.f33362q = ucVar;
        ucVar.f33037a = 1.0f;
        ucVar.f33038b = 0.0f;
        ucVar.f33039c = AndroidUtilities.dp(0.5f);
        ucVar.d = AndroidUtilities.dp(8.5f);
        ucVar.f33040e = 1.0f;
        ucVar.f33041f = 1.0f;
        ucVar.f33042g = 61;
        uc ucVar2 = new uc();
        this.f33363r = ucVar2;
        ucVar2.f33037a = 0.82f;
        ucVar2.f33038b = 0.6f;
        ucVar2.f33039c = AndroidUtilities.dp(0.0f);
        ucVar2.d = AndroidUtilities.dp(4.25f);
        ucVar2.f33040e = 0.55f;
        ucVar2.f33041f = 0.55f;
        ucVar2.f33042g = 128;
        e(0, false);
    }

    public final void a(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f13 = this.f33355j;
        fArr[0] = (f13 * fCos) + f10;
        fArr[1] = (f13 * fSin) + f11;
        fArr[2] = -fSin;
        fArr[3] = fCos;
    }

    public final void b(Canvas canvas, uc ucVar, float f10, float f11, float f12) {
        char c10;
        char c11;
        int i10 = ucVar.f33057x;
        if (i10 == 0) {
            return;
        }
        float f13 = ucVar.f33039c;
        float f14 = ucVar.d - f13;
        float f15 = this.v;
        float f16 = (f14 * f15) + f13;
        float fB = com.google.android.recaptcha.internal.a.B(f15, 1.0f, 0.0f, this.d * ucVar.f33040e);
        float[] fArr = ucVar.f33055u;
        float[] fArr2 = ucVar.v;
        float[] fArr3 = ucVar.f33056w;
        char c12 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            float interpolation = H.getInterpolation(ucVar.f33049o[i11]);
            float f17 = 1.0f - interpolation;
            fArr[i11] = (ucVar.f33046l[i11] * interpolation) + (ucVar.f33045k[i11] * f17);
            fArr3[i11] = (ucVar.f33048n[i11] * interpolation) + (ucVar.f33047m[i11] * f17);
        }
        float f18 = this.f33353g;
        char c13 = 2;
        if (f18 > 0.0f) {
            int i12 = 0;
            while (i12 < 2) {
                int i13 = 0;
                while (i13 < i10) {
                    int i14 = i13 + 1;
                    float f19 = (fArr[i13 == 0 ? i10 - 1 : i13 - 1] + fArr[i14 == i10 ? 0 : i14]) * 0.5f;
                    float f20 = fArr[i13];
                    fArr2[i13] = com.google.android.recaptcha.internal.a.z(f19, f20, f18, f20);
                    i13 = i14;
                }
                i12++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
            }
        }
        int i15 = 0;
        while (i15 < i10) {
            float f21 = (i15 / i10) + fArr3[i15];
            float fFloor = (f21 - ((float) Math.floor(f21))) * this.f33361p;
            float f22 = this.f33358m;
            float[] fArr5 = this.f33370z;
            if (fFloor < f22) {
                fArr5[c12] = (-this.f33356k) + fFloor;
                fArr5[1] = -this.f33354i;
                fArr5[c13] = 1.0f;
                fArr5[3] = 0.0f;
                c10 = 0;
                c11 = 2;
            } else {
                float f23 = fFloor - f22;
                float f24 = this.f33360o;
                c10 = 0;
                float f25 = this.f33350c;
                if (f23 < f24) {
                    c11 = 2;
                    a(this.f33356k, -this.f33357l, (f23 / (f25 * this.f33355j)) - 1.5707964f, fArr5);
                } else {
                    c11 = 2;
                    float f26 = f23 - f24;
                    float f27 = this.f33359n;
                    if (f26 < f27) {
                        fArr5[0] = this.h;
                        fArr5[1] = (-this.f33357l) + f26;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f28 = f26 - f27;
                        if (f28 < f24) {
                            a(this.f33356k, this.f33357l, f28 / (f25 * this.f33355j), fArr5);
                        } else {
                            float f29 = f28 - f24;
                            if (f29 < f22) {
                                fArr5[0] = this.f33356k - f29;
                                fArr5[1] = this.f33354i;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f30 = f29 - f22;
                                if (f30 < f24) {
                                    a(-this.f33356k, this.f33357l, (f30 / (f25 * this.f33355j)) + 1.5707964f, fArr5);
                                } else {
                                    float f31 = f30 - f24;
                                    if (f31 < f27) {
                                        fArr5[0] = -this.h;
                                        fArr5[1] = this.f33357l - f31;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.f33356k, -this.f33357l, ((f31 - f27) / (f25 * this.f33355j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f32 = fArr5[3];
            float f33 = -fArr5[c11];
            float f34 = (fArr[i15] * fB) + f16 + f12;
            ucVar.f33051q[i15] = (f32 * f34) + f10 + fArr5[c10];
            ucVar.f33052r[i15] = (f33 * f34) + f11 + fArr5[1];
            ucVar.f33053s[i15] = fArr5[c11];
            ucVar.f33054t[i15] = fArr5[3];
            i15++;
            c12 = 0;
            c13 = 2;
        }
        Path path = this.f33369y;
        path.rewind();
        path.moveTo(ucVar.f33051q[0], ucVar.f33052r[0]);
        int i16 = 0;
        while (i16 < i10) {
            int i17 = i16 + 1;
            int i18 = i17 < i10 ? i17 : 0;
            float[] fArr6 = ucVar.f33051q;
            float f35 = fArr6[i18] - fArr6[i16];
            float[] fArr7 = ucVar.f33052r;
            float f36 = fArr7[i18] - fArr7[i16];
            float fSqrt = ((float) Math.sqrt((f36 * f36) + (f35 * f35))) / 3.0f;
            float[] fArr8 = ucVar.f33051q;
            float f37 = fArr8[i16];
            float[] fArr9 = ucVar.f33053s;
            float f38 = (fArr9[i16] * fSqrt) + f37;
            float[] fArr10 = ucVar.f33052r;
            float f39 = fArr10[i16];
            float[] fArr11 = ucVar.f33054t;
            float f40 = (fArr11[i16] * fSqrt) + f39;
            float f41 = fArr8[i18];
            float f42 = f41 - (fArr9[i18] * fSqrt);
            float f43 = fArr10[i18];
            path.cubicTo(f38, f40, f42, f43 - (fArr11[i18] * fSqrt), f41, f43);
            i16 = i17;
        }
        path.close();
        canvas.drawPath(path, ucVar.f33043i);
    }

    public final float c() {
        uc ucVar = this.f33362q;
        float f10 = ucVar.d;
        float f11 = ucVar.f33041f;
        float f12 = this.f33351e;
        float f13 = (f11 * f12) + f10;
        float f14 = ucVar.f33040e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        uc ucVar2 = this.f33363r;
        return Math.max(f16, (f15 * ucVar2.f33040e) + (f12 * ucVar2.f33041f) + ucVar2.d);
    }

    public final void d(float f10) {
        this.f33367w = f10;
        if (LiteMode.isEnabled(512)) {
            float f11 = this.f33367w - this.v;
            this.f33368x = f11 / (((f11 > 0.0f ? 400.0f : 500.0f) * 0.55f) + 100.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.h < 1.0f) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMin = (this.f33366u || this.E < 1.0f) ? Math.min(40L, Math.max(0L, jElapsedRealtime - this.f33365t)) : 0L;
        this.f33365t = jElapsedRealtime;
        boolean zIsEnabled = LiteMode.isEnabled(512);
        uc ucVar = this.f33363r;
        uc ucVar2 = this.f33362q;
        if (zIsEnabled && jMin > 0) {
            float f10 = this.f33367w;
            float f11 = this.v;
            if (f10 != f11) {
                float f12 = this.f33368x;
                float f13 = (jMin * f12) + f11;
                this.v = f13;
                if (f12 > 0.0f) {
                    if (f13 > f10) {
                        this.v = f10;
                    }
                } else if (f13 < f10) {
                    this.v = f10;
                }
            }
            this.f33364s = s3.c.c(jMin, this.f33352f, 6.2831855f, this.f33364s);
            ucVar2.d(this.v);
            ucVar.d(this.v);
        }
        float f14 = this.E;
        if (f14 < 1.0f && jMin > 0) {
            float f15 = (jMin / 250.0f) + f14;
            this.E = f15;
            if (f15 > 1.0f) {
                this.E = 1.0f;
            }
            int iD = i0.b.d(this.E, this.C, this.D);
            this.B = iD;
            ucVar2.h = iD;
            ucVar.h = iD;
            ucVar2.a();
            ucVar.a();
        }
        float fExactCenterX = bounds.exactCenterX();
        float fExactCenterY = bounds.exactCenterY();
        float f16 = 1.0f - (this.v * 0.7f);
        float f17 = ucVar2.f33041f;
        float f18 = this.f33351e;
        float fB = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.f33364s), 0.5f, 0.5f, f17 * f18 * f16);
        float fB2 = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.f33364s + ucVar.f33038b), 0.5f, 0.5f, f18 * ucVar.f33041f * f16);
        b(canvas, this.f33362q, fExactCenterX, fExactCenterY, fB);
        b(canvas, this.f33363r, fExactCenterX, fExactCenterY, fB2);
        if (this.E < 1.0f) {
            invalidateSelf();
        }
    }

    public final void e(int i10, boolean z10) {
        int iD;
        if (i10 != this.A || this.E < 1.0f) {
            this.A = i10;
            if (i10 == 0) {
                iD = i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yg, false));
            } else if (i10 != 1) {
                iD = i10 != 3 ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23028bh, false) : i0.b.d(0.5f, i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23154ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23173jh, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23191kh, false));
            } else {
                iD = i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Zg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009ah, false));
            }
            if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
                this.C = this.B;
                this.D = iD;
                this.E = 0.0f;
            } else {
                this.E = 1.0f;
                this.B = iD;
                uc ucVar = this.f33362q;
                ucVar.h = iD;
                uc ucVar2 = this.f33363r;
                ucVar2.h = iD;
                ucVar.a();
                ucVar2.a();
            }
            invalidateSelf();
        }
    }

    public final void f(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            e(2, z10);
            return;
        }
        ChatObject.Call call = sharedInstance.groupCall;
        if (call == null) {
            e(sharedInstance.isMicMute() ? 1 : 0, z10);
            return;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
        if ((groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || ChatObject.canManageCalls(sharedInstance.getChat())) && !sharedInstance.groupCall.call.rtmp_stream) {
            e(sharedInstance.isMicMute() ? 1 : 0, z10);
        } else {
            sharedInstance.setMicMute(true, false, false);
            e(3, z10);
        }
    }

    @Override
    public final int getAlpha() {
        return this.G;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        float fC = c() + AndroidUtilities.dp(1.0f);
        float fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
        if (fC > fMin) {
            fC = Math.max(0.0f, fMin);
        }
        this.h = (bounds.width() / 2.0f) - fC;
        float fHeight = (bounds.height() / 2.0f) - fC;
        this.f33354i = fHeight;
        float f10 = this.h;
        if (f10 < 1.0f || fHeight < 1.0f) {
            return;
        }
        float fMin2 = Math.min(this.f33348a, Math.min(f10, fHeight));
        this.f33355j = fMin2;
        float f11 = this.h - fMin2;
        this.f33356k = f11;
        float f12 = this.f33354i - fMin2;
        this.f33357l = f12;
        float f13 = f11 * 2.0f;
        this.f33358m = f13;
        float f14 = f12 * 2.0f;
        this.f33359n = f14;
        float f15 = this.f33350c * 1.5707964f * fMin2;
        this.f33360o = f15;
        float f16 = (f14 * 2.0f) + (f13 * 2.0f);
        this.f33361p = (f15 * 4.0f) + f16;
        int iMax = Math.max(12, Math.min(80, Math.round(((fMin2 * 6.2831855f) + f16) / this.f33349b)));
        uc ucVar = this.f33362q;
        if (iMax != ucVar.f33057x) {
            ucVar.c(iMax);
            this.f33363r.c(iMax);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            uc ucVar = this.f33362q;
            ucVar.f33058y = i10;
            ucVar.a();
            uc ucVar2 = this.f33363r;
            ucVar2.f33058y = i10;
            ucVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33362q.f33043i.setColorFilter(colorFilter);
        this.f33363r.f33043i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
