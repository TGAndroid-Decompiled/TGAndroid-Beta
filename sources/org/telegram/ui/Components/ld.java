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
public final class ld extends Drawable {
    public static final jd H = new jd(0);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f28427i;
    public float f28428j;
    public float f28429k;
    public float f28430l;
    public float f28431m;
    public float f28432n;
    public float f28433o;
    public float f28434p;
    public final kd f28435q;
    public final kd f28436r;
    public float f28437s;
    public long f28438t;
    public boolean f28439u;
    public float v;
    public float f28440w;
    public float f28441x;
    public final float f28421a = AndroidUtilities.dp(18.0f);
    public final float f28422b = AndroidUtilities.dp(22.0f);
    public final float f28423c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float f28424e = AndroidUtilities.dp(1.5f);
    public final float f28425f = 3600.0f;
    public final float f28426g = 0.25f;
    public final Path f28442y = new Path();
    public final float[] f28443z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final rg F = new rg(this, 16);
    public int G = 255;

    public ld() {
        kd kdVar = new kd();
        this.f28435q = kdVar;
        kdVar.f27933a = 1.0f;
        kdVar.f27934b = 0.0f;
        kdVar.f27935c = AndroidUtilities.dp(0.5f);
        kdVar.d = AndroidUtilities.dp(8.5f);
        kdVar.f27936e = 1.0f;
        kdVar.f27937f = 1.0f;
        kdVar.f27938g = 61;
        kd kdVar2 = new kd();
        this.f28436r = kdVar2;
        kdVar2.f27933a = 0.82f;
        kdVar2.f27934b = 0.6f;
        kdVar2.f27935c = AndroidUtilities.dp(0.0f);
        kdVar2.d = AndroidUtilities.dp(4.25f);
        kdVar2.f27936e = 0.55f;
        kdVar2.f27937f = 0.55f;
        kdVar2.f27938g = 128;
        e(0, false);
    }

    public final void a(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.f28428j;
        fArr[0] = (f12 * cos) + f7;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, kd kdVar, float f7, float f10, float f11) {
        int i10;
        int i11;
        char c10;
        int i12;
        int i13 = kdVar.f27953x;
        if (i13 == 0) {
            return;
        }
        float f12 = kdVar.f27935c;
        float f13 = this.v;
        float f14 = ((kdVar.d - f12) * f13) + f12;
        float f15 = 1.0f;
        float f16 = 0.0f;
        float A = com.google.android.gms.internal.vision.e2.A(f13, 1.0f, 0.0f, this.d * kdVar.f27936e);
        float[] fArr = kdVar.f27951u;
        float[] fArr2 = kdVar.v;
        float[] fArr3 = kdVar.f27952w;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            float interpolation = H.getInterpolation(kdVar.f27945o[i15]);
            float f17 = 1.0f - interpolation;
            fArr[i15] = (kdVar.f27942l[i15] * interpolation) + (kdVar.f27941k[i15] * f17);
            fArr3[i15] = (kdVar.f27944n[i15] * interpolation) + (kdVar.f27943m[i15] * f17);
        }
        float f18 = this.f28426g;
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
                    fArr2[i17] = com.google.android.gms.internal.vision.e2.y((fArr[i18] + fArr[i12]) * 0.5f, f21, f18, f21);
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
            float floor = (f25 - ((float) Math.floor(f25))) * this.f28434p;
            float f26 = this.f28431m;
            int i21 = (floor > f26 ? 1 : (floor == f26 ? 0 : -1));
            float[] fArr5 = this.f28443z;
            if (i21 < 0) {
                fArr5[i14] = (-this.f28429k) + floor;
                fArr5[1] = -this.f28427i;
                fArr5[c11] = f23;
                fArr5[3] = f24;
                i11 = i14;
                c10 = c11;
            } else {
                float f27 = floor - f26;
                float f28 = this.f28433o;
                int i22 = (f27 > f28 ? 1 : (f27 == f28 ? 0 : -1));
                i11 = i14;
                float f29 = this.f28423c;
                if (i22 < 0) {
                    c10 = c11;
                    a(this.f28429k, -this.f28430l, (f27 / (f29 * this.f28428j)) - 1.5707964f, fArr5);
                } else {
                    c10 = c11;
                    float f30 = f27 - f28;
                    float f31 = this.f28432n;
                    if (f30 < f31) {
                        fArr5[i11] = this.h;
                        fArr5[1] = (-this.f28430l) + f30;
                        fArr5[c10] = f24;
                        fArr5[3] = f23;
                    } else {
                        float f32 = f30 - f31;
                        if (f32 < f28) {
                            a(this.f28429k, this.f28430l, f32 / (f29 * this.f28428j), fArr5);
                        } else {
                            float f33 = f32 - f28;
                            if (f33 < f26) {
                                fArr5[i11] = this.f28429k - f33;
                                fArr5[1] = this.f28427i;
                                fArr5[c10] = -1.0f;
                                fArr5[3] = f24;
                            } else {
                                float f34 = f33 - f26;
                                if (f34 < f28) {
                                    a(-this.f28429k, this.f28430l, (f34 / (f29 * this.f28428j)) + 1.5707964f, fArr5);
                                } else {
                                    float f35 = f34 - f28;
                                    if (f35 < f31) {
                                        fArr5[i11] = -this.h;
                                        fArr5[1] = this.f28430l - f35;
                                        fArr5[c10] = f24;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.f28429k, -this.f28430l, ((f35 - f31) / (f29 * this.f28428j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f36 = fArr5[3];
            float f37 = (fArr[i20] * A) + f14 + f11;
            kdVar.f27947q[i20] = (f36 * f37) + f7 + fArr5[i11];
            kdVar.f27948r[i20] = ((-fArr5[c10]) * f37) + f10 + fArr5[1];
            kdVar.f27949s[i20] = fArr5[c10];
            kdVar.f27950t[i20] = fArr5[3];
            i20++;
            c11 = c10;
            i14 = i11;
        }
        int i23 = i14;
        Path path = this.f28442y;
        path.rewind();
        path.moveTo(kdVar.f27947q[i23], kdVar.f27948r[i23]);
        int i24 = i23;
        while (i24 < i13) {
            int i25 = i24 + 1;
            if (i25 < i13) {
                i10 = i25;
            } else {
                i10 = i23;
            }
            float[] fArr6 = kdVar.f27947q;
            float f38 = fArr6[i10] - fArr6[i24];
            float[] fArr7 = kdVar.f27948r;
            float f39 = fArr7[i10] - fArr7[i24];
            float sqrt = ((float) Math.sqrt((f39 * f39) + (f38 * f38))) / 3.0f;
            float[] fArr8 = kdVar.f27947q;
            float f40 = fArr8[i24];
            float[] fArr9 = kdVar.f27949s;
            float f41 = (fArr9[i24] * sqrt) + f40;
            float[] fArr10 = kdVar.f27948r;
            float f42 = fArr10[i24];
            float[] fArr11 = kdVar.f27950t;
            float f43 = fArr8[i10];
            float f44 = fArr10[i10];
            path.cubicTo(f41, (fArr11[i24] * sqrt) + f42, f43 - (fArr9[i10] * sqrt), f44 - (fArr11[i10] * sqrt), f43, f44);
            i24 = i25;
        }
        path.close();
        canvas.drawPath(path, kdVar.f27939i);
    }

    public final float c() {
        kd kdVar = this.f28435q;
        float f7 = kdVar.d;
        float f10 = kdVar.f27937f;
        float f11 = this.f28424e;
        float f12 = (f10 * f11) + f7;
        float f13 = kdVar.f27936e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        kd kdVar2 = this.f28436r;
        float f16 = kdVar2.d;
        return Math.max(f15, (f14 * kdVar2.f27936e) + (f11 * kdVar2.f27937f) + f16);
    }

    public final void d(float f7) {
        float f10;
        this.f28440w = f7;
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        float f11 = this.f28440w - this.v;
        if (f11 > 0.0f) {
            f10 = 400.0f;
        } else {
            f10 = 500.0f;
        }
        this.f28441x = f11 / ((f10 * 0.55f) + 100.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f28439u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f28438t));
            }
            this.f28438t = elapsedRealtime;
            boolean isEnabled = LiteMode.isEnabled(512);
            kd kdVar = this.f28436r;
            kd kdVar2 = this.f28435q;
            if (isEnabled && min > 0) {
                float f7 = this.f28440w;
                float f10 = this.v;
                if (f7 != f10) {
                    float f11 = this.f28441x;
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
                this.f28437s = a1.g.e((float) min, this.f28425f, 6.2831855f, this.f28437s);
                kdVar2.d(this.v);
                kdVar.d(this.v);
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
                kdVar2.h = d;
                kdVar.h = d;
                kdVar2.a();
                kdVar.a();
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f15 = 1.0f - (this.v * 0.7f);
            float f16 = kdVar2.f27937f;
            float f17 = this.f28424e;
            float A = com.google.android.gms.internal.vision.e2.A((float) Math.sin(this.f28437s), 0.5f, 0.5f, f16 * f17 * f15);
            float A2 = com.google.android.gms.internal.vision.e2.A((float) Math.sin(this.f28437s + kdVar.f27934b), 0.5f, 0.5f, f17 * kdVar.f27937f * f15);
            b(canvas, this.f28435q, exactCenterX, exactCenterY, A);
            b(canvas, this.f28436r, exactCenterX, exactCenterY, A2);
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
                    d = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20771bh, false);
                } else {
                    d = i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20898ih, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20916jh, false)), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20936kh, false));
                }
            } else {
                d = i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Zg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20751ah, false));
            }
        } else {
            d = i0.a.d(0.5f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Xg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Yg, false));
        }
        if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
            this.C = this.B;
            this.D = d;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            this.B = d;
            kd kdVar = this.f28435q;
            kdVar.h = d;
            kd kdVar2 = this.f28436r;
            kdVar2.h = d;
            kdVar.a();
            kdVar2.a();
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
            this.f28427i = height;
            float f7 = this.h;
            if (f7 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f28421a, Math.min(f7, height));
                this.f28428j = min2;
                float f10 = this.h - min2;
                this.f28429k = f10;
                float f11 = this.f28427i - min2;
                this.f28430l = f11;
                float f12 = f10 * 2.0f;
                this.f28431m = f12;
                float f13 = f11 * 2.0f;
                this.f28432n = f13;
                float f14 = this.f28423c * 1.5707964f * min2;
                this.f28433o = f14;
                float f15 = (f13 * 2.0f) + (f12 * 2.0f);
                this.f28434p = (f14 * 4.0f) + f15;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f15) / this.f28422b)));
                kd kdVar = this.f28435q;
                if (max != kdVar.f27953x) {
                    kdVar.c(max);
                    this.f28436r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            kd kdVar = this.f28435q;
            kdVar.f27954y = i10;
            kdVar.a();
            kd kdVar2 = this.f28436r;
            kdVar2.f27954y = i10;
            kdVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28435q.f27939i.setColorFilter(colorFilter);
        this.f28436r.f27939i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
