package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jg implements Runnable {
    public final ChatActivityEnterView f27530a;

    public jg(ChatActivityEnterView chatActivityEnterView) {
        this.f27530a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f27530a;
        bf bfVar = chatActivityEnterView.G3;
        Activity activity = chatActivityEnterView.N2;
        og ogVar = chatActivityEnterView.Y2;
        if (ogVar != null && activity != null) {
            ogVar.C();
            chatActivityEnterView.I3 = true;
            chatActivityEnterView.H3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23748j1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f23748j1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f23699b3 = null;
            chatActivityEnterView.f23692a3 = null;
            if (chatActivityEnterView.f23704c1) {
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
                    xg xgVar = chatActivityEnterView.Y0;
                    if (xgVar != null) {
                        xgVar.f32550a = false;
                        xgVar.d = 0L;
                        xgVar.f32553e = 0L;
                        xgVar.f32551b = false;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.Y2.V0(1);
                chatActivityEnterView.C2 = -1.0f;
                og ogVar2 = chatActivityEnterView.Y2;
                if (ogVar2 != null) {
                    storyItem = ogVar2.Y0();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.F2;
                org.telegram.ui.co coVar = chatActivityEnterView.O2;
                if (coVar != null) {
                    sendMessageChatArguments = coVar.C8();
                }
                mediaController.startRecording(i11, j3, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.E2 = true;
                chatActivityEnterView.L1(0, true);
                xg xgVar2 = chatActivityEnterView.Y0;
                if (xgVar2 != null) {
                    xgVar2.a(0L);
                }
                ug ugVar = chatActivityEnterView.f23753k1;
                if (ugVar != null) {
                    ugVar.h = false;
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
