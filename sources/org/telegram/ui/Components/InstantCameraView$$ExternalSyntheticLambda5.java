package org.telegram.ui.Components;

import android.hardware.Camera;
import android.os.Handler;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.camera.CameraSession;

public final class InstantCameraView$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final InstantCameraView f$0;

    public InstantCameraView$$ExternalSyntheticLambda5(InstantCameraView instantCameraView, int i) {
        this.$r8$classId = i;
        this.f$0 = instantCameraView;
    }

    @Override
    public final void run() {
        boolean z;
        InstantCameraView.CameraGLThread cameraGLThread;
        Handler handler;
        switch (this.$r8$classId) {
            case 0:
                InstantCameraView instantCameraView = this.f$0;
                if (instantCameraView.bothCameras) {
                    instantCameraView.switchCamera$1();
                }
                break;
            case 1:
                InstantCameraView instantCameraView2 = this.f$0;
                org.telegram.messenger.camera.Size[] sizeArr = instantCameraView2.previewSize;
                if (instantCameraView2.cameraSession != null) {
                    instantCameraView2.updateFlash();
                    try {
                        Camera.Size currentPreviewSize = instantCameraView2.cameraSession.getCurrentPreviewSize();
                        if (currentPreviewSize.width != sizeArr[0].getWidth() || currentPreviewSize.height != sizeArr[0].getHeight()) {
                            sizeArr[0] = new org.telegram.messenger.camera.Size(currentPreviewSize.width, currentPreviewSize.height);
                            FileLog.d("InstantCamera change preview size to w = " + sizeArr[0].getWidth() + " h = " + sizeArr[0].getHeight());
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    try {
                        Camera.Size currentPictureSize = instantCameraView2.cameraSession.getCurrentPictureSize();
                        if (currentPictureSize.width == instantCameraView2.pictureSize.getWidth() && currentPictureSize.height == instantCameraView2.pictureSize.getHeight()) {
                            z = false;
                        } else {
                            instantCameraView2.pictureSize = new org.telegram.messenger.camera.Size(currentPictureSize.width, currentPictureSize.height);
                            FileLog.d("InstantCamera change picture size to w = " + instantCameraView2.pictureSize.getWidth() + " h = " + instantCameraView2.pictureSize.getHeight());
                            z = true;
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera camera initied");
                    }
                    instantCameraView2.cameraSession.setInitied();
                    if (z && (cameraGLThread = instantCameraView2.cameraThread) != null && (handler = cameraGLThread.getHandler()) != null) {
                        cameraGLThread.sendMessage(handler.obtainMessage(2), 0);
                        break;
                    }
                }
                break;
            default:
                InstantCameraView instantCameraView3 = this.f$0;
                InstantCameraView.CameraGLThread cameraGLThread2 = instantCameraView3.cameraThread;
                if (cameraGLThread2 != null) {
                    CameraSession cameraSession = instantCameraView3.cameraSession;
                    Handler handler2 = cameraGLThread2.getHandler();
                    if (handler2 != null) {
                        cameraGLThread2.sendMessage(handler2.obtainMessage(3, cameraSession), 0);
                    }
                }
                break;
        }
    }
}
