package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class bg implements Runnable {
    public final ChatActivityEnterView f33753a;

    public bg(ChatActivityEnterView chatActivityEnterView) {
        this.f33753a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        TL_stories.StoryItem storyItem;
        org.telegram.messenger.fj threadMessage;
        android.support.v4.media.session.a0 W;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        ChatActivityEnterView chatActivityEnterView = this.f33753a;
        pe peVar = chatActivityEnterView.f32636a1;
        ue ueVar = chatActivityEnterView.f32817x4;
        Activity activity = chatActivityEnterView.E3;
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null && activity != null) {
            mgVar.z();
            chatActivityEnterView.f32832z4 = true;
            chatActivityEnterView.f32825y4 = false;
            ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f32637a2;
            if (slideTextView != null) {
                slideTextView.setAlpha(1.0f);
                chatActivityEnterView.f32637a2.setTranslationY(0.0f);
            }
            org.telegram.messenger.bw bwVar = null;
            chatActivityEnterView.S3 = null;
            chatActivityEnterView.R3 = null;
            if (chatActivityEnterView.f32662d1) {
                if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (activity.checkSelfPermission("android.permission.CAMERA") == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 && z12) {
                    if (!CameraController.getInstance().isCameraInitied()) {
                        CameraController.getInstance().initCamera(ueVar);
                    } else {
                        ueVar.run();
                    }
                    if (!chatActivityEnterView.f32800v3) {
                        chatActivityEnterView.f32800v3 = true;
                        chatActivityEnterView.u2(0, true);
                        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                        if (recordCircle != null) {
                            recordCircle.I = 0.5f;
                            recordCircle.J = false;
                        }
                        vg vgVar = chatActivityEnterView.Z0;
                        if (vgVar != null) {
                            vgVar.f40679a = false;
                            vgVar.d = 0L;
                            vgVar.f40682e = 0L;
                            vgVar.h = 0L;
                            vgVar.f40684n = 0L;
                            vgVar.f40680b = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!z11 && !z12) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                String[] strArr = new String[i7];
                if (!z11 && !z12) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                    strArr[1] = "android.permission.CAMERA";
                } else if (!z11) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                } else {
                    strArr[0] = "android.permission.CAMERA";
                }
                activity.requestPermissions(strArr, 150);
            } else if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            } else if (chatActivityEnterView.l1) {
                chatActivityEnterView.n0(false, false);
                chatActivityEnterView.f32787t3 = -1.0f;
                chatActivityEnterView.f32800v3 = true;
                chatActivityEnterView.u2(0, true);
                chatActivityEnterView.j0();
                ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.D2;
                if (recordCircle2 != null) {
                    recordCircle2.J = true;
                }
                sg sgVar = chatActivityEnterView.f32646b2;
                if (sgVar != null) {
                    sgVar.f39607e = false;
                }
                peVar.getParent().requestDisallowInterceptTouchEvent(true);
                chatActivityEnterView.A0().G(true);
            } else {
                chatActivityEnterView.P3.U0(1);
                if (DictationAsr.G() && (W = DictationAsr.W(ai.s0.c(chatActivityEnterView.getContext(), chatActivityEnterView.G3))) != null) {
                    ai.q qVar = (ai.q) W.f1676b;
                    if (System.currentTimeMillis() - org.telegram.messenger.mp.g1().getLong("tinyasr_checked_" + qVar.f1454a, 0L) > 86400000) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean A = DictationAsr.A(qVar);
                    if (A && !qVar.f1460i) {
                        qVar.f1460i = true;
                        DictationAsr.d.execute(new ai.l(qVar, 0));
                    }
                    if ((A || ai.h1.b()) && (!A || z10)) {
                        DictationAsr.w(qVar, false);
                    }
                    Context context = chatActivityEnterView.getContext();
                    ExecutorService executorService = DictationLid.f43150a;
                    if (DictationAsr.z()) {
                        DictationLid.d(context);
                    }
                }
                chatActivityEnterView.f32787t3 = -1.0f;
                mg mgVar2 = chatActivityEnterView.P3;
                if (mgVar2 != null) {
                    storyItem = mgVar2.Y0();
                } else {
                    storyItem = null;
                }
                MediaController B = MediaController.B();
                int i10 = chatActivityEnterView.R;
                long j3 = chatActivityEnterView.G3;
                org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                int i11 = chatActivityEnterView.f32808w3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                if (bnVar != null) {
                    bwVar = bnVar.Y8();
                }
                B.x0(i10, j3, fjVar, threadMessage, storyItem, i11, true, bwVar, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
                chatActivityEnterView.f32800v3 = true;
                chatActivityEnterView.u2(0, true);
                vg vgVar2 = chatActivityEnterView.Z0;
                if (vgVar2 != null) {
                    vgVar2.a(0L);
                }
                sg sgVar2 = chatActivityEnterView.f32646b2;
                if (sgVar2 != null) {
                    sgVar2.f39607e = false;
                }
                peVar.getParent().requestDisallowInterceptTouchEvent(true);
                ChatActivityEnterView.RecordCircle recordCircle3 = chatActivityEnterView.D2;
                if (recordCircle3 != null) {
                    recordCircle3.I = 1.0f;
                    recordCircle3.J = true;
                }
            }
        }
    }
}
