package org.telegram.ui.ActionBar;

import ai.z9;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class n5 implements SensorEventListener {
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
            long j3 = 1800;
            if (h6.h <= h6.f19277q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (h6.f19146j) {
                        h6.f19146j = false;
                        AndroidUtilities.cancelRunOnUIThread(h6.f19185l);
                    }
                    if (!h6.f19165k) {
                        h6.f19165k = true;
                        z9 z9Var = h6.f19203m;
                        if (Math.abs(h6.f19127i - SystemClock.elapsedRealtime()) < 12000) {
                            j3 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(z9Var, j3);
                        return;
                    }
                    return;
                }
                return;
            }
            if (h6.f19165k) {
                h6.f19165k = false;
                AndroidUtilities.cancelRunOnUIThread(h6.f19203m);
            }
            if (!h6.f19146j) {
                h6.f19146j = true;
                z9 z9Var2 = h6.f19185l;
                if (Math.abs(h6.f19127i - SystemClock.elapsedRealtime()) < 12000) {
                    j3 = 12000;
                }
                AndroidUtilities.runOnUIThread(z9Var2, j3);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
