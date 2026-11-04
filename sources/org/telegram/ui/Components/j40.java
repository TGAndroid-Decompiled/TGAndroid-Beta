package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class j40 extends p40 {
    public static final int L0 = 0;
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public final org.telegram.ui.lk E;
    public float E0;
    public final LinearLayout F;
    public int F0;
    public final gi.l2 G;
    public long G0;
    public final gi.l2 H;
    public boolean H0;
    public final ImageView I;
    public boolean I0;
    public final gi.n2 J;
    public final e40 J0;
    public final int[] K;
    public final y00 K0;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public wi.t0 P;
    public wi.r0 Q;
    public wi.s0 R;
    public wi.l0 S;
    public gy0 T;
    public org.telegram.messenger.b20 U;
    public i40 V;
    public boolean W;
    public AnimatorSet f34928a0;
    public ValueAnimator f34929b0;
    public ValueAnimator f34930c0;
    public final ch0 f34931d0;
    public final x30 f34932e;
    public ch0 f34933e0;
    public final int f34934f;
    public ch0 f34935f0;
    public boolean f34936g0;
    public final int h;
    public boolean f34937h0;
    public boolean f34938i0;
    public boolean f34939j0;
    public boolean f34940k0;
    public boolean f34941l0;
    public boolean m0;
    public final boolean f34942n;
    public boolean f34943n0;
    public boolean f34944o0;
    public boolean f34945p0;
    public boolean f34946q0;
    public final View f34947r;
    public boolean f34948r0;
    public final h40 f34949s;
    public long f34950s0;
    public int f34951t0;
    public Bitmap f34952u0;
    public long f34953v0;
    public final jk0 f34954w;
    public float f34955w0;
    public final FrameLayout f34956x;
    public float f34957x0;
    public final g40 f34958y;
    public float f34959y0;
    public float f34960z0;

    public j40(Activity activity, x30 x30Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f34934f = org.telegram.messenger.h10.f22829t0;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = Float.NaN;
        this.J0 = new e40(this, 0);
        this.K0 = new y00(this);
        this.f34932e = x30Var;
        this.h = x30Var.getClassGuid();
        this.f34942n = x30Var.z();
        this.f34947r = x30Var.getFragmentView();
        setWillNotDraw(false);
        gi.n2 n2Var = new gi.n2(activity, null, this, null);
        this.J = n2Var;
        n2Var.f13292o = 0.5f;
        n2Var.f13291n = gi.n2.f(0.5f);
        n2Var.g();
        addView(n2Var.f13281b, b8.mf.e(-1, -1, 119));
        h40 h40Var = new h40(this, activity);
        this.f34949s = h40Var;
        jk0 jk0Var = new jk0(activity);
        this.f34954w = jk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f34956x = frameLayout;
        g40 g40Var = new g40(0, activity, this);
        g40Var.setOpaque(true);
        g40Var.setClickable(true);
        g40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        g40Var.setOutlineProvider(new cg.p0(15));
        g40Var.setClipToOutline(true);
        this.f34958y = g40Var;
        frameLayout.addView(g40Var, b8.mf.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, activity, paint);
        this.E = lkVar;
        lkVar.setOutlineProvider(new cg.p0(14));
        lkVar.setClipToOutline(true);
        frameLayout.addView(lkVar, b8.mf.e(-1, -1, 119));
        jk0Var.addView(frameLayout, b8.mf.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        h40Var.addView(jk0Var, b8.mf.e(-1, -1, 119));
        int i3 = org.telegram.messenger.g0.v;
        addView(h40Var, new FrameLayout.LayoutParams(i3, i3, 17));
        addView(n2Var.f13282c, b8.mf.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, b8.mf.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754752, null));
        linearLayout.addView((View) imageView, b8.mf.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j40 f33694b;

            {
                this.f33694b = this;
            }

            @Override
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z10;
                wi.s0 s0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        j40 j40Var = this.f33694b;
                        wi.t0 t0Var = j40Var.P;
                        if (t0Var != null && (s0Var = j40Var.R) != null && (l0Var = j40Var.S) != null && s0Var.f58047a == 3 && !s0Var.f58051f && !j40Var.f34944o0) {
                            wi.m0 m0Var = l0Var.f57943a;
                            wi.m0 m0Var2 = wi.m0.f57973a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.f57974b;
                            }
                            t0Var.getClass();
                            wi.t0.u();
                            int i11 = t0Var.Z;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (t0Var.f58069r != m0Var2) {
                                    t0Var.f58064m.b("camera facing requested: " + t0Var.f58069r + " -> " + m0Var2 + ", state=" + t4.c.t(t0Var.Z));
                                    t0Var.f58069r = m0Var2;
                                    int i12 = t0Var.Z;
                                    if (i12 == 3 || i12 == 2) {
                                        t0Var.e();
                                        wi.j jVar = t0Var.f58063l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.f57893n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new u9.a(18, jVar, m0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        t0Var.f58075y = z10;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                j40Var.f34931d0.M(0);
                                j40Var.f34931d0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        j40 j40Var2 = this.f33694b;
                        wi.t0 t0Var2 = j40Var2.P;
                        if (t0Var2 != null && (s0Var2 = j40Var2.R) != null && j40Var2.S != null) {
                            boolean z11 = !s0Var2.f58052g;
                            wi.j jVar2 = t0Var2.f58063l;
                            wi.t0.u();
                            if (t0Var2.Z == 3 && !t0Var2.f58075y && (i10 = t0Var2.f58054a0) != 1) {
                                t0Var2.f58073w = z11;
                                if (i10 == 3) {
                                    t0Var2.v(z11);
                                    jVar2.T(false);
                                } else {
                                    t0Var2.v(false);
                                    jVar2.T(z11);
                                }
                                t0Var2.o();
                                j40Var2.C();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(activity);
        this.H = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, b8.mf.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final j40 f33694b;

            {
                this.f33694b = this;
            }

            @Override
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z10;
                wi.s0 s0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        j40 j40Var = this.f33694b;
                        wi.t0 t0Var = j40Var.P;
                        if (t0Var != null && (s0Var = j40Var.R) != null && (l0Var = j40Var.S) != null && s0Var.f58047a == 3 && !s0Var.f58051f && !j40Var.f34944o0) {
                            wi.m0 m0Var = l0Var.f57943a;
                            wi.m0 m0Var2 = wi.m0.f57973a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.f57974b;
                            }
                            t0Var.getClass();
                            wi.t0.u();
                            int i11 = t0Var.Z;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (t0Var.f58069r != m0Var2) {
                                    t0Var.f58064m.b("camera facing requested: " + t0Var.f58069r + " -> " + m0Var2 + ", state=" + t4.c.t(t0Var.Z));
                                    t0Var.f58069r = m0Var2;
                                    int i12 = t0Var.Z;
                                    if (i12 == 3 || i12 == 2) {
                                        t0Var.e();
                                        wi.j jVar = t0Var.f58063l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.f57893n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new u9.a(18, jVar, m0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        t0Var.f58075y = z10;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                j40Var.f34931d0.M(0);
                                j40Var.f34931d0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        j40 j40Var2 = this.f33694b;
                        wi.t0 t0Var2 = j40Var2.P;
                        if (t0Var2 != null && (s0Var2 = j40Var2.R) != null && j40Var2.S != null) {
                            boolean z11 = !s0Var2.f58052g;
                            wi.j jVar2 = t0Var2.f58063l;
                            wi.t0.u();
                            if (t0Var2.Z == 3 && !t0Var2.f58075y && (i10 = t0Var2.f58054a0) != 1) {
                                t0Var2.f58073w = z11;
                                if (i10 == 3) {
                                    t0Var2.v(z11);
                                    jVar2.T(false);
                                } else {
                                    t0Var2.v(false);
                                    jVar2.T(z11);
                                }
                                t0Var2.o();
                                j40Var2.C();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(24.0f);
        this.O = L;
        ch0 ch0Var = new ch0(2131624187, L, L);
        this.f34931d0 = ch0Var;
        ch0Var.setCallback(imageView);
        ch0Var.M(ch0Var.f32725e[0] - 1);
        imageView.setImageDrawable(ch0Var);
        C();
        if (e6Var != null && !e6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232793);
        imageView3.setAlpha(0.0f);
        addView(imageView3, b8.mf.e(48, 48, 17));
        g40Var.setOnTouchListener(new yj(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f34950s0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f34950s0);
    }

    private long getCurrentDurationMs() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.P;
        if (t0Var != null && (s0Var = this.R) != null) {
            if (s0Var.f58047a == 3) {
                return t0Var.j();
            }
            return s0Var.f58048b;
        }
        return 0L;
    }

    public static void m(j40 j40Var) {
        if (j40Var.f34944o0 && j40Var.f34948r0 && j40Var.f34945p0 && j40Var.f34946q0) {
            j40Var.f34944o0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + j40Var.getCameraFlipElapsedMs());
            j40Var.B();
        }
    }

    public static void n(j40 j40Var) {
        org.telegram.ui.lk lkVar = j40Var.E;
        if (!j40Var.m0) {
            return;
        }
        j40Var.m0 = false;
        lkVar.invalidate();
        lkVar.animate().cancel();
        lkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.mj mjVar;
        if (z10 != this.H0) {
            this.H0 = z10;
            this.G0 = 0L;
            e40 e40Var = this.J0;
            if (z10) {
                cg.j.d().a(30, e40Var);
            } else {
                cg.j.d().f(e40Var);
            }
            if (this.d != z10) {
                this.d = z10;
                n40 n40Var = this.f37062c;
                if (n40Var != null && (mjVar = ((org.telegram.ui.si) n40Var).f49516a.f51237a0) != null) {
                    mjVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f34932e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        gi.n2 n2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.E0)) {
                this.E0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            n2Var.c(null);
        } else {
            if (!Float.isNaN(this.E0)) {
                attributes.screenBrightness = this.E0;
                this.E0 = Float.NaN;
            }
            n2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        if (!this.D0) {
            return;
        }
        this.D0 = false;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 512);
    }

    public final void B() {
        boolean z10;
        wi.l0 l0Var;
        wi.s0 s0Var = this.R;
        boolean z11 = false;
        if (s0Var != null && s0Var.f58047a == 3 && !s0Var.f58051f && !this.f34944o0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (l0Var = this.S) != null && l0Var.f57944b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        C();
    }

    public final void C() {
        wi.s0 s0Var = this.R;
        int i3 = this.O;
        gi.l2 l2Var = this.H;
        if (s0Var != null && s0Var.f58052g) {
            if (this.f34935f0 == null) {
                ch0 ch0Var = new ch0(2131624185, i3, i3);
                this.f34935f0 = ch0Var;
                ch0Var.setCallback(l2Var);
            }
            l2Var.setImageDrawable(this.f34935f0);
            return;
        }
        if (this.f34933e0 == null) {
            ch0 ch0Var2 = new ch0(2131624186, i3, i3);
            this.f34933e0 = ch0Var2;
            ch0Var2.setCallback(l2Var);
        }
        l2Var.setImageDrawable(this.f34933e0);
    }

    public final void D() {
        org.telegram.ui.mj mjVar;
        float f10;
        wi.s0 s0Var = this.R;
        if (s0Var != null) {
            long j10 = s0Var.d;
            if (s0Var.f58047a == 3) {
                long min = Math.min(j10, (SystemClock.elapsedRealtime() + s0Var.f58048b) - s0Var.f58049c);
                this.f34953v0 = min;
                this.f34954w.setProgress(((float) min) / ((float) j10));
                n40 n40Var = this.f37062c;
                if (n40Var != null && (mjVar = ((org.telegram.ui.si) n40Var).f49516a.f51237a0) != null && mjVar.k1) {
                    mjVar.f31141j1 = min;
                    dg dgVar = mjVar.Z0;
                    if (dgVar != null && dgVar.f33092r) {
                        dgVar.h = min;
                        dgVar.invalidate();
                    }
                    ag agVar = mjVar.m1;
                    if (agVar != null && agVar.f31836n) {
                        if (!agVar.h) {
                            long j11 = agVar.f31837r;
                            if (j11 >= 0) {
                                if (!agVar.f31834e) {
                                    long max = Math.max(0L, min - j11) % 1200;
                                    if (max < 600) {
                                        f10 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f10 = ((float) (max - 600)) / 600.0f;
                                    }
                                    agVar.f31831a = f10;
                                }
                                agVar.invalidate();
                            }
                        }
                        agVar.f31837r = min;
                        agVar.f31831a = 1.0f;
                        agVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = mjVar.f31152l1;
                    if (slideTextView != null && slideTextView.K && slideTextView.f31252n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z10) {
        int i3;
        wi.t0 t0Var = this.P;
        if (t0Var != null && t0Var.a()) {
            this.V = null;
            if (z10) {
                i3 = 0;
            } else {
                i3 = 6;
            }
            x(i3);
            gy0 gy0Var = this.T;
            if (gy0Var != null) {
                gy0Var.d(true);
            }
            this.T = null;
            MediaController.B().Y(false);
            z(false, false);
        }
    }

    @Override
    public final void b(float f10, int i3) {
        wi.s0 s0Var;
        if (this.P != null && (s0Var = this.R) != null && s0Var.f58047a == 5) {
            p();
            if (i3 == 0) {
                this.P.r();
            } else if (i3 == 1) {
                this.P.p();
            } else if (i3 == 2) {
                wi.t0 t0Var = this.P;
                long j10 = f10 * ((float) this.R.f58048b);
                t0Var.getClass();
                wi.t0.u();
                if (t0Var.Z == 5 && t0Var.V != null) {
                    long j11 = t0Var.J;
                    t0Var.V.Z0(5, Math.max(j11, Math.min(Math.max(j11, t0Var.K - 1), j10)));
                    t0Var.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        r();
        ValueAnimator valueAnimator = this.f34929b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wi.t0 t0Var = this.P;
        if (t0Var != null) {
            wi.t0.u();
            int i3 = t0Var.Z;
            if (i3 == 10) {
                if (!t0Var.F) {
                    t0Var.i();
                }
            } else if (i3 != 8) {
                t0Var.a();
            } else {
                t0Var.e();
                t0Var.s();
                t0Var.f58063l.M();
                t0Var.F = true;
                t0Var.w(10);
                t0Var.m("released");
                t0Var.f58060i.removeCallbacksAndMessages(null);
                t0Var.f58061j.shutdown();
                t0Var.f58062k.shutdown();
            }
            this.P = null;
        }
        gy0 gy0Var = this.T;
        if (gy0Var != null) {
            gy0Var.d(true ^ this.f34940k0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        A();
        h40 h40Var = this.f34949s;
        h40Var.setTranslationX(0.0f);
        this.f34957x0 = 0.0f;
        h40Var.setTranslationY(0.0f + this.f34955w0);
        h40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override
    public final boolean e() {
        wi.s0 s0Var = this.R;
        if (s0Var != null) {
            int i3 = s0Var.f58047a;
            if (i3 == 4 || i3 == 5 || i3 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(float f10) {
        float f11 = f10 * 0.5f;
        this.f34955w0 = f11;
        this.f34949s.setTranslationY(this.f34957x0 + f11);
    }

    @Override
    public final void g(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        if (this.P != null && this.R != null) {
            if (i3 == 3) {
                w();
            } else if ((i3 == 1 || i3 == 4) && this.V == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    org.telegram.messenger.hs.f(this.f34934f).k(org.telegram.messenger.hs.f23308t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f58047a == 3) {
                    x(5);
                }
                this.f34937h0 = false;
                this.V = new i40(i10, i11, j10, j11, z10);
                t();
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public m40 getCameraContainer() {
        return this.f34949s;
    }

    @Override
    public RectF getCameraRect() {
        g40 g40Var = this.f34958y;
        int[] iArr = this.K;
        g40Var.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        return new RectF(i3, iArr[1], g40Var.getWidth() + i3, g40Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f34954w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f34958y;
    }

    @Override
    public final void h(eh.c cVar, org.telegram.ui.ki kiVar) {
        View view = this.F;
        gh.g c2 = cVar.c(view, kiVar, false);
        c2.q(org.telegram.messenger.g0.L(6.0f));
        c2.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c2);
    }

    @Override
    public final void i(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f34954w.getPaint().setAlpha(255);
        this.f34940k0 = false;
        this.f34939j0 = false;
        this.V = null;
        this.W = false;
        this.f34936g0 = false;
        this.f34938i0 = false;
        this.f34953v0 = 0L;
        this.f34954w.setProgress(0.0f);
        org.telegram.ui.lk lkVar = this.E;
        if (!this.m0) {
            if (this.f34952u0 == null) {
                try {
                    this.f34952u0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f34952u0;
            if (bitmap != null) {
                lkVar.setImageBitmap(bitmap);
            } else {
                lkVar.setImageResource(2131231492);
            }
            this.m0 = true;
            lkVar.animate().cancel();
            lkVar.setAlpha(1.0f);
            lkVar.invalidate();
        }
        this.T = new gy0(this.f34934f, this.f34942n);
        this.Q = (wi.r0) xi.e.f58880e.a();
        wi.k0 k0Var = new wi.k0(getContext(), this.f34958y);
        k0Var.f57933c = new File(org.telegram.messenger.t0.h(), "cache");
        k0Var.d = (wi.m0) xi.e.f58884j.a();
        k0Var.f57934e = this.Q;
        k0Var.h = xi.e.h.a();
        k0Var.f57935f = (wi.n0) xi.e.f58881f.a();
        k0Var.f57936g = (wi.o0) xi.e.f58882g.a();
        xi.a aVar = xi.e.f58883i;
        aVar.a();
        k0Var.f57937i = aVar.d;
        y00 y00Var = this.K0;
        k0Var.f57938j = y00Var;
        gy0 gy0Var = this.T;
        k0Var.f57939k = gy0Var;
        k0Var.f57940l = new zw(this, 5);
        if (k0Var.d != null) {
            if (k0Var.f57934e != null) {
                if (k0Var.h > 0) {
                    if (k0Var.f57935f != null) {
                        if (k0Var.f57936g != null) {
                            if (y00Var != null) {
                                if (gy0Var != null) {
                                    this.P = new wi.t0(k0Var);
                                    MediaController.B().Y(true);
                                    wi.t0 t0Var = this.P;
                                    t0Var.getClass();
                                    wi.t0.u();
                                    if (t0Var.Z == 1) {
                                        try {
                                            t0Var.f58064m.b("start requested");
                                            t0Var.c(true);
                                            t0Var.w(2);
                                            t0Var.f58063l.X(t0Var.T, 0L, t0Var.f58069r);
                                        } catch (Exception e10) {
                                            t0Var.h(e10);
                                        }
                                    }
                                    z(true, false);
                                    return;
                                }
                                throw new IllegalStateException("Output listener is required");
                            }
                            throw new IllegalStateException("Session listener is required");
                        }
                        throw new IllegalStateException("Frame rate is required");
                    }
                    throw new IllegalStateException("Camera resolution is required");
                }
                throw new IllegalStateException("Video bitrate is required");
            }
            throw new IllegalStateException("Output resolution is required");
        }
        throw new IllegalStateException("Initial camera is required");
    }

    @Override
    public final void j() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.P;
        if (t0Var != null && (s0Var = this.R) != null) {
            int i3 = s0Var.f58047a;
            if (i3 == 3) {
                w();
            } else if (i3 == 5) {
                wi.t0.u();
                if (t0Var.Z == 5 && t0Var.K - t0Var.J < t0Var.f58068q) {
                    t0Var.P++;
                    t0Var.D = false;
                    t0Var.f58064m.b("resume requested: trim=" + t0Var.J + ".." + t0Var.K + ", sourceDurationMs=" + t0Var.H);
                    t0Var.s();
                    t0Var.w(6);
                    t0Var.f58061j.execute(new gi.q1(t0Var, t0Var.l(), t0Var.T, t0Var.S, t0Var.U));
                    this.U = null;
                    this.f34937h0 = true;
                    this.f34938i0 = false;
                }
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setScreenFlashEnabled(false);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (View.MeasureSpec.getSize(i10) - getPaddingBottom() > View.MeasureSpec.getSize(i3) * 1.3f) {
            i11 = org.telegram.messenger.g0.v;
        } else {
            i11 = org.telegram.messenger.g0.f22612u;
        }
        if (this.F0 != i11) {
            this.F0 = i11;
            h40 h40Var = this.f34949s;
            h40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            h40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i3, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        gi.n2 n2Var = this.J;
        n2Var.f13281b.measure(makeMeasureSpec, makeMeasureSpec2);
        n2Var.f13282c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onWindowVisibilityChanged(int i3) {
        wi.t0 t0Var;
        wi.s0 s0Var;
        super.onWindowVisibilityChanged(i3);
        if (i3 != 0 && (t0Var = this.P) != null && (s0Var = this.R) != null) {
            if (s0Var.f58047a == 3) {
                w();
            } else if (s0Var.f58050e) {
                t0Var.p();
            }
        }
    }

    public final void p() {
        wi.s0 s0Var;
        org.telegram.messenger.b20 b20Var;
        if (this.P != null && (s0Var = this.R) != null && (b20Var = this.U) != null) {
            long j10 = s0Var.f58048b;
            long max = Math.max(0L, b20Var.f21708a);
            long j11 = this.U.f21710b;
            if (j11 >= 0) {
                j10 = Math.min(j10, j11);
            }
            wi.t0 t0Var = this.P;
            t0Var.getClass();
            wi.t0.u();
            if (t0Var.Z == 5) {
                long max2 = Math.max(0L, Math.min(t0Var.H, max));
                long max3 = Math.max(max2, Math.min(t0Var.H, j10));
                if (max3 - max2 >= Math.min(800L, t0Var.H)) {
                    t0Var.J = max2;
                    t0Var.K = max3;
                    k2.i0 i0Var = t0Var.V;
                    if (i0Var != null) {
                        i0Var.Z0(5, max2);
                    }
                    t0Var.d.getClass();
                    t0Var.o();
                }
            }
        }
    }

    public final Bitmap q(Bitmap bitmap) {
        g40 g40Var = this.f34958y;
        if (g40Var.getWidth() > 0 && g40Var.getHeight() > 0) {
            Matrix matrix = this.L;
            g40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / g40Var.getWidth();
                float height = bitmap.getHeight() / g40Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.N);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void r() {
        if (!this.f34944o0 && this.f34930c0 == null) {
            return;
        }
        this.f34951t0++;
        ValueAnimator valueAnimator = this.f34930c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f34930c0.cancel();
            this.f34930c0 = null;
        }
        FrameLayout frameLayout = this.f34956x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f34944o0 = false;
        this.f34945p0 = false;
        this.f34946q0 = false;
        this.f34948r0 = false;
        v(false);
    }

    public final org.telegram.messenger.b20 s(File file, long j10, fy0 fy0Var) {
        long j11;
        int i3;
        int i10;
        wi.o0 o0Var;
        org.telegram.messenger.b20 b20Var = new org.telegram.messenger.b20();
        b20Var.f21708a = -1L;
        b20Var.f21710b = -1L;
        b20Var.f21725r = j10;
        if (fy0Var == null) {
            j11 = file.length();
        } else {
            j11 = fy0Var.f33883a;
        }
        b20Var.f21724q = Math.max(1L, j11);
        b20Var.f21726s = true;
        wi.t0 t0Var = this.P;
        if (t0Var != null && (o0Var = t0Var.f58072u) != null) {
            i3 = o0Var.f57986a;
        } else {
            i3 = 30;
        }
        b20Var.f21721n = i3;
        wi.r0 r0Var = this.Q;
        if (r0Var == null) {
            i10 = 480;
        } else {
            i10 = r0Var.f58000a;
        }
        b20Var.h = i10;
        b20Var.f21718k = i10;
        b20Var.f21716i = i10;
        b20Var.f21719l = i10;
        b20Var.f21722o = file.getAbsolutePath();
        if (fy0Var != null) {
            b20Var.f21729w = fy0Var.f33884b;
            b20Var.f21730x = fy0Var.f33885c;
            b20Var.f21731y = fy0Var.d;
            b20Var.f21732z = fy0Var.f33886e;
        }
        return b20Var;
    }

    @Override
    public void setInternalPadding(int i3) {
        setPadding(0, 0, 0, i3);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.f34949s.getClass();
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        this.F.setAlpha(0.0f);
        h40 h40Var = this.f34949s;
        h40Var.setAlpha(0.0f);
        h40Var.setScaleX(0.1f);
        h40Var.setScaleY(0.1f);
        h40Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f34954w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i3 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t() {
        wi.s0 s0Var;
        boolean z10;
        int i3;
        if (this.V != null && !this.W && this.P != null && (s0Var = this.R) != null) {
            int i10 = s0Var.f58047a;
            if (i10 == 5) {
                p();
            } else if (i10 != 3) {
                return;
            }
            wi.t0 t0Var = this.P;
            boolean z11 = this.f34939j0;
            boolean z12 = !z11;
            t0Var.getClass();
            wi.t0.u();
            int i11 = t0Var.Z;
            boolean z13 = false;
            if (i11 == 3 || i11 == 5) {
                t0Var.f58064m.b("finish requested: state=" + t4.c.t(t0Var.Z) + ", includeAudio=" + z12 + ", durationMs=" + t0Var.j() + ", trim=" + t0Var.J + ".." + t0Var.K);
                t0Var.B = z12;
                if (t0Var.Z == 3) {
                    t0Var.H = t0Var.j();
                    t0Var.A = true;
                    t0Var.e();
                    t0Var.f58060i.removeCallbacks(t0Var.W);
                    t0Var.w(7);
                    boolean Y = t0Var.f58063l.Y();
                    t0Var.E = Y;
                    if (!Y) {
                        t0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    t0Var.s();
                    t0Var.w(7);
                    if (!t0Var.l() && !z11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (t0Var.l()) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                    }
                    t0Var.f58061j.execute(new ci.pa(t0Var, t0Var.T, z10, t0Var.U, z12, i3, t0Var.S));
                }
                z13 = true;
            }
            this.W = z13;
        }
    }

    public final void u() {
        if (this.C0) {
            this.C0 = false;
            this.A0 = -1;
            this.B0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f34929b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34960z0, 0.0f);
            this.f34929b0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f34929b0.addUpdateListener(new d40(this, 1));
            this.f34929b0.start();
        }
    }

    public final void v(boolean z10) {
        if (!this.f34943n0) {
            return;
        }
        this.f34943n0 = false;
        org.telegram.ui.lk lkVar = this.E;
        lkVar.animate().cancel();
        if (z10) {
            lkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            lkVar.setAlpha(0.0f);
        }
    }

    public final void w() {
        wi.s0 s0Var;
        if (this.P != null && (s0Var = this.R) != null && s0Var.f58047a == 3) {
            x(2);
            this.P.q();
        }
    }

    public final void x(int i3) {
        if (this.f34938i0 && i3 == 2) {
            return;
        }
        this.f34938i0 = true;
        org.telegram.messenger.hs.f(this.f34934f).k(org.telegram.messenger.hs.f23271n2, Integer.valueOf(this.h), Integer.valueOf(i3));
    }

    public final void y(boolean z10) {
        Bitmap bitmap;
        g40 g40Var = this.f34958y;
        if (g40Var.isAvailable() && (bitmap = g40Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = q(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f34952u0;
                    this.f34952u0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z10) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.f34952u0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f34952u0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void z(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        l40 l40Var = this.f37060a;
        if (l40Var != null) {
            ((org.telegram.ui.de) l40Var).f44668b.f51249ad.a(z10, true);
        }
        AnimatorSet animatorSet = this.f34928a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f34928a0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        h40 h40Var = this.f34949s;
        if (z10 && !this.f34941l0) {
            h40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f34957x0 = measuredHeight;
            h40Var.setTranslationY(measuredHeight + this.f34955w0);
        }
        this.f34941l0 = z10;
        View view = this.f34947r;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f34953v0) > 300) {
            f10 = org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
        ofFloat.addUpdateListener(new d40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f34928a0 = animatorSet2;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float[] fArr = {f13};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(h40Var, property, f14);
        float f17 = 0.1f;
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(h40Var, View.SCALE_X, f15);
        if (z10) {
            f17 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(h40Var, View.SCALE_Y, f17);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h40Var, View.TRANSLATION_X, f10);
        if (this.f34939j0 && z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f16), ofFloat);
        this.f34928a0.setDuration(180L);
        this.f34928a0.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.f34928a0.addListener(new x5(this, 29));
        } else {
            setTranslationX(0.0f);
        }
        this.f34928a0.start();
    }
}
