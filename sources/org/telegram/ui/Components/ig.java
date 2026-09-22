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
    public final ChatActivityEnterView f25124a;

    public ig(ChatActivityEnterView chatActivityEnterView) {
        this.f25124a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f25124a;
        af afVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        ng ngVar = chatActivityEnterView.Z2;
        if (ngVar != null && activity != null) {
            ngVar.D();
            chatActivityEnterView.J3 = true;
            chatActivityEnterView.I3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22031k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f22031k1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f21985c3 = null;
            chatActivityEnterView.f21978b3 = null;
            if (chatActivityEnterView.f21983c1) {
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
                if (!chatActivityEnterView.F2) {
                    chatActivityEnterView.F2 = true;
                    chatActivityEnterView.K1(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    if (recordCircle != null) {
                        recordCircle.H = 0.5f;
                        recordCircle.I = false;
                    }
                    wg wgVar = chatActivityEnterView.Y0;
                    if (wgVar != null) {
                        wgVar.f30013a = false;
                        wgVar.d = 0L;
                        wgVar.e = 0L;
                        wgVar.h = 0L;
                        wgVar.f30017n = 0L;
                        wgVar.f30014b = false;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.Z2.b1(1);
                chatActivityEnterView.D2 = -1.0f;
                ng ngVar2 = chatActivityEnterView.Z2;
                if (ngVar2 != null) {
                    storyItem = ngVar2.e1();
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
                    sendMessageChatArguments = znVar.C8();
                }
                mediaController.startRecording(i11, j3, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.K1(0, true);
                wg wgVar2 = chatActivityEnterView.Y0;
                if (wgVar2 != null) {
                    wgVar2.a(0L);
                }
                tg tgVar = chatActivityEnterView.l1;
                if (tgVar != null) {
                    tgVar.h = false;
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
