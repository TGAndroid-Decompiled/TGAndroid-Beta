package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class ml implements dv0 {
    public File f27083a;
    public boolean f27084b;
    public final org.telegram.ui.ActionBar.f6 f27085c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final ChatAttachAlertPhotoLayout e;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f27085c = f6Var;
        this.d = e3Var;
    }

    public final boolean a() {
        boolean z4;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        xl xlVar = chatAttachAlertPhotoLayout.O;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        int i10 = liVar.N0;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
        if ((i10 == 2 || (p2Var instanceof org.telegram.ui.zn)) && !chatAttachAlertPhotoLayout.f22899p0 && !liVar.S && chatAttachAlertPhotoLayout.M != null && !liVar.D) {
            if (p2Var == null) {
                p2Var = LaunchActivity.R();
            }
            if (p2Var != null && p2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f22905t0) {
                    org.telegram.messenger.y3.s(R.string.GlobalAttachVideoRestricted, new qc(chatAttachAlertPhotoLayout.M, this.f27085c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.N0 = true;
                    p2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.P[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(mr.f27122f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f22898o0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    mr mrVar = mr.f27122f;
                    duration.setInterpolator(mrVar).start();
                    chatAttachAlertPhotoLayout.f22897n0.animate().alpha(0.0f).setDuration(150L).setInterpolator(mrVar).start();
                    org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26685c0;
                    if ((p2Var2 instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) p2Var2).v()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f27083a = AndroidUtilities.generateVideoPath(z4);
                    AndroidUtilities.updateViewVisibilityAnimated(xlVar, true);
                    xlVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f22878d0 = 0;
                    chatAttachAlertPhotoLayout.f22880e0 = new Runnable(this) {
                        public final ml f26776b;

                        {
                            this.f26776b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f26776b.e;
                                    if (chatAttachAlertPhotoLayout2.f22880e0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22878d0 + 1;
                                        chatAttachAlertPhotoLayout2.f22878d0 = i12;
                                        chatAttachAlertPhotoLayout2.O.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22880e0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f26776b.e.f22880e0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(p2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.M.getCameraSessionObject();
                    File file = this.f27083a;
                    if (liVar.N0 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z10, new t(this, 21), new Runnable(this) {
                        public final ml f26776b;

                        {
                            this.f26776b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f26776b.e;
                                    if (chatAttachAlertPhotoLayout2.f22880e0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22878d0 + 1;
                                        chatAttachAlertPhotoLayout2.f22878d0 = i12;
                                        chatAttachAlertPhotoLayout2.O.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22880e0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f26776b.e.f22880e0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.M);
                    chatAttachAlertPhotoLayout.f22886h0.a(ev0.f24702b);
                    chatAttachAlertPhotoLayout.M.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        zl zlVar;
        boolean z4;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        li liVar = chatAttachAlertPhotoLayout.f24282b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22886h0;
        if (!chatAttachAlertPhotoLayout.f22899p0 && (zlVar = chatAttachAlertPhotoLayout.M) != null && zlVar.getCameraSession() != null) {
            if (shutterButton.getState() == ev0.f24702b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.M.getCameraSession(), false);
                shutterButton.a(ev0.f24701a);
            } else if (!chatAttachAlertPhotoLayout.f22906u0) {
                org.telegram.messenger.y3.s(R.string.GlobalAttachPhotoRestricted, new qc(chatAttachAlertPhotoLayout.M, this.f27085c), null);
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
                if ((p2Var instanceof org.telegram.ui.zn) && ((org.telegram.ui.zn) p2Var).v()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z4, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.M.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.M.getCameraSession();
                if (!(liVar.f26685c0 instanceof org.telegram.ui.zn) && liVar.N0 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                cameraSession.setFlipFront(z10);
                chatAttachAlertPhotoLayout.f22899p0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.M.getCameraSessionObject(), new kl(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.M.startTakePictureAnimation(true);
            }
        }
    }
}
