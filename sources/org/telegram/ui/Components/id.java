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
    public float f25016i;
    public float f25017j;
    public float f25018k;
    public float f25019l;
    public float f25020m;
    public float f25021n;
    public float f25022o;
    public float f25023p;
    public final hd f25024q;
    public final hd f25025r;
    public float f25026s;
    public long f25027t;
    public boolean f25028u;
    public float v;
    public float f25029w;
    public float f25030x;
    public final float f25011a = AndroidUtilities.dp(18.0f);
    public final float f25012b = AndroidUtilities.dp(22.0f);
    public final float f25013c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float e = AndroidUtilities.dp(1.5f);
    public final float f25014f = 3600.0f;
    public final float f25015g = 0.25f;
    public final Path f25031y = new Path();
    public final float[] f25032z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final pg F = new pg(this, 16);
    public int G = 255;

    public id() {
        hd hdVar = new hd();
        this.f25024q = hdVar;
        hdVar.f24725a = 1.0f;
        hdVar.f24726b = 0.0f;
        hdVar.f24727c = AndroidUtilities.dp(0.5f);
        hdVar.d = AndroidUtilities.dp(8.5f);
        hdVar.e = 1.0f;
        hdVar.f24728f = 1.0f;
        hdVar.f24729g = 61;
        hd hdVar2 = new hd();
        this.f25025r = hdVar2;
        hdVar2.f24725a = 0.82f;
        hdVar2.f24726b = 0.6f;
        hdVar2.f24727c = AndroidUtilities.dp(0.0f);
        hdVar2.d = AndroidUtilities.dp(4.25f);
        hdVar2.e = 0.55f;
        hdVar2.f24728f = 0.55f;
        hdVar2.f24729g = 128;
        e(0, false);
    }

    public final void a(float f7, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.f25017j;
        fArr[0] = (f12 * cos) + f7;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, hd hdVar, float f7, float f10, float f11) {
        int i10;
        char c10;
        char c11;
        int i11;
        int i12 = hdVar.f24744x;
        if (i12 == 0) {
            return;
        }
        float f12 = hdVar.f24727c;
        float f13 = this.v;
        float f14 = ((hdVar.d - f12) * f13) + f12;
        float B = com.google.android.gms.internal.vision.e2.B(f13, 1.0f, 0.0f, this.d * hdVar.e);
        float[] fArr = hdVar.f24742u;
        float[] fArr2 = hdVar.v;
        float[] fArr3 = hdVar.f24743w;
        char c12 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            float interpolation = H.getInterpolation(hdVar.f24736o[i13]);
            float f15 = 1.0f - interpolation;
            fArr[i13] = (hdVar.f24733l[i13] * interpolation) + (hdVar.f24732k[i13] * f15);
            fArr3[i13] = (hdVar.f24735n[i13] * interpolation) + (hdVar.f24734m[i13] * f15);
        }
        float f16 = this.f25015g;
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
            float floor = (f18 - ((float) Math.floor(f18))) * this.f25023p;
            float f19 = this.f25020m;
            float[] fArr5 = this.f25032z;
            if (floor < f19) {
                fArr5[c12] = (-this.f25018k) + floor;
                fArr5[1] = -this.f25016i;
                fArr5[c13] = 1.0f;
                fArr5[3] = 0.0f;
                c10 = 0;
                c11 = 2;
            } else {
                float f20 = floor - f19;
                float f21 = this.f25022o;
                c10 = 0;
                float f22 = this.f25013c;
                if (f20 < f21) {
                    c11 = 2;
                    a(this.f25018k, -this.f25019l, (f20 / (f22 * this.f25017j)) - 1.5707964f, fArr5);
                } else {
                    c11 = 2;
                    float f23 = f20 - f21;
                    float f24 = this.f25021n;
                    if (f23 < f24) {
                        fArr5[0] = this.h;
                        fArr5[1] = (-this.f25019l) + f23;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f25 = f23 - f24;
                        if (f25 < f21) {
                            a(this.f25018k, this.f25019l, f25 / (f22 * this.f25017j), fArr5);
                        } else {
                            float f26 = f25 - f21;
                            if (f26 < f19) {
                                fArr5[0] = this.f25018k - f26;
                                fArr5[1] = this.f25016i;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f27 = f26 - f19;
                                if (f27 < f21) {
                                    a(-this.f25018k, this.f25019l, (f27 / (f22 * this.f25017j)) + 1.5707964f, fArr5);
                                } else {
                                    float f28 = f27 - f21;
                                    if (f28 < f24) {
                                        fArr5[0] = -this.h;
                                        fArr5[1] = this.f25019l - f28;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.f25018k, -this.f25019l, ((f28 - f24) / (f22 * this.f25017j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f29 = fArr5[3];
            float f30 = (fArr[i18] * B) + f14 + f11;
            hdVar.f24738q[i18] = (f29 * f30) + f7 + fArr5[c10];
            hdVar.f24739r[i18] = ((-fArr5[c11]) * f30) + f10 + fArr5[1];
            hdVar.f24740s[i18] = fArr5[c11];
            hdVar.f24741t[i18] = fArr5[3];
            i18++;
            c12 = 0;
            c13 = 2;
        }
        Path path = this.f25031y;
        path.rewind();
        path.moveTo(hdVar.f24738q[0], hdVar.f24739r[0]);
        int i19 = 0;
        while (i19 < i12) {
            int i20 = i19 + 1;
            if (i20 < i12) {
                i10 = i20;
            } else {
                i10 = 0;
            }
            float[] fArr6 = hdVar.f24738q;
            float f31 = fArr6[i10] - fArr6[i19];
            float[] fArr7 = hdVar.f24739r;
            float f32 = fArr7[i10] - fArr7[i19];
            float sqrt = ((float) Math.sqrt((f32 * f32) + (f31 * f31))) / 3.0f;
            float[] fArr8 = hdVar.f24738q;
            float f33 = fArr8[i19];
            float[] fArr9 = hdVar.f24740s;
            float f34 = (fArr9[i19] * sqrt) + f33;
            float[] fArr10 = hdVar.f24739r;
            float f35 = fArr10[i19];
            float[] fArr11 = hdVar.f24741t;
            float f36 = fArr8[i10];
            float f37 = fArr10[i10];
            path.cubicTo(f34, (fArr11[i19] * sqrt) + f35, f36 - (fArr9[i10] * sqrt), f37 - (fArr11[i10] * sqrt), f36, f37);
            i19 = i20;
        }
        path.close();
        canvas.drawPath(path, hdVar.f24730i);
    }

    public final float c() {
        hd hdVar = this.f25024q;
        float f7 = hdVar.d;
        float f10 = hdVar.f24728f;
        float f11 = this.e;
        float f12 = (f10 * f11) + f7;
        float f13 = hdVar.e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        hd hdVar2 = this.f25025r;
        float f16 = hdVar2.d;
        return Math.max(f15, (f14 * hdVar2.e) + (f11 * hdVar2.f24728f) + f16);
    }

    public final void d(float f7) {
        float f10;
        this.f25029w = f7;
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        float f11 = this.f25029w - this.v;
        if (f11 > 0.0f) {
            f10 = 400.0f;
        } else {
            f10 = 500.0f;
        }
        this.f25030x = f11 / ((f10 * 0.55f) + 100.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f25028u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f25027t));
            }
            this.f25027t = elapsedRealtime;
            boolean isEnabled = LiteMode.isEnabled(512);
            hd hdVar = this.f25025r;
            hd hdVar2 = this.f25024q;
            if (isEnabled && min > 0) {
                float f7 = this.f25029w;
                float f10 = this.v;
                if (f7 != f10) {
                    float f11 = this.f25030x;
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
                this.f25026s = a4.a.e((float) min, this.f25014f, 6.2831855f, this.f25026s);
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
                int d = i0.a.d(this.E, this.C, this.D);
                this.B = d;
                hdVar2.h = d;
                hdVar.h = d;
                hdVar2.a();
                hdVar.a();
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f15 = 1.0f - (this.v * 0.7f);
            float f16 = hdVar2.f24728f;
            float f17 = this.e;
            float B = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.f25026s), 0.5f, 0.5f, f16 * f17 * f15);
            float B2 = com.google.android.gms.internal.vision.e2.B((float) Math.sin(this.f25026s + hdVar.f24726b), 0.5f, 0.5f, f17 * hdVar.f24728f * f15);
            b(canvas, this.f25024q, exactCenterX, exactCenterY, B);
            b(canvas, this.f25025r, exactCenterX, exactCenterY, B2);
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
                    d = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19032bh, false);
                } else {
                    d = i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19158ih, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19177jh, false)), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19197kh, false));
                }
            } else {
                d = i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Zg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19013ah, false));
            }
        } else {
            d = i0.a.d(0.5f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Xg, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Yg, false));
        }
        if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
            this.C = this.B;
            this.D = d;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            this.B = d;
            hd hdVar = this.f25024q;
            hdVar.h = d;
            hd hdVar2 = this.f25025r;
            hdVar2.h = d;
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
            this.f25016i = height;
            float f7 = this.h;
            if (f7 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f25011a, Math.min(f7, height));
                this.f25017j = min2;
                float f10 = this.h - min2;
                this.f25018k = f10;
                float f11 = this.f25016i - min2;
                this.f25019l = f11;
                float f12 = f10 * 2.0f;
                this.f25020m = f12;
                float f13 = f11 * 2.0f;
                this.f25021n = f13;
                float f14 = this.f25013c * 1.5707964f * min2;
                this.f25022o = f14;
                float f15 = (f13 * 2.0f) + (f12 * 2.0f);
                this.f25023p = (f14 * 4.0f) + f15;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f15) / this.f25012b)));
                hd hdVar = this.f25024q;
                if (max != hdVar.f24744x) {
                    hdVar.c(max);
                    this.f25025r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            hd hdVar = this.f25024q;
            hdVar.f24745y = i10;
            hdVar.a();
            hd hdVar2 = this.f25025r;
            hdVar2.f24745y = i10;
            hdVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25024q.f24730i.setColorFilter(colorFilter);
        this.f25025r.f24730i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
