package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.kj;
public final class z5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (!org.telegram.messenger.w0.f18952x && org.telegram.messenger.w0.f18951w) {
            if (f7 > 500.0f) {
                t6.h = 1.0f;
            } else {
                t6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (t6.h <= t6.f21164q) {
                MediaController B = MediaController.B();
                if (B.I) {
                    if (!B.J()) {
                        kj kjVar = B.f14483u0;
                        if (kjVar != null && (kj.R4(kjVar.f16690k) || B.f14483u0.h4())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (t6.f21032j) {
                    t6.f21032j = false;
                    org.telegram.messenger.i0.r(t6.f21072l);
                }
                if (!t6.f21052k) {
                    t6.f21052k = true;
                    androidx.emoji2.text.n nVar = t6.f21090m;
                    if (Math.abs(t6.f21014i - SystemClock.elapsedRealtime()) < 12000) {
                        j10 = 12000;
                    }
                    org.telegram.messenger.i0.h3(nVar, j10);
                    return;
                }
                return;
            }
            if (t6.f21052k) {
                t6.f21052k = false;
                org.telegram.messenger.i0.r(t6.f21090m);
            }
            if (!t6.f21032j) {
                t6.f21032j = true;
                androidx.emoji2.text.n nVar2 = t6.f21072l;
                if (Math.abs(t6.f21014i - SystemClock.elapsedRealtime()) < 12000) {
                    j10 = 12000;
                }
                org.telegram.messenger.i0.h3(nVar2, j10);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
