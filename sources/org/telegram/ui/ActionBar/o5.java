package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class o5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f7 = sensorEvent.values[0];
        if (f7 <= 0.0f) {
            f7 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f7 > 500.0f) {
                h6.h = 1.0f;
            } else {
                h6.h = ((float) Math.ceil((Math.log(f7) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (h6.h <= h6.f21218q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (h6.f21087j) {
                        h6.f21087j = false;
                        AndroidUtilities.cancelRunOnUIThread(h6.f21126l);
                    }
                    if (!h6.f21107k) {
                        h6.f21107k = true;
                        androidx.emoji2.text.n nVar = h6.f21144m;
                        if (Math.abs(h6.f21069i - SystemClock.elapsedRealtime()) < 12000) {
                            j10 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(nVar, j10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (h6.f21107k) {
                h6.f21107k = false;
                AndroidUtilities.cancelRunOnUIThread(h6.f21144m);
            }
            if (!h6.f21087j) {
                h6.f21087j = true;
                androidx.emoji2.text.n nVar2 = h6.f21126l;
                if (Math.abs(h6.f21069i - SystemClock.elapsedRealtime()) < 12000) {
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
