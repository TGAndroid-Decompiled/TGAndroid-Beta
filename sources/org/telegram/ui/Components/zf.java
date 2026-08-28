package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class zf implements Runnable {
    public final ChatActivityEnterView f35297a;

    public zf(ChatActivityEnterView chatActivityEnterView) {
        this.f35297a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i9;
        ChatActivityEnterView chatActivityEnterView = this.f35297a;
        re reVar = chatActivityEnterView.C3;
        Activity activity = chatActivityEnterView.J2;
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null && activity != null) {
            egVar.u();
            chatActivityEnterView.E3 = true;
            chatActivityEnterView.D3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26109f1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f26109f1.setTranslationY(0.0f);
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
                            i9 = 2;
                        } else {
                            i9 = 1;
                        }
                        String[] strArr = new String[i9];
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
                    CameraController.getInstance().initCamera(reVar);
                } else {
                    reVar.run();
                }
                if (!chatActivityEnterView.A2) {
                    chatActivityEnterView.A2 = true;
                    chatActivityEnterView.L1(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
                    if (recordCircle != null) {
                        recordCircle.D = 0.5f;
                        recordCircle.E = false;
                    }
                    ng ngVar = chatActivityEnterView.U0;
                    if (ngVar != null) {
                        ngVar.f31091a = false;
                        ngVar.d = 0L;
                        ngVar.f31094e = 0L;
                        ngVar.f31092b = false;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.U2.L0(1);
                chatActivityEnterView.f26211y2 = -1.0f;
                eg egVar2 = chatActivityEnterView.U2;
                if (egVar2 != null) {
                    storyItem = egVar2.P0();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i10 = chatActivityEnterView.M;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i11 = chatActivityEnterView.B2;
                org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                if (qnVar != null) {
                    sendMessageChatArguments = qnVar.C8();
                }
                mediaController.startRecording(i10, j10, messageObject, threadMessage, storyItem, i11, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.A2 = true;
                chatActivityEnterView.L1(0, true);
                ng ngVar2 = chatActivityEnterView.U0;
                if (ngVar2 != null) {
                    ngVar2.a(0L);
                }
                kg kgVar = chatActivityEnterView.f26115g1;
                if (kgVar != null) {
                    kgVar.h = false;
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
