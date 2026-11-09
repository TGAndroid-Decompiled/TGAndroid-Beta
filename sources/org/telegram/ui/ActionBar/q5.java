package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
public final class q5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!org.telegram.messenger.t0.f25574x && org.telegram.messenger.t0.f25573w) {
            if (f10 > 500.0f) {
                l6.h = 1.0f;
            } else {
                l6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (l6.h <= l6.f28098q) {
                MediaController B = MediaController.B();
                if (B.I) {
                    if (!B.J()) {
                        ij ijVar = B.f21295u0;
                        if (ijVar != null && (ij.R4(ijVar.f23262k) || B.f21295u0.h4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (l6.f27968j) {
                    l6.f27968j = false;
                    org.telegram.messenger.g0.r(l6.f28006l);
                }
                if (!l6.f27987k) {
                    l6.f27987k = true;
                    androidx.emoji2.text.n nVar = l6.f28024m;
                    if (Math.abs(l6.f27950i - SystemClock.elapsedRealtime()) < 12000) {
                        j3 = 12000;
                    }
                    org.telegram.messenger.g0.i3(nVar, j3);
                    return;
                }
                return;
            }
            if (l6.f27987k) {
                l6.f27987k = false;
                org.telegram.messenger.g0.r(l6.f28024m);
            }
            if (!l6.f27968j) {
                l6.f27968j = true;
                androidx.emoji2.text.n nVar2 = l6.f28006l;
                if (Math.abs(l6.f27950i - SystemClock.elapsedRealtime()) < 12000) {
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
