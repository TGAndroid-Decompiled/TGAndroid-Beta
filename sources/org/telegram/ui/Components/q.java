package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
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
import org.telegram.ui.Components.q;
public final class q extends zq5 {
    public static final int N0 = 0;
    public float A0;
    public float B0;
    public int C0;
    public int D0;
    public final rq5 E;
    public boolean E0;
    public final nt1 F;
    public boolean F0;
    public final LinearLayout G;
    public float G0;
    public final pk4 H;
    public int H0;
    public final pk4 I;
    public long I0;
    public final ImageView J;
    public boolean J0;
    public final rk4 K;
    public boolean K0;
    public final int[] L;
    public final pq5 L0;
    public final Matrix M;
    public final lj4 M0;
    public final float[] N;
    public final Paint O;
    public final int P;
    public un9 Q;
    public sn9 R;
    public tn9 S;
    public mn9 T;
    public mib U;
    public rcc V;
    public tq5 W;
    public boolean a0;
    public boolean b0;
    public AnimatorSet c0;
    public ValueAnimator d0;
    public ValueAnimator e0;
    public final vq5 f;
    public final p09 f0;
    public p09 g0;
    public final int h;
    public p09 h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final int n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final boolean r;
    public boolean r0;
    public final View s;
    public boolean s0;
    public boolean t0;
    public long u0;
    public int v0;
    public final sq5 w;
    public Bitmap w0;
    public final xm9 x;
    public long x0;
    public final FrameLayout y;
    public float y0;
    public float z0;

    public q(Context context, vq5 vq5Var, ylb ylbVar, boolean z) {
        super(context);
        float f;
        this.h = z8c.t0;
        this.L = new int[2];
        this.M = new Matrix();
        this.N = new float[9];
        this.O = new Paint(3);
        this.C0 = -1;
        this.D0 = -1;
        this.G0 = Float.NaN;
        this.L0 = new pq5(this, (byte) 0);
        this.M0 = new lj4(this);
        this.f = vq5Var;
        this.n = vq5Var.getClassGuid();
        this.r = vq5Var.x();
        this.s = vq5Var.getFragmentView();
        setWillNotDraw(false);
        rk4 rk4Var = new rk4(context, null, this, null);
        this.K = rk4Var;
        rk4Var.o = 0.5f;
        rk4Var.n = rk4.f(0.5f);
        rk4Var.g();
        addView(rk4Var.b, qoe.e(-1, -1, 119));
        sq5 sq5Var = new sq5(this, context);
        this.w = sq5Var;
        xm9 xm9Var = new xm9(context);
        this.x = xm9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        rq5 rq5Var = new rq5((byte) 0, context, this);
        rq5Var.setOpaque(true);
        rq5Var.setClickable(true);
        rq5Var.setCameraDistance(gm.L(8000.0f));
        rq5Var.setOutlineProvider(new xj((byte) 6));
        rq5Var.setClipToOutline(true);
        this.E = rq5Var;
        frameLayout.addView(rq5Var, qoe.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(671088640);
        nt1 nt1Var = new nt1(this, context, paint);
        this.F = nt1Var;
        nt1Var.setOutlineProvider(new xj((byte) 5));
        nt1Var.setClipToOutline(true);
        frameLayout.addView(nt1Var, qoe.e(-1, -1, 119));
        xm9Var.addView(frameLayout, qoe.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        sq5Var.addView(xm9Var, qoe.e(-1, -1, 119));
        int i = gm.v;
        addView(sq5Var, new FrameLayout.LayoutParams(i, i, 17));
        addView(rk4Var.c, qoe.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.G = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(gm.L(6.0f), gm.L(6.0f), gm.L(6.0f), gm.L(6.0f));
        addView(linearLayout, qoe.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.H = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(jb6.M0(2131754751, null));
        linearLayout.addView((View) imageView, qoe.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final q b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                tn9 tn9Var;
                mn9 mn9Var;
                tn9 tn9Var2;
                int i2;
                byte b = r2;
                boolean z2 = true;
                q qVar = this.b;
                switch (b) {
                    case 0:
                        un9 un9Var = qVar.Q;
                        if (un9Var != null && (tn9Var = qVar.S) != null && (mn9Var = qVar.T) != null && tn9Var.a == 3 && !tn9Var.f && !qVar.q0) {
                            nn9 nn9Var = mn9Var.a;
                            nn9 nn9Var2 = nn9.a;
                            if (nn9Var == nn9Var2) {
                                nn9Var2 = nn9.b;
                            }
                            un9Var.getClass();
                            un9.v();
                            int i3 = un9Var.a0;
                            if (i3 != 7 && i3 != 8 && i3 != 9 && i3 != 10) {
                                if (un9Var.r != nn9Var2) {
                                    un9Var.m.b("camera facing requested: " + un9Var.r + " -> " + nn9Var2 + ", state=" + hg9.A(un9Var.a0));
                                    un9Var.r = nn9Var2;
                                    int i4 = un9Var.a0;
                                    if (i4 == 3 || i4 == 2) {
                                        un9Var.e();
                                        bm9 bm9Var = un9Var.l;
                                        bm9Var.E = nn9Var2;
                                        Handler handler = bm9Var.n;
                                        if (bm9Var.U && handler != null) {
                                            handler.post(new il9(bm9Var, nn9Var2, (byte) 2));
                                        } else {
                                            z2 = false;
                                        }
                                        un9Var.y = z2;
                                    }
                                    un9Var.n();
                                    un9Var.o();
                                }
                                qVar.f0.H(0);
                                qVar.f0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        un9 un9Var2 = qVar.Q;
                        if (un9Var2 != null && (tn9Var2 = qVar.S) != null && qVar.T != null) {
                            boolean z3 = !tn9Var2.g;
                            bm9 bm9Var2 = un9Var2.l;
                            un9.v();
                            if (un9Var2.a0 == 3 && !un9Var2.y && (i2 = un9Var2.b0) != 1) {
                                un9Var2.w = z3;
                                if (i2 == 3) {
                                    un9Var2.w(z3);
                                    bm9Var2.S(false);
                                } else {
                                    un9Var2.w(false);
                                    bm9Var2.S(z3);
                                }
                                un9Var2.o();
                                qVar.A();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.I = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, qoe.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final q b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                tn9 tn9Var;
                mn9 mn9Var;
                tn9 tn9Var2;
                int i2;
                byte b = r2;
                boolean z2 = true;
                q qVar = this.b;
                switch (b) {
                    case 0:
                        un9 un9Var = qVar.Q;
                        if (un9Var != null && (tn9Var = qVar.S) != null && (mn9Var = qVar.T) != null && tn9Var.a == 3 && !tn9Var.f && !qVar.q0) {
                            nn9 nn9Var = mn9Var.a;
                            nn9 nn9Var2 = nn9.a;
                            if (nn9Var == nn9Var2) {
                                nn9Var2 = nn9.b;
                            }
                            un9Var.getClass();
                            un9.v();
                            int i3 = un9Var.a0;
                            if (i3 != 7 && i3 != 8 && i3 != 9 && i3 != 10) {
                                if (un9Var.r != nn9Var2) {
                                    un9Var.m.b("camera facing requested: " + un9Var.r + " -> " + nn9Var2 + ", state=" + hg9.A(un9Var.a0));
                                    un9Var.r = nn9Var2;
                                    int i4 = un9Var.a0;
                                    if (i4 == 3 || i4 == 2) {
                                        un9Var.e();
                                        bm9 bm9Var = un9Var.l;
                                        bm9Var.E = nn9Var2;
                                        Handler handler = bm9Var.n;
                                        if (bm9Var.U && handler != null) {
                                            handler.post(new il9(bm9Var, nn9Var2, (byte) 2));
                                        } else {
                                            z2 = false;
                                        }
                                        un9Var.y = z2;
                                    }
                                    un9Var.n();
                                    un9Var.o();
                                }
                                qVar.f0.H(0);
                                qVar.f0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        un9 un9Var2 = qVar.Q;
                        if (un9Var2 != null && (tn9Var2 = qVar.S) != null && qVar.T != null) {
                            boolean z3 = !tn9Var2.g;
                            bm9 bm9Var2 = un9Var2.l;
                            un9.v();
                            if (un9Var2.a0 == 3 && !un9Var2.y && (i2 = un9Var2.b0) != 1) {
                                un9Var2.w = z3;
                                if (i2 == 3) {
                                    un9Var2.w(z3);
                                    bm9Var2.S(false);
                                } else {
                                    un9Var2.w(false);
                                    bm9Var2.S(z3);
                                }
                                un9Var2.o();
                                qVar.A();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        if (z) {
            f = 24.0f;
        } else {
            f = 28.0f;
        }
        int L = gm.L(f);
        this.P = L;
        p09 p09Var = new p09(2131624182, L, L);
        this.f0 = p09Var;
        p09Var.setCallback(imageView);
        p09Var.H(p09Var.e[0] - 1);
        imageView.setImageDrawable(p09Var);
        A();
        if (!z) {
            rk4Var.a(imageView);
            rk4Var.a(imageView2);
        } else if (ylbVar != null && !ylbVar.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232813);
        imageView3.setAlpha(0.0f);
        addView(imageView3, qoe.e(48, 48, 17));
        rq5Var.setOnTouchListener(new a7(this, (byte) 6));
        super.setVisibility(4);
    }

    public static long b(q qVar) {
        return qVar.getCameraFlipElapsedMs();
    }

    public long getCameraFlipElapsedMs() {
        if (this.u0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.u0);
    }

    private long getCurrentDurationMs() {
        tn9 tn9Var;
        un9 un9Var = this.Q;
        if (un9Var != null && (tn9Var = this.S) != null) {
            if (tn9Var.a == 3) {
                return un9Var.j();
            }
            return tn9Var.b;
        }
        return 0L;
    }

    public void setRecordingUiFrameClockActive(boolean z) {
        ms1 ms1Var;
        if (z != this.J0) {
            this.J0 = z;
            this.I0 = 0L;
            pq5 pq5Var = this.L0;
            if (z) {
                fi2.d().a(30, pq5Var);
            } else {
                fi2.d().g(pq5Var);
            }
            if (this.d != z) {
                this.d = z;
                xq5 xq5Var = this.c;
                if (xq5Var != null && (ms1Var = ((yv1) ((ni6) xq5Var).b).a0) != null) {
                    ms1Var.setRoundVideoUiFrameClockActive(z);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z) {
        Activity parentActivity = this.f.getParentActivity();
        if (parentActivity == null) {
            parentActivity = gm.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        float f = this.G0;
        rk4 rk4Var = this.K;
        if (z) {
            if (Float.isNaN(f)) {
                this.G0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            rk4Var.c(null);
        } else {
            if (!Float.isNaN(f)) {
                attributes.screenBrightness = this.G0;
                this.G0 = Float.NaN;
            }
            rk4Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        tn9 tn9Var = this.S;
        int i = this.P;
        pk4 pk4Var = this.I;
        if (tn9Var != null && tn9Var.g) {
            if (this.h0 == null) {
                p09 p09Var = new p09(2131624180, i, i);
                this.h0 = p09Var;
                p09Var.setCallback(pk4Var);
            }
            pk4Var.setImageDrawable(this.h0);
            return;
        }
        if (this.g0 == null) {
            p09 p09Var2 = new p09(2131624181, i, i);
            this.g0 = p09Var2;
            p09Var2.setCallback(pk4Var);
        }
        pk4Var.setImageDrawable(this.g0);
    }

    public final void B() {
        ms1 ms1Var;
        tn9 tn9Var = this.S;
        if (tn9Var != null) {
            long j = tn9Var.d;
            if (tn9Var.a == 3) {
                long min = Math.min(j, (SystemClock.elapsedRealtime() + tn9Var.b) - tn9Var.c);
                this.x0 = min;
                this.x.setProgress(((float) min) / ((float) j));
                xq5 xq5Var = this.c;
                if (xq5Var != null && (ms1Var = ((yv1) ((ni6) xq5Var).b).a0) != null && ms1Var.Z1) {
                    ms1Var.Y1 = min;
                    zz1 zz1Var = ms1Var.Z0;
                    if (zz1Var != null && zz1Var.r) {
                        zz1Var.h = min;
                        zz1Var.invalidate();
                    }
                    wz1 wz1Var = ms1Var.b2;
                    if (wz1Var != null && wz1Var.f) {
                        if (!wz1Var.e) {
                            long j2 = wz1Var.h;
                            if (j2 >= 0) {
                                if (!wz1Var.c) {
                                    wz1Var.a = wz1.a(Math.max(0L, min - j2));
                                }
                                wz1Var.invalidate();
                            }
                        }
                        wz1Var.h = min;
                        wz1Var.a = 1.0f;
                        wz1Var.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = ms1Var.a2;
                    if (slideTextView != null && slideTextView.H && slideTextView.n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    public final void d() {
        tn9 tn9Var;
        rcc rccVar;
        if (this.Q != null && (tn9Var = this.S) != null && (rccVar = this.V) != null) {
            long j = tn9Var.b;
            long max = Math.max(0L, rccVar.a);
            long j2 = this.V.b;
            if (j2 >= 0) {
                j = Math.min(j, j2);
            }
            un9 un9Var = this.Q;
            un9Var.getClass();
            un9.v();
            if (un9Var.a0 == 5) {
                long max2 = Math.max(0L, Math.min(un9Var.I, max));
                long max3 = Math.max(max2, Math.min(un9Var.I, j));
                if (max3 - max2 >= Math.min(800L, un9Var.I)) {
                    un9Var.K = max2;
                    un9Var.L = max3;
                    h74 h74Var = un9Var.W;
                    if (h74Var != null) {
                        h74Var.k1(max2);
                    }
                    un9Var.d.getClass();
                    un9Var.o();
                }
            }
        }
    }

    public final Bitmap e(Bitmap bitmap) {
        rq5 rq5Var = this.E;
        if (rq5Var.getWidth() > 0 && rq5Var.getHeight() > 0) {
            Matrix matrix = this.M;
            rq5Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.N;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / rq5Var.getWidth();
                float height = bitmap.getHeight() / rq5Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.O);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f(boolean z) {
        un9 un9Var;
        int i;
        if (!p() && (un9Var = this.Q) != null && un9Var.a()) {
            this.W = null;
            if (z) {
                i = 0;
            } else {
                i = 6;
            }
            s(i);
            mib mibVar = this.U;
            if (mibVar != null) {
                mibVar.d(true);
            }
            this.U = null;
            MediaController.w().X(false);
            w(false);
        }
    }

    public final void g() {
        if (!this.q0 && this.e0 == null) {
            return;
        }
        this.v0++;
        ValueAnimator valueAnimator = this.e0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.e0.cancel();
            this.e0 = null;
        }
        FrameLayout frameLayout = this.y;
        frameLayout.animate().cancel();
        frameLayout.animate().setListener(null);
        frameLayout.setRotationY(0.0f);
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = false;
        n(false);
    }

    @Override
    public View getButtonsLayout() {
        return this.G;
    }

    @Override
    public wq5 getCameraContainer() {
        return this.w;
    }

    @Override
    public RectF getCameraRect() {
        rq5 rq5Var = this.E;
        int[] iArr = this.L;
        rq5Var.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], rq5Var.getWidth() + i, rq5Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.J;
    }

    @Override
    public Paint getPaint() {
        return this.x.getPaint();
    }

    @Override
    public TextureView getTextureView() {
        return this.E;
    }

    public final void h(float f, int i) {
        tn9 tn9Var;
        if (this.Q != null && (tn9Var = this.S) != null && tn9Var.a == 5) {
            d();
            if (i == 0) {
                this.Q.r();
            } else if (i == 1) {
                this.Q.p();
            } else if (i == 2) {
                un9 un9Var = this.Q;
                long j = f * ((float) this.S.b);
                un9Var.getClass();
                un9.v();
                if (un9Var.a0 == 5 && un9Var.W != null) {
                    long j2 = un9Var.K;
                    un9Var.W.k1(Math.max(j2, Math.min(Math.max(j2, un9Var.L - 1), j)));
                    un9Var.d.getClass();
                }
            }
        }
    }

    public final rcc i(File file, long j, lib libVar) {
        long j2;
        byte b;
        short s;
        pn9 pn9Var;
        rcc rccVar = new rcc();
        rccVar.a = -1L;
        rccVar.b = -1L;
        rccVar.r = j;
        if (libVar == null) {
            j2 = file.length();
        } else {
            j2 = libVar.a;
        }
        rccVar.q = Math.max(1L, j2);
        rccVar.s = true;
        un9 un9Var = this.Q;
        if (un9Var != null && (pn9Var = un9Var.u) != null) {
            b = pn9Var.a;
        } else {
            b = 30;
        }
        rccVar.n = b;
        sn9 sn9Var = this.R;
        if (sn9Var == null) {
            s = 480;
        } else {
            s = sn9Var.a;
        }
        rccVar.h = s;
        rccVar.k = s;
        rccVar.i = s;
        rccVar.l = s;
        rccVar.o = file.getAbsolutePath();
        if (libVar != null) {
            rccVar.w = libVar.b;
            rccVar.x = libVar.c;
            rccVar.y = libVar.d;
            rccVar.z = libVar.e;
        }
        return rccVar;
    }

    public final void j() {
        setRecordingUiFrameClockActive(false);
        g();
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.Q != null && p()) {
            this.b0 = true;
            this.Q.s();
        } else {
            un9 un9Var = this.Q;
            if (un9Var != null) {
                un9Var.s();
                this.Q = null;
            }
        }
        mib mibVar = this.U;
        if (mibVar != null && !this.b0) {
            mibVar.d(!this.m0);
            this.U = null;
        }
        setScreenFlashEnabled(false);
        MediaController.w().X(false);
        x();
    }

    public final void k() {
        tn9 tn9Var;
        boolean z;
        int i;
        if (this.W != null && !this.a0 && this.Q != null && (tn9Var = this.S) != null) {
            int i2 = tn9Var.a;
            if (i2 == 5) {
                d();
            } else if (i2 != 3) {
                return;
            }
            un9 un9Var = this.Q;
            boolean z2 = this.l0;
            boolean z3 = !z2;
            un9Var.getClass();
            un9.v();
            int i3 = un9Var.a0;
            boolean z4 = false;
            if (i3 == 3 || i3 == 5) {
                un9Var.m.b("finish requested: state=" + hg9.A(un9Var.a0) + ", includeAudio=" + z3 + ", durationMs=" + un9Var.j() + ", trim=" + un9Var.K + ".." + un9Var.L);
                un9Var.B = z3;
                if (un9Var.a0 == 3) {
                    un9Var.I = un9Var.j();
                    un9Var.A = true;
                    un9Var.e();
                    un9Var.i.removeCallbacks(un9Var.X);
                    un9Var.x(7);
                    boolean W = un9Var.l.W();
                    un9Var.E = W;
                    if (!W) {
                        un9Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    un9Var.t();
                    un9Var.x(7);
                    if (!un9Var.l() && !z2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (un9Var.l()) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    un9Var.j.execute(new jn9(un9Var, un9Var.U, z, un9Var.V, z3, i, un9Var.T));
                }
                z4 = true;
            }
            this.a0 = z4;
        }
    }

    public final void l() {
        if (this.E0) {
            this.E0 = false;
            this.C0 = -1;
            this.D0 = -1;
            if (this.Q == null) {
                return;
            }
            ValueAnimator valueAnimator = this.d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B0, 0.0f);
            this.d0 = ofFloat;
            ofFloat.setDuration(350L);
            this.d0.addUpdateListener(new oq5(this, (byte) 1));
            this.d0.start();
        }
    }

    public final void m() {
        j();
        sq5 sq5Var = this.w;
        sq5Var.setTranslationX(0.0f);
        this.z0 = 0.0f;
        sq5Var.setTranslationY(0.0f + this.y0);
        sq5Var.setImageReceiver(null);
        MediaController.w().b0();
    }

    public final void n(boolean z) {
        if (!this.p0) {
            return;
        }
        this.p0 = false;
        nt1 nt1Var = this.F;
        nt1Var.animate().cancel();
        if (z) {
            nt1Var.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            nt1Var.setAlpha(0.0f);
        }
    }

    public final void o() {
        if (!this.o0) {
            return;
        }
        this.o0 = false;
        nt1 nt1Var = this.F;
        nt1Var.invalidate();
        nt1Var.animate().cancel();
        nt1Var.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
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
    public final void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getSize(i2) - getPaddingBottom() > View.MeasureSpec.getSize(i) * 1.3f) {
            i3 = gm.v;
        } else {
            i3 = gm.u;
        }
        if (this.H0 != i3) {
            this.H0 = i3;
            sq5 sq5Var = this.w;
            sq5Var.getLayoutParams().width = gm.L(28.0f) + i3;
            sq5Var.getLayoutParams().height = gm.L(28.0f) + i3;
            ((FrameLayout.LayoutParams) this.J.getLayoutParams()).topMargin = (i3 / 2) - gm.L(24.0f);
        }
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        rk4 rk4Var = this.K;
        rk4Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        rk4Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onWindowVisibilityChanged(int i) {
        un9 un9Var;
        tn9 tn9Var;
        super.onWindowVisibilityChanged(i);
        if (i != 0 && (un9Var = this.Q) != null && (tn9Var = this.S) != null) {
            if (tn9Var.a == 3) {
                r();
            } else if (tn9Var.e) {
                un9Var.p();
            }
        }
    }

    public final boolean p() {
        un9 un9Var;
        if (this.W != null && this.a0 && (un9Var = this.Q) != null) {
            un9.v();
            int i = un9Var.a0;
            new tn9(i, un9Var.I, un9Var.J, un9Var.q, un9Var.z, un9Var.y, un9Var.w);
            if (i == 7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q() {
        if (this.q0 && this.t0 && this.r0 && this.s0) {
            this.q0 = false;
            fc4.b("RoundVideo camera flip completed: elapsedMs=" + getCameraFlipElapsedMs());
            z();
        }
    }

    public final void r() {
        tn9 tn9Var;
        if (this.Q != null && (tn9Var = this.S) != null && tn9Var.a == 3) {
            s(2);
            this.Q.q();
        }
    }

    public final void s(int i) {
        if (this.k0 && i == 2) {
            return;
        }
        this.k0 = true;
        nm7.f(this.h).k(nm7.n2, Integer.valueOf(this.n), Integer.valueOf(i));
    }

    @Override
    public void setInternalPadding(int i) {
        setPadding(0, 0, 0, i);
    }

    @Override
    public void setIsMessageTransition(boolean z) {
        this.w.getClass();
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.G.setAlpha(0.0f);
        sq5 sq5Var = this.w;
        sq5Var.setAlpha(0.0f);
        sq5Var.setScaleX(0.1f);
        sq5Var.setScaleY(0.1f);
        sq5Var.setTranslationX(0.0f);
        ImageView imageView = this.J;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.x.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void t(boolean z) {
        Bitmap bitmap;
        rq5 rq5Var = this.E;
        if (rq5Var.isAvailable() && (bitmap = rq5Var.getBitmap(180, 180)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = e(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.w0;
                    this.w0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.a.h(), "icthumb.jpg"));
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            fileOutputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.w0) {
                        bitmap.recycle();
                    }
                }
            } finally {
                if (bitmap != this.w0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void u(int i, int i2, int i3, long j, long j2, boolean z) {
        if (this.Q != null && this.S != null) {
            if (i == 3) {
                r();
            } else if ((i == 1 || i == 4) && this.W == null) {
                long currentDurationMs = getCurrentDurationMs();
                if (currentDurationMs < 800) {
                    nm7.f(this.h).k(nm7.t2, Integer.valueOf(this.n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    f(false);
                    return;
                }
                if (this.S.a == 3) {
                    s(5);
                }
                this.j0 = false;
                this.W = new tq5(i2, i3, j, j2, z);
                k();
            }
        }
    }

    public final void v() {
        if (this.Q != null) {
            return;
        }
        setVisibility(0);
        this.x.getPaint().setAlpha(255);
        this.m0 = false;
        this.l0 = false;
        this.W = null;
        this.a0 = false;
        this.i0 = false;
        this.k0 = false;
        this.x0 = 0L;
        this.x.setProgress(0.0f);
        nt1 nt1Var = this.F;
        if (!this.o0) {
            if (this.w0 == null) {
                try {
                    this.w0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.a.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.w0;
            if (bitmap != null) {
                nt1Var.setImageBitmap(bitmap);
            } else {
                nt1Var.setImageResource(2131231496);
            }
            this.o0 = true;
            nt1Var.animate().cancel();
            nt1Var.setAlpha(1.0f);
            nt1Var.invalidate();
        }
        this.U = new mib(this.h, this.r);
        this.R = (sn9) yed.d.a();
        ln9 ln9Var = new ln9(getContext(), this.E);
        ln9Var.c = new File(org.telegram.messenger.a.h(), "cache");
        ln9Var.d = (nn9) yed.i.a();
        ln9Var.e = this.R;
        ln9Var.h = yed.g.a();
        ln9Var.f = (on9) yed.e.a();
        ln9Var.g = (pn9) yed.f.a();
        in0 in0Var = yed.h;
        in0Var.a();
        ln9Var.i = in0Var.d;
        lj4 lj4Var = this.M0;
        ln9Var.j = lj4Var;
        mib mibVar = this.U;
        ln9Var.k = mibVar;
        ln9Var.l = new wx4(this, (byte) 14);
        if (ln9Var.d != null) {
            if (ln9Var.e != null) {
                if (ln9Var.h > 0) {
                    if (ln9Var.f != null) {
                        if (ln9Var.g != null) {
                            if (lj4Var != null) {
                                if (mibVar != null) {
                                    this.Q = new un9(ln9Var);
                                    MediaController.w().X(true);
                                    un9 un9Var = this.Q;
                                    un9Var.getClass();
                                    un9.v();
                                    if (un9Var.a0 == 1) {
                                        try {
                                            un9Var.m.b("start requested");
                                            un9Var.c(true);
                                            un9Var.x(2);
                                            un9Var.l.V(un9Var.U, 0L, un9Var.r);
                                        } catch (Exception e) {
                                            un9Var.h(e);
                                        }
                                    }
                                    w(true);
                                    return;
                                }
                                dq9.m("Output listener is required");
                                return;
                            }
                            dq9.m("Session listener is required");
                            return;
                        }
                        dq9.m("Frame rate is required");
                        return;
                    }
                    dq9.m("Camera resolution is required");
                    return;
                }
                dq9.m("Video bitrate is required");
                return;
            }
            dq9.m("Output resolution is required");
            return;
        }
        dq9.m("Initial camera is required");
    }

    public final void w(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        uq5 uq5Var = this.a;
        if (uq5Var != null) {
            ((gm1) uq5Var).b.od.a(z, true);
        }
        AnimatorSet animatorSet = this.c0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.c0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z);
        }
        sq5 sq5Var = this.w;
        if (z && !this.n0) {
            sq5Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.z0 = measuredHeight;
            sq5Var.setTranslationY(measuredHeight + this.y0);
        }
        this.n0 = z;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        if (!z && Math.max(getCurrentDurationMs(), this.x0) > 300) {
            f = gm.L(24.0f) - (getMeasuredWidth() * 0.5f);
        } else {
            f = 0.0f;
        }
        if (z) {
            f3 = 0.0f;
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
            f3 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        ofFloat.addUpdateListener(new oq5(this, (byte) 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.c0 = animatorSet2;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        float[] fArr = {f4};
        LinearLayout linearLayout = this.G;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(sq5Var, property, f5);
        float f8 = 0.1f;
        if (z) {
            f6 = 1.0f;
        } else {
            f6 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(sq5Var, View.SCALE_X, f6);
        if (z) {
            f8 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(sq5Var, View.SCALE_Y, f8);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(sq5Var, View.TRANSLATION_X, f);
        if (this.l0 && z) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.J, property, f7), ofFloat);
        this.c0.setDuration(180L);
        this.c0.setInterpolator(new DecelerateInterpolator());
        if (!z) {
            this.c0.addListener(new v85(this, (byte) 6));
        } else {
            setTranslationX(0.0f);
        }
        this.c0.start();
    }

    public final void x() {
        if (!this.F0) {
            return;
        }
        this.F0 = false;
        nm7.e().k(nm7.k1, 512);
    }

    public final void y() {
        tn9 tn9Var;
        un9 un9Var = this.Q;
        if (un9Var != null && (tn9Var = this.S) != null) {
            int i = tn9Var.a;
            if (i == 3) {
                r();
            } else if (i == 5) {
                un9.v();
                if (un9Var.a0 == 5 && un9Var.L - un9Var.K < un9Var.q) {
                    un9Var.Q++;
                    un9Var.D = false;
                    un9Var.m.b("resume requested: trim=" + un9Var.K + ".." + un9Var.L + ", sourceDurationMs=" + un9Var.I);
                    un9Var.t();
                    un9Var.x(6);
                    un9Var.j.execute(new aa7(un9Var, un9Var.l(), un9Var.U, un9Var.T, un9Var.V, (byte) 18));
                    this.V = null;
                    this.j0 = true;
                    this.k0 = false;
                }
            }
        }
    }

    public final void z() {
        boolean z;
        mn9 mn9Var;
        tn9 tn9Var = this.S;
        boolean z2 = false;
        if (tn9Var != null && tn9Var.a == 3 && !tn9Var.f && !this.q0) {
            z = true;
        } else {
            z = false;
        }
        this.H.setEnabled(z);
        if (z && (mn9Var = this.T) != null && mn9Var.b != 1) {
            z2 = true;
        }
        this.I.setEnabled(z2);
        A();
    }
}
