package org.telegram.ui.Components;

import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
public final class vl implements mt0 {
    public File f40732a;
    public boolean f40733b;
    public final org.telegram.ui.ActionBar.i6 f40734c;
    public final FrameLayout d;
    public final ChatAttachAlertPhotoLayout f40735e;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f40735e = chatAttachAlertPhotoLayout;
        this.f40734c = i6Var;
        this.d = m2Var;
    }

    public final void a() {
        em emVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f40735e;
        ti tiVar = chatAttachAlertPhotoLayout.f37135b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f32889l0;
        if (!chatAttachAlertPhotoLayout.f32903t0 && (emVar = chatAttachAlertPhotoLayout.Q) != null && emVar.getCameraSession() != null) {
            if (shutterButton.getState() == nt0.f37910b) {
                chatAttachAlertPhotoLayout.o0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.Q.getCameraSession(), false);
                shutterButton.a(nt0.f37909a);
            } else if (!chatAttachAlertPhotoLayout.f32911y0) {
                org.telegram.messenger.f3.o(null, 2131749366, new kc(chatAttachAlertPhotoLayout.Q, this.f40734c), null);
            } else {
                org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
                if ((g2Var instanceof org.telegram.ui.bn) && ((org.telegram.ui.bn) g2Var).y()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File q02 = org.telegram.messenger.g0.q0(null, z10);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.Q.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.Q.getCameraSession();
                if (!(tiVar.f39956a2 instanceof org.telegram.ui.bn) && tiVar.O2 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f32903t0 = CameraController.getInstance().takePicture(q02, false, chatAttachAlertPhotoLayout.Q.getCameraSessionObject(), new hi.fc(this, q02, isSameTakePictureOrientation, 1));
                chatAttachAlertPhotoLayout.Q.startTakePictureAnimation(true);
            }
        }
    }
}
