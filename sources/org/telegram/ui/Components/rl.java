package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class rl implements ev0 {
    public File f27638a;
    public boolean f27639b;
    public final org.telegram.ui.ActionBar.f6 f27640c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final ChatAttachAlertPhotoLayout e;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f27640c = f6Var;
        this.d = e3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        bm bmVar = chatAttachAlertPhotoLayout.R;
        vi viVar = chatAttachAlertPhotoLayout.f26460b;
        int i10 = viVar.Q0;
        org.telegram.ui.ActionBar.o2 o2Var = viVar.f28742f0;
        if ((i10 == 2 || (o2Var instanceof org.telegram.ui.bo)) && !chatAttachAlertPhotoLayout.f21948s0 && !viVar.V && chatAttachAlertPhotoLayout.P != null && !viVar.G) {
            if (o2Var == null) {
                o2Var = LaunchActivity.R();
            }
            if (o2Var != null && o2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f21953w0) {
                    org.telegram.messenger.w1.p(R.string.GlobalAttachVideoRestricted, new vc(chatAttachAlertPhotoLayout.P, this.f27640c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(qr.f27380f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f21946r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    qr qrVar = qr.f27380f;
                    duration.setInterpolator(qrVar).start();
                    chatAttachAlertPhotoLayout.f21944q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                    org.telegram.ui.ActionBar.o2 o2Var2 = viVar.f28742f0;
                    if ((o2Var2 instanceof org.telegram.ui.bo) && ((org.telegram.ui.bo) o2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f27638a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(bmVar, true);
                    bmVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f21925g0 = 0;
                    chatAttachAlertPhotoLayout.f21927h0 = new Runnable(this) {
                        public final rl f27340b;

                        {
                            this.f27340b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27340b.e;
                                    if (chatAttachAlertPhotoLayout2.f21927h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f21925g0 + 1;
                                        chatAttachAlertPhotoLayout2.f21925g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f21927h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27340b.e.f21927h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(o2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f27638a;
                    if (viVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final rl f27340b;

                        {
                            this.f27340b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27340b.e;
                                    if (chatAttachAlertPhotoLayout2.f21927h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f21925g0 + 1;
                                        chatAttachAlertPhotoLayout2.f21925g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f21927h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27340b.e.f21927h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f21933k0.a(fv0.f24016b);
                    chatAttachAlertPhotoLayout.P.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        dm dmVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        vi viVar = chatAttachAlertPhotoLayout.f26460b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f21933k0;
        if (!chatAttachAlertPhotoLayout.f21948s0 && (dmVar = chatAttachAlertPhotoLayout.P) != null && dmVar.getCameraSession() != null) {
            if (shutterButton.getState() == fv0.f24016b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(fv0.f24015a);
            } else if (!chatAttachAlertPhotoLayout.f21955x0) {
                org.telegram.messenger.w1.p(R.string.GlobalAttachPhotoRestricted, new vc(chatAttachAlertPhotoLayout.P, this.f27640c), null);
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = viVar.f28742f0;
                if ((o2Var instanceof org.telegram.ui.bo) && ((org.telegram.ui.bo) o2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(viVar.f28742f0 instanceof org.telegram.ui.bo) && viVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f21948s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.hd(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
