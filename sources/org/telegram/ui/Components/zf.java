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
    public final ChatActivityEnterView f31337a;

    public zf(ChatActivityEnterView chatActivityEnterView) {
        this.f31337a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z4;
        boolean z10;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f31337a;
        re reVar = chatActivityEnterView.D3;
        Activity activity = chatActivityEnterView.K2;
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null && activity != null) {
            egVar.C();
            chatActivityEnterView.F3 = true;
            chatActivityEnterView.E3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22769g1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f22769g1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.Y2 = null;
            chatActivityEnterView.X2 = null;
            if (chatActivityEnterView.Z0) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (activity.checkSelfPermission("android.permission.CAMERA") == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z4 || !z10) {
                        if (!z4 && !z10) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        String[] strArr = new String[i10];
                        if (!z4 && !z10) {
                            strArr[0] = "android.permission.RECORD_AUDIO";
                            strArr[1] = "android.permission.CAMERA";
                        } else if (!z4) {
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
                if (!chatActivityEnterView.B2) {
                    chatActivityEnterView.B2 = true;
                    chatActivityEnterView.L1(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.J1;
                    if (recordCircle != null) {
                        recordCircle.E = 0.5f;
                        recordCircle.F = false;
                    }
                    ng ngVar = chatActivityEnterView.V0;
                    if (ngVar != null) {
                        ngVar.f27271a = false;
                        ngVar.d = 0L;
                        ngVar.e = 0L;
                        ngVar.f27272b = false;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.V2.b1(1);
                chatActivityEnterView.f22872z2 = -1.0f;
                eg egVar2 = chatActivityEnterView.V2;
                if (egVar2 != null) {
                    storyItem = egVar2.e1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.N;
                long j10 = chatActivityEnterView.M2;
                MessageObject messageObject = chatActivityEnterView.P2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.C2;
                org.telegram.ui.xn xnVar = chatActivityEnterView.L2;
                if (xnVar != null) {
                    sendMessageChatArguments = xnVar.C8();
                }
                mediaController.startRecording(i11, j10, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.B2 = true;
                chatActivityEnterView.L1(0, true);
                ng ngVar2 = chatActivityEnterView.V0;
                if (ngVar2 != null) {
                    ngVar2.a(0L);
                }
                kg kgVar = chatActivityEnterView.f22775h1;
                if (kgVar != null) {
                    kgVar.h = false;
                }
                chatActivityEnterView.W0.getParent().requestDisallowInterceptTouchEvent(true);
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.J1;
                if (recordCircle2 != null) {
                    recordCircle2.E = 1.0f;
                    recordCircle2.F = true;
                }
            }
        }
    }
}
