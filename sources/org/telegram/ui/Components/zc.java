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
public final class zc extends Drawable {
    public static final ih.a H = new ih.a(1);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f31313i;
    public float f31314j;
    public float f31315k;
    public float f31316l;
    public float f31317m;
    public float f31318n;
    public float f31319o;
    public float f31320p;
    public final yc f31321q;
    public final yc f31322r;
    public float f31323s;
    public long f31324t;
    public boolean f31325u;
    public float v;
    public float f31326w;
    public float f31327x;
    public final float f31308a = AndroidUtilities.dp(18.0f);
    public final float f31309b = AndroidUtilities.dp(22.0f);
    public final float f31310c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float e = AndroidUtilities.dp(1.5f);
    public final float f31311f = 3600.0f;
    public final float f31312g = 0.25f;
    public final Path f31328y = new Path();
    public final float[] f31329z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final fg F = new fg(this, 16);
    public int G = 255;

    public zc() {
        yc ycVar = new yc();
        this.f31321q = ycVar;
        ycVar.f30963a = 1.0f;
        ycVar.f30964b = 0.0f;
        ycVar.f30965c = AndroidUtilities.dp(0.5f);
        ycVar.d = AndroidUtilities.dp(8.5f);
        ycVar.e = 1.0f;
        ycVar.f30966f = 1.0f;
        ycVar.f30967g = 61;
        yc ycVar2 = new yc();
        this.f31322r = ycVar2;
        ycVar2.f30963a = 0.82f;
        ycVar2.f30964b = 0.6f;
        ycVar2.f30965c = AndroidUtilities.dp(0.0f);
        ycVar2.d = AndroidUtilities.dp(4.25f);
        ycVar2.e = 0.55f;
        ycVar2.f30966f = 0.55f;
        ycVar2.f30967g = 128;
        e(0, false);
    }

    public final void a(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = this.f31314j;
        fArr[0] = (f13 * cos) + f10;
        fArr[1] = (f13 * sin) + f11;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, yc ycVar, float f10, float f11, float f12) {
        int i10;
        char c3;
        char c10;
        int i11;
        int i12 = ycVar.f30982x;
        if (i12 == 0) {
            return;
        }
        float f13 = ycVar.f30965c;
        float f14 = this.v;
        float f15 = ((ycVar.d - f13) * f14) + f13;
        float y10 = e2.c.y(f14, 1.0f, 0.0f, this.d * ycVar.e);
        float[] fArr = ycVar.f30980u;
        float[] fArr2 = ycVar.v;
        float[] fArr3 = ycVar.f30981w;
        char c11 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            float interpolation = H.getInterpolation(ycVar.f30974o[i13]);
            float f16 = 1.0f - interpolation;
            fArr[i13] = (ycVar.f30971l[i13] * interpolation) + (ycVar.f30970k[i13] * f16);
            fArr3[i13] = (ycVar.f30973n[i13] * interpolation) + (ycVar.f30972m[i13] * f16);
        }
        float f17 = this.f31312g;
        char c12 = 2;
        if (f17 > 0.0f) {
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
                    float f18 = fArr[i15];
                    fArr2[i15] = e2.c.w((fArr[i16] + fArr[i11]) * 0.5f, f18, f17, f18);
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
            float f19 = (i18 / i12) + fArr3[i18];
            float floor = (f19 - ((float) Math.floor(f19))) * this.f31320p;
            float f20 = this.f31317m;
            float[] fArr5 = this.f31329z;
            if (floor < f20) {
                fArr5[c11] = (-this.f31315k) + floor;
                fArr5[1] = -this.f31313i;
                fArr5[c12] = 1.0f;
                fArr5[3] = 0.0f;
                c3 = 0;
                c10 = 2;
            } else {
                float f21 = floor - f20;
                float f22 = this.f31319o;
                c3 = 0;
                float f23 = this.f31310c;
                if (f21 < f22) {
                    c10 = 2;
                    a(this.f31315k, -this.f31316l, (f21 / (f23 * this.f31314j)) - 1.5707964f, fArr5);
                } else {
                    c10 = 2;
                    float f24 = f21 - f22;
                    float f25 = this.f31318n;
                    if (f24 < f25) {
                        fArr5[0] = this.h;
                        fArr5[1] = (-this.f31316l) + f24;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f26 = f24 - f25;
                        if (f26 < f22) {
                            a(this.f31315k, this.f31316l, f26 / (f23 * this.f31314j), fArr5);
                        } else {
                            float f27 = f26 - f22;
                            if (f27 < f20) {
                                fArr5[0] = this.f31315k - f27;
                                fArr5[1] = this.f31313i;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f28 = f27 - f20;
                                if (f28 < f22) {
                                    a(-this.f31315k, this.f31316l, (f28 / (f23 * this.f31314j)) + 1.5707964f, fArr5);
                                } else {
                                    float f29 = f28 - f22;
                                    if (f29 < f25) {
                                        fArr5[0] = -this.h;
                                        fArr5[1] = this.f31316l - f29;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.f31315k, -this.f31316l, ((f29 - f25) / (f23 * this.f31314j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f30 = fArr5[3];
            float f31 = (fArr[i18] * y10) + f15 + f12;
            ycVar.f30976q[i18] = (f30 * f31) + f10 + fArr5[c3];
            ycVar.f30977r[i18] = ((-fArr5[c10]) * f31) + f11 + fArr5[1];
            ycVar.f30978s[i18] = fArr5[c10];
            ycVar.f30979t[i18] = fArr5[3];
            i18++;
            c11 = 0;
            c12 = 2;
        }
        Path path = this.f31328y;
        path.rewind();
        path.moveTo(ycVar.f30976q[0], ycVar.f30977r[0]);
        int i19 = 0;
        while (i19 < i12) {
            int i20 = i19 + 1;
            if (i20 < i12) {
                i10 = i20;
            } else {
                i10 = 0;
            }
            float[] fArr6 = ycVar.f30976q;
            float f32 = fArr6[i10] - fArr6[i19];
            float[] fArr7 = ycVar.f30977r;
            float f33 = fArr7[i10] - fArr7[i19];
            float sqrt = ((float) Math.sqrt((f33 * f33) + (f32 * f32))) / 3.0f;
            float[] fArr8 = ycVar.f30976q;
            float f34 = fArr8[i19];
            float[] fArr9 = ycVar.f30978s;
            float f35 = (fArr9[i19] * sqrt) + f34;
            float[] fArr10 = ycVar.f30977r;
            float f36 = fArr10[i19];
            float[] fArr11 = ycVar.f30979t;
            float f37 = fArr8[i10];
            float f38 = fArr10[i10];
            path.cubicTo(f35, (fArr11[i19] * sqrt) + f36, f37 - (fArr9[i10] * sqrt), f38 - (fArr11[i10] * sqrt), f37, f38);
            i19 = i20;
        }
        path.close();
        canvas.drawPath(path, ycVar.f30968i);
    }

    public final float c() {
        yc ycVar = this.f31321q;
        float f10 = ycVar.d;
        float f11 = ycVar.f30966f;
        float f12 = this.e;
        float f13 = (f11 * f12) + f10;
        float f14 = ycVar.e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        yc ycVar2 = this.f31322r;
        float f17 = ycVar2.d;
        return Math.max(f16, (f15 * ycVar2.e) + (f12 * ycVar2.f30966f) + f17);
    }

    public final void d(float f10) {
        float f11;
        this.f31326w = f10;
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        float f12 = this.f31326w - this.v;
        if (f12 > 0.0f) {
            f11 = 400.0f;
        } else {
            f11 = 500.0f;
        }
        this.f31327x = f12 / ((f11 * 0.55f) + 100.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f31325u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f31324t));
            }
            this.f31324t = elapsedRealtime;
            boolean isEnabled = LiteMode.isEnabled(512);
            yc ycVar = this.f31322r;
            yc ycVar2 = this.f31321q;
            if (isEnabled && min > 0) {
                float f10 = this.f31326w;
                float f11 = this.v;
                if (f10 != f11) {
                    float f12 = this.f31327x;
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
                this.f31323s = vh.v2.c((float) min, this.f31311f, 6.2831855f, this.f31323s);
                ycVar2.d(this.v);
                ycVar.d(this.v);
            }
            float f14 = this.E;
            if (f14 < 1.0f && min > 0) {
                float f15 = (((float) min) / 250.0f) + f14;
                this.E = f15;
                if (f15 > 1.0f) {
                    this.E = 1.0f;
                }
                int d = i0.a.d(this.E, this.C, this.D);
                this.B = d;
                ycVar2.h = d;
                ycVar.h = d;
                ycVar2.a();
                ycVar.a();
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f16 = 1.0f - (this.v * 0.7f);
            float f17 = ycVar2.f30966f;
            float f18 = this.e;
            float y10 = e2.c.y((float) Math.sin(this.f31323s), 0.5f, 0.5f, f17 * f18 * f16);
            float y11 = e2.c.y((float) Math.sin(this.f31323s + ycVar.f30964b), 0.5f, 0.5f, f18 * ycVar.f30966f * f16);
            b(canvas, this.f31321q, exactCenterX, exactCenterY, y10);
            b(canvas, this.f31322r, exactCenterX, exactCenterY, y11);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void e(int i10, boolean z4) {
        int d;
        if (i10 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    d = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881bh, false);
                } else {
                    d = i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20005ih, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20023jh, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20042kh, false));
                }
            } else {
                d = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Zg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19862ah, false));
            }
        } else {
            d = i0.a.d(0.5f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yg, false));
        }
        if (z4 && this.B != 0 && LiteMode.isEnabled(512)) {
            this.C = this.B;
            this.D = d;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            this.B = d;
            yc ycVar = this.f31321q;
            ycVar.h = d;
            yc ycVar2 = this.f31322r;
            ycVar2.h = d;
            ycVar.a();
            ycVar2.a();
        }
        invalidateSelf();
    }

    public final void f(boolean z4) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        int callState = sharedInstance.getCallState();
        if (!sharedInstance.isSwitchingStream() && (callState == 1 || callState == 2 || callState == 6 || callState == 5)) {
            e(2, z4);
            return;
        }
        ChatObject.Call call = sharedInstance.groupCall;
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(sharedInstance.getSelfId());
            if ((groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !ChatObject.canManageCalls(sharedInstance.getChat())) || sharedInstance.groupCall.call.rtmp_stream) {
                sharedInstance.setMicMute(true, false, false);
                e(3, z4);
                return;
            }
            e(sharedInstance.isMicMute() ? 1 : 0, z4);
            return;
        }
        e(sharedInstance.isMicMute() ? 1 : 0, z4);
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
            float c3 = c() + AndroidUtilities.dp(1.0f);
            float min = (Math.min(bounds.width(), bounds.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
            if (c3 > min) {
                c3 = Math.max(0.0f, min);
            }
            this.h = (bounds.width() / 2.0f) - c3;
            float height = (bounds.height() / 2.0f) - c3;
            this.f31313i = height;
            float f10 = this.h;
            if (f10 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f31308a, Math.min(f10, height));
                this.f31314j = min2;
                float f11 = this.h - min2;
                this.f31315k = f11;
                float f12 = this.f31313i - min2;
                this.f31316l = f12;
                float f13 = f11 * 2.0f;
                this.f31317m = f13;
                float f14 = f12 * 2.0f;
                this.f31318n = f14;
                float f15 = this.f31310c * 1.5707964f * min2;
                this.f31319o = f15;
                float f16 = (f14 * 2.0f) + (f13 * 2.0f);
                this.f31320p = (f15 * 4.0f) + f16;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f16) / this.f31309b)));
                yc ycVar = this.f31321q;
                if (max != ycVar.f30982x) {
                    ycVar.c(max);
                    this.f31322r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            yc ycVar = this.f31321q;
            ycVar.f30983y = i10;
            ycVar.a();
            yc ycVar2 = this.f31322r;
            ycVar2.f30983y = i10;
            ycVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31321q.f30968i.setColorFilter(colorFilter);
        this.f31322r.f30968i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
