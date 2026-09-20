package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class rl implements ov0 {
    public File f27916a;
    public boolean f27917b;
    public final org.telegram.ui.ActionBar.f6 f27918c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout e;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f27918c = f6Var;
        this.d = d3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        bm bmVar = chatAttachAlertPhotoLayout.R;
        vi viVar = chatAttachAlertPhotoLayout.f26655b;
        int i10 = viVar.Q0;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f29098f0;
        if ((i10 == 2 || (n2Var instanceof org.telegram.ui.zn)) && !chatAttachAlertPhotoLayout.f22159s0 && !viVar.V && chatAttachAlertPhotoLayout.P != null && !viVar.G) {
            if (n2Var == null) {
                n2Var = LaunchActivity.R();
            }
            if (n2Var != null && n2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f22164w0) {
                    org.telegram.messenger.rk.p(R.string.GlobalAttachVideoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f27918c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.Q0 = true;
                    n2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.S[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(qr.f27642f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f22157r0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    qr qrVar = qr.f27642f;
                    duration.setInterpolator(qrVar).start();
                    chatAttachAlertPhotoLayout.f22155q0.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                    org.telegram.ui.ActionBar.n2 n2Var2 = viVar.f29098f0;
                    if ((n2Var2 instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var2).v()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f27916a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(bmVar, true);
                    bmVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f22136g0 = 0;
                    chatAttachAlertPhotoLayout.f22138h0 = new Runnable(this) {
                        public final rl f27604b;

                        {
                            this.f27604b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27604b.e;
                                    if (chatAttachAlertPhotoLayout2.f22138h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22136g0 + 1;
                                        chatAttachAlertPhotoLayout2.f22136g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22138h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27604b.e.f22138h0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(n2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.P.getCameraSessionObject();
                    File file = this.f27916a;
                    if (viVar.Q0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final rl f27604b;

                        {
                            this.f27604b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27604b.e;
                                    if (chatAttachAlertPhotoLayout2.f22138h0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22136g0 + 1;
                                        chatAttachAlertPhotoLayout2.f22136g0 = i12;
                                        chatAttachAlertPhotoLayout2.R.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22138h0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27604b.e.f22138h0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.P);
                    chatAttachAlertPhotoLayout.f22144k0.a(pv0.f27453b);
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
        vi viVar = chatAttachAlertPhotoLayout.f26655b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22144k0;
        if (!chatAttachAlertPhotoLayout.f22159s0 && (dmVar = chatAttachAlertPhotoLayout.P) != null && dmVar.getCameraSession() != null) {
            if (shutterButton.getState() == pv0.f27453b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.P.getCameraSession(), false);
                shutterButton.a(pv0.f27452a);
            } else if (!chatAttachAlertPhotoLayout.f22166x0) {
                org.telegram.messenger.rk.p(R.string.GlobalAttachPhotoRestricted, new xc(chatAttachAlertPhotoLayout.P, this.f27918c), null);
            } else {
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f29098f0;
                if ((n2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) n2Var).v()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.P.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.P.getCameraSession();
                if (!(viVar.f29098f0 instanceof org.telegram.ui.zn) && viVar.Q0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f22159s0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.P.getCameraSessionObject(), new ci.hd(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.P.startTakePictureAnimation(true);
            }
        }
    }
}
