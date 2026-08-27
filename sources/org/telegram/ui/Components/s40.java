package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.Size;

public final class s40 implements Runnable {

    public final int f32333a;

    public final k50 f32334b;

    public s40(k50 k50Var, int i10) {
        this.f32333a = i10;
        this.f32334b = k50Var;
    }

    @Override
    public final void run() {
        boolean z10;
        b50 b50Var;
        Handler handler;
        switch (this.f32333a) {
            case 0:
                k50 k50Var = this.f32334b;
                if (k50Var.f29983l0) {
                    k50Var.p();
                }
                break;
            case 1:
                k50 k50Var2 = this.f32334b;
                Size[] sizeArr = k50Var2.f29975e0;
                if (k50Var2.f29982k0 != null) {
                    k50Var2.r();
                    try {
                        Camera.Size currentPreviewSize = k50Var2.f29982k0.getCurrentPreviewSize();
                        if (currentPreviewSize.width != sizeArr[0].getWidth() || currentPreviewSize.height != sizeArr[0].getHeight()) {
                            sizeArr[0] = new Size(currentPreviewSize.width, currentPreviewSize.height);
                            FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                    try {
                        Camera.Size currentPictureSize = k50Var2.f29982k0.getCurrentPictureSize();
                        if (currentPictureSize.width == k50Var2.f29977f0.getWidth() && currentPictureSize.height == k50Var2.f29977f0.getHeight()) {
                            z10 = false;
                        } else {
                            k50Var2.f29977f0 = new Size(currentPictureSize.width, currentPictureSize.height);
                            FileLog.d("InstantCamera change picture size to w = " + k50Var2.f29977f0.getWidth() + " h = " + k50Var2.f29977f0.getHeight());
                            z10 = true;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera camera initied");
                    }
                    k50Var2.f29982k0.setInitied();
                    if (z10 && (b50Var = k50Var2.f29973d0) != null && (handler = b50Var.getHandler()) != null) {
                        b50Var.sendMessage(handler.obtainMessage(2), 0);
                        break;
                    }
                }
                break;
            default:
                k50 k50Var3 = this.f32334b;
                b50 b50Var2 = k50Var3.f29973d0;
                if (b50Var2 != null) {
                    CameraSession cameraSession = k50Var3.f29982k0;
                    Handler handler2 = b50Var2.getHandler();
                    if (handler2 != null) {
                        b50Var2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                    }
                }
                break;
        }
    }
}
