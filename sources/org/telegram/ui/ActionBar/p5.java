package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
public final class p5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!org.telegram.messenger.t0.f25571x && org.telegram.messenger.t0.f25570w) {
            if (f10 > 500.0f) {
                k6.h = 1.0f;
            } else {
                k6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (k6.h <= k6.f28082q) {
                MediaController B = MediaController.B();
                if (B.I) {
                    if (!B.J()) {
                        ij ijVar = B.f21292u0;
                        if (ijVar != null && (ij.S4(ijVar.f23244k) || B.f21292u0.i4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (k6.f27952j) {
                    k6.f27952j = false;
                    org.telegram.messenger.g0.r(k6.f27990l);
                }
                if (!k6.f27971k) {
                    k6.f27971k = true;
                    androidx.emoji2.text.n nVar = k6.f28008m;
                    if (Math.abs(k6.f27934i - SystemClock.elapsedRealtime()) < 12000) {
                        j3 = 12000;
                    }
                    org.telegram.messenger.g0.i3(nVar, j3);
                    return;
                }
                return;
            }
            if (k6.f27971k) {
                k6.f27971k = false;
                org.telegram.messenger.g0.r(k6.f28008m);
            }
            if (!k6.f27952j) {
                k6.f27952j = true;
                androidx.emoji2.text.n nVar2 = k6.f27990l;
                if (Math.abs(k6.f27934i - SystemClock.elapsedRealtime()) < 12000) {
                    j3 = 12000;
                }
                org.telegram.messenger.g0.i3(nVar2, j3);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
