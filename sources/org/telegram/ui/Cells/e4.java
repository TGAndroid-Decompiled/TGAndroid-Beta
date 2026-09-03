package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
public class e4 extends FrameLayout {
    public ChatObject.Call B;
    public TLRPC.GroupCallParticipant C;
    public TLRPC.User D;
    public TLRPC.Chat E;
    public final Paint F;
    public boolean G;
    public boolean H;
    public int I;
    public AccountInstance J;
    public boolean K;
    public boolean L;
    public int M;
    public long N;
    public final x3 O;
    public final x3 P;
    public int Q;
    public final x3 R;
    public final x3 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final Drawable W;
    public final c4 f22742a;
    public AnimatorSet f22743a0;
    public final org.telegram.ui.Components.p9 f22744b;
    public float f22745b0;
    public final org.telegram.ui.ActionBar.l5 f22746c;
    public final org.telegram.ui.ActionBar.l5[] d;
    public final org.telegram.ui.ActionBar.l5 f22747e;
    public final kj0 f22748f;
    public final hj0 h;
    public final hj0 f22749n;
    public final org.telegram.ui.Components.j5 f22750r;
    public final org.telegram.ui.Components.j5 f22751s;
    public Drawable v;
    public Drawable f22752w;
    public final y3 f22753x;
    public final org.telegram.ui.Components.z8 f22754y;

    public e4(Context context) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        float f14;
        float f15;
        int i14;
        int i15;
        int i16;
        float f16;
        float f17;
        int i17;
        float f18;
        float f19;
        this.d = new org.telegram.ui.ActionBar.l5[5];
        this.O = new Runnable(this) {
            public final e4 f24401b;

            {
                this.f24401b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f24401b;
                        e4Var.f22749n.P(0, null);
                        hj0 hj0Var = e4Var.h;
                        hj0Var.P(0, null);
                        e4Var.f22748f.setAnimation(hj0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f24401b;
                        kj0 kj0Var = e4Var2.f22748f;
                        hj0 hj0Var2 = e4Var2.f22749n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt < 64) {
                                i19 = 240;
                                i18 = 120;
                            } else {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt == 98) {
                                        i19 = 540;
                                        i18 = 420;
                                    } else {
                                        i19 = 720;
                                    }
                                }
                            }
                        }
                        hj0Var2.N(i19);
                        hj0Var2.P(i19 - 1, e4Var2.O);
                        kj0Var.setAnimation(hj0Var2);
                        hj0Var2.K(i18);
                        kj0Var.d();
                        return;
                    case 2:
                        this.f24401b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f24401b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.f22742a.c(0.0d);
                        e4Var3.T = false;
                        return;
                    default:
                        this.f24401b.a(true, true);
                        return;
                }
            }
        };
        this.P = new Runnable(this) {
            public final e4 f24401b;

            {
                this.f24401b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f24401b;
                        e4Var.f22749n.P(0, null);
                        hj0 hj0Var = e4Var.h;
                        hj0Var.P(0, null);
                        e4Var.f22748f.setAnimation(hj0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f24401b;
                        kj0 kj0Var = e4Var2.f22748f;
                        hj0 hj0Var2 = e4Var2.f22749n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt < 64) {
                                i19 = 240;
                                i18 = 120;
                            } else {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt == 98) {
                                        i19 = 540;
                                        i18 = 420;
                                    } else {
                                        i19 = 720;
                                    }
                                }
                            }
                        }
                        hj0Var2.N(i19);
                        hj0Var2.P(i19 - 1, e4Var2.O);
                        kj0Var.setAnimation(hj0Var2);
                        hj0Var2.K(i18);
                        kj0Var.d();
                        return;
                    case 2:
                        this.f24401b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f24401b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.f22742a.c(0.0d);
                        e4Var3.T = false;
                        return;
                    default:
                        this.f24401b.a(true, true);
                        return;
                }
            }
        };
        this.Q = org.telegram.ui.ActionBar.k6.f21922rg;
        this.R = new Runnable(this) {
            public final e4 f24401b;

            {
                this.f24401b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f24401b;
                        e4Var.f22749n.P(0, null);
                        hj0 hj0Var = e4Var.h;
                        hj0Var.P(0, null);
                        e4Var.f22748f.setAnimation(hj0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f24401b;
                        kj0 kj0Var = e4Var2.f22748f;
                        hj0 hj0Var2 = e4Var2.f22749n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt < 64) {
                                i19 = 240;
                                i18 = 120;
                            } else {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt == 98) {
                                        i19 = 540;
                                        i18 = 420;
                                    } else {
                                        i19 = 720;
                                    }
                                }
                            }
                        }
                        hj0Var2.N(i19);
                        hj0Var2.P(i19 - 1, e4Var2.O);
                        kj0Var.setAnimation(hj0Var2);
                        hj0Var2.K(i18);
                        kj0Var.d();
                        return;
                    case 2:
                        this.f24401b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f24401b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.f22742a.c(0.0d);
                        e4Var3.T = false;
                        return;
                    default:
                        this.f24401b.a(true, true);
                        return;
                }
            }
        };
        this.S = new Runnable(this) {
            public final e4 f24401b;

            {
                this.f24401b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f24401b;
                        e4Var.f22749n.P(0, null);
                        hj0 hj0Var = e4Var.h;
                        hj0Var.P(0, null);
                        e4Var.f22748f.setAnimation(hj0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f24401b;
                        kj0 kj0Var = e4Var2.f22748f;
                        hj0 hj0Var2 = e4Var2.f22749n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt < 64) {
                                i19 = 240;
                                i18 = 120;
                            } else {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt == 98) {
                                        i19 = 540;
                                        i18 = 420;
                                    } else {
                                        i19 = 720;
                                    }
                                }
                            }
                        }
                        hj0Var2.N(i19);
                        hj0Var2.P(i19 - 1, e4Var2.O);
                        kj0Var.setAnimation(hj0Var2);
                        hj0Var2.K(i18);
                        kj0Var.d();
                        return;
                    case 2:
                        this.f24401b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f24401b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.f22742a.c(0.0d);
                        e4Var3.T = false;
                        return;
                    default:
                        this.f24401b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final e4 f24401b;

            {
                this.f24401b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f24401b;
                        e4Var.f22749n.P(0, null);
                        hj0 hj0Var = e4Var.h;
                        hj0Var.P(0, null);
                        e4Var.f22748f.setAnimation(hj0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f24401b;
                        kj0 kj0Var = e4Var2.f22748f;
                        hj0 hj0Var2 = e4Var2.f22749n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt < 64) {
                                i19 = 240;
                                i18 = 120;
                            } else {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt == 98) {
                                        i19 = 540;
                                        i18 = 420;
                                    } else {
                                        i19 = 720;
                                    }
                                }
                            }
                        }
                        hj0Var2.N(i19);
                        hj0Var2.P(i19 - 1, e4Var2.O);
                        kj0Var.setAnimation(hj0Var2);
                        hj0Var2.K(i18);
                        kj0Var.d();
                        return;
                    case 2:
                        this.f24401b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f24401b;
                        e4Var3.U = false;
                        e4Var3.a(true, true);
                        e4Var3.f22742a.c(0.0d);
                        e4Var3.T = false;
                        return;
                    default:
                        this.f24401b.a(true, true);
                        return;
                }
            }
        };
        Paint paint = new Paint();
        this.F = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21726gg, false));
        this.f22754y = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        setClipChildren(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f22744b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 48;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 11.0f;
        }
        if (z4) {
            f11 = 11.0f;
        } else {
            f11 = 0.0f;
        }
        addView(p9Var, k7.c6.d(46, 46.0f, i18, f10, 6.0f, f11, 0.0f));
        y3 y3Var = new y3(this, context);
        this.f22753x = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        y3Var.setProgressColor(-1);
        y3Var.setNoProgress(false);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i19 = i11 | 48;
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = 11.0f;
        }
        if (z10) {
            f13 = 11.0f;
        } else {
            f13 = 0.0f;
        }
        addView(y3Var, k7.c6.d(46, 46.0f, i19, f12, 6.0f, f13, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(y3Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f22746c = l5Var;
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21850ng, false));
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setTextSize(16);
        l5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        l5Var.setGravity(i12 | 48);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 48;
        if (z11) {
            f14 = 54.0f;
        } else {
            f14 = 67.0f;
        }
        if (z11) {
            f15 = 67.0f;
        } else {
            f15 = 54.0f;
        }
        addView(l5Var, k7.c6.d(-1, 20.0f, i20, f14, 10.0f, f15, 0.0f));
        this.f22750r = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), 9, l5Var, false);
        this.f22751s = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), 9, l5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.W = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21905qg, false), PorterDuff.Mode.MULTIPLY));
        int i21 = 0;
        while (true) {
            org.telegram.ui.ActionBar.l5[] l5VarArr = this.d;
            if (i21 >= l5VarArr.length) {
                break;
            }
            l5VarArr[i21] = new z3(this, context, i21);
            this.d[i21].setTextSize(15);
            org.telegram.ui.ActionBar.l5 l5Var2 = this.d[i21];
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            l5Var2.setGravity(i15 | 48);
            if (i21 == 4) {
                this.d[i21].setBuildFullLayout(true);
                this.d[i21].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21922rg, false));
                org.telegram.ui.ActionBar.l5 l5Var3 = this.d[i21];
                boolean z12 = LocaleController.isRTL;
                if (z12) {
                    i17 = 5;
                } else {
                    i17 = 3;
                }
                int i22 = i17 | 48;
                if (z12) {
                    f18 = 54.0f;
                } else {
                    f18 = 67.0f;
                }
                if (z12) {
                    f19 = 67.0f;
                } else {
                    f19 = 54.0f;
                }
                addView(l5Var3, k7.c6.d(-1, -2.0f, i22, f18, 32.0f, f19, 0.0f));
            } else {
                if (i21 == 0) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21887pg, false));
                    this.d[i21].k(LocaleController.getString(R.string.Listening));
                } else if (i21 == 1) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21905qg, false));
                    this.d[i21].k(LocaleController.getString(R.string.Speaking));
                    this.d[i21].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i21 == 2) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21938sg, false));
                    this.d[i21].k(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i21 == 3) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21887pg, false));
                    this.d[i21].k(LocaleController.getString(R.string.WantsToSpeak));
                }
                org.telegram.ui.ActionBar.l5 l5Var4 = this.d[i21];
                boolean z13 = LocaleController.isRTL;
                if (z13) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                int i23 = i16 | 48;
                if (z13) {
                    f16 = 54.0f;
                } else {
                    f16 = 67.0f;
                }
                if (z13) {
                    f17 = 67.0f;
                } else {
                    f17 = 54.0f;
                }
                addView(l5Var4, k7.c6.d(-1, 20.0f, i23, f16, 32.0f, f17, 0.0f));
            }
            i21++;
        }
        org.telegram.ui.ActionBar.l5 l5Var5 = new org.telegram.ui.ActionBar.l5(context);
        this.f22747e = l5Var5;
        l5Var5.setMaxLines(3);
        l5Var5.setTextSize(15);
        l5Var5.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21922rg, false));
        l5Var5.setVisibility(8);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(l5Var5, k7.c6.d(-1, 60.0f, i14 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        hj0 hj0Var = new hj0(R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = hj0Var;
        this.f22749n = new hj0(R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f22748f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(hj0Var);
        z f02 = org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, this.Q, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(f02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, k7.c6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f22742a = new c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e4.a(boolean, boolean):void");
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.l5[] l5VarArr;
        float f10;
        float dp;
        float f11;
        float dp2;
        float f12;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            l5VarArr = this.d;
            if (i13 >= l5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i13];
            if (i13 == i10) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            l5Var.setImportantForAccessibility(i11);
            i13++;
        }
        if (i10 == 0) {
            while (i12 < l5VarArr.length) {
                org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[i12];
                if (i12 == i10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(-2.0f);
                }
                l5Var2.setTranslationY(dp2);
                org.telegram.ui.ActionBar.l5 l5Var3 = l5VarArr[i12];
                if (i12 == i10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                l5Var3.setAlpha(f12);
                i12++;
            }
            return;
        }
        while (i12 < l5VarArr.length) {
            org.telegram.ui.ActionBar.l5 l5Var4 = l5VarArr[i12];
            if (i12 == i10) {
                dp = 0.0f;
            } else {
                if (i12 == 0) {
                    f10 = 2.0f;
                } else {
                    f10 = -2.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            l5Var4.setTranslationY(dp);
            org.telegram.ui.ActionBar.l5 l5Var5 = l5VarArr[i12];
            if (i12 == i10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            l5Var5.setAlpha(f11);
            i12++;
        }
    }

    public final boolean c() {
        long j10 = this.N;
        if (j10 > 0) {
            TLRPC.User user = this.D;
            if (user == null || user.f20992id != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.E;
        if (chat == null || chat.f20845id != (-j10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float dp;
        int i10;
        if (this.K) {
            Paint paint = this.F;
            int alpha = paint.getAlpha();
            float f10 = this.f22745b0;
            if (f10 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f10) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(68.0f);
            } else {
                i10 = 0;
            }
            float f11 = dp;
            canvas2 = canvas;
            canvas2.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.p9 p9Var = this.f22744b;
        int measuredWidth2 = (p9Var.getMeasuredWidth() / 2) + p9Var.getLeft();
        int measuredHeight2 = (p9Var.getMeasuredHeight() / 2) + p9Var.getTop();
        c4 c4Var = this.f22742a;
        c4Var.f();
        if (this.f22745b0 == 0.0f) {
            c4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        p9Var.setScaleX(c4Var.b());
        p9Var.setScaleY(c4Var.b());
        float b10 = c4Var.b();
        y3 y3Var = this.f22753x;
        y3Var.setScaleX(b10);
        y3Var.setScaleY(c4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j10, TLRPC.FileLocation fileLocation, boolean z4) {
        long j11;
        long botVerificationIcon;
        boolean z10;
        this.B = call;
        this.J = accountInstance;
        this.N = j10;
        this.C = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.l5 l5Var = this.f22746c;
        org.telegram.ui.Components.p9 p9Var = this.f22744b;
        org.telegram.ui.Components.z8 z8Var = this.f22754y;
        org.telegram.ui.Components.j5 j5Var = this.f22751s;
        if (peerId > 0) {
            this.D = this.J.getMessagesController().getUser(Long.valueOf(peerId));
            this.E = null;
            z8Var.m(this.J.getCurrentAccount(), this.D);
            l5Var.l(UserObject.getUserName(this.D), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.D);
            TLRPC.User user = this.D;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.v;
                if (drawable == null) {
                    drawable = new d4(getContext());
                }
                this.v = drawable;
                j5Var.g(drawable, z4);
            } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                j5Var.j(DialogObject.getEmojiStatusDocumentId(this.D.emoji_status), z4);
            } else {
                TLRPC.User user2 = this.D;
                if (user2 != null && user2.premium) {
                    if (this.f22752w == null) {
                        this.f22752w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.f22752w = new org.telegram.ui.Components.k5(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f22752w);
                    }
                    j5Var.g(this.f22752w, z4);
                } else {
                    j5Var.g(null, z4);
                }
            }
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lj, false)));
            l5Var.i(j5Var);
            p9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.V = true;
                p9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", z8Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.D, 1);
                if (forUser != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.V = z10;
                p9Var.h(forUser, "50_50", z8Var, this.D);
            }
        } else {
            j11 = 0;
            this.E = this.J.getMessagesController().getChat(Long.valueOf(-peerId));
            this.D = null;
            z8Var.k(this.J.getCurrentAccount(), this.E);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.E);
            TLRPC.Chat chat = this.E;
            if (chat != null) {
                l5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.E;
                if (chat2.verified) {
                    Drawable drawable2 = this.v;
                    if (drawable2 == null) {
                        drawable2 = new d4(getContext());
                    }
                    this.v = drawable2;
                    j5Var.g(drawable2, z4);
                } else if (chat2 != null && DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                    j5Var.j(DialogObject.getEmojiStatusDocumentId(this.E.emoji_status), z4);
                } else {
                    j5Var.g(null, z4);
                }
                p9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.V = true;
                    p9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", z8Var, null);
                } else {
                    boolean z11 = true;
                    ImageLocation forChat = ImageLocation.getForChat(this.E, 1);
                    if (forChat == null) {
                        z11 = false;
                    }
                    this.V = z11;
                    p9Var.h(forChat, "50_50", z8Var, this.E);
                }
            }
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f22750r;
        if (botVerificationIcon != j11) {
            j5Var2.j(botVerificationIcon, z4);
            l5Var.setLeftDrawable(j5Var2);
            j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lj, false)));
        } else {
            j5Var2.g(null, z4);
            l5Var.setLeftDrawable((Drawable) null);
        }
        a(z4, false);
    }

    public final void f(int i10, int i11) {
        if (this.Q != i10) {
            if (this.L) {
                this.I = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            }
            this.Q = i10;
        }
        if (this.L) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            kj0 kj0Var = this.f22748f;
            kj0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.k6.B1(kj0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.p9 getAvatarImageView() {
        return this.f22744b;
    }

    public c4 getAvatarWavesDrawable() {
        return this.f22742a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.l5 l5Var = this.f22747e;
        if (TextUtils.isEmpty(l5Var.getText()) || !this.V) {
            l5Var = this.d[4];
        }
        if (l5Var.getLineCount() > 1) {
            return AndroidUtilities.dp(8.0f) + l5Var.getTop() + l5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f22746c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.C;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.C;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return MessageObject.getPeerId(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.j5 j5Var = this.f22751s;
        if (j5Var != null) {
            j5Var.a();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f22750r;
        if (j5Var2 != null) {
            j5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            AndroidUtilities.cancelRunOnUIThread(this.S);
            this.T = false;
        }
        AnimatorSet animatorSet = this.f22743a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.j5 j5Var = this.f22751s;
        if (j5Var != null) {
            j5Var.b();
        }
        org.telegram.ui.Components.j5 j5Var2 = this.f22750r;
        if (j5Var2 != null) {
            j5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.C;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i10 = R.string.VoipUnmute;
            } else {
                i10 = R.string.VoipMute;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(i10)));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z4) {
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.d;
        if (z4) {
            l5VarArr[4].setTranslationY(0.0f);
        } else {
            l5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        c4 c4Var = this.f22742a;
        if (d > 1.5d) {
            boolean z4 = this.T;
            x3 x3Var = this.S;
            if (z4) {
                AndroidUtilities.cancelRunOnUIThread(x3Var);
            }
            if (!this.U) {
                this.U = true;
                a(true, false);
            }
            c4Var.c(d);
            AndroidUtilities.runOnUIThread(x3Var, 500L);
            this.T = true;
            return;
        }
        c4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z4) {
        org.telegram.ui.Components.p9 p9Var = this.f22744b;
        if (p9Var.getImageReceiver().getVisible() != z4) {
            p9Var.getImageReceiver().setVisible(z4, true);
        }
    }

    public void setDrawDivider(boolean z4) {
        this.K = z4;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        int i10;
        int i11;
        int dp;
        int dp2;
        this.f22745b0 = f10;
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(53.0f);
        } else {
            i10 = -AndroidUtilities.dp(53.0f);
        }
        this.f22746c.setTranslationX(i10 * f10);
        boolean c3 = c();
        boolean z4 = true;
        org.telegram.ui.ActionBar.l5 l5Var = this.f22747e;
        float f11 = 0.0f;
        org.telegram.ui.ActionBar.l5[] l5VarArr = this.d;
        if (c3 && f10 > 0.0f) {
            if (LocaleController.isRTL) {
                dp2 = -AndroidUtilities.dp(53.0f);
            } else {
                dp2 = AndroidUtilities.dp(53.0f);
            }
            float f12 = 1.0f - f10;
            l5Var.setTranslationX(dp2 * f12);
            l5Var.setVisibility(0);
            l5Var.setAlpha(f10);
            l5VarArr[4].setAlpha(f12);
            org.telegram.ui.ActionBar.l5 l5Var2 = l5VarArr[4];
            boolean z10 = LocaleController.isRTL;
            int dp3 = AndroidUtilities.dp(53.0f);
            if (!z10) {
                dp3 = -dp3;
            }
            l5Var2.setTranslationX(dp3 * f10);
        } else {
            l5Var.setVisibility(8);
            for (int i12 = 0; i12 < l5VarArr.length; i12++) {
                if (!TextUtils.isEmpty(l5VarArr[4].getText()) && l5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.l5 l5Var3 = l5VarArr[i12];
                    int dp4 = AndroidUtilities.dp(92.0f);
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(48.0f);
                    } else {
                        dp = AndroidUtilities.dp(53.0f);
                    }
                    l5Var3.h(dp4, dp);
                    l5VarArr[i12].setFullAlpha(f10);
                    l5VarArr[i12].setTranslationX(0.0f);
                    l5VarArr[i12].invalidate();
                } else {
                    org.telegram.ui.ActionBar.l5 l5Var4 = l5VarArr[i12];
                    if (LocaleController.isRTL) {
                        i11 = AndroidUtilities.dp(53.0f);
                    } else {
                        i11 = -AndroidUtilities.dp(53.0f);
                    }
                    l5Var4.setTranslationX(i11 * f10);
                    l5VarArr[i12].h(0, 0);
                }
            }
        }
        int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i13 == 0) {
            f11 = 1.0f;
        }
        this.f22744b.setAlpha(f11);
        this.f22742a.e(this, (this.U && i13 == 0) ? false : false);
        float f13 = 1.0f - f10;
        kj0 kj0Var = this.f22748f;
        kj0Var.setAlpha(f13);
        float f14 = (f13 * 0.4f) + 0.6f;
        kj0Var.setScaleX(f14);
        kj0Var.setScaleY(f14);
        invalidate();
    }

    public void d(e4 e4Var) {
    }
}
