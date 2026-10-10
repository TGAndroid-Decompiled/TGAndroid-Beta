package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lg implements Runnable {
    public final ChatActivityEnterView f28337a;

    public lg(ChatActivityEnterView chatActivityEnterView) {
        this.f28337a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f28337a;
        df dfVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null && activity != null) {
            qgVar.J();
            chatActivityEnterView.J3 = true;
            chatActivityEnterView.I3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23919k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f23919k1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f23872c3 = null;
            chatActivityEnterView.f23865b3 = null;
            if (chatActivityEnterView.f23870c1) {
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
                        chatActivityEnterView.J1(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                        if (recordCircle != null) {
                            recordCircle.H = 0.5f;
                            recordCircle.I = false;
                        }
                        zg zgVar = chatActivityEnterView.Y0;
                        if (zgVar != null) {
                            zgVar.f33592a = false;
                            zgVar.d = 0L;
                            zgVar.f33595e = 0L;
                            zgVar.h = 0L;
                            zgVar.f33597n = 0L;
                            zgVar.f33593b = false;
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
                qg qgVar2 = chatActivityEnterView.Z2;
                if (qgVar2 != null) {
                    storyItem = qgVar2.j1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.G2;
                org.telegram.ui.zn znVar = chatActivityEnterView.P2;
                if (znVar != null) {
                    sendMessageChatArguments = znVar.H8();
                }
                mediaController.startRecording(i11, j3, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.J1(0, true);
                zg zgVar2 = chatActivityEnterView.Y0;
                if (zgVar2 != null) {
                    zgVar2.a(0L);
                }
                wg wgVar = chatActivityEnterView.l1;
                if (wgVar != null) {
                    wgVar.h = false;
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
