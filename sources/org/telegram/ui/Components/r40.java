package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r40 extends w40 implements org.telegram.messenger.is {
    public static final int[] f38837m1 = {285904780, -1394191079};
    public volatile int A0;
    public volatile boolean B0;
    public volatile String C0;
    public float D0;
    public ch0 E;
    public float E0;
    public ch0 F;
    public final float[] F0;
    public final ImageView G;
    public final float[] G0;
    public float H;
    public final float[] H0;
    public CameraInfo I;
    public FloatBuffer I0;
    public boolean J;
    public FloatBuffer J0;
    public volatile boolean K;
    public FloatBuffer K0;
    public AnimatorSet L;
    public float L0;
    public TLRPC.InputFile M;
    public float M0;
    public TLRPC.InputEncryptedFile N;
    public Size N0;
    public byte[] O;
    public boolean O0;
    public byte[] P;
    public final View P0;
    public long Q;
    public boolean Q0;
    public final boolean R;
    public float R0;
    public org.telegram.messenger.g20 S;
    public float S0;
    public u51 T;
    public boolean T0;
    public Bitmap U;
    public boolean U0;
    public final int V;
    public int V0;
    public volatile boolean W;
    public int W0;
    public int X0;
    public boolean Y0;
    public final org.telegram.ui.ActionBar.e6 Z0;
    public final int[] f38838a0;
    public boolean f38839a1;
    public final int[] f38840b0;
    public final LinearLayout f38841b1;
    public final int[] f38842c0;
    public final int f38843c1;
    public float f38844d0;
    public Boolean f38845d1;
    public final int f38846e;
    public AnimatorSet f38847e0;
    public boolean f38848e1;
    public final x30 f38849f;
    public org.telegram.messenger.oe f38850f0;
    public boolean f38851f1;
    public File f38852g0;
    public boolean f38853g1;
    public final e40 h;
    public long f38854h0;
    public Timer f38855h1;
    public long f38856i0;
    public j40 f38857i1;
    public boolean f38858j0;
    public Bitmap f38859j1;
    public long f38860k0;
    public volatile int f38861k1;
    public boolean f38862l0;
    public ValueAnimator l1;
    public d40 m0;
    public final w30 f38863n;
    public final Size[] f38864n0;
    public Size f38865o0;
    public final Size f38866p0;
    public TextureView f38867q0;
    public final RectF f38868r;
    public final org.telegram.ui.pk f38869r0;
    public final hi.l2 f38870s;
    public final boolean f38871s0;
    public CameraSession f38872t0;
    public boolean f38873u0;
    public final Camera2Session[] f38874v0;
    public final hi.l2 f38875w;
    public Camera2Session f38876w0;
    public final hi.n2 f38877x;
    public boolean f38878x0;
    public ch0 f38879y;
    public volatile long f38880y0;
    public volatile int f38881z0;

    public r40(Context context, e40 e40Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        Size size;
        float f10;
        int i7 = org.telegram.messenger.m10.f24934t0;
        this.f38846e = i7;
        this.J = true;
        this.f38838a0 = new int[2];
        this.f38840b0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f38842c0 = new int[1];
        this.f38844d0 = 1.0f;
        this.f38864n0 = new Size[2];
        if (org.telegram.messenger.gz.f23999z0) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f38866p0 = size;
        this.f38871s0 = org.telegram.messenger.gz.s(i7);
        this.f38874v0 = new Camera2Session[2];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.H0 = new float[16];
        if (z10) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        this.f38843c1 = org.telegram.messenger.g0.L(f10);
        this.Z0 = e6Var;
        this.P0 = e40Var.getFragmentView();
        setWillNotDraw(false);
        this.h = e40Var;
        this.V = e40Var.getClassGuid();
        this.R = e40Var.z();
        w30 w30Var = new w30(this, 0);
        this.f38863n = w30Var;
        w30Var.setStyle(Paint.Style.STROKE);
        w30Var.setStrokeCap(Paint.Cap.ROUND);
        w30Var.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        w30Var.setColor(-1);
        this.f38868r = new RectF();
        hi.n2 n2Var = new hi.n2(getContext(), null, this, null);
        this.f38877x = n2Var;
        n2Var.f14751o = 0.5f;
        n2Var.f14750n = hi.n2.f(0.5f);
        n2Var.g();
        addView(n2Var.f14740b, c8.ja.e(-1, -1, 119));
        x30 x30Var = new x30(this, context);
        this.f38849f = x30Var;
        x30Var.setOutlineProvider(new fh.a(this, 4));
        x30Var.setClipToOutline(true);
        x30Var.setWillNotDraw(false);
        int i10 = org.telegram.messenger.g0.v;
        addView(x30Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(n2Var.f14741c, c8.ja.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38841b1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ja.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f38870s = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        linearLayout.addView((View) imageView, c8.ja.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final r40 f39503b;

            {
                this.f39503b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r40 r40Var = this.f39503b;
                        if (r40Var.K) {
                            if (r40Var.f38871s0) {
                                Camera2Session camera2Session = r40Var.f38876w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = r40Var.f38872t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (r40Var.m0 != null) {
                                if (!r40Var.f38873u0) {
                                    r40Var.v();
                                }
                                ch0 ch0Var = r40Var.F;
                                if (ch0Var != null) {
                                    ch0Var.M(0);
                                    r40Var.F.start();
                                }
                                r40Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(er.h);
                                boolean[] zArr = new boolean[1];
                                u30 u30Var = new u30(r40Var, 0);
                                x30 x30Var2 = r40Var.f38849f;
                                x30Var2.setCameraDistance(x30Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.pk pkVar = r40Var.f38869r0;
                                pkVar.setCameraDistance(pkVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new y30(r40Var, zArr, u30Var));
                                ofFloat.addListener(new fi.c3(r40Var, zArr, u30Var, 7));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        r40 r40Var2 = this.f39503b;
                        r40Var2.f38848e1 = true ^ r40Var2.f38848e1;
                        r40Var2.w();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f38875w = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, c8.ja.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final r40 f39503b;

            {
                this.f39503b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        r40 r40Var = this.f39503b;
                        if (r40Var.K) {
                            if (r40Var.f38871s0) {
                                Camera2Session camera2Session = r40Var.f38876w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = r40Var.f38872t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (r40Var.m0 != null) {
                                if (!r40Var.f38873u0) {
                                    r40Var.v();
                                }
                                ch0 ch0Var = r40Var.F;
                                if (ch0Var != null) {
                                    ch0Var.M(0);
                                    r40Var.F.start();
                                }
                                r40Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(er.h);
                                boolean[] zArr = new boolean[1];
                                u30 u30Var = new u30(r40Var, 0);
                                x30 x30Var2 = r40Var.f38849f;
                                x30Var2.setCameraDistance(x30Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.pk pkVar = r40Var.f38869r0;
                                pkVar.setCameraDistance(pkVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new y30(r40Var, zArr, u30Var));
                                ofFloat.addListener(new fi.c3(r40Var, zArr, u30Var, 7));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        r40 r40Var2 = this.f39503b;
                        r40Var2.f38848e1 = true ^ r40Var2.f38848e1;
                        r40Var2.w();
                        return;
                }
            }
        });
        w();
        if (!z10) {
            n2Var.a(imageView);
            n2Var.a(imageView2);
        } else if (!e6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.G = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232796);
        imageView3.setAlpha(0.0f);
        addView(imageView3, c8.ja.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.o(-16777216, 40));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, getContext(), paint);
        this.f38869r0 = pkVar;
        int i11 = org.telegram.messenger.g0.v;
        addView(pkVar, new FrameLayout.LayoutParams(i11, i11, 17));
        this.f38853g1 = false;
        setVisibility(4);
    }

    public static int l(r40 r40Var, int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.a8.d(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static boolean m() {
        int ceil;
        if (!org.telegram.messenger.gz.Y && org.telegram.messenger.gz.o() < 1) {
            int o4 = org.telegram.messenger.gz.o();
            if (org.telegram.messenger.gz.f23929a == -1) {
                int i7 = Build.VERSION.SDK_INT;
                int i10 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.t0.f26600b.getSystemService("activity")).getMemoryClass();
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    try {
                        Locale locale = Locale.ENGLISH;
                        RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq", "r");
                        String readLine = randomAccessFile.readLine();
                        if (readLine != null) {
                            i12 += Utilities.z(readLine).intValue() / 1000;
                            i11++;
                        }
                        randomAccessFile.close();
                    } catch (Throwable unused) {
                    }
                }
                if (i11 == 0) {
                    ceil = -1;
                } else {
                    ceil = (int) Math.ceil(i12 / i11);
                }
                if (i10 > 2 && memoryClass > 100 && ((i10 > 4 || ceil == -1 || ceil > 1250) && (i10 > 4 || ceil > 1300 || memoryClass > 128 || i7 > 24))) {
                    if (i10 >= 8 && memoryClass > 160 && ((ceil == -1 || ceil > 2050) && (ceil != -1 || i10 != 8 || i7 > 23))) {
                        org.telegram.messenger.gz.f23929a = 2;
                    } else {
                        org.telegram.messenger.gz.f23929a = 1;
                    }
                } else {
                    org.telegram.messenger.gz.f23929a = 0;
                }
            }
            if (Math.max(o4, org.telegram.messenger.gz.f23929a) != 2) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                int i14 = 0;
                while (true) {
                    int[] iArr = f38837m1;
                    if (i14 >= 2) {
                        return false;
                    }
                    if (iArr[i14] == hashCode) {
                        break;
                    }
                    i14++;
                }
            }
        }
        return true;
    }

    @Override
    public final void a(boolean z10) {
        int i7;
        u();
        u51 u51Var = this.T;
        if (u51Var != null) {
            u51Var.m0();
            this.T = null;
        }
        if (this.f38867q0 == null) {
            return;
        }
        this.f38862l0 = true;
        this.f38858j0 = false;
        this.f38848e1 = false;
        w();
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(this.f38846e);
        Integer valueOf = Integer.valueOf(this.V);
        if (z10) {
            i7 = 0;
        } else {
            i7 = 6;
        }
        f10.k(org.telegram.messenger.ns.f25538n2, valueOf, Integer.valueOf(i7));
        if (this.m0 != null) {
            r();
            this.m0.a(0, true, 0, 0, 0L);
            this.m0 = null;
        } else {
            j40 j40Var = this.f38857i1;
            if (j40Var != null) {
                j40Var.i(0, new g40(0, 0, 0L, 0L, true));
            }
        }
        if (this.f38850f0 != null) {
            if (org.telegram.messenger.r2.f26198a) {
                org.telegram.messenger.a8.d("delete camera file by cancel");
            }
            this.f38850f0.delete();
            org.telegram.messenger.z0.b(this.f38850f0);
            this.f38850f0 = null;
        }
        MediaController.B().Y(false);
        s(false, false);
        invalidate();
    }

    @Override
    public final void b(float f10, int i7) {
        u51 u51Var = this.T;
        if (u51Var != null) {
            if (i7 == 0) {
                t();
                this.T.h0();
            } else if (i7 == 1) {
                u();
                this.T.g0();
            } else if (i7 == 2) {
                u51Var.q0(f10 * ((float) u51Var.U()), false);
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        CountDownLatch countDownLatch;
        if (this.f38871s0) {
            int i7 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f38874v0;
                if (i7 < camera2SessionArr.length) {
                    Camera2Session camera2Session = camera2SessionArr[i7];
                    if (camera2Session != null) {
                        camera2Session.destroy(z10);
                        camera2SessionArr[i7] = null;
                    }
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            CameraSession cameraSession = this.f38872t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f38872t0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
    }

    @Override
    public final void d(boolean z10) {
        ViewGroup viewGroup;
        c(z10);
        x30 x30Var = this.f38849f;
        x30Var.setTranslationX(0.0f);
        this.f38869r0.setTranslationX(0.0f);
        this.E0 = 0.0f;
        x();
        MediaController.B().c0();
        TextureView textureView = this.f38867q0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f38867q0);
        }
        this.f38867q0 = null;
        x30Var.setImageReceiver(null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.U1) {
            String str = (String) objArr[0];
            org.telegram.messenger.oe oeVar = this.f38850f0;
            if (oeVar != null && oeVar.getAbsolutePath().equals(str)) {
                this.M = (TLRPC.InputFile) objArr[1];
                this.N = (TLRPC.InputEncryptedFile) objArr[2];
                this.Q = ((Long) objArr[5]).longValue();
                if (this.N != null) {
                    this.O = (byte[]) objArr[3];
                    this.P = (byte[]) objArr[4];
                }
            }
        }
    }

    @Override
    public final boolean f() {
        return !this.f38858j0;
    }

    @Override
    public final void g(float f10) {
        this.D0 = f10 / 2.0f;
        x();
    }

    @Override
    public View getButtonsLayout() {
        return this.f38841b1;
    }

    @Override
    public RectF getCameraRect() {
        x30 x30Var = this.f38849f;
        int[] iArr = this.f38838a0;
        x30Var.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new RectF(i7, iArr[1], x30Var.getWidth() + i7, x30Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.G;
    }

    @Override
    public Paint getPaint() {
        return this.f38863n;
    }

    @Override
    public TextureView getTextureView() {
        return this.f38867q0;
    }

    @Override
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j11;
        if (this.f38867q0 != null) {
            u();
            u51 u51Var = this.T;
            if (u51Var != null) {
                u51Var.m0();
                this.T = null;
            }
            int i14 = 4;
            int i15 = this.f38846e;
            if (i7 == 4) {
                j40 j40Var = this.f38857i1;
                if (j40Var != null && this.f38860k0 > 800) {
                    j40Var.i(1, new g40(i10, i11, j3, j10, z10));
                    return;
                }
                boolean z12 = org.telegram.messenger.r2.f26198a;
                if (!this.f38850f0.exists()) {
                    org.telegram.messenger.a8.g(new RuntimeException("file not found :( round video"), true);
                }
                if (this.S == null) {
                    org.telegram.messenger.g20 g20Var = new org.telegram.messenger.g20();
                    this.S = g20Var;
                    g20Var.f23632a = -1L;
                    g20Var.f23634b = -1L;
                }
                if (this.S.c()) {
                    this.M = null;
                    this.N = null;
                    this.O = null;
                    this.P = null;
                    org.telegram.messenger.g20 g20Var2 = this.S;
                    long j12 = g20Var2.f23649r;
                    double d = j12;
                    long j13 = g20Var2.f23632a;
                    if (j13 >= 0) {
                        j11 = 0;
                    } else {
                        j13 = 0;
                        j11 = 0;
                    }
                    long j14 = g20Var2.f23634b;
                    if (j14 >= j11) {
                        j12 = j14;
                    }
                    long j15 = j12 - j13;
                    g20Var2.f23649r = j15;
                    g20Var2.f23648q = Math.max(1L, (long) ((j15 / d) * this.Q));
                    org.telegram.messenger.g20 g20Var3 = this.S;
                    g20Var3.f23644m = 1000000;
                    long j16 = g20Var3.f23632a;
                    if (j16 > j11) {
                        g20Var3.f23632a = j16 * 1000;
                    }
                    long j17 = g20Var3.f23634b;
                    if (j17 > j11) {
                        g20Var3.f23634b = j17 * 1000;
                    }
                    org.telegram.messenger.w7.G(i15).b(this.f38850f0.getAbsolutePath(), false);
                } else {
                    this.S.f23648q = Math.max(1L, this.Q);
                }
                org.telegram.messenger.g20 g20Var4 = this.S;
                g20Var4.f23653w = this.M;
                g20Var4.f23654x = this.N;
                g20Var4.f23655y = this.O;
                g20Var4.f23656z = this.P;
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, this.f38850f0.getAbsolutePath(), 0, true, 0, 0);
                ffVar.f27727x = i11;
                ffVar.f27728y = j3;
                this.h.u(ffVar, this.S, z10, i10, 0, false, j10);
                if (i10 != 0) {
                    s(false, false);
                }
                MediaController.B().Y(false);
                return;
            }
            if (this.f38860k0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f38862l0 = z11;
            this.f38858j0 = false;
            this.f38848e1 = false;
            w();
            if (!this.f38862l0) {
                if (i7 == 3) {
                    i14 = 2;
                } else {
                    i14 = 5;
                }
            }
            d40 d40Var = this.m0;
            int i16 = this.V;
            if (d40Var != null) {
                org.telegram.messenger.ns.f(i15).k(org.telegram.messenger.ns.f25538n2, Integer.valueOf(i16), Integer.valueOf(i14));
                if (this.f38862l0) {
                    i13 = 0;
                } else if (i7 == 3) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                r();
                i12 = i16;
                this.m0.a(i13, z10, i10, i11, j3);
                this.m0 = null;
            } else {
                i12 = i16;
            }
            if (this.f38862l0) {
                org.telegram.messenger.ns.f(i15).k(org.telegram.messenger.ns.f25575t2, Integer.valueOf(i12), Boolean.TRUE, Integer.valueOf((int) this.f38860k0));
                s(false, false);
                MediaController.B().Y(false);
            }
        }
    }

    @Override
    public final void i(dh.c cVar, org.telegram.ui.oi oiVar) {
        View view = this.f38841b1;
        fh.g c10 = cVar.c(view, oiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void j(boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        String absolutePath;
        u51 u51Var;
        if (this.f38867q0 == null) {
            if (this.F == null) {
                int i7 = this.f38843c1;
                ch0 ch0Var = new ch0(2131624188, i7, i7);
                this.F = ch0Var;
                ch0Var.M(0);
                this.F.setCallback(this.f38870s);
            }
            this.f38870s.setImageDrawable(this.F);
            this.f38869r0.setAlpha(1.0f);
            this.f38869r0.invalidate();
            if (this.U == null) {
                try {
                    this.U = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f38869r0.setImageBitmap(bitmap);
            } else {
                this.f38869r0.setImageResource(2131231492);
            }
            this.K = false;
            this.I = null;
            if (!z10) {
                if (!this.f38871s0) {
                    this.J = true;
                }
                w();
                this.f38860k0 = 0L;
                this.H = 0.0f;
            }
            this.f38862l0 = false;
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            this.f38878x0 = true;
            if (p()) {
                if (MediaController.B().f22377v0 != null) {
                    if (!org.telegram.messenger.gj.L4(MediaController.B().f22377v0.f23817k) && !MediaController.B().f22377v0.h4()) {
                        if (org.telegram.messenger.gz.F0 && (u51Var = MediaController.B().f22353j0) != null) {
                            u51Var.g0();
                        }
                    } else {
                        MediaController.B().q(true, true, false, false);
                    }
                }
                if (!z10) {
                    this.f38850f0 = new org.telegram.messenger.oe(2, org.telegram.messenger.w7.z(3), System.currentTimeMillis() + "_" + org.telegram.messenger.gz.p() + ".mp4");
                }
                org.telegram.messenger.gz.y();
                org.telegram.messenger.oe oeVar = this.f38850f0;
                Set set = org.telegram.messenger.z0.f27858a;
                if (oeVar != null && (absolutePath = oeVar.getAbsolutePath()) != null) {
                    org.telegram.messenger.z0.f27858a.add(absolutePath);
                }
                if (org.telegram.messenger.r2.f26198a) {
                    org.telegram.messenger.a8.b("InstantCamera show round camera " + this.f38850f0.getAbsolutePath());
                }
                if (this.f38871s0) {
                    Context context = getContext();
                    SharedPreferences e12 = org.telegram.messenger.np.e1();
                    if (org.telegram.messenger.gz.o() >= 2 && Camera.getNumberOfCameras() > 1 && org.telegram.messenger.gz.b() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z15 = e12.getBoolean("rounddual_available", z11);
                    this.f38873u0 = z15;
                    if (z15) {
                        for (int i10 = 0; i10 < 2; i10++) {
                            Camera2Session[] camera2SessionArr = this.f38874v0;
                            if (camera2SessionArr[i10] == null) {
                                if (i10 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                camera2SessionArr[i10] = Camera2Session.create(z14, org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25424w3, org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25424w3);
                                Camera2Session camera2Session = this.f38874v0[i10];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f38864n0[i10] = new Size(this.f38874v0[i10].getPreviewWidth(), this.f38874v0[i10].getPreviewHeight());
                                }
                            }
                        }
                        w();
                        Camera2Session[] camera2SessionArr2 = this.f38874v0;
                        boolean z16 = this.J;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z16 ? 1 : 0];
                        this.f38876w0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z16 ? 1 : 0] == null) {
                            this.f38873u0 = false;
                        }
                        if (org.telegram.messenger.r2.f26198a) {
                            StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                            sb2.append(this.f38873u0);
                            sb2.append(", initialFacing=");
                            if (this.J) {
                                str = "FRONT";
                            } else {
                                str = "BACK";
                            }
                            sb2.append(str);
                            sb2.append(", frontSession=");
                            if (this.f38874v0[0] != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            sb2.append(z12);
                            sb2.append(", backSession=");
                            if (this.f38874v0[1] != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            sb2.append(z13);
                            org.telegram.messenger.a8.b(sb2.toString());
                        }
                        if (this.f38876w0 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f38874v0;
                        boolean z17 = this.J;
                        int i11 = !z17 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z17, org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25424w3, org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25424w3);
                        camera2SessionArr3[i11] = create;
                        this.f38876w0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f38864n0[0] = new Size(this.f38876w0.getPreviewWidth(), this.f38876w0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f38867q0 = textureView;
                textureView.setSurfaceTextureListener(new z30(this, 0));
                this.f38849f.addView(this.f38867q0, c8.ja.c(-1.0f, -1));
                this.Y0 = true;
                this.f38853g1 = z10;
                setVisibility(0);
                s(true, z10);
                MediaController.B().Y(true);
            }
        }
    }

    @Override
    public final void k() {
        boolean z10;
        int i7;
        int i10;
        int i11;
        if (this.f38858j0) {
            if (this.f38860k0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f38862l0 = z10;
            this.f38858j0 = false;
            w();
            if (this.m0 != null) {
                org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(this.f38846e);
                int i12 = org.telegram.messenger.ns.f25538n2;
                Integer valueOf = Integer.valueOf(this.V);
                if (this.f38862l0) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                f10.k(i12, valueOf, Integer.valueOf(i7));
                r();
                d40 d40Var = this.m0;
                boolean z11 = this.f38862l0;
                if (z11) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = -2;
                }
                d40Var.a(i10, true, 0, i11, 0L);
                this.m0 = null;
            }
            if (this.f38862l0) {
                org.telegram.messenger.ns.f(this.f38846e).k(org.telegram.messenger.ns.f25575t2, Integer.valueOf(this.V), Boolean.TRUE, Integer.valueOf((int) this.f38860k0));
                s(false, false);
                MediaController.B().Y(false);
                return;
            }
            j40 j40Var = this.f38857i1;
            j40Var.U.sendMessage(j40Var.U.obtainMessage(4));
            return;
        }
        j40 j40Var2 = this.f38857i1;
        if (j40Var2 != null) {
            j40Var2.U.sendMessage(j40Var2.U.obtainMessage(5));
            d(false);
            u51 u51Var = this.T;
            if (u51Var != null) {
                u51Var.m0();
                this.T = null;
            }
            j(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.f2(this.h.getParentActivity());
            invalidate();
            org.telegram.messenger.ns.f(this.f38846e).k(org.telegram.messenger.ns.f25549p2, new Object[0]);
        }
    }

    public final Size n(ArrayList arrayList) {
        int i7;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 1200;
        if (m()) {
            i7 = 1440;
        } else {
            i7 = 1200;
        }
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
            i10 = i7;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (Math.max(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) <= i10 && Math.min(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i11));
            }
        }
        if (!arrayList2.isEmpty() && m()) {
            Collections.sort(arrayList2, new org.telegram.ui.me(8));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f38866p0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void o() {
        float min;
        if (this.l1 == null) {
            if (this.f38871s0) {
                Camera2Session camera2Session = this.f38876w0;
                if (camera2Session != null) {
                    min = Utilities.i(this.S0, camera2Session.getMaxZoom(), this.f38876w0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.S0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.l1 = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 26));
                this.l1.addListener(new v30(this, 1));
                this.l1.setDuration(350L);
                this.l1.setInterpolator(er.f34420f);
                this.l1.start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.f(this.f38846e).c(this, org.telegram.messenger.ns.U1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.f38846e).n(this, org.telegram.messenger.ns.U1);
        hi.n2 n2Var = this.f38877x;
        if (n2Var != null) {
            n2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        x30 x30Var = this.f38849f;
        float x10 = x30Var.getX();
        float y10 = x30Var.getY();
        RectF rectF = this.f38868r;
        rectF.set(x10 - org.telegram.messenger.g0.L(8.0f), y10 - org.telegram.messenger.g0.L(8.0f), x10 + x30Var.getMeasuredWidth() + org.telegram.messenger.g0.L(8.0f), y10 + x30Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        if (this.f38858j0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f38854h0) + this.f38856i0;
            this.f38860k0 = currentTimeMillis;
            this.H = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.H != 0.0f) {
            canvas.save();
            if (!this.O0) {
                canvas.scale(x30Var.getScaleX(), x30Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.H * 360.0f, false, this.f38863n);
            canvas.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.Y0) {
            if (View.MeasureSpec.getSize(i10) - getPaddingBottom() > View.MeasureSpec.getSize(i7) * 1.3f) {
                i11 = org.telegram.messenger.g0.v;
            } else {
                i11 = org.telegram.messenger.g0.f23613u;
            }
            if (i11 != this.X0) {
                this.X0 = i11;
                org.telegram.ui.pk pkVar = this.f38869r0;
                ViewGroup.LayoutParams layoutParams = pkVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = pkVar.getLayoutParams();
                int i12 = this.X0;
                layoutParams2.height = i12;
                layoutParams.width = i12;
                x30 x30Var = this.f38849f;
                ViewGroup.LayoutParams layoutParams3 = x30Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = x30Var.getLayoutParams();
                int i13 = this.X0;
                layoutParams4.height = i13;
                layoutParams3.width = i13;
                ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (this.X0 / 2) - org.telegram.messenger.g0.L(24.0f);
                pkVar.setRoundRadius(this.X0 / 2);
                x30Var.invalidateOutline();
            }
            this.Y0 = false;
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        hi.n2 n2Var = this.f38877x;
        n2Var.f14740b.measure(makeMeasureSpec, makeMeasureSpec2);
        n2Var.f14741c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (getVisibility() != 0) {
            this.E0 = getMeasuredHeight() / 2.0f;
            x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u51 u51Var;
        float f10;
        float f11;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (u51Var = this.T) != null) {
            boolean c02 = u51Var.c0();
            this.T.t0(!c02);
            AnimatorSet animatorSet = this.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.L = animatorSet2;
            if (!c02) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            ImageView imageView = this.G;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, fArr);
            float f12 = 0.5f;
            if (!c02) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f11);
            if (!c02) {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f12));
            this.L.addListener(new v30(this, 0));
            this.L.setDuration(180L);
            this.L.setInterpolator(new DecelerateInterpolator());
            this.L.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.T0) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (this.V0 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (this.W0 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / this.R0;
                    this.S0 = hypot;
                    if (this.f38871s0) {
                        Camera2Session camera2Session = this.f38876w0;
                        if (camera2Session != null) {
                            this.f38876w0.setZoom(Utilities.i(hypot, camera2Session.getMaxZoom(), this.f38876w0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f38872t0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.T0 = false;
                    o();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.V0 == motionEvent.getPointerId(0) && this.W0 == motionEvent.getPointerId(1)) || (this.V0 == motionEvent.getPointerId(1) && this.W0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.T0) {
                this.T0 = false;
                o();
                return true;
            }
        } else {
            if (this.U0 && !this.T0 && motionEvent.getPointerCount() == 2 && this.l1 == null && this.f38858j0) {
                this.R0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.S0 = 1.0f;
                this.V0 = motionEvent.getPointerId(0);
                this.W0 = motionEvent.getPointerId(1);
                this.T0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                x30 x30Var = this.f38849f;
                rectF.set(x30Var.getX(), x30Var.getY(), x30Var.getX() + x30Var.getMeasuredWidth(), x30Var.getY() + x30Var.getMeasuredHeight());
                this.U0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final boolean p() {
        int i7;
        int i10;
        if (!this.f38871s0) {
            ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
            if (cameras != null) {
                CameraInfo cameraInfo = null;
                int i11 = 0;
                while (i11 < cameras.size()) {
                    CameraInfo cameraInfo2 = cameras.get(i11);
                    if (!cameraInfo2.isFrontface()) {
                        cameraInfo = cameraInfo2;
                    }
                    if ((this.J && cameraInfo2.isFrontface()) || (!this.J && !cameraInfo2.isFrontface())) {
                        this.I = cameraInfo2;
                        break;
                    }
                    i11++;
                    cameraInfo = cameraInfo2;
                }
                if (this.I == null) {
                    this.I = cameraInfo;
                }
                CameraInfo cameraInfo3 = this.I;
                if (cameraInfo3 != null) {
                    ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
                    ArrayList<Size> pictureSizes = this.I.getPictureSizes();
                    Size n10 = n(previewSizes);
                    Size[] sizeArr = this.f38864n0;
                    sizeArr[0] = n10;
                    Size n11 = n(pictureSizes);
                    this.f38865o0 = n11;
                    if (sizeArr[0].mWidth != n11.mWidth) {
                        boolean z10 = false;
                        for (int size = previewSizes.size() - 1; size >= 0; size--) {
                            Size size2 = previewSizes.get(size);
                            int size3 = pictureSizes.size() - 1;
                            while (true) {
                                if (size3 < 0) {
                                    break;
                                }
                                Size size4 = pictureSizes.get(size3);
                                int i12 = size2.mWidth;
                                Size size5 = this.f38865o0;
                                if (i12 >= size5.mWidth && (i10 = size2.mHeight) >= size5.mHeight && i12 == size4.mWidth && i10 == size4.mHeight) {
                                    sizeArr[0] = size2;
                                    this.f38865o0 = size4;
                                    z10 = true;
                                    break;
                                }
                                size3--;
                            }
                            if (z10) {
                                break;
                            }
                        }
                        if (!z10) {
                            for (int size6 = previewSizes.size() - 1; size6 >= 0; size6--) {
                                Size size7 = previewSizes.get(size6);
                                int size8 = pictureSizes.size() - 1;
                                while (true) {
                                    if (size8 < 0) {
                                        break;
                                    }
                                    Size size9 = pictureSizes.get(size8);
                                    int i13 = size7.mWidth;
                                    if (i13 >= 360 && (i7 = size7.mHeight) >= 360 && i13 == size9.mWidth && i7 == size9.mHeight) {
                                        sizeArr[0] = size7;
                                        this.f38865o0 = size9;
                                        z10 = true;
                                        break;
                                    }
                                    size8--;
                                }
                                if (z10) {
                                    break;
                                }
                            }
                        }
                    }
                    if (org.telegram.messenger.r2.f26198a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
                        sb2.append(sizeArr[0].mWidth);
                        sb2.append(" h = ");
                        i5.c.r(sizeArr[0].mHeight, sb2);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void q(String str) {
        if (!org.telegram.messenger.r2.f26198a) {
            return;
        }
        long j3 = this.f38880y0;
        long j10 = 0;
        if (j3 != 0) {
            j10 = (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
        }
        org.telegram.messenger.a8.b("InstantCamera legacy switch[" + this.f38881z0 + "] " + str + ", path=" + this.C0 + ", elapsedMs=" + j10 + ", thread=" + Thread.currentThread().getName());
    }

    public final void r() {
        Bitmap bitmap = this.f38867q0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f38867q0.getBitmap(), 50, 50, true);
            this.U = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                    this.U.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i7;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float measuredHeight;
        s40 s40Var = this.f41252a;
        if (s40Var != null) {
            ((org.telegram.ui.ce) s40Var).f46084b.f45160cd.a(z10, true);
        }
        AnimatorSet animatorSet = this.f38847e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f38847e0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.pk pkVar = this.f38869r0;
        x30 x30Var = this.f38849f;
        if (z10 && !this.Q0) {
            x30Var.setTranslationX(0.0f);
            pkVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.E0 = measuredHeight;
            x();
        }
        this.Q0 = z10;
        View view = this.P0;
        if (view != null) {
            view.invalidate();
        }
        this.f38847e0 = new AnimatorSet();
        if (!z10 && this.f38860k0 > 300) {
            f10 = org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() / 2.0f);
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
        ofFloat.addUpdateListener(new ch.u(7, this, z11));
        AnimatorSet animatorSet2 = this.f38847e0;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float[] fArr = {f13};
        LinearLayout linearLayout = this.f38841b1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.G, property, 0.0f);
        i6 i6Var = k6.f36298b;
        if (z10) {
            i7 = 255;
        } else {
            i7 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f38863n, i6Var, i7);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(x30Var, property, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x30Var, property2, f15);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(x30Var, property3, f16);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(x30Var, property4, f10);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(pkVar, property, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(pkVar, property2, f18);
        if (z10) {
            f19 = 1.0f;
        } else {
            f19 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(pkVar, property3, f19), ObjectAnimator.ofFloat(pkVar, property4, f10), ofFloat);
        if (!z10) {
            this.f38847e0.addListener(new v30(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f38847e0.setDuration(180L);
        this.f38847e0.setInterpolator(new DecelerateInterpolator());
        this.f38847e0.start();
    }

    @Override
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override
    public void setVisibility(int i7) {
        float f10;
        float f11;
        float f12;
        super.setVisibility(i7);
        this.f38841b1.setAlpha(0.0f);
        x30 x30Var = this.f38849f;
        x30Var.setAlpha(0.0f);
        org.telegram.ui.pk pkVar = this.f38869r0;
        pkVar.setAlpha(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        float f13 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f38853g1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        x30Var.setScaleX(f10);
        if (this.f38853g1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        x30Var.setScaleY(f11);
        if (this.f38853g1) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        pkVar.setScaleX(f12);
        if (!this.f38853g1) {
            f13 = 0.1f;
        }
        pkVar.setScaleY(f13);
        if (x30Var.getMeasuredWidth() != 0) {
            x30Var.setPivotX(x30Var.getMeasuredWidth() / 2);
            x30Var.setPivotY(x30Var.getMeasuredHeight() / 2);
            pkVar.setPivotX(pkVar.getMeasuredWidth() / 2);
            pkVar.setPivotY(pkVar.getMeasuredHeight() / 2);
        }
        try {
            if (i7 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t() {
        Timer timer = this.f38855h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f38855h1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        Timer timer2 = new Timer();
        this.f38855h1 = timer2;
        timer2.schedule(new h6.r(this, 2), 0L, 17L);
    }

    public final void u() {
        Timer timer = this.f38855h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f38855h1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void v() {
        int i7;
        String str;
        String str2;
        this.f38880y0 = SystemClock.elapsedRealtimeNanos();
        this.f38881z0++;
        if (this.f38871s0 && this.f38873u0) {
            i7 = 1 - this.f38861k1;
        } else {
            i7 = 0;
        }
        this.A0 = i7;
        this.B0 = true;
        if (this.f38871s0) {
            if (this.f38873u0) {
                str = "DUAL_PREOPENED";
            } else {
                str = "SEQUENTIAL_CAMERA2";
            }
        } else {
            str = "SEQUENTIAL_CAMERA1";
        }
        this.C0 = str;
        StringBuilder sb2 = new StringBuilder("requested: from=");
        String str3 = "BACK";
        if (!this.J) {
            str2 = "BACK";
        } else {
            str2 = "FRONT";
        }
        sb2.append(str2);
        sb2.append(", to=");
        if (!this.J) {
            str3 = "FRONT";
        }
        sb2.append(str3);
        sb2.append(", currentSurface=");
        sb2.append(this.f38861k1);
        sb2.append(", targetSurface=");
        sb2.append(this.A0);
        q(sb2.toString());
        if (!this.f38871s0 || !this.f38873u0) {
            r();
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f38878x0 = false;
                this.f38869r0.setImageBitmap(bitmap);
                this.f38869r0.setAlpha(1.0f);
            }
        }
        this.J = !this.J;
        w();
        if (this.f38871s0) {
            if (this.f38873u0) {
                this.f38876w0 = this.f38874v0[!this.J ? 1 : 0];
                d40 d40Var = this.m0;
                Handler handler = d40Var.getHandler();
                if (handler != null) {
                    d40Var.sendMessage(handler.obtainMessage(4), 0);
                    d40Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f38876w0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f38876w0 = null;
                this.f38874v0[this.J ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f38874v0;
            boolean z10 = this.J;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25424w3, org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).f25424w3);
            camera2SessionArr[i10] = create;
            this.f38876w0 = create;
            if (create == null) {
                this.B0 = false;
                q("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.f38864n0[0] = new Size(this.f38876w0.getPreviewWidth(), this.f38876w0.getPreviewHeight());
            d40 d40Var2 = this.m0;
            Camera2Session camera2Session2 = this.f38876w0;
            Handler handler2 = d40Var2.getHandler();
            if (handler2 != null) {
                d40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        } else {
            CameraSession cameraSession = this.f38872t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f38872t0, null, null);
                this.f38872t0 = null;
            }
        }
        p();
        this.K = false;
        d40 d40Var3 = this.m0;
        Handler handler3 = d40Var3.getHandler();
        if (handler3 != null) {
            d40Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void w() {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        if (this.f38848e1 && this.f38858j0 && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f38851f1 != z10) {
            this.f38851f1 = z10;
            hi.n2 n2Var = this.f38877x;
            if (z10) {
                n2Var.c(null);
            } else {
                n2Var.d();
            }
        }
        if (this.f38871s0) {
            Camera2Session camera2Session = this.f38874v0[1];
            if (camera2Session != null) {
                if (this.f38848e1 && !this.J && this.f38858j0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f38872t0;
            if (cameraSession != null) {
                if (this.f38848e1 && !this.J && this.f38858j0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        hi.l2 l2Var = this.f38875w;
        if (l2Var != null) {
            Boolean bool = this.f38845d1;
            if (bool == null || bool.booleanValue() != this.f38848e1) {
                if (this.f38848e1) {
                    i7 = 2131754914;
                } else {
                    i7 = 2131754913;
                }
                l2Var.setContentDescription(org.telegram.messenger.hd.M0(i7, null));
                boolean z13 = this.f38848e1;
                int i10 = this.f38843c1;
                if (!z13) {
                    if (this.f38879y == null) {
                        ch0 ch0Var = new ch0(2131624187, i10, i10);
                        this.f38879y = ch0Var;
                        ch0Var.setCallback(l2Var);
                    }
                    l2Var.setImageDrawable(this.f38879y);
                    if (this.f38845d1 == null) {
                        ch0 ch0Var2 = this.f38879y;
                        ch0Var2.M(ch0Var2.f33577e[0] - 1);
                    } else {
                        this.f38879y.M(0);
                        this.f38879y.start();
                    }
                } else {
                    if (this.E == null) {
                        ch0 ch0Var3 = new ch0(2131624186, i10, i10);
                        this.E = ch0Var3;
                        ch0Var3.setCallback(l2Var);
                    }
                    l2Var.setImageDrawable(this.E);
                    if (this.f38845d1 == null) {
                        ch0 ch0Var4 = this.E;
                        ch0Var4.M(ch0Var4.f33577e[0] - 1);
                    } else {
                        this.E.M(0);
                        this.E.start();
                    }
                }
                this.f38845d1 = Boolean.valueOf(this.f38848e1);
            }
        }
    }

    public final void x() {
        this.f38869r0.setTranslationY(this.E0 + this.D0);
        this.f38849f.setTranslationY(this.E0 + this.D0);
    }

    @Override
    public f40 getCameraContainer() {
        return this.f38849f;
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
    }
}
