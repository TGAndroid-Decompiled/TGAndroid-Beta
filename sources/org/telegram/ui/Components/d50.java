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
public final class d50 extends j50 {
    public static final int K0 = 0;
    public int A0;
    public boolean B0;
    public boolean C0;
    public final org.telegram.ui.ll D;
    public float D0;
    public final LinearLayout E;
    public int E0;
    public final vh.x1 F;
    public long F0;
    public final vh.x1 G;
    public boolean G0;
    public final ImageView H;
    public boolean H0;
    public final vh.z1 I;
    public final z40 I0;
    public final int[] J;
    public final k2.m0 J0;
    public final Matrix K;
    public final float[] L;
    public final Paint M;
    public final int N;
    public li.x0 O;
    public li.v0 P;
    public li.w0 Q;
    public li.p0 R;
    public lz0 S;
    public org.telegram.messenger.x20 T;
    public c50 U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator f25308a0;
    public ValueAnimator f25309b0;
    public final bi0 f25310c0;
    public bi0 f25311d0;
    public final s40 e;
    public bi0 f25312e0;
    public final int f25313f;
    public boolean f25314f0;
    public boolean f25315g0;
    public final int h;
    public boolean f25316h0;
    public boolean f25317i0;
    public boolean f25318j0;
    public boolean f25319k0;
    public boolean f25320l0;
    public boolean m0;
    public final boolean f25321n;
    public boolean f25322n0;
    public boolean f25323o0;
    public boolean f25324p0;
    public boolean f25325q0;
    public final View f25326r;
    public long f25327r0;
    public final b50 f25328s;
    public int f25329s0;
    public Bitmap f25330t0;
    public long f25331u0;
    public float f25332v0;
    public final jl0 f25333w;
    public float f25334w0;
    public final FrameLayout f25335x;
    public float f25336x0;
    public final nh.f f25337y;
    public float f25338y0;
    public int f25339z0;

    public d50(Activity activity, s40 s40Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.f25313f = org.telegram.messenger.d20.f15147s0;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.f25339z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new z40(this, 0);
        this.J0 = new k2.m0(this);
        this.e = s40Var;
        this.h = s40Var.getClassGuid();
        this.f25321n = s40Var.z();
        this.f25326r = s40Var.getFragmentView();
        setWillNotDraw(false);
        vh.z1 z1Var = new vh.z1(activity, null, this, null);
        this.I = z1Var;
        z1Var.f52237o = 0.5f;
        z1Var.f52236n = vh.z1.f(0.5f);
        z1Var.g();
        addView(z1Var.f52227b, w7.b6.e(-1, -1, 119));
        b50 b50Var = new b50(this, activity);
        this.f25328s = b50Var;
        jl0 jl0Var = new jl0(activity);
        this.f25333w = jl0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f25335x = frameLayout;
        nh.f fVar = new nh.f(this, activity, 1);
        fVar.setOpaque(true);
        fVar.setClickable(true);
        fVar.setCameraDistance(org.telegram.messenger.i0.L(8000.0f));
        fVar.setOutlineProvider(new bi.d2(12));
        fVar.setClipToOutline(true);
        this.f25337y = fVar;
        frameLayout.addView(fVar, w7.b6.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.ll llVar = new org.telegram.ui.ll(this, activity, paint);
        this.D = llVar;
        llVar.setOutlineProvider(new bi.d2(11));
        llVar.setClipToOutline(true);
        frameLayout.addView(llVar, w7.b6.e(-1, -1, 119));
        jl0Var.addView(frameLayout, w7.b6.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        b50Var.addView(jl0Var, w7.b6.e(-1, -1, 119));
        int i10 = org.telegram.messenger.i0.v;
        addView(b50Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(z1Var.f52228c, w7.b6.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        addView(linearLayout, w7.b6.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.F = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131754752, null));
        linearLayout.addView((View) imageView, w7.b6.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final d50 f24285b;

            {
                this.f24285b = this;
            }

            @Override
            public final void onClick(View view) {
                li.w0 w0Var;
                li.p0 p0Var;
                boolean z10;
                li.w0 w0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        d50 d50Var = this.f24285b;
                        li.x0 x0Var = d50Var.O;
                        if (x0Var != null && (w0Var = d50Var.Q) != null && (p0Var = d50Var.R) != null && w0Var.f12298a == 3 && !w0Var.f12301f && !d50Var.f25322n0) {
                            li.q0 q0Var = p0Var.f12224a;
                            li.q0 q0Var2 = li.q0.f12229a;
                            if (q0Var == q0Var2) {
                                q0Var2 = li.q0.f12230b;
                            }
                            x0Var.getClass();
                            li.x0.u();
                            int i12 = x0Var.Z;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (x0Var.f12321r != q0Var2) {
                                    x0Var.f12316m.b("camera facing requested: " + x0Var.f12321r + " -> " + q0Var2 + ", state=" + i0.a.A(x0Var.Z));
                                    x0Var.f12321r = q0Var2;
                                    int i13 = x0Var.Z;
                                    if (i13 == 3 || i13 == 2) {
                                        x0Var.e();
                                        li.l lVar = x0Var.f12315l;
                                        lVar.F = q0Var2;
                                        Handler handler = lVar.f12139n;
                                        if (lVar.V && handler != null) {
                                            handler.post(new k2.u(12, lVar, q0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        x0Var.f12327y = z10;
                                    }
                                    x0Var.n();
                                    x0Var.o();
                                }
                                d50Var.f25310c0.M(0);
                                d50Var.f25310c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d50 d50Var2 = this.f24285b;
                        li.x0 x0Var2 = d50Var2.O;
                        if (x0Var2 != null && (w0Var2 = d50Var2.Q) != null && d50Var2.R != null) {
                            boolean z11 = !w0Var2.f12302g;
                            li.l lVar2 = x0Var2.f12315l;
                            li.x0.u();
                            if (x0Var2.Z == 3 && !x0Var2.f12327y && (i11 = x0Var2.f12307a0) != 1) {
                                x0Var2.f12325w = z11;
                                if (i11 == 3) {
                                    x0Var2.v(z11);
                                    lVar2.T(false);
                                } else {
                                    x0Var2.v(false);
                                    lVar2.T(z11);
                                }
                                x0Var2.o();
                                d50Var2.C();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(activity);
        this.G = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.b6.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d50 f24285b;

            {
                this.f24285b = this;
            }

            @Override
            public final void onClick(View view) {
                li.w0 w0Var;
                li.p0 p0Var;
                boolean z10;
                li.w0 w0Var2;
                int i11;
                switch (r2) {
                    case 0:
                        d50 d50Var = this.f24285b;
                        li.x0 x0Var = d50Var.O;
                        if (x0Var != null && (w0Var = d50Var.Q) != null && (p0Var = d50Var.R) != null && w0Var.f12298a == 3 && !w0Var.f12301f && !d50Var.f25322n0) {
                            li.q0 q0Var = p0Var.f12224a;
                            li.q0 q0Var2 = li.q0.f12229a;
                            if (q0Var == q0Var2) {
                                q0Var2 = li.q0.f12230b;
                            }
                            x0Var.getClass();
                            li.x0.u();
                            int i12 = x0Var.Z;
                            if (i12 != 7 && i12 != 8 && i12 != 9 && i12 != 10) {
                                if (x0Var.f12321r != q0Var2) {
                                    x0Var.f12316m.b("camera facing requested: " + x0Var.f12321r + " -> " + q0Var2 + ", state=" + i0.a.A(x0Var.Z));
                                    x0Var.f12321r = q0Var2;
                                    int i13 = x0Var.Z;
                                    if (i13 == 3 || i13 == 2) {
                                        x0Var.e();
                                        li.l lVar = x0Var.f12315l;
                                        lVar.F = q0Var2;
                                        Handler handler = lVar.f12139n;
                                        if (lVar.V && handler != null) {
                                            handler.post(new k2.u(12, lVar, q0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        x0Var.f12327y = z10;
                                    }
                                    x0Var.n();
                                    x0Var.o();
                                }
                                d50Var.f25310c0.M(0);
                                d50Var.f25310c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d50 d50Var2 = this.f24285b;
                        li.x0 x0Var2 = d50Var2.O;
                        if (x0Var2 != null && (w0Var2 = d50Var2.Q) != null && d50Var2.R != null) {
                            boolean z11 = !w0Var2.f12302g;
                            li.l lVar2 = x0Var2.f12315l;
                            li.x0.u();
                            if (x0Var2.Z == 3 && !x0Var2.f12327y && (i11 = x0Var2.f12307a0) != 1) {
                                x0Var2.f12325w = z11;
                                if (i11 == 3) {
                                    x0Var2.v(z11);
                                    lVar2.T(false);
                                } else {
                                    x0Var2.v(false);
                                    lVar2.T(z11);
                                }
                                x0Var2.o();
                                d50Var2.C();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int L = org.telegram.messenger.i0.L(24.0f);
        this.N = L;
        bi0 bi0Var = new bi0(2131624185, L, L);
        this.f25310c0 = bi0Var;
        bi0Var.setCallback(imageView);
        bi0Var.M(bi0Var.e[0] - 1);
        imageView.setImageDrawable(bi0Var);
        C();
        if (p6Var != null && !p6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.H = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232793);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.b6.e(48, 48, 17));
        fVar.setOnTouchListener(new bk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f25327r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f25327r0);
    }

    private long getCurrentDurationMs() {
        li.w0 w0Var;
        li.x0 x0Var = this.O;
        if (x0Var != null && (w0Var = this.Q) != null) {
            if (w0Var.f12298a == 3) {
                return x0Var.j();
            }
            return w0Var.f12299b;
        }
        return 0L;
    }

    public static void m(d50 d50Var) {
        if (d50Var.f25322n0 && d50Var.f25325q0 && d50Var.f25323o0 && d50Var.f25324p0) {
            d50Var.f25322n0 = false;
            org.telegram.messenger.f8.b("RoundVideo camera flip completed: elapsedMs=" + d50Var.getCameraFlipElapsedMs());
            d50Var.B();
        }
    }

    public static void n(d50 d50Var) {
        org.telegram.ui.ll llVar = d50Var.D;
        if (!d50Var.f25320l0) {
            return;
        }
        d50Var.f25320l0 = false;
        llVar.invalidate();
        llVar.animate().cancel();
        llVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.mk mkVar;
        if (z10 != this.G0) {
            this.G0 = z10;
            this.F0 = 0L;
            z40 z40Var = this.I0;
            if (z10) {
                rf.g.d().a(30, z40Var);
            } else {
                rf.g.d().f(z40Var);
            }
            if (this.d != z10) {
                this.d = z10;
                h50 h50Var = this.f27234c;
                if (h50Var != null && (mkVar = ((org.telegram.ui.rj) h50Var).f41239a.Z) != null) {
                    mkVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.i0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        vh.z1 z1Var = this.I;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            z1Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            z1Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19639k1, 512);
    }

    public final void B() {
        boolean z10;
        li.p0 p0Var;
        li.w0 w0Var = this.Q;
        boolean z11 = false;
        if (w0Var != null && w0Var.f12298a == 3 && !w0Var.f12301f && !this.f25322n0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.F.setEnabled(z10);
        if (z10 && (p0Var = this.R) != null && p0Var.f12225b != 1) {
            z11 = true;
        }
        this.G.setEnabled(z11);
        C();
    }

    public final void C() {
        li.w0 w0Var = this.Q;
        int i10 = this.N;
        vh.x1 x1Var = this.G;
        if (w0Var != null && w0Var.f12302g) {
            if (this.f25312e0 == null) {
                bi0 bi0Var = new bi0(2131624183, i10, i10);
                this.f25312e0 = bi0Var;
                bi0Var.setCallback(x1Var);
            }
            x1Var.setImageDrawable(this.f25312e0);
            return;
        }
        if (this.f25311d0 == null) {
            bi0 bi0Var2 = new bi0(2131624184, i10, i10);
            this.f25311d0 = bi0Var2;
            bi0Var2.setCallback(x1Var);
        }
        x1Var.setImageDrawable(this.f25311d0);
    }

    public final void D() {
        org.telegram.ui.mk mkVar;
        float f7;
        li.w0 w0Var = this.Q;
        if (w0Var != null) {
            long j10 = w0Var.d;
            if (w0Var.f12298a == 3) {
                long min = Math.min(j10, (SystemClock.elapsedRealtime() + w0Var.f12299b) - w0Var.f12300c);
                this.f25331u0 = min;
                this.f25333w.setProgress(((float) min) / ((float) j10));
                h50 h50Var = this.f27234c;
                if (h50Var != null && (mkVar = ((org.telegram.ui.rj) h50Var).f41239a.Z) != null && mkVar.f23731j1) {
                    mkVar.f23725i1 = min;
                    bg bgVar = mkVar.Y0;
                    if (bgVar != null && bgVar.f24631r) {
                        bgVar.h = min;
                        bgVar.invalidate();
                    }
                    yf yfVar = mkVar.l1;
                    if (yfVar != null && yfVar.f32715n) {
                        if (!yfVar.h) {
                            long j11 = yfVar.f32716r;
                            if (j11 >= 0) {
                                if (!yfVar.e) {
                                    long max = Math.max(0L, min - j11) % 1200;
                                    if (max < 600) {
                                        f7 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f7 = ((float) (max - 600)) / 600.0f;
                                    }
                                    yfVar.f32711a = f7;
                                }
                                yfVar.invalidate();
                            }
                        }
                        yfVar.f32716r = min;
                        yfVar.f32711a = 1.0f;
                        yfVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = mkVar.f23737k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f23839n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        li.x0 x0Var = this.O;
        if (x0Var != null && x0Var.a()) {
            this.U = null;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 6;
            }
            x(i10);
            lz0 lz0Var = this.S;
            if (lz0Var != null) {
                lz0Var.d(true);
            }
            this.S = null;
            MediaController.B().Y(false);
            z(false, false);
        }
    }

    @Override
    public final void b(float f7, int i10) {
        li.w0 w0Var;
        if (this.O != null && (w0Var = this.Q) != null && w0Var.f12298a == 5) {
            p();
            if (i10 == 0) {
                this.O.r();
            } else if (i10 == 1) {
                this.O.p();
            } else if (i10 == 2) {
                li.x0 x0Var = this.O;
                long j10 = f7 * ((float) this.Q.f12299b);
                x0Var.getClass();
                li.x0.u();
                if (x0Var.Z == 5 && x0Var.V != null) {
                    long j11 = x0Var.J;
                    x0Var.V.Z0(5, Math.max(j11, Math.min(Math.max(j11, x0Var.K - 1), j10)));
                    x0Var.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        r();
        ValueAnimator valueAnimator = this.f25308a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        li.x0 x0Var = this.O;
        if (x0Var != null) {
            li.x0.u();
            int i10 = x0Var.Z;
            if (i10 == 10) {
                if (!x0Var.F) {
                    x0Var.i();
                }
            } else if (i10 != 8) {
                x0Var.a();
            } else {
                x0Var.e();
                x0Var.s();
                x0Var.f12315l.M();
                x0Var.F = true;
                x0Var.w(10);
                x0Var.m("released");
                x0Var.f12312i.removeCallbacksAndMessages(null);
                x0Var.f12313j.shutdown();
                x0Var.f12314k.shutdown();
            }
            this.O = null;
        }
        lz0 lz0Var = this.S;
        if (lz0Var != null) {
            lz0Var.d(true ^ this.f25318j0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        A();
        b50 b50Var = this.f25328s;
        b50Var.setTranslationX(0.0f);
        this.f25334w0 = 0.0f;
        b50Var.setTranslationY(0.0f + this.f25332v0);
        b50Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override
    public final boolean e() {
        li.w0 w0Var = this.Q;
        if (w0Var != null) {
            int i10 = w0Var.f12298a;
            if (i10 == 4 || i10 == 5 || i10 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(float f7) {
        float f10 = f7 * 0.5f;
        this.f25332v0 = f10;
        this.f25328s.setTranslationY(this.f25334w0 + f10);
    }

    @Override
    public final void g(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        if (this.O != null && this.Q != null) {
            if (i10 == 3) {
                w();
            } else if ((i10 == 1 || i10 == 4) && this.U == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    org.telegram.messenger.zs.f(this.f25313f).k(org.telegram.messenger.zs.f19693t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.Q.f12298a == 3) {
                    x(5);
                }
                this.f25315g0 = false;
                this.U = new c50(i11, i12, j10, j11, z10);
                t();
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.E;
    }

    @Override
    public g50 getCameraContainer() {
        return this.f25328s;
    }

    @Override
    public RectF getCameraRect() {
        nh.f fVar = this.f25337y;
        int[] iArr = this.J;
        fVar.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], fVar.getWidth() + i10, fVar.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.H;
    }

    @Override
    public Paint getPaint() {
        return this.f25333w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f25337y;
    }

    @Override
    public final void h(tg.b bVar, org.telegram.ui.jj jjVar) {
        View view = this.E;
        vg.f c10 = bVar.c(view, jjVar, false);
        c10.p(org.telegram.messenger.i0.L(6.0f));
        c10.q(org.telegram.messenger.i0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void i(boolean z10) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.f25333w.getPaint().setAlpha(255);
        this.f25318j0 = false;
        this.f25317i0 = false;
        this.U = null;
        this.V = false;
        this.f25314f0 = false;
        this.f25316h0 = false;
        this.f25331u0 = 0L;
        this.f25333w.setProgress(0.0f);
        org.telegram.ui.ll llVar = this.D;
        if (!this.f25320l0) {
            if (this.f25330t0 == null) {
                try {
                    this.f25330t0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f25330t0;
            if (bitmap != null) {
                llVar.setImageBitmap(bitmap);
            } else {
                llVar.setImageResource(2131231493);
            }
            this.f25320l0 = true;
            llVar.animate().cancel();
            llVar.setAlpha(1.0f);
            llVar.invalidate();
        }
        this.S = new lz0(this.f25313f, this.f25321n);
        this.P = (li.v0) mi.e.e.a();
        li.o0 o0Var = new li.o0(getContext(), this.f25337y);
        o0Var.f12214c = new File(org.telegram.messenger.w0.h(), "cache");
        o0Var.d = (li.q0) mi.e.f13390j.a();
        o0Var.e = this.P;
        o0Var.h = mi.e.h.a();
        o0Var.f12215f = (li.r0) mi.e.f13387f.a();
        o0Var.f12216g = (li.s0) mi.e.f13388g.a();
        mi.a aVar = mi.e.f13389i;
        aVar.a();
        o0Var.f12217i = aVar.d;
        k2.m0 m0Var = this.J0;
        o0Var.f12218j = m0Var;
        lz0 lz0Var = this.S;
        o0Var.f12219k = lz0Var;
        o0Var.f12220l = new px(this, 5);
        if (o0Var.d != null) {
            if (o0Var.e != null) {
                if (o0Var.h > 0) {
                    if (o0Var.f12215f != null) {
                        if (o0Var.f12216g != null) {
                            if (m0Var != null) {
                                if (lz0Var != null) {
                                    this.O = new li.x0(o0Var);
                                    MediaController.B().Y(true);
                                    li.x0 x0Var = this.O;
                                    x0Var.getClass();
                                    li.x0.u();
                                    if (x0Var.Z == 1) {
                                        try {
                                            x0Var.f12316m.b("start requested");
                                            x0Var.c(true);
                                            x0Var.w(2);
                                            x0Var.f12315l.X(x0Var.T, 0L, x0Var.f12321r);
                                        } catch (Exception e) {
                                            x0Var.h(e);
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
        li.w0 w0Var;
        li.x0 x0Var = this.O;
        if (x0Var != null && (w0Var = this.Q) != null) {
            int i10 = w0Var.f12298a;
            if (i10 == 3) {
                w();
            } else if (i10 == 5) {
                li.x0.u();
                if (x0Var.Z == 5 && x0Var.K - x0Var.J < x0Var.f12320q) {
                    x0Var.P++;
                    x0Var.D = false;
                    x0Var.f12316m.b("resume requested: trim=" + x0Var.J + ".." + x0Var.K + ", sourceDurationMs=" + x0Var.H);
                    x0Var.s();
                    x0Var.w(6);
                    x0Var.f12313j.execute(new ag.n0(x0Var, x0Var.l(), x0Var.T, x0Var.S, x0Var.U, 2));
                    this.T = null;
                    this.f25315g0 = true;
                    this.f25316h0 = false;
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
            i12 = org.telegram.messenger.i0.v;
        } else {
            i12 = org.telegram.messenger.i0.f16030u;
        }
        if (this.E0 != i12) {
            this.E0 = i12;
            b50 b50Var = this.f25328s;
            b50Var.getLayoutParams().width = org.telegram.messenger.i0.L(28.0f) + i12;
            b50Var.getLayoutParams().height = org.telegram.messenger.i0.L(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i12 / 2) - org.telegram.messenger.i0.L(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        vh.z1 z1Var = this.I;
        z1Var.f52227b.measure(makeMeasureSpec, makeMeasureSpec2);
        z1Var.f52228c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onWindowVisibilityChanged(int i10) {
        li.x0 x0Var;
        li.w0 w0Var;
        super.onWindowVisibilityChanged(i10);
        if (i10 != 0 && (x0Var = this.O) != null && (w0Var = this.Q) != null) {
            if (w0Var.f12298a == 3) {
                w();
            } else if (w0Var.e) {
                x0Var.p();
            }
        }
    }

    public final void p() {
        li.w0 w0Var;
        org.telegram.messenger.x20 x20Var;
        if (this.O != null && (w0Var = this.Q) != null && (x20Var = this.T) != null) {
            long j10 = w0Var.f12299b;
            long max = Math.max(0L, x20Var.f19183a);
            long j11 = this.T.f19185b;
            if (j11 >= 0) {
                j10 = Math.min(j10, j11);
            }
            li.x0 x0Var = this.O;
            x0Var.getClass();
            li.x0.u();
            if (x0Var.Z == 5) {
                long max2 = Math.max(0L, Math.min(x0Var.H, max));
                long max3 = Math.max(max2, Math.min(x0Var.H, j10));
                if (max3 - max2 >= Math.min(800L, x0Var.H)) {
                    x0Var.J = max2;
                    x0Var.K = max3;
                    i2.i0 i0Var = x0Var.V;
                    if (i0Var != null) {
                        i0Var.Z0(5, max2);
                    }
                    x0Var.d.getClass();
                    x0Var.o();
                }
            }
        }
    }

    public final Bitmap q(Bitmap bitmap) {
        nh.f fVar = this.f25337y;
        if (fVar.getWidth() > 0 && fVar.getHeight() > 0) {
            Matrix matrix = this.K;
            fVar.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / fVar.getWidth();
                float height = bitmap.getHeight() / fVar.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.M);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void r() {
        if (!this.f25322n0 && this.f25309b0 == null) {
            return;
        }
        this.f25329s0++;
        ValueAnimator valueAnimator = this.f25309b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25309b0.cancel();
            this.f25309b0 = null;
        }
        FrameLayout frameLayout = this.f25335x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f25322n0 = false;
        this.f25323o0 = false;
        this.f25324p0 = false;
        this.f25325q0 = false;
        v(false);
    }

    public final org.telegram.messenger.x20 s(File file, long j10, kz0 kz0Var) {
        long j11;
        int i10;
        int i11;
        li.s0 s0Var;
        org.telegram.messenger.x20 x20Var = new org.telegram.messenger.x20();
        x20Var.f19183a = -1L;
        x20Var.f19185b = -1L;
        x20Var.f19199r = j10;
        if (kz0Var == null) {
            j11 = file.length();
        } else {
            j11 = kz0Var.f27943a;
        }
        x20Var.f19198q = Math.max(1L, j11);
        x20Var.f19200s = true;
        li.x0 x0Var = this.O;
        if (x0Var != null && (s0Var = x0Var.f12324u) != null) {
            i10 = s0Var.f12244a;
        } else {
            i10 = 30;
        }
        x20Var.f19195n = i10;
        li.v0 v0Var = this.P;
        if (v0Var == null) {
            i11 = 480;
        } else {
            i11 = v0Var.f12297a;
        }
        x20Var.h = i11;
        x20Var.f19192k = i11;
        x20Var.f19190i = i11;
        x20Var.f19193l = i11;
        x20Var.f19196o = file.getAbsolutePath();
        if (kz0Var != null) {
            x20Var.f19203w = kz0Var.f27944b;
            x20Var.f19204x = kz0Var.f27945c;
            x20Var.f19205y = kz0Var.d;
            x20Var.f19206z = kz0Var.e;
        }
        return x20Var;
    }

    @Override
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.f25328s.getClass();
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.E.setAlpha(0.0f);
        b50 b50Var = this.f25328s;
        b50Var.setAlpha(0.0f);
        b50Var.setScaleX(0.1f);
        b50Var.setScaleY(0.1f);
        b50Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f25333w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i10 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void t() {
        li.w0 w0Var;
        boolean z10;
        int i10;
        if (this.U != null && !this.V && this.O != null && (w0Var = this.Q) != null) {
            int i11 = w0Var.f12298a;
            if (i11 == 5) {
                p();
            } else if (i11 != 3) {
                return;
            }
            li.x0 x0Var = this.O;
            boolean z11 = this.f25317i0;
            boolean z12 = !z11;
            x0Var.getClass();
            li.x0.u();
            int i12 = x0Var.Z;
            boolean z13 = false;
            if (i12 == 3 || i12 == 5) {
                x0Var.f12316m.b("finish requested: state=" + i0.a.A(x0Var.Z) + ", includeAudio=" + z12 + ", durationMs=" + x0Var.j() + ", trim=" + x0Var.J + ".." + x0Var.K);
                x0Var.B = z12;
                if (x0Var.Z == 3) {
                    x0Var.H = x0Var.j();
                    x0Var.A = true;
                    x0Var.e();
                    x0Var.f12312i.removeCallbacks(x0Var.W);
                    x0Var.w(7);
                    boolean Y = x0Var.f12315l.Y();
                    x0Var.E = Y;
                    if (!Y) {
                        x0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    x0Var.s();
                    x0Var.w(7);
                    if (!x0Var.l() && !z11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (x0Var.l()) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    x0Var.f12313j.execute(new li.m0(x0Var, x0Var.T, z10, x0Var.U, z12, i10, x0Var.S));
                }
                z13 = true;
            }
            this.V = z13;
        }
    }

    public final void u() {
        if (this.B0) {
            this.B0 = false;
            this.f25339z0 = -1;
            this.A0 = -1;
            if (this.O == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f25308a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f25338y0, 0.0f);
            this.f25308a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f25308a0.addUpdateListener(new y40(this, 1));
            this.f25308a0.start();
        }
    }

    public final void v(boolean z10) {
        if (!this.m0) {
            return;
        }
        this.m0 = false;
        org.telegram.ui.ll llVar = this.D;
        llVar.animate().cancel();
        if (z10) {
            llVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            llVar.setAlpha(0.0f);
        }
    }

    public final void w() {
        li.w0 w0Var;
        if (this.O != null && (w0Var = this.Q) != null && w0Var.f12298a == 3) {
            x(2);
            this.O.q();
        }
    }

    public final void x(int i10) {
        if (this.f25316h0 && i10 == 2) {
            return;
        }
        this.f25316h0 = true;
        org.telegram.messenger.zs.f(this.f25313f).k(org.telegram.messenger.zs.f19655n2, Integer.valueOf(this.h), Integer.valueOf(i10));
    }

    public final void y(boolean z10) {
        Bitmap bitmap;
        nh.f fVar = this.f25337y;
        if (fVar.isAvailable() && (bitmap = fVar.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = q(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f25330t0;
                    this.f25330t0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z10) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "icthumb.jpg"));
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.f25330t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f25330t0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void z(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        f50 f50Var = this.f27232a;
        if (f50Var != null) {
            ((org.telegram.ui.re) f50Var).f41208b.Rc.a(z10, true);
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        b50 b50Var = this.f25328s;
        if (z10 && !this.f25319k0) {
            b50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f25334w0 = measuredHeight;
            b50Var.setTranslationY(measuredHeight + this.f25332v0);
        }
        this.f25319k0 = z10;
        View view = this.f25326r;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f25331u0) > 300) {
            f7 = org.telegram.messenger.i0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.addUpdateListener(new y40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.E;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b50Var, property, f13);
        float f16 = 0.1f;
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(b50Var, View.SCALE_X, f14);
        if (z10) {
            f16 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(b50Var, View.SCALE_Y, f16);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(b50Var, View.TRANSLATION_X, f7);
        if (this.f25317i0 && z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.H, property, f15), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.W.addListener(new w5(this, 29));
        } else {
            setTranslationX(0.0f);
        }
        this.W.start();
    }
}
