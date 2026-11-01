package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class nl implements fu0 {
    public File f28909a;
    public boolean f28910b;
    public final org.telegram.ui.ActionBar.p6 f28911c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout e;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f28911c = p6Var;
        this.d = p2Var;
    }

    public final void a() {
        yl ylVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        bi biVar = chatAttachAlertPhotoLayout.f30964b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23871k0;
        if (!chatAttachAlertPhotoLayout.f23886s0 && (ylVar = chatAttachAlertPhotoLayout.P) != null && ylVar.getCameraSession() != null) {
            if (shutterButton.getState() == gu0.f26550b) {
                chatAttachAlertPhotoLayout.m0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(gu0.f26549a);
            } else if (!chatAttachAlertPhotoLayout.f23893x0) {
                org.telegram.messenger.m5.o(null, 2131749551, new cc(chatAttachAlertPhotoLayout.P, this.f28911c), null);
            } else {
                org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                if ((k2Var instanceof org.telegram.ui.un) && ((org.telegram.ui.un) k2Var).A()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File q02 = org.telegram.messenger.i0.q0(null, z10);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(biVar.W1 instanceof org.telegram.ui.un) && biVar.K2 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f23886s0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ll(this, q02, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
