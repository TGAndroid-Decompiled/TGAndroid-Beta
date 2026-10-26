package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class dm implements fw0 {
    public File f27560a;
    public boolean f27561b;
    public final org.telegram.ui.ActionBar.u6 f27562c;
    public final org.telegram.ui.ActionBar.h3 d;
    public final ChatAttachAlertPhotoLayout e;

    public dm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.ActionBar.h3 h3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f27562c = u6Var;
        this.d = h3Var;
    }

    public final void a() {
        pm pmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ti tiVar = chatAttachAlertPhotoLayout.f30215b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26040k0;
        if (!chatAttachAlertPhotoLayout.f26055s0 && (pmVar = chatAttachAlertPhotoLayout.P) != null && pmVar.getCameraSession() != null) {
            if (shutterButton.getState() == gw0.f28734b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(gw0.f28733a);
            } else if (!chatAttachAlertPhotoLayout.f26062x0) {
                org.telegram.messenger.vh.n(R.string.GlobalAttachPhotoRestricted, new wc(chatAttachAlertPhotoLayout.P, this.f27562c), null);
            } else {
                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33021f0;
                if ((r2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) r2Var).w()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(tiVar.f33021f0 instanceof org.telegram.ui.un) && tiVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f26055s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new fi.kc(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
