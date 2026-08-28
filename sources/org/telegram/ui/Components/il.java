package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class il implements ku0 {
    public File f29451a;
    public boolean f29452b;
    public final org.telegram.ui.ActionBar.b6 f29453c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout f29454e;

    public il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.f29454e = chatAttachAlertPhotoLayout;
        this.f29453c = b6Var;
        this.d = d3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29454e;
        sl slVar = chatAttachAlertPhotoLayout.N;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        int i9 = kiVar.M0;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
        if ((i9 == 2 || (o2Var instanceof org.telegram.ui.qn)) && !chatAttachAlertPhotoLayout.f26271o0 && !kiVar.R && chatAttachAlertPhotoLayout.L != null && !kiVar.C) {
            if (o2Var == null) {
                o2Var = LaunchActivity.R();
            }
            if (o2Var != null && o2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f26277s0) {
                    org.telegram.messenger.ll.p(R.string.GlobalAttachVideoRestricted, new oc(chatAttachAlertPhotoLayout.L, this.f29453c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.M0 = true;
                    o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i10 = 0; i10 < 2; i10++) {
                        chatAttachAlertPhotoLayout.O[i10].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(gr.f28844f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f26270n0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    gr grVar = gr.f28844f;
                    duration.setInterpolator(grVar).start();
                    chatAttachAlertPhotoLayout.m0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                    org.telegram.ui.ActionBar.o2 o2Var2 = kiVar.f30099b0;
                    if ((o2Var2 instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var2).w()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f29451a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(slVar, true);
                    slVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f26250c0 = 0;
                    chatAttachAlertPhotoLayout.f26252d0 = new Runnable(this) {
                        public final il f29110b;

                        {
                            this.f29110b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29110b.f29454e;
                                    if (chatAttachAlertPhotoLayout2.f26252d0 != null) {
                                        int i11 = chatAttachAlertPhotoLayout2.f26250c0 + 1;
                                        chatAttachAlertPhotoLayout2.f26250c0 = i11;
                                        chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i11));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26252d0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f29110b.f29454e.f26252d0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(o2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.L.getCameraSessionObject();
                    File file = this.f29451a;
                    if (kiVar.M0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new s(this, 21), new Runnable(this) {
                        public final il f29110b;

                        {
                            this.f29110b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f29110b.f29454e;
                                    if (chatAttachAlertPhotoLayout2.f26252d0 != null) {
                                        int i11 = chatAttachAlertPhotoLayout2.f26250c0 + 1;
                                        chatAttachAlertPhotoLayout2.f26250c0 = i11;
                                        chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i11));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26252d0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f29110b.f29454e.f26252d0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.L);
                    chatAttachAlertPhotoLayout.f26258g0.a(lu0.f30558b);
                    chatAttachAlertPhotoLayout.L.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ul ulVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f29454e;
        ki kiVar = chatAttachAlertPhotoLayout.f27493b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26258g0;
        if (!chatAttachAlertPhotoLayout.f26271o0 && (ulVar = chatAttachAlertPhotoLayout.L) != null && ulVar.getCameraSession() != null) {
            if (shutterButton.getState() == lu0.f30558b) {
                chatAttachAlertPhotoLayout.k0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.L.getCameraSession(), false);
                shutterButton.a(lu0.f30557a);
            } else if (!chatAttachAlertPhotoLayout.f26278t0) {
                org.telegram.messenger.ll.p(R.string.GlobalAttachPhotoRestricted, new oc(chatAttachAlertPhotoLayout.L, this.f29453c), null);
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
                if ((o2Var instanceof org.telegram.ui.qn) && ((org.telegram.ui.qn) o2Var).w()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.L.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.L.getCameraSession();
                if (!(kiVar.f30099b0 instanceof org.telegram.ui.qn) && kiVar.M0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f26271o0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.L.getCameraSessionObject(), new kh.oc(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.L.startTakePictureAnimation(true);
            }
        }
    }
}
