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
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
public class e4 extends FrameLayout {
    public ChatObject.Call A;
    public TLRPC.GroupCallParticipant B;
    public TLRPC.User C;
    public TLRPC.Chat D;
    public final Paint E;
    public boolean F;
    public boolean G;
    public int H;
    public AccountInstance I;
    public boolean J;
    public boolean K;
    public int L;
    public long M;
    public final y3 N;
    public final y3 O;
    public int P;
    public final y3 Q;
    public final y3 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final Drawable V;
    public AnimatorSet W;
    public final c4 f24288a;
    public float f24289a0;
    public final org.telegram.ui.Components.o9 f24290b;
    public final org.telegram.ui.ActionBar.h5 f24291c;
    public final org.telegram.ui.ActionBar.h5[] d;
    public final org.telegram.ui.ActionBar.h5 f24292e;
    public final pi0 f24293f;
    public final mi0 h;
    public final mi0 f24294n;
    public final org.telegram.ui.Components.i5 f24295r;
    public final org.telegram.ui.Components.i5 f24296s;
    public Drawable v;
    public Drawable f24297w;
    public final z3 f24298x;
    public final org.telegram.ui.Components.z8 f24299y;

    public e4(Context context) {
        super(context);
        int i9;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        int i12;
        float f14;
        float f15;
        int i13;
        int i14;
        int i15;
        float f16;
        float f17;
        int i16;
        float f18;
        float f19;
        this.d = new org.telegram.ui.ActionBar.h5[5];
        this.N = new Runnable(this) {
            public final e4 f25986b;

            {
                this.f25986b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f25986b;
                        e4Var.f24294n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f24293f.setAnimation(mi0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f25986b;
                        pi0 pi0Var = e4Var2.f24293f;
                        mi0 mi0Var2 = e4Var2.f24294n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt < 64) {
                                i18 = 240;
                                i17 = 120;
                            } else {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt == 98) {
                                        i18 = 540;
                                        i17 = 420;
                                    } else {
                                        i18 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i18);
                        mi0Var2.P(i18 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i17);
                        pi0Var.d();
                        return;
                    case 2:
                        this.f25986b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f25986b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.f24288a.c(0.0d);
                        e4Var3.S = false;
                        return;
                    default:
                        this.f25986b.a(true, true);
                        return;
                }
            }
        };
        this.O = new Runnable(this) {
            public final e4 f25986b;

            {
                this.f25986b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f25986b;
                        e4Var.f24294n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f24293f.setAnimation(mi0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f25986b;
                        pi0 pi0Var = e4Var2.f24293f;
                        mi0 mi0Var2 = e4Var2.f24294n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt < 64) {
                                i18 = 240;
                                i17 = 120;
                            } else {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt == 98) {
                                        i18 = 540;
                                        i17 = 420;
                                    } else {
                                        i18 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i18);
                        mi0Var2.P(i18 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i17);
                        pi0Var.d();
                        return;
                    case 2:
                        this.f25986b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f25986b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.f24288a.c(0.0d);
                        e4Var3.S = false;
                        return;
                    default:
                        this.f25986b.a(true, true);
                        return;
                }
            }
        };
        this.P = org.telegram.ui.ActionBar.f6.f23258rg;
        this.Q = new Runnable(this) {
            public final e4 f25986b;

            {
                this.f25986b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f25986b;
                        e4Var.f24294n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f24293f.setAnimation(mi0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f25986b;
                        pi0 pi0Var = e4Var2.f24293f;
                        mi0 mi0Var2 = e4Var2.f24294n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt < 64) {
                                i18 = 240;
                                i17 = 120;
                            } else {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt == 98) {
                                        i18 = 540;
                                        i17 = 420;
                                    } else {
                                        i18 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i18);
                        mi0Var2.P(i18 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i17);
                        pi0Var.d();
                        return;
                    case 2:
                        this.f25986b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f25986b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.f24288a.c(0.0d);
                        e4Var3.S = false;
                        return;
                    default:
                        this.f25986b.a(true, true);
                        return;
                }
            }
        };
        this.R = new Runnable(this) {
            public final e4 f25986b;

            {
                this.f25986b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f25986b;
                        e4Var.f24294n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f24293f.setAnimation(mi0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f25986b;
                        pi0 pi0Var = e4Var2.f24293f;
                        mi0 mi0Var2 = e4Var2.f24294n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt < 64) {
                                i18 = 240;
                                i17 = 120;
                            } else {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt == 98) {
                                        i18 = 540;
                                        i17 = 420;
                                    } else {
                                        i18 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i18);
                        mi0Var2.P(i18 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i17);
                        pi0Var.d();
                        return;
                    case 2:
                        this.f25986b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f25986b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.f24288a.c(0.0d);
                        e4Var3.S = false;
                        return;
                    default:
                        this.f25986b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final e4 f25986b;

            {
                this.f25986b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        e4 e4Var = this.f25986b;
                        e4Var.f24294n.P(0, null);
                        mi0 mi0Var = e4Var.h;
                        mi0Var.P(0, null);
                        e4Var.f24293f.setAnimation(mi0Var);
                        return;
                    case 1:
                        e4 e4Var2 = this.f25986b;
                        pi0 pi0Var = e4Var2.f24293f;
                        mi0 mi0Var2 = e4Var2.f24294n;
                        int nextInt = Utilities.random.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt < 64) {
                                i18 = 240;
                                i17 = 120;
                            } else {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt == 98) {
                                        i18 = 540;
                                        i17 = 420;
                                    } else {
                                        i18 = 720;
                                    }
                                }
                            }
                        }
                        mi0Var2.N(i18);
                        mi0Var2.P(i18 - 1, e4Var2.N);
                        pi0Var.setAnimation(mi0Var2);
                        mi0Var2.K(i17);
                        pi0Var.d();
                        return;
                    case 2:
                        this.f25986b.a(true, true);
                        return;
                    case 3:
                        e4 e4Var3 = this.f25986b;
                        e4Var3.T = false;
                        e4Var3.a(true, true);
                        e4Var3.f24288a.c(0.0d);
                        e4Var3.S = false;
                        return;
                    default:
                        this.f25986b.a(true, true);
                        return;
                }
            }
        };
        Paint paint = new Paint();
        this.E = paint;
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23065gg, false));
        this.f24299y = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        setClipChildren(false);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f24290b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i17 = i9 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 11.0f;
        }
        if (z10) {
            f11 = 11.0f;
        } else {
            f11 = 0.0f;
        }
        addView(o9Var, g7.e6.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
        z3 z3Var = new z3(this, context);
        this.f24298x = z3Var;
        z3Var.setSize(AndroidUtilities.dp(26.0f));
        z3Var.setProgressColor(-1);
        z3Var.setNoProgress(false);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 48;
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 11.0f;
        }
        if (z11) {
            f13 = 11.0f;
        } else {
            f13 = 0.0f;
        }
        addView(z3Var, g7.e6.d(46, 46.0f, i18, f12, 6.0f, f13, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(z3Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24291c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11 | 48);
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i19 = i12 | 48;
        if (z12) {
            f14 = 54.0f;
        } else {
            f14 = 67.0f;
        }
        if (z12) {
            f15 = 67.0f;
        } else {
            f15 = 54.0f;
        }
        addView(h5Var, g7.e6.d(-1, 20.0f, i19, f14, 10.0f, f15, 0.0f));
        this.f24295r = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        this.f24296s = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.V = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23239qg, false), PorterDuff.Mode.MULTIPLY));
        int i20 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
            if (i20 >= h5VarArr.length) {
                break;
            }
            h5VarArr[i20] = new a4(this, context, i20);
            this.d[i20].setTextSize(15);
            org.telegram.ui.ActionBar.h5 h5Var2 = this.d[i20];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            h5Var2.setGravity(i14 | 48);
            if (i20 == 4) {
                this.d[i20].setBuildFullLayout(true);
                this.d[i20].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23258rg, false));
                org.telegram.ui.ActionBar.h5 h5Var3 = this.d[i20];
                boolean z13 = LocaleController.isRTL;
                if (z13) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                int i21 = i16 | 48;
                if (z13) {
                    f18 = 54.0f;
                } else {
                    f18 = 67.0f;
                }
                if (z13) {
                    f19 = 67.0f;
                } else {
                    f19 = 54.0f;
                }
                addView(h5Var3, g7.e6.d(-1, -2.0f, i21, f18, 32.0f, f19, 0.0f));
            } else {
                if (i20 == 0) {
                    this.d[i20].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23220pg, false));
                    this.d[i20].k(LocaleController.getString(R.string.Listening));
                } else if (i20 == 1) {
                    this.d[i20].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23239qg, false));
                    this.d[i20].k(LocaleController.getString(R.string.Speaking));
                    this.d[i20].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i20 == 2) {
                    this.d[i20].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23277sg, false));
                    this.d[i20].k(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i20 == 3) {
                    this.d[i20].setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23220pg, false));
                    this.d[i20].k(LocaleController.getString(R.string.WantsToSpeak));
                }
                org.telegram.ui.ActionBar.h5 h5Var4 = this.d[i20];
                boolean z14 = LocaleController.isRTL;
                if (z14) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                int i22 = i15 | 48;
                if (z14) {
                    f16 = 54.0f;
                } else {
                    f16 = 67.0f;
                }
                if (z14) {
                    f17 = 67.0f;
                } else {
                    f17 = 54.0f;
                }
                addView(h5Var4, g7.e6.d(-1, 20.0f, i22, f16, 32.0f, f17, 0.0f));
            }
            i20++;
        }
        org.telegram.ui.ActionBar.h5 h5Var5 = new org.telegram.ui.ActionBar.h5(context);
        this.f24292e = h5Var5;
        h5Var5.setMaxLines(3);
        h5Var5.setTextSize(15);
        h5Var5.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23258rg, false));
        h5Var5.setVisibility(8);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(h5Var5, g7.e6.d(-1, 60.0f, i13 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        int i23 = R.raw.voice_outlined2;
        mi0 mi0Var = new mi0(i23, "" + R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = mi0Var;
        int i24 = R.raw.hand_1;
        this.f24294n = new mi0(i24, "" + R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f24293f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(mi0Var);
        z f02 = org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, this.P, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(f02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, g7.e6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f24288a = new c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.e4.a(boolean, boolean):void");
    }

    public final void b(int i9) {
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float f10;
        float dp;
        float f11;
        float dp2;
        float f12;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            h5VarArr = this.d;
            if (i12 >= h5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i12];
            if (i12 == i9) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            h5Var.setImportantForAccessibility(i10);
            i12++;
        }
        if (i9 == 0) {
            while (i11 < h5VarArr.length) {
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[i11];
                if (i11 == i9) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(-2.0f);
                }
                h5Var2.setTranslationY(dp2);
                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i11];
                if (i11 == i9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                h5Var3.setAlpha(f12);
                i11++;
            }
            return;
        }
        while (i11 < h5VarArr.length) {
            org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[i11];
            if (i11 == i9) {
                dp = 0.0f;
            } else {
                if (i11 == 0) {
                    f10 = 2.0f;
                } else {
                    f10 = -2.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            h5Var4.setTranslationY(dp);
            org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[i11];
            if (i11 == i9) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            h5Var5.setAlpha(f11);
            i11++;
        }
    }

    public final boolean c() {
        long j10 = this.M;
        if (j10 > 0) {
            TLRPC.User user = this.C;
            if (user == null || user.f22527id != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.D;
        if (chat == null || chat.f22380id != (-j10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float dp;
        int i9;
        if (this.J) {
            Paint paint = this.E;
            int alpha = paint.getAlpha();
            float f10 = this.f24289a0;
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
                i9 = AndroidUtilities.dp(68.0f);
            } else {
                i9 = 0;
            }
            float f11 = dp;
            canvas2 = canvas;
            canvas2.drawLine(f11, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.o9 o9Var = this.f24290b;
        int measuredWidth2 = (o9Var.getMeasuredWidth() / 2) + o9Var.getLeft();
        int measuredHeight2 = (o9Var.getMeasuredHeight() / 2) + o9Var.getTop();
        c4 c4Var = this.f24288a;
        c4Var.f();
        if (this.f24289a0 == 0.0f) {
            c4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        o9Var.setScaleX(c4Var.b());
        o9Var.setScaleY(c4Var.b());
        float b10 = c4Var.b();
        z3 z3Var = this.f24298x;
        z3Var.setScaleX(b10);
        z3Var.setScaleY(c4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(AccountInstance accountInstance, TLRPC.GroupCallParticipant groupCallParticipant, ChatObject.Call call, long j10, TLRPC.FileLocation fileLocation, boolean z10) {
        long j11;
        long botVerificationIcon;
        boolean z11;
        this.A = call;
        this.I = accountInstance;
        this.M = j10;
        this.B = groupCallParticipant;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24291c;
        org.telegram.ui.Components.o9 o9Var = this.f24290b;
        org.telegram.ui.Components.z8 z8Var = this.f24299y;
        org.telegram.ui.Components.i5 i5Var = this.f24296s;
        if (peerId > 0) {
            this.C = this.I.getMessagesController().getUser(Long.valueOf(peerId));
            this.D = null;
            z8Var.m(this.I.getCurrentAccount(), this.C);
            h5Var.l(UserObject.getUserName(this.C), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.C);
            TLRPC.User user = this.C;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.v;
                if (drawable == null) {
                    drawable = new d4(getContext());
                }
                this.v = drawable;
                i5Var.g(drawable, z10);
            } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                i5Var.j(DialogObject.getEmojiStatusDocumentId(this.C.emoji_status), z10);
            } else {
                TLRPC.User user2 = this.C;
                if (user2 != null && user2.premium) {
                    if (this.f24297w == null) {
                        this.f24297w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.f24297w = new org.telegram.ui.Components.j5(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f24297w);
                    }
                    i5Var.g(this.f24297w, z10);
                } else {
                    i5Var.g(null, z10);
                }
            }
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false)));
            h5Var.i(i5Var);
            o9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.U = true;
                o9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", z8Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.C, 1);
                if (forUser != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.U = z11;
                o9Var.h(forUser, "50_50", z8Var, this.C);
            }
        } else {
            j11 = 0;
            this.D = this.I.getMessagesController().getChat(Long.valueOf(-peerId));
            this.C = null;
            z8Var.k(this.I.getCurrentAccount(), this.D);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.D);
            TLRPC.Chat chat = this.D;
            if (chat != null) {
                h5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.D;
                if (chat2.verified) {
                    Drawable drawable2 = this.v;
                    if (drawable2 == null) {
                        drawable2 = new d4(getContext());
                    }
                    this.v = drawable2;
                    i5Var.g(drawable2, z10);
                } else if (chat2 != null && DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                    i5Var.j(DialogObject.getEmojiStatusDocumentId(this.D.emoji_status), z10);
                } else {
                    i5Var.g(null, z10);
                }
                o9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.U = true;
                    o9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", z8Var, null);
                } else {
                    boolean z12 = true;
                    ImageLocation forChat = ImageLocation.getForChat(this.D, 1);
                    if (forChat == null) {
                        z12 = false;
                    }
                    this.U = z12;
                    o9Var.h(forChat, "50_50", z8Var, this.D);
                }
            }
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24295r;
        if (botVerificationIcon != j11) {
            i5Var2.j(botVerificationIcon, z10);
            h5Var.setLeftDrawable(i5Var2);
            i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false)));
        } else {
            i5Var2.g(null, z10);
            h5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i9, int i10) {
        if (this.P != i9) {
            if (this.K) {
                this.H = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            }
            this.P = i9;
        }
        if (this.K) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            pi0 pi0Var = this.f24293f;
            pi0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.f6.B1(pi0Var.getDrawable(), i10 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.o9 getAvatarImageView() {
        return this.f24290b;
    }

    public c4 getAvatarWavesDrawable() {
        return this.f24288a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24292e;
        if (TextUtils.isEmpty(h5Var.getText()) || !this.U) {
            h5Var = this.d[4];
        }
        if (h5Var.getLineCount() > 1) {
            return AndroidUtilities.dp(8.0f) + h5Var.getTop() + h5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f24291c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.B;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.B;
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
        org.telegram.ui.Components.i5 i5Var = this.f24296s;
        if (i5Var != null) {
            i5Var.a();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24295r;
        if (i5Var2 != null) {
            i5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.S) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
            this.S = false;
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.i5 i5Var = this.f24296s;
        if (i5Var != null) {
            i5Var.b();
        }
        org.telegram.ui.Components.i5 i5Var2 = this.f24295r;
        if (i5Var2 != null) {
            i5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.B;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i9 = R.string.VoipUnmute;
            } else {
                i9 = R.string.VoipMute;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(i9)));
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (z10) {
            h5VarArr[4].setTranslationY(0.0f);
        } else {
            h5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        c4 c4Var = this.f24288a;
        if (d > 1.5d) {
            boolean z10 = this.S;
            y3 y3Var = this.R;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(y3Var);
            }
            if (!this.T) {
                this.T = true;
                a(true, false);
            }
            c4Var.c(d);
            AndroidUtilities.runOnUIThread(y3Var, 500L);
            this.S = true;
            return;
        }
        c4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.o9 o9Var = this.f24290b;
        if (o9Var.getImageReceiver().getVisible() != z10) {
            o9Var.getImageReceiver().setVisible(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        int i9;
        int i10;
        int dp;
        int dp2;
        this.f24289a0 = f10;
        if (LocaleController.isRTL) {
            i9 = AndroidUtilities.dp(53.0f);
        } else {
            i9 = -AndroidUtilities.dp(53.0f);
        }
        this.f24291c.setTranslationX(i9 * f10);
        boolean c10 = c();
        boolean z10 = true;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24292e;
        float f11 = 0.0f;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (c10 && f10 > 0.0f) {
            if (LocaleController.isRTL) {
                dp2 = -AndroidUtilities.dp(53.0f);
            } else {
                dp2 = AndroidUtilities.dp(53.0f);
            }
            float f12 = 1.0f - f10;
            h5Var.setTranslationX(dp2 * f12);
            h5Var.setVisibility(0);
            h5Var.setAlpha(f10);
            h5VarArr[4].setAlpha(f12);
            org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[4];
            boolean z11 = LocaleController.isRTL;
            int dp3 = AndroidUtilities.dp(53.0f);
            if (!z11) {
                dp3 = -dp3;
            }
            h5Var2.setTranslationX(dp3 * f10);
        } else {
            h5Var.setVisibility(8);
            for (int i11 = 0; i11 < h5VarArr.length; i11++) {
                if (!TextUtils.isEmpty(h5VarArr[4].getText()) && h5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i11];
                    int dp4 = AndroidUtilities.dp(92.0f);
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(48.0f);
                    } else {
                        dp = AndroidUtilities.dp(53.0f);
                    }
                    h5Var3.h(dp4, dp);
                    h5VarArr[i11].setFullAlpha(f10);
                    h5VarArr[i11].setTranslationX(0.0f);
                    h5VarArr[i11].invalidate();
                } else {
                    org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[i11];
                    if (LocaleController.isRTL) {
                        i10 = AndroidUtilities.dp(53.0f);
                    } else {
                        i10 = -AndroidUtilities.dp(53.0f);
                    }
                    h5Var4.setTranslationX(i10 * f10);
                    h5VarArr[i11].h(0, 0);
                }
            }
        }
        int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i12 == 0) {
            f11 = 1.0f;
        }
        this.f24290b.setAlpha(f11);
        this.f24288a.e(this, (this.T && i12 == 0) ? false : false);
        float f13 = 1.0f - f10;
        pi0 pi0Var = this.f24293f;
        pi0Var.setAlpha(f13);
        float f14 = (f13 * 0.4f) + 0.6f;
        pi0Var.setScaleX(f14);
        pi0Var.setScaleY(f14);
        invalidate();
    }

    public void d(e4 e4Var) {
    }
}
