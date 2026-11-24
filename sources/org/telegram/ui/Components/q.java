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
public final class q extends zo5 {
    public static final int N0 = 0;
    public float A0;
    public float B0;
    public int C0;
    public int D0;
    public final ro5 E;
    public boolean E0;
    public final as1 F;
    public boolean F0;
    public final LinearLayout G;
    public float G0;
    public final ki4 H;
    public int H0;
    public final ki4 I;
    public long I0;
    public final ImageView J;
    public boolean J0;
    public final mi4 K;
    public boolean K0;
    public final int[] L;
    public final po5 L0;
    public final Matrix M;
    public final gi3 M0;
    public final float[] N;
    public final Paint O;
    public final int P;
    public ul9 Q;
    public sl9 R;
    public tl9 S;
    public ml9 T;
    public lgb U;
    public oac V;
    public to5 W;
    public boolean a0;
    public boolean b0;
    public AnimatorSet c0;
    public ValueAnimator d0;
    public ValueAnimator e0;
    public final vo5 f;
    public final oy8 f0;
    public oy8 g0;
    public final int h;
    public oy8 h0;
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
    public final so5 w;
    public Bitmap w0;
    public final wk9 x;
    public long x0;
    public final FrameLayout y;
    public float y0;
    public float z0;

    public q(Context context, vo5 vo5Var, wjb wjbVar, boolean z) {
        super(context);
        float f;
        this.h = y6c.t0;
        this.L = new int[2];
        this.M = new Matrix();
        this.N = new float[9];
        this.O = new Paint(3);
        this.C0 = -1;
        this.D0 = -1;
        this.G0 = Float.NaN;
        this.L0 = new po5(this, (byte) 0);
        this.M0 = new gi3(this);
        this.f = vo5Var;
        this.n = vo5Var.getClassGuid();
        this.r = vo5Var.y();
        this.s = vo5Var.getFragmentView();
        setWillNotDraw(false);
        mi4 mi4Var = new mi4(context, null, this, null);
        this.K = mi4Var;
        mi4Var.o = 0.5f;
        mi4Var.n = mi4.f(0.5f);
        mi4Var.g();
        addView(mi4Var.b, nme.e(-1, -1, 119));
        so5 so5Var = new so5(this, context);
        this.w = so5Var;
        wk9 wk9Var = new wk9(context);
        this.x = wk9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        ro5 ro5Var = new ro5((byte) 0, context, this);
        ro5Var.setOpaque(true);
        ro5Var.setClickable(true);
        ro5Var.setCameraDistance(gl.L(8000.0f));
        ro5Var.setOutlineProvider(new xi((byte) 6));
        ro5Var.setClipToOutline(true);
        this.E = ro5Var;
        frameLayout.addView(ro5Var, nme.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(671088640);
        as1 as1Var = new as1(this, context, paint);
        this.F = as1Var;
        as1Var.setOutlineProvider(new xi((byte) 5));
        as1Var.setClipToOutline(true);
        frameLayout.addView(as1Var, nme.e(-1, -1, 119));
        wk9Var.addView(frameLayout, nme.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        so5Var.addView(wk9Var, nme.e(-1, -1, 119));
        int i = gl.v;
        addView(so5Var, new FrameLayout.LayoutParams(i, i, 17));
        addView(mi4Var.c, nme.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.G = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f));
        addView(linearLayout, nme.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.H = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(k96.M0(2131754751, null));
        linearLayout.addView((View) imageView, nme.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final q b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                tl9 tl9Var;
                ml9 ml9Var;
                tl9 tl9Var2;
                int i2;
                byte b = r2;
                boolean z2 = true;
                q qVar = this.b;
                switch (b) {
                    case 0:
                        ul9 ul9Var = qVar.Q;
                        if (ul9Var != null && (tl9Var = qVar.S) != null && (ml9Var = qVar.T) != null && tl9Var.a == 3 && !tl9Var.f && !qVar.q0) {
                            nl9 nl9Var = ml9Var.a;
                            nl9 nl9Var2 = nl9.a;
                            if (nl9Var == nl9Var2) {
                                nl9Var2 = nl9.b;
                            }
                            ul9Var.getClass();
                            ul9.v();
                            int i3 = ul9Var.a0;
                            if (i3 != 7 && i3 != 8 && i3 != 9 && i3 != 10) {
                                if (ul9Var.r != nl9Var2) {
                                    ul9Var.m.b("camera facing requested: " + ul9Var.r + " -> " + nl9Var2 + ", state=" + de9.A(ul9Var.a0));
                                    ul9Var.r = nl9Var2;
                                    int i4 = ul9Var.a0;
                                    if (i4 == 3 || i4 == 2) {
                                        ul9Var.e();
                                        ak9 ak9Var = ul9Var.l;
                                        ak9Var.E = nl9Var2;
                                        Handler handler = ak9Var.n;
                                        if (ak9Var.U && handler != null) {
                                            handler.post(new tj9(ak9Var, nl9Var2, (byte) 0));
                                        } else {
                                            z2 = false;
                                        }
                                        ul9Var.y = z2;
                                    }
                                    ul9Var.n();
                                    ul9Var.o();
                                }
                                qVar.f0.H(0);
                                qVar.f0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        ul9 ul9Var2 = qVar.Q;
                        if (ul9Var2 != null && (tl9Var2 = qVar.S) != null && qVar.T != null) {
                            boolean z3 = !tl9Var2.g;
                            ak9 ak9Var2 = ul9Var2.l;
                            ul9.v();
                            if (ul9Var2.a0 == 3 && !ul9Var2.y && (i2 = ul9Var2.b0) != 1) {
                                ul9Var2.w = z3;
                                if (i2 == 3) {
                                    ul9Var2.w(z3);
                                    ak9Var2.S(false);
                                } else {
                                    ul9Var2.w(false);
                                    ak9Var2.S(z3);
                                }
                                ul9Var2.o();
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
        linearLayout.addView((View) imageView2, nme.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final q b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                tl9 tl9Var;
                ml9 ml9Var;
                tl9 tl9Var2;
                int i2;
                byte b = r2;
                boolean z2 = true;
                q qVar = this.b;
                switch (b) {
                    case 0:
                        ul9 ul9Var = qVar.Q;
                        if (ul9Var != null && (tl9Var = qVar.S) != null && (ml9Var = qVar.T) != null && tl9Var.a == 3 && !tl9Var.f && !qVar.q0) {
                            nl9 nl9Var = ml9Var.a;
                            nl9 nl9Var2 = nl9.a;
                            if (nl9Var == nl9Var2) {
                                nl9Var2 = nl9.b;
                            }
                            ul9Var.getClass();
                            ul9.v();
                            int i3 = ul9Var.a0;
                            if (i3 != 7 && i3 != 8 && i3 != 9 && i3 != 10) {
                                if (ul9Var.r != nl9Var2) {
                                    ul9Var.m.b("camera facing requested: " + ul9Var.r + " -> " + nl9Var2 + ", state=" + de9.A(ul9Var.a0));
                                    ul9Var.r = nl9Var2;
                                    int i4 = ul9Var.a0;
                                    if (i4 == 3 || i4 == 2) {
                                        ul9Var.e();
                                        ak9 ak9Var = ul9Var.l;
                                        ak9Var.E = nl9Var2;
                                        Handler handler = ak9Var.n;
                                        if (ak9Var.U && handler != null) {
                                            handler.post(new tj9(ak9Var, nl9Var2, (byte) 0));
                                        } else {
                                            z2 = false;
                                        }
                                        ul9Var.y = z2;
                                    }
                                    ul9Var.n();
                                    ul9Var.o();
                                }
                                qVar.f0.H(0);
                                qVar.f0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        ul9 ul9Var2 = qVar.Q;
                        if (ul9Var2 != null && (tl9Var2 = qVar.S) != null && qVar.T != null) {
                            boolean z3 = !tl9Var2.g;
                            ak9 ak9Var2 = ul9Var2.l;
                            ul9.v();
                            if (ul9Var2.a0 == 3 && !ul9Var2.y && (i2 = ul9Var2.b0) != 1) {
                                ul9Var2.w = z3;
                                if (i2 == 3) {
                                    ul9Var2.w(z3);
                                    ak9Var2.S(false);
                                } else {
                                    ul9Var2.w(false);
                                    ak9Var2.S(z3);
                                }
                                ul9Var2.o();
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
        int L = gl.L(f);
        this.P = L;
        oy8 oy8Var = new oy8(2131624182, L, L);
        this.f0 = oy8Var;
        oy8Var.setCallback(imageView);
        oy8Var.H(oy8Var.e[0] - 1);
        imageView.setImageDrawable(oy8Var);
        A();
        if (!z) {
            mi4Var.a(imageView);
            mi4Var.a(imageView2);
        } else if (wjbVar != null && !wjbVar.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232800);
        imageView3.setAlpha(0.0f);
        addView(imageView3, nme.e(48, 48, 17));
        ro5Var.setOnTouchListener(new a7(this, (byte) 6));
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
        tl9 tl9Var;
        ul9 ul9Var = this.Q;
        if (ul9Var != null && (tl9Var = this.S) != null) {
            if (tl9Var.a == 3) {
                return ul9Var.j();
            }
            return tl9Var.b;
        }
        return 0L;
    }

    public void setRecordingUiFrameClockActive(boolean z) {
        ar1 ar1Var;
        if (z != this.J0) {
            this.J0 = z;
            this.I0 = 0L;
            po5 po5Var = this.L0;
            if (z) {
                rg2.d().a(30, po5Var);
            } else {
                rg2.d().g(po5Var);
            }
            if (this.d != z) {
                this.d = z;
                xo5 xo5Var = this.c;
                if (xo5Var != null && (ar1Var = ((mu1) ((l69) xo5Var).b).a0) != null) {
                    ar1Var.setRoundVideoUiFrameClockActive(z);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z) {
        Activity parentActivity = this.f.getParentActivity();
        if (parentActivity == null) {
            parentActivity = gl.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        float f = this.G0;
        mi4 mi4Var = this.K;
        if (z) {
            if (Float.isNaN(f)) {
                this.G0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            mi4Var.c(null);
        } else {
            if (!Float.isNaN(f)) {
                attributes.screenBrightness = this.G0;
                this.G0 = Float.NaN;
            }
            mi4Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        tl9 tl9Var = this.S;
        int i = this.P;
        ki4 ki4Var = this.I;
        if (tl9Var != null && tl9Var.g) {
            if (this.h0 == null) {
                oy8 oy8Var = new oy8(2131624180, i, i);
                this.h0 = oy8Var;
                oy8Var.setCallback(ki4Var);
            }
            ki4Var.setImageDrawable(this.h0);
            return;
        }
        if (this.g0 == null) {
            oy8 oy8Var2 = new oy8(2131624181, i, i);
            this.g0 = oy8Var2;
            oy8Var2.setCallback(ki4Var);
        }
        ki4Var.setImageDrawable(this.g0);
    }

    public final void B() {
        ar1 ar1Var;
        tl9 tl9Var = this.S;
        if (tl9Var != null) {
            long j = tl9Var.d;
            if (tl9Var.a == 3) {
                long min = Math.min(j, (SystemClock.elapsedRealtime() + tl9Var.b) - tl9Var.c);
                this.x0 = min;
                this.x.setProgress(((float) min) / ((float) j));
                xo5 xo5Var = this.c;
                if (xo5Var != null && (ar1Var = ((mu1) ((l69) xo5Var).b).a0) != null && ar1Var.Z1) {
                    ar1Var.Y1 = min;
                    my1 my1Var = ar1Var.Z0;
                    if (my1Var != null && my1Var.r) {
                        my1Var.h = min;
                        my1Var.invalidate();
                    }
                    jy1 jy1Var = ar1Var.b2;
                    if (jy1Var != null && jy1Var.f) {
                        if (!jy1Var.e) {
                            long j2 = jy1Var.h;
                            if (j2 >= 0) {
                                if (!jy1Var.c) {
                                    jy1Var.a = jy1.a(Math.max(0L, min - j2));
                                }
                                jy1Var.invalidate();
                            }
                        }
                        jy1Var.h = min;
                        jy1Var.a = 1.0f;
                        jy1Var.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = ar1Var.a2;
                    if (slideTextView != null && slideTextView.H && slideTextView.n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    public final void d() {
        tl9 tl9Var;
        oac oacVar;
        if (this.Q != null && (tl9Var = this.S) != null && (oacVar = this.V) != null) {
            long j = tl9Var.b;
            long max = Math.max(0L, oacVar.a);
            long j2 = this.V.b;
            if (j2 >= 0) {
                j = Math.min(j, j2);
            }
            ul9 ul9Var = this.Q;
            ul9Var.getClass();
            ul9.v();
            if (ul9Var.a0 == 5) {
                long max2 = Math.max(0L, Math.min(ul9Var.I, max));
                long max3 = Math.max(max2, Math.min(ul9Var.I, j));
                if (max3 - max2 >= Math.min(800L, ul9Var.I)) {
                    ul9Var.K = max2;
                    ul9Var.L = max3;
                    y54 y54Var = ul9Var.W;
                    if (y54Var != null) {
                        y54Var.k1(max2);
                    }
                    ul9Var.d.getClass();
                    ul9Var.o();
                }
            }
        }
    }

    public final Bitmap e(Bitmap bitmap) {
        ro5 ro5Var = this.E;
        if (ro5Var.getWidth() > 0 && ro5Var.getHeight() > 0) {
            Matrix matrix = this.M;
            ro5Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.N;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / ro5Var.getWidth();
                float height = bitmap.getHeight() / ro5Var.getHeight();
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
        ul9 ul9Var;
        int i;
        if (!p() && (ul9Var = this.Q) != null && ul9Var.a()) {
            this.W = null;
            if (z) {
                i = 0;
            } else {
                i = 6;
            }
            s(i);
            lgb lgbVar = this.U;
            if (lgbVar != null) {
                lgbVar.d(true);
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
    public wo5 getCameraContainer() {
        return this.w;
    }

    @Override
    public RectF getCameraRect() {
        ro5 ro5Var = this.E;
        int[] iArr = this.L;
        ro5Var.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], ro5Var.getWidth() + i, ro5Var.getHeight() + iArr[1]);
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
        tl9 tl9Var;
        if (this.Q != null && (tl9Var = this.S) != null && tl9Var.a == 5) {
            d();
            if (i == 0) {
                this.Q.r();
            } else if (i == 1) {
                this.Q.p();
            } else if (i == 2) {
                ul9 ul9Var = this.Q;
                long j = f * ((float) this.S.b);
                ul9Var.getClass();
                ul9.v();
                if (ul9Var.a0 == 5 && ul9Var.W != null) {
                    long j2 = ul9Var.K;
                    ul9Var.W.k1(Math.max(j2, Math.min(Math.max(j2, ul9Var.L - 1), j)));
                    ul9Var.d.getClass();
                }
            }
        }
    }

    public final oac i(File file, long j, kgb kgbVar) {
        long j2;
        byte b;
        short s;
        pl9 pl9Var;
        oac oacVar = new oac();
        oacVar.a = -1L;
        oacVar.b = -1L;
        oacVar.r = j;
        if (kgbVar == null) {
            j2 = file.length();
        } else {
            j2 = kgbVar.a;
        }
        oacVar.q = Math.max(1L, j2);
        oacVar.s = true;
        ul9 ul9Var = this.Q;
        if (ul9Var != null && (pl9Var = ul9Var.u) != null) {
            b = pl9Var.a;
        } else {
            b = 30;
        }
        oacVar.n = b;
        sl9 sl9Var = this.R;
        if (sl9Var == null) {
            s = 480;
        } else {
            s = sl9Var.a;
        }
        oacVar.h = s;
        oacVar.k = s;
        oacVar.i = s;
        oacVar.l = s;
        oacVar.o = file.getAbsolutePath();
        if (kgbVar != null) {
            oacVar.w = kgbVar.b;
            oacVar.x = kgbVar.c;
            oacVar.y = kgbVar.d;
            oacVar.z = kgbVar.e;
        }
        return oacVar;
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
            ul9 ul9Var = this.Q;
            if (ul9Var != null) {
                ul9Var.s();
                this.Q = null;
            }
        }
        lgb lgbVar = this.U;
        if (lgbVar != null && !this.b0) {
            lgbVar.d(!this.m0);
            this.U = null;
        }
        setScreenFlashEnabled(false);
        MediaController.w().X(false);
        x();
    }

    public final void k() {
        tl9 tl9Var;
        boolean z;
        int i;
        if (this.W != null && !this.a0 && this.Q != null && (tl9Var = this.S) != null) {
            int i2 = tl9Var.a;
            if (i2 == 5) {
                d();
            } else if (i2 != 3) {
                return;
            }
            ul9 ul9Var = this.Q;
            boolean z2 = this.l0;
            boolean z3 = !z2;
            ul9Var.getClass();
            ul9.v();
            int i3 = ul9Var.a0;
            boolean z4 = false;
            if (i3 == 3 || i3 == 5) {
                ul9Var.m.b("finish requested: state=" + de9.A(ul9Var.a0) + ", includeAudio=" + z3 + ", durationMs=" + ul9Var.j() + ", trim=" + ul9Var.K + ".." + ul9Var.L);
                ul9Var.B = z3;
                if (ul9Var.a0 == 3) {
                    ul9Var.I = ul9Var.j();
                    ul9Var.A = true;
                    ul9Var.e();
                    ul9Var.i.removeCallbacks(ul9Var.X);
                    ul9Var.x(7);
                    boolean W = ul9Var.l.W();
                    ul9Var.E = W;
                    if (!W) {
                        ul9Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    ul9Var.t();
                    ul9Var.x(7);
                    if (!ul9Var.l() && !z2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (ul9Var.l()) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    ul9Var.j.execute(new jl9(ul9Var, ul9Var.U, z, ul9Var.V, z3, i, ul9Var.T));
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
            this.d0.addUpdateListener(new oo5(this, (byte) 1));
            this.d0.start();
        }
    }

    public final void m() {
        j();
        so5 so5Var = this.w;
        so5Var.setTranslationX(0.0f);
        this.z0 = 0.0f;
        so5Var.setTranslationY(0.0f + this.y0);
        so5Var.setImageReceiver(null);
        MediaController.w().b0();
    }

    public final void n(boolean z) {
        if (!this.p0) {
            return;
        }
        this.p0 = false;
        as1 as1Var = this.F;
        as1Var.animate().cancel();
        if (z) {
            as1Var.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            as1Var.setAlpha(0.0f);
        }
    }

    public final void o() {
        if (!this.o0) {
            return;
        }
        this.o0 = false;
        as1 as1Var = this.F;
        as1Var.invalidate();
        as1Var.animate().cancel();
        as1Var.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
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
            i3 = gl.v;
        } else {
            i3 = gl.u;
        }
        if (this.H0 != i3) {
            this.H0 = i3;
            so5 so5Var = this.w;
            so5Var.getLayoutParams().width = gl.L(28.0f) + i3;
            so5Var.getLayoutParams().height = gl.L(28.0f) + i3;
            ((FrameLayout.LayoutParams) this.J.getLayoutParams()).topMargin = (i3 / 2) - gl.L(24.0f);
        }
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        mi4 mi4Var = this.K;
        mi4Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        mi4Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
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
        ul9 ul9Var;
        tl9 tl9Var;
        super.onWindowVisibilityChanged(i);
        if (i != 0 && (ul9Var = this.Q) != null && (tl9Var = this.S) != null) {
            if (tl9Var.a == 3) {
                r();
            } else if (tl9Var.e) {
                ul9Var.p();
            }
        }
    }

    public final boolean p() {
        ul9 ul9Var;
        if (this.W != null && this.a0 && (ul9Var = this.Q) != null) {
            ul9.v();
            int i = ul9Var.a0;
            new tl9(i, ul9Var.I, ul9Var.J, ul9Var.q, ul9Var.z, ul9Var.y, ul9Var.w);
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
            fa4.b("RoundVideo camera flip completed: elapsedMs=" + getCameraFlipElapsedMs());
            z();
        }
    }

    public final void r() {
        tl9 tl9Var;
        if (this.Q != null && (tl9Var = this.S) != null && tl9Var.a == 3) {
            s(2);
            this.Q.q();
        }
    }

    public final void s(int i) {
        if (this.k0 && i == 2) {
            return;
        }
        this.k0 = true;
        kk7.f(this.h).k(kk7.m2, Integer.valueOf(this.n), Integer.valueOf(i));
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
        so5 so5Var = this.w;
        so5Var.setAlpha(0.0f);
        so5Var.setScaleX(0.1f);
        so5Var.setScaleY(0.1f);
        so5Var.setTranslationX(0.0f);
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
            fa4.g(e, true);
        }
    }

    public final void t(boolean z) {
        Bitmap bitmap;
        ro5 ro5Var = this.E;
        if (ro5Var.isAvailable() && (bitmap = ro5Var.getBitmap(180, 180)) != null) {
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
                    kk7.f(this.h).k(kk7.s2, Integer.valueOf(this.n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    f(false);
                    return;
                }
                if (this.S.a == 3) {
                    s(5);
                }
                this.j0 = false;
                this.W = new to5(i2, i3, j, j2, z);
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
        as1 as1Var = this.F;
        if (!this.o0) {
            if (this.w0 == null) {
                try {
                    this.w0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.a.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.w0;
            if (bitmap != null) {
                as1Var.setImageBitmap(bitmap);
            } else {
                as1Var.setImageResource(2131231495);
            }
            this.o0 = true;
            as1Var.animate().cancel();
            as1Var.setAlpha(1.0f);
            as1Var.invalidate();
        }
        this.U = new lgb(this.h, this.r);
        this.R = (sl9) wcd.d.a();
        ll9 ll9Var = new ll9(getContext(), this.E);
        ll9Var.c = new File(org.telegram.messenger.a.h(), "cache");
        ll9Var.d = (nl9) wcd.i.a();
        ll9Var.e = this.R;
        ll9Var.h = wcd.g.a();
        ll9Var.f = (ol9) wcd.e.a();
        ll9Var.g = (pl9) wcd.f.a();
        im0 im0Var = wcd.h;
        im0Var.a();
        ll9Var.i = im0Var.d;
        gi3 gi3Var = this.M0;
        ll9Var.j = gi3Var;
        lgb lgbVar = this.U;
        ll9Var.k = lgbVar;
        ll9Var.l = new ry4(this, (byte) 11);
        if (ll9Var.d != null) {
            if (ll9Var.e != null) {
                if (ll9Var.h > 0) {
                    if (ll9Var.f != null) {
                        if (ll9Var.g != null) {
                            if (gi3Var != null) {
                                if (lgbVar != null) {
                                    this.Q = new ul9(ll9Var);
                                    MediaController.w().X(true);
                                    ul9 ul9Var = this.Q;
                                    ul9Var.getClass();
                                    ul9.v();
                                    if (ul9Var.a0 == 1) {
                                        try {
                                            ul9Var.m.b("start requested");
                                            ul9Var.c(true);
                                            ul9Var.x(2);
                                            ul9Var.l.V(ul9Var.U, 0L, ul9Var.r);
                                        } catch (Exception e) {
                                            ul9Var.h(e);
                                        }
                                    }
                                    w(true);
                                    return;
                                }
                                sc8.j("Output listener is required");
                                return;
                            }
                            sc8.j("Session listener is required");
                            return;
                        }
                        sc8.j("Frame rate is required");
                        return;
                    }
                    sc8.j("Camera resolution is required");
                    return;
                }
                sc8.j("Video bitrate is required");
                return;
            }
            sc8.j("Output resolution is required");
            return;
        }
        sc8.j("Initial camera is required");
    }

    public final void w(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        uo5 uo5Var = this.a;
        if (uo5Var != null) {
            ((yk1) uo5Var).b.ed.a(z, true);
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
        so5 so5Var = this.w;
        if (z && !this.n0) {
            so5Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.z0 = measuredHeight;
            so5Var.setTranslationY(measuredHeight + this.y0);
        }
        this.n0 = z;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        if (!z && Math.max(getCurrentDurationMs(), this.x0) > 300) {
            f = gl.L(24.0f) - (getMeasuredWidth() * 0.5f);
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
        ofFloat.addUpdateListener(new oo5(this, (byte) 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(so5Var, property, f5);
        float f8 = 0.1f;
        if (z) {
            f6 = 1.0f;
        } else {
            f6 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(so5Var, View.SCALE_X, f6);
        if (z) {
            f8 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(so5Var, View.SCALE_Y, f8);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(so5Var, View.TRANSLATION_X, f);
        if (this.l0 && z) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.J, property, f7), ofFloat);
        this.c0.setDuration(180L);
        this.c0.setInterpolator(new DecelerateInterpolator());
        if (!z) {
            this.c0.addListener(new v85(this, (byte) 4));
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
        kk7.e().k(kk7.j1, 512);
    }

    public final void y() {
        tl9 tl9Var;
        ul9 ul9Var = this.Q;
        if (ul9Var != null && (tl9Var = this.S) != null) {
            int i = tl9Var.a;
            if (i == 3) {
                r();
            } else if (i == 5) {
                ul9.v();
                if (ul9Var.a0 == 5 && ul9Var.L - ul9Var.K < ul9Var.q) {
                    ul9Var.Q++;
                    ul9Var.D = false;
                    ul9Var.m.b("resume requested: trim=" + ul9Var.K + ".." + ul9Var.L + ", sourceDurationMs=" + ul9Var.I);
                    ul9Var.t();
                    ul9Var.x(6);
                    ul9Var.j.execute(new z77(ul9Var, ul9Var.l(), ul9Var.U, ul9Var.T, ul9Var.V, (byte) 18));
                    this.V = null;
                    this.j0 = true;
                    this.k0 = false;
                }
            }
        }
    }

    public final void z() {
        boolean z;
        ml9 ml9Var;
        tl9 tl9Var = this.S;
        boolean z2 = false;
        if (tl9Var != null && tl9Var.a == 3 && !tl9Var.f && !this.q0) {
            z = true;
        } else {
            z = false;
        }
        this.H.setEnabled(z);
        if (z && (ml9Var = this.T) != null && ml9Var.b != 1) {
            z2 = true;
        }
        this.I.setEnabled(z2);
        A();
    }
}
