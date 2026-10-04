package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class kg implements Runnable {
    public final ChatActivityEnterView f28101a;

    public kg(ChatActivityEnterView chatActivityEnterView) {
        this.f28101a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        MessageObject threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f28101a;
        cf cfVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null && activity != null) {
            pgVar.D();
            chatActivityEnterView.J3 = true;
            chatActivityEnterView.I3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23916k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f23916k1.setTranslationY(0.0f);
            }
            SendMessageChatArguments sendMessageChatArguments = null;
            chatActivityEnterView.f23869c3 = null;
            chatActivityEnterView.f23862b3 = null;
            if (chatActivityEnterView.f23867c1) {
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
                    CameraController.getInstance().initCamera(cfVar);
                } else {
                    cfVar.run();
                }
                if (!chatActivityEnterView.F2) {
                    chatActivityEnterView.F2 = true;
                    chatActivityEnterView.K1(0, true);
                    ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                    if (recordCircle != null) {
                        recordCircle.H = 0.5f;
                        recordCircle.I = false;
                    }
                    yg ygVar = chatActivityEnterView.Y0;
                    if (ygVar != null) {
                        ygVar.f33149a = false;
                        ygVar.d = 0L;
                        ygVar.f33152e = 0L;
                        ygVar.h = 0L;
                        ygVar.f33154n = 0L;
                        ygVar.f33150b = false;
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else {
                chatActivityEnterView.Z2.a1(1);
                chatActivityEnterView.D2 = -1.0f;
                pg pgVar2 = chatActivityEnterView.Z2;
                if (pgVar2 != null) {
                    storyItem = pgVar2.d1();
                } else {
                    storyItem = null;
                }
                MediaController mediaController = MediaController.getInstance();
                int i11 = chatActivityEnterView.Q;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.G2;
                org.telegram.ui.yn ynVar = chatActivityEnterView.P2;
                if (ynVar != null) {
                    sendMessageChatArguments = ynVar.D8();
                }
                mediaController.startRecording(i11, j3, messageObject, threadMessage, storyItem, i12, true, sendMessageChatArguments, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.K1(0, true);
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
