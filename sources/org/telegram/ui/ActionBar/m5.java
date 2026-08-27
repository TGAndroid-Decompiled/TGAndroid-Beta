package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;

public final class m5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
            return;
        }
        if (f10 > 500.0f) {
            g6.h = 1.0f;
        } else {
            g6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
        }
        if (g6.h > g6.f23277q) {
            if (g6.f23174k) {
                g6.f23174k = false;
                AndroidUtilities.cancelRunOnUIThread(g6.f23209m);
            }
            if (g6.f23155j) {
                return;
            }
            g6.f23155j = true;
            AndroidUtilities.runOnUIThread(g6.f23192l, Math.abs(g6.f23137i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
            return;
        }
        if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
            return;
        }
        if (g6.f23155j) {
            g6.f23155j = false;
            AndroidUtilities.cancelRunOnUIThread(g6.f23192l);
        }
        if (g6.f23174k) {
            return;
        }
        g6.f23174k = true;
        AndroidUtilities.runOnUIThread(g6.f23209m, Math.abs(g6.f23137i - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
