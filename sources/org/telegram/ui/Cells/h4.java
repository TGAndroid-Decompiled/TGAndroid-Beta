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
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fi0;
public class h4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.r8 D;
    public org.telegram.messenger.u3 E;
    public TLRPC.GroupCallParticipant F;
    public TLRPC.User G;
    public TLRPC.Chat H;
    public final Paint I;
    public boolean J;
    public boolean K;
    public int L;
    public org.telegram.messenger.c M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public final c4 R;
    public final c4 S;
    public int T;
    public final c4 U;
    public final c4 V;
    public boolean W;
    public final g4 f21973a;
    public boolean f21974a0;
    public final org.telegram.ui.Components.g9 f21975b;
    public boolean f21976b0;
    public final org.telegram.ui.ActionBar.u5 f21977c;
    public final Drawable f21978c0;
    public final org.telegram.ui.ActionBar.u5[] d;
    public AnimatorSet f21979d0;
    public final org.telegram.ui.ActionBar.u5 e;
    public float f21980e0;
    public final fi0 f21981f;
    public int f21982f0;
    public final ci0 h;
    public final ci0 f21983n;
    public final org.telegram.ui.Components.d5 f21984r;
    public final org.telegram.ui.Components.d5 f21985s;
    public Drawable f21986w;
    public Drawable f21987x;
    public final d4 f21988y;

    public h4(Context context) {
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
        this.d = new org.telegram.ui.ActionBar.u5[5];
        this.R = new Runnable(this) {
            public final h4 f21789b;

            {
                this.f21789b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        h4 h4Var = this.f21789b;
                        h4Var.f21983n.S(0, null);
                        ci0 ci0Var = h4Var.h;
                        ci0Var.S(0, null);
                        h4Var.f21981f.setAnimation(ci0Var);
                        return;
                    case 1:
                        h4 h4Var2 = this.f21789b;
                        fi0 fi0Var = h4Var2.f21981f;
                        ci0 ci0Var2 = h4Var2.f21983n;
                        int nextInt = Utilities.f14520b.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt >= 64) {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt != 98) {
                                        i19 = 720;
                                    }
                                }
                            }
                            int i20 = i18;
                            i18 = i19;
                            i19 = i20;
                        }
                        ci0Var2.P(i19);
                        ci0Var2.S(i19 - 1, h4Var2.R);
                        fi0Var.setAnimation(ci0Var2);
                        ci0Var2.M(i18);
                        fi0Var.d();
                        return;
                    case 2:
                        this.f21789b.a(true, true);
                        return;
                    case 3:
                        h4 h4Var3 = this.f21789b;
                        h4Var3.f21974a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.f21973a.c(0.0d);
                        h4Var3.W = false;
                        return;
                    default:
                        this.f21789b.a(true, true);
                        return;
                }
            }
        };
        this.S = new Runnable(this) {
            public final h4 f21789b;

            {
                this.f21789b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        h4 h4Var = this.f21789b;
                        h4Var.f21983n.S(0, null);
                        ci0 ci0Var = h4Var.h;
                        ci0Var.S(0, null);
                        h4Var.f21981f.setAnimation(ci0Var);
                        return;
                    case 1:
                        h4 h4Var2 = this.f21789b;
                        fi0 fi0Var = h4Var2.f21981f;
                        ci0 ci0Var2 = h4Var2.f21983n;
                        int nextInt = Utilities.f14520b.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt >= 64) {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt != 98) {
                                        i19 = 720;
                                    }
                                }
                            }
                            int i20 = i18;
                            i18 = i19;
                            i19 = i20;
                        }
                        ci0Var2.P(i19);
                        ci0Var2.S(i19 - 1, h4Var2.R);
                        fi0Var.setAnimation(ci0Var2);
                        ci0Var2.M(i18);
                        fi0Var.d();
                        return;
                    case 2:
                        this.f21789b.a(true, true);
                        return;
                    case 3:
                        h4 h4Var3 = this.f21789b;
                        h4Var3.f21974a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.f21973a.c(0.0d);
                        h4Var3.W = false;
                        return;
                    default:
                        this.f21789b.a(true, true);
                        return;
                }
            }
        };
        this.T = org.telegram.ui.ActionBar.t6.f20977fh;
        this.U = new Runnable(this) {
            public final h4 f21789b;

            {
                this.f21789b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        h4 h4Var = this.f21789b;
                        h4Var.f21983n.S(0, null);
                        ci0 ci0Var = h4Var.h;
                        ci0Var.S(0, null);
                        h4Var.f21981f.setAnimation(ci0Var);
                        return;
                    case 1:
                        h4 h4Var2 = this.f21789b;
                        fi0 fi0Var = h4Var2.f21981f;
                        ci0 ci0Var2 = h4Var2.f21983n;
                        int nextInt = Utilities.f14520b.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt >= 64) {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt != 98) {
                                        i19 = 720;
                                    }
                                }
                            }
                            int i20 = i18;
                            i18 = i19;
                            i19 = i20;
                        }
                        ci0Var2.P(i19);
                        ci0Var2.S(i19 - 1, h4Var2.R);
                        fi0Var.setAnimation(ci0Var2);
                        ci0Var2.M(i18);
                        fi0Var.d();
                        return;
                    case 2:
                        this.f21789b.a(true, true);
                        return;
                    case 3:
                        h4 h4Var3 = this.f21789b;
                        h4Var3.f21974a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.f21973a.c(0.0d);
                        h4Var3.W = false;
                        return;
                    default:
                        this.f21789b.a(true, true);
                        return;
                }
            }
        };
        this.V = new Runnable(this) {
            public final h4 f21789b;

            {
                this.f21789b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        h4 h4Var = this.f21789b;
                        h4Var.f21983n.S(0, null);
                        ci0 ci0Var = h4Var.h;
                        ci0Var.S(0, null);
                        h4Var.f21981f.setAnimation(ci0Var);
                        return;
                    case 1:
                        h4 h4Var2 = this.f21789b;
                        fi0 fi0Var = h4Var2.f21981f;
                        ci0 ci0Var2 = h4Var2.f21983n;
                        int nextInt = Utilities.f14520b.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt >= 64) {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt != 98) {
                                        i19 = 720;
                                    }
                                }
                            }
                            int i20 = i18;
                            i18 = i19;
                            i19 = i20;
                        }
                        ci0Var2.P(i19);
                        ci0Var2.S(i19 - 1, h4Var2.R);
                        fi0Var.setAnimation(ci0Var2);
                        ci0Var2.M(i18);
                        fi0Var.d();
                        return;
                    case 2:
                        this.f21789b.a(true, true);
                        return;
                    case 3:
                        h4 h4Var3 = this.f21789b;
                        h4Var3.f21974a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.f21973a.c(0.0d);
                        h4Var3.W = false;
                        return;
                    default:
                        this.f21789b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final h4 f21789b;

            {
                this.f21789b = this;
            }

            @Override
            public final void run() {
                int i18;
                switch (r2) {
                    case 0:
                        h4 h4Var = this.f21789b;
                        h4Var.f21983n.S(0, null);
                        ci0 ci0Var = h4Var.h;
                        ci0Var.S(0, null);
                        h4Var.f21981f.setAnimation(ci0Var);
                        return;
                    case 1:
                        h4 h4Var2 = this.f21789b;
                        fi0 fi0Var = h4Var2.f21981f;
                        ci0 ci0Var2 = h4Var2.f21983n;
                        int nextInt = Utilities.f14520b.nextInt(100);
                        int i19 = 120;
                        if (nextInt < 32) {
                            i18 = 0;
                        } else {
                            i18 = 240;
                            if (nextInt >= 64) {
                                i19 = 420;
                                if (nextInt >= 97) {
                                    i18 = 540;
                                    if (nextInt != 98) {
                                        i19 = 720;
                                    }
                                }
                            }
                            int i20 = i18;
                            i18 = i19;
                            i19 = i20;
                        }
                        ci0Var2.P(i19);
                        ci0Var2.S(i19 - 1, h4Var2.R);
                        fi0Var.setAnimation(ci0Var2);
                        ci0Var2.M(i18);
                        fi0Var.d();
                        return;
                    case 2:
                        this.f21789b.a(true, true);
                        return;
                    case 3:
                        h4 h4Var3 = this.f21789b;
                        h4Var3.f21974a0 = false;
                        h4Var3.a(true, true);
                        h4Var3.f21973a.c(0.0d);
                        h4Var3.W = false;
                        return;
                    default:
                        this.f21789b.a(true, true);
                        return;
                }
            }
        };
        this.f21982f0 = -1;
        Paint paint = new Paint();
        this.I = paint;
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
        this.D = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        setClipChildren(false);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f21975b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
        boolean z10 = dd.X;
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
        addView(g9Var, w7.b6.d(46, 46.0f, i18, f7, 6.0f, f10, 0.0f));
        d4 d4Var = new d4(this, context);
        this.f21988y = d4Var;
        d4Var.setSize(org.telegram.messenger.i0.L(26.0f));
        d4Var.setProgressColor(-1);
        d4Var.setNoProgress(false);
        boolean z11 = dd.X;
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
        addView(d4Var, w7.b6.d(46, 46.0f, i19, f11, 6.0f, f12, 0.0f));
        org.telegram.messenger.i0.Y3(d4Var, false, 1.0f, true, false);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f21977c = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f20902bh, null);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setTextSize(16);
        u5Var.setDrawablePadding(org.telegram.messenger.i0.L(6.0f));
        if (dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        u5Var.setGravity(i12 | 48);
        boolean z12 = dd.X;
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
        addView(u5Var, w7.b6.d(-1, 20.0f, i20, f13, 10.0f, f14, 0.0f));
        this.f21984r = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), 9, u5Var, false);
        this.f21985s = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), 9, u5Var, false);
        Drawable drawable = context.getResources().getDrawable(2131232799);
        this.f21978c0 = drawable;
        org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.f20958eh, null, PorterDuff.Mode.MULTIPLY);
        int i21 = 0;
        while (true) {
            org.telegram.ui.ActionBar.u5[] u5VarArr = this.d;
            if (i21 >= u5VarArr.length) {
                break;
            }
            u5VarArr[i21] = new e4(this, context, i21);
            this.d[i21].setTextSize(15);
            org.telegram.ui.ActionBar.u5 u5Var2 = this.d[i21];
            if (dd.X) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            u5Var2.setGravity(i15 | 48);
            if (i21 == 4) {
                this.d[i21].setBuildFullLayout(true);
                org.telegram.ui.ActionBar.a7.Y(this.d[i21], org.telegram.ui.ActionBar.t6.f20977fh, null);
                org.telegram.ui.ActionBar.u5 u5Var3 = this.d[i21];
                boolean z13 = dd.X;
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
                addView(u5Var3, w7.b6.d(-1, -2.0f, i22, f17, 32.0f, f18, 0.0f));
            } else {
                if (i21 == 0) {
                    org.telegram.ui.ActionBar.a7.Y(this.d[i21], org.telegram.ui.ActionBar.t6.f20941dh, null);
                    this.d[i21].k(dd.L0(2131748887, null));
                } else if (i21 == 1) {
                    org.telegram.ui.ActionBar.a7.Y(this.d[i21], org.telegram.ui.ActionBar.t6.f20958eh, null);
                    this.d[i21].k(dd.L0(2131745291, null));
                    this.d[i21].setDrawablePadding(org.telegram.messenger.i0.L(2.0f));
                } else if (i21 == 2) {
                    org.telegram.ui.ActionBar.a7.Y(this.d[i21], org.telegram.ui.ActionBar.t6.f20995gh, null);
                    this.d[i21].k(dd.L0(2131743383, null));
                } else if (i21 == 3) {
                    org.telegram.ui.ActionBar.a7.Y(this.d[i21], org.telegram.ui.ActionBar.t6.f20941dh, null);
                    this.d[i21].k(dd.L0(2131742976, null));
                }
                org.telegram.ui.ActionBar.u5 u5Var4 = this.d[i21];
                boolean z14 = dd.X;
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
                addView(u5Var4, w7.b6.d(-1, 20.0f, i23, f15, 32.0f, f16, 0.0f));
            }
            i21++;
        }
        org.telegram.ui.ActionBar.u5 u5Var5 = new org.telegram.ui.ActionBar.u5(context);
        this.e = u5Var5;
        u5Var5.setMaxLines(3);
        u5Var5.setTextSize(15);
        org.telegram.ui.ActionBar.a7.Y(u5Var5, org.telegram.ui.ActionBar.t6.f20977fh, null);
        u5Var5.setVisibility(8);
        if (dd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(u5Var5, w7.b6.d(-1, 60.0f, i14 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        ci0 ci0Var = new ci0(2131624332, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(32.0f), true, null);
        this.h = ci0Var;
        this.f21983n = new ci0(2131624042, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f21981f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ci0Var);
        y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, this.T, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(h02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(h02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, w7.b6.d(48, -1.0f, (dd.X ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f21973a = new g4(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h4.a(boolean, boolean):void");
    }

    public final void b(int i10) {
        org.telegram.ui.ActionBar.u5[] u5VarArr;
        float f7;
        float L;
        float f10;
        float L2;
        float f11;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            u5VarArr = this.d;
            if (i13 >= u5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.u5 u5Var = u5VarArr[i13];
            if (i13 == i10) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            u5Var.setImportantForAccessibility(i11);
            i13++;
        }
        if (i10 == 0) {
            while (i12 < u5VarArr.length) {
                org.telegram.ui.ActionBar.u5 u5Var2 = u5VarArr[i12];
                if (i12 == i10) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.i0.L(-2.0f);
                }
                u5Var2.setTranslationY(L2);
                org.telegram.ui.ActionBar.u5 u5Var3 = u5VarArr[i12];
                if (i12 == i10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                u5Var3.setAlpha(f11);
                i12++;
            }
            return;
        }
        while (i12 < u5VarArr.length) {
            org.telegram.ui.ActionBar.u5 u5Var4 = u5VarArr[i12];
            if (i12 == i10) {
                L = 0.0f;
            } else {
                if (i12 == 0) {
                    f7 = 2.0f;
                } else {
                    f7 = -2.0f;
                }
                L = org.telegram.messenger.i0.L(f7);
            }
            u5Var4.setTranslationY(L);
            org.telegram.ui.ActionBar.u5 u5Var5 = u5VarArr[i12];
            if (i12 == i10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            u5Var5.setAlpha(f10);
            i12++;
        }
    }

    public final boolean c() {
        long j10 = this.Q;
        if (j10 > 0) {
            TLRPC.User user = this.G;
            if (user == null || user.f19943id != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.H;
        if (chat == null || chat.f19794id != (-j10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i10;
        if (this.N) {
            Paint paint = this.I;
            int alpha = paint.getAlpha();
            float f7 = this.f21980e0;
            if (f7 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f7) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(68.0f);
            } else {
                i10 = 0;
            }
            float f10 = L;
            canvas2 = canvas;
            canvas2.drawLine(f10, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.g9 g9Var = this.f21975b;
        int measuredWidth2 = (g9Var.getMeasuredWidth() / 2) + g9Var.getLeft();
        int measuredHeight2 = (g9Var.getMeasuredHeight() / 2) + g9Var.getTop();
        g4 g4Var = this.f21973a;
        g4Var.f();
        if (this.f21980e0 == 0.0f) {
            g4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        g9Var.setScaleX(g4Var.b());
        g9Var.setScaleY(g4Var.b());
        float b10 = g4Var.b();
        d4 d4Var = this.f21988y;
        d4Var.setScaleX(b10);
        d4Var.setScaleY(g4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(org.telegram.messenger.c cVar, TLRPC.GroupCallParticipant groupCallParticipant, org.telegram.messenger.u3 u3Var, long j10, TLRPC.FileLocation fileLocation, boolean z10) {
        long j11;
        long c10;
        boolean z11;
        boolean z12;
        this.E = u3Var;
        this.M = cVar;
        this.Q = j10;
        this.F = groupCallParticipant;
        long C1 = kj.C1(groupCallParticipant.peer);
        int i10 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.u5 u5Var = this.f21977c;
        org.telegram.ui.Components.g9 g9Var = this.f21975b;
        org.telegram.ui.Components.r8 r8Var = this.D;
        org.telegram.ui.Components.d5 d5Var = this.f21985s;
        if (i10 > 0) {
            TLRPC.User Z1 = wp.r1(this.M.f15043a).Z1(Long.valueOf(C1));
            this.G = Z1;
            this.H = null;
            int i11 = this.M.f15043a;
            r8Var.r(Z1);
            u5Var.l(i20.p(this.G), false);
            c10 = org.telegram.messenger.o5.c(this.G);
            TLRPC.User user = this.G;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.f21986w;
                if (drawable == null) {
                    drawable = new jg.x0(getContext());
                }
                this.f21986w = drawable;
                d5Var.g(drawable, z10);
            } else if (user != null && org.telegram.messenger.o5.f(user.emoji_status) != 0) {
                d5Var.j(org.telegram.messenger.o5.f(this.G.emoji_status), z10);
            } else {
                TLRPC.User user2 = this.G;
                if (user2 != null && user2.premium) {
                    if (this.f21987x == null) {
                        this.f21987x = getContext().getResources().getDrawable(2131232306).mutate();
                        this.f21987x = new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.f21987x);
                    }
                    d5Var.g(this.f21987x, z10);
                } else {
                    d5Var.g(null, z10);
                }
            }
            d5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false)));
            u5Var.i(d5Var);
            ImageReceiver imageReceiver = g9Var.getImageReceiver();
            int i12 = cVar.f15043a;
            imageReceiver.d = i12;
            if (fileLocation != null) {
                this.f21976b0 = true;
                g9Var.j(jc.e(fileLocation), "50_50", r8Var, null);
            } else {
                jc l4 = jc.l(i12, 1, this.G);
                if (l4 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f21976b0 = z12;
                g9Var.j(l4, "50_50", r8Var, this.G);
            }
        } else {
            j11 = 0;
            TLRPC.Chat L0 = wp.r1(this.M.f15043a).L0(Long.valueOf(-C1));
            this.H = L0;
            this.G = null;
            int i13 = this.M.f15043a;
            r8Var.q(L0);
            c10 = org.telegram.messenger.o5.c(this.H);
            TLRPC.Chat chat = this.H;
            if (chat != null) {
                u5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.H;
                if (chat2.verified) {
                    Drawable drawable2 = this.f21986w;
                    if (drawable2 == null) {
                        drawable2 = new jg.x0(getContext());
                    }
                    this.f21986w = drawable2;
                    d5Var.g(drawable2, z10);
                } else if (org.telegram.messenger.o5.f(chat2.emoji_status) != 0) {
                    d5Var.j(org.telegram.messenger.o5.f(this.H.emoji_status), z10);
                } else {
                    d5Var.g(null, z10);
                }
                g9Var.getImageReceiver().d = cVar.f15043a;
                if (fileLocation != null) {
                    this.f21976b0 = true;
                    g9Var.j(jc.e(fileLocation), "50_50", r8Var, null);
                } else {
                    jc a2 = jc.a(1, this.H);
                    if (a2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f21976b0 = z11;
                    g9Var.j(a2, "50_50", r8Var, this.H);
                }
            }
        }
        int i14 = (c10 > j11 ? 1 : (c10 == j11 ? 0 : -1));
        org.telegram.ui.Components.d5 d5Var2 = this.f21984r;
        if (i14 != 0) {
            d5Var2.j(c10, z10);
            u5Var.setLeftDrawable(d5Var2);
            d5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false)));
        } else {
            d5Var2.g(null, z10);
            u5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i10, int i11) {
        if (this.T != i10) {
            if (this.O) {
                this.L = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            }
            this.T = i10;
        }
        if (this.O) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN);
            fi0 fi0Var = this.f21981f;
            fi0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.t6.H1(fi0Var.getDrawable(), i11 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.g9 getAvatarImageView() {
        return this.f21975b;
    }

    public g4 getAvatarWavesDrawable() {
        return this.f21973a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        if (TextUtils.isEmpty(u5Var.getText()) || !this.f21976b0) {
            u5Var = this.d[4];
        }
        if (u5Var.getLineCount() > 1) {
            return org.telegram.messenger.i0.L(8.0f) + u5Var.getTop() + u5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f21977c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.F;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.F;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return kj.C1(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.d5 d5Var = this.f21985s;
        if (d5Var != null) {
            d5Var.a();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.f21984r;
        if (d5Var2 != null) {
            d5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.W) {
            org.telegram.messenger.i0.r(this.V);
            this.W = false;
        }
        AnimatorSet animatorSet = this.f21979d0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.d5 d5Var = this.f21985s;
        if (d5Var != null) {
            d5Var.b();
        }
        org.telegram.ui.Components.d5 d5Var2 = this.f21984r;
        if (d5Var2 != null) {
            d5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.F;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i10 = 2131743256;
            } else {
                i10 = 2131743319;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, dd.L0(i10, null)));
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.u5[] u5VarArr = this.d;
        if (z10) {
            u5VarArr[4].setTranslationY(0.0f);
        } else {
            u5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        int i10 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        g4 g4Var = this.f21973a;
        if (i10 > 0) {
            boolean z10 = this.W;
            c4 c4Var = this.V;
            if (z10) {
                org.telegram.messenger.i0.r(c4Var);
            }
            if (!this.f21974a0) {
                this.f21974a0 = true;
                a(true, false);
            }
            g4Var.c(d);
            org.telegram.messenger.i0.h3(c4Var, 500L);
            this.W = true;
            return;
        }
        g4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.g9 g9Var = this.f21975b;
        if (g9Var.getImageReceiver().Q0 != z10) {
            g9Var.getImageReceiver().O0(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.N = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f7) {
        int i10;
        int i11;
        int L;
        int L2;
        this.f21980e0 = f7;
        if (dd.X) {
            i10 = org.telegram.messenger.i0.L(53.0f);
        } else {
            i10 = -org.telegram.messenger.i0.L(53.0f);
        }
        this.f21977c.setTranslationX(i10 * f7);
        boolean c10 = c();
        boolean z10 = true;
        org.telegram.ui.ActionBar.u5 u5Var = this.e;
        float f10 = 0.0f;
        org.telegram.ui.ActionBar.u5[] u5VarArr = this.d;
        if (c10 && f7 > 0.0f) {
            if (dd.X) {
                L2 = -org.telegram.messenger.i0.L(53.0f);
            } else {
                L2 = org.telegram.messenger.i0.L(53.0f);
            }
            float f11 = 1.0f - f7;
            u5Var.setTranslationX(L2 * f11);
            u5Var.setVisibility(0);
            u5Var.setAlpha(f7);
            u5VarArr[4].setAlpha(f11);
            org.telegram.ui.ActionBar.u5 u5Var2 = u5VarArr[4];
            boolean z11 = dd.X;
            int L3 = org.telegram.messenger.i0.L(53.0f);
            if (!z11) {
                L3 = -L3;
            }
            u5Var2.setTranslationX(L3 * f7);
        } else {
            u5Var.setVisibility(8);
            for (int i12 = 0; i12 < u5VarArr.length; i12++) {
                if (!TextUtils.isEmpty(u5VarArr[4].getText()) && u5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.u5 u5Var3 = u5VarArr[i12];
                    int L4 = org.telegram.messenger.i0.L(92.0f);
                    if (dd.X) {
                        L = org.telegram.messenger.i0.L(48.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(53.0f);
                    }
                    u5Var3.h(L4, L);
                    u5VarArr[i12].setFullAlpha(f7);
                    u5VarArr[i12].setTranslationX(0.0f);
                    u5VarArr[i12].invalidate();
                } else {
                    org.telegram.ui.ActionBar.u5 u5Var4 = u5VarArr[i12];
                    if (dd.X) {
                        i11 = org.telegram.messenger.i0.L(53.0f);
                    } else {
                        i11 = -org.telegram.messenger.i0.L(53.0f);
                    }
                    u5Var4.setTranslationX(i11 * f7);
                    u5VarArr[i12].h(0, 0);
                }
            }
        }
        int i13 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i13 == 0) {
            f10 = 1.0f;
        }
        this.f21975b.setAlpha(f10);
        this.f21973a.e(this, (this.f21974a0 && i13 == 0) ? false : false);
        float f12 = 1.0f - f7;
        fi0 fi0Var = this.f21981f;
        fi0Var.setAlpha(f12);
        float f13 = (f12 * 0.4f) + 0.6f;
        fi0Var.setScaleX(f13);
        fi0Var.setScaleY(f13);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.u5 u5Var;
        org.telegram.ui.ActionBar.u5[] u5VarArr;
        org.telegram.ui.ActionBar.u5 u5Var2;
        try {
            this.I.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            int i10 = this.f21982f0;
            if (i10 >= 0 && (u5Var = this.e) != null && (u5VarArr = this.d) != null && i10 < u5VarArr.length && (u5Var2 = u5VarArr[i10]) != null) {
                org.telegram.ui.ActionBar.a7.b0(u5Var2);
                u5Var.setTextColor(u5VarArr[this.f21982f0].getTextColor());
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(h4 h4Var) {
    }
}
