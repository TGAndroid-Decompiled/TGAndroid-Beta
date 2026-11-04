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
public final class k40 extends p40 implements org.telegram.messenger.cs {
    public static final int[] m1 = {285904780, -1394191079};
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
    public org.telegram.messenger.b20 S;
    public float S0;
    public m51 T;
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
    public final int[] f35264a0;
    public boolean f35265a1;
    public final int[] f35266b0;
    public final LinearLayout f35267b1;
    public final int[] f35268c0;
    public final int f35269c1;
    public float f35270d0;
    public Boolean f35271d1;
    public final int f35272e;
    public AnimatorSet f35273e0;
    public boolean f35274e1;
    public final q30 f35275f;
    public org.telegram.messenger.je f35276f0;
    public boolean f35277f1;
    public File f35278g0;
    public boolean f35279g1;
    public final x30 h;
    public long f35280h0;
    public Timer f35281h1;
    public long f35282i0;
    public c40 f35283i1;
    public boolean f35284j0;
    public Bitmap f35285j1;
    public long f35286k0;
    public volatile int k1;
    public boolean f35287l0;
    public ValueAnimator f35288l1;
    public w30 m0;
    public final p30 f35289n;
    public final Size[] f35290n0;
    public Size f35291o0;
    public final Size f35292p0;
    public TextureView f35293q0;
    public final RectF f35294r;
    public final org.telegram.ui.lk f35295r0;
    public final gi.l2 f35296s;
    public final boolean f35297s0;
    public CameraSession f35298t0;
    public boolean f35299u0;
    public final Camera2Session[] f35300v0;
    public final gi.l2 f35301w;
    public Camera2Session f35302w0;
    public final gi.n2 f35303x;
    public boolean f35304x0;
    public ch0 f35305y;
    public volatile long f35306y0;
    public volatile int f35307z0;

    public k40(Context context, x30 x30Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        Size size;
        float f10;
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.f35272e = i3;
        this.J = true;
        this.f35264a0 = new int[2];
        this.f35266b0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f35268c0 = new int[1];
        this.f35270d0 = 1.0f;
        this.f35290n0 = new Size[2];
        if (org.telegram.messenger.az.f21682z0) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f35292p0 = size;
        this.f35297s0 = org.telegram.messenger.az.s(i3);
        this.f35300v0 = new Camera2Session[2];
        this.F0 = new float[16];
        this.G0 = new float[16];
        this.H0 = new float[16];
        if (z10) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        this.f35269c1 = org.telegram.messenger.g0.L(f10);
        this.Z0 = e6Var;
        this.P0 = x30Var.getFragmentView();
        setWillNotDraw(false);
        this.h = x30Var;
        this.V = x30Var.getClassGuid();
        this.R = x30Var.z();
        p30 p30Var = new p30(this, 0);
        this.f35289n = p30Var;
        p30Var.setStyle(Paint.Style.STROKE);
        p30Var.setStrokeCap(Paint.Cap.ROUND);
        p30Var.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        p30Var.setColor(-1);
        this.f35294r = new RectF();
        gi.n2 n2Var = new gi.n2(getContext(), null, this, null);
        this.f35303x = n2Var;
        n2Var.f13292o = 0.5f;
        n2Var.f13291n = gi.n2.f(0.5f);
        n2Var.g();
        addView(n2Var.f13281b, b8.mf.e(-1, -1, 119));
        q30 q30Var = new q30(this, context);
        this.f35275f = q30Var;
        q30Var.setOutlineProvider(new gh.a(this, 4));
        q30Var.setClipToOutline(true);
        q30Var.setWillNotDraw(false);
        int i10 = org.telegram.messenger.g0.v;
        addView(q30Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(n2Var.f13282c, b8.mf.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35267b1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f35296s = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754752, null));
        linearLayout.addView((View) imageView, b8.mf.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k40 f35988b;

            {
                this.f35988b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k40 k40Var = this.f35988b;
                        if (k40Var.K) {
                            if (k40Var.f35297s0) {
                                Camera2Session camera2Session = k40Var.f35302w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = k40Var.f35298t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (k40Var.m0 != null) {
                                if (!k40Var.f35299u0) {
                                    k40Var.u();
                                }
                                ch0 ch0Var = k40Var.F;
                                if (ch0Var != null) {
                                    ch0Var.M(0);
                                    k40Var.F.start();
                                }
                                k40Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                n30 n30Var = new n30(k40Var, 0);
                                q30 q30Var2 = k40Var.f35275f;
                                q30Var2.setCameraDistance(q30Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.lk lkVar = k40Var.f35295r0;
                                lkVar.setCameraDistance(lkVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new r30(k40Var, zArr, n30Var));
                                ofFloat.addListener(new ei.k3(k40Var, zArr, n30Var, 7));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        k40 k40Var2 = this.f35988b;
                        k40Var2.f35274e1 = true ^ k40Var2.f35274e1;
                        k40Var2.v();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f35301w = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, b8.mf.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final k40 f35988b;

            {
                this.f35988b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k40 k40Var = this.f35988b;
                        if (k40Var.K) {
                            if (k40Var.f35297s0) {
                                Camera2Session camera2Session = k40Var.f35302w0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = k40Var.f35298t0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (k40Var.m0 != null) {
                                if (!k40Var.f35299u0) {
                                    k40Var.u();
                                }
                                ch0 ch0Var = k40Var.F;
                                if (ch0Var != null) {
                                    ch0Var.M(0);
                                    k40Var.F.start();
                                }
                                k40Var.O0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                n30 n30Var = new n30(k40Var, 0);
                                q30 q30Var2 = k40Var.f35275f;
                                q30Var2.setCameraDistance(q30Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.lk lkVar = k40Var.f35295r0;
                                lkVar.setCameraDistance(lkVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new r30(k40Var, zArr, n30Var));
                                ofFloat.addListener(new ei.k3(k40Var, zArr, n30Var, 7));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        k40 k40Var2 = this.f35988b;
                        k40Var2.f35274e1 = true ^ k40Var2.f35274e1;
                        k40Var2.v();
                        return;
                }
            }
        });
        v();
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
        imageView3.setImageResource(2131232793);
        imageView3.setAlpha(0.0f);
        addView(imageView3, b8.mf.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.o(-16777216, 40));
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, getContext(), paint);
        this.f35295r0 = lkVar;
        int i11 = org.telegram.messenger.g0.v;
        addView(lkVar, new FrameLayout.LayoutParams(i11, i11, 17));
        this.f35279g1 = false;
        setVisibility(4);
    }

    public static int k(k40 k40Var, int i3, String str) {
        int glCreateShader = GLES20.glCreateShader(i3);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.d(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static boolean l() {
        int ceil;
        if (!org.telegram.messenger.az.Y && org.telegram.messenger.az.o() < 1) {
            int o10 = org.telegram.messenger.az.o();
            if (org.telegram.messenger.az.f21612a == -1) {
                int i3 = Build.VERSION.SDK_INT;
                int i10 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.t0.f25457b.getSystemService("activity")).getMemoryClass();
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
                if (i10 > 2 && memoryClass > 100 && ((i10 > 4 || ceil == -1 || ceil > 1250) && (i10 > 4 || ceil > 1300 || memoryClass > 128 || i3 > 24))) {
                    if (i10 >= 8 && memoryClass > 160 && ((ceil == -1 || ceil > 2050) && (ceil != -1 || i10 != 8 || i3 > 23))) {
                        org.telegram.messenger.az.f21612a = 2;
                    } else {
                        org.telegram.messenger.az.f21612a = 1;
                    }
                } else {
                    org.telegram.messenger.az.f21612a = 0;
                }
            }
            if (Math.max(o10, org.telegram.messenger.az.f21612a) != 2) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                int i14 = 0;
                while (true) {
                    int[] iArr = m1;
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
        int i3;
        t();
        m51 m51Var = this.T;
        if (m51Var != null) {
            m51Var.m0();
            this.T = null;
        }
        if (this.f35293q0 == null) {
            return;
        }
        this.f35287l0 = true;
        this.f35284j0 = false;
        this.f35274e1 = false;
        v();
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(this.f35272e);
        Integer valueOf = Integer.valueOf(this.V);
        if (z10) {
            i3 = 0;
        } else {
            i3 = 6;
        }
        f10.k(org.telegram.messenger.hs.f23271n2, valueOf, Integer.valueOf(i3));
        if (this.m0 != null) {
            q();
            this.m0.a(0, true, 0, 0, 0L);
            this.m0 = null;
        } else {
            c40 c40Var = this.f35283i1;
            if (c40Var != null) {
                c40Var.i(0, new z30(0, 0, 0L, 0L, true));
            }
        }
        if (this.f35276f0 != null) {
            if (org.telegram.messenger.r2.f25040a) {
                org.telegram.messenger.a8.d("delete camera file by cancel");
            }
            this.f35276f0.delete();
            org.telegram.messenger.z0.b(this.f35276f0);
            this.f35276f0 = null;
        }
        MediaController.B().Y(false);
        r(false, false);
        invalidate();
    }

    @Override
    public final void b(float f10, int i3) {
        m51 m51Var = this.T;
        if (m51Var != null) {
            if (i3 == 0) {
                s();
                this.T.h0();
            } else if (i3 == 1) {
                t();
                this.T.g0();
            } else if (i3 == 2) {
                m51Var.q0(f10 * ((float) m51Var.U()), false);
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f35297s0) {
            int i3 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f35300v0;
                if (i3 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i3];
                if (camera2Session != null) {
                    camera2Session.destroy(z10);
                    camera2SessionArr[i3] = null;
                }
                i3++;
            }
        } else {
            CameraSession cameraSession = this.f35298t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f35298t0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        q30 q30Var = this.f35275f;
        q30Var.setTranslationX(0.0f);
        this.f35295r0.setTranslationX(0.0f);
        this.E0 = 0.0f;
        w();
        MediaController.B().c0();
        TextureView textureView = this.f35293q0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f35293q0);
        }
        this.f35293q0 = null;
        q30Var.setImageReceiver(null);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.U1) {
            String str = (String) objArr[0];
            org.telegram.messenger.je jeVar = this.f35276f0;
            if (jeVar != null && jeVar.getAbsolutePath().equals(str)) {
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
    public final boolean e() {
        return !this.f35284j0;
    }

    @Override
    public final void f(float f10) {
        this.D0 = f10 / 2.0f;
        w();
    }

    @Override
    public final void g(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        long j12;
        if (this.f35293q0 != null) {
            t();
            m51 m51Var = this.T;
            if (m51Var != null) {
                m51Var.m0();
                this.T = null;
            }
            int i14 = 4;
            int i15 = this.f35272e;
            if (i3 == 4) {
                c40 c40Var = this.f35283i1;
                if (c40Var != null && this.f35286k0 > 800) {
                    c40Var.i(1, new z30(i10, i11, j10, j11, z10));
                    return;
                }
                boolean z12 = org.telegram.messenger.r2.f25040a;
                if (!this.f35276f0.exists()) {
                    org.telegram.messenger.a8.g(new RuntimeException("file not found :( round video"), true);
                }
                if (this.S == null) {
                    org.telegram.messenger.b20 b20Var = new org.telegram.messenger.b20();
                    this.S = b20Var;
                    b20Var.f21708a = -1L;
                    b20Var.f21710b = -1L;
                }
                if (this.S.c()) {
                    this.M = null;
                    this.N = null;
                    this.O = null;
                    this.P = null;
                    org.telegram.messenger.b20 b20Var2 = this.S;
                    long j13 = b20Var2.f21725r;
                    double d = j13;
                    long j14 = b20Var2.f21708a;
                    if (j14 >= 0) {
                        j12 = 0;
                    } else {
                        j14 = 0;
                        j12 = 0;
                    }
                    long j15 = b20Var2.f21710b;
                    if (j15 >= j12) {
                        j13 = j15;
                    }
                    long j16 = j13 - j14;
                    b20Var2.f21725r = j16;
                    b20Var2.f21724q = Math.max(1L, (long) ((j16 / d) * this.Q));
                    org.telegram.messenger.b20 b20Var3 = this.S;
                    b20Var3.f21720m = 1000000;
                    long j17 = b20Var3.f21708a;
                    if (j17 > j12) {
                        b20Var3.f21708a = j17 * 1000;
                    }
                    long j18 = b20Var3.f21710b;
                    if (j18 > j12) {
                        b20Var3.f21710b = j18 * 1000;
                    }
                    org.telegram.messenger.w7.G(i15).b(this.f35276f0.getAbsolutePath(), false);
                } else {
                    this.S.f21724q = Math.max(1L, this.Q);
                }
                org.telegram.messenger.b20 b20Var4 = this.S;
                b20Var4.f21729w = this.M;
                b20Var4.f21730x = this.N;
                b20Var4.f21731y = this.O;
                b20Var4.f21732z = this.P;
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, this.f35276f0.getAbsolutePath(), 0, true, 0, 0);
                yeVar.f25329x = i11;
                yeVar.f25330y = j10;
                this.h.u(yeVar, this.S, z10, i10, 0, false, j11);
                if (i10 != 0) {
                    r(false, false);
                }
                MediaController.B().Y(false);
                return;
            }
            if (this.f35286k0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f35287l0 = z11;
            this.f35284j0 = false;
            this.f35274e1 = false;
            v();
            if (!this.f35287l0) {
                if (i3 == 3) {
                    i14 = 2;
                } else {
                    i14 = 5;
                }
            }
            w30 w30Var = this.m0;
            int i16 = this.V;
            if (w30Var != null) {
                org.telegram.messenger.hs.f(i15).k(org.telegram.messenger.hs.f23271n2, Integer.valueOf(i16), Integer.valueOf(i14));
                if (this.f35287l0) {
                    i13 = 0;
                } else if (i3 == 3) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                q();
                i12 = i16;
                this.m0.a(i13, z10, i10, i11, j10);
                this.m0 = null;
            } else {
                i12 = i16;
            }
            if (this.f35287l0) {
                org.telegram.messenger.hs.f(i15).k(org.telegram.messenger.hs.f23308t2, Integer.valueOf(i12), Boolean.TRUE, Integer.valueOf((int) this.f35286k0));
                r(false, false);
                MediaController.B().Y(false);
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.f35267b1;
    }

    @Override
    public RectF getCameraRect() {
        q30 q30Var = this.f35275f;
        int[] iArr = this.f35264a0;
        q30Var.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        return new RectF(i3, iArr[1], q30Var.getWidth() + i3, q30Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.G;
    }

    @Override
    public Paint getPaint() {
        return this.f35289n;
    }

    @Override
    public TextureView getTextureView() {
        return this.f35293q0;
    }

    @Override
    public final void h(eh.c cVar, org.telegram.ui.ki kiVar) {
        View view = this.f35267b1;
        gh.g c2 = cVar.c(view, kiVar, false);
        c2.q(org.telegram.messenger.g0.L(6.0f));
        c2.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c2);
    }

    @Override
    public final void i(boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        String absolutePath;
        m51 m51Var;
        if (this.f35293q0 == null) {
            if (this.F == null) {
                int i3 = this.f35269c1;
                ch0 ch0Var = new ch0(2131624187, i3, i3);
                this.F = ch0Var;
                ch0Var.M(0);
                this.F.setCallback(this.f35296s);
            }
            this.f35296s.setImageDrawable(this.F);
            this.f35295r0.setAlpha(1.0f);
            this.f35295r0.invalidate();
            if (this.U == null) {
                try {
                    this.U = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f35295r0.setImageBitmap(bitmap);
            } else {
                this.f35295r0.setImageResource(2131231492);
            }
            this.K = false;
            this.I = null;
            if (!z10) {
                if (!this.f35297s0) {
                    this.J = true;
                }
                v();
                this.f35286k0 = 0L;
                this.H = 0.0f;
            }
            this.f35287l0 = false;
            this.M = null;
            this.N = null;
            this.O = null;
            this.P = null;
            this.f35304x0 = true;
            if (o()) {
                if (MediaController.B().f21348v0 != null) {
                    if (!org.telegram.messenger.zi.M4(MediaController.B().f21348v0.f26868k) && !MediaController.B().f21348v0.i4()) {
                        if (org.telegram.messenger.az.F0 && (m51Var = MediaController.B().f21324j0) != null) {
                            m51Var.g0();
                        }
                    } else {
                        MediaController.B().q(true, true, false, false);
                    }
                }
                if (!z10) {
                    this.f35276f0 = new org.telegram.messenger.je(2, org.telegram.messenger.w7.z(3), System.currentTimeMillis() + "_" + org.telegram.messenger.az.p() + ".mp4");
                }
                org.telegram.messenger.az.y();
                org.telegram.messenger.je jeVar = this.f35276f0;
                Set set = org.telegram.messenger.z0.f26694a;
                if (jeVar != null && (absolutePath = jeVar.getAbsolutePath()) != null) {
                    org.telegram.messenger.z0.f26694a.add(absolutePath);
                }
                if (org.telegram.messenger.r2.f25040a) {
                    org.telegram.messenger.a8.b("InstantCamera show round camera " + this.f35276f0.getAbsolutePath());
                }
                if (this.f35297s0) {
                    Context context = getContext();
                    SharedPreferences e12 = org.telegram.messenger.hp.e1();
                    if (org.telegram.messenger.az.o() >= 2 && Camera.getNumberOfCameras() > 1 && org.telegram.messenger.az.b() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z15 = e12.getBoolean("rounddual_available", z11);
                    this.f35299u0 = z15;
                    if (z15) {
                        for (int i10 = 0; i10 < 2; i10++) {
                            Camera2Session[] camera2SessionArr = this.f35300v0;
                            if (camera2SessionArr[i10] == null) {
                                if (i10 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                camera2SessionArr[i10] = Camera2Session.create(z14, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23153w3, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23153w3);
                                Camera2Session camera2Session = this.f35300v0[i10];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f35290n0[i10] = new Size(this.f35300v0[i10].getPreviewWidth(), this.f35300v0[i10].getPreviewHeight());
                                }
                            }
                        }
                        v();
                        Camera2Session[] camera2SessionArr2 = this.f35300v0;
                        boolean z16 = this.J;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z16 ? 1 : 0];
                        this.f35302w0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z16 ? 1 : 0] == null) {
                            this.f35299u0 = false;
                        }
                        if (org.telegram.messenger.r2.f25040a) {
                            StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                            sb2.append(this.f35299u0);
                            sb2.append(", initialFacing=");
                            if (this.J) {
                                str = "FRONT";
                            } else {
                                str = "BACK";
                            }
                            sb2.append(str);
                            sb2.append(", frontSession=");
                            if (this.f35300v0[0] != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            sb2.append(z12);
                            sb2.append(", backSession=");
                            if (this.f35300v0[1] != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            sb2.append(z13);
                            org.telegram.messenger.a8.b(sb2.toString());
                        }
                        if (this.f35302w0 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f35300v0;
                        boolean z17 = this.J;
                        int i11 = !z17 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z17, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23153w3, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23153w3);
                        camera2SessionArr3[i11] = create;
                        this.f35302w0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f35290n0[0] = new Size(this.f35302w0.getPreviewWidth(), this.f35302w0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f35293q0 = textureView;
                textureView.setSurfaceTextureListener(new s30(this, 0));
                this.f35275f.addView(this.f35293q0, b8.mf.c(-1.0f, -1));
                this.Y0 = true;
                this.f35279g1 = z10;
                setVisibility(0);
                r(true, z10);
                MediaController.B().Y(true);
            }
        }
    }

    @Override
    public final void j() {
        boolean z10;
        int i3;
        int i10;
        int i11;
        if (this.f35284j0) {
            if (this.f35286k0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f35287l0 = z10;
            this.f35284j0 = false;
            v();
            if (this.m0 != null) {
                org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(this.f35272e);
                int i12 = org.telegram.messenger.hs.f23271n2;
                Integer valueOf = Integer.valueOf(this.V);
                if (this.f35287l0) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                f10.k(i12, valueOf, Integer.valueOf(i3));
                q();
                w30 w30Var = this.m0;
                boolean z11 = this.f35287l0;
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
                w30Var.a(i10, true, 0, i11, 0L);
                this.m0 = null;
            }
            if (this.f35287l0) {
                org.telegram.messenger.hs.f(this.f35272e).k(org.telegram.messenger.hs.f23308t2, Integer.valueOf(this.V), Boolean.TRUE, Integer.valueOf((int) this.f35286k0));
                r(false, false);
                MediaController.B().Y(false);
                return;
            }
            c40 c40Var = this.f35283i1;
            c40Var.U.sendMessage(c40Var.U.obtainMessage(4));
            return;
        }
        c40 c40Var2 = this.f35283i1;
        if (c40Var2 != null) {
            c40Var2.U.sendMessage(c40Var2.U.obtainMessage(5));
            c(false);
            m51 m51Var = this.T;
            if (m51Var != null) {
                m51Var.m0();
                this.T = null;
            }
            i(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.f2(this.h.getParentActivity());
            invalidate();
            org.telegram.messenger.hs.f(this.f35272e).k(org.telegram.messenger.hs.f23282p2, new Object[0]);
        }
    }

    public final Size m(ArrayList arrayList) {
        int i3;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 1200;
        if (l()) {
            i3 = 1440;
        } else {
            i3 = 1200;
        }
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
            i10 = i3;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (Math.max(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) <= i10 && Math.min(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i11));
            }
        }
        if (!arrayList2.isEmpty() && l()) {
            Collections.sort(arrayList2, new org.telegram.messenger.tq(29));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f35292p0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void n() {
        float min;
        if (this.f35288l1 == null) {
            if (this.f35297s0) {
                Camera2Session camera2Session = this.f35302w0;
                if (camera2Session != null) {
                    min = Utilities.i(this.S0, camera2Session.getMaxZoom(), this.f35302w0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.S0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.f35288l1 = ofFloat;
                ofFloat.addUpdateListener(new c6(this, 26));
                this.f35288l1.addListener(new o30(this, 1));
                this.f35288l1.setDuration(350L);
                this.f35288l1.setInterpolator(xq.f40452f);
                this.f35288l1.start();
            }
        }
    }

    public final boolean o() {
        int i3;
        int i10;
        if (!this.f35297s0) {
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
                    Size m10 = m(previewSizes);
                    Size[] sizeArr = this.f35290n0;
                    sizeArr[0] = m10;
                    Size m11 = m(pictureSizes);
                    this.f35291o0 = m11;
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
                                int i12 = size2.mWidth;
                                Size size5 = this.f35291o0;
                                if (i12 >= size5.mWidth && (i10 = size2.mHeight) >= size5.mHeight && i12 == size4.mWidth && i10 == size4.mHeight) {
                                    sizeArr[0] = size2;
                                    this.f35291o0 = size4;
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
                                    if (i13 >= 360 && (i3 = size7.mHeight) >= 360 && i13 == size9.mWidth && i3 == size9.mHeight) {
                                        sizeArr[0] = size7;
                                        this.f35291o0 = size9;
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
                    if (org.telegram.messenger.r2.f25040a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
                        sb2.append(sizeArr[0].mWidth);
                        sb2.append(" h = ");
                        k2.p1.q(sizeArr[0].mHeight, sb2);
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
        org.telegram.messenger.hs.f(this.f35272e).c(this, org.telegram.messenger.hs.U1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.f35272e).n(this, org.telegram.messenger.hs.U1);
        gi.n2 n2Var = this.f35303x;
        if (n2Var != null) {
            n2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        q30 q30Var = this.f35275f;
        float x10 = q30Var.getX();
        float y9 = q30Var.getY();
        RectF rectF = this.f35294r;
        rectF.set(x10 - org.telegram.messenger.g0.L(8.0f), y9 - org.telegram.messenger.g0.L(8.0f), x10 + q30Var.getMeasuredWidth() + org.telegram.messenger.g0.L(8.0f), y9 + q30Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        if (this.f35284j0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f35280h0) + this.f35282i0;
            this.f35286k0 = currentTimeMillis;
            this.H = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.H != 0.0f) {
            canvas.save();
            if (!this.O0) {
                canvas.scale(q30Var.getScaleX(), q30Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.H * 360.0f, false, this.f35289n);
            canvas.restore();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (this.Y0) {
            if (View.MeasureSpec.getSize(i10) - getPaddingBottom() > View.MeasureSpec.getSize(i3) * 1.3f) {
                i11 = org.telegram.messenger.g0.v;
            } else {
                i11 = org.telegram.messenger.g0.f22612u;
            }
            if (i11 != this.X0) {
                this.X0 = i11;
                org.telegram.ui.lk lkVar = this.f35295r0;
                ViewGroup.LayoutParams layoutParams = lkVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = lkVar.getLayoutParams();
                int i12 = this.X0;
                layoutParams2.height = i12;
                layoutParams.width = i12;
                q30 q30Var = this.f35275f;
                ViewGroup.LayoutParams layoutParams3 = q30Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = q30Var.getLayoutParams();
                int i13 = this.X0;
                layoutParams4.height = i13;
                layoutParams3.width = i13;
                ((FrameLayout.LayoutParams) this.G.getLayoutParams()).topMargin = (this.X0 / 2) - org.telegram.messenger.g0.L(24.0f);
                lkVar.setRoundRadius(this.X0 / 2);
                q30Var.invalidateOutline();
            }
            this.Y0 = false;
        }
        super.onMeasure(i3, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        gi.n2 n2Var = this.f35303x;
        n2Var.f13281b.measure(makeMeasureSpec, makeMeasureSpec2);
        n2Var.f13282c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (getVisibility() != 0) {
            this.E0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m51 m51Var;
        float f10;
        float f11;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (m51Var = this.T) != null) {
            boolean c02 = m51Var.c0();
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
            this.L.addListener(new o30(this, 0));
            this.L.setDuration(180L);
            this.L.setInterpolator(new DecelerateInterpolator());
            this.L.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.T0) {
                int i3 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (this.V0 == motionEvent.getPointerId(i11)) {
                        i3 = i11;
                    }
                    if (this.W0 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i3 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i3), motionEvent.getY(i10) - motionEvent.getY(i3))) / this.R0;
                    this.S0 = hypot;
                    if (this.f35297s0) {
                        Camera2Session camera2Session = this.f35302w0;
                        if (camera2Session != null) {
                            this.f35302w0.setZoom(Utilities.i(hypot, camera2Session.getMaxZoom(), this.f35302w0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f35298t0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.T0 = false;
                    n();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.V0 == motionEvent.getPointerId(0) && this.W0 == motionEvent.getPointerId(1)) || (this.V0 == motionEvent.getPointerId(1) && this.W0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.T0) {
                this.T0 = false;
                n();
                return true;
            }
        } else {
            if (this.U0 && !this.T0 && motionEvent.getPointerCount() == 2 && this.f35288l1 == null && this.f35284j0) {
                this.R0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.S0 = 1.0f;
                this.V0 = motionEvent.getPointerId(0);
                this.W0 = motionEvent.getPointerId(1);
                this.T0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                q30 q30Var = this.f35275f;
                rectF.set(q30Var.getX(), q30Var.getY(), q30Var.getX() + q30Var.getMeasuredWidth(), q30Var.getY() + q30Var.getMeasuredHeight());
                this.U0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p(String str) {
        if (!org.telegram.messenger.r2.f25040a) {
            return;
        }
        long j10 = this.f35306y0;
        long j11 = 0;
        if (j10 != 0) {
            j11 = (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
        }
        org.telegram.messenger.a8.b("InstantCamera legacy switch[" + this.f35307z0 + "] " + str + ", path=" + this.C0 + ", elapsedMs=" + j11 + ", thread=" + Thread.currentThread().getName());
    }

    public final void q() {
        Bitmap bitmap = this.f35293q0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f35293q0.getBitmap(), 50, 50, true);
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

    public final void r(boolean z10, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i3;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float measuredHeight;
        l40 l40Var = this.f37060a;
        if (l40Var != null) {
            ((org.telegram.ui.de) l40Var).f44668b.f51249ad.a(z10, true);
        }
        AnimatorSet animatorSet = this.f35273e0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f35273e0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.lk lkVar = this.f35295r0;
        q30 q30Var = this.f35275f;
        if (z10 && !this.Q0) {
            q30Var.setTranslationX(0.0f);
            lkVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.E0 = measuredHeight;
            w();
        }
        this.Q0 = z10;
        View view = this.P0;
        if (view != null) {
            view.invalidate();
        }
        this.f35273e0 = new AnimatorSet();
        if (!z10 && this.f35286k0 > 300) {
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
        ofFloat.addUpdateListener(new dh.u(7, this, z11));
        AnimatorSet animatorSet2 = this.f35273e0;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float[] fArr = {f13};
        LinearLayout linearLayout = this.f35267b1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.G, property, 0.0f);
        i6 i6Var = k6.f35323b;
        if (z10) {
            i3 = 255;
        } else {
            i3 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f35289n, i6Var, i3);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(q30Var, property, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(q30Var, property2, f15);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(q30Var, property3, f16);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(q30Var, property4, f10);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(lkVar, property, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(lkVar, property2, f18);
        if (z10) {
            f19 = 1.0f;
        } else {
            f19 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(lkVar, property3, f19), ObjectAnimator.ofFloat(lkVar, property4, f10), ofFloat);
        if (!z10) {
            this.f35273e0.addListener(new o30(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f35273e0.setDuration(180L);
        this.f35273e0.setInterpolator(new DecelerateInterpolator());
        this.f35273e0.start();
    }

    public final void s() {
        Timer timer = this.f35281h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f35281h1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        Timer timer2 = new Timer();
        this.f35281h1 = timer2;
        timer2.schedule(new g6.q(this, 3), 0L, 17L);
    }

    @Override
    public void setInternalPadding(int i3) {
        setPadding(0, 0, 0, i3);
    }

    @Override
    public void setVisibility(int i3) {
        float f10;
        float f11;
        float f12;
        super.setVisibility(i3);
        this.f35267b1.setAlpha(0.0f);
        q30 q30Var = this.f35275f;
        q30Var.setAlpha(0.0f);
        org.telegram.ui.lk lkVar = this.f35295r0;
        lkVar.setAlpha(0.0f);
        ImageView imageView = this.G;
        imageView.setAlpha(0.0f);
        float f13 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f35279g1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        q30Var.setScaleX(f10);
        if (this.f35279g1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        q30Var.setScaleY(f11);
        if (this.f35279g1) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        lkVar.setScaleX(f12);
        if (!this.f35279g1) {
            f13 = 0.1f;
        }
        lkVar.setScaleY(f13);
        if (q30Var.getMeasuredWidth() != 0) {
            q30Var.setPivotX(q30Var.getMeasuredWidth() / 2);
            q30Var.setPivotY(q30Var.getMeasuredHeight() / 2);
            lkVar.setPivotX(lkVar.getMeasuredWidth() / 2);
            lkVar.setPivotY(lkVar.getMeasuredHeight() / 2);
        }
        try {
            if (i3 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t() {
        Timer timer = this.f35281h1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f35281h1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void u() {
        int i3;
        String str;
        String str2;
        this.f35306y0 = SystemClock.elapsedRealtimeNanos();
        this.f35307z0++;
        if (this.f35297s0 && this.f35299u0) {
            i3 = 1 - this.k1;
        } else {
            i3 = 0;
        }
        this.A0 = i3;
        this.B0 = true;
        if (this.f35297s0) {
            if (this.f35299u0) {
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
        sb2.append(this.k1);
        sb2.append(", targetSurface=");
        sb2.append(this.A0);
        p(sb2.toString());
        if (!this.f35297s0 || !this.f35299u0) {
            q();
            Bitmap bitmap = this.U;
            if (bitmap != null) {
                this.f35304x0 = false;
                this.f35295r0.setImageBitmap(bitmap);
                this.f35295r0.setAlpha(1.0f);
            }
        }
        this.J = !this.J;
        v();
        if (this.f35297s0) {
            if (this.f35299u0) {
                this.f35302w0 = this.f35300v0[!this.J ? 1 : 0];
                w30 w30Var = this.m0;
                Handler handler = w30Var.getHandler();
                if (handler != null) {
                    w30Var.sendMessage(handler.obtainMessage(4), 0);
                    w30Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f35302w0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f35302w0 = null;
                this.f35300v0[this.J ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f35300v0;
            boolean z10 = this.J;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23153w3, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23153w3);
            camera2SessionArr[i10] = create;
            this.f35302w0 = create;
            if (create == null) {
                this.B0 = false;
                p("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.f35290n0[0] = new Size(this.f35302w0.getPreviewWidth(), this.f35302w0.getPreviewHeight());
            w30 w30Var2 = this.m0;
            Camera2Session camera2Session2 = this.f35302w0;
            Handler handler2 = w30Var2.getHandler();
            if (handler2 != null) {
                w30Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        } else {
            CameraSession cameraSession = this.f35298t0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f35298t0, null, null);
                this.f35298t0 = null;
            }
        }
        o();
        this.K = false;
        w30 w30Var3 = this.m0;
        Handler handler3 = w30Var3.getHandler();
        if (handler3 != null) {
            w30Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z10;
        boolean z11;
        int i3;
        boolean z12;
        if (this.f35274e1 && this.f35284j0 && this.J) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f35277f1 != z10) {
            this.f35277f1 = z10;
            gi.n2 n2Var = this.f35303x;
            if (z10) {
                n2Var.c(null);
            } else {
                n2Var.d();
            }
        }
        if (this.f35297s0) {
            Camera2Session camera2Session = this.f35300v0[1];
            if (camera2Session != null) {
                if (this.f35274e1 && !this.J && this.f35284j0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f35298t0;
            if (cameraSession != null) {
                if (this.f35274e1 && !this.J && this.f35284j0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        gi.l2 l2Var = this.f35301w;
        if (l2Var != null) {
            Boolean bool = this.f35271d1;
            if (bool == null || bool.booleanValue() != this.f35274e1) {
                if (this.f35274e1) {
                    i3 = 2131754914;
                } else {
                    i3 = 2131754913;
                }
                l2Var.setContentDescription(org.telegram.messenger.bd.M0(i3, null));
                boolean z13 = this.f35274e1;
                int i10 = this.f35269c1;
                if (!z13) {
                    if (this.f35305y == null) {
                        ch0 ch0Var = new ch0(2131624186, i10, i10);
                        this.f35305y = ch0Var;
                        ch0Var.setCallback(l2Var);
                    }
                    l2Var.setImageDrawable(this.f35305y);
                    if (this.f35271d1 == null) {
                        ch0 ch0Var2 = this.f35305y;
                        ch0Var2.M(ch0Var2.f32725e[0] - 1);
                    } else {
                        this.f35305y.M(0);
                        this.f35305y.start();
                    }
                } else {
                    if (this.E == null) {
                        ch0 ch0Var3 = new ch0(2131624185, i10, i10);
                        this.E = ch0Var3;
                        ch0Var3.setCallback(l2Var);
                    }
                    l2Var.setImageDrawable(this.E);
                    if (this.f35271d1 == null) {
                        ch0 ch0Var4 = this.E;
                        ch0Var4.M(ch0Var4.f32725e[0] - 1);
                    } else {
                        this.E.M(0);
                        this.E.start();
                    }
                }
                this.f35271d1 = Boolean.valueOf(this.f35274e1);
            }
        }
    }

    public final void w() {
        this.f35295r0.setTranslationY(this.E0 + this.D0);
        this.f35275f.setTranslationY(this.E0 + this.D0);
    }

    @Override
    public y30 getCameraContainer() {
        return this.f35275f;
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
    }
}
