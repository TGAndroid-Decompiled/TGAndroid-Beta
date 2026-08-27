package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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

public class k50 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
    public m61 K;
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
    public x40 T;
    public Timer T0;
    public File U;
    public j50 U0;
    public long V;
    public Bitmap V0;
    public long W;
    public volatile int W0;
    public ValueAnimator X0;

    public final int f29967a;

    public boolean f29968a0;

    public final v40 f29969b;

    public long f29970b0;

    public final c50 f29971c;

    public boolean f29972c0;
    public final u40 d;

    public b50 f29973d0;

    public final RectF f29974e;

    public final Size[] f29975e0;

    public final lh.p2 f29976f;

    public Size f29977f0;

    public final Size f29978g0;
    public final lh.p2 h;

    public TextureView f29979h0;

    public final org.telegram.ui.cl f29980i0;

    public final boolean f29981j0;

    public CameraSession f29982k0;

    public boolean f29983l0;
    public final Camera2Session[] m0;

    public final lh.r2 f29984n;

    public Camera2Session f29985n0;

    public boolean f29986o0;

    public float f29987p0;

    public float f29988q0;

    public oi0 f29989r;

    public final float[] f29990r0;

    public oi0 f29991s;

    public final float[] f29992s0;

    public final float[] f29993t0;

    public FloatBuffer f29994u0;
    public oi0 v;

    public FloatBuffer f29995v0;

    public final ImageView f29996w;

    public FloatBuffer f29997w0;

    public float f29998x;

    public float f29999x0;

    public CameraInfo f30000y;

    public float f30001y0;

    public Size f30002z0;

    public k50(Context context, c50 c50Var, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        int i10 = UserConfig.selectedAccount;
        this.f29967a = i10;
        this.A = true;
        this.O = new int[2];
        this.P = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.Q = new int[1];
        this.R = 1.0f;
        this.f29975e0 = new Size[2];
        this.f29978g0 = SharedConfig.roundCamera16to9 ? new Size(16, 9) : new Size(4, 3);
        this.f29981j0 = SharedConfig.isUsingCamera2(i10);
        this.m0 = new Camera2Session[2];
        this.f29990r0 = new float[16];
        this.f29992s0 = new float[16];
        this.f29993t0 = new float[16];
        this.O0 = AndroidUtilities.dp(z10 ? 24.0f : 28.0f);
        this.L0 = c6Var;
        this.B0 = c50Var.getFragmentView();
        setWillNotDraw(false);
        this.f29971c = c50Var;
        this.M = c50Var.getClassGuid();
        this.I = c50Var.x();
        u40 u40Var = new u40(this, 0);
        this.d = u40Var;
        u40Var.setStyle(Paint.Style.STROKE);
        u40Var.setStrokeCap(Paint.Cap.ROUND);
        u40Var.setStrokeWidth(AndroidUtilities.dp(3.0f));
        u40Var.setColor(-1);
        this.f29974e = new RectF();
        lh.r2 r2Var = new lh.r2(getContext(), null, this, null);
        this.f29984n = r2Var;
        r2Var.f16638o = 0.5f;
        r2Var.f16637n = lh.r2.f(0.5f);
        r2Var.g();
        addView(r2Var.f16627b, h7.z5.e(-1, -1, 119));
        v40 v40Var = new v40(this, context);
        this.f29969b = v40Var;
        v40Var.setOutlineProvider(new lg.b(this, 2));
        v40Var.setClipToOutline(true);
        v40Var.setWillNotDraw(false);
        int i11 = AndroidUtilities.roundPlayingMessageSize;
        addView(v40Var, new FrameLayout.LayoutParams(i11, i11, 17));
        addView(r2Var.f16628c, h7.z5.e(-1, -1, 119));
        LinearLayout linearLayout = new LinearLayout(context);
        this.N0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        linearLayout.setOrientation(0);
        addView(linearLayout, h7.z5.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        lh.p2 p2Var = new lh.p2(context);
        this.f29976f = p2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        p2Var.setScaleType(scaleType);
        p2Var.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        linearLayout.addView(p2Var, h7.z5.n(44, 44));
        final int i12 = 0;
        p2Var.setOnClickListener(new View.OnClickListener(this) {

            public final k50 f32079b;

            {
                this.f32079b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        k50 k50Var = this.f32079b;
                        if (k50Var.B) {
                            if (k50Var.f29981j0) {
                                Camera2Session camera2Session = k50Var.f29985n0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = k50Var.f29982k0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (k50Var.f29973d0 != null) {
                                if (!k50Var.f29983l0) {
                                    k50Var.p();
                                }
                                oi0 oi0Var = k50Var.v;
                                int i13 = 0;
                                if (oi0Var != null) {
                                    oi0Var.K(0);
                                    k50Var.v.start();
                                }
                                k50Var.A0 = true;
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.setDuration(580L);
                                valueAnimatorOfFloat.setInterpolator(er.h);
                                boolean[] zArr = new boolean[1];
                                s40 s40Var = new s40(k50Var, i13);
                                v40 v40Var2 = k50Var.f29969b;
                                v40Var2.setCameraDistance(v40Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.cl clVar = k50Var.f29980i0;
                                clVar.setCameraDistance(clVar.getMeasuredHeight() * 8.0f);
                                valueAnimatorOfFloat.addUpdateListener(new w40(k50Var, zArr, s40Var));
                                valueAnimatorOfFloat.addListener(new jh.h3(k50Var, zArr, s40Var, 6));
                                valueAnimatorOfFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        k50 k50Var2 = this.f32079b;
                        k50Var2.Q0 = true ^ k50Var2.Q0;
                        k50Var2.r();
                        break;
                }
            }
        });
        lh.p2 p2Var2 = new lh.p2(context);
        this.h = p2Var2;
        p2Var2.setScaleType(scaleType);
        linearLayout.addView(p2Var2, h7.z5.n(44, 44));
        final int i13 = 1;
        p2Var2.setOnClickListener(new View.OnClickListener(this) {

            public final k50 f32079b;

            {
                this.f32079b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        k50 k50Var = this.f32079b;
                        if (k50Var.B) {
                            if (k50Var.f29981j0) {
                                Camera2Session camera2Session = k50Var.f29985n0;
                                if (camera2Session == null || !camera2Session.isInitiated()) {
                                }
                            } else {
                                CameraSession cameraSession = k50Var.f29982k0;
                                if (cameraSession == null || !cameraSession.isInitied()) {
                                }
                            }
                            if (k50Var.f29973d0 != null) {
                                if (!k50Var.f29983l0) {
                                    k50Var.p();
                                }
                                oi0 oi0Var = k50Var.v;
                                int i14 = 0;
                                if (oi0Var != null) {
                                    oi0Var.K(0);
                                    k50Var.v.start();
                                }
                                k50Var.A0 = true;
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.setDuration(580L);
                                valueAnimatorOfFloat.setInterpolator(er.h);
                                boolean[] zArr = new boolean[1];
                                s40 s40Var = new s40(k50Var, i14);
                                v40 v40Var2 = k50Var.f29969b;
                                v40Var2.setCameraDistance(v40Var2.getMeasuredHeight() * 8.0f);
                                org.telegram.ui.cl clVar = k50Var.f29980i0;
                                clVar.setCameraDistance(clVar.getMeasuredHeight() * 8.0f);
                                valueAnimatorOfFloat.addUpdateListener(new w40(k50Var, zArr, s40Var));
                                valueAnimatorOfFloat.addListener(new jh.h3(k50Var, zArr, s40Var, 6));
                                valueAnimatorOfFloat.start();
                                break;
                            }
                        }
                        break;
                    default:
                        k50 k50Var2 = this.f32079b;
                        k50Var2.Q0 = true ^ k50Var2.Q0;
                        k50Var2.r();
                        break;
                }
            }
        });
        r();
        if (!z10) {
            r2Var.a(p2Var);
            r2Var.a(p2Var2);
        } else if (!c6Var.a()) {
            p2Var.setInvert(0.6f);
            p2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(context);
        this.f29996w = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, h7.z5.e(48, 48, 17));
        Paint paint = new Paint(1);
        paint.setColor(i0.b.k(-16777216, 40));
        org.telegram.ui.cl clVar = new org.telegram.ui.cl(this, getContext(), paint);
        this.f29980i0 = clVar;
        int i14 = AndroidUtilities.roundPlayingMessageSize;
        addView(clVar, new FrameLayout.LayoutParams(i14, i14, 17));
        this.S0 = false;
        setVisibility(4);
    }

    public static int a(k50 k50Var, int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e(GLES20.glGetShaderInfoLog(iGlCreateShader));
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static boolean b() {
        if (SharedConfig.bigCameraForRound || SharedConfig.deviceIsAboveAverage() || Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int iHashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (Y0[i10] == iHashCode) {
                return true;
            }
        }
        return false;
    }

    public static boolean c() {
        if (Math.max(SharedConfig.getDevicePerformanceClass(), SharedConfig.getLegacyDevicePerformanceClass()) == 2) {
            return true;
        }
        int iHashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        for (int i10 = 0; i10 < 2; i10++) {
            if (Y0[i10] == iHashCode) {
                return true;
            }
        }
        return false;
    }

    public final void d(boolean z10) {
        o();
        m61 m61Var = this.K;
        if (m61Var != null) {
            m61Var.I();
            this.K = null;
        }
        if (this.f29979h0 == null) {
            return;
        }
        this.f29972c0 = true;
        this.f29968a0 = false;
        this.Q0 = false;
        r();
        NotificationCenter.getInstance(this.f29967a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.M), Integer.valueOf(z10 ? 0 : 6));
        if (this.f29973d0 != null) {
            j();
            this.f29973d0.b(0L, 0, true, 0, 0);
            this.f29973d0 = null;
        } else {
            j50 j50Var = this.U0;
            if (j50Var != null) {
                j50Var.i(0, new e50(0L, 0, 0, true, 0L));
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
            x40 x40Var = this.T;
            if (x40Var == null || !x40Var.getAbsolutePath().equals(str)) {
                return;
            }
            this.D = (TLRPC.InputFile) objArr[1];
            this.E = (TLRPC.InputEncryptedFile) objArr[2];
            this.H = ((Long) objArr[5]).longValue();
            if (this.E != null) {
                this.F = (byte[]) objArr[3];
                this.G = (byte[]) objArr[4];
            }
        }
    }

    public final void e(float f10, int i10) {
        m61 m61Var = this.K;
        if (m61Var == null) {
            return;
        }
        if (i10 == 0) {
            n();
            this.K.D();
        } else if (i10 == 1) {
            o();
            this.K.C();
        } else if (i10 == 2) {
            m61Var.M((long) (f10 * m61Var.q()), false);
        }
    }

    public final Size f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i10 = Build.MANUFACTURER.equalsIgnoreCase("Samsung") ? 1200 : b() ? 1440 : 1200;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (Math.max(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) <= i10 && Math.min(((Size) arrayList.get(i11)).mHeight, ((Size) arrayList.get(i11)).mWidth) >= 320) {
                arrayList2.add((Size) arrayList.get(i11));
            }
        }
        if (!arrayList2.isEmpty() && b()) {
            Collections.sort(arrayList2, new k9.a(23));
            return (Size) arrayList2.get(0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        boolean zEqualsIgnoreCase = Build.MANUFACTURER.equalsIgnoreCase("Xiaomi");
        Size size = this.f29978g0;
        return zEqualsIgnoreCase ? CameraController.chooseOptimalSize(arrayList, 640, 480, size, false) : CameraController.chooseOptimalSize(arrayList, 480, 270, size, false);
    }

    public final void g() {
        float fMin;
        if (this.X0 != null) {
            return;
        }
        if (this.f29981j0) {
            Camera2Session camera2Session = this.f29985n0;
            if (camera2Session == null) {
                return;
            } else {
                fMin = Utilities.clamp(this.E0, camera2Session.getMaxZoom(), this.f29985n0.getMinZoom());
            }
        } else {
            fMin = Math.min(1.0f, Math.max(0.0f, this.E0 - 1.0f));
        }
        if (fMin > 0.0f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMin, 0.0f);
            this.X0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new e6(this, 26));
            this.X0.addListener(new t40(this, 1));
            this.X0.setDuration(350L);
            this.X0.setInterpolator(er.f28122f);
            this.X0.start();
        }
    }

    public View getButtonsLayout() {
        return this.N0;
    }

    public d50 getCameraContainer() {
        return this.f29969b;
    }

    public yj0 getCameraRect() {
        v40 v40Var = this.f29969b;
        int[] iArr = this.O;
        v40Var.getLocationOnScreen(iArr);
        return new yj0(iArr[0], iArr[1], v40Var.getWidth(), v40Var.getHeight());
    }

    public View getMuteImageView() {
        return this.f29996w;
    }

    public Paint getPaint() {
        return this.d;
    }

    public TextureView getTextureView() {
        return this.f29979h0;
    }

    public final void h(boolean z10) {
        ViewGroup viewGroup;
        if (this.f29981j0) {
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
            CameraSession cameraSession = this.f29982k0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f29982k0, !z10 ? new CountDownLatch(1) : null, null);
            }
        }
        v40 v40Var = this.f29969b;
        v40Var.setTranslationX(0.0f);
        this.f29980i0.setTranslationX(0.0f);
        this.f29988q0 = 0.0f;
        s();
        MediaController.getInstance().resumeByRewind();
        TextureView textureView = this.f29979h0;
        if (textureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(this.f29979h0);
        }
        this.f29979h0 = null;
        v40Var.setImageReceiver(null);
    }

    public final boolean i() {
        int i10;
        int i11;
        if (this.f29981j0) {
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
                this.f30000y = cameraInfo2;
                break;
            }
            i12++;
            cameraInfo = cameraInfo2;
        }
        if (this.f30000y == null) {
            this.f30000y = cameraInfo;
        }
        CameraInfo cameraInfo3 = this.f30000y;
        if (cameraInfo3 == null) {
            return false;
        }
        ArrayList<Size> previewSizes = cameraInfo3.getPreviewSizes();
        ArrayList<Size> pictureSizes = this.f30000y.getPictureSizes();
        Size sizeF = f(previewSizes);
        Size[] sizeArr = this.f29975e0;
        sizeArr[0] = sizeF;
        Size sizeF2 = f(pictureSizes);
        this.f29977f0 = sizeF2;
        if (sizeArr[0].mWidth != sizeF2.mWidth) {
            boolean z10 = false;
            for (int size = previewSizes.size() - 1; size >= 0; size--) {
                Size size2 = previewSizes.get(size);
                for (int size3 = pictureSizes.size() - 1; size3 >= 0; size3--) {
                    Size size4 = pictureSizes.get(size3);
                    int i13 = size2.mWidth;
                    Size size5 = this.f29977f0;
                    if (i13 >= size5.mWidth && (i11 = size2.mHeight) >= size5.mHeight && i13 == size4.mWidth && i11 == size4.mHeight) {
                        sizeArr[0] = size2;
                        this.f29977f0 = size4;
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
            if (!z10) {
                for (int size6 = previewSizes.size() - 1; size6 >= 0; size6--) {
                    Size size7 = previewSizes.get(size6);
                    for (int size8 = pictureSizes.size() - 1; size8 >= 0; size8--) {
                        Size size9 = pictureSizes.get(size8);
                        int i14 = size7.mWidth;
                        if (i14 >= 360 && (i10 = size7.mHeight) >= 360 && i14 == size9.mWidth && i10 == size9.mHeight) {
                            sizeArr[0] = size7;
                            this.f29977f0 = size9;
                            z10 = true;
                            break;
                        }
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
            i0.a.v(sizeArr[0].mHeight, sb2);
        }
        return true;
    }

    public final void j() {
        Bitmap bitmap = this.f29979h0.getBitmap();
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(this.f29979h0.getBitmap(), 50, 50, true);
        this.L = bitmapCreateScaledBitmap;
        if (bitmapCreateScaledBitmap != null) {
            Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg"));
                this.L.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void k(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        char c10;
        int i13;
        long j12;
        if (this.f29979h0 == null) {
            return;
        }
        o();
        m61 m61Var = this.K;
        if (m61Var != null) {
            m61Var.I();
            this.K = null;
        }
        int i14 = 4;
        int i15 = this.f29967a;
        if (i10 != 4) {
            this.f29972c0 = this.f29970b0 < 800;
            this.f29968a0 = false;
            this.Q0 = false;
            r();
            if (!this.f29972c0) {
                i14 = i10 == 3 ? 2 : 5;
            }
            b50 b50Var = this.f29973d0;
            int i16 = this.M;
            if (b50Var != null) {
                c10 = 1;
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(i16), Integer.valueOf(i14));
                if (this.f29972c0) {
                    i13 = 0;
                } else {
                    i13 = i10 == 3 ? 2 : 1;
                }
                j();
                this.f29973d0.b(j10, i13, z10, i11, i12);
                this.f29973d0 = null;
            } else {
                c10 = 1;
            }
            if (this.f29972c0) {
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i15);
                int i17 = NotificationCenter.audioRecordTooShort;
                Integer numValueOf = Integer.valueOf(i16);
                Integer numValueOf2 = Integer.valueOf((int) this.f29970b0);
                Object[] objArr = new Object[3];
                objArr[0] = numValueOf;
                objArr[c10] = Boolean.TRUE;
                objArr[2] = numValueOf2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i17, objArr);
                m(false, false);
                MediaController.getInstance().requestRecordAudioFocus(false);
                return;
            }
            return;
        }
        j50 j50Var = this.U0;
        if (j50Var != null && this.f29970b0 > 800) {
            j50Var.i(1, new e50(j10, i11, i12, z10, j11));
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
            FileLoader.getInstance(i15).cancelFileUpload(this.T.getAbsolutePath(), false);
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
        this.f29971c.s(photoEntry, this.J, z10, i11, 0, false, j11);
        if (i11 != 0) {
            m(false, false);
        }
        MediaController.getInstance().requestRecordAudioFocus(false);
    }

    public final void l(boolean z10) {
        if (this.f29979h0 != null) {
            return;
        }
        if (this.v == null) {
            int i10 = R.raw.roundcamera_flip;
            int i11 = this.O0;
            oi0 oi0Var = new oi0(i10, i11, "roundcamera_flip", i11);
            this.v = oi0Var;
            oi0Var.K(0);
            this.v.setCallback(this.f29976f);
        }
        this.f29976f.setImageDrawable(this.v);
        this.f29980i0.setAlpha(1.0f);
        this.f29980i0.invalidate();
        if (this.L == null) {
            try {
                this.L = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
            } catch (Throwable unused) {
            }
        }
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            this.f29980i0.setImageBitmap(bitmap);
        } else {
            this.f29980i0.setImageResource(R.drawable.icplaceholder);
        }
        this.B = false;
        this.f30000y = null;
        if (!z10) {
            if (!this.f29981j0) {
                this.A = true;
            }
            r();
            this.f29970b0 = 0L;
            this.f29998x = 0.0f;
        }
        this.f29972c0 = false;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.f29986o0 = true;
        if (i()) {
            if (MediaController.getInstance().getPlayingMessageObject() != null) {
                if (MediaController.getInstance().getPlayingMessageObject().isVideo() || MediaController.getInstance().getPlayingMessageObject().isRoundVideo()) {
                    MediaController.getInstance().cleanupPlayer(true, true);
                } else if (SharedConfig.pauseMusicOnRecord) {
                    MediaController.getInstance().pauseByRewind();
                }
            }
            if (!z10) {
                this.T = new x40(FileLoader.getDirectory(3), System.currentTimeMillis() + "_" + SharedConfig.getLastLocalId() + ".mp4");
            }
            SharedConfig.saveConfig();
            AutoDeleteMediaTask.lockFile(this.T);
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("InstantCamera show round camera " + this.T.getAbsolutePath());
            }
            if (this.f29981j0) {
                Context context = getContext();
                boolean z11 = MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent"));
                this.f29983l0 = z11;
                if (z11) {
                    int i12 = 0;
                    while (i12 < 2) {
                        Camera2Session[] camera2SessionArr = this.m0;
                        if (camera2SessionArr[i12] == null) {
                            camera2SessionArr[i12] = Camera2Session.create(i12 == 0, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                            Camera2Session camera2Session = this.m0[i12];
                            if (camera2Session != null) {
                                camera2Session.setRecordingVideo(true);
                                this.f29975e0[i12] = new Size(this.m0[i12].getPreviewWidth(), this.m0[i12].getPreviewHeight());
                            }
                        }
                        i12++;
                    }
                    r();
                    Camera2Session[] camera2SessionArr2 = this.m0;
                    boolean z12 = this.A;
                    Camera2Session camera2Session2 = camera2SessionArr2[!z12 ? 1 : 0];
                    this.f29985n0 = camera2Session2;
                    if (camera2Session2 != null && camera2SessionArr2[z12 ? 1 : 0] == null) {
                        this.f29983l0 = false;
                    }
                    if (camera2Session2 == null) {
                        return;
                    }
                } else {
                    Camera2Session[] camera2SessionArr3 = this.m0;
                    boolean z13 = this.A;
                    int i13 = !z13 ? 1 : 0;
                    Camera2Session camera2SessionCreate = Camera2Session.create(z13, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
                    camera2SessionArr3[i13] = camera2SessionCreate;
                    this.f29985n0 = camera2SessionCreate;
                    if (camera2SessionCreate == null) {
                        return;
                    }
                    camera2SessionCreate.setRecordingVideo(true);
                    this.f29975e0[0] = new Size(this.f29985n0.getPreviewWidth(), this.f29985n0.getPreviewHeight());
                }
            }
            TextureView textureView = new TextureView(getContext());
            this.f29979h0 = textureView;
            textureView.setSurfaceTextureListener(new eh.h(this, 1));
            this.f29969b.addView(this.f29979h0, h7.z5.c(-1.0f, -1));
            this.K0 = true;
            this.S0 = z10;
            setVisibility(0);
            m(true, z10);
            MediaController.getInstance().requestRecordAudioFocus(true);
        }
    }

    public void m(boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.S;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.S.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.B;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        org.telegram.ui.cl clVar = this.f29980i0;
        v40 v40Var = this.f29969b;
        if (z10 && !this.C0) {
            v40Var.setTranslationX(0.0f);
            clVar.setTranslationX(0.0f);
            this.f29988q0 = z11 ? 0.0f : getMeasuredHeight() / 2.0f;
            s();
        }
        this.C0 = z10;
        View view = this.B0;
        if (view != null) {
            view.invalidate();
        }
        this.S = new AnimatorSet();
        float fDp = (z10 || this.f29970b0 <= 300) ? 0.0f : AndroidUtilities.dp(24.0f) - (getMeasuredWidth() / 2.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ig.y(7, this, z11));
        AnimatorSet animatorSet2 = this.S;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.N0;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f29996w, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.d, m6.f30579b, z10 ? 255 : 0);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(v40Var, (Property<v40, Float>) property, z10 ? 1.0f : 0.0f);
        float f10 = z10 ? 1.0f : 0.1f;
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(v40Var, (Property<v40, Float>) property2, f10);
        float f11 = z10 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(v40Var, (Property<v40, Float>) property3, f11);
        Property property4 = View.TRANSLATION_X;
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfInt, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, ObjectAnimator.ofFloat(v40Var, (Property<v40, Float>) property4, fDp), ObjectAnimator.ofFloat(clVar, (Property<org.telegram.ui.cl, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(clVar, (Property<org.telegram.ui.cl, Float>) property2, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(clVar, (Property<org.telegram.ui.cl, Float>) property3, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(clVar, (Property<org.telegram.ui.cl, Float>) property4, fDp), valueAnimatorOfFloat);
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.S.addListener(new t40(this, 2));
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
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        Timer timer2 = new Timer();
        this.T0 = timer2;
        timer2.schedule(new lh.h2(this, 2), 0L, 17L);
    }

    public final void o() {
        Timer timer = this.T0;
        if (timer != null) {
            try {
                timer.cancel();
                this.T0 = null;
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f29967a).addObserver(this, NotificationCenter.fileUploaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f29967a).removeObserver(this, NotificationCenter.fileUploaded);
        lh.r2 r2Var = this.f29984n;
        if (r2Var != null) {
            r2Var.d();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        v40 v40Var = this.f29969b;
        float x8 = v40Var.getX();
        float y10 = v40Var.getY();
        float fDp = x8 - AndroidUtilities.dp(8.0f);
        float fDp2 = y10 - AndroidUtilities.dp(8.0f);
        float measuredWidth = x8 + v40Var.getMeasuredWidth() + AndroidUtilities.dp(8.0f);
        float measuredHeight = y10 + v40Var.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
        RectF rectF = this.f29974e;
        rectF.set(fDp, fDp2, measuredWidth, measuredHeight);
        if (this.f29968a0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - this.V) + this.W;
            this.f29970b0 = jCurrentTimeMillis;
            this.f29998x = Math.min(1.0f, jCurrentTimeMillis / 60000.0f);
            invalidate();
        }
        if (this.f29998x != 0.0f) {
            canvas.save();
            if (!this.A0) {
                canvas.scale(v40Var.getScaleX(), v40Var.getScaleY(), rectF.centerX(), rectF.centerY());
            }
            canvas.drawArc(rectF, -90.0f, this.f29998x * 360.0f, false, this.d);
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
        if (this.K0) {
            int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? AndroidUtilities.roundPlayingMessageSize : AndroidUtilities.roundMessageSize;
            if (i12 != this.J0) {
                this.J0 = i12;
                org.telegram.ui.cl clVar = this.f29980i0;
                ViewGroup.LayoutParams layoutParams = clVar.getLayoutParams();
                ViewGroup.LayoutParams layoutParams2 = clVar.getLayoutParams();
                int i13 = this.J0;
                layoutParams2.height = i13;
                layoutParams.width = i13;
                v40 v40Var = this.f29969b;
                ViewGroup.LayoutParams layoutParams3 = v40Var.getLayoutParams();
                ViewGroup.LayoutParams layoutParams4 = v40Var.getLayoutParams();
                int i14 = this.J0;
                layoutParams4.height = i14;
                layoutParams3.width = i14;
                ((FrameLayout.LayoutParams) this.f29996w.getLayoutParams()).topMargin = (this.J0 / 2) - AndroidUtilities.dp(24.0f);
                clVar.setRoundRadius(this.J0 / 2);
                v40Var.invalidateOutline();
            }
            this.K0 = false;
        }
        super.onMeasure(i10, i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        lh.r2 r2Var = this.f29984n;
        r2Var.f16627b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        r2Var.f16628c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (getVisibility() != 0) {
            this.f29988q0 = getMeasuredHeight() / 2.0f;
            s();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m61 m61Var;
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - getPaddingBottom()) {
            return false;
        }
        if (motionEvent.getAction() == 0 && this.f29971c != null && (m61Var = this.K) != null) {
            boolean zY = m61Var.y();
            this.K.P(!zY);
            AnimatorSet animatorSet = this.C;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.C = animatorSet2;
            float[] fArr = {!zY ? 1.0f : 0.0f};
            ImageView imageView = this.f29996w;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, fArr), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, !zY ? 1.0f : 0.5f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, zY ? 0.5f : 1.0f));
            this.C.addListener(new t40(this, 0));
            this.C.setDuration(180L);
            this.C.setInterpolator(new DecelerateInterpolator());
            this.C.start();
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.G0 && !this.F0 && motionEvent.getPointerCount() == 2 && this.X0 == null && this.f29968a0) {
                this.D0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.E0 = 1.0f;
                this.H0 = motionEvent.getPointerId(0);
                this.I0 = motionEvent.getPointerId(1);
                this.F0 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                v40 v40Var = this.f29969b;
                rectF.set(v40Var.getX(), v40Var.getY(), v40Var.getX() + v40Var.getMeasuredWidth(), v40Var.getY() + v40Var.getMeasuredHeight());
                this.G0 = rectF.contains(motionEvent.getX(), motionEvent.getY());
            }
        } else if (motionEvent.getActionMasked() == 2 && this.F0) {
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
            if (i10 == -1 || i11 == -1) {
                this.F0 = false;
                g();
                return false;
            }
            float fHypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.D0;
            this.E0 = fHypot;
            if (!this.f29981j0) {
                this.f29982k0.setZoom(Math.min(1.0f, Math.max(0.0f, fHypot - 1.0f)));
                return true;
            }
            Camera2Session camera2Session = this.f29985n0;
            if (camera2Session != null) {
                this.f29985n0.setZoom(Utilities.clamp(fHypot, camera2Session.getMaxZoom(), this.f29985n0.getMinZoom()));
                return true;
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.H0 == motionEvent.getPointerId(0) && this.I0 == motionEvent.getPointerId(1)) || (this.H0 == motionEvent.getPointerId(1) && this.I0 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.F0) {
            this.F0 = false;
            g();
            return true;
        }
        return true;
    }

    public final void p() {
        if (!this.f29981j0 || !this.f29983l0) {
            j();
            Bitmap bitmap = this.L;
            if (bitmap != null) {
                this.f29986o0 = false;
                this.f29980i0.setImageBitmap(bitmap);
                this.f29980i0.setAlpha(1.0f);
            }
        }
        this.A = !this.A;
        r();
        if (!this.f29981j0) {
            CameraSession cameraSession = this.f29982k0;
            if (cameraSession != null) {
                cameraSession.destroy();
                CameraController.getInstance().close(this.f29982k0, null, null);
                this.f29982k0 = null;
            }
        } else {
            if (this.f29983l0) {
                this.f29985n0 = this.m0[!this.A ? 1 : 0];
                b50 b50Var = this.f29973d0;
                Handler handler = b50Var.getHandler();
                if (handler != null) {
                    b50Var.sendMessage(handler.obtainMessage(4), 0);
                    b50Var.requestRender(true, true);
                    return;
                }
                return;
            }
            Camera2Session camera2Session = this.f29985n0;
            if (camera2Session != null) {
                camera2Session.destroy(false);
                this.f29985n0 = null;
                this.m0[this.A ? 1 : 0] = null;
            }
            Camera2Session[] camera2SessionArr = this.m0;
            boolean z10 = this.A;
            int i10 = !z10 ? 1 : 0;
            Camera2Session camera2SessionCreate = Camera2Session.create(z10, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize, MessagesController.getInstance(UserConfig.selectedAccount).roundVideoSize);
            camera2SessionArr[i10] = camera2SessionCreate;
            this.f29985n0 = camera2SessionCreate;
            if (camera2SessionCreate == null) {
                return;
            }
            camera2SessionCreate.setRecordingVideo(true);
            this.f29975e0[0] = new Size(this.f29985n0.getPreviewWidth(), this.f29985n0.getPreviewHeight());
            b50 b50Var2 = this.f29973d0;
            Camera2Session camera2Session2 = this.f29985n0;
            Handler handler2 = b50Var2.getHandler();
            if (handler2 != null) {
                b50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
            }
        }
        i();
        this.B = false;
        b50 b50Var3 = this.f29973d0;
        Handler handler3 = b50Var3.getHandler();
        if (handler3 != null) {
            b50Var3.sendMessage(handler3.obtainMessage(2), 0);
        }
    }

    public final void q() {
        if (!this.f29968a0) {
            j50 j50Var = this.U0;
            if (j50Var != null) {
                j50Var.P.sendMessage(j50Var.P.obtainMessage(5));
                h(false);
                m61 m61Var = this.K;
                if (m61Var != null) {
                    m61Var.I();
                    this.K = null;
                }
                l(true);
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AndroidUtilities.lockOrientation(this.f29971c.getParentActivity());
                invalidate();
                NotificationCenter.getInstance(this.f29967a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
                return;
            }
            return;
        }
        this.f29972c0 = this.f29970b0 < 800;
        this.f29968a0 = false;
        r();
        if (this.f29973d0 != null) {
            NotificationCenter.getInstance(this.f29967a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.M), Integer.valueOf(this.f29972c0 ? 4 : 2));
            j();
            b50 b50Var = this.f29973d0;
            boolean z10 = this.f29972c0;
            b50Var.b(0L, z10 ? 0 : 2, true, 0, z10 ? 0 : -2);
            this.f29973d0 = null;
        }
        if (!this.f29972c0) {
            j50 j50Var2 = this.U0;
            j50Var2.P.sendMessage(j50Var2.P.obtainMessage(4));
        } else {
            NotificationCenter.getInstance(this.f29967a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.M), Boolean.TRUE, Integer.valueOf((int) this.f29970b0));
            m(false, false);
            MediaController.getInstance().requestRecordAudioFocus(false);
        }
    }

    public final void r() {
        boolean z10 = this.Q0 && this.f29968a0 && this.A;
        if (this.R0 != z10) {
            this.R0 = z10;
            lh.r2 r2Var = this.f29984n;
            if (z10) {
                r2Var.c(null);
            } else {
                r2Var.d();
            }
        }
        if (this.f29981j0) {
            Camera2Session camera2Session = this.m0[1];
            if (camera2Session != null) {
                camera2Session.setFlash(this.Q0 && !this.A && this.f29968a0);
            }
        } else {
            CameraSession cameraSession = this.f29982k0;
            if (cameraSession != null) {
                cameraSession.setTorchEnabled(this.Q0 && !this.A && this.f29968a0);
            }
        }
        lh.p2 p2Var = this.h;
        if (p2Var != null) {
            Boolean bool = this.P0;
            if (bool == null || bool.booleanValue() != this.Q0) {
                p2Var.setContentDescription(LocaleController.getString(this.Q0 ? R.string.AccDescrCameraFlashOff : R.string.AccDescrCameraFlashOn));
                boolean z11 = this.Q0;
                int i10 = this.O0;
                if (z11) {
                    if (this.f29991s == null) {
                        oi0 oi0Var = new oi0(R.raw.roundcamera_flash_off, i10, "roundcamera_flash_off", i10);
                        this.f29991s = oi0Var;
                        oi0Var.setCallback(p2Var);
                    }
                    p2Var.setImageDrawable(this.f29991s);
                    if (this.P0 == null) {
                        oi0 oi0Var2 = this.f29991s;
                        oi0Var2.K(oi0Var2.f31312e[0] - 1);
                    } else {
                        this.f29991s.K(0);
                        this.f29991s.start();
                    }
                } else {
                    if (this.f29989r == null) {
                        oi0 oi0Var3 = new oi0(R.raw.roundcamera_flash_on, i10, "roundcamera_flash_on", i10);
                        this.f29989r = oi0Var3;
                        oi0Var3.setCallback(p2Var);
                    }
                    p2Var.setImageDrawable(this.f29989r);
                    if (this.P0 == null) {
                        oi0 oi0Var4 = this.f29989r;
                        oi0Var4.K(oi0Var4.f31312e[0] - 1);
                    } else {
                        this.f29989r.K(0);
                        this.f29989r.start();
                    }
                }
                this.P0 = Boolean.valueOf(this.Q0);
            }
        }
    }

    public final void s() {
        this.f29980i0.setTranslationY(this.f29988q0 + this.f29987p0);
        this.f29969b.setTranslationY(this.f29988q0 + this.f29987p0);
    }

    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.N0.setAlpha(0.0f);
        v40 v40Var = this.f29969b;
        v40Var.setAlpha(0.0f);
        org.telegram.ui.cl clVar = this.f29980i0;
        clVar.setAlpha(0.0f);
        ImageView imageView = this.f29996w;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        v40Var.setScaleX(this.S0 ? 1.0f : 0.1f);
        v40Var.setScaleY(this.S0 ? 1.0f : 0.1f);
        clVar.setScaleX(this.S0 ? 1.0f : 0.1f);
        clVar.setScaleY(this.S0 ? 1.0f : 0.1f);
        if (v40Var.getMeasuredWidth() != 0) {
            v40Var.setPivotX(v40Var.getMeasuredWidth() / 2);
            v40Var.setPivotY(v40Var.getMeasuredHeight() / 2);
            clVar.setPivotX(clVar.getMeasuredWidth() / 2);
            clVar.setPivotY(clVar.getMeasuredHeight() / 2);
        }
        try {
            if (i10 == 0) {
                ((Activity) getContext()).getWindow().addFlags(128);
            } else {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void setIsMessageTransition(boolean z10) {
    }
}
