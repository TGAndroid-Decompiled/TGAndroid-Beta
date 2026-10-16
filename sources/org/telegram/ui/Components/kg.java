package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class kg implements Runnable {
    public final ChatActivityEnterView f26384a;

    public kg(ChatActivityEnterView chatActivityEnterView) {
        this.f26384a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f26384a;
        cf cfVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null && activity != null) {
            pgVar.H();
            chatActivityEnterView.J3 = true;
            chatActivityEnterView.I3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22614k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f22614k1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f22567c3 = null;
            chatActivityEnterView.f22560b3 = null;
            if (chatActivityEnterView.f22565c1) {
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
                        CameraController.getInstance().initCamera(cfVar);
                    } else {
                        cfVar.run();
                    }
                    if (!chatActivityEnterView.F2) {
                        chatActivityEnterView.F2 = true;
                        chatActivityEnterView.I1(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                        if (recordCircle != null) {
                            recordCircle.H = 0.5f;
                            recordCircle.I = false;
                        }
                        yg ygVar = chatActivityEnterView.Y0;
                        if (ygVar != null) {
                            ygVar.f31248a = false;
                            ygVar.d = 0L;
                            ygVar.e = 0L;
                            ygVar.h = 0L;
                            ygVar.f31252n = 0L;
                            ygVar.f31249b = false;
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
                chatActivityEnterView.Z2.Y0(1);
                chatActivityEnterView.D2 = -1.0f;
                pg pgVar2 = chatActivityEnterView.Z2;
                if (pgVar2 != null) {
                    storyItem = pgVar2.b1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.Q;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.G2;
                org.telegram.ui.fo foVar = chatActivityEnterView.P2;
                if (foVar != null) {
                    sendMessageChatArguments = foVar.H8();
                }
                mediaController.startRecording(i11, j10, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.I1(0, true);
                yg ygVar2 = chatActivityEnterView.Y0;
                if (ygVar2 != null) {
                    ygVar2.a(0L);
                }
                vg vgVar = chatActivityEnterView.l1;
                if (vgVar != null) {
                    vgVar.h = false;
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
