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
public final class q extends cr5 {
    public static final int N0 = 0;
    public float A0;
    public float B0;
    public int C0;
    public int D0;
    public final uq5 E;
    public boolean E0;
    public final os1 F;
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
    public final sq5 L0;
    public final Matrix M;
    public final kj4 M0;
    public final float[] N;
    public final Paint O;
    public final int P;
    public jp9 Q;
    public hp9 R;
    public ip9 S;
    public bp9 T;
    public hkb U;
    public oec V;
    public wq5 W;
    public boolean a0;
    public boolean b0;
    public AnimatorSet c0;
    public ValueAnimator d0;
    public ValueAnimator e0;
    public final yq5 f;
    public final b29 f0;
    public b29 g0;
    public final int h;
    public b29 h0;
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
    public final vq5 w;
    public Bitmap w0;
    public final lo9 x;
    public long x0;
    public final FrameLayout y;
    public float y0;
    public float z0;

    public q(Context context, yq5 yq5Var, vnb vnbVar, boolean z) {
        super(context);
        float f;
        this.h = yac.t0;
        this.L = new int[2];
        this.M = new Matrix();
        this.N = new float[9];
        this.O = new Paint(3);
        this.C0 = -1;
        this.D0 = -1;
        this.G0 = Float.NaN;
        this.L0 = new sq5(this, (byte) 0);
        this.M0 = new kj4(this, (byte) 9);
        this.f = yq5Var;
        this.n = yq5Var.getClassGuid();
        this.r = yq5Var.y();
        this.s = yq5Var.getFragmentView();
        setWillNotDraw(false);
        rk4 rk4Var = new rk4(context, null, this, null);
        this.K = rk4Var;
        rk4Var.o = 0.5f;
        rk4Var.n = rk4.f(0.5f);
        rk4Var.g();
        addView(rk4Var.b, tre.e(-1, -1, 119));
        vq5 vq5Var = new vq5(this, context);
        this.w = vq5Var;
        lo9 lo9Var = new lo9(context);
        this.x = lo9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        uq5 uq5Var = new uq5((byte) 0, context, this);
        uq5Var.setOpaque(true);
        uq5Var.setClickable(true);
        uq5Var.setCameraDistance(hl.L(8000.0f));
        uq5Var.setOutlineProvider(new yi((byte) 6));
        uq5Var.setClipToOutline(true);
        this.E = uq5Var;
        frameLayout.addView(uq5Var, tre.e(-1, -1, 119));
        Paint paint = new Paint(1);
        paint.setColor(671088640);
        os1 os1Var = new os1(this, context, paint);
        this.F = os1Var;
        os1Var.setOutlineProvider(new yi((byte) 5));
        os1Var.setClipToOutline(true);
        frameLayout.addView(os1Var, tre.e(-1, -1, 119));
        lo9Var.addView(frameLayout, tre.d(-1, -1.0f, 119, 14.0f, 14.0f, 14.0f, 14.0f));
        vq5Var.addView(lo9Var, tre.e(-1, -1, 119));
        int i = hl.v;
        addView(vq5Var, new FrameLayout.LayoutParams(i, i, 17));
        addView(rk4Var.c, tre.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.G = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f));
        addView(linearLayout, tre.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.H = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(ob6.M0(2131754747, null));
        linearLayout.addView((View) imageView, tre.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final q b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ip9 ip9Var;
                bp9 bp9Var;
                ip9 ip9Var2;
                int i2;
                byte b = r2;
                boolean z2 = true;
                q qVar = this.b;
                switch (b) {
                    case 0:
                        jp9 jp9Var = qVar.Q;
                        if (jp9Var != null && (ip9Var = qVar.S) != null && (bp9Var = qVar.T) != null && ip9Var.a == 3 && !ip9Var.f && !qVar.q0) {
                            cp9 cp9Var = bp9Var.a;
                            cp9 cp9Var2 = cp9.a;
                            if (cp9Var == cp9Var2) {
                                cp9Var2 = cp9.b;
                            }
                            jp9Var.getClass();
                            jp9.v();
                            int i3 = jp9Var.a0;
                            if (i3 != 7 && i3 != 8 && i3 != 9 && i3 != 10) {
                                if (jp9Var.r != cp9Var2) {
                                    jp9Var.m.b("camera facing requested: " + jp9Var.r + " -> " + cp9Var2 + ", state=" + uh9.A(jp9Var.a0));
                                    jp9Var.r = cp9Var2;
                                    int i4 = jp9Var.a0;
                                    if (i4 == 3 || i4 == 2) {
                                        jp9Var.e();
                                        on9 on9Var = jp9Var.l;
                                        on9Var.E = cp9Var2;
                                        Handler handler = on9Var.n;
                                        if (on9Var.U && handler != null) {
                                            handler.post(new dn9(on9Var, cp9Var2, (byte) 0));
                                        } else {
                                            z2 = false;
                                        }
                                        jp9Var.y = z2;
                                    }
                                    jp9Var.n();
                                    jp9Var.o();
                                }
                                qVar.f0.H(0);
                                qVar.f0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        jp9 jp9Var2 = qVar.Q;
                        if (jp9Var2 != null && (ip9Var2 = qVar.S) != null && qVar.T != null) {
                            boolean z3 = !ip9Var2.g;
                            on9 on9Var2 = jp9Var2.l;
                            jp9.v();
                            if (jp9Var2.a0 == 3 && !jp9Var2.y && (i2 = jp9Var2.b0) != 1) {
                                jp9Var2.w = z3;
                                if (i2 == 3) {
                                    jp9Var2.w(z3);
                                    on9Var2.S(false);
                                } else {
                                    jp9Var2.w(false);
                                    on9Var2.S(z3);
                                }
                                jp9Var2.o();
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
        linearLayout.addView((View) imageView2, tre.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final q b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ip9 ip9Var;
                bp9 bp9Var;
                ip9 ip9Var2;
                int i2;
                byte b = r2;
                boolean z2 = true;
                q qVar = this.b;
                switch (b) {
                    case 0:
                        jp9 jp9Var = qVar.Q;
                        if (jp9Var != null && (ip9Var = qVar.S) != null && (bp9Var = qVar.T) != null && ip9Var.a == 3 && !ip9Var.f && !qVar.q0) {
                            cp9 cp9Var = bp9Var.a;
                            cp9 cp9Var2 = cp9.a;
                            if (cp9Var == cp9Var2) {
                                cp9Var2 = cp9.b;
                            }
                            jp9Var.getClass();
                            jp9.v();
                            int i3 = jp9Var.a0;
                            if (i3 != 7 && i3 != 8 && i3 != 9 && i3 != 10) {
                                if (jp9Var.r != cp9Var2) {
                                    jp9Var.m.b("camera facing requested: " + jp9Var.r + " -> " + cp9Var2 + ", state=" + uh9.A(jp9Var.a0));
                                    jp9Var.r = cp9Var2;
                                    int i4 = jp9Var.a0;
                                    if (i4 == 3 || i4 == 2) {
                                        jp9Var.e();
                                        on9 on9Var = jp9Var.l;
                                        on9Var.E = cp9Var2;
                                        Handler handler = on9Var.n;
                                        if (on9Var.U && handler != null) {
                                            handler.post(new dn9(on9Var, cp9Var2, (byte) 0));
                                        } else {
                                            z2 = false;
                                        }
                                        jp9Var.y = z2;
                                    }
                                    jp9Var.n();
                                    jp9Var.o();
                                }
                                qVar.f0.H(0);
                                qVar.f0.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        jp9 jp9Var2 = qVar.Q;
                        if (jp9Var2 != null && (ip9Var2 = qVar.S) != null && qVar.T != null) {
                            boolean z3 = !ip9Var2.g;
                            on9 on9Var2 = jp9Var2.l;
                            jp9.v();
                            if (jp9Var2.a0 == 3 && !jp9Var2.y && (i2 = jp9Var2.b0) != 1) {
                                jp9Var2.w = z3;
                                if (i2 == 3) {
                                    jp9Var2.w(z3);
                                    on9Var2.S(false);
                                } else {
                                    jp9Var2.w(false);
                                    on9Var2.S(z3);
                                }
                                jp9Var2.o();
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
        int L = hl.L(f);
        this.P = L;
        b29 b29Var = new b29(2131624182, L, L);
        this.f0 = b29Var;
        b29Var.setCallback(imageView);
        b29Var.H(b29Var.e[0] - 1);
        imageView.setImageDrawable(b29Var);
        A();
        if (!z) {
            rk4Var.a(imageView);
            rk4Var.a(imageView2);
        } else if (vnbVar != null && !vnbVar.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.J = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232819);
        imageView3.setAlpha(0.0f);
        addView(imageView3, tre.e(48, 48, 17));
        uq5Var.setOnTouchListener(new b7(this, (byte) 6));
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
        ip9 ip9Var;
        jp9 jp9Var = this.Q;
        if (jp9Var != null && (ip9Var = this.S) != null) {
            if (ip9Var.a == 3) {
                return jp9Var.j();
            }
            return ip9Var.b;
        }
        return 0L;
    }

    public void setRecordingUiFrameClockActive(boolean z) {
        nr1 nr1Var;
        if (z != this.J0) {
            this.J0 = z;
            this.I0 = 0L;
            sq5 sq5Var = this.L0;
            if (z) {
                jh2.d().a(30, sq5Var);
            } else {
                jh2.d().g(sq5Var);
            }
            if (this.d != z) {
                this.d = z;
                ar5 ar5Var = this.c;
                if (ar5Var != null && (nr1Var = ((zu1) ((ri6) ar5Var).b).a0) != null) {
                    nr1Var.setRoundVideoUiFrameClockActive(z);
                }
            }
        }
    }

    public void setScreenFlashEnabled(boolean z) {
        Activity parentActivity = this.f.getParentActivity();
        if (parentActivity == null) {
            parentActivity = hl.W(getContext());
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
        ip9 ip9Var = this.S;
        int i = this.P;
        pk4 pk4Var = this.I;
        if (ip9Var != null && ip9Var.g) {
            if (this.h0 == null) {
                b29 b29Var = new b29(2131624180, i, i);
                this.h0 = b29Var;
                b29Var.setCallback(pk4Var);
            }
            pk4Var.setImageDrawable(this.h0);
            return;
        }
        if (this.g0 == null) {
            b29 b29Var2 = new b29(2131624181, i, i);
            this.g0 = b29Var2;
            b29Var2.setCallback(pk4Var);
        }
        pk4Var.setImageDrawable(this.g0);
    }

    public final void B() {
        nr1 nr1Var;
        ip9 ip9Var = this.S;
        if (ip9Var != null) {
            long j = ip9Var.d;
            if (ip9Var.a == 3) {
                long min = Math.min(j, (SystemClock.elapsedRealtime() + ip9Var.b) - ip9Var.c);
                this.x0 = min;
                this.x.setProgress(((float) min) / ((float) j));
                ar5 ar5Var = this.c;
                if (ar5Var != null && (nr1Var = ((zu1) ((ri6) ar5Var).b).a0) != null && nr1Var.Y1) {
                    nr1Var.X1 = min;
                    ez1 ez1Var = nr1Var.Z0;
                    if (ez1Var != null && ez1Var.r) {
                        ez1Var.h = min;
                        ez1Var.invalidate();
                    }
                    zy1 zy1Var = nr1Var.a2;
                    if (zy1Var != null && zy1Var.f) {
                        if (!zy1Var.e) {
                            long j2 = zy1Var.h;
                            if (j2 >= 0) {
                                if (!zy1Var.c) {
                                    zy1Var.a = zy1.a(Math.max(0L, min - j2));
                                }
                                zy1Var.invalidate();
                            }
                        }
                        zy1Var.h = min;
                        zy1Var.a = 1.0f;
                        zy1Var.invalidate();
                    }
                    ChatActivityEnterView.SlideTextView slideTextView = nr1Var.Z1;
                    if (slideTextView != null && slideTextView.H && slideTextView.n != 1.0f) {
                        slideTextView.invalidate();
                    }
                }
            }
        }
    }

    public final void d() {
        ip9 ip9Var;
        oec oecVar;
        if (this.Q != null && (ip9Var = this.S) != null && (oecVar = this.V) != null) {
            long j = ip9Var.b;
            long max = Math.max(0L, oecVar.a);
            long j2 = this.V.b;
            if (j2 >= 0) {
                j = Math.min(j, j2);
            }
            jp9 jp9Var = this.Q;
            jp9Var.getClass();
            jp9.v();
            if (jp9Var.a0 == 5) {
                long max2 = Math.max(0L, Math.min(jp9Var.I, max));
                long max3 = Math.max(max2, Math.min(jp9Var.I, j));
                if (max3 - max2 >= Math.min(800L, jp9Var.I)) {
                    jp9Var.K = max2;
                    jp9Var.L = max3;
                    s64 s64Var = jp9Var.W;
                    if (s64Var != null) {
                        s64Var.k1(max2);
                    }
                    jp9Var.d.getClass();
                    jp9Var.o();
                }
            }
        }
    }

    public final Bitmap e(Bitmap bitmap) {
        uq5 uq5Var = this.E;
        if (uq5Var.getWidth() > 0 && uq5Var.getHeight() > 0) {
            Matrix matrix = this.M;
            uq5Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.N;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / uq5Var.getWidth();
                float height = bitmap.getHeight() / uq5Var.getHeight();
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
        jp9 jp9Var;
        int i;
        if (!p() && (jp9Var = this.Q) != null && jp9Var.a()) {
            this.W = null;
            if (z) {
                i = 0;
            } else {
                i = 6;
            }
            s(i);
            hkb hkbVar = this.U;
            if (hkbVar != null) {
                hkbVar.d(true);
            }
            this.U = null;
            MediaController.z().b0(false);
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
    public zq5 getCameraContainer() {
        return this.w;
    }

    @Override
    public RectF getCameraRect() {
        uq5 uq5Var = this.E;
        int[] iArr = this.L;
        uq5Var.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], uq5Var.getWidth() + i, uq5Var.getHeight() + iArr[1]);
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
        ip9 ip9Var;
        if (this.Q != null && (ip9Var = this.S) != null && ip9Var.a == 5) {
            d();
            if (i == 0) {
                this.Q.r();
            } else if (i == 1) {
                this.Q.p();
            } else if (i == 2) {
                jp9 jp9Var = this.Q;
                long j = f * ((float) this.S.b);
                jp9Var.getClass();
                jp9.v();
                if (jp9Var.a0 == 5 && jp9Var.W != null) {
                    long j2 = jp9Var.K;
                    jp9Var.W.k1(Math.max(j2, Math.min(Math.max(j2, jp9Var.L - 1), j)));
                    jp9Var.d.getClass();
                }
            }
        }
    }

    public final oec i(File file, long j, gkb gkbVar) {
        long j2;
        byte b;
        short s;
        ep9 ep9Var;
        oec oecVar = new oec();
        oecVar.a = -1L;
        oecVar.b = -1L;
        oecVar.r = j;
        if (gkbVar == null) {
            j2 = file.length();
        } else {
            j2 = gkbVar.a;
        }
        oecVar.q = Math.max(1L, j2);
        oecVar.s = true;
        jp9 jp9Var = this.Q;
        if (jp9Var != null && (ep9Var = jp9Var.u) != null) {
            b = ep9Var.a;
        } else {
            b = 30;
        }
        oecVar.n = b;
        hp9 hp9Var = this.R;
        if (hp9Var == null) {
            s = 480;
        } else {
            s = hp9Var.a;
        }
        oecVar.h = s;
        oecVar.k = s;
        oecVar.i = s;
        oecVar.l = s;
        oecVar.o = file.getAbsolutePath();
        if (gkbVar != null) {
            oecVar.w = gkbVar.b;
            oecVar.x = gkbVar.c;
            oecVar.y = gkbVar.d;
            oecVar.z = gkbVar.e;
        }
        return oecVar;
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
            jp9 jp9Var = this.Q;
            if (jp9Var != null) {
                jp9Var.s();
                this.Q = null;
            }
        }
        hkb hkbVar = this.U;
        if (hkbVar != null && !this.b0) {
            hkbVar.d(!this.m0);
            this.U = null;
        }
        setScreenFlashEnabled(false);
        MediaController.z().b0(false);
        x();
    }

    public final void k() {
        ip9 ip9Var;
        boolean z;
        int i;
        if (this.W != null && !this.a0 && this.Q != null && (ip9Var = this.S) != null) {
            int i2 = ip9Var.a;
            if (i2 == 5) {
                d();
            } else if (i2 != 3) {
                return;
            }
            jp9 jp9Var = this.Q;
            boolean z2 = this.l0;
            boolean z3 = !z2;
            jp9Var.getClass();
            jp9.v();
            int i3 = jp9Var.a0;
            boolean z4 = false;
            if (i3 == 3 || i3 == 5) {
                jp9Var.m.b("finish requested: state=" + uh9.A(jp9Var.a0) + ", includeAudio=" + z3 + ", durationMs=" + jp9Var.j() + ", trim=" + jp9Var.K + ".." + jp9Var.L);
                jp9Var.B = z3;
                if (jp9Var.a0 == 3) {
                    jp9Var.I = jp9Var.j();
                    jp9Var.A = true;
                    jp9Var.e();
                    jp9Var.i.removeCallbacks(jp9Var.X);
                    jp9Var.x(7);
                    boolean W = jp9Var.l.W();
                    jp9Var.E = W;
                    if (!W) {
                        jp9Var.h(new IllegalStateException("Unable to stop the camera segment"));
                    }
                } else {
                    jp9Var.t();
                    jp9Var.x(7);
                    if (!jp9Var.l() && !z2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (jp9Var.l()) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    jp9Var.j.execute(new vo9(jp9Var, jp9Var.U, z, jp9Var.V, z3, i, jp9Var.T));
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
            this.d0.addUpdateListener(new rq5(this, (byte) 1));
            this.d0.start();
        }
    }

    public final void m() {
        j();
        vq5 vq5Var = this.w;
        vq5Var.setTranslationX(0.0f);
        this.z0 = 0.0f;
        vq5Var.setTranslationY(0.0f + this.y0);
        vq5Var.setImageReceiver(null);
        MediaController.z().e0();
    }

    public final void n(boolean z) {
        if (!this.p0) {
            return;
        }
        this.p0 = false;
        os1 os1Var = this.F;
        os1Var.animate().cancel();
        if (z) {
            os1Var.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        } else {
            os1Var.setAlpha(0.0f);
        }
    }

    public final void o() {
        if (!this.o0) {
            return;
        }
        this.o0 = false;
        os1 os1Var = this.F;
        os1Var.invalidate();
        os1Var.animate().cancel();
        os1Var.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
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
            i3 = hl.v;
        } else {
            i3 = hl.u;
        }
        if (this.H0 != i3) {
            this.H0 = i3;
            vq5 vq5Var = this.w;
            vq5Var.getLayoutParams().width = hl.L(28.0f) + i3;
            vq5Var.getLayoutParams().height = hl.L(28.0f) + i3;
            ((FrameLayout.LayoutParams) this.J.getLayoutParams()).topMargin = (i3 / 2) - hl.L(24.0f);
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
        jp9 jp9Var;
        ip9 ip9Var;
        super.onWindowVisibilityChanged(i);
        if (i != 0 && (jp9Var = this.Q) != null && (ip9Var = this.S) != null) {
            if (ip9Var.a == 3) {
                r();
            } else if (ip9Var.e) {
                jp9Var.p();
            }
        }
    }

    public final boolean p() {
        jp9 jp9Var;
        if (this.W != null && this.a0 && (jp9Var = this.Q) != null) {
            jp9.v();
            int i = jp9Var.a0;
            new ip9(i, jp9Var.I, jp9Var.J, jp9Var.q, jp9Var.z, jp9Var.y, jp9Var.w);
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
            cc4.b("RoundVideo camera flip completed: elapsedMs=" + getCameraFlipElapsedMs());
            z();
        }
    }

    public final void r() {
        ip9 ip9Var;
        if (this.Q != null && (ip9Var = this.S) != null && ip9Var.a == 3) {
            s(2);
            this.Q.q();
        }
    }

    public final void s(int i) {
        if (this.k0 && i == 2) {
            return;
        }
        this.k0 = true;
        jn7.f(this.h).k(jn7.n2, Integer.valueOf(this.n), Integer.valueOf(i));
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
        vq5 vq5Var = this.w;
        vq5Var.setAlpha(0.0f);
        vq5Var.setScaleX(0.1f);
        vq5Var.setScaleY(0.1f);
        vq5Var.setTranslationX(0.0f);
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
            cc4.g(e, true);
        }
    }

    public final void t(boolean z) {
        Bitmap bitmap;
        uq5 uq5Var = this.E;
        if (uq5Var.isAvailable() && (bitmap = uq5Var.getBitmap(180, 180)) != null) {
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
                    jn7.f(this.h).k(jn7.t2, Integer.valueOf(this.n), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                    f(false);
                    return;
                }
                if (this.S.a == 3) {
                    s(5);
                }
                this.j0 = false;
                this.W = new wq5(i2, i3, j, j2, z);
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
        os1 os1Var = this.F;
        if (!this.o0) {
            if (this.w0 == null) {
                try {
                    this.w0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.a.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.w0;
            if (bitmap != null) {
                os1Var.setImageBitmap(bitmap);
            } else {
                os1Var.setImageResource(2131231495);
            }
            this.o0 = true;
            os1Var.animate().cancel();
            os1Var.setAlpha(1.0f);
            os1Var.invalidate();
        }
        this.U = new hkb(this.h, this.r);
        this.R = (hp9) phd.d.a();
        ap9 ap9Var = new ap9(getContext(), this.E);
        ap9Var.c = new File(org.telegram.messenger.a.h(), "cache");
        ap9Var.d = (cp9) phd.i.a();
        ap9Var.e = this.R;
        ap9Var.h = phd.g.a();
        ap9Var.f = (dp9) phd.e.a();
        ap9Var.g = (ep9) phd.f.a();
        im0 im0Var = phd.h;
        im0Var.a();
        ap9Var.i = im0Var.d;
        kj4 kj4Var = this.M0;
        ap9Var.j = kj4Var;
        hkb hkbVar = this.U;
        ap9Var.k = hkbVar;
        ap9Var.l = new e05(this, (byte) 13);
        if (ap9Var.d != null) {
            if (ap9Var.e != null) {
                if (ap9Var.h > 0) {
                    if (ap9Var.f != null) {
                        if (ap9Var.g != null) {
                            if (kj4Var != null) {
                                if (hkbVar != null) {
                                    this.Q = new jp9(ap9Var);
                                    MediaController.z().b0(true);
                                    jp9 jp9Var = this.Q;
                                    jp9Var.getClass();
                                    jp9.v();
                                    if (jp9Var.a0 == 1) {
                                        try {
                                            jp9Var.m.b("start requested");
                                            jp9Var.c(true);
                                            jp9Var.x(2);
                                            jp9Var.l.V(jp9Var.U, 0L, jp9Var.r);
                                        } catch (Exception e) {
                                            jp9Var.h(e);
                                        }
                                    }
                                    w(true);
                                    return;
                                }
                                grb.i("Output listener is required");
                                return;
                            }
                            grb.i("Session listener is required");
                            return;
                        }
                        grb.i("Frame rate is required");
                        return;
                    }
                    grb.i("Camera resolution is required");
                    return;
                }
                grb.i("Video bitrate is required");
                return;
            }
            grb.i("Output resolution is required");
            return;
        }
        grb.i("Initial camera is required");
    }

    public final void w(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        xq5 xq5Var = this.a;
        if (xq5Var != null) {
            ((el1) xq5Var).b.rd.a(z, true);
        }
        AnimatorSet animatorSet = this.c0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.c0.cancel();
        }
        MediaController.z().r0(z);
        vq5 vq5Var = this.w;
        if (z && !this.n0) {
            vq5Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.z0 = measuredHeight;
            vq5Var.setTranslationY(measuredHeight + this.y0);
        }
        this.n0 = z;
        View view = this.s;
        if (view != null) {
            view.invalidate();
        }
        if (!z && Math.max(getCurrentDurationMs(), this.x0) > 300) {
            f = hl.L(24.0f) - (getMeasuredWidth() * 0.5f);
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
        ofFloat.addUpdateListener(new rq5(this, (byte) 0));
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
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(vq5Var, property, f5);
        float f8 = 0.1f;
        if (z) {
            f6 = 1.0f;
        } else {
            f6 = 0.1f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(vq5Var, View.SCALE_X, f6);
        if (z) {
            f8 = 1.0f;
        }
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(vq5Var, View.SCALE_Y, f8);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(vq5Var, View.TRANSLATION_X, f);
        if (this.l0 && z) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(this.J, property, f7), ofFloat);
        this.c0.setDuration(180L);
        this.c0.setInterpolator(new DecelerateInterpolator());
        if (!z) {
            this.c0.addListener(new ad5(this, (byte) 3));
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
        jn7.e().k(jn7.k1, 512);
    }

    public final void y() {
        ip9 ip9Var;
        jp9 jp9Var = this.Q;
        if (jp9Var != null && (ip9Var = this.S) != null) {
            int i = ip9Var.a;
            if (i == 3) {
                r();
            } else if (i == 5) {
                jp9.v();
                if (jp9Var.a0 == 5 && jp9Var.L - jp9Var.K < jp9Var.q) {
                    jp9Var.Q++;
                    jp9Var.D = false;
                    jp9Var.m.b("resume requested: trim=" + jp9Var.K + ".." + jp9Var.L + ", sourceDurationMs=" + jp9Var.I);
                    jp9Var.t();
                    jp9Var.x(6);
                    jp9Var.j.execute(new va7(jp9Var, jp9Var.l(), jp9Var.U, jp9Var.T, jp9Var.V, (byte) 18));
                    this.V = null;
                    this.j0 = true;
                    this.k0 = false;
                }
            }
        }
    }

    public final void z() {
        boolean z;
        bp9 bp9Var;
        ip9 ip9Var = this.S;
        boolean z2 = false;
        if (ip9Var != null && ip9Var.a == 3 && !ip9Var.f && !this.q0) {
            z = true;
        } else {
            z = false;
        }
        this.H.setEnabled(z);
        if (z && (bp9Var = this.T) != null && bp9Var.b != 1) {
            z2 = true;
        }
        this.I.setEnabled(z2);
        A();
    }
}
