package org.telegram.ui.Components;

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

public final class EarListener implements SensorEventListener {
    public final Sensor accelerometerSensor;
    public boolean accelerometerVertical;
    public boolean attached;
    public final AudioManager audioManager;
    public int countLess;
    public VideoPlayer currentPlayer;
    public final Sensor gravitySensor;
    public long lastAccelerometerDetected;
    public final Sensor linearSensor;
    public float previousAccValue;
    public boolean proximityHasDifferentValues;
    public final Sensor proximitySensor;
    public boolean proximityTouched;
    public final PowerManager.WakeLock proximityWakeLock;
    public boolean raised;
    public int raisedToBack;
    public int raisedToTop;
    public int raisedToTopSign;
    public final SensorManager sensorManager;
    public long timeSinceRaise;
    public long lastTimestamp = 0;
    public float lastProximityValue = -100.0f;
    public final float[] gravity = new float[3];
    public final float[] gravityFast = new float[3];
    public final float[] linearAcceleration = new float[3];

    public EarListener() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.sensorManager = sensorManager;
        this.proximitySensor = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.linearSensor = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.gravitySensor = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.accelerometerSensor = sensorManager.getDefaultSensor(1);
            this.linearSensor = null;
            this.gravitySensor = null;
        }
        this.proximityWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        char c;
        char c2;
        char c3;
        long j;
        double d;
        boolean z;
        int i;
        boolean z2;
        int i2;
        if (this.attached && VoIPService.getSharedInstance() == null) {
            int type = sensorEvent.sensor.getType();
            float[] fArr2 = this.linearAcceleration;
            float[] fArr3 = this.gravity;
            float[] fArr4 = this.gravityFast;
            Sensor sensor = this.gravitySensor;
            Sensor sensor2 = this.linearSensor;
            Sensor sensor3 = this.accelerometerSensor;
            if (type == 8) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f = this.lastProximityValue;
                float f2 = sensorEvent.values[0];
                if (f != f2) {
                    this.proximityHasDifferentValues = true;
                }
                this.lastProximityValue = f2;
                if (this.proximityHasDifferentValues) {
                    this.proximityTouched = f2 < 5.0f && f2 != this.proximitySensor.getMaximumRange();
                }
                fArr = fArr2;
                c = 1;
                c2 = 2;
                c3 = 0;
                j = 0;
            } else {
                Sensor sensor4 = sensorEvent.sensor;
                if (sensor4 == sensor3) {
                    long j2 = this.lastTimestamp;
                    if (j2 == 0) {
                        d = 0.9800000190734863d;
                        c = 1;
                    } else {
                        c = 1;
                        d = 1.0d / (((sensorEvent.timestamp - j2) / 1.0E9d) + 1.0d);
                    }
                    this.lastTimestamp = sensorEvent.timestamp;
                    double d2 = ((double) fArr3[0]) * d;
                    double d3 = 1.0d - d;
                    float[] fArr5 = sensorEvent.values;
                    c2 = 2;
                    j = 0;
                    c3 = 0;
                    float f3 = (float) ((((double) fArr5[0]) * d3) + d2);
                    fArr3[0] = f3;
                    fArr = fArr2;
                    float f4 = (float) ((((double) fArr5[c]) * d3) + (((double) fArr3[c]) * d));
                    fArr3[c] = f4;
                    float f5 = (float) ((d3 * ((double) fArr5[2])) + (d * ((double) fArr3[2])));
                    fArr3[2] = f5;
                    fArr4[0] = (fArr5[0] * 0.19999999f) + (f3 * 0.8f);
                    fArr4[c] = (fArr5[c] * 0.19999999f) + (f4 * 0.8f);
                    fArr4[2] = (fArr5[2] * 0.19999999f) + (f5 * 0.8f);
                    fArr[0] = fArr5[0] - fArr3[0];
                    fArr[c] = fArr5[c] - fArr3[c];
                    fArr[2] = fArr5[2] - fArr3[2];
                } else {
                    fArr = fArr2;
                    c = 1;
                    c2 = 2;
                    c3 = 0;
                    j = 0;
                    if (sensor4 == sensor2) {
                        float[] fArr6 = sensorEvent.values;
                        fArr[0] = fArr6[0];
                        fArr[1] = fArr6[1];
                        fArr[2] = fArr6[2];
                    } else if (sensor4 == sensor) {
                        float[] fArr7 = sensorEvent.values;
                        float f6 = fArr7[0];
                        fArr3[0] = f6;
                        fArr4[0] = f6;
                        float f7 = fArr7[1];
                        fArr3[1] = f7;
                        fArr4[1] = f7;
                        float f8 = fArr7[2];
                        fArr3[2] = f8;
                        fArr4[2] = f8;
                    }
                }
            }
            Sensor sensor5 = sensorEvent.sensor;
            if (sensor5 == sensor2 || sensor5 == sensor || sensor5 == sensor3) {
                float f9 = (fArr3[c2] * fArr[c2]) + (fArr3[c] * fArr[c]) + (fArr3[c3] * fArr[c3]);
                int i3 = this.raisedToBack;
                if (i3 != 6 && ((f9 > 0.0f && this.previousAccValue > 0.0f) || (f9 < 0.0f && this.previousAccValue < 0.0f))) {
                    if (f9 > 0.0f) {
                        z = f9 > 15.0f;
                        i = 1;
                    } else {
                        z = f9 < -15.0f;
                        i = 2;
                    }
                    int i4 = this.raisedToTopSign;
                    if (i4 != 0 && i4 != i) {
                        int i5 = this.raisedToTop;
                        if (i5 != 6 || !z) {
                            if (!z) {
                                this.countLess++;
                            }
                            if (this.countLess == 10 || i5 != 6 || i3 != 0) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.raisedToBack = 0;
                                this.countLess = 0;
                            }
                        } else if (i3 < 6) {
                            int i6 = i3 + 1;
                            this.raisedToBack = i6;
                            if (i6 == 6) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.countLess = 0;
                                this.timeSinceRaise = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (z && i3 == 0 && (i4 == 0 || i4 == i)) {
                        int i7 = this.raisedToTop;
                        if (i7 < 6 && !this.proximityTouched) {
                            this.raisedToTopSign = i;
                            int i8 = i7 + 1;
                            this.raisedToTop = i8;
                            if (i8 == 6) {
                                this.countLess = 0;
                            }
                        }
                    } else {
                        if (!z) {
                            this.countLess++;
                        }
                        if (i4 != i || this.countLess == 10 || this.raisedToTop != 6 || i3 != 0) {
                            this.raisedToBack = 0;
                            this.raisedToTop = 0;
                            this.raisedToTopSign = 0;
                            this.countLess = 0;
                        }
                    }
                }
                this.previousAccValue = f9;
                this.accelerometerVertical = fArr4[c] > 2.5f && Math.abs(fArr4[c2]) < 4.0f && Math.abs(fArr4[0]) > 1.5f;
            }
            if (this.raisedToBack == 6 || this.accelerometerVertical) {
                this.lastAccelerometerDetected = System.currentTimeMillis();
            }
            if (this.raisedToBack == 6 || this.accelerometerVertical || System.currentTimeMillis() - this.lastAccelerometerDetected < 60) {
                try {
                    int i9 = Build.VERSION.SDK_INT;
                    AudioManager audioManager = this.audioManager;
                    if (i9 >= 23) {
                        AudioDeviceInfo[] devices = audioManager.getDevices(2);
                        int length = devices.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                AudioDeviceInfo audioDeviceInfo = devices[i10];
                                int type2 = audioDeviceInfo.getType();
                                if ((type2 != 8 && type2 != 7 && type2 != 26 && type2 != 27 && type2 != 4 && type2 != 3) || !audioDeviceInfo.isSink()) {
                                    i10++;
                                }
                            } else if (VoIPService.isAnyKindOfCallActive() && !PhotoViewer.getInstance().isVisible()) {
                                z2 = true;
                            }
                        }
                    } else if (!audioManager.isWiredHeadsetOn() && !audioManager.isBluetoothA2dpOn() && !audioManager.isBluetoothScoOn()) {
                        if (VoIPService.isAnyKindOfCallActive()) {
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z2 = false;
            } else {
                z2 = false;
            }
            PowerManager.WakeLock wakeLock = this.proximityWakeLock;
            if (wakeLock != null && !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                boolean zIsHeld = wakeLock.isHeld();
                if (zIsHeld && !z2) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock releasing");
                    }
                    wakeLock.release();
                } else if (!zIsHeld && z2) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock acquiring");
                    }
                    wakeLock.acquire();
                }
            }
            boolean z3 = this.proximityTouched;
            if (z3 && z2) {
                if (this.raised) {
                    i2 = 0;
                } else {
                    this.raised = true;
                    VideoPlayer videoPlayer = this.currentPlayer;
                    if (videoPlayer == null) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        videoPlayer.setStreamType(0);
                    }
                }
                this.raisedToBack = i2;
                this.raisedToTop = i2;
                this.raisedToTopSign = i2;
                this.countLess = i2;
            } else if (z3 && ((sensor3 == null || sensor2 == null) && sensor == null && !VoIPService.isAnyKindOfCallActive())) {
                if (!this.raised) {
                    this.raised = true;
                    VideoPlayer videoPlayer2 = this.currentPlayer;
                    if (videoPlayer2 != null) {
                        videoPlayer2.setStreamType(0);
                    }
                }
            } else if (!this.proximityTouched && this.raised) {
                this.raised = false;
                VideoPlayer videoPlayer3 = this.currentPlayer;
                if (videoPlayer3 != null) {
                    videoPlayer3.setStreamType(3);
                }
            }
            if (this.timeSinceRaise == j || this.raisedToBack != 6 || Math.abs(System.currentTimeMillis() - this.timeSinceRaise) <= 1000) {
                return;
            }
            this.raisedToBack = 0;
            this.raisedToTop = 0;
            this.raisedToTopSign = 0;
            this.countLess = 0;
            this.timeSinceRaise = j;
        }
    }
}
