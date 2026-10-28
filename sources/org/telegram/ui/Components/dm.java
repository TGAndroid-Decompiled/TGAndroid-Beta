package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class dm implements gw0 {
    public File f27483a;
    public boolean f27484b;
    public final org.telegram.ui.ActionBar.u6 f27485c;
    public final org.telegram.ui.ActionBar.h3 d;
    public final ChatAttachAlertPhotoLayout e;

    public dm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.h3 h3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f27485c = u6Var;
        this.d = h3Var;
    }

    public final void a() {
        pm pmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ti tiVar = chatAttachAlertPhotoLayout.f30254b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26042k0;
        if (!chatAttachAlertPhotoLayout.f26057s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.getCameraSession() != null) {
            if (shutterButton.getState() == hw0.f29087b) {
                chatAttachAlertPhotoLayout.m0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(hw0.f29086a);
            } else if (!chatAttachAlertPhotoLayout.f26064x0) {
                org.telegram.messenger.wh.n(R.string.GlobalAttachPhotoRestricted, new wc(chatAttachAlertPhotoLayout.P, this.f27485c), null);
            } else {
                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                if ((r2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) r2Var).w()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(tiVar.f32990f0 instanceof org.telegram.ui.wn) && tiVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f26057s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new fi.kc(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
