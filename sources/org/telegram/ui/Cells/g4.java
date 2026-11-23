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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
public class g4 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.b9 E;
    public org.telegram.messenger.t3 F;
    public TLRPC.GroupCallParticipant G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public final Paint J;
    public boolean K;
    public boolean L;
    public int M;
    public org.telegram.messenger.c N;
    public boolean O;
    public boolean P;
    public int Q;
    public long R;
    public final b4 S;
    public final b4 T;
    public int U;
    public final b4 V;
    public final b4 W;
    public final f4 f30681a;
    public boolean f30682a0;
    public final org.telegram.ui.Components.q9 f30683b;
    public boolean f30684b0;
    public final org.telegram.ui.ActionBar.m5 f30685c;
    public boolean f30686c0;
    public final org.telegram.ui.ActionBar.m5[] d;
    public final Drawable f30687d0;
    public final org.telegram.ui.ActionBar.m5 f30688e;
    public AnimatorSet f30689e0;
    public final rh0 f30690f;
    public float f30691f0;
    public int f30692g0;
    public final oh0 h;
    public final oh0 f30693n;
    public final org.telegram.ui.Components.n5 f30694r;
    public final org.telegram.ui.Components.n5 f30695s;
    public Drawable f30696w;
    public Drawable f30697x;
    public final c4 f30698y;

    public g4(Context context) {
        super(context);
        int i7;
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
        this.d = new org.telegram.ui.ActionBar.m5[5];
        this.S = new Runnable(this) {
            public final g4 f30461b;

            {
                this.f30461b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        g4 g4Var = this.f30461b;
                        g4Var.f30693n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f30690f.setAnimation(oh0Var);
                        return;
                    case 1:
                        g4 g4Var2 = this.f30461b;
                        rh0 rh0Var = g4Var2.f30690f;
                        oh0 oh0Var2 = g4Var2.f30693n;
                        int nextInt = Utilities.f22808b.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt >= 64) {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt != 98) {
                                        i18 = 720;
                                    }
                                }
                            }
                            int i19 = i17;
                            i17 = i18;
                            i18 = i19;
                        }
                        oh0Var2.P(i18);
                        oh0Var2.S(i18 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i17);
                        rh0Var.d();
                        return;
                    case 2:
                        this.f30461b.a(true, true);
                        return;
                    case 3:
                        g4 g4Var3 = this.f30461b;
                        g4Var3.f30684b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.f30681a.c(0.0d);
                        g4Var3.f30682a0 = false;
                        return;
                    default:
                        this.f30461b.a(true, true);
                        return;
                }
            }
        };
        this.T = new Runnable(this) {
            public final g4 f30461b;

            {
                this.f30461b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        g4 g4Var = this.f30461b;
                        g4Var.f30693n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f30690f.setAnimation(oh0Var);
                        return;
                    case 1:
                        g4 g4Var2 = this.f30461b;
                        rh0 rh0Var = g4Var2.f30690f;
                        oh0 oh0Var2 = g4Var2.f30693n;
                        int nextInt = Utilities.f22808b.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt >= 64) {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt != 98) {
                                        i18 = 720;
                                    }
                                }
                            }
                            int i19 = i17;
                            i17 = i18;
                            i18 = i19;
                        }
                        oh0Var2.P(i18);
                        oh0Var2.S(i18 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i17);
                        rh0Var.d();
                        return;
                    case 2:
                        this.f30461b.a(true, true);
                        return;
                    case 3:
                        g4 g4Var3 = this.f30461b;
                        g4Var3.f30684b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.f30681a.c(0.0d);
                        g4Var3.f30682a0 = false;
                        return;
                    default:
                        this.f30461b.a(true, true);
                        return;
                }
            }
        };
        this.U = org.telegram.ui.ActionBar.m6.f29482ih;
        this.V = new Runnable(this) {
            public final g4 f30461b;

            {
                this.f30461b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        g4 g4Var = this.f30461b;
                        g4Var.f30693n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f30690f.setAnimation(oh0Var);
                        return;
                    case 1:
                        g4 g4Var2 = this.f30461b;
                        rh0 rh0Var = g4Var2.f30690f;
                        oh0 oh0Var2 = g4Var2.f30693n;
                        int nextInt = Utilities.f22808b.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt >= 64) {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt != 98) {
                                        i18 = 720;
                                    }
                                }
                            }
                            int i19 = i17;
                            i17 = i18;
                            i18 = i19;
                        }
                        oh0Var2.P(i18);
                        oh0Var2.S(i18 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i17);
                        rh0Var.d();
                        return;
                    case 2:
                        this.f30461b.a(true, true);
                        return;
                    case 3:
                        g4 g4Var3 = this.f30461b;
                        g4Var3.f30684b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.f30681a.c(0.0d);
                        g4Var3.f30682a0 = false;
                        return;
                    default:
                        this.f30461b.a(true, true);
                        return;
                }
            }
        };
        this.W = new Runnable(this) {
            public final g4 f30461b;

            {
                this.f30461b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        g4 g4Var = this.f30461b;
                        g4Var.f30693n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f30690f.setAnimation(oh0Var);
                        return;
                    case 1:
                        g4 g4Var2 = this.f30461b;
                        rh0 rh0Var = g4Var2.f30690f;
                        oh0 oh0Var2 = g4Var2.f30693n;
                        int nextInt = Utilities.f22808b.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt >= 64) {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt != 98) {
                                        i18 = 720;
                                    }
                                }
                            }
                            int i19 = i17;
                            i17 = i18;
                            i18 = i19;
                        }
                        oh0Var2.P(i18);
                        oh0Var2.S(i18 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i17);
                        rh0Var.d();
                        return;
                    case 2:
                        this.f30461b.a(true, true);
                        return;
                    case 3:
                        g4 g4Var3 = this.f30461b;
                        g4Var3.f30684b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.f30681a.c(0.0d);
                        g4Var3.f30682a0 = false;
                        return;
                    default:
                        this.f30461b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final g4 f30461b;

            {
                this.f30461b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        g4 g4Var = this.f30461b;
                        g4Var.f30693n.S(0, null);
                        oh0 oh0Var = g4Var.h;
                        oh0Var.S(0, null);
                        g4Var.f30690f.setAnimation(oh0Var);
                        return;
                    case 1:
                        g4 g4Var2 = this.f30461b;
                        rh0 rh0Var = g4Var2.f30690f;
                        oh0 oh0Var2 = g4Var2.f30693n;
                        int nextInt = Utilities.f22808b.nextInt(100);
                        int i18 = 120;
                        if (nextInt < 32) {
                            i17 = 0;
                        } else {
                            i17 = 240;
                            if (nextInt >= 64) {
                                i18 = 420;
                                if (nextInt >= 97) {
                                    i17 = 540;
                                    if (nextInt != 98) {
                                        i18 = 720;
                                    }
                                }
                            }
                            int i19 = i17;
                            i17 = i18;
                            i18 = i19;
                        }
                        oh0Var2.P(i18);
                        oh0Var2.S(i18 - 1, g4Var2.S);
                        rh0Var.setAnimation(oh0Var2);
                        oh0Var2.M(i17);
                        rh0Var.d();
                        return;
                    case 2:
                        this.f30461b.a(true, true);
                        return;
                    case 3:
                        g4 g4Var3 = this.f30461b;
                        g4Var3.f30684b0 = false;
                        g4Var3.a(true, true);
                        g4Var3.f30681a.c(0.0d);
                        g4Var3.f30682a0 = false;
                        return;
                    default:
                        this.f30461b.a(true, true);
                        return;
                }
            }
        };
        this.f30692g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
        this.E = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        setClipChildren(false);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f30683b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = hd.f24444a0;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i17 = i7 | 48;
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
        addView(q9Var, c8.ma.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
        c4 c4Var = new c4(this, context);
        this.f30698y = c4Var;
        c4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        c4Var.setProgressColor(-1);
        c4Var.setNoProgress(false);
        boolean z11 = hd.f24444a0;
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
        addView(c4Var, c8.ma.d(46, 46.0f, i18, f12, 6.0f, f13, 0.0f));
        org.telegram.messenger.g0.X3(c4Var, false, 1.0f, true, false);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f30685c = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f29410eh, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        if (hd.f24444a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        m5Var.setGravity(i11 | 48);
        boolean z12 = hd.f24444a0;
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
        addView(m5Var, c8.ma.d(-1, 20.0f, i19, f14, 10.0f, f15, 0.0f));
        this.f30694r = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), 9, m5Var, false);
        this.f30695s = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), 9, m5Var, false);
        Drawable drawable = context.getResources().getDrawable(2131232804);
        this.f30687d0 = drawable;
        org.telegram.ui.ActionBar.t6.x(this, drawable, org.telegram.ui.ActionBar.m6.f29464hh, null, PorterDuff.Mode.MULTIPLY);
        int i20 = 0;
        while (true) {
            org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
            if (i20 >= m5VarArr.length) {
                break;
            }
            m5VarArr[i20] = new d4(this, context, i20);
            this.d[i20].setTextSize(15);
            org.telegram.ui.ActionBar.m5 m5Var2 = this.d[i20];
            if (hd.f24444a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            m5Var2.setGravity(i14 | 48);
            if (i20 == 4) {
                this.d[i20].setBuildFullLayout(true);
                org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f29482ih, null);
                org.telegram.ui.ActionBar.m5 m5Var3 = this.d[i20];
                boolean z13 = hd.f24444a0;
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
                addView(m5Var3, c8.ma.d(-1, -2.0f, i21, f18, 32.0f, f19, 0.0f));
            } else {
                if (i20 == 0) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f29447gh, null);
                    this.d[i20].k(hd.N0(2131748684, null));
                } else if (i20 == 1) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f29464hh, null);
                    this.d[i20].k(hd.N0(2131745077, null));
                    this.d[i20].setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
                } else if (i20 == 2) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f29501jh, null);
                    this.d[i20].k(hd.N0(2131743112, null));
                } else if (i20 == 3) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f29447gh, null);
                    this.d[i20].k(hd.N0(2131742684, null));
                }
                org.telegram.ui.ActionBar.m5 m5Var4 = this.d[i20];
                boolean z14 = hd.f24444a0;
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
                addView(m5Var4, c8.ma.d(-1, 20.0f, i22, f16, 32.0f, f17, 0.0f));
            }
            i20++;
        }
        org.telegram.ui.ActionBar.m5 m5Var5 = new org.telegram.ui.ActionBar.m5(context);
        this.f30688e = m5Var5;
        m5Var5.setMaxLines(3);
        m5Var5.setTextSize(15);
        org.telegram.ui.ActionBar.t6.X(m5Var5, org.telegram.ui.ActionBar.m6.f29482ih, null);
        m5Var5.setVisibility(8);
        if (hd.f24444a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(m5Var5, c8.ma.d(-1, 60.0f, i13 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        oh0 oh0Var = new oh0(2131624335, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        this.h = oh0Var;
        this.f30693n = new oh0(2131624044, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f30690f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(oh0Var);
        y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(h02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(h02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, c8.ma.d(48, -1.0f, (hd.f24444a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f30681a = new f4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g4.a(boolean, boolean):void");
    }

    public final void b(int i7) {
        org.telegram.ui.ActionBar.m5[] m5VarArr;
        float f10;
        float L;
        float f11;
        float L2;
        float f12;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            m5VarArr = this.d;
            if (i12 >= m5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.m5 m5Var = m5VarArr[i12];
            if (i12 == i7) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            m5Var.setImportantForAccessibility(i10);
            i12++;
        }
        if (i7 == 0) {
            while (i11 < m5VarArr.length) {
                org.telegram.ui.ActionBar.m5 m5Var2 = m5VarArr[i11];
                if (i11 == i7) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(-2.0f);
                }
                m5Var2.setTranslationY(L2);
                org.telegram.ui.ActionBar.m5 m5Var3 = m5VarArr[i11];
                if (i11 == i7) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                m5Var3.setAlpha(f12);
                i11++;
            }
            return;
        }
        while (i11 < m5VarArr.length) {
            org.telegram.ui.ActionBar.m5 m5Var4 = m5VarArr[i11];
            if (i11 == i7) {
                L = 0.0f;
            } else {
                if (i11 == 0) {
                    f10 = 2.0f;
                } else {
                    f10 = -2.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            m5Var4.setTranslationY(L);
            org.telegram.ui.ActionBar.m5 m5Var5 = m5VarArr[i11];
            if (i11 == i7) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            m5Var5.setAlpha(f11);
            i11++;
        }
    }

    public final boolean c() {
        long j3 = this.R;
        if (j3 > 0) {
            TLRPC.User user = this.H;
            if (user == null || user.f28583id != j3) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.I;
        if (chat == null || chat.f28434id != (-j3)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i7;
        if (this.O) {
            Paint paint = this.J;
            int alpha = paint.getAlpha();
            float f10 = this.f30691f0;
            if (f10 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f10) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24444a0) {
                i7 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i7 = 0;
            }
            float f11 = L;
            canvas2 = canvas;
            canvas2.drawLine(f11, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.q9 q9Var = this.f30683b;
        int measuredWidth2 = (q9Var.getMeasuredWidth() / 2) + q9Var.getLeft();
        int measuredHeight2 = (q9Var.getMeasuredHeight() / 2) + q9Var.getTop();
        f4 f4Var = this.f30681a;
        f4Var.f();
        if (this.f30691f0 == 0.0f) {
            f4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        q9Var.setScaleX(f4Var.b());
        q9Var.setScaleY(f4Var.b());
        float b10 = f4Var.b();
        c4 c4Var = this.f30698y;
        c4Var.setScaleX(b10);
        c4Var.setScaleY(f4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(org.telegram.messenger.c cVar, TLRPC.GroupCallParticipant groupCallParticipant, org.telegram.messenger.t3 t3Var, long j3, TLRPC.FileLocation fileLocation, boolean z10) {
        long j10;
        long c10;
        boolean z11;
        boolean z12;
        this.F = t3Var;
        this.N = cVar;
        this.R = j3;
        this.G = groupCallParticipant;
        long B1 = gj.B1(groupCallParticipant.peer);
        int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.m5 m5Var = this.f30685c;
        org.telegram.ui.Components.q9 q9Var = this.f30683b;
        org.telegram.ui.Components.b9 b9Var = this.E;
        org.telegram.ui.Components.n5 n5Var = this.f30695s;
        if (i7 > 0) {
            TLRPC.User c22 = np.u1(this.N.f23202a).c2(Long.valueOf(B1));
            this.H = c22;
            this.I = null;
            int i10 = this.N.f23202a;
            b9Var.r(c22);
            m5Var.l(p10.q(this.H), false);
            c10 = org.telegram.messenger.n5.c(this.H);
            TLRPC.User user = this.H;
            j10 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.f30696w;
                if (drawable == null) {
                    drawable = new hi.k3(getContext());
                }
                this.f30696w = drawable;
                n5Var.g(drawable, z10);
            } else if (user != null && org.telegram.messenger.n5.f(user.emoji_status) != 0) {
                n5Var.j(org.telegram.messenger.n5.f(this.H.emoji_status), z10);
            } else {
                TLRPC.User user2 = this.H;
                if (user2 != null && user2.premium) {
                    if (this.f30697x == null) {
                        this.f30697x = getContext().getResources().getDrawable(2131232309).mutate();
                        this.f30697x = new org.telegram.ui.Components.o5(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f30697x);
                    }
                    n5Var.g(this.f30697x, z10);
                } else {
                    n5Var.g(null, z10);
                }
            }
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ck, false)));
            m5Var.i(n5Var);
            ImageReceiver imageReceiver = q9Var.getImageReceiver();
            int i11 = cVar.f23202a;
            imageReceiver.d = i11;
            if (fileLocation != null) {
                this.f30686c0 = true;
                q9Var.j(gc.e(fileLocation), "50_50", b9Var, null);
            } else {
                gc l10 = gc.l(i11, 1, this.H);
                if (l10 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f30686c0 = z12;
                q9Var.j(l10, "50_50", b9Var, this.H);
            }
        } else {
            j10 = 0;
            TLRPC.Chat O0 = np.u1(this.N.f23202a).O0(Long.valueOf(-B1));
            this.I = O0;
            this.H = null;
            int i12 = this.N.f23202a;
            b9Var.q(O0);
            c10 = org.telegram.messenger.n5.c(this.I);
            TLRPC.Chat chat = this.I;
            if (chat != null) {
                m5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.I;
                if (chat2.verified) {
                    Drawable drawable2 = this.f30696w;
                    if (drawable2 == null) {
                        drawable2 = new hi.k3(getContext());
                    }
                    this.f30696w = drawable2;
                    n5Var.g(drawable2, z10);
                } else if (org.telegram.messenger.n5.f(chat2.emoji_status) != 0) {
                    n5Var.j(org.telegram.messenger.n5.f(this.I.emoji_status), z10);
                } else {
                    n5Var.g(null, z10);
                }
                q9Var.getImageReceiver().d = cVar.f23202a;
                if (fileLocation != null) {
                    this.f30686c0 = true;
                    q9Var.j(gc.e(fileLocation), "50_50", b9Var, null);
                } else {
                    gc a10 = gc.a(1, this.I);
                    if (a10 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f30686c0 = z11;
                    q9Var.j(a10, "50_50", b9Var, this.I);
                }
            }
        }
        int i13 = (c10 > j10 ? 1 : (c10 == j10 ? 0 : -1));
        org.telegram.ui.Components.n5 n5Var2 = this.f30694r;
        if (i13 != 0) {
            n5Var2.j(c10, z10);
            m5Var.setLeftDrawable(n5Var2);
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ck, false)));
        } else {
            n5Var2.g(null, z10);
            m5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i7, int i10) {
        if (this.U != i7) {
            if (this.P) {
                this.M = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            }
            this.U = i7;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            rh0 rh0Var = this.f30690f;
            rh0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.m6.H1(rh0Var.getDrawable(), i10 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.q9 getAvatarImageView() {
        return this.f30683b;
    }

    public f4 getAvatarWavesDrawable() {
        return this.f30681a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.m5 m5Var = this.f30688e;
        if (TextUtils.isEmpty(m5Var.getText()) || !this.f30686c0) {
            m5Var = this.d[4];
        }
        if (m5Var.getLineCount() > 1) {
            return org.telegram.messenger.g0.L(8.0f) + m5Var.getTop() + m5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f30685c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.G;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return gj.B1(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.n5 n5Var = this.f30695s;
        if (n5Var != null) {
            n5Var.a();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f30694r;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f30682a0) {
            org.telegram.messenger.g0.r(this.W);
            this.f30682a0 = false;
        }
        AnimatorSet animatorSet = this.f30689e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.n5 n5Var = this.f30695s;
        if (n5Var != null) {
            n5Var.b();
        }
        org.telegram.ui.Components.n5 n5Var2 = this.f30694r;
        if (n5Var2 != null) {
            n5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i7 = 2131742985;
            } else {
                i7 = 2131743048;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hd.N0(i7, null)));
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
        if (z10) {
            m5VarArr[4].setTranslationY(0.0f);
        } else {
            m5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        f4 f4Var = this.f30681a;
        if (i7 > 0) {
            boolean z10 = this.f30682a0;
            b4 b4Var = this.W;
            if (z10) {
                org.telegram.messenger.g0.r(b4Var);
            }
            if (!this.f30684b0) {
                this.f30684b0 = true;
                a(true, false);
            }
            f4Var.c(d);
            org.telegram.messenger.g0.h3(b4Var, 500L);
            this.f30682a0 = true;
            return;
        }
        f4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.q9 q9Var = this.f30683b;
        if (q9Var.getImageReceiver().R0 != z10) {
            q9Var.getImageReceiver().O0(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        int i7;
        int i10;
        int L;
        int L2;
        this.f30691f0 = f10;
        if (hd.f24444a0) {
            i7 = org.telegram.messenger.g0.L(53.0f);
        } else {
            i7 = -org.telegram.messenger.g0.L(53.0f);
        }
        this.f30685c.setTranslationX(i7 * f10);
        boolean c10 = c();
        boolean z10 = true;
        org.telegram.ui.ActionBar.m5 m5Var = this.f30688e;
        float f11 = 0.0f;
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
        if (c10 && f10 > 0.0f) {
            if (hd.f24444a0) {
                L2 = -org.telegram.messenger.g0.L(53.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(53.0f);
            }
            float f12 = 1.0f - f10;
            m5Var.setTranslationX(L2 * f12);
            m5Var.setVisibility(0);
            m5Var.setAlpha(f10);
            m5VarArr[4].setAlpha(f12);
            org.telegram.ui.ActionBar.m5 m5Var2 = m5VarArr[4];
            boolean z11 = hd.f24444a0;
            int L3 = org.telegram.messenger.g0.L(53.0f);
            if (!z11) {
                L3 = -L3;
            }
            m5Var2.setTranslationX(L3 * f10);
        } else {
            m5Var.setVisibility(8);
            for (int i11 = 0; i11 < m5VarArr.length; i11++) {
                if (!TextUtils.isEmpty(m5VarArr[4].getText()) && m5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.m5 m5Var3 = m5VarArr[i11];
                    int L4 = org.telegram.messenger.g0.L(92.0f);
                    if (hd.f24444a0) {
                        L = org.telegram.messenger.g0.L(48.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(53.0f);
                    }
                    m5Var3.h(L4, L);
                    m5VarArr[i11].setFullAlpha(f10);
                    m5VarArr[i11].setTranslationX(0.0f);
                    m5VarArr[i11].invalidate();
                } else {
                    org.telegram.ui.ActionBar.m5 m5Var4 = m5VarArr[i11];
                    if (hd.f24444a0) {
                        i10 = org.telegram.messenger.g0.L(53.0f);
                    } else {
                        i10 = -org.telegram.messenger.g0.L(53.0f);
                    }
                    m5Var4.setTranslationX(i10 * f10);
                    m5VarArr[i11].h(0, 0);
                }
            }
        }
        int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i12 == 0) {
            f11 = 1.0f;
        }
        this.f30683b.setAlpha(f11);
        this.f30681a.e(this, (this.f30684b0 && i12 == 0) ? false : false);
        float f13 = 1.0f - f10;
        rh0 rh0Var = this.f30690f;
        rh0Var.setAlpha(f13);
        float f14 = (f13 * 0.4f) + 0.6f;
        rh0Var.setScaleX(f14);
        rh0Var.setScaleY(f14);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.m5 m5Var;
        org.telegram.ui.ActionBar.m5[] m5VarArr;
        org.telegram.ui.ActionBar.m5 m5Var2;
        try {
            this.J.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
            int i7 = this.f30692g0;
            if (i7 >= 0 && (m5Var = this.f30688e) != null && (m5VarArr = this.d) != null && i7 < m5VarArr.length && (m5Var2 = m5VarArr[i7]) != null) {
                org.telegram.ui.ActionBar.t6.a0(m5Var2);
                m5Var.setTextColor(m5VarArr[this.f30692g0].getTextColor());
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(g4 g4Var) {
    }
}
