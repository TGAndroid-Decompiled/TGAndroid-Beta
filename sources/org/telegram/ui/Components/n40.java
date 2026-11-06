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
public final class n40 extends t40 {
    public static final int K0 = 0;
    public int A0;
    public boolean B0;
    public boolean C0;
    public final org.telegram.ui.pk D;
    public float D0;
    public final LinearLayout E;
    public int E0;
    public final fi.n2 F;
    public long F0;
    public final fi.n2 G;
    public boolean G0;
    public final ImageView H;
    public boolean H0;
    public final fi.p2 I;
    public final i40 I0;
    public final int[] J;
    public final qt J0;
    public final Matrix K;
    public final float[] L;
    public final Paint M;
    public final int N;
    public wi.t0 O;
    public wi.r0 P;
    public wi.s0 Q;
    public wi.l0 R;
    public hy0 S;
    public org.telegram.messenger.j20 T;
    public m40 U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator f36194a0;
    public ValueAnimator f36195b0;
    public final zg0 f36196c0;
    public zg0 f36197d0;
    public final b40 f36198e;
    public zg0 f36199e0;
    public final int f36200f;
    public boolean f36201f0;
    public boolean f36202g0;
    public final int h;
    public boolean f36203h0;
    public boolean f36204i0;
    public boolean f36205j0;
    public boolean f36206k0;
    public boolean f36207l0;
    public boolean m0;
    public final boolean f36208n;
    public boolean f36209n0;
    public boolean f36210o0;
    public boolean f36211p0;
    public boolean f36212q0;
    public final View f36213r;
    public long f36214r0;
    public final l40 f36215s;
    public int f36216s0;
    public Bitmap f36217t0;
    public long f36218u0;
    public float f36219v0;
    public final fk0 f36220w;
    public float f36221w0;
    public final FrameLayout f36222x;
    public float f36223x0;
    public final k40 f36224y;
    public float f36225y0;
    public int f36226z0;

    public n40(Activity activity, b40 b40Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f36200f = org.telegram.messenger.p10.f24467s0;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.f36226z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        this.I0 = new i40(this, 0);
        this.J0 = new qt(this, 2);
        this.f36198e = b40Var;
        this.h = b40Var.getClassGuid();
        this.f36208n = b40Var.z();
        this.f36213r = b40Var.getFragmentView();
        setWillNotDraw(false);
        fi.p2 p2Var = new fi.p2(activity, null, this, null);
        this.I = p2Var;
        p2Var.f12586o = 0.5f;
        p2Var.f12585n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.f12575b, c8.ha.e(-1, -1, 119));
        l40 l40Var = new l40(this, activity);
        this.f36215s = l40Var;
        fk0 fk0Var = new fk0(activity);
        this.f36220w = fk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f36222x = frameLayout;
        k40 k40Var = new k40(0, activity, this);
        k40Var.setOpaque(true);
        k40Var.setClickable(true);
        k40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        k40Var.setOutlineProvider(new bg.q0(12));
        k40Var.setClipToOutline(true);
        this.f36224y = k40Var;
        frameLayout.addView(k40Var, c8.ha.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, activity, paint);
        this.D = pkVar;
        pkVar.setOutlineProvider(new bg.q0(11));
        pkVar.setClipToOutline(true);
        frameLayout.addView(pkVar, c8.ha.e(-1, -1, 119));
        fk0Var.addView(frameLayout, c8.ha.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        l40Var.addView(fk0Var, c8.ha.e(-1, -1, 119));
        int i7 = org.telegram.messenger.g0.v;
        addView(l40Var, new FrameLayout.LayoutParams(i7, i7, 17));
        addView(p2Var.f12576c, c8.ha.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.ha.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.F = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        linearLayout.addView((View) imageView, c8.ha.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final n40 f34871b;

            {
                this.f34871b = this;
            }

            @Override
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z9;
                wi.s0 s0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        n40 n40Var = this.f34871b;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && (s0Var = n40Var.Q) != null && (l0Var = n40Var.R) != null && s0Var.f58045a == 3 && !s0Var.f58049f && !n40Var.f36209n0) {
                            wi.m0 m0Var = l0Var.f57984a;
                            wi.m0 m0Var2 = wi.m0.f58014a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.f58015b;
                            }
                            t0Var.getClass();
                            wi.t0.u();
                            int i11 = t0Var.Z;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (t0Var.f58113r != m0Var2) {
                                    t0Var.f58108m.b("camera facing requested: " + t0Var.f58113r + " -> " + m0Var2 + ", state=" + rf.b.t(t0Var.Z));
                                    t0Var.f58113r = m0Var2;
                                    int i12 = t0Var.Z;
                                    if (i12 == 3 || i12 == 2) {
                                        t0Var.e();
                                        wi.j jVar = t0Var.f58107l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.f57935n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new ti.p(28, jVar, m0Var2));
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        t0Var.f58119y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                n40Var.f36196c0.M(0);
                                n40Var.f36196c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n40 n40Var2 = this.f34871b;
                        wi.t0 t0Var2 = n40Var2.O;
                        if (t0Var2 != null && (s0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !s0Var2.f58050g;
                            wi.j jVar2 = t0Var2.f58107l;
                            wi.t0.u();
                            if (t0Var2.Z == 3 && !t0Var2.f58119y && (i10 = t0Var2.f58098a0) != 1) {
                                t0Var2.f58117w = z10;
                                if (i10 == 3) {
                                    t0Var2.v(z10);
                                    jVar2.T(false);
                                } else {
                                    t0Var2.v(false);
                                    jVar2.T(z10);
                                }
                                t0Var2.o();
                                n40Var2.C();
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
        linearLayout.addView((View) imageView2, c8.ha.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final n40 f34871b;

            {
                this.f34871b = this;
            }

            @Override
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z9;
                wi.s0 s0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        n40 n40Var = this.f34871b;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && (s0Var = n40Var.Q) != null && (l0Var = n40Var.R) != null && s0Var.f58045a == 3 && !s0Var.f58049f && !n40Var.f36209n0) {
                            wi.m0 m0Var = l0Var.f57984a;
                            wi.m0 m0Var2 = wi.m0.f58014a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.f58015b;
                            }
                            t0Var.getClass();
                            wi.t0.u();
                            int i11 = t0Var.Z;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (t0Var.f58113r != m0Var2) {
                                    t0Var.f58108m.b("camera facing requested: " + t0Var.f58113r + " -> " + m0Var2 + ", state=" + rf.b.t(t0Var.Z));
                                    t0Var.f58113r = m0Var2;
                                    int i12 = t0Var.Z;
                                    if (i12 == 3 || i12 == 2) {
                                        t0Var.e();
                                        wi.j jVar = t0Var.f58107l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.f57935n;
                                        if (jVar.V && handler != null) {
                                            handler.post(new ti.p(28, jVar, m0Var2));
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        t0Var.f58119y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                n40Var.f36196c0.M(0);
                                n40Var.f36196c0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n40 n40Var2 = this.f34871b;
                        wi.t0 t0Var2 = n40Var2.O;
                        if (t0Var2 != null && (s0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !s0Var2.f58050g;
                            wi.j jVar2 = t0Var2.f58107l;
                            wi.t0.u();
                            if (t0Var2.Z == 3 && !t0Var2.f58119y && (i10 = t0Var2.f58098a0) != 1) {
                                t0Var2.f58117w = z10;
                                if (i10 == 3) {
                                    t0Var2.v(z10);
                                    jVar2.T(false);
                                } else {
                                    t0Var2.v(false);
                                    jVar2.T(z10);
                                }
                                t0Var2.o();
                                n40Var2.C();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(24.0f);
        this.N = L;
        zg0 zg0Var = new zg0(2131624187, L, L);
        this.f36196c0 = zg0Var;
        zg0Var.setCallback(imageView);
        zg0Var.M(zg0Var.f40976e[0] - 1);
        imageView.setImageDrawable(zg0Var);
        C();
        if (f6Var != null && !f6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.H = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232795);
        imageView3.setAlpha(0.0f);
        addView(imageView3, c8.ha.e(48, 48, 17));
        k40Var.setOnTouchListener(new zj(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f36214r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f36214r0);
    }

    private long getCurrentDurationMs() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.O;
        if (t0Var != null && (s0Var = this.Q) != null) {
            if (s0Var.f58045a == 3) {
                return t0Var.j();
            }
            return s0Var.f58046b;
        }
        return 0L;
    }

    public static void m(n40 n40Var) {
        if (n40Var.f36209n0 && n40Var.f36212q0 && n40Var.f36210o0 && n40Var.f36211p0) {
            n40Var.f36209n0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + n40Var.getCameraFlipElapsedMs());
            n40Var.B();
        }
    }

    public static void n(n40 n40Var) {
        org.telegram.ui.pk pkVar = n40Var.D;
        if (!n40Var.f36207l0) {
            return;
        }
        n40Var.f36207l0 = false;
        pkVar.invalidate();
        pkVar.animate().cancel();
        pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z9) {
        org.telegram.ui.qj qjVar;
        if (z9 != this.G0) {
            this.G0 = z9;
            this.F0 = 0L;
            i40 i40Var = this.I0;
            if (z9) {
                bg.k.d().a(30, i40Var);
            } else {
                bg.k.d().f(i40Var);
            }
            if (this.d != z9) {
                this.d = z9;
                r40 r40Var = this.f38209c;
                if (r40Var != null && (qjVar = ((org.telegram.ui.wi) r40Var).f51445a.Z) != null) {
                    qjVar.setRoundVideoUiFrameClockActive(z9);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z9) {
        Activity parentActivity = this.f36198e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        fi.p2 p2Var = this.I;
        if (z9) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            p2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            p2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        if (!this.C0) {
            return;
        }
        this.C0 = false;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25017k1, 512);
    }

    public final void B() {
        boolean z9;
        wi.l0 l0Var;
        wi.s0 s0Var = this.Q;
        boolean z10 = false;
        if (s0Var != null && s0Var.f58045a == 3 && !s0Var.f58049f && !this.f36209n0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.F.setEnabled(z9);
        if (z9 && (l0Var = this.R) != null && l0Var.f57985b != 1) {
            z10 = true;
        }
        this.G.setEnabled(z10);
        C();
    }

    public final void C() {
        wi.s0 s0Var = this.Q;
        int i7 = this.N;
        fi.n2 n2Var = this.G;
        if (s0Var != null && s0Var.f58050g) {
            if (this.f36199e0 == null) {
                zg0 zg0Var = new zg0(2131624185, i7, i7);
                this.f36199e0 = zg0Var;
                zg0Var.setCallback(n2Var);
            }
            n2Var.setImageDrawable(this.f36199e0);
            return;
        }
        if (this.f36197d0 == null) {
            zg0 zg0Var2 = new zg0(2131624186, i7, i7);
            this.f36197d0 = zg0Var2;
            zg0Var2.setCallback(n2Var);
        }
        n2Var.setImageDrawable(this.f36197d0);
    }

    public final void D() {
        org.telegram.ui.qj qjVar;
        float f10;
        wi.s0 s0Var = this.Q;
        if (s0Var != null) {
            long j3 = s0Var.d;
            if (s0Var.f58045a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + s0Var.f58046b) - s0Var.f58047c);
                this.f36218u0 = min;
                this.f36220w.setProgress(((float) min) / ((float) j3));
                r40 r40Var = this.f38209c;
                if (r40Var != null && (qjVar = ((org.telegram.ui.wi) r40Var).f51445a.Z) != null && qjVar.f31068j1) {
                    qjVar.f31062i1 = min;
                    fg fgVar = qjVar.Y0;
                    if (fgVar != null && fgVar.f33538r) {
                        fgVar.h = min;
                        fgVar.invalidate();
                    }
                    cg cgVar = qjVar.l1;
                    if (cgVar != null && cgVar.f32552n) {
                        if (!cgVar.h) {
                            long j10 = cgVar.f32553r;
                            if (j10 >= 0) {
                                if (!cgVar.f32550e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f10 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f10 = ((float) (max - 600)) / 600.0f;
                                    }
                                    cgVar.f32547a = f10;
                                }
                                cgVar.invalidate();
                            }
                        }
                        cgVar.f32553r = min;
                        cgVar.f32547a = 1.0f;
                        cgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = qjVar.f31073k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f31178n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z9) {
        int i7;
        wi.t0 t0Var = this.O;
        if (t0Var != null && t0Var.a()) {
            this.U = null;
            if (z9) {
                i7 = 0;
            } else {
                i7 = 6;
            }
            x(i7);
            hy0 hy0Var = this.S;
            if (hy0Var != null) {
                hy0Var.d(true);
            }
            this.S = null;
            MediaController.B().Y(false);
            z(false, false);
        }
    }

    @Override
    public final void b(float f10, int i7) {
        wi.s0 s0Var;
        if (this.O != null && (s0Var = this.Q) != null && s0Var.f58045a == 5) {
            p();
            if (i7 == 0) {
                this.O.r();
            } else if (i7 == 1) {
                this.O.p();
            } else if (i7 == 2) {
                wi.t0 t0Var = this.O;
                long j3 = f10 * ((float) this.Q.f58046b);
                t0Var.getClass();
                wi.t0.u();
                if (t0Var.Z == 5 && t0Var.V != null) {
                    long j10 = t0Var.J;
                    t0Var.V.Z0(5, Math.max(j10, Math.min(Math.max(j10, t0Var.K - 1), j3)));
                    t0Var.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z9) {
        setRecordingUiFrameClockActive(false);
        r();
        ValueAnimator valueAnimator = this.f36194a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wi.t0 t0Var = this.O;
        if (t0Var != null) {
            wi.t0.u();
            int i7 = t0Var.Z;
            if (i7 == 10) {
                if (!t0Var.F) {
                    t0Var.i();
                }
            } else if (i7 != 8) {
                t0Var.a();
            } else {
                t0Var.e();
                t0Var.s();
                t0Var.f58107l.M();
                t0Var.F = true;
                t0Var.w(10);
                t0Var.m("released");
                t0Var.f58104i.removeCallbacksAndMessages(null);
                t0Var.f58105j.shutdown();
                t0Var.f58106k.shutdown();
            }
            this.O = null;
        }
        hy0 hy0Var = this.S;
        if (hy0Var != null) {
            hy0Var.d(true ^ this.f36205j0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        A();
        l40 l40Var = this.f36215s;
        l40Var.setTranslationX(0.0f);
        this.f36221w0 = 0.0f;
        l40Var.setTranslationY(0.0f + this.f36219v0);
        l40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override
    public final boolean e() {
        wi.s0 s0Var = this.Q;
        if (s0Var != null) {
            int i7 = s0Var.f58045a;
            if (i7 == 4 || i7 == 5 || i7 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void f(float f10) {
        float f11 = f10 * 0.5f;
        this.f36219v0 = f11;
        this.f36215s.setTranslationY(this.f36221w0 + f11);
    }

    @Override
    public final void g(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        if (this.O != null && this.Q != null) {
            if (i7 == 3) {
                w();
            } else if ((i7 == 1 || i7 == 4) && this.U == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    org.telegram.messenger.qs.f(this.f36200f).k(org.telegram.messenger.qs.f25070t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.Q.f58045a == 3) {
                    x(5);
                }
                this.f36202g0 = false;
                this.U = new m40(i10, i11, j3, j10, z9);
                t();
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.E;
    }

    @Override
    public q40 getCameraContainer() {
        return this.f36215s;
    }

    @Override
    public RectF getCameraRect() {
        k40 k40Var = this.f36224y;
        int[] iArr = this.J;
        k40Var.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new RectF(i7, iArr[1], k40Var.getWidth() + i7, k40Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.H;
    }

    @Override
    public Paint getPaint() {
        return this.f36220w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f36224y;
    }

    @Override
    public final void h(dh.c cVar, org.telegram.ui.oi oiVar) {
        View view = this.E;
        fh.g c10 = cVar.c(view, oiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void i(boolean z9) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.f36220w.getPaint().setAlpha(255);
        this.f36205j0 = false;
        this.f36204i0 = false;
        this.U = null;
        this.V = false;
        this.f36201f0 = false;
        this.f36203h0 = false;
        this.f36218u0 = 0L;
        this.f36220w.setProgress(0.0f);
        org.telegram.ui.pk pkVar = this.D;
        if (!this.f36207l0) {
            if (this.f36217t0 == null) {
                try {
                    this.f36217t0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f36217t0;
            if (bitmap != null) {
                pkVar.setImageBitmap(bitmap);
            } else {
                pkVar.setImageResource(2131231492);
            }
            this.f36207l0 = true;
            pkVar.animate().cancel();
            pkVar.setAlpha(1.0f);
            pkVar.invalidate();
        }
        this.S = new hy0(this.f36200f, this.f36208n);
        this.P = (wi.r0) xi.e.f58764e.a();
        wi.k0 k0Var = new wi.k0(getContext(), this.f36224y);
        k0Var.f57974c = new File(org.telegram.messenger.t0.h(), "cache");
        k0Var.d = (wi.m0) xi.e.f58768j.a();
        k0Var.f57975e = this.P;
        k0Var.h = xi.e.h.a();
        k0Var.f57976f = (wi.n0) xi.e.f58765f.a();
        k0Var.f57977g = (wi.o0) xi.e.f58766g.a();
        xi.a aVar = xi.e.f58767i;
        aVar.a();
        k0Var.f57978i = aVar.d;
        qt qtVar = this.J0;
        k0Var.f57979j = qtVar;
        hy0 hy0Var = this.S;
        k0Var.f57980k = hy0Var;
        k0Var.f57981l = new ax(this, 5);
        if (k0Var.d != null) {
            if (k0Var.f57975e != null) {
                if (k0Var.h > 0) {
                    if (k0Var.f57976f != null) {
                        if (k0Var.f57977g != null) {
                            if (qtVar != null) {
                                if (hy0Var != null) {
                                    this.O = new wi.t0(k0Var);
                                    MediaController.B().Y(true);
                                    wi.t0 t0Var = this.O;
                                    t0Var.getClass();
                                    wi.t0.u();
                                    if (t0Var.Z == 1) {
                                        try {
                                            t0Var.f58108m.b("start requested");
                                            t0Var.c(true);
                                            t0Var.w(2);
                                            t0Var.f58107l.X(t0Var.T, 0L, t0Var.f58113r);
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
        wi.t0 t0Var = this.O;
        if (t0Var != null && (s0Var = this.Q) != null) {
            int i7 = s0Var.f58045a;
            if (i7 == 3) {
                w();
            } else if (i7 == 5) {
                wi.t0.u();
                if (t0Var.Z == 5 && t0Var.K - t0Var.J < t0Var.f58112q) {
                    t0Var.P++;
                    t0Var.D = false;
                    t0Var.f58108m.b("resume requested: trim=" + t0Var.J + ".." + t0Var.K + ", sourceDurationMs=" + t0Var.H);
                    t0Var.s();
                    t0Var.w(6);
                    t0Var.f58105j.execute(new fi.q1(t0Var, t0Var.l(), t0Var.T, t0Var.S, t0Var.U));
                    this.T = null;
                    this.f36202g0 = true;
                    this.f36203h0 = false;
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
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (View.MeasureSpec.getSize(i10) - getPaddingBottom() > View.MeasureSpec.getSize(i7) * 1.3f) {
            i11 = org.telegram.messenger.g0.v;
        } else {
            i11 = org.telegram.messenger.g0.f22548u;
        }
        if (this.E0 != i11) {
            this.E0 = i11;
            l40 l40Var = this.f36215s;
            l40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            l40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.p2 p2Var = this.I;
        p2Var.f12575b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.f12576c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onWindowVisibilityChanged(int i7) {
        wi.t0 t0Var;
        wi.s0 s0Var;
        super.onWindowVisibilityChanged(i7);
        if (i7 != 0 && (t0Var = this.O) != null && (s0Var = this.Q) != null) {
            if (s0Var.f58045a == 3) {
                w();
            } else if (s0Var.f58048e) {
                t0Var.p();
            }
        }
    }

    public final void p() {
        wi.s0 s0Var;
        org.telegram.messenger.j20 j20Var;
        if (this.O != null && (s0Var = this.Q) != null && (j20Var = this.T) != null) {
            long j3 = s0Var.f58046b;
            long max = Math.max(0L, j20Var.f23450a);
            long j10 = this.T.f23452b;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            wi.t0 t0Var = this.O;
            t0Var.getClass();
            wi.t0.u();
            if (t0Var.Z == 5) {
                long max2 = Math.max(0L, Math.min(t0Var.H, max));
                long max3 = Math.max(max2, Math.min(t0Var.H, j3));
                if (max3 - max2 >= Math.min(800L, t0Var.H)) {
                    t0Var.J = max2;
                    t0Var.K = max3;
                    l2.i0 i0Var = t0Var.V;
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
        k40 k40Var = this.f36224y;
        if (k40Var.getWidth() > 0 && k40Var.getHeight() > 0) {
            Matrix matrix = this.K;
            k40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / k40Var.getWidth();
                float height = bitmap.getHeight() / k40Var.getHeight();
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
        if (!this.f36209n0 && this.f36195b0 == null) {
            return;
        }
        this.f36216s0++;
        ValueAnimator valueAnimator = this.f36195b0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f36195b0.cancel();
            this.f36195b0 = null;
        }
        FrameLayout frameLayout = this.f36222x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f36209n0 = false;
        this.f36210o0 = false;
        this.f36211p0 = false;
        this.f36212q0 = false;
        v(false);
    }

    public final org.telegram.messenger.j20 s(File file, long j3, gy0 gy0Var) {
        long j10;
        int i7;
        int i10;
        wi.o0 o0Var;
        org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
        j20Var.f23450a = -1L;
        j20Var.f23452b = -1L;
        j20Var.f23467r = j3;
        if (gy0Var == null) {
            j10 = file.length();
        } else {
            j10 = gy0Var.f34107a;
        }
        j20Var.f23466q = Math.max(1L, j10);
        j20Var.f23468s = true;
        wi.t0 t0Var = this.O;
        if (t0Var != null && (o0Var = t0Var.f58116u) != null) {
            i7 = o0Var.f58027a;
        } else {
            i7 = 30;
        }
        j20Var.f23463n = i7;
        wi.r0 r0Var = this.P;
        if (r0Var == null) {
            i10 = 480;
        } else {
            i10 = r0Var.f58044a;
        }
        j20Var.h = i10;
        j20Var.f23460k = i10;
        j20Var.f23458i = i10;
        j20Var.f23461l = i10;
        j20Var.f23464o = file.getAbsolutePath();
        if (gy0Var != null) {
            j20Var.f23471w = gy0Var.f34108b;
            j20Var.f23472x = gy0Var.f34109c;
            j20Var.f23473y = gy0Var.d;
            j20Var.f23474z = gy0Var.f34110e;
        }
        return j20Var;
    }

    @Override
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override
    public void setIsMessageTransition(boolean z9) {
        this.f36215s.getClass();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.E.setAlpha(0.0f);
        l40 l40Var = this.f36215s;
        l40Var.setAlpha(0.0f);
        l40Var.setScaleX(0.1f);
        l40Var.setScaleY(0.1f);
        l40Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f36220w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i7 == 0) {
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
        boolean z9;
        int i7;
        if (this.U != null && !this.V && this.O != null && (s0Var = this.Q) != null) {
            int i10 = s0Var.f58045a;
            if (i10 == 5) {
                p();
            } else if (i10 != 3) {
                return;
            }
            wi.t0 t0Var = this.O;
            boolean z10 = this.f36204i0;
            boolean z11 = !z10;
            t0Var.getClass();
            wi.t0.u();
            int i11 = t0Var.Z;
            boolean z12 = false;
            if (i11 == 3 || i11 == 5) {
                t0Var.f58108m.b("finish requested: state=" + rf.b.t(t0Var.Z) + ", includeAudio=" + z11 + ", durationMs=" + t0Var.j() + ", trim=" + t0Var.J + ".." + t0Var.K);
                t0Var.B = z11;
                if (t0Var.Z == 3) {
                    t0Var.H = t0Var.j();
                    t0Var.A = true;
                    t0Var.e();
                    t0Var.f58104i.removeCallbacks(t0Var.W);
                    t0Var.w(7);
                    boolean Y = t0Var.f58107l.Y();
                    t0Var.E = Y;
                    if (!Y) {
                        t0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    t0Var.s();
                    t0Var.w(7);
                    if (!t0Var.l() && !z10) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (t0Var.l()) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    t0Var.f58105j.execute(new bi.sb(t0Var, t0Var.T, z9, t0Var.U, z11, i7, t0Var.S));
                }
                z12 = true;
            }
            this.V = z12;
        }
    }

    public final void u() {
        if (this.B0) {
            this.B0 = false;
            this.f36226z0 = -1;
            this.A0 = -1;
            if (this.O == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f36194a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36225y0, 0.0f);
            this.f36194a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f36194a0.addUpdateListener(new h40(this, 1));
            this.f36194a0.start();
        }
    }

    public final void v(boolean z9) {
        if (!this.m0) {
            return;
        }
        this.m0 = false;
        org.telegram.ui.pk pkVar = this.D;
        pkVar.animate().cancel();
        if (z9) {
            pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            pkVar.setAlpha(0.0f);
        }
    }

    public final void w() {
        wi.s0 s0Var;
        if (this.O != null && (s0Var = this.Q) != null && s0Var.f58045a == 3) {
            x(2);
            this.O.q();
        }
    }

    public final void x(int i7) {
        if (this.f36203h0 && i7 == 2) {
            return;
        }
        this.f36203h0 = true;
        org.telegram.messenger.qs.f(this.f36200f).k(org.telegram.messenger.qs.f25033n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }

    public final void y(boolean z9) {
        Bitmap bitmap;
        k40 k40Var = this.f36224y;
        if (k40Var.isAvailable() && (bitmap = k40Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = q(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f36217t0;
                    this.f36217t0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z9) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.f36217t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f36217t0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void z(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        p40 p40Var = this.f38207a;
        if (p40Var != null) {
            ((org.telegram.ui.fe) p40Var).f45614b.Zc.a(z9, true);
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        l40 l40Var = this.f36215s;
        if (z9 && !this.f36206k0) {
            l40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f36221w0 = measuredHeight;
            l40Var.setTranslationY(measuredHeight + this.f36219v0);
        }
        this.f36206k0 = z9;
        View view = this.f36213r;
        if (view != null) {
            view.invalidate();
        }
        if (!z9 && Math.max(getCurrentDurationMs(), this.f36218u0) > 300) {
            f10 = org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (z9) {
            f12 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
        ofFloat.addUpdateListener(new h40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        if (z9) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float[] fArr = {f13};
        LinearLayout linearLayout = this.E;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z9) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(l40Var, property, f14);
        float f17 = 0.1f;
        if (z9) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(l40Var, View.SCALE_X, f15);
        if (z9) {
            f17 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(l40Var, View.SCALE_Y, f17);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l40Var, View.TRANSLATION_X, f10);
        if (this.f36204i0 && z9) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.H, property, f16), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (!z9) {
            this.W.addListener(new z5(this, 29));
        } else {
            setTranslationX(0.0f);
        }
        this.W.start();
    }
}
