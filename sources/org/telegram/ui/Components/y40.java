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
public final class y40 extends e50 {
    public static final int M0 = 0;
    public float A0;
    public int B0;
    public int C0;
    public boolean D0;
    public final org.telegram.ui.qk E;
    public boolean E0;
    public final LinearLayout F;
    public float F0;
    public final hi.u2 G;
    public int G0;
    public final hi.u2 H;
    public long H0;
    public final ImageView I;
    public boolean I0;
    public final hi.w2 J;
    public boolean J0;
    public final int[] K;
    public final t40 K0;
    public final Matrix L;
    public final org.telegram.ui.Cells.aa L0;
    public final float[] M;
    public final Paint N;
    public final int O;
    public zi.u0 P;
    public zi.s0 Q;
    public zi.t0 R;
    public zi.m0 S;
    public ry0 T;
    public org.telegram.messenger.d20 U;
    public x40 V;
    public boolean W;
    public boolean f42322a0;
    public AnimatorSet f42323b0;
    public ValueAnimator f42324c0;
    public ValueAnimator f42325d0;
    public final m40 f42326e;
    public final nh0 f42327e0;
    public final int f42328f;
    public nh0 f42329f0;
    public nh0 f42330g0;
    public final int h;
    public boolean f42331h0;
    public boolean f42332i0;
    public boolean f42333j0;
    public boolean f42334k0;
    public boolean f42335l0;
    public boolean m0;
    public final boolean f42336n;
    public boolean f42337n0;
    public boolean f42338o0;
    public boolean f42339p0;
    public boolean f42340q0;
    public final View f42341r;
    public boolean f42342r0;
    public final w40 f42343s;
    public boolean f42344s0;
    public long f42345t0;
    public int f42346u0;
    public Bitmap f42347v0;
    public final uk0 f42348w;
    public long f42349w0;
    public final FrameLayout f42350x;
    public float f42351x0;
    public final v40 f42352y;
    public float f42353y0;
    public float f42354z0;

    public y40(Activity activity, m40 m40Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.f42328f = org.telegram.messenger.i10.f24637t0;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.B0 = -1;
        this.C0 = -1;
        this.F0 = Float.NaN;
        this.K0 = new t40(this, 0);
        this.L0 = new org.telegram.ui.Cells.aa(this, 6);
        this.f42326e = m40Var;
        this.h = m40Var.getClassGuid();
        this.f42336n = m40Var.y();
        this.f42341r = m40Var.getFragmentView();
        setWillNotDraw(false);
        hi.w2 w2Var = new hi.w2(activity, null, this, null);
        this.J = w2Var;
        w2Var.f15665o = 0.5f;
        w2Var.f15664n = hi.w2.f(0.5f);
        w2Var.g();
        addView(w2Var.f15654b, c8.na.e(-1, -1, 119));
        w40 w40Var = new w40(this, activity);
        this.f42343s = w40Var;
        uk0 uk0Var = new uk0(activity);
        this.f42348w = uk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f42350x = frameLayout;
        v40 v40Var = new v40(0, activity, this);
        v40Var.setOpaque(true);
        v40Var.setClickable(true);
        v40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        v40Var.setOutlineProvider(new bg.q0(12));
        v40Var.setClipToOutline(true);
        this.f42352y = v40Var;
        frameLayout.addView(v40Var, c8.na.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.qk qkVar = new org.telegram.ui.qk(this, activity, paint);
        this.E = qkVar;
        qkVar.setOutlineProvider(new bg.q0(11));
        qkVar.setClipToOutline(true);
        frameLayout.addView(qkVar, c8.na.e(-1, -1, 119));
        uk0Var.addView(frameLayout, c8.na.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        w40Var.addView(uk0Var, c8.na.e(-1, -1, 119));
        int i7 = org.telegram.messenger.g0.v;
        addView(w40Var, new FrameLayout.LayoutParams(i7, i7, 17));
        addView(w2Var.f15655c, c8.na.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.na.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754751, null));
        linearLayout.addView((View) imageView, c8.na.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final y40 f40270b;

            {
                this.f40270b = this;
            }

            @Override
            public final void onClick(View view) {
                zi.t0 t0Var;
                zi.m0 m0Var;
                boolean z10;
                zi.t0 t0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        y40 y40Var = this.f40270b;
                        zi.u0 u0Var = y40Var.P;
                        if (u0Var != null && (t0Var = y40Var.R) != null && (m0Var = y40Var.S) != null && t0Var.f62433a == 3 && !t0Var.f62437f && !y40Var.f42339p0) {
                            zi.n0 n0Var = m0Var.f62328a;
                            zi.n0 n0Var2 = zi.n0.f62358a;
                            if (n0Var == n0Var2) {
                                n0Var2 = zi.n0.f62359b;
                            }
                            u0Var.getClass();
                            zi.u0.v();
                            int i11 = u0Var.f62440a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (u0Var.f62456r != n0Var2) {
                                    u0Var.f62451m.b("camera facing requested: " + u0Var.f62456r + " -> " + n0Var2 + ", state=" + yi.i.e(u0Var.f62440a0));
                                    u0Var.f62456r = n0Var2;
                                    int i12 = u0Var.f62440a0;
                                    if (i12 == 3 || i12 == 2) {
                                        u0Var.e();
                                        zi.k kVar = u0Var.f62450l;
                                        kVar.E = n0Var2;
                                        Handler handler = kVar.f62281n;
                                        if (kVar.U && handler != null) {
                                            handler.post(new v9.b(27, kVar, n0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        u0Var.f62462y = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                y40Var.f42327e0.M(0);
                                y40Var.f42327e0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        y40 y40Var2 = this.f40270b;
                        zi.u0 u0Var2 = y40Var2.P;
                        if (u0Var2 != null && (t0Var2 = y40Var2.R) != null && y40Var2.S != null) {
                            boolean z11 = !t0Var2.f62438g;
                            zi.k kVar2 = u0Var2.f62450l;
                            zi.u0.v();
                            if (u0Var2.f62440a0 == 3 && !u0Var2.f62462y && (i10 = u0Var2.f62442b0) != 1) {
                                u0Var2.f62460w = z11;
                                if (i10 == 3) {
                                    u0Var2.w(z11);
                                    kVar2.S(false);
                                } else {
                                    u0Var2.w(false);
                                    kVar2.S(z11);
                                }
                                u0Var2.o();
                                y40Var2.E();
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
        linearLayout.addView((View) imageView2, c8.na.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final y40 f40270b;

            {
                this.f40270b = this;
            }

            @Override
            public final void onClick(View view) {
                zi.t0 t0Var;
                zi.m0 m0Var;
                boolean z10;
                zi.t0 t0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        y40 y40Var = this.f40270b;
                        zi.u0 u0Var = y40Var.P;
                        if (u0Var != null && (t0Var = y40Var.R) != null && (m0Var = y40Var.S) != null && t0Var.f62433a == 3 && !t0Var.f62437f && !y40Var.f42339p0) {
                            zi.n0 n0Var = m0Var.f62328a;
                            zi.n0 n0Var2 = zi.n0.f62358a;
                            if (n0Var == n0Var2) {
                                n0Var2 = zi.n0.f62359b;
                            }
                            u0Var.getClass();
                            zi.u0.v();
                            int i11 = u0Var.f62440a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (u0Var.f62456r != n0Var2) {
                                    u0Var.f62451m.b("camera facing requested: " + u0Var.f62456r + " -> " + n0Var2 + ", state=" + yi.i.e(u0Var.f62440a0));
                                    u0Var.f62456r = n0Var2;
                                    int i12 = u0Var.f62440a0;
                                    if (i12 == 3 || i12 == 2) {
                                        u0Var.e();
                                        zi.k kVar = u0Var.f62450l;
                                        kVar.E = n0Var2;
                                        Handler handler = kVar.f62281n;
                                        if (kVar.U && handler != null) {
                                            handler.post(new v9.b(27, kVar, n0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        u0Var.f62462y = z10;
                                    }
                                    u0Var.n();
                                    u0Var.o();
                                }
                                y40Var.f42327e0.M(0);
                                y40Var.f42327e0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        y40 y40Var2 = this.f40270b;
                        zi.u0 u0Var2 = y40Var2.P;
                        if (u0Var2 != null && (t0Var2 = y40Var2.R) != null && y40Var2.S != null) {
                            boolean z11 = !t0Var2.f62438g;
                            zi.k kVar2 = u0Var2.f62450l;
                            zi.u0.v();
                            if (u0Var2.f62440a0 == 3 && !u0Var2.f62462y && (i10 = u0Var2.f62442b0) != 1) {
                                u0Var2.f62460w = z11;
                                if (i10 == 3) {
                                    u0Var2.w(z11);
                                    kVar2.S(false);
                                } else {
                                    u0Var2.w(false);
                                    kVar2.S(z11);
                                }
                                u0Var2.o();
                                y40Var2.E();
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
        nh0 nh0Var = new nh0(2131624188, L, L);
        this.f42327e0 = nh0Var;
        nh0Var.setCallback(imageView);
        nh0Var.M(nh0Var.f37805e[0] - 1);
        imageView.setImageDrawable(nh0Var);
        E();
        if (i6Var != null && !i6Var.b()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232800);
        imageView3.setAlpha(0.0f);
        addView(imageView3, c8.na.e(48, 48, 17));
        v40Var.setOnTouchListener(new ok(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f42345t0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f42345t0);
    }

    private long getCurrentDurationMs() {
        zi.t0 t0Var;
        zi.u0 u0Var = this.P;
        if (u0Var != null && (t0Var = this.R) != null) {
            if (t0Var.f62433a == 3) {
                return u0Var.j();
            }
            return t0Var.f62434b;
        }
        return 0L;
    }

    public static void n(y40 y40Var) {
        if (y40Var.f42339p0 && y40Var.f42344s0 && y40Var.f42340q0 && y40Var.f42342r0) {
            y40Var.f42339p0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + y40Var.getCameraFlipElapsedMs());
            y40Var.D();
        }
    }

    public static void o(y40 y40Var) {
        org.telegram.ui.qk qkVar = y40Var.E;
        if (!y40Var.f42337n0) {
            return;
        }
        y40Var.f42337n0 = false;
        qkVar.invalidate();
        qkVar.animate().cancel();
        qkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.rj rjVar;
        if (z10 != this.I0) {
            this.I0 = z10;
            this.H0 = 0L;
            t40 t40Var = this.K0;
            if (z10) {
                bg.k.d().a(30, t40Var);
            } else {
                bg.k.d().f(t40Var);
            }
            if (this.d != z10) {
                this.d = z10;
                c50 c50Var = this.f34574c;
                if (c50Var != null && (rjVar = ((org.telegram.ui.xi) c50Var).f53978a.f46118a0) != null) {
                    rjVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f42326e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        hi.w2 w2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.F0)) {
                this.F0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            w2Var.c(null);
        } else {
            if (!Float.isNaN(this.F0)) {
                attributes.screenBrightness = this.F0;
                this.F0 = Float.NaN;
            }
            w2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A(boolean z10) {
        Bitmap bitmap;
        v40 v40Var = this.f42352y;
        if (v40Var.isAvailable() && (bitmap = v40Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = r(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f42347v0;
                    this.f42347v0 = bitmap;
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
                    if (bitmap != this.f42347v0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f42347v0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void B(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        a50 a50Var = this.f34572a;
        if (a50Var != null) {
            ((org.telegram.ui.ee) a50Var).f47511b.f46172dd.a(z10, true);
        }
        AnimatorSet animatorSet = this.f42323b0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f42323b0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        w40 w40Var = this.f42343s;
        if (z10 && !this.m0) {
            w40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f42353y0 = measuredHeight;
            w40Var.setTranslationY(measuredHeight + this.f42351x0);
        }
        this.m0 = z10;
        View view = this.f42341r;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f42349w0) > 300) {
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
        ofFloat.addUpdateListener(new s40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f42323b0 = animatorSet2;
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w40Var, property, f14);
        float f17 = 0.1f;
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(w40Var, View.SCALE_X, f15);
        if (z10) {
            f17 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(w40Var, View.SCALE_Y, f17);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(w40Var, View.TRANSLATION_X, f10);
        if (this.f42334k0 && z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f16), ofFloat);
        this.f42323b0.setDuration(180L);
        this.f42323b0.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.f42323b0.addListener(new x(this, 29));
        } else {
            setTranslationX(0.0f);
        }
        this.f42323b0.start();
    }

    public final void C() {
        if (!this.E0) {
            return;
        }
        this.E0 = false;
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25239k1, 512);
    }

    public final void D() {
        boolean z10;
        zi.m0 m0Var;
        zi.t0 t0Var = this.R;
        boolean z11 = false;
        if (t0Var != null && t0Var.f62433a == 3 && !t0Var.f62437f && !this.f42339p0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (m0Var = this.S) != null && m0Var.f62329b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        E();
    }

    public final void E() {
        zi.t0 t0Var = this.R;
        int i7 = this.O;
        hi.u2 u2Var = this.H;
        if (t0Var != null && t0Var.f62438g) {
            if (this.f42330g0 == null) {
                nh0 nh0Var = new nh0(2131624186, i7, i7);
                this.f42330g0 = nh0Var;
                nh0Var.setCallback(u2Var);
            }
            u2Var.setImageDrawable(this.f42330g0);
            return;
        }
        if (this.f42329f0 == null) {
            nh0 nh0Var2 = new nh0(2131624187, i7, i7);
            this.f42329f0 = nh0Var2;
            nh0Var2.setCallback(u2Var);
        }
        u2Var.setImageDrawable(this.f42329f0);
    }

    public final void F() {
        org.telegram.ui.rj rjVar;
        zi.t0 t0Var = this.R;
        if (t0Var != null) {
            long j3 = t0Var.d;
            if (t0Var.f62433a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + t0Var.f62434b) - t0Var.f62435c);
                this.f42349w0 = min;
                this.f42348w.setProgress(((float) min) / ((float) j3));
                c50 c50Var = this.f34574c;
                if (c50Var != null && (rjVar = ((org.telegram.ui.xi) c50Var).f53978a.f46118a0) != null && rjVar.Z1) {
                    rjVar.Y1 = min;
                    vg vgVar = rjVar.Z0;
                    if (vgVar != null && vgVar.f40685r) {
                        vgVar.h = min;
                        vgVar.invalidate();
                    }
                    sg sgVar = rjVar.f32646b2;
                    if (sgVar != null && sgVar.f39608f) {
                        if (!sgVar.f39607e) {
                            long j10 = sgVar.h;
                            if (j10 >= 0) {
                                if (!sgVar.f39606c) {
                                    sgVar.f39604a = sg.b(Math.max(0L, min - j10));
                                }
                                sgVar.invalidate();
                            }
                        }
                        sgVar.h = min;
                        sgVar.f39604a = 1.0f;
                        sgVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = rjVar.f32637a2;
                    if (slideTextView != null && slideTextView.H && slideTextView.f32856n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z10) {
        zi.u0 u0Var;
        int i7;
        if (!x() && (u0Var = this.P) != null && u0Var.a()) {
            this.V = null;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 6;
            }
            z(i7);
            ry0 ry0Var = this.T;
            if (ry0Var != null) {
                ry0Var.d(true);
            }
            this.T = null;
            MediaController.B().Y(false);
            B(false, false);
        }
    }

    @Override
    public final void b(float f10, int i7) {
        zi.t0 t0Var;
        if (this.P != null && (t0Var = this.R) != null && t0Var.f62433a == 5) {
            q();
            if (i7 == 0) {
                this.P.r();
            } else if (i7 == 1) {
                this.P.p();
            } else if (i7 == 2) {
                zi.u0 u0Var = this.P;
                long j3 = f10 * ((float) this.R.f62434b);
                u0Var.getClass();
                zi.u0.v();
                if (u0Var.f62440a0 == 5 && u0Var.W != null) {
                    long j10 = u0Var.K;
                    u0Var.W.Z0(5, Math.max(j10, Math.min(Math.max(j10, u0Var.L - 1), j3)));
                    u0Var.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        s();
        ValueAnimator valueAnimator = this.f42324c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.P != null && x()) {
            this.f42322a0 = true;
            this.P.s();
        } else {
            zi.u0 u0Var = this.P;
            if (u0Var != null) {
                u0Var.s();
                this.P = null;
            }
        }
        ry0 ry0Var = this.T;
        if (ry0Var != null && !this.f42322a0) {
            ry0Var.d(true ^ this.f42335l0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        C();
    }

    @Override
    public final void d(boolean z10) {
        c(true);
        w40 w40Var = this.f42343s;
        w40Var.setTranslationX(0.0f);
        this.f42353y0 = 0.0f;
        w40Var.setTranslationY(0.0f + this.f42351x0);
        w40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override
    public final boolean f() {
        zi.t0 t0Var = this.R;
        if (t0Var != null) {
            int i7 = t0Var.f62433a;
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
        this.f42351x0 = f11;
        this.f42343s.setTranslationY(this.f42353y0 + f11);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public b50 getCameraContainer() {
        return this.f42343s;
    }

    @Override
    public RectF getCameraRect() {
        v40 v40Var = this.f42352y;
        int[] iArr = this.K;
        v40Var.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new RectF(i7, iArr[1], v40Var.getWidth() + i7, v40Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f42348w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f42352y;
    }

    @Override
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        if (this.P != null && this.R != null) {
            if (i7 == 3) {
                y();
            } else if ((i7 == 1 || i7 == 4) && this.V == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    org.telegram.messenger.ks.f(this.f42328f).k(org.telegram.messenger.ks.f25292t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f62433a == 3) {
                    z(5);
                }
                this.f42332i0 = false;
                this.V = new x40(i10, i11, j3, j10, z10);
                u();
            }
        }
    }

    @Override
    public final void i(dh.c cVar, org.telegram.ui.pi piVar) {
        View view = this.F;
        fh.g c10 = cVar.c(view, piVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void j(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.f42348w.getPaint().setAlpha(255);
        this.f42335l0 = false;
        this.f42334k0 = false;
        this.V = null;
        this.W = false;
        this.f42331h0 = false;
        this.f42333j0 = false;
        this.f42349w0 = 0L;
        this.f42348w.setProgress(0.0f);
        org.telegram.ui.qk qkVar = this.E;
        if (!this.f42337n0) {
            if (this.f42347v0 == null) {
                try {
                    this.f42347v0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f42347v0;
            if (bitmap != null) {
                qkVar.setImageBitmap(bitmap);
            } else {
                qkVar.setImageResource(2131231495);
            }
            this.f42337n0 = true;
            qkVar.animate().cancel();
            qkVar.setAlpha(1.0f);
            qkVar.invalidate();
        }
        this.T = new ry0(this.f42328f, this.f42336n);
        this.Q = (zi.s0) aj.e.f1623e.a();
        zi.l0 l0Var = new zi.l0(getContext(), this.f42352y);
        l0Var.f62318c = new File(org.telegram.messenger.t0.h(), "cache");
        l0Var.d = (zi.n0) aj.e.f1627j.a();
        l0Var.f62319e = this.Q;
        l0Var.h = aj.e.h.a();
        l0Var.f62320f = (zi.o0) aj.e.f1624f.a();
        l0Var.f62321g = (zi.p0) aj.e.f1625g.a();
        aj.a aVar = aj.e.f1626i;
        aVar.a();
        l0Var.f62322i = aVar.d;
        org.telegram.ui.Cells.aa aaVar = this.L0;
        l0Var.f62323j = aaVar;
        ry0 ry0Var = this.T;
        l0Var.f62324k = ry0Var;
        l0Var.f62325l = new hy(this, 4);
        if (l0Var.d != null) {
            if (l0Var.f62319e != null) {
                if (l0Var.h > 0) {
                    if (l0Var.f62320f != null) {
                        if (l0Var.f62321g != null) {
                            if (aaVar != null) {
                                if (ry0Var != null) {
                                    this.P = new zi.u0(l0Var);
                                    MediaController.B().Y(true);
                                    zi.u0 u0Var = this.P;
                                    u0Var.getClass();
                                    zi.u0.v();
                                    if (u0Var.f62440a0 == 1) {
                                        try {
                                            u0Var.f62451m.b("start requested");
                                            u0Var.c(true);
                                            u0Var.x(2);
                                            u0Var.f62450l.V(u0Var.U, 0L, u0Var.f62456r);
                                        } catch (Exception e10) {
                                            u0Var.h(e10);
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
        zi.t0 t0Var;
        zi.u0 u0Var = this.P;
        if (u0Var != null && (t0Var = this.R) != null) {
            int i7 = t0Var.f62433a;
            if (i7 == 3) {
                y();
            } else if (i7 == 5) {
                zi.u0.v();
                if (u0Var.f62440a0 == 5 && u0Var.L - u0Var.K < u0Var.f62455q) {
                    u0Var.Q++;
                    u0Var.D = false;
                    u0Var.f62451m.b("resume requested: trim=" + u0Var.K + ".." + u0Var.L + ", sourceDurationMs=" + u0Var.I);
                    u0Var.t();
                    u0Var.x(6);
                    u0Var.f62448j.execute(new ai.e(u0Var, u0Var.l(), u0Var.U, u0Var.T, u0Var.V, 17));
                    this.U = null;
                    this.f42332i0 = true;
                    this.f42333j0 = false;
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
            i11 = org.telegram.messenger.g0.f24230u;
        }
        if (this.G0 != i11) {
            this.G0 = i11;
            w40 w40Var = this.f42343s;
            w40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            w40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        hi.w2 w2Var = this.J;
        w2Var.f15654b.measure(makeMeasureSpec, makeMeasureSpec2);
        w2Var.f15655c.measure(makeMeasureSpec, makeMeasureSpec2);
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
        zi.u0 u0Var;
        zi.t0 t0Var;
        super.onWindowVisibilityChanged(i7);
        if (i7 != 0 && (u0Var = this.P) != null && (t0Var = this.R) != null) {
            if (t0Var.f62433a == 3) {
                y();
            } else if (t0Var.f62436e) {
                u0Var.p();
            }
        }
    }

    public final void q() {
        zi.t0 t0Var;
        org.telegram.messenger.d20 d20Var;
        if (this.P != null && (t0Var = this.R) != null && (d20Var = this.U) != null) {
            long j3 = t0Var.f62434b;
            long max = Math.max(0L, d20Var.f23587a);
            long j10 = this.U.f23589b;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            zi.u0 u0Var = this.P;
            u0Var.getClass();
            zi.u0.v();
            if (u0Var.f62440a0 == 5) {
                long max2 = Math.max(0L, Math.min(u0Var.I, max));
                long max3 = Math.max(max2, Math.min(u0Var.I, j3));
                if (max3 - max2 >= Math.min(800L, u0Var.I)) {
                    u0Var.K = max2;
                    u0Var.L = max3;
                    l2.g0 g0Var = u0Var.W;
                    if (g0Var != null) {
                        g0Var.Z0(5, max2);
                    }
                    u0Var.d.getClass();
                    u0Var.o();
                }
            }
        }
    }

    public final Bitmap r(Bitmap bitmap) {
        v40 v40Var = this.f42352y;
        if (v40Var.getWidth() > 0 && v40Var.getHeight() > 0) {
            Matrix matrix = this.L;
            v40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / v40Var.getWidth();
                float height = bitmap.getHeight() / v40Var.getHeight();
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

    public final void s() {
        if (!this.f42339p0 && this.f42325d0 == null) {
            return;
        }
        this.f42346u0++;
        ValueAnimator valueAnimator = this.f42325d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f42325d0.cancel();
            this.f42325d0 = null;
        }
        FrameLayout frameLayout = this.f42350x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f42339p0 = false;
        this.f42340q0 = false;
        this.f42342r0 = false;
        this.f42344s0 = false;
        w(false);
    }

    @Override
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.f42343s.getClass();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.F.setAlpha(0.0f);
        w40 w40Var = this.f42343s;
        w40Var.setAlpha(0.0f);
        w40Var.setScaleX(0.1f);
        w40Var.setScaleY(0.1f);
        w40Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f42348w.getPaint().setAlpha(0);
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

    public final org.telegram.messenger.d20 t(File file, long j3, qy0 qy0Var) {
        long j10;
        int i7;
        int i10;
        zi.p0 p0Var;
        org.telegram.messenger.d20 d20Var = new org.telegram.messenger.d20();
        d20Var.f23587a = -1L;
        d20Var.f23589b = -1L;
        d20Var.f23604r = j3;
        if (qy0Var == null) {
            j10 = file.length();
        } else {
            j10 = qy0Var.f39119a;
        }
        d20Var.f23603q = Math.max(1L, j10);
        d20Var.f23605s = true;
        zi.u0 u0Var = this.P;
        if (u0Var != null && (p0Var = u0Var.f62459u) != null) {
            i7 = p0Var.f62371a;
        } else {
            i7 = 30;
        }
        d20Var.f23600n = i7;
        zi.s0 s0Var = this.Q;
        if (s0Var == null) {
            i10 = 480;
        } else {
            i10 = s0Var.f62385a;
        }
        d20Var.h = i10;
        d20Var.f23597k = i10;
        d20Var.f23595i = i10;
        d20Var.f23598l = i10;
        d20Var.f23601o = file.getAbsolutePath();
        if (qy0Var != null) {
            d20Var.f23608w = qy0Var.f39120b;
            d20Var.f23609x = qy0Var.f39121c;
            d20Var.f23610y = qy0Var.d;
            d20Var.f23611z = qy0Var.f39122e;
        }
        return d20Var;
    }

    public final void u() {
        zi.t0 t0Var;
        boolean z10;
        int i7;
        if (this.V != null && !this.W && this.P != null && (t0Var = this.R) != null) {
            int i10 = t0Var.f62433a;
            if (i10 == 5) {
                q();
            } else if (i10 != 3) {
                return;
            }
            zi.u0 u0Var = this.P;
            boolean z11 = this.f42334k0;
            boolean z12 = !z11;
            u0Var.getClass();
            zi.u0.v();
            int i11 = u0Var.f62440a0;
            boolean z13 = false;
            if (i11 == 3 || i11 == 5) {
                u0Var.f62451m.b("finish requested: state=" + yi.i.e(u0Var.f62440a0) + ", includeAudio=" + z12 + ", durationMs=" + u0Var.j() + ", trim=" + u0Var.K + ".." + u0Var.L);
                u0Var.B = z12;
                if (u0Var.f62440a0 == 3) {
                    u0Var.I = u0Var.j();
                    u0Var.A = true;
                    u0Var.e();
                    u0Var.f62447i.removeCallbacks(u0Var.X);
                    u0Var.x(7);
                    boolean W = u0Var.f62450l.W();
                    u0Var.E = W;
                    if (!W) {
                        u0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    u0Var.t();
                    u0Var.x(7);
                    if (!u0Var.l() && !z11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (u0Var.l()) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    u0Var.f62448j.execute(new di.ia(u0Var, u0Var.U, z10, u0Var.V, z12, i7, u0Var.T));
                }
                z13 = true;
            }
            this.W = z13;
        }
    }

    public final void v() {
        if (this.D0) {
            this.D0 = false;
            this.B0 = -1;
            this.C0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.f42324c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A0, 0.0f);
            this.f42324c0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f42324c0.addUpdateListener(new s40(this, 1));
            this.f42324c0.start();
        }
    }

    public final void w(boolean z10) {
        if (!this.f42338o0) {
            return;
        }
        this.f42338o0 = false;
        org.telegram.ui.qk qkVar = this.E;
        qkVar.animate().cancel();
        if (z10) {
            qkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            qkVar.setAlpha(0.0f);
        }
    }

    public final boolean x() {
        zi.u0 u0Var;
        if (this.V != null && this.W && (u0Var = this.P) != null) {
            zi.u0.v();
            if (u0Var.f62440a0 == 7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y() {
        zi.t0 t0Var;
        if (this.P != null && (t0Var = this.R) != null && t0Var.f62433a == 3) {
            z(2);
            this.P.q();
        }
    }

    public final void z(int i7) {
        if (this.f42333j0 && i7 == 2) {
            return;
        }
        this.f42333j0 = true;
        org.telegram.messenger.ks.f(this.f42328f).k(org.telegram.messenger.ks.f25255n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }
}
