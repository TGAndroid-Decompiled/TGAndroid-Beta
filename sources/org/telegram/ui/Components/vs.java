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

public final class vs implements SensorEventListener {
    public int A;
    public int B;
    public long C;
    public boolean E;
    public boolean F;
    public float H;

    public final SensorManager f34039a;

    public final AudioManager f34040b;

    public final Sensor f34041c;
    public final Sensor d;

    public final Sensor f34042e;

    public final Sensor f34043f;
    public final PowerManager.WakeLock h;

    public boolean f34044n;

    public boolean f34045r;

    public m61 f34046s;
    public boolean v;

    public long f34047w;

    public int f34048x;

    public int f34049y;
    public long D = 0;
    public float G = -100.0f;
    public final float[] I = new float[3];
    public final float[] J = new float[3];
    public final float[] K = new float[3];

    public vs() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f34039a = sensorManager;
        this.f34041c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f34042e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f34043f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f34042e = null;
            this.f34043f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f34040b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        m61 m61Var = this.f34046s;
        if (m61Var == null) {
            return;
        }
        m61Var.T(this.f34045r ? 0 : 3);
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        char c10;
        char c11;
        char c12;
        long j10;
        Sensor sensor2;
        double d;
        boolean z10;
        int i10;
        boolean z11;
        if (this.f34044n && VoIPService.getSharedInstance() == null) {
            int type = sensorEvent.sensor.getType();
            Sensor sensor3 = this.f34043f;
            Sensor sensor4 = this.f34042e;
            float[] fArr = this.K;
            float[] fArr2 = this.I;
            Sensor sensor5 = this.d;
            float[] fArr3 = this.J;
            if (type == 8) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f10 = this.G;
                float f11 = sensorEvent.values[0];
                if (f10 != f11) {
                    this.F = true;
                }
                this.G = f11;
                if (this.F) {
                    this.E = f11 < 5.0f && f11 != this.f34041c.getMaximumRange();
                }
                sensor2 = sensor3;
                c10 = 0;
                c11 = 2;
                c12 = 1;
                j10 = 0;
            } else {
                Sensor sensor6 = sensorEvent.sensor;
                if (sensor6 == sensor5) {
                    long j11 = this.D;
                    if (j11 == 0) {
                        d = 0.9800000190734863d;
                        c11 = 2;
                        c12 = 1;
                    } else {
                        c11 = 2;
                        c12 = 1;
                        d = 1.0d / (((sensorEvent.timestamp - j11) / 1.0E9d) + 1.0d);
                    }
                    this.D = sensorEvent.timestamp;
                    double d10 = ((double) fArr2[0]) * d;
                    double d11 = 1.0d - d;
                    float[] fArr4 = sensorEvent.values;
                    j10 = 0;
                    c10 = 0;
                    float f12 = (float) ((((double) fArr4[0]) * d11) + d10);
                    fArr2[0] = f12;
                    sensor = sensor3;
                    float f13 = (float) ((((double) fArr4[c12]) * d11) + (((double) fArr2[c12]) * d));
                    fArr2[c12] = f13;
                    float f14 = (float) ((d11 * ((double) fArr4[c11])) + (d * ((double) fArr2[c11])));
                    fArr2[c11] = f14;
                    fArr3[0] = (fArr4[0] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[c12] = (fArr4[c12] * 0.19999999f) + (f13 * 0.8f);
                    fArr3[c11] = (fArr4[c11] * 0.19999999f) + (f14 * 0.8f);
                    fArr[0] = fArr4[0] - fArr2[0];
                    fArr[c12] = fArr4[c12] - fArr2[c12];
                    fArr[c11] = fArr4[c11] - fArr2[c11];
                } else {
                    sensor = sensor3;
                    c10 = 0;
                    c11 = 2;
                    c12 = 1;
                    j10 = 0;
                    if (sensor6 == sensor4) {
                        float[] fArr5 = sensorEvent.values;
                        fArr[0] = fArr5[0];
                        fArr[1] = fArr5[1];
                        fArr[2] = fArr5[2];
                    } else {
                        sensor2 = sensor;
                        if (sensor6 == sensor2) {
                            float[] fArr6 = sensorEvent.values;
                            float f15 = fArr6[0];
                            fArr2[0] = f15;
                            fArr3[0] = f15;
                            float f16 = fArr6[1];
                            fArr2[1] = f16;
                            fArr3[1] = f16;
                            float f17 = fArr6[2];
                            fArr2[2] = f17;
                            fArr3[2] = f17;
                        }
                    }
                }
                sensor2 = sensor;
            }
            Sensor sensor7 = sensorEvent.sensor;
            if (sensor7 == sensor4 || sensor7 == sensor2 || sensor7 == sensor5) {
                float f18 = (fArr2[c11] * fArr[c11]) + (fArr2[c12] * fArr[c12]) + (fArr2[c10] * fArr[c10]);
                int i11 = this.A;
                if (i11 != 6 && ((f18 > 0.0f && this.H > 0.0f) || (f18 < 0.0f && this.H < 0.0f))) {
                    if (f18 > 0.0f) {
                        z10 = f18 > 15.0f;
                        i10 = 1;
                    } else {
                        z10 = f18 < -15.0f;
                        i10 = 2;
                    }
                    int i12 = this.f34049y;
                    if (i12 != 0 && i12 != i10) {
                        int i13 = this.f34048x;
                        if (i13 != 6 || !z10) {
                            if (!z10) {
                                this.B++;
                            }
                            if (this.B == 10 || i13 != 6 || i11 != 0) {
                                this.f34048x = 0;
                                this.f34049y = 0;
                                this.A = 0;
                                this.B = 0;
                            }
                        } else if (i11 < 6) {
                            int i14 = i11 + 1;
                            this.A = i14;
                            if (i14 == 6) {
                                this.f34048x = 0;
                                this.f34049y = 0;
                                this.B = 0;
                                this.C = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (z10 && i11 == 0 && (i12 == 0 || i12 == i10)) {
                        int i15 = this.f34048x;
                        if (i15 < 6 && !this.E) {
                            this.f34049y = i10;
                            int i16 = i15 + 1;
                            this.f34048x = i16;
                            if (i16 == 6) {
                                this.B = 0;
                            }
                        }
                    } else {
                        if (!z10) {
                            this.B++;
                        }
                        if (i12 != i10 || this.B == 10 || this.f34048x != 6 || i11 != 0) {
                            this.A = 0;
                            this.f34048x = 0;
                            this.f34049y = 0;
                            this.B = 0;
                        }
                    }
                }
                this.H = f18;
                this.v = fArr3[c12] > 2.5f && Math.abs(fArr3[c11]) < 4.0f && Math.abs(fArr3[0]) > 1.5f;
            }
            if (this.A == 6 || this.v) {
                this.f34047w = System.currentTimeMillis();
            }
            if (this.A == 6 || this.v || System.currentTimeMillis() - this.f34047w < 60) {
                try {
                    int i17 = Build.VERSION.SDK_INT;
                    AudioManager audioManager = this.f34040b;
                    if (i17 >= 23) {
                        AudioDeviceInfo[] devices = audioManager.getDevices(2);
                        int length = devices.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 < length) {
                                AudioDeviceInfo audioDeviceInfo = devices[i18];
                                int type2 = audioDeviceInfo.getType();
                                if ((type2 != 8 && type2 != 7 && type2 != 26 && type2 != 27 && type2 != 4 && type2 != 3) || !audioDeviceInfo.isSink()) {
                                    i18++;
                                }
                            } else if (VoIPService.isAnyKindOfCallActive() && !PhotoViewer.t1().Q1()) {
                                z11 = true;
                            }
                        }
                    } else if (!audioManager.isWiredHeadsetOn() && !audioManager.isBluetoothA2dpOn() && !audioManager.isBluetoothScoOn()) {
                        if (VoIPService.isAnyKindOfCallActive()) {
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                z11 = false;
            } else {
                z11 = false;
            }
            PowerManager.WakeLock wakeLock = this.h;
            if (wakeLock != null && !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                boolean zIsHeld = wakeLock.isHeld();
                if (zIsHeld && !z11) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock releasing");
                    }
                    wakeLock.release();
                } else if (!zIsHeld && z11) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock acquiring");
                    }
                    wakeLock.acquire();
                }
            }
            boolean z12 = this.E;
            if (z12 && z11) {
                if (!this.f34045r) {
                    this.f34045r = true;
                    a();
                }
                this.A = 0;
                this.f34048x = 0;
                this.f34049y = 0;
                this.B = 0;
            } else if (z12 && ((sensor5 == null || sensor4 == null) && sensor2 == null && !VoIPService.isAnyKindOfCallActive())) {
                if (!this.f34045r) {
                    this.f34045r = true;
                    a();
                }
            } else if (!this.E && this.f34045r) {
                this.f34045r = false;
                a();
            }
            if (this.C == j10 || this.A != 6 || Math.abs(System.currentTimeMillis() - this.C) <= 1000) {
                return;
            }
            this.A = 0;
            this.f34048x = 0;
            this.f34049y = 0;
            this.B = 0;
            this.C = j10;
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
