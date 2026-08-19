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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public abstract class DualCameraView extends CameraView {
    private static final int[] dualWhitelistByDevice = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    private static final int[] dualWhitelistByModel = new int[0];
    private boolean allowRotation;
    private float angle;
    private boolean atBottom;
    private boolean atTop;
    private float cx;
    private float cy;
    private boolean doNotSpanRotation;
    private boolean down;
    private boolean dualAvailable;
    private boolean enabledSavedDual;
    private final Matrix finalMatrix;
    private boolean firstMeasure;
    private float h;
    private Matrix invMatrix;
    private Runnable lastFocusToPoint;
    private final PointF lastTouch;
    private float lastTouchDistance;
    private double lastTouchRotation;
    private Runnable longpressRunnable;
    private boolean multitouch;
    private float rotationDiff;
    private boolean snappedRotation;
    private long tapTime;
    private float tapX;
    private float tapY;
    private Matrix tempMatrix;
    private float[] tempPoint;
    private final Matrix toGL;
    private final Matrix toScreen;
    private final PointF touch;
    private final Matrix touchMatrix;
    private float[] vertex;
    private final float[] vertices;
    private float[] verticesDst;
    private float[] verticesSrc;
    private float w;

    public static void $r8$lambda$BDUEjGDaDbdUbrccOYYisJzQ2iY(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    protected abstract void onEntityDraggedBottom(boolean z);

    protected abstract void onEntityDraggedTop(boolean z);

    protected abstract void onSavedDualCameraSuccess();

    public DualCameraView(Context context, boolean z, boolean z2) {
        super(context, z, z2);
        this.lastTouch = new PointF();
        this.touch = new PointF();
        this.touchMatrix = new Matrix();
        this.finalMatrix = new Matrix();
        this.tempPoint = new float[4];
        this.toScreen = new Matrix();
        this.toGL = new Matrix();
        this.firstMeasure = true;
        this.invMatrix = new Matrix();
        this.vertices = new float[2];
        this.tempMatrix = new Matrix();
        this.vertex = new float[2];
        this.dualAvailable = dualAvailableStatic(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || touchEvent(motionEvent);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && isAtDual(motionEvent.getX(), motionEvent.getY())) {
            return touchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void destroy(boolean z, Runnable runnable) {
        saveDual();
        super.destroy(z, runnable);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setupToScreenMatrix();
    }

    private void setupToScreenMatrix() {
        this.toScreen.reset();
        this.toScreen.postTranslate(1.0f, -1.0f);
        this.toScreen.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        this.toScreen.invert(this.toGL);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.firstMeasure) {
            if (isSavedDual()) {
                this.enabledSavedDual = true;
                setupDualMatrix();
                this.dual = true;
            }
            this.firstMeasure = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override
    protected void onDualCameraSuccess() {
        saveDual();
        if (this.enabledSavedDual) {
            onSavedDualCameraSuccess();
        }
        log(true);
    }

    private void log(boolean z) {
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
                tL_inputAppEvent.peer = (zDualAvailableDefault ? 2 : 0) | (z ? 1 : 0);
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        DualCameraView.$r8$lambda$BDUEjGDaDbdUbrccOYYisJzQ2iY(tLObject, tL_error);
                    }
                });
            } catch (Exception unused) {
            }
        }
        ApplicationLoader.logDualCamera(z, zDualAvailableDefault);
    }

    public void resetSaved() {
        resetSavedDual();
    }

    @Override
    public void toggleDual() {
        if (isDual() || dualAvailable()) {
            if (!isDual()) {
                setupDualMatrix();
            } else {
                resetSaved();
            }
            super.toggleDual();
        }
    }

    private void setupDualMatrix() {
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

    public boolean isAtDual(float f, float f2) {
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.vertex;
        fArr[0] = f;
        fArr[1] = f2;
        this.toGL.mapPoints(fArr);
        getDualPosition().invert(this.invMatrix);
        this.invMatrix.mapPoints(this.vertex);
        int dualShape = getDualShape() % 3;
        float f3 = (dualShape == 0 || dualShape == 1 || dualShape == 3) ? 0.5625f : 1.0f;
        float[] fArr2 = this.vertex;
        float f4 = fArr2[0];
        if (f4 >= -1.0f && f4 <= 1.0f) {
            float f5 = fArr2[1];
            if (f5 >= (-f3) && f5 <= f3) {
                return true;
            }
        }
        return false;
    }

    private boolean checkTap(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
            this.tapX = motionEvent.getX();
            this.tapY = motionEvent.getY();
            this.lastFocusToPoint = null;
            Runnable runnable = this.longpressRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.longpressRunnable = null;
            }
            if (!isAtDual(this.tapX, this.tapY)) {
                return false;
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    DualCameraView.m4479$r8$lambda$BVKDUQXELF7GxPh8hRHzliyVWc(this.f$0);
                }
            };
            this.longpressRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && MathUtils.distance(this.tapX, this.tapY, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(10.0f)) {
                if (isAtDual(this.tapX, this.tapY)) {
                    switchCamera();
                    this.lastFocusToPoint = null;
                } else {
                    this.lastFocusToPoint = new Runnable() {
                        @Override
                        public final void run() {
                            DualCameraView dualCameraView = this.f$0;
                            dualCameraView.focusToPoint((int) dualCameraView.tapX, (int) dualCameraView.tapY);
                        }
                    };
                }
            }
            this.tapTime = -1L;
            Runnable runnable3 = this.longpressRunnable;
            if (runnable3 == null) {
                return false;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable3);
            this.longpressRunnable = null;
            return false;
        }
        if (motionEvent.getAction() != 3) {
            return false;
        }
        this.tapTime = -1L;
        this.lastFocusToPoint = null;
        Runnable runnable4 = this.longpressRunnable;
        if (runnable4 == null) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable4);
        this.longpressRunnable = null;
        return false;
    }

    public static void m4479$r8$lambda$BVKDUQXELF7GxPh8hRHzliyVWc(DualCameraView dualCameraView) {
        if (dualCameraView.tapTime > 0) {
            dualCameraView.dualToggleShape();
            try {
                dualCameraView.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
        }
    }

    public void allowToTapFocus() {
        Runnable runnable = this.lastFocusToPoint;
        if (runnable != null) {
            runnable.run();
            this.lastFocusToPoint = null;
        }
    }

    public void clearTapFocus() {
        this.lastFocusToPoint = null;
        this.tapTime = -1L;
    }

    private boolean touchEvent(MotionEvent motionEvent) {
        double dAtan2;
        float fDistance;
        float f;
        float f2;
        float f3;
        float f4;
        float width;
        float f5;
        Runnable runnable;
        boolean zCheckTap = checkTap(motionEvent);
        if (!isDual()) {
            return zCheckTap;
        }
        Matrix dualPosition = getDualPosition();
        boolean z = motionEvent.getPointerCount() > 1;
        if (z) {
            this.touch.x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.touch.y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
            fDistance = MathUtils.distance(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            dAtan2 = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
        } else {
            this.touch.x = motionEvent.getX(0);
            this.touch.y = motionEvent.getY(0);
            dAtan2 = 0.0d;
            fDistance = 0.0f;
        }
        if (this.multitouch != z) {
            PointF pointF = this.lastTouch;
            PointF pointF2 = this.touch;
            pointF.x = pointF2.x;
            pointF.y = pointF2.y;
            this.lastTouchDistance = fDistance;
            this.lastTouchRotation = dAtan2;
            this.multitouch = z;
        }
        PointF pointF3 = this.touch;
        float f6 = pointF3.x;
        float f7 = pointF3.y;
        PointF pointF4 = this.lastTouch;
        float f8 = pointF4.x;
        float f9 = pointF4.y;
        if (motionEvent.getAction() == 0) {
            this.touchMatrix.set(dualPosition);
            f = 2.0f;
            this.touchMatrix.postConcat(this.toScreen);
            this.rotationDiff = 0.0f;
            this.snappedRotation = false;
            this.doNotSpanRotation = false;
            Matrix matrix = this.touchMatrix;
            PointF pointF5 = this.touch;
            f2 = 0.0f;
            this.down = isPointInsideDual(matrix, pointF5.x, pointF5.y);
        } else {
            f = 2.0f;
            f2 = 0.0f;
        }
        if (motionEvent.getAction() == 2 && this.down) {
            if (MathUtils.distance(f6, f7, f8, f9) > AndroidUtilities.dp(f) && (runnable = this.longpressRunnable) != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.longpressRunnable = null;
            }
            if (motionEvent.getPointerCount() > 1) {
                if (this.lastTouchDistance != f2) {
                    extractPointsData(this.touchMatrix);
                    float f10 = fDistance / this.lastTouchDistance;
                    f3 = 90.0f;
                    if (this.w * f10 > getWidth() * 0.7f) {
                        width = getWidth() * 0.7f;
                        f5 = this.w;
                    } else {
                        if (this.w * f10 < getWidth() * 0.2f) {
                            width = getWidth() * 0.2f;
                            f5 = this.w;
                        }
                        this.touchMatrix.postScale(f10, f10, f6, f7);
                    }
                    f10 = width / f5;
                    this.touchMatrix.postScale(f10, f10, f6, f7);
                } else {
                    f3 = 90.0f;
                }
                float degrees = (float) Math.toDegrees(dAtan2 - this.lastTouchRotation);
                float f11 = this.rotationDiff + degrees;
                this.rotationDiff = f11;
                if (!this.allowRotation) {
                    boolean z2 = Math.abs(f11) > 20.0f;
                    this.allowRotation = z2;
                    if (!z2) {
                        extractPointsData(this.touchMatrix);
                        this.allowRotation = (((float) Math.round(this.angle / f3)) * f3) - this.angle > 20.0f;
                    }
                    if (!this.snappedRotation) {
                        AndroidUtilities.vibrateCursor(this);
                        this.snappedRotation = true;
                    }
                }
                if (this.allowRotation) {
                    this.touchMatrix.postRotate(degrees, f6, f7);
                }
            } else {
                f3 = 90.0f;
            }
            this.touchMatrix.postTranslate(f6 - f8, f7 - f9);
            this.finalMatrix.set(this.touchMatrix);
            extractPointsData(this.finalMatrix);
            float fRound = (Math.round(this.angle / f3) * f3) - this.angle;
            if (this.allowRotation && !this.doNotSpanRotation) {
                if (Math.abs(fRound) < 5.0f) {
                    this.finalMatrix.postRotate(fRound, this.cx, this.cy);
                    if (!this.snappedRotation) {
                        AndroidUtilities.vibrateCursor(this);
                        this.snappedRotation = true;
                    }
                } else {
                    this.snappedRotation = false;
                }
            }
            float f12 = this.cx;
            if (f12 < f2) {
                f4 = 0.0f;
                this.finalMatrix.postTranslate(-f12, 0.0f);
            } else {
                f4 = 0.0f;
                if (f12 > getWidth()) {
                    this.finalMatrix.postTranslate(getWidth() - this.cx, 0.0f);
                }
            }
            float f13 = this.cy;
            if (f13 < f4) {
                this.finalMatrix.postTranslate(f4, -f13);
            } else if (f13 > getHeight() - AndroidUtilities.dp(150.0f)) {
                this.finalMatrix.postTranslate(0.0f, (getHeight() - AndroidUtilities.dp(150.0f)) - this.cy);
            }
            this.finalMatrix.postConcat(this.toGL);
            dualPosition.set(this.finalMatrix);
            updateDualPosition();
            float f14 = this.cy;
            boolean z3 = Math.min(f14, f14 - (this.h / f)) < ((float) AndroidUtilities.dp(66.0f));
            float f15 = this.cy;
            boolean z4 = Math.max(f15, (this.h / f) + f15) > ((float) (getHeight() - AndroidUtilities.dp(66.0f)));
            if (this.atTop != z3) {
                this.atTop = z3;
                onEntityDraggedTop(z3);
            }
            if (this.atBottom != z4) {
                this.atBottom = z4;
                onEntityDraggedBottom(z4);
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
                onEntityDraggedTop(false);
            }
            if (this.atBottom) {
                this.atBottom = false;
                onEntityDraggedBottom(false);
            }
        } else if (motionEvent.getAction() == 3) {
            this.down = false;
            if (this.atTop) {
                this.atTop = false;
                onEntityDraggedTop(false);
            }
            if (this.atBottom) {
                this.atBottom = false;
                onEntityDraggedBottom(false);
            }
        }
        PointF pointF6 = this.lastTouch;
        PointF pointF7 = this.touch;
        pointF6.x = pointF7.x;
        pointF6.y = pointF7.y;
        this.lastTouchDistance = fDistance;
        this.lastTouchRotation = dAtan2;
        return this.down || zCheckTap;
    }

    public boolean isDualTouch() {
        return this.down;
    }

    private void extractPointsData(Matrix matrix) {
        float[] fArr = this.vertices;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.vertices;
        this.cx = fArr2[0];
        this.cy = fArr2[1];
        fArr2[0] = 1.0f;
        fArr2[1] = 0.0f;
        matrix.mapPoints(fArr2);
        float[] fArr3 = this.vertices;
        this.angle = (float) Math.toDegrees(Math.atan2(fArr3[1] - this.cy, fArr3[0] - this.cx));
        float f = this.cx;
        float f2 = this.cy;
        float[] fArr4 = this.vertices;
        this.w = MathUtils.distance(f, f2, fArr4[0], fArr4[1]) * 2.0f;
        float[] fArr5 = this.vertices;
        fArr5[0] = 0.0f;
        fArr5[1] = 1.0f;
        matrix.mapPoints(fArr5);
        float f3 = this.cx;
        float f4 = this.cy;
        float[] fArr6 = this.vertices;
        this.h = MathUtils.distance(f3, f4, fArr6[0], fArr6[1]) * 2.0f;
    }

    public boolean isPointInsideDual(Matrix matrix, float f, float f2) {
        if (this.verticesSrc == null) {
            this.verticesSrc = new float[8];
        }
        if (this.verticesDst == null) {
            this.verticesDst = new float[8];
        }
        int dualShape = getDualShape() % 3;
        float f3 = (dualShape == 0 || dualShape == 1 || dualShape == 3) ? 0.5625f : 1.0f;
        float[] fArr = this.verticesSrc;
        fArr[0] = -1.0f;
        float f4 = -f3;
        fArr[1] = f4;
        fArr[2] = 1.0f;
        fArr[3] = f4;
        fArr[4] = 1.0f;
        fArr[5] = f3;
        fArr[6] = -1.0f;
        fArr[7] = f3;
        matrix.mapPoints(this.verticesDst, fArr);
        float[] fArr2 = this.verticesDst;
        float f5 = fArr2[0] - fArr2[2];
        float f6 = fArr2[1] - fArr2[3];
        double dSqrt = Math.sqrt((f5 * f5) + (f6 * f6));
        float[] fArr3 = this.verticesDst;
        float f7 = fArr3[2] - fArr3[4];
        float f8 = fArr3[3] - fArr3[5];
        double dSqrt2 = Math.sqrt((f7 * f7) + (f8 * f8));
        float[] fArr4 = this.verticesDst;
        float f9 = fArr4[4] - fArr4[6];
        float f10 = fArr4[5] - fArr4[7];
        double dSqrt3 = Math.sqrt((f9 * f9) + (f10 * f10));
        float[] fArr5 = this.verticesDst;
        float f11 = fArr5[6] - fArr5[0];
        float f12 = fArr5[7] - fArr5[1];
        double dSqrt4 = Math.sqrt((f11 * f11) + (f12 * f12));
        float[] fArr6 = this.verticesDst;
        float f13 = fArr6[0] - f;
        float f14 = fArr6[1] - f2;
        double dSqrt5 = Math.sqrt((f13 * f13) + (f14 * f14));
        float[] fArr7 = this.verticesDst;
        float f15 = fArr7[2] - f;
        float f16 = fArr7[3] - f2;
        double dSqrt6 = Math.sqrt((f15 * f15) + (f16 * f16));
        float[] fArr8 = this.verticesDst;
        float f17 = fArr8[4] - f;
        float f18 = fArr8[5] - f2;
        double dSqrt7 = Math.sqrt((f17 * f17) + (f18 * f18));
        float[] fArr9 = this.verticesDst;
        float f19 = fArr9[6] - f;
        float f20 = fArr9[7] - f2;
        double dSqrt8 = Math.sqrt((f19 * f19) + (f20 * f20));
        double d = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
        double d2 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
        double d3 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
        double d4 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
        return (((Math.sqrt((((d - dSqrt) * d) * (d - dSqrt5)) * (d - dSqrt6)) + Math.sqrt((((d2 - dSqrt2) * d2) * (d2 - dSqrt6)) * (d2 - dSqrt7))) + Math.sqrt((((d3 - dSqrt3) * d3) * (d3 - dSqrt7)) * (d3 - dSqrt8))) + Math.sqrt((((d4 - dSqrt4) * d4) * (d4 - dSqrt8)) * (d4 - dSqrt5))) - (dSqrt * dSqrt2) < 1.0d;
    }

    @Override
    public void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!dualAvailableDefault(getContext(), false)) {
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                this.dualAvailable = false;
                editorEdit.putBoolean("dual_available", false).apply();
                new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.DualErrorTitle)).setMessage(LocaleController.getString(R.string.DualErrorMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
            }
            log(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        onCameraError();
    }

    protected void onCameraError() {
        resetSaved();
    }

    public boolean dualAvailable() {
        return this.dualAvailable;
    }

    public static boolean dualAvailableDefault(Context context, boolean z) {
        int i = 0;
        boolean z2 = SharedConfig.getDevicePerformanceClass() >= 1 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers();
        if (!z2) {
            return z2;
        }
        boolean z3 = context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        if (!z3 && z) {
            int iHashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
            int i2 = 0;
            while (true) {
                int[] iArr = dualWhitelistByDevice;
                if (i2 >= iArr.length) {
                    break;
                }
                if (iArr[i2] == iHashCode) {
                    z3 = true;
                    break;
                }
                i2++;
            }
            if (!z3) {
                int iHashCode2 = (Build.MANUFACTURER + Build.MODEL).toUpperCase().hashCode();
                while (true) {
                    int[] iArr2 = dualWhitelistByModel;
                    if (i >= iArr2.length) {
                        break;
                    }
                    if (iArr2[i] == iHashCode2) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return z3;
    }

    public static boolean dualAvailableStatic(Context context) {
        return MessagesController.getGlobalMainSettings().getBoolean("dual_available", dualAvailableDefault(context, true));
    }

    public static boolean roundDualAvailableStatic(Context context) {
        return MessagesController.getGlobalMainSettings().getBoolean("rounddual_available", roundDualAvailableDefault(context));
    }

    public static boolean roundDualAvailableDefault(Context context) {
        return SharedConfig.getDevicePerformanceClass() >= 2 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers() && context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
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

    public boolean isSavedDual() {
        return dualAvailableStatic(getContext()) && MessagesController.getGlobalMainSettings().getBoolean("dualcam", dualAvailableDefault(ApplicationLoader.applicationContext, false));
    }

    private void resetSavedDual() {
        MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    private void saveDual() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            editorEdit.putString("dualmatrix", Floats.join(";", fArr));
        } else {
            editorEdit.remove("dualmatrix");
        }
        editorEdit.apply();
    }
}
