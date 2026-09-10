package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class wl implements nv0 {
    public File f28788a;
    public boolean f28789b;
    public final org.telegram.ui.ActionBar.f6 f28790c;
    public final org.telegram.ui.ActionBar.f3 d;
    public final ChatAttachAlertPhotoLayout e;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.f3 f3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f28790c = f6Var;
        this.d = f3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        gm gmVar = chatAttachAlertPhotoLayout.R;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        int i10 = yiVar.Q0;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
        if ((i10 == 2 || (p2Var instanceof org.telegram.ui.eo)) && !chatAttachAlertPhotoLayout.f21023s0 && !yiVar.V && chatAttachAlertPhotoLayout.P != null && !yiVar.G) {
            if (p2Var == null) {
                p2Var = LaunchActivity.R();
            }
            if (p2Var != null && p2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f21028w0) {
                    org.telegram.messenger.a2.p(R.string.GlobalAttachVideoRestricted, new wc(chatAttachAlertPhotoLayout.P, this.f28790c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    p2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(wr.f28819f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f21021r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    wr wrVar = wr.f28819f;
                    duration.setInterpolator(wrVar).start();
                    chatAttachAlertPhotoLayout.f21019q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                    org.telegram.ui.ActionBar.p2 p2Var2 = yiVar.f29366f0;
                    if ((p2Var2 instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var2).u()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f28788a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(gmVar, true);
                    gmVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f21000g0 = 0;
                    chatAttachAlertPhotoLayout.f21002h0 = new Runnable(this) {
                        public final wl f27957b;

                        {
                            this.f27957b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27957b.e;
                                    if (chatAttachAlertPhotoLayout2.f21002h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f21000g0 + 1;
                                        chatAttachAlertPhotoLayout2.f21000g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f21002h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27957b.e.f21002h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(p2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f28788a;
                    if (yiVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new t(this, 21), new Runnable(this) {
                        public final wl f27957b;

                        {
                            this.f27957b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27957b.e;
                                    if (chatAttachAlertPhotoLayout2.f21002h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f21000g0 + 1;
                                        chatAttachAlertPhotoLayout2.f21000g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f21002h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27957b.e.f21002h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f21008k0.a(ov0.f25922b);
                    chatAttachAlertPhotoLayout.P.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        im imVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        yi yiVar = chatAttachAlertPhotoLayout.f26422b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f21008k0;
        if (!chatAttachAlertPhotoLayout.f21023s0 && (imVar = chatAttachAlertPhotoLayout.P) != null && imVar.getCameraSession() != null) {
            if (shutterButton.getState() == ov0.f25922b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(ov0.f25921a);
            } else if (!chatAttachAlertPhotoLayout.f21030x0) {
                org.telegram.messenger.a2.p(R.string.GlobalAttachPhotoRestricted, new wc(chatAttachAlertPhotoLayout.P, this.f28790c), null);
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
                if ((p2Var instanceof org.telegram.ui.eo) && ((org.telegram.ui.eo) p2Var).u()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(yiVar.f29366f0 instanceof org.telegram.ui.eo) && yiVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f21023s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new bi.we(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
