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
public class x50 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Z0 = {285904780, -1394191079};
    public Size A0;
    public boolean B;
    public boolean B0;
    public volatile boolean C;
    public final View C0;
    public AnimatorSet D;
    public boolean D0;
    public TLRPC.InputFile E;
    public float E0;
    public TLRPC.InputEncryptedFile F;
    public float F0;
    public byte[] G;
    public boolean G0;
    public byte[] H;
    public boolean H0;
    public long I;
    public int I0;
    public final boolean J;
    public int J0;
    public VideoEditedInfo K;
    public int K0;
    public i71 L;
    public boolean L0;
    public Bitmap M;
    public final org.telegram.ui.ActionBar.f6 M0;
    public final int N;
    public boolean N0;
    public volatile boolean O;
    public final LinearLayout O0;
    public final int[] P;
    public final int P0;
    public final int[] Q;
    public Boolean Q0;
    public final int[] R;
    public boolean R0;
    public float S;
    public boolean S0;
    public AnimatorSet T;
    public boolean T0;
    public l50 U;
    public Timer U0;
    public File V;
    public w50 V0;
    public long W;
    public Bitmap W0;
    public volatile int X0;
    public ValueAnimator Y0;
    public final int f30546a;
    public long f30547a0;
    public final j50 f30548b;
    public boolean f30549b0;
    public final q50 f30550c;
    public long f30551c0;
    public final i50 d;
    public boolean f30552d0;
    public final RectF e;
    public p50 f30553e0;
    public final ph.b2 f30554f;
    public final Size[] f30555f0;
    public Size f30556g0;
    public final ph.b2 h;
    public final Size f30557h0;
    public TextureView f30558i0;
    public final org.telegram.ui.jl f30559j0;
    public final boolean f30560k0;
    public CameraSession f30561l0;
    public boolean m0;
    public final ph.d2 f30562n;
    public final Camera2Session[] f30563n0;
    public Camera2Session f30564o0;
    public boolean f30565p0;
    public float f30566q0;
    public gj0 f30567r;
    public float f30568r0;
    public gj0 f30569s;
    public final float[] f30570s0;
    public final float[] f30571t0;
    public final float[] f30572u0;
    public gj0 v;
    public FloatBuffer f30573v0;
    public final ImageView f30574w;
    public FloatBuffer f30575w0;
    public float f30576x;
    public FloatBuffer f30577x0;
    public CameraInfo f30578y;
    public float f30579y0;
    public float f30580z0;

    public x50(Context context, q50 q50Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        Size size;
        float f10;
        int i10 = UserConfig.selectedAccount;
        this.f30546a = i10;
        this.B = true;
        this.P = new int[2];
        this.Q = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.R = new int[1];
        this.S = 1.0f;
        this.f30555f0 = new Size[2];
        if (SharedConfig.roundCamera16to9) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f30557h0 = size;
        this.f30560k0 = SharedConfig.isUsingCamera2(i10);
        this.f30563n0 = new Camera2Session[2];
        this.f30570s0 = new float[16];
        this.f30571t0 = new float[16];
        this.f30572u0 = new float[16];
        if (z4) {
            f10 = 24.0f;
        } else {
            f10 = 28.0f;
        }
        this.P0 = AndroidUtilities.dp(f10);
        this.M0 = f6Var;
        this.C0 = q50Var.getFragmentView();
        setWillNotDraw(false);
        this.f30550c = q50Var;
        this.N = q50Var.getClassGuid();
        this.J = q50Var.v();
        i50 i50Var = new i50(this, 0);
        this.d = i50Var;
        i50Var.setStyle(Paint.Style.STROKE);
        i50Var.setStrokeCap(Paint.Cap.ROUND);
        i50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        i50Var.setColor(-1);
        this.e = new RectF();
        ph.d2 d2Var = new ph.d2(getContext(), null, this, null);
        this.f30562n = d2Var;
        d2Var.f41432o = 0.5f;
        d2Var.f41431n = ph.d2.f(0.5f);
        d2Var.g();
        addView(d2Var.f41422b, k7.b6.e(-1, -1, 119));
        j50 j50Var = new j50(this, context);
        this.f30548b = j50Var;
        j50Var.setOutlineProvider(new sl(this, 1));
        j50Var.setClipToOutline(true);
        j50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(j50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(d2Var.f41423c, k7.b6.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, k7.b6.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f30554f = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, k7.b6.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x50 f24465b;

            {
                this.f24465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x50 x50Var = this.f24465b;
                        if (x50Var.C) {
                            if (x50Var.f30560k0) {
                                Camera2Session camera2Session = x50Var.f30564o0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = x50Var.f30561l0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (x50Var.f30553e0 != null) {
                                if (!x50Var.m0) {
                                    x50Var.p();
                                }
                                gj0 gj0Var = x50Var.v;
                                if (gj0Var != null) {
                                    gj0Var.K(0);
                                    x50Var.v.start();
                                }
                                x50Var.B0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(nr.h);
                                boolean[] zArr = new boolean[1];
                                f50 f50Var = new f50(x50Var, 0);
                                j50 j50Var2 = x50Var.f30548b;
                                j50Var2.setCameraDistance(j50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.jl jlVar = x50Var.f30559j0;
                                jlVar.setCameraDistance(jlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new k50(x50Var, zArr, f50Var));
                                ofFloat.addListener(new nh.g3(x50Var, zArr, f50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        x50 x50Var2 = this.f24465b;
                        x50Var2.R0 = true ^ x50Var2.R0;
                        x50Var2.r();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, k7.b6.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final x50 f24465b;

            {
                this.f24465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        x50 x50Var = this.f24465b;
                        if (x50Var.C) {
                            if (x50Var.f30560k0) {
                                Camera2Session camera2Session = x50Var.f30564o0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = x50Var.f30561l0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (x50Var.f30553e0 != null) {
                                if (!x50Var.m0) {
                                    x50Var.p();
                                }
                                gj0 gj0Var = x50Var.v;
                                if (gj0Var != null) {
                                    gj0Var.K(0);
                                    x50Var.v.start();
                                }
                                x50Var.B0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(nr.h);
                                boolean[] zArr = new boolean[1];
                                f50 f50Var = new f50(x50Var, 0);
                                j50 j50Var2 = x50Var.f30548b;
                                j50Var2.setCameraDistance(j50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.jl jlVar = x50Var.f30559j0;
                                jlVar.setCameraDistance(jlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new k50(x50Var, zArr, f50Var));
                                ofFloat.addListener(new nh.g3(x50Var, zArr, f50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        x50 x50Var2 = this.f24465b;
                        x50Var2.R0 = true ^ x50Var2.R0;
                        x50Var2.r();
                        return;
                }
            }
        });
        r();
        if (!z4) {
            d2Var.a(imageView);
            d2Var.a(imageView2);
        } else if (!f6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.f30574w = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, k7.b6.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.jl jlVar = new org.telegram.ui.jl(this, getContext(), paint);
        this.f30559j0 = jlVar;
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(jlVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.T0 = false;
        setVisibility(4);
    }

    public static int a(x50 x50Var, int i10, String str) {
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

    public static boolean b() {
        if (!SharedConfig.bigCameraForRound && !SharedConfig.deviceIsAboveAverage() && Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) != 2) {
            int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
            for (int i10 = 0; i10 < 2; i10++) {
                if (Z0[i10] == hashCode) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean c() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (Z0[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z4) {
        int i10;
        o();
        i71 i71Var = this.L;
        if (i71Var != null) {
            i71Var.H();
            this.L = null;
        }
        if (this.f30558i0 == null) {
            return;
        }
        this.f30552d0 = true;
        this.f30549b0 = false;
        this.R0 = false;
        r();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f30546a);
        int i11 = NotificationCenter.recordStopped;
        Integer valueOf = Integer.valueOf(this.N);
        if (z4) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, valueOf, Integer.valueOf(i10));
        if (this.f30553e0 != null) {
            j();
            this.f30553e0.b(0L, 0, true, 0, 0);
            this.f30553e0 = null;
        } else {
            w50 w50Var = this.V0;
            if (w50Var != null) {
                w50Var.i(0, new s50(0L, 0, 0, true, 0L));
            }
        }
        if (this.U != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.U.delete();
            AutoDeleteMediaTask.unlockFile(this.U);
            this.U = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        m(false, false);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            l50 l50Var = this.U;
            if (l50Var != null && l50Var.getAbsolutePath().equals(str)) {
                this.E = (TLRPC.InputFile) objArr[1];
                this.F = (TLRPC.InputEncryptedFile) objArr[2];
                this.I = ((Long) objArr[5]).longValue();
                if (this.F != null) {
                    this.G = (byte[]) objArr[3];
                    this.H = (byte[]) objArr[4];
                }
            }
        }
    }

    public final void e(float f10, int i10) {
        i71 i71Var = this.L;
        if (i71Var != null) {
            if (i10 == 0) {
                n();
                this.L.C();
            } else if (i10 == 1) {
                o();
                this.L.B();
            } else if (i10 == 2) {
                i71Var.L(f10 * ((float) i71Var.p()), false);
            }
        }
    }

    public final Size f(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 1200;
        if (b()) {
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
        if (!arrayList2.isEmpty() && b()) {
            Collections.sort(arrayList2, new nh.e4(20));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f30557h0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void g() {
        float min;
        if (this.Y0 == null) {
            if (this.f30560k0) {
                Camera2Session camera2Session = this.f30564o0;
                if (camera2Session != null) {
                    min = Utilities.clamp(this.F0, camera2Session.getMaxZoom(), this.f30564o0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.F0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.Y0 = ofFloat;
                ofFloat.addUpdateListener(new f6(this, 26));
                this.Y0.addListener(new h50(this, 1));
                this.Y0.setDuration(350L);
                this.Y0.setInterpolator(nr.f27346f);
                this.Y0.start();
            }
        }
    }

    public View getButtonsLayout() {
        return this.O0;
    }

    public r50 getCameraContainer() {
        return this.f30548b;
    }

    public sk0 getCameraRect() {
        j50 j50Var = this.f30548b;
        int[] iArr = this.P;
        j50Var.getLocationOnScreen(iArr);
        return new sk0(iArr[0], iArr[1], j50Var.getWidth(), j50Var.getHeight());
    }

    public View getMuteImageView() {
        return this.f30574w;
    }

    public Paint getPaint() {
        return this.d;
    }

    public TextureView getTextureView() {
        return this.f30558i0;
    }

    public final void h(boolean z4) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f30560k0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f30563n0;
                if (i10 >= camera2SessionArr.length) {
                    break;
                }
                Camera2Session camera2Session = camera2SessionArr[i10];
                if (camera2Session != null) {
                    camera2Session.destroy(z4);
                    camera2SessionArr[i10] = null;
                }
                i10++;
            }
        } else {
            CameraSession cameraSession = this.f30561l0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f30561l0;
                if (!z4) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        j50 j50Var = this.f30548b;
        j50Var.setTranslationX(0.0f);
        this.f30559j0.setTranslationX(0.0f);
        this.f30568r0 = 0.0f;
        s();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f30558i0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f30558i0);
        }
        this.f30558i0 = null;
        j50Var.setImageReceiver(null);
    }

    public final boolean i() {
        int i10;
        int i11;
        if (this.f30560k0) {
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
            if ((this.B && cameraInfo2.isFrontface()) || (!this.B && !cameraInfo2.isFrontface())) {
                this.f30578y = cameraInfo2;
                break;
            }
            i12++;
            cameraInfo = cameraInfo2;
        }
        if (this.f30578y == null) {
            this.f30578y = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.f30578y;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.f30578y.getPictureSizes();
        Size f10 = f(previewSizes);
        Size[] sizeArr = this.f30555f0;
        sizeArr[0] = f10;
        Size f11 = f(pictureSizes);
        this.f30556g0 = f11;
        if (sizeArr[0].mWidth != f11.mWidth) {
            boolean z4 = false;
            for (int size = previewSizes.size() - 1; size >= 0; size--) {
                Size size2 = previewSizes.get(size);
                int size3 = pictureSizes.size() - 1;
                while (true) {
                    if (size3 < 0) {
                        break;
                    }
                    Size size4 = pictureSizes.get(size3);
                    int i13 = size2.mWidth;
                    Size size5 = this.f30556g0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f30556g0 = size4;
                        z4 = true;
                        break;
                    }
                    size3--;
                }
                if (z4) {
                    break;
                }
            }
            if (!z4) {
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
                            this.f30556g0 = size9;
                            z4 = true;
                            break;
                        }
                        size8--;
                    }
                    if (z4) {
                        break;
                    }
                }
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("InstantCamera preview w = ");
            sb.append(sizeArr[0].mWidth);
            sb.append(" h = ");
            kh.a2.t(sizeArr[0].mHeight, sb);
        }
        return true;
    }

    public final void j() {
        Bitmap bitmap = this.f30558i0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f30558i0.getBitmap(), 50, 50, true);
            this.M = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                    this.M.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void k(int i10, int i11, int i12, long j10, long j11, boolean z4) {
        boolean z10;
        int i13;
        char c3;
        int i14;
        long j12;
        if (this.f30558i0 != null) {
            o();
            i71 i71Var = this.L;
            if (i71Var != null) {
                i71Var.H();
                this.L = null;
            }
            int i15 = 4;
            int i16 = this.f30546a;
            if (i10 == 4) {
                w50 w50Var = this.V0;
                if (w50Var != null && this.f30551c0 > 800) {
                    w50Var.i(1, new s50(j10, i11, i12, z4, j11));
                    return;
                }
                if (BuildVars.DEBUG_VERSION && !this.U.exists()) {
                    FileLog.e(new RuntimeException("file not found :( round video"));
                }
                if (this.K == null) {
                    VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                    this.K = videoEditedInfo;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                }
                if (this.K.needConvert()) {
                    this.E = null;
                    this.F = null;
                    this.G = null;
                    this.H = null;
                    VideoEditedInfo videoEditedInfo2 = this.K;
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
                    videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j16 / d) * this.I));
                    VideoEditedInfo videoEditedInfo3 = this.K;
                    videoEditedInfo3.bitrate = 1000000;
                    long j17 = videoEditedInfo3.startTime;
                    if (j17 > j12) {
                        videoEditedInfo3.startTime = j17 * 1000;
                    }
                    long j18 = videoEditedInfo3.endTime;
                    if (j18 > j12) {
                        videoEditedInfo3.endTime = j18 * 1000;
                    }
                    FileLoader.getInstance(i16).cancelFileUpload(this.U.getAbsolutePath(), false);
                } else {
                    this.K.estimatedSize = Math.max(1L, this.I);
                }
                VideoEditedInfo videoEditedInfo4 = this.K;
                videoEditedInfo4.file = this.E;
                videoEditedInfo4.encryptedFile = this.F;
                videoEditedInfo4.key = this.G;
                videoEditedInfo4.iv = this.H;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.U.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = i12;
                photoEntry.effectId = j10;
                this.f30550c.r(photoEntry, this.K, z4, i11, 0, false, j11);
                if (i11 != 0) {
                    m(false, false);
                }
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            if (this.f30551c0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f30552d0 = z10;
            this.f30549b0 = false;
            this.R0 = false;
            r();
            if (!this.f30552d0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            p50 p50Var = this.f30553e0;
            int i17 = this.N;
            if (p50Var != null) {
                c3 = 1;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f30552d0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                j();
                i13 = i17;
                this.f30553e0.b(j10, i14, z4, i11, i12);
                this.f30553e0 = null;
            } else {
                i13 = i17;
                c3 = 1;
            }
            if (this.f30552d0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i16);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f30551c0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c3] = Boolean.TRUE;
                objArr[2] = valueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr);
                m(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
            }
        }
    }

    public final void l(boolean z4) {
        boolean z10;
        boolean z11;
        if (this.f30558i0 == null) {
            if (this.v == null) {
                int i10 = R.raw.roundcamera_flip;
                int i11 = this.P0;
                gj0 gj0Var = new gj0(i10, i11, "roundcamera_flip", i11);
                this.v = gj0Var;
                gj0Var.K(0);
                this.v.setCallback(this.f30554f);
            }
            this.f30554f.setImageDrawable(this.v);
            this.f30559j0.setAlpha(1.0f);
            this.f30559j0.invalidate();
            if (this.M == null) {
                try {
                    this.M = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.M;
            if (bitmap != null) {
                this.f30559j0.setImageBitmap(bitmap);
            } else {
                this.f30559j0.setImageResource(R.drawable.icplaceholder);
            }
            this.C = false;
            this.f30578y = null;
            if (!z4) {
                if (!this.f30560k0) {
                    this.B = true;
                }
                r();
                this.f30551c0 = 0L;
                this.f30576x = 0.0f;
            }
            this.f30552d0 = false;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.f30565p0 = true;
            if (i()) {
                if (MediaController.getInstance().getPlayingMessageObject() != null) {
                    if (!MediaController.getInstance().getPlayingMessageObject().isVideo() && !MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                        if (SharedConfig.pauseMusicOnRecord) {
                            MediaController.getInstance().pauseByRewind();
                        }
                    } else {
                        MediaController.getInstance().cleanupPlayer(true, true);
                    }
                }
                if (!z4) {
                    File directory = FileLoader.getDirectory(3);
                    this.U = new File(directory, System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
                }
                SharedConfig.saveConfig();
                AutoDeleteMediaTask.lockFile(this.U);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera show round camera " + this.U.getAbsolutePath());
                }
                if (this.f30560k0) {
                    Context context = getContext();
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z12 = globalMainSettings.getBoolean("rounddual_available", z10);
                    this.m0 = z12;
                    if (z12) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            Camera2Session[] camera2SessionArr = this.f30563n0;
                            if (camera2SessionArr[i12] == null) {
                                if (i12 == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                camera2SessionArr[i12] = Camera2Session.create(z11, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                                Camera2Session camera2Session = this.f30563n0[i12];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f30555f0[i12] = new Size(this.f30563n0[i12].getPreviewWidth(), this.f30563n0[i12].getPreviewHeight());
                                }
                            }
                        }
                        r();
                        Camera2Session[] camera2SessionArr2 = this.f30563n0;
                        boolean z13 = this.B;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z13 ? 1 : 0];
                        this.f30564o0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z13 ? 1 : 0] == null) {
                            this.m0 = false;
                        }
                        if (camera2Session2 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f30563n0;
                        boolean z14 = this.B;
                        int i13 = !z14 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z14, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                        camera2SessionArr3[i13] = create;
                        this.f30564o0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f30555f0[0] = new Size(this.f30564o0.getPreviewWidth(), this.f30564o0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f30558i0 = textureView;
                textureView.setSurfaceTextureListener(new ih.h(this, 1));
                this.f30548b.addView(this.f30558i0, k7.b6.c(-1.0f, -1));
                this.L0 = true;
                this.T0 = z4;
                setVisibility(0);
                m(true, z4);
                MediaController.getInstance().requestRecordAudioFocus(true);
            }
        }
    }

    public void m(boolean z4, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float measuredHeight;
        AnimatorSet animatorSet = this.T;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.T.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.C;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z4);
        }
        org.telegram.ui.jl jlVar = this.f30559j0;
        j50 j50Var = this.f30548b;
        if (z4 && !this.D0) {
            j50Var.setTranslationX(0.0f);
            jlVar.setTranslationX(0.0f);
            if (z10) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.f30568r0 = measuredHeight;
            s();
        }
        this.D0 = z4;
        View view = this.C0;
        if (view != null) {
            view.invalidate();
        }
        this.T = new AnimatorSet();
        if (!z4 && this.f30551c0 > 300) {
            f10 = AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (z4) {
            f12 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
        ofFloat.addUpdateListener(new dg.b1(7, this, z10));
        AnimatorSet animatorSet2 = this.T;
        if (z4) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        float[] fArr = {f13};
        LinearLayout linearLayout = this.O0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f30574w, property, 0.0f);
        l6 l6Var = n6.f27200b;
        if (z4) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.d, l6Var, i10);
        if (z4) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(j50Var, property, f14);
        if (z4) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(j50Var, property2, f15);
        if (z4) {
            f16 = 1.0f;
        } else {
            f16 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j50Var, property3, f16);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j50Var, property4, f10);
        if (z4) {
            f17 = 1.0f;
        } else {
            f17 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(jlVar, property, f17);
        if (z4) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(jlVar, property2, f18);
        if (z4) {
            f19 = 1.0f;
        } else {
            f19 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(jlVar, property3, f19), ObjectAnimator.ofFloat(jlVar, property4, f10), ofFloat);
        if (!z4) {
            this.T.addListener(new h50(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.T.setDuration(180L);
        this.T.setInterpolator(new DecelerateInterpolator());
        this.T.start();
    }

    public final void n() {
        Timer timer = this.U0;
        if (timer != null) {
            try {
                timer.cancel();
                this.U0 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Timer timer2 = new Timer();
        this.U0 = timer2;
        timer2.schedule(new g50(this, 0), 0L, 17L);
    }

    public final void o() {
        Timer timer = this.U0;
        if (timer != null) {
            try {
                timer.cancel();
                this.U0 = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f30546a).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f30546a).removeObserver(this, NotificationCenter.fileUploaded);
        ph.d2 d2Var = this.f30562n;
        if (d2Var != null) {
            d2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        j50 j50Var = this.f30548b;
        float x10 = j50Var.getX();
        float y10 = j50Var.getY();
        RectF rectF = this.e;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y10 - AndroidUtilities.dp(8.0f), x10 + j50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y10 + j50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.f30549b0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.W) + this.f30547a0;
            this.f30551c0 = currentTimeMillis;
            this.f30576x = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.f30576x != 0.0f) {
            canvas.save();
            if (!this.B0) {
                canvas.scale(j50Var.getScaleX(), j50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.f30576x * 360.0f, false, this.d);
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
        if (this.L0) {
            if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
                i12 = AndroidUtilities.roundPlayingMessageSize;
            } else {
                i12 = AndroidUtilities.roundMessageSize;
            }
            if (i12 != this.K0) {
                this.K0 = i12;
                org.telegram.ui.jl jlVar = this.f30559j0;
                ViewGroup.LayoutParams layoutParams = jlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = jlVar.getLayoutParams();
                int i13 = this.K0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                j50 j50Var = this.f30548b;
                ViewGroup.LayoutParams layoutParams3 = j50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = j50Var.getLayoutParams();
                int i14 = this.K0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.f30574w.getLayoutParams()).topMargin = (this.K0 / 2) - AndroidUtilities.dp(24.0f);
                jlVar.setRoundRadius(this.K0 / 2);
                j50Var.invalidateOutline();
            }
            this.L0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        ph.d2 d2Var = this.f30562n;
        d2Var.f41422b.measure(makeMeasureSpec, makeMeasureSpec2);
        d2Var.f41423c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.f30568r0 = getMeasuredHeight() / 2.0f;
            s();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i71 i71Var;
        float f10;
        float f11;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f30550c != null && (i71Var = this.L) != null) {
            boolean x10 = i71Var.x();
            this.L.O(!x10);
            AnimatorSet animatorSet = this.D;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.D = animatorSet2;
            if (!x10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            float[] fArr = {f10};
            ImageView imageView = this.f30574w;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, fArr);
            float f12 = 0.5f;
            if (!x10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f11);
            if (!x10) {
                f12 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f12));
            this.D.addListener(new h50(this, 0));
            this.D.setDuration(180L);
            this.D.setInterpolator(new DecelerateInterpolator());
            this.D.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.G0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (this.I0 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (this.J0 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.E0;
                    this.F0 = hypot;
                    if (this.f30560k0) {
                        Camera2Session camera2Session = this.f30564o0;
                        if (camera2Session != null) {
                            this.f30564o0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.f30564o0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f30561l0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.G0 = false;
                    g();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.I0 == motionEvent.getPointerId(0) && this.J0 == motionEvent.getPointerId(1)) || (this.I0 == motionEvent.getPointerId(1) && this.J0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.G0) {
                this.G0 = false;
                g();
                return true;
            }
        } else {
            if (this.H0 && !this.G0 && motionEvent.getPointerCount() == 2 && this.Y0 == null && this.f30549b0) {
                this.E0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.F0 = 1.0f;
                this.I0 = motionEvent.getPointerId(0);
                this.J0 = motionEvent.getPointerId(1);
                this.G0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                j50 j50Var = this.f30548b;
                rectF.set(j50Var.getX(), j50Var.getY(), j50Var.getX() + j50Var.getMeasuredWidth(), j50Var.getY() + j50Var.getMeasuredHeight());
                this.H0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p() {
        if (!this.f30560k0 || !this.m0) {
            j();
            Bitmap bitmap = this.M;
            if (bitmap != null) {
                this.f30565p0 = false;
                this.f30559j0.setImageBitmap(bitmap);
                this.f30559j0.setAlpha(1.0f);
            }
        }
        this.B = !this.B;
        r();
        if (this.f30560k0) {
            if (this.m0) {
                this.f30564o0 = this.f30563n0[!this.B ? 1 : 0];
                p50 p50Var = this.f30553e0;
                Handler handler = p50Var.getHandler();
                if (handler != null) {
                    p50Var.sendMessage(handler.obtainMessage(4), 0);
                    p50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f30564o0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f30564o0 = null;
                this.f30563n0[this.B ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f30563n0;
            boolean z4 = this.B;
            int i10 = !z4 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z4, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.f30564o0 = create;
            if (create != null) {
                create.setRecordingVideo(true);
                this.f30555f0[0] = new Size(this.f30564o0.getPreviewWidth(), this.f30564o0.getPreviewHeight());
                p50 p50Var2 = this.f30553e0;
                Camera2Session camera2Session2 = this.f30564o0;
                Handler handler2 = p50Var2.getHandler();
                if (handler2 != null) {
                    p50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
            } else {
                return;
            }
        } else {
            CameraSession cameraSession = this.f30561l0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f30561l0, null, null);
                this.f30561l0 = null;
            }
        }
        i();
        this.C = false;
        p50 p50Var3 = this.f30553e0;
        Handler handler3 = p50Var3.getHandler();
        if (handler3 != null) {
            p50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void q() {
        boolean z4;
        int i10;
        int i11;
        int i12;
        if (this.f30549b0) {
            if (this.f30551c0 < 800) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f30552d0 = z4;
            this.f30549b0 = false;
            r();
            if (this.f30553e0 != null) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f30546a);
                int i13 = NotificationCenter.recordStopped;
                Integer valueOf = Integer.valueOf(this.N);
                if (this.f30552d0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, Integer.valueOf(i10));
                j();
                p50 p50Var = this.f30553e0;
                boolean z10 = this.f30552d0;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 2;
                }
                if (z10) {
                    i12 = 0;
                } else {
                    i12 = -2;
                }
                p50Var.b(0L, i11, true, 0, i12);
                this.f30553e0 = null;
            }
            if (this.f30552d0) {
                NotificationCenter.getInstance(this.f30546a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.N), Boolean.TRUE, Integer.valueOf((int) this.f30551c0));
                m(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            w50 w50Var = this.V0;
            w50Var.Q.sendMessage(w50Var.Q.obtainMessage(4));
            return;
        }
        w50 w50Var2 = this.V0;
        if (w50Var2 != null) {
            w50Var2.Q.sendMessage(w50Var2.Q.obtainMessage(5));
            h(false);
            i71 i71Var = this.L;
            if (i71Var != null) {
                i71Var.H();
                this.L = null;
            }
            l(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.lockOrientation(this.f30550c.getParentActivity());
            invalidate();
            NotificationCenter.getInstance(this.f30546a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
        }
    }

    public final void r() {
        boolean z4;
        boolean z10;
        int i10;
        boolean z11;
        if (this.R0 && this.f30549b0 && this.B) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.S0 != z4) {
            this.S0 = z4;
            ph.d2 d2Var = this.f30562n;
            if (z4) {
                d2Var.c(null);
            } else {
                d2Var.d();
            }
        }
        if (this.f30560k0) {
            Camera2Session camera2Session = this.f30563n0[1];
            if (camera2Session != null) {
                if (this.R0 && !this.B && this.f30549b0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                camera2Session.setFlash(z11);
            }
        } else {
            CameraSession cameraSession = this.f30561l0;
            if (cameraSession != null) {
                if (this.R0 && !this.B && this.f30549b0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cameraSession.setTorchEnabled(z10);
            }
        }
        ph.b2 b2Var = this.h;
        if (b2Var != null) {
            Boolean bool = this.Q0;
            if (bool == null || bool.booleanValue() != this.R0) {
                if (this.R0) {
                    i10 = R.string.AccDescrCameraFlashOff;
                } else {
                    i10 = R.string.AccDescrCameraFlashOn;
                }
                b2Var.setContentDescription(LocaleController.getString(i10));
                boolean z12 = this.R0;
                int i11 = this.P0;
                if (!z12) {
                    if (this.f30567r == null) {
                        gj0 gj0Var = new gj0(R.raw.roundcamera_flash_on, i11, "roundcamera_flash_on", i11);
                        this.f30567r = gj0Var;
                        gj0Var.setCallback(b2Var);
                    }
                    b2Var.setImageDrawable(this.f30567r);
                    if (this.Q0 == null) {
                        gj0 gj0Var2 = this.f30567r;
                        gj0Var2.K(gj0Var2.e[0] - 1);
                    } else {
                        this.f30567r.K(0);
                        this.f30567r.start();
                    }
                } else {
                    if (this.f30569s == null) {
                        gj0 gj0Var3 = new gj0(R.raw.roundcamera_flash_off, i11, "roundcamera_flash_off", i11);
                        this.f30569s = gj0Var3;
                        gj0Var3.setCallback(b2Var);
                    }
                    b2Var.setImageDrawable(this.f30569s);
                    if (this.Q0 == null) {
                        gj0 gj0Var4 = this.f30569s;
                        gj0Var4.K(gj0Var4.e[0] - 1);
                    } else {
                        this.f30569s.K(0);
                        this.f30569s.start();
                    }
                }
                this.Q0 = Boolean.valueOf(this.R0);
            }
        }
    }

    public final void s() {
        this.f30559j0.setTranslationY(this.f30568r0 + this.f30566q0);
        this.f30548b.setTranslationY(this.f30568r0 + this.f30566q0);
    }

    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setVisibility(int i10) {
        float f10;
        float f11;
        float f12;
        super.setVisibility(i10);
        this.O0.setAlpha(0.0f);
        j50 j50Var = this.f30548b;
        j50Var.setAlpha(0.0f);
        org.telegram.ui.jl jlVar = this.f30559j0;
        jlVar.setAlpha(0.0f);
        ImageView imageView = this.f30574w;
        imageView.setAlpha(0.0f);
        float f13 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.T0) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        j50Var.setScaleX(f10);
        if (this.T0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        j50Var.setScaleY(f11);
        if (this.T0) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        jlVar.setScaleX(f12);
        if (!this.T0) {
            f13 = 0.1f;
        }
        jlVar.setScaleY(f13);
        if (j50Var.getMeasuredWidth() != 0) {
            j50Var.setPivotX(j50Var.getMeasuredWidth() / 2);
            j50Var.setPivotY(j50Var.getMeasuredHeight() / 2);
            jlVar.setPivotX(jlVar.getMeasuredWidth() / 2);
            jlVar.setPivotY(jlVar.getMeasuredHeight() / 2);
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

    public void setIsMessageTransition(boolean z4) {
    }
}
