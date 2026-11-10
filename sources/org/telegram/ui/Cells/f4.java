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
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.zg0;
public class f4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.v8 D;
    public org.telegram.messenger.r3 E;
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
    public final a4 R;
    public final a4 S;
    public int T;
    public final a4 U;
    public final a4 V;
    public boolean W;
    public final e4 f29116a;
    public boolean f29117a0;
    public final org.telegram.ui.Components.k9 f29118b;
    public boolean f29119b0;
    public final org.telegram.ui.ActionBar.m5 f29120c;
    public final Drawable f29121c0;
    public final org.telegram.ui.ActionBar.m5[] d;
    public AnimatorSet f29122d0;
    public final org.telegram.ui.ActionBar.m5 f29123e;
    public float f29124e0;
    public final ch0 f29125f;
    public int f29126f0;
    public final zg0 h;
    public final zg0 f29127n;
    public final org.telegram.ui.Components.f5 f29128r;
    public final org.telegram.ui.Components.f5 f29129s;
    public Drawable f29130w;
    public Drawable f29131x;
    public final b4 f29132y;

    public f4(Context context) {
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
        this.R = new Runnable(this) {
            public final f4 f28891b;

            {
                this.f28891b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28891b;
                        f4Var.f29127n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f29125f.setAnimation(zg0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28891b;
                        ch0 ch0Var = f4Var2.f29125f;
                        zg0 zg0Var2 = f4Var2.f29127n;
                        int nextInt = Utilities.f21339b.nextInt(100);
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
                        zg0Var2.P(i18);
                        zg0Var2.S(i18 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i17);
                        ch0Var.d();
                        return;
                    case 2:
                        this.f28891b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28891b;
                        f4Var3.f29117a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29116a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f28891b.a(true, true);
                        return;
                }
            }
        };
        this.S = new Runnable(this) {
            public final f4 f28891b;

            {
                this.f28891b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28891b;
                        f4Var.f29127n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f29125f.setAnimation(zg0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28891b;
                        ch0 ch0Var = f4Var2.f29125f;
                        zg0 zg0Var2 = f4Var2.f29127n;
                        int nextInt = Utilities.f21339b.nextInt(100);
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
                        zg0Var2.P(i18);
                        zg0Var2.S(i18 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i17);
                        ch0Var.d();
                        return;
                    case 2:
                        this.f28891b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28891b;
                        f4Var3.f29117a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29116a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f28891b.a(true, true);
                        return;
                }
            }
        };
        this.T = org.telegram.ui.ActionBar.m6.f27936fh;
        this.U = new Runnable(this) {
            public final f4 f28891b;

            {
                this.f28891b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28891b;
                        f4Var.f29127n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f29125f.setAnimation(zg0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28891b;
                        ch0 ch0Var = f4Var2.f29125f;
                        zg0 zg0Var2 = f4Var2.f29127n;
                        int nextInt = Utilities.f21339b.nextInt(100);
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
                        zg0Var2.P(i18);
                        zg0Var2.S(i18 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i17);
                        ch0Var.d();
                        return;
                    case 2:
                        this.f28891b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28891b;
                        f4Var3.f29117a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29116a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f28891b.a(true, true);
                        return;
                }
            }
        };
        this.V = new Runnable(this) {
            public final f4 f28891b;

            {
                this.f28891b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28891b;
                        f4Var.f29127n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f29125f.setAnimation(zg0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28891b;
                        ch0 ch0Var = f4Var2.f29125f;
                        zg0 zg0Var2 = f4Var2.f29127n;
                        int nextInt = Utilities.f21339b.nextInt(100);
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
                        zg0Var2.P(i18);
                        zg0Var2.S(i18 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i17);
                        ch0Var.d();
                        return;
                    case 2:
                        this.f28891b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28891b;
                        f4Var3.f29117a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29116a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f28891b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final f4 f28891b;

            {
                this.f28891b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28891b;
                        f4Var.f29127n.S(0, null);
                        zg0 zg0Var = f4Var.h;
                        zg0Var.S(0, null);
                        f4Var.f29125f.setAnimation(zg0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28891b;
                        ch0 ch0Var = f4Var2.f29125f;
                        zg0 zg0Var2 = f4Var2.f29127n;
                        int nextInt = Utilities.f21339b.nextInt(100);
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
                        zg0Var2.P(i18);
                        zg0Var2.S(i18 - 1, f4Var2.R);
                        ch0Var.setAnimation(zg0Var2);
                        zg0Var2.M(i17);
                        ch0Var.d();
                        return;
                    case 2:
                        this.f28891b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28891b;
                        f4Var3.f29117a0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29116a.c(0.0d);
                        f4Var3.W = false;
                        return;
                    default:
                        this.f28891b.a(true, true);
                        return;
                }
            }
        };
        this.f29126f0 = -1;
        Paint paint = new Paint();
        this.I = paint;
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false));
        this.D = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        setClipChildren(false);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29118b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z9 = id.f23161a0;
        if (z9) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i17 = i7 | 48;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 11.0f;
        }
        if (z9) {
            f11 = 11.0f;
        } else {
            f11 = 0.0f;
        }
        addView(k9Var, c8.ha.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
        b4 b4Var = new b4(this, context);
        this.f29132y = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        b4Var.setProgressColor(-1);
        b4Var.setNoProgress(false);
        boolean z10 = id.f23161a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 48;
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
        addView(b4Var, c8.ha.d(46, 46.0f, i18, f12, 6.0f, f13, 0.0f));
        org.telegram.messenger.g0.Z3(b4Var, false, 1.0f, true, false);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f29120c = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f27863bh, null);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        if (id.f23161a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        m5Var.setGravity(i11 | 48);
        boolean z11 = id.f23161a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i19 = i12 | 48;
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
        addView(m5Var, c8.ha.d(-1, 20.0f, i19, f14, 10.0f, f15, 0.0f));
        this.f29128r = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(20.0f), 9, m5Var, false);
        this.f29129s = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(20.0f), 9, m5Var, false);
        Drawable drawable = context.getResources().getDrawable(2131232801);
        this.f29121c0 = drawable;
        org.telegram.ui.ActionBar.t6.x(this, drawable, org.telegram.ui.ActionBar.m6.f27919eh, null, PorterDuff.Mode.MULTIPLY);
        int i20 = 0;
        while (true) {
            org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
            if (i20 >= m5VarArr.length) {
                break;
            }
            m5VarArr[i20] = new c4(this, context, i20);
            this.d[i20].setTextSize(15);
            org.telegram.ui.ActionBar.m5 m5Var2 = this.d[i20];
            if (id.f23161a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            m5Var2.setGravity(i14 | 48);
            if (i20 == 4) {
                this.d[i20].setBuildFullLayout(true);
                org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f27936fh, null);
                org.telegram.ui.ActionBar.m5 m5Var3 = this.d[i20];
                boolean z12 = id.f23161a0;
                if (z12) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                int i21 = i16 | 48;
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
                addView(m5Var3, c8.ha.d(-1, -2.0f, i21, f18, 32.0f, f19, 0.0f));
            } else {
                if (i20 == 0) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f27900dh, null);
                    this.d[i20].k(id.M0(2131748877, null));
                } else if (i20 == 1) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f27919eh, null);
                    this.d[i20].k(id.M0(2131745273, null));
                    this.d[i20].setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
                } else if (i20 == 2) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f27956gh, null);
                    this.d[i20].k(id.M0(2131743357, null));
                } else if (i20 == 3) {
                    org.telegram.ui.ActionBar.t6.X(this.d[i20], org.telegram.ui.ActionBar.m6.f27900dh, null);
                    this.d[i20].k(id.M0(2131742950, null));
                }
                org.telegram.ui.ActionBar.m5 m5Var4 = this.d[i20];
                boolean z13 = id.f23161a0;
                if (z13) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                int i22 = i15 | 48;
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
                addView(m5Var4, c8.ha.d(-1, 20.0f, i22, f16, 32.0f, f17, 0.0f));
            }
            i20++;
        }
        org.telegram.ui.ActionBar.m5 m5Var5 = new org.telegram.ui.ActionBar.m5(context);
        this.f29123e = m5Var5;
        m5Var5.setMaxLines(3);
        m5Var5.setTextSize(15);
        org.telegram.ui.ActionBar.t6.X(m5Var5, org.telegram.ui.ActionBar.m6.f27936fh, null);
        m5Var5.setVisibility(8);
        if (id.f23161a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(m5Var5, c8.ha.d(-1, 60.0f, i13 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        zg0 zg0Var = new zg0(2131624334, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        this.h = zg0Var;
        this.f29127n = new zg0(2131624043, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f29125f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(zg0Var);
        y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, this.T, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(h02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(h02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, c8.ha.d(48, -1.0f, (id.f23161a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f29116a = new e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f4.a(boolean, boolean):void");
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
        long j3 = this.Q;
        if (j3 > 0) {
            TLRPC.User user = this.G;
            if (user == null || user.f27109id != j3) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.H;
        if (chat == null || chat.f26960id != (-j3)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i7;
        if (this.N) {
            Paint paint = this.I;
            int alpha = paint.getAlpha();
            float f10 = this.f29124e0;
            if (f10 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f10) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
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
        org.telegram.ui.Components.k9 k9Var = this.f29118b;
        int measuredWidth2 = (k9Var.getMeasuredWidth() / 2) + k9Var.getLeft();
        int measuredHeight2 = (k9Var.getMeasuredHeight() / 2) + k9Var.getTop();
        e4 e4Var = this.f29116a;
        e4Var.f();
        if (this.f29124e0 == 0.0f) {
            e4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        k9Var.setScaleX(e4Var.b());
        k9Var.setScaleY(e4Var.b());
        float b10 = e4Var.b();
        b4 b4Var = this.f29132y;
        b4Var.setScaleX(b10);
        b4Var.setScaleY(e4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(org.telegram.messenger.c cVar, TLRPC.GroupCallParticipant groupCallParticipant, org.telegram.messenger.r3 r3Var, long j3, TLRPC.FileLocation fileLocation, boolean z9) {
        long j10;
        long c10;
        boolean z10;
        boolean z11;
        this.E = r3Var;
        this.M = cVar;
        this.Q = j3;
        this.F = groupCallParticipant;
        long B1 = ij.B1(groupCallParticipant.peer);
        int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.m5 m5Var = this.f29120c;
        org.telegram.ui.Components.k9 k9Var = this.f29118b;
        org.telegram.ui.Components.v8 v8Var = this.D;
        org.telegram.ui.Components.f5 f5Var = this.f29129s;
        if (i7 > 0) {
            TLRPC.User a22 = qp.s1(this.M.f21770a).a2(Long.valueOf(B1));
            this.G = a22;
            this.H = null;
            int i10 = this.M.f21770a;
            v8Var.r(a22);
            m5Var.l(t10.p(this.G), false);
            c10 = org.telegram.messenger.m5.c(this.G);
            TLRPC.User user = this.G;
            j10 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.f29130w;
                if (drawable == null) {
                    drawable = new fi.l3(getContext());
                }
                this.f29130w = drawable;
                f5Var.g(drawable, z9);
            } else if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
                f5Var.j(org.telegram.messenger.m5.f(this.G.emoji_status), z9);
            } else {
                TLRPC.User user2 = this.G;
                if (user2 != null && user2.premium) {
                    if (this.f29131x == null) {
                        this.f29131x = getContext().getResources().getDrawable(2131232307).mutate();
                        this.f29131x = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f29131x);
                    }
                    f5Var.g(this.f29131x, z9);
                } else {
                    f5Var.g(null, z9);
                }
            }
            f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zk, false)));
            m5Var.i(f5Var);
            ImageReceiver imageReceiver = k9Var.getImageReceiver();
            int i11 = cVar.f21770a;
            imageReceiver.d = i11;
            if (fileLocation != null) {
                this.f29119b0 = true;
                k9Var.j(hc.e(fileLocation), "50_50", v8Var, null);
            } else {
                hc l10 = hc.l(i11, 1, this.G);
                if (l10 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f29119b0 = z11;
                k9Var.j(l10, "50_50", v8Var, this.G);
            }
        } else {
            j10 = 0;
            TLRPC.Chat M0 = qp.s1(this.M.f21770a).M0(Long.valueOf(-B1));
            this.H = M0;
            this.G = null;
            int i12 = this.M.f21770a;
            v8Var.q(M0);
            c10 = org.telegram.messenger.m5.c(this.H);
            TLRPC.Chat chat = this.H;
            if (chat != null) {
                m5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.H;
                if (chat2.verified) {
                    Drawable drawable2 = this.f29130w;
                    if (drawable2 == null) {
                        drawable2 = new fi.l3(getContext());
                    }
                    this.f29130w = drawable2;
                    f5Var.g(drawable2, z9);
                } else if (org.telegram.messenger.m5.f(chat2.emoji_status) != 0) {
                    f5Var.j(org.telegram.messenger.m5.f(this.H.emoji_status), z9);
                } else {
                    f5Var.g(null, z9);
                }
                k9Var.getImageReceiver().d = cVar.f21770a;
                if (fileLocation != null) {
                    this.f29119b0 = true;
                    k9Var.j(hc.e(fileLocation), "50_50", v8Var, null);
                } else {
                    hc a10 = hc.a(1, this.H);
                    if (a10 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f29119b0 = z10;
                    k9Var.j(a10, "50_50", v8Var, this.H);
                }
            }
        }
        int i13 = (c10 > j10 ? 1 : (c10 == j10 ? 0 : -1));
        org.telegram.ui.Components.f5 f5Var2 = this.f29128r;
        if (i13 != 0) {
            f5Var2.j(c10, z9);
            m5Var.setLeftDrawable(f5Var2);
            f5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zk, false)));
        } else {
            f5Var2.g(null, z9);
            m5Var.setLeftDrawable((Drawable) null);
        }
        a(z9, false);
    }

    public final void f(int i7, int i10) {
        if (this.T != i7) {
            if (this.O) {
                this.L = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            }
            this.T = i7;
        }
        if (this.O) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            ch0 ch0Var = this.f29125f;
            ch0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.m6.H1(ch0Var.getDrawable(), i10 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.k9 getAvatarImageView() {
        return this.f29118b;
    }

    public e4 getAvatarWavesDrawable() {
        return this.f29116a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.m5 m5Var = this.f29123e;
        if (TextUtils.isEmpty(m5Var.getText()) || !this.f29119b0) {
            m5Var = this.d[4];
        }
        if (m5Var.getLineCount() > 1) {
            return org.telegram.messenger.g0.L(8.0f) + m5Var.getTop() + m5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f29120c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.F;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.F;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return ij.B1(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.f5 f5Var = this.f29129s;
        if (f5Var != null) {
            f5Var.a();
        }
        org.telegram.ui.Components.f5 f5Var2 = this.f29128r;
        if (f5Var2 != null) {
            f5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.W) {
            org.telegram.messenger.g0.r(this.V);
            this.W = false;
        }
        AnimatorSet animatorSet = this.f29122d0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.f5 f5Var = this.f29129s;
        if (f5Var != null) {
            f5Var.b();
        }
        org.telegram.ui.Components.f5 f5Var2 = this.f29128r;
        if (f5Var2 != null) {
            f5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.F;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i7 = 2131743230;
            } else {
                i7 = 2131743293;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, id.M0(i7, null)));
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z9) {
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
        if (z9) {
            m5VarArr[4].setTranslationY(0.0f);
        } else {
            m5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        e4 e4Var = this.f29116a;
        if (i7 > 0) {
            boolean z9 = this.W;
            a4 a4Var = this.V;
            if (z9) {
                org.telegram.messenger.g0.r(a4Var);
            }
            if (!this.f29117a0) {
                this.f29117a0 = true;
                a(true, false);
            }
            e4Var.c(d);
            org.telegram.messenger.g0.i3(a4Var, 500L);
            this.W = true;
            return;
        }
        e4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z9) {
        org.telegram.ui.Components.k9 k9Var = this.f29118b;
        if (k9Var.getImageReceiver().Q0 != z9) {
            k9Var.getImageReceiver().O0(z9, true);
        }
    }

    public void setDrawDivider(boolean z9) {
        this.N = z9;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        int i7;
        int i10;
        int L;
        int L2;
        this.f29124e0 = f10;
        if (id.f23161a0) {
            i7 = org.telegram.messenger.g0.L(53.0f);
        } else {
            i7 = -org.telegram.messenger.g0.L(53.0f);
        }
        this.f29120c.setTranslationX(i7 * f10);
        boolean c10 = c();
        boolean z9 = true;
        org.telegram.ui.ActionBar.m5 m5Var = this.f29123e;
        float f11 = 0.0f;
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.d;
        if (c10 && f10 > 0.0f) {
            if (id.f23161a0) {
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
            boolean z10 = id.f23161a0;
            int L3 = org.telegram.messenger.g0.L(53.0f);
            if (!z10) {
                L3 = -L3;
            }
            m5Var2.setTranslationX(L3 * f10);
        } else {
            m5Var.setVisibility(8);
            for (int i11 = 0; i11 < m5VarArr.length; i11++) {
                if (!TextUtils.isEmpty(m5VarArr[4].getText()) && m5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.m5 m5Var3 = m5VarArr[i11];
                    int L4 = org.telegram.messenger.g0.L(92.0f);
                    if (id.f23161a0) {
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
                    if (id.f23161a0) {
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
        this.f29118b.setAlpha(f11);
        this.f29116a.e(this, (this.f29117a0 && i12 == 0) ? false : false);
        float f13 = 1.0f - f10;
        ch0 ch0Var = this.f29125f;
        ch0Var.setAlpha(f13);
        float f14 = (f13 * 0.4f) + 0.6f;
        ch0Var.setScaleX(f14);
        ch0Var.setScaleY(f14);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.m5 m5Var;
        org.telegram.ui.ActionBar.m5[] m5VarArr;
        org.telegram.ui.ActionBar.m5 m5Var2;
        try {
            this.I.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Ug, false));
            int i7 = this.f29126f0;
            if (i7 >= 0 && (m5Var = this.f29123e) != null && (m5VarArr = this.d) != null && i7 < m5VarArr.length && (m5Var2 = m5VarArr[i7]) != null) {
                org.telegram.ui.ActionBar.t6.a0(m5Var2);
                m5Var.setTextColor(m5VarArr[this.f29126f0].getTextColor());
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(f4 f4Var) {
    }
}
