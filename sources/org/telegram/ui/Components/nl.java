package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class nl implements dv0 {
    public File f27309a;
    public boolean f27310b;
    public final org.telegram.ui.ActionBar.f6 f27311c;
    public final org.telegram.ui.ActionBar.e3 d;
    public final ChatAttachAlertPhotoLayout e;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e3 e3Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.f27311c = f6Var;
        this.d = e3Var;
    }

    public final boolean a() {
        boolean z4;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        yl ylVar = chatAttachAlertPhotoLayout.O;
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        int i10 = liVar.N0;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
        if ((i10 == 2 || (p2Var instanceof org.telegram.ui.xn)) && !chatAttachAlertPhotoLayout.f22926p0 && !liVar.S && chatAttachAlertPhotoLayout.M != null && !liVar.D) {
            if (p2Var == null) {
                p2Var = LaunchActivity.R();
            }
            if (p2Var != null && p2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f22932t0) {
                    org.telegram.messenger.y3.s(R.string.GlobalAttachVideoRestricted, new qc(chatAttachAlertPhotoLayout.M, this.f27311c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.N0 = true;
                    p2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.P[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(nr.f27346f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f22925o0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    nr nrVar = nr.f27346f;
                    duration.setInterpolator(nrVar).start();
                    chatAttachAlertPhotoLayout.f22924n0.animate().alpha(0.0f).setDuration(150L).setInterpolator(nrVar).start();
                    org.telegram.ui.ActionBar.p2 p2Var2 = liVar.f26689c0;
                    if ((p2Var2 instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var2).v()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f27309a = AndroidUtilities.generateVideoPath(z4);
                    AndroidUtilities.updateViewVisibilityAnimated(ylVar, true);
                    ylVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f22905d0 = 0;
                    chatAttachAlertPhotoLayout.f22907e0 = new Runnable(this) {
                        public final nl f27049b;

                        {
                            this.f27049b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27049b.e;
                                    if (chatAttachAlertPhotoLayout2.f22907e0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22905d0 + 1;
                                        chatAttachAlertPhotoLayout2.f22905d0 = i12;
                                        chatAttachAlertPhotoLayout2.O.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22907e0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27049b.e.f22907e0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(p2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.M.getCameraSessionObject();
                    File file = this.f27309a;
                    if (liVar.N0 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z10, new t(this, 21), new Runnable(this) {
                        public final nl f27049b;

                        {
                            this.f27049b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f27049b.e;
                                    if (chatAttachAlertPhotoLayout2.f22907e0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f22905d0 + 1;
                                        chatAttachAlertPhotoLayout2.f22905d0 = i12;
                                        chatAttachAlertPhotoLayout2.O.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f22907e0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f27049b.e.f22907e0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.M);
                    chatAttachAlertPhotoLayout.f22913h0.a(ev0.f24683b);
                    chatAttachAlertPhotoLayout.M.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        am amVar;
        boolean z4;
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        li liVar = chatAttachAlertPhotoLayout.f24278b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22913h0;
        if (!chatAttachAlertPhotoLayout.f22926p0 && (amVar = chatAttachAlertPhotoLayout.M) != null && amVar.getCameraSession() != null) {
            if (shutterButton.getState() == ev0.f24683b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.M.getCameraSession(), false);
                shutterButton.a(ev0.f24682a);
            } else if (!chatAttachAlertPhotoLayout.f22933u0) {
                org.telegram.messenger.y3.s(R.string.GlobalAttachPhotoRestricted, new qc(chatAttachAlertPhotoLayout.M, this.f27311c), null);
            } else {
                org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
                if ((p2Var instanceof org.telegram.ui.xn) && ((org.telegram.ui.xn) p2Var).v()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z4, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.M.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.M.getCameraSession();
                if (!(liVar.f26689c0 instanceof org.telegram.ui.xn) && liVar.N0 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                cameraSession.setFlipFront(z10);
                chatAttachAlertPhotoLayout.f22926p0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.M.getCameraSessionObject(), new ll(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.M.startTakePictureAnimation(true);
            }
        }
    }
}
