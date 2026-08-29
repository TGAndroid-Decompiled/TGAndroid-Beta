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
public final class cd extends Drawable {
    public static final gh.a H = new gh.a(1);
    public int B;
    public int C;
    public int D;
    public float h;
    public float f27442i;
    public float f27443j;
    public float f27444k;
    public float f27445l;
    public float f27446m;
    public float f27447n;
    public float f27448o;
    public float f27449p;
    public final bd f27450q;
    public final bd f27451r;
    public float f27452s;
    public long f27453t;
    public boolean f27454u;
    public float v;
    public float f27455w;
    public float f27456x;
    public final float f27436a = AndroidUtilities.dp(18.0f);
    public final float f27437b = AndroidUtilities.dp(22.0f);
    public final float f27438c = 2.4f;
    public final float d = AndroidUtilities.dp(12.0f);
    public final float f27439e = AndroidUtilities.dp(1.5f);
    public final float f27440f = 3600.0f;
    public final float f27441g = 0.25f;
    public final Path f27457y = new Path();
    public final float[] f27458z = new float[4];
    public int A = -1;
    public float E = 1.0f;
    public final ig F = new ig(this, 16);
    public int G = 255;

    public cd() {
        bd bdVar = new bd();
        this.f27450q = bdVar;
        bdVar.f27032a = 1.0f;
        bdVar.f27033b = 0.0f;
        bdVar.f27034c = AndroidUtilities.dp(0.5f);
        bdVar.d = AndroidUtilities.dp(8.5f);
        bdVar.f27035e = 1.0f;
        bdVar.f27036f = 1.0f;
        bdVar.f27037g = 61;
        bd bdVar2 = new bd();
        this.f27451r = bdVar2;
        bdVar2.f27032a = 0.82f;
        bdVar2.f27033b = 0.6f;
        bdVar2.f27034c = AndroidUtilities.dp(0.0f);
        bdVar2.d = AndroidUtilities.dp(4.25f);
        bdVar2.f27035e = 0.55f;
        bdVar2.f27036f = 0.55f;
        bdVar2.f27037g = 128;
        e(0, false);
    }

    public final void a(float f9, float f10, float f11, float[] fArr) {
        double d = f11;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f12 = this.f27443j;
        fArr[0] = (f12 * cos) + f9;
        fArr[1] = (f12 * sin) + f10;
        fArr[2] = -sin;
        fArr[3] = cos;
    }

    public final void b(Canvas canvas, bd bdVar, float f9, float f10, float f11) {
        int i10;
        char c3;
        char c6;
        int i11;
        int i12 = bdVar.f27052x;
        if (i12 == 0) {
            return;
        }
        float f12 = bdVar.f27034c;
        float f13 = this.v;
        float f14 = ((bdVar.d - f12) * f13) + f12;
        float B = com.google.android.recaptcha.internal.a.B(f13, 1.0f, 0.0f, this.d * bdVar.f27035e);
        float[] fArr = bdVar.f27050u;
        float[] fArr2 = bdVar.v;
        float[] fArr3 = bdVar.f27051w;
        char c10 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            float interpolation = H.getInterpolation(bdVar.f27044o[i13]);
            float f15 = 1.0f - interpolation;
            fArr[i13] = (bdVar.f27041l[i13] * interpolation) + (bdVar.f27040k[i13] * f15);
            fArr3[i13] = (bdVar.f27043n[i13] * interpolation) + (bdVar.f27042m[i13] * f15);
        }
        float f16 = this.f27441g;
        char c11 = 2;
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
                    fArr2[i15] = com.google.android.recaptcha.internal.a.z((fArr[i16] + fArr[i11]) * 0.5f, f17, f16, f17);
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
            float floor = (f18 - ((float) Math.floor(f18))) * this.f27449p;
            float f19 = this.f27446m;
            float[] fArr5 = this.f27458z;
            if (floor < f19) {
                fArr5[c10] = (-this.f27444k) + floor;
                fArr5[1] = -this.f27442i;
                fArr5[c11] = 1.0f;
                fArr5[3] = 0.0f;
                c3 = 0;
                c6 = 2;
            } else {
                float f20 = floor - f19;
                float f21 = this.f27448o;
                c3 = 0;
                float f22 = this.f27438c;
                if (f20 < f21) {
                    c6 = 2;
                    a(this.f27444k, -this.f27445l, (f20 / (f22 * this.f27443j)) - 1.5707964f, fArr5);
                } else {
                    c6 = 2;
                    float f23 = f20 - f21;
                    float f24 = this.f27447n;
                    if (f23 < f24) {
                        fArr5[0] = this.h;
                        fArr5[1] = (-this.f27445l) + f23;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                    } else {
                        float f25 = f23 - f24;
                        if (f25 < f21) {
                            a(this.f27444k, this.f27445l, f25 / (f22 * this.f27443j), fArr5);
                        } else {
                            float f26 = f25 - f21;
                            if (f26 < f19) {
                                fArr5[0] = this.f27444k - f26;
                                fArr5[1] = this.f27442i;
                                fArr5[2] = -1.0f;
                                fArr5[3] = 0.0f;
                            } else {
                                float f27 = f26 - f19;
                                if (f27 < f21) {
                                    a(-this.f27444k, this.f27445l, (f27 / (f22 * this.f27443j)) + 1.5707964f, fArr5);
                                } else {
                                    float f28 = f27 - f21;
                                    if (f28 < f24) {
                                        fArr5[0] = -this.h;
                                        fArr5[1] = this.f27445l - f28;
                                        fArr5[2] = 0.0f;
                                        fArr5[3] = -1.0f;
                                    } else {
                                        a(-this.f27444k, -this.f27445l, ((f28 - f24) / (f22 * this.f27443j)) + 3.1415927f, fArr5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            float f29 = fArr5[3];
            float f30 = (fArr[i18] * B) + f14 + f11;
            bdVar.f27046q[i18] = (f29 * f30) + f9 + fArr5[c3];
            bdVar.f27047r[i18] = ((-fArr5[c6]) * f30) + f10 + fArr5[1];
            bdVar.f27048s[i18] = fArr5[c6];
            bdVar.f27049t[i18] = fArr5[3];
            i18++;
            c10 = 0;
            c11 = 2;
        }
        Path path = this.f27457y;
        path.rewind();
        path.moveTo(bdVar.f27046q[0], bdVar.f27047r[0]);
        int i19 = 0;
        while (i19 < i12) {
            int i20 = i19 + 1;
            if (i20 < i12) {
                i10 = i20;
            } else {
                i10 = 0;
            }
            float[] fArr6 = bdVar.f27046q;
            float f31 = fArr6[i10] - fArr6[i19];
            float[] fArr7 = bdVar.f27047r;
            float f32 = fArr7[i10] - fArr7[i19];
            float sqrt = ((float) Math.sqrt((f32 * f32) + (f31 * f31))) / 3.0f;
            float[] fArr8 = bdVar.f27046q;
            float f33 = fArr8[i19];
            float[] fArr9 = bdVar.f27048s;
            float f34 = (fArr9[i19] * sqrt) + f33;
            float[] fArr10 = bdVar.f27047r;
            float f35 = fArr10[i19];
            float[] fArr11 = bdVar.f27049t;
            float f36 = fArr8[i10];
            float f37 = fArr10[i10];
            path.cubicTo(f34, (fArr11[i19] * sqrt) + f35, f36 - (fArr9[i10] * sqrt), f37 - (fArr11[i10] * sqrt), f36, f37);
            i19 = i20;
        }
        path.close();
        canvas.drawPath(path, bdVar.f27038i);
    }

    public final float c() {
        bd bdVar = this.f27450q;
        float f9 = bdVar.d;
        float f10 = bdVar.f27036f;
        float f11 = this.f27439e;
        float f12 = (f10 * f11) + f9;
        float f13 = bdVar.f27035e;
        float f14 = this.d;
        float f15 = (f13 * f14) + f12;
        bd bdVar2 = this.f27451r;
        float f16 = bdVar2.d;
        return Math.max(f15, (f14 * bdVar2.f27035e) + (f11 * bdVar2.f27036f) + f16);
    }

    public final void d(float f9) {
        float f10;
        this.f27455w = f9;
        if (!LiteMode.isEnabled(512)) {
            return;
        }
        float f11 = this.f27455w - this.v;
        if (f11 > 0.0f) {
            f10 = 400.0f;
        } else {
            f10 = 500.0f;
        }
        this.f27456x = f11 / ((f10 * 0.55f) + 100.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        long min;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.h >= 1.0f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.f27454u && this.E >= 1.0f) {
                min = 0;
            } else {
                min = Math.min(40L, Math.max(0L, elapsedRealtime - this.f27453t));
            }
            this.f27453t = elapsedRealtime;
            boolean isEnabled = LiteMode.isEnabled(512);
            bd bdVar = this.f27451r;
            bd bdVar2 = this.f27450q;
            if (isEnabled && min > 0) {
                float f9 = this.f27455w;
                float f10 = this.v;
                if (f9 != f10) {
                    float f11 = this.f27456x;
                    float f12 = (((float) min) * f11) + f10;
                    this.v = f12;
                    if (f11 > 0.0f) {
                        if (f12 > f9) {
                            this.v = f9;
                        }
                    } else if (f12 < f9) {
                        this.v = f9;
                    }
                }
                this.f27452s = u3.c.c((float) min, this.f27440f, 6.2831855f, this.f27452s);
                bdVar2.d(this.v);
                bdVar.d(this.v);
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
                bdVar2.h = d;
                bdVar.h = d;
                bdVar2.a();
                bdVar.a();
            }
            float exactCenterX = bounds.exactCenterX();
            float exactCenterY = bounds.exactCenterY();
            float f15 = 1.0f - (this.v * 0.7f);
            float f16 = bdVar2.f27036f;
            float f17 = this.f27439e;
            float B = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.f27452s), 0.5f, 0.5f, f16 * f17 * f15);
            float B2 = com.google.android.recaptcha.internal.a.B((float) Math.sin(this.f27452s + bdVar.f27033b), 0.5f, 0.5f, f17 * bdVar.f27036f * f15);
            b(canvas, this.f27450q, exactCenterX, exactCenterY, B);
            b(canvas, this.f27451r, exactCenterX, exactCenterY, B2);
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
                    d = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23038bh, false);
                } else {
                    d = i0.a.d(0.5f, i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23162ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181jh, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23199kh, false));
                }
            } else {
                d = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Zg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23019ah, false));
            }
        } else {
            d = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yg, false));
        }
        if (z10 && this.B != 0 && LiteMode.isEnabled(512)) {
            this.C = this.B;
            this.D = d;
            this.E = 0.0f;
        } else {
            this.E = 1.0f;
            this.B = d;
            bd bdVar = this.f27450q;
            bdVar.h = d;
            bd bdVar2 = this.f27451r;
            bdVar2.h = d;
            bdVar.a();
            bdVar2.a();
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
            float c3 = c() + AndroidUtilities.dp(1.0f);
            float min = (Math.min(bounds.width(), bounds.height()) / 2.0f) - AndroidUtilities.dp(2.0f);
            if (c3 > min) {
                c3 = Math.max(0.0f, min);
            }
            this.h = (bounds.width() / 2.0f) - c3;
            float height = (bounds.height() / 2.0f) - c3;
            this.f27442i = height;
            float f9 = this.h;
            if (f9 >= 1.0f && height >= 1.0f) {
                float min2 = Math.min(this.f27436a, Math.min(f9, height));
                this.f27443j = min2;
                float f10 = this.h - min2;
                this.f27444k = f10;
                float f11 = this.f27442i - min2;
                this.f27445l = f11;
                float f12 = f10 * 2.0f;
                this.f27446m = f12;
                float f13 = f11 * 2.0f;
                this.f27447n = f13;
                float f14 = this.f27438c * 1.5707964f * min2;
                this.f27448o = f14;
                float f15 = (f13 * 2.0f) + (f12 * 2.0f);
                this.f27449p = (f14 * 4.0f) + f15;
                int max = Math.max(12, Math.min(80, Math.round(((min2 * 6.2831855f) + f15) / this.f27437b)));
                bd bdVar = this.f27450q;
                if (max != bdVar.f27052x) {
                    bdVar.c(max);
                    this.f27451r.c(max);
                }
            }
        }
    }

    @Override
    public final void setAlpha(int i10) {
        if (this.G != i10) {
            this.G = i10;
            bd bdVar = this.f27450q;
            bdVar.f27053y = i10;
            bdVar.a();
            bd bdVar2 = this.f27451r;
            bdVar2.f27053y = i10;
            bdVar2.a();
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27450q.f27038i.setColorFilter(colorFilter);
        this.f27451r.f27038i.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
