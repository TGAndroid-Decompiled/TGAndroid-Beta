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
public class w50 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] f32150c1 = {285904780, -1394191079};
    public FloatBuffer A0;
    public float B0;
    public float C0;
    public Size D0;
    public boolean E;
    public boolean E0;
    public volatile boolean F;
    public final View F0;
    public AnimatorSet G;
    public boolean G0;
    public TLRPC.InputFile H;
    public float H0;
    public TLRPC.InputEncryptedFile I;
    public float I0;
    public byte[] J;
    public boolean J0;
    public byte[] K;
    public boolean K0;
    public long L;
    public int L0;
    public final boolean M;
    public int M0;
    public VideoEditedInfo N;
    public int N0;
    public g71 O;
    public boolean O0;
    public Bitmap P;
    public final org.telegram.ui.ActionBar.f6 P0;
    public final int Q;
    public boolean Q0;
    public volatile boolean R;
    public final LinearLayout R0;
    public final int[] S;
    public final int S0;
    public final int[] T;
    public Boolean T0;
    public final int[] U;
    public boolean U0;
    public float V;
    public boolean V0;
    public AnimatorSet W;
    public boolean W0;
    public Timer X0;
    public v50 Y0;
    public Bitmap Z0;
    public final int f32151a;
    public i50 f32152a0;
    public volatile int f32153a1;
    public final g50 f32154b;
    public File f32155b0;
    public ValueAnimator f32156b1;
    public final o50 f32157c;
    public long f32158c0;
    public final f50 d;
    public long f32159d0;
    public final RectF f32160e;
    public boolean f32161e0;
    public final di.w2 f32162f;
    public long f32163f0;
    public boolean f32164g0;
    public final di.w2 h;
    public n50 f32165h0;
    public final Size[] f32166i0;
    public Size f32167j0;
    public final Size f32168k0;
    public TextureView f32169l0;
    public final org.telegram.ui.ml m0;
    public final di.y2 f32170n;
    public final boolean f32171n0;
    public CameraSession f32172o0;
    public boolean f32173p0;
    public final Camera2Session[] f32174q0;
    public xi0 f32175r;
    public Camera2Session f32176r0;
    public xi0 f32177s;
    public boolean f32178s0;
    public float f32179t0;
    public float f32180u0;
    public xi0 v;
    public final float[] f32181v0;
    public final ImageView f32182w;
    public final float[] f32183w0;
    public float f32184x;
    public final float[] f32185x0;
    public CameraInfo f32186y;
    public FloatBuffer f32187y0;
    public FloatBuffer f32188z0;

    public w50(Context context, o50 o50Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        Size size;
        float f7;
        int i10 = UserConfig.selectedAccount;
        this.f32151a = i10;
        this.E = true;
        this.S = new int[2];
        this.T = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.U = new int[1];
        this.V = 1.0f;
        this.f32166i0 = new Size[2];
        if (SharedConfig.roundCamera16to9) {
            size = new Size(16, 9);
        } else {
            size = new Size(4, 3);
        }
        this.f32168k0 = size;
        this.f32171n0 = SharedConfig.isUsingCamera2(i10);
        this.f32174q0 = new Camera2Session[2];
        this.f32181v0 = new float[16];
        this.f32183w0 = new float[16];
        this.f32185x0 = new float[16];
        if (z10) {
            f7 = 24.0f;
        } else {
            f7 = 28.0f;
        }
        this.S0 = AndroidUtilities.dp(f7);
        this.P0 = f6Var;
        this.F0 = o50Var.getFragmentView();
        setWillNotDraw(false);
        this.f32157c = o50Var;
        this.Q = o50Var.getClassGuid();
        this.M = o50Var.v();
        f50 f50Var = new f50(this, 0);
        this.d = f50Var;
        f50Var.setStyle(Paint.Style.STROKE);
        f50Var.setStrokeCap(Paint.Cap.ROUND);
        f50Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        f50Var.setColor(-1);
        this.f32160e = new RectF();
        di.y2 y2Var = new di.y2(getContext(), null, this, null);
        this.f32170n = y2Var;
        y2Var.f8488o = 0.5f;
        y2Var.f8487n = di.y2.f(0.5f);
        y2Var.g();
        addView(y2Var.f8477b, w7.x5.e(-1, -1, 119));
        g50 g50Var = new g50(this, context);
        this.f32154b = g50Var;
        g50Var.setOutlineProvider(new dh.b(this, 2));
        g50Var.setClipToOutline(true);
        g50Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(g50Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(y2Var.f8478c, w7.x5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.x5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f32162f = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView((View) imageView, w7.x5.n(44, 44));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final w50 f24921b;

            {
                this.f24921b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w50 w50Var = this.f24921b;
                        if (w50Var.F) {
                            if (w50Var.f32171n0) {
                                Camera2Session camera2Session = w50Var.f32176r0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = w50Var.f32172o0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (w50Var.f32165h0 != null) {
                                if (!w50Var.f32173p0) {
                                    w50Var.p();
                                }
                                xi0 xi0Var = w50Var.v;
                                if (xi0Var != null) {
                                    xi0Var.K(0);
                                    w50Var.v.start();
                                }
                                w50Var.E0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(pr.h);
                                boolean[] zArr = new boolean[1];
                                d50 d50Var = new d50(w50Var, 0);
                                g50 g50Var2 = w50Var.f32154b;
                                g50Var2.setCameraDistance(g50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.ml mlVar = w50Var.m0;
                                mlVar.setCameraDistance(mlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new h50(w50Var, zArr, d50Var));
                                ofFloat.addListener(new bi.j4(w50Var, zArr, d50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        w50 w50Var2 = this.f24921b;
                        w50Var2.U0 = true ^ w50Var2.U0;
                        w50Var2.r();
                        return;
                }
            }
        });
        ?? imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        linearLayout.addView((View) imageView2, w7.x5.n(44, 44));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final w50 f24921b;

            {
                this.f24921b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w50 w50Var = this.f24921b;
                        if (w50Var.F) {
                            if (w50Var.f32171n0) {
                                Camera2Session camera2Session = w50Var.f32176r0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                    return;
                                }
                            } else {
                                CameraSession cameraSession = w50Var.f32172o0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                    return;
                                }
                            }
                            if (w50Var.f32165h0 != null) {
                                if (!w50Var.f32173p0) {
                                    w50Var.p();
                                }
                                xi0 xi0Var = w50Var.v;
                                if (xi0Var != null) {
                                    xi0Var.K(0);
                                    w50Var.v.start();
                                }
                                w50Var.E0 = true;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.setDuration(580L);
                                ofFloat.setInterpolator(pr.h);
                                boolean[] zArr = new boolean[1];
                                d50 d50Var = new d50(w50Var, 0);
                                g50 g50Var2 = w50Var.f32154b;
                                g50Var2.setCameraDistance(g50Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.ml mlVar = w50Var.m0;
                                mlVar.setCameraDistance(mlVar.getMeasuredHeight() * 8.0f);
                                ofFloat.addUpdateListener(new h50(w50Var, zArr, d50Var));
                                ofFloat.addListener(new bi.j4(w50Var, zArr, d50Var, 6));
                                ofFloat.start();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        w50 w50Var2 = this.f24921b;
                        w50Var2.U0 = true ^ w50Var2.U0;
                        w50Var2.r();
                        return;
                }
            }
        });
        r();
        if (!z10) {
            y2Var.a(imageView);
            y2Var.a(imageView2);
        } else if (!f6Var.a()) {
            imageView.setInvert(0.6f);
            imageView2.setInvert(0.6f);
        }
        ImageView imageView3 = new ImageView(context);
        this.f32182w = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.video_mute);
        imageView3.setAlpha(0.0f);
        addView(imageView3, w7.x5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.a.k(-16777216, 40));
        org.telegram.ui.ml mlVar = new org.telegram.ui.ml(this, getContext(), paint);
        this.m0 = mlVar;
        int i12 = AndroidUtilities.roundPlayingMessageSize;
        addView(mlVar, new FrameLayout.LayoutParams(i12, i12, 17));
        this.W0 = false;
        setVisibility(4);
    }

    public static int a(w50 w50Var, int i10, String str) {
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
                if (f32150c1[i10] == hashCode) {
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
            if (f32150c1[i10] == hashCode) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        int i10;
        o();
        g71 g71Var = this.O;
        if (g71Var != null) {
            g71Var.H();
            this.O = null;
        }
        if (this.f32169l0 == null) {
            return;
        }
        this.f32164g0 = true;
        this.f32161e0 = false;
        this.U0 = false;
        r();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f32151a);
        int i11 = NotificationCenter.recordStopped;
        Integer valueOf = Integer.valueOf(this.Q);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 6;
        }
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, valueOf, Integer.valueOf(i10));
        if (this.f32165h0 != null) {
            j();
            this.f32165h0.b(0L, 0, true, 0, 0);
            this.f32165h0 = null;
        } else {
            v50 v50Var = this.Y0;
            if (v50Var != null) {
                v50Var.i(0, new q50(0L, 0, 0, true, 0L));
            }
        }
        if (this.f32152a0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("delete camera file by cancel");
            }
            this.f32152a0.delete();
            AutoDeleteMediaTask.unlockFile(this.f32152a0);
            this.f32152a0 = null;
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
        m(false, false);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            i50 i50Var = this.f32152a0;
            if (i50Var != null && i50Var.getAbsolutePath().equals(str)) {
                this.H = (TLRPC.InputFile) objArr[1];
                this.I = (TLRPC.InputEncryptedFile) objArr[2];
                this.L = ((Long) objArr[5]).longValue();
                if (this.I != null) {
                    this.J = (byte[]) objArr[3];
                    this.K = (byte[]) objArr[4];
                }
            }
        }
    }

    public final void e(float f7, int i10) {
        g71 g71Var = this.O;
        if (g71Var != null) {
            if (i10 == 0) {
                n();
                this.O.C();
            } else if (i10 == 1) {
                o();
                this.O.B();
            } else if (i10 == 2) {
                g71Var.L(f7 * ((float) g71Var.p()), false);
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
            Collections.sort(arrayList2, new org.telegram.ui.f6(11));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean equalsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f32168k0;
        if (equalsIgnoreCase) {
            return CameraController.chooseOptimalSize(arrayList, 640, 480, size, false);
        }
        return CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void g() {
        float min;
        if (this.f32156b1 == null) {
            if (this.f32171n0) {
                Camera2Session camera2Session = this.f32176r0;
                if (camera2Session != null) {
                    min = Utilities.clamp(this.I0, camera2Session.getMaxZoom(), this.f32176r0.getMinZoom());
                } else {
                    return;
                }
            } else {
                min = Math.min(1.0f, Math.max(0.0f, this.I0 - 1.0f));
            }
            if (min > 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(min, 0.0f);
                this.f32156b1 = ofFloat;
                ofFloat.addUpdateListener(new l6(this, 26));
                this.f32156b1.addListener(new e50(this, 1));
                this.f32156b1.setDuration(350L);
                this.f32156b1.setInterpolator(pr.f29493f);
                this.f32156b1.start();
            }
        }
    }

    public View getButtonsLayout() {
        return this.R0;
    }

    public p50 getCameraContainer() {
        return this.f32154b;
    }

    public hk0 getCameraRect() {
        g50 g50Var = this.f32154b;
        int[] iArr = this.S;
        g50Var.getLocationOnScreen(iArr);
        return new hk0(iArr[0], iArr[1], g50Var.getWidth(), g50Var.getHeight());
    }

    public View getMuteImageView() {
        return this.f32182w;
    }

    public Paint getPaint() {
        return this.d;
    }

    public TextureView getTextureView() {
        return this.f32169l0;
    }

    public final void h(boolean z10) {
        CountDownLatch countDownLatch;
        ViewGroup viewGroup;
        if (this.f32171n0) {
            int i10 = 0;
            while (true) {
                Camera2Session[] camera2SessionArr = this.f32174q0;
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
            CameraSession cameraSession = this.f32172o0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController cameraController = CameraController.getInstance();
                CameraSession cameraSession2 = this.f32172o0;
                if (!z10) {
                    countDownLatch = new CountDownLatch(1);
                } else {
                    countDownLatch = null;
                }
                cameraController.close(cameraSession2, countDownLatch, null);
            }
        }
        g50 g50Var = this.f32154b;
        g50Var.setTranslationX(0.0f);
        this.m0.setTranslationX(0.0f);
        this.f32180u0 = 0.0f;
        s();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f32169l0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f32169l0);
        }
        this.f32169l0 = null;
        g50Var.setImageReceiver(null);
    }

    public final boolean i() {
        int i10;
        int i11;
        if (this.f32171n0) {
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
            if ((this.E && cameraInfo2.isFrontface()) || (!this.E && !cameraInfo2.isFrontface())) {
                this.f32186y = cameraInfo2;
                break;
            }
            i12++;
            cameraInfo = cameraInfo2;
        }
        if (this.f32186y == null) {
            this.f32186y = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.f32186y;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.f32186y.getPictureSizes();
        Size f7 = f(previewSizes);
        Size[] sizeArr = this.f32166i0;
        sizeArr[0] = f7;
        Size f10 = f(pictureSizes);
        this.f32167j0 = f10;
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
                    Size size5 = this.f32167j0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f32167j0 = size4;
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
                            this.f32167j0 = size9;
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
            i2.g.o(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void j() {
        Bitmap bitmap = this.f32169l0.getBitmap();
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f32169l0.getBitmap(), 50, 50, true);
            this.P = createScaledBitmap;
            if (createScaledBitmap != null) {
                Utilities.blurBitmap(createScaledBitmap, 7);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                    this.P.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void k(int i10, int i11, int i12, long j3, long j10, boolean z10) {
        boolean z11;
        int i13;
        char c10;
        int i14;
        long j11;
        if (this.f32169l0 != null) {
            o();
            g71 g71Var = this.O;
            if (g71Var != null) {
                g71Var.H();
                this.O = null;
            }
            int i15 = 4;
            int i16 = this.f32151a;
            if (i10 == 4) {
                v50 v50Var = this.Y0;
                if (v50Var != null && this.f32163f0 > 800) {
                    v50Var.i(1, new q50(j3, i11, i12, z10, j10));
                    return;
                }
                if (BuildVars.DEBUG_VERSION && !this.f32152a0.exists()) {
                    FileLog.e(new RuntimeException("file not found :( round video"));
                }
                if (this.N == null) {
                    VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                    this.N = videoEditedInfo;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                }
                if (this.N.needConvert()) {
                    this.H = null;
                    this.I = null;
                    this.J = null;
                    this.K = null;
                    VideoEditedInfo videoEditedInfo2 = this.N;
                    long j12 = videoEditedInfo2.estimatedDuration;
                    double d = j12;
                    long j13 = videoEditedInfo2.startTime;
                    if (j13 >= 0) {
                        j11 = 0;
                    } else {
                        j13 = 0;
                        j11 = 0;
                    }
                    long j14 = videoEditedInfo2.endTime;
                    if (j14 >= j11) {
                        j12 = j14;
                    }
                    long j15 = j12 - j13;
                    videoEditedInfo2.estimatedDuration = j15;
                    videoEditedInfo2.estimatedSize = Math.max(1L, (long) ((j15 / d) * this.L));
                    VideoEditedInfo videoEditedInfo3 = this.N;
                    videoEditedInfo3.bitrate = 1000000;
                    long j16 = videoEditedInfo3.startTime;
                    if (j16 > j11) {
                        videoEditedInfo3.startTime = j16 * 1000;
                    }
                    long j17 = videoEditedInfo3.endTime;
                    if (j17 > j11) {
                        videoEditedInfo3.endTime = j17 * 1000;
                    }
                    FileLoader.getInstance(i16).cancelFileUpload(this.f32152a0.getAbsolutePath(), false);
                } else {
                    this.N.estimatedSize = Math.max(1L, this.L);
                }
                VideoEditedInfo videoEditedInfo4 = this.N;
                videoEditedInfo4.file = this.H;
                videoEditedInfo4.encryptedFile = this.I;
                videoEditedInfo4.key = this.J;
                videoEditedInfo4.iv = this.K;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, this.f32152a0.getAbsolutePath(), 0, true, 0, 0, 0L);
                photoEntry.ttl = i12;
                photoEntry.effectId = j3;
                this.f32157c.q(photoEntry, this.N, z10, i11, 0, false, j10);
                if (i11 != 0) {
                    m(false, false);
                }
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            if (this.f32163f0 < 800) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f32164g0 = z11;
            this.f32161e0 = false;
            this.U0 = false;
            r();
            if (!this.f32164g0) {
                if (i10 == 3) {
                    i15 = 2;
                } else {
                    i15 = 5;
                }
            }
            n50 n50Var = this.f32165h0;
            int i17 = this.Q;
            if (n50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i17), Integer.valueOf(i15));
                if (this.f32164g0) {
                    i14 = 0;
                } else if (i10 == 3) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                j();
                i13 = i17;
                this.f32165h0.b(j3, i14, z10, i11, i12);
                this.f32165h0 = null;
            } else {
                i13 = i17;
                c10 = 1;
            }
            if (this.f32164g0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i16);
                int i18 = NotificationCenter.audioRecordTooShort;
                Integer valueOf = Integer.valueOf(i13);
                Integer valueOf2 = Integer.valueOf((int) this.f32163f0);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[c10] = Boolean.TRUE;
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
        if (this.f32169l0 == null) {
            if (this.v == null) {
                int i10 = R.raw.roundcamera_flip;
                int i11 = this.S0;
                xi0 xi0Var = new xi0(i10, i11, i11);
                this.v = xi0Var;
                xi0Var.K(0);
                this.v.setCallback(this.f32162f);
            }
            this.f32162f.setImageDrawable(this.v);
            this.m0.setAlpha(1.0f);
            this.m0.invalidate();
            if (this.P == null) {
                try {
                    this.P = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.P;
            if (bitmap != null) {
                this.m0.setImageBitmap(bitmap);
            } else {
                this.m0.setImageResource(R.drawable.icplaceholder);
            }
            this.F = false;
            this.f32186y = null;
            if (!z10) {
                if (!this.f32171n0) {
                    this.E = true;
                }
                r();
                this.f32163f0 = 0L;
                this.f32184x = 0.0f;
            }
            this.f32164g0 = false;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.f32178s0 = true;
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
                    this.f32152a0 = new File(directory, System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
                }
                SharedConfig.saveConfig();
                AutoDeleteMediaTask.lockFile(this.f32152a0);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera show round camera " + this.f32152a0.getAbsolutePath());
                }
                if (this.f32171n0) {
                    Context context = getContext();
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    if (SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z13 = globalMainSettings.getBoolean("rounddual_available", z11);
                    this.f32173p0 = z13;
                    if (z13) {
                        for (int i12 = 0; i12 < 2; i12++) {
                            Camera2Session[] camera2SessionArr = this.f32174q0;
                            if (camera2SessionArr[i12] == null) {
                                if (i12 == 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                camera2SessionArr[i12] = Camera2Session.create(z12, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                                Camera2Session camera2Session = this.f32174q0[i12];
                                if (camera2Session != null) {
                                    camera2Session.setRecordingVideo(true);
                                    this.f32166i0[i12] = new Size(this.f32174q0[i12].getPreviewWidth(), this.f32174q0[i12].getPreviewHeight());
                                }
                            }
                        }
                        r();
                        Camera2Session[] camera2SessionArr2 = this.f32174q0;
                        boolean z14 = this.E;
                        Camera2Session camera2Session2 = camera2SessionArr2[!z14 ? 1 : 0];
                        this.f32176r0 = camera2Session2;
                        if (camera2Session2 != null && camera2SessionArr2[z14 ? 1 : 0] == null) {
                            this.f32173p0 = false;
                        }
                        if (camera2Session2 == null) {
                            return;
                        }
                    } else {
                        Camera2Session[] camera2SessionArr3 = this.f32174q0;
                        boolean z15 = this.E;
                        int i13 = !z15 ? 1 : 0;
                        Camera2Session create = Camera2Session.create(z15, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                        camera2SessionArr3[i13] = create;
                        this.f32176r0 = create;
                        if (create == null) {
                            return;
                        }
                        create.setRecordingVideo(true);
                        this.f32166i0[0] = new Size(this.f32176r0.getPreviewWidth(), this.f32176r0.getPreviewHeight());
                    }
                }
                TextureView textureView = new TextureView(getContext());
                this.f32169l0 = textureView;
                textureView.setSurfaceTextureListener(new j50(this, 0));
                this.f32154b.addView(this.f32169l0, w7.x5.c(-1.0f, -1));
                this.O0 = true;
                this.W0 = z10;
                setVisibility(0);
                m(true, z10);
                MediaController.getInstance().requestRecordAudioFocus(true);
            }
        }
    }

    public void m(boolean z10, boolean z11) {
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
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.ml mlVar = this.m0;
        g50 g50Var = this.f32154b;
        if (z10 && !this.G0) {
            g50Var.setTranslationX(0.0f);
            mlVar.setTranslationX(0.0f);
            if (z11) {
                measuredHeight = 0.0f;
            } else {
                measuredHeight = getMeasuredHeight() / 2.0f;
            }
            this.f32180u0 = measuredHeight;
            s();
        }
        this.G0 = z10;
        View view = this.F0;
        if (view != null) {
            view.invalidate();
        }
        this.W = new AnimatorSet();
        if (!z10 && this.f32163f0 > 300) {
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
        ofFloat.addUpdateListener(new ah.l0(7, this, z11));
        AnimatorSet animatorSet2 = this.W;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        float[] fArr = {f12};
        LinearLayout linearLayout = this.R0;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f32182w, property, 0.0f);
        r6 r6Var = t6.f30563b;
        if (z10) {
            i10 = 255;
        } else {
            i10 = 0;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.d, r6Var, i10);
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(g50Var, property, f13);
        if (z10) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(g50Var, property2, f14);
        if (z10) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(g50Var, property3, f15);
        Property property4 = View.TRANSLATION_X;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(g50Var, property4, f7);
        if (z10) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(mlVar, property, f16);
        if (z10) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(mlVar, property2, f17);
        if (z10) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofInt, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ObjectAnimator.ofFloat(mlVar, property3, f18), ObjectAnimator.ofFloat(mlVar, property4, f7), ofFloat);
        if (!z10) {
            this.W.addListener(new e50(this, 2));
        } else {
            setTranslationX(0.0f);
        }
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        this.W.start();
    }

    public final void n() {
        Timer timer = this.X0;
        if (timer != null) {
            try {
                timer.cancel();
                this.X0 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        Timer timer2 = new Timer();
        this.X0 = timer2;
        timer2.schedule(new di.p2(this, 2), 0L, 17L);
    }

    public final void o() {
        Timer timer = this.X0;
        if (timer != null) {
            try {
                timer.cancel();
                this.X0 = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f32151a).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f32151a).removeObserver(this, NotificationCenter.fileUploaded);
        di.y2 y2Var = this.f32170n;
        if (y2Var != null) {
            y2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g50 g50Var = this.f32154b;
        float x10 = g50Var.getX();
        float y3 = g50Var.getY();
        RectF rectF = this.f32160e;
        rectF.set(x10 - AndroidUtilities.dp(8.0f), y3 - AndroidUtilities.dp(8.0f), x10 + g50Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f), y3 + g50Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f));
        if (this.f32161e0) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f32158c0) + this.f32159d0;
            this.f32163f0 = currentTimeMillis;
            this.f32184x = Math.min(1.0f, ((float) currentTimeMillis) / 60000.0f);
            invalidate();
        }
        if (this.f32184x != 0.0f) {
            canvas.save();
            if (!this.E0) {
                canvas.scale(g50Var.getScaleX(), g50Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.f32184x * 360.0f, false, this.d);
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
        if (this.O0) {
            if (View.MeasureSpec.getSize(i11) - getPaddingBottom() > View.MeasureSpec.getSize(i10) * 1.3f) {
                i12 = AndroidUtilities.roundPlayingMessageSize;
            } else {
                i12 = AndroidUtilities.roundMessageSize;
            }
            if (i12 != this.N0) {
                this.N0 = i12;
                org.telegram.ui.ml mlVar = this.m0;
                ViewGroup.LayoutParams layoutParams = mlVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = mlVar.getLayoutParams();
                int i13 = this.N0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                g50 g50Var = this.f32154b;
                ViewGroup.LayoutParams layoutParams3 = g50Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = g50Var.getLayoutParams();
                int i14 = this.N0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.f32182w.getLayoutParams()).topMargin = (this.N0 / 2) - AndroidUtilities.dp(24.0f);
                mlVar.setRoundRadius(this.N0 / 2);
                g50Var.invalidateOutline();
            }
            this.O0 = false;
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        di.y2 y2Var = this.f32170n;
        y2Var.f8477b.measure(makeMeasureSpec, makeMeasureSpec2);
        y2Var.f8478c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.f32180u0 = getMeasuredHeight() / 2.0f;
            s();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g71 g71Var;
        float f7;
        float f10;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f32157c != null && (g71Var = this.O) != null) {
            boolean x10 = g71Var.x();
            this.O.O(!x10);
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            if (!x10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            float[] fArr = {f7};
            ImageView imageView = this.f32182w;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.ALPHA, fArr);
            float f11 = 0.5f;
            if (!x10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_X, f10);
            if (!x10) {
                f11 = 1.0f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(imageView, View.SCALE_Y, f11));
            this.G.addListener(new e50(this, 0));
            this.G.setDuration(180L);
            this.G.setInterpolator(new DecelerateInterpolator());
            this.G.start();
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.J0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (this.L0 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (this.M0 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.H0;
                    this.I0 = hypot;
                    if (this.f32171n0) {
                        Camera2Session camera2Session = this.f32176r0;
                        if (camera2Session != null) {
                            this.f32176r0.setZoom(Utilities.clamp(hypot, camera2Session.getMaxZoom(), this.f32176r0.getMinZoom()));
                            return true;
                        }
                    } else {
                        this.f32172o0.setZoom(Math.min(1.0f, Math.max(0.0f, hypot - 1.0f)));
                        return true;
                    }
                } else {
                    this.J0 = false;
                    g();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.L0 == motionEvent.getPointerId(0) && this.M0 == motionEvent.getPointerId(1)) || (this.L0 == motionEvent.getPointerId(1) && this.M0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.J0) {
                this.J0 = false;
                g();
                return true;
            }
        } else {
            if (this.K0 && !this.J0 && motionEvent.getPointerCount() == 2 && this.f32156b1 == null && this.f32161e0) {
                this.H0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.I0 = 1.0f;
                this.L0 = motionEvent.getPointerId(0);
                this.M0 = motionEvent.getPointerId(1);
                this.J0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                g50 g50Var = this.f32154b;
                rectF.set(g50Var.getX(), g50Var.getY(), g50Var.getX() + g50Var.getMeasuredWidth(), g50Var.getY() + g50Var.getMeasuredHeight());
                this.K0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        }
        return true;
    }

    public final void p() {
        if (!this.f32171n0 || !this.f32173p0) {
            j();
            Bitmap bitmap = this.P;
            if (bitmap != null) {
                this.f32178s0 = false;
                this.m0.setImageBitmap(bitmap);
                this.m0.setAlpha(1.0f);
            }
        }
        this.E = !this.E;
        r();
        if (this.f32171n0) {
            if (this.f32173p0) {
                this.f32176r0 = this.f32174q0[!this.E ? 1 : 0];
                n50 n50Var = this.f32165h0;
                Handler handler = n50Var.getHandler();
                if (handler != null) {
                    n50Var.sendMessage(handler.obtainMessage(4), 0);
                    n50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f32176r0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f32176r0 = null;
                this.f32174q0[this.E ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.f32174q0;
            boolean z10 = this.E;
            int i10 = !z10 ? 1 : 0;
            Camera2Session create = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = create;
            this.f32176r0 = create;
            if (create != null) {
                create.setRecordingVideo(true);
                this.f32166i0[0] = new Size(this.f32176r0.getPreviewWidth(), this.f32176r0.getPreviewHeight());
                n50 n50Var2 = this.f32165h0;
                Camera2Session camera2Session2 = this.f32176r0;
                Handler handler2 = n50Var2.getHandler();
                if (handler2 != null) {
                    n50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
            } else {
                return;
            }
        } else {
            CameraSession cameraSession = this.f32172o0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f32172o0, null, null);
                this.f32172o0 = null;
            }
        }
        i();
        this.F = false;
        n50 n50Var3 = this.f32165h0;
        Handler handler3 = n50Var3.getHandler();
        if (handler3 != null) {
            n50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void q() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        if (this.f32161e0) {
            if (this.f32163f0 < 800) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f32164g0 = z10;
            this.f32161e0 = false;
            r();
            if (this.f32165h0 != null) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f32151a);
                int i13 = NotificationCenter.recordStopped;
                Integer valueOf = Integer.valueOf(this.Q);
                if (this.f32164g0) {
                    i10 = 4;
                } else {
                    i10 = 2;
                }
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, valueOf, Integer.valueOf(i10));
                j();
                n50 n50Var = this.f32165h0;
                boolean z11 = this.f32164g0;
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
                n50Var.b(0L, i11, true, 0, i12);
                this.f32165h0 = null;
            }
            if (this.f32164g0) {
                NotificationCenter.getInstance(this.f32151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.Q), Boolean.TRUE, Integer.valueOf((int) this.f32163f0));
                m(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            v50 v50Var = this.Y0;
            v50Var.T.sendMessage(v50Var.T.obtainMessage(4));
            return;
        }
        v50 v50Var2 = this.Y0;
        if (v50Var2 != null) {
            v50Var2.T.sendMessage(v50Var2.T.obtainMessage(5));
            h(false);
            g71 g71Var = this.O;
            if (g71Var != null) {
                g71Var.H();
                this.O = null;
            }
            l(true);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.lockOrientation(this.f32157c.getParentActivity());
            invalidate();
            NotificationCenter.getInstance(this.f32151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
        }
    }

    public final void r() {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        if (this.U0 && this.f32161e0 && this.E) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.V0 != z10) {
            this.V0 = z10;
            di.y2 y2Var = this.f32170n;
            if (z10) {
                y2Var.c(null);
            } else {
                y2Var.d();
            }
        }
        if (this.f32171n0) {
            Camera2Session camera2Session = this.f32174q0[1];
            if (camera2Session != null) {
                if (this.U0 && !this.E && this.f32161e0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                camera2Session.setFlash(z12);
            }
        } else {
            CameraSession cameraSession = this.f32172o0;
            if (cameraSession != null) {
                if (this.U0 && !this.E && this.f32161e0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cameraSession.setTorchEnabled(z11);
            }
        }
        di.w2 w2Var = this.h;
        if (w2Var != null) {
            Boolean bool = this.T0;
            if (bool == null || bool.booleanValue() != this.U0) {
                if (this.U0) {
                    i10 = R.string.AccDescrCameraFlashOff;
                } else {
                    i10 = R.string.AccDescrCameraFlashOn;
                }
                w2Var.setContentDescription(LocaleController.getString(i10));
                boolean z13 = this.U0;
                int i11 = this.S0;
                if (!z13) {
                    if (this.f32175r == null) {
                        xi0 xi0Var = new xi0(R.raw.roundcamera_flash_on, i11, i11);
                        this.f32175r = xi0Var;
                        xi0Var.setCallback(w2Var);
                    }
                    w2Var.setImageDrawable(this.f32175r);
                    if (this.T0 == null) {
                        xi0 xi0Var2 = this.f32175r;
                        xi0Var2.K(xi0Var2.f32584e[0] - 1);
                    } else {
                        this.f32175r.K(0);
                        this.f32175r.start();
                    }
                } else {
                    if (this.f32177s == null) {
                        xi0 xi0Var3 = new xi0(R.raw.roundcamera_flash_off, i11, i11);
                        this.f32177s = xi0Var3;
                        xi0Var3.setCallback(w2Var);
                    }
                    w2Var.setImageDrawable(this.f32177s);
                    if (this.T0 == null) {
                        xi0 xi0Var4 = this.f32177s;
                        xi0Var4.K(xi0Var4.f32584e[0] - 1);
                    } else {
                        this.f32177s.K(0);
                        this.f32177s.start();
                    }
                }
                this.T0 = Boolean.valueOf(this.U0);
            }
        }
    }

    public final void s() {
        this.m0.setTranslationY(this.f32180u0 + this.f32179t0);
        this.f32154b.setTranslationY(this.f32180u0 + this.f32179t0);
    }

    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setVisibility(int i10) {
        float f7;
        float f10;
        float f11;
        super.setVisibility(i10);
        this.R0.setAlpha(0.0f);
        g50 g50Var = this.f32154b;
        g50Var.setAlpha(0.0f);
        org.telegram.ui.ml mlVar = this.m0;
        mlVar.setAlpha(0.0f);
        ImageView imageView = this.f32182w;
        imageView.setAlpha(0.0f);
        float f12 = 1.0f;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        if (this.W0) {
            f7 = 1.0f;
        } else {
            f7 = 0.1f;
        }
        g50Var.setScaleX(f7);
        if (this.W0) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        g50Var.setScaleY(f10);
        if (this.W0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        mlVar.setScaleX(f11);
        if (!this.W0) {
            f12 = 0.1f;
        }
        mlVar.setScaleY(f12);
        if (g50Var.getMeasuredWidth() != 0) {
            g50Var.setPivotX(g50Var.getMeasuredWidth() / 2);
            g50Var.setPivotY(g50Var.getMeasuredHeight() / 2);
            mlVar.setPivotX(mlVar.getMeasuredWidth() / 2);
            mlVar.setPivotY(mlVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public void setIsMessageTransition(boolean z10) {
    }
}
