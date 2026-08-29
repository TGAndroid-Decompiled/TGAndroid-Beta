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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.xi0;
public class c4 extends FrameLayout {
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
    public final v3 N;
    public final v3 O;
    public int P;
    public final v3 Q;
    public final v3 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final Drawable V;
    public AnimatorSet W;
    public final a4 f24152a;
    public float f24153a0;
    public final org.telegram.ui.Components.t9 f24154b;
    public final org.telegram.ui.ActionBar.h5 f24155c;
    public final org.telegram.ui.ActionBar.h5[] d;
    public final org.telegram.ui.ActionBar.h5 f24156e;
    public final aj0 f24157f;
    public final xi0 h;
    public final xi0 f24158n;
    public final org.telegram.ui.Components.n5 f24159r;
    public final org.telegram.ui.Components.n5 f24160s;
    public Drawable v;
    public Drawable f24161w;
    public final w3 f24162x;
    public final org.telegram.ui.Components.e9 f24163y;

    public c4(Context context) {
        super(context);
        int i10;
        float f9;
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
        this.d = new org.telegram.ui.ActionBar.h5[5];
        this.N = new Runnable(this) {
            public final c4 f25830b;

            {
                this.f25830b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        c4 c4Var = this.f25830b;
                        c4Var.f24158n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f24157f.setAnimation(xi0Var);
                        return;
                    case 1:
                        c4 c4Var2 = this.f25830b;
                        aj0 aj0Var = c4Var2.f24157f;
                        xi0 xi0Var2 = c4Var2.f24158n;
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
                        xi0Var2.N(i19);
                        xi0Var2.P(i19 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i18);
                        aj0Var.d();
                        return;
                    case 2:
                        this.f25830b.a(true, true);
                        return;
                    case 3:
                        c4 c4Var3 = this.f25830b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.f24152a.c(0.0d);
                        c4Var3.S = false;
                        return;
                    default:
                        this.f25830b.a(true, true);
                        return;
                }
            }
        };
        this.O = new Runnable(this) {
            public final c4 f25830b;

            {
                this.f25830b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        c4 c4Var = this.f25830b;
                        c4Var.f24158n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f24157f.setAnimation(xi0Var);
                        return;
                    case 1:
                        c4 c4Var2 = this.f25830b;
                        aj0 aj0Var = c4Var2.f24157f;
                        xi0 xi0Var2 = c4Var2.f24158n;
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
                        xi0Var2.N(i19);
                        xi0Var2.P(i19 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i18);
                        aj0Var.d();
                        return;
                    case 2:
                        this.f25830b.a(true, true);
                        return;
                    case 3:
                        c4 c4Var3 = this.f25830b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.f24152a.c(0.0d);
                        c4Var3.S = false;
                        return;
                    default:
                        this.f25830b.a(true, true);
                        return;
                }
            }
        };
        this.P = org.telegram.ui.ActionBar.g6.f23318rg;
        this.Q = new Runnable(this) {
            public final c4 f25830b;

            {
                this.f25830b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        c4 c4Var = this.f25830b;
                        c4Var.f24158n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f24157f.setAnimation(xi0Var);
                        return;
                    case 1:
                        c4 c4Var2 = this.f25830b;
                        aj0 aj0Var = c4Var2.f24157f;
                        xi0 xi0Var2 = c4Var2.f24158n;
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
                        xi0Var2.N(i19);
                        xi0Var2.P(i19 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i18);
                        aj0Var.d();
                        return;
                    case 2:
                        this.f25830b.a(true, true);
                        return;
                    case 3:
                        c4 c4Var3 = this.f25830b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.f24152a.c(0.0d);
                        c4Var3.S = false;
                        return;
                    default:
                        this.f25830b.a(true, true);
                        return;
                }
            }
        };
        this.R = new Runnable(this) {
            public final c4 f25830b;

            {
                this.f25830b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        c4 c4Var = this.f25830b;
                        c4Var.f24158n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f24157f.setAnimation(xi0Var);
                        return;
                    case 1:
                        c4 c4Var2 = this.f25830b;
                        aj0 aj0Var = c4Var2.f24157f;
                        xi0 xi0Var2 = c4Var2.f24158n;
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
                        xi0Var2.N(i19);
                        xi0Var2.P(i19 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i18);
                        aj0Var.d();
                        return;
                    case 2:
                        this.f25830b.a(true, true);
                        return;
                    case 3:
                        c4 c4Var3 = this.f25830b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.f24152a.c(0.0d);
                        c4Var3.S = false;
                        return;
                    default:
                        this.f25830b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final c4 f25830b;

            {
                this.f25830b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        c4 c4Var = this.f25830b;
                        c4Var.f24158n.P(0, null);
                        xi0 xi0Var = c4Var.h;
                        xi0Var.P(0, null);
                        c4Var.f24157f.setAnimation(xi0Var);
                        return;
                    case 1:
                        c4 c4Var2 = this.f25830b;
                        aj0 aj0Var = c4Var2.f24157f;
                        xi0 xi0Var2 = c4Var2.f24158n;
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
                        xi0Var2.N(i19);
                        xi0Var2.P(i19 - 1, c4Var2.N);
                        aj0Var.setAnimation(xi0Var2);
                        xi0Var2.K(i18);
                        aj0Var.d();
                        return;
                    case 2:
                        this.f25830b.a(true, true);
                        return;
                    case 3:
                        c4 c4Var3 = this.f25830b;
                        c4Var3.T = false;
                        c4Var3.a(true, true);
                        c4Var3.f24152a.c(0.0d);
                        c4Var3.S = false;
                        return;
                    default:
                        this.f25830b.a(true, true);
                        return;
                }
            }
        };
        Paint paint = new Paint();
        this.E = paint;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126gg, false));
        this.f24163y = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        setClipChildren(false);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f24154b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 48;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 11.0f;
        }
        if (z10) {
            f10 = 11.0f;
        } else {
            f10 = 0.0f;
        }
        addView(t9Var, i7.f6.d(46, 46.0f, i18, f9, 6.0f, f10, 0.0f));
        w3 w3Var = new w3(this, context);
        this.f24162x = w3Var;
        w3Var.setSize(AndroidUtilities.dp(26.0f));
        w3Var.setProgressColor(-1);
        w3Var.setNoProgress(false);
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
        addView(w3Var, i7.f6.d(46, 46.0f, i19, f11, 6.0f, f12, 0.0f));
        AndroidUtilities.updateViewVisibilityAnimated(w3Var, false, 1.0f, false);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24155c = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setTextSize(16);
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 48);
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
        addView(h5Var, i7.f6.d(-1, 20.0f, i20, f13, 10.0f, f14, 0.0f));
        this.f24159r = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        this.f24160s = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 9, h5Var, false);
        Drawable drawable = context.getResources().getDrawable(R.drawable.voice_volume_mini);
        this.V = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23302qg, false), PorterDuff.Mode.MULTIPLY));
        int i21 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
            if (i21 >= h5VarArr.length) {
                break;
            }
            h5VarArr[i21] = new x3(this, context, i21);
            this.d[i21].setTextSize(15);
            org.telegram.ui.ActionBar.h5 h5Var2 = this.d[i21];
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            h5Var2.setGravity(i15 | 48);
            if (i21 == 4) {
                this.d[i21].setBuildFullLayout(true);
                this.d[i21].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23318rg, false));
                org.telegram.ui.ActionBar.h5 h5Var3 = this.d[i21];
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
                addView(h5Var3, i7.f6.d(-1, -2.0f, i22, f17, 32.0f, f18, 0.0f));
            } else {
                if (i21 == 0) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23286pg, false));
                    this.d[i21].k(LocaleController.getString(R.string.Listening));
                } else if (i21 == 1) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23302qg, false));
                    this.d[i21].k(LocaleController.getString(R.string.Speaking));
                    this.d[i21].setDrawablePadding(AndroidUtilities.dp(2.0f));
                } else if (i21 == 2) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23337sg, false));
                    this.d[i21].k(LocaleController.getString(R.string.VoipGroupMutedForMe));
                } else if (i21 == 3) {
                    this.d[i21].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23286pg, false));
                    this.d[i21].k(LocaleController.getString(R.string.WantsToSpeak));
                }
                org.telegram.ui.ActionBar.h5 h5Var4 = this.d[i21];
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
                addView(h5Var4, i7.f6.d(-1, 20.0f, i23, f15, 32.0f, f16, 0.0f));
            }
            i21++;
        }
        org.telegram.ui.ActionBar.h5 h5Var5 = new org.telegram.ui.ActionBar.h5(context);
        this.f24156e = h5Var5;
        h5Var5.setMaxLines(3);
        h5Var5.setTextSize(15);
        h5Var5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23318rg, false));
        h5Var5.setVisibility(8);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(h5Var5, i7.f6.d(-1, 60.0f, i14 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        int i24 = R.raw.voice_outlined2;
        xi0 xi0Var = new xi0(i24, "" + R.raw.voice_outlined2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        this.h = xi0Var;
        int i25 = R.raw.hand_1;
        this.f24158n = new xi0(i25, "" + R.raw.hand_1, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f24157f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(xi0Var);
        z f02 = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, this.P, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(f02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, i7.f6.d(48, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f24152a = new a4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.c4.a(boolean, boolean):void");
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float f9;
        float dp;
        float f10;
        float dp2;
        float f11;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            h5VarArr = this.d;
            if (i13 >= h5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i13];
            if (i13 == i10) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            h5Var.setImportantForAccessibility(i11);
            i13++;
        }
        if (i10 == 0) {
            while (i12 < h5VarArr.length) {
                org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[i12];
                if (i12 == i10) {
                    dp2 = 0.0f;
                } else {
                    dp2 = AndroidUtilities.dp(-2.0f);
                }
                h5Var2.setTranslationY(dp2);
                org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i12];
                if (i12 == i10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                h5Var3.setAlpha(f11);
                i12++;
            }
            return;
        }
        while (i12 < h5VarArr.length) {
            org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[i12];
            if (i12 == i10) {
                dp = 0.0f;
            } else {
                if (i12 == 0) {
                    f9 = 2.0f;
                } else {
                    f9 = -2.0f;
                }
                dp = AndroidUtilities.dp(f9);
            }
            h5Var4.setTranslationY(dp);
            org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[i12];
            if (i12 == i10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            h5Var5.setAlpha(f10);
            i12++;
        }
    }

    public final boolean c() {
        long j10 = this.M;
        if (j10 > 0) {
            TLRPC.User user = this.C;
            if (user == null || user.f22539id != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.D;
        if (chat == null || chat.f22392id != (-j10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float dp;
        int i10;
        if (this.J) {
            Paint paint = this.E;
            int alpha = paint.getAlpha();
            float f9 = this.f24153a0;
            if (f9 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f9) * alpha));
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
        org.telegram.ui.Components.t9 t9Var = this.f24154b;
        int measuredWidth2 = (t9Var.getMeasuredWidth() / 2) + t9Var.getLeft();
        int measuredHeight2 = (t9Var.getMeasuredHeight() / 2) + t9Var.getTop();
        a4 a4Var = this.f24152a;
        a4Var.f();
        if (this.f24153a0 == 0.0f) {
            a4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        t9Var.setScaleX(a4Var.b());
        t9Var.setScaleY(a4Var.b());
        float b10 = a4Var.b();
        w3 w3Var = this.f24162x;
        w3Var.setScaleX(b10);
        w3Var.setScaleY(a4Var.b());
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f24155c;
        org.telegram.ui.Components.t9 t9Var = this.f24154b;
        org.telegram.ui.Components.e9 e9Var = this.f24163y;
        org.telegram.ui.Components.n5 n5Var = this.f24160s;
        if (peerId > 0) {
            this.C = this.I.getMessagesController().getUser(Long.valueOf(peerId));
            this.D = null;
            e9Var.m(this.I.getCurrentAccount(), this.C);
            h5Var.l(UserObject.getUserName(this.C), false);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.C);
            TLRPC.User user = this.C;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.v;
                if (drawable == null) {
                    drawable = new b4(getContext());
                }
                this.v = drawable;
                n5Var.g(drawable, z10);
            } else if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
                n5Var.j(DialogObject.getEmojiStatusDocumentId(this.C.emoji_status), z10);
            } else {
                TLRPC.User user2 = this.C;
                if (user2 != null && user2.premium) {
                    if (this.f24161w == null) {
                        this.f24161w = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                        this.f24161w = new org.telegram.ui.Components.o5(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f24161w);
                    }
                    n5Var.g(this.f24161w, z10);
                } else {
                    n5Var.g(null, z10);
                }
            }
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false)));
            h5Var.i(n5Var);
            t9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
            if (fileLocation != null) {
                this.U = true;
                t9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", e9Var, null);
            } else {
                ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), this.C, 1);
                if (forUser != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.U = z11;
                t9Var.h(forUser, "50_50", e9Var, this.C);
            }
        } else {
            j11 = 0;
            this.D = this.I.getMessagesController().getChat(Long.valueOf(-peerId));
            this.C = null;
            e9Var.k(this.I.getCurrentAccount(), this.D);
            botVerificationIcon = DialogObject.getBotVerificationIcon(this.D);
            TLRPC.Chat chat = this.D;
            if (chat != null) {
                h5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.D;
                if (chat2.verified) {
                    Drawable drawable2 = this.v;
                    if (drawable2 == null) {
                        drawable2 = new b4(getContext());
                    }
                    this.v = drawable2;
                    n5Var.g(drawable2, z10);
                } else if (chat2 != null && DialogObject.getEmojiStatusDocumentId(chat2.emoji_status) != 0) {
                    n5Var.j(DialogObject.getEmojiStatusDocumentId(this.D.emoji_status), z10);
                } else {
                    n5Var.g(null, z10);
                }
                t9Var.getImageReceiver().setCurrentAccount(accountInstance.getCurrentAccount());
                if (fileLocation != null) {
                    this.U = true;
                    t9Var.h(ImageLocation.getForLocal(fileLocation), "50_50", e9Var, null);
                } else {
                    boolean z12 = true;
                    ImageLocation forChat = ImageLocation.getForChat(this.D, 1);
                    if (forChat == null) {
                        z12 = false;
                    }
                    this.U = z12;
                    t9Var.h(forChat, "50_50", e9Var, this.D);
                }
            }
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f24159r;
        if (botVerificationIcon != j11) {
            n5Var2.j(botVerificationIcon, z10);
            h5Var.setLeftDrawable(n5Var2);
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false)));
        } else {
            n5Var2.g(null, z10);
            h5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i10, int i11) {
        if (this.P != i10) {
            if (this.K) {
                this.H = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            }
            this.P = i10;
        }
        if (this.K) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            aj0 aj0Var = this.f24157f;
            aj0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.g6.B1(aj0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.t9 getAvatarImageView() {
        return this.f24154b;
    }

    public a4 getAvatarWavesDrawable() {
        return this.f24152a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.h5 h5Var = this.f24156e;
        if (TextUtils.isEmpty(h5Var.getText()) || !this.U) {
            h5Var = this.d[4];
        }
        if (h5Var.getLineCount() > 1) {
            return AndroidUtilities.dp(8.0f) + h5Var.getTop() + h5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f24155c.getText();
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
        org.telegram.ui.Components.n5 n5Var = this.f24160s;
        if (n5Var != null) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f24159r;
        if (n5Var2 != null) {
            n5Var2.a();
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
        org.telegram.ui.Components.n5 n5Var = this.f24160s;
        if (n5Var != null) {
            n5Var.b();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f24159r;
        if (n5Var2 != null) {
            n5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.B;
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
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (z10) {
            h5VarArr[4].setTranslationY(0.0f);
        } else {
            h5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        a4 a4Var = this.f24152a;
        if (d > 1.5d) {
            boolean z10 = this.S;
            v3 v3Var = this.R;
            if (z10) {
                AndroidUtilities.cancelRunOnUIThread(v3Var);
            }
            if (!this.T) {
                this.T = true;
                a(true, false);
            }
            a4Var.c(d);
            AndroidUtilities.runOnUIThread(v3Var, 500L);
            this.S = true;
            return;
        }
        a4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.t9 t9Var = this.f24154b;
        if (t9Var.getImageReceiver().getVisible() != z10) {
            t9Var.getImageReceiver().setVisible(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f9) {
        int i10;
        int i11;
        int dp;
        int dp2;
        this.f24153a0 = f9;
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(53.0f);
        } else {
            i10 = -AndroidUtilities.dp(53.0f);
        }
        this.f24155c.setTranslationX(i10 * f9);
        boolean c3 = c();
        boolean z10 = true;
        org.telegram.ui.ActionBar.h5 h5Var = this.f24156e;
        float f10 = 0.0f;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.d;
        if (c3 && f9 > 0.0f) {
            if (LocaleController.isRTL) {
                dp2 = -AndroidUtilities.dp(53.0f);
            } else {
                dp2 = AndroidUtilities.dp(53.0f);
            }
            float f11 = 1.0f - f9;
            h5Var.setTranslationX(dp2 * f11);
            h5Var.setVisibility(0);
            h5Var.setAlpha(f9);
            h5VarArr[4].setAlpha(f11);
            org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[4];
            boolean z11 = LocaleController.isRTL;
            int dp3 = AndroidUtilities.dp(53.0f);
            if (!z11) {
                dp3 = -dp3;
            }
            h5Var2.setTranslationX(dp3 * f9);
        } else {
            h5Var.setVisibility(8);
            for (int i12 = 0; i12 < h5VarArr.length; i12++) {
                if (!TextUtils.isEmpty(h5VarArr[4].getText()) && h5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[i12];
                    int dp4 = AndroidUtilities.dp(92.0f);
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(48.0f);
                    } else {
                        dp = AndroidUtilities.dp(53.0f);
                    }
                    h5Var3.h(dp4, dp);
                    h5VarArr[i12].setFullAlpha(f9);
                    h5VarArr[i12].setTranslationX(0.0f);
                    h5VarArr[i12].invalidate();
                } else {
                    org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[i12];
                    if (LocaleController.isRTL) {
                        i11 = AndroidUtilities.dp(53.0f);
                    } else {
                        i11 = -AndroidUtilities.dp(53.0f);
                    }
                    h5Var4.setTranslationX(i11 * f9);
                    h5VarArr[i12].h(0, 0);
                }
            }
        }
        int i13 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
        if (i13 == 0) {
            f10 = 1.0f;
        }
        this.f24154b.setAlpha(f10);
        this.f24152a.e(this, (this.T && i13 == 0) ? false : false);
        float f12 = 1.0f - f9;
        aj0 aj0Var = this.f24157f;
        aj0Var.setAlpha(f12);
        float f13 = (f12 * 0.4f) + 0.6f;
        aj0Var.setScaleX(f13);
        aj0Var.setScaleY(f13);
        invalidate();
    }

    public void d(c4 c4Var) {
    }
}
