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
public final class q40 extends w40 {
    public static final int M0 = 0;
    public float A0;
    public int B0;
    public int C0;
    public boolean D0;
    public final org.telegram.ui.pk E;
    public boolean E0;
    public final LinearLayout F;
    public float F0;
    public final hi.l2 G;
    public int G0;
    public final hi.l2 H;
    public long H0;
    public final ImageView I;
    public boolean I0;
    public final hi.n2 J;
    public boolean J0;
    public final int[] K;
    public final l40 K0;
    public final Matrix L;
    public final ff L0;
    public final float[] M;
    public final Paint N;
    public final int O;
    public zi.v0 P;
    public zi.t0 Q;
    public zi.u0 R;
    public zi.m0 S;
    public jy0 T;
    public org.telegram.messenger.g20 U;
    public p40 V;
    public boolean W;
    public boolean f38486a0;
    public AnimatorSet f38487b0;
    public ValueAnimator f38488c0;
    public ValueAnimator f38489d0;
    public final e40 f38490e;
    public final ch0 f38491e0;
    public final int f38492f;
    public ch0 f38493f0;
    public ch0 f38494g0;
    public final int h;
    public boolean f38495h0;
    public boolean f38496i0;
    public boolean f38497j0;
    public boolean f38498k0;
    public boolean f38499l0;
    public boolean m0;
    public final boolean f38500n;
    public boolean f38501n0;
    public boolean f38502o0;
    public boolean f38503p0;
    public boolean f38504q0;
    public final View f38505r;
    public boolean f38506r0;
    public final o40 f38507s;
    public boolean f38508s0;
    public long f38509t0;
    public int f38510u0;
    public Bitmap f38511v0;
    public final kk0 f38512w;
    public long f38513w0;
    public final FrameLayout f38514x;
    public float f38515x0;
    public final n40 f38516y;
    public float f38517y0;
    public float f38518z0;

    public q40(Activity activity, e40 e40Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f38492f = org.telegram.messenger.m10.f24940t0;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.B0 = -1;
        this.C0 = -1;
        this.F0 = Float.NaN;
        this.K0 = new l40(this, 0);
        this.L0 = new ff(this, 4);
        this.f38490e = e40Var;
        this.h = e40Var.getClassGuid();
        this.f38500n = e40Var.z();
        this.f38505r = e40Var.getFragmentView();
        setWillNotDraw(false);
        hi.n2 n2Var = new hi.n2(activity, null, this, null);
        this.J = n2Var;
        n2Var.f14751o = 0.5f;
        n2Var.f14750n = hi.n2.f(0.5f);
        n2Var.g();
        addView(n2Var.f14740b, c8.ja.e(-1, -1, 119));
        o40 o40Var = new o40(this, activity);
        this.f38507s = o40Var;
        kk0 kk0Var = new kk0(activity);
        this.f38512w = kk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f38514x = frameLayout;
        n40 n40Var = new n40(0, activity, this);
        n40Var.setOpaque(true);
        n40Var.setClickable(true);
        n40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        n40Var.setOutlineProvider(new bg.p0(12));
        n40Var.setClipToOutline(true);
        this.f38516y = n40Var;
        frameLayout.addView(n40Var, c8.ja.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, activity, paint);
        this.E = pkVar;
        pkVar.setOutlineProvider(new bg.p0(11));
        pkVar.setClipToOutline(true);
        frameLayout.addView(pkVar, c8.ja.e(-1, -1, 119));
        kk0Var.addView(frameLayout, c8.ja.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        o40Var.addView(kk0Var, c8.ja.e(-1, -1, 119));
        int i7 = org.telegram.messenger.g0.v;
        addView(o40Var, new FrameLayout.LayoutParams(i7, i7, 17));
        addView(n2Var.f14741c, c8.ja.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.ja.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(activity);
        this.G = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        linearLayout.addView((View) imageView, c8.ja.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final q40 f37053b;

            {
                this.f37053b = this;
            }

            @Override
            public final void onClick(View view) {
                zi.u0 u0Var;
                zi.m0 m0Var;
                boolean z10;
                zi.u0 u0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        q40 q40Var = this.f37053b;
                        zi.v0 v0Var = q40Var.P;
                        if (v0Var != null && (u0Var = q40Var.R) != null && (m0Var = q40Var.S) != null && u0Var.f61738a == 3 && !u0Var.f61742f && !q40Var.f38503p0) {
                            zi.n0 n0Var = m0Var.f61631a;
                            zi.n0 n0Var2 = zi.n0.f61636a;
                            if (n0Var == n0Var2) {
                                n0Var2 = zi.n0.f61637b;
                            }
                            v0Var.getClass();
                            zi.v0.v();
                            int i11 = v0Var.f61745a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (v0Var.f61761r != n0Var2) {
                                    v0Var.f61756m.b("camera facing requested: " + v0Var.f61761r + " -> " + n0Var2 + ", state=" + zi.p0.b(v0Var.f61745a0));
                                    v0Var.f61761r = n0Var2;
                                    int i12 = v0Var.f61745a0;
                                    if (i12 == 3 || i12 == 2) {
                                        v0Var.e();
                                        zi.l lVar = v0Var.f61755l;
                                        lVar.E = n0Var2;
                                        Handler handler = lVar.f61589n;
                                        if (lVar.U && handler != null) {
                                            handler.post(new ug.t1(29, lVar, n0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        v0Var.f61767y = z10;
                                    }
                                    v0Var.n();
                                    v0Var.o();
                                }
                                q40Var.f38491e0.M(0);
                                q40Var.f38491e0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        q40 q40Var2 = this.f37053b;
                        zi.v0 v0Var2 = q40Var2.P;
                        if (v0Var2 != null && (u0Var2 = q40Var2.R) != null && q40Var2.S != null) {
                            boolean z11 = !u0Var2.f61743g;
                            zi.l lVar2 = v0Var2.f61755l;
                            zi.v0.v();
                            if (v0Var2.f61745a0 == 3 && !v0Var2.f61767y && (i10 = v0Var2.f61747b0) != 1) {
                                v0Var2.f61765w = z11;
                                if (i10 == 3) {
                                    v0Var2.w(z11);
                                    lVar2.S(false);
                                } else {
                                    v0Var2.w(false);
                                    lVar2.S(z11);
                                }
                                v0Var2.o();
                                q40Var2.E();
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
        linearLayout.addView((View) imageView2, c8.ja.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final q40 f37053b;

            {
                this.f37053b = this;
            }

            @Override
            public final void onClick(View view) {
                zi.u0 u0Var;
                zi.m0 m0Var;
                boolean z10;
                zi.u0 u0Var2;
                int i10;
                switch (r2) {
                    case 0:
                        q40 q40Var = this.f37053b;
                        zi.v0 v0Var = q40Var.P;
                        if (v0Var != null && (u0Var = q40Var.R) != null && (m0Var = q40Var.S) != null && u0Var.f61738a == 3 && !u0Var.f61742f && !q40Var.f38503p0) {
                            zi.n0 n0Var = m0Var.f61631a;
                            zi.n0 n0Var2 = zi.n0.f61636a;
                            if (n0Var == n0Var2) {
                                n0Var2 = zi.n0.f61637b;
                            }
                            v0Var.getClass();
                            zi.v0.v();
                            int i11 = v0Var.f61745a0;
                            if (i11 != 7 && i11 != 8 && i11 != 9 && i11 != 10) {
                                if (v0Var.f61761r != n0Var2) {
                                    v0Var.f61756m.b("camera facing requested: " + v0Var.f61761r + " -> " + n0Var2 + ", state=" + zi.p0.b(v0Var.f61745a0));
                                    v0Var.f61761r = n0Var2;
                                    int i12 = v0Var.f61745a0;
                                    if (i12 == 3 || i12 == 2) {
                                        v0Var.e();
                                        zi.l lVar = v0Var.f61755l;
                                        lVar.E = n0Var2;
                                        Handler handler = lVar.f61589n;
                                        if (lVar.U && handler != null) {
                                            handler.post(new ug.t1(29, lVar, n0Var2));
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        v0Var.f61767y = z10;
                                    }
                                    v0Var.n();
                                    v0Var.o();
                                }
                                q40Var.f38491e0.M(0);
                                q40Var.f38491e0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        q40 q40Var2 = this.f37053b;
                        zi.v0 v0Var2 = q40Var2.P;
                        if (v0Var2 != null && (u0Var2 = q40Var2.R) != null && q40Var2.S != null) {
                            boolean z11 = !u0Var2.f61743g;
                            zi.l lVar2 = v0Var2.f61755l;
                            zi.v0.v();
                            if (v0Var2.f61745a0 == 3 && !v0Var2.f61767y && (i10 = v0Var2.f61747b0) != 1) {
                                v0Var2.f61765w = z11;
                                if (i10 == 3) {
                                    v0Var2.w(z11);
                                    lVar2.S(false);
                                } else {
                                    v0Var2.w(false);
                                    lVar2.S(z11);
                                }
                                v0Var2.o();
                                q40Var2.E();
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
        ch0 ch0Var = new ch0(2131624188, L, L);
        this.f38491e0 = ch0Var;
        ch0Var.setCallback(imageView);
        ch0Var.M(ch0Var.f33579e[0] - 1);
        imageView.setImageDrawable(ch0Var);
        E();
        if (e6Var != null && !e6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(activity);
        this.I = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232796);
        imageView3.setAlpha(0.0f);
        addView(imageView3, c8.ja.e(48, 48, 17));
        n40Var.setOnTouchListener(new hk(this, 2));
        super.setVisibility(4);
    }

    public long getCameraFlipElapsedMs() {
        if (this.f38509t0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.f38509t0);
    }

    private long getCurrentDurationMs() {
        zi.u0 u0Var;
        zi.v0 v0Var = this.P;
        if (v0Var != null && (u0Var = this.R) != null) {
            if (u0Var.f61738a == 3) {
                return v0Var.j();
            }
            return u0Var.f61739b;
        }
        return 0L;
    }

    public static void n(q40 q40Var) {
        if (q40Var.f38503p0 && q40Var.f38508s0 && q40Var.f38504q0 && q40Var.f38506r0) {
            q40Var.f38503p0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + q40Var.getCameraFlipElapsedMs());
            q40Var.D();
        }
    }

    public static void o(q40 q40Var) {
        org.telegram.ui.pk pkVar = q40Var.E;
        if (!q40Var.f38501n0) {
            return;
        }
        q40Var.f38501n0 = false;
        pkVar.invalidate();
        pkVar.animate().cancel();
        pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.qj qjVar;
        if (z10 != this.I0) {
            this.I0 = z10;
            this.H0 = 0L;
            l40 l40Var = this.K0;
            if (z10) {
                bg.k.d().a(30, l40Var);
            } else {
                bg.k.d().f(l40Var);
            }
            if (this.d != z10) {
                this.d = z10;
                u40 u40Var = this.f41257c;
                if (u40Var != null && (qjVar = ((org.telegram.ui.wi) u40Var).f52917a.f45117a0) != null) {
                    qjVar.setRoundVideoUiFrameClockActive(z10);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.f38490e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        hi.n2 n2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.F0)) {
                this.F0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            n2Var.c(null);
        } else {
            if (!Float.isNaN(this.F0)) {
                attributes.screenBrightness = this.F0;
                this.F0 = Float.NaN;
            }
            n2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A(boolean z10) {
        Bitmap bitmap;
        n40 n40Var = this.f38516y;
        if (n40Var.isAvailable() && (bitmap = n40Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = r(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.f38511v0;
                    this.f38511v0 = bitmap;
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
                    if (bitmap != this.f38511v0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.f38511v0) {
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
        s40 s40Var = this.f41255a;
        if (s40Var != null) {
            ((org.telegram.ui.ce) s40Var).f46073b.f45159cd.a(z10, true);
        }
        AnimatorSet animatorSet = this.f38487b0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f38487b0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        o40 o40Var = this.f38507s;
        if (z10 && !this.m0) {
            o40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.f38517y0 = measuredHeight;
            o40Var.setTranslationY(measuredHeight + this.f38515x0);
        }
        this.m0 = z10;
        View view = this.f38505r;
        if (view != null) {
            view.invalidate();
        }
        if (!z10 && Math.max(getCurrentDurationMs(), this.f38513w0) > 300) {
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
        ofFloat.addUpdateListener(new k40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38487b0 = animatorSet2;
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o40Var, property, f14);
        float f17 = 0.1f;
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o40Var, View.SCALE_X, f15);
        if (z10) {
            f17 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o40Var, View.SCALE_Y, f17);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(o40Var, View.TRANSLATION_X, f10);
        if (this.f38498k0 && z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.I, property, f16), ofFloat);
        this.f38487b0.setDuration(180L);
        this.f38487b0.setInterpolator(new DecelerateInterpolator());
        if (!z10) {
            this.f38487b0.addListener(new x5(this, 29));
        } else {
            setTranslationX(0.0f);
        }
        this.f38487b0.start();
    }

    public final void C() {
        if (!this.E0) {
            return;
        }
        this.E0 = false;
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25523k1, 512);
    }

    public final void D() {
        boolean z10;
        zi.m0 m0Var;
        zi.u0 u0Var = this.R;
        boolean z11 = false;
        if (u0Var != null && u0Var.f61738a == 3 && !u0Var.f61742f && !this.f38503p0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G.setEnabled(z10);
        if (z10 && (m0Var = this.S) != null && m0Var.f61632b != 1) {
            z11 = true;
        }
        this.H.setEnabled(z11);
        E();
    }

    public final void E() {
        zi.u0 u0Var = this.R;
        int i7 = this.O;
        hi.l2 l2Var = this.H;
        if (u0Var != null && u0Var.f61743g) {
            if (this.f38494g0 == null) {
                ch0 ch0Var = new ch0(2131624186, i7, i7);
                this.f38494g0 = ch0Var;
                ch0Var.setCallback(l2Var);
            }
            l2Var.setImageDrawable(this.f38494g0);
            return;
        }
        if (this.f38493f0 == null) {
            ch0 ch0Var2 = new ch0(2131624187, i7, i7);
            this.f38493f0 = ch0Var2;
            ch0Var2.setCallback(l2Var);
        }
        l2Var.setImageDrawable(this.f38493f0);
    }

    public final void F() {
        org.telegram.ui.qj qjVar;
        zi.u0 u0Var = this.R;
        if (u0Var != null) {
            long j3 = u0Var.d;
            if (u0Var.f61738a == 3) {
                long min = Math.min(j3, (SystemClock.elapsedRealtime() + u0Var.f61739b) - u0Var.f61740c);
                this.f38513w0 = min;
                this.f38512w.setProgress(((float) min) / ((float) j3));
                u40 u40Var = this.f41257c;
                if (u40Var != null && (qjVar = ((org.telegram.ui.wi) u40Var).f52917a.f45117a0) != null && qjVar.R1) {
                    qjVar.Q1 = min;
                    lg lgVar = qjVar.Z0;
                    if (lgVar != null && lgVar.f36785r) {
                        lgVar.h = min;
                        lgVar.invalidate();
                    }
                    ig igVar = qjVar.T1;
                    if (igVar != null && igVar.f35610f) {
                        if (!igVar.f35609e) {
                            long j10 = igVar.h;
                            if (j10 >= 0) {
                                if (!igVar.f35608c) {
                                    igVar.f35606a = ig.b(Math.max(0L, min - j10));
                                }
                                igVar.invalidate();
                            }
                        }
                        igVar.h = min;
                        igVar.f35606a = 1.0f;
                        igVar.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = qjVar.S1;
                    if (slideTextView != null && slideTextView.H && slideTextView.f32359n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void a(boolean z10) {
        zi.v0 v0Var;
        int i7;
        if (!x() && (v0Var = this.P) != null && v0Var.a()) {
            this.V = null;
            if (z10) {
                i7 = 0;
            } else {
                i7 = 6;
            }
            z(i7);
            jy0 jy0Var = this.T;
            if (jy0Var != null) {
                jy0Var.d(true);
            }
            this.T = null;
            MediaController.B().Y(false);
            B(false, false);
        }
    }

    @Override
    public final void b(float f10, int i7) {
        zi.u0 u0Var;
        if (this.P != null && (u0Var = this.R) != null && u0Var.f61738a == 5) {
            q();
            if (i7 == 0) {
                this.P.r();
            } else if (i7 == 1) {
                this.P.p();
            } else if (i7 == 2) {
                zi.v0 v0Var = this.P;
                long j3 = f10 * ((float) this.R.f61739b);
                v0Var.getClass();
                zi.v0.v();
                if (v0Var.f61745a0 == 5 && v0Var.W != null) {
                    long j10 = v0Var.K;
                    v0Var.W.Z0(5, Math.max(j10, Math.min(Math.max(j10, v0Var.L - 1), j3)));
                    v0Var.d.getClass();
                }
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        s();
        ValueAnimator valueAnimator = this.f38488c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.P != null && x()) {
            this.f38486a0 = true;
            this.P.s();
        } else {
            zi.v0 v0Var = this.P;
            if (v0Var != null) {
                v0Var.s();
                this.P = null;
            }
        }
        jy0 jy0Var = this.T;
        if (jy0Var != null && !this.f38486a0) {
            jy0Var.d(true ^ this.f38499l0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        C();
    }

    @Override
    public final void d(boolean z10) {
        c(true);
        o40 o40Var = this.f38507s;
        o40Var.setTranslationX(0.0f);
        this.f38517y0 = 0.0f;
        o40Var.setTranslationY(0.0f + this.f38515x0);
        o40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override
    public final boolean f() {
        zi.u0 u0Var = this.R;
        if (u0Var != null) {
            int i7 = u0Var.f61738a;
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
        this.f38515x0 = f11;
        this.f38507s.setTranslationY(this.f38517y0 + f11);
    }

    @Override
    public View getButtonsLayout() {
        return this.F;
    }

    @Override
    public t40 getCameraContainer() {
        return this.f38507s;
    }

    @Override
    public RectF getCameraRect() {
        n40 n40Var = this.f38516y;
        int[] iArr = this.K;
        n40Var.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new RectF(i7, iArr[1], n40Var.getWidth() + i7, n40Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.I;
    }

    @Override
    public Paint getPaint() {
        return this.f38512w.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.f38516y;
    }

    @Override
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        if (this.P != null && this.R != null) {
            if (i7 == 3) {
                y();
            } else if ((i7 == 1 || i7 == 4) && this.V == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    org.telegram.messenger.ns.f(this.f38492f).k(org.telegram.messenger.ns.f25576t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    a(false);
                    return;
                }
                if (this.R.f61738a == 3) {
                    z(5);
                }
                this.f38496i0 = false;
                this.V = new p40(i10, i11, j3, j10, z10);
                u();
            }
        }
    }

    @Override
    public final void i(dh.c cVar, org.telegram.ui.oi oiVar) {
        View view = this.F;
        fh.g c10 = cVar.c(view, oiVar, false);
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
        this.f38512w.getPaint().setAlpha(255);
        this.f38499l0 = false;
        this.f38498k0 = false;
        this.V = null;
        this.W = false;
        this.f38495h0 = false;
        this.f38497j0 = false;
        this.f38513w0 = 0L;
        this.f38512w.setProgress(0.0f);
        org.telegram.ui.pk pkVar = this.E;
        if (!this.f38501n0) {
            if (this.f38511v0 == null) {
                try {
                    this.f38511v0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.f38511v0;
            if (bitmap != null) {
                pkVar.setImageBitmap(bitmap);
            } else {
                pkVar.setImageResource(2131231492);
            }
            this.f38501n0 = true;
            pkVar.animate().cancel();
            pkVar.setAlpha(1.0f);
            pkVar.invalidate();
        }
        this.T = new jy0(this.f38492f, this.f38500n);
        this.Q = (zi.t0) aj.e.f1660e.a();
        zi.l0 l0Var = new zi.l0(getContext(), this.f38516y);
        l0Var.f61621c = new File(org.telegram.messenger.t0.h(), "cache");
        l0Var.d = (zi.n0) aj.e.f1664j.a();
        l0Var.f61622e = this.Q;
        l0Var.h = aj.e.h.a();
        l0Var.f61623f = (zi.o0) aj.e.f1661f.a();
        l0Var.f61624g = (zi.q0) aj.e.f1662g.a();
        aj.a aVar = aj.e.f1663i;
        aVar.a();
        l0Var.f61625i = aVar.d;
        ff ffVar = this.L0;
        l0Var.f61626j = ffVar;
        jy0 jy0Var = this.T;
        l0Var.f61627k = jy0Var;
        l0Var.f61628l = new gx(this, 5);
        if (l0Var.d != null) {
            if (l0Var.f61622e != null) {
                if (l0Var.h > 0) {
                    if (l0Var.f61623f != null) {
                        if (l0Var.f61624g != null) {
                            if (ffVar != null) {
                                if (jy0Var != null) {
                                    this.P = new zi.v0(l0Var);
                                    MediaController.B().Y(true);
                                    zi.v0 v0Var = this.P;
                                    v0Var.getClass();
                                    zi.v0.v();
                                    if (v0Var.f61745a0 == 1) {
                                        try {
                                            v0Var.f61756m.b("start requested");
                                            v0Var.c(true);
                                            v0Var.x(2);
                                            v0Var.f61755l.V(v0Var.U, 0L, v0Var.f61761r);
                                        } catch (Exception e10) {
                                            v0Var.h(e10);
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
        zi.u0 u0Var;
        zi.v0 v0Var = this.P;
        if (v0Var != null && (u0Var = this.R) != null) {
            int i7 = u0Var.f61738a;
            if (i7 == 3) {
                y();
            } else if (i7 == 5) {
                zi.v0.v();
                if (v0Var.f61745a0 == 5 && v0Var.L - v0Var.K < v0Var.f61760q) {
                    v0Var.Q++;
                    v0Var.D = false;
                    v0Var.f61756m.b("resume requested: trim=" + v0Var.K + ".." + v0Var.L + ", sourceDurationMs=" + v0Var.I);
                    v0Var.t();
                    v0Var.x(6);
                    v0Var.f61753j.execute(new ai.j(v0Var, v0Var.l(), v0Var.U, v0Var.T, v0Var.V, 17));
                    this.U = null;
                    this.f38496i0 = true;
                    this.f38497j0 = false;
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
            i11 = org.telegram.messenger.g0.f23615u;
        }
        if (this.G0 != i11) {
            this.G0 = i11;
            o40 o40Var = this.f38507s;
            o40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            o40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        hi.n2 n2Var = this.J;
        n2Var.f14740b.measure(makeMeasureSpec, makeMeasureSpec2);
        n2Var.f14741c.measure(makeMeasureSpec, makeMeasureSpec2);
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
        zi.v0 v0Var;
        zi.u0 u0Var;
        super.onWindowVisibilityChanged(i7);
        if (i7 != 0 && (v0Var = this.P) != null && (u0Var = this.R) != null) {
            if (u0Var.f61738a == 3) {
                y();
            } else if (u0Var.f61741e) {
                v0Var.p();
            }
        }
    }

    public final void q() {
        zi.u0 u0Var;
        org.telegram.messenger.g20 g20Var;
        if (this.P != null && (u0Var = this.R) != null && (g20Var = this.U) != null) {
            long j3 = u0Var.f61739b;
            long max = Math.max(0L, g20Var.f23634a);
            long j10 = this.U.f23636b;
            if (j10 >= 0) {
                j3 = Math.min(j3, j10);
            }
            zi.v0 v0Var = this.P;
            v0Var.getClass();
            zi.v0.v();
            if (v0Var.f61745a0 == 5) {
                long max2 = Math.max(0L, Math.min(v0Var.I, max));
                long max3 = Math.max(max2, Math.min(v0Var.I, j3));
                if (max3 - max2 >= Math.min(800L, v0Var.I)) {
                    v0Var.K = max2;
                    v0Var.L = max3;
                    l2.f0 f0Var = v0Var.W;
                    if (f0Var != null) {
                        f0Var.Z0(5, max2);
                    }
                    v0Var.d.getClass();
                    v0Var.o();
                }
            }
        }
    }

    public final Bitmap r(Bitmap bitmap) {
        n40 n40Var = this.f38516y;
        if (n40Var.getWidth() > 0 && n40Var.getHeight() > 0) {
            Matrix matrix = this.L;
            n40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / n40Var.getWidth();
                float height = bitmap.getHeight() / n40Var.getHeight();
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
        if (!this.f38503p0 && this.f38489d0 == null) {
            return;
        }
        this.f38510u0++;
        ValueAnimator valueAnimator = this.f38489d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f38489d0.cancel();
            this.f38489d0 = null;
        }
        FrameLayout frameLayout = this.f38514x;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.f38503p0 = false;
        this.f38504q0 = false;
        this.f38506r0 = false;
        this.f38508s0 = false;
        w(false);
    }

    @Override
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
        this.f38507s.getClass();
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.F.setAlpha(0.0f);
        o40 o40Var = this.f38507s;
        o40Var.setAlpha(0.0f);
        o40Var.setScaleX(0.1f);
        o40Var.setScaleY(0.1f);
        o40Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.f38512w.getPaint().setAlpha(0);
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

    public final org.telegram.messenger.g20 t(File file, long j3, iy0 iy0Var) {
        long j10;
        int i7;
        int i10;
        zi.q0 q0Var;
        org.telegram.messenger.g20 g20Var = new org.telegram.messenger.g20();
        g20Var.f23634a = -1L;
        g20Var.f23636b = -1L;
        g20Var.f23651r = j3;
        if (iy0Var == null) {
            j10 = file.length();
        } else {
            j10 = iy0Var.f35764a;
        }
        g20Var.f23650q = Math.max(1L, j10);
        g20Var.f23652s = true;
        zi.v0 v0Var = this.P;
        if (v0Var != null && (q0Var = v0Var.f61764u) != null) {
            i7 = q0Var.f61676a;
        } else {
            i7 = 30;
        }
        g20Var.f23647n = i7;
        zi.t0 t0Var = this.Q;
        if (t0Var == null) {
            i10 = 480;
        } else {
            i10 = t0Var.f61690a;
        }
        g20Var.h = i10;
        g20Var.f23644k = i10;
        g20Var.f23642i = i10;
        g20Var.f23645l = i10;
        g20Var.f23648o = file.getAbsolutePath();
        if (iy0Var != null) {
            g20Var.f23655w = iy0Var.f35765b;
            g20Var.f23656x = iy0Var.f35766c;
            g20Var.f23657y = iy0Var.d;
            g20Var.f23658z = iy0Var.f35767e;
        }
        return g20Var;
    }

    public final void u() {
        zi.u0 u0Var;
        boolean z10;
        int i7;
        if (this.V != null && !this.W && this.P != null && (u0Var = this.R) != null) {
            int i10 = u0Var.f61738a;
            if (i10 == 5) {
                q();
            } else if (i10 != 3) {
                return;
            }
            zi.v0 v0Var = this.P;
            boolean z11 = this.f38498k0;
            boolean z12 = !z11;
            v0Var.getClass();
            zi.v0.v();
            int i11 = v0Var.f61745a0;
            boolean z13 = false;
            if (i11 == 3 || i11 == 5) {
                v0Var.f61756m.b("finish requested: state=" + zi.p0.b(v0Var.f61745a0) + ", includeAudio=" + z12 + ", durationMs=" + v0Var.j() + ", trim=" + v0Var.K + ".." + v0Var.L);
                v0Var.B = z12;
                if (v0Var.f61745a0 == 3) {
                    v0Var.I = v0Var.j();
                    v0Var.A = true;
                    v0Var.e();
                    v0Var.f61752i.removeCallbacks(v0Var.X);
                    v0Var.x(7);
                    boolean W = v0Var.f61755l.W();
                    v0Var.E = W;
                    if (!W) {
                        v0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    v0Var.t();
                    v0Var.x(7);
                    if (!v0Var.l() && !z11) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (v0Var.l()) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                    v0Var.f61753j.execute(new di.ea(v0Var, v0Var.U, z10, v0Var.V, z12, i7, v0Var.T));
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
            ValueAnimator valueAnimator = this.f38488c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A0, 0.0f);
            this.f38488c0 = ofFloat;
            ofFloat.setDuration(350L);
            this.f38488c0.addUpdateListener(new k40(this, 1));
            this.f38488c0.start();
        }
    }

    public final void w(boolean z10) {
        if (!this.f38502o0) {
            return;
        }
        this.f38502o0 = false;
        org.telegram.ui.pk pkVar = this.E;
        pkVar.animate().cancel();
        if (z10) {
            pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            pkVar.setAlpha(0.0f);
        }
    }

    public final boolean x() {
        zi.v0 v0Var;
        if (this.V != null && this.W && (v0Var = this.P) != null) {
            zi.v0.v();
            if (v0Var.f61745a0 == 7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void y() {
        zi.u0 u0Var;
        if (this.P != null && (u0Var = this.R) != null && u0Var.f61738a == 3) {
            z(2);
            this.P.q();
        }
    }

    public final void z(int i7) {
        if (this.f38497j0 && i7 == 2) {
            return;
        }
        this.f38497j0 = true;
        org.telegram.messenger.ns.f(this.f38492f).k(org.telegram.messenger.ns.f25539n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }
}
