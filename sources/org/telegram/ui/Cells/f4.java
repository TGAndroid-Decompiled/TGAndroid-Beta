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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nj0;
public class f4 extends FrameLayout {
    public ChatObject.Call E;
    public TLRPC.GroupCallParticipant F;
    public TLRPC.User G;
    public TLRPC.Chat H;
    public final Paint I;
    public boolean J;
    public boolean K;
    public int L;
    public AccountInstance M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public final z3 R;
    public final z3 S;
    public int T;
    public final z3 U;
    public final z3 V;
    public boolean W;
    public final d4 f20286a;
    public boolean f20287a0;
    public final org.telegram.ui.Components.v9 f20288b;
    public boolean f20289b0;
    public final org.telegram.ui.ActionBar.j5 f20290c;
    public final Drawable f20291c0;
    public final org.telegram.ui.ActionBar.j5[] d;
    public AnimatorSet f20292d0;
    public final org.telegram.ui.ActionBar.j5 e;
    public float f20293e0;
    public final nj0 f20294f;
    public final kj0 h;
    public final kj0 f20295n;
    public final org.telegram.ui.Components.n5 f20296r;
    public final org.telegram.ui.Components.n5 f20297s;
    public Drawable v;
    public Drawable f20298w;
    public final a4 f20299x;
    public final org.telegram.ui.Components.g9 f20300y;

    public f4(Context context) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        int i12;
        int i13;
        float f13;
        float f14;
        int i14;
        int i15;
        int i16;
        float f15;
        float f16;
        int i17;
        float f17;
        float f18;
        this.d = new org.telegram.ui.ActionBar.j5[5];
        this.R = new Runnable(this) {
            public final f4 f21926b;

            {
                this.f21926b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f21926b;
                        f4Var.f20295n.S(0, null);
                        kj0 kj0Var = f4Var.h;
                        kj0Var.S(0, null);
                        f4Var.f20294f.setAnimation(kj0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f21926b;
                        nj0 nj0Var = f4Var2.f20294f;
                        kj0 kj0Var2 = f4Var2.f20295n;
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
                        kj0Var2.P(i19);
                        kj0Var2.S(i19 - 1, f4Var2.R);
                        nj0Var.setAnimation(kj0Var2);
                        kj0Var2.M(i18);
                        nj0Var.d();
                        return;
                    case 2:
                        this.f21926b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f21926b;
                        f4Var3.f20287a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f20286a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f21926b.a(true, true);
                        return;
                }
            }
        };
        this.S = new Runnable(this) {
            public final f4 f21926b;

            {
                this.f21926b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f21926b;
                        f4Var.f20295n.S(0, null);
                        kj0 kj0Var = f4Var.h;
                        kj0Var.S(0, null);
                        f4Var.f20294f.setAnimation(kj0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f21926b;
                        nj0 nj0Var = f4Var2.f20294f;
                        kj0 kj0Var2 = f4Var2.f20295n;
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
                        kj0Var2.P(i19);
                        kj0Var2.S(i19 - 1, f4Var2.R);
                        nj0Var.setAnimation(kj0Var2);
                        kj0Var2.M(i18);
                        nj0Var.d();
                        return;
                    case 2:
                        this.f21926b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f21926b;
                        f4Var3.f20287a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f20286a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f21926b.a(true, true);
                        return;
                }
            }
        };
        this.T = org.telegram.ui.ActionBar.j6.f19376rg;
        this.U = new Runnable(this) {
            public final f4 f21926b;

            {
                this.f21926b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f21926b;
                        f4Var.f20295n.S(0, null);
                        kj0 kj0Var = f4Var.h;
                        kj0Var.S(0, null);
                        f4Var.f20294f.setAnimation(kj0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f21926b;
                        nj0 nj0Var = f4Var2.f20294f;
                        kj0 kj0Var2 = f4Var2.f20295n;
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
                        kj0Var2.P(i19);
                        kj0Var2.S(i19 - 1, f4Var2.R);
                        nj0Var.setAnimation(kj0Var2);
                        kj0Var2.M(i18);
                        nj0Var.d();
                        return;
                    case 2:
                        this.f21926b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f21926b;
                        f4Var3.f20287a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f20286a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f21926b.a(true, true);
                        return;
                }
            }
        };
        this.V = new Runnable(this) {
            public final f4 f21926b;

            {
                this.f21926b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f21926b;
                        f4Var.f20295n.S(0, null);
                        kj0 kj0Var = f4Var.h;
                        kj0Var.S(0, null);
                        f4Var.f20294f.setAnimation(kj0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f21926b;
                        nj0 nj0Var = f4Var2.f20294f;
                        kj0 kj0Var2 = f4Var2.f20295n;
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
                        kj0Var2.P(i19);
                        kj0Var2.S(i19 - 1, f4Var2.R);
                        nj0Var.setAnimation(kj0Var2);
                        kj0Var2.M(i18);
                        nj0Var.d();
                        return;
                    case 2:
                        this.f21926b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f21926b;
                        f4Var3.f20287a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f20286a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f21926b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final f4 f21926b;

            {
                this.f21926b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f21926b;
                        f4Var.f20295n.S(0, null);
                        kj0 kj0Var = f4Var.h;
                        kj0Var.S(0, null);
                        f4Var.f20294f.setAnimation(kj0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f21926b;
                        nj0 nj0Var = f4Var2.f20294f;
                        kj0 kj0Var2 = f4Var2.f20295n;
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
                        kj0Var2.P(i19);
                        kj0Var2.S(i19 - 1, f4Var2.R);
                        nj0Var.setAnimation(kj0Var2);
                        kj0Var2.M(i18);
                        nj0Var.d();
                        return;
                    case 2:
                        this.f21926b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f21926b;
                        f4Var3.f20287a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f20286a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f21926b.a(true, true);
                        return;
                }
            }
        };
        Paint paint = new Paint();
        this.I = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19172gg, false));
        this.f20300y = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        setClipChildren(false);
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f20288b = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 11.0f;
        }
        if (z10) {
            f10 = 11.0f;
        } else {
            f10 = 0.0f;
        }
        addView(v9Var, w7.y5.d(46, 46.0f, i18, f7, 6.0f, f10, 0.0f));
        a4 a4Var = new a4(this, context);
        this.f20299x = a4Var;
        a4Var.setSize(AndroidUtilities.dp(26.0f));
        a4Var.setProgressColor(-1);
        a4Var.setNoProgress(false);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i19 = i11 | 48;
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = 11.0f;
        }
        if (z11) {
            f12 = 11.0f;
        } else {
            f12 = 0.0f;
        }
        addView(a4Var, w7.y5.d(46, 46.0f, i19, f11, 6.0f, f12, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(a4Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f20290c = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301ng, false));
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextSize(16);
        j5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        j5Var.setGravity(i12 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 48;
        if (z12) {
            f13 = 54.0f;
        } else {
            f13 = 67.0f;
        }
        if (z12) {
            f14 = 67.0f;
        } else {
            f14 = 54.0f;
        }
        addView(j5Var, w7.y5.d(-1, 20.0f, i20, f13, 10.0f, f14, 0.0f));
        this.f20296r = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 9, j5Var, false);
        this.f20297s = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 9, j5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.f20291c0 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19357qg, false), PorterDuff.Mode.MULTIPLY));
        int i21 = 0;
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
            if (i21 >= j5VarArr.length) {
                break;
            }
            j5VarArr[i21] = new b4(this, context, i21);
            this.d[i21].setTextSize(15);
            org.telegram.ui.ActionBar.j5 j5Var2 = this.d[i21];
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            j5Var2.setGravity(i15 | 48);
            if (i21 == 4) {
                this.d[i21].setBuildFullLayout(true);
                this.d[i21].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19376rg, false));
                org.telegram.ui.ActionBar.j5 j5Var3 = this.d[i21];
                boolean z13 = LocaleController.isRTL;
                if (z13) {
                    i17 = 5;
                } else {
                    i17 = 3;
                }
                int i22 = i17 | 48;
                if (z13) {
                    f17 = 54.0f;
                } else {
                    f17 = 67.0f;
                }
                if (z13) {
                    f18 = 67.0f;
                } else {
                    f18 = 54.0f;
                }
                addView(j5Var3, w7.y5.d(-1, -2.0f, i22, f17, 32.0f, f18, 0.0f));
            } else {
                if (i21 == 0) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19339pg, false));
                    this.d[i21].k(LocaleController.getString(R.string.Listening));
                } else if (i21 == 1) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19357qg, false));
                    this.d[i21].k(LocaleController.getString(R.string.Speaking));
                    this.d[i21].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i21 == 2) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19395sg, false));
                    this.d[i21].k(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i21 == 3) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19339pg, false));
                    this.d[i21].k(LocaleController.getString(R.string.WantsToSpeak));
                }
                org.telegram.ui.ActionBar.j5 j5Var4 = this.d[i21];
                boolean z14 = LocaleController.isRTL;
                if (z14) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                int i23 = i16 | 48;
                if (z14) {
                    f15 = 54.0f;
                } else {
                    f15 = 67.0f;
                }
                if (z14) {
                    f16 = 67.0f;
                } else {
                    f16 = 54.0f;
                }
                addView(j5Var4, w7.y5.d(-1, 20.0f, i23, f15, 32.0f, f16, 0.0f));
            }
            i21++;
        }
        org.telegram.ui.ActionBar.j5 j5Var5 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var5;
        j5Var5.setMaxLines(3);
        j5Var5.setTextSize(15);
        j5Var5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19376rg, false));
        j5Var5.setVisibility(8);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(j5Var5, w7.y5.d(-1, 60.0f, i14 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        kj0 kj0Var = new kj0(R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = kj0Var;
        this.f20295n = new kj0(R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f20294f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(kj0Var);
        z f02 = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, this.T, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(f02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, w7.y5.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f20286a = new d4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f4.a(boolean, boolean):void");
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        float f7;
        float dp;
        float f10;
        float dp2;
        float f11;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            j5VarArr = this.d;
            if (i13 >= j5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i13];
            if (i13 == i10) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            j5Var.setImportantForAccessibility(i11);
            i13++;
        }
        if (i10 == 0) {
            while (i12 < j5VarArr.length) {
                org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[i12];
                if (i12 == i10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(-2.0f);
                }
                j5Var2.setTranslationY(dp2);
                org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[i12];
                if (i12 == i10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                j5Var3.setAlpha(f11);
                i12++;
            }
            return;
        }
        while (i12 < j5VarArr.length) {
            org.telegram.ui.ActionBar.j5 j5Var4 = j5VarArr[i12];
            if (i12 == i10) {
                dp = 0.0f;
            } else {
                if (i12 == 0) {
                    f7 = 2.0f;
                } else {
                    f7 = -2.0f;
                }
                dp = AndroidUtilities.dp(f7);
            }
            j5Var4.setTranslationY(dp);
            org.telegram.ui.ActionBar.j5 j5Var5 = j5VarArr[i12];
            if (i12 == i10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            j5Var5.setAlpha(f10);
            i12++;
        }
    }

    public final boolean c() {
        long j3 = this.Q;
        if (j3 > 0) {
            TLRPC.User user = this.G;
            if (user == null || user.f18490id != j3) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.H;
        if (chat == null || chat.f18343id != (-j3)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float dp;
        int i10;
        if (this.N) {
            Paint paint = this.I;
            int alpha = paint.getAlpha();
            float f7 = this.f20293e0;
            if (f7 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f7) * alpha));
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
            float f10 = dp;
            canvas2 = canvas;
            canvas2.drawLine(f10, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.v9 v9Var = this.f20288b;
        int measuredWidth2 = (v9Var.getMeasuredWidth() / 2) + v9Var.getLeft();
        int measuredHeight2 = (v9Var.getMeasuredHeight() / 2) + v9Var.getTop();
        d4 d4Var = this.f20286a;
        d4Var.f();
        if (this.f20293e0 == 0.0f) {
            d4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        v9Var.setScaleX(d4Var.b());
        v9Var.setScaleY(d4Var.b());
        float b10 = d4Var.b();
        a4 a4Var = this.f20299x;
        a4Var.setScaleX(b10);
        a4Var.setScaleY(d4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j3, TLRPC.FileLocation fileLocation, boolean z10) {
        long j10;
        long botVerificationIcon;
        boolean z11;
        this.E = call;
        this.M = accountInstance;
        this.Q = j3;
        this.F = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.j5 j5Var = this.f20290c;
        org.telegram.ui.Components.v9 v9Var = this.f20288b;
        org.telegram.ui.Components.g9 g9Var = this.f20300y;
        org.telegram.ui.Components.n5 n5Var = this.f20297s;
        if (peerId > 0) {
            this.G = this.M.getMessagesController().getUser(Long.valueOf(peerId));
            this.H = null;
            g9Var.m(this.M.getCurrentAccount(), this.G);
            j5Var.l(UserObject.getUserName(this.G), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.G);
            TLRPC.User user = this.G;
            j10 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.v;
                if (drawable == null) {
                    drawable = new e4(getContext());
                }
                this.v = drawable;
                n5Var.g(drawable, z10);
            } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                n5Var.j(DialogObject.getEmojiStatusDocumentId(this.G.emoji_status), z10);
            } else {
                TLRPC.User user2 = this.G;
                if (user2 != null && user2.premium) {
                    if (this.f20298w == null) {
                        this.f20298w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.f20298w = new org.telegram.ui.Components.o5(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f20298w);
                    }
                    n5Var.g(this.f20298w, z10);
                } else {
                    n5Var.g(null, z10);
                }
            }
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false)));
            j5Var.i(n5Var);
            v9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.f20289b0 = true;
                v9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", g9Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.G, 1);
                if (forUser != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f20289b0 = z11;
                v9Var.h(forUser, "50_50", g9Var, this.G);
            }
        } else {
            j10 = 0;
            this.H = this.M.getMessagesController().getChat(Long.valueOf(-peerId));
            this.G = null;
            g9Var.k(this.M.getCurrentAccount(), this.H);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.H);
            TLRPC.Chat chat = this.H;
            if (chat != null) {
                j5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.H;
                if (chat2.verified) {
                    Drawable drawable2 = this.v;
                    if (drawable2 == null) {
                        drawable2 = new e4(getContext());
                    }
                    this.v = drawable2;
                    n5Var.g(drawable2, z10);
                } else if (chat2 != null && DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                    n5Var.j(DialogObject.getEmojiStatusDocumentId(this.H.emoji_status), z10);
                } else {
                    n5Var.g(null, z10);
                }
                v9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.f20289b0 = true;
                    v9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", g9Var, null);
                } else {
                    boolean z12 = true;
                    ImageLocation forChat = ImageLocation.getForChat(this.H, 1);
                    if (forChat == null) {
                        z12 = false;
                    }
                    this.f20289b0 = z12;
                    v9Var.h(forChat, "50_50", g9Var, this.H);
                }
            }
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f20296r;
        if (botVerificationIcon != j10) {
            n5Var2.j(botVerificationIcon, z10);
            j5Var.setLeftDrawable(n5Var2);
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lj, false)));
        } else {
            n5Var2.g(null, z10);
            j5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i10, int i11) {
        if (this.T != i10) {
            if (this.O) {
                this.L = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            }
            this.T = i10;
        }
        if (this.O) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            nj0 nj0Var = this.f20294f;
            nj0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.j6.B1(nj0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.v9 getAvatarImageView() {
        return this.f20288b;
    }

    public d4 getAvatarWavesDrawable() {
        return this.f20286a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        if (TextUtils.isEmpty(j5Var.getText()) || !this.f20289b0) {
            j5Var = this.d[4];
        }
        if (j5Var.getLineCount() > 1) {
            return AndroidUtilities.dp(8.0f) + j5Var.getTop() + j5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f20290c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.F;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.F;
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
        org.telegram.ui.Components.n5 n5Var = this.f20297s;
        if (n5Var != null) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f20296r;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.W) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
            this.W = false;
        }
        AnimatorSet animatorSet = this.f20292d0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.n5 n5Var = this.f20297s;
        if (n5Var != null) {
            n5Var.b();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f20296r;
        if (n5Var2 != null) {
            n5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.F;
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

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
        if (z10) {
            j5VarArr[4].setTranslationY(0.0f);
        } else {
            j5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        d4 d4Var = this.f20286a;
        if (d > 1.5d) {
            boolean z10 = this.W;
            z3 z3Var = this.V;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(z3Var);
            }
            if (!this.f20287a0) {
                this.f20287a0 = true;
                a(true, false);
            }
            d4Var.c(d);
            AndroidUtilities.runOnUIThread(z3Var, 500L);
            this.W = true;
            return;
        }
        d4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.v9 v9Var = this.f20288b;
        if (v9Var.getImageReceiver().getVisible() != z10) {
            v9Var.getImageReceiver().setVisible(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f7) {
        int i10;
        int i11;
        int dp;
        int dp2;
        this.f20293e0 = f7;
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(53.0f);
        } else {
            i10 = -AndroidUtilities.dp(53.0f);
        }
        this.f20290c.setTranslationX(i10 * f7);
        boolean c10 = c();
        boolean z10 = true;
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        float f10 = 0.0f;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
        if (c10 && f7 > 0.0f) {
            if (LocaleController.isRTL) {
                dp2 = -AndroidUtilities.dp(53.0f);
            } else {
                dp2 = AndroidUtilities.dp(53.0f);
            }
            float f11 = 1.0f - f7;
            j5Var.setTranslationX(dp2 * f11);
            j5Var.setVisibility(0);
            j5Var.setAlpha(f7);
            j5VarArr[4].setAlpha(f11);
            org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[4];
            boolean z11 = LocaleController.isRTL;
            int dp3 = AndroidUtilities.dp(53.0f);
            if (!z11) {
                dp3 = -dp3;
            }
            j5Var2.setTranslationX(dp3 * f7);
        } else {
            j5Var.setVisibility(8);
            for (int i12 = 0; i12 < j5VarArr.length; i12++) {
                if (!TextUtils.isEmpty(j5VarArr[4].getText()) && j5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[i12];
                    int dp4 = AndroidUtilities.dp(92.0f);
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(48.0f);
                    } else {
                        dp = AndroidUtilities.dp(53.0f);
                    }
                    j5Var3.h(dp4, dp);
                    j5VarArr[i12].setFullAlpha(f7);
                    j5VarArr[i12].setTranslationX(0.0f);
                    j5VarArr[i12].invalidate();
                } else {
                    org.telegram.ui.ActionBar.j5 j5Var4 = j5VarArr[i12];
                    if (LocaleController.isRTL) {
                        i11 = AndroidUtilities.dp(53.0f);
                    } else {
                        i11 = -AndroidUtilities.dp(53.0f);
                    }
                    j5Var4.setTranslationX(i11 * f7);
                    j5VarArr[i12].h(0, 0);
                }
            }
        }
        int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i13 == 0) {
            f10 = 1.0f;
        }
        this.f20288b.setAlpha(f10);
        this.f20286a.e(this, (this.f20287a0 && i13 == 0) ? false : false);
        float f12 = 1.0f - f7;
        nj0 nj0Var = this.f20294f;
        nj0Var.setAlpha(f12);
        float f13 = (f12 * 0.4f) + 0.6f;
        nj0Var.setScaleX(f13);
        nj0Var.setScaleY(f13);
        invalidate();
    }

    public void d(f4 f4Var) {
    }
}
