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
public final class o40 extends u40 {
    public static final int L0 = 0;
    public int A0;
    public int B0;
    public boolean C0;
    public final org.telegram.ui.rk D;
    public boolean D0;
    public final LinearLayout E;
    public float E0;
    public final fi.n2 F;
    public int F0;
    public final fi.n2 G;
    public long G0;
    public final ImageView H;
    public boolean H0;
    public final fi.p2 I;
    public boolean I0;
    public final int[] J;
    public final j40 J0;
    public final Matrix K;
    public final rt K0;
    public final float[] L;
    public final Paint M;
    public final int N;
    public wi.t0 O;
    public wi.r0 P;
    public wi.s0 Q;
    public wi.l0 R;
    public iy0 S;
    public org.telegram.messenger.j20 T;
    public n40 U;
    public boolean V;
    public boolean W;
    public AnimatorSet f36616a0;
    public ValueAnimator f36617b0;
    public ValueAnimator f36618c0;
    public final ah0 f36619d0;
    public final c40 f36620e;
    public ah0 f36621e0;
    public final int f36622f;
    public ah0 f36623f0;
    public boolean f36624g0;
    public final int h;
    public boolean f36625h0;
    public boolean f36626i0;
    public boolean f36627j0;
    public boolean f36628k0;
    public boolean f36629l0;
    public boolean m0;
    public final boolean f36630n;
    public boolean f36631n0;
    public boolean f36632o0;
    public boolean f36633p0;
    public boolean f36634q0;
    public final View f36635r;
    public boolean f36636r0;
    public final m40 f36637s;
    public long f36638s0;
    public int f36639t0;
    public Bitmap f36640u0;
    public long f36641v0;
    public final gk0 f36642w;
    public float f36643w0;
    public final FrameLayout f36644x;
    public float f36645x0;
    public final l40 f36646y;
    public float f36647y0;
    public float f36648z0;

    public o40(Activity activity, c40 c40Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.f36622f = org.telegram.messenger.p10.f24470s0;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = Float.NaN;
        this.J0 = new j40(this, 0);
        this.K0 = new rt(this, 2);
        this.f36620e = c40Var;
        this.h = c40Var.getClassGuid();
        this.f36630n = c40Var.z();
        this.f36635r = c40Var.getFragmentView();
        setWillNotDraw(false);
        fi.p2 p2Var = new fi.p2(activity, null, this, null);
        this.I = p2Var;
        p2Var.f12584o = 0.5f;
        p2Var.f12583n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.f12573b, c8.ha.e(-1, -1, 119));
        m40 m40Var = new m40(this, activity);
        this.f36637s = m40Var;
        gk0 gk0Var = new gk0(activity);
        this.f36642w = gk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f36644x = frameLayout;
        l40 l40Var = new l40(0, activity, this);
        l40Var.setOpaque(true);
        l40Var.setClickable(true);
        l40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        l40Var.setOutlineProvider(new bg.q0(12));
        l40Var.setClipToOutline(true);
        this.f36646y = l40Var;
        frameLayout.addView(l40Var, c8.ha.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, activity, paint);
        this.D = rkVar;
        rkVar.setOutlineProvider(new bg.q0(11));
        rkVar.setClipToOutline(true);
        frameLayout.addView(rkVar, c8.ha.e(-1, -1, 119));
        gk0Var.addView(frameLayout, c8.ha.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        m40Var.addView(gk0Var, c8.ha.e(-1, -1, 119));
        int i7 = org.telegram.messenger.g0.v;
        addView(m40Var, new FrameLayout.LayoutParams(i7, i7, 17));
        addView(p2Var.f12574c, c8.ha.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.ha.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.F = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754752, null));
        linearLayout.addView((View) imageView, c8.ha.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o40 f35231b;

            {
                this.f35231b = this;
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
                        o40 o40Var = this.f35231b;
                        wi.t0 t0Var = o40Var.O;
                        if (t0Var != null && (s0Var = o40Var.Q) != null && (l0Var = o40Var.R) != null && s0Var.f58148a == 3 && !s0Var.f58152f && !o40Var.f36632o0) {
                            wi.m0 m0Var = l0Var.f58088a;
                            wi.m0 m0Var2 = wi.m0.f58093a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.f58094b;
                            }
                            t0Var.getClass();
                            wi.t0.v();
                            int i11 = t0Var.f58202a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (t0Var.f58218r != m0Var2) {
                                    t0Var.f58213m.b("camera facing requested: " + t0Var.f58218r + " -> " + m0Var2 + ", state=" + rf.b.u(t0Var.f58202a0));
                                    t0Var.f58218r = m0Var2;
                                    int i12 = t0Var.f58202a0;
                                    if (i12 == 3 || i12 == 2) {
                                        t0Var.e();
                                        wi.k kVar = t0Var.f58212l;
                                        kVar.E = m0Var2;
                                        Handler handler = kVar.f58046n;
                                        if (kVar.U && handler != null) {
                                            handler.post(new u9.f(24, kVar, m0Var2));
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        t0Var.f58224y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                o40Var.f36619d0.M(0);
                                o40Var.f36619d0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o40 o40Var2 = this.f35231b;
                        wi.t0 t0Var2 = o40Var2.O;
                        if (t0Var2 != null && (s0Var2 = o40Var2.Q) != null && o40Var2.R != null) {
                            boolean z10 = !s0Var2.f58153g;
                            wi.k kVar2 = t0Var2.f58212l;
                            wi.t0.v();
                            if (t0Var2.f58202a0 == 3 && !t0Var2.f58224y && (i10 = t0Var2.f58204b0) != 1) {
                                t0Var2.f58222w = z10;
                                if (i10 == 3) {
                                    t0Var2.w(z10);
                                    kVar2.S(false);
                                } else {
                                    t0Var2.w(false);
                                    kVar2.S(z10);
                                }
                                t0Var2.o();
                                o40Var2.E();
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
            public final o40 f35231b;

            {
                this.f35231b = this;
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
                        o40 o40Var = this.f35231b;
                        wi.t0 t0Var = o40Var.O;
                        if (t0Var != null && (s0Var = o40Var.Q) != null && (l0Var = o40Var.R) != null && s0Var.f58148a == 3 && !s0Var.f58152f && !o40Var.f36632o0) {
                            wi.m0 m0Var = l0Var.f58088a;
                            wi.m0 m0Var2 = wi.m0.f58093a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.f58094b;
                            }
                            t0Var.getClass();
                            wi.t0.v();
                            int i11 = t0Var.f58202a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (t0Var.f58218r != m0Var2) {
                                    t0Var.f58213m.b("camera facing requested: " + t0Var.f58218r + " -> " + m0Var2 + ", state=" + rf.b.u(t0Var.f58202a0));
                                    t0Var.f58218r = m0Var2;
                                    int i12 = t0Var.f58202a0;
                                    if (i12 == 3 || i12 == 2) {
                                        t0Var.e();
                                        wi.k kVar = t0Var.f58212l;
                                        kVar.E = m0Var2;
                                        Handler handler = kVar.f58046n;
                                        if (kVar.U && handler != null) {
                                            handler.post(new u9.f(24, kVar, m0Var2));
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        t0Var.f58224y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                o40Var.f36619d0.M(0);
                                o40Var.f36619d0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o40 o40Var2 = this.f35231b;
                        wi.t0 t0Var2 = o40Var2.O;
                        if (t0Var2 != null && (s0Var2 = o40Var2.Q) != null && o40Var2.R != null) {
                            boolean z10 = !s0Var2.f58153g;
                            wi.k kVar2 = t0Var2.f58212l;
                            wi.t0.v();
                            if (t0Var2.f58202a0 == 3 && !t0Var2.f58224y && (i10 = t0Var2.f58204b0) != 1) {
                                t0Var2.f58222w = z10;
                                if (i10 == 3) {
                                    t0Var2.w(z10);
                                    kVar2.S(false);
                                } else {
                                    t0Var2.w(false);
                                    kVar2.S(z10);
                                }
                                t0Var2.o();
                                o40Var2.E();
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
        ah0 ah0Var = new ah0(2131624187, L, L);
        this.f36619d0 = ah0Var;
        ah0Var.setCallback(imageView);
        ah0Var.M(ah0Var.f31826e[0] - 1);
        imageView.setImageDrawable(ah0Var);
        E();
        if (g6Var != null && !g6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.H = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232795);
        imageView3.setAlpha(0.0f);
        addView(imageView3, c8.ha.e(48, 48, 17));
        l40Var.setOnTouchListener(new zj(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f36638s0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f36638s0);
    }

    private long getCurrentDurationMs() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.O;
        if (t0Var != null && (s0Var = this.Q) != null) {
            if (s0Var.f58148a == 3) {
                return t0Var.j();
            }
            return s0Var.f58149b;
        }
        return 0L;
    }

    public static void n(o40 o40Var) {
        if (o40Var.f36632o0 && o40Var.f36636r0 && o40Var.f36633p0 && o40Var.f36634q0) {
            o40Var.f36632o0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + o40Var.getCameraFlipElapsedMs());
            o40Var.D();
        }
    }

    public static void o(o40 o40Var) {
        org.telegram.ui.rk rkVar = o40Var.D;
        if (!o40Var.m0) {
            return;
        }
        o40Var.m0 = false;
        rkVar.invalidate();
        rkVar.animate().cancel();
        rkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z9) {
        org.telegram.ui.sj sjVar;
        if (z9 != this.H0) {
            this.H0 = z9;
            this.G0 = 0L;
            j40 j40Var = this.J0;
            if (z9) {
                bg.k.d().a(30, j40Var);
            } else {
                bg.k.d().f(j40Var);
            }
            if (this.d != z9) {
                this.d = z9;
                s40 s40Var = this.f38591c;
                if (s40Var != null && (sjVar = ((org.telegram.ui.yi) s40Var).f52128a.Z) != null) {
                    sjVar.setRoundVideoUiFrameClockActive(z9);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z9) {
        Activity parentActivity = this.f36620e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        fi.p2 p2Var = this.I;
        if (z9) {
            if (Float.isNaN(this.E0)) {
                this.E0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            p2Var.c(null);
        } else {
            if (!Float.isNaN(this.E0)) {
                attributes.screenBrightness = this.E0;
                this.E0 = Float.NaN;
            }
            p2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A(boolean z9) {
        Bitmap bitmap;
        l40 l40Var = this.f36646y;
        if (l40Var.isAvailable() && (bitmap = l40Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = r(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f36640u0;
                    this.f36640u0 = bitmap;
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
                    if (bitmap != this.f36640u0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f36640u0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void B(boolean z9, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        q40 q40Var = this.f38589a;
        if (q40Var != null) {
            ((org.telegram.ui.fe) q40Var).f45692b.bd.a(z9, true);
        }
        AnimatorSet animatorSet = this.f36616a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f36616a0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        m40 m40Var = this.f36637s;
        if (z9 && !this.f36629l0) {
            m40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f36645x0 = measuredHeight;
            m40Var.setTranslationY(measuredHeight + this.f36643w0);
        }
        this.f36629l0 = z9;
        View view = this.f36635r;
        if (view != null) {
            view.invalidate();
        }
        if (!z9 && Math.max(getCurrentDurationMs(), this.f36641v0) > 300) {
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
        ofFloat.addUpdateListener(new i40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f36616a0 = animatorSet2;
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(m40Var, property, f14);
        float f17 = 0.1f;
        if (z9) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m40Var, View.SCALE_X, f15);
        if (z9) {
            f17 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m40Var, View.SCALE_Y, f17);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m40Var, View.TRANSLATION_X, f10);
        if (this.f36627j0 && z9) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.H, property, f16), ofFloat);
        this.f36616a0.setDuration(180L);
        this.f36616a0.setInterpolator(new DecelerateInterpolator());
        if (!z9) {
            this.f36616a0.addListener(new z5(this, 29));
        } else {
            setTranslationX(0.0f);
        }
        this.f36616a0.start();
    }

    public final void C() {
        if (!this.D0) {
            return;
        }
        this.D0 = false;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25026k1, 512);
    }

    public final void D() {
        boolean z9;
        wi.l0 l0Var;
        wi.s0 s0Var = this.Q;
        boolean z10 = false;
        if (s0Var != null && s0Var.f58148a == 3 && !s0Var.f58152f && !this.f36632o0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.F.setEnabled(z9);
        if (z9 && (l0Var = this.R) != null && l0Var.f58089b != 1) {
            z10 = true;
        }
        this.G.setEnabled(z10);
        E();
    }

    public final void E() {
        wi.s0 s0Var = this.Q;
        int i7 = this.N;
        fi.n2 n2Var = this.G;
        if (s0Var != null && s0Var.f58153g) {
            if (this.f36623f0 == null) {
                ah0 ah0Var = new ah0(2131624185, i7, i7);
                this.f36623f0 = ah0Var;
                ah0Var.setCallback(n2Var);
            }
            n2Var.setImageDrawable(this.f36623f0);
            return;
        }
        if (this.f36621e0 == null) {
            ah0 ah0Var2 = new ah0(2131624186, i7, i7);
            this.f36621e0 = ah0Var2;
            ah0Var2.setCallback(n2Var);
        }
        n2Var.setImageDrawable(this.f36621e0);
    }

    public final void F() {
        org.telegram.ui.sj sjVar;
        float f10;
        wi.s0 s0Var = this.Q;
        if (s0Var != null) {
            long j3 = s0Var.d;
            if (s0Var.f58148a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + s0Var.f58149b) - s0Var.f58150c);
                this.f36641v0 = min;
                this.f36642w.setProgress(((float) min) / ((float) j3));
                s40 s40Var = this.f38591c;
                if (s40Var != null && (sjVar = ((org.telegram.ui.yi) s40Var).f52128a.Z) != null && sjVar.f31077j1) {
                    sjVar.f31071i1 = min;
                    fg fgVar = sjVar.Y0;
                    if (fgVar != null && fgVar.f33666r) {
                        fgVar.h = min;
                        fgVar.invalidate();
                    }
                    cg cgVar = sjVar.l1;
                    if (cgVar != null && cgVar.f32680n) {
                        if (!cgVar.h) {
                            long j10 = cgVar.f32681r;
                            if (j10 >= 0) {
                                if (!cgVar.f32678e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f10 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f10 = ((float) (max - 600)) / 600.0f;
                                    }
                                    cgVar.f32675a = f10;
                                }
                                cgVar.invalidate();
                            }
                        }
                        cgVar.f32681r = min;
                        cgVar.f32675a = 1.0f;
                        cgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = sjVar.f31082k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f31187n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z9) {
        wi.t0 t0Var;
        int i7;
        if (!x() && (t0Var = this.O) != null && t0Var.a()) {
            this.U = null;
            if (z9) {
                i7 = 0;
            } else {
                i7 = 6;
            }
            z(i7);
            iy0 iy0Var = this.S;
            if (iy0Var != null) {
                iy0Var.d(true);
            }
            this.S = null;
            MediaController.B().Y(false);
            B(false, false);
        }
    }

    @Override
    public final void b(float f10, int i7) {
        wi.s0 s0Var;
        if (this.O != null && (s0Var = this.Q) != null && s0Var.f58148a == 5) {
            q();
            if (i7 == 0) {
                this.O.r();
            } else if (i7 == 1) {
                this.O.p();
            } else if (i7 == 2) {
                wi.t0 t0Var = this.O;
                long j3 = f10 * ((float) this.Q.f58149b);
                t0Var.getClass();
                wi.t0.v();
                if (t0Var.f58202a0 == 5 && t0Var.W != null) {
                    long j10 = t0Var.K;
                    t0Var.W.Z0(5, Math.max(j10, Math.min(Math.max(j10, t0Var.L - 1), j3)));
                    t0Var.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z9) {
        setRecordingUiFrameClockActive(false);
        s();
        ValueAnimator valueAnimator = this.f36617b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.O != null && x()) {
            this.W = true;
            this.O.s();
        } else {
            wi.t0 t0Var = this.O;
            if (t0Var != null) {
                t0Var.s();
                this.O = null;
            }
        }
        iy0 iy0Var = this.S;
        if (iy0Var != null && !this.W) {
            iy0Var.d(true ^ this.f36628k0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        C();
    }

    @Override
    public final void d(boolean z9) {
        c(true);
        m40 m40Var = this.f36637s;
        m40Var.setTranslationX(0.0f);
        this.f36645x0 = 0.0f;
        m40Var.setTranslationY(0.0f + this.f36643w0);
        m40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override
    public final boolean f() {
        wi.s0 s0Var = this.Q;
        if (s0Var != null) {
            int i7 = s0Var.f58148a;
            if (i7 == 4 || i7 == 5 || i7 == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void g(float f10) {
        float f11 = f10 * 0.5f;
        this.f36643w0 = f11;
        this.f36637s.setTranslationY(this.f36645x0 + f11);
    }

    @Override
    public View getButtonsLayout() {
        return this.E;
    }

    @Override
    public r40 getCameraContainer() {
        return this.f36637s;
    }

    @Override
    public RectF getCameraRect() {
        l40 l40Var = this.f36646y;
        int[] iArr = this.J;
        l40Var.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new RectF(i7, iArr[1], l40Var.getWidth() + i7, l40Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.H;
    }

    @Override
    public Paint getPaint() {
        return this.f36642w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f36646y;
    }

    @Override
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        if (this.O != null && this.Q != null) {
            if (i7 == 3) {
                y();
            } else if ((i7 == 1 || i7 == 4) && this.U == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    org.telegram.messenger.qs.f(this.f36622f).k(org.telegram.messenger.qs.f25079t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.Q.f58148a == 3) {
                    z(5);
                }
                this.f36625h0 = false;
                this.U = new n40(i10, i11, j3, j10, z9);
                u();
            }
        }
    }

    @Override
    public final void i(dh.c cVar, org.telegram.ui.qi qiVar) {
        View view = this.E;
        fh.g c10 = cVar.c(view, qiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void j(boolean z9) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.f36642w.getPaint().setAlpha(255);
        this.f36628k0 = false;
        this.f36627j0 = false;
        this.U = null;
        this.V = false;
        this.f36624g0 = false;
        this.f36626i0 = false;
        this.f36641v0 = 0L;
        this.f36642w.setProgress(0.0f);
        org.telegram.ui.rk rkVar = this.D;
        if (!this.m0) {
            if (this.f36640u0 == null) {
                try {
                    this.f36640u0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f36640u0;
            if (bitmap != null) {
                rkVar.setImageBitmap(bitmap);
            } else {
                rkVar.setImageResource(2131231492);
            }
            this.m0 = true;
            rkVar.animate().cancel();
            rkVar.setAlpha(1.0f);
            rkVar.invalidate();
        }
        this.S = new iy0(this.f36622f, this.f36630n);
        this.P = (wi.r0) xi.e.f58869e.a();
        wi.k0 k0Var = new wi.k0(getContext(), this.f36646y);
        k0Var.f58078c = new File(org.telegram.messenger.t0.h(), "cache");
        k0Var.d = (wi.m0) xi.e.f58873j.a();
        k0Var.f58079e = this.P;
        k0Var.h = xi.e.h.a();
        k0Var.f58080f = (wi.n0) xi.e.f58870f.a();
        k0Var.f58081g = (wi.o0) xi.e.f58871g.a();
        xi.a aVar = xi.e.f58872i;
        aVar.a();
        k0Var.f58082i = aVar.d;
        rt rtVar = this.K0;
        k0Var.f58083j = rtVar;
        iy0 iy0Var = this.S;
        k0Var.f58084k = iy0Var;
        k0Var.f58085l = new bx(this, 5);
        if (k0Var.d != null) {
            if (k0Var.f58079e != null) {
                if (k0Var.h > 0) {
                    if (k0Var.f58080f != null) {
                        if (k0Var.f58081g != null) {
                            if (rtVar != null) {
                                if (iy0Var != null) {
                                    this.O = new wi.t0(k0Var);
                                    MediaController.B().Y(true);
                                    wi.t0 t0Var = this.O;
                                    t0Var.getClass();
                                    wi.t0.v();
                                    if (t0Var.f58202a0 == 1) {
                                        try {
                                            t0Var.f58213m.b("start requested");
                                            t0Var.c(true);
                                            t0Var.x(2);
                                            t0Var.f58212l.V(t0Var.U, 0L, t0Var.f58218r);
                                        } catch (Exception e10) {
                                            t0Var.h(e10);
                                        }
                                    }
                                    B(true, false);
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
    public final void k() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.O;
        if (t0Var != null && (s0Var = this.Q) != null) {
            int i7 = s0Var.f58148a;
            if (i7 == 3) {
                y();
            } else if (i7 == 5) {
                wi.t0.v();
                if (t0Var.f58202a0 == 5 && t0Var.L - t0Var.K < t0Var.f58217q) {
                    t0Var.Q++;
                    t0Var.D = false;
                    t0Var.f58213m.b("resume requested: trim=" + t0Var.K + ".." + t0Var.L + ", sourceDurationMs=" + t0Var.I);
                    t0Var.t();
                    t0Var.x(6);
                    t0Var.f58210j.execute(new fi.q1(t0Var, t0Var.l(), t0Var.U, t0Var.T, t0Var.V));
                    this.T = null;
                    this.f36625h0 = true;
                    this.f36626i0 = false;
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
            i11 = org.telegram.messenger.g0.f22567u;
        }
        if (this.F0 != i11) {
            this.F0 = i11;
            m40 m40Var = this.f36637s;
            m40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            m40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.p2 p2Var = this.I;
        p2Var.f12573b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.f12574c.measure(makeMeasureSpec, makeMeasureSpec2);
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
            if (s0Var.f58148a == 3) {
                y();
            } else if (s0Var.f58151e) {
                t0Var.p();
            }
        }
    }

    public final void q() {
        wi.s0 s0Var;
        org.telegram.messenger.j20 j20Var;
        if (this.O != null && (s0Var = this.Q) != null && (j20Var = this.T) != null) {
            long j3 = s0Var.f58149b;
            long max = Math.max(0L, j20Var.f23471a);
            long j10 = this.T.f23473b;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            wi.t0 t0Var = this.O;
            t0Var.getClass();
            wi.t0.v();
            if (t0Var.f58202a0 == 5) {
                long max2 = Math.max(0L, Math.min(t0Var.I, max));
                long max3 = Math.max(max2, Math.min(t0Var.I, j3));
                if (max3 - max2 >= Math.min(800L, t0Var.I)) {
                    t0Var.K = max2;
                    t0Var.L = max3;
                    l2.i0 i0Var = t0Var.W;
                    if (i0Var != null) {
                        i0Var.Z0(5, max2);
                    }
                    t0Var.d.getClass();
                    t0Var.o();
                }
            }
        }
    }

    public final Bitmap r(Bitmap bitmap) {
        l40 l40Var = this.f36646y;
        if (l40Var.getWidth() > 0 && l40Var.getHeight() > 0) {
            Matrix matrix = this.K;
            l40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / l40Var.getWidth();
                float height = bitmap.getHeight() / l40Var.getHeight();
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

    public final void s() {
        if (!this.f36632o0 && this.f36618c0 == null) {
            return;
        }
        this.f36639t0++;
        ValueAnimator valueAnimator = this.f36618c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f36618c0.cancel();
            this.f36618c0 = null;
        }
        FrameLayout frameLayout = this.f36644x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f36632o0 = false;
        this.f36633p0 = false;
        this.f36634q0 = false;
        this.f36636r0 = false;
        w(false);
    }

    @Override
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override
    public void setIsMessageTransition(boolean z9) {
        this.f36637s.getClass();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.E.setAlpha(0.0f);
        m40 m40Var = this.f36637s;
        m40Var.setAlpha(0.0f);
        m40Var.setScaleX(0.1f);
        m40Var.setScaleY(0.1f);
        m40Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f36642w.getPaint().setAlpha(0);
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

    public final org.telegram.messenger.j20 t(File file, long j3, hy0 hy0Var) {
        long j10;
        int i7;
        int i10;
        wi.o0 o0Var;
        org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
        j20Var.f23471a = -1L;
        j20Var.f23473b = -1L;
        j20Var.f23488r = j3;
        if (hy0Var == null) {
            j10 = file.length();
        } else {
            j10 = hy0Var.f34490a;
        }
        j20Var.f23487q = Math.max(1L, j10);
        j20Var.f23489s = true;
        wi.t0 t0Var = this.O;
        if (t0Var != null && (o0Var = t0Var.f58221u) != null) {
            i7 = o0Var.f58131a;
        } else {
            i7 = 30;
        }
        j20Var.f23484n = i7;
        wi.r0 r0Var = this.P;
        if (r0Var == null) {
            i10 = 480;
        } else {
            i10 = r0Var.f58147a;
        }
        j20Var.h = i10;
        j20Var.f23481k = i10;
        j20Var.f23479i = i10;
        j20Var.f23482l = i10;
        j20Var.f23485o = file.getAbsolutePath();
        if (hy0Var != null) {
            j20Var.f23492w = hy0Var.f34491b;
            j20Var.f23493x = hy0Var.f34492c;
            j20Var.f23494y = hy0Var.d;
            j20Var.f23495z = hy0Var.f34493e;
        }
        return j20Var;
    }

    public final void u() {
        wi.s0 s0Var;
        boolean z9;
        int i7;
        if (this.U != null && !this.V && this.O != null && (s0Var = this.Q) != null) {
            int i10 = s0Var.f58148a;
            if (i10 == 5) {
                q();
            } else if (i10 != 3) {
                return;
            }
            wi.t0 t0Var = this.O;
            boolean z10 = this.f36627j0;
            boolean z11 = !z10;
            t0Var.getClass();
            wi.t0.v();
            int i11 = t0Var.f58202a0;
            boolean z12 = false;
            if (i11 == 3 || i11 == 5) {
                t0Var.f58213m.b("finish requested: state=" + rf.b.u(t0Var.f58202a0) + ", includeAudio=" + z11 + ", durationMs=" + t0Var.j() + ", trim=" + t0Var.K + ".." + t0Var.L);
                t0Var.B = z11;
                if (t0Var.f58202a0 == 3) {
                    t0Var.I = t0Var.j();
                    t0Var.A = true;
                    t0Var.e();
                    t0Var.f58209i.removeCallbacks(t0Var.X);
                    t0Var.x(7);
                    boolean W = t0Var.f58212l.W();
                    t0Var.E = W;
                    if (!W) {
                        t0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    t0Var.t();
                    t0Var.x(7);
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
                    t0Var.f58210j.execute(new bi.sb(t0Var, t0Var.U, z9, t0Var.V, z11, i7, t0Var.T));
                }
                z12 = true;
            }
            this.V = z12;
        }
    }

    public final void v() {
        if (this.C0) {
            this.C0 = false;
            this.A0 = -1;
            this.B0 = -1;
            if (this.O == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f36617b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36648z0, 0.0f);
            this.f36617b0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f36617b0.addUpdateListener(new i40(this, 1));
            this.f36617b0.start();
        }
    }

    public final void w(boolean z9) {
        if (!this.f36631n0) {
            return;
        }
        this.f36631n0 = false;
        org.telegram.ui.rk rkVar = this.D;
        rkVar.animate().cancel();
        if (z9) {
            rkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            rkVar.setAlpha(0.0f);
        }
    }

    public final boolean x() {
        wi.t0 t0Var;
        if (this.U != null && this.V && (t0Var = this.O) != null) {
            wi.t0.v();
            if (t0Var.f58202a0 == 7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y() {
        wi.s0 s0Var;
        if (this.O != null && (s0Var = this.Q) != null && s0Var.f58148a == 3) {
            z(2);
            this.O.q();
        }
    }

    public final void z(int i7) {
        if (this.f36626i0 && i7 == 2) {
            return;
        }
        this.f36626i0 = true;
        org.telegram.messenger.qs.f(this.f36622f).k(org.telegram.messenger.qs.f25042n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }
}
