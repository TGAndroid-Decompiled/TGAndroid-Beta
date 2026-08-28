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
public final class yc extends Drawable {
    public static final dh.a H = new dh.a(1);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f34923i;
    public float f34924j;
    public float f34925k;
    public float f34926l;
    public float f34927m;
    public float f34928n;
    public float f34929o;
    public float f34930p;
    public final xc f34931q;
    public final xc f34932r;
    public float f34933s;
    public long f34934t;
    public boolean f34935u;
    public float v;
    public float f34936w;
    public float f34937x;
    public final float f34917a = AndroidUtilities.dp(18.0f);
    public final float f34918b = AndroidUtilities.dp(22.0f);
    public final float f34919c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float f34920e = AndroidUtilities.dp(1.5f);
    public final float f34921f = 3600.0f;
    public final float f34922g = 0.25f;
    public final Path f34938y = new Path();
    public final float[] f34939z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final fg F = new fg(this, 16);
    public int G = 255;

    public yc() {
        xc xcVar = new xc();
        this.f34931q = xcVar;
        xcVar.f34637a = 1.0f;
        xcVar.f34638b = 0.0f;
        xcVar.f34639c = AndroidUtilities.dp(0.5f);
        xcVar.d = AndroidUtilities.dp(8.5f);
        xcVar.f34640e = 1.0f;
        xcVar.f34641f = 1.0f;
        xcVar.f34642g = 61;
        xc xcVar2 = new xc();
        this.f34932r = xcVar2;
        xcVar2.f34637a = 0.82f;
        xcVar2.f34638b = 0.6f;
        xcVar2.f34639c = AndroidUtilities.dp(0.0f);
        xcVar2.d = AndroidUtilities.dp(4.25f);
        xcVar2.f34640e = 0.55f;
        xcVar2.f34641f = 0.55f;
        xcVar2.f34642g = 128;
        e(0, false);
    }

    public final void a(float f10, float f11, float f12, float[] fArr) {
        double d = f12;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f13 = this.f34924j;
        fArr[0] = (f13 * cos) + f10;
        fArr[1] = (f13 * sin) + f11;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, xc xcVar, float f10, float f11, float f12) {
        int i9;
        char c10;
        char c11;
        int i10;
        int i11 = xcVar.f34657x;
        if (i11 == 0) {
            return;
        }
        float f13 = xcVar.f34639c;
        float f14 = this.v;
        float f15 = ((xcVar.d - f13) * f14) + f13;
        float B = e2.c.B(f14, 1.0f, 0.0f, this.d * xcVar.f34640e);
        float[] fArr = xcVar.f34655u;
        float[] fArr2 = xcVar.v;
        float[] fArr3 = xcVar.f34656w;
        char c12 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            float interpolation = H.getInterpolation(xcVar.f34649o[i12]);
            float f16 = 1.0f - interpolation;
            fArr[i12] = (xcVar.f34646l[i12] * interpolation) + (xcVar.f34645k[i12] * f16);
            fArr3[i12] = (xcVar.f34648n[i12] * interpolation) + (xcVar.f34647m[i12] * f16);
        }
        float f17 = this.f34922g;
        char c13 = 2;
        if (f17 > 0.0f) {
            int i13 = 0;
            while (i13 < 2) {
                int i14 = 0;
                while (i14 < i11) {
                    int i15 = i14 == 0 ? i11 - 1 : i14 - 1;
                    int i16 = i14 + 1;
                    if (i16 == i11) {
                        i10 = 0;
                    } else {
                        i10 = i16;
                    }
                    float f18 = fArr[i14];
                    fArr2[i14] = e2.c.z((fArr[i15] + fArr[i10]) * 0.5f, f18, f17, f18);
                    i14 = i16;
                }
                i13++;
                float[] fArr4 = fArr2;
                fArr2 = fArr;
                fArr = fArr4;
            }
        }
        int i17 = 0;
        while (i17 < i11) {
            float f19 = (i17 / i11) + fArr3[i17];
            float floor = (f19 - ((float) Math.floor(f19))) * this.f34930p;
            float f20 = this.f34927m;
            float[] fArr5 = this.f34939z;
            if (floor < f20) {
                fArr5[c12] = (-this.f34925k) + floor;
                fArr5[1] = -this.f34923i;
                fArr5[c13] = 1.0f;
                fArr5[3] = 0.0f;
                c10 = 0;
                c11 = 2;
            } else {
                float f21 = floor - f20;
                float f22 = this.f34929o;
                c10 = 0;
                float f23 = this.f34919c;
                if (f21 < f22) {
                    c11 = 2;
                    a(this.f34925k, -this.f34926l, (f21 / (f23 * this.f34924j)) - 1.5707964f, fArr5);
                } else {
                    c11 = 2;
                    float f24 = f21 - f22;
                    float f25 = this.f34928n;
                    if (f24 < f25) {
                        fArr5[0] = this.h;
                        fArr5[1] = (-this.f34926l) + f24;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f26 = f24 - f25;
                        if (f26 < f22) {
                            a(this.f34925k, this.f34926l, f26 / (f23 * this.f34924j), fArr5);
                        } else {
                            float f27 = f26 - f22;
                            if (f27 < f20) {
                                fArr5[0] = this.f34925k - f27;
                                fArr5[1] = this.f34923i;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f28 = f27 - f20;
                                if (f28 < f22) {
                                    a(-this.f34925k, this.f34926l, (f28 / (f23 * this.f34924j)) + 1.5707964f, fArr5);
                                } else {
                                    float f29 = f28 - f22;
                                    if (f29 < f25) {
                                        fArr5[0] = -this.h;
                                        fArr5[1] = this.f34926l - f29;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.f34925k, -this.f34926l, ((f29 - f25) / (f23 * this.f34924j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f30 = fArr5[3];
            float f31 = (fArr[i17] * B) + f15 + f12;
            xcVar.f34651q[i17] = (f30 * f31) + f10 + fArr5[c10];
            xcVar.f34652r[i17] = ((-fArr5[c11]) * f31) + f11 + fArr5[1];
            xcVar.f34653s[i17] = fArr5[c11];
            xcVar.f34654t[i17] = fArr5[3];
            i17++;
            c12 = 0;
            c13 = 2;
        }
        Path path = this.f34938y;
        path.rewind();
        path.moveTo(xcVar.f34651q[0], xcVar.f34652r[0]);
        int i18 = 0;
        while (i18 < i11) {
            int i19 = i18 + 1;
            if (i19 < i11) {
                i9 = i19;
            } else {
                i9 = 0;
            }
            float[] fArr6 = xcVar.f34651q;
            float f32 = fArr6[i9] - fArr6[i18];
            float[] fArr7 = xcVar.f34652r;
            float f33 = fArr7[i9] - fArr7[i18];
            float sqrt = ((float) Math.sqrt((f33 * f33) + (f32 * f32))) / 3.0f;
            float[] fArr8 = xcVar.f34651q;
            float f34 = fArr8[i18];
            float[] fArr9 = xcVar.f34653s;
            float f35 = (fArr9[i18] * sqrt) + f34;
            float[] fArr10 = xcVar.f34652r;
            float f36 = fArr10[i18];
            float[] fArr11 = xcVar.f34654t;
            float f37 = fArr8[i9];
            float f38 = fArr10[i9];
            path.cubicTo(f35, (fArr11[i18] * sqrt) + f36, f37 - (fArr9[i9] * sqrt), f38 - (fArr11[i9] * sqrt), f37, f38);
            i18 = i19;
        }
        path.close();
        canvas.drawPath(path, xcVar.f34643i);
    }

    public final float c() {
        xc xcVar = this.f34931q;
        float f10 = xcVar.d;
        float f11 = xcVar.f34641f;
        float f12 = this.f34920e;
        float f13 = (f11 * f12) + f10;
        float f14 = xcVar.f34640e;
        float f15 = this.d;
        float f16 = (f14 * f15) + f13;
        xc xcVar2 = this.f34932r;
        float f17 = xcVar2.d;
        return Math.max(f16, (f15 * xcVar2.f34640e) + (f12 * xcVar2.f34641f) + f17);
    }

    public final void d(float f10) {
        float f11;
        this.f34936w = f10;
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        float f12 = this.f34936w - this.v;
        if (f12 > 0.0f) {
            f11 = 400.0f;
        } else {
            f11 = 500.0f;
        }
        this.f34937x = f12 / ((f11 * 0.55f) + 100.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f34935u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f34934t));
            }
            this.f34934t = elapsedRealtime;
            boolean isEnabled = LiteMode.isEnabled(512);
            xc xcVar = this.f34932r;
            xc xcVar2 = this.f34931q;
            if (isEnabled && min > 0) {
                float f10 = this.f34936w;
                float f11 = this.v;
                if (f10 != f11) {
                    float f12 = this.f34937x;
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
                this.f34933s = org.telegram.ui.Cells.j2.b((float) min, this.f34921f, 6.2831855f, this.f34933s);
                xcVar2.d(this.v);
                xcVar.d(this.v);
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
                xcVar2.h = d;
                xcVar.h = d;
                xcVar2.a();
                xcVar.a();
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f16 = 1.0f - (this.v * 0.7f);
            float f17 = xcVar2.f34641f;
            float f18 = this.f34920e;
            float B = e2.c.B((float) Math.sin(this.f34933s), 0.5f, 0.5f, f17 * f18 * f16);
            float B2 = e2.c.B((float) Math.sin(this.f34933s + xcVar.f34638b), 0.5f, 0.5f, f18 * xcVar.f34641f * f16);
            b(canvas, this.f34931q, exactCenterX, exactCenterY, B);
            b(canvas, this.f34932r, exactCenterX, exactCenterY, B2);
            if (this.E < 1.0f) {
                invalidateSelf();
            }
        }
    }

    public final void e(int i9, boolean z10) {
        int d;
        if (i9 == this.A && this.E >= 1.0f) {
            return;
        }
        this.A = i9;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    d = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22975bh, false);
                } else {
                    d = i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23101ih, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23119jh, false)), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23137kh, false));
                }
            } else {
                d = i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Zg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22957ah, false));
            }
        } else {
            d = i0.a.d(0.5f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Xg, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Yg, false));
        }
        if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
            this.C = this.B;
            this.D = d;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            this.B = d;
            xc xcVar = this.f34931q;
            xcVar.h = d;
            xc xcVar2 = this.f34932r;
            xcVar2.h = d;
            xcVar.a();
            xcVar2.a();
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
            this.f34923i = height;
            float f10 = this.h;
            if (f10 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f34917a, Math.min(f10, height));
                this.f34924j = min2;
                float f11 = this.h - min2;
                this.f34925k = f11;
                float f12 = this.f34923i - min2;
                this.f34926l = f12;
                float f13 = f11 * 2.0f;
                this.f34927m = f13;
                float f14 = f12 * 2.0f;
                this.f34928n = f14;
                float f15 = this.f34919c * 1.5707964f * min2;
                this.f34929o = f15;
                float f16 = (f14 * 2.0f) + (f13 * 2.0f);
                this.f34930p = (f15 * 4.0f) + f16;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f16) / this.f34918b)));
                xc xcVar = this.f34931q;
                if (max != xcVar.f34657x) {
                    xcVar.c(max);
                    this.f34932r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i9) {
        if (this.G != i9) {
            this.G = i9;
            xc xcVar = this.f34931q;
            xcVar.f34658y = i9;
            xcVar.a();
            xc xcVar2 = this.f34932r;
            xcVar2.f34658y = i9;
            xcVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34931q.f34643i.setColorFilter(colorFilter);
        this.f34932r.f34643i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
