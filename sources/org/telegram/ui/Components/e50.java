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
public final class e50 extends j50 implements org.telegram.messenger.vs {
    public static final int[] l1 = {285904780, -1394191079};
    public volatile boolean A0;
    public volatile String B0;
    public float C0;
    public ci0 D;
    public float D0;
    public ci0 E;
    public final float[] E0;
    public final ImageView F;
    public final float[] F0;
    public float G;
    public final float[] G0;
    public CameraInfo H;
    public FloatBuffer H0;
    public boolean I;
    public FloatBuffer I0;
    public volatile boolean J;
    public FloatBuffer J0;
    public AnimatorSet K;
    public float K0;
    public TLRPC.InputFile L;
    public float L0;
    public TLRPC.InputEncryptedFile M;
    public Size M0;
    public byte[] N;
    public boolean N0;
    public byte[] O;
    public final View O0;
    public long P;
    public boolean P0;
    public final boolean Q;
    public float Q0;
    public org.telegram.messenger.y20 R;
    public float R0;
    public v61 S;
    public boolean S0;
    public Bitmap T;
    public boolean T0;
    public final int U;
    public int U0;
    public volatile boolean V;
    public int V0;
    public final int[] W;
    public int W0;
    public boolean X0;
    public final org.telegram.ui.ActionBar.p6 Y0;
    public boolean Z0;
    public final int[] f25695a0;
    public final LinearLayout f25696a1;
    public final int[] f25697b0;
    public final int f25698b1;
    public float f25699c0;
    public Boolean f25700c1;
    public AnimatorSet f25701d0;
    public boolean f25702d1;
    public final int e;
    public org.telegram.messenger.qe f25703e0;
    public boolean f25704e1;
    public final m40 f25705f;
    public File f25706f0;
    public boolean f25707f1;
    public long f25708g0;
    public Timer f25709g1;
    public final s40 h;
    public long f25710h0;
    public x40 f25711h1;
    public boolean f25712i0;
    public Bitmap f25713i1;
    public long f25714j0;
    public volatile int f25715j1;
    public boolean f25716k0;
    public ValueAnimator f25717k1;
    public r40 f25718l0;
    public final Size[] m0;
    public final l40 f25719n;
    public Size f25720n0;
    public final Size f25721o0;
    public TextureView f25722p0;
    public final org.telegram.ui.ll f25723q0;
    public final RectF f25724r;
    public final boolean f25725r0;
    public final vh.x1 f25726s;
    public CameraSession f25727s0;
    public boolean f25728t0;
    public final Camera2Session[] f25729u0;
    public Camera2Session f25730v0;
    public final vh.x1 f25731w;
    public boolean f25732w0;
    public final vh.z1 f25733x;
    public volatile long f25734x0;
    public ci0 f25735y;
    public volatile int f25736y0;
    public volatile int f25737z0;

    public e50(Context context, s40 s40Var, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        Size size;
        float f7;
        int i10 = org.telegram.messenger.e20.f15506s0;
        this.e = i10;
        this.I = true;
        this.W = new int[2];
        this.f25695a0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f25697b0 = new int[1];
        this.f25699c0 = 1.0f;
        this.m0 = new Size[2];
        if (org.telegram.messenger.uz.f18570z0) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f25721o0 = size;
        this.f25725r0 = org.telegram.messenger.uz.s(i10);
        this.f25729u0 = new Camera2Session[2];
        this.E0 = new float[16];
        this.F0 = new float[16];
        this.G0 = new float[16];
        if (z10) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        this.f25698b1 = org.telegram.messenger.i0.L(f7);
        this.Y0 = p6Var;
        this.O0 = s40Var.getFragmentView();
        setWillNotDraw(false);
        this.h = s40Var;
        this.U = s40Var.getClassGuid();
        this.Q = s40Var.A();
        l40 l40Var = new l40(this, 0);
        this.f25719n = l40Var;
        l40Var.setStyle(Paint.Style.STROKE);
        l40Var.setStrokeCap(Paint.Cap.ROUND);
        l40Var.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        l40Var.setColor(-1);
        this.f25724r = new RectF();
        vh.z1 z1Var = new vh.z1(getContext(), null, this, null);
        this.f25733x = z1Var;
        z1Var.f52255o = 0.5f;
        z1Var.f52254n = vh.z1.f(0.5f);
        z1Var.g();
        addView(z1Var.f52245b, w7.b6.e(-1, -1, 119));
        m40 m40Var = new m40(this, context);
        this.f25705f = m40Var;
        m40Var.setOutlineProvider(new org.telegram.ui.ol(this, 3));
        m40Var.setClipToOutline(true);
        m40Var.setWillNotDraw(false);
        int i11 = org.telegram.messenger.i0.v;
        addView(m40Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(z1Var.f52246c, w7.b6.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f25696a1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f25726s = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.dd.L0(2131754752, null));
        linearLayout.addView((View) imageView, w7.b6.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e50 f26999b;

            {
                this.f26999b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e50 e50Var = this.f26999b;
                        if (e50Var.J) {
                            if (e50Var.f25725r0) {
                                Camera2Session camera2Session = e50Var.f25730v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = e50Var.f25727s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (e50Var.f25718l0 != null) {
                                if (!e50Var.f25728t0) {
                                    e50Var.u();
                                }
                                ci0 ci0Var = e50Var.E;
                                if (ci0Var != null) {
                                    ci0Var.M(0);
                                    e50Var.E.start();
                                }
                                e50Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(gr.h);
                                boolean[] zArr = new boolean[1];
                                j40 j40Var = new j40(e50Var, 0);
                                m40 m40Var2 = e50Var.f25705f;
                                m40Var2.setCameraDistance(m40Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.ll llVar = e50Var.f25723q0;
                                llVar.setCameraDistance(llVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new n40(e50Var, zArr, j40Var));
                                ofFloat.addListener(new org.telegram.ui.ActionBar.g1(e50Var, zArr, j40Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e50 e50Var2 = this.f26999b;
                        e50Var2.f25702d1 = true ^ e50Var2.f25702d1;
                        e50Var2.v();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f25731w = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.b6.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e50 f26999b;

            {
                this.f26999b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        e50 e50Var = this.f26999b;
                        if (e50Var.J) {
                            if (e50Var.f25725r0) {
                                Camera2Session camera2Session = e50Var.f25730v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = e50Var.f25727s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (e50Var.f25718l0 != null) {
                                if (!e50Var.f25728t0) {
                                    e50Var.u();
                                }
                                ci0 ci0Var = e50Var.E;
                                if (ci0Var != null) {
                                    ci0Var.M(0);
                                    e50Var.E.start();
                                }
                                e50Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(gr.h);
                                boolean[] zArr = new boolean[1];
                                j40 j40Var = new j40(e50Var, 0);
                                m40 m40Var2 = e50Var.f25705f;
                                m40Var2.setCameraDistance(m40Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.ll llVar = e50Var.f25723q0;
                                llVar.setCameraDistance(llVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new n40(e50Var, zArr, j40Var));
                                ofFloat.addListener(new org.telegram.ui.ActionBar.g1(e50Var, zArr, j40Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e50 e50Var2 = this.f26999b;
                        e50Var2.f25702d1 = true ^ e50Var2.f25702d1;
                        e50Var2.v();
                        return;
                }
            }
        });
        v();
        if (!z10) {
            z1Var.a(imageView);
            z1Var.a(imageView2);
        } else if (!p6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232793);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.b6.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.b.o(-16777216, 40));
        org.telegram.ui.ll llVar = new org.telegram.ui.ll(this, getContext(), paint);
        this.f25723q0 = llVar;
        int i12 = org.telegram.messenger.i0.v;
        addView(llVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.f25707f1 = false;
        setVisibility(4);
    }

    public static int k(e50 e50Var, int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.d(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static boolean l() {
        int ceil;
        if (!org.telegram.messenger.uz.Y && org.telegram.messenger.uz.o() < 1) {
            int o10 = org.telegram.messenger.uz.o();
            if (org.telegram.messenger.uz.f18500a == -1) {
                int i10 = Build.VERSION.SDK_INT;
                int i11 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.w0.f18945b.getSystemService("activity")).getMemoryClass();
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    try {
                        Locale locale = Locale.ENGLISH;
                        RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu" + i14 + "/cpufreq/cpuinfo_max_freq", "r");
                        String readLine = randomAccessFile.readLine();
                        if (readLine != null) {
                            i13 += Utilities.z(readLine).intValue() / 1000;
                            i12++;
                        }
                        randomAccessFile.close();
                    } catch (Throwable unused) {
                    }
                }
                if (i12 == 0) {
                    ceil = -1;
                } else {
                    ceil = (int) Math.ceil(i13 / i12);
                }
                if (i11 > 2 && memoryClass > 100 && ((i11 > 4 || ceil == -1 || ceil > 1250) && (i11 > 4 || ceil > 1300 || memoryClass > 128 || i10 > 24))) {
                    if (i11 >= 8 && memoryClass > 160 && ((ceil == -1 || ceil > 2050) && (ceil != -1 || i11 != 8 || i10 > 23))) {
                        org.telegram.messenger.uz.f18500a = 2;
                    } else {
                        org.telegram.messenger.uz.f18500a = 1;
                    }
                } else {
                    org.telegram.messenger.uz.f18500a = 0;
                }
            }
            if (Math.max(o10, org.telegram.messenger.uz.f18500a) != 2) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                int i15 = 0;
                while (true) {
                    int[] iArr = l1;
                    if (i15 >= 2) {
                        return false;
                    }
                    if (iArr[i15] == hashCode) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return true;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        t();
        v61 v61Var = this.S;
        if (v61Var != null) {
            v61Var.m0();
            this.S = null;
        }
        if (this.f25722p0 == null) {
            return;
        }
        this.f25716k0 = true;
        this.f25712i0 = false;
        this.f25702d1 = false;
        v();
        org.telegram.messenger.at f7 = org.telegram.messenger.at.f(this.e);
        Integer valueOf = Integer.valueOf(this.U);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        f7.k(org.telegram.messenger.at.f14751n2, valueOf, Integer.valueOf(i10));
        if (this.f25718l0 != null) {
            q();
            this.f25718l0.a(0, true, 0, 0, 0L);
            this.f25718l0 = null;
        } else {
            x40 x40Var = this.f25711h1;
            if (x40Var != null) {
                x40Var.i(0, new u40(0, 0, 0L, 0L, true));
            }
        }
        if (this.f25703e0 != null) {
            if (org.telegram.messenger.v2.f18578a) {
                org.telegram.messenger.f8.d("delete camera file by cancel");
            }
            this.f25703e0.delete();
            org.telegram.messenger.c1.b(this.f25703e0);
            this.f25703e0 = null;
        }
        MediaController.B().Y(false);
        r(false, false);
        invalidate();
    }

    @Override
    public final void b(float f7, int i10) {
        v61 v61Var = this.S;
        if (v61Var != null) {
            if (i10 == 0) {
                s();
                this.S.h0();
            } else if (i10 == 1) {
                t();
                this.S.g0();
            } else if (i10 == 2) {
                v61Var.q0(f7 * ((float) v61Var.U()), false);
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f25725r0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f25729u0;
                if (i10 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i10];
                if (camera2Session != null) {
                    camera2Session.destroy(z10);
                    camera2SessionArr[i10] = null;
                }
                i10++;
            }
        } else {
            CameraSession cameraSession = this.f25727s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f25727s0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        m40 m40Var = this.f25705f;
        m40Var.setTranslationX(0.0f);
        this.f25723q0.setTranslationX(0.0f);
        this.D0 = 0.0f;
        w();
        MediaController.B().c0();
        TextureView textureView = this.f25722p0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f25722p0);
        }
        this.f25722p0 = null;
        m40Var.setImageReceiver(null);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.U1) {
            String str = (String) objArr[0];
            org.telegram.messenger.qe qeVar = this.f25703e0;
            if (qeVar != null && qeVar.getAbsolutePath().equals(str)) {
                this.L = (TLRPC.InputFile) objArr[1];
                this.M = (TLRPC.InputEncryptedFile) objArr[2];
                this.P = ((Long) objArr[5]).longValue();
                if (this.M != null) {
                    this.N = (byte[]) objArr[3];
                    this.O = (byte[]) objArr[4];
                }
            }
        }
    }

    @Override
    public final boolean e() {
        return !this.f25712i0;
    }

    @Override
    public final void f(float f7) {
        this.C0 = f7 / 2.0f;
        w();
    }

    @Override
    public final void g(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        int i13;
        int i14;
        long j12;
        if (this.f25722p0 != null) {
            t();
            v61 v61Var = this.S;
            if (v61Var != null) {
                v61Var.m0();
                this.S = null;
            }
            int i15 = 4;
            int i16 = this.e;
            if (i10 == 4) {
                x40 x40Var = this.f25711h1;
                if (x40Var != null && this.f25714j0 > 800) {
                    x40Var.i(1, new u40(i11, i12, j10, j11, z10));
                    return;
                }
                boolean z12 = org.telegram.messenger.v2.f18578a;
                if (!this.f25703e0.exists()) {
                    org.telegram.messenger.f8.g(new RuntimeException("file not found :( round video"), true);
                }
                if (this.R == null) {
                    org.telegram.messenger.y20 y20Var = new org.telegram.messenger.y20();
                    this.R = y20Var;
                    y20Var.f19526a = -1L;
                    y20Var.f19528b = -1L;
                }
                if (this.R.c()) {
                    this.L = null;
                    this.M = null;
                    this.N = null;
                    this.O = null;
                    org.telegram.messenger.y20 y20Var2 = this.R;
                    long j13 = y20Var2.f19542r;
                    double d = j13;
                    long j14 = y20Var2.f19526a;
                    if (j14 >= 0) {
                        j12 = 0;
                    } else {
                        j14 = 0;
                        j12 = 0;
                    }
                    long j15 = y20Var2.f19528b;
                    if (j15 >= j12) {
                        j13 = j15;
                    }
                    long j16 = j13 - j14;
                    y20Var2.f19542r = j16;
                    y20Var2.f19541q = Math.max(1L, (long) ((j16 / d) * this.P));
                    org.telegram.messenger.y20 y20Var3 = this.R;
                    y20Var3.f19537m = 1000000;
                    long j17 = y20Var3.f19526a;
                    if (j17 > j12) {
                        y20Var3.f19526a = j17 * 1000;
                    }
                    long j18 = y20Var3.f19528b;
                    if (j18 > j12) {
                        y20Var3.f19528b = j18 * 1000;
                    }
                    org.telegram.messenger.b8.G(i16).b(this.f25703e0.getAbsolutePath(), false);
                } else {
                    this.R.f19541q = Math.max(1L, this.P);
                }
                org.telegram.messenger.y20 y20Var4 = this.R;
                y20Var4.f19546w = this.L;
                y20Var4.f19547x = this.M;
                y20Var4.f19548y = this.N;
                y20Var4.f19549z = this.O;
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, this.f25703e0.getAbsolutePath(), 0, true, 0, 0);
                ffVar.f14621x = i12;
                ffVar.f14622y = j10;
                this.h.u(ffVar, this.R, z10, i11, 0, false, j11);
                if (i11 != 0) {
                    r(false, false);
                }
                MediaController.B().Y(false);
                return;
            }
            if (this.f25714j0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f25716k0 = z11;
            this.f25712i0 = false;
            this.f25702d1 = false;
            v();
            if (!this.f25716k0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            r40 r40Var = this.f25718l0;
            int i17 = this.U;
            if (r40Var != null) {
                org.telegram.messenger.at.f(i16).k(org.telegram.messenger.at.f14751n2, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f25716k0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                q();
                i13 = i17;
                this.f25718l0.a(i14, z10, i11, i12, j10);
                this.f25718l0 = null;
            } else {
                i13 = i17;
            }
            if (this.f25716k0) {
                org.telegram.messenger.at.f(i16).k(org.telegram.messenger.at.f14789t2, Integer.valueOf(i13), Boolean.TRUE, Integer.valueOf((int) this.f25714j0));
                r(false, false);
                MediaController.B().Y(false);
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.f25696a1;
    }

    @Override
    public RectF getCameraRect() {
        m40 m40Var = this.f25705f;
        int[] iArr = this.W;
        m40Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], m40Var.getWidth() + i10, m40Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.F;
    }

    @Override
    public Paint getPaint() {
        return this.f25719n;
    }

    @Override
    public TextureView getTextureView() {
        return this.f25722p0;
    }

    @Override
    public final void h(tg.b bVar, org.telegram.ui.jj jjVar) {
        View view = this.f25696a1;
        vg.f c10 = bVar.c(view, jjVar, false);
        c10.p(org.telegram.messenger.i0.L(6.0f));
        c10.q(org.telegram.messenger.i0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void i(boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        String absolutePath;
        v61 v61Var;
        if (this.f25722p0 == null) {
            if (this.E == null) {
                int i10 = this.f25698b1;
                ci0 ci0Var = new ci0(2131624185, i10, i10);
                this.E = ci0Var;
                ci0Var.M(0);
                this.E.setCallback(this.f25726s);
            }
            this.f25726s.setImageDrawable(this.E);
            this.f25723q0.setAlpha(1.0f);
            this.f25723q0.invalidate();
            if (this.T == null) {
                try {
                    this.T = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.f25723q0.setImageBitmap(bitmap);
            } else {
                this.f25723q0.setImageResource(2131231493);
            }
            this.J = false;
            this.H = null;
            if (!z10) {
                if (!this.f25725r0) {
                    this.I = true;
                }
                v();
                this.f25714j0 = 0L;
                this.G = 0.0f;
            }
            this.f25716k0 = false;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            this.f25732w0 = true;
            if (o()) {
                if (MediaController.B().f14483u0 != null) {
                    if (!org.telegram.messenger.kj.L4(MediaController.B().f14483u0.f16690k) && !MediaController.B().f14483u0.h4()) {
                        if (org.telegram.messenger.uz.F0 && (v61Var = MediaController.B().f14458i0) != null) {
                            v61Var.g0();
                        }
                    } else {
                        MediaController.B().q(true, true, false, false);
                    }
                }
                if (!z10) {
                    this.f25703e0 = new org.telegram.messenger.qe(2, org.telegram.messenger.b8.z(3), System.currentTimeMillis() + "_" + org.telegram.messenger.uz.p() + ".mp4");
                }
                org.telegram.messenger.uz.y();
                org.telegram.messenger.qe qeVar = this.f25703e0;
                Set set = org.telegram.messenger.c1.f15048a;
                if (qeVar != null && (absolutePath = qeVar.getAbsolutePath()) != null) {
                    org.telegram.messenger.c1.f15048a.add(absolutePath);
                }
                if (org.telegram.messenger.v2.f18578a) {
                    org.telegram.messenger.f8.b("InstantCamera show round camera " + this.f25703e0.getAbsolutePath());
                }
                if (this.f25725r0) {
                    Context context = getContext();
                    SharedPreferences d12 = org.telegram.messenger.wp.d1();
                    if (org.telegram.messenger.uz.o() >= 2 && Camera.getNumberOfCameras() > 1 && org.telegram.messenger.uz.b() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z15 = d12.getBoolean("rounddual_available", z11);
                    this.f25728t0 = z15;
                    if (z15) {
                        for (int i11 = 0; i11 < 2; i11++) {
                            Camera2Session[] camera2SessionArr = this.f25729u0;
                            if (camera2SessionArr[i11] == null) {
                                if (i11 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                camera2SessionArr[i11] = Camera2Session.create(z14, org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19267v3, org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19267v3);
                                Camera2Session camera2Session = this.f25729u0[i11];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.m0[i11] = new Size(this.f25729u0[i11].getPreviewWidth(), this.f25729u0[i11].getPreviewHeight());
                                }
                            }
                        }
                        v();
                        Camera2Session[] camera2SessionArr2 = this.f25729u0;
                        boolean z16 = this.I;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z16 ? 1 : 0];
                        this.f25730v0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z16 ? 1 : 0] == null) {
                            this.f25728t0 = false;
                        }
                        if (org.telegram.messenger.v2.f18578a) {
                            StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                            sb2.append(this.f25728t0);
                            sb2.append(", initialFacing=");
                            if (this.I) {
                                str = "FRONT";
                            } else {
                                str = "BACK";
                            }
                            sb2.append(str);
                            sb2.append(", frontSession=");
                            if (this.f25729u0[0] != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            sb2.append(z12);
                            sb2.append(", backSession=");
                            if (this.f25729u0[1] != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            sb2.append(z13);
                            org.telegram.messenger.f8.b(sb2.toString());
                        }
                        if (this.f25730v0 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f25729u0;
                        boolean z17 = this.I;
                        int i12 = !z17 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z17, org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19267v3, org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19267v3);
                        camera2SessionArr3[i12] = create;
                        this.f25730v0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.m0[0] = new Size(this.f25730v0.getPreviewWidth(), this.f25730v0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f25722p0 = textureView;
                textureView.setSurfaceTextureListener(new li.e(this, 2));
                this.f25705f.addView(this.f25722p0, w7.b6.c(-1.0f, -1));
                this.X0 = true;
                this.f25707f1 = z10;
                setVisibility(0);
                r(true, z10);
                MediaController.B().Y(true);
            }
        }
    }

    @Override
    public final void j() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (this.f25712i0) {
            if (this.f25714j0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f25716k0 = z10;
            this.f25712i0 = false;
            v();
            if (this.f25718l0 != null) {
                org.telegram.messenger.at f7 = org.telegram.messenger.at.f(this.e);
                int i13 = org.telegram.messenger.at.f14751n2;
                Integer valueOf = Integer.valueOf(this.U);
                if (this.f25716k0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                f7.k(i13, valueOf, Integer.valueOf(i10));
                q();
                r40 r40Var = this.f25718l0;
                boolean z11 = this.f25716k0;
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                if (z11) {
                    i12 = 0;
                } else {
                    i12 = -2;
                }
                r40Var.a(i11, true, 0, i12, 0L);
                this.f25718l0 = null;
            }
            if (this.f25716k0) {
                org.telegram.messenger.at.f(this.e).k(org.telegram.messenger.at.f14789t2, Integer.valueOf(this.U), Boolean.TRUE, Integer.valueOf((int) this.f25714j0));
                r(false, false);
                MediaController.B().Y(false);
                return;
            }
            x40 x40Var = this.f25711h1;
            x40Var.T.sendMessage(x40Var.T.obtainMessage(4));
            return;
        }
        x40 x40Var2 = this.f25711h1;
        if (x40Var2 != null) {
            x40Var2.T.sendMessage(x40Var2.T.obtainMessage(5));
            c(false);
            v61 v61Var = this.S;
            if (v61Var != null) {
                v61Var.m0();
                this.S = null;
            }
            i(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.i0.f2(this.h.getParentActivity());
            invalidate();
            org.telegram.messenger.at.f(this.e).k(org.telegram.messenger.at.f14763p2, new Object[0]);
        }
    }

    public final Size m(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 1200;
        if (l()) {
            i10 = 1440;
        } else {
            i10 = 1200;
        }
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
            i11 = i10;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (Math.max(((Size) arrayList.get(i12)).mHeight, ((Size) arrayList.get(i12)).mWidth) <= i11 && Math.min(((Size) arrayList.get(i12)).mHeight, ((Size) arrayList.get(i12)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i12));
            }
        }
        if (!arrayList2.isEmpty() && l()) {
            Collections.sort(arrayList2, new org.telegram.ui.f6(11));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f25721o0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void n() {
        float min;
        if (this.f25717k1 == null) {
            if (this.f25725r0) {
                Camera2Session camera2Session = this.f25730v0;
                if (camera2Session != null) {
                    min = Utilities.i(this.R0, camera2Session.getMaxZoom(), this.f25730v0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.R0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.f25717k1 = ofFloat;
                ofFloat.addUpdateListener(new a6(this, 26));
                this.f25717k1.addListener(new k40(this, 1));
                this.f25717k1.setDuration(350L);
                this.f25717k1.setInterpolator(gr.f26523f);
                this.f25717k1.start();
            }
        }
    }

    public final boolean o() {
        int i10;
        int i11;
        if (!this.f25725r0) {
            ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
            if (cameras != null) {
                CameraInfo cameraInfo = null;
                int i12 = 0;
                while (i12 < cameras.size()) {
                    CameraInfo cameraInfo2 = cameras.get(i12);
                    if (!cameraInfo2.isFrontface()) {
                        cameraInfo = cameraInfo2;
                    }
                    if ((this.I && cameraInfo2.isFrontface()) || (!this.I && !cameraInfo2.isFrontface())) {
                        this.H = cameraInfo2;
                        break;
                    }
                    i12++;
                    cameraInfo = cameraInfo2;
                }
                if (this.H == null) {
                    this.H = cameraInfo;
                }
                CameraInfo cameraInfo3 = this.H;
                if (cameraInfo3 != null) {
                    ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
                    ArrayList<Size> pictureSizes = this.H.getPictureSizes();
                    Size m10 = m(previewSizes);
                    Size[] sizeArr = this.m0;
                    sizeArr[0] = m10;
                    Size m11 = m(pictureSizes);
                    this.f25720n0 = m11;
                    if (sizeArr[0].mWidth != m11.mWidth) {
                        boolean z10 = false;
                        for (int size = previewSizes.size() - 1; size >= 0; size--) {
                            Size size2 = previewSizes.get(size);
                            int size3 = pictureSizes.size() - 1;
                            while (true) {
                                if (size3 < 0) {
                                    break;
                                }
                                Size size4 = pictureSizes.get(size3);
                                int i13 = size2.mWidth;
                                Size size5 = this.f25720n0;
                                if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                                    sizeArr[0] = size2;
                                    this.f25720n0 = size4;
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
                                    int i14 = size7.mWidth;
                                    if (i14 >= 360 && (i10 = size7.mHeight) >= 360 && i14 == size9.mWidth && i10 == size9.mHeight) {
                                        sizeArr[0] = size7;
                                        this.f25720n0 = size9;
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
                    if (org.telegram.messenger.v2.f18578a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
                        sb2.append(sizeArr[0].mWidth);
                        sb2.append(" h = ");
                        i0.a.p(sizeArr[0].mHeight, sb2);
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.at.f(this.e).c(this, org.telegram.messenger.at.U1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.e).n(this, org.telegram.messenger.at.U1);
        vh.z1 z1Var = this.f25733x;
        if (z1Var != null) {
            z1Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m40 m40Var = this.f25705f;
        float x10 = m40Var.getX();
        float y3 = m40Var.getY();
        RectF rectF = this.f25724r;
        rectF.set(x10 - org.telegram.messenger.i0.L(8.0f), y3 - org.telegram.messenger.i0.L(8.0f), x10 + m40Var.getMeasuredWidth() + org.telegram.messenger.i0.L(8.0f), y3 + m40Var.getMeasuredHeight() + org.telegram.messenger.i0.L(8.0f));
        if (this.f25712i0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f25708g0) + this.f25710h0;
            this.f25714j0 = currentTimeMillis;
            this.G = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.G != 0.0f) {
            canvas.save();
            if (!this.N0) {
                canvas.scale(m40Var.getScaleX(), m40Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.G * 360.0f, false, this.f25719n);
            canvas.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.X0) {
            if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
                i12 = org.telegram.messenger.i0.v;
            } else {
                i12 = org.telegram.messenger.i0.f16176u;
            }
            if (i12 != this.W0) {
                this.W0 = i12;
                org.telegram.ui.ll llVar = this.f25723q0;
                ViewGroup.LayoutParams layoutParams = llVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = llVar.getLayoutParams();
                int i13 = this.W0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                m40 m40Var = this.f25705f;
                ViewGroup.LayoutParams layoutParams3 = m40Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = m40Var.getLayoutParams();
                int i14 = this.W0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.F.getLayoutParams()).topMargin = (this.W0 / 2) - org.telegram.messenger.i0.L(24.0f);
                llVar.setRoundRadius(this.W0 / 2);
                m40Var.invalidateOutline();
            }
            this.X0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        vh.z1 z1Var = this.f25733x;
        z1Var.f52245b.measure(makeMeasureSpec, makeMeasureSpec2);
        z1Var.f52246c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.D0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v61 v61Var;
        float f7;
        float f10;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (v61Var = this.S) != null) {
            boolean c02 = v61Var.c0();
            this.S.t0(!c02);
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            if (!c02) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            ImageView imageView = this.F;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, fArr);
            float f11 = 0.5f;
            if (!c02) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f10);
            if (!c02) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f11));
            this.K.addListener(new k40(this, 0));
            this.K.setDuration(180L);
            this.K.setInterpolator(new DecelerateInterpolator());
            this.K.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.S0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (this.U0 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (this.V0 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.Q0;
                    this.R0 = hypot;
                    if (this.f25725r0) {
                        Camera2Session camera2Session = this.f25730v0;
                        if (camera2Session != null) {
                            this.f25730v0.setZoom(Utilities.i(hypot, camera2Session.getMaxZoom(), this.f25730v0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f25727s0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.S0 = false;
                    n();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.U0 == motionEvent.getPointerId(0) && this.V0 == motionEvent.getPointerId(1)) || (this.U0 == motionEvent.getPointerId(1) && this.V0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.S0) {
                this.S0 = false;
                n();
                return true;
            }
        } else {
            if (this.T0 && !this.S0 && motionEvent.getPointerCount() == 2 && this.f25717k1 == null && this.f25712i0) {
                this.Q0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.R0 = 1.0f;
                this.U0 = motionEvent.getPointerId(0);
                this.V0 = motionEvent.getPointerId(1);
                this.S0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.i0.P;
                m40 m40Var = this.f25705f;
                rectF.set(m40Var.getX(), m40Var.getY(), m40Var.getX() + m40Var.getMeasuredWidth(), m40Var.getY() + m40Var.getMeasuredHeight());
                this.T0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p(String str) {
        if (!org.telegram.messenger.v2.f18578a) {
            return;
        }
        long j10 = this.f25734x0;
        long j11 = 0;
        if (j10 != 0) {
            j11 = (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
        }
        org.telegram.messenger.f8.b("InstantCamera legacy switch[" + this.f25736y0 + "] " + str + ", path=" + this.B0 + ", elapsedMs=" + j11 + ", thread=" + Thread.currentThread().getName());
    }

    public final void q() {
        Bitmap bitmap = this.f25722p0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f25722p0.getBitmap(), 50, 50, true);
            this.T = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "icthumb.jpg"));
                    this.T.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float measuredHeight;
        f50 f50Var = this.f27282a;
        if (f50Var != null) {
            ((org.telegram.ui.re) f50Var).f41066b.Sc.a(z10, true);
        }
        AnimatorSet animatorSet = this.f25701d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f25701d0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.ll llVar = this.f25723q0;
        m40 m40Var = this.f25705f;
        if (z10 && !this.P0) {
            m40Var.setTranslationX(0.0f);
            llVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.D0 = measuredHeight;
            w();
        }
        this.P0 = z10;
        View view = this.O0;
        if (view != null) {
            view.invalidate();
        }
        this.f25701d0 = new AnimatorSet();
        if (!z10 && this.f25714j0 > 300) {
            f7 = org.telegram.messenger.i0.L(24.0f) - (getMeasuredWidth() / 2.0f);
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
        ofFloat.addUpdateListener(new jg.o0(5, this, z11));
        AnimatorSet animatorSet2 = this.f25701d0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.f25696a1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, property, 0.0f);
        g6 g6Var = i6.f27007b;
        if (z10) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f25719n, g6Var, i10);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(m40Var, property, f13);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(m40Var, property2, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(m40Var, property3, f15);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(m40Var, property4, f7);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(llVar, property, f16);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(llVar, property2, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(llVar, property3, f18), ObjectAnimator.ofFloat(llVar, property4, f7), ofFloat);
        if (!z10) {
            this.f25701d0.addListener(new k40(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f25701d0.setDuration(180L);
        this.f25701d0.setInterpolator(new DecelerateInterpolator());
        this.f25701d0.start();
    }

    public final void s() {
        Timer timer = this.f25709g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f25709g1 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        Timer timer2 = new Timer();
        this.f25709g1 = timer2;
        timer2.schedule(new e6.r(this, 2), 0L, 17L);
    }

    @Override
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setVisibility(int i10) {
        float f7;
        float f10;
        float f11;
        super.setVisibility(i10);
        this.f25696a1.setAlpha(0.0f);
        m40 m40Var = this.f25705f;
        m40Var.setAlpha(0.0f);
        org.telegram.ui.ll llVar = this.f25723q0;
        llVar.setAlpha(0.0f);
        ImageView imageView = this.F;
        imageView.setAlpha(0.0f);
        float f12 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f25707f1) {
            f7 = 1.0f;
        } else {
            f7 = 0.1f;
        }
        m40Var.setScaleX(f7);
        if (this.f25707f1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        m40Var.setScaleY(f10);
        if (this.f25707f1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        llVar.setScaleX(f11);
        if (!this.f25707f1) {
            f12 = 0.1f;
        }
        llVar.setScaleY(f12);
        if (m40Var.getMeasuredWidth() != 0) {
            m40Var.setPivotX(m40Var.getMeasuredWidth() / 2);
            m40Var.setPivotY(m40Var.getMeasuredHeight() / 2);
            llVar.setPivotX(llVar.getMeasuredWidth() / 2);
            llVar.setPivotY(llVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void t() {
        Timer timer = this.f25709g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f25709g1 = null;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void u() {
        int i10;
        String str;
        String str2;
        this.f25734x0 = SystemClock.elapsedRealtimeNanos();
        this.f25736y0++;
        if (this.f25725r0 && this.f25728t0) {
            i10 = 1 - this.f25715j1;
        } else {
            i10 = 0;
        }
        this.f25737z0 = i10;
        this.A0 = true;
        if (this.f25725r0) {
            if (this.f25728t0) {
                str = "DUAL_PREOPENED";
            } else {
                str = "SEQUENTIAL_CAMERA2";
            }
        } else {
            str = "SEQUENTIAL_CAMERA1";
        }
        this.B0 = str;
        StringBuilder sb2 = new StringBuilder("requested: from=");
        String str3 = "BACK";
        if (!this.I) {
            str2 = "BACK";
        } else {
            str2 = "FRONT";
        }
        sb2.append(str2);
        sb2.append(", to=");
        if (!this.I) {
            str3 = "FRONT";
        }
        sb2.append(str3);
        sb2.append(", currentSurface=");
        sb2.append(this.f25715j1);
        sb2.append(", targetSurface=");
        sb2.append(this.f25737z0);
        p(sb2.toString());
        if (!this.f25725r0 || !this.f25728t0) {
            q();
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.f25732w0 = false;
                this.f25723q0.setImageBitmap(bitmap);
                this.f25723q0.setAlpha(1.0f);
            }
        }
        this.I = !this.I;
        v();
        if (this.f25725r0) {
            if (this.f25728t0) {
                this.f25730v0 = this.f25729u0[!this.I ? 1 : 0];
                r40 r40Var = this.f25718l0;
                Handler handler = r40Var.getHandler();
                if (handler != null) {
                    r40Var.sendMessage(handler.obtainMessage(4), 0);
                    r40Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f25730v0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f25730v0 = null;
                this.f25729u0[this.I ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f25729u0;
            boolean z10 = this.I;
            int i11 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19267v3, org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).f19267v3);
            camera2SessionArr[i11] = create;
            this.f25730v0 = create;
            if (create == null) {
                this.A0 = false;
                p("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.m0[0] = new Size(this.f25730v0.getPreviewWidth(), this.f25730v0.getPreviewHeight());
            r40 r40Var2 = this.f25718l0;
            Camera2Session camera2Session2 = this.f25730v0;
            Handler handler2 = r40Var2.getHandler();
            if (handler2 != null) {
                r40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        } else {
            CameraSession cameraSession = this.f25727s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f25727s0, null, null);
                this.f25727s0 = null;
            }
        }
        o();
        this.J = false;
        r40 r40Var3 = this.f25718l0;
        Handler handler3 = r40Var3.getHandler();
        if (handler3 != null) {
            r40Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (this.f25702d1 && this.f25712i0 && this.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f25704e1 != z10) {
            this.f25704e1 = z10;
            vh.z1 z1Var = this.f25733x;
            if (z10) {
                z1Var.c(null);
            } else {
                z1Var.d();
            }
        }
        if (this.f25725r0) {
            Camera2Session camera2Session = this.f25729u0[1];
            if (camera2Session != null) {
                if (this.f25702d1 && !this.I && this.f25712i0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f25727s0;
            if (cameraSession != null) {
                if (this.f25702d1 && !this.I && this.f25712i0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        vh.x1 x1Var = this.f25731w;
        if (x1Var != null) {
            Boolean bool = this.f25700c1;
            if (bool == null || bool.booleanValue() != this.f25702d1) {
                if (this.f25702d1) {
                    i10 = 2131754914;
                } else {
                    i10 = 2131754913;
                }
                x1Var.setContentDescription(org.telegram.messenger.dd.L0(i10, null));
                boolean z13 = this.f25702d1;
                int i11 = this.f25698b1;
                if (!z13) {
                    if (this.f25735y == null) {
                        ci0 ci0Var = new ci0(2131624184, i11, i11);
                        this.f25735y = ci0Var;
                        ci0Var.setCallback(x1Var);
                    }
                    x1Var.setImageDrawable(this.f25735y);
                    if (this.f25700c1 == null) {
                        ci0 ci0Var2 = this.f25735y;
                        ci0Var2.M(ci0Var2.e[0] - 1);
                    } else {
                        this.f25735y.M(0);
                        this.f25735y.start();
                    }
                } else {
                    if (this.D == null) {
                        ci0 ci0Var3 = new ci0(2131624183, i11, i11);
                        this.D = ci0Var3;
                        ci0Var3.setCallback(x1Var);
                    }
                    x1Var.setImageDrawable(this.D);
                    if (this.f25700c1 == null) {
                        ci0 ci0Var4 = this.D;
                        ci0Var4.M(ci0Var4.e[0] - 1);
                    } else {
                        this.D.M(0);
                        this.D.start();
                    }
                }
                this.f25700c1 = Boolean.valueOf(this.f25702d1);
            }
        }
    }

    public final void w() {
        this.f25723q0.setTranslationY(this.D0 + this.C0);
        this.f25705f.setTranslationY(this.D0 + this.C0);
    }

    @Override
    public t40 getCameraContainer() {
        return this.f25705f;
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
    }
}
