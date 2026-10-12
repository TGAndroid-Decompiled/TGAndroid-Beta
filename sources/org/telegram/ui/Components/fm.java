package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class fm implements cw0 {
    public File f25078a;
    public boolean f25079b;
    public final org.telegram.ui.ActionBar.c6 f25080c;
    public final org.telegram.ui.ActionBar.c3 d;
    public final ChatAttachAlertPhotoLayout e;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f25080c = c6Var;
        this.d = c3Var;
    }

    public final void a() {
        rm rmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        vi viVar = chatAttachAlertPhotoLayout.f27671b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23043k0;
        if (!chatAttachAlertPhotoLayout.f23058s0 && (rmVar = chatAttachAlertPhotoLayout.P) != null && rmVar.getCameraSession() != null) {
            if (shutterButton.getState() == dw0.f24497b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(dw0.f24496a);
            } else if (!chatAttachAlertPhotoLayout.f23065x0) {
                org.telegram.messenger.yh.p(R.string.GlobalAttachPhotoRestricted, new zc(chatAttachAlertPhotoLayout.P, this.f25080c), null);
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
                if ((m2Var instanceof org.telegram.ui.fo) && ((org.telegram.ui.fo) m2Var).x()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(viVar.f30001f0 instanceof org.telegram.ui.fo) && viVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f23058s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new di.cd(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
