package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.common.primitives.Floats;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline1;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;

public abstract class DualCameraView extends CameraView {
    public static final int[] dualWhitelistByDevice = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public boolean allowRotation;
    public float angle;
    public boolean atBottom;
    public boolean atTop;
    public float cx;
    public float cy;
    public boolean down;
    public boolean dualAvailable;
    public boolean enabledSavedDual;
    public final Matrix finalMatrix;
    public boolean firstMeasure;
    public float h;
    public final Matrix invMatrix;
    public DualCameraView$$ExternalSyntheticLambda1 lastFocusToPoint;
    public final PointF lastTouch;
    public float lastTouchDistance;
    public double lastTouchRotation;
    public DualCameraView$$ExternalSyntheticLambda1 longpressRunnable;
    public boolean multitouch;
    public float rotationDiff;
    public boolean snappedRotation;
    public long tapTime;
    public float tapX;
    public float tapY;
    public final Matrix toGL;
    public final Matrix toScreen;
    public final PointF touch;
    public final Matrix touchMatrix;
    public final float[] vertex;
    public final float[] vertices;
    public float[] verticesDst;
    public float[] verticesSrc;
    public float w;

    public DualCameraView(Context context, boolean z) {
        super(context, z, false);
        this.lastTouch = new PointF();
        this.touch = new PointF();
        this.touchMatrix = new Matrix();
        this.finalMatrix = new Matrix();
        this.toScreen = new Matrix();
        this.toGL = new Matrix();
        this.firstMeasure = true;
        this.invMatrix = new Matrix();
        this.vertices = new float[2];
        new Matrix();
        this.vertex = new float[2];
        this.dualAvailable = dualAvailableStatic(context);
    }

    public static boolean dualAvailableDefault(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        boolean z3 = SharedConfig.getDevicePerformanceClass() >= 1 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers();
        if (!z3) {
            return z3;
        }
        boolean z4 = context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        if (z4 || !z) {
            return z4;
        }
        int iHashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        while (true) {
            int[] iArr = dualWhitelistByDevice;
            if (i >= 32) {
                z2 = z4;
                break;
            }
            if (iArr[i] == iHashCode) {
                break;
            }
            i++;
        }
        if (!z2) {
            (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
        }
        return z2;
    }

    public static boolean dualAvailableStatic(Context context) {
        return MessagesController.getGlobalMainSettings().getBoolean("dual_available", dualAvailableDefault(context, true));
    }

    private Matrix getSavedDualMatrix() {
        String string = MessagesController.getGlobalMainSettings().getString("dualmatrix", null);
        if (string == null) {
            return null;
        }
        String[] strArrSplit = string.split(";");
        if (strArrSplit.length != 9) {
            return null;
        }
        float[] fArr = new float[9];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                fArr[i] = Float.parseFloat(strArrSplit[i]);
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public static void log(boolean z) {
        boolean zDualAvailableDefault = dualAvailableDefault(ApplicationLoader.applicationContext, false);
        if (MessagesController.getInstance(UserConfig.selectedAccount).collectDeviceStats) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                tL_inputAppEvent.peer = (z ? 1 : 0) | (zDualAvailableDefault ? 2 : 0);
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda1(21));
            } catch (Exception unused) {
            }
        }
        ApplicationLoader.logDualCamera(z, zDualAvailableDefault);
    }

    @Override
    public final void destroy(boolean z, Runnable runnable) {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            editorEdit.putString("dualmatrix", Floats.join(fArr));
        } else {
            editorEdit.remove("dualmatrix");
        }
        editorEdit.apply();
        super.destroy(z, runnable);
    }

    public final void extractPointsData(Matrix matrix) {
        float[] fArr = this.vertices;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.cx = fArr[0];
        this.cy = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.angle = (float) Math.toDegrees(Math.atan2(fArr[1] - this.cy, fArr[0] - this.cx));
        this.w = MathUtils.distance(this.cx, this.cy, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.h = MathUtils.distance(this.cx, this.cy, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean isAtDual(float f, float f2) {
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.vertex;
        fArr[0] = f;
        fArr[1] = f2;
        this.toGL.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.invMatrix;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        float f3 = (dualShape == 0 || dualShape == 1 || dualShape == 3) ? 0.5625f : 1.0f;
        float f4 = fArr[0];
        if (f4 >= -1.0f && f4 <= 1.0f) {
            float f5 = fArr[1];
            if (f5 >= (-f3) && f5 <= f3) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDualCameraSuccess() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            editorEdit.putString("dualmatrix", Floats.join(fArr));
        } else {
            editorEdit.remove("dualmatrix");
        }
        editorEdit.apply();
        if (this.enabledSavedDual) {
            StoryRecorder.AnonymousClass25 anonymousClass25 = (StoryRecorder.AnonymousClass25) this;
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new VoIPFragment$12$$ExternalSyntheticLambda0(anonymousClass25, 20), 340L);
            }
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.dualButton.setValue(anonymousClass25.isDual());
            storyRecorder.dualButton.setContentDescription(LocaleController.getString(anonymousClass25.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        }
        log(true);
    }

    public abstract void onEntityDraggedBottom(boolean z);

    @Override
    public final void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!dualAvailableDefault(getContext(), false)) {
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                this.dualAvailable = false;
                editorEdit.putBoolean("dual_available", false).apply();
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
                String string = LocaleController.getString(R.string.DualErrorTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.DualErrorMessage);
                ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
            }
            log(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && isAtDual(motionEvent.getX(), motionEvent.getY())) ? touchEvent(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Matrix matrix = this.toScreen;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.toGL);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.firstMeasure) {
            if (dualAvailableStatic(getContext()) && MessagesController.getGlobalMainSettings().getBoolean("dualcam", dualAvailableDefault(ApplicationLoader.applicationContext, false))) {
                this.enabledSavedDual = true;
                setupDualMatrix();
                this.dual = true;
            }
            this.firstMeasure = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || touchEvent(motionEvent);
    }

    public final void setupDualMatrix() {
        Matrix dualPosition = getDualPosition();
        dualPosition.reset();
        Matrix savedDualMatrix = getSavedDualMatrix();
        if (savedDualMatrix != null) {
            dualPosition.set(savedDualMatrix);
        } else {
            dualPosition.postConcat(this.toScreen);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float measuredHeight = getMeasuredHeight() * 0.43f;
            float fMin = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), measuredHeight / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - fMin) - measuredWidth, fMin);
            dualPosition.postConcat(this.toGL);
        }
        updateDualPosition();
    }

    @Override
    public void toggleDual() {
        if (isDual() || this.dualAvailable) {
            if (isDual()) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
            } else {
                setupDualMatrix();
            }
            super.toggleDual();
        }
    }

    public final boolean touchEvent(MotionEvent motionEvent) {
        boolean z;
        Matrix dualPosition;
        boolean z2;
        PointF pointF;
        double dAtan2;
        float fDistance;
        boolean z3;
        PointF pointF2;
        int action;
        Matrix matrix;
        float f;
        double d;
        float f2;
        float f3;
        float width;
        float f4;
        DualCameraView$$ExternalSyntheticLambda1 dualCameraView$$ExternalSyntheticLambda1;
        int dualShape;
        float f5;
        float f6;
        double dSqrt;
        double dSqrt2;
        double dSqrt3;
        double dSqrt4;
        double dSqrt5;
        double dSqrt6;
        double dSqrt7;
        double dSqrt8;
        double d2;
        double d3;
        double d4;
        double d5;
        boolean z4;
        if (motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
            this.tapX = motionEvent.getX();
            this.tapY = motionEvent.getY();
            this.lastFocusToPoint = null;
            DualCameraView$$ExternalSyntheticLambda1 dualCameraView$$ExternalSyntheticLambda2 = this.longpressRunnable;
            if (dualCameraView$$ExternalSyntheticLambda2 != null) {
                AndroidUtilities.cancelRunOnUIThread(dualCameraView$$ExternalSyntheticLambda2);
                this.longpressRunnable = null;
            }
            if (isAtDual(this.tapX, this.tapY)) {
                DualCameraView$$ExternalSyntheticLambda1 dualCameraView$$ExternalSyntheticLambda3 = new DualCameraView$$ExternalSyntheticLambda1(this, 0);
                this.longpressRunnable = dualCameraView$$ExternalSyntheticLambda3;
                AndroidUtilities.runOnUIThread(dualCameraView$$ExternalSyntheticLambda3, ViewConfiguration.getLongPressTimeout());
                z = true;
            }
            if (isDual()) {
                return z;
            }
            dualPosition = getDualPosition();
            if (motionEvent.getPointerCount() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            pointF = this.touch;
            if (z2) {
                pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                fDistance = MathUtils.distance(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                dAtan2 = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF.x = motionEvent.getX(0);
                pointF.y = motionEvent.getY(0);
                dAtan2 = 0.0d;
                fDistance = 0.0f;
            }
            z3 = this.multitouch;
            pointF2 = this.lastTouch;
            if (z3 != z2) {
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.lastTouchDistance = fDistance;
                this.lastTouchRotation = dAtan2;
                this.multitouch = z2;
            }
            float f7 = pointF.x;
            float f8 = pointF.y;
            float f9 = pointF2.x;
            float f10 = pointF2.y;
            action = motionEvent.getAction();
            matrix = this.touchMatrix;
            if (action == 0) {
                matrix.set(dualPosition);
                matrix.postConcat(this.toScreen);
                this.rotationDiff = 0.0f;
                this.snappedRotation = false;
                float f11 = pointF.x;
                f = 0.0f;
                float f12 = pointF.y;
                if (this.verticesSrc == null) {
                    this.verticesSrc = new float[8];
                }
                if (this.verticesDst == null) {
                    this.verticesDst = new float[8];
                }
                dualShape = getDualShape() % 3;
                if (dualShape != 0) {
                    f5 = 1.0f;
                    if (dualShape == 1 && dualShape != 3) {
                        f6 = 1.0f;
                    }
                    float[] fArr = this.verticesSrc;
                    fArr[0] = -1.0f;
                    float f13 = -f6;
                    fArr[1] = f13;
                    fArr[2] = f5;
                    fArr[3] = f13;
                    fArr[4] = f5;
                    fArr[5] = f6;
                    fArr[6] = -1.0f;
                    fArr[7] = f6;
                    matrix.mapPoints(this.verticesDst, fArr);
                    float[] fArr2 = this.verticesDst;
                    float f14 = fArr2[0] - fArr2[2];
                    float f15 = fArr2[1] - fArr2[3];
                    dSqrt = Math.sqrt((f15 * f15) + (f14 * f14));
                    float[] fArr3 = this.verticesDst;
                    float f16 = fArr3[2] - fArr3[4];
                    float f17 = fArr3[3] - fArr3[5];
                    dSqrt2 = Math.sqrt((f17 * f17) + (f16 * f16));
                    float[] fArr4 = this.verticesDst;
                    float f18 = fArr4[4] - fArr4[6];
                    float f19 = fArr4[5] - fArr4[7];
                    dSqrt3 = Math.sqrt((f19 * f19) + (f18 * f18));
                    float[] fArr5 = this.verticesDst;
                    float f20 = fArr5[6] - fArr5[0];
                    float f21 = fArr5[7] - fArr5[1];
                    dSqrt4 = Math.sqrt((f21 * f21) + (f20 * f20));
                    float[] fArr6 = this.verticesDst;
                    float f22 = fArr6[0] - f11;
                    float f23 = fArr6[1] - f12;
                    dSqrt5 = Math.sqrt((f23 * f23) + (f22 * f22));
                    float[] fArr7 = this.verticesDst;
                    float f24 = fArr7[2] - f11;
                    float f25 = fArr7[3] - f12;
                    dSqrt6 = Math.sqrt((f25 * f25) + (f24 * f24));
                    float[] fArr8 = this.verticesDst;
                    float f26 = fArr8[4] - f11;
                    float f27 = fArr8[5] - f12;
                    dSqrt7 = Math.sqrt((f27 * f27) + (f26 * f26));
                    float[] fArr9 = this.verticesDst;
                    float f28 = fArr9[6] - f11;
                    float f29 = fArr9[7] - f12;
                    dSqrt8 = Math.sqrt((f29 * f29) + (f28 * f28));
                    d2 = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
                    d3 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
                    d4 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
                    d5 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
                    if ((Math.sqrt((d5 - dSqrt5) * ((d5 - dSqrt8) * ((d5 - dSqrt4) * d5))) + (Math.sqrt((d4 - dSqrt8) * ((d4 - dSqrt7) * ((d4 - dSqrt3) * d4))) + (Math.sqrt((d3 - dSqrt7) * ((d3 - dSqrt6) * ((d3 - dSqrt2) * d3))) + Math.sqrt((d2 - dSqrt6) * ((d2 - dSqrt5) * ((d2 - dSqrt) * d2)))))) - (dSqrt * dSqrt2) < 1.0d) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.down = z4;
                } else {
                    f5 = 1.0f;
                }
                f6 = 0.5625f;
                float[] fArr10 = this.verticesSrc;
                fArr10[0] = -1.0f;
                float f110 = -f6;
                fArr10[1] = f110;
                fArr10[2] = f5;
                fArr10[3] = f110;
                fArr10[4] = f5;
                fArr10[5] = f6;
                fArr10[6] = -1.0f;
                fArr10[7] = f6;
                matrix.mapPoints(this.verticesDst, fArr10);
                float[] fArr11 = this.verticesDst;
                float f111 = fArr11[0] - fArr11[2];
                float f112 = fArr11[1] - fArr11[3];
                dSqrt = Math.sqrt((f112 * f112) + (f111 * f111));
                float[] fArr12 = this.verticesDst;
                float f113 = fArr12[2] - fArr12[4];
                float f114 = fArr12[3] - fArr12[5];
                dSqrt2 = Math.sqrt((f114 * f114) + (f113 * f113));
                float[] fArr13 = this.verticesDst;
                float f115 = fArr13[4] - fArr13[6];
                float f116 = fArr13[5] - fArr13[7];
                dSqrt3 = Math.sqrt((f116 * f116) + (f115 * f115));
                float[] fArr14 = this.verticesDst;
                float f210 = fArr14[6] - fArr14[0];
                float f211 = fArr14[7] - fArr14[1];
                dSqrt4 = Math.sqrt((f211 * f211) + (f210 * f210));
                float[] fArr15 = this.verticesDst;
                float f212 = fArr15[0] - f11;
                float f213 = fArr15[1] - f12;
                dSqrt5 = Math.sqrt((f213 * f213) + (f212 * f212));
                float[] fArr16 = this.verticesDst;
                float f214 = fArr16[2] - f11;
                float f215 = fArr16[3] - f12;
                dSqrt6 = Math.sqrt((f215 * f215) + (f214 * f214));
                float[] fArr17 = this.verticesDst;
                float f216 = fArr17[4] - f11;
                float f217 = fArr17[5] - f12;
                dSqrt7 = Math.sqrt((f217 * f217) + (f216 * f216));
                float[] fArr18 = this.verticesDst;
                float f218 = fArr18[6] - f11;
                float f219 = fArr18[7] - f12;
                dSqrt8 = Math.sqrt((f219 * f219) + (f218 * f218));
                d2 = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
                d3 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
                d4 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
                d5 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
                if ((Math.sqrt((d5 - dSqrt5) * ((d5 - dSqrt8) * ((d5 - dSqrt4) * d5))) + (Math.sqrt((d4 - dSqrt8) * ((d4 - dSqrt7) * ((d4 - dSqrt3) * d4))) + (Math.sqrt((d3 - dSqrt7) * ((d3 - dSqrt6) * ((d3 - dSqrt2) * d3))) + Math.sqrt((d2 - dSqrt6) * ((d2 - dSqrt5) * ((d2 - dSqrt) * d2)))))) - (dSqrt * dSqrt2) < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.down = z4;
            } else {
                z = z;
                f = 0.0f;
            }
            if (motionEvent.getAction() == 2 || !this.down) {
                d = dAtan2;
            } else {
                if (MathUtils.distance(f7, f8, f9, f10) > AndroidUtilities.dp(2.0f) && (dualCameraView$$ExternalSyntheticLambda1 = this.longpressRunnable) != null) {
                    AndroidUtilities.cancelRunOnUIThread(dualCameraView$$ExternalSyntheticLambda1);
                    this.longpressRunnable = null;
                }
                if (motionEvent.getPointerCount() > 1) {
                    if (this.lastTouchDistance != f) {
                        extractPointsData(matrix);
                        float f30 = fDistance / this.lastTouchDistance;
                        if (this.w * f30 > getWidth() * 0.7f) {
                            width = getWidth() * 0.7f;
                            f4 = this.w;
                        } else {
                            if (this.w * f30 < getWidth() * 0.2f) {
                                width = getWidth() * 0.2f;
                                f4 = this.w;
                            }
                            matrix.postScale(f30, f30, f7, f8);
                        }
                        f30 = width / f4;
                        matrix.postScale(f30, f30, f7, f8);
                    }
                    d = dAtan2;
                    f2 = 90.0f;
                    float degrees = (float) Math.toDegrees(d - this.lastTouchRotation);
                    float f31 = this.rotationDiff + degrees;
                    this.rotationDiff = f31;
                    if (!this.allowRotation) {
                        boolean z5 = Math.abs(f31) > 20.0f;
                        this.allowRotation = z5;
                        if (!z5) {
                            extractPointsData(matrix);
                            this.allowRotation = (((float) Math.round(this.angle / 90.0f)) * 90.0f) - this.angle > 20.0f;
                        }
                        if (!this.snappedRotation) {
                            AndroidUtilities.vibrateCursor(this);
                            this.snappedRotation = true;
                        }
                    }
                    if (this.allowRotation) {
                        matrix.postRotate(degrees, f7, f8);
                    }
                } else {
                    d = dAtan2;
                    f2 = 90.0f;
                }
                matrix.postTranslate(f7 - f9, f8 - f10);
                Matrix matrix2 = this.finalMatrix;
                matrix2.set(matrix);
                extractPointsData(matrix2);
                float fRound = (Math.round(this.angle / f2) * f2) - this.angle;
                if (this.allowRotation) {
                    if (Math.abs(fRound) < 5.0f) {
                        matrix2.postRotate(fRound, this.cx, this.cy);
                        if (!this.snappedRotation) {
                            AndroidUtilities.vibrateCursor(this);
                            this.snappedRotation = true;
                        }
                    } else {
                        this.snappedRotation = false;
                    }
                }
                float f32 = this.cx;
                if (f32 < f) {
                    f3 = 0.0f;
                    matrix2.postTranslate(-f32, 0.0f);
                } else {
                    f3 = 0.0f;
                    if (f32 > getWidth()) {
                        matrix2.postTranslate(getWidth() - this.cx, 0.0f);
                    }
                }
                float f33 = this.cy;
                if (f33 < f3) {
                    matrix2.postTranslate(f3, -f33);
                } else if (f33 > getHeight() - AndroidUtilities.dp(150.0f)) {
                    matrix2.postTranslate(0.0f, (getHeight() - AndroidUtilities.dp(150.0f)) - this.cy);
                }
                matrix2.postConcat(this.toGL);
                dualPosition.set(matrix2);
                updateDualPosition();
                float f34 = this.cy;
                boolean z6 = Math.min(f34, f34 - (this.h / 2.0f)) < ((float) AndroidUtilities.dp(66.0f));
                float f35 = this.cy;
                boolean z7 = Math.max(f35, (this.h / 2.0f) + f35) > ((float) (getHeight() - AndroidUtilities.dp(66.0f)));
                if (this.atTop != z6) {
                    this.atTop = z6;
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.previewHighlight.show(true, z6, storyRecorder.actionBarContainer);
                }
                if (this.atBottom != z7) {
                    this.atBottom = z7;
                    onEntityDraggedBottom(z7);
                }
            }
            if (motionEvent.getAction() == 1) {
                this.allowRotation = false;
                this.rotationDiff = 0.0f;
                this.snappedRotation = false;
                invalidate();
                this.down = false;
                if (this.atTop) {
                    this.atTop = false;
                    StoryRecorder storyRecorder2 = StoryRecorder.this;
                    storyRecorder2.previewHighlight.show(true, false, storyRecorder2.actionBarContainer);
                }
                if (this.atBottom) {
                    this.atBottom = false;
                    onEntityDraggedBottom(false);
                }
            } else if (motionEvent.getAction() == 3) {
                this.down = false;
                if (this.atTop) {
                    this.atTop = false;
                    StoryRecorder storyRecorder3 = StoryRecorder.this;
                    storyRecorder3.previewHighlight.show(true, false, storyRecorder3.actionBarContainer);
                }
                if (this.atBottom) {
                    this.atBottom = false;
                    onEntityDraggedBottom(false);
                }
            }
            pointF2.x = pointF.x;
            pointF2.y = pointF.y;
            this.lastTouchDistance = fDistance;
            this.lastTouchRotation = d;
            return this.down || z;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && MathUtils.distance(this.tapX, this.tapY, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(10.0f)) {
                if (isAtDual(this.tapX, this.tapY)) {
                    switchCamera();
                    this.lastFocusToPoint = null;
                } else {
                    this.lastFocusToPoint = new DualCameraView$$ExternalSyntheticLambda1(this, 1);
                }
            }
            this.tapTime = -1L;
            DualCameraView$$ExternalSyntheticLambda1 dualCameraView$$ExternalSyntheticLambda4 = this.longpressRunnable;
            if (dualCameraView$$ExternalSyntheticLambda4 != null) {
                AndroidUtilities.cancelRunOnUIThread(dualCameraView$$ExternalSyntheticLambda4);
                this.longpressRunnable = null;
            }
        } else if (motionEvent.getAction() == 3) {
            this.tapTime = -1L;
            this.lastFocusToPoint = null;
            DualCameraView$$ExternalSyntheticLambda1 dualCameraView$$ExternalSyntheticLambda5 = this.longpressRunnable;
            if (dualCameraView$$ExternalSyntheticLambda5 != null) {
                AndroidUtilities.cancelRunOnUIThread(dualCameraView$$ExternalSyntheticLambda5);
                this.longpressRunnable = null;
            }
        }
        z = false;
        if (isDual()) {
            return z;
        }
        dualPosition = getDualPosition();
        if (motionEvent.getPointerCount() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        pointF = this.touch;
        if (z2) {
            pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            fDistance = MathUtils.distance(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            dAtan2 = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
        } else {
            pointF.x = motionEvent.getX(0);
            pointF.y = motionEvent.getY(0);
            dAtan2 = 0.0d;
            fDistance = 0.0f;
        }
        z3 = this.multitouch;
        pointF2 = this.lastTouch;
        if (z3 != z2) {
            pointF2.x = pointF.x;
            pointF2.y = pointF.y;
            this.lastTouchDistance = fDistance;
            this.lastTouchRotation = dAtan2;
            this.multitouch = z2;
        }
        float f36 = pointF.x;
        float f37 = pointF.y;
        float f38 = pointF2.x;
        float f117 = pointF2.y;
        action = motionEvent.getAction();
        matrix = this.touchMatrix;
        if (action == 0) {
            matrix.set(dualPosition);
            matrix.postConcat(this.toScreen);
            this.rotationDiff = 0.0f;
            this.snappedRotation = false;
            float f118 = pointF.x;
            f = 0.0f;
            float f119 = pointF.y;
            if (this.verticesSrc == null) {
                this.verticesSrc = new float[8];
            }
            if (this.verticesDst == null) {
                this.verticesDst = new float[8];
            }
            dualShape = getDualShape() % 3;
            if (dualShape != 0) {
                f5 = 1.0f;
                if (dualShape == 1) {
                }
                float[] fArr19 = this.verticesSrc;
                fArr19[0] = -1.0f;
                float f1110 = -f6;
                fArr19[1] = f1110;
                fArr19[2] = f5;
                fArr19[3] = f1110;
                fArr19[4] = f5;
                fArr19[5] = f6;
                fArr19[6] = -1.0f;
                fArr19[7] = f6;
                matrix.mapPoints(this.verticesDst, fArr19);
                float[] fArr110 = this.verticesDst;
                float f1111 = fArr110[0] - fArr110[2];
                float f1112 = fArr110[1] - fArr110[3];
                dSqrt = Math.sqrt((f1112 * f1112) + (f1111 * f1111));
                float[] fArr111 = this.verticesDst;
                float f1113 = fArr111[2] - fArr111[4];
                float f1114 = fArr111[3] - fArr111[5];
                dSqrt2 = Math.sqrt((f1114 * f1114) + (f1113 * f1113));
                float[] fArr112 = this.verticesDst;
                float f1115 = fArr112[4] - fArr112[6];
                float f1116 = fArr112[5] - fArr112[7];
                dSqrt3 = Math.sqrt((f1116 * f1116) + (f1115 * f1115));
                float[] fArr113 = this.verticesDst;
                float f2110 = fArr113[6] - fArr113[0];
                float f2111 = fArr113[7] - fArr113[1];
                dSqrt4 = Math.sqrt((f2111 * f2111) + (f2110 * f2110));
                float[] fArr114 = this.verticesDst;
                float f2112 = fArr114[0] - f118;
                float f2113 = fArr114[1] - f119;
                dSqrt5 = Math.sqrt((f2113 * f2113) + (f2112 * f2112));
                float[] fArr115 = this.verticesDst;
                float f2114 = fArr115[2] - f118;
                float f2115 = fArr115[3] - f119;
                dSqrt6 = Math.sqrt((f2115 * f2115) + (f2114 * f2114));
                float[] fArr116 = this.verticesDst;
                float f2116 = fArr116[4] - f118;
                float f2117 = fArr116[5] - f119;
                dSqrt7 = Math.sqrt((f2117 * f2117) + (f2116 * f2116));
                float[] fArr117 = this.verticesDst;
                float f2118 = fArr117[6] - f118;
                float f2119 = fArr117[7] - f119;
                dSqrt8 = Math.sqrt((f2119 * f2119) + (f2118 * f2118));
                d2 = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
                d3 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
                d4 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
                d5 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
                if ((Math.sqrt((d5 - dSqrt5) * ((d5 - dSqrt8) * ((d5 - dSqrt4) * d5))) + (Math.sqrt((d4 - dSqrt8) * ((d4 - dSqrt7) * ((d4 - dSqrt3) * d4))) + (Math.sqrt((d3 - dSqrt7) * ((d3 - dSqrt6) * ((d3 - dSqrt2) * d3))) + Math.sqrt((d2 - dSqrt6) * ((d2 - dSqrt5) * ((d2 - dSqrt) * d2)))))) - (dSqrt * dSqrt2) < 1.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.down = z4;
            } else {
                f5 = 1.0f;
            }
            f6 = 0.5625f;
            float[] fArr118 = this.verticesSrc;
            fArr118[0] = -1.0f;
            float f1117 = -f6;
            fArr118[1] = f1117;
            fArr118[2] = f5;
            fArr118[3] = f1117;
            fArr118[4] = f5;
            fArr118[5] = f6;
            fArr118[6] = -1.0f;
            fArr118[7] = f6;
            matrix.mapPoints(this.verticesDst, fArr118);
            float[] fArr119 = this.verticesDst;
            float f1118 = fArr119[0] - fArr119[2];
            float f1119 = fArr119[1] - fArr119[3];
            dSqrt = Math.sqrt((f1119 * f1119) + (f1118 * f1118));
            float[] fArr1110 = this.verticesDst;
            float f11110 = fArr1110[2] - fArr1110[4];
            float f11111 = fArr1110[3] - fArr1110[5];
            dSqrt2 = Math.sqrt((f11111 * f11111) + (f11110 * f11110));
            float[] fArr1111 = this.verticesDst;
            float f11112 = fArr1111[4] - fArr1111[6];
            float f11113 = fArr1111[5] - fArr1111[7];
            dSqrt3 = Math.sqrt((f11113 * f11113) + (f11112 * f11112));
            float[] fArr1112 = this.verticesDst;
            float f21110 = fArr1112[6] - fArr1112[0];
            float f21111 = fArr1112[7] - fArr1112[1];
            dSqrt4 = Math.sqrt((f21111 * f21111) + (f21110 * f21110));
            float[] fArr1113 = this.verticesDst;
            float f21112 = fArr1113[0] - f118;
            float f21113 = fArr1113[1] - f119;
            dSqrt5 = Math.sqrt((f21113 * f21113) + (f21112 * f21112));
            float[] fArr1114 = this.verticesDst;
            float f21114 = fArr1114[2] - f118;
            float f21115 = fArr1114[3] - f119;
            dSqrt6 = Math.sqrt((f21115 * f21115) + (f21114 * f21114));
            float[] fArr1115 = this.verticesDst;
            float f21116 = fArr1115[4] - f118;
            float f21117 = fArr1115[5] - f119;
            dSqrt7 = Math.sqrt((f21117 * f21117) + (f21116 * f21116));
            float[] fArr1116 = this.verticesDst;
            float f21118 = fArr1116[6] - f118;
            float f21119 = fArr1116[7] - f119;
            dSqrt8 = Math.sqrt((f21119 * f21119) + (f21118 * f21118));
            d2 = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
            d3 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
            d4 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
            d5 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
            if ((Math.sqrt((d5 - dSqrt5) * ((d5 - dSqrt8) * ((d5 - dSqrt4) * d5))) + (Math.sqrt((d4 - dSqrt8) * ((d4 - dSqrt7) * ((d4 - dSqrt3) * d4))) + (Math.sqrt((d3 - dSqrt7) * ((d3 - dSqrt6) * ((d3 - dSqrt2) * d3))) + Math.sqrt((d2 - dSqrt6) * ((d2 - dSqrt5) * ((d2 - dSqrt) * d2)))))) - (dSqrt * dSqrt2) < 1.0d) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.down = z4;
        } else {
            z = z;
            f = 0.0f;
        }
        if (motionEvent.getAction() == 2) {
            d = dAtan2;
        } else {
            d = dAtan2;
        }
        if (motionEvent.getAction() == 1) {
            this.allowRotation = false;
            this.rotationDiff = 0.0f;
            this.snappedRotation = false;
            invalidate();
            this.down = false;
            if (this.atTop) {
                this.atTop = false;
                StoryRecorder storyRecorder4 = StoryRecorder.this;
                storyRecorder4.previewHighlight.show(true, false, storyRecorder4.actionBarContainer);
            }
            if (this.atBottom) {
                this.atBottom = false;
                onEntityDraggedBottom(false);
            }
        } else if (motionEvent.getAction() == 3) {
            this.down = false;
            if (this.atTop) {
                this.atTop = false;
                StoryRecorder storyRecorder5 = StoryRecorder.this;
                storyRecorder5.previewHighlight.show(true, false, storyRecorder5.actionBarContainer);
            }
            if (this.atBottom) {
                this.atBottom = false;
                onEntityDraggedBottom(false);
            }
        }
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        this.lastTouchDistance = fDistance;
        this.lastTouchRotation = d;
        if (this.down) {
            return true;
        }
    }
}
