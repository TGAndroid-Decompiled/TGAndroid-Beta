package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ig implements Runnable {
    public final ChatActivityEnterView f24973a;

    public ig(ChatActivityEnterView chatActivityEnterView) {
        this.f24973a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f24973a;
        af afVar = chatActivityEnterView.G3;
        Activity activity = chatActivityEnterView.N2;
        ng ngVar = chatActivityEnterView.Y2;
        if (ngVar != null && activity != null) {
            ngVar.D();
            chatActivityEnterView.I3 = true;
            chatActivityEnterView.H3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f21760j1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f21760j1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f21712b3 = null;
            chatActivityEnterView.f21705a3 = null;
            if (chatActivityEnterView.f21717c1) {
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
                    CameraController.getInstance().initCamera(afVar);
                } else {
                    afVar.run();
                }
                if (!chatActivityEnterView.E2) {
                    chatActivityEnterView.E2 = true;
                    chatActivityEnterView.M1(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.M1;
                    if (recordCircle != null) {
                        recordCircle.H = 0.5f;
                        recordCircle.I = false;
                    }
                    wg wgVar = chatActivityEnterView.Y0;
                    if (wgVar != null) {
                        wgVar.f29623a = false;
                        wgVar.d = 0L;
                        wgVar.e = 0L;
                        wgVar.f29624b = false;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.Y2.a1(1);
                chatActivityEnterView.C2 = -1.0f;
                ng ngVar2 = chatActivityEnterView.Y2;
                if (ngVar2 != null) {
                    storyItem = ngVar2.d1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.F2;
                org.telegram.ui.xn xnVar = chatActivityEnterView.O2;
                if (xnVar != null) {
                    sendMessageChatArguments = xnVar.C8();
                }
                mediaController.startRecording(i11, j3, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.E2 = true;
                chatActivityEnterView.M1(0, true);
                wg wgVar2 = chatActivityEnterView.Y0;
                if (wgVar2 != null) {
                    wgVar2.a(0L);
                }
                tg tgVar = chatActivityEnterView.f21765k1;
                if (tgVar != null) {
                    tgVar.h = false;
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
