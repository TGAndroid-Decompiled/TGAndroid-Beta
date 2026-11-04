package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pf implements Runnable {
    public final ChatActivityEnterView f37145a;

    public pf(ChatActivityEnterView chatActivityEnterView) {
        this.f37145a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.zi threadMessage;
        boolean z10;
        boolean z11;
        int i3;
        ChatActivityEnterView chatActivityEnterView = this.f37145a;
        he heVar = chatActivityEnterView.I3;
        Activity activity = chatActivityEnterView.P2;
        uf ufVar = chatActivityEnterView.f31087a3;
        if (ufVar != null && activity != null) {
            ufVar.E();
            chatActivityEnterView.K3 = true;
            chatActivityEnterView.J3 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31152l1;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f31152l1.setTranslationY(0.0f);
            }
            org.telegram.messenger.zv zvVar = null;
            chatActivityEnterView.f31106d3 = null;
            chatActivityEnterView.f31100c3 = null;
            if (chatActivityEnterView.f31104d1) {
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
                        CameraController.getInstance().initCamera(heVar);
                    } else {
                        heVar.run();
                    }
                    if (!chatActivityEnterView.G2) {
                        chatActivityEnterView.G2 = true;
                        chatActivityEnterView.M1(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.O1;
                        if (recordCircle != null) {
                            recordCircle.I = 0.5f;
                            recordCircle.J = false;
                        }
                        dg dgVar = chatActivityEnterView.Z0;
                        if (dgVar != null) {
                            dgVar.f33086a = false;
                            dgVar.d = 0L;
                            dgVar.f33089e = 0L;
                            dgVar.h = 0L;
                            dgVar.f33091n = 0L;
                            dgVar.f33087b = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z10 && !z11) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                String[] strArr = new String[i3];
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
                chatActivityEnterView.f31087a3.M0(1);
                chatActivityEnterView.E2 = -1.0f;
                uf ufVar2 = chatActivityEnterView.f31087a3;
                if (ufVar2 != null) {
                    storyItem = ufVar2.R0();
                } else {
                    storyItem = null;
                }
                MediaController B = MediaController.B();
                int i10 = chatActivityEnterView.R;
                long j10 = chatActivityEnterView.R2;
                org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i11 = chatActivityEnterView.H2;
                org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                if (wmVar != null) {
                    zvVar = wmVar.W8();
                }
                B.x0(i10, j10, ziVar, threadMessage, storyItem, i11, true, zvVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.G2 = true;
                chatActivityEnterView.M1(0, true);
                dg dgVar2 = chatActivityEnterView.Z0;
                if (dgVar2 != null) {
                    dgVar2.a(0L);
                }
                ag agVar = chatActivityEnterView.m1;
                if (agVar != null) {
                    agVar.h = false;
                }
                chatActivityEnterView.f31085a1.getParent().requestDisallowInterceptTouchEvent(true);
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.O1;
                if (recordCircle2 != null) {
                    recordCircle2.I = 1.0f;
                    recordCircle2.J = true;
                }
            }
        }
    }
}
