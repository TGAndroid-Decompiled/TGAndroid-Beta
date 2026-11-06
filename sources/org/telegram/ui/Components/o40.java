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
public final class o40 extends t40 implements org.telegram.messenger.ls {
    public static final int[] l1 = {285904780, -1394191079};
    public volatile boolean A0;
    public volatile String B0;
    public float C0;
    public zg0 D;
    public float D0;
    public zg0 E;
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
    public t51 S;
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
    public final org.telegram.ui.ActionBar.f6 Y0;
    public boolean Z0;
    public final int[] f36514a0;
    public final LinearLayout f36515a1;
    public final int[] f36516b0;
    public final int f36517b1;
    public float f36518c0;
    public Boolean f36519c1;
    public AnimatorSet f36520d0;
    public boolean f36521d1;
    public final int f36522e;
    public org.telegram.messenger.pe f36523e0;
    public boolean f36524e1;
    public final u30 f36525f;
    public File f36526f0;
    public boolean f36527f1;
    public long f36528g0;
    public Timer f36529g1;
    public final b40 h;
    public long f36530h0;
    public g40 f36531h1;
    public boolean f36532i0;
    public Bitmap f36533i1;
    public long f36534j0;
    public volatile int f36535j1;
    public boolean f36536k0;
    public ValueAnimator f36537k1;
    public a40 f36538l0;
    public final Size[] m0;
    public final t30 f36539n;
    public Size f36540n0;
    public final Size f36541o0;
    public TextureView f36542p0;
    public final org.telegram.ui.pk f36543q0;
    public final RectF f36544r;
    public final boolean f36545r0;
    public final fi.n2 f36546s;
    public CameraSession f36547s0;
    public boolean f36548t0;
    public final Camera2Session[] f36549u0;
    public Camera2Session f36550v0;
    public final fi.n2 f36551w;
    public boolean f36552w0;
    public final fi.p2 f36553x;
    public volatile long f36554x0;
    public zg0 f36555y;
    public volatile int f36556y0;
    public volatile int f36557z0;

    public o40(Context context, b40 b40Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        Size size;
        float f10;
        int i7 = org.telegram.messenger.p10.f24467s0;
        this.f36522e = i7;
        this.I = true;
        this.W = new int[2];
        this.f36514a0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f36516b0 = new int[1];
        this.f36518c0 = 1.0f;
        this.m0 = new Size[2];
        if (org.telegram.messenger.iz.f23434z0) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f36541o0 = size;
        this.f36545r0 = org.telegram.messenger.iz.s(i7);
        this.f36549u0 = new Camera2Session[2];
        this.E0 = new float[16];
        this.F0 = new float[16];
        this.G0 = new float[16];
        if (z9) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        this.f36517b1 = org.telegram.messenger.g0.L(f10);
        this.Y0 = f6Var;
        this.O0 = b40Var.getFragmentView();
        setWillNotDraw(false);
        this.h = b40Var;
        this.U = b40Var.getClassGuid();
        this.Q = b40Var.z();
        t30 t30Var = new t30(this, 0);
        this.f36539n = t30Var;
        t30Var.setStyle(Paint.Style.STROKE);
        t30Var.setStrokeCap(Paint.Cap.ROUND);
        t30Var.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        t30Var.setColor(-1);
        this.f36544r = new RectF();
        fi.p2 p2Var = new fi.p2(getContext(), null, this, null);
        this.f36553x = p2Var;
        p2Var.f12586o = 0.5f;
        p2Var.f12585n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.f12575b, c8.ha.e(-1, -1, 119));
        u30 u30Var = new u30(this, context);
        this.f36525f = u30Var;
        u30Var.setOutlineProvider(new fh.a(this, 4));
        u30Var.setClipToOutline(true);
        u30Var.setWillNotDraw(false);
        int i10 = org.telegram.messenger.g0.v;
        addView(u30Var, new FrameLayout.LayoutParams(i10, i10, 17));
        addView(p2Var.f12576c, c8.ha.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36515a1 = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f36546s = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        linearLayout.addView((View) imageView, c8.ha.o(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final o40 f37155b;

            {
                this.f37155b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o40 o40Var = this.f37155b;
                        if (o40Var.J) {
                            if (o40Var.f36545r0) {
                                Camera2Session camera2Session = o40Var.f36550v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = o40Var.f36547s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (o40Var.f36538l0 != null) {
                                if (!o40Var.f36548t0) {
                                    o40Var.u();
                                }
                                zg0 zg0Var = o40Var.E;
                                if (zg0Var != null) {
                                    zg0Var.M(0);
                                    o40Var.E.start();
                                }
                                o40Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                r30 r30Var = new r30(o40Var, 0);
                                u30 u30Var2 = o40Var.f36525f;
                                u30Var2.setCameraDistance(u30Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.pk pkVar = o40Var.f36543q0;
                                pkVar.setCameraDistance(pkVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new v30(o40Var, zArr, r30Var));
                                ofFloat.addListener(new di.h3(o40Var, zArr, r30Var, 7));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o40 o40Var2 = this.f37155b;
                        o40Var2.f36521d1 = true ^ o40Var2.f36521d1;
                        o40Var2.v();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.f36551w = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, c8.ha.o(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final o40 f37155b;

            {
                this.f37155b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o40 o40Var = this.f37155b;
                        if (o40Var.J) {
                            if (o40Var.f36545r0) {
                                Camera2Session camera2Session = o40Var.f36550v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = o40Var.f36547s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (o40Var.f36538l0 != null) {
                                if (!o40Var.f36548t0) {
                                    o40Var.u();
                                }
                                zg0 zg0Var = o40Var.E;
                                if (zg0Var != null) {
                                    zg0Var.M(0);
                                    o40Var.E.start();
                                }
                                o40Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(xq.h);
                                boolean[] zArr = new boolean[1];
                                r30 r30Var = new r30(o40Var, 0);
                                u30 u30Var2 = o40Var.f36525f;
                                u30Var2.setCameraDistance(u30Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.pk pkVar = o40Var.f36543q0;
                                pkVar.setCameraDistance(pkVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new v30(o40Var, zArr, r30Var));
                                ofFloat.addListener(new di.h3(o40Var, zArr, r30Var, 7));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o40 o40Var2 = this.f37155b;
                        o40Var2.f36521d1 = true ^ o40Var2.f36521d1;
                        o40Var2.v();
                        return;
                }
            }
        });
        v();
        if (!z9) {
            p2Var.a(imageView);
            p2Var.a(imageView2);
        } else if (!f6Var.a()) {
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
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, getContext(), paint);
        this.f36543q0 = pkVar;
        int i11 = org.telegram.messenger.g0.v;
        addView(pkVar, new FrameLayout.LayoutParams(i11, i11, 17));
        this.f36527f1 = false;
        setVisibility(4);
    }

    public static int k(o40 o40Var, int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (org.telegram.messenger.r2.f25199a) {
                org.telegram.messenger.a8.d(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static boolean l() {
        int ceil;
        if (!org.telegram.messenger.iz.Y && org.telegram.messenger.iz.o() < 1) {
            int o4 = org.telegram.messenger.iz.o();
            if (org.telegram.messenger.iz.f23364a == -1) {
                int i7 = Build.VERSION.SDK_INT;
                int i10 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.t0.f25563b.getSystemService("activity")).getMemoryClass();
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
                        org.telegram.messenger.iz.f23364a = 2;
                    } else {
                        org.telegram.messenger.iz.f23364a = 1;
                    }
                } else {
                    org.telegram.messenger.iz.f23364a = 0;
                }
            }
            if (Math.max(o4, org.telegram.messenger.iz.f23364a) != 2) {
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
        t();
        t51 t51Var = this.S;
        if (t51Var != null) {
            t51Var.m0();
            this.S = null;
        }
        if (this.f36542p0 == null) {
            return;
        }
        this.f36536k0 = true;
        this.f36532i0 = false;
        this.f36521d1 = false;
        v();
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.f36522e);
        Integer valueOf = Integer.valueOf(this.U);
        if (z9) {
            i7 = 0;
        } else {
            i7 = 6;
        }
        f10.k(org.telegram.messenger.qs.f25033n2, valueOf, Integer.valueOf(i7));
        if (this.f36538l0 != null) {
            q();
            this.f36538l0.a(0, true, 0, 0, 0L);
            this.f36538l0 = null;
        } else {
            g40 g40Var = this.f36531h1;
            if (g40Var != null) {
                g40Var.i(0, new d40(0, 0, 0L, 0L, true));
            }
        }
        if (this.f36523e0 != null) {
            if (org.telegram.messenger.r2.f25199a) {
                org.telegram.messenger.a8.d("delete camera file by cancel");
            }
            this.f36523e0.delete();
            org.telegram.messenger.z0.b(this.f36523e0);
            this.f36523e0 = null;
        }
        MediaController.B().Y(false);
        r(false, false);
        invalidate();
    }

    @Override
    public final void b(float f10, int i7) {
        t51 t51Var = this.S;
        if (t51Var != null) {
            if (i7 == 0) {
                s();
                this.S.h0();
            } else if (i7 == 1) {
                t();
                this.S.g0();
            } else if (i7 == 2) {
                t51Var.q0(f10 * ((float) t51Var.U()), false);
            }
        }
    }

    @Override
    public final void c(boolean z9) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f36545r0) {
            int i7 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f36549u0;
                if (i7 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i7];
                if (camera2Session != null) {
                    camera2Session.destroy(z9);
                    camera2SessionArr[i7] = null;
                }
                i7++;
            }
        } else {
            CameraSession cameraSession = this.f36547s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f36547s0;
                if (!z9) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        u30 u30Var = this.f36525f;
        u30Var.setTranslationX(0.0f);
        this.f36543q0.setTranslationX(0.0f);
        this.D0 = 0.0f;
        w();
        MediaController.B().c0();
        TextureView textureView = this.f36542p0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f36542p0);
        }
        this.f36542p0 = null;
        u30Var.setImageReceiver(null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.U1) {
            String str = (String) objArr[0];
            org.telegram.messenger.pe peVar = this.f36523e0;
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
    public final boolean e() {
        return !this.f36532i0;
    }

    @Override
    public final void f(float f10) {
        this.C0 = f10 / 2.0f;
        w();
    }

    @Override
    public final void g(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        boolean z10;
        int i12;
        int i13;
        long j11;
        if (this.f36542p0 != null) {
            t();
            t51 t51Var = this.S;
            if (t51Var != null) {
                t51Var.m0();
                this.S = null;
            }
            int i14 = 4;
            int i15 = this.f36522e;
            if (i7 == 4) {
                g40 g40Var = this.f36531h1;
                if (g40Var != null && this.f36534j0 > 800) {
                    g40Var.i(1, new d40(i10, i11, j3, j10, z9));
                    return;
                }
                boolean z11 = org.telegram.messenger.r2.f25199a;
                if (!this.f36523e0.exists()) {
                    org.telegram.messenger.a8.g(new RuntimeException("file not found :( round video"), true);
                }
                if (this.R == null) {
                    org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
                    this.R = j20Var;
                    j20Var.f23450a = -1L;
                    j20Var.f23452b = -1L;
                }
                if (this.R.c()) {
                    this.L = null;
                    this.M = null;
                    this.N = null;
                    this.O = null;
                    org.telegram.messenger.j20 j20Var2 = this.R;
                    long j12 = j20Var2.f23467r;
                    double d = j12;
                    long j13 = j20Var2.f23450a;
                    if (j13 >= 0) {
                        j11 = 0;
                    } else {
                        j13 = 0;
                        j11 = 0;
                    }
                    long j14 = j20Var2.f23452b;
                    if (j14 >= j11) {
                        j12 = j14;
                    }
                    long j15 = j12 - j13;
                    j20Var2.f23467r = j15;
                    j20Var2.f23466q = Math.max(1L, (long) ((j15 / d) * this.P));
                    org.telegram.messenger.j20 j20Var3 = this.R;
                    j20Var3.f23462m = 1000000;
                    long j16 = j20Var3.f23450a;
                    if (j16 > j11) {
                        j20Var3.f23450a = j16 * 1000;
                    }
                    long j17 = j20Var3.f23452b;
                    if (j17 > j11) {
                        j20Var3.f23452b = j17 * 1000;
                    }
                    org.telegram.messenger.w7.G(i15).b(this.f36523e0.getAbsolutePath(), false);
                } else {
                    this.R.f23466q = Math.max(1L, this.P);
                }
                org.telegram.messenger.j20 j20Var4 = this.R;
                j20Var4.f23471w = this.L;
                j20Var4.f23472x = this.M;
                j20Var4.f23473y = this.N;
                j20Var4.f23474z = this.O;
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, this.f36523e0.getAbsolutePath(), 0, true, 0, 0);
                gfVar.f26843x = i11;
                gfVar.f26844y = j3;
                this.h.u(gfVar, this.R, z9, i10, 0, false, j10);
                if (i10 != 0) {
                    r(false, false);
                }
                MediaController.B().Y(false);
                return;
            }
            if (this.f36534j0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f36536k0 = z10;
            this.f36532i0 = false;
            this.f36521d1 = false;
            v();
            if (!this.f36536k0) {
                if (i7 == 3) {
                    i14 = 2;
                } else {
                    i14 = 5;
                }
            }
            a40 a40Var = this.f36538l0;
            int i16 = this.U;
            if (a40Var != null) {
                org.telegram.messenger.qs.f(i15).k(org.telegram.messenger.qs.f25033n2, Integer.valueOf(i16), Integer.valueOf(i14));
                if (this.f36536k0) {
                    i13 = 0;
                } else if (i7 == 3) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                q();
                i12 = i16;
                this.f36538l0.a(i13, z9, i10, i11, j3);
                this.f36538l0 = null;
            } else {
                i12 = i16;
            }
            if (this.f36536k0) {
                org.telegram.messenger.qs.f(i15).k(org.telegram.messenger.qs.f25070t2, Integer.valueOf(i12), Boolean.TRUE, Integer.valueOf((int) this.f36534j0));
                r(false, false);
                MediaController.B().Y(false);
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.f36515a1;
    }

    @Override
    public RectF getCameraRect() {
        u30 u30Var = this.f36525f;
        int[] iArr = this.W;
        u30Var.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        return new RectF(i7, iArr[1], u30Var.getWidth() + i7, u30Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.F;
    }

    @Override
    public Paint getPaint() {
        return this.f36539n;
    }

    @Override
    public TextureView getTextureView() {
        return this.f36542p0;
    }

    @Override
    public final void h(dh.c cVar, org.telegram.ui.oi oiVar) {
        View view = this.f36515a1;
        fh.g c10 = cVar.c(view, oiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void i(boolean z9) {
        boolean z10;
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        String absolutePath;
        t51 t51Var;
        if (this.f36542p0 == null) {
            if (this.E == null) {
                int i7 = this.f36517b1;
                zg0 zg0Var = new zg0(2131624187, i7, i7);
                this.E = zg0Var;
                zg0Var.M(0);
                this.E.setCallback(this.f36546s);
            }
            this.f36546s.setImageDrawable(this.E);
            this.f36543q0.setAlpha(1.0f);
            this.f36543q0.invalidate();
            if (this.T == null) {
                try {
                    this.T = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.f36543q0.setImageBitmap(bitmap);
            } else {
                this.f36543q0.setImageResource(2131231492);
            }
            this.J = false;
            this.H = null;
            if (!z9) {
                if (!this.f36545r0) {
                    this.I = true;
                }
                v();
                this.f36534j0 = 0L;
                this.G = 0.0f;
            }
            this.f36536k0 = false;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            this.f36552w0 = true;
            if (o()) {
                if (MediaController.B().f21292u0 != null) {
                    if (!org.telegram.messenger.ij.M4(MediaController.B().f21292u0.f23244k) && !MediaController.B().f21292u0.i4()) {
                        if (org.telegram.messenger.iz.F0 && (t51Var = MediaController.B().f21268i0) != null) {
                            t51Var.g0();
                        }
                    } else {
                        MediaController.B().q(true, true, false, false);
                    }
                }
                if (!z9) {
                    this.f36523e0 = new org.telegram.messenger.pe(2, org.telegram.messenger.w7.z(3), System.currentTimeMillis() + "_" + org.telegram.messenger.iz.p() + ".mp4");
                }
                org.telegram.messenger.iz.y();
                org.telegram.messenger.pe peVar = this.f36523e0;
                Set set = org.telegram.messenger.z0.f26769a;
                if (peVar != null && (absolutePath = peVar.getAbsolutePath()) != null) {
                    org.telegram.messenger.z0.f26769a.add(absolutePath);
                }
                if (org.telegram.messenger.r2.f25199a) {
                    org.telegram.messenger.a8.b("InstantCamera show round camera " + this.f36523e0.getAbsolutePath());
                }
                if (this.f36545r0) {
                    Context context = getContext();
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    if (org.telegram.messenger.iz.o() >= 2 && Camera.getNumberOfCameras() > 1 && org.telegram.messenger.iz.b() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z14 = e12.getBoolean("rounddual_available", z10);
                    this.f36548t0 = z14;
                    if (z14) {
                        for (int i10 = 0; i10 < 2; i10++) {
                            Camera2Session[] camera2SessionArr = this.f36549u0;
                            if (camera2SessionArr[i10] == null) {
                                if (i10 == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                camera2SessionArr[i10] = Camera2Session.create(z13, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).f24911v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).f24911v3);
                                Camera2Session camera2Session = this.f36549u0[i10];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.m0[i10] = new Size(this.f36549u0[i10].getPreviewWidth(), this.f36549u0[i10].getPreviewHeight());
                                }
                            }
                        }
                        v();
                        Camera2Session[] camera2SessionArr2 = this.f36549u0;
                        boolean z15 = this.I;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z15 ? 1 : 0];
                        this.f36550v0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z15 ? 1 : 0] == null) {
                            this.f36548t0 = false;
                        }
                        if (org.telegram.messenger.r2.f25199a) {
                            StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                            sb2.append(this.f36548t0);
                            sb2.append(", initialFacing=");
                            if (this.I) {
                                str = "FRONT";
                            } else {
                                str = "BACK";
                            }
                            sb2.append(str);
                            sb2.append(", frontSession=");
                            if (this.f36549u0[0] != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            sb2.append(z11);
                            sb2.append(", backSession=");
                            if (this.f36549u0[1] != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            sb2.append(z12);
                            org.telegram.messenger.a8.b(sb2.toString());
                        }
                        if (this.f36550v0 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f36549u0;
                        boolean z16 = this.I;
                        int i11 = !z16 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z16, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).f24911v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).f24911v3);
                        camera2SessionArr3[i11] = create;
                        this.f36550v0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.m0[0] = new Size(this.f36550v0.getPreviewWidth(), this.f36550v0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f36542p0 = textureView;
                textureView.setSurfaceTextureListener(new w30(this, 0));
                this.f36525f.addView(this.f36542p0, c8.ha.c(-1.0f, -1));
                this.X0 = true;
                this.f36527f1 = z9;
                setVisibility(0);
                r(true, z9);
                MediaController.B().Y(true);
            }
        }
    }

    @Override
    public final void j() {
        boolean z9;
        int i7;
        int i10;
        int i11;
        if (this.f36532i0) {
            if (this.f36534j0 < 800) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f36536k0 = z9;
            this.f36532i0 = false;
            v();
            if (this.f36538l0 != null) {
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(this.f36522e);
                int i12 = org.telegram.messenger.qs.f25033n2;
                Integer valueOf = Integer.valueOf(this.U);
                if (this.f36536k0) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                f10.k(i12, valueOf, Integer.valueOf(i7));
                q();
                a40 a40Var = this.f36538l0;
                boolean z10 = this.f36536k0;
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
                a40Var.a(i10, true, 0, i11, 0L);
                this.f36538l0 = null;
            }
            if (this.f36536k0) {
                org.telegram.messenger.qs.f(this.f36522e).k(org.telegram.messenger.qs.f25070t2, Integer.valueOf(this.U), Boolean.TRUE, Integer.valueOf((int) this.f36534j0));
                r(false, false);
                MediaController.B().Y(false);
                return;
            }
            g40 g40Var = this.f36531h1;
            g40Var.T.sendMessage(g40Var.T.obtainMessage(4));
            return;
        }
        g40 g40Var2 = this.f36531h1;
        if (g40Var2 != null) {
            g40Var2.T.sendMessage(g40Var2.T.obtainMessage(5));
            c(false);
            t51 t51Var = this.S;
            if (t51Var != null) {
                t51Var.m0();
                this.S = null;
            }
            i(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            org.telegram.messenger.g0.f2(this.h.getParentActivity());
            invalidate();
            org.telegram.messenger.qs.f(this.f36522e).k(org.telegram.messenger.qs.f25044p2, new Object[0]);
        }
    }

    public final Size m(ArrayList arrayList) {
        int i7;
        ArrayList arrayList2 = new ArrayList();
        int i10 = 1200;
        if (l()) {
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
        if (!arrayList2.isEmpty() && l()) {
            Collections.sort(arrayList2, new org.telegram.ui.oe(9));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f36541o0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void n() {
        float min;
        if (this.f36537k1 == null) {
            if (this.f36545r0) {
                Camera2Session camera2Session = this.f36550v0;
                if (camera2Session != null) {
                    min = Utilities.i(this.R0, camera2Session.getMaxZoom(), this.f36550v0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.R0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.f36537k1 = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 26));
                this.f36537k1.addListener(new s30(this, 1));
                this.f36537k1.setDuration(350L);
                this.f36537k1.setInterpolator(xq.f40345f);
                this.f36537k1.start();
            }
        }
    }

    public final boolean o() {
        int i7;
        int i10;
        if (!this.f36545r0) {
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
                    Size m10 = m(previewSizes);
                    Size[] sizeArr = this.m0;
                    sizeArr[0] = m10;
                    Size m11 = m(pictureSizes);
                    this.f36540n0 = m11;
                    if (sizeArr[0].mWidth != m11.mWidth) {
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
                                Size size5 = this.f36540n0;
                                if (i12 >= size5.mWidth && (i10 = size2.mHeight) >= size5.mHeight && i12 == size4.mWidth && i10 == size4.mHeight) {
                                    sizeArr[0] = size2;
                                    this.f36540n0 = size4;
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
                                        this.f36540n0 = size9;
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
                    if (org.telegram.messenger.r2.f25199a) {
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

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.f36522e).c(this, org.telegram.messenger.qs.U1);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f36522e).n(this, org.telegram.messenger.qs.U1);
        fi.p2 p2Var = this.f36553x;
        if (p2Var != null) {
            p2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        u30 u30Var = this.f36525f;
        float x10 = u30Var.getX();
        float y10 = u30Var.getY();
        RectF rectF = this.f36544r;
        rectF.set(x10 - org.telegram.messenger.g0.L(8.0f), y10 - org.telegram.messenger.g0.L(8.0f), x10 + u30Var.getMeasuredWidth() + org.telegram.messenger.g0.L(8.0f), y10 + u30Var.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f));
        if (this.f36532i0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f36528g0) + this.f36530h0;
            this.f36534j0 = currentTimeMillis;
            this.G = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.G != 0.0f) {
            canvas.save();
            if (!this.N0) {
                canvas.scale(u30Var.getScaleX(), u30Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.G * 360.0f, false, this.f36539n);
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
                i11 = org.telegram.messenger.g0.f22548u;
            }
            if (i11 != this.W0) {
                this.W0 = i11;
                org.telegram.ui.pk pkVar = this.f36543q0;
                ViewGroup.LayoutParams layoutParams = pkVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = pkVar.getLayoutParams();
                int i12 = this.W0;
                layoutParams2.height = i12;
                layoutParams.width = i12;
                u30 u30Var = this.f36525f;
                ViewGroup.LayoutParams layoutParams3 = u30Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = u30Var.getLayoutParams();
                int i13 = this.W0;
                layoutParams4.height = i13;
                layoutParams3.width = i13;
                ((FrameLayout.LayoutParams) this.F.getLayoutParams()).topMargin = (this.W0 / 2) - org.telegram.messenger.g0.L(24.0f);
                pkVar.setRoundRadius(this.W0 / 2);
                u30Var.invalidateOutline();
            }
            this.X0 = false;
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.p2 p2Var = this.f36553x;
        p2Var.f12575b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.f12576c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (getVisibility() != 0) {
            this.D0 = getMeasuredHeight() / 2.0f;
            w();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t51 t51Var;
        float f10;
        float f11;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (t51Var = this.S) != null) {
            boolean c02 = t51Var.c0();
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
            this.K.addListener(new s30(this, 0));
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
                    if (this.f36545r0) {
                        Camera2Session camera2Session = this.f36550v0;
                        if (camera2Session != null) {
                            this.f36550v0.setZoom(Utilities.i(hypot, camera2Session.getMaxZoom(), this.f36550v0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f36547s0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
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
            if (this.T0 && !this.S0 && motionEvent.getPointerCount() == 2 && this.f36537k1 == null && this.f36532i0) {
                this.Q0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.R0 = 1.0f;
                this.U0 = motionEvent.getPointerId(0);
                this.V0 = motionEvent.getPointerId(1);
                this.S0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                u30 u30Var = this.f36525f;
                rectF.set(u30Var.getX(), u30Var.getY(), u30Var.getX() + u30Var.getMeasuredWidth(), u30Var.getY() + u30Var.getMeasuredHeight());
                this.T0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p(String str) {
        if (!org.telegram.messenger.r2.f25199a) {
            return;
        }
        long j3 = this.f36554x0;
        long j10 = 0;
        if (j3 != 0) {
            j10 = (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
        }
        org.telegram.messenger.a8.b("InstantCamera legacy switch[" + this.f36556y0 + "] " + str + ", path=" + this.B0 + ", elapsedMs=" + j10 + ", thread=" + Thread.currentThread().getName());
    }

    public final void q() {
        Bitmap bitmap = this.f36542p0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f36542p0.getBitmap(), 50, 50, true);
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

    public final void r(boolean z9, boolean z10) {
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
        p40 p40Var = this.f38207a;
        if (p40Var != null) {
            ((org.telegram.ui.fe) p40Var).f45614b.Zc.a(z9, true);
        }
        AnimatorSet animatorSet = this.f36520d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f36520d0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        org.telegram.ui.pk pkVar = this.f36543q0;
        u30 u30Var = this.f36525f;
        if (z9 && !this.P0) {
            u30Var.setTranslationX(0.0f);
            pkVar.setTranslationX(0.0f);
            if (z10) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.D0 = measuredHeight;
            w();
        }
        this.P0 = z9;
        View view = this.O0;
        if (view != null) {
            view.invalidate();
        }
        this.f36520d0 = new AnimatorSet();
        if (!z9 && this.f36534j0 > 300) {
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
        AnimatorSet animatorSet2 = this.f36520d0;
        if (z9) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float[] fArr = {f13};
        LinearLayout linearLayout = this.f36515a1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, property, 0.0f);
        k6 k6Var = m6.f35890b;
        if (z9) {
            i7 = 255;
        } else {
            i7 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f36539n, k6Var, i7);
        if (z9) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(u30Var, property, f14);
        if (z9) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(u30Var, property2, f15);
        if (z9) {
            f16 = 1.0f;
        } else {
            f16 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(u30Var, property3, f16);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(u30Var, property4, f10);
        if (z9) {
            f17 = 1.0f;
        } else {
            f17 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(pkVar, property, f17);
        if (z9) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(pkVar, property2, f18);
        if (z9) {
            f19 = 1.0f;
        } else {
            f19 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(pkVar, property3, f19), ObjectAnimator.ofFloat(pkVar, property4, f10), ofFloat);
        if (!z9) {
            this.f36520d0.addListener(new s30(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f36520d0.setDuration(180L);
        this.f36520d0.setInterpolator(new DecelerateInterpolator());
        this.f36520d0.start();
    }

    public final void s() {
        Timer timer = this.f36529g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f36529g1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        Timer timer2 = new Timer();
        this.f36529g1 = timer2;
        timer2.schedule(new fi.h2(this, 2), 0L, 17L);
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
        this.f36515a1.setAlpha(0.0f);
        u30 u30Var = this.f36525f;
        u30Var.setAlpha(0.0f);
        org.telegram.ui.pk pkVar = this.f36543q0;
        pkVar.setAlpha(0.0f);
        ImageView imageView = this.F;
        imageView.setAlpha(0.0f);
        float f13 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f36527f1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        u30Var.setScaleX(f10);
        if (this.f36527f1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        u30Var.setScaleY(f11);
        if (this.f36527f1) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        pkVar.setScaleX(f12);
        if (!this.f36527f1) {
            f13 = 0.1f;
        }
        pkVar.setScaleY(f13);
        if (u30Var.getMeasuredWidth() != 0) {
            u30Var.setPivotX(u30Var.getMeasuredWidth() / 2);
            u30Var.setPivotY(u30Var.getMeasuredHeight() / 2);
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
        Timer timer = this.f36529g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f36529g1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void u() {
        int i7;
        String str;
        String str2;
        this.f36554x0 = SystemClock.elapsedRealtimeNanos();
        this.f36556y0++;
        if (this.f36545r0 && this.f36548t0) {
            i7 = 1 - this.f36535j1;
        } else {
            i7 = 0;
        }
        this.f36557z0 = i7;
        this.A0 = true;
        if (this.f36545r0) {
            if (this.f36548t0) {
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
        sb2.append(this.f36535j1);
        sb2.append(", targetSurface=");
        sb2.append(this.f36557z0);
        p(sb2.toString());
        if (!this.f36545r0 || !this.f36548t0) {
            q();
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.f36552w0 = false;
                this.f36543q0.setImageBitmap(bitmap);
                this.f36543q0.setAlpha(1.0f);
            }
        }
        this.I = !this.I;
        v();
        if (this.f36545r0) {
            if (this.f36548t0) {
                this.f36550v0 = this.f36549u0[!this.I ? 1 : 0];
                a40 a40Var = this.f36538l0;
                Handler handler = a40Var.getHandler();
                if (handler != null) {
                    a40Var.sendMessage(handler.obtainMessage(4), 0);
                    a40Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f36550v0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f36550v0 = null;
                this.f36549u0[this.I ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f36549u0;
            boolean z9 = this.I;
            int i10 = !z9 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z9, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).f24911v3, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24467s0).f24911v3);
            camera2SessionArr[i10] = create;
            this.f36550v0 = create;
            if (create == null) {
                this.A0 = false;
                p("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.m0[0] = new Size(this.f36550v0.getPreviewWidth(), this.f36550v0.getPreviewHeight());
            a40 a40Var2 = this.f36538l0;
            Camera2Session camera2Session2 = this.f36550v0;
            Handler handler2 = a40Var2.getHandler();
            if (handler2 != null) {
                a40Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        } else {
            CameraSession cameraSession = this.f36547s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f36547s0, null, null);
                this.f36547s0 = null;
            }
        }
        o();
        this.J = false;
        a40 a40Var3 = this.f36538l0;
        Handler handler3 = a40Var3.getHandler();
        if (handler3 != null) {
            a40Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void v() {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        if (this.f36521d1 && this.f36532i0 && this.I) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f36524e1 != z9) {
            this.f36524e1 = z9;
            fi.p2 p2Var = this.f36553x;
            if (z9) {
                p2Var.c(null);
            } else {
                p2Var.d();
            }
        }
        if (this.f36545r0) {
            Camera2Session camera2Session = this.f36549u0[1];
            if (camera2Session != null) {
                if (this.f36521d1 && !this.I && this.f36532i0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                camera2Session.setFlash(z11);
            }
        } else {
            CameraSession cameraSession = this.f36547s0;
            if (cameraSession != null) {
                if (this.f36521d1 && !this.I && this.f36532i0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cameraSession.setTorchEnabled(z10);
            }
        }
        fi.n2 n2Var = this.f36551w;
        if (n2Var != null) {
            Boolean bool = this.f36519c1;
            if (bool == null || bool.booleanValue() != this.f36521d1) {
                if (this.f36521d1) {
                    i7 = 2131754914;
                } else {
                    i7 = 2131754913;
                }
                n2Var.setContentDescription(org.telegram.messenger.hd.M0(i7, null));
                boolean z12 = this.f36521d1;
                int i10 = this.f36517b1;
                if (!z12) {
                    if (this.f36555y == null) {
                        zg0 zg0Var = new zg0(2131624186, i10, i10);
                        this.f36555y = zg0Var;
                        zg0Var.setCallback(n2Var);
                    }
                    n2Var.setImageDrawable(this.f36555y);
                    if (this.f36519c1 == null) {
                        zg0 zg0Var2 = this.f36555y;
                        zg0Var2.M(zg0Var2.f40976e[0] - 1);
                    } else {
                        this.f36555y.M(0);
                        this.f36555y.start();
                    }
                } else {
                    if (this.D == null) {
                        zg0 zg0Var3 = new zg0(2131624185, i10, i10);
                        this.D = zg0Var3;
                        zg0Var3.setCallback(n2Var);
                    }
                    n2Var.setImageDrawable(this.D);
                    if (this.f36519c1 == null) {
                        zg0 zg0Var4 = this.D;
                        zg0Var4.M(zg0Var4.f40976e[0] - 1);
                    } else {
                        this.D.M(0);
                        this.D.start();
                    }
                }
                this.f36519c1 = Boolean.valueOf(this.f36521d1);
            }
        }
    }

    public final void w() {
        this.f36543q0.setTranslationY(this.D0 + this.C0);
        this.f36525f.setTranslationY(this.D0 + this.C0);
    }

    @Override
    public c40 getCameraContainer() {
        return this.f36525f;
    }

    @Override
    public void setIsMessageTransition(boolean z9) {
    }
}
