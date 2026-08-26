package org.telegram.ui.bots;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;
import org.telegram.ui.web.BotWebViewContainer;

public final class BotSensors {
    public long absoluteOrientationDesiredRefreshRate;
    public VoIPFragment$8$$ExternalSyntheticLambda1 absoluteOrientationListenerPostponed;
    public Sensor accelerometer;
    public long accelerometerDesiredRefreshRate;
    public VoIPFragment$8$$ExternalSyntheticLambda1 accelerometerListenerPostponed;
    public Sensor gyroscope;
    public long gyroscopeDesiredRefreshRate;
    public VoIPFragment$8$$ExternalSyntheticLambda1 gyroscopeListenerPostponed;
    public Sensor orientationAccelerometer;
    public Sensor orientationMagnetometer;
    public boolean paused;
    public long relativeOrientationDesiredRefreshRate;
    public VoIPFragment$8$$ExternalSyntheticLambda1 relativeOrientationListenerPostponed;
    public Sensor rotation;
    public final SensorManager sensorManager;
    public BotWebViewContainer.MyWebView webView;
    public final AnonymousClass1 accelerometerListener = new AnonymousClass1(this, 0);
    public final AnonymousClass1 gyroscopeListener = new AnonymousClass1(this, 1);
    public final AnonymousClass3 absoluteOrientationListener = new AnonymousClass3();
    public final AnonymousClass4 relativeOrientationListener = new AnonymousClass4();

    public final class AnonymousClass3 implements SensorEventListener {
        public float[] geomagnetic;
        public float[] gravity;
        public long lastTime;

        public AnonymousClass3() {
        }

        @Override
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override
        public final void onSensorChanged(SensorEvent sensorEvent) {
            BotSensors botSensors = BotSensors.this;
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = botSensors.absoluteOrientationListenerPostponed;
            if (voIPFragment$8$$ExternalSyntheticLambda1 != null) {
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
                botSensors.absoluteOrientationListenerPostponed = null;
            }
            if (botSensors.paused || botSensors.webView == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastTime;
            if (sensorEvent.sensor.getType() == 1) {
                this.gravity = sensorEvent.values;
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.geomagnetic = sensorEvent.values;
            }
            long j = botSensors.absoluteOrientationDesiredRefreshRate;
            if (jCurrentTimeMillis >= j) {
                post();
                return;
            }
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda2 = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 9);
            botSensors.absoluteOrientationListenerPostponed = voIPFragment$8$$ExternalSyntheticLambda2;
            AndroidUtilities.runOnUIThread(voIPFragment$8$$ExternalSyntheticLambda2, j - jCurrentTimeMillis);
        }

        public final void post() {
            if (this.gravity == null || this.geomagnetic == null) {
                return;
            }
            BotSensors botSensors = BotSensors.this;
            if (botSensors.webView == null) {
                return;
            }
            this.lastTime = System.currentTimeMillis();
            float[] fArr = new float[9];
            if (SensorManager.getRotationMatrix(fArr, new float[9], this.gravity, this.geomagnetic)) {
                float[] fArr2 = new float[3];
                SensorManager.getOrientation(fArr, fArr2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("absolute", true);
                    jSONObject.put("alpha", -fArr2[0]);
                    jSONObject.put("beta", -fArr2[1]);
                    jSONObject.put("gamma", fArr2[2]);
                    botSensors.webView.evaluateJS("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
                } catch (Exception unused) {
                }
            }
        }
    }

    public final class AnonymousClass4 implements SensorEventListener {
        public long lastTime;
        public float[] mDeviceRotationMatrix;
        public float[] mTruncatedRotationVector;
        public float[] values;

        public AnonymousClass4() {
        }

        @Override
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override
        public final void onSensorChanged(SensorEvent sensorEvent) {
            BotSensors botSensors = BotSensors.this;
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = botSensors.relativeOrientationListenerPostponed;
            if (voIPFragment$8$$ExternalSyntheticLambda1 != null) {
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
                botSensors.relativeOrientationListenerPostponed = null;
            }
            if (botSensors.paused || botSensors.webView == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastTime;
            long j = botSensors.relativeOrientationDesiredRefreshRate;
            if (jCurrentTimeMillis < j) {
                VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda2 = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 10);
                botSensors.relativeOrientationListenerPostponed = voIPFragment$8$$ExternalSyntheticLambda2;
                AndroidUtilities.runOnUIThread(voIPFragment$8$$ExternalSyntheticLambda2, j - jCurrentTimeMillis);
            } else {
                if (sensorEvent.sensor.getType() == 15) {
                    this.values = sensorEvent.values;
                }
                post();
            }
        }

        public final void post() {
            if (this.values == null) {
                return;
            }
            BotSensors botSensors = BotSensors.this;
            if (botSensors.webView == null) {
                return;
            }
            this.lastTime = System.currentTimeMillis();
            if (this.mDeviceRotationMatrix == null) {
                this.mDeviceRotationMatrix = new float[9];
            }
            if (this.mTruncatedRotationVector == null) {
                this.mTruncatedRotationVector = new float[4];
            }
            float[] fArr = this.values;
            if (fArr.length > 4) {
                System.arraycopy(fArr, 0, this.mTruncatedRotationVector, 0, 4);
                SensorManager.getRotationMatrixFromVector(this.mDeviceRotationMatrix, this.mTruncatedRotationVector);
            } else {
                SensorManager.getRotationMatrixFromVector(this.mDeviceRotationMatrix, fArr);
            }
            float[] fArr2 = new float[3];
            SensorManager.getOrientation(this.mDeviceRotationMatrix, fArr2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("absolute", false);
                jSONObject.put("alpha", -fArr2[0]);
                jSONObject.put("beta", -fArr2[1]);
                jSONObject.put("gamma", fArr2[2]);
                botSensors.webView.evaluateJS("window.Telegram.WebView.receiveEvent('device_orientation_changed', " + jSONObject + ");");
            } catch (Exception unused) {
            }
        }
    }

    public BotSensors(Context context) {
        this.sensorManager = (SensorManager) context.getSystemService("sensor");
    }

    public static int getSensorDelay(long j) {
        if (j >= 160) {
            return 3;
        }
        return j >= 60 ? 2 : 1;
    }

    public final void pause() {
        if (this.paused) {
            return;
        }
        this.paused = true;
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            Sensor sensor = this.accelerometer;
            if (sensor != null) {
                sensorManager.unregisterListener(this.accelerometerListener, sensor);
            }
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = this.accelerometerListenerPostponed;
            if (voIPFragment$8$$ExternalSyntheticLambda1 != null) {
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
                this.accelerometerListenerPostponed = null;
            }
            Sensor sensor2 = this.gyroscope;
            if (sensor2 != null) {
                sensorManager.unregisterListener(this.gyroscopeListener, sensor2);
            }
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda2 = this.gyroscopeListenerPostponed;
            if (voIPFragment$8$$ExternalSyntheticLambda2 != null) {
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda2);
                this.gyroscopeListenerPostponed = null;
            }
            Sensor sensor3 = this.orientationAccelerometer;
            AnonymousClass3 anonymousClass3 = this.absoluteOrientationListener;
            if (sensor3 != null) {
                sensorManager.unregisterListener(anonymousClass3, sensor3);
            }
            Sensor sensor4 = this.orientationMagnetometer;
            if (sensor4 != null) {
                sensorManager.unregisterListener(anonymousClass3, sensor4);
            }
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda3 = this.absoluteOrientationListenerPostponed;
            if (voIPFragment$8$$ExternalSyntheticLambda3 != null) {
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda3);
                this.absoluteOrientationListenerPostponed = null;
            }
            Sensor sensor5 = this.rotation;
            if (sensor5 != null) {
                sensorManager.unregisterListener(this.relativeOrientationListener, sensor5);
            }
            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda4 = this.relativeOrientationListenerPostponed;
            if (voIPFragment$8$$ExternalSyntheticLambda4 != null) {
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda4);
                this.relativeOrientationListenerPostponed = null;
            }
        }
    }

    public final boolean startAccelerometer(long j) {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null) {
            return false;
        }
        if (this.accelerometer == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.accelerometer = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.accelerometerDesiredRefreshRate = j;
            if (!this.paused) {
                sensorManager.registerListener(this.accelerometerListener, defaultSensor, getSensorDelay(j));
            }
        }
        return true;
    }

    public final boolean startGyroscope(long j) {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null) {
            return false;
        }
        if (this.gyroscope == null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            this.gyroscope = defaultSensor;
            if (defaultSensor == null) {
                return false;
            }
            this.gyroscopeDesiredRefreshRate = j;
            if (!this.paused) {
                sensorManager.registerListener(this.gyroscopeListener, defaultSensor, getSensorDelay(j));
            }
        }
        return true;
    }

    public final boolean startOrientation(long j, boolean z) {
        Sensor sensor;
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null) {
            return false;
        }
        AnonymousClass4 anonymousClass4 = this.relativeOrientationListener;
        AnonymousClass3 anonymousClass3 = this.absoluteOrientationListener;
        if (z) {
            if (this.rotation != null) {
                VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = this.relativeOrientationListenerPostponed;
                if (voIPFragment$8$$ExternalSyntheticLambda1 != null) {
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
                    this.relativeOrientationListenerPostponed = null;
                }
                if (!this.paused && (sensor = this.rotation) != null) {
                    sensorManager.unregisterListener(anonymousClass4, sensor);
                }
                this.rotation = null;
            }
            if (this.orientationMagnetometer == null || this.orientationAccelerometer == null) {
                this.orientationAccelerometer = sensorManager.getDefaultSensor(1);
                Sensor defaultSensor = sensorManager.getDefaultSensor(2);
                this.orientationMagnetometer = defaultSensor;
                Sensor sensor2 = this.orientationAccelerometer;
                if (sensor2 == null || defaultSensor == null) {
                    return false;
                }
                this.absoluteOrientationDesiredRefreshRate = j;
                if (!this.paused) {
                    sensorManager.registerListener(anonymousClass3, sensor2, getSensorDelay(j));
                    sensorManager.registerListener(anonymousClass3, this.orientationMagnetometer, getSensorDelay(j));
                    return true;
                }
            }
        } else {
            if (this.orientationMagnetometer != null || this.orientationAccelerometer != null) {
                VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda2 = this.absoluteOrientationListenerPostponed;
                if (voIPFragment$8$$ExternalSyntheticLambda2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda2);
                    this.absoluteOrientationListenerPostponed = null;
                }
                if (!this.paused) {
                    Sensor sensor3 = this.orientationAccelerometer;
                    if (sensor3 != null) {
                        sensorManager.unregisterListener(anonymousClass3, sensor3);
                    }
                    Sensor sensor4 = this.orientationMagnetometer;
                    if (sensor4 != null) {
                        sensorManager.unregisterListener(anonymousClass3, sensor4);
                    }
                }
                this.orientationAccelerometer = null;
                this.orientationMagnetometer = null;
            }
            if (this.rotation == null) {
                Sensor defaultSensor2 = sensorManager.getDefaultSensor(15);
                this.rotation = defaultSensor2;
                if (defaultSensor2 == null) {
                    return false;
                }
                this.relativeOrientationDesiredRefreshRate = j;
                if (!this.paused) {
                    sensorManager.registerListener(anonymousClass4, defaultSensor2, getSensorDelay(j));
                }
            }
        }
        return true;
    }

    public final boolean stopAccelerometer() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.accelerometer;
        if (sensor == null) {
            return true;
        }
        if (!this.paused) {
            sensorManager.unregisterListener(this.accelerometerListener, sensor);
        }
        VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = this.accelerometerListenerPostponed;
        if (voIPFragment$8$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
            this.accelerometerListenerPostponed = null;
        }
        this.accelerometer = null;
        return true;
    }

    public final boolean stopGyroscope() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.gyroscope;
        if (sensor == null) {
            return true;
        }
        if (!this.paused) {
            sensorManager.unregisterListener(this.gyroscopeListener, sensor);
        }
        VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = this.gyroscopeListenerPostponed;
        if (voIPFragment$8$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
            this.gyroscopeListenerPostponed = null;
        }
        this.gyroscope = null;
        return true;
    }

    public final boolean stopOrientation() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null) {
            return false;
        }
        Sensor sensor = this.orientationAccelerometer;
        if (sensor == null && this.orientationMagnetometer == null && this.rotation == null) {
            return true;
        }
        if (!this.paused) {
            AnonymousClass3 anonymousClass3 = this.absoluteOrientationListener;
            if (sensor != null) {
                sensorManager.unregisterListener(anonymousClass3, sensor);
            }
            Sensor sensor2 = this.orientationMagnetometer;
            if (sensor2 != null) {
                sensorManager.unregisterListener(anonymousClass3, sensor2);
            }
            Sensor sensor3 = this.rotation;
            if (sensor3 != null) {
                sensorManager.unregisterListener(this.relativeOrientationListener, sensor3);
            }
        }
        VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = this.absoluteOrientationListenerPostponed;
        if (voIPFragment$8$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
            this.absoluteOrientationListenerPostponed = null;
        }
        VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda2 = this.relativeOrientationListenerPostponed;
        if (voIPFragment$8$$ExternalSyntheticLambda2 != null) {
            AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda2);
            this.relativeOrientationListenerPostponed = null;
        }
        this.orientationAccelerometer = null;
        this.orientationMagnetometer = null;
        this.rotation = null;
        return true;
    }

    public final class AnonymousClass1 implements SensorEventListener {
        public final int $r8$classId;
        public long lastTime;
        public final BotSensors this$0;
        public float[] xyz;

        public AnonymousClass1(BotSensors botSensors, int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.this$0 = botSensors;
                    this.xyz = new float[3];
                    break;
                default:
                    this.this$0 = botSensors;
                    break;
            }
        }

        @Override
        public final void onAccuracyChanged(Sensor sensor, int i) {
            int i2 = this.$r8$classId;
        }

        @Override
        public final void onSensorChanged(SensorEvent sensorEvent) {
            switch (this.$r8$classId) {
                case 0:
                    BotSensors botSensors = this.this$0;
                    VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda1 = botSensors.accelerometerListenerPostponed;
                    if (voIPFragment$8$$ExternalSyntheticLambda1 != null) {
                        AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda1);
                        botSensors.accelerometerListenerPostponed = null;
                    }
                    if (!botSensors.paused && botSensors.webView != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.lastTime;
                        this.xyz = sensorEvent.values;
                        long j = botSensors.accelerometerDesiredRefreshRate;
                        if (jCurrentTimeMillis >= j) {
                            post();
                        } else {
                            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda2 = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 7);
                            botSensors.accelerometerListenerPostponed = voIPFragment$8$$ExternalSyntheticLambda2;
                            AndroidUtilities.runOnUIThread(voIPFragment$8$$ExternalSyntheticLambda2, j - jCurrentTimeMillis);
                        }
                        break;
                    }
                    break;
                default:
                    BotSensors botSensors2 = this.this$0;
                    VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda3 = botSensors2.gyroscopeListenerPostponed;
                    if (voIPFragment$8$$ExternalSyntheticLambda3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(voIPFragment$8$$ExternalSyntheticLambda3);
                        botSensors2.gyroscopeListenerPostponed = null;
                    }
                    if (!botSensors2.paused && botSensors2.webView != null) {
                        float[] fArr = this.xyz;
                        float f = fArr[0];
                        float[] fArr2 = sensorEvent.values;
                        fArr[0] = f + fArr2[0];
                        fArr[1] = fArr[1] + fArr2[1];
                        fArr[2] = fArr[2] + fArr2[2];
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.lastTime;
                        long j2 = botSensors2.gyroscopeDesiredRefreshRate;
                        if (jCurrentTimeMillis2 >= j2) {
                            post();
                        } else {
                            VoIPFragment$8$$ExternalSyntheticLambda1 voIPFragment$8$$ExternalSyntheticLambda4 = new VoIPFragment$8$$ExternalSyntheticLambda1(this, 8);
                            botSensors2.gyroscopeListenerPostponed = voIPFragment$8$$ExternalSyntheticLambda4;
                            AndroidUtilities.runOnUIThread(voIPFragment$8$$ExternalSyntheticLambda4, j2 - jCurrentTimeMillis2);
                        }
                        break;
                    }
                    break;
            }
        }

        public final void post() {
            switch (this.$r8$classId) {
                case 0:
                    BotSensors botSensors = this.this$0;
                    if (botSensors.webView != null && this.xyz != null) {
                        this.lastTime = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("x", -this.xyz[0]);
                            jSONObject.put("y", -this.xyz[1]);
                            jSONObject.put("z", -this.xyz[2]);
                            botSensors.webView.evaluateJS("window.Telegram.WebView.receiveEvent('accelerometer_changed', " + jSONObject + ");");
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    break;
                default:
                    float[] fArr = this.xyz;
                    BotSensors botSensors2 = this.this$0;
                    if (botSensors2.webView != null) {
                        this.lastTime = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("x", fArr[0]);
                            jSONObject2.put("y", fArr[1]);
                            jSONObject2.put("z", fArr[2]);
                            botSensors2.webView.evaluateJS("window.Telegram.WebView.receiveEvent('gyroscope_changed', " + jSONObject2 + ");");
                            break;
                        } catch (Exception unused2) {
                        }
                        fArr[0] = 0.0f;
                        fArr[1] = 0.0f;
                        fArr[2] = 0.0f;
                        break;
                    }
                    break;
            }
        }

        private final void onAccuracyChanged$org$telegram$ui$bots$BotSensors$1(Sensor sensor, int i) {
        }

        private final void onAccuracyChanged$org$telegram$ui$bots$BotSensors$2(Sensor sensor, int i) {
        }
    }
}
