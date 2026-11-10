package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final ChatActivityEnterView f37289a;

    public qf(ChatActivityEnterView chatActivityEnterView) {
        this.f37289a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.ij threadMessage;
        boolean z9;
        boolean z10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f37289a;
        ie ieVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        vf vfVar = chatActivityEnterView.Z2;
        if (vfVar != null && activity != null) {
            vfVar.D();
            chatActivityEnterView.J3 = true;
            chatActivityEnterView.I3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31093k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f31093k1.setTranslationY(0.0f);
            }
            org.telegram.messenger.hw hwVar = null;
            chatActivityEnterView.f31047c3 = null;
            chatActivityEnterView.f31040b3 = null;
            if (chatActivityEnterView.f31045c1) {
                if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (activity.checkSelfPermission("android.permission.CAMERA") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 && z10) {
                    if (!CameraController.getInstance().isCameraInitied()) {
                        CameraController.getInstance().initCamera(ieVar);
                    } else {
                        ieVar.run();
                    }
                    if (!chatActivityEnterView.F2) {
                        chatActivityEnterView.F2 = true;
                        chatActivityEnterView.N1(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                        if (recordCircle != null) {
                            recordCircle.H = 0.5f;
                            recordCircle.I = false;
                        }
                        eg egVar = chatActivityEnterView.Y0;
                        if (egVar != null) {
                            egVar.f33246a = false;
                            egVar.d = 0L;
                            egVar.f33249e = 0L;
                            egVar.h = 0L;
                            egVar.f33251n = 0L;
                            egVar.f33247b = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z9 && !z10) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                String[] strArr = new String[i7];
                if (!z9 && !z10) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                    strArr[1] = "android.permission.CAMERA";
                } else if (!z9) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                } else {
                    strArr[0] = "android.permission.CAMERA";
                }
                activity.requestPermissions(strArr, 150);
            } else if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.Z2.R0(1);
                chatActivityEnterView.D2 = -1.0f;
                vf vfVar2 = chatActivityEnterView.Z2;
                if (vfVar2 != null) {
                    storyItem = vfVar2.T0();
                } else {
                    storyItem = null;
                }
                MediaController B = MediaController.B();
                int i10 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i11 = chatActivityEnterView.G2;
                org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                if (cnVar != null) {
                    hwVar = cnVar.X8();
                }
                B.x0(i10, j3, ijVar, threadMessage, storyItem, i11, true, hwVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.N1(0, true);
                eg egVar2 = chatActivityEnterView.Y0;
                if (egVar2 != null) {
                    egVar2.a(0L);
                }
                bg bgVar = chatActivityEnterView.l1;
                if (bgVar != null) {
                    bgVar.h = false;
                }
                chatActivityEnterView.Z0.getParent().requestDisallowInterceptTouchEvent(true);
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.N1;
                if (recordCircle2 != null) {
                    recordCircle2.H = 1.0f;
                    recordCircle2.I = true;
                }
            }
        }
    }
}
