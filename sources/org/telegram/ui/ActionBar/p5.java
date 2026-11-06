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
        if (!org.telegram.messenger.t0.f25563x && org.telegram.messenger.t0.f25562w) {
            if (f10 > 500.0f) {
                k6.h = 1.0f;
            } else {
                k6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (k6.h <= k6.f28081q) {
                MediaController B = MediaController.B();
                if (B.I) {
                    if (!B.J()) {
                        ij ijVar = B.f21292u0;
                        if (ijVar != null && (ij.S4(ijVar.f23237k) || B.f21292u0.i4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (k6.f27951j) {
                    k6.f27951j = false;
                    org.telegram.messenger.g0.r(k6.f27989l);
                }
                if (!k6.f27970k) {
                    k6.f27970k = true;
                    androidx.emoji2.text.n nVar = k6.f28007m;
                    if (Math.abs(k6.f27933i - SystemClock.elapsedRealtime()) < 12000) {
                        j3 = 12000;
                    }
                    org.telegram.messenger.g0.i3(nVar, j3);
                    return;
                }
                return;
            }
            if (k6.f27970k) {
                k6.f27970k = false;
                org.telegram.messenger.g0.r(k6.f28007m);
            }
            if (!k6.f27951j) {
                k6.f27951j = true;
                androidx.emoji2.text.n nVar2 = k6.f27989l;
                if (Math.abs(k6.f27933i - SystemClock.elapsedRealtime()) < 12000) {
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
