package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lg implements Runnable {
    public final ChatActivityEnterView f24977a;

    public lg(ChatActivityEnterView chatActivityEnterView) {
        this.f24977a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f24977a;
        bf bfVar = chatActivityEnterView.G3;
        Activity activity = chatActivityEnterView.N2;
        qg qgVar = chatActivityEnterView.Y2;
        if (qgVar != null && activity != null) {
            qgVar.G();
            chatActivityEnterView.I3 = true;
            chatActivityEnterView.H3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f20875j1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f20875j1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f20827b3 = null;
            chatActivityEnterView.f20820a3 = null;
            if (chatActivityEnterView.f20832c1) {
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
                    CameraController.getInstance().initCamera(bfVar);
                } else {
                    bfVar.run();
                }
                if (!chatActivityEnterView.E2) {
                    chatActivityEnterView.E2 = true;
                    chatActivityEnterView.L1(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                    if (recordCircle != null) {
                        recordCircle.H = 0.5f;
                        recordCircle.I = false;
                    }
                    zg zgVar = chatActivityEnterView.Y0;
                    if (zgVar != null) {
                        zgVar.f29668a = false;
                        zgVar.d = 0L;
                        zgVar.e = 0L;
                        zgVar.f29669b = false;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.Y2.a1(1);
                chatActivityEnterView.C2 = -1.0f;
                qg qgVar2 = chatActivityEnterView.Y2;
                if (qgVar2 != null) {
                    storyItem = qgVar2.d1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.F2;
                org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
                if (eoVar != null) {
                    sendMessageChatArguments = eoVar.C8();
                }
                mediaController.startRecording(i11, j3, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.E2 = true;
                chatActivityEnterView.L1(0, true);
                zg zgVar2 = chatActivityEnterView.Y0;
                if (zgVar2 != null) {
                    zgVar2.a(0L);
                }
                wg wgVar = chatActivityEnterView.f20880k1;
                if (wgVar != null) {
                    wgVar.h = false;
                }
                chatActivityEnterView.Z0.getParent().requestDisallowInterceptTouchEvent(true);
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.M1;
                if (recordCircle2 != null) {
                    recordCircle2.H = 1.0f;
                    recordCircle2.I = true;
                }
            }
        }
    }
}
