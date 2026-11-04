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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
public class f4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u8 E;
    public org.telegram.messenger.r3 F;
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
    public final a4 S;
    public final a4 T;
    public int U;
    public final a4 V;
    public final a4 W;
    public final e4 f29156a;
    public boolean f29157a0;
    public final org.telegram.ui.Components.k9 f29158b;
    public boolean f29159b0;
    public final org.telegram.ui.ActionBar.k5 f29160c;
    public boolean f29161c0;
    public final org.telegram.ui.ActionBar.k5[] d;
    public final Drawable f29162d0;
    public final org.telegram.ui.ActionBar.k5 f29163e;
    public AnimatorSet f29164e0;
    public final fh0 f29165f;
    public float f29166f0;
    public int f29167g0;
    public final ch0 h;
    public final ch0 f29168n;
    public final org.telegram.ui.Components.e5 f29169r;
    public final org.telegram.ui.Components.e5 f29170s;
    public Drawable f29171w;
    public Drawable f29172x;
    public final b4 f29173y;

    public f4(Context context) {
        super(context);
        int i3;
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
        this.d = new org.telegram.ui.ActionBar.k5[5];
        this.S = new Runnable(this) {
            public final f4 f28935b;

            {
                this.f28935b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28935b;
                        f4Var.f29168n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f29165f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28935b;
                        fh0 fh0Var = f4Var2.f29165f;
                        ch0 ch0Var2 = f4Var2.f29168n;
                        int nextInt = Utilities.f21385b.nextInt(100);
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
                        ch0Var2.P(i18);
                        ch0Var2.S(i18 - 1, f4Var2.S);
                        fh0Var.setAnimation(ch0Var2);
                        ch0Var2.M(i17);
                        fh0Var.d();
                        return;
                    case 2:
                        this.f28935b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28935b;
                        f4Var3.f29159b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29156a.c(0.0d);
                        f4Var3.f29157a0 = false;
                        return;
                    default:
                        this.f28935b.a(true, true);
                        return;
                }
            }
        };
        this.T = new Runnable(this) {
            public final f4 f28935b;

            {
                this.f28935b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28935b;
                        f4Var.f29168n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f29165f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28935b;
                        fh0 fh0Var = f4Var2.f29165f;
                        ch0 ch0Var2 = f4Var2.f29168n;
                        int nextInt = Utilities.f21385b.nextInt(100);
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
                        ch0Var2.P(i18);
                        ch0Var2.S(i18 - 1, f4Var2.S);
                        fh0Var.setAnimation(ch0Var2);
                        ch0Var2.M(i17);
                        fh0Var.d();
                        return;
                    case 2:
                        this.f28935b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28935b;
                        f4Var3.f29159b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29156a.c(0.0d);
                        f4Var3.f29157a0 = false;
                        return;
                    default:
                        this.f28935b.a(true, true);
                        return;
                }
            }
        };
        this.U = org.telegram.ui.ActionBar.k6.f27928fh;
        this.V = new Runnable(this) {
            public final f4 f28935b;

            {
                this.f28935b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28935b;
                        f4Var.f29168n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f29165f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28935b;
                        fh0 fh0Var = f4Var2.f29165f;
                        ch0 ch0Var2 = f4Var2.f29168n;
                        int nextInt = Utilities.f21385b.nextInt(100);
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
                        ch0Var2.P(i18);
                        ch0Var2.S(i18 - 1, f4Var2.S);
                        fh0Var.setAnimation(ch0Var2);
                        ch0Var2.M(i17);
                        fh0Var.d();
                        return;
                    case 2:
                        this.f28935b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28935b;
                        f4Var3.f29159b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29156a.c(0.0d);
                        f4Var3.f29157a0 = false;
                        return;
                    default:
                        this.f28935b.a(true, true);
                        return;
                }
            }
        };
        this.W = new Runnable(this) {
            public final f4 f28935b;

            {
                this.f28935b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28935b;
                        f4Var.f29168n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f29165f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28935b;
                        fh0 fh0Var = f4Var2.f29165f;
                        ch0 ch0Var2 = f4Var2.f29168n;
                        int nextInt = Utilities.f21385b.nextInt(100);
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
                        ch0Var2.P(i18);
                        ch0Var2.S(i18 - 1, f4Var2.S);
                        fh0Var.setAnimation(ch0Var2);
                        ch0Var2.M(i17);
                        fh0Var.d();
                        return;
                    case 2:
                        this.f28935b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28935b;
                        f4Var3.f29159b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29156a.c(0.0d);
                        f4Var3.f29157a0 = false;
                        return;
                    default:
                        this.f28935b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final f4 f28935b;

            {
                this.f28935b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f28935b;
                        f4Var.f29168n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f29165f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f28935b;
                        fh0 fh0Var = f4Var2.f29165f;
                        ch0 ch0Var2 = f4Var2.f29168n;
                        int nextInt = Utilities.f21385b.nextInt(100);
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
                        ch0Var2.P(i18);
                        ch0Var2.S(i18 - 1, f4Var2.S);
                        fh0Var.setAnimation(ch0Var2);
                        ch0Var2.M(i17);
                        fh0Var.d();
                        return;
                    case 2:
                        this.f28935b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f28935b;
                        f4Var3.f29159b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f29156a.c(0.0d);
                        f4Var3.f29157a0 = false;
                        return;
                    default:
                        this.f28935b.a(true, true);
                        return;
                }
            }
        };
        this.f29167g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
        this.E = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        setClipChildren(false);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f29158b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = bd.f21784a0;
        if (z10) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i17 = i3 | 48;
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
        addView(k9Var, mf.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
        b4 b4Var = new b4(this, context);
        this.f29173y = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        b4Var.setProgressColor(-1);
        b4Var.setNoProgress(false);
        boolean z11 = bd.f21784a0;
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
        addView(b4Var, mf.d(46, 46.0f, i18, f12, 6.0f, f13, 0.0f));
        org.telegram.messenger.g0.Z3(b4Var, false, 1.0f, true, false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f29160c = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27853bh, null);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        k5Var.setGravity(i11 | 48);
        boolean z12 = bd.f21784a0;
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
        addView(k5Var, mf.d(-1, 20.0f, i19, f14, 10.0f, f15, 0.0f));
        this.f29169r = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 9, k5Var, false);
        this.f29170s = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 9, k5Var, false);
        Drawable drawable = context.getResources().getDrawable(2131232799);
        this.f29162d0 = drawable;
        org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.f27908eh, null, PorterDuff.Mode.MULTIPLY);
        int i20 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
            if (i20 >= k5VarArr.length) {
                break;
            }
            k5VarArr[i20] = new c4(this, context, i20);
            this.d[i20].setTextSize(15);
            org.telegram.ui.ActionBar.k5 k5Var2 = this.d[i20];
            if (bd.f21784a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            k5Var2.setGravity(i14 | 48);
            if (i20 == 4) {
                this.d[i20].setBuildFullLayout(true);
                org.telegram.ui.ActionBar.r6.Y(this.d[i20], org.telegram.ui.ActionBar.k6.f27928fh, null);
                org.telegram.ui.ActionBar.k5 k5Var3 = this.d[i20];
                boolean z13 = bd.f21784a0;
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
                addView(k5Var3, mf.d(-1, -2.0f, i21, f18, 32.0f, f19, 0.0f));
            } else {
                if (i20 == 0) {
                    org.telegram.ui.ActionBar.r6.Y(this.d[i20], org.telegram.ui.ActionBar.k6.f27889dh, null);
                    this.d[i20].k(bd.M0(2131748885, null));
                } else if (i20 == 1) {
                    org.telegram.ui.ActionBar.r6.Y(this.d[i20], org.telegram.ui.ActionBar.k6.f27908eh, null);
                    this.d[i20].k(bd.M0(2131745283, null));
                    this.d[i20].setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
                } else if (i20 == 2) {
                    org.telegram.ui.ActionBar.r6.Y(this.d[i20], org.telegram.ui.ActionBar.k6.f27947gh, null);
                    this.d[i20].k(bd.M0(2131743367, null));
                } else if (i20 == 3) {
                    org.telegram.ui.ActionBar.r6.Y(this.d[i20], org.telegram.ui.ActionBar.k6.f27889dh, null);
                    this.d[i20].k(bd.M0(2131742960, null));
                }
                org.telegram.ui.ActionBar.k5 k5Var4 = this.d[i20];
                boolean z14 = bd.f21784a0;
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
                addView(k5Var4, mf.d(-1, 20.0f, i22, f16, 32.0f, f17, 0.0f));
            }
            i20++;
        }
        org.telegram.ui.ActionBar.k5 k5Var5 = new org.telegram.ui.ActionBar.k5(context);
        this.f29163e = k5Var5;
        k5Var5.setMaxLines(3);
        k5Var5.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var5, org.telegram.ui.ActionBar.k6.f27928fh, null);
        k5Var5.setVisibility(8);
        if (bd.f21784a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(k5Var5, mf.d(-1, 60.0f, i13 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        ch0 ch0Var = new ch0(2131624334, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        this.h = ch0Var;
        this.f29168n = new ch0(2131624043, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f29165f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ch0Var);
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(h02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(h02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, mf.d(48, -1.0f, (bd.f21784a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f29156a = new e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f4.a(boolean, boolean):void");
    }

    public final void b(int i3) {
        org.telegram.ui.ActionBar.k5[] k5VarArr;
        float f10;
        float L;
        float f11;
        float L2;
        float f12;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            k5VarArr = this.d;
            if (i12 >= k5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i12];
            if (i12 == i3) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            k5Var.setImportantForAccessibility(i10);
            i12++;
        }
        if (i3 == 0) {
            while (i11 < k5VarArr.length) {
                org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[i11];
                if (i11 == i3) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(-2.0f);
                }
                k5Var2.setTranslationY(L2);
                org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[i11];
                if (i11 == i3) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                k5Var3.setAlpha(f12);
                i11++;
            }
            return;
        }
        while (i11 < k5VarArr.length) {
            org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr[i11];
            if (i11 == i3) {
                L = 0.0f;
            } else {
                if (i11 == 0) {
                    f10 = 2.0f;
                } else {
                    f10 = -2.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            k5Var4.setTranslationY(L);
            org.telegram.ui.ActionBar.k5 k5Var5 = k5VarArr[i11];
            if (i11 == i3) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            k5Var5.setAlpha(f11);
            i11++;
        }
    }

    public final boolean c() {
        long j10 = this.R;
        if (j10 > 0) {
            TLRPC.User user = this.H;
            if (user == null || user.f27150id != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.I;
        if (chat == null || chat.f27001id != (-j10)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i3;
        if (this.O) {
            Paint paint = this.J;
            int alpha = paint.getAlpha();
            float f10 = this.f29166f0;
            if (f10 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f10) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(68.0f);
            } else {
                i3 = 0;
            }
            float f11 = L;
            canvas2 = canvas;
            canvas2.drawLine(f11, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        org.telegram.ui.Components.k9 k9Var = this.f29158b;
        int measuredWidth2 = (k9Var.getMeasuredWidth() / 2) + k9Var.getLeft();
        int measuredHeight2 = (k9Var.getMeasuredHeight() / 2) + k9Var.getTop();
        e4 e4Var = this.f29156a;
        e4Var.f();
        if (this.f29166f0 == 0.0f) {
            e4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        k9Var.setScaleX(e4Var.b());
        k9Var.setScaleY(e4Var.b());
        float b10 = e4Var.b();
        b4 b4Var = this.f29173y;
        b4Var.setScaleX(b10);
        b4Var.setScaleY(e4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(org.telegram.messenger.c cVar, TLRPC.GroupCallParticipant groupCallParticipant, org.telegram.messenger.r3 r3Var, long j10, TLRPC.FileLocation fileLocation, boolean z10) {
        long j11;
        long c2;
        boolean z11;
        boolean z12;
        this.F = r3Var;
        this.N = cVar;
        this.R = j10;
        this.G = groupCallParticipant;
        long C1 = zi.C1(groupCallParticipant.peer);
        int i3 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.k5 k5Var = this.f29160c;
        org.telegram.ui.Components.k9 k9Var = this.f29158b;
        org.telegram.ui.Components.u8 u8Var = this.E;
        org.telegram.ui.Components.e5 e5Var = this.f29170s;
        if (i3 > 0) {
            TLRPC.User a22 = hp.s1(this.N.f21919a).a2(Long.valueOf(C1));
            this.H = a22;
            this.I = null;
            int i10 = this.N.f21919a;
            u8Var.r(a22);
            k5Var.l(l10.p(this.H), false);
            c2 = org.telegram.messenger.m5.c(this.H);
            TLRPC.User user = this.H;
            j11 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.f29171w;
                if (drawable == null) {
                    drawable = new gi.k3(getContext());
                }
                this.f29171w = drawable;
                e5Var.g(drawable, z10);
            } else if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
                e5Var.j(org.telegram.messenger.m5.f(this.H.emoji_status), z10);
            } else {
                TLRPC.User user2 = this.H;
                if (user2 != null && user2.premium) {
                    if (this.f29172x == null) {
                        this.f29172x = getContext().getResources().getDrawable(2131232307).mutate();
                        this.f29172x = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f29172x);
                    }
                    e5Var.g(this.f29172x, z10);
                } else {
                    e5Var.g(null, z10);
                }
            }
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false)));
            k5Var.i(e5Var);
            ImageReceiver imageReceiver = k9Var.getImageReceiver();
            int i11 = cVar.f21919a;
            imageReceiver.d = i11;
            if (fileLocation != null) {
                this.f29161c0 = true;
                k9Var.j(ac.e(fileLocation), "50_50", u8Var, null);
            } else {
                ac l10 = ac.l(i11, 1, this.H);
                if (l10 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f29161c0 = z12;
                k9Var.j(l10, "50_50", u8Var, this.H);
            }
        } else {
            j11 = 0;
            TLRPC.Chat M0 = hp.s1(this.N.f21919a).M0(Long.valueOf(-C1));
            this.I = M0;
            this.H = null;
            int i12 = this.N.f21919a;
            u8Var.q(M0);
            c2 = org.telegram.messenger.m5.c(this.I);
            TLRPC.Chat chat = this.I;
            if (chat != null) {
                k5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.I;
                if (chat2.verified) {
                    Drawable drawable2 = this.f29171w;
                    if (drawable2 == null) {
                        drawable2 = new gi.k3(getContext());
                    }
                    this.f29171w = drawable2;
                    e5Var.g(drawable2, z10);
                } else if (org.telegram.messenger.m5.f(chat2.emoji_status) != 0) {
                    e5Var.j(org.telegram.messenger.m5.f(this.I.emoji_status), z10);
                } else {
                    e5Var.g(null, z10);
                }
                k9Var.getImageReceiver().d = cVar.f21919a;
                if (fileLocation != null) {
                    this.f29161c0 = true;
                    k9Var.j(ac.e(fileLocation), "50_50", u8Var, null);
                } else {
                    ac a10 = ac.a(1, this.I);
                    if (a10 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f29161c0 = z11;
                    k9Var.j(a10, "50_50", u8Var, this.I);
                }
            }
        }
        int i13 = (c2 > j11 ? 1 : (c2 == j11 ? 0 : -1));
        org.telegram.ui.Components.e5 e5Var2 = this.f29169r;
        if (i13 != 0) {
            e5Var2.j(c2, z10);
            k5Var.setLeftDrawable(e5Var2);
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false)));
        } else {
            e5Var2.g(null, z10);
            k5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i3, int i10) {
        if (this.U != i3) {
            if (this.P) {
                this.M = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            }
            this.U = i3;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            fh0 fh0Var = this.f29165f;
            fh0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.k6.H1(fh0Var.getDrawable(), i10 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.k9 getAvatarImageView() {
        return this.f29158b;
    }

    public e4 getAvatarWavesDrawable() {
        return this.f29156a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.k5 k5Var = this.f29163e;
        if (TextUtils.isEmpty(k5Var.getText()) || !this.f29161c0) {
            k5Var = this.d[4];
        }
        if (k5Var.getLineCount() > 1) {
            return org.telegram.messenger.g0.L(8.0f) + k5Var.getTop() + k5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f29160c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.G;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return zi.C1(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        org.telegram.ui.Components.e5 e5Var = this.f29170s;
        if (e5Var != null) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f29169r;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29157a0) {
            org.telegram.messenger.g0.r(this.W);
            this.f29157a0 = false;
        }
        AnimatorSet animatorSet = this.f29164e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.e5 e5Var = this.f29170s;
        if (e5Var != null) {
            e5Var.b();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f29169r;
        if (e5Var2 != null) {
            e5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i3 = 2131743240;
            } else {
                i3 = 2131743303;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, bd.M0(i3, null)));
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z10) {
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
        if (z10) {
            k5VarArr[4].setTranslationY(0.0f);
        } else {
            k5VarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        int i3 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        e4 e4Var = this.f29156a;
        if (i3 > 0) {
            boolean z10 = this.f29157a0;
            a4 a4Var = this.W;
            if (z10) {
                org.telegram.messenger.g0.r(a4Var);
            }
            if (!this.f29159b0) {
                this.f29159b0 = true;
                a(true, false);
            }
            e4Var.c(d);
            org.telegram.messenger.g0.i3(a4Var, 500L);
            this.f29157a0 = true;
            return;
        }
        e4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.k9 k9Var = this.f29158b;
        if (k9Var.getImageReceiver().R0 != z10) {
            k9Var.getImageReceiver().O0(z10, true);
        }
    }

    public void setDrawDivider(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f10) {
        int i3;
        int i10;
        int L;
        int L2;
        this.f29166f0 = f10;
        if (bd.f21784a0) {
            i3 = org.telegram.messenger.g0.L(53.0f);
        } else {
            i3 = -org.telegram.messenger.g0.L(53.0f);
        }
        this.f29160c.setTranslationX(i3 * f10);
        boolean c2 = c();
        boolean z10 = true;
        org.telegram.ui.ActionBar.k5 k5Var = this.f29163e;
        float f11 = 0.0f;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.d;
        if (c2 && f10 > 0.0f) {
            if (bd.f21784a0) {
                L2 = -org.telegram.messenger.g0.L(53.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(53.0f);
            }
            float f12 = 1.0f - f10;
            k5Var.setTranslationX(L2 * f12);
            k5Var.setVisibility(0);
            k5Var.setAlpha(f10);
            k5VarArr[4].setAlpha(f12);
            org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[4];
            boolean z11 = bd.f21784a0;
            int L3 = org.telegram.messenger.g0.L(53.0f);
            if (!z11) {
                L3 = -L3;
            }
            k5Var2.setTranslationX(L3 * f10);
        } else {
            k5Var.setVisibility(8);
            for (int i11 = 0; i11 < k5VarArr.length; i11++) {
                if (!TextUtils.isEmpty(k5VarArr[4].getText()) && k5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[i11];
                    int L4 = org.telegram.messenger.g0.L(92.0f);
                    if (bd.f21784a0) {
                        L = org.telegram.messenger.g0.L(48.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(53.0f);
                    }
                    k5Var3.h(L4, L);
                    k5VarArr[i11].setFullAlpha(f10);
                    k5VarArr[i11].setTranslationX(0.0f);
                    k5VarArr[i11].invalidate();
                } else {
                    org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr[i11];
                    if (bd.f21784a0) {
                        i10 = org.telegram.messenger.g0.L(53.0f);
                    } else {
                        i10 = -org.telegram.messenger.g0.L(53.0f);
                    }
                    k5Var4.setTranslationX(i10 * f10);
                    k5VarArr[i11].h(0, 0);
                }
            }
        }
        int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i12 == 0) {
            f11 = 1.0f;
        }
        this.f29158b.setAlpha(f11);
        this.f29156a.e(this, (this.f29159b0 && i12 == 0) ? false : false);
        float f13 = 1.0f - f10;
        fh0 fh0Var = this.f29165f;
        fh0Var.setAlpha(f13);
        float f14 = (f13 * 0.4f) + 0.6f;
        fh0Var.setScaleX(f14);
        fh0Var.setScaleY(f14);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.k5 k5Var;
        org.telegram.ui.ActionBar.k5[] k5VarArr;
        org.telegram.ui.ActionBar.k5 k5Var2;
        try {
            this.J.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ug, false));
            int i3 = this.f29167g0;
            if (i3 >= 0 && (k5Var = this.f29163e) != null && (k5VarArr = this.d) != null && i3 < k5VarArr.length && (k5Var2 = k5VarArr[i3]) != null) {
                org.telegram.ui.ActionBar.r6.b0(k5Var2);
                k5Var.setTextColor(k5VarArr[this.f29167g0].getTextColor());
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
