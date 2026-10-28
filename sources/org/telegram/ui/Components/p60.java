package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLRPC;
public final class p60 extends u60 implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] l1 = {285904780, -1394191079};
    public volatile boolean A0;
    public volatile String B0;
    public float C0;
    public float D0;
    public yj0 E;
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
    public VideoEditedInfo R;
    public float R0;
    public t81 S;
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
    public final org.telegram.ui.ActionBar.u6 Y0;
    public boolean Z0;
    public final int[] f31467a0;
    public final LinearLayout f31468a1;
    public final int[] f31469b0;
    public final int f31470b1;
    public float f31471c0;
    public Boolean f31472c1;
    public AnimatorSet f31473d0;
    public boolean f31474d1;
    public final int e;
    public u50 f31475e0;
    public boolean f31476e1;
    public final s50 f31477f;
    public File f31478f0;
    public boolean f31479f1;
    public long f31480g0;
    public Timer f31481g1;
    public final a60 h;
    public long f31482h0;
    public h60 f31483h1;
    public boolean f31484i0;
    public Bitmap f31485i1;
    public long f31486j0;
    public volatile int f31487j1;
    public boolean f31488k0;
    public ValueAnimator f31489k1;
    public z50 f31490l0;
    public final Size[] m0;
    public final r50 f31491n;
    public Size f31492n0;
    public final Size f31493o0;
    public TextureView f31494p0;
    public final org.telegram.ui.il f31495q0;
    public final RectF f31496r;
    public final boolean f31497r0;
    public final fi.o2 f31498s;
    public CameraSession f31499s0;
    public boolean f31500t0;
    public final Camera2Session[] f31501u0;
    public final fi.o2 v;
    public Camera2Session f31502v0;
    public final fi.q2 f31503w;
    public boolean f31504w0;
    public yj0 f31505x;
    public volatile long f31506x0;
    public yj0 f31507y;
    public volatile int f31508y0;
    public volatile int f31509z0;

    public p60(Context context, a60 a60Var, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        Size size;
        float f7;
        int i10 = UserConfig.selectedAccount;
        this.e = i10;
        this.I = true;
        this.W = new int[2];
        this.f31467a0 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f31469b0 = new int[1];
        this.f31471c0 = 1.0f;
        this.m0 = new Size[2];
        if (SharedConfig.roundCamera16to9) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f31493o0 = size;
        this.f31497r0 = SharedConfig.isUsingCamera2(i10);
        this.f31501u0 = new Camera2Session[2];
        this.E0 = new float[16];
        this.F0 = new float[16];
        this.G0 = new float[16];
        if (z10) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        this.f31470b1 = AndroidUtilities.dp(f7);
        this.Y0 = u6Var;
        this.O0 = a60Var.getFragmentView();
        setWillNotDraw(false);
        this.h = a60Var;
        this.U = a60Var.getClassGuid();
        this.Q = a60Var.w();
        r50 r50Var = new r50(this, 0);
        this.f31491n = r50Var;
        r50Var.setStyle(Paint.Style.STROKE);
        r50Var.setStrokeCap(Paint.Cap.ROUND);
        r50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        r50Var.setColor(-1);
        this.f31496r = new RectF();
        fi.q2 q2Var = new fi.q2(getContext(), null, this, null);
        this.f31503w = q2Var;
        q2Var.f11475o = 0.5f;
        q2Var.f11474n = fi.q2.f(0.5f);
        q2Var.g();
        addView(q2Var.f11465b, kb1.i(-1, -1, 119));
        s50 s50Var = new s50(this, context);
        this.f31477f = s50Var;
        s50Var.setOutlineProvider(new eh.b(this, 2));
        s50Var.setClipToOutline(true);
        s50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(s50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(q2Var.f11466c, kb1.i(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31468a1 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, kb1.h(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f31498s = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, kb1.r(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final p60 f31165b;

            {
                this.f31165b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p60 p60Var = this.f31165b;
                        if (p60Var.J) {
                            if (p60Var.f31497r0) {
                                Camera2Session camera2Session = p60Var.f31502v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = p60Var.f31499s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (p60Var.f31490l0 != null) {
                                if (!p60Var.f31500t0) {
                                    p60Var.v();
                                }
                                yj0 yj0Var = p60Var.E;
                                if (yj0Var != null) {
                                    yj0Var.M(0);
                                    p60Var.E.start();
                                }
                                p60Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(ds.h);
                                boolean[] zArr = new boolean[1];
                                p50 p50Var = new p50(p60Var, 0);
                                s50 s50Var2 = p60Var.f31477f;
                                s50Var2.setCameraDistance(s50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.il ilVar = p60Var.f31495q0;
                                ilVar.setCameraDistance(ilVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new t50(p60Var, zArr, p50Var));
                                ofFloat.addListener(new di.o3(p60Var, zArr, p50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p60 p60Var2 = this.f31165b;
                        p60Var2.f31474d1 = true ^ p60Var2.f31474d1;
                        p60Var2.w();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.v = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, kb1.r(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final p60 f31165b;

            {
                this.f31165b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p60 p60Var = this.f31165b;
                        if (p60Var.J) {
                            if (p60Var.f31497r0) {
                                Camera2Session camera2Session = p60Var.f31502v0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = p60Var.f31499s0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (p60Var.f31490l0 != null) {
                                if (!p60Var.f31500t0) {
                                    p60Var.v();
                                }
                                yj0 yj0Var = p60Var.E;
                                if (yj0Var != null) {
                                    yj0Var.M(0);
                                    p60Var.E.start();
                                }
                                p60Var.N0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(ds.h);
                                boolean[] zArr = new boolean[1];
                                p50 p50Var = new p50(p60Var, 0);
                                s50 s50Var2 = p60Var.f31477f;
                                s50Var2.setCameraDistance(s50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.il ilVar = p60Var.f31495q0;
                                ilVar.setCameraDistance(ilVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new t50(p60Var, zArr, p50Var));
                                ofFloat.addListener(new di.o3(p60Var, zArr, p50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p60 p60Var2 = this.f31165b;
                        p60Var2.f31474d1 = true ^ p60Var2.f31474d1;
                        p60Var2.w();
                        return;
                }
            }
        });
        w();
        if (!z10) {
            q2Var.a(imageView);
            q2Var.a(imageView2);
        } else if (!u6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, kb1.i(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.o(-16777216, 40));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, getContext(), paint);
        this.f31495q0 = ilVar;
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(ilVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.f31479f1 = false;
        setVisibility(4);
    }

    public static int k(p60 p60Var, int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e(GLES20.glGetShaderInfoLog(glCreateShader));
            }
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    public static boolean l() {
        if (!SharedConfig.bigCameraForRound && !SharedConfig.deviceIsAboveAverage() && Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) != 2) {
            int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
            for (int i10 = 0; i10 < 2; i10++) {
                if (l1[i10] == hashCode) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean m() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (l1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void a(boolean z10) {
        int i10;
        u();
        t81 t81Var = this.S;
        if (t81Var != null) {
            t81Var.H();
            this.S = null;
        }
        if (this.f31494p0 == null) {
            return;
        }
        this.f31488k0 = true;
        this.f31484i0 = false;
        this.f31474d1 = false;
        w();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.e);
        int i11 = NotificationCenter.recordStopped;
        Integer valueOf = Integer.valueOf(this.U);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, valueOf, Integer.valueOf(i10));
        if (this.f31490l0 != null) {
            r();
            this.f31490l0.b(0L, 0, true, 0, 0);
            this.f31490l0 = null;
        } else {
            h60 h60Var = this.f31483h1;
            if (h60Var != null) {
                h60Var.i(0, new c60(0L, 0, 0, true, 0L));
            }
        }
        if (this.f31475e0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.f31475e0.delete();
            AutoDeleteMediaTask.unlockFile(this.f31475e0);
            this.f31475e0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        s(false, false);
        invalidate();
    }

    @Override
    public final void b(float f7, int i10) {
        t81 t81Var = this.S;
        if (t81Var != null) {
            if (i10 == 0) {
                t();
                this.S.C();
            } else if (i10 == 1) {
                u();
                this.S.B();
            } else if (i10 == 2) {
                t81Var.L(f7 * ((float) t81Var.p()), false);
            }
        }
    }

    @Override
    public final void c(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f31497r0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f31501u0;
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
            CameraSession cameraSession = this.f31499s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f31499s0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        s50 s50Var = this.f31477f;
        s50Var.setTranslationX(0.0f);
        this.f31495q0.setTranslationX(0.0f);
        this.D0 = 0.0f;
        x();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f31494p0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f31494p0);
        }
        this.f31494p0 = null;
        s50Var.setImageReceiver(null);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            u50 u50Var = this.f31475e0;
            if (u50Var != null && u50Var.getAbsolutePath().equals(str)) {
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
        return !this.f31484i0;
    }

    @Override
    public final void f(float f7) {
        this.C0 = f7 / 2.0f;
        x();
    }

    @Override
    public final void g(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        char c10;
        int i13;
        int i14;
        long j12;
        if (this.f31494p0 != null) {
            u();
            t81 t81Var = this.S;
            if (t81Var != null) {
                t81Var.H();
                this.S = null;
            }
            int i15 = 4;
            int i16 = this.e;
            if (i10 == 4) {
                h60 h60Var = this.f31483h1;
                if (h60Var != null && this.f31486j0 > 800) {
                    h60Var.i(1, new c60(j10, i11, i12, z10, j11));
                    return;
                }
                if (BuildVars.DEBUG_VERSION && !this.f31475e0.exists()) {
                    FileLog.e(new RuntimeException("file not found :( round video"));
                }
                if (this.R == null) {
                    VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                    this.R = videoEditedInfo;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                }
                if (this.R.needConvert()) {
                    this.L = null;
                    this.M = null;
                    this.N = null;
                    this.O = null;
                    VideoEditedInfo videoEditedInfo2 = this.R;
                    long j13 = videoEditedInfo2.estimatedDuration;
                    double d = j13;
                    long j14 = videoEditedInfo2.startTime;
                    if (j14 >= 0) {
                        j12 = 0;
                    } else {
                        j14 = 0;
                        j12 = 0;
                    }
                    long j15 = videoEditedInfo2.endTime;
                    if (j15 >= j12) {
                        j13 = j15;
                    }
                    long j16 = j13 - j14;
                    videoEditedInfo2.estimatedDuration = j16;
                    videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j16 / d) * this.P));
                    VideoEditedInfo videoEditedInfo3 = this.R;
                    videoEditedInfo3.bitrate = 1000000;
                    long j17 = videoEditedInfo3.startTime;
                    if (j17 > j12) {
                        videoEditedInfo3.startTime = j17 * 1000;
                    }
                    long j18 = videoEditedInfo3.endTime;
                    if (j18 > j12) {
                        videoEditedInfo3.endTime = j18 * 1000;
                    }
                    FileLoader.getInstance(i16).cancelFileUpload(this.f31475e0.getAbsolutePath(), false);
                } else {
                    this.R.estimatedSize = Math.max(1L, this.P);
                }
                VideoEditedInfo videoEditedInfo4 = this.R;
                videoEditedInfo4.file = this.L;
                videoEditedInfo4.encryptedFile = this.M;
                videoEditedInfo4.key = this.N;
                videoEditedInfo4.iv = this.O;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.f31475e0.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = i12;
                photoEntry.effectId = j10;
                this.h.r(photoEntry, this.R, z10, i11, 0, false, j11);
                if (i11 != 0) {
                    s(false, false);
                }
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            if (this.f31486j0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f31488k0 = z11;
            this.f31484i0 = false;
            this.f31474d1 = false;
            w();
            if (!this.f31488k0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            z50 z50Var = this.f31490l0;
            int i17 = this.U;
            if (z50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f31488k0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                r();
                i13 = i17;
                this.f31490l0.b(j10, i14, z10, i11, i12);
                this.f31490l0 = null;
            } else {
                c10 = 1;
                i13 = i17;
            }
            if (this.f31488k0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i16);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f31486j0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c10] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                s(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
            }
        }
    }

    @Override
    public View getButtonsLayout() {
        return this.f31468a1;
    }

    @Override
    public RectF getCameraRect() {
        s50 s50Var = this.f31477f;
        int[] iArr = this.W;
        s50Var.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], s50Var.getWidth() + i10, s50Var.getHeight() + iArr[1]);
    }

    @Override
    public View getMuteImageView() {
        return this.F;
    }

    @Override
    public Paint getPaint() {
        return this.f31491n;
    }

    @Override
    public TextureView getTextureView() {
        return this.f31494p0;
    }

    @Override
    public final void h(ch.b bVar, org.telegram.ui.fj fjVar) {
        View view = this.f31468a1;
        eh.d c10 = bVar.c(view, fjVar, false);
        c10.w(AndroidUtilities.dp(6.0f));
        c10.x(AndroidUtilities.dp(21.0f));
        view.setBackground(c10);
    }

    @Override
    public final void i(boolean z10) {
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.f31494p0 == null) {
            if (this.E == null) {
                int i10 = R.raw.roundcamera_flip;
                int i11 = this.f31470b1;
                yj0 yj0Var = new yj0(i10, i11, i11);
                this.E = yj0Var;
                yj0Var.M(0);
                this.E.setCallback(this.f31498s);
            }
            this.f31498s.setImageDrawable(this.E);
            this.f31495q0.setAlpha(1.0f);
            this.f31495q0.invalidate();
            if (this.T == null) {
                try {
                    this.T = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.f31495q0.setImageBitmap(bitmap);
            } else {
                this.f31495q0.setImageResource(R.drawable.icplaceholder);
            }
            this.J = false;
            this.H = null;
            if (!z10) {
                if (!this.f31497r0) {
                    this.I = true;
                }
                w();
                this.f31486j0 = 0L;
                this.G = 0.0f;
            }
            this.f31488k0 = false;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
            this.f31504w0 = true;
            if (p()) {
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (!MediaController.getInstance().getPlayingMessageObject().isVideo() && !MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                        if (SharedConfig.pauseMusicOnRecord) {
                            MediaController.getInstance().pauseByRewind();
                        }
                    } else {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                }
                if (!z10) {
                    this.f31475e0 = new File(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
                }
                SharedConfig.saveConfig();
                AutoDeleteMediaTask.lockFile(this.f31475e0);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera show round camera " + this.f31475e0.getAbsolutePath());
                }
                if (this.f31497r0) {
                    Context context = getContext();
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z15 = globalMainSettings.getBoolean("rounddual_available", z11);
                    this.f31500t0 = z15;
                    if (z15) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            Camera2Session[] camera2SessionArr = this.f31501u0;
                            if (camera2SessionArr[i12] == null) {
                                if (i12 == 0) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                camera2SessionArr[i12] = Camera2Session.create(z14, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                                Camera2Session camera2Session = this.f31501u0[i12];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.m0[i12] = new Size(this.f31501u0[i12].getPreviewWidth(), this.f31501u0[i12].getPreviewHeight());
                                }
                            }
                        }
                        w();
                        Camera2Session[] camera2SessionArr2 = this.f31501u0;
                        boolean z16 = this.I;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z16 ? 1 : 0];
                        this.f31502v0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z16 ? 1 : 0] == null) {
                            this.f31500t0 = false;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb2 = new StringBuilder("InstantCamera legacy switch capability: dual=");
                            sb2.append(this.f31500t0);
                            sb2.append(", initialFacing=");
                            if (this.I) {
                                str = "FRONT";
                            } else {
                                str = "BACK";
                            }
                            sb2.append(str);
                            sb2.append(", frontSession=");
                            if (this.f31501u0[0] != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            sb2.append(z12);
                            sb2.append(", backSession=");
                            if (this.f31501u0[1] != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            sb2.append(z13);
                            FileLog.d(sb2.toString());
                        }
                        if (this.f31502v0 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f31501u0;
                        boolean z17 = this.I;
                        int i13 = !z17 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z17, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                        camera2SessionArr3[i13] = create;
                        this.f31502v0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.m0[0] = new Size(this.f31502v0.getPreviewWidth(), this.f31502v0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f31494p0 = textureView;
                textureView.setSurfaceTextureListener(new v50(this, 0));
                this.f31477f.addView(this.f31494p0, kb1.g(-1.0f, -1));
                this.X0 = true;
                this.f31479f1 = z10;
                setVisibility(0);
                s(true, z10);
                MediaController.getInstance().requestRecordAudioFocus(true);
            }
        }
    }

    @Override
    public final void j() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (this.f31484i0) {
            if (this.f31486j0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31488k0 = z10;
            this.f31484i0 = false;
            w();
            if (this.f31490l0 != null) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.e);
                int i13 = NotificationCenter.recordStopped;
                Integer valueOf = Integer.valueOf(this.U);
                if (this.f31488k0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, Integer.valueOf(i10));
                r();
                z50 z50Var = this.f31490l0;
                boolean z11 = this.f31488k0;
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
                z50Var.b(0L, i11, true, 0, i12);
                this.f31490l0 = null;
            }
            if (this.f31488k0) {
                NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.U), Boolean.TRUE, Integer.valueOf((int) this.f31486j0));
                s(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            h60 h60Var = this.f31483h1;
            h60Var.T.sendMessage(h60Var.T.obtainMessage(4));
            return;
        }
        h60 h60Var2 = this.f31483h1;
        if (h60Var2 != null) {
            h60Var2.T.sendMessage(h60Var2.T.obtainMessage(5));
            c(false);
            t81 t81Var = this.S;
            if (t81Var != null) {
                t81Var.H();
                this.S = null;
            }
            i(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.lockOrientation(this.h.getParentActivity());
            invalidate();
            NotificationCenter.getInstance(this.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
        }
    }

    public final Size n(ArrayList arrayList) {
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
            Collections.sort(arrayList2, new org.telegram.ui.ActionBar.n4(16));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f31493o0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void o() {
        float min;
        if (this.f31489k1 == null) {
            if (this.f31497r0) {
                Camera2Session camera2Session = this.f31502v0;
                if (camera2Session != null) {
                    min = Utilities.clamp(this.R0, camera2Session.getMaxZoom(), this.f31502v0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.R0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.f31489k1 = ofFloat;
                ofFloat.addUpdateListener(new n6(this, 27));
                this.f31489k1.addListener(new q50(this, 1));
                this.f31489k1.setDuration(350L);
                this.f31489k1.setInterpolator(ds.f27530f);
                this.f31489k1.start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.e).addWeakObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.e).removeObserver(this, NotificationCenter.fileUploaded);
        fi.q2 q2Var = this.f31503w;
        if (q2Var != null) {
            q2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        s50 s50Var = this.f31477f;
        float x9 = s50Var.getX();
        float y3 = s50Var.getY();
        RectF rectF = this.f31496r;
        rectF.set(x9 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x9 + s50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + s50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.f31484i0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f31480g0) + this.f31482h0;
            this.f31486j0 = currentTimeMillis;
            this.G = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.G != 0.0f) {
            canvas.save();
            if (!this.N0) {
                canvas.scale(s50Var.getScaleX(), s50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.G * 360.0f, false, this.f31491n);
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
                i12 = AndroidUtilities.roundPlayingMessageSize;
            } else {
                i12 = AndroidUtilities.roundMessageSize;
            }
            if (i12 != this.W0) {
                this.W0 = i12;
                org.telegram.ui.il ilVar = this.f31495q0;
                ViewGroup.LayoutParams layoutParams = ilVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = ilVar.getLayoutParams();
                int i13 = this.W0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                s50 s50Var = this.f31477f;
                ViewGroup.LayoutParams layoutParams3 = s50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = s50Var.getLayoutParams();
                int i14 = this.W0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.F.getLayoutParams()).topMargin = (this.W0 / 2) - AndroidUtilities.dp(24.0f);
                ilVar.setRoundRadius(this.W0 / 2);
                s50Var.invalidateOutline();
            }
            this.X0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        fi.q2 q2Var = this.f31503w;
        q2Var.f11465b.measure(makeMeasureSpec, makeMeasureSpec2);
        q2Var.f11466c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.D0 = getMeasuredHeight() / 2.0f;
            x();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t81 t81Var;
        float f7;
        float f10;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.h != null && (t81Var = this.S) != null) {
            boolean x9 = t81Var.x();
            this.S.O(!x9);
            AnimatorSet animatorSet = this.K;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            if (!x9) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            ImageView imageView = this.F;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, fArr);
            float f11 = 0.5f;
            if (!x9) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f10);
            if (!x9) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f11));
            this.K.addListener(new q50(this, 0));
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
                    if (this.f31497r0) {
                        Camera2Session camera2Session = this.f31502v0;
                        if (camera2Session != null) {
                            this.f31502v0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.f31502v0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f31499s0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
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
            if (this.T0 && !this.S0 && motionEvent.getPointerCount() == 2 && this.f31489k1 == null && this.f31484i0) {
                this.Q0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.R0 = 1.0f;
                this.U0 = motionEvent.getPointerId(0);
                this.V0 = motionEvent.getPointerId(1);
                this.S0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                s50 s50Var = this.f31477f;
                rectF.set(s50Var.getX(), s50Var.getY(), s50Var.getX() + s50Var.getMeasuredWidth(), s50Var.getY() + s50Var.getMeasuredHeight());
                this.T0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final boolean p() {
        int i10;
        int i11;
        if (this.f31497r0) {
            return true;
        }
        ArrayList<CameraInfo> cameras = CameraController.getInstance().getCameras();
        if (cameras == null) {
            return false;
        }
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
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.H.getPictureSizes();
        Size n10 = n(previewSizes);
        Size[] sizeArr = this.m0;
        sizeArr[0] = n10;
        Size n11 = n(pictureSizes);
        this.f31492n0 = n11;
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
                    int i13 = size2.mWidth;
                    Size size5 = this.f31492n0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f31492n0 = size4;
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
                            this.f31492n0 = size9;
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
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("InstantCamera preview w = ");
            sb2.append(sizeArr[0].mWidth);
            sb2.append(" h = ");
            org.telegram.messenger.t.o(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void q(String str) {
        if (!BuildVars.LOGS_ENABLED) {
            return;
        }
        long j10 = this.f31506x0;
        long j11 = 0;
        if (j10 != 0) {
            j11 = (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
        }
        FileLog.d("InstantCamera legacy switch[" + this.f31508y0 + "] " + str + ", path=" + this.B0 + ", elapsedMs=" + j11 + ", thread=" + Thread.currentThread().getName());
    }

    public final void r() {
        Bitmap bitmap = this.f31494p0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f31494p0.getBitmap(), 50, 50, true);
            this.T = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                    this.T.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
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
        q60 q60Var = this.f33240a;
        if (q60Var != null) {
            ((org.telegram.ui.qe) q60Var).f42685b.Wc.a(z10, true);
        }
        AnimatorSet animatorSet = this.f31473d0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f31473d0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.il ilVar = this.f31495q0;
        s50 s50Var = this.f31477f;
        if (z10 && !this.P0) {
            s50Var.setTranslationX(0.0f);
            ilVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.D0 = measuredHeight;
            x();
        }
        this.P0 = z10;
        View view = this.O0;
        if (view != null) {
            view.invalidate();
        }
        this.f31473d0 = new AnimatorSet();
        if (!z10 && this.f31486j0 > 300) {
            f7 = AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
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
        ofFloat.addUpdateListener(new bh.a0(7, this, z11));
        AnimatorSet animatorSet2 = this.f31473d0;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.f31468a1;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.F, property, 0.0f);
        t6 t6Var = v6.f33570b;
        if (z10) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f31491n, t6Var, i10);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s50Var, property, f13);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s50Var, property2, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(s50Var, property3, f15);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(s50Var, property4, f7);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(ilVar, property, f16);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(ilVar, property2, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(ilVar, property3, f18), ObjectAnimator.ofFloat(ilVar, property4, f7), ofFloat);
        if (!z10) {
            this.f31473d0.addListener(new q50(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.f31473d0.setDuration(180L);
        this.f31473d0.setInterpolator(new DecelerateInterpolator());
        this.f31473d0.start();
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
        this.f31468a1.setAlpha(0.0f);
        s50 s50Var = this.f31477f;
        s50Var.setAlpha(0.0f);
        org.telegram.ui.il ilVar = this.f31495q0;
        ilVar.setAlpha(0.0f);
        ImageView imageView = this.F;
        imageView.setAlpha(0.0f);
        float f12 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.f31479f1) {
            f7 = 1.0f;
        } else {
            f7 = 0.1f;
        }
        s50Var.setScaleX(f7);
        if (this.f31479f1) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        s50Var.setScaleY(f10);
        if (this.f31479f1) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        ilVar.setScaleX(f11);
        if (!this.f31479f1) {
            f12 = 0.1f;
        }
        ilVar.setScaleY(f12);
        if (s50Var.getMeasuredWidth() != 0) {
            s50Var.setPivotX(s50Var.getMeasuredWidth() / 2);
            s50Var.setPivotY(s50Var.getMeasuredHeight() / 2);
            ilVar.setPivotX(ilVar.getMeasuredWidth() / 2);
            ilVar.setPivotY(ilVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t() {
        Timer timer = this.f31481g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f31481g1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Timer timer2 = new Timer();
        this.f31481g1 = timer2;
        timer2.schedule(new f6.r(this, 2), 0L, 17L);
    }

    public final void u() {
        Timer timer = this.f31481g1;
        if (timer != null) {
            try {
                timer.cancel();
                this.f31481g1 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void v() {
        int i10;
        String str;
        String str2;
        this.f31506x0 = SystemClock.elapsedRealtimeNanos();
        this.f31508y0++;
        if (this.f31497r0 && this.f31500t0) {
            i10 = 1 - this.f31487j1;
        } else {
            i10 = 0;
        }
        this.f31509z0 = i10;
        this.A0 = true;
        if (this.f31497r0) {
            if (this.f31500t0) {
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
        sb2.append(this.f31487j1);
        sb2.append(", targetSurface=");
        sb2.append(this.f31509z0);
        q(sb2.toString());
        if (!this.f31497r0 || !this.f31500t0) {
            r();
            Bitmap bitmap = this.T;
            if (bitmap != null) {
                this.f31504w0 = false;
                this.f31495q0.setImageBitmap(bitmap);
                this.f31495q0.setAlpha(1.0f);
            }
        }
        this.I = !this.I;
        w();
        if (this.f31497r0) {
            if (this.f31500t0) {
                this.f31502v0 = this.f31501u0[!this.I ? 1 : 0];
                z50 z50Var = this.f31490l0;
                Handler handler = z50Var.getHandler();
                if (handler != null) {
                    z50Var.sendMessage(handler.obtainMessage(4), 0);
                    z50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f31502v0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f31502v0 = null;
                this.f31501u0[this.I ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f31501u0;
            boolean z10 = this.I;
            int i11 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i11] = create;
            this.f31502v0 = create;
            if (create == null) {
                this.A0 = false;
                q("failed: Camera2Session.create returned null");
                return;
            }
            create.setRecordingVideo(true);
            this.m0[0] = new Size(this.f31502v0.getPreviewWidth(), this.f31502v0.getPreviewHeight());
            z50 z50Var2 = this.f31490l0;
            Camera2Session camera2Session2 = this.f31502v0;
            Handler handler2 = z50Var2.getHandler();
            if (handler2 != null) {
                z50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        } else {
            CameraSession cameraSession = this.f31499s0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f31499s0, null, null);
                this.f31499s0 = null;
            }
        }
        p();
        this.J = false;
        z50 z50Var3 = this.f31490l0;
        Handler handler3 = z50Var3.getHandler();
        if (handler3 != null) {
            z50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void w() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (this.f31474d1 && this.f31484i0 && this.I) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f31476e1 != z10) {
            this.f31476e1 = z10;
            fi.q2 q2Var = this.f31503w;
            if (z10) {
                q2Var.c(null);
            } else {
                q2Var.d();
            }
        }
        if (this.f31497r0) {
            Camera2Session camera2Session = this.f31501u0[1];
            if (camera2Session != null) {
                if (this.f31474d1 && !this.I && this.f31484i0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f31499s0;
            if (cameraSession != null) {
                if (this.f31474d1 && !this.I && this.f31484i0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        fi.o2 o2Var = this.v;
        if (o2Var != null) {
            Boolean bool = this.f31472c1;
            if (bool == null || bool.booleanValue() != this.f31474d1) {
                if (this.f31474d1) {
                    i10 = R.string.AccDescrCameraFlashOff;
                } else {
                    i10 = R.string.AccDescrCameraFlashOn;
                }
                o2Var.setContentDescription(LocaleController.getString(i10));
                boolean z13 = this.f31474d1;
                int i11 = this.f31470b1;
                if (!z13) {
                    if (this.f31505x == null) {
                        yj0 yj0Var = new yj0(R.raw.roundcamera_flash_on, i11, i11);
                        this.f31505x = yj0Var;
                        yj0Var.setCallback(o2Var);
                    }
                    o2Var.setImageDrawable(this.f31505x);
                    if (this.f31472c1 == null) {
                        yj0 yj0Var2 = this.f31505x;
                        yj0Var2.M(yj0Var2.e[0] - 1);
                    } else {
                        this.f31505x.M(0);
                        this.f31505x.start();
                    }
                } else {
                    if (this.f31507y == null) {
                        yj0 yj0Var3 = new yj0(R.raw.roundcamera_flash_off, i11, i11);
                        this.f31507y = yj0Var3;
                        yj0Var3.setCallback(o2Var);
                    }
                    o2Var.setImageDrawable(this.f31507y);
                    if (this.f31472c1 == null) {
                        yj0 yj0Var4 = this.f31507y;
                        yj0Var4.M(yj0Var4.e[0] - 1);
                    } else {
                        this.f31507y.M(0);
                        this.f31507y.start();
                    }
                }
                this.f31472c1 = Boolean.valueOf(this.f31474d1);
            }
        }
    }

    public final void x() {
        this.f31495q0.setTranslationY(this.D0 + this.C0);
        this.f31477f.setTranslationY(this.D0 + this.C0);
    }

    @Override
    public b60 getCameraContainer() {
        return this.f31477f;
    }

    @Override
    public void setIsMessageTransition(boolean z10) {
    }
}
