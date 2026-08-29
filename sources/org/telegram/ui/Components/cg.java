package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class cg implements Runnable {
    public final ChatActivityEnterView f27477a;

    public cg(ChatActivityEnterView chatActivityEnterView) {
        this.f27477a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f27477a;
        ue ueVar = chatActivityEnterView.C3;
        Activity activity = chatActivityEnterView.J2;
        hg hgVar = chatActivityEnterView.U2;
        if (hgVar != null && activity != null) {
            hgVar.B();
            chatActivityEnterView.E3 = true;
            chatActivityEnterView.D3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26120f1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f26120f1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.X2 = null;
            chatActivityEnterView.W2 = null;
            if (chatActivityEnterView.Y0) {
                if (Build.VERSION.SDK_INT >= 23) {
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
                    if (!z10 || !z11) {
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
                        return;
                    }
                }
                if (!CameraController.getInstance().isCameraInitied()) {
                    CameraController.getInstance().initCamera(ueVar);
                } else {
                    ueVar.run();
                }
                if (!chatActivityEnterView.A2) {
                    chatActivityEnterView.A2 = true;
                    chatActivityEnterView.L1(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                    if (recordCircle != null) {
                        recordCircle.D = 0.5f;
                        recordCircle.E = false;
                    }
                    qg qgVar = chatActivityEnterView.U0;
                    if (qgVar != null) {
                        qgVar.f31930a = false;
                        qgVar.d = 0L;
                        qgVar.f31933e = 0L;
                        qgVar.f31931b = false;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.U2.a1(1);
                chatActivityEnterView.f26222y2 = -1.0f;
                hg hgVar2 = chatActivityEnterView.U2;
                if (hgVar2 != null) {
                    storyItem = hgVar2.d1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.M;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.B2;
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                if (tnVar != null) {
                    sendMessageChatArguments = tnVar.C8();
                }
                mediaController.startRecording(i11, j10, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.A2 = true;
                chatActivityEnterView.L1(0, true);
                qg qgVar2 = chatActivityEnterView.U0;
                if (qgVar2 != null) {
                    qgVar2.a(0L);
                }
                ng ngVar = chatActivityEnterView.f26126g1;
                if (ngVar != null) {
                    ngVar.h = false;
                }
                chatActivityEnterView.V0.getParent().requestDisallowInterceptTouchEvent(true);
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
                if (recordCircle2 != null) {
                    recordCircle2.D = 1.0f;
                    recordCircle2.E = true;
                }
            }
        }
    }
}
