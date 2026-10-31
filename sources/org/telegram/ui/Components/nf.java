package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class nf implements Runnable {
    public final ChatActivityEnterView f28784a;

    public nf(ChatActivityEnterView chatActivityEnterView) {
        this.f28784a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.jj threadMessage;
        boolean z10;
        boolean z11;
        int i10;
        ChatActivityEnterView chatActivityEnterView = this.f28784a;
        ee eeVar = chatActivityEnterView.H3;
        Activity activity = chatActivityEnterView.O2;
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null && activity != null) {
            sfVar.C();
            chatActivityEnterView.J3 = true;
            chatActivityEnterView.I3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23737k1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f23737k1.setTranslationY(0.0f);
            }
            org.telegram.messenger.sw swVar = null;
            chatActivityEnterView.f23690c3 = null;
            chatActivityEnterView.f23683b3 = null;
            if (chatActivityEnterView.f23688c1) {
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
                        CameraController.getInstance().initCamera(eeVar);
                    } else {
                        eeVar.run();
                    }
                    if (!chatActivityEnterView.F2) {
                        chatActivityEnterView.F2 = true;
                        chatActivityEnterView.K1(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
                        if (recordCircle != null) {
                            recordCircle.H = 0.5f;
                            recordCircle.I = false;
                        }
                        bg bgVar = chatActivityEnterView.Y0;
                        if (bgVar != null) {
                            bgVar.f24626a = false;
                            bgVar.d = 0L;
                            bgVar.e = 0L;
                            bgVar.h = 0L;
                            bgVar.f24630n = 0L;
                            bgVar.f24627b = false;
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
                chatActivityEnterView.Z2.G0(1);
                chatActivityEnterView.D2 = -1.0f;
                sf sfVar2 = chatActivityEnterView.Z2;
                if (sfVar2 != null) {
                    storyItem = sfVar2.P0();
                } else {
                    storyItem = null;
                }
                MediaController B = MediaController.B();
                int i11 = chatActivityEnterView.Q;
                long j10 = chatActivityEnterView.Q2;
                org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i12 = chatActivityEnterView.G2;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar != null) {
                    swVar = unVar.P8();
                }
                B.x0(i11, j10, jjVar, threadMessage, storyItem, i12, true, swVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.F2 = true;
                chatActivityEnterView.K1(0, true);
                bg bgVar2 = chatActivityEnterView.Y0;
                if (bgVar2 != null) {
                    bgVar2.a(0L);
                }
                yf yfVar = chatActivityEnterView.l1;
                if (yfVar != null) {
                    yfVar.h = false;
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
