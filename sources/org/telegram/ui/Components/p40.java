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
public final class p40 extends u40 implements org.telegram.messenger.ls {
    public static final int[] l1 = {285904780, -1394191079};
    public volatile boolean A0;
    public volatile String B0;
    public float C0;
    public ah0 D;
    public float D0;
    public ah0 E;
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
    public org.telegram.messenger.j20 R;
    public float R0;
    public u51 S;
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
    public final org.telegram.ui.ActionBar.g6 Y0;
    public boolean Z0;
    public final int[] f36883a0;
    public final LinearLayout f36884a1;
    public final int[] f36885b0;
    public final int f36886b1;
    public float f36887c0;
    public Boolean f36888c1;
    public AnimatorSet f36889d0;
    public boolean f36890d1;
    public final int f36891e;
    public org.telegram.messenger.pe f36892e0;
    public boolean f36893e1;
    public final v30 f36894f;
    public File f36895f0;
    public boolean f36896f1;
    public long f36897g0;
    public Timer f36898g1;
    public final c40 h;
    public long f36899h0;
    public h40 f36900h1;
    public boolean f36901i0;
    public Bitmap f36902i1;
    public long f36903j0;
    public volatile int f36904j1;
    public boolean f36905k0;
    public ValueAnimator f36906k1;
    public b40 f36907l0;
    public final Size[] m0;
    public final u30 f36908n;
    public Size f36909n0;
    public final Size f36910o0;
    public TextureView f36911p0;
    public final org.telegram.ui.rk f36912q0;
    public final RectF f36913r;
    public final boolean f36914r0;
    public final fi.n2 f36915s;
    public CameraSession f36916s0;
    public boolean f36917t0;
    public final Camera2Session[] f36918u0;
    public Camera2Session f36919v0;
    public final fi.n2 f36920w;
    public boolean f36921w0;
    public final fi.p2 f36922x;
    public volatile long f36923x0;
    public ah0 f36924y;
    public volatile int f36925y0;
    public volatile int f36926z0;

    public p40(Context context, c40 c40Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        Size size;
        float f10;
        int i7 = org.telegram.messenger.p10.f24470s0;
        this.f36891e = i7;
        this.I = true;
        this.W = new int[2];
        this.f36883a0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f36885b0 = new int[1];
        this.f36887c0 = 1.0f;
        this.m0 = new Size[2];
        if (org.telegram.messenger.iz.f23455z0) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f36910o0 = size;
        this.f36914r0 = org.telegram.messenger.iz.s(i7);
        this.f36918u0 = new Camera2Session[2];
        this.E0 = new float[16];
        this.F0 = new float[16];
        this.G0 = new float[16];
        if (z9) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        this.f36886b1 = org.telegram.messenger.g0.L(f10);
        this.Y0 = g6Var;
        this.O0 = c40Var.getFragmentView();
        setWillNotDraw(false);
        this.h = c40Var;
        this.U = c40Var.getClassGuid();
        this.Q = c40Var.z();
        u30 u30Var = new u30(this, 0);
        this.f36908n = u30Var;
        u30Var.setStyle(Paint.Style.STROKE);
        u30Var.setStrokeCap(Paint.Cap.ROUND);
        u30Var.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        u30Var.setColor(-1);
        this.f36913r = new RectF();
        fi.p2 p2Var = new fi.p2(getContext(), null, this, null);
        this.f36922x = p2Var;
        p2Var.f12584o = 0.5f;
        p2Var.f12583n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.f12573b, c8.ha.e(-1, -1, 119));
        v30 v30Var = new v30(this, context);
        this.f36894f = v30Var;
        v30Var.setOutlineProvider(new fh.a(this, 4));
        v30Var.setClipToOutline(true);
        v30Var.setWillNotDraw(false);
        int i10 = org.telegram.messenger.g0.v;
        addView(v30Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(p2Var.f12574c, c8.ha.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36884a1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f36915s = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754752, null));
        linearLayout.addView((View) imageView, c8.ha.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final p40 f37552b;

            {
                this.f37552b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p40 p40Var = this.f37552b;
                        if (p40Var.J) {
                            if (p40Var.f36914r0) {
                                Camera2Session camera2Session = p40Var.f36919v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = p40Var.f36916s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (p40Var.f36907l0 != null) {
                                if (!p40Var.f36917t0) {
                                    p40Var.v();
                                }
                                ah0 ah0Var = p40Var.E;
                                if (ah0Var != null) {
                                    ah0Var.M(0);
                                    p40Var.E.start();
                                }
                                p40Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                s30 s30Var = new s30(p40Var, 0);
                                v30 v30Var2 = p40Var.f36894f;
                                v30Var2.setCameraDistance(v30Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.rk rkVar = p40Var.f36912q0;
                                rkVar.setCameraDistance(rkVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new w30(p40Var, zArr, s30Var));
                                ofFloat.addListener(new di.h3(p40Var, zArr, s30Var, 7));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p40 p40Var2 = this.f37552b;
                        p40Var2.f36890d1 = true ^ p40Var2.f36890d1;
                        p40Var2.w();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f36920w = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, c8.ha.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final p40 f37552b;

            {
                this.f37552b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p40 p40Var = this.f37552b;
                        if (p40Var.J) {
                            if (p40Var.f36914r0) {
                                Camera2Session camera2Session = p40Var.f36919v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = p40Var.f36916s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (p40Var.f36907l0 != null) {
                                if (!p40Var.f36917t0) {
                                    p40Var.v();
                                }
                                ah0 ah0Var = p40Var.E;
                                if (ah0Var != null) {
                                    ah0Var.M(0);
                                    p40Var.E.start();
                                }
                                p40Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                s30 s30Var = new s30(p40Var, 0);
                                v30 v30Var2 = p40Var.f36894f;
                                v30Var2.setCameraDistance(v30Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.rk rkVar = p40Var.f36912q0;
                                rkVar.setCameraDistance(rkVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new w30(p40Var, zArr, s30Var));
                                ofFloat.addListener(new di.h3(p40Var, zArr, s30Var, 7));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p40 p40Var2 = this.f37552b;
                        p40Var2.f36890d1 = true ^ p40Var2.f36890d1;
                        p40Var2.w();
                        return;
                }
            }
        });
        w();
        if (!z9) {
            p2Var.a(imageView);
            p2Var.a(imageView2);
        } else if (!g6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232795);
        imageView3.setAlpha(0.0f);
        addView(imageView3, c8.ha.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.o(-16777216, 40));
        org.telegram.ui.rk rkVar = new org.telegram.ui.rk(this, getContext(), paint);
        this.f36912q0 = rkVar;
        int i11 = org.telegram.messenger.g0.v;
        addView(rkVar, new FrameLayout.LayoutParams(i11, i11, 17));
        this.f36896f1 = false;
        setVisibility(4);
    }

    public static int l(p40 p40Var, int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (org.telegram.messenger.r2.f25212a) {
                org.telegram.messenger.a8.d(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static boolean m() {
        int ceil;
        if (!org.telegram.messenger.iz.Y && org.telegram.messenger.iz.o() < 1) {
            int o4 = org.telegram.messenger.iz.o();
            if (org.telegram.messenger.iz.f23385a == -1) {
                int i7 = Build.VERSION.SDK_INT;
                int i10 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.t0.f25566b.getSystemService("activity")).getMemoryClass();
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
                        org.telegram.messenger.iz.f23385a = 2;
                    } else {
                        org.telegram.messenger.iz.f23385a = 1;
                    }
                } else {
                    org.telegram.messenger.iz.f23385a = 0;
                }
            }
            if (Math.max(o4, org.telegram.messenger.iz.f23385a) != 2) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                int i14 = 0;
                while (true) {
                    int[] iArr = l1;
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
    public final void a(boolean z9) {
        int i7;
        u();
        u51 u51Var = this.S;
        if (u51Var != null) {
            u51Var.m0();
            this.S = null;
        }
        if (this.f36911p0 == null) {
            return;
        }
        this.f36905k0 = true;
        this.f36901i0 = false;
        this.f36890d1 = false;
        w();
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.f36891e);
        Integer valueOf = Integer.valueOf(this.U);
        if (z9) {
            i7 = 0;
        } else {
            i7 = 6;
        }
        f10.k(org.telegram.messenger.qs.f25042n2, valueOf, Integer.valueOf(i7));
        if (this.f36907l0 != null) {
            r();
            this.f36907l0.a(0, true, 0, 0, 0L);
            this.f36907l0 = null;
        } else {
            h40 h40Var = this.f36900h1;
            if (h40Var != null) {
                h40Var.i(0, new e40(0, 0, 0L, 0L, true));
            }
        }
        if (this.f36892e0 != null) {
            if (org.telegram.messenger.r2.f25212a) {
                org.telegram.messenger.a8.d("delete camera file by cancel");
            }
            this.f36892e0.delete();
            org.telegram.messenger.z0.b(this.f36892e0);
            this.f36892e0 = null;
        }
        MediaController.B().Y(false);
        s(false, false);
        invalidate();
    }

    @Override
    public final void b(float f10, int i7) {
        u51 u51Var = this.S;
        if (u51Var != null) {
            if (i7 == 0) {
                t();
                this.S.h0();
            } else if (i7 == 1) {
                u();
                this.S.g0();
            } else if (i7 == 2) {
                u51Var.q0(f10 * ((float) u51Var.U()), false);
            }
        }
    }

    @Override
    public final void c(boolean z9) {
        CountDownLatch countDownLatch;
        if (this.f36914r0) {
            int i7 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f36918u0;
                if (i7 < camera2SessionArr.length) {
                    Camera2Session camera2Session = camera2SessionArr[i7];
                    if (camera2Session != null) {
                        camera2Session.destroy(z9);
                        camera2SessionArr[i7] = null;
                    }
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            CameraSession cameraSession = this.f36916s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f36916s0;
                if (!z9) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
    }

    @Override
    public final void d(boolean z9) {
        ViewGroup viewGroup;
        c(z9);
        v30 v30Var = this.f36894f;
        v30Var.setTranslationX(0.0f);
        this.f36912q0.setTranslationX(0.0f);
        this.D0 = 0.0f;
        x();
        MediaController.B().c0();
        TextureView textureView = this.f36911p0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f36911p0);
        }
        this.f36911p0 = null;
        v30Var.setImageReceiver(null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.U1) {
            String str = (String) objArr[0];
            org.telegram.messenger.pe peVar = this.f36892e0;
            if (peVar != null && peVar.getAbsolutePath().equals(str)) {
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
    public final boolean f() {
        return !this.f36901i0;
    }

    @Override
    public final void g(float f10) {
        this.C0 = f10 / 2.0f;
        x();
    }

    @Override
    public View getButtonsLayout() {
        return this.f36884a1;
    }

    @Override
    public RectF getCameraRect() {
        v30 v30Var = this.f36894f;
        int[] iArr = this.W;
        v30Var.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new RectF(i7, iArr[1], v30Var.getWidth() + i7, v30Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.F;
    }

    @Override
    public Paint getPaint() {
        return this.f36908n;
    }

    @Override
    public TextureView getTextureView() {
        return this.f36911p0;
    }

    @Override
    public final void h(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        boolean z10;
        int i12;
        int i13;
        long j11;
        if (this.f36911p0 != null) {
            u();
            u51 u51Var = this.S;
            if (u51Var != null) {
                u51Var.m0();
                this.S = null;
            }
            int i14 = 4;
            int i15 = this.f36891e;
            if (i7 == 4) {
                h40 h40Var = this.f36900h1;
                if (h40Var != null && this.f36903j0 > 800) {
                    h40Var.i(1, new e40(i10, i11, j3, j10, z9));
                    return;
                }
                boolean z11 = org.telegram.messenger.r2.f25212a;
                if (!this.f36892e0.exists()) {
                    org.telegram.messenger.a8.g(new RuntimeException("file not found :( round video"), true);
                }
                if (this.R == null) {
                    org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
                    this.R = j20Var;
                    j20Var.f23471a = -1L;
                    j20Var.f23473b = -1L;
                }
                if (this.R.c()) {
                    this.L = null;
                    this.M = null;
                    this.N = null;
                    this.O = null;
                    org.telegram.messenger.j20 j20Var2 = this.R;
                    long j12 = j20Var2.f23488r;
                    double d = j12;
                    long j13 = j20Var2.f23471a;
                    if (j13 >= 0) {
                        j11 = 0;
                    } else {
                        j13 = 0;
                        j11 = 0;
                    }
                    long j14 = j20Var2.f23473b;
                    if (j14 >= j11) {
                        j12 = j14;
                    }
                    long j15 = j12 - j13;
                    j20Var2.f23488r = j15;
                    j20Var2.f23487q = Math.max(1L, (long) ((j15 / d) * this.P));
                    org.telegram.messenger.j20 j20Var3 = this.R;
                    j20Var3.f23483m = 1000000;
                    long j16 = j20Var3.f23471a;
                    if (j16 > j11) {
                        j20Var3.f23471a = j16 * 1000;
                    }
                    long j17 = j20Var3.f23473b;
                    if (j17 > j11) {
                        j20Var3.f23473b = j17 * 1000;
                    }
                    org.telegram.messenger.w7.G(i15).b(this.f36892e0.getAbsolutePath(), false);
                } else {
                    this.R.f23487q = Math.max(1L, this.P);
                }
                org.telegram.messenger.j20 j20Var4 = this.R;
                j20Var4.f23492w = this.L;
                j20Var4.f23493x = this.M;
                j20Var4.f23494y = this.N;
                j20Var4.f23495z = this.O;
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, this.f36892e0.getAbsolutePath(), 0, true, 0, 0);
                gfVar.f26864x = i11;
                gfVar.f26865y = j3;
                this.h.u(gfVar, this.R, z9, i10, 0, false, j10);
                if (i10 != 0) {
                    s(false, false);
                }
                MediaController.B().Y(false);
                return;
            }
            if (this.f36903j0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f36905k0 = z10;
            this.f36901i0 = false;
            this.f36890d1 = false;
            w();
            if (!this.f36905k0) {
                if (i7 == 3) {
                    i14 = 2;
                } else {
                    i14 = 5;
                }
            }
            b40 b40Var = this.f36907l0;
            int i16 = this.U;
            if (b40Var != null) {
                org.telegram.messenger.qs.f(i15).k(org.telegram.messenger.qs.f25042n2, Integer.valueOf(i16), Integer.valueOf(i14));
                if (this.f36905k0) {
                    i13 = 0;
                } else if (i7 == 3) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                r();
                i12 = i16;
                this.f36907l0.a(i13, z9, i10, i11, j3);
                this.f36907l0 = null;
            } else {
                i12 = i16;
            }
            if (this.f36905k0) {
                org.telegram.messenger.qs.f(i15).k(org.telegram.messenger.qs.f25079t2, Integer.valueOf(i12), Boolean.TRUE, Integer.valueOf((int) this.f36903j0));
                s(false, false);
                MediaController.B().Y(false);
            }
        }
    }

    @Override
    public final void i(dh.c cVar, org.telegram.ui.qi qiVar) {
        View view = this.f36884a1;
        fh.g c10 = cVar.c(view, qiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void j(boolean z9) {
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        String absolutePath;
        u51 u51Var;
        if (this.f36911p0 == null) {
            if (this.E == null) {
                int i7 = this.f36886b1;
                ah0 ah0Var = new ah0(2131624187, i7, i7);
                this.E = ah0Var;
                ah0Var.M(0);
                this.E.setCallback(this.f36915s);
            }
            this.f36915s.setImageDrawable(this.E);
            this.f36912q0.setAlpha(1.0f);
            this.f36912q0.invalidate();
            if (this.T == null) {
                try {
                    this.T = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.f36912q0.setImageBitmap(bitmap);
            } else {
                this.f36912q0.setImageResource(2131231492);
            }
            this.J = false;
            this.H = null;
            if (!z9) {
                if (!this.f36914r0) {
                    this.I = true;
                }
                w();
                this.f36903j0 = 0L;
                this.G = 0.0f;
            }
            this.f36905k0 = false;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            this.f36921w0 = true;
            if (p()) {
                if (MediaController.B().f21295u0 != null) {
                    if (!org.telegram.messenger.ij.L4(MediaController.B().f21295u0.f23262k) && !MediaController.B().f21295u0.h4()) {
                        if (org.telegram.messenger.iz.F0 && (u51Var = MediaController.B().f21271i0) != null) {
                            u51Var.g0();
                        }
                    } else {
                        MediaController.B().q(true, true, false, false);
                    }
                }
                if (!z9) {
                    this.f36892e0 = new org.telegram.messenger.pe(2, org.telegram.messenger.w7.z(3), System.currentTimeMillis() + "_" + org.telegram.messenger.iz.p() + ".mp4");
                }
                org.telegram.messenger.iz.y();
                org.telegram.messenger.pe peVar = this.f36892e0;
                Set set = org.telegram.messenger.z0.f26790a;
                if (peVar != null && (absolutePath = peVar.getAbsolutePath()) != null) {
                    org.telegram.messenger.z0.f26790a.add(absolutePath);
                }
                if (org.telegram.messenger.r2.f25212a) {
                    org.telegram.messenger.a8.b("InstantCamera show round camera " + this.f36892e0.getAbsolutePath());
                }
                if (this.f36914r0) {
                    Context context = getContext();
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    if (org.telegram.messenger.iz.o() >= 2 && Camera.getNumberOfCameras() > 1 && org.telegram.messenger.iz.b() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z14 = e12.getBoolean("rounddual_available", z10);
                    this.f36917t0 = z14;
                    if (z14) {
                        for (int i10 = 0; i10 < 2; i10++) {
                            Camera2Session[] camera2SessionArr = this.f36918u0;
                            if (camera2SessionArr[i10] == null) {
                                if (i10 == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                camera2SessionArr[i10] = Camera2Session.create(z13, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24918v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24918v3);
                                Camera2Session camera2Session = this.f36918u0[i10];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.m0[i10] = new Size(this.f36918u0[i10].getPreviewWidth(), this.f36918u0[i10].getPreviewHeight());
                                }
                            }
                        }
                        w();
                        Camera2Session[] camera2SessionArr2 = this.f36918u0;
                        boolean z15 = this.I;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z15 ? 1 : 0];
                        this.f36919v0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z15 ? 1 : 0] == null) {
                            this.f36917t0 = false;
                        }
                        if (org.telegram.messenger.r2.f25212a) {
                            StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                            sb2.append(this.f36917t0);
                            sb2.append(", initialFacing=");
                            if (this.I) {
                                str = "FRONT";
                            } else {
                                str = "BACK";
                            }
                            sb2.append(str);
                            sb2.append(", frontSession=");
                            if (this.f36918u0[0] != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            sb2.append(z11);
                            sb2.append(", backSession=");
                            if (this.f36918u0[1] != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            sb2.append(z12);
                            org.telegram.messenger.a8.b(sb2.toString());
                        }
                        if (this.f36919v0 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f36918u0;
                        boolean z16 = this.I;
                        int i11 = !z16 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z16, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24918v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24918v3);
                        camera2SessionArr3[i11] = create;
                        this.f36919v0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.m0[0] = new Size(this.f36919v0.getPreviewWidth(), this.f36919v0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f36911p0 = textureView;
                textureView.setSurfaceTextureListener(new x30(this, 0));
                this.f36894f.addView(this.f36911p0, c8.ha.c(-1.0f, -1));
                this.X0 = true;
                this.f36896f1 = z9;
                setVisibility(0);
                s(true, z9);
                MediaController.B().Y(true);
            }
        }
    }

    @Override
    public final void k() {
        boolean z9;
        int i7;
        int i10;
        int i11;
        if (this.f36901i0) {
            if (this.f36903j0 < 800) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f36905k0 = z9;
            this.f36901i0 = false;
            w();
            if (this.f36907l0 != null) {
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.f36891e);
                int i12 = org.telegram.messenger.qs.f25042n2;
                Integer valueOf = Integer.valueOf(this.U);
                if (this.f36905k0) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                f10.k(i12, valueOf, Integer.valueOf(i7));
                r();
                b40 b40Var = this.f36907l0;
                boolean z10 = this.f36905k0;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = -2;
                }
                b40Var.a(i10, true, 0, i11, 0L);
                this.f36907l0 = null;
            }
            if (this.f36905k0) {
                org.telegram.messenger.qs.f(this.f36891e).k(org.telegram.messenger.qs.f25079t2, Integer.valueOf(this.U), Boolean.TRUE, Integer.valueOf((int) this.f36903j0));
                s(false, false);
                MediaController.B().Y(false);
                return;
            }
            h40 h40Var = this.f36900h1;
            h40Var.T.sendMessage(h40Var.T.obtainMessage(4));
            return;
        }
        h40 h40Var2 = this.f36900h1;
        if (h40Var2 != null) {
            h40Var2.T.sendMessage(h40Var2.T.obtainMessage(5));
            d(false);
            u51 u51Var = this.S;
            if (u51Var != null) {
                u51Var.m0();
                this.S = null;
            }
            j(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.f2(this.h.getParentActivity());
            invalidate();
            org.telegram.messenger.qs.f(this.f36891e).k(org.telegram.messenger.qs.f25053p2, new Object[0]);
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
            Collections.sort(arrayList2, new org.telegram.ui.oe(9));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f36910o0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void o() {
        float min;
        if (this.f36906k1 == null) {
            if (this.f36914r0) {
                Camera2Session camera2Session = this.f36919v0;
                if (camera2Session != null) {
                    min = Utilities.i(this.R0, camera2Session.getMaxZoom(), this.f36919v0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.R0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.f36906k1 = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 26));
                this.f36906k1.addListener(new t30(this, 1));
                this.f36906k1.setDuration(350L);
                this.f36906k1.setInterpolator(xq.f40458f);
                this.f36906k1.start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.f36891e).c(this, org.telegram.messenger.qs.U1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f36891e).n(this, org.telegram.messenger.qs.U1);
        fi.p2 p2Var = this.f36922x;
        if (p2Var != null) {
            p2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        v30 v30Var = this.f36894f;
        float x10 = v30Var.getX();
        float y10 = v30Var.getY();
        RectF rectF = this.f36913r;
        rectF.set(x10 - org.telegram.messenger.g0.L(8.0f), y10 - org.telegram.messenger.g0.L(8.0f), x10 + v30Var.getMeasuredWidth() + org.telegram.messenger.g0.L(8.0f), y10 + v30Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        if (this.f36901i0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f36897g0) + this.f36899h0;
            this.f36903j0 = currentTimeMillis;
            this.G = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.G != 0.0f) {
            canvas.save();
            if (!this.N0) {
                canvas.scale(v30Var.getScaleX(), v30Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.G * 360.0f, false, this.f36908n);
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
        if (this.X0) {
            if (View.MeasureSpec.getSize(i10) - getPaddingBottom() > View.MeasureSpec.getSize(i7) * 1.3f) {
                i11 = org.telegram.messenger.g0.v;
            } else {
                i11 = org.telegram.messenger.g0.f22567u;
            }
            if (i11 != this.W0) {
                this.W0 = i11;
                org.telegram.ui.rk rkVar = this.f36912q0;
                ViewGroup.LayoutParams layoutParams = rkVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = rkVar.getLayoutParams();
                int i12 = this.W0;
                layoutParams2.height = i12;
                layoutParams.width = i12;
                v30 v30Var = this.f36894f;
                ViewGroup.LayoutParams layoutParams3 = v30Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = v30Var.getLayoutParams();
                int i13 = this.W0;
                layoutParams4.height = i13;
                layoutParams3.width = i13;
                ((FrameLayout.LayoutParams) this.F.getLayoutParams()).topMargin = (this.W0 / 2) - org.telegram.messenger.g0.L(24.0f);
                rkVar.setRoundRadius(this.W0 / 2);
                v30Var.invalidateOutline();
            }
            this.X0 = false;
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.p2 p2Var = this.f36922x;
        p2Var.f12573b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.f12574c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (getVisibility() != 0) {
            this.D0 = getMeasuredHeight() / 2.0f;
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
        if (motionEvent.getAction() == 0 && this.h != null && (u51Var = this.S) != null) {
            boolean c02 = u51Var.c0();
            this.S.t0(!c02);
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            if (!c02) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            ImageView imageView = this.F;
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
            this.K.addListener(new t30(this, 0));
            this.K.setDuration(180L);
            this.K.setInterpolator(new DecelerateInterpolator());
            this.K.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.S0) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (this.U0 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (this.V0 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / this.Q0;
                    this.R0 = hypot;
                    if (this.f36914r0) {
                        Camera2Session camera2Session = this.f36919v0;
                        if (camera2Session != null) {
                            this.f36919v0.setZoom(Utilities.i(hypot, camera2Session.getMaxZoom(), this.f36919v0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f36916s0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.S0 = false;
                    o();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.U0 == motionEvent.getPointerId(0) && this.V0 == motionEvent.getPointerId(1)) || (this.U0 == motionEvent.getPointerId(1) && this.V0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.S0) {
                this.S0 = false;
                o();
                return true;
            }
        } else {
            if (this.T0 && !this.S0 && motionEvent.getPointerCount() == 2 && this.f36906k1 == null && this.f36901i0) {
                this.Q0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.R0 = 1.0f;
                this.U0 = motionEvent.getPointerId(0);
                this.V0 = motionEvent.getPointerId(1);
                this.S0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                v30 v30Var = this.f36894f;
                rectF.set(v30Var.getX(), v30Var.getY(), v30Var.getX() + v30Var.getMeasuredWidth(), v30Var.getY() + v30Var.getMeasuredHeight());
                this.T0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final boolean p() {
        int i7;
        int i10;
        if (!this.f36914r0) {
            ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
            if (cameras != null) {
                CameraInfo cameraInfo = null;
                int i11 = 0;
                while (i11 < cameras.size()) {
                    CameraInfo cameraInfo2 = cameras.get(i11);
                    if (!cameraInfo2.isFrontface()) {
                        cameraInfo = cameraInfo2;
                    }
                    if ((this.I && cameraInfo2.isFrontface()) || (!this.I && !cameraInfo2.isFrontface())) {
                        this.H = cameraInfo2;
                        break;
                    }
                    i11++;
                    cameraInfo = cameraInfo2;
                }
                if (this.H == null) {
                    this.H = cameraInfo;
                }
                CameraInfo cameraInfo3 = this.H;
                if (cameraInfo3 != null) {
                    ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
                    ArrayList<Size> pictureSizes = this.H.getPictureSizes();
                    Size n10 = n(previewSizes);
                    Size[] sizeArr = this.m0;
                    sizeArr[0] = n10;
                    Size n11 = n(pictureSizes);
                    this.f36909n0 = n11;
                    if (sizeArr[0].mWidth != n11.mWidth) {
                        boolean z9 = false;
                        for (int size = previewSizes.size() - 1; size >= 0; size--) {
                            Size size2 = previewSizes.get(size);
                            int size3 = pictureSizes.size() - 1;
                            while (true) {
                                if (size3 < 0) {
                                    break;
                                }
                                Size size4 = pictureSizes.get(size3);
                                int i12 = size2.mWidth;
                                Size size5 = this.f36909n0;
                                if (i12 >= size5.mWidth && (i10 = size2.mHeight) >= size5.mHeight && i12 == size4.mWidth && i10 == size4.mHeight) {
                                    sizeArr[0] = size2;
                                    this.f36909n0 = size4;
                                    z9 = true;
                                    break;
                                }
                                size3--;
                            }
                            if (z9) {
                                break;
                            }
                        }
                        if (!z9) {
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
                                        this.f36909n0 = size9;
                                        z9 = true;
                                        break;
                                    }
                                    size8--;
                                }
                                if (z9) {
                                    break;
                                }
                            }
                        }
                    }
                    if (org.telegram.messenger.r2.f25212a) {
                        StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
                        sb2.append(sizeArr[0].mWidth);
                        sb2.append(" h = ");
                        jg.g.s(sizeArr[0].mHeight, sb2);
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void q(String str) {
        if (!org.telegram.messenger.r2.f25212a) {
            return;
        }
        long j3 = this.f36923x0;
        long j10 = 0;
        if (j3 != 0) {
            j10 = (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
        }
        org.telegram.messenger.a8.b("InstantCamera legacy switch[" + this.f36925y0 + "] " + str + ", path=" + this.B0 + ", elapsedMs=" + j10 + ", thread=" + Thread.currentThread().getName());
    }

    public final void r() {
        Bitmap bitmap = this.f36911p0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f36911p0.getBitmap(), 50, 50, true);
            this.T = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                    this.T.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void s(boolean z9, boolean z10) {
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
        q40 q40Var = this.f38589a;
        if (q40Var != null) {
            ((org.telegram.ui.fe) q40Var).f45692b.bd.a(z9, true);
        }
        AnimatorSet animatorSet = this.f36889d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f36889d0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        org.telegram.ui.rk rkVar = this.f36912q0;
        v30 v30Var = this.f36894f;
        if (z9 && !this.P0) {
            v30Var.setTranslationX(0.0f);
            rkVar.setTranslationX(0.0f);
            if (z10) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.D0 = measuredHeight;
            x();
        }
        this.P0 = z9;
        View view = this.O0;
        if (view != null) {
            view.invalidate();
        }
        this.f36889d0 = new AnimatorSet();
        if (!z9 && this.f36903j0 > 300) {
            f10 = org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() / 2.0f);
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
        ofFloat.addUpdateListener(new ch.u(7, this, z10));
        AnimatorSet animatorSet2 = this.f36889d0;
        if (z9) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float[] fArr = {f13};
        LinearLayout linearLayout = this.f36884a1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, property, 0.0f);
        k6 k6Var = m6.f35965b;
        if (z9) {
            i7 = 255;
        } else {
            i7 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f36908n, k6Var, i7);
        if (z9) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(v30Var, property, f14);
        if (z9) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(v30Var, property2, f15);
        if (z9) {
            f16 = 1.0f;
        } else {
            f16 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(v30Var, property3, f16);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(v30Var, property4, f10);
        if (z9) {
            f17 = 1.0f;
        } else {
            f17 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(rkVar, property, f17);
        if (z9) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(rkVar, property2, f18);
        if (z9) {
            f19 = 1.0f;
        } else {
            f19 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(rkVar, property3, f19), ObjectAnimator.ofFloat(rkVar, property4, f10), ofFloat);
        if (!z9) {
            this.f36889d0.addListener(new t30(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f36889d0.setDuration(180L);
        this.f36889d0.setInterpolator(new DecelerateInterpolator());
        this.f36889d0.start();
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
        this.f36884a1.setAlpha(0.0f);
        v30 v30Var = this.f36894f;
        v30Var.setAlpha(0.0f);
        org.telegram.ui.rk rkVar = this.f36912q0;
        rkVar.setAlpha(0.0f);
        ImageView imageView = this.F;
        imageView.setAlpha(0.0f);
        float f13 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f36896f1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        v30Var.setScaleX(f10);
        if (this.f36896f1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        v30Var.setScaleY(f11);
        if (this.f36896f1) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        rkVar.setScaleX(f12);
        if (!this.f36896f1) {
            f13 = 0.1f;
        }
        rkVar.setScaleY(f13);
        if (v30Var.getMeasuredWidth() != 0) {
            v30Var.setPivotX(v30Var.getMeasuredWidth() / 2);
            v30Var.setPivotY(v30Var.getMeasuredHeight() / 2);
            rkVar.setPivotX(rkVar.getMeasuredWidth() / 2);
            rkVar.setPivotY(rkVar.getMeasuredHeight() / 2);
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
        Timer timer = this.f36898g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f36898g1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        Timer timer2 = new Timer();
        this.f36898g1 = timer2;
        timer2.schedule(new fi.h2(this, 2), 0L, 17L);
    }

    public final void u() {
        Timer timer = this.f36898g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f36898g1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void v() {
        int i7;
        String str;
        String str2;
        this.f36923x0 = SystemClock.elapsedRealtimeNanos();
        this.f36925y0++;
        if (this.f36914r0 && this.f36917t0) {
            i7 = 1 - this.f36904j1;
        } else {
            i7 = 0;
        }
        this.f36926z0 = i7;
        this.A0 = true;
        if (this.f36914r0) {
            if (this.f36917t0) {
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
        sb2.append(this.f36904j1);
        sb2.append(", targetSurface=");
        sb2.append(this.f36926z0);
        q(sb2.toString());
        if (!this.f36914r0 || !this.f36917t0) {
            r();
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.f36921w0 = false;
                this.f36912q0.setImageBitmap(bitmap);
                this.f36912q0.setAlpha(1.0f);
            }
        }
        this.I = !this.I;
        w();
        if (this.f36914r0) {
            if (this.f36917t0) {
                this.f36919v0 = this.f36918u0[!this.I ? 1 : 0];
                b40 b40Var = this.f36907l0;
                Handler handler = b40Var.getHandler();
                if (handler != null) {
                    b40Var.sendMessage(handler.obtainMessage(4), 0);
                    b40Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f36919v0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f36919v0 = null;
                this.f36918u0[this.I ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f36918u0;
            boolean z9 = this.I;
            int i10 = !z9 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z9, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24918v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24918v3);
            camera2SessionArr[i10] = create;
            this.f36919v0 = create;
            if (create == null) {
                this.A0 = false;
                q("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.m0[0] = new Size(this.f36919v0.getPreviewWidth(), this.f36919v0.getPreviewHeight());
            b40 b40Var2 = this.f36907l0;
            Camera2Session camera2Session2 = this.f36919v0;
            Handler handler2 = b40Var2.getHandler();
            if (handler2 != null) {
                b40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        } else {
            CameraSession cameraSession = this.f36916s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f36916s0, null, null);
                this.f36916s0 = null;
            }
        }
        p();
        this.J = false;
        b40 b40Var3 = this.f36907l0;
        Handler handler3 = b40Var3.getHandler();
        if (handler3 != null) {
            b40Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void w() {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        if (this.f36890d1 && this.f36901i0 && this.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f36893e1 != z9) {
            this.f36893e1 = z9;
            fi.p2 p2Var = this.f36922x;
            if (z9) {
                p2Var.c(null);
            } else {
                p2Var.d();
            }
        }
        if (this.f36914r0) {
            Camera2Session camera2Session = this.f36918u0[1];
            if (camera2Session != null) {
                if (this.f36890d1 && !this.I && this.f36901i0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                camera2Session.setFlash(z11);
            }
        } else {
            CameraSession cameraSession = this.f36916s0;
            if (cameraSession != null) {
                if (this.f36890d1 && !this.I && this.f36901i0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cameraSession.setTorchEnabled(z10);
            }
        }
        fi.n2 n2Var = this.f36920w;
        if (n2Var != null) {
            Boolean bool = this.f36888c1;
            if (bool == null || bool.booleanValue() != this.f36890d1) {
                if (this.f36890d1) {
                    i7 = 2131754914;
                } else {
                    i7 = 2131754913;
                }
                n2Var.setContentDescription(org.telegram.messenger.id.M0(i7, null));
                boolean z12 = this.f36890d1;
                int i10 = this.f36886b1;
                if (!z12) {
                    if (this.f36924y == null) {
                        ah0 ah0Var = new ah0(2131624186, i10, i10);
                        this.f36924y = ah0Var;
                        ah0Var.setCallback(n2Var);
                    }
                    n2Var.setImageDrawable(this.f36924y);
                    if (this.f36888c1 == null) {
                        ah0 ah0Var2 = this.f36924y;
                        ah0Var2.M(ah0Var2.f31826e[0] - 1);
                    } else {
                        this.f36924y.M(0);
                        this.f36924y.start();
                    }
                } else {
                    if (this.D == null) {
                        ah0 ah0Var3 = new ah0(2131624185, i10, i10);
                        this.D = ah0Var3;
                        ah0Var3.setCallback(n2Var);
                    }
                    n2Var.setImageDrawable(this.D);
                    if (this.f36888c1 == null) {
                        ah0 ah0Var4 = this.D;
                        ah0Var4.M(ah0Var4.f31826e[0] - 1);
                    } else {
                        this.D.M(0);
                        this.D.start();
                    }
                }
                this.f36888c1 = Boolean.valueOf(this.f36890d1);
            }
        }
    }

    public final void x() {
        this.f36912q0.setTranslationY(this.D0 + this.C0);
        this.f36894f.setTranslationY(this.D0 + this.C0);
    }

    @Override
    public d40 getCameraContainer() {
        return this.f36894f;
    }

    @Override
    public void setIsMessageTransition(boolean z9) {
    }
}
