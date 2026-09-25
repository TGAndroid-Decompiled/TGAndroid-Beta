package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class sl implements ov0 {
    public File f28269a;
    public boolean f28270b;
    public final org.telegram.ui.ActionBar.d6 f28271c;
    public final org.telegram.ui.ActionBar.c3 d;
    public final ChatAttachAlertPhotoLayout e;

    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.ActionBar.c3 c3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f28271c = d6Var;
        this.d = c3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        cm cmVar = chatAttachAlertPhotoLayout.R;
        wi wiVar = chatAttachAlertPhotoLayout.f27088b;
        int i10 = wiVar.Q0;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30006f0;
        if ((i10 == 2 || (m2Var instanceof org.telegram.ui.wn)) && !chatAttachAlertPhotoLayout.f22161s0 && !wiVar.V && chatAttachAlertPhotoLayout.P != null && !wiVar.G) {
            if (m2Var == null) {
                m2Var = LaunchActivity.R();
            }
            if (m2Var != null && m2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f22166w0) {
                    org.telegram.messenger.ok.p(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f28271c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    m2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(rr.f28031f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f22159r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    rr rrVar = rr.f28031f;
                    duration.setInterpolator(rrVar).start();
                    chatAttachAlertPhotoLayout.f22157q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(rrVar).start();
                    org.telegram.ui.ActionBar.m2 m2Var2 = wiVar.f30006f0;
                    if ((m2Var2 instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f28269a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(cmVar, true);
                    cmVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f22138g0 = 0;
                    chatAttachAlertPhotoLayout.f22140h0 = new Runnable(this) {
                        public final sl f27997b;

                        {
                            this.f27997b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27997b.e;
                                    if (chatAttachAlertPhotoLayout2.f22140h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22138g0 + 1;
                                        chatAttachAlertPhotoLayout2.f22138g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22140h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27997b.e.f22140h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(m2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f28269a;
                    if (wiVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final sl f27997b;

                        {
                            this.f27997b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27997b.e;
                                    if (chatAttachAlertPhotoLayout2.f22140h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22138g0 + 1;
                                        chatAttachAlertPhotoLayout2.f22138g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22140h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27997b.e.f22140h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f22146k0.a(pv0.f27439b);
                    chatAttachAlertPhotoLayout.P.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        em emVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        wi wiVar = chatAttachAlertPhotoLayout.f27088b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22146k0;
        if (!chatAttachAlertPhotoLayout.f22161s0 && (emVar = chatAttachAlertPhotoLayout.P) != null && emVar.getCameraSession() != null) {
            if (shutterButton.getState() == pv0.f27439b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(pv0.f27438a);
            } else if (!chatAttachAlertPhotoLayout.f22168x0) {
                org.telegram.messenger.ok.p(R.string.GlobalAttachPhotoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f28271c), null);
            } else {
                org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30006f0;
                if ((m2Var instanceof org.telegram.ui.wn) && ((org.telegram.ui.wn) m2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(wiVar.f30006f0 instanceof org.telegram.ui.wn) && wiVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f22161s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.ed(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
