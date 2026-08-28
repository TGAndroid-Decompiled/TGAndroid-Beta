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
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f10 > 500.0f) {
                f6.h = 1.0f;
            } else {
                f6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (f6.h <= f6.f23222q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (f6.f23102j) {
                        f6.f23102j = false;
                        AndroidUtilities.cancelRunOnUIThread(f6.f23138l);
                    }
                    if (!f6.f23120k) {
                        f6.f23120k = true;
                        androidx.emoji2.text.m mVar = f6.f23156m;
                        if (Math.abs(f6.f23085i - SystemClock.elapsedRealtime()) < 12000) {
                            j10 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(mVar, j10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (f6.f23120k) {
                f6.f23120k = false;
                AndroidUtilities.cancelRunOnUIThread(f6.f23156m);
            }
            if (!f6.f23102j) {
                f6.f23102j = true;
                androidx.emoji2.text.m mVar2 = f6.f23138l;
                if (Math.abs(f6.f23085i - SystemClock.elapsedRealtime()) < 12000) {
                    j10 = 12000;
                }
                AndroidUtilities.runOnUIThread(mVar2, j10);
            }
        }
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i9) {
    }
}
