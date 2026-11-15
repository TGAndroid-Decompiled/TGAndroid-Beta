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
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
public class f4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.t8 E;
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
    public final e4 f30215a;
    public boolean f30216a0;
    public final org.telegram.ui.Components.i9 f30217b;
    public boolean f30218b0;
    public final org.telegram.ui.ActionBar.j5 f30219c;
    public boolean f30220c0;
    public final org.telegram.ui.ActionBar.j5[] d;
    public final Drawable f30221d0;
    public final org.telegram.ui.ActionBar.j5 f30222e;
    public AnimatorSet f30223e0;
    public final fh0 f30224f;
    public float f30225f0;
    public int f30226g0;
    public final ch0 h;
    public final ch0 f30227n;
    public final org.telegram.ui.Components.e5 f30228r;
    public final org.telegram.ui.Components.e5 f30229s;
    public Drawable f30230w;
    public Drawable f30231x;
    public final b4 f30232y;

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
        this.d = new org.telegram.ui.ActionBar.j5[5];
        this.S = new Runnable(this) {
            public final f4 f29994b;

            {
                this.f29994b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f29994b;
                        f4Var.f30227n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f30224f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f29994b;
                        fh0 fh0Var = f4Var2.f30224f;
                        ch0 ch0Var2 = f4Var2.f30227n;
                        int nextInt = Utilities.f22414b.nextInt(100);
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
                        this.f29994b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f29994b;
                        f4Var3.f30218b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f30215a.c(0.0d);
                        f4Var3.f30216a0 = false;
                        return;
                    default:
                        this.f29994b.a(true, true);
                        return;
                }
            }
        };
        this.T = new Runnable(this) {
            public final f4 f29994b;

            {
                this.f29994b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f29994b;
                        f4Var.f30227n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f30224f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f29994b;
                        fh0 fh0Var = f4Var2.f30224f;
                        ch0 ch0Var2 = f4Var2.f30227n;
                        int nextInt = Utilities.f22414b.nextInt(100);
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
                        this.f29994b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f29994b;
                        f4Var3.f30218b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f30215a.c(0.0d);
                        f4Var3.f30216a0 = false;
                        return;
                    default:
                        this.f29994b.a(true, true);
                        return;
                }
            }
        };
        this.U = org.telegram.ui.ActionBar.j6.f28950ih;
        this.V = new Runnable(this) {
            public final f4 f29994b;

            {
                this.f29994b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f29994b;
                        f4Var.f30227n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f30224f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f29994b;
                        fh0 fh0Var = f4Var2.f30224f;
                        ch0 ch0Var2 = f4Var2.f30227n;
                        int nextInt = Utilities.f22414b.nextInt(100);
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
                        this.f29994b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f29994b;
                        f4Var3.f30218b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f30215a.c(0.0d);
                        f4Var3.f30216a0 = false;
                        return;
                    default:
                        this.f29994b.a(true, true);
                        return;
                }
            }
        };
        this.W = new Runnable(this) {
            public final f4 f29994b;

            {
                this.f29994b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f29994b;
                        f4Var.f30227n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f30224f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f29994b;
                        fh0 fh0Var = f4Var2.f30224f;
                        ch0 ch0Var2 = f4Var2.f30227n;
                        int nextInt = Utilities.f22414b.nextInt(100);
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
                        this.f29994b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f29994b;
                        f4Var3.f30218b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f30215a.c(0.0d);
                        f4Var3.f30216a0 = false;
                        return;
                    default:
                        this.f29994b.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final f4 f29994b;

            {
                this.f29994b = this;
            }

            @Override
            public final void run() {
                int i17;
                switch (r2) {
                    case 0:
                        f4 f4Var = this.f29994b;
                        f4Var.f30227n.S(0, null);
                        ch0 ch0Var = f4Var.h;
                        ch0Var.S(0, null);
                        f4Var.f30224f.setAnimation(ch0Var);
                        return;
                    case 1:
                        f4 f4Var2 = this.f29994b;
                        fh0 fh0Var = f4Var2.f30224f;
                        ch0 ch0Var2 = f4Var2.f30227n;
                        int nextInt = Utilities.f22414b.nextInt(100);
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
                        this.f29994b.a(true, true);
                        return;
                    case 3:
                        f4 f4Var3 = this.f29994b;
                        f4Var3.f30218b0 = false;
                        f4Var3.a(true, true);
                        f4Var3.f30215a.c(0.0d);
                        f4Var3.f30216a0 = false;
                        return;
                    default:
                        this.f29994b.a(true, true);
                        return;
                }
            }
        };
        this.f30226g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false));
        this.E = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        setClipChildren(false);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f30217b = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
        boolean z10 = hd.f24101a0;
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
        addView(i9Var, c8.ja.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
        b4 b4Var = new b4(this, context);
        this.f30232y = b4Var;
        b4Var.setSize(org.telegram.messenger.g0.L(26.0f));
        b4Var.setProgressColor(-1);
        b4Var.setNoProgress(false);
        boolean z11 = hd.f24101a0;
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
        addView(b4Var, c8.ja.d(46, 46.0f, i18, f12, 6.0f, f13, 0.0f));
        org.telegram.messenger.g0.Y3(b4Var, false, 1.0f, true, false);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f30219c = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.f28878eh, null);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(16);
        j5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        if (hd.f24101a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        j5Var.setGravity(i11 | 48);
        boolean z12 = hd.f24101a0;
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
        addView(j5Var, c8.ja.d(-1, 20.0f, i19, f14, 10.0f, f15, 0.0f));
        this.f30228r = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 9, j5Var, false);
        this.f30229s = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 9, j5Var, false);
        Drawable drawable = context.getResources().getDrawable(2131232802);
        this.f30221d0 = drawable;
        org.telegram.ui.ActionBar.q6.x(this, drawable, org.telegram.ui.ActionBar.j6.f28932hh, null, PorterDuff.Mode.MULTIPLY);
        int i20 = 0;
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
            if (i20 >= j5VarArr.length) {
                break;
            }
            j5VarArr[i20] = new c4(this, context, i20);
            this.d[i20].setTextSize(15);
            org.telegram.ui.ActionBar.j5 j5Var2 = this.d[i20];
            if (hd.f24101a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            j5Var2.setGravity(i14 | 48);
            if (i20 == 4) {
                this.d[i20].setBuildFullLayout(true);
                org.telegram.ui.ActionBar.q6.X(this.d[i20], org.telegram.ui.ActionBar.j6.f28950ih, null);
                org.telegram.ui.ActionBar.j5 j5Var3 = this.d[i20];
                boolean z13 = hd.f24101a0;
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
                addView(j5Var3, c8.ja.d(-1, -2.0f, i21, f18, 32.0f, f19, 0.0f));
            } else {
                if (i20 == 0) {
                    org.telegram.ui.ActionBar.q6.X(this.d[i20], org.telegram.ui.ActionBar.j6.f28915gh, null);
                    this.d[i20].k(hd.M0(2131748877, null));
                } else if (i20 == 1) {
                    org.telegram.ui.ActionBar.q6.X(this.d[i20], org.telegram.ui.ActionBar.j6.f28932hh, null);
                    this.d[i20].k(hd.M0(2131745273, null));
                    this.d[i20].setDrawablePadding(org.telegram.messenger.g0.L(2.0f));
                } else if (i20 == 2) {
                    org.telegram.ui.ActionBar.q6.X(this.d[i20], org.telegram.ui.ActionBar.j6.f28969jh, null);
                    this.d[i20].k(hd.M0(2131743357, null));
                } else if (i20 == 3) {
                    org.telegram.ui.ActionBar.q6.X(this.d[i20], org.telegram.ui.ActionBar.j6.f28915gh, null);
                    this.d[i20].k(hd.M0(2131742950, null));
                }
                org.telegram.ui.ActionBar.j5 j5Var4 = this.d[i20];
                boolean z14 = hd.f24101a0;
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
                addView(j5Var4, c8.ja.d(-1, 20.0f, i22, f16, 32.0f, f17, 0.0f));
            }
            i20++;
        }
        org.telegram.ui.ActionBar.j5 j5Var5 = new org.telegram.ui.ActionBar.j5(context);
        this.f30222e = j5Var5;
        j5Var5.setMaxLines(3);
        j5Var5.setTextSize(15);
        org.telegram.ui.ActionBar.q6.X(j5Var5, org.telegram.ui.ActionBar.j6.f28950ih, null);
        j5Var5.setVisibility(8);
        if (hd.f24101a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(j5Var5, c8.ja.d(-1, 60.0f, i13 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        ch0 ch0Var = new ch0(2131624335, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        this.h = ch0Var;
        this.f30227n = new ch0(2131624044, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f30224f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(ch0Var);
        y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(h02, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(h02);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, c8.ja.d(48, -1.0f, (hd.f24101a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new a(this, 5));
        this.f30215a = new e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.f4.a(boolean, boolean):void");
    }

    public final void b(int i7) {
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        float f10;
        float L;
        float f11;
        float L2;
        float f12;
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            j5VarArr = this.d;
            if (i12 >= j5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i12];
            if (i12 == i7) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            j5Var.setImportantForAccessibility(i10);
            i12++;
        }
        if (i7 == 0) {
            while (i11 < j5VarArr.length) {
                org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[i11];
                if (i11 == i7) {
                    L2 = 0.0f;
                } else {
                    L2 = org.telegram.messenger.g0.L(-2.0f);
                }
                j5Var2.setTranslationY(L2);
                org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[i11];
                if (i11 == i7) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                j5Var3.setAlpha(f12);
                i11++;
            }
            return;
        }
        while (i11 < j5VarArr.length) {
            org.telegram.ui.ActionBar.j5 j5Var4 = j5VarArr[i11];
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
            j5Var4.setTranslationY(L);
            org.telegram.ui.ActionBar.j5 j5Var5 = j5VarArr[i11];
            if (i11 == i7) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            j5Var5.setAlpha(f11);
            i11++;
        }
    }

    public final boolean c() {
        long j3 = this.R;
        if (j3 > 0) {
            TLRPC.User user = this.H;
            if (user == null || user.f28200id != j3) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.I;
        if (chat == null || chat.f28051id != (-j3)) {
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
            float f10 = this.f30225f0;
            if (f10 != 0.0f) {
                paint.setAlpha((int) ((1.0f - f10) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            if (hd.f24101a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24101a0) {
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
        org.telegram.ui.Components.i9 i9Var = this.f30217b;
        int measuredWidth2 = (i9Var.getMeasuredWidth() / 2) + i9Var.getLeft();
        int measuredHeight2 = (i9Var.getMeasuredHeight() / 2) + i9Var.getTop();
        e4 e4Var = this.f30215a;
        e4Var.f();
        if (this.f30225f0 == 0.0f) {
            e4Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        i9Var.setScaleX(e4Var.b());
        i9Var.setScaleY(e4Var.b());
        float b10 = e4Var.b();
        b4 b4Var = this.f30232y;
        b4Var.setScaleX(b10);
        b4Var.setScaleY(e4Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(org.telegram.messenger.c cVar, TLRPC.GroupCallParticipant groupCallParticipant, org.telegram.messenger.r3 r3Var, long j3, TLRPC.FileLocation fileLocation, boolean z10) {
        long j10;
        long c10;
        boolean z11;
        boolean z12;
        this.F = r3Var;
        this.N = cVar;
        this.R = j3;
        this.G = groupCallParticipant;
        long B1 = gj.B1(groupCallParticipant.peer);
        int i7 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        org.telegram.ui.ActionBar.j5 j5Var = this.f30219c;
        org.telegram.ui.Components.i9 i9Var = this.f30217b;
        org.telegram.ui.Components.t8 t8Var = this.E;
        org.telegram.ui.Components.e5 e5Var = this.f30229s;
        if (i7 > 0) {
            TLRPC.User a22 = np.s1(this.N.f22778a).a2(Long.valueOf(B1));
            this.H = a22;
            this.I = null;
            int i10 = this.N.f22778a;
            t8Var.r(a22);
            j5Var.l(q10.p(this.H), false);
            c10 = org.telegram.messenger.m5.c(this.H);
            TLRPC.User user = this.H;
            j10 = 0;
            if (user != null && user.verified) {
                Drawable drawable = this.f30230w;
                if (drawable == null) {
                    drawable = new hi.k3(getContext());
                }
                this.f30230w = drawable;
                e5Var.g(drawable, z10);
            } else if (user != null && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
                e5Var.j(org.telegram.messenger.m5.f(this.H.emoji_status), z10);
            } else {
                TLRPC.User user2 = this.H;
                if (user2 != null && user2.premium) {
                    if (this.f30231x == null) {
                        this.f30231x = getContext().getResources().getDrawable(2131232308).mutate();
                        this.f30231x = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f30231x);
                    }
                    e5Var.g(this.f30231x, z10);
                } else {
                    e5Var.g(null, z10);
                }
            }
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ck, false)));
            j5Var.i(e5Var);
            ImageReceiver imageReceiver = i9Var.getImageReceiver();
            int i11 = cVar.f22778a;
            imageReceiver.d = i11;
            if (fileLocation != null) {
                this.f30220c0 = true;
                i9Var.j(gc.e(fileLocation), "50_50", t8Var, null);
            } else {
                gc l10 = gc.l(i11, 1, this.H);
                if (l10 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f30220c0 = z12;
                i9Var.j(l10, "50_50", t8Var, this.H);
            }
        } else {
            j10 = 0;
            TLRPC.Chat M0 = np.s1(this.N.f22778a).M0(Long.valueOf(-B1));
            this.I = M0;
            this.H = null;
            int i12 = this.N.f22778a;
            t8Var.q(M0);
            c10 = org.telegram.messenger.m5.c(this.I);
            TLRPC.Chat chat = this.I;
            if (chat != null) {
                j5Var.l(chat.title, false);
                TLRPC.Chat chat2 = this.I;
                if (chat2.verified) {
                    Drawable drawable2 = this.f30230w;
                    if (drawable2 == null) {
                        drawable2 = new hi.k3(getContext());
                    }
                    this.f30230w = drawable2;
                    e5Var.g(drawable2, z10);
                } else if (org.telegram.messenger.m5.f(chat2.emoji_status) != 0) {
                    e5Var.j(org.telegram.messenger.m5.f(this.I.emoji_status), z10);
                } else {
                    e5Var.g(null, z10);
                }
                i9Var.getImageReceiver().d = cVar.f22778a;
                if (fileLocation != null) {
                    this.f30220c0 = true;
                    i9Var.j(gc.e(fileLocation), "50_50", t8Var, null);
                } else {
                    gc a10 = gc.a(1, this.I);
                    if (a10 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f30220c0 = z11;
                    i9Var.j(a10, "50_50", t8Var, this.I);
                }
            }
        }
        int i13 = (c10 > j10 ? 1 : (c10 == j10 ? 0 : -1));
        org.telegram.ui.Components.e5 e5Var2 = this.f30228r;
        if (i13 != 0) {
            e5Var2.j(c10, z10);
            j5Var.setLeftDrawable(e5Var2);
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Ck, false)));
        } else {
            e5Var2.g(null, z10);
            j5Var.setLeftDrawable((Drawable) null);
        }
        a(z10, false);
    }

    public final void f(int i7, int i10) {
        if (this.U != i7) {
            if (this.P) {
                this.M = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
            }
            this.U = i7;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            fh0 fh0Var = this.f30224f;
            fh0Var.setColorFilter(porterDuffColorFilter);
            org.telegram.ui.ActionBar.j6.H1(fh0Var.getDrawable(), i10 & 620756991, true);
        }
    }

    public org.telegram.ui.Components.i9 getAvatarImageView() {
        return this.f30217b;
    }

    public e4 getAvatarWavesDrawable() {
        return this.f30215a;
    }

    public int getClipHeight() {
        org.telegram.ui.ActionBar.j5 j5Var = this.f30222e;
        if (TextUtils.isEmpty(j5Var.getText()) || !this.f30220c0) {
            j5Var = this.d[4];
        }
        if (j5Var.getLineCount() > 1) {
            return org.telegram.messenger.g0.L(8.0f) + j5Var.getTop() + j5Var.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.f30219c.getText();
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
        org.telegram.ui.Components.e5 e5Var = this.f30229s;
        if (e5Var != null) {
            e5Var.a();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f30228r;
        if (e5Var2 != null) {
            e5Var2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f30216a0) {
            org.telegram.messenger.g0.r(this.W);
            this.f30216a0 = false;
        }
        AnimatorSet animatorSet = this.f30223e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        org.telegram.ui.Components.e5 e5Var = this.f30229s;
        if (e5Var != null) {
            e5Var.b();
        }
        org.telegram.ui.Components.e5 e5Var2 = this.f30228r;
        if (e5Var2 != null) {
            e5Var2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i7 = 2131743230;
            } else {
                i7 = 2131743293;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hd.M0(i7, null)));
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
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
        int i7 = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        e4 e4Var = this.f30215a;
        if (i7 > 0) {
            boolean z10 = this.f30216a0;
            a4 a4Var = this.W;
            if (z10) {
                org.telegram.messenger.g0.r(a4Var);
            }
            if (!this.f30218b0) {
                this.f30218b0 = true;
                a(true, false);
            }
            e4Var.c(d);
            org.telegram.messenger.g0.i3(a4Var, 500L);
            this.f30216a0 = true;
            return;
        }
        e4Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z10) {
        org.telegram.ui.Components.i9 i9Var = this.f30217b;
        if (i9Var.getImageReceiver().R0 != z10) {
            i9Var.getImageReceiver().O0(z10, true);
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
        this.f30225f0 = f10;
        if (hd.f24101a0) {
            i7 = org.telegram.messenger.g0.L(53.0f);
        } else {
            i7 = -org.telegram.messenger.g0.L(53.0f);
        }
        this.f30219c.setTranslationX(i7 * f10);
        boolean c10 = c();
        boolean z10 = true;
        org.telegram.ui.ActionBar.j5 j5Var = this.f30222e;
        float f11 = 0.0f;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.d;
        if (c10 && f10 > 0.0f) {
            if (hd.f24101a0) {
                L2 = -org.telegram.messenger.g0.L(53.0f);
            } else {
                L2 = org.telegram.messenger.g0.L(53.0f);
            }
            float f12 = 1.0f - f10;
            j5Var.setTranslationX(L2 * f12);
            j5Var.setVisibility(0);
            j5Var.setAlpha(f10);
            j5VarArr[4].setAlpha(f12);
            org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[4];
            boolean z11 = hd.f24101a0;
            int L3 = org.telegram.messenger.g0.L(53.0f);
            if (!z11) {
                L3 = -L3;
            }
            j5Var2.setTranslationX(L3 * f10);
        } else {
            j5Var.setVisibility(8);
            for (int i11 = 0; i11 < j5VarArr.length; i11++) {
                if (!TextUtils.isEmpty(j5VarArr[4].getText()) && j5VarArr[4].getLineCount() > 1) {
                    org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[i11];
                    int L4 = org.telegram.messenger.g0.L(92.0f);
                    if (hd.f24101a0) {
                        L = org.telegram.messenger.g0.L(48.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(53.0f);
                    }
                    j5Var3.h(L4, L);
                    j5VarArr[i11].setFullAlpha(f10);
                    j5VarArr[i11].setTranslationX(0.0f);
                    j5VarArr[i11].invalidate();
                } else {
                    org.telegram.ui.ActionBar.j5 j5Var4 = j5VarArr[i11];
                    if (hd.f24101a0) {
                        i10 = org.telegram.messenger.g0.L(53.0f);
                    } else {
                        i10 = -org.telegram.messenger.g0.L(53.0f);
                    }
                    j5Var4.setTranslationX(i10 * f10);
                    j5VarArr[i11].h(0, 0);
                }
            }
        }
        int i12 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i12 == 0) {
            f11 = 1.0f;
        }
        this.f30217b.setAlpha(f11);
        this.f30215a.e(this, (this.f30218b0 && i12 == 0) ? false : false);
        float f13 = 1.0f - f10;
        fh0 fh0Var = this.f30224f;
        fh0Var.setAlpha(f13);
        float f14 = (f13 * 0.4f) + 0.6f;
        fh0Var.setScaleX(f14);
        fh0Var.setScaleY(f14);
        invalidate();
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        org.telegram.ui.ActionBar.j5 j5Var2;
        try {
            this.J.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false));
            int i7 = this.f30226g0;
            if (i7 >= 0 && (j5Var = this.f30222e) != null && (j5VarArr = this.d) != null && i7 < j5VarArr.length && (j5Var2 = j5VarArr[i7]) != null) {
                org.telegram.ui.ActionBar.q6.a0(j5Var2);
                j5Var.setTextColor(j5VarArr[this.f30226g0].getTextColor());
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
