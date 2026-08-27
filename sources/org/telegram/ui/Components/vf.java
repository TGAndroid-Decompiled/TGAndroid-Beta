package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_stories;

public final class vf implements Runnable {

    public final ChatActivityEnterView f33414a;

    public vf(ChatActivityEnterView chatActivityEnterView) {
        this.f33414a = chatActivityEnterView;
    }

    @Override
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f33414a;
        ne neVar = chatActivityEnterView.C3;
        Activity activity = chatActivityEnterView.J2;
        ag agVar = chatActivityEnterView.U2;
        if (agVar == null || activity == null) {
            return;
        }
        agVar.s();
        chatActivityEnterView.E3 = true;
        chatActivityEnterView.D3 = false;
        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26105f1;
        if (slideTextView != null) {
            slideTextView.setAlpha(1.0f);
            chatActivityEnterView.f26105f1.setTranslationY(0.0f);
        }
        chatActivityEnterView.X2 = null;
        chatActivityEnterView.W2 = null;
        if (!chatActivityEnterView.Y0) {
            if (Build.VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                return;
            }
            chatActivityEnterView.U2.N0(1);
            chatActivityEnterView.f26207y2 = -1.0f;
            ag agVar2 = chatActivityEnterView.U2;
            TL_stories.StoryItem storyItemT0 = agVar2 != null ? agVar2.T0() : null;
            MediaController mediaController = MediaController.getInstance();
            int i10 = chatActivityEnterView.M;
            long j10 = chatActivityEnterView.L2;
            MessageObject messageObject = chatActivityEnterView.O2;
            MessageObject threadMessage = chatActivityEnterView.getThreadMessage();
            int i11 = chatActivityEnterView.B2;
            org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
            mediaController.startRecording(i10, j10, messageObject, threadMessage, storyItemT0, i11, true, rnVar != null ? rnVar.C8() : null, chatActivityEnterView.getSendMonoForumPeerId(), chatActivityEnterView.getSendMessageSuggestionParams());
            chatActivityEnterView.A2 = true;
            chatActivityEnterView.K1(0, true);
            jg jgVar = chatActivityEnterView.U0;
            if (jgVar != null) {
                jgVar.a(0L);
            }
            gg ggVar = chatActivityEnterView.f26111g1;
            if (ggVar != null) {
                ggVar.h = false;
            }
            chatActivityEnterView.V0.getParent().requestDisallowInterceptTouchEvent(true);
            ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
            if (recordCircle != null) {
                recordCircle.D = 1.0f;
                recordCircle.E = true;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z10 = activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
            boolean z11 = activity.checkSelfPermission("android.permission.CAMERA") == 0;
            if (!z10 || !z11) {
                String[] strArr = new String[(z10 || z11) ? 1 : 2];
                if (!z10 && !z11) {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                    strArr[1] = "android.permission.CAMERA";
                } else if (z10) {
                    strArr[0] = "android.permission.CAMERA";
                } else {
                    strArr[0] = "android.permission.RECORD_AUDIO";
                }
                activity.requestPermissions(strArr, 150);
                return;
            }
        }
        if (CameraController.getInstance().isCameraInitied()) {
            neVar.run();
        } else {
            CameraController.getInstance().initCamera(neVar);
        }
        if (chatActivityEnterView.A2) {
            return;
        }
        chatActivityEnterView.A2 = true;
        chatActivityEnterView.K1(0, true);
        ChatActivityEnterView.RecordCircle recordCircle2 = chatActivityEnterView.I1;
        if (recordCircle2 != null) {
            recordCircle2.D = 0.5f;
            recordCircle2.E = false;
        }
        jg jgVar2 = chatActivityEnterView.U0;
        if (jgVar2 != null) {
            jgVar2.f29683a = false;
            jgVar2.d = 0L;
            jgVar2.f29686e = 0L;
            jgVar2.f29684b = false;
        }
    }
}
