package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class q5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f10 > 500.0f) {
                k6.h = 1.0f;
            } else {
                k6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (k6.h <= k6.f21887q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (k6.f21760j) {
                        k6.f21760j = false;
                        AndroidUtilities.cancelRunOnUIThread(k6.f21797l);
                    }
                    if (!k6.f21778k) {
                        k6.f21778k = true;
                        androidx.emoji2.text.n nVar = k6.f21815m;
                        if (Math.abs(k6.f21743i - SystemClock.elapsedRealtime()) < 12000) {
                            j10 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(nVar, j10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (k6.f21778k) {
                k6.f21778k = false;
                AndroidUtilities.cancelRunOnUIThread(k6.f21815m);
            }
            if (!k6.f21760j) {
                k6.f21760j = true;
                androidx.emoji2.text.n nVar2 = k6.f21797l;
                if (Math.abs(k6.f21743i - SystemClock.elapsedRealtime()) < 12000) {
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
