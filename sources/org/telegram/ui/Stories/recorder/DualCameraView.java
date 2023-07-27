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
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_saveAppLog;
import org.telegram.tgnet.TLRPC$TL_inputAppEvent;
import org.telegram.tgnet.TLRPC$TL_jsonObject;
import org.telegram.tgnet.TLRPC$TL_jsonObjectValue;
import org.telegram.tgnet.TLRPC$TL_jsonString;
import org.telegram.ui.ActionBar.AlertDialog;
public class DualCameraView extends CameraView implements CameraController.ErrorCallback {
    private static final int[] dualWhitelistByDevice = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -713271737, -2010722764, 1407170066, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2078385967};
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
    private Matrix toGL;
    private Matrix toScreen;
    private final PointF touch;
    private final Matrix touchMatrix;
    private float[] vertex;
    private final float[] vertices;
    private float[] verticesDst;
    private float[] verticesSrc;
    private float w;

    public static void lambda$log$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    protected void onEntityDraggedBottom(boolean z) {
    }

    protected void onEntityDraggedTop(boolean z) {
    }

    protected void onSavedDualCameraSuccess() {
    }

    public DualCameraView(Context context, boolean z, boolean z2) {
        super(context, z, z2);
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
        CameraController.getInstance().addOnErrorListener(this);
        this.dualAvailable = dualAvailableStatic(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || touchEvent(motionEvent);
    }

    @Override
    public void destroy(boolean z, Runnable runnable) {
        saveDual();
        super.destroy(z, runnable);
        CameraController.getInstance().removeOnErrorListener(this);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
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
        boolean dualAvailableDefault = dualAvailableDefault(ApplicationLoader.applicationContext, false);
        if (MessagesController.getInstance(UserConfig.selectedAccount).collectDeviceStats) {
            try {
                TLRPC$TL_help_saveAppLog tLRPC$TL_help_saveAppLog = new TLRPC$TL_help_saveAppLog();
                TLRPC$TL_inputAppEvent tLRPC$TL_inputAppEvent = new TLRPC$TL_inputAppEvent();
                tLRPC$TL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                tLRPC$TL_inputAppEvent.type = "android_dual_camera";
                TLRPC$TL_jsonObject tLRPC$TL_jsonObject = new TLRPC$TL_jsonObject();
                TLRPC$TL_jsonObjectValue tLRPC$TL_jsonObjectValue = new TLRPC$TL_jsonObjectValue();
                tLRPC$TL_jsonObjectValue.key = "device";
                TLRPC$TL_jsonString tLRPC$TL_jsonString = new TLRPC$TL_jsonString();
                tLRPC$TL_jsonString.value = BuildConfig.APP_CENTER_HASH + Build.MANUFACTURER + Build.MODEL;
                tLRPC$TL_jsonObjectValue.value = tLRPC$TL_jsonString;
                tLRPC$TL_jsonObject.value.add(tLRPC$TL_jsonObjectValue);
                tLRPC$TL_inputAppEvent.data = tLRPC$TL_jsonObject;
                tLRPC$TL_inputAppEvent.peer = (dualAvailableDefault ? 2 : 0) | (z ? 1 : 0);
                tLRPC$TL_help_saveAppLog.events.add(tLRPC$TL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_help_saveAppLog, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        DualCameraView.lambda$log$0(tLObject, tLRPC$TL_error);
                    }
                });
            } catch (Exception unused) {
            }
        }
        ApplicationLoader.logDualCamera(z, dualAvailableDefault);
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
        boolean z;
        Matrix dualPosition = getDualPosition();
        dualPosition.reset();
        Matrix savedDualMatrix = getSavedDualMatrix();
        if (savedDualMatrix != null) {
            dualPosition.set(savedDualMatrix);
            z = false;
        } else {
            z = true;
        }
        if (z) {
            dualPosition.postConcat(this.toScreen);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.toGL);
        }
        updateDualPosition();
    }

    public boolean isAtDual(float f, float f2) {
        if (isDual()) {
            float[] fArr = this.vertex;
            fArr[0] = f;
            fArr[1] = f2;
            this.toGL.mapPoints(fArr);
            getDualPosition().invert(this.invMatrix);
            this.invMatrix.mapPoints(this.vertex);
            int dualShape = getDualShape() % 3;
            float f3 = dualShape == 0 || dualShape == 1 || dualShape == 3 ? 0.5625f : 1.0f;
            float[] fArr2 = this.vertex;
            return fArr2[0] >= -1.0f && fArr2[0] <= 1.0f && fArr2[1] >= (-f3) && fArr2[1] <= f3;
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
            if (isAtDual(this.tapX, this.tapY)) {
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        DualCameraView.this.lambda$checkTap$1();
                    }
                };
                this.longpressRunnable = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, ViewConfiguration.getLongPressTimeout());
            }
            return true;
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && MathUtils.distance(this.tapX, this.tapY, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(10.0f)) {
                if (isAtDual(this.tapX, this.tapY)) {
                    switchCamera();
                    this.lastFocusToPoint = null;
                } else {
                    this.lastFocusToPoint = new Runnable() {
                        @Override
                        public final void run() {
                            DualCameraView.this.lambda$checkTap$2();
                        }
                    };
                }
            }
            this.tapTime = -1L;
            Runnable runnable3 = this.longpressRunnable;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                this.longpressRunnable = null;
                return false;
            }
            return false;
        } else if (motionEvent.getAction() == 3) {
            this.tapTime = -1L;
            this.lastFocusToPoint = null;
            Runnable runnable4 = this.longpressRunnable;
            if (runnable4 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable4);
                this.longpressRunnable = null;
                return false;
            }
            return false;
        } else {
            return false;
        }
    }

    public void lambda$checkTap$1() {
        if (this.tapTime > 0) {
            dualToggleShape();
            performHapticFeedback(0, 1);
        }
    }

    public void lambda$checkTap$2() {
        focusToPoint((int) this.tapX, (int) this.tapY);
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
        double d;
        float f;
        boolean z;
        float width;
        float f2;
        Runnable runnable;
        boolean z2 = checkTap(motionEvent);
        if (isDual()) {
            Matrix dualPosition = getDualPosition();
            boolean z3 = motionEvent.getPointerCount() > 1;
            if (z3) {
                this.touch.x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                this.touch.y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                f = MathUtils.distance(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                this.touch.x = motionEvent.getX(0);
                this.touch.y = motionEvent.getY(0);
                d = 0.0d;
                f = 0.0f;
            }
            if (this.multitouch != z3) {
                PointF pointF = this.lastTouch;
                PointF pointF2 = this.touch;
                pointF.x = pointF2.x;
                pointF.y = pointF2.y;
                this.lastTouchDistance = f;
                this.lastTouchRotation = d;
                this.multitouch = z3;
            }
            PointF pointF3 = this.touch;
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            PointF pointF4 = this.lastTouch;
            float f5 = pointF4.x;
            float f6 = pointF4.y;
            if (motionEvent.getAction() == 0) {
                this.touchMatrix.set(dualPosition);
                this.touchMatrix.postConcat(this.toScreen);
                this.rotationDiff = 0.0f;
                this.snappedRotation = false;
                this.doNotSpanRotation = false;
                Matrix matrix = this.touchMatrix;
                PointF pointF5 = this.touch;
                this.down = isPointInsideDual(matrix, pointF5.x, pointF5.y);
            }
            if (motionEvent.getAction() == 2 && this.down) {
                if (MathUtils.distance(f3, f4, f5, f6) > AndroidUtilities.dp(2.0f) && (runnable = this.longpressRunnable) != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.longpressRunnable = null;
                }
                if (motionEvent.getPointerCount() > 1) {
                    if (this.lastTouchDistance != 0.0f) {
                        extractPointsData(this.touchMatrix);
                        float f7 = f / this.lastTouchDistance;
                        if (this.w * f7 > getWidth() * 0.7f) {
                            width = getWidth() * 0.7f;
                            f2 = this.w;
                        } else {
                            if (this.w * f7 < getWidth() * 0.2f) {
                                width = getWidth() * 0.2f;
                                f2 = this.w;
                            }
                            this.touchMatrix.postScale(f7, f7, f3, f4);
                        }
                        f7 = width / f2;
                        this.touchMatrix.postScale(f7, f7, f3, f4);
                    }
                    float degrees = (float) Math.toDegrees(d - this.lastTouchRotation);
                    float f8 = this.rotationDiff + degrees;
                    this.rotationDiff = f8;
                    if (!this.allowRotation) {
                        boolean z4 = Math.abs(f8) > 20.0f;
                        this.allowRotation = z4;
                        if (!z4) {
                            extractPointsData(this.touchMatrix);
                            this.allowRotation = (((float) Math.round(this.angle / 90.0f)) * 90.0f) - this.angle > 20.0f;
                        }
                        if (!this.snappedRotation) {
                            try {
                                performHapticFeedback(9, 1);
                            } catch (Exception unused) {
                            }
                            this.snappedRotation = true;
                        }
                    }
                    if (this.allowRotation) {
                        this.touchMatrix.postRotate(degrees, f3, f4);
                    }
                }
                this.touchMatrix.postTranslate(f3 - f5, f4 - f6);
                this.finalMatrix.set(this.touchMatrix);
                extractPointsData(this.finalMatrix);
                float round = (Math.round(this.angle / 90.0f) * 90.0f) - this.angle;
                if (this.allowRotation && !this.doNotSpanRotation) {
                    if (Math.abs(round) < 5.0f) {
                        this.finalMatrix.postRotate(round, this.cx, this.cy);
                        if (!this.snappedRotation) {
                            try {
                                performHapticFeedback(9, 1);
                            } catch (Exception unused2) {
                            }
                            this.snappedRotation = true;
                        }
                    } else {
                        this.snappedRotation = false;
                    }
                }
                float f9 = this.cx;
                if (f9 < 0.0f) {
                    this.finalMatrix.postTranslate(-f9, 0.0f);
                } else if (f9 > getWidth()) {
                    this.finalMatrix.postTranslate(getWidth() - this.cx, 0.0f);
                }
                float f10 = this.cy;
                if (f10 < 0.0f) {
                    this.finalMatrix.postTranslate(0.0f, -f10);
                } else if (f10 > getHeight() - AndroidUtilities.dp(150.0f)) {
                    this.finalMatrix.postTranslate(0.0f, (getHeight() - AndroidUtilities.dp(150.0f)) - this.cy);
                }
                this.finalMatrix.postConcat(this.toGL);
                dualPosition.set(this.finalMatrix);
                updateDualPosition();
                float f11 = this.cy;
                boolean z5 = Math.min(f11, f11 - (this.h / 2.0f)) < ((float) AndroidUtilities.dp(66.0f));
                float f12 = this.cy;
                boolean z6 = Math.max(f12, (this.h / 2.0f) + f12) > ((float) (getHeight() - AndroidUtilities.dp(66.0f)));
                if (this.atTop != z5) {
                    this.atTop = z5;
                    onEntityDraggedTop(z5);
                }
                if (this.atBottom != z6) {
                    this.atBottom = z6;
                    onEntityDraggedBottom(z6);
                }
            }
            if (motionEvent.getAction() == 1) {
                z = false;
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
            } else {
                z = false;
                if (motionEvent.getAction() == 3) {
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
            }
            PointF pointF6 = this.lastTouch;
            PointF pointF7 = this.touch;
            pointF6.x = pointF7.x;
            pointF6.y = pointF7.y;
            this.lastTouchDistance = f;
            this.lastTouchRotation = d;
            return (this.down || z2) ? true : true;
        }
        return z2;
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
        float f3 = dualShape == 0 || dualShape == 1 || dualShape == 3 ? 0.5625f : 1.0f;
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
        double sqrt = Math.sqrt(((fArr2[0] - fArr2[2]) * (fArr2[0] - fArr2[2])) + ((fArr2[1] - fArr2[3]) * (fArr2[1] - fArr2[3])));
        float[] fArr3 = this.verticesDst;
        double sqrt2 = Math.sqrt(((fArr3[2] - fArr3[4]) * (fArr3[2] - fArr3[4])) + ((fArr3[3] - fArr3[5]) * (fArr3[3] - fArr3[5])));
        float[] fArr4 = this.verticesDst;
        double sqrt3 = Math.sqrt(((fArr4[4] - fArr4[6]) * (fArr4[4] - fArr4[6])) + ((fArr4[5] - fArr4[7]) * (fArr4[5] - fArr4[7])));
        float[] fArr5 = this.verticesDst;
        double sqrt4 = Math.sqrt(((fArr5[6] - fArr5[0]) * (fArr5[6] - fArr5[0])) + ((fArr5[7] - fArr5[1]) * (fArr5[7] - fArr5[1])));
        float[] fArr6 = this.verticesDst;
        double sqrt5 = Math.sqrt(((fArr6[0] - f) * (fArr6[0] - f)) + ((fArr6[1] - f2) * (fArr6[1] - f2)));
        float[] fArr7 = this.verticesDst;
        double sqrt6 = Math.sqrt(((fArr7[2] - f) * (fArr7[2] - f)) + ((fArr7[3] - f2) * (fArr7[3] - f2)));
        float[] fArr8 = this.verticesDst;
        double sqrt7 = Math.sqrt(((fArr8[4] - f) * (fArr8[4] - f)) + ((fArr8[5] - f2) * (fArr8[5] - f2)));
        float[] fArr9 = this.verticesDst;
        double sqrt8 = Math.sqrt(((fArr9[6] - f) * (fArr9[6] - f)) + ((fArr9[7] - f2) * (fArr9[7] - f2)));
        double d = ((sqrt + sqrt5) + sqrt6) / 2.0d;
        double d2 = ((sqrt2 + sqrt6) + sqrt7) / 2.0d;
        double d3 = ((sqrt3 + sqrt7) + sqrt8) / 2.0d;
        double d4 = ((sqrt4 + sqrt8) + sqrt5) / 2.0d;
        return (((Math.sqrt((((d - sqrt) * d) * (d - sqrt5)) * (d - sqrt6)) + Math.sqrt((((d2 - sqrt2) * d2) * (d2 - sqrt6)) * (d2 - sqrt7))) + Math.sqrt((((d3 - sqrt3) * d3) * (d3 - sqrt7)) * (d3 - sqrt8))) + Math.sqrt((((d4 - sqrt4) * d4) * (d4 - sqrt8)) * (d4 - sqrt5))) - (sqrt * sqrt2) < 1.0d;
    }

    @Override
    public void onError(int i, Camera camera, CameraSession cameraSession) {
        if (isDual()) {
            if (!dualAvailableDefault(getContext(), false)) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                this.dualAvailable = false;
                edit.putBoolean("dual_available", false).apply();
                new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.DualErrorTitle)).setMessage(LocaleController.getString(R.string.DualErrorMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
            }
            log(false);
            toggleDual();
        }
        if (getCameraSession(0) == cameraSession) {
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
        if (z2) {
            boolean z3 = context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            if (!z3 && z) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                int i2 = 0;
                while (true) {
                    int[] iArr = dualWhitelistByDevice;
                    if (i2 >= iArr.length) {
                        break;
                    } else if (iArr[i2] == hashCode) {
                        z3 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z3) {
                    int hashCode2 = (Build.MANUFACTURER + Build.MODEL).toUpperCase().hashCode();
                    while (true) {
                        int[] iArr2 = dualWhitelistByModel;
                        if (i >= iArr2.length) {
                            break;
                        } else if (iArr2[i] == hashCode2) {
                            return true;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return z3;
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
        String[] split = string.split(";");
        if (split.length != 9) {
            return null;
        }
        float[] fArr = new float[9];
        for (int i = 0; i < split.length; i++) {
            try {
                fArr[i] = Float.parseFloat(split[i]);
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
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            edit.putString("dualmatrix", Floats.join(";", fArr));
        } else {
            edit.remove("dualmatrix");
        }
        edit.apply();
    }
}
