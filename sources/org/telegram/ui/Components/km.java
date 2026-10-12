package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class km implements mw0 {
    public File f27879a;
    public boolean f27880b;
    public final org.telegram.ui.ActionBar.c6 f27881c;
    public final org.telegram.ui.ActionBar.c3 d;
    public final ChatAttachAlertPhotoLayout f27882e;

    public km(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.f27882e = chatAttachAlertPhotoLayout;
        this.f27881c = c6Var;
        this.d = c3Var;
    }

    public final void a() {
        wm wmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27882e;
        aj ajVar = chatAttachAlertPhotoLayout.f30570b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23824k0;
        if (!chatAttachAlertPhotoLayout.f23839s0 && (wmVar = chatAttachAlertPhotoLayout.P) != null && wmVar.getCameraSession() != null) {
            if (shutterButton.getState() == nw0.f28982b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(nw0.f28981a);
            } else if (!chatAttachAlertPhotoLayout.f23846x0) {
                org.telegram.messenger.am.q(R.string.GlobalAttachPhotoRestricted, new zc(chatAttachAlertPhotoLayout.P, this.f27881c), null);
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24338f0;
                if ((m2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) m2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(ajVar.f24338f0 instanceof org.telegram.ui.eo) && ajVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f23839s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.ed(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
