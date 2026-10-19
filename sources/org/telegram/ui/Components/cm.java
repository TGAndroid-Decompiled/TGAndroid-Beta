package org.telegram.ui.Components;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class cm implements yv0 {
    public File f25280a;
    public boolean f25281b;
    public final org.telegram.ui.ActionBar.d6 f25282c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout e;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f25282c = d6Var;
        this.d = d3Var;
    }

    public final void a() {
        om omVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        ti tiVar = chatAttachAlertPhotoLayout.f28225b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24101k0;
        if (!chatAttachAlertPhotoLayout.f24116s0 && (omVar = chatAttachAlertPhotoLayout.P) != null && omVar.getCameraSession() != null) {
            if (shutterButton.getState() == zv0.f33045b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(zv0.f33044a);
            } else if (!chatAttachAlertPhotoLayout.f24123x0) {
                org.telegram.messenger.lk.q(R.string.GlobalAttachPhotoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f25282c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30536f0;
                if ((n2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) n2Var).x()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(tiVar.f30536f0 instanceof org.telegram.ui.qn) && tiVar.T0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f24116s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ei.oc(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
