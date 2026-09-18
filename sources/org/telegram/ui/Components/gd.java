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
    public float f24178i;
    public float f24179j;
    public float f24180k;
    public float f24181l;
    public float f24182m;
    public float f24183n;
    public float f24184o;
    public float f24185p;
    public final fd f24186q;
    public final fd f24187r;
    public float f24188s;
    public long f24189t;
    public boolean f24190u;
    public float v;
    public float f24191w;
    public float f24192x;
    public final float f24173a = AndroidUtilities.dp(18.0f);
    public final float f24174b = AndroidUtilities.dp(22.0f);
    public final float f24175c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float e = AndroidUtilities.dp(1.5f);
    public final float f24176f = 3600.0f;
    public final float f24177g = 0.25f;
    public final Path f24193y = new Path();
    public final float[] f24194z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final ng F = new ng(this, 16);
    public int G = 255;

    public gd() {
        fd fdVar = new fd();
        this.f24186q = fdVar;
        fdVar.f23874a = 1.0f;
        fdVar.f23875b = 0.0f;
        fdVar.f23876c = AndroidUtilities.dp(0.5f);
        fdVar.d = AndroidUtilities.dp(8.5f);
        fdVar.e = 1.0f;
        fdVar.f23877f = 1.0f;
        fdVar.f23878g = 61;
        fd fdVar2 = new fd();
        this.f24187r = fdVar2;
        fdVar2.f23874a = 0.82f;
        fdVar2.f23875b = 0.6f;
        fdVar2.f23876c = AndroidUtilities.dp(0.0f);
        fdVar2.d = AndroidUtilities.dp(4.25f);
        fdVar2.e = 0.55f;
        fdVar2.f23877f = 0.55f;
        fdVar2.f23878g = 128;
        e(0, false);
    }

    public final void a(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.f24179j;
        fArr[0] = (f12 * cos) + f7;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, fd fdVar, float f7, float f10, float f11) {
        int i10;
        char c10;
        char c11;
        int i11;
        int i12 = fdVar.f23893x;
        if (i12 == 0) {
            return;
        }
        float f12 = fdVar.f23876c;
        float f13 = this.v;
        float f14 = ((fdVar.d - f12) * f13) + f12;
        float B = com.google.android.gms.internal.vision.e2.B(f13, 1.0f, 0.0f, this.d * fdVar.e);
        float[] fArr = fdVar.f23891u;
        float[] fArr2 = fdVar.v;
        float[] fArr3 = fdVar.f23892w;
        char c12 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            float interpolation = H.getInterpolation(fdVar.f23885o[i13]);
            float f15 = 1.0f - interpolation;
            fArr[i13] = (fdVar.f23882l[i13] * interpolation) + (fdVar.f23881k[i13] * f15);
            fArr3[i13] = (fdVar.f23884n[i13] * interpolation) + (fdVar.f23883m[i13] * f15);
        }
        float f16 = this.f24177g;
        char c13 = 2;
        if (f16 > 0.0f) {
            int i14 = 0;
            while (i14 < 2) {
                int i15 = 0;
                while (i15 < i12) {
                    int i16 = i15 == 0 ? i12 - 1 : i15 - 1;
                    int i17 = i15 + 1;
                    if (i17 == i12) {
                        i11 = 0;
                    } else {
                        i11 = i17;
                    }
                    float f17 = fArr[i15];
                    fArr2[i15] = com.google.android.gms.internal.vision.e2.z((fArr[i16] + fArr[i11]) * 0.5f, f17, f16, f17);
                    i15 = i17;
                }
                i14++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
            }
        }
        int i18 = 0;
        while (i18 < i12) {
            float f18 = (i18 / i12) + fArr3[i18];
            float floor = (f18 - ((float) Math.floor(f18))) * this.f24185p;
            float f19 = this.f24182m;
            float[] fArr5 = this.f24194z;
            if (floor < f19) {
                fArr5[c12] = (-this.f24180k) + floor;
                fArr5[1] = -this.f24178i;
                fArr5[c13] = 1.0f;
                fArr5[3] = 0.0f;
                c10 = 0;
                c11 = 2;
            } else {
                float f20 = floor - f19;
                float f21 = this.f24184o;
                c10 = 0;
                float f22 = this.f24175c;
                if (f20 < f21) {
                    c11 = 2;
                    a(this.f24180k, -this.f24181l, (f20 / (f22 * this.f24179j)) - 1.5707964f, fArr5);
                } else {
                    c11 = 2;
                    float f23 = f20 - f21;
                    float f24 = this.f24183n;
                    if (f23 < f24) {
                        fArr5[0] = this.h;
                        fArr5[1] = (-this.f24181l) + f23;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f25 = f23 - f24;
                        if (f25 < f21) {
                            a(this.f24180k, this.f24181l, f25 / (f22 * this.f24179j), fArr5);
                        } else {
                            float f26 = f25 - f21;
                            if (f26 < f19) {
                                fArr5[0] = this.f24180k - f26;
                                fArr5[1] = this.f24178i;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f27 = f26 - f19;
                                if (f27 < f21) {
                                    a(-this.f24180k, this.f24181l, (f27 / (f22 * this.f24179j)) + 1.5707964f, fArr5);
                                } else {
                                    float f28 = f27 - f21;
                                    if (f28 < f24) {
                                        fArr5[0] = -this.h;
                                        fArr5[1] = this.f24181l - f28;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.f24180k, -this.f24181l, ((f28 - f24) / (f22 * this.f24179j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f29 = fArr5[3];
            float f30 = (fArr[i18] * B) + f14 + f11;
            fdVar.f23887q[i18] = (f29 * f30) + f7 + fArr5[c10];
            fdVar.f23888r[i18] = ((-fArr5[c11]) * f30) + f10 + fArr5[1];
            fdVar.f23889s[i18] = fArr5[c11];
            fdVar.f23890t[i18] = fArr5[3];
            i18++;
            c12 = 0;
            c13 = 2;
        }
        Path path = this.f24193y;
        path.rewind();
        path.moveTo(fdVar.f23887q[0], fdVar.f23888r[0]);
        int i19 = 0;
        while (i19 < i12) {
            int i20 = i19 + 1;
            if (i20 < i12) {
                i10 = i20;
            } else {
                i10 = 0;
            }
            float[] fArr6 = fdVar.f23887q;
            float f31 = fArr6[i10] - fArr6[i19];
            float[] fArr7 = fdVar.f23888r;
            float f32 = fArr7[i10] - fArr7[i19];
            float sqrt = ((float) Math.sqrt((f32 * f32) + (f31 * f31))) / 3.0f;
            float[] fArr8 = fdVar.f23887q;
            float f33 = fArr8[i19];
            float[] fArr9 = fdVar.f23889s;
            float f34 = (fArr9[i19] * sqrt) + f33;
            float[] fArr10 = fdVar.f23888r;
            float f35 = fArr10[i19];
            float[] fArr11 = fdVar.f23890t;
            float f36 = fArr8[i10];
            float f37 = fArr10[i10];
            path.cubicTo(f34, (fArr11[i19] * sqrt) + f35, f36 - (fArr9[i10] * sqrt), f37 - (fArr11[i10] * sqrt), f36, f37);
            i19 = i20;
        }
        path.close();
        canvas.drawPath(path, fdVar.f23879i);
    }

    public final float c() {
        fd fdVar = this.f24186q;
        float f7 = fdVar.d;
        float f10 = fdVar.f23877f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f7;
        float f13 = fdVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        fd fdVar2 = this.f24187r;
        float f16 = fdVar2.d;
        return Math.max(f15, (f14 * fdVar2.e) + (f11 * fdVar2.f23877f) + f16);
    }

    public final void d(float f7) {
        float f10;
        this.f24191w = f7;
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        float f11 = this.f24191w - this.v;
        if (f11 > 0.0f) {
            f10 = 400.0f;
        } else {
            f10 = 500.0f;
        }
        this.f24192x = f11 / ((f10 * 0.55f) + 100.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f24190u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f24189t));
            }
            this.f24189t = elapsedRealtime;
            boolean isEnabled = LiteMode.isEnabled(512);
            fd fdVar = this.f24187r;
            fd fdVar2 = this.f24186q;
            if (isEnabled && min > 0) {
                float f7 = this.f24191w;
                float f10 = this.v;
                if (f7 != f10) {
                    float f11 = this.f24192x;
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
                this.f24188s = a4.a.e((float) min, this.f24176f, 6.2831855f, this.f24188s);
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
                int d = i0.a.d(this.E, this.C, this.D);
                this.B = d;
                fdVar2.h = d;
                fdVar.h = d;
                fdVar2.a();
                fdVar.a();
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f15 = 1.0f - (this.v * 0.7f);
            float f16 = fdVar2.f23877f;
            float f17 = this.e;
            float B = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.f24188s), 0.5f, 0.5f, f16 * f17 * f15);
            float B2 = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.f24188s + fdVar.f23875b), 0.5f, 0.5f, f17 * fdVar.f23877f * f15);
            b(canvas, this.f24186q, exactCenterX, exactCenterY, B);
            b(canvas, this.f24187r, exactCenterX, exactCenterY, B2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void e(int i10, boolean z10) {
        int d;
        if (i10 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18836bh, false);
                } else {
                    d = i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18963ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18982jh, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19002kh, false));
                }
            } else {
                d = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Zg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18817ah, false));
            }
        } else {
            d = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yg, false));
        }
        if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
            this.C = this.B;
            this.D = d;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            this.B = d;
            fd fdVar = this.f24186q;
            fdVar.h = d;
            fd fdVar2 = this.f24187r;
            fdVar2.h = d;
            fdVar.a();
            fdVar2.a();
        }
        invalidateSelf();
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
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
            if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) || sharedInstance.groupCall.call.rtmp_stream) {
                sharedInstance.setMicMute(true, false, false);
                e(3, z10);
                return;
            }
            e(sharedInstance.isMicMute() ? 1 : 0, z10);
            return;
        }
        e(sharedInstance.isMicMute() ? 1 : 0, z10);
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
        if (!bounds.isEmpty()) {
            float c10 = c() + AndroidUtilities.dp(1.0f);
            float min = (Math.min(bounds.width(), bounds.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
            if (c10 > min) {
                c10 = Math.max(0.0f, min);
            }
            this.h = (bounds.width() / 2.0f) - c10;
            float height = (bounds.height() / 2.0f) - c10;
            this.f24178i = height;
            float f7 = this.h;
            if (f7 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f24173a, Math.min(f7, height));
                this.f24179j = min2;
                float f10 = this.h - min2;
                this.f24180k = f10;
                float f11 = this.f24178i - min2;
                this.f24181l = f11;
                float f12 = f10 * 2.0f;
                this.f24182m = f12;
                float f13 = f11 * 2.0f;
                this.f24183n = f13;
                float f14 = this.f24175c * 1.5707964f * min2;
                this.f24184o = f14;
                float f15 = (f13 * 2.0f) + (f12 * 2.0f);
                this.f24185p = (f14 * 4.0f) + f15;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f15) / this.f24174b)));
                fd fdVar = this.f24186q;
                if (max != fdVar.f23893x) {
                    fdVar.c(max);
                    this.f24187r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            fd fdVar = this.f24186q;
            fdVar.f23894y = i10;
            fdVar.a();
            fd fdVar2 = this.f24187r;
            fdVar2.f23894y = i10;
            fdVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f24186q.f23879i.setColorFilter(colorFilter);
        this.f24187r.f23879i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
