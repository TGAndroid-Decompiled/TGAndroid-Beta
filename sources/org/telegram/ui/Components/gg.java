package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gg implements Runnable {
    public final ChatActivityEnterView f26654a;

    public gg(ChatActivityEnterView chatActivityEnterView) {
        this.f26654a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f26654a;
        ye yeVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        mg mgVar = chatActivityEnterView.Z2;
        if (mgVar != null && activity != null) {
            mgVar.H();
            chatActivityEnterView.J3 = true;
            chatActivityEnterView.I3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f24116k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f24116k1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f24069c3 = null;
            chatActivityEnterView.f24062b3 = null;
            if (chatActivityEnterView.f24067c1) {
                if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (activity.checkSelfPermission("android.permission.CAMERA") == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 && z11) {
                    if (!CameraController.getInstance().isCameraInitied()) {
                        CameraController.getInstance().initCamera(yeVar);
                    } else {
                        yeVar.run();
                    }
                    if (!chatActivityEnterView.F2) {
                        chatActivityEnterView.F2 = true;
                        chatActivityEnterView.I1(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                        if (recordCircle != null) {
                            recordCircle.H = 0.5f;
                            recordCircle.I = false;
                        }
                        vg vgVar = chatActivityEnterView.Y0;
                        if (vgVar != null) {
                            vgVar.f31441a = false;
                            vgVar.d = 0L;
                            vgVar.e = 0L;
                            vgVar.h = 0L;
                            vgVar.f31445n = 0L;
                            vgVar.f31442b = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z10 && !z11) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                String[] strArr = new String[i10];
                if (!z10 && !z11) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                    strArr[1] = "android.permission.CAMERA";
                } else if (!z10) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                } else {
                    strArr[0] = "android.permission.CAMERA";
                }
                activity.requestPermissions(strArr, 150);
            } else if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.Z2.X0(1);
                chatActivityEnterView.D2 = -1.0f;
                mg mgVar2 = chatActivityEnterView.Z2;
                if (mgVar2 != null) {
                    storyItem = mgVar2.a1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.Q;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.G2;
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                if (snVar != null) {
                    sendMessageChatArguments = snVar.H8();
                }
                mediaController.startRecording(i11, j10, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.I1(0, true);
                vg vgVar2 = chatActivityEnterView.Y0;
                if (vgVar2 != null) {
                    vgVar2.a(0L);
                }
                sg sgVar = chatActivityEnterView.l1;
                if (sgVar != null) {
                    sgVar.h = false;
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
