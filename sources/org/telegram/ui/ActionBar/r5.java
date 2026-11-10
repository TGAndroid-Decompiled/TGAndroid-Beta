package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ij;
public final class r5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!org.telegram.messenger.t0.f25578x && org.telegram.messenger.t0.f25577w) {
            if (f10 > 500.0f) {
                m6.h = 1.0f;
            } else {
                m6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j3 = 1800;
            if (m6.h <= m6.f28123q) {
                MediaController B = MediaController.B();
                if (B.I) {
                    if (!B.J()) {
                        ij ijVar = B.f21300u0;
                        if (ijVar != null && (ij.R4(ijVar.f23266k) || B.f21300u0.h4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (m6.f27993j) {
                    m6.f27993j = false;
                    org.telegram.messenger.g0.r(m6.f28031l);
                }
                if (!m6.f28012k) {
                    m6.f28012k = true;
                    androidx.emoji2.text.n nVar = m6.f28049m;
                    if (Math.abs(m6.f27975i - SystemClock.elapsedRealtime()) < 12000) {
                        j3 = 12000;
                    }
                    org.telegram.messenger.g0.i3(nVar, j3);
                    return;
                }
                return;
            }
            if (m6.f28012k) {
                m6.f28012k = false;
                org.telegram.messenger.g0.r(m6.f28049m);
            }
            if (!m6.f27993j) {
                m6.f27993j = true;
                androidx.emoji2.text.n nVar2 = m6.f28031l;
                if (Math.abs(m6.f27975i - SystemClock.elapsedRealtime()) < 12000) {
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
