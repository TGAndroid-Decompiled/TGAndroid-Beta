package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class r5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f7 > 500.0f) {
                k6.h = 1.0f;
            } else {
                k6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (k6.h <= k6.f21415q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (k6.f21284j) {
                        k6.f21284j = false;
                        AndroidUtilities.cancelRunOnUIThread(k6.f21323l);
                    }
                    if (!k6.f21304k) {
                        k6.f21304k = true;
                        androidx.emoji2.text.n nVar = k6.f21341m;
                        if (Math.abs(k6.f21266i - SystemClock.elapsedRealtime()) < 12000) {
                            j10 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(nVar, j10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (k6.f21304k) {
                k6.f21304k = false;
                AndroidUtilities.cancelRunOnUIThread(k6.f21341m);
            }
            if (!k6.f21284j) {
                k6.f21284j = true;
                androidx.emoji2.text.n nVar2 = k6.f21323l;
                if (Math.abs(k6.f21266i - SystemClock.elapsedRealtime()) < 12000) {
                    j10 = 12000;
                }
                AndroidUtilities.runOnUIThread(nVar2, j10);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
