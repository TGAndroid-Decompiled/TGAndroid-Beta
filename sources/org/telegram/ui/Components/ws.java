package org.telegram.ui.Components;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.PowerManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ws implements SensorEventListener {
    public int A;
    public int B;
    public long C;
    public boolean E;
    public boolean F;
    public float H;
    public final SensorManager f34348a;
    public final AudioManager f34349b;
    public final Sensor f34350c;
    public final Sensor d;
    public final Sensor f34351e;
    public final Sensor f34352f;
    public final PowerManager.WakeLock h;
    public boolean f34353n;
    public boolean f34354r;
    public k61 f34355s;
    public boolean v;
    public long f34356w;
    public int f34357x;
    public int f34358y;
    public long D = 0;
    public float G = -100.0f;
    public final float[] I = new float[3];
    public final float[] J = new float[3];
    public final float[] K = new float[3];

    public ws() {
        SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
        this.f34348a = sensorManager;
        this.f34350c = sensorManager.getDefaultSensor(8);
        Sensor defaultSensor = sensorManager.getDefaultSensor(10);
        this.f34351e = defaultSensor;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(9);
        this.f34352f = defaultSensor2;
        if (defaultSensor == null || defaultSensor2 == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("gravity or linear sensor not found");
            }
            this.d = sensorManager.getDefaultSensor(1);
            this.f34351e = null;
            this.f34352f = null;
        }
        this.h = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock2");
        this.f34349b = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public final void a() {
        int i9;
        k61 k61Var = this.f34355s;
        if (k61Var == null) {
            return;
        }
        if (this.f34354r) {
            i9 = 0;
        } else {
            i9 = 3;
        }
        k61Var.T(i9);
    }

    @Override
    public final void onSensorChanged(android.hardware.SensorEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ws.onSensorChanged(android.hardware.SensorEvent):void");
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }
}
