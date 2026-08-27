package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.util.Random;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class a9 {
    public float A;
    public boolean B;

    public boolean f26662a;
    public boolean d;

    public ValueAnimator f26666f;

    public boolean f26667g;

    public Runnable f26669j;

    public int f26670k;

    public boolean f26671l;

    public final boolean f26672m;

    public int f26673n;

    public int f26674o;

    public int f26675p;

    public final View f26677r;

    public int f26678s;

    public boolean f26681w;

    public boolean f26682x;

    public jh.t6 f26683y;

    public final Random f26684z;

    public final z8[] f26663b = new z8[3];

    public final z8[] f26664c = new z8[3];

    public float f26665e = 1.0f;
    public final Paint h = new Paint(1);

    public final Paint f26668i = new Paint(1);

    public int f26676q = AndroidUtilities.dp(1.67f);

    public float f26679t = 0.8f;

    public float f26680u = 1.0f;
    public long v = 220;

    public a9(View view, boolean z10) {
        er erVar = er.f28122f;
        this.f26684z = new Random();
        this.f26677r = view;
        for (int i10 = 0; i10 < 3; i10++) {
            z8[] z8VarArr = this.f26663b;
            z8 z8Var = new z8();
            z8VarArr[i10] = z8Var;
            z8Var.f35192e = new ImageReceiver(view);
            this.f26663b[i10].f35192e.setInvalidateAll(true);
            this.f26663b[i10].f35192e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f26663b[i10].f35189a = new y8((org.telegram.ui.ActionBar.c6) null);
            this.f26663b[i10].f35189a.u(AndroidUtilities.dp(12.0f));
            z8[] z8VarArr2 = this.f26664c;
            z8 z8Var2 = new z8();
            z8VarArr2[i10] = z8Var2;
            z8Var2.f35192e = new ImageReceiver(view);
            this.f26664c[i10].f35192e.setInvalidateAll(true);
            this.f26664c[i10].f35192e.setRoundRadius(AndroidUtilities.dp(12.0f));
            this.f26664c[i10].f35189a = new y8((org.telegram.ui.ActionBar.c6) null);
            this.f26664c[i10].f35189a.u(AndroidUtilities.dp(12.0f));
        }
        this.f26672m = z10;
        this.f26668i.setColor(0);
        this.f26668i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a() {
        b(false, true);
    }

    public final void b(boolean z10, boolean z11) {
        z8[] z8VarArr;
        z8[] z8VarArr2;
        if (!this.d || !z10) {
            this.f26665e = 1.0f;
            n();
            return;
        }
        z8[] z8VarArr3 = new z8[3];
        int i10 = 0;
        boolean z12 = false;
        while (true) {
            z8VarArr = this.f26663b;
            z8VarArr2 = this.f26664c;
            if (i10 >= 3) {
                break;
            }
            z8VarArr3[i10] = z8VarArr[i10];
            z8 z8Var = z8VarArr[i10];
            long j10 = z8Var.f35194g;
            z8 z8Var2 = z8VarArr2[i10];
            if (j10 != z8Var2.f35194g) {
                z12 = true;
            } else {
                z8Var.d = z8Var2.d;
            }
            i10++;
        }
        if (!z12) {
            this.f26665e = 1.0f;
            return;
        }
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= 3) {
                    z8VarArr2[i11].f35195i = 0;
                    break;
                }
                if (z8VarArr[i12].f35194g == z8VarArr2[i11].f35194g) {
                    z8VarArr3[i12] = null;
                    if (i11 == i12) {
                        z8 z8Var3 = z8VarArr2[i11];
                        z8Var3.f35195i = -1;
                        org.telegram.ui.Cells.z3 z3Var = z8Var3.f35190b;
                        z8 z8Var4 = z8VarArr[i11];
                        z8Var3.f35190b = z8Var4.f35190b;
                        z8Var4.f35190b = z3Var;
                        break;
                    }
                    z8 z8Var5 = z8VarArr2[i11];
                    z8Var5.f35195i = 2;
                    z8Var5.f35196j = i12;
                    break;
                }
                i12++;
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            z8 z8Var6 = z8VarArr3[i13];
            if (z8Var6 != null) {
                z8Var6.f35195i = 1;
            }
        }
        ValueAnimator valueAnimator = this.f26666f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f26666f.cancel();
            if (this.f26681w) {
                n();
                this.f26681w = false;
            }
        }
        this.f26665e = 0.0f;
        if (z11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f26666f = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new e6(this, 4));
            this.f26666f.addListener(new org.telegram.ui.am(this, 9));
            this.f26666f.setDuration(this.v);
            this.f26666f.setInterpolator(er.f28122f);
            this.f26666f.start();
        } else {
            this.f26681w = true;
        }
        f();
    }

    public final float c() {
        return this.A;
    }

    public final int d() {
        int i10 = this.f26678s;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f26670k;
        return AndroidUtilities.dp((i11 == 4 || i11 == 10) ? 32.0f : 24.0f);
    }

    public final float e() {
        int iDp;
        int i10 = this.f26670k;
        boolean z10 = i10 == 4 || i10 == 10;
        if (i10 == 11) {
            iDp = AndroidUtilities.dp(12.0f);
        } else {
            int i11 = this.f26678s;
            iDp = i11 != 0 ? (int) (i11 * this.f26679t) : AndroidUtilities.dp(z10 ? 24.0f : 20.0f);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            if (this.f26663b[i13].f35194g != 0) {
                i12++;
            }
        }
        return (Math.max(0, i12 - 1) * iDp) + (i12 > 0 ? d() : 0);
    }

    public final void f() {
        View view = this.f26677r;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void g() {
        if (this.B) {
            return;
        }
        this.B = true;
        for (int i10 = 0; i10 < 3; i10++) {
            this.f26663b[i10].f35192e.onAttachedToWindow();
            this.f26664c[i10].f35192e.onAttachedToWindow();
        }
    }

    public final void h() {
        if (this.B) {
            this.B = false;
            this.d = false;
            for (int i10 = 0; i10 < 3; i10++) {
                this.f26663b[i10].f35192e.onDetachedFromWindow();
                this.f26664c[i10].f35192e.onDetachedFromWindow();
            }
            if (this.f26670k == 3) {
                org.telegram.ui.ActionBar.g6.D0().a(0.0f);
            }
        }
    }

    public final void i(Canvas canvas) {
        int iDp;
        z8[] z8VarArr;
        z8[] z8VarArr2;
        Canvas canvas2;
        z8[] z8VarArr3;
        int i10;
        float f10;
        float f11;
        boolean z10;
        float f12;
        float f13;
        int i11;
        Paint paint;
        int i12;
        float f14;
        z8 z8Var;
        z8 z8Var2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        float fB;
        int i13;
        float f15;
        int iX;
        float f16;
        float f17;
        int iX2;
        float f18;
        boolean z11;
        float f19;
        int iX3;
        float f20;
        int iX4;
        boolean z12 = true;
        this.d = true;
        int i14 = this.f26670k;
        int i15 = 10;
        boolean z13 = i14 == 4 || i14 == 10;
        int iD = d();
        if (this.f26670k == 11) {
            iDp = AndroidUtilities.dp(12.0f);
        } else {
            int i16 = this.f26678s;
            iDp = i16 != 0 ? (int) (i16 * this.f26679t) : AndroidUtilities.dp(z13 ? 24.0f : 20.0f);
        }
        int i17 = iDp;
        int i18 = 0;
        while (true) {
            z8VarArr = this.f26663b;
            if (i18 >= 3) {
                break;
            }
            long j10 = z8VarArr[i18].f35194g;
            i18++;
        }
        int i19 = this.f26670k;
        int iDp2 = (i19 == 0 || i19 == 10 || i19 == 11) ? 0 : AndroidUtilities.dp(10.0f);
        int iE = this.f26671l ? (this.f26675p - ((int) e())) / 2 : iDp2;
        boolean z14 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().isMicMute();
        int i20 = this.f26670k;
        Paint paint2 = this.h;
        if (i20 == 4) {
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23374v7, false));
        } else if (i20 != 3) {
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, z14 ? org.telegram.ui.ActionBar.g6.f23442z7 : org.telegram.ui.ActionBar.g6.f23424y7, false));
        }
        int i21 = 0;
        int i22 = 0;
        while (true) {
            z8VarArr2 = this.f26664c;
            if (i21 >= 3) {
                break;
            }
            z8[] z8VarArr4 = z8VarArr;
            if (z8VarArr2[i21].f35194g != 0) {
                i22++;
            }
            i21++;
            z8VarArr = z8VarArr4;
        }
        z8[] z8VarArr5 = z8VarArr;
        int i23 = this.f26670k;
        boolean z15 = i23 == 0 || i23 == 1 || i23 == 3 || i23 == 4 || i23 == 5 || i23 == 10 || i23 == 11;
        if (z15) {
            float fDp = i23 == 10 ? AndroidUtilities.dp(16.0f) : 0.0f;
            if (this.f26682x) {
                fDp += AndroidUtilities.dp(20.0f);
            }
            float f21 = -fDp;
            float f22 = this.f26675p + fDp;
            float f23 = this.f26674o + fDp;
            z8VarArr3 = z8VarArr2;
            i10 = 2;
            f10 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f21, f21, f22, f23, 255, 31);
        } else {
            canvas2 = canvas;
            z8VarArr3 = z8VarArr2;
            i10 = 2;
            f10 = 0.0f;
        }
        this.A = f10;
        boolean z16 = this.f26682x;
        View view = this.f26677r;
        float f24 = 1.0f;
        if (z16) {
            int i24 = 2;
            while (i24 >= 0) {
                int i25 = 0;
                while (i25 < i10) {
                    if (i25 == 0 && this.f26665e == f24) {
                        i24 = i24;
                    } else {
                        z8[] z8VarArr6 = i25 == 0 ? z8VarArr3 : z8VarArr5;
                        if (i25 != z12 || this.f26665e == f24 || z8VarArr6[i24].f35195i == z12) {
                            ImageReceiver imageReceiver = z8VarArr6[i24].f35192e;
                            if (imageReceiver.hasImageSet()) {
                                if (i25 == 0) {
                                    if (this.f26671l) {
                                        f18 = 1.0f;
                                        iX4 = org.telegram.messenger.rl.x(z13 ? 8.0f : 4.0f, this.f26675p - (i22 * i17), i10);
                                    } else {
                                        f18 = 1.0f;
                                        iX4 = iDp2;
                                    }
                                    imageReceiver.setImageX((i17 * i24) + iX4);
                                } else {
                                    f18 = 1.0f;
                                    imageReceiver.setImageX((i17 * i24) + iE);
                                }
                                int i26 = this.f26670k;
                                if (i26 == 0 || i26 == i15 || i26 == 11) {
                                    imageReceiver.setImageY((this.f26674o - iD) / 2.0f);
                                } else {
                                    imageReceiver.setImageY(AndroidUtilities.dp(i26 == 4 ? 8.0f : 6.0f));
                                }
                                if (this.f26665e == f18) {
                                    z11 = false;
                                    f19 = 1.0f;
                                } else {
                                    int i27 = z8VarArr6[i24].f35195i;
                                    if (i27 == z12) {
                                        canvas2.save();
                                        float f25 = f18 - this.f26665e;
                                        canvas2.scale(f25, f25, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f20 = f18 - this.f26665e;
                                    } else if (i27 == 0) {
                                        canvas2.save();
                                        float f26 = this.f26665e;
                                        canvas2.scale(f26, f26, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        f20 = this.f26665e;
                                    } else {
                                        if (i27 == i10) {
                                            if (this.f26671l) {
                                                iX3 = org.telegram.messenger.rl.x(z13 ? 8.0f : 4.0f, this.f26675p - (i22 * i17), i10);
                                            } else {
                                                iX3 = iDp2;
                                            }
                                            int i28 = (i17 * i24) + iX3;
                                            int i29 = (z8VarArr6[i24].f35196j * i17) + iE;
                                            float f27 = this.f26665e;
                                            imageReceiver.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f27, i29, i28 * f27));
                                        } else if (i27 == -1 && this.f26671l) {
                                            int i30 = i17 * i24;
                                            int iX5 = org.telegram.messenger.rl.x(z13 ? 8.0f : 4.0f, this.f26675p - (i22 * i17), i10) + i30;
                                            float f28 = this.f26665e;
                                            imageReceiver.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f28, iE + i30, iX5 * f28));
                                        }
                                        z11 = false;
                                        f19 = 1.0f;
                                    }
                                    f19 = f20;
                                    z11 = true;
                                }
                                float f29 = f19 * this.f26680u;
                                float fD = (d() / 2.0f) + AndroidUtilities.dp(4.0f);
                                if (this.f26683y == null) {
                                    jh.t6 t6Var = new jh.t6();
                                    int i31 = org.telegram.ui.ActionBar.g6.Tg;
                                    t6Var.f14002n = i31;
                                    int i32 = org.telegram.ui.ActionBar.g6.Vg;
                                    t6Var.f14003o = i32;
                                    t6Var.f27290a = z12;
                                    t6Var.d(org.telegram.ui.ActionBar.g6.w0(null, i31, false), org.telegram.ui.ActionBar.g6.w0(null, i32, false), 0, 0);
                                    this.f26683y = t6Var;
                                }
                                this.f26683y.b(0.0f, 0.0f, view.getMeasuredHeight(), AndroidUtilities.dp(40.0f));
                                this.f26683y.f27292c.setAlpha((int) (f29 * 255.0f));
                                canvas2.drawCircle(imageReceiver.getCenterX(), imageReceiver.getCenterY(), fD, this.f26683y.f27292c);
                                if (z11) {
                                    canvas2.restore();
                                }
                            } else {
                                i24 = i24;
                            }
                        } else {
                            i24 = i24;
                        }
                    }
                    i25++;
                    i24 = i24;
                    f24 = 1.0f;
                    z12 = true;
                    i15 = 10;
                    i10 = 2;
                }
                i24--;
                f24 = 1.0f;
                z12 = true;
                i15 = 10;
                i10 = 2;
            }
        }
        for (int i33 = 2; i33 >= 0; i33--) {
            int i34 = 0;
            while (i34 < 2) {
                if (i34 == 0) {
                    f11 = 1.0f;
                    if (this.f26665e == 1.0f) {
                        i12 = i34;
                    }
                    i34 = i12 + 1;
                } else {
                    f11 = 1.0f;
                }
                z8[] z8VarArr7 = i34 == 0 ? z8VarArr3 : z8VarArr5;
                if (i34 != 1 || this.f26665e == f11 || z8VarArr7[i33].f35195i == 1) {
                    ImageReceiver imageReceiver2 = z8VarArr7[i33].f35192e;
                    if (imageReceiver2.hasImageSet()) {
                        if (i34 == 0) {
                            if (this.f26671l) {
                                iX2 = org.telegram.messenger.rl.x(z13 ? 8.0f : 4.0f, this.f26675p - (i22 * i17), 2);
                            } else {
                                iX2 = iDp2;
                            }
                            imageReceiver2.setImageX((i17 * i33) + iX2);
                        } else {
                            imageReceiver2.setImageX((i17 * i33) + iE);
                        }
                        int i35 = this.f26670k;
                        if (i35 != 0 && i35 != 10) {
                            if (i35 != 11) {
                                imageReceiver2.setImageY(AndroidUtilities.dp(i35 == 4 ? 8.0f : 6.0f));
                            }
                            if (this.f26665e == 1.0f) {
                                z10 = false;
                                f12 = 1.0f;
                            } else {
                                i13 = z8VarArr7[i33].f35195i;
                                if (i13 == 1) {
                                    canvas2.save();
                                    float f30 = 1.0f - this.f26665e;
                                    canvas2.scale(f30, f30, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    f17 = 1.0f - this.f26665e;
                                } else if (i13 == 0) {
                                    canvas2.save();
                                    float f31 = this.f26665e;
                                    canvas2.scale(f31, f31, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                    f17 = this.f26665e;
                                } else {
                                    if (i13 == 2) {
                                        if (this.f26671l) {
                                            int i36 = this.f26675p - (i22 * i17);
                                            if (z13) {
                                                f16 = 8.0f;
                                            } else {
                                                f16 = 4.0f;
                                            }
                                            iX = org.telegram.messenger.rl.x(f16, i36, 2);
                                        } else {
                                            iX = iDp2;
                                        }
                                        int i37 = (i17 * i33) + iX;
                                        int i38 = (z8VarArr7[i33].f35196j * i17) + iE;
                                        float f32 = this.f26665e;
                                        imageReceiver2.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f32, i38, i37 * f32));
                                    } else if (i13 == -1 && this.f26671l) {
                                        int i39 = this.f26675p - (i22 * i17);
                                        if (z13) {
                                            f15 = 8.0f;
                                        } else {
                                            f15 = 4.0f;
                                        }
                                        int iX6 = org.telegram.messenger.rl.x(f15, i39, 2);
                                        int i40 = i17 * i33;
                                        float f33 = this.f26665e;
                                        imageReceiver2.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f33, iE + i40, (iX6 + i40) * f33));
                                    }
                                    z10 = false;
                                    f12 = 1.0f;
                                }
                                f12 = f17;
                                z10 = true;
                            }
                            f13 = f12 * this.f26680u;
                            if (i33 == z8VarArr7.length - 1 || this.f26682x) {
                                i11 = this.f26670k;
                                paint = this.f26668i;
                                if (i11 != 1 || i11 == 3 || i11 == 5) {
                                    i12 = i34;
                                    z10 = z10;
                                    f14 = f13;
                                    canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                                    z8Var = z8VarArr7[i33];
                                    if (z8Var.f35190b == null) {
                                        if (this.f26670k == 5) {
                                            z8Var.f35190b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                        } else {
                                            z8Var.f35190b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                        }
                                    }
                                    if (this.f26670k == 5) {
                                        z8VarArr7[i33].f35190b.d(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false), (int) (f14 * 76.5f)));
                                    }
                                    z8Var2 = z8VarArr7[i33];
                                    groupCallParticipant = z8Var2.f35193f;
                                    if (groupCallParticipant != null || groupCallParticipant.amplitude <= 0.0f) {
                                        z8Var2.f35190b.e(view, false);
                                    } else {
                                        z8Var2.f35190b.e(view, true);
                                        z8 z8Var3 = z8VarArr7[i33];
                                        z8Var3.f35190b.c(z8Var3.f35193f.amplitude * 15.0f);
                                    }
                                    if (this.f26670k == 5 && SystemClock.uptimeMillis() - z8VarArr7[i33].f35193f.lastSpeakTime > 500) {
                                        this.f26669j.run();
                                    }
                                    z8VarArr7[i33].f35190b.f();
                                    if (this.f26670k == 5) {
                                        z8VarArr7[i33].f35190b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                        f();
                                    }
                                    fB = z8VarArr7[i33].f35190b.b();
                                } else if (i11 == 4 || i11 == 10) {
                                    i12 = i34;
                                    canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(17.0f), paint);
                                    z8 z8Var4 = z8VarArr7[i33];
                                    if (z8Var4.f35190b == null) {
                                        z8Var4.f35190b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                    }
                                    if (this.f26670k == 10) {
                                        z8VarArr7[i33].f35190b.d(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false), (int) (f13 * 76.5f)));
                                    } else {
                                        z8VarArr7[i33].f35190b.d(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false), (int) (f13 * 76.5f)));
                                    }
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    z8 z8Var5 = z8VarArr7[i33];
                                    if (jCurrentTimeMillis - z8Var5.f35191c > 100) {
                                        z8Var5.f35191c = jCurrentTimeMillis;
                                        if (this.f26670k == 10) {
                                            TLRPC.GroupCallParticipant groupCallParticipant2 = z8Var5.f35193f;
                                            if (groupCallParticipant2 == null || groupCallParticipant2.amplitude <= 0.0f) {
                                                z8Var5.f35190b.e(view, false);
                                            } else {
                                                z8Var5.f35190b.e(view, true);
                                                z8 z8Var6 = z8VarArr7[i33];
                                                z8Var6.f35190b.c(z8Var6.f35193f.amplitude * 15.0f);
                                            }
                                            f14 = f13;
                                        } else {
                                            long currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                                            z8 z8Var7 = z8VarArr7[i33];
                                            f14 = f13;
                                            if (currentTime - z8Var7.d <= 5) {
                                                z8Var7.f35190b.e(view, true);
                                                z8VarArr7[i33].f35190b.c(this.f26684z.nextInt() % 100);
                                            } else {
                                                z8Var7.f35190b.e(view, false);
                                                z8VarArr7[i33].f35190b.c(0.0d);
                                            }
                                        }
                                    } else {
                                        f14 = f13;
                                    }
                                    z8VarArr7[i33].f35190b.f();
                                    z8VarArr7[i33].f35190b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                    fB = z8VarArr7[i33].f35190b.b();
                                } else {
                                    float fD2 = (d() / 2.0f) + this.f26676q;
                                    if (z15) {
                                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), fD2, paint);
                                        i12 = i34;
                                    } else {
                                        int alpha = paint2.getAlpha();
                                        if (f13 != 1.0f) {
                                            paint2.setAlpha((int) (alpha * f13));
                                        }
                                        i12 = i34;
                                        canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), fD2, paint2);
                                        if (f13 != 1.0f) {
                                            paint2.setAlpha(alpha);
                                        }
                                    }
                                    f14 = f13;
                                    fB = 1.0f;
                                }
                            } else {
                                i12 = i34;
                                f14 = f13;
                                fB = 1.0f;
                            }
                            imageReceiver2.setAlpha(f14);
                            if (fB != 1.0f) {
                                canvas2.save();
                                canvas2.scale(fB, fB, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                imageReceiver2.draw(canvas2);
                                canvas2.restore();
                            } else {
                                imageReceiver2.draw(canvas2);
                            }
                            this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * fB) + imageReceiver2.getCenterX());
                            if (z10) {
                                canvas2.restore();
                            }
                        }
                        imageReceiver2.setImageY((this.f26674o - iD) / 2.0f);
                        if (this.f26665e == 1.0f) {
                            z10 = false;
                            f12 = 1.0f;
                        } else {
                            i13 = z8VarArr7[i33].f35195i;
                            if (i13 == 1) {
                                canvas2.save();
                                float f34 = 1.0f - this.f26665e;
                                canvas2.scale(f34, f34, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                f17 = 1.0f - this.f26665e;
                            } else if (i13 == 0) {
                                canvas2.save();
                                float f35 = this.f26665e;
                                canvas2.scale(f35, f35, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                                f17 = this.f26665e;
                            } else {
                                if (i13 == 2) {
                                    if (this.f26671l) {
                                        int i310 = this.f26675p - (i22 * i17);
                                        if (z13) {
                                            f16 = 8.0f;
                                        } else {
                                            f16 = 4.0f;
                                        }
                                        iX = org.telegram.messenger.rl.x(f16, i310, 2);
                                    } else {
                                        iX = iDp2;
                                    }
                                    int i311 = (i17 * i33) + iX;
                                    int i312 = (z8VarArr7[i33].f35196j * i17) + iE;
                                    float f36 = this.f26665e;
                                    imageReceiver2.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f36, i312, i311 * f36));
                                } else if (i13 == -1) {
                                    int i313 = this.f26675p - (i22 * i17);
                                    if (z13) {
                                        f15 = 8.0f;
                                    } else {
                                        f15 = 4.0f;
                                    }
                                    int iX7 = org.telegram.messenger.rl.x(f15, i313, 2);
                                    int i41 = i17 * i33;
                                    float f37 = this.f26665e;
                                    imageReceiver2.setImageX((int) com.google.android.recaptcha.internal.a.z(1.0f, f37, iE + i41, (iX7 + i41) * f37));
                                }
                                z10 = false;
                                f12 = 1.0f;
                            }
                            f12 = f17;
                            z10 = true;
                        }
                        f13 = f12 * this.f26680u;
                        if (i33 == z8VarArr7.length - 1) {
                            i11 = this.f26670k;
                            paint = this.f26668i;
                            if (i11 != 1) {
                            }
                            i12 = i34;
                            z10 = z10;
                            f14 = f13;
                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                            z8Var = z8VarArr7[i33];
                            if (z8Var.f35190b == null) {
                                if (this.f26670k == 5) {
                                    z8Var.f35190b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                } else {
                                    z8Var.f35190b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                }
                            }
                            if (this.f26670k == 5) {
                                z8VarArr7[i33].f35190b.d(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false), (int) (f14 * 76.5f)));
                            }
                            z8Var2 = z8VarArr7[i33];
                            groupCallParticipant = z8Var2.f35193f;
                            if (groupCallParticipant != null) {
                            }
                            z8Var2.f35190b.e(view, false);
                            if (this.f26670k == 5) {
                                this.f26669j.run();
                            }
                            z8VarArr7[i33].f35190b.f();
                            if (this.f26670k == 5) {
                                z8VarArr7[i33].f35190b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                f();
                            }
                            fB = z8VarArr7[i33].f35190b.b();
                        } else {
                            i11 = this.f26670k;
                            paint = this.f26668i;
                            if (i11 != 1) {
                            }
                            i12 = i34;
                            z10 = z10;
                            f14 = f13;
                            canvas2.drawCircle(imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), AndroidUtilities.dp(13.0f), paint);
                            z8Var = z8VarArr7[i33];
                            if (z8Var.f35190b == null) {
                                if (this.f26670k == 5) {
                                    z8Var.f35190b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                                } else {
                                    z8Var.f35190b = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(21.0f));
                                }
                            }
                            if (this.f26670k == 5) {
                                z8VarArr7[i33].f35190b.d(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false), (int) (f14 * 76.5f)));
                            }
                            z8Var2 = z8VarArr7[i33];
                            groupCallParticipant = z8Var2.f35193f;
                            if (groupCallParticipant != null) {
                            }
                            z8Var2.f35190b.e(view, false);
                            if (this.f26670k == 5) {
                                this.f26669j.run();
                            }
                            z8VarArr7[i33].f35190b.f();
                            if (this.f26670k == 5) {
                                z8VarArr7[i33].f35190b.a(canvas2, imageReceiver2.getCenterX(), imageReceiver2.getCenterY(), view);
                                f();
                            }
                            fB = z8VarArr7[i33].f35190b.b();
                        }
                        imageReceiver2.setAlpha(f14);
                        if (fB != 1.0f) {
                            canvas2.save();
                            canvas2.scale(fB, fB, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                            imageReceiver2.draw(canvas2);
                            canvas2.restore();
                        } else {
                            imageReceiver2.draw(canvas2);
                        }
                        this.A = Math.max(this.A, ((imageReceiver2.getImageWidth() / 2.0f) * fB) + imageReceiver2.getCenterX());
                        if (z10) {
                            canvas2.restore();
                        }
                    } else {
                        i12 = i34;
                    }
                } else {
                    i12 = i34;
                }
                i34 = i12 + 1;
            }
        }
        if (z15) {
            canvas2.restore();
        }
    }

    public final void j(int i10) {
        y8 y8Var;
        y8 y8Var2;
        for (int i11 = 0; i11 < 3; i11++) {
            z8 z8Var = this.f26663b[i11];
            if (z8Var != null && (y8Var2 = z8Var.f35189a) != null) {
                y8Var2.u(i10);
            }
            z8 z8Var2 = this.f26664c[i11];
            if (z8Var2 != null && (y8Var = z8Var2.f35189a) != null) {
                y8Var.u(i10);
            }
        }
    }

    public final void k(int i10) {
        this.f26673n = i10;
        View view = this.f26677r;
        if (view != null) {
            view.requestLayout();
        }
    }

    public final void l(int i10, TLObject tLObject, int i11) {
        TLRPC.User user;
        TLRPC.Chat chat;
        z8[] z8VarArr = this.f26664c;
        z8 z8Var = z8VarArr[i10];
        z8Var.f35194g = 0L;
        z8Var.f35193f = null;
        if (tLObject == null) {
            z8Var.f35192e.setImageBitmap((Drawable) null);
            f();
            return;
        }
        z8Var.d = -1L;
        z8Var.h = tLObject;
        if (tLObject instanceof TLRPC.GroupCallParticipant) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) tLObject;
            z8Var.f35193f = groupCallParticipant;
            long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
            if (DialogObject.isUserDialog(peerId)) {
                user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                z8VarArr[i10].f35189a.m(i11, user);
                chat = null;
            } else {
                TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                z8VarArr[i10].f35189a.k(i11, chat2);
                chat = chat2;
                user = null;
            }
            if (this.f26670k != 4) {
                z8VarArr[i10].d = groupCallParticipant.active_date;
            } else if (peerId == AccountInstance.getInstance(i11).getUserConfig().getClientUserId()) {
                z8VarArr[i10].d = 0L;
            } else if (this.f26672m) {
                z8VarArr[i10].d = groupCallParticipant.lastActiveDate;
            } else {
                z8VarArr[i10].d = groupCallParticipant.active_date;
            }
            z8VarArr[i10].f35194g = peerId;
        } else if (tLObject instanceof TLRPC.User) {
            TLRPC.User user2 = (TLRPC.User) tLObject;
            if (user2.self && this.f26662a) {
                z8Var.f35189a.g(1);
                z8VarArr[i10].f35189a.f34858p = 0.6f;
            } else {
                z8Var.f35189a.g(0);
                y8 y8Var = z8VarArr[i10].f35189a;
                y8Var.f34858p = 1.0f;
                y8Var.m(i11, user2);
            }
            z8VarArr[i10].f35194g = user2.f22527id;
            user = user2;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            z8Var.f35189a.g(0);
            y8 y8Var2 = z8VarArr[i10].f35189a;
            y8Var2.f34858p = 1.0f;
            y8Var2.k(i11, chat);
            z8VarArr[i10].f35194g = -chat.f22380id;
            user = null;
        } else {
            user = null;
            chat = null;
        }
        int iD = d();
        if (tLObject instanceof TL_stories.StoryItem) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
            z8VarArr[i10].f35194g = storyItem.f22617id;
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 50, true, null, false);
                z8VarArr[i10].f35192e.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.document.thumbs, 50, true, closestPhotoSizeWithSize, true), storyItem.media.document), com.google.android.recaptcha.internal.a.l(iD, "_", iD), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.document), com.google.android.recaptcha.internal.a.l(iD, "_", iD), 0L, null, storyItem, 0);
            } else {
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 50, true, null, false);
                    z8VarArr[i10].f35192e.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(storyItem.media.photo.sizes, 50, true, closestPhotoSizeWithSize2, true), storyItem.media.photo), com.google.android.recaptcha.internal.a.l(iD, "_", iD), ImageLocation.getForPhoto(closestPhotoSizeWithSize2, storyItem.media.photo), com.google.android.recaptcha.internal.a.l(iD, "_", iD), 0L, null, storyItem, 0);
                }
            }
        } else if (user == null) {
            z8 z8Var2 = z8VarArr[i10];
            z8Var2.f35192e.setForUserOrChat(chat, z8Var2.f35189a);
        } else if (user.self && this.f26662a) {
            z8 z8Var3 = z8VarArr[i10];
            z8Var3.f35192e.setImageBitmap(z8Var3.f35189a);
        } else {
            z8 z8Var4 = z8VarArr[i10];
            z8Var4.f35192e.setForUserOrChat(user, z8Var4.f35189a);
        }
        z8VarArr[i10].f35192e.setRoundRadius(iD / 2);
        float f10 = iD;
        z8VarArr[i10].f35192e.setImageCoords(0.0f, 0.0f, f10, f10);
        f();
    }

    public final void m(int i10) {
        this.f26678s = i10;
    }

    public final void n() {
        for (int i10 = 0; i10 < 3; i10++) {
            z8[] z8VarArr = this.f26663b;
            z8 z8Var = z8VarArr[i10];
            z8[] z8VarArr2 = this.f26664c;
            z8VarArr[i10] = z8VarArr2[i10];
            z8VarArr2[i10] = z8Var;
        }
    }
}
