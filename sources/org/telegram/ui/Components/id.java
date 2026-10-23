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
public final class id extends Drawable {
    public static final gd H = new gd(0);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f27254i;
    public float f27255j;
    public float f27256k;
    public float f27257l;
    public float f27258m;
    public float f27259n;
    public float f27260o;
    public float f27261p;
    public final hd f27262q;
    public final hd f27263r;
    public float f27264s;
    public long f27265t;
    public boolean f27266u;
    public float v;
    public float f27267w;
    public float f27268x;
    public final float f27249a = AndroidUtilities.dp(18.0f);
    public final float f27250b = AndroidUtilities.dp(22.0f);
    public final float f27251c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float e = AndroidUtilities.dp(1.5f);
    public final float f27252f = 3600.0f;
    public final float f27253g = 0.25f;
    public final Path f27269y = new Path();
    public final float[] f27270z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final pg F = new pg(this, 16);
    public int G = 255;

    public id() {
        hd hdVar = new hd();
        this.f27262q = hdVar;
        hdVar.f26857a = 1.0f;
        hdVar.f26858b = 0.0f;
        hdVar.f26859c = AndroidUtilities.dp(0.5f);
        hdVar.d = AndroidUtilities.dp(8.5f);
        hdVar.e = 1.0f;
        hdVar.f26860f = 1.0f;
        hdVar.f26861g = 61;
        hd hdVar2 = new hd();
        this.f27263r = hdVar2;
        hdVar2.f26857a = 0.82f;
        hdVar2.f26858b = 0.6f;
        hdVar2.f26859c = AndroidUtilities.dp(0.0f);
        hdVar2.d = AndroidUtilities.dp(4.25f);
        hdVar2.e = 0.55f;
        hdVar2.f26860f = 0.55f;
        hdVar2.f26861g = 128;
        e(0, false);
    }

    public final void a(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.f27255j;
        fArr[0] = (f12 * cos) + f7;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, hd hdVar, float f7, float f10, float f11) {
        int i10;
        int i11;
        char c10;
        int i12;
        int i13 = hdVar.f26876x;
        if (i13 == 0) {
            return;
        }
        float f12 = hdVar.f26859c;
        float f13 = this.v;
        float f14 = ((hdVar.d - f12) * f13) + f12;
        float f15 = 1.0f;
        float f16 = 0.0f;
        float A = com.google.android.gms.internal.play_billing.k3.A(f13, 1.0f, 0.0f, this.d * hdVar.e);
        float[] fArr = hdVar.f26874u;
        float[] fArr2 = hdVar.v;
        float[] fArr3 = hdVar.f26875w;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            float interpolation = H.getInterpolation(hdVar.f26868o[i15]);
            float f17 = 1.0f - interpolation;
            fArr[i15] = (hdVar.f26865l[i15] * interpolation) + (hdVar.f26864k[i15] * f17);
            fArr3[i15] = (hdVar.f26867n[i15] * interpolation) + (hdVar.f26866m[i15] * f17);
        }
        float f18 = this.f27253g;
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
            float floor = (f25 - ((float) Math.floor(f25))) * this.f27261p;
            float f26 = this.f27258m;
            int i21 = (floor > f26 ? 1 : (floor == f26 ? 0 : -1));
            float[] fArr5 = this.f27270z;
            if (i21 < 0) {
                fArr5[i14] = (-this.f27256k) + floor;
                fArr5[1] = -this.f27254i;
                fArr5[c11] = f23;
                fArr5[3] = f24;
                i11 = i14;
                c10 = c11;
            } else {
                float f27 = floor - f26;
                float f28 = this.f27260o;
                int i22 = (f27 > f28 ? 1 : (f27 == f28 ? 0 : -1));
                i11 = i14;
                float f29 = this.f27251c;
                if (i22 < 0) {
                    c10 = c11;
                    a(this.f27256k, -this.f27257l, (f27 / (f29 * this.f27255j)) - 1.5707964f, fArr5);
                } else {
                    c10 = c11;
                    float f30 = f27 - f28;
                    float f31 = this.f27259n;
                    if (f30 < f31) {
                        fArr5[i11] = this.h;
                        fArr5[1] = (-this.f27257l) + f30;
                        fArr5[c10] = f24;
                        fArr5[3] = f23;
                    } else {
                        float f32 = f30 - f31;
                        if (f32 < f28) {
                            a(this.f27256k, this.f27257l, f32 / (f29 * this.f27255j), fArr5);
                        } else {
                            float f33 = f32 - f28;
                            if (f33 < f26) {
                                fArr5[i11] = this.f27256k - f33;
                                fArr5[1] = this.f27254i;
                                fArr5[c10] = -1.0f;
                                fArr5[3] = f24;
                            } else {
                                float f34 = f33 - f26;
                                if (f34 < f28) {
                                    a(-this.f27256k, this.f27257l, (f34 / (f29 * this.f27255j)) + 1.5707964f, fArr5);
                                } else {
                                    float f35 = f34 - f28;
                                    if (f35 < f31) {
                                        fArr5[i11] = -this.h;
                                        fArr5[1] = this.f27257l - f35;
                                        fArr5[c10] = f24;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.f27256k, -this.f27257l, ((f35 - f31) / (f29 * this.f27255j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f36 = fArr5[3];
            float f37 = (fArr[i20] * A) + f14 + f11;
            hdVar.f26870q[i20] = (f36 * f37) + f7 + fArr5[i11];
            hdVar.f26871r[i20] = ((-fArr5[c10]) * f37) + f10 + fArr5[1];
            hdVar.f26872s[i20] = fArr5[c10];
            hdVar.f26873t[i20] = fArr5[3];
            i20++;
            c11 = c10;
            i14 = i11;
        }
        int i23 = i14;
        Path path = this.f27269y;
        path.rewind();
        path.moveTo(hdVar.f26870q[i23], hdVar.f26871r[i23]);
        int i24 = i23;
        while (i24 < i13) {
            int i25 = i24 + 1;
            if (i25 < i13) {
                i10 = i25;
            } else {
                i10 = i23;
            }
            float[] fArr6 = hdVar.f26870q;
            float f38 = fArr6[i10] - fArr6[i24];
            float[] fArr7 = hdVar.f26871r;
            float f39 = fArr7[i10] - fArr7[i24];
            float sqrt = ((float) Math.sqrt((f39 * f39) + (f38 * f38))) / 3.0f;
            float[] fArr8 = hdVar.f26870q;
            float f40 = fArr8[i24];
            float[] fArr9 = hdVar.f26872s;
            float f41 = (fArr9[i24] * sqrt) + f40;
            float[] fArr10 = hdVar.f26871r;
            float f42 = fArr10[i24];
            float[] fArr11 = hdVar.f26873t;
            float f43 = fArr8[i10];
            float f44 = fArr10[i10];
            path.cubicTo(f41, (fArr11[i24] * sqrt) + f42, f43 - (fArr9[i10] * sqrt), f44 - (fArr11[i10] * sqrt), f43, f44);
            i24 = i25;
        }
        path.close();
        canvas.drawPath(path, hdVar.f26862i);
    }

    public final float c() {
        hd hdVar = this.f27262q;
        float f7 = hdVar.d;
        float f10 = hdVar.f26860f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f7;
        float f13 = hdVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        hd hdVar2 = this.f27263r;
        float f16 = hdVar2.d;
        return Math.max(f15, (f14 * hdVar2.e) + (f11 * hdVar2.f26860f) + f16);
    }

    public final void d(float f7) {
        float f10;
        this.f27267w = f7;
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        float f11 = this.f27267w - this.v;
        if (f11 > 0.0f) {
            f10 = 400.0f;
        } else {
            f10 = 500.0f;
        }
        this.f27268x = f11 / ((f10 * 0.55f) + 100.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f27266u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f27265t));
            }
            this.f27265t = elapsedRealtime;
            boolean isEnabled = LiteMode.isEnabled(512);
            hd hdVar = this.f27263r;
            hd hdVar2 = this.f27262q;
            if (isEnabled && min > 0) {
                float f7 = this.f27267w;
                float f10 = this.v;
                if (f7 != f10) {
                    float f11 = this.f27268x;
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
                this.f27264s = a1.g.d((float) min, this.f27252f, 6.2831855f, this.f27264s);
                hdVar2.d(this.v);
                hdVar.d(this.v);
            }
            float f13 = this.E;
            if (f13 < 1.0f && min > 0) {
                float f14 = (((float) min) / 250.0f) + f13;
                this.E = f14;
                if (f14 > 1.0f) {
                    this.E = 1.0f;
                }
                int f15 = i0.a.f(this.E, this.C, this.D);
                this.B = f15;
                hdVar2.h = f15;
                hdVar.h = f15;
                hdVar2.a();
                hdVar.a();
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f16 = 1.0f - (this.v * 0.7f);
            float f17 = hdVar2.f26860f;
            float f18 = this.e;
            float A = com.google.android.gms.internal.play_billing.k3.A((float) Math.sin(this.f27264s), 0.5f, 0.5f, f17 * f18 * f16);
            float A2 = com.google.android.gms.internal.play_billing.k3.A((float) Math.sin(this.f27264s + hdVar.f26858b), 0.5f, 0.5f, f18 * hdVar.f26860f * f16);
            b(canvas, this.f27262q, exactCenterX, exactCenterY, A);
            b(canvas, this.f27263r, exactCenterX, exactCenterY, A2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void e(int i10, boolean z10) {
        int f7;
        if (i10 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    f7 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20966bh, false);
                } else {
                    f7 = i0.a.f(0.5f, i0.a.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21092ih, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21112jh, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21131kh, false));
                }
            } else {
                f7 = i0.a.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Zg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20946ah, false));
            }
        } else {
            f7 = i0.a.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yg, false));
        }
        if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
            this.C = this.B;
            this.D = f7;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            this.B = f7;
            hd hdVar = this.f27262q;
            hdVar.h = f7;
            hd hdVar2 = this.f27263r;
            hdVar2.h = f7;
            hdVar.a();
            hdVar2.a();
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
            this.f27254i = height;
            float f7 = this.h;
            if (f7 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f27249a, Math.min(f7, height));
                this.f27255j = min2;
                float f10 = this.h - min2;
                this.f27256k = f10;
                float f11 = this.f27254i - min2;
                this.f27257l = f11;
                float f12 = f10 * 2.0f;
                this.f27258m = f12;
                float f13 = f11 * 2.0f;
                this.f27259n = f13;
                float f14 = this.f27251c * 1.5707964f * min2;
                this.f27260o = f14;
                float f15 = (f13 * 2.0f) + (f12 * 2.0f);
                this.f27261p = (f14 * 4.0f) + f15;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f15) / this.f27250b)));
                hd hdVar = this.f27262q;
                if (max != hdVar.f26876x) {
                    hdVar.c(max);
                    this.f27263r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            hd hdVar = this.f27262q;
            hdVar.f26877y = i10;
            hdVar.a();
            hd hdVar2 = this.f27263r;
            hdVar2.f26877y = i10;
            hdVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27262q.f26862i.setColorFilter(colorFilter);
        this.f27263r.f26862i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
