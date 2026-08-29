package org.telegram.ui.Components;

import android.os.Build;
import android.view.ViewPropertyAnimator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.ui.LaunchActivity;
public final class ml implements vu0 {
    public File f30721a;
    public boolean f30722b;
    public final org.telegram.ui.ActionBar.c6 f30723c;
    public final org.telegram.ui.ActionBar.d3 d;
    public final ChatAttachAlertPhotoLayout f30724e;

    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.d3 d3Var) {
        this.f30724e = chatAttachAlertPhotoLayout;
        this.f30723c = c6Var;
        this.d = d3Var;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30724e;
        wl wlVar = chatAttachAlertPhotoLayout.N;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        int i10 = niVar.M0;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        if ((i10 == 2 || (o2Var instanceof org.telegram.ui.tn)) && !chatAttachAlertPhotoLayout.f26282o0 && !niVar.R && chatAttachAlertPhotoLayout.L != null && !niVar.C) {
            if (o2Var == null) {
                o2Var = LaunchActivity.R();
            }
            if (o2Var != null && o2Var.getParentActivity() != null) {
                if (!chatAttachAlertPhotoLayout.f26288s0) {
                    org.telegram.messenger.x3.s(R.string.GlobalAttachVideoRestricted, new tc(chatAttachAlertPhotoLayout.L, this.f30723c), null);
                    return false;
                } else if (Build.VERSION.SDK_INT >= 23 && chatAttachAlertPhotoLayout.getContext().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    chatAttachAlertPhotoLayout.M0 = true;
                    o2Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 21);
                    return false;
                } else {
                    for (int i11 = 0; i11 < 2; i11++) {
                        chatAttachAlertPhotoLayout.O[i11].animate().alpha(0.0f).translationX(AndroidUtilities.dp(30.0f)).setDuration(150L).setInterpolator(jr.f29800f).start();
                    }
                    ViewPropertyAnimator duration = chatAttachAlertPhotoLayout.f26281n0.animate().alpha(0.0f).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
                    jr jrVar = jr.f29800f;
                    duration.setInterpolator(jrVar).start();
                    chatAttachAlertPhotoLayout.m0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jrVar).start();
                    org.telegram.ui.ActionBar.o2 o2Var2 = niVar.f30990b0;
                    if ((o2Var2 instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var2).w()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f30721a = AndroidUtilities.generateVideoPath(z10);
                    AndroidUtilities.updateViewVisibilityAnimated(wlVar, true);
                    wlVar.setText(AndroidUtilities.formatLongDuration(0));
                    chatAttachAlertPhotoLayout.f26261c0 = 0;
                    chatAttachAlertPhotoLayout.f26263d0 = new Runnable(this) {
                        public final ml f30360b;

                        {
                            this.f30360b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f30360b.f30724e;
                                    if (chatAttachAlertPhotoLayout2.f26263d0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f26261c0 + 1;
                                        chatAttachAlertPhotoLayout2.f26261c0 = i12;
                                        chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26263d0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f30360b.f30724e.f26263d0, 1000L);
                                    return;
                            }
                        }
                    };
                    AndroidUtilities.lockOrientation(o2Var.getParentActivity());
                    CameraController cameraController = CameraController.getInstance();
                    Object cameraSessionObject = chatAttachAlertPhotoLayout.L.getCameraSessionObject();
                    File file = this.f30721a;
                    if (niVar.M0 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cameraController.recordVideo(cameraSessionObject, file, z11, new u(this, 21), new Runnable(this) {
                        public final ml f30360b;

                        {
                            this.f30360b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = this.f30360b.f30724e;
                                    if (chatAttachAlertPhotoLayout2.f26263d0 != null) {
                                        int i12 = chatAttachAlertPhotoLayout2.f26261c0 + 1;
                                        chatAttachAlertPhotoLayout2.f26261c0 = i12;
                                        chatAttachAlertPhotoLayout2.N.setText(AndroidUtilities.formatLongDuration(i12));
                                        AndroidUtilities.runOnUIThread(chatAttachAlertPhotoLayout2.f26263d0, 1000L);
                                        return;
                                    }
                                    return;
                                default:
                                    AndroidUtilities.runOnUIThread(this.f30360b.f30724e.f26263d0, 1000L);
                                    return;
                            }
                        }
                    }, chatAttachAlertPhotoLayout.L);
                    chatAttachAlertPhotoLayout.f26269g0.a(wu0.f34495b);
                    chatAttachAlertPhotoLayout.L.runHaptic();
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        yl ylVar;
        boolean z10;
        boolean z11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30724e;
        ni niVar = chatAttachAlertPhotoLayout.f28403b;
        ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26269g0;
        if (!chatAttachAlertPhotoLayout.f26282o0 && (ylVar = chatAttachAlertPhotoLayout.L) != null && ylVar.getCameraSession() != null) {
            if (shutterButton.getState() == wu0.f34495b) {
                chatAttachAlertPhotoLayout.l0();
                CameraController.getInstance().stopVideoRecording(chatAttachAlertPhotoLayout.L.getCameraSession(), false);
                shutterButton.a(wu0.f34494a);
            } else if (!chatAttachAlertPhotoLayout.f26289t0) {
                org.telegram.messenger.x3.s(R.string.GlobalAttachPhotoRestricted, new tc(chatAttachAlertPhotoLayout.L, this.f30723c), null);
            } else {
                org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
                if ((o2Var instanceof org.telegram.ui.tn) && ((org.telegram.ui.tn) o2Var).w()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                File generatePicturePath = AndroidUtilities.generatePicturePath(z10, null);
                boolean isSameTakePictureOrientation = chatAttachAlertPhotoLayout.L.getCameraSession().isSameTakePictureOrientation();
                CameraSessionWrapper cameraSession = chatAttachAlertPhotoLayout.L.getCameraSession();
                if (!(niVar.f30990b0 instanceof org.telegram.ui.tn) && niVar.M0 != 2) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                cameraSession.setFlipFront(z11);
                chatAttachAlertPhotoLayout.f26282o0 = CameraController.getInstance().takePicture(generatePicturePath, false, chatAttachAlertPhotoLayout.L.getCameraSessionObject(), new nh.yb(this, generatePicturePath, isSameTakePictureOrientation));
                chatAttachAlertPhotoLayout.L.startTakePictureAnimation(true);
            }
        }
    }
}
