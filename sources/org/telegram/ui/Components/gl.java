package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class gl implements ct0 {
    public File f33929a;
    public boolean f33930b;
    public final org.telegram.ui.ActionBar.h6 f33931c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f33932e;

    public gl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f33932e = chatAttachAlertPhotoLayout;
        this.f33931c = h6Var;
        this.d = m2Var;
    }

    public final void a() {
        pl plVar;
        boolean z9;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33932e;
        ci ciVar = chatAttachAlertPhotoLayout.f38656b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f31229k0;
        if (!chatAttachAlertPhotoLayout.f31243s0 && (plVar = chatAttachAlertPhotoLayout.P) != null && plVar.getCameraSession() != null) {
            if (shutterButton.getState() == dt0.f33075b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(dt0.f33074a);
            } else if (!chatAttachAlertPhotoLayout.f31250x0) {
                org.telegram.messenger.k5.p(null, 2131749542, new gc(chatAttachAlertPhotoLayout.P, this.f33931c), null);
            } else {
                org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
                if ((f2Var instanceof org.telegram.ui.cn) && ((org.telegram.ui.cn) f2Var).z()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z9);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(ciVar.Z1 instanceof org.telegram.ui.cn) && ciVar.N2 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                cameraSession.setFlipFront(z10);
                chatAttachAlertPhotoLayout.f31243s0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new fi.nb(this, q02, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
