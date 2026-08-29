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
public class s50 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] Y0 = {285904780, -1394191079};
    public boolean A;
    public boolean A0;
    public volatile boolean B;
    public final View B0;
    public AnimatorSet C;
    public boolean C0;
    public TLRPC.InputFile D;
    public float D0;
    public TLRPC.InputEncryptedFile E;
    public float E0;
    public byte[] F;
    public boolean F0;
    public byte[] G;
    public boolean G0;
    public long H;
    public int H0;
    public final boolean I;
    public int I0;
    public VideoEditedInfo J;
    public int J0;
    public x61 K;
    public boolean K0;
    public Bitmap L;
    public final org.telegram.ui.ActionBar.c6 L0;
    public final int M;
    public boolean M0;
    public volatile boolean N;
    public final LinearLayout N0;
    public final int[] O;
    public final int O0;
    public final int[] P;
    public Boolean P0;
    public final int[] Q;
    public boolean Q0;
    public float R;
    public boolean R0;
    public AnimatorSet S;
    public boolean S0;
    public g50 T;
    public Timer T0;
    public File U;
    public r50 U0;
    public long V;
    public Bitmap V0;
    public long W;
    public volatile int W0;
    public ValueAnimator X0;
    public final int f32493a;
    public boolean f32494a0;
    public final e50 f32495b;
    public long f32496b0;
    public final l50 f32497c;
    public boolean f32498c0;
    public final d50 d;
    public k50 f32499d0;
    public final RectF f32500e;
    public final Size[] f32501e0;
    public final nh.n2 f32502f;
    public Size f32503f0;
    public final Size f32504g0;
    public final nh.n2 h;
    public TextureView f32505h0;
    public final org.telegram.ui.dl f32506i0;
    public final boolean f32507j0;
    public CameraSession f32508k0;
    public boolean f32509l0;
    public final Camera2Session[] m0;
    public final nh.p2 f32510n;
    public Camera2Session f32511n0;
    public boolean f32512o0;
    public float f32513p0;
    public float f32514q0;
    public xi0 f32515r;
    public final float[] f32516r0;
    public xi0 f32517s;
    public final float[] f32518s0;
    public final float[] f32519t0;
    public FloatBuffer f32520u0;
    public xi0 v;
    public FloatBuffer f32521v0;
    public final ImageView f32522w;
    public FloatBuffer f32523w0;
    public float f32524x;
    public float f32525x0;
    public CameraInfo f32526y;
    public float f32527y0;
    public Size f32528z0;

    public s50(Context context, l50 l50Var, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        Size size;
        float f9;
        int i10 = UserConfig.selectedAccount;
        this.f32493a = i10;
        this.A = true;
        this.O = new int[2];
        this.P = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.Q = new int[1];
        this.R = 1.0f;
        this.f32501e0 = new Size[2];
        if (SharedConfig.roundCamera16to9) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f32504g0 = size;
        this.f32507j0 = SharedConfig.isUsingCamera2(i10);
        this.m0 = new Camera2Session[2];
        this.f32516r0 = new float[16];
        this.f32518s0 = new float[16];
        this.f32519t0 = new float[16];
        if (z10) {
            f9 = 24.0f;
        } else {
            f9 = 28.0f;
        }
        this.O0 = AndroidUtilities.dp(f9);
        this.L0 = c6Var;
        this.B0 = l50Var.getFragmentView();
        setWillNotDraw(false);
        this.f32497c = l50Var;
        this.M = l50Var.getClassGuid();
        this.I = l50Var.w();
        d50 d50Var = new d50(this, 0);
        this.d = d50Var;
        d50Var.setStyle(Paint.Style.STROKE);
        d50Var.setStrokeCap(Paint.Cap.ROUND);
        d50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        d50Var.setColor(-1);
        this.f32500e = new RectF();
        nh.p2 p2Var = new nh.p2(getContext(), null, this, null);
        this.f32510n = p2Var;
        p2Var.f18342o = 0.5f;
        p2Var.f18341n = nh.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.f18331b, i7.f6.e(-1, -1, 119));
        e50 e50Var = new e50(this, context);
        this.f32495b = e50Var;
        e50Var.setOutlineProvider(new ng.b(this, 2));
        e50Var.setClipToOutline(true);
        e50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(e50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(p2Var.f18332c, i7.f6.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, i7.f6.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f32502f = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, i7.f6.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final s50 f26672b;

            {
                this.f26672b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s50 s50Var = this.f26672b;
                        if (s50Var.B) {
                            if (s50Var.f32507j0) {
                                Camera2Session camera2Session = s50Var.f32511n0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = s50Var.f32508k0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (s50Var.f32499d0 != null) {
                                if (!s50Var.f32509l0) {
                                    s50Var.p();
                                }
                                xi0 xi0Var = s50Var.v;
                                if (xi0Var != null) {
                                    xi0Var.K(0);
                                    s50Var.v.start();
                                }
                                s50Var.A0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(jr.h);
                                boolean[] zArr = new boolean[1];
                                b50 b50Var = new b50(s50Var, 0);
                                e50 e50Var2 = s50Var.f32495b;
                                e50Var2.setCameraDistance(e50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.dl dlVar = s50Var.f32506i0;
                                dlVar.setCameraDistance(dlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new f50(s50Var, zArr, b50Var));
                                ofFloat.addListener(new lh.f3(s50Var, zArr, b50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        s50 s50Var2 = this.f26672b;
                        s50Var2.Q0 = true ^ s50Var2.Q0;
                        s50Var2.r();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, i7.f6.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final s50 f26672b;

            {
                this.f26672b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        s50 s50Var = this.f26672b;
                        if (s50Var.B) {
                            if (s50Var.f32507j0) {
                                Camera2Session camera2Session = s50Var.f32511n0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = s50Var.f32508k0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (s50Var.f32499d0 != null) {
                                if (!s50Var.f32509l0) {
                                    s50Var.p();
                                }
                                xi0 xi0Var = s50Var.v;
                                if (xi0Var != null) {
                                    xi0Var.K(0);
                                    s50Var.v.start();
                                }
                                s50Var.A0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(jr.h);
                                boolean[] zArr = new boolean[1];
                                b50 b50Var = new b50(s50Var, 0);
                                e50 e50Var2 = s50Var.f32495b;
                                e50Var2.setCameraDistance(e50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.dl dlVar = s50Var.f32506i0;
                                dlVar.setCameraDistance(dlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new f50(s50Var, zArr, b50Var));
                                ofFloat.addListener(new lh.f3(s50Var, zArr, b50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        s50 s50Var2 = this.f26672b;
                        s50Var2.Q0 = true ^ s50Var2.Q0;
                        s50Var2.r();
                        return;
                }
            }
        });
        r();
        if (!z10) {
            p2Var.a(imageView);
            p2Var.a(imageView2);
        } else if (!c6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.f32522w = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, i7.f6.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.dl dlVar = new org.telegram.ui.dl(this, getContext(), paint);
        this.f32506i0 = dlVar;
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(dlVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.S0 = false;
        setVisibility(4);
    }

    public static int a(s50 s50Var, int i10, String str) {
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
                if (Y0[i10] == hashCode) {
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
            if (Y0[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        int i10;
        o();
        x61 x61Var = this.K;
        if (x61Var != null) {
            x61Var.I();
            this.K = null;
        }
        if (this.f32505h0 == null) {
            return;
        }
        this.f32498c0 = true;
        this.f32494a0 = false;
        this.Q0 = false;
        r();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f32493a);
        int i11 = NotificationCenter.recordStopped;
        Integer valueOf = Integer.valueOf(this.M);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, valueOf, Integer.valueOf(i10));
        if (this.f32499d0 != null) {
            j();
            this.f32499d0.b(0L, 0, true, 0, 0);
            this.f32499d0 = null;
        } else {
            r50 r50Var = this.U0;
            if (r50Var != null) {
                r50Var.i(0, new n50(0L, 0, 0, true, 0L));
            }
        }
        if (this.T != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.T.delete();
            AutoDeleteMediaTask.unlockFile(this.T);
            this.T = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        m(false, false);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            g50 g50Var = this.T;
            if (g50Var != null && g50Var.getAbsolutePath().equals(str)) {
                this.D = (TLRPC.InputFile) objArr[1];
                this.E = (TLRPC.InputEncryptedFile) objArr[2];
                this.H = ((Long) objArr[5]).longValue();
                if (this.E != null) {
                    this.F = (byte[]) objArr[3];
                    this.G = (byte[]) objArr[4];
                }
            }
        }
    }

    public final void e(float f9, int i10) {
        x61 x61Var = this.K;
        if (x61Var != null) {
            if (i10 == 0) {
                n();
                this.K.D();
            } else if (i10 == 1) {
                o();
                this.K.C();
            } else if (i10 == 2) {
                x61Var.M(f9 * ((float) x61Var.q()), false);
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
            Collections.sort(arrayList2, new lh.e4(23));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f32504g0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void g() {
        float min;
        if (this.X0 == null) {
            if (this.f32507j0) {
                Camera2Session camera2Session = this.f32511n0;
                if (camera2Session != null) {
                    min = Utilities.clamp(this.E0, camera2Session.getMaxZoom(), this.f32511n0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.E0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.X0 = ofFloat;
                ofFloat.addUpdateListener(new j6(this, 26));
                this.X0.addListener(new c50(this, 1));
                this.X0.setDuration(350L);
                this.X0.setInterpolator(jr.f29800f);
                this.X0.start();
            }
        }
    }

    public View getButtonsLayout() {
        return this.N0;
    }

    public m50 getCameraContainer() {
        return this.f32495b;
    }

    public hk0 getCameraRect() {
        e50 e50Var = this.f32495b;
        int[] iArr = this.O;
        e50Var.getLocationOnScreen(iArr);
        return new hk0(iArr[0], iArr[1], e50Var.getWidth(), e50Var.getHeight());
    }

    public View getMuteImageView() {
        return this.f32522w;
    }

    public Paint getPaint() {
        return this.d;
    }

    public TextureView getTextureView() {
        return this.f32505h0;
    }

    public final void h(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f32507j0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.m0;
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
            CameraSession cameraSession = this.f32508k0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f32508k0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        e50 e50Var = this.f32495b;
        e50Var.setTranslationX(0.0f);
        this.f32506i0.setTranslationX(0.0f);
        this.f32514q0 = 0.0f;
        s();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f32505h0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f32505h0);
        }
        this.f32505h0 = null;
        e50Var.setImageReceiver(null);
    }

    public final boolean i() {
        int i10;
        int i11;
        if (this.f32507j0) {
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
            if ((this.A && cameraInfo2.isFrontface()) || (!this.A && !cameraInfo2.isFrontface())) {
                this.f32526y = cameraInfo2;
                break;
            }
            i12++;
            cameraInfo = cameraInfo2;
        }
        if (this.f32526y == null) {
            this.f32526y = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.f32526y;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.f32526y.getPictureSizes();
        Size f9 = f(previewSizes);
        Size[] sizeArr = this.f32501e0;
        sizeArr[0] = f9;
        Size f10 = f(pictureSizes);
        this.f32503f0 = f10;
        if (sizeArr[0].mWidth != f10.mWidth) {
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
                    Size size5 = this.f32503f0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f32503f0 = size4;
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
                            this.f32503f0 = size9;
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
            j7.l1.t(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void j() {
        Bitmap bitmap = this.f32505h0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f32505h0.getBitmap(), 50, 50, true);
            this.L = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                    this.L.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void k(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        boolean z11;
        int i13;
        char c3;
        int i14;
        long j12;
        if (this.f32505h0 != null) {
            o();
            x61 x61Var = this.K;
            if (x61Var != null) {
                x61Var.I();
                this.K = null;
            }
            int i15 = 4;
            int i16 = this.f32493a;
            if (i10 == 4) {
                r50 r50Var = this.U0;
                if (r50Var != null && this.f32496b0 > 800) {
                    r50Var.i(1, new n50(j10, i11, i12, z10, j11));
                    return;
                }
                if (BuildVars.DEBUG_VERSION && !this.T.exists()) {
                    FileLog.e(new RuntimeException("file not found :( round video"));
                }
                if (this.J == null) {
                    VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                    this.J = videoEditedInfo;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                }
                if (this.J.needConvert()) {
                    this.D = null;
                    this.E = null;
                    this.F = null;
                    this.G = null;
                    VideoEditedInfo videoEditedInfo2 = this.J;
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
                    videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j16 / d) * this.H));
                    VideoEditedInfo videoEditedInfo3 = this.J;
                    videoEditedInfo3.bitrate = 1000000;
                    long j17 = videoEditedInfo3.startTime;
                    if (j17 > j12) {
                        videoEditedInfo3.startTime = j17 * 1000;
                    }
                    long j18 = videoEditedInfo3.endTime;
                    if (j18 > j12) {
                        videoEditedInfo3.endTime = j18 * 1000;
                    }
                    FileLoader.getInstance(i16).cancelFileUpload(this.T.getAbsolutePath(), false);
                } else {
                    this.J.estimatedSize = Math.max(1L, this.H);
                }
                VideoEditedInfo videoEditedInfo4 = this.J;
                videoEditedInfo4.file = this.D;
                videoEditedInfo4.encryptedFile = this.E;
                videoEditedInfo4.key = this.F;
                videoEditedInfo4.iv = this.G;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.T.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = i12;
                photoEntry.effectId = j10;
                this.f32497c.r(photoEntry, this.J, z10, i11, 0, false, j11);
                if (i11 != 0) {
                    m(false, false);
                }
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            if (this.f32496b0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f32498c0 = z11;
            this.f32494a0 = false;
            this.Q0 = false;
            r();
            if (!this.f32498c0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            k50 k50Var = this.f32499d0;
            int i17 = this.M;
            if (k50Var != null) {
                c3 = 1;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f32498c0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                j();
                i13 = i17;
                this.f32499d0.b(j10, i14, z10, i11, i12);
                this.f32499d0 = null;
            } else {
                i13 = i17;
                c3 = 1;
            }
            if (this.f32498c0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i16);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f32496b0);
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

    public final void l(boolean z10) {
        boolean z11;
        boolean z12;
        if (this.f32505h0 == null) {
            if (this.v == null) {
                int i10 = R.raw.roundcamera_flip;
                int i11 = this.O0;
                xi0 xi0Var = new xi0(i10, i11, "roundcamera_flip", i11);
                this.v = xi0Var;
                xi0Var.K(0);
                this.v.setCallback(this.f32502f);
            }
            this.f32502f.setImageDrawable(this.v);
            this.f32506i0.setAlpha(1.0f);
            this.f32506i0.invalidate();
            if (this.L == null) {
                try {
                    this.L = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.L;
            if (bitmap != null) {
                this.f32506i0.setImageBitmap(bitmap);
            } else {
                this.f32506i0.setImageResource(R.drawable.icplaceholder);
            }
            this.B = false;
            this.f32526y = null;
            if (!z10) {
                if (!this.f32507j0) {
                    this.A = true;
                }
                r();
                this.f32496b0 = 0L;
                this.f32524x = 0.0f;
            }
            this.f32498c0 = false;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.f32512o0 = true;
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
                if (!z10) {
                    File directory = FileLoader.getDirectory(3);
                    this.T = new File(directory, System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
                }
                SharedConfig.saveConfig();
                AutoDeleteMediaTask.lockFile(this.T);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera show round camera " + this.T.getAbsolutePath());
                }
                if (this.f32507j0) {
                    Context context = getContext();
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z13 = globalMainSettings.getBoolean("rounddual_available", z11);
                    this.f32509l0 = z13;
                    if (z13) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            Camera2Session[] camera2SessionArr = this.m0;
                            if (camera2SessionArr[i12] == null) {
                                if (i12 == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                camera2SessionArr[i12] = Camera2Session.create(z12, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                                Camera2Session camera2Session = this.m0[i12];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f32501e0[i12] = new Size(this.m0[i12].getPreviewWidth(), this.m0[i12].getPreviewHeight());
                                }
                            }
                        }
                        r();
                        Camera2Session[] camera2SessionArr2 = this.m0;
                        boolean z14 = this.A;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z14 ? 1 : 0];
                        this.f32511n0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z14 ? 1 : 0] == null) {
                            this.f32509l0 = false;
                        }
                        if (camera2Session2 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.m0;
                        boolean z15 = this.A;
                        int i13 = !z15 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z15, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                        camera2SessionArr3[i13] = create;
                        this.f32511n0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f32501e0[0] = new Size(this.f32511n0.getPreviewWidth(), this.f32511n0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f32505h0 = textureView;
                textureView.setSurfaceTextureListener(new gh.h(this, 1));
                this.f32495b.addView(this.f32505h0, i7.f6.c(-1.0f, -1));
                this.K0 = true;
                this.S0 = z10;
                setVisibility(0);
                m(true, z10);
                MediaController.getInstance().requestRecordAudioFocus(true);
            }
        }
    }

    public void m(boolean z10, boolean z11) {
        float f9;
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
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.S.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.dl dlVar = this.f32506i0;
        e50 e50Var = this.f32495b;
        if (z10 && !this.C0) {
            e50Var.setTranslationX(0.0f);
            dlVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.f32514q0 = measuredHeight;
            s();
        }
        this.C0 = z10;
        View view = this.B0;
        if (view != null) {
            view.invalidate();
        }
        this.S = new AnimatorSet();
        if (!z10 && this.f32496b0 > 300) {
            f9 = AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        } else {
            f9 = 0.0f;
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
        ofFloat.addUpdateListener(new bg.c1(8, this, z11));
        AnimatorSet animatorSet2 = this.S;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.N0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f32522w, property, 0.0f);
        p6 p6Var = r6.f32221b;
        if (z10) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.d, p6Var, i10);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(e50Var, property, f13);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(e50Var, property2, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(e50Var, property3, f15);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(e50Var, property4, f9);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(dlVar, property, f16);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(dlVar, property2, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(dlVar, property3, f18), ObjectAnimator.ofFloat(dlVar, property4, f9), ofFloat);
        if (!z10) {
            this.S.addListener(new c50(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.S.setDuration(180L);
        this.S.setInterpolator(new DecelerateInterpolator());
        this.S.start();
    }

    public final void n() {
        Timer timer = this.T0;
        if (timer != null) {
            try {
                timer.cancel();
                this.T0 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        Timer timer2 = new Timer();
        this.T0 = timer2;
        timer2.schedule(new nh.g2(this, 1), 0L, 17L);
    }

    public final void o() {
        Timer timer = this.T0;
        if (timer != null) {
            try {
                timer.cancel();
                this.T0 = null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f32493a).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f32493a).removeObserver(this, NotificationCenter.fileUploaded);
        nh.p2 p2Var = this.f32510n;
        if (p2Var != null) {
            p2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        e50 e50Var = this.f32495b;
        float x4 = e50Var.getX();
        float y8 = e50Var.getY();
        RectF rectF = this.f32500e;
        rectF.set(x4 - AndroidUtilities.dp(8.0f), y8 - AndroidUtilities.dp(8.0f), x4 + e50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y8 + e50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.f32494a0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.V) + this.W;
            this.f32496b0 = currentTimeMillis;
            this.f32524x = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.f32524x != 0.0f) {
            canvas.save();
            if (!this.A0) {
                canvas.scale(e50Var.getScaleX(), e50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.f32524x * 360.0f, false, this.d);
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
        if (this.K0) {
            if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
                i12 = AndroidUtilities.roundPlayingMessageSize;
            } else {
                i12 = AndroidUtilities.roundMessageSize;
            }
            if (i12 != this.J0) {
                this.J0 = i12;
                org.telegram.ui.dl dlVar = this.f32506i0;
                ViewGroup.LayoutParams layoutParams = dlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = dlVar.getLayoutParams();
                int i13 = this.J0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                e50 e50Var = this.f32495b;
                ViewGroup.LayoutParams layoutParams3 = e50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = e50Var.getLayoutParams();
                int i14 = this.J0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.f32522w.getLayoutParams()).topMargin = (this.J0 / 2) - AndroidUtilities.dp(24.0f);
                dlVar.setRoundRadius(this.J0 / 2);
                e50Var.invalidateOutline();
            }
            this.K0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        nh.p2 p2Var = this.f32510n;
        p2Var.f18331b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.f18332c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.f32514q0 = getMeasuredHeight() / 2.0f;
            s();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x61 x61Var;
        float f9;
        float f10;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f32497c != null && (x61Var = this.K) != null) {
            boolean y8 = x61Var.y();
            this.K.P(!y8);
            AnimatorSet animatorSet = this.C;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.C = animatorSet2;
            if (!y8) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            float[] fArr = {f9};
            ImageView imageView = this.f32522w;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, fArr);
            float f11 = 0.5f;
            if (!y8) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f10);
            if (!y8) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f11));
            this.C.addListener(new c50(this, 0));
            this.C.setDuration(180L);
            this.C.setInterpolator(new DecelerateInterpolator());
            this.C.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.F0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (this.H0 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (this.I0 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.D0;
                    this.E0 = hypot;
                    if (this.f32507j0) {
                        Camera2Session camera2Session = this.f32511n0;
                        if (camera2Session != null) {
                            this.f32511n0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.f32511n0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f32508k0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.F0 = false;
                    g();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.H0 == motionEvent.getPointerId(0) && this.I0 == motionEvent.getPointerId(1)) || (this.H0 == motionEvent.getPointerId(1) && this.I0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.F0) {
                this.F0 = false;
                g();
                return true;
            }
        } else {
            if (this.G0 && !this.F0 && motionEvent.getPointerCount() == 2 && this.X0 == null && this.f32494a0) {
                this.D0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.E0 = 1.0f;
                this.H0 = motionEvent.getPointerId(0);
                this.I0 = motionEvent.getPointerId(1);
                this.F0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                e50 e50Var = this.f32495b;
                rectF.set(e50Var.getX(), e50Var.getY(), e50Var.getX() + e50Var.getMeasuredWidth(), e50Var.getY() + e50Var.getMeasuredHeight());
                this.G0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p() {
        if (!this.f32507j0 || !this.f32509l0) {
            j();
            Bitmap bitmap = this.L;
            if (bitmap != null) {
                this.f32512o0 = false;
                this.f32506i0.setImageBitmap(bitmap);
                this.f32506i0.setAlpha(1.0f);
            }
        }
        this.A = !this.A;
        r();
        if (this.f32507j0) {
            if (this.f32509l0) {
                this.f32511n0 = this.m0[!this.A ? 1 : 0];
                k50 k50Var = this.f32499d0;
                Handler handler = k50Var.getHandler();
                if (handler != null) {
                    k50Var.sendMessage(handler.obtainMessage(4), 0);
                    k50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f32511n0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f32511n0 = null;
                this.m0[this.A ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.m0;
            boolean z10 = this.A;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.f32511n0 = create;
            if (create != null) {
                create.setRecordingVideo(true);
                this.f32501e0[0] = new Size(this.f32511n0.getPreviewWidth(), this.f32511n0.getPreviewHeight());
                k50 k50Var2 = this.f32499d0;
                Camera2Session camera2Session2 = this.f32511n0;
                Handler handler2 = k50Var2.getHandler();
                if (handler2 != null) {
                    k50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
            } else {
                return;
            }
        } else {
            CameraSession cameraSession = this.f32508k0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f32508k0, null, null);
                this.f32508k0 = null;
            }
        }
        i();
        this.B = false;
        k50 k50Var3 = this.f32499d0;
        Handler handler3 = k50Var3.getHandler();
        if (handler3 != null) {
            k50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void q() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (this.f32494a0) {
            if (this.f32496b0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32498c0 = z10;
            this.f32494a0 = false;
            r();
            if (this.f32499d0 != null) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f32493a);
                int i13 = NotificationCenter.recordStopped;
                Integer valueOf = Integer.valueOf(this.M);
                if (this.f32498c0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, Integer.valueOf(i10));
                j();
                k50 k50Var = this.f32499d0;
                boolean z11 = this.f32498c0;
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
                k50Var.b(0L, i11, true, 0, i12);
                this.f32499d0 = null;
            }
            if (this.f32498c0) {
                NotificationCenter.getInstance(this.f32493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.M), Boolean.TRUE, Integer.valueOf((int) this.f32496b0));
                m(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            r50 r50Var = this.U0;
            r50Var.P.sendMessage(r50Var.P.obtainMessage(4));
            return;
        }
        r50 r50Var2 = this.U0;
        if (r50Var2 != null) {
            r50Var2.P.sendMessage(r50Var2.P.obtainMessage(5));
            h(false);
            x61 x61Var = this.K;
            if (x61Var != null) {
                x61Var.I();
                this.K = null;
            }
            l(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.lockOrientation(this.f32497c.getParentActivity());
            invalidate();
            NotificationCenter.getInstance(this.f32493a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
        }
    }

    public final void r() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (this.Q0 && this.f32494a0 && this.A) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R0 != z10) {
            this.R0 = z10;
            nh.p2 p2Var = this.f32510n;
            if (z10) {
                p2Var.c(null);
            } else {
                p2Var.d();
            }
        }
        if (this.f32507j0) {
            Camera2Session camera2Session = this.m0[1];
            if (camera2Session != null) {
                if (this.Q0 && !this.A && this.f32494a0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f32508k0;
            if (cameraSession != null) {
                if (this.Q0 && !this.A && this.f32494a0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        nh.n2 n2Var = this.h;
        if (n2Var != null) {
            Boolean bool = this.P0;
            if (bool == null || bool.booleanValue() != this.Q0) {
                if (this.Q0) {
                    i10 = R.string.AccDescrCameraFlashOff;
                } else {
                    i10 = R.string.AccDescrCameraFlashOn;
                }
                n2Var.setContentDescription(LocaleController.getString(i10));
                boolean z13 = this.Q0;
                int i11 = this.O0;
                if (!z13) {
                    if (this.f32515r == null) {
                        xi0 xi0Var = new xi0(R.raw.roundcamera_flash_on, i11, "roundcamera_flash_on", i11);
                        this.f32515r = xi0Var;
                        xi0Var.setCallback(n2Var);
                    }
                    n2Var.setImageDrawable(this.f32515r);
                    if (this.P0 == null) {
                        xi0 xi0Var2 = this.f32515r;
                        xi0Var2.K(xi0Var2.f34737e[0] - 1);
                    } else {
                        this.f32515r.K(0);
                        this.f32515r.start();
                    }
                } else {
                    if (this.f32517s == null) {
                        xi0 xi0Var3 = new xi0(R.raw.roundcamera_flash_off, i11, "roundcamera_flash_off", i11);
                        this.f32517s = xi0Var3;
                        xi0Var3.setCallback(n2Var);
                    }
                    n2Var.setImageDrawable(this.f32517s);
                    if (this.P0 == null) {
                        xi0 xi0Var4 = this.f32517s;
                        xi0Var4.K(xi0Var4.f34737e[0] - 1);
                    } else {
                        this.f32517s.K(0);
                        this.f32517s.start();
                    }
                }
                this.P0 = Boolean.valueOf(this.Q0);
            }
        }
    }

    public final void s() {
        this.f32506i0.setTranslationY(this.f32514q0 + this.f32513p0);
        this.f32495b.setTranslationY(this.f32514q0 + this.f32513p0);
    }

    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setVisibility(int i10) {
        float f9;
        float f10;
        float f11;
        super.setVisibility(i10);
        this.N0.setAlpha(0.0f);
        e50 e50Var = this.f32495b;
        e50Var.setAlpha(0.0f);
        org.telegram.ui.dl dlVar = this.f32506i0;
        dlVar.setAlpha(0.0f);
        ImageView imageView = this.f32522w;
        imageView.setAlpha(0.0f);
        float f12 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.S0) {
            f9 = 1.0f;
        } else {
            f9 = 0.1f;
        }
        e50Var.setScaleX(f9);
        if (this.S0) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        e50Var.setScaleY(f10);
        if (this.S0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        dlVar.setScaleX(f11);
        if (!this.S0) {
            f12 = 0.1f;
        }
        dlVar.setScaleY(f12);
        if (e50Var.getMeasuredWidth() != 0) {
            e50Var.setPivotX(e50Var.getMeasuredWidth() / 2);
            e50Var.setPivotY(e50Var.getMeasuredHeight() / 2);
            dlVar.setPivotX(dlVar.getMeasuredWidth() / 2);
            dlVar.setPivotY(dlVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public void setIsMessageTransition(boolean z10) {
    }
}
