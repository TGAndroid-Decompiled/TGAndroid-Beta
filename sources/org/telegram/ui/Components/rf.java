package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf implements Runnable {
    public final ChatActivityEnterView f37626a;

    public rf(ChatActivityEnterView chatActivityEnterView) {
        this.f37626a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.ij threadMessage;
        boolean z9;
        boolean z10;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f37626a;
        je jeVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null && activity != null) {
            wfVar.D();
            chatActivityEnterView.J3 = true;
            chatActivityEnterView.I3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31073k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f31073k1.setTranslationY(0.0f);
            }
            org.telegram.messenger.hw hwVar = null;
            chatActivityEnterView.f31027c3 = null;
            chatActivityEnterView.f31020b3 = null;
            if (chatActivityEnterView.f31025c1) {
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
                        CameraController.getInstance().initCamera(jeVar);
                    } else {
                        jeVar.run();
                    }
                    if (!chatActivityEnterView.F2) {
                        chatActivityEnterView.F2 = true;
                        chatActivityEnterView.N1(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                        if (recordCircle != null) {
                            recordCircle.H = 0.5f;
                            recordCircle.I = false;
                        }
                        fg fgVar = chatActivityEnterView.Y0;
                        if (fgVar != null) {
                            fgVar.f33532a = false;
                            fgVar.d = 0L;
                            fgVar.f33535e = 0L;
                            fgVar.h = 0L;
                            fgVar.f33537n = 0L;
                            fgVar.f33533b = false;
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
                wf wfVar2 = chatActivityEnterView.Z2;
                if (wfVar2 != null) {
                    storyItem = wfVar2.T0();
                } else {
                    storyItem = null;
                }
                MediaController B = MediaController.B();
                int i10 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i11 = chatActivityEnterView.G2;
                org.telegram.ui.an anVar = chatActivityEnterView.P2;
                if (anVar != null) {
                    hwVar = anVar.W8();
                }
                B.x0(i10, j3, ijVar, threadMessage, storyItem, i11, true, hwVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.N1(0, true);
                fg fgVar2 = chatActivityEnterView.Y0;
                if (fgVar2 != null) {
                    fgVar2.a(0L);
                }
                cg cgVar = chatActivityEnterView.l1;
                if (cgVar != null) {
                    cgVar.h = false;
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
