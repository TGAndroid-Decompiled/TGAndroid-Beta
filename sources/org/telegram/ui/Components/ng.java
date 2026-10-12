package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ng implements Runnable {
    public final ChatActivityEnterView f28795a;

    public ng(ChatActivityEnterView chatActivityEnterView) {
        this.f28795a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f28795a;
        df dfVar = chatActivityEnterView.f23677j4;
        Activity activity = chatActivityEnterView.O2;
        sg sgVar = chatActivityEnterView.Z2;
        if (sgVar != null && activity != null) {
            sgVar.G();
            chatActivityEnterView.l4 = true;
            chatActivityEnterView.f23683k4 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23680k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f23680k1.setTranslationY(0.0f);
            }
            chatActivityEnterView.B(true);
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f23633c3 = null;
            chatActivityEnterView.f23626b3 = null;
            if (chatActivityEnterView.f23631c1) {
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
                        CameraController.getInstance().initCamera(dfVar);
                    } else {
                        dfVar.run();
                    }
                    if (!chatActivityEnterView.F2) {
                        chatActivityEnterView.F2 = true;
                        chatActivityEnterView.O1(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                        if (recordCircle != null) {
                            recordCircle.H = 0.5f;
                            recordCircle.I = false;
                        }
                        bh bhVar = chatActivityEnterView.Y0;
                        if (bhVar != null) {
                            bhVar.f24641a = false;
                            bhVar.d = 0L;
                            bhVar.f24644e = 0L;
                            bhVar.h = 0L;
                            bhVar.f24646n = 0L;
                            bhVar.f24642b = false;
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
                chatActivityEnterView.Z2.g1(1);
                chatActivityEnterView.D2 = -1.0f;
                sg sgVar2 = chatActivityEnterView.Z2;
                if (sgVar2 != null) {
                    storyItem = sgVar2.j1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.G2;
                org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
                if (eoVar != null) {
                    sendMessageChatArguments = eoVar.H8();
                }
                mediaController.startRecording(i11, j3, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.O1(0, true);
                bh bhVar2 = chatActivityEnterView.Y0;
                if (bhVar2 != null) {
                    bhVar2.a(0L);
                }
                yg ygVar = chatActivityEnterView.l1;
                if (ygVar != null) {
                    ygVar.h = false;
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
