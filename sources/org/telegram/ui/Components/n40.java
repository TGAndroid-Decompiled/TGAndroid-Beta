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
    public final i40 J0;
    public final Matrix K;
    public final qt K0;
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
    public boolean W;
    public AnimatorSet f36208a0;
    public ValueAnimator f36209b0;
    public ValueAnimator f36210c0;
    public final zg0 f36211d0;
    public final b40 f36212e;
    public zg0 f36213e0;
    public final int f36214f;
    public zg0 f36215f0;
    public boolean f36216g0;
    public final int h;
    public boolean f36217h0;
    public boolean f36218i0;
    public boolean f36219j0;
    public boolean f36220k0;
    public boolean f36221l0;
    public boolean m0;
    public final boolean f36222n;
    public boolean f36223n0;
    public boolean f36224o0;
    public boolean f36225p0;
    public boolean f36226q0;
    public final View f36227r;
    public boolean f36228r0;
    public final l40 f36229s;
    public long f36230s0;
    public int f36231t0;
    public Bitmap f36232u0;
    public long f36233v0;
    public final fk0 f36234w;
    public float f36235w0;
    public final FrameLayout f36236x;
    public float f36237x0;
    public final k40 f36238y;
    public float f36239y0;
    public float f36240z0;

    public n40(Activity activity, b40 b40Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.f36214f = org.telegram.messenger.p10.f24474s0;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = Float.NaN;
        this.J0 = new i40(this, 0);
        this.K0 = new qt(this, 2);
        this.f36212e = b40Var;
        this.h = b40Var.getClassGuid();
        this.f36222n = b40Var.z();
        this.f36227r = b40Var.getFragmentView();
        setWillNotDraw(false);
        fi.p2 p2Var = new fi.p2(activity, null, this, null);
        this.I = p2Var;
        p2Var.f12588o = 0.5f;
        p2Var.f12587n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.f12577b, c8.ha.e(-1, -1, 119));
        l40 l40Var = new l40(this, activity);
        this.f36229s = l40Var;
        fk0 fk0Var = new fk0(activity);
        this.f36234w = fk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f36236x = frameLayout;
        k40 k40Var = new k40(0, activity, this);
        k40Var.setOpaque(true);
        k40Var.setClickable(true);
        k40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        k40Var.setOutlineProvider(new bg.q0(12));
        k40Var.setClipToOutline(true);
        this.f36238y = k40Var;
        frameLayout.addView(k40Var, c8.ha.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, activity, paint);
        this.D = rkVar;
        rkVar.setOutlineProvider(new bg.q0(11));
        rkVar.setClipToOutline(true);
        frameLayout.addView(rkVar, c8.ha.e(-1, -1, 119));
        fk0Var.addView(frameLayout, c8.ha.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        l40Var.addView(fk0Var, c8.ha.e(-1, -1, 119));
        int i7 = org.telegram.messenger.g0.v;
        addView(l40Var, new FrameLayout.LayoutParams(i7, i7, 17));
        addView(p2Var.f12578c, c8.ha.e(-1, -1, 119));
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
            public final n40 f34837b;

            {
                this.f34837b = this;
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
                        n40 n40Var = this.f34837b;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && (s0Var = n40Var.Q) != null && (l0Var = n40Var.R) != null && s0Var.f58152a == 3 && !s0Var.f58156f && !n40Var.f36224o0) {
                            wi.m0 m0Var = l0Var.f58092a;
                            wi.m0 m0Var2 = wi.m0.f58097a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.f58098b;
                            }
                            t0Var.getClass();
                            wi.t0.v();
                            int i11 = t0Var.f58206a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (t0Var.f58222r != m0Var2) {
                                    t0Var.f58217m.b("camera facing requested: " + t0Var.f58222r + " -> " + m0Var2 + ", state=" + rf.b.u(t0Var.f58206a0));
                                    t0Var.f58222r = m0Var2;
                                    int i12 = t0Var.f58206a0;
                                    if (i12 == 3 || i12 == 2) {
                                        t0Var.e();
                                        wi.k kVar = t0Var.f58216l;
                                        kVar.E = m0Var2;
                                        Handler handler = kVar.f58050n;
                                        if (kVar.U && handler != null) {
                                            handler.post(new u9.f(24, kVar, m0Var2));
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        t0Var.f58228y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                n40Var.f36211d0.M(0);
                                n40Var.f36211d0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n40 n40Var2 = this.f34837b;
                        wi.t0 t0Var2 = n40Var2.O;
                        if (t0Var2 != null && (s0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !s0Var2.f58157g;
                            wi.k kVar2 = t0Var2.f58216l;
                            wi.t0.v();
                            if (t0Var2.f58206a0 == 3 && !t0Var2.f58228y && (i10 = t0Var2.f58208b0) != 1) {
                                t0Var2.f58226w = z10;
                                if (i10 == 3) {
                                    t0Var2.w(z10);
                                    kVar2.S(false);
                                } else {
                                    t0Var2.w(false);
                                    kVar2.S(z10);
                                }
                                t0Var2.o();
                                n40Var2.E();
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
            public final n40 f34837b;

            {
                this.f34837b = this;
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
                        n40 n40Var = this.f34837b;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && (s0Var = n40Var.Q) != null && (l0Var = n40Var.R) != null && s0Var.f58152a == 3 && !s0Var.f58156f && !n40Var.f36224o0) {
                            wi.m0 m0Var = l0Var.f58092a;
                            wi.m0 m0Var2 = wi.m0.f58097a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.f58098b;
                            }
                            t0Var.getClass();
                            wi.t0.v();
                            int i11 = t0Var.f58206a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (t0Var.f58222r != m0Var2) {
                                    t0Var.f58217m.b("camera facing requested: " + t0Var.f58222r + " -> " + m0Var2 + ", state=" + rf.b.u(t0Var.f58206a0));
                                    t0Var.f58222r = m0Var2;
                                    int i12 = t0Var.f58206a0;
                                    if (i12 == 3 || i12 == 2) {
                                        t0Var.e();
                                        wi.k kVar = t0Var.f58216l;
                                        kVar.E = m0Var2;
                                        Handler handler = kVar.f58050n;
                                        if (kVar.U && handler != null) {
                                            handler.post(new u9.f(24, kVar, m0Var2));
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        t0Var.f58228y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                n40Var.f36211d0.M(0);
                                n40Var.f36211d0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n40 n40Var2 = this.f34837b;
                        wi.t0 t0Var2 = n40Var2.O;
                        if (t0Var2 != null && (s0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !s0Var2.f58157g;
                            wi.k kVar2 = t0Var2.f58216l;
                            wi.t0.v();
                            if (t0Var2.f58206a0 == 3 && !t0Var2.f58228y && (i10 = t0Var2.f58208b0) != 1) {
                                t0Var2.f58226w = z10;
                                if (i10 == 3) {
                                    t0Var2.w(z10);
                                    kVar2.S(false);
                                } else {
                                    t0Var2.w(false);
                                    kVar2.S(z10);
                                }
                                t0Var2.o();
                                n40Var2.E();
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
        this.f36211d0 = zg0Var;
        zg0Var.setCallback(imageView);
        zg0Var.M(zg0Var.f40968e[0] - 1);
        imageView.setImageDrawable(zg0Var);
        E();
        if (h6Var != null && !h6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.H = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232795);
        imageView3.setAlpha(0.0f);
        addView(imageView3, c8.ha.e(48, 48, 17));
        k40Var.setOnTouchListener(new yj(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f36230s0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f36230s0);
    }

    private long getCurrentDurationMs() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.O;
        if (t0Var != null && (s0Var = this.Q) != null) {
            if (s0Var.f58152a == 3) {
                return t0Var.j();
            }
            return s0Var.f58153b;
        }
        return 0L;
    }

    public static void n(n40 n40Var) {
        if (n40Var.f36224o0 && n40Var.f36228r0 && n40Var.f36225p0 && n40Var.f36226q0) {
            n40Var.f36224o0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + n40Var.getCameraFlipElapsedMs());
            n40Var.D();
        }
    }

    public static void o(n40 n40Var) {
        org.telegram.ui.rk rkVar = n40Var.D;
        if (!n40Var.m0) {
            return;
        }
        n40Var.m0 = false;
        rkVar.invalidate();
        rkVar.animate().cancel();
        rkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z9) {
        org.telegram.ui.sj sjVar;
        if (z9 != this.H0) {
            this.H0 = z9;
            this.G0 = 0L;
            i40 i40Var = this.J0;
            if (z9) {
                bg.k.d().a(30, i40Var);
            } else {
                bg.k.d().f(i40Var);
            }
            if (this.d != z9) {
                this.d = z9;
                r40 r40Var = this.f38163c;
                if (r40Var != null && (sjVar = ((org.telegram.ui.yi) r40Var).f52049a.Z) != null) {
                    sjVar.setRoundVideoUiFrameClockActive(z9);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z9) {
        Activity parentActivity = this.f36212e.getParentActivity();
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
        k40 k40Var = this.f36238y;
        if (k40Var.isAvailable() && (bitmap = k40Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = r(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f36232u0;
                    this.f36232u0 = bitmap;
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
                    if (bitmap != this.f36232u0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f36232u0) {
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
        p40 p40Var = this.f38161a;
        if (p40Var != null) {
            ((org.telegram.ui.fe) p40Var).f45690b.bd.a(z9, true);
        }
        AnimatorSet animatorSet = this.f36208a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f36208a0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        l40 l40Var = this.f36229s;
        if (z9 && !this.f36221l0) {
            l40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f36237x0 = measuredHeight;
            l40Var.setTranslationY(measuredHeight + this.f36235w0);
        }
        this.f36221l0 = z9;
        View view = this.f36227r;
        if (view != null) {
            view.invalidate();
        }
        if (!z9 && Math.max(getCurrentDurationMs(), this.f36233v0) > 300) {
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
        this.f36208a0 = animatorSet2;
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
        if (this.f36219j0 && z9) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.H, property, f16), ofFloat);
        this.f36208a0.setDuration(180L);
        this.f36208a0.setInterpolator(new DecelerateInterpolator());
        if (!z9) {
            this.f36208a0.addListener(new y5(this, 29));
        } else {
            setTranslationX(0.0f);
        }
        this.f36208a0.start();
    }

    public final void C() {
        if (!this.D0) {
            return;
        }
        this.D0 = false;
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25030k1, 512);
    }

    public final void D() {
        boolean z9;
        wi.l0 l0Var;
        wi.s0 s0Var = this.Q;
        boolean z10 = false;
        if (s0Var != null && s0Var.f58152a == 3 && !s0Var.f58156f && !this.f36224o0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.F.setEnabled(z9);
        if (z9 && (l0Var = this.R) != null && l0Var.f58093b != 1) {
            z10 = true;
        }
        this.G.setEnabled(z10);
        E();
    }

    public final void E() {
        wi.s0 s0Var = this.Q;
        int i7 = this.N;
        fi.n2 n2Var = this.G;
        if (s0Var != null && s0Var.f58157g) {
            if (this.f36215f0 == null) {
                zg0 zg0Var = new zg0(2131624185, i7, i7);
                this.f36215f0 = zg0Var;
                zg0Var.setCallback(n2Var);
            }
            n2Var.setImageDrawable(this.f36215f0);
            return;
        }
        if (this.f36213e0 == null) {
            zg0 zg0Var2 = new zg0(2131624186, i7, i7);
            this.f36213e0 = zg0Var2;
            zg0Var2.setCallback(n2Var);
        }
        n2Var.setImageDrawable(this.f36213e0);
    }

    public final void F() {
        org.telegram.ui.sj sjVar;
        float f10;
        wi.s0 s0Var = this.Q;
        if (s0Var != null) {
            long j3 = s0Var.d;
            if (s0Var.f58152a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + s0Var.f58153b) - s0Var.f58154c);
                this.f36233v0 = min;
                this.f36234w.setProgress(((float) min) / ((float) j3));
                r40 r40Var = this.f38163c;
                if (r40Var != null && (sjVar = ((org.telegram.ui.yi) r40Var).f52049a.Z) != null && sjVar.f31088j1) {
                    sjVar.f31082i1 = min;
                    eg egVar = sjVar.Y0;
                    if (egVar != null && egVar.f33252r) {
                        egVar.h = min;
                        egVar.invalidate();
                    }
                    bg bgVar = sjVar.l1;
                    if (bgVar != null && bgVar.f32256n) {
                        if (!bgVar.h) {
                            long j10 = bgVar.f32257r;
                            if (j10 >= 0) {
                                if (!bgVar.f32254e) {
                                    long max = Math.max(0L, min - j10) % 1200;
                                    if (max < 600) {
                                        f10 = 1.0f - (((float) max) / 600.0f);
                                    } else {
                                        f10 = ((float) (max - 600)) / 600.0f;
                                    }
                                    bgVar.f32251a = f10;
                                }
                                bgVar.invalidate();
                            }
                        }
                        bgVar.f32257r = min;
                        bgVar.f32251a = 1.0f;
                        bgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = sjVar.f31093k1;
                    if (slideTextView != null && slideTextView.J && slideTextView.f31198n != 1.0f) {
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
            hy0 hy0Var = this.S;
            if (hy0Var != null) {
                hy0Var.d(true);
            }
            this.S = null;
            MediaController.B().Y(false);
            B(false, false);
        }
    }

    @Override
    public final void b(float f10, int i7) {
        wi.s0 s0Var;
        if (this.O != null && (s0Var = this.Q) != null && s0Var.f58152a == 5) {
            q();
            if (i7 == 0) {
                this.O.r();
            } else if (i7 == 1) {
                this.O.p();
            } else if (i7 == 2) {
                wi.t0 t0Var = this.O;
                long j3 = f10 * ((float) this.Q.f58153b);
                t0Var.getClass();
                wi.t0.v();
                if (t0Var.f58206a0 == 5 && t0Var.W != null) {
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
        ValueAnimator valueAnimator = this.f36209b0;
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
        hy0 hy0Var = this.S;
        if (hy0Var != null && !this.W) {
            hy0Var.d(true ^ this.f36220k0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        C();
    }

    @Override
    public final void d(boolean z9) {
        c(true);
        l40 l40Var = this.f36229s;
        l40Var.setTranslationX(0.0f);
        this.f36237x0 = 0.0f;
        l40Var.setTranslationY(0.0f + this.f36235w0);
        l40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override
    public final boolean f() {
        wi.s0 s0Var = this.Q;
        if (s0Var != null) {
            int i7 = s0Var.f58152a;
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
        this.f36235w0 = f11;
        this.f36229s.setTranslationY(this.f36237x0 + f11);
    }

    @Override
    public View getButtonsLayout() {
        return this.E;
    }

    @Override
    public q40 getCameraContainer() {
        return this.f36229s;
    }

    @Override
    public RectF getCameraRect() {
        k40 k40Var = this.f36238y;
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
        return this.f36234w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f36238y;
    }

    @Override
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        if (this.O != null && this.Q != null) {
            if (i7 == 3) {
                y();
            } else if ((i7 == 1 || i7 == 4) && this.U == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    org.telegram.messenger.qs.f(this.f36214f).k(org.telegram.messenger.qs.f25083t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.Q.f58152a == 3) {
                    z(5);
                }
                this.f36217h0 = false;
                this.U = new m40(i10, i11, j3, j10, z9);
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
        this.f36234w.getPaint().setAlpha(255);
        this.f36220k0 = false;
        this.f36219j0 = false;
        this.U = null;
        this.V = false;
        this.f36216g0 = false;
        this.f36218i0 = false;
        this.f36233v0 = 0L;
        this.f36234w.setProgress(0.0f);
        org.telegram.ui.rk rkVar = this.D;
        if (!this.m0) {
            if (this.f36232u0 == null) {
                try {
                    this.f36232u0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f36232u0;
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
        this.S = new hy0(this.f36214f, this.f36222n);
        this.P = (wi.r0) xi.e.f58867e.a();
        wi.k0 k0Var = new wi.k0(getContext(), this.f36238y);
        k0Var.f58082c = new File(org.telegram.messenger.t0.h(), "cache");
        k0Var.d = (wi.m0) xi.e.f58871j.a();
        k0Var.f58083e = this.P;
        k0Var.h = xi.e.h.a();
        k0Var.f58084f = (wi.n0) xi.e.f58868f.a();
        k0Var.f58085g = (wi.o0) xi.e.f58869g.a();
        xi.a aVar = xi.e.f58870i;
        aVar.a();
        k0Var.f58086i = aVar.d;
        qt qtVar = this.K0;
        k0Var.f58087j = qtVar;
        hy0 hy0Var = this.S;
        k0Var.f58088k = hy0Var;
        k0Var.f58089l = new ax(this, 5);
        if (k0Var.d != null) {
            if (k0Var.f58083e != null) {
                if (k0Var.h > 0) {
                    if (k0Var.f58084f != null) {
                        if (k0Var.f58085g != null) {
                            if (qtVar != null) {
                                if (hy0Var != null) {
                                    this.O = new wi.t0(k0Var);
                                    MediaController.B().Y(true);
                                    wi.t0 t0Var = this.O;
                                    t0Var.getClass();
                                    wi.t0.v();
                                    if (t0Var.f58206a0 == 1) {
                                        try {
                                            t0Var.f58217m.b("start requested");
                                            t0Var.c(true);
                                            t0Var.x(2);
                                            t0Var.f58216l.V(t0Var.U, 0L, t0Var.f58222r);
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
            int i7 = s0Var.f58152a;
            if (i7 == 3) {
                y();
            } else if (i7 == 5) {
                wi.t0.v();
                if (t0Var.f58206a0 == 5 && t0Var.L - t0Var.K < t0Var.f58221q) {
                    t0Var.Q++;
                    t0Var.D = false;
                    t0Var.f58217m.b("resume requested: trim=" + t0Var.K + ".." + t0Var.L + ", sourceDurationMs=" + t0Var.I);
                    t0Var.t();
                    t0Var.x(6);
                    t0Var.f58214j.execute(new fi.q1(t0Var, t0Var.l(), t0Var.U, t0Var.T, t0Var.V));
                    this.T = null;
                    this.f36217h0 = true;
                    this.f36218i0 = false;
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
            i11 = org.telegram.messenger.g0.f22571u;
        }
        if (this.F0 != i11) {
            this.F0 = i11;
            l40 l40Var = this.f36229s;
            l40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            l40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.p2 p2Var = this.I;
        p2Var.f12577b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.f12578c.measure(makeMeasureSpec, makeMeasureSpec2);
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
            if (s0Var.f58152a == 3) {
                y();
            } else if (s0Var.f58155e) {
                t0Var.p();
            }
        }
    }

    public final void q() {
        wi.s0 s0Var;
        org.telegram.messenger.j20 j20Var;
        if (this.O != null && (s0Var = this.Q) != null && (j20Var = this.T) != null) {
            long j3 = s0Var.f58153b;
            long max = Math.max(0L, j20Var.f23475a);
            long j10 = this.T.f23477b;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            wi.t0 t0Var = this.O;
            t0Var.getClass();
            wi.t0.v();
            if (t0Var.f58206a0 == 5) {
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
        k40 k40Var = this.f36238y;
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

    public final void s() {
        if (!this.f36224o0 && this.f36210c0 == null) {
            return;
        }
        this.f36231t0++;
        ValueAnimator valueAnimator = this.f36210c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f36210c0.cancel();
            this.f36210c0 = null;
        }
        FrameLayout frameLayout = this.f36236x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f36224o0 = false;
        this.f36225p0 = false;
        this.f36226q0 = false;
        this.f36228r0 = false;
        w(false);
    }

    @Override
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override
    public void setIsMessageTransition(boolean z9) {
        this.f36229s.getClass();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.E.setAlpha(0.0f);
        l40 l40Var = this.f36229s;
        l40Var.setAlpha(0.0f);
        l40Var.setScaleX(0.1f);
        l40Var.setScaleY(0.1f);
        l40Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f36234w.getPaint().setAlpha(0);
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

    public final org.telegram.messenger.j20 t(File file, long j3, gy0 gy0Var) {
        long j10;
        int i7;
        int i10;
        wi.o0 o0Var;
        org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
        j20Var.f23475a = -1L;
        j20Var.f23477b = -1L;
        j20Var.f23492r = j3;
        if (gy0Var == null) {
            j10 = file.length();
        } else {
            j10 = gy0Var.f34091a;
        }
        j20Var.f23491q = Math.max(1L, j10);
        j20Var.f23493s = true;
        wi.t0 t0Var = this.O;
        if (t0Var != null && (o0Var = t0Var.f58225u) != null) {
            i7 = o0Var.f58135a;
        } else {
            i7 = 30;
        }
        j20Var.f23488n = i7;
        wi.r0 r0Var = this.P;
        if (r0Var == null) {
            i10 = 480;
        } else {
            i10 = r0Var.f58151a;
        }
        j20Var.h = i10;
        j20Var.f23485k = i10;
        j20Var.f23483i = i10;
        j20Var.f23486l = i10;
        j20Var.f23489o = file.getAbsolutePath();
        if (gy0Var != null) {
            j20Var.f23496w = gy0Var.f34092b;
            j20Var.f23497x = gy0Var.f34093c;
            j20Var.f23498y = gy0Var.d;
            j20Var.f23499z = gy0Var.f34094e;
        }
        return j20Var;
    }

    public final void u() {
        wi.s0 s0Var;
        boolean z9;
        int i7;
        if (this.U != null && !this.V && this.O != null && (s0Var = this.Q) != null) {
            int i10 = s0Var.f58152a;
            if (i10 == 5) {
                q();
            } else if (i10 != 3) {
                return;
            }
            wi.t0 t0Var = this.O;
            boolean z10 = this.f36219j0;
            boolean z11 = !z10;
            t0Var.getClass();
            wi.t0.v();
            int i11 = t0Var.f58206a0;
            boolean z12 = false;
            if (i11 == 3 || i11 == 5) {
                t0Var.f58217m.b("finish requested: state=" + rf.b.u(t0Var.f58206a0) + ", includeAudio=" + z11 + ", durationMs=" + t0Var.j() + ", trim=" + t0Var.K + ".." + t0Var.L);
                t0Var.B = z11;
                if (t0Var.f58206a0 == 3) {
                    t0Var.I = t0Var.j();
                    t0Var.A = true;
                    t0Var.e();
                    t0Var.f58213i.removeCallbacks(t0Var.X);
                    t0Var.x(7);
                    boolean W = t0Var.f58216l.W();
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
                    t0Var.f58214j.execute(new bi.sb(t0Var, t0Var.U, z9, t0Var.V, z11, i7, t0Var.T));
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
            ValueAnimator valueAnimator = this.f36209b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36240z0, 0.0f);
            this.f36209b0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f36209b0.addUpdateListener(new h40(this, 1));
            this.f36209b0.start();
        }
    }

    public final void w(boolean z9) {
        if (!this.f36223n0) {
            return;
        }
        this.f36223n0 = false;
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
            if (t0Var.f58206a0 == 7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y() {
        wi.s0 s0Var;
        if (this.O != null && (s0Var = this.Q) != null && s0Var.f58152a == 3) {
            z(2);
            this.O.q();
        }
    }

    public final void z(int i7) {
        if (this.f36218i0 && i7 == 2) {
            return;
        }
        this.f36218i0 = true;
        org.telegram.messenger.qs.f(this.f36214f).k(org.telegram.messenger.qs.f25046n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }
}
