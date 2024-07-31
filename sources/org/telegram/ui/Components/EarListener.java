package org.telegram.ui.Components;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.PhotoViewer;
public class EarListener implements SensorEventListener {
    private Sensor accelerometerSensor;
    private boolean accelerometerVertical;
    private boolean attached;
    private final AudioManager audioManager;
    private int countLess;
    private VideoPlayer currentPlayer;
    private Sensor gravitySensor;
    private long lastAccelerometerDetected;
    private Sensor linearSensor;
    private final PowerManager powerManager;
    private float previousAccValue;
    private boolean proximityHasDifferentValues;
    private Sensor proximitySensor;
    private boolean proximityTouched;
    private PowerManager.WakeLock proximityWakeLock;
    private boolean raised;
    private int raisedToBack;
    private int raisedToTop;
    private int raisedToTopSign;
    private final SensorManager sensorManager;
    private long timeSinceRaise;
    private long lastTimestamp = 0;
    private float lastProximityValue = -100.0f;
    private float[] gravity = new float[3];
    private float[] gravityFast = new float[3];
    private float[] linearAcceleration = new float[3];

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public EarListener(Context context) {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.proximitySensor = sensorManager.getDefaultSensor(8);
        this.linearSensor = sensorManager.getDefaultSensor(10);
        Sensor defaultSensor = sensorManager.getDefaultSensor(9);
        this.gravitySensor = defaultSensor;
        if (this.linearSensor == null || defaultSensor == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.accelerometerSensor = sensorManager.getDefaultSensor(1);
            this.linearSensor = null;
            this.gravitySensor = null;
        }
        PowerManager powerManager = (PowerManager) ApplicationLoader.applicationContext.getSystemService("power");
        this.powerManager = powerManager;
        this.proximityWakeLock = powerManager.newWakeLock(32, "telegram:proximity_lock2");
        this.audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public void attach() {
        if (this.attached) {
            return;
        }
        Sensor sensor = this.gravitySensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, 30000);
        }
        Sensor sensor2 = this.linearSensor;
        if (sensor2 != null) {
            this.sensorManager.registerListener(this, sensor2, 30000);
        }
        Sensor sensor3 = this.accelerometerSensor;
        if (sensor3 != null) {
            this.sensorManager.registerListener(this, sensor3, 30000);
        }
        this.sensorManager.registerListener(this, this.proximitySensor, 3);
        if (this.proximityWakeLock != null && !disableWakeLockWhenNotUsed()) {
            this.proximityWakeLock.acquire();
        }
        this.attached = true;
    }

    public void detach() {
        if (this.attached) {
            Sensor sensor = this.gravitySensor;
            if (sensor != null) {
                this.sensorManager.unregisterListener(this, sensor);
            }
            Sensor sensor2 = this.linearSensor;
            if (sensor2 != null) {
                this.sensorManager.unregisterListener(this, sensor2);
            }
            Sensor sensor3 = this.accelerometerSensor;
            if (sensor3 != null) {
                this.sensorManager.unregisterListener(this, sensor3);
            }
            this.sensorManager.unregisterListener(this, this.proximitySensor);
            PowerManager.WakeLock wakeLock = this.proximityWakeLock;
            if (wakeLock != null && wakeLock.isHeld()) {
                this.proximityWakeLock.release();
            }
            this.attached = false;
        }
    }

    public void attachPlayer(VideoPlayer videoPlayer) {
        this.currentPlayer = videoPlayer;
        updateRaised();
    }

    protected void updateRaised() {
        VideoPlayer videoPlayer = this.currentPlayer;
        if (videoPlayer == null) {
            return;
        }
        videoPlayer.setStreamType(this.raised ? 0 : 3);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        double d;
        boolean z;
        int i;
        if (this.attached && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f = this.lastProximityValue;
                float[] fArr = sensorEvent.values;
                if (f != fArr[0]) {
                    this.proximityHasDifferentValues = true;
                }
                this.lastProximityValue = fArr[0];
                if (this.proximityHasDifferentValues) {
                    this.proximityTouched = isNearToSensor(fArr[0]);
                }
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.accelerometerSensor) {
                    long j = this.lastTimestamp;
                    if (j == 0) {
                        d = 0.9800000190734863d;
                    } else {
                        double d2 = sensorEvent.timestamp - j;
                        Double.isNaN(d2);
                        d = 1.0d / ((d2 / 1.0E9d) + 1.0d);
                    }
                    this.lastTimestamp = sensorEvent.timestamp;
                    float[] fArr2 = this.gravity;
                    double d3 = fArr2[0];
                    Double.isNaN(d3);
                    double d4 = 1.0d - d;
                    float[] fArr3 = sensorEvent.values;
                    double d5 = fArr3[0];
                    Double.isNaN(d5);
                    fArr2[0] = (float) ((d3 * d) + (d5 * d4));
                    double d6 = fArr2[1];
                    Double.isNaN(d6);
                    double d7 = fArr3[1];
                    Double.isNaN(d7);
                    fArr2[1] = (float) ((d6 * d) + (d7 * d4));
                    double d8 = fArr2[2];
                    Double.isNaN(d8);
                    double d9 = d * d8;
                    double d10 = fArr3[2];
                    Double.isNaN(d10);
                    fArr2[2] = (float) (d9 + (d4 * d10));
                    float[] fArr4 = this.gravityFast;
                    fArr4[0] = (fArr2[0] * 0.8f) + (fArr3[0] * 0.19999999f);
                    fArr4[1] = (fArr2[1] * 0.8f) + (fArr3[1] * 0.19999999f);
                    fArr4[2] = (fArr2[2] * 0.8f) + (fArr3[2] * 0.19999999f);
                    float[] fArr5 = this.linearAcceleration;
                    fArr5[0] = fArr3[0] - fArr2[0];
                    fArr5[1] = fArr3[1] - fArr2[1];
                    fArr5[2] = fArr3[2] - fArr2[2];
                } else if (sensor == this.linearSensor) {
                    float[] fArr6 = this.linearAcceleration;
                    float[] fArr7 = sensorEvent.values;
                    fArr6[0] = fArr7[0];
                    fArr6[1] = fArr7[1];
                    fArr6[2] = fArr7[2];
                } else if (sensor == this.gravitySensor) {
                    float[] fArr8 = this.gravityFast;
                    float[] fArr9 = this.gravity;
                    float[] fArr10 = sensorEvent.values;
                    float f2 = fArr10[0];
                    fArr9[0] = f2;
                    fArr8[0] = f2;
                    float f3 = fArr10[1];
                    fArr9[1] = f3;
                    fArr8[1] = f3;
                    float f4 = fArr10[2];
                    fArr9[2] = f4;
                    fArr8[2] = f4;
                }
            }
            Sensor sensor2 = sensorEvent.sensor;
            if (sensor2 == this.linearSensor || sensor2 == this.gravitySensor || sensor2 == this.accelerometerSensor) {
                float[] fArr11 = this.gravity;
                float f5 = fArr11[0];
                float[] fArr12 = this.linearAcceleration;
                float f6 = (f5 * fArr12[0]) + (fArr11[1] * fArr12[1]) + (fArr11[2] * fArr12[2]);
                int i2 = this.raisedToBack;
                if (i2 != 6 && ((f6 > 0.0f && this.previousAccValue > 0.0f) || (f6 < 0.0f && this.previousAccValue < 0.0f))) {
                    if (f6 > 0.0f) {
                        z = f6 > 15.0f;
                        i = 1;
                    } else {
                        z = f6 < -15.0f;
                        i = 2;
                    }
                    int i3 = this.raisedToTopSign;
                    if (i3 != 0 && i3 != i) {
                        int i4 = this.raisedToTop;
                        if (i4 != 6 || !z) {
                            if (!z) {
                                this.countLess++;
                            }
                            if (this.countLess == 10 || i4 != 6 || i2 != 0) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.raisedToBack = 0;
                                this.countLess = 0;
                            }
                        } else if (i2 < 6) {
                            int i5 = i2 + 1;
                            this.raisedToBack = i5;
                            if (i5 == 6) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.countLess = 0;
                                this.timeSinceRaise = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (z && i2 == 0 && (i3 == 0 || i3 == i)) {
                        int i6 = this.raisedToTop;
                        if (i6 < 6 && !this.proximityTouched) {
                            this.raisedToTopSign = i;
                            int i7 = i6 + 1;
                            this.raisedToTop = i7;
                            if (i7 == 6) {
                                this.countLess = 0;
                            }
                        }
                    } else {
                        if (!z) {
                            this.countLess++;
                        }
                        if (i3 != i || this.countLess == 10 || this.raisedToTop != 6 || i2 != 0) {
                            this.raisedToBack = 0;
                            this.raisedToTop = 0;
                            this.raisedToTopSign = 0;
                            this.countLess = 0;
                        }
                    }
                }
                this.previousAccValue = f6;
                float[] fArr13 = this.gravityFast;
                this.accelerometerVertical = fArr13[1] > 2.5f && Math.abs(fArr13[2]) < 4.0f && Math.abs(this.gravityFast[0]) > 1.5f;
            }
            if (this.raisedToBack == 6 || this.accelerometerVertical) {
                this.lastAccelerometerDetected = System.currentTimeMillis();
            }
            boolean z2 = (!(this.raisedToBack == 6 || this.accelerometerVertical || ((System.currentTimeMillis() - this.lastAccelerometerDetected) > 60L ? 1 : ((System.currentTimeMillis() - this.lastAccelerometerDetected) == 60L ? 0 : -1)) < 0) || forbidRaiseToListen() || VoIPService.isAnyKindOfCallActive() || PhotoViewer.getInstance().isVisible()) ? false : true;
            if (this.proximityWakeLock != null && disableWakeLockWhenNotUsed()) {
                boolean isHeld = this.proximityWakeLock.isHeld();
                if (isHeld && !z2) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock releasing");
                    }
                    this.proximityWakeLock.release();
                } else if (!isHeld && z2) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock acquiring");
                    }
                    this.proximityWakeLock.acquire();
                }
            }
            boolean z3 = this.proximityTouched;
            if (z3 && z2) {
                if (!this.raised) {
                    this.raised = true;
                    updateRaised();
                }
                this.raisedToBack = 0;
                this.raisedToTop = 0;
                this.raisedToTopSign = 0;
                this.countLess = 0;
            } else if (z3 && ((this.accelerometerSensor == null || this.linearSensor == null) && this.gravitySensor == null && !VoIPService.isAnyKindOfCallActive())) {
                if (!this.raised) {
                    this.raised = true;
                    updateRaised();
                }
            } else if (!this.proximityTouched && this.raised) {
                this.raised = false;
                updateRaised();
            }
            if (this.timeSinceRaise == 0 || this.raisedToBack != 6 || Math.abs(System.currentTimeMillis() - this.timeSinceRaise) <= 1000) {
                return;
            }
            this.raisedToBack = 0;
            this.raisedToTop = 0;
            this.raisedToTopSign = 0;
            this.countLess = 0;
            this.timeSinceRaise = 0L;
        }
    }

    private boolean isNearToSensor(float f) {
        return f < 5.0f && f != this.proximitySensor.getMaximumRange();
    }

    private boolean disableWakeLockWhenNotUsed() {
        return !Build.MANUFACTURER.equalsIgnoreCase("samsung");
    }

    protected boolean forbidRaiseToListen() {
        AudioDeviceInfo[] devices;
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return this.audioManager.isWiredHeadsetOn() || this.audioManager.isBluetoothA2dpOn() || this.audioManager.isBluetoothScoOn();
            }
            for (AudioDeviceInfo audioDeviceInfo : this.audioManager.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }
}
