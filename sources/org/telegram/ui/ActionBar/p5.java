package org.telegram.ui.ActionBar;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaController;
public final class p5 implements SensorEventListener {
    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (f10 <= 0.0f) {
            f10 = 0.1f;
        }
        if (!ApplicationLoader.mainInterfacePaused && ApplicationLoader.isScreenOn) {
            if (f10 > 500.0f) {
                j6.h = 1.0f;
            } else {
                j6.h = ((float) Math.ceil((Math.log(f10) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
            }
            long j10 = 1800;
            if (j6.h <= j6.f20133q) {
                if (!MediaController.getInstance().isRecordingOrListeningByProximity()) {
                    if (j6.f20006j) {
                        j6.f20006j = false;
                        AndroidUtilities.cancelRunOnUIThread(j6.f20043l);
                    }
                    if (!j6.f20024k) {
                        j6.f20024k = true;
                        androidx.emoji2.text.n nVar = j6.f20061m;
                        if (Math.abs(j6.f19989i - SystemClock.elapsedRealtime()) < 12000) {
                            j10 = 12000;
                        }
                        AndroidUtilities.runOnUIThread(nVar, j10);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j6.f20024k) {
                j6.f20024k = false;
                AndroidUtilities.cancelRunOnUIThread(j6.f20061m);
            }
            if (!j6.f20006j) {
                j6.f20006j = true;
                androidx.emoji2.text.n nVar2 = j6.f20043l;
                if (Math.abs(j6.f19989i - SystemClock.elapsedRealtime()) < 12000) {
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
